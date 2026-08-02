package ru.ozon.android.messenger.framework.presentation.search;

import Ae.M0;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import Sc.InterfaceC4008j;
import a1.C4912a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import e3.C6285b;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.search.G;
import ru.ozon.android.messenger.utils.m;
import ru.ozon.app.android.messenger.databinding.MFragmentChatSearchBinding;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/search/a;", "Lru/ozon/android/messenger/framework/presentation/common/screen/i;", "Lru/ozon/app/android/messenger/databinding/MFragmentChatSearchBinding;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: ru.ozon.android.messenger.framework.presentation.search.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9516a extends ru.ozon.android.messenger.framework.presentation.common.screen.i<MFragmentChatSearchBinding> {

    /* renamed from: c, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.data.b f91604c;

    /* renamed from: d, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.navigation.controller.a f91605d;

    /* renamed from: e, reason: collision with root package name */
    public G.a f91606e;

    /* renamed from: f, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.navigation.d f91607f;

    /* renamed from: g, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.core.initialization.d f91608g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final y0 f91609h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final y0 f91610i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final y0 f91611j;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$a, reason: collision with other inner class name */
    /* synthetic */ class C1714a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MFragmentChatSearchBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1714a f91612a = new C1714a(3, MFragmentChatSearchBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MFragmentChatSearchBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MFragmentChatSearchBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MFragmentChatSearchBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$b */
    static final class b extends AbstractC7737t implements Function0<B0> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            ComponentCallbacksC5392m requireParentFragment = C9516a.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
            return requireParentFragment;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchFragment$onViewCreated$2", f = "ChatSearchFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<C9525e, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f91614d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f91616f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ru.ozon.android.messenger.framework.core.d dVar, kotlin.coroutines.d<? super c> dVar2) {
            super(2, dVar2);
            this.f91616f = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = C9516a.this.new c(this.f91616f, dVar);
            cVar.f91614d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C9525e c9525e, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(c9525e, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            C9516a.v(C9516a.this, this.f91616f, ru.ozon.android.messenger.framework.presentation.models.f.a(((C9525e) this.f91614d).c()));
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$d */
    static final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f91618c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ru.ozon.android.messenger.framework.core.d dVar) {
            super(2);
            this.f91618c = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                C9516a c9516a = C9516a.this;
                InterfaceC3978p0 c11 = C6285b.c(C9516a.u(c9516a).K0(), interfaceC3967k2, 0);
                InterfaceC3978p0 a11 = C6285b.a(C9516a.u(c9516a).L0(), null, interfaceC3967k2, 48);
                T value = a11.getValue();
                interfaceC3967k2.o(386090471);
                boolean n11 = interfaceC3967k2.n(a11) | interfaceC3967k2.F(c9516a);
                ru.ozon.android.messenger.framework.core.d dVar = this.f91618c;
                boolean F11 = n11 | interfaceC3967k2.F(dVar);
                Object C11 = interfaceC3967k2.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new C9517b(a11, c9516a, dVar, null);
                    interfaceC3967k2.x(C11);
                }
                interfaceC3967k2.k();
                Q.e(interfaceC3967k2, value, (Function2) C11);
                androidx.compose.ui.e j11 = T.j(a0.d(androidx.compose.ui.e.f40358c0), 0.0f, 8, 0.0f, 0.0f, 13);
                C9525e c9525e = (C9525e) c11.getValue();
                L O02 = C9516a.u(c9516a).O0();
                interfaceC3967k2.o(386140322);
                boolean F12 = interfaceC3967k2.F(c9516a);
                Object C12 = interfaceC3967k2.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new C9518c(c9516a);
                    interfaceC3967k2.x(C12);
                }
                interfaceC3967k2.k();
                ru.ozon.android.messenger.framework.presentation.search.composable.v.a(j11, c9525e, dVar, O02, (Function1) C12, interfaceC3967k2, 6);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$e */
    public static final class e extends AbstractC7737t implements Function0<A0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return C9516a.this.requireActivity().getViewModelStore();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$f */
    public static final class f extends AbstractC7737t implements Function0<AbstractC6409a> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return C9516a.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$g */
    public static final class g extends AbstractC7737t implements Function0<z0.b> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return C9516a.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$h */
    public static final class h extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f91622b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0) {
            super(0);
            this.f91622b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f91622b.invoke();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$i */
    public static final class i extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f91623b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f91623b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f91623b.getValue()).getViewModelStore();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$j */
    public static final class j extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f91624b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f91624b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f91624b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$k */
    public static final class k extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f91626c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f91626c = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            z0.b defaultViewModelProviderFactory;
            B0 b02 = (B0) this.f91626c.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return (interfaceC5431s == null || (defaultViewModelProviderFactory = interfaceC5431s.getDefaultViewModelProviderFactory()) == null) ? C9516a.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$l */
    public static final class l extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return C9516a.this;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$m */
    public static final class m extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f91628b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f91628b = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f91628b.invoke();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$n */
    public static final class n extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f91629b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f91629b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f91629b.getValue()).getViewModelStore();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$o */
    public static final class o extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f91630b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f91630b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f91630b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.a$p */
    static final class p extends AbstractC7737t implements Function0<z0.b> {
        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            C9516a c9516a = C9516a.this;
            Bundle arguments = c9516a.getArguments();
            G.a aVar = c9516a.f91606e;
            if (aVar != null) {
                return new G(c9516a, arguments, aVar);
            }
            Intrinsics.n("assistedFactory");
            throw null;
        }
    }

    public C9516a() {
        super(C1714a.f91612a);
        b bVar = new b();
        Sc.n nVar = Sc.n.NONE;
        InterfaceC4008j a11 = Sc.k.a(nVar, new h(bVar));
        this.f91609h = b0.b(this, kotlin.jvm.internal.N.b(ru.ozon.android.messenger.framework.presentation.messenger.l.class), new i(a11), new j(a11), new k(a11));
        p pVar = new p();
        InterfaceC4008j a12 = Sc.k.a(nVar, new m(new l()));
        this.f91610i = b0.b(this, kotlin.jvm.internal.N.b(C9527g.class), new n(a12), new o(a12), pVar);
        this.f91611j = b0.b(this, kotlin.jvm.internal.N.b(ru.ozon.android.messenger.framework.presentation.messenger.b.class), new e(), new f(), new g());
    }

    public static final C9527g u(C9516a c9516a) {
        return (C9527g) c9516a.f91610i.getValue();
    }

    public static final void v(C9516a c9516a, ru.ozon.android.messenger.framework.core.d dVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ru.ozon.android.messenger.framework.presentation.models.e eVar = (ru.ozon.android.messenger.framework.presentation.models.e) it.next();
            ru.ozon.android.messenger.framework.data.b bVar = c9516a.f91604c;
            if (bVar == null) {
                Intrinsics.n("blockStore");
                throw null;
            }
            ru.ozon.android.messenger.framework.core.viewmapper.b<Object, ru.ozon.android.messenger.framework.presentation.models.g, ?> d11 = ru.ozon.android.messenger.framework.data.d.d(bVar, eVar);
            ConstraintLayout constraintLayout = c9516a.getBinding().getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            d11.m(constraintLayout, dVar, eVar);
        }
        ((C9527g) c9516a.f91610i.getValue()).H0();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ru.ozon.android.messenger.utils.g.d(this).c(this);
        super.onAttach(context);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.screen.i, androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        AbstractC5434v lifecycle = getViewLifecycleOwner().getLifecycle();
        m.a aVar = m.a.ADJUST_RESIZE;
        Window window = requireActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        lifecycle.a(new ru.ozon.android.messenger.utils.m(aVar, window));
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.screen.i, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        ru.ozon.android.messenger.framework.core.e.b();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((ru.ozon.android.messenger.framework.presentation.messenger.l) this.f91609h.getValue()).t0("communications_chat_search");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        y0 y0Var = this.f91610i;
        ru.ozon.android.messenger.framework.navigation.controller.b M02 = ((C9527g) y0Var.getValue()).M0();
        ConstraintLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ru.ozon.android.messenger.framework.presentation.messenger.a f02 = ((ru.ozon.android.messenger.framework.presentation.messenger.b) this.f91611j.getValue()).f0();
        ru.ozon.android.messenger.framework.data.b bVar = this.f91604c;
        if (bVar == null) {
            Intrinsics.n("blockStore");
            throw null;
        }
        ru.ozon.android.messenger.framework.core.d dVar = new ru.ozon.android.messenger.framework.core.d(M02, constraintLayout, viewLifecycleOwner, this, f02, bVar);
        ru.ozon.android.messenger.framework.core.e.a(dVar);
        ConstraintLayout constraintLayout2 = getBinding().getConstraintLayout();
        if (this.f91608g == null) {
            Intrinsics.n("messengerConfig");
            throw null;
        }
        constraintLayout2.setFitsSystemWindows(!r3.getEnabledInsets());
        ru.ozon.android.messenger.framework.core.initialization.d dVar2 = this.f91608g;
        if (dVar2 == null) {
            Intrinsics.n("messengerConfig");
            throw null;
        }
        if (dVar2.getEnabledInsets()) {
            Y.J(getBinding().getConstraintLayout(), new Co.a());
        }
        M0<C9525e> K02 = ((C9527g) y0Var.getValue()).K0();
        androidx.lifecycle.J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner2, K02, new c(dVar, null));
        getBinding().searchContent.a(new C4912a(true, -1572107526, new d(dVar)));
    }
}
