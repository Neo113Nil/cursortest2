package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v2d {
    public static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public final char[] a;
    public long b;
    public long c;
    public final ReentrantLock d = new ReentrantLock();

    static {
        new v2d();
    }

    public v2d() {
        Random random = ilf.b;
        this.b = ilf.a(random, 839299365868340224L);
        this.c = ilf.a(random, 300L) + 33;
        this.a = new char[12];
        for (int i = 0; i < 12; i++) {
            this.a[i] = '0';
        }
        b();
    }

    public final String a() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            long j = this.b + this.c;
            this.b = j;
            if (j >= 839299365868340224L) {
                b();
                Random random = ilf.b;
                this.b = ilf.a(random, 839299365868340224L);
                this.c = ilf.a(random, 300L) + 33;
            }
            int i = 22;
            char[] cArr = new char[22];
            System.arraycopy(this.a, 0, cArr, 0, 12);
            long j2 = this.b;
            while (i > 12) {
                i--;
                cArr[i] = e[(int) (j2 % 62)];
                j2 /= 62;
            }
            String str = new String(cArr);
            reentrantLock.unlock();
            return str;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b() {
        byte[] bArr = new byte[12];
        ilf.a.nextBytes(bArr);
        for (int i = 0; i < 12; i++) {
            this.a[i] = e[(bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) % 62];
        }
    }
}
