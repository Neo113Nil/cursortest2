package y4;

import Bl0.C2652m;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Sc.s;
import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;

/* loaded from: classes8.dex */
public final class j {

    @kotlin.coroutines.jvm.internal.e(c = "androidx.media3.ui.compose.PlayerSurfaceKt$PlayerSurfaceInternal$4$1$1", f = "PlayerSurface.kt", l = {114}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106005d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ y f106006e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f106007f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<y, View, Unit> f106008g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<y, View, Unit> f106009h;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.media3.ui.compose.PlayerSurfaceKt$PlayerSurfaceInternal$4$1$1$2", f = "PlayerSurface.kt", l = {}, m = "invokeSuspend")
        /* renamed from: y4.j$a$a, reason: collision with other inner class name */
        static final class C2291a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ View f106010d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function2<y, View, Unit> f106011e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2291a(View view, Function2<? super y, View, Unit> function2, kotlin.coroutines.d<? super C2291a> dVar) {
                super(2, dVar);
                this.f106010d = view;
                this.f106011e = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2291a(this.f106010d, this.f106011e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2291a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                View view = this.f106010d;
                Object tag = view.getTag();
                y yVar = tag instanceof y ? (y) tag : null;
                if (yVar != null) {
                    if (yVar.l(27)) {
                        this.f106011e.invoke(yVar, view);
                    }
                    view.setTag(null);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(y yVar, View view, Function2<? super y, View, Unit> function2, Function2<? super y, View, Unit> function22, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f106006e = yVar;
            this.f106007f = view;
            this.f106008g = function2;
            this.f106009h = function22;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f106006e, this.f106007f, this.f106008g, this.f106009h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106005d;
            if (i11 == 0) {
                s.b(obj);
                View view = this.f106007f;
                Function2<y, View, Unit> function2 = this.f106009h;
                y yVar = this.f106006e;
                if (yVar != null) {
                    Object tag = view.getTag();
                    y yVar2 = tag instanceof y ? (y) tag : null;
                    if (yVar2 != null && !yVar2.equals(yVar) && yVar2.l(27)) {
                        function2.invoke(yVar2, view);
                    }
                    if (yVar.l(27)) {
                        this.f106008g.invoke(yVar, view);
                        view.setTag(yVar);
                    }
                } else {
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 l02 = De.s.f6650a;
                    C2291a c2291a = new C2291a(view, function2, null);
                    this.f106005d = 1;
                    if (C10727i.f(l02, c2291a, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public static Unit a(int i11, InterfaceC3967k interfaceC3967k, androidx.compose.ui.e eVar, y yVar, Function1 function1, Function2 function2, Function2 function22) {
        c(C2652m.e(i11 | 1), interfaceC3967k, eVar, yVar, function1, function2, function22);
        return Unit.f71690a;
    }

    public static final void b(y yVar, androidx.compose.ui.e eVar, final int i11, InterfaceC3967k interfaceC3967k, final int i12) {
        int i13;
        final y yVar2;
        final androidx.compose.ui.e eVar2;
        C3969l u11 = interfaceC3967k.u(12998269);
        if ((i12 & 6) == 0) {
            i13 = (u11.F(yVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.r(i11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            yVar2 = yVar;
            eVar2 = eVar;
        } else if (i11 == 1) {
            yVar2 = yVar;
            eVar2 = eVar;
            u11.o(-316862560);
            u11.o(-316860259);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = d.f105999a;
                u11.x(C11);
            }
            u11.k();
            Function1 function1 = (Function1) ((kotlin.reflect.h) C11);
            u11.o(-316859029);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = e.f106000a;
                u11.x(C12);
            }
            u11.k();
            Function2 function2 = (Function2) ((kotlin.reflect.h) C12);
            u11.o(-316857299);
            Object C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = f.f106001a;
                u11.x(C13);
            }
            u11.k();
            c((i13 & 14) | 28032 | (i13 & 112), u11, eVar2, yVar2, function1, function2, (Function2) ((kotlin.reflect.h) C13));
            u11.k();
        } else {
            if (i11 != 2) {
                u11.o(-316847687);
                u11.k();
                throw new IllegalArgumentException(Ej.b.a(i11, "Unrecognized surface type: "));
            }
            u11.o(-316854624);
            u11.o(-316852323);
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = g.f106002a;
                u11.x(C14);
            }
            u11.k();
            Function1 function12 = (Function1) ((kotlin.reflect.h) C14);
            u11.o(-316851093);
            Object C15 = u11.C();
            if (C15 == InterfaceC3967k.a.a()) {
                C15 = h.f106003a;
                u11.x(C15);
            }
            u11.k();
            Function2 function22 = (Function2) ((kotlin.reflect.h) C15);
            u11.o(-316849363);
            Object C16 = u11.C();
            if (C16 == InterfaceC3967k.a.a()) {
                C16 = i.f106004a;
                u11.x(C16);
            }
            u11.k();
            yVar2 = yVar;
            eVar2 = eVar;
            c((i13 & 14) | 28032 | (i13 & 112), u11, eVar2, yVar2, function12, function22, (Function2) ((kotlin.reflect.h) C16));
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: y4.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int e11 = C2652m.e(i12 | 1);
                    androidx.compose.ui.e eVar3 = eVar2;
                    int i14 = i11;
                    j.b(y.this, eVar3, i14, (InterfaceC3967k) obj, e11);
                    return Unit.f71690a;
                }
            });
        }
    }

    private static final void c(final int i11, InterfaceC3967k interfaceC3967k, final androidx.compose.ui.e eVar, final y yVar, final Function1 function1, final Function2 function2, final Function2 function22) {
        int i12;
        Function2 function23;
        View view;
        C3969l u11 = interfaceC3967k.u(921581664);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(yVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            function23 = function2;
            i12 |= u11.F(function23) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            function23 = function2;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function22) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            u11.o(-1838684430);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(null, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            u11.o(-1838681473);
            boolean z11 = (i12 & 896) == 256;
            Object C12 = u11.C();
            if (z11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new b(function1, 0);
                u11.x(C12);
            }
            Function1 function12 = (Function1) C12;
            Object b11 = Pk0.h.b(u11, -1838680401);
            if (b11 == InterfaceC3967k.a.a()) {
                b11 = new na.d(2);
                u11.x(b11);
            }
            Function1 function13 = (Function1) b11;
            Object b12 = Pk0.h.b(u11, -1838679846);
            if (b12 == InterfaceC3967k.a.a()) {
                b12 = new A90.e(interfaceC3978p0, 2);
                u11.x(b12);
            }
            u11.k();
            androidx.compose.ui.viewinterop.a.b(function12, eVar, function13, null, (Function1) b12, u11, (i12 & 112) | 24960, 8);
            View view2 = (View) interfaceC3978p0.getValue();
            if (view2 != null) {
                u11.o(-898425590);
                boolean F11 = ((57344 & i12) == 16384) | u11.F(yVar) | u11.F(view2) | ((i12 & 7168) == 2048);
                Object C13 = u11.C();
                if (F11 || C13 == InterfaceC3967k.a.a()) {
                    Function2 function24 = function23;
                    view = view2;
                    a aVar = new a(yVar, view, function24, function22, null);
                    u11.x(aVar);
                    C13 = aVar;
                } else {
                    view = view2;
                }
                u11.k();
                Q.g(view, yVar, (Function2) C13, u11);
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: y4.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    Function2 function25 = function22;
                    return j.a(i11, (InterfaceC3967k) obj, eVar, y.this, function1, function2, function25);
                }
            });
        }
    }
}
