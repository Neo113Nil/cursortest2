package defpackage;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ogo {
    public static boolean a = false;
    public static MessageDigest b;
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final CountDownLatch e = new CountDownLatch(1);

    public static void a() {
        synchronized (d) {
            try {
                if (!a) {
                    a = true;
                    new Thread(new igo()).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static npn b(String str, byte[] bArr) {
        Vector vector;
        int length = bArr.length;
        if (length > 0) {
            int i = length + 254;
            vector = new Vector();
            for (int i2 = 0; i2 < i / 255; i2++) {
                int i3 = i2 * 255;
                try {
                    int length2 = bArr.length;
                    if (length2 - i3 > 255) {
                        length2 = i3 + 255;
                    }
                    vector.add(Arrays.copyOfRange(bArr, i3, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (vector != null || vector.isEmpty()) {
                return null;
            }
            npn s = vpn.s();
            int size = vector.size();
            for (int i4 = 0; i4 < size; i4++) {
                e8n v = g8n.v(0, NotificationCompat.FLAG_LOCAL_ONLY, d(str, (byte[]) vector.get(i4), false));
                s.b();
                ((vpn) s.b).t(v);
            }
            byte[] c2 = c(bArr);
            e8n e8nVar = g8n.b;
            e8n v2 = g8n.v(0, c2.length, c2);
            s.b();
            ((vpn) s.b).u(v2);
            return s;
        }
        vector = null;
        if (vector != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = defpackage.ogo.b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] c(byte[] bArr) {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (c) {
            try {
                a();
                MessageDigest messageDigest2 = null;
                try {
                    if (e.await(2L, TimeUnit.SECONDS) && (messageDigest = b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                throw new NoSuchAlgorithmException("Cannot compute hash");
            } finally {
            }
        }
        return digest;
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    public static byte[] d(String str, byte[] bArr, boolean z) {
        byte[] array;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            s9n m0 = cmn.m0();
            m0.b();
            ((cmn) m0.b).z0(4096L);
            bArr = ((cmn) m0.c()).b();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b2 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i2).put(b2).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i2).put(b2).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(NotificationCompat.FLAG_LOCAL_ONLY).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        zgo[] zgoVarArr = new mmo().K2;
        int length3 = zgoVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zgoVarArr[i3].c(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            fjn fjnVar = new fjn(str.getBytes(C.UTF8_NAME));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < 256; i6++) {
                byte[] bArr4 = (byte[]) fjnVar.b;
                i4 = (i4 + 1) & 255;
                byte b3 = bArr4[i4];
                i5 = (i5 + b3) & 255;
                bArr4[i4] = bArr4[i5];
                bArr4[i5] = b3;
                bArr3[i6] = (byte) (bArr4[(bArr4[i4] + b3) & 255] ^ bArr3[i6]);
            }
        }
        return bArr3;
    }
}
