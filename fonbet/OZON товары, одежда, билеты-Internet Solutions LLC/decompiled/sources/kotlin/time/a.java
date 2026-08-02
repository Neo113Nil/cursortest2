package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.g;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface a extends TimeMark, Comparable<a> {

    /* renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public static final class C1192a {
        public static int a(@NotNull g.a aVar, @NotNull a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            long b11 = aVar.b(other);
            b.INSTANCE.getClass();
            return b.f(b11, 0L);
        }
    }
}
