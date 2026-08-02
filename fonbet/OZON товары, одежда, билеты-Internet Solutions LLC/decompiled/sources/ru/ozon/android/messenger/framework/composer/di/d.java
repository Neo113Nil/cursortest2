package ru.ozon.android.messenger.framework.composer.di;

import B0.S1;
import C.D;
import Jb.j;
import Jb.k;
import Jb.m;
import We.E;
import android.content.Context;
import com.squareup.moshi.Moshi;
import d90.C6114b;
import d90.C6117e;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.messenger.framework.composer.di.a;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core.q;
import ru.ozon.android.messenger.framework.data.repository.C9351a;

/* loaded from: classes10.dex */
public final class d {

    private static final class a implements ru.ozon.android.messenger.framework.composer.di.a {

        /* renamed from: a, reason: collision with root package name */
        private final S1 f86665a;

        /* renamed from: b, reason: collision with root package name */
        private final ru.ozon.android.messenger.framework.core.initialization.di.c f86666b;

        /* renamed from: c, reason: collision with root package name */
        private final ru.ozon.android.messenger.framework.composer.commonwidgets.di.a f86667c;

        /* renamed from: d, reason: collision with root package name */
        private Pc.a<Context> f86668d;

        /* renamed from: e, reason: collision with root package name */
        private Pc.a<Moshi> f86669e;

        /* renamed from: f, reason: collision with root package name */
        private C6114b f86670f;

        /* renamed from: g, reason: collision with root package name */
        private C6117e f86671g;

        /* renamed from: h, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.composer.configuration.a> f86672h;

        /* renamed from: i, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.composer.navigation.router.c> f86673i;

        /* renamed from: j, reason: collision with root package name */
        private Pc.a<Set<ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a>> f86674j;

        /* renamed from: k, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.navigation.d> f86675k;

        /* renamed from: l, reason: collision with root package name */
        private Pc.a<E> f86676l;

        /* renamed from: m, reason: collision with root package name */
        private Pc.a<U00.b> f86677m;

        /* renamed from: n, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.core.initialization.d> f86678n;

        /* renamed from: o, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.core.initialization.a> f86679o;

        /* renamed from: p, reason: collision with root package name */
        private Pc.a<K00.a> f86680p;

        /* renamed from: ru.ozon.android.messenger.framework.composer.di.d$a$a, reason: collision with other inner class name */
        private static final class C1545a implements Pc.a<ru.ozon.android.messenger.framework.core.initialization.a> {

            /* renamed from: a, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.core.initialization.di.c f86681a;

            C1545a(ru.ozon.android.messenger.framework.core.initialization.di.c cVar) {
                this.f86681a = cVar;
            }

            @Override // Pc.a
            public final ru.ozon.android.messenger.framework.core.initialization.a get() {
                ru.ozon.android.messenger.framework.core.initialization.a n11 = this.f86681a.n();
                j.c(n11);
                return n11;
            }
        }

        private static final class b implements Pc.a<U00.b> {

            /* renamed from: a, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.core.initialization.di.c f86682a;

            b(ru.ozon.android.messenger.framework.core.initialization.di.c cVar) {
                this.f86682a = cVar;
            }

            @Override // Pc.a
            public final U00.b get() {
                return this.f86682a.v();
            }
        }

        private static final class c implements Pc.a<ru.ozon.android.messenger.framework.composer.navigation.router.c> {

            /* renamed from: a, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.core.initialization.di.c f86683a;

            c(ru.ozon.android.messenger.framework.core.initialization.di.c cVar) {
                this.f86683a = cVar;
            }

            @Override // Pc.a
            public final ru.ozon.android.messenger.framework.composer.navigation.router.c get() {
                ru.ozon.android.messenger.framework.composer.navigation.router.c C11 = this.f86683a.C();
                j.c(C11);
                return C11;
            }
        }

        /* renamed from: ru.ozon.android.messenger.framework.composer.di.d$a$d, reason: collision with other inner class name */
        private static final class C1546d implements Pc.a<Context> {

