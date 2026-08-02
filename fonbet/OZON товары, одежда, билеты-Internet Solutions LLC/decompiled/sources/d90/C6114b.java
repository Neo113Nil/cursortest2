package d90;

import android.content.Context;
import android.content.SharedPreferences;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* renamed from: d90.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6114b implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61372a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f61373b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.e f61374c;

    public C6114b(Jb.f fVar, Pc.a aVar) {
        this.f61373b = aVar;
        this.f61374c = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f61372a) {
            case 0:
                return new C6113a((SharedPreferences) this.f61373b.get(), (ExternalNetworkSettings) ((Jb.f) this.f61374c).get());
            default:
                return new ru.ozon.android.messenger.framework.composer.emptyscreen.b((ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory.a) ((P30.f) this.f61374c).get(), (Context) this.f61373b.get());
        }
    }

    public C6114b(P30.f fVar, Pc.a aVar) {
        this.f61374c = fVar;
        this.f61373b = aVar;
    }
}
