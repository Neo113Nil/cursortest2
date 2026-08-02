package org.maplibre.android.snapshotter;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.work.impl.background.systemalarm.d;
import d0.P;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.maps.Image;
import org.maplibre.android.storage.FileSource;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.sources.Source;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0087 ¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0087 ¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0087 ¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0087 ¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0087 ¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0087 ¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0016H\u0005¢\u0006\u0004\b!\u0010\u0019J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0016H\u0005¢\u0006\u0004\b\"\u0010\u0019J\u000f\u0010#\u001a\u00020\u0005H\u0005¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0016H\u0005¢\u0006\u0004\b&\u0010\u0019J\u009e\u0001\u00105\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u00002\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010\b2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010\u00162\u0006\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020*H\u0085 ¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0005H\u0085 ¢\u0006\u0004\b7\u0010$J\u0010\u00108\u001a\u00020\u0005H\u0085 ¢\u0006\u0004\b8\u0010$J\u0010\u00109\u001a\u00020\u0005H\u0095 ¢\u0006\u0004\b9\u0010$J \u0010=\u001a\u00020\u00052\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u0016H\u0083 ¢\u0006\u0004\b=\u0010>J \u0010@\u001a\u00020\u00052\u0006\u0010;\u001a\u00020:2\u0006\u0010?\u001a\u00020\u0016H\u0083 ¢\u0006\u0004\b@\u0010>J \u0010B\u001a\u00020\u00052\u0006\u0010;\u001a\u00020:2\u0006\u0010A\u001a\u00020\u0002H\u0083 ¢\u0006\u0004\bB\u0010CJ \u0010G\u001a\u00020\u00052\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020:H\u0083 ¢\u0006\u0004\bG\u0010HJ\u001e\u0010L\u001a\u00020\u00052\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0IH\u0083 ¢\u0006\u0004\bL\u0010MJ\u0018\u0010P\u001a\u00020O2\u0006\u0010N\u001a\u00020\u0016H\u0083 ¢\u0006\u0004\bP\u0010QJ\u0018\u0010S\u001a\u00020D2\u0006\u0010R\u001a\u00020\u0016H\u0083 ¢\u0006\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020:8\u0002X\u0083D¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006W"}, d2 = {"Lorg/maplibre/android/snapshotter/MapSnapshotter;", "", "", "width", "height", "", "setSize", "(II)V", "Lorg/maplibre/android/camera/CameraPosition;", "cameraPosition", "setCameraPosition", "(Lorg/maplibre/android/camera/CameraPosition;)V", "Lorg/maplibre/android/geometry/LatLngBounds;", "region", "setRegion", "(Lorg/maplibre/android/geometry/LatLngBounds;)V", "left", "top", "right", "bottom", "setPadding", "(IIII)V", "", "styleUrl", "setStyleUrl", "(Ljava/lang/String;)V", "styleJson", "setStyleJson", "Lorg/maplibre/android/snapshotter/MapSnapshot;", "snapshot", "onSnapshotReady", "(Lorg/maplibre/android/snapshotter/MapSnapshot;)V", "reason", "onSnapshotFailed", "onDidFailLoadingStyle", "onDidFinishLoadingStyle", "()V", "imageName", "onStyleImageMissing", "mapSnapshotter", "Lorg/maplibre/android/storage/FileSource;", "fileSource", "", "pixelRatio", "position", "", "showLogo", "showAttribution", "localIdeographFontFamily", "paddingLeft", "paddingTop", "paddingRight", "paddingBottom", "nativeInitialize", "(Lorg/maplibre/android/snapshotter/MapSnapshotter;Lorg/maplibre/android/storage/FileSource;FIILjava/lang/String;Ljava/lang/String;Lorg/maplibre/android/geometry/LatLngBounds;Lorg/maplibre/android/camera/CameraPosition;ZZLjava/lang/String;FFFF)V", "nativeStart", "nativeCancel", "finalize", "", "layerPtr", "below", "nativeAddLayerBelow", "(JLjava/lang/String;)V", "above", "nativeAddLayerAbove", "index", "nativeAddLayerAt", "(JI)V", "Lorg/maplibre/android/style/sources/Source;", "source", "sourcePtr", "nativeAddSource", "(Lorg/maplibre/android/style/sources/Source;J)V", "", "Lorg/maplibre/android/maps/Image;", "images", "nativeAddImages", "([Lorg/maplibre/android/maps/Image;)V", "layerId", "Lorg/maplibre/android/style/layers/Layer;", "nativeGetLayer", "(Ljava/lang/String;)Lorg/maplibre/android/style/layers/Layer;", "sourceId", "nativeGetSource", "(Ljava/lang/String;)Lorg/maplibre/android/style/sources/Source;", "nativePtr", "J", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public class MapSnapshotter {

    @Keep
    private final long nativePtr;

    @Keep
    private final native void nativeAddImages(Image[] images);

    @Keep
    private final native void nativeAddLayerAbove(long layerPtr, String above);

    @Keep
    private final native void nativeAddLayerAt(long layerPtr, int index);

    @Keep
    private final native void nativeAddLayerBelow(long layerPtr, String below);

    @Keep
    private final native void nativeAddSource(Source source, long sourcePtr);

    @Keep
    private final native Layer nativeGetLayer(String layerId);

    @Keep
    private final native Source nativeGetSource(String sourceId);

    @Keep
    protected native void finalize() throws Throwable;

    @Keep
    protected final native void nativeCancel();

    @Keep
    protected final native void nativeInitialize(MapSnapshotter mapSnapshotter, FileSource fileSource, float pixelRatio, int width, int height, String styleUrl, String styleJson, LatLngBounds region, CameraPosition position, boolean showLogo, boolean showAttribution, String localIdeographFontFamily, float paddingLeft, float paddingTop, float paddingRight, float paddingBottom);

    @Keep
    protected final native void nativeStart();

    @Keep
    protected final void onDidFailLoadingStyle(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        onSnapshotFailed(reason);
    }

    @Keep
    protected final void onDidFinishLoadingStyle() {
    }

    @Keep
    protected final void onSnapshotFailed(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        new Handler(Looper.getMainLooper()).post(new d(this, reason));
    }

    @Keep
    protected final void onSnapshotReady(@NotNull MapSnapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        new Handler(Looper.getMainLooper()).post(new P(2, this, snapshot));
    }

    @Keep
    protected final void onStyleImageMissing(@NotNull String imageName) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
    }

    @Keep
    public final native void setCameraPosition(CameraPosition cameraPosition);

    @Keep
    public final native void setPadding(int left, int top, int right, int bottom);

    @Keep
    public final native void setRegion(LatLngBounds region);

    @Keep
    public final native void setSize(int width, int height);

    @Keep
    public final native void setStyleJson(String styleJson);

    @Keep
    public final native void setStyleUrl(String styleUrl);
}
