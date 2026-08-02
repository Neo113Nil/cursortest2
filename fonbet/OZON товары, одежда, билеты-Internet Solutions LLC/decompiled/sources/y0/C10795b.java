package y0;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import b1.C5499b;
import b1.C5517t;
import b1.InterfaceC5518u;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10795b extends b0 {

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private static final C5517t f105735J = C5499b.a(a.f105737b, C2286b.f105738b);

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private C3991w0 f105736I;

    /* renamed from: y0.b$a */
    static final class a extends AbstractC7737t implements Function2<InterfaceC5518u, C10795b, List<? extends Object>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f105737b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends Object> invoke(InterfaceC5518u interfaceC5518u, C10795b c10795b) {
            C10795b c10795b2 = c10795b;
            return C7714v.b0(Integer.valueOf(c10795b2.r()), Float.valueOf(kotlin.ranges.h.d(c10795b2.s(), -0.5f, 0.5f)), Integer.valueOf(c10795b2.C()));
        }
    }

    /* renamed from: y0.b$b, reason: collision with other inner class name */
    static final class C2286b extends AbstractC7737t implements Function1<List, C10795b> {

        /* renamed from: b, reason: collision with root package name */
        public static final C2286b f105738b = new C2286b(1);

        @Override // kotlin.jvm.functions.Function1
        public final C10795b invoke(List list) {
            List list2 = list;
            Object obj = list2.get(0);
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = list2.get(1);
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new C10795b(intValue, ((Float) obj2).floatValue(), new C10796c(list2));
        }
    }

    public C10795b(int i11, float f7, @NotNull Function0<Integer> function0) {
        super(i11, f7);
        C3991w0 f11;
        f11 = n1.f(function0, D1.f25195a);
        this.f105736I = f11;
    }

    @Override // y0.b0
    public final int C() {
        return ((Number) ((Function0) this.f105736I.getValue()).invoke()).intValue();
    }

    @NotNull
    public final C3991w0 Y() {
        return this.f105736I;
    }
}
