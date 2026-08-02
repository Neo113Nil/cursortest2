package s10;

import QZ.a;
import kotlin.jvm.internal.Intrinsics;
import n20.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.composer.ui.widget.o;

/* loaded from: classes7.dex */
public final class e implements Jb.e<QZ.a<l>> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f98126a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f98127b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<K00.i<l>> f98128c;

    /* renamed from: d, reason: collision with root package name */
    private final Jb.f f98129d;

    /* renamed from: e, reason: collision with root package name */
    private final Jb.f f98130e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<o> f98131f;

    /* renamed from: g, reason: collision with root package name */
    private final H10.e f98132g;

    /* renamed from: h, reason: collision with root package name */
    private final K10.b f98133h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a<H10.a> f98134i;

    public e(d dVar, Jb.f fVar, Jb.f fVar2, Pc.a aVar, Jb.f fVar3, Jb.f fVar4, Pc.a aVar2, H10.e eVar, K10.b bVar, K10.d dVar2, Pc.a aVar3, I10.b bVar2, J10.c cVar) {
        this.f98126a = fVar;
        this.f98127b = fVar2;
        this.f98128c = aVar;
        this.f98129d = fVar3;
        this.f98130e = fVar4;
        this.f98131f = aVar2;
        this.f98132g = eVar;
        this.f98133h = bVar;
        this.f98134i = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        a.C0454a builder = (a.C0454a) this.f98126a.get();
        K00.a network = (K00.a) this.f98127b.get();
        K00.i<l> repository = this.f98128c.get();
        RZ.a analytics = (RZ.a) this.f98129d.get();
        k widgetStore = (k) this.f98130e.get();
        o widgetViewItemProcessorFactory = this.f98131f.get();
        H10.d recyclerAdditionalStateReducer = (H10.d) this.f98132g.get();
        K10.a composerTopSpacerReducer = (K10.a) this.f98133h.get();
        K10.c composerVisibleOffsetReducer = new K10.c();
        H10.a composerRootLocatorReducer = this.f98134i.get();
        I10.a appBarOverlapReducer = new I10.a();
        J10.b windowInsetsReducer = new J10.b();
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(widgetViewItemProcessorFactory, "widgetViewItemProcessorFactory");
        Intrinsics.checkNotNullParameter(recyclerAdditionalStateReducer, "recyclerAdditionalStateReducer");
        Intrinsics.checkNotNullParameter(composerTopSpacerReducer, "composerTopSpacerReducer");
        Intrinsics.checkNotNullParameter(composerVisibleOffsetReducer, "composerVisibleOffsetReducer");
        Intrinsics.checkNotNullParameter(composerRootLocatorReducer, "composerRootLocatorReducer");
        Intrinsics.checkNotNullParameter(appBarOverlapReducer, "appBarOverlapReducer");
        Intrinsics.checkNotNullParameter(windowInsetsReducer, "windowInsetsReducer");
        builder.i(network);
        builder.l(repository);
        builder.e(analytics);
        builder.o(widgetStore);
        builder.n(widgetViewItemProcessorFactory);
        builder.a(recyclerAdditionalStateReducer);
        builder.a(composerTopSpacerReducer);
        builder.a(composerVisibleOffsetReducer);
        builder.a(composerRootLocatorReducer);
        builder.a(appBarOverlapReducer);
        builder.a(windowInsetsReducer);
        return builder.f();
    }
}
