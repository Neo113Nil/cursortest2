package kotlin.time;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/f;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f71986a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static final long f71987b = System.nanoTime();

    public static long a(long j11) {
        return e.b(System.nanoTime() - f71987b, j11, EnumC10311b.NANOSECONDS);
    }

    public static long b() {
        return System.nanoTime() - f71987b;
    }

    @NotNull
    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
