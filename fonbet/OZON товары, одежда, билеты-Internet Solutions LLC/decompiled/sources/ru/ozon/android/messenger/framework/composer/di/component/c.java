package ru.ozon.android.messenger.framework.composer.di.component;

import Jb.f;
import Jb.j;
import QZ.g;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n20.i;
import ru.ozon.android.messenger.framework.composer.di.component.a;

/* loaded from: classes10.dex */
public final class c {

    private static final class a implements ru.ozon.android.messenger.framework.composer.di.component.a {

        /* renamed from: a, reason: collision with root package name */
        private final ru.ozon.android.messenger.framework.composer.di.component.b f86640a;

        /* renamed from: b, reason: collision with root package name */
        private f f86641b;

        /* renamed from: c, reason: collision with root package name */
        private Pc.a<Map<Class<?>, Pc.a<ru.ozon.android.messenger.framework.composer.configuration.f>>> f86642c;

        /* renamed from: d, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.composer.configuration.a> f86643d;

        /* renamed from: e, reason: collision with root package name */
        private Pc.a<List<ru.ozon.android.messenger.framework.composer.configuration.f>> f86644e;

        /* renamed from: f, reason: collision with root package name */
        private Pc.a<Map<Class<?>, Pc.a<E00.a>>> f86645f;

        /* renamed from: g, reason: collision with root package name */
        private Pc.a<E00.a> f86646g;

        /* renamed from: h, reason: collision with root package name */
        private Pc.a<Map<Class<?>, Pc.a<C00.a>>> f86647h;

        /* renamed from: i, reason: collision with root package name */
        private Pc.a<C00.a> f86648i;

        /* renamed from: j, reason: collision with root package name */
        private Pc.a<Set<g>> f86649j;

        /* renamed from: ru.ozon.android.messenger.framework.composer.di.component.c$a$a, reason: collision with other inner class name */
        private static final class C1542a implements Pc.a<ru.ozon.android.messenger.framework.composer.configuration.a> {

            /* renamed from: a, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.composer.di.component.b f86650a;

            C1542a(ru.ozon.android.messenger.framework.composer.di.component.b bVar) {
                this.f86650a = bVar;
            }

            @Override // Pc.a
            public final ru.ozon.android.messenger.framework.composer.configuration.a get() {
                ru.ozon.android.messenger.framework.composer.configuration.a composerConfiguratorStorage = this.f86650a.getComposerConfiguratorStorage();
                j.c(composerConfiguratorStorage);
                return composerConfiguratorStorage;
            }
        }

        private static final class b implements Pc.a<Map<Class<?>, Pc.a<ru.ozon.android.messenger.framework.composer.configuration.f>>> {

            /* renamed from: a, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.composer.di.component.b f86651a;

            b(ru.ozon.android.messenger.framework.composer.di.component.b bVar) {
                this.f86651a = bVar;
            }

            @Override // Pc.a
            public final Map<Class<?>, Pc.a<ru.ozon.android.messenger.framework.composer.configuration.f>> get() {
                Map<Class<?>, Pc.a<ru.ozon.android.messenger.framework.composer.configuration.f>> configuratorProviders = this.f86651a.getConfiguratorProviders();
                j.c(configuratorProviders);
                return configuratorProviders;
            }
        }

        /* renamed from: ru.ozon.android.messenger.framework.composer.di.component.c$a$c, reason: collision with other inner class name */
        private static final class C1543c implements Pc.a<Map<Class<?>, Pc.a<E00.a>>> {

            /* renamed from: a, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.composer.di.component.b f86652a;

            C1543c(ru.ozon.android.messenger.framework.composer.di.component.b bVar) {
                this.f86652a = bVar;
            }

            @Override // Pc.a
            public final Map<Class<?>, Pc.a<E00.a>> get() {
                Map<Class<?>, Pc.a<E00.a>> emptyStateInterceptors = this.f86652a.getEmptyStateInterceptors();
                j.c(emptyStateInterceptors);
                return emptyStateInterceptors;
            }
        }

        private static final class d implements Pc.a<Map<Class<?>, Pc.a<C00.a>>> {

            /* renamed from: a, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.composer.di.component.b f86653a;

            d(ru.ozon.android.messenger.framework.composer.di.component.b bVar) {
                this.f86653a = bVar;
            }

            @Override // Pc.a
            public final Map<Class<?>, Pc.a<C00.a>> get() {
                Map<Class<?>, Pc.a<C00.a>> initialWidgetsProviders = this.f86653a.getInitialWidgetsProviders();
                j.c(initialWidgetsProviders);
                return initialWidgetsProviders;
            }
        }

        a(ru.ozon.android.messenger.framework.composer.di.module.a aVar, ru.ozon.android.messenger.framework.composer.di.component.b bVar, ru.ozon.android.messenger.framework.composer.screen.e eVar) {
            this.f86640a = bVar;
            f a11 = f.a(eVar);
            this.f86641b = a11;
            b bVar2 = new b(bVar);
            this.f86642c = bVar2;
            C1542a c1542a = new C1542a(bVar);
            this.f86643d = c1542a;
            this.f86644e = Jb.d.b(new q50.b(aVar, a11, bVar2, c1542a));
            C1543c c1543c = new C1543c(bVar);
            this.f86645f = c1543c;
            this.f86646g = Jb.d.b(new ru.ozon.android.messenger.framework.composer.di.module.c(aVar, this.f86641b, c1543c));
            d dVar = new d(bVar);
            this.f86647h = dVar;
            this.f86648i = Jb.d.b(new c70.f(aVar, this.f86641b, dVar));
            this.f86649j = Jb.d.b(new ru.ozon.android.messenger.framework.composer.di.module.b(aVar, this.f86641b, this.f86643d));
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.component.a
        public final void a(ru.ozon.android.messenger.framework.composer.screen.b bVar) {
            ru.ozon.android.messenger.framework.composer.di.component.b bVar2 = this.f86640a;
            Set<i> widgets = bVar2.getWidgets();
            j.c(widgets);
            bVar.f86747a = widgets;
            bVar.f86748b = this.f86644e.get();
            bVar.f86749c = this.f86646g.get();
            bVar.f86750d = this.f86648i.get();
            bVar.f86751e = this.f86649j.get();
            ru.ozon.android.messenger.framework.navigation.d K11 = bVar2.K();
            j.c(K11);
            bVar.f86752f = K11;
        }
    }

    private static final class b implements a.InterfaceC1541a {
        @Override // ru.ozon.android.messenger.framework.composer.di.component.a.InterfaceC1541a
        public final ru.ozon.android.messenger.framework.composer.di.component.a a(ru.ozon.android.messenger.framework.composer.screen.e eVar, ru.ozon.android.messenger.framework.composer.di.component.b bVar) {
            return new a(new ru.ozon.android.messenger.framework.composer.di.module.a(), bVar, eVar);
        }
    }

    public static a.InterfaceC1541a a() {
        return new b();
    }
}
