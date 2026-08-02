package eg;

import I0.C3173b;
import java.util.concurrent.atomic.AtomicLong;
import org.maplibre.android.style.layers.LineLayer;
import org.maplibre.android.style.sources.GeoJsonSource;

/* loaded from: classes10.dex */
final class k implements d<LineLayer> {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicLong f62283c = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f62284a;

    /* renamed from: b, reason: collision with root package name */
    private final String f62285b;

    k() {
        long incrementAndGet = f62283c.incrementAndGet();
        this.f62284a = C3173b.b(incrementAndGet, "mapbox-android-line-layer-");
        this.f62285b = C3173b.b(incrementAndGet, "mapbox-android-line-source-");
    }

    @Override // eg.d
    public final String a() {
        return this.f62284a;
    }

    @Override // eg.d
    public final LineLayer b() {
        return new LineLayer(this.f62284a, this.f62285b);
    }

    @Override // eg.d
    public final GeoJsonSource e() {
        return new GeoJsonSource(this.f62285b, null);
    }
}
