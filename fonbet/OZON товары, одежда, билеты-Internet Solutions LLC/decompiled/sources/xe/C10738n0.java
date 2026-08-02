package xe;

import De.C2857A;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10738n0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C2857A f105492a = new C2857A("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C2857A f105493b = new C2857A("CLOSED_EMPTY");

    public static final long c(long j11) {
        if (j11 <= 0) {
            return 0L;
        }
        if (j11 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j11 * 1000000;
    }
}
