package org.maplibre.android.style.sources;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import org.maplibre.android.utils.e;

/* loaded from: classes10.dex */
public abstract class Source {
    private static final String TAG = "Mbgl-Source";
    protected boolean detached;

    @Keep
    private long nativePtr;

    static {
        org.maplibre.android.a.a();
    }

    @Keep
    protected Source(long j11) {
        checkThread();
        this.nativePtr = j11;
    }

    protected void checkThread() {
        e.a(TAG);
    }

    @NonNull
    public String getAttribution() {
        checkThread();
        return nativeGetAttribution();
    }

    @NonNull
    public String getId() {
        checkThread();
        return nativeGetId();
    }

    public Integer getMaxOverscaleFactorForParentTiles() {
        return nativeGetMaxOverscaleFactorForParentTiles();
    }

    @NonNull
    public Long getMinimumTileUpdateInterval() {
        return nativeGetMinimumTileUpdateInterval();
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public Integer getPrefetchZoomDelta() {
        return nativeGetPrefetchZoomDelta();
    }

    @NonNull
    public Boolean isVolatile() {
        return nativeIsVolatile();
    }

    @NonNull
    @Keep
    protected native String nativeGetAttribution();

    @NonNull
    @Keep
    protected native String nativeGetId();

    @NonNull
    @Keep
    protected native Integer nativeGetMaxOverscaleFactorForParentTiles();

    @NonNull
    @Keep
    protected native Long nativeGetMinimumTileUpdateInterval();

    @NonNull
    @Keep
    protected native Integer nativeGetPrefetchZoomDelta();

    @NonNull
    @Keep
    protected native Boolean nativeIsVolatile();

    @Keep
    protected native void nativeSetMaxOverscaleFactorForParentTiles(Integer num);

    @Keep
    protected native void nativeSetMinimumTileUpdateInterval(@NonNull Long l11);

    @Keep
    protected native void nativeSetPrefetchZoomDelta(Integer num);

    @Keep
    protected native void nativeSetVolatile(@NonNull Boolean bool);

    public void setDetached() {
        this.detached = true;
    }

    public void setMaxOverscaleFactorForParentTiles(Integer num) {
        nativeSetMaxOverscaleFactorForParentTiles(num);
    }

    public void setMinimumTileUpdateInterval(Long l11) {
        nativeSetMinimumTileUpdateInterval(l11);
    }

    public void setPrefetchZoomDelta(Integer num) {
        nativeSetPrefetchZoomDelta(num);
    }

    public void setVolatile(Boolean bool) {
        nativeSetVolatile(bool);
    }

    public Source() {
        checkThread();
    }
}
