package ru.ozon.android.messenger.framework.presentation.messenger;

import Ae.M0;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.Q;
import androidx.fragment.app.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.presentation.ai.C9409a;
import ru.ozon.android.messenger.framework.presentation.ai.C9413c;
import ru.ozon.android.messenger.framework.presentation.ai.Z;
import ru.ozon.android.messenger.framework.presentation.chatdetail.d;
import ru.ozon.android.messenger.framework.presentation.chatlist.C9488a;
import ru.ozon.android.messenger.framework.presentation.chatlist.v;
import ru.ozon.android.messenger.framework.presentation.messenger.c;
import ru.ozon.android.messenger.framework.presentation.messenger.f;
import ru.ozon.android.messenger.framework.presentation.messenger.h;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/messenger/c;", "Lru/ozon/android/messenger/framework/presentation/messenger/g;", "Lru/ozon/android/messenger/framework/core/initialization/newinit/d;", "<init>", "()V", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends ru.ozon.android.messenger.framework.presentation.messenger.g implements ru.ozon.android.messenger.framework.core.initialization.newinit.d {

    /* renamed from: c, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.core.initialization.d f91315c;

    /* renamed from: d, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.navigation.controller.a f91316d;

    /* renamed from: e, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.composer.navigation.router.c f91317e;

    /* renamed from: f, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.data.b f91318f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f91319g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f91320h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f91321i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f91322j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f91323k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Object f91324l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f91325m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Object f91326n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final y0 f91327o;

    public static final class a {
        @NotNull
        public static ru.ozon.android.messenger.framework.presentation.messenger.g a(@NotNull ru.ozon.android.messenger.framework.presentation.messenger.f launchType, @NotNull String namespace, String str) {
            Intrinsics.checkNotNullParameter(launchType, "launchType");
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            c cVar = new c();
            ru.ozon.android.messenger.utils.g.g(cVar, new Pair("EXT_LAUNCH_TYPE", launchType), new Pair("ARG_MESSENGER_NAMESPACE", namespace), new Pair("ARG_BASE_FILE_URL", str));
            return cVar;
        }
    }

    static final class b extends AbstractC7737t implements Function0<String> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return c.this.requireArguments().getString("ARG_BASE_FILE_URL");
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.messenger.c$c, reason: collision with other inner class name */
    static final class C1704c extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.core.initialization.di.c> {
        C1704c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.framework.core.initialization.di.c invoke() {
            return c.this.y().getComponent();
        }
    }

    static final class d extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.core.initialization.di.b> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.framework.core.initialization.di.b invoke() {
            return c.this.y().a();
        }
    }

    static final class e extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.core.initialization.newinit.c> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.framework.core.initialization.newinit.c invoke() {
            ru.ozon.android.messenger.api.b bVar = ru.ozon.android.messenger.api.b.f83914a;
            String z11 = c.this.z();
            bVar.getClass();
            return ru.ozon.android.messenger.api.b.c(z11);
        }
    }

    static final class f extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.presentation.messenger.f> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.framework.presentation.messenger.f invoke() {
            c cVar = c.this;
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            return (ru.ozon.android.messenger.framework.presentation.messenger.f) ru.ozon.android.messenger.utils.g.c(cVar, "EXT_LAUNCH_TYPE", ru.ozon.android.messenger.framework.presentation.messenger.f.class);
        }
    }

    static final class g extends AbstractC7737t implements Function0<String> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String string = c.this.requireArguments().getString("ARG_MESSENGER_NAMESPACE");
            if (string != null) {
                return string;
            }
            throw new IllegalStateException("Cannot find ARG_MESSENGER_NAMESPACE");
        }
    }

    static final class h extends AbstractC7737t implements Function0<d.a> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final d.a invoke() {
            c cVar = c.this;
            return new d.a(cVar.z(), cVar.x());
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.messenger.InternalMessengerFragment$onViewCreated$$inlined$observe$1", f = "MessengerFragment.kt", l = {}, m = "invokeSuspend")
    public static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<ru.ozon.android.messenger.framework.presentation.messenger.h, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f91335d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f91336e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(kotlin.coroutines.d dVar, c cVar) {
            super(2, dVar);
            this.f91336e = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = new i(dVar, this.f91336e);
            iVar.f91335d = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ru.ozon.android.messenger.framework.presentation.messenger.h hVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(hVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            c.w(this.f91336e, (ru.ozon.android.messenger.framework.presentation.messenger.h) this.f91335d);
            return Unit.f71690a;
        }
    }

    static final class j extends AbstractC7737t implements Function0<G> {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f91338a;

            static {
                int[] iArr = new int[AbstractC5434v.a.values().length];
                try {
                    iArr[AbstractC5434v.a.ON_STOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f91338a = iArr;
            }
        }

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final G invoke() {
            final c cVar = c.this;
            return new G() { // from class: ru.ozon.android.messenger.framework.presentation.messenger.d
                @Override // androidx.lifecycle.G
                public final void onStateChanged(J j11, AbstractC5434v.a event) {
                    Intrinsics.checkNotNullParameter(j11, "<unused var>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (c.j.a.f91338a[event.ordinal()] == 1) {
                        l lVar = l.this;
                        lVar.getClass();
                        C10727i.c(x0.a(lVar), null, null, new t(lVar, null), 3);
                    }
                }
            };
        }
    }

    public static final class k extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return c.this;
        }
    }

    public static final class l extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f91340b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f91340b = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f91340b.invoke();
        }
    }

    public static final class m extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f91341b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f91341b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f91341b.getValue()).getViewModelStore();
        }
    }

    public static final class n extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f91342b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f91342b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f91342b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    static final class o extends AbstractC7737t implements Function0<z0.b> {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            c cVar = c.this;
            return new ru.ozon.android.messenger.framework.presentation.messenger.j(c.u(cVar), cVar.getComponent());
        }
    }

    public c() {
        Sc.n nVar = Sc.n.NONE;
        this.f91319g = Sc.k.a(nVar, new g());
        this.f91320h = Sc.k.a(nVar, new b());
        this.f91321i = Sc.k.a(nVar, new e());
        this.f91322j = Sc.k.a(nVar, new C1704c());
        this.f91323k = Sc.k.a(nVar, new d());
        this.f91324l = ru.ozon.android.messenger.utils.f.b(new f());
        this.f91325m = Sc.k.b(new h());
        this.f91326n = ru.ozon.android.messenger.utils.f.b(new j());
        o oVar = new o();
        InterfaceC4008j a11 = Sc.k.a(nVar, new l(new k()));
        this.f91327o = b0.b(this, N.b(ru.ozon.android.messenger.framework.presentation.messenger.l.class), new m(a11), new n(a11), oVar);
    }

    private final void A(v vVar) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        Boolean a11 = ((ru.ozon.android.messenger.framework.presentation.messenger.f) ru.ozon.android.messenger.utils.g.c(this, "EXT_LAUNCH_TYPE", ru.ozon.android.messenger.framework.presentation.messenger.f.class)).s().a();
        if (a11 != null) {
            boolean booleanValue = a11.booleanValue();
            ru.ozon.android.messenger.framework.core.initialization.d dVar = this.f91315c;
            if (dVar == null) {
                Intrinsics.n("messengerConfig");
                throw null;
            }
            dVar.getBlockCustomSettings().d(booleanValue);
        }
        b7.d.d();
        C9488a c9488a = new C9488a();
        ru.ozon.android.messenger.utils.g.g(c9488a, new Pair("ARG_INITIAL_FILTER", vVar));
        androidx.fragment.app.G childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        Q p11 = childFragmentManager.p();
        p11.r(R$id.fragmentChatContainer, c9488a, null);
        p11.i();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final ru.ozon.android.messenger.framework.presentation.messenger.f u(c cVar) {
        return (ru.ozon.android.messenger.framework.presentation.messenger.f) cVar.f91324l.getValue();
    }

    public static final ru.ozon.android.messenger.framework.presentation.messenger.l v(c cVar) {
        return (ru.ozon.android.messenger.framework.presentation.messenger.l) cVar.f91327o.getValue();
    }

    public static final void w(c cVar, ru.ozon.android.messenger.framework.presentation.messenger.h hVar) {
        if (hVar.c() != null) {
            h.b c11 = hVar.c();
            View rootView = cVar.getBinding().getConstraintLayout().getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                Integer a11 = c11.a();
                String c12 = c11.c();
                J viewLifecycleOwner = cVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                ru.ozon.android.messenger.framework.presentation.common.view.flashbar.factory.b.c(viewGroup, new OzonSpannableString(c11.b()), a11, c12, viewLifecycleOwner, 466).e();
            }
            ((ru.ozon.android.messenger.framework.presentation.messenger.l) cVar.f91327o.getValue()).p0();
        }
        hVar.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.initialization.newinit.d
    @NotNull
    public final ru.ozon.android.messenger.framework.core.initialization.di.b a() {
        return (ru.ozon.android.messenger.framework.core.initialization.di.b) this.f91323k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.initialization.newinit.d
    @NotNull
    public final ru.ozon.android.messenger.framework.core.initialization.di.c getComponent() {
        return (ru.ozon.android.messenger.framework.core.initialization.di.c) this.f91322j.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.newinit.d
    @NotNull
    public final d.a getNetworkConfig() {
        return (d.a) this.f91325m.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        getComponent().I(this);
        super.onAttach(context);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        ProcessLifecycleOwner processLifecycleOwner;
        ru.ozon.android.messenger.framework.presentation.chatdetail.d a11;
        super.onCreate(bundle);
        ru.ozon.android.messenger.framework.composer.navigation.router.c cVar = this.f91317e;
        if (cVar == null) {
            Intrinsics.n("composerScreenRouter");
            throw null;
        }
        cVar.a(this);
        ru.ozon.android.messenger.framework.core.initialization.d dVar = this.f91315c;
        if (dVar == null) {
            Intrinsics.n("messengerConfig");
            throw null;
        }
        d.InterfaceC1560d messengerLifecycleCallback = dVar.getMessengerLifecycleCallback();
        if (messengerLifecycleCallback != null) {
            messengerLifecycleCallback.onCreate(this);
        }
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a((G) this.f91326n.getValue());
        if (bundle == null) {
            ru.ozon.android.messenger.framework.presentation.messenger.f fVar = (ru.ozon.android.messenger.framework.presentation.messenger.f) this.f91324l.getValue();
            if (fVar instanceof f.c) {
                A(null);
                return;
            }
            if (fVar instanceof f.d) {
                A(((f.d) fVar).a());
                return;
            }
            if (fVar instanceof f.b) {
                f.b bVar = (f.b) fVar;
                Boolean a12 = bVar.s().a();
                if (a12 != null) {
                    boolean booleanValue = a12.booleanValue();
                    ru.ozon.android.messenger.framework.core.initialization.d dVar2 = this.f91315c;
                    if (dVar2 == null) {
                        Intrinsics.n("messengerConfig");
                        throw null;
                    }
                    dVar2.getBlockCustomSettings().c(booleanValue);
                }
                String uri = bVar.b().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                a11 = d.C9454b.a(bVar.b(), bVar.a(), bVar.c(), false, false, d.EnumC9455c.BOTTOM);
                androidx.fragment.app.G childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                Q p11 = childFragmentManager.p();
                p11.r(R$id.fragmentChatContainer, a11, uri);
                p11.i();
                return;
            }
            if (!(fVar instanceof f.a)) {
                throw new Sc.o();
            }
            f.a aVar = (f.a) fVar;
            Uri b11 = aVar.b();
            String a13 = aVar.a();
            ru.ozon.android.messenger.framework.data.b bVar2 = this.f91318f;
            if (bVar2 == null) {
                Intrinsics.n("blockStore");
                throw null;
            }
            C9409a aiAssistantArgs = new C9409a(b11, a13, null, true, false, C7714v.a0(Z.a(bVar2, null, null)));
            Intrinsics.checkNotNullParameter(aiAssistantArgs, "aiAssistantArgs");
            C9413c c9413c = new C9413c();
            ru.ozon.android.messenger.utils.g.g(c9413c, new Pair("ARG_AI_ASSISTANT", aiAssistantArgs));
            String uri2 = aVar.b().toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            androidx.fragment.app.G childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            Q p12 = childFragmentManager2.p();
            p12.r(R$id.fragmentChatContainer, c9413c, uri2);
            p12.i();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        ProcessLifecycleOwner processLifecycleOwner;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().e((G) this.f91326n.getValue());
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ru.ozon.android.messenger.framework.presentation.messenger.l lVar = ru.ozon.android.messenger.framework.presentation.messenger.l.this;
        lVar.getClass();
        C10727i.c(x0.a(lVar), null, null, new s(lVar, null), 3);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        M0 s02 = ((ru.ozon.android.messenger.framework.presentation.messenger.l) this.f91327o.getValue()).s0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner, s02, new i(null, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final String x() {
        return (String) this.f91320h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final ru.ozon.android.messenger.framework.core.initialization.newinit.c y() {
        return (ru.ozon.android.messenger.framework.core.initialization.newinit.c) this.f91321i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final String z() {
        return (String) this.f91319g.getValue();
    }
}
