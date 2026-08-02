package s10;

import kotlin.jvm.internal.Intrinsics;
import n20.k;

/* loaded from: classes7.dex */
public final class g implements Jb.e<ru.ozon.composer.ui.widget.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f98137a;

    public g(d dVar, Jb.f fVar) {
        this.f98137a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        k widgetStore = (k) this.f98137a.get();
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        return new ru.ozon.composer.ui.widget.a(widgetStore);
    }
}
