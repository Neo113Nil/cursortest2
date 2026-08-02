package Ph;

import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: Ph.q0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1472q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Sh.G f9128a = new Sh.G("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    public static final Sh.G f9129b = new Sh.G("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        return j10 >= 9223372036854L ? LongCompanionObject.MAX_VALUE : j10 * 1000000;
    }
}
