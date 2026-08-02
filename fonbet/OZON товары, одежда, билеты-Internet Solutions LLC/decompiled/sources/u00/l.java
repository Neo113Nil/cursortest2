package u00;

import Ae.C2399j;
import Ae.C2408n0;
import D1.InterfaceC2801g;
import J0.C3332q;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import Sc.InterfaceC4008j;
import Sc.s;
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
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.C6285b;
import f3.AbstractC6409a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import o00.C8624a;
import o00.InterfaceC8626c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import t00.AbstractC9719a;
import t00.AbstractC9720b;
import t00.C9721c;
import v0.C10164d;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu00/l;", "Landroidx/fragment/app/m;", "<init>", "()V", "composer-debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f99712a;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.debug.menu.ui.screens.list.ComposerDebugMenuItemsListFragment$onViewCreated$1", f = "ComposerDebugMenuItemsListFragment.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<AbstractC9719a, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f99713d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = l.this.new a(dVar);
            aVar.f99713d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AbstractC9719a abstractC9719a, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(abstractC9719a, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            AbstractC9719a abstractC9719a = (AbstractC9719a) this.f99713d;
            if (abstractC9719a instanceof AbstractC9719a.c) {
                final AbstractC9719a.c cVar = (AbstractC9719a.c) abstractC9719a;
                final l lVar = l.this;
                f.a aVar2 = new f.a(lVar.requireContext());
                aVar2.e(R.string.composer_debug_token_disclaimer);
                aVar2.m("Ок", new DialogInterface.OnClickListener() { // from class: u00.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        l.t(l.this, cVar);
                    }
                });
                aVar2.b(false);
                aVar2.h("Отмена", new DialogInterface.OnClickListener() { // from class: u00.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        l.u(l.this, cVar);
                    }
                });
                aVar2.q();
            } else if (!(abstractC9719a instanceof AbstractC9719a.b) && !Intrinsics.d(abstractC9719a, AbstractC9719a.C2173a.f98946b)) {
                throw new Sc.o();
            }
            return Unit.f71690a;
        }
    }

    public static final class b extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return l.this;
        }
    }

    public static final class c extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f99716b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f99716b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f99716b.invoke();
        }
    }

    public static final class d extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f99717b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f99717b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f99717b.getValue()).getViewModelStore();
        }
    }

    public static final class e extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f99718b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f99718b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f99718b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    static final class f extends AbstractC7737t implements Function0<z0.b> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            int i11 = C8624a.f77454b;
            Context applicationContext = l.this.requireContext().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            InterfaceC8626c a11 = C8624a.a(applicationContext);
            Intrinsics.f(a11);
            return w00.e.a(a11.b());
        }
    }

    public l() {
        f fVar = new f();
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new c(new b()));
        this.f99712a = b0.b(this, N.b(m.class), new d(a11), new e(a11), fVar);
    }

    public static void t(l lVar, AbstractC9719a.c cVar) {
        ((m) lVar.f99712a.getValue()).i0(cVar.c());
    }

    public static void u(l lVar, AbstractC9719a.c cVar) {
        m mVar = (m) lVar.f99712a.getValue();
        AbstractC9720b.d stringItem = cVar.b();
        mVar.getClass();
        Intrinsics.checkNotNullParameter(stringItem, "stringItem");
        C10727i.c(x0.a(mVar), null, null, new o(mVar, stringItem, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(List list, e.a aVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1430711364);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(this) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            androidx.compose.ui.e j11 = T.j(a0.e(aVar, 1.0f), 0.0f, 12, 0.0f, 0.0f, 13);
            u11.o(-635350339);
            boolean F11 = u11.F(list) | u11.F(this);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new g(list, this);
                u11.x(C11);
            }
            u11.k();
            C10164d.a(j11, null, null, null, null, null, false, (Function1) C11, u11, 0, 254);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new h(this, list, aVar, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void x(l lVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-57916618);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(lVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            InterfaceC3978p0 c11 = C6285b.c(((m) lVar.f99712a.getValue()).getState(), u11, 0);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e d11 = a0.d(aVar);
            C5194q a11 = C5193p.a(C5179b.d(), InterfaceC6250b.a.k(), u11, 6);
            int I11 = u11.I();
            S0.A0 d12 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, d11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            lVar.v(((C9721c) c11.getValue()).a(), aVar, u11, ((i12 << 6) & 896) | 48);
            u11.o(1549758173);
            boolean F11 = u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new i(lVar);
                u11.x(C11);
            }
            u11.k();
            C3332q.a((Function0) C11, a0.e(aVar, 1.0f), ((C9721c) c11.getValue()).b(), null, null, null, null, C9916a.f99691a, u11, 805306416, 504);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new j(lVar, i11));
        }
    }

    public static final m y(l lVar) {
        return (m) lVar.f99712a.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(Y1.c.f40794a);
        composeView.a(new C4912a(true, 1285173234, new k(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C2408n0 c2408n0 = new C2408n0(C5427n.a(((m) this.f99712a.getValue()).f0(), getViewLifecycleOwner().getLifecycle(), AbstractC5434v.b.STARTED), new a(null));
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C2399j.C(c2408n0, K.a(viewLifecycleOwner));
    }
}
