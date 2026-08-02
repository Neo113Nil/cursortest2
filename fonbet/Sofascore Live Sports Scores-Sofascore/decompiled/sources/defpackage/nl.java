package defpackage;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nl implements re4 {
    public final re4 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public nl(re4 re4Var, byte[] bArr, byte[] bArr2) {
        this.a = re4Var;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.re4
    public final long b(xe4 xe4Var) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                ue4 ue4Var = new ue4(this.a, xe4Var);
                this.d = new CipherInputStream(ue4Var, cipher);
                if (ue4Var.d) {
                    return -1L;
                }
                ue4Var.a.b(ue4Var.b);
                ue4Var.d = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                is8.h(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            is8.h(e2);
            return 0L;
        }
    }

    @Override // defpackage.re4
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // defpackage.re4
    public final void f(tn4 tn4Var) {
        tn4Var.getClass();
        this.a.f(tn4Var);
    }

    @Override // defpackage.re4
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // defpackage.re4
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        this.d.getClass();
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
