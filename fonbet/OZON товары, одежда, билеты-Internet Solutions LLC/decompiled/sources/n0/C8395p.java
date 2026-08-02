package n0;

import androidx.compose.ui.e;
import i1.C6988h;
import k1.C7460f;
import k1.C7464j;
import l1.AbstractC7839p0;
import l1.J0;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

/* renamed from: n0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8395p {

    /* renamed from: a, reason: collision with root package name */
    private static final float f76212a = 30;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.e f76213b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.e f76214c;

    /* renamed from: n0.p$a */
    public static final class a implements J0 {
        @Override // l1.J0
        @NotNull
        /* renamed from: createOutline-Pq9zytI */
        public final AbstractC7839p0 mo1createOutlinePq9zytI(long j11, @NotNull Z1.s sVar, @NotNull Z1.d dVar) {
            float Y02 = dVar.Y0(C8395p.b());
            return new AbstractC7839p0.b(new C7460f(0.0f, -Y02, C7464j.f(j11), C7464j.d(j11) + Y02));
        }
    }

    /* renamed from: n0.p$b */
    public static final class b implements J0 {
        @Override // l1.J0
        @NotNull
        /* renamed from: createOutline-Pq9zytI */
        public final AbstractC7839p0 mo1createOutlinePq9zytI(long j11, @NotNull Z1.s sVar, @NotNull Z1.d dVar) {
            float Y02 = dVar.Y0(C8395p.b());
            return new AbstractC7839p0.b(new C7460f(-Y02, 0.0f, C7464j.f(j11) + Y02, C7464j.d(j11)));
        }
    }

    static {
        e.a aVar = androidx.compose.ui.e.f40358c0;
        f76213b = C6988h.a(aVar, new a());
        f76214c = C6988h.a(aVar, new b());
    }

    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull EnumC9142v enumC9142v) {
        return eVar.l0(enumC9142v == EnumC9142v.Vertical ? f76214c : f76213b);
    }

    public static final float b() {
        return f76212a;
    }
}
