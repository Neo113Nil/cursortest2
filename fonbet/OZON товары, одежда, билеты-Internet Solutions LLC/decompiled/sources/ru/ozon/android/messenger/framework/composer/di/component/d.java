package ru.ozon.android.messenger.framework.composer.di.component;

import Jb.j;
import WZ.l;
import ei0.InterfaceC6369b;
import java.util.Set;
import m20.InterfaceC8046a;
import n20.C8425e;
import ru.ozon.android.messenger.framework.composer.analytics.di.module.f;
import ru.ozon.android.messenger.framework.composer.di.component.e;
import ru.ozon.android.messenger.framework.composer.screen.g;
import ru.ozon.android.messenger.framework.composer.screen.h;

/* loaded from: classes10.dex */
public final class d {

    private static final class a implements e.a {
        @Override // ru.ozon.android.messenger.framework.composer.di.component.e.a
        public final e a(Set set, ru.ozon.android.messenger.framework.composer.di.a aVar, ru.ozon.android.messenger.framework.core.initialization.di.c cVar, boolean z11) {
            set.getClass();
            cVar.getClass();
            return new b(aVar, cVar, set, Boolean.valueOf(z11));
        }
    }

    private static final class b implements e {

        /* renamed from: b, reason: collision with root package name */
        private Pc.a<K00.a> f86655b;

        /* renamed from: c, reason: collision with root package name */
        private Pc.a<C8425e<InterfaceC8046a<?, ? extends l20.c>>> f86656c;

        /* renamed from: f, reason: collision with root package name */
        private Pc.a<InterfaceC6369b> f86659f;

        /* renamed from: g, reason: collision with root package name */
        private Pc.a<RZ.a> f86660g;

        /* renamed from: h, reason: collision with root package name */
        private Pc.a<g> f86661h;

        /* renamed from: i, reason: collision with root package name */
        private Pc.a<l> f86662i;

        /* renamed from: a, reason: collision with root package name */
        private Pc.a<Sg.a> f86654a = Jb.d.b(f.a());

        /* renamed from: d, reason: collision with root package name */
        private Pc.a<Sg.a> f86657d = Jb.d.b(ru.ozon.android.messenger.framework.composer.analytics.di.module.e.a());

        /* renamed from: e, reason: collision with root package name */
        private Pc.a<VZ.a> f86658e = Jb.d.b(ru.ozon.android.messenger.framework.composer.analytics.di.module.d.a());

        private static final class a implements Pc.a<K00.a> {

            /* renamed from: a, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.composer.di.a f86663a;

            a(ru.ozon.android.messenger.framework.composer.di.a aVar) {
                this.f86663a = aVar;
            }

            @Override // Pc.a
            public final K00.a get() {
                K00.a composerNetwork = this.f86663a.getComposerNetwork();
                j.c(composerNetwork);
                return composerNetwork;
            }
        }

        /* renamed from: ru.ozon.android.messenger.framework.composer.di.component.d$b$b, reason: collision with other inner class name */
        private static final class C1544b implements Pc.a<InterfaceC6369b> {

            /* renamed from: a, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.core.initialization.di.c f86664a;

            C1544b(ru.ozon.android.messenger.framework.core.initialization.di.c cVar) {
                this.f86664a = cVar;
            }

            @Override // Pc.a
            public final InterfaceC6369b get() {
                return this.f86664a.s();
            }
        }

        b(ru.ozon.android.messenger.framework.composer.di.a aVar, ru.ozon.android.messenger.framework.core.initialization.di.c cVar, Set set, Boolean bool) {
            this.f86655b = new a(aVar);
            this.f86656c = Jb.d.b(new ru.ozon.android.messenger.framework.composer.widgets.b(Jb.f.a(set)));
            this.f86659f = new C1544b(cVar);
            this.f86660g = Jb.d.b(new ru.ozon.android.messenger.framework.composer.analytics.di.module.c(Jb.f.a(bool), this.f86654a, this.f86657d, this.f86658e, this.f86659f));
            this.f86661h = Jb.d.b(new h(this.f86655b, this.f86656c, ru.ozon.android.messenger.framework.composer.issue.b.a(), this.f86660g));
            this.f86662i = Jb.d.b(new Bi0.b(this.f86660g, 1));
        }

        @Override // ru.ozon.android.messenger.framework.composer.analytics.di.a
        public final Sg.a getAnalyticsScreenStorage() {
            return this.f86654a.get();
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.component.e
        public final g getComposerScreenFactory() {
            return this.f86661h.get();
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.component.e
        public final l getTokenizedAnalytics() {
            return this.f86662i.get();
        }
    }

    public static e.a a() {
        return new a();
    }
}
