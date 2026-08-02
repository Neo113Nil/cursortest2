package s0;

import B0.C0;
import Sc.s;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.J;
import m0.C;
import m0.C8006o;
import m0.C8008p;
import m0.InterfaceC7976A;
import m0.InterfaceC8002m;
import org.jetbrains.annotations.NotNull;
import r0.C9112M;
import r0.EnumC9142v;
import xe.M;
import y0.InterfaceC10793C;
import y0.InterfaceC10807n;
import y0.b0;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {142, 161}, m = "invokeSuspend")
/* renamed from: s0.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9565h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super C9558a<Float, C8008p>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    J f98049d;

    /* renamed from: e, reason: collision with root package name */
    int f98050e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9568k f98051f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f98052g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f98053h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C9112M.a f98054i;

    /* renamed from: s0.h$a */
    static final class a extends AbstractC7737t implements Function1<Float, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f98055b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f98056c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(J j11, Function1<? super Float, Unit> function1) {
            super(1);
            this.f98055b = j11;
            this.f98056c = (AbstractC7737t) function1;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Float f7) {
            float floatValue = f7.floatValue();
            J j11 = this.f98055b;
            float f11 = j11.f71784a - floatValue;
            j11.f71784a = f11;
            this.f98056c.invoke(Float.valueOf(f11));
            return Unit.f71690a;
        }
    }

    /* renamed from: s0.h$b */
    static final class b extends AbstractC7737t implements Function1<Float, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f98057b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f98058c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(J j11, Function1<? super Float, Unit> function1) {
            super(1);
            this.f98057b = j11;
            this.f98058c = (AbstractC7737t) function1;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Float f7) {
            float floatValue = f7.floatValue();
            J j11 = this.f98057b;
            float f11 = j11.f71784a - floatValue;
            j11.f71784a = f11;
            this.f98058c.invoke(Float.valueOf(f11));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C9565h(C9568k c9568k, float f7, Function1 function1, C9112M.a aVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f98051f = c9568k;
        this.f98052g = f7;
        this.f98053h = (AbstractC7737t) function1;
        this.f98054i = aVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C9565h(this.f98051f, this.f98052g, this.f98053h, this.f98054i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super C9558a<Float, C8008p>> dVar) {
        return ((C9565h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ed, code lost:
    
        if (r0 == r7) goto L90;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC7976A interfaceC7976A;
        C9562e c9562e;
        C9568k c9568k;
        float f7;
        long j11;
        long j12;
        float f11;
        J j13;
        Object g10;
        C9562e c9562e2;
        float e11;
        InterfaceC8002m interfaceC8002m;
        boolean f12;
        boolean f13;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f98050e;
        ?? r62 = this.f98053h;
        C9568k c9568k2 = this.f98051f;
        if (i11 == 0) {
            s.b(obj);
            interfaceC7976A = c9568k2.f98066b;
            float f14 = this.f98052g;
            float a11 = C.a(interfaceC7976A, 0.0f, f14);
            c9562e = c9568k2.f98065a;
            b0 b0Var = c9562e.f98043a;
            int F11 = b0Var.F() + b0Var.D();
            if (F11 == 0) {
                f11 = 0.0f;
                f7 = 0.0f;
                c9568k = c9568k2;
            } else {
                int u11 = f14 < 0.0f ? b0Var.u() + 1 : b0Var.u();
                int e12 = kotlin.ranges.h.e(((int) (a11 / F11)) + u11, 0, b0Var.C());
                b0Var.D();
                b0Var.F();
                long j14 = u11;
                c9568k = c9568k2;
                long j15 = 1;
                long j16 = j14 - j15;
                if (j16 < 0) {
                    f7 = 0.0f;
                    j11 = j15;
                    j12 = 0;
                } else {
                    f7 = 0.0f;
                    j11 = j15;
                    j12 = j16;
                }
                int i12 = (int) j12;
                long j17 = j14 + j11;
                if (j17 > 2147483647L) {
                    j17 = 2147483647L;
                }
                int abs = Math.abs((kotlin.ranges.h.e(kotlin.ranges.h.e(e12, i12, (int) j17), 0, b0Var.C()) - u11) * F11) - F11;
                if (abs < 0) {
                    abs = 0;
                }
                f11 = abs == 0 ? abs : abs * Math.signum(f14);
            }
            if (Float.isNaN(f11)) {
                throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            j13 = new J();
            float signum = Math.signum(f14) * Math.abs(f11);
            j13.f71784a = signum;
            r62.invoke(new Float(signum));
            float f15 = j13.f71784a;
            b bVar = new b(j13, r62);
            this.f98049d = j13;
            this.f98050e = 1;
            g10 = C9568k.g(this.f98051f, this.f98054i, f15, this.f98052g, bVar, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            J j18 = this.f98049d;
            s.b(obj);
            f7 = 0.0f;
            c9568k = c9568k2;
            j13 = j18;
            g10 = obj;
        }
        C8006o c8006o = (C8006o) g10;
        c9562e2 = c9568k.f98065a;
        float floatValue = ((Number) c8006o.o()).floatValue();
        b0 b0Var2 = c9562e2.f98043a;
        InterfaceC9574q d11 = b0Var2.z().d();
        List<InterfaceC10807n> f16 = b0Var2.z().f();
        int size = f16.size();
        float f17 = Float.NEGATIVE_INFINITY;
        float f18 = Float.POSITIVE_INFINITY;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC10807n interfaceC10807n = f16.get(i13);
            InterfaceC10793C z11 = b0Var2.z();
            z11.getOrientation();
            EnumC9142v enumC9142v = EnumC9142v.Vertical;
            z11.a();
            b0Var2.z().c();
            b0Var2.z().b();
            b0Var2.z().getPageSize();
            int offset = interfaceC10807n.getOffset();
            b0Var2.C();
            d11.getClass();
            float f19 = offset - 0;
            if (f19 <= f7 && f19 > f17) {
                f17 = f19;
            }
            if (f19 >= f7 && f19 < f18) {
                f18 = f19;
            }
        }
        if (f17 == Float.NEGATIVE_INFINITY) {
            f17 = f18;
        }
        if (f18 == Float.POSITIVE_INFINITY) {
            f18 = f17;
        }
        e11 = C9563f.e(b0Var2);
        boolean z12 = e11 == f7;
        if (!b0Var2.b()) {
            if (!z12) {
                f13 = C9563f.f(b0Var2);
                if (f13) {
                    f17 = f7;
                    f18 = f17;
                }
            }
            f18 = f7;
        }
        if (!b0Var2.e()) {
            if (!z12) {
                f12 = C9563f.f(b0Var2);
                if (!f12) {
                    f17 = f7;
                    f18 = f17;
                }
            }
            f17 = f7;
        }
        Pair pair = new Pair(Float.valueOf(f17), Float.valueOf(f18));
        float floatValue2 = ((Number) pair.a()).floatValue();
        float floatValue3 = ((Number) pair.b()).floatValue();
        float floatValue4 = c9562e2.f98044b.invoke(Float.valueOf(floatValue), Float.valueOf(floatValue2), Float.valueOf(floatValue3)).floatValue();
        if (floatValue4 != floatValue2 && floatValue4 != floatValue3 && floatValue4 != f7) {
            throw new IllegalStateException(("Final Snapping Offset Should Be one of " + floatValue2 + ", " + floatValue3 + " or 0.0").toString());
        }
        if (floatValue4 == Float.POSITIVE_INFINITY || floatValue4 == Float.NEGATIVE_INFINITY) {
            floatValue4 = f7;
        }
        if (Float.isNaN(floatValue4)) {
            throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        j13.f71784a = floatValue4;
        float f21 = f7;
        C8006o b11 = C0.b(c8006o, f21, f21, 30);
        interfaceC8002m = c9568k.f98067c;
        a aVar2 = new a(j13, r62);
        this.f98049d = null;
        this.f98050e = 2;
        Object b12 = C9573p.b(this.f98054i, floatValue4, floatValue4, b11, interfaceC8002m, aVar2, this);
        return b12 == aVar ? aVar : b12;
    }
}
