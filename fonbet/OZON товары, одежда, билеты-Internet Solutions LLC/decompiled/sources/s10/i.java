package s10;

import kotlin.jvm.internal.Intrinsics;
import n20.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.composer.ui.widget.o;

/* loaded from: classes7.dex */
public final class i implements Jb.e<K00.i<l>> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f98139a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<o> f98140b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f98141c;

    public i(d dVar, Jb.f fVar, Pc.a aVar, Jb.f fVar2) {
        this.f98139a = fVar;
        this.f98140b = aVar;
        this.f98141c = fVar2;
    }

    @Override // Pc.a
    public final Object get() {
        K00.a network = (K00.a) this.f98139a.get();
        o widgetViewItemProcessorFactory = this.f98140b.get();
        k widgetStore = (k) this.f98141c.get();
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(widgetViewItemProcessorFactory, "widgetViewItemProcessorFactory");
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        return K00.a.d(network, widgetStore, widgetViewItemProcessorFactory);
    }
}
