package eg;

import I0.C3173b;
import java.util.concurrent.atomic.AtomicLong;
import org.maplibre.android.style.layers.FillLayer;
import org.maplibre.android.style.sources.GeoJsonSource;

/* loaded from: classes10.dex */
final class g implements d<FillLayer> {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicLong f62277c = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f62278a;

    /* renamed from: b, reason: collision with root package name */
    private final String f62279b;

    g() {
        long incrementAndGet = f62277c.incrementAndGet();
        this.f62278a = C3173b.b(incrementAndGet, "mapbox-android-fill-layer-");
        this.f62279b = C3173b.b(incrementAndGet, "mapbox-android-fill-source-");
    }

    @Override // eg.d
    public final String a() {
        return this.f62278a;
    }

    @Override // eg.d
    public final FillLayer b() {
        return new FillLayer(this.f62278a, this.f62279b);
    }

    @Override // eg.d
    public final GeoJsonSource e() {
        return new GeoJsonSource(this.f62279b, null);
    }
}
