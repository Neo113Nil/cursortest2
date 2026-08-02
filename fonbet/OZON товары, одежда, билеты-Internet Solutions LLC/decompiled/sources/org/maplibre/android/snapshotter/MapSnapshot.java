package org.maplibre.android.snapshotter;

import android.graphics.Bitmap;
import android.graphics.PointF;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.geometry.LatLng;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0087 J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0087 J\t\u0010\u001e\u001a\u00020\u001fH\u0083 J\t\u0010 \u001a\u00020\u001fH\u0085 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006!"}, d2 = {"Lorg/maplibre/android/snapshotter/MapSnapshot;", "", "nativePtr", "", "bitmap", "Landroid/graphics/Bitmap;", "attributions", "", "", "showLogo", "", "showAttribution", "<init>", "(JLandroid/graphics/Bitmap;[Ljava/lang/String;ZZ)V", "getNativePtr", "()J", "getBitmap", "()Landroid/graphics/Bitmap;", "getAttributions", "()[Ljava/lang/String;", "[Ljava/lang/String;", "isShowLogo", "()Z", "isShowAttribution", "pixelForLatLng", "Landroid/graphics/PointF;", "latLng", "Lorg/maplibre/android/geometry/LatLng;", "latLngForPixel", "pointF", "initialize", "", "finalize", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MapSnapshot {

    @NotNull
    private final String[] attributions;

    @NotNull
    private final Bitmap bitmap;
    private final boolean isShowAttribution;
    private final boolean isShowLogo;
    private final long nativePtr;

    private MapSnapshot(long j11, Bitmap bitmap, String[] strArr, boolean z11, boolean z12) {
        this.nativePtr = j11;
        this.bitmap = bitmap;
        this.attributions = strArr;
        this.isShowLogo = z11;
        this.isShowAttribution = z12;
    }

    @Keep
    private final native void initialize();

    @Keep
    protected final native void finalize();

    @NotNull
    public final String[] getAttributions() {
        return this.attributions;
    }

    @NotNull
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final long getNativePtr() {
        return this.nativePtr;
    }

    /* renamed from: isShowAttribution, reason: from getter */
    public final boolean getIsShowAttribution() {
        return this.isShowAttribution;
    }

    /* renamed from: isShowLogo, reason: from getter */
    public final boolean getIsShowLogo() {
        return this.isShowLogo;
    }

    @Keep
    @NotNull
    public final native LatLng latLngForPixel(PointF pointF);

    @Keep
    @NotNull
    public final native PointF pixelForLatLng(LatLng latLng);
}
