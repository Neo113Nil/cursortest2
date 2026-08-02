package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.tools.SameMD5;
import defpackage.b0a;
import defpackage.jdo;
import defpackage.mpo;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgid {
    public MessageDigest a;
    public final zzgrh b;
    public final Object c = new Object();
    public boolean d = false;
    public SecureRandom e;

    public zzgid(zzgrh zzgrhVar) {
        this.b = zzgrhVar;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0039: INVOKE (r1 I:com.google.android.gms.internal.ads.zzgrf) VIRTUAL call: com.google.android.gms.internal.ads.zzgrf.c():void A[Catch: all -> 0x0037, MD:():void (m), TRY_ENTER] (LINE:58), block:B:27:0x0039 */
    public final void a() {
        boolean z;
        zzgrf c;
        synchronized (this) {
            z = this.d;
        }
        if (z) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        synchronized (this) {
            try {
                zzgrf a = this.b.a(202);
                try {
                    a.a();
                    this.e = secureRandom;
                    this.a = MessageDigest.getInstance(SameMD5.TAG);
                    this.d = true;
                } catch (NoSuchAlgorithmException e) {
                    a.b(e);
                } catch (Throwable th) {
                    a.b(th);
                    throw th;
                }
                a.c();
            } catch (Throwable th2) {
                c.c();
                throw th2;
            }
        }
    }

    public final byte[] b(String str, byte[] bArr, boolean z) {
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        zzguk.a(length <= i);
        ByteBuffer put = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i2 = i - length;
            byte[] bArr2 = new byte[i2];
            this.e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i2);
            System.arraycopy(bArr2, 0, bArr, length, i2);
        }
        byte[] array = put.put(bArr).array();
        if (z) {
            array = ByteBuffer.allocate(NotificationCompat.FLAG_LOCAL_ONLY).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        jdo[] jdoVarArr = new zzgit().K2;
        int length2 = jdoVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            jdoVarArr[i3].c(array, bArr3);
        }
        if (!b0a.U(str)) {
            zzgif zzgifVar = new zzgif(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < 256; i6++) {
                i4 = (i4 + 1) & 255;
                byte[] bArr4 = zzgifVar.a;
                byte b = bArr4[i4];
                i5 = (i5 + b) & 255;
                bArr4[i4] = bArr4[i5];
                bArr4[i5] = b;
                bArr3[i6] = (byte) (bArr4[(bArr4[i4] + b) & 255] ^ bArr3[i6]);
            }
        }
        return bArr3;
    }

    public final byte[] c(byte[] bArr) {
        byte[] digest;
        synchronized (this.c) {
            this.a.reset();
            this.a.update(bArr);
            digest = this.a.digest();
        }
        return digest;
    }

    public final zzazs d(String str, byte[] bArr) {
        zzazs D = zzazt.D();
        byte[] c = c(bArr);
        mpo mpoVar = zziei.b;
        mpo B = zziei.B(0, c.length, c);
        D.n();
        ((zzazt) D.b).F(B);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / 255) + 1) {
                break;
            }
            int i2 = i * 255;
            int i3 = i2 + 255;
            if (length > i3) {
                length = i3;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i2, length));
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mpo B2 = zziei.B(0, NotificationCompat.FLAG_LOCAL_ONLY, b(str, (byte[]) it.next(), false));
            D.n();
            ((zzazt) D.b).E(B2);
        }
        return D;
    }
}
