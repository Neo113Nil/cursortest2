package bo.app;

import android.os.SystemClock;
import com.braze.support.BrazeLogger;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;

/* loaded from: classes.dex */
public final class x7 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f26259g = (int) TimeUnit.SECONDS.toMillis(45);

    /* renamed from: a, reason: collision with root package name */
    public final int f26260a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26261b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26262c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26263d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f26264e = RandomKt.Random(SystemClock.uptimeMillis());

    /* renamed from: f, reason: collision with root package name */
    public int f26265f;

    public x7(int i10, int i11, int i12, int i13) {
        this.f26260a = i10;
        this.f26261b = i11;
        this.f26262c = i12;
        this.f26263d = i13;
    }

    public final int a(final int i10) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.nc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.x7.a(bo.app.x7.this);
            }
        }, 7, (Object) null);
        Random random = this.f26264e;
        int i11 = this.f26265f * this.f26263d;
        Intrinsics.checkNotNullParameter(random, "random");
        final int min = Math.min(i10, i11) + random.nextInt(Math.abs(i10 - i11) + 1);
        this.f26265f = Math.max(this.f26262c, Math.min(this.f26260a, min));
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.oc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.x7.a(bo.app.x7.this, i10, min);
            }
        }, 7, (Object) null);
        return this.f26265f;
    }

    public final String toString() {
        int i10 = this.f26260a;
        int i11 = this.f26261b;
        int i12 = this.f26262c;
        int i13 = this.f26263d;
        Random random = this.f26264e;
        int i14 = this.f26265f;
        return "ExponentialBackoffStateProvider(maxSleepDurationMs=" + i10 + ", defaultNormalFlushIntervalMs=" + i11 + ", minSleepDurationMs=" + i12 + ", scaleFactor=" + i13 + ", randomSleepDurationGenerator=" + random + ", lastSleepDurationMs=" + i14 + ", isBackingOff=" + (i14 != 0) + ")";
    }

    public static final String a(x7 x7Var) {
        return "Computing new sleep delay. Previous sleep delay: " + x7Var.f26265f;
    }

    public static final String a(x7 x7Var, int i10, int i11) {
        return "New sleep duration: " + x7Var.f26265f + " ms. Default sleep duration: " + i10 + " ms. Max sleep: " + x7Var.f26260a + " ms. Min sleep: " + x7Var.f26262c + " ms. Scale factor: " + x7Var.f26263d + " randomValueBetweenSleepIntervals: " + i11;
    }
}
