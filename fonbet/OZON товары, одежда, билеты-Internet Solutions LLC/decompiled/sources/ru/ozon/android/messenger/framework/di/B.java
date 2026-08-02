package ru.ozon.android.messenger.framework.di;

import Hj0.C3154k;
import Jb.h;
import android.content.Context;
import ei0.InterfaceC6369b;
import gi.C6740b;
import java.util.Set;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.di.D;

/* loaded from: classes6.dex */
public final class B {

    private static final class a implements D.a {
        @Override // ru.ozon.android.messenger.framework.di.D.a
        public final D a(Context context, d.f fVar, We.E e11, ru.ozon.android.messenger.framework.core.initialization.d dVar, ru.ozon.android.messenger.framework.core.c cVar, ru.ozon.android.messenger.framework.logger.b bVar, d.e eVar, Set<ru.ozon.android.messenger.framework.core.a> set, d.g gVar, d.InterfaceC1560d interfaceC1560d, ru.ozon.android.messenger.framework.analytics.i iVar, ru.ozon.android.messenger.framework.navigation.action.f fVar2, d.b bVar2, ru.ozon.android.messenger.framework.core.initialization.a aVar, InterfaceC6369b interfaceC6369b) {
            context.getClass();
            fVar.getClass();
            e11.getClass();
            dVar.getClass();
            cVar.getClass();
            eVar.getClass();
            set.getClass();
            gVar.getClass();
            fVar2.getClass();
            bVar2.getClass();
            aVar.getClass();
            return new b(context, fVar, e11, dVar, cVar, bVar, eVar, set, gVar, interfaceC1560d, iVar, fVar2, bVar2, aVar, interfaceC6369b);
        }
    }

    private static final class b implements D {

        /* renamed from: a, reason: collision with root package name */
        private Jb.f f88681a;

        /* renamed from: b, reason: collision with root package name */
        private Jb.f f88682b;

        /* renamed from: c, reason: collision with root package name */
        private Jb.f f88683c;

        /* renamed from: d, reason: collision with root package name */
        private Jb.f f88684d;

        /* renamed from: e, reason: collision with root package name */
        private Jb.f f88685e;

        /* renamed from: f, reason: collision with root package name */
        private Jb.f f88686f;

        /* renamed from: g, reason: collision with root package name */
        private Jb.f f88687g;

        /* renamed from: h, reason: collision with root package name */
        private Jb.f f88688h;

        /* renamed from: i, reason: collision with root package name */
        private Jb.f f88689i;

        /* renamed from: j, reason: collision with root package name */
        private Jb.f f88690j;

        /* renamed from: k, reason: collision with root package name */
        private Jb.f f88691k;

        /* renamed from: l, reason: collision with root package name */
        private Jb.f f88692l;

        /* renamed from: m, reason: collision with root package name */
        private Jb.f f88693m;

        /* renamed from: n, reason: collision with root package name */
        private Jb.f f88694n;

        /* renamed from: o, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.core.initialization.di.e f88695o;

        /* renamed from: p, reason: collision with root package name */
        private Pc.a<C6740b> f88696p;

        b(Context context, d.f fVar, We.E e11, ru.ozon.android.messenger.framework.core.initialization.d dVar, ru.ozon.android.messenger.framework.core.c cVar, ru.ozon.android.messenger.framework.logger.b bVar, d.e eVar, Set set, d.g gVar, d.InterfaceC1560d interfaceC1560d, ru.ozon.android.messenger.framework.analytics.i iVar, ru.ozon.android.messenger.framework.navigation.action.f fVar2, d.b bVar2, ru.ozon.android.messenger.framework.core.initialization.a aVar, InterfaceC6369b interfaceC6369b) {
            this.f88681a = Jb.f.a(context);
            this.f88682b = Jb.f.a(fVar);
            this.f88683c = Jb.f.a(e11);
            this.f88684d = Jb.f.a(dVar);
            this.f88685e = Jb.f.a(cVar);
            this.f88686f = Jb.f.b(bVar);
            this.f88687g = Jb.f.a(eVar);
            this.f88688h = Jb.f.a(set);
            this.f88689i = Jb.f.a(gVar);
            this.f88690j = Jb.f.b(interfaceC1560d);
            this.f88691k = Jb.f.b(iVar);
            this.f88692l = Jb.f.a(fVar2);
            this.f88693m = Jb.f.a(bVar2);
            this.f88694n = Jb.f.a(aVar);
            this.f88695o = new ru.ozon.android.messenger.framework.core.initialization.di.e(this.f88681a, this.f88682b, this.f88683c, this.f88684d, this.f88685e, this.f88686f, this.f88687g, this.f88688h, this.f88689i, this.f88690j, this.f88691k, this.f88692l, this.f88693m, this.f88694n, Jb.f.b(interfaceC6369b));
            h.a b11 = Jb.h.b(4);
            b11.b(ru.ozon.android.messenger.framework.core.initialization.di.c.class, this.f88695o);
            b11.b(ru.ozon.android.messenger.framework.composer.di.a.class, ru.ozon.android.messenger.framework.composer.di.c.a());
            b11.b(ru.ozon.android.messenger.framework.composer.widgets.di.g.class, ru.ozon.android.messenger.framework.composer.widgets.di.i.a());
            b11.b(ru.ozon.android.messenger.framework.composer.commonwidgets.di.a.class, ru.ozon.android.messenger.framework.composer.commonwidgets.di.d.a());
            this.f88696p = Jb.d.b(new C3154k(b11.a(), 3));
        }

        @Override // ru.ozon.android.messenger.framework.di.D
        public final C6740b getComponentStorage() {
            return this.f88696p.get();
        }
    }

    public static D.a a() {
        return new a();
    }
}
