package org.maplibre.android.style.sources;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0085 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0085 ¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lorg/maplibre/android/style/sources/RasterDemSource;", "Lorg/maplibre/android/style/sources/Source;", "", "nativePtr", "<init>", "(J)V", "", "nativeGetUrl", "()Ljava/lang/String;", "layerId", "", "payload", "", "tileSize", "", "initialize", "(Ljava/lang/String;Ljava/lang/Object;I)V", "finalize", "()V", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RasterDemSource extends Source {
    @Keep
    public RasterDemSource(long j11) {
        super(j11);
    }

    @Keep
    private final native String nativeGetUrl();

    @Keep
    protected final native void finalize() throws Throwable;

    @Keep
    protected final native void initialize(String layerId, Object payload, int tileSize);
}