            /* renamed from: a, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.core.initialization.di.c f86684a;

            C1546d(ru.ozon.android.messenger.framework.core.initialization.di.c cVar) {
                this.f86684a = cVar;
            }

            @Override // Pc.a
            public final Context get() {
                Context h11 = this.f86684a.h();
                j.c(h11);
                return h11;
            }
        }

        private static final class e implements Pc.a<Set<ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a>> {

            /* renamed from: a, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.core.initialization.di.c f86685a;

            e(ru.ozon.android.messenger.framework.core.initialization.di.c cVar) {
                this.f86685a = cVar;
            }

            @Override // Pc.a
            public final Set<ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a> get() {
                Set<ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a> provideDeeplinkHandlers = this.f86685a.provideDeeplinkHandlers();
                j.c(provideDeeplinkHandlers);
                return provideDeeplinkHandlers;
            }
        }

        private static final class f implements Pc.a<ru.ozon.android.messenger.framework.core.initialization.d> {

            /* renamed from: a, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.core.initialization.di.c f86686a;

            f(ru.ozon.android.messenger.framework.core.initialization.di.c cVar) {
                this.f86686a = cVar;
            }

            @Override // Pc.a
            public final ru.ozon.android.messenger.framework.core.initialization.d get() {
                ru.ozon.android.messenger.framework.core.initialization.d x11 = this.f86686a.x();
                j.c(x11);
                return x11;
            }
        }

        private static final class g implements Pc.a<Moshi> {

            /* renamed from: a, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.core.initialization.di.c f86687a;

            g(ru.ozon.android.messenger.framework.core.initialization.di.c cVar) {
                this.f86687a = cVar;
            }

            @Override // Pc.a
            public final Moshi get() {
                Moshi e11 = this.f86687a.e();
                j.c(e11);
                return e11;
            }
        }

        private static final class h implements Pc.a<E> {

            /* renamed from: a, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.core.initialization.di.c f86688a;

            h(ru.ozon.android.messenger.framework.core.initialization.di.c cVar) {
                this.f86688a = cVar;
            }

            @Override // Pc.a
            public final E get() {
                E a11 = this.f86688a.a();
                j.c(a11);
                return a11;
            }
        }

        a(S1 s12, ru.ozon.android.messenger.framework.core.initialization.di.c cVar, ru.ozon.android.messenger.framework.composer.commonwidgets.di.a aVar) {
            this.f86665a = s12;
            this.f86666b = cVar;
            this.f86667c = aVar;
            C1546d c1546d = new C1546d(cVar);
            this.f86668d = c1546d;
            g gVar = new g(cVar);
            this.f86669e = gVar;
            this.f86670f = new C6114b(new P30.f(c1546d, gVar, 2), c1546d);
            this.f86671g = new C6117e(new P30.g(c1546d, gVar, 2), c1546d);
            this.f86672h = Jb.d.b(ru.ozon.android.messenger.framework.composer.configuration.c.a());
            c cVar2 = new c(cVar);
            this.f86673i = cVar2;
            e eVar = new e(cVar);
            this.f86674j = eVar;
            this.f86675k = m.a(new k30.c(new ru.ozon.android.messenger.framework.composer.navigation.router.b(cVar2, eVar, 0), 1));
            h hVar = new h(cVar);
            this.f86676l = hVar;
            b bVar = new b(cVar);
            this.f86677m = bVar;
            f fVar = new f(cVar);
            this.f86678n = fVar;
            C1545a c1545a = new C1545a(cVar);
            this.f86679o = c1545a;
            this.f86680p = Jb.d.b(new ru.ozon.android.messenger.framework.composer.network.di.a(hVar, bVar, fVar, c1545a));
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.component.b
        public final ru.ozon.android.messenger.framework.composer.navigation.router.c F() {
            ru.ozon.android.messenger.framework.composer.navigation.router.c C11 = this.f86666b.C();
            j.c(C11);
            return C11;
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.component.b
        public final ru.ozon.android.messenger.framework.navigation.d K() {
            return this.f86675k.get();
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.component.b
        public final ru.ozon.android.messenger.framework.composer.configuration.a getComposerConfiguratorStorage() {
            return this.f86672h.get();
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.a
        public final K00.a getComposerNetwork() {
            return this.f86680p.get();
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.component.b
        public final Map<Class<?>, Pc.a<ru.ozon.android.messenger.framework.composer.configuration.f>> getConfiguratorProviders() {
            return Collections.singletonMap(ru.ozon.android.messenger.framework.composer.demo.configurator.a.class, ru.ozon.android.messenger.framework.composer.demo.configurator.b.a());
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.component.b
        public final Map<Class<?>, Pc.a<E00.a>> getEmptyStateInterceptors() {
            Jb.g b11 = Jb.g.b();
            b11.c(ru.ozon.android.messenger.framework.composer.emptyscreen.b.class, this.f86670f);
            b11.c(ru.ozon.android.messenger.framework.composer.emptyscreen.c.class, this.f86671g);
            return b11.a();
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.component.b
        public final Map<Class<?>, Pc.a<C00.a>> getInitialWidgetsProviders() {
            return Collections.singletonMap(ru.ozon.android.messenger.framework.composer.initialwidgets.a.class, ru.ozon.android.messenger.framework.composer.initialwidgets.b.a());
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.component.b
        public final Set<i> getWidgets() {
            k d11 = k.d(1);
            ru.ozon.android.messenger.framework.core.initialization.di.c cVar = this.f86666b;
            ru.ozon.android.messenger.framework.data.remote.serialize.c w11 = cVar.w();
            ru.ozon.android.messenger.framework.composer.navigation.router.c C11 = cVar.C();
            j.c(C11);
            Set<ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a> provideDeeplinkHandlers = cVar.provideDeeplinkHandlers();
            j.c(provideDeeplinkHandlers);
            ru.ozon.android.messenger.framework.composer.navigation.router.a aVar = new ru.ozon.android.messenger.framework.composer.navigation.router.a(C11, provideDeeplinkHandlers);
            ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.core.k kVar = new ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.core.k();
            ru.ozon.android.messenger.framework.data.remote.serialize.a aVar2 = new ru.ozon.android.messenger.framework.data.remote.serialize.a();
            D inputMapper = new D();
            Intrinsics.checkNotNullParameter(inputMapper, "inputMapper");
            q qVar = new q();
            C9351a E11 = cVar.E();
            ActionHandlersFactory actionHandlersFactory = this.f86667c.getActionHandlersFactory();
            ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core.a aVar3 = new ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core.a();
            ru.ozon.android.messenger.framework.analytics.i o11 = cVar.o();
            ru.ozon.android.messenger.framework.navigation.controller.a A11 = cVar.A();
            j.c(A11);
            d11.b(ru.ozon.android.messenger.framework.composer.widgets.di.e.a(this.f86665a, w11, aVar, kVar, aVar2, qVar, E11, actionHandlersFactory, aVar3, o11, A11));
            return d11.c();
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.component.b
        public final ru.ozon.android.messenger.framework.composer.navigation.config.c p() {
            k d11 = k.d(4);
            d11.a(new ru.ozon.android.messenger.framework.composer.navigation.config.providers.b());
            d11.a(new ru.ozon.android.messenger.framework.composer.navigation.config.providers.a());
            d11.a(new ru.ozon.android.messenger.framework.composer.navigation.config.providers.c());
            d11.a(new ru.ozon.android.messenger.framework.composer.navigation.config.providers.d());
            Set providers = d11.c();
            Intrinsics.checkNotNullParameter(providers, "providers");
            return new ru.ozon.android.messenger.framework.composer.navigation.config.c(providers);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements a.InterfaceC1540a {
        public final ru.ozon.android.messenger.framework.composer.di.a a(ru.ozon.android.messenger.framework.core.initialization.di.c cVar, ru.ozon.android.messenger.framework.composer.commonwidgets.di.a aVar) {
            return new a(new S1(), cVar, aVar);
        }
    }

    public static a.InterfaceC1540a a() {
        return new b();
    }
}
