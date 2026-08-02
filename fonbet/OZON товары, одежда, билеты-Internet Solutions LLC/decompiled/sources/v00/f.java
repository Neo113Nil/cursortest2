package v00;

import D1.InterfaceC2801g;
import J0.C3332q;
import J0.u3;
import P1.F;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import a1.C4912a;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.f;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.Y1;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import e1.InterfaceC6250b;
import e3.C6285b;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import o00.C8624a;
import o00.InterfaceC8626c;
import org.jetbrains.annotations.NotNull;
import p00.C8829e;
import p00.InterfaceC8826b;
import ru.ozon.app.android.R;
import t00.C9722d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv00/f;", "Landroidx/fragment/app/m;", "<init>", "()V", "composer-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f101613a;

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                f.u(f.this, interfaceC3967k2, 0);
            }
            return Unit.f71690a;
        }
    }

    public static final class b extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f101615b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0) {
            super(0);
            this.f101615b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f101615b.invoke();
        }
    }

    public static final class c extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f101616b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f101616b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f101616b.getValue()).getViewModelStore();
        }
    }

    public static final class d extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f101617b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f101617b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f101617b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    static final class e extends AbstractC7737t implements Function0<B0> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            r requireActivity = f.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            return requireActivity;
        }
    }

    /* renamed from: v00.f$f, reason: collision with other inner class name */
    static final class C2213f extends AbstractC7737t implements Function0<z0.b> {
        C2213f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            int i11 = C8624a.f77454b;
            Context applicationContext = f.this.requireContext().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            InterfaceC8626c a11 = C8624a.a(applicationContext);
            Intrinsics.f(a11);
            return w00.e.a(a11.c());
        }
    }

    public f() {
        e eVar = new e();
        C2213f c2213f = new C2213f();
        InterfaceC4008j a11 = k.a(n.NONE, new b(eVar));
        this.f101613a = b0.b(this, N.b(g.class), new c(a11), new d(a11), c2213f);
    }

    public static void t(f fVar, String str) {
        ((g) fVar.f101613a.getValue()).h0(C8829e.f80013b, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ab, code lost:
    
        if (r2.c() == true) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u(f fVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        InterfaceC3978p0 interfaceC3978p0;
        boolean z11;
        e.a aVar;
        C3969l c3969l;
        boolean z12;
        C3969l c3969l2;
        F f7;
        kotlin.reflect.d<String> a11;
        C3969l u11 = interfaceC3967k.u(1047104691);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(fVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
            c3969l2 = u11;
        } else {
            InterfaceC3978p0 c11 = C6285b.c(((g) fVar.f101613a.getValue()).f0(), u11, 0);
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            float f11 = 12;
            androidx.compose.ui.e d11 = a0.d(T.j(aVar2, f11, f11, f11, 0.0f, 8));
            C5194q a12 = C5193p.a(C5179b.d(), InterfaceC6250b.a.k(), u11, 6);
            int I11 = u11.I();
            S0.A0 d12 = u11.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, d11);
            Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            C9722d c9722d = (C9722d) c11.getValue();
            Object obj = null;
            InterfaceC8826b b11 = c9722d != null ? c9722d.b() : null;
            C9722d c9722d2 = (C9722d) c11.getValue();
            if (c9722d2 != null) {
                Object d13 = c9722d2.d();
                if (b11 != null && (a11 = ((InterfaceC8826b.AbstractC1343b) b11).a()) != null) {
                    kotlin.reflect.e.a(a11, d13);
                    obj = d13;
                }
            }
            if (b11 == null || obj == null) {
                interfaceC3978p0 = c11;
                z11 = false;
                aVar = aVar2;
                u11.o(1203992761);
                u3.b("Переданы не валидные данные", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, u11, 6, 0, 131070);
                c3969l = u11;
                c3969l.k();
            } else {
                u11.o(1204072245);
                String str = "Установка флага " + ((C8829e) b11).getName() + " на значение " + obj + " после подтверждения установки флага потребуется перезапустить приложение";
                f7 = F.f21512j;
                z11 = false;
                interfaceC3978p0 = c11;
                aVar = aVar2;
                u3.b(str, null, 0L, 0L, f7, 0L, null, 0L, 0, false, 0, 0, null, null, u11, 196608, 0, 131038);
                c3969l = u11;
                c3969l.k();
            }
            c3969l.o(1008683078);
            boolean F11 = c3969l.F(fVar);
            Object C11 = c3969l.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new v00.d(fVar);
                c3969l.x(C11);
            }
            Function0 function0 = (Function0) C11;
            c3969l.k();
            androidx.compose.ui.e e11 = a0.e(aVar, 1.0f);
            C9722d c9722d3 = (C9722d) interfaceC3978p0.getValue();
            if (c9722d3 != null) {
                z12 = true;
            }
            z12 = z11;
            C3332q.a(function0, e11, z12, null, null, null, null, C10175a.f101605a, c3969l, 805306416, 504);
            c3969l2 = c3969l;
            c3969l2.f();
        }
        J0 m02 = c3969l2.m0();
        if (m02 != null) {
            m02.G(new v00.e(fVar, i11));
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        C9722d<? extends Object> value = ((g) this.f101613a.getValue()).f0().getValue();
        if (value != null && value.b() != null) {
            kotlin.reflect.d<String> a11 = ((InterfaceC8826b.AbstractC1343b) value.b()).a();
            Object d11 = value.d();
            kotlin.reflect.e.a(a11, d11);
            final String str = (String) d11;
            f.a aVar = new f.a(requireContext());
            aVar.e(R.string.composer_debug_token_disclaimer);
            aVar.m("Ок", new DialogInterface.OnClickListener() { // from class: v00.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    f.t(f.this, str);
                }
            });
            aVar.b(false);
            aVar.h("Отмена", new DialogInterface.OnClickListener() { // from class: v00.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    f.this.requireActivity().finish();
                }
            });
            aVar.q();
        }
        composeView.setViewCompositionStrategy(Y1.c.f40794a);
        composeView.a(new C4912a(true, 1751528114, new a()));
        return composeView;
    }
}
