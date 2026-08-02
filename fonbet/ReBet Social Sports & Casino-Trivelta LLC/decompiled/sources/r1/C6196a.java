package r1;

import android.net.Uri;
import e1.AbstractC4134a;
import h1.C4416l;
import h1.C4418n;
import h1.InterfaceC4403F;
import h1.InterfaceC4411g;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6196a implements InterfaceC4411g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4411g f63737a;

    /* renamed from: b, reason: collision with root package name */
    public CipherInputStream f63738b;
    private final byte[] encryptionIv;
    private final byte[] encryptionKey;

    public C6196a(InterfaceC4411g interfaceC4411g, byte[] bArr, byte[] bArr2) {
        this.f63737a = interfaceC4411g;
        this.encryptionKey = bArr;
        this.encryptionIv = bArr2;
    }

    @Override // h1.InterfaceC4411g
    public final long b(C4418n c4418n) {
        try {
            Cipher o10 = o();
            try {
                o10.init(2, new SecretKeySpec(this.encryptionKey, "AES"), new IvParameterSpec(this.encryptionIv));
                C4416l c4416l = new C4416l(this.f63737a, c4418n);
                this.f63738b = new CipherInputStream(c4416l, o10);
                c4416l.k();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // h1.InterfaceC4411g
    public final void c(InterfaceC4403F interfaceC4403F) {
        AbstractC4134a.e(interfaceC4403F);
        this.f63737a.c(interfaceC4403F);
    }

    @Override // h1.InterfaceC4411g
    public void close() {
        if (this.f63738b != null) {
            this.f63738b = null;
            this.f63737a.close();
        }
    }

    @Override // h1.InterfaceC4411g
    public final Map f() {
        return this.f63737a.f();
    }

    @Override // h1.InterfaceC4411g
    public final Uri getUri() {
        return this.f63737a.getUri();
    }

    public Cipher o() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // b1.InterfaceC2358l
    public final int read(byte[] bArr, int i10, int i11) {
        AbstractC4134a.e(this.f63738b);
        int read = this.f63738b.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
