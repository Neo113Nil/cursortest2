package org.maplibre.android.maps;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.List;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.layers.RasterLayer;
import org.maplibre.android.style.layers.TransitionOptions;
import org.maplibre.android.style.sources.Source;

/* loaded from: classes10.dex */
interface NativeMap {
    void A(double d11, double d12, long j11);

    void B(@NonNull RasterLayer rasterLayer);

    double C();

    @NonNull
    long[] D(RectF rectF);

    void E(boolean z11);

    @NonNull
    List<Layer> F();

    void G(@NonNull Layer layer, @NonNull String str);

    void H();

    LatLng I(@NonNull PointF pointF);

    void J(String str);

    long K(Marker marker);

    void L(Image[] imageArr);

    void M(String str);

    @NonNull
    RectF N(RectF rectF);

    double O();

    void P(double d11);

    void Q(boolean z11);

    @NonNull
    long[] R(RectF rectF);

    void S(int i11, int i12);

    void T(double d11);

    boolean U();

    void V(double d11, @NonNull PointF pointF);

    void W(int i11);

    void a();

    void b(@NonNull LatLng latLng, double d11, double d12, double d13, double[] dArr, long j11);

    void c();

    @NonNull
    List<Source> d();

    void e(long j11);

    CameraPosition f(@NonNull LatLngBounds latLngBounds, int[] iArr, double d11, double d12);

    void g(int i11, int i12, float f7, byte[] bArr);

    double getBearing();

    @NonNull
    CameraPosition getCameraPosition();

    Bitmap getImage(String str);

    double getMaxZoom();

    double getMinZoom();

    void h(String str);

    void i(double d11);

    void j(double d11);

    void k(boolean z11);

    boolean l(@NonNull String str);

    void m(@NonNull TransitionOptions transitionOptions);

    @NonNull
    PointF n(@NonNull LatLng latLng);

    boolean o(@NonNull Layer layer);

    void onLowMemory();

    void p(double d11, double d12, double d13, long j11);

    double q(double d11);

    void r(@NonNull Layer layer, @NonNull String str);

    @NonNull
    List s(@NonNull PointF pointF, String[] strArr);

    void t(@NonNull Layer layer);

    void u(@NonNull Source source);

    void v(@NonNull LatLng latLng, double d11, double d12, double d13, double[] dArr);

    @NonNull
    String w();

    Layer x(String str);

    boolean y(@NonNull String str);

    void z(double d11);
}
