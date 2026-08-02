package eg;

import I0.C3173b;
import java.util.concurrent.atomic.AtomicLong;
import org.maplibre.android.style.layers.SymbolLayer;
import org.maplibre.android.style.sources.GeoJsonSource;

/* loaded from: classes10.dex */
final class t implements d<SymbolLayer> {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicLong f62290c = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f62291a;

    /* renamed from: b, reason: collision with root package name */
    private final String f62292b;

    t() {
        long incrementAndGet = f62290c.incrementAndGet();
        this.f62291a = C3173b.b(incrementAndGet, "mapbox-android-symbol-layer-");
        this.f62292b = C3173b.b(incrementAndGet, "mapbox-android-symbol-source-");
    }

    @Override // eg.d
    public final String a() {
        return this.f62291a;
    }

    @Override // eg.d
    public final SymbolLayer b() {
        return new SymbolLayer(this.f62291a, this.f62292b);
    }

    @Override // eg.d
    public final GeoJsonSource e() {
        return new GeoJsonSource(this.f62292b, null);
    }
}
