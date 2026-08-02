package A7;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public class o implements D6.n {

    /* renamed from: b, reason: collision with root package name */
    public static final long f245b = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    public final ActivityManager f246a;

    public o(ActivityManager activityManager) {
        this.f246a = activityManager;
    }

    @Override // D6.n
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public y get() {
        return new y(b(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, f245b);
    }

    public final int b() {
        int min = Math.min(this.f246a.getMemoryClass() * PKIFailureInfo.badCertTemplate, Integer.MAX_VALUE);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        return min / 4;
    }
}
