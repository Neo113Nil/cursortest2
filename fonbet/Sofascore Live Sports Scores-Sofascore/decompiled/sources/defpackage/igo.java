package defpackage;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class igo implements Runnable {
    private igo() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            ogo.b = MessageDigest.getInstance(SameMD5.TAG);
            countDownLatch = ogo.e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = ogo.e;
        } catch (Throwable th) {
            ogo.e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
