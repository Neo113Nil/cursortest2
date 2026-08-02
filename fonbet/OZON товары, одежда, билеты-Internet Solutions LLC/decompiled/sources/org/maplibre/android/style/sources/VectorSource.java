package org.maplibre.android.style.sources;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.maplibre.geojson.Feature;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006H\u0083 ¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0085 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0085 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0085 ¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lorg/maplibre/android/style/sources/VectorSource;", "Lorg/maplibre/android/style/sources/Source;", "", "nativePtr", "<init>", "(J)V", "", "", "sourceLayerId", "", "filter", "Lorg/maplibre/geojson/Feature;", "querySourceFeatures", "([Ljava/lang/String;[Ljava/lang/Object;)[Lorg/maplibre/geojson/Feature;", "layerId", "payload", "", "initialize", "(Ljava/lang/String;Ljava/lang/Object;)V", "finalize", "()V", "nativeGetUrl", "()Ljava/lang/String;", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VectorSource extends Source {
    @Keep
    public VectorSource(long j11) {
        super(j11);
    }

    @Keep
    private final native Feature[] querySourceFeatures(String[] sourceLayerId, Object[] filter);

    @Keep
    protected final native void finalize() throws Throwable;

    @Keep
    protected final native void initialize(String layerId, Object payload);

    @Keep
    protected final native String nativeGetUrl();
}
