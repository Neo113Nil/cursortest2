package bo.app;

import bo.app.jg;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jg {
    public final boolean a(v9 triggerEvent, rg action, long j10, final long j11) {
        long j12;
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(action, "action");
        if (triggerEvent instanceof uf) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.s4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return jg.a();
                }
            }, 7, (Object) null);
            return true;
        }
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        final long j13 = nowInSeconds + r0.f25829d;
        final int i10 = action.f26029b.f25832g;
        if (i10 != -1) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.t4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return jg.a(i10);
                }
            }, 7, (Object) null);
            j12 = j10 + i10;
        } else {
            j12 = j10 + j11;
        }
        final long j14 = j12;
        if (j13 >= j14) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.u4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return jg.a(j13, j14);
                }
            }, 6, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.v4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jg.a(j11, j14, j13);
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String a() {
        return "Ignoring minimum time interval between triggered actions because the trigger event is a test.";
    }

    public static final String a(int i10) {
        return "Using override minimum display interval: " + i10;
    }

    public static final String a(long j10, long j11) {
        return "Minimum time interval requirement met for matched trigger. Action display time: " + j10 + " . Next viable display time: " + j11;
    }

    public static final String a(long j10, long j11, long j12) {
        return "Minimum time interval requirement and triggered action override time interval requirement of " + j10 + " not met for matched trigger. Returning null. Next viable display time: " + j11 + ". Action display time: " + j12;
    }
}
