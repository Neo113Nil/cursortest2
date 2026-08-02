package fi0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;

/* loaded from: classes7.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    private static final long f63531b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final o<kotlin.time.b> f63532a;

    /* synthetic */ class a extends C7735q implements Function1<kotlin.time.b, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f63533a = new a(1, kotlin.time.b.class, "isPositive", "isPositive-impl(J)Z", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(kotlin.time.b bVar) {
            return Boolean.valueOf(bVar.getF71985a() > 0);
        }
    }

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f63531b = kotlin.time.c.g(30, EnumC10311b.SECONDS);
    }

    public w() {
        kotlin.time.b e11 = kotlin.time.b.e(f63531b);
        a condition = a.f63533a;
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.f63532a = new p(new r(e11), condition);
    }

    @NotNull
    public final o<kotlin.time.b> a() {
        return this.f63532a;
    }
}
