package org.maplibre.android.maps;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.content.a;
import androidx.core.widget.g;
import java.io.ByteArrayOutputStream;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.maps.widgets.CompassView;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public final class UiSettings {

    /* renamed from: D, reason: collision with root package name */
    private double f79852D;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FocalPointChangeListener f79853a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final MapView f79854b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final Projection f79855c;

    /* renamed from: d, reason: collision with root package name */
    CompassView f79856d;

    /* renamed from: f, reason: collision with root package name */
    ImageView f79858f;

    /* renamed from: h, reason: collision with root package name */
    ImageView f79860h;

    /* renamed from: j, reason: collision with root package name */
    private final float f79862j;

    /* renamed from: z, reason: collision with root package name */
    private PointF f79878z;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f79857e = new int[4];

    /* renamed from: g, reason: collision with root package name */
    private final int[] f79859g = new int[4];

    /* renamed from: i, reason: collision with root package name */
    private final int[] f79861i = new int[4];

    /* renamed from: k, reason: collision with root package name */
    private boolean f79863k = true;

    /* renamed from: l, reason: collision with root package name */
    private boolean f79864l = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f79865m = true;

    /* renamed from: n, reason: collision with root package name */
    private boolean f79866n = true;

    /* renamed from: o, reason: collision with root package name */
    private boolean f79867o = true;

    /* renamed from: p, reason: collision with root package name */
    private boolean f79868p = true;

    /* renamed from: q, reason: collision with root package name */
    private boolean f79869q = true;

    /* renamed from: r, reason: collision with root package name */
    private boolean f79870r = true;

    /* renamed from: s, reason: collision with root package name */
    private boolean f79871s = true;

    /* renamed from: t, reason: collision with root package name */
    private boolean f79872t = true;

    /* renamed from: u, reason: collision with root package name */
    private boolean f79873u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f79874v = true;

    /* renamed from: w, reason: collision with root package name */
    private boolean f79875w = true;

    /* renamed from: x, reason: collision with root package name */
    private float f79876x = 1.0f;

    /* renamed from: y, reason: collision with root package name */
    private boolean f79877y = true;

    /* renamed from: A, reason: collision with root package name */
    boolean f79849A = false;

    /* renamed from: B, reason: collision with root package name */
    boolean f79850B = false;

    /* renamed from: C, reason: collision with root package name */
    boolean f79851C = false;

    UiSettings(@NonNull Projection projection, @NonNull FocalPointChangeListener focalPointChangeListener, float f7, MapView mapView) {
        this.f79855c = projection;
        this.f79853a = focalPointChangeListener;
        this.f79862j = f7;
        this.f79854b = mapView;
    }

    private static void F(@NonNull View view, int i11, int i12, int i13, int i14, int[] iArr) {
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = i13;
        iArr[3] = i14;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(i11, i12, i13, i14);
        layoutParams.setMarginStart(i11);
        layoutParams.setMarginEnd(i13);
        view.setLayoutParams(layoutParams);
    }

    private void g(@NonNull Context context, MapLibreMapOptions mapLibreMapOptions) {
        int color;
        this.f79850B = true;
        this.f79858f = this.f79854b.initialiseAttributionView();
        y(mapLibreMapOptions.j());
        int k11 = mapLibreMapOptions.k();
        ImageView imageView = this.f79858f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.gravity = k11;
            imageView.setLayoutParams(layoutParams);
        }
        int[] l11 = mapLibreMapOptions.l();
        int[] iArr = this.f79859g;
        if (l11 != null) {
            int i11 = l11[0];
            int i12 = l11[1];
            int i13 = l11[2];
            int i14 = l11[3];
            ImageView imageView2 = this.f79858f;
            if (imageView2 != null) {
                F(imageView2, i11, i12, i13, i14, iArr);
            }
        } else {
            Resources resources = context.getResources();
            int dimension = (int) resources.getDimension(R.dimen.maplibre_four_dp);
            int dimension2 = (int) resources.getDimension(R.dimen.maplibre_ninety_two_dp);
            ImageView imageView3 = this.f79858f;
            if (imageView3 != null) {
                F(imageView3, dimension2, dimension, dimension, dimension, iArr);
            }
        }
        int n11 = mapLibreMapOptions.n();
        if (n11 == -1) {
            try {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(context.getResources().getIdentifier("colorPrimary", "attrs", context.getPackageName()), typedValue, true);
                color = typedValue.data;
            } catch (Exception unused) {
                color = context.getResources().getColor(R.color.maplibre_blue, context.getTheme());
            }
            n11 = color;
        }
        if (this.f79858f == null) {
            return;
        }
        if (Color.alpha(n11) != 0) {
            g.a(this.f79858f, new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{n11, n11}));
            return;
        }
        ImageView imageView4 = this.f79858f;
        int color2 = a.getColor(imageView4.getContext(), R.color.maplibre_blue);
        g.a(imageView4, new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{color2, color2}));
    }

    private void h(MapLibreMapOptions mapLibreMapOptions, @NonNull Resources resources) {
        this.f79849A = true;
        this.f79856d = this.f79854b.initialiseCompassView();
        z(mapLibreMapOptions.p());
        int r11 = mapLibreMapOptions.r();
        CompassView compassView = this.f79856d;
        if (compassView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) compassView.getLayoutParams();
            layoutParams.gravity = r11;
            compassView.setLayoutParams(layoutParams);
        }
        int[] u11 = mapLibreMapOptions.u();
        int[] iArr = this.f79857e;
        if (u11 != null) {
            int i11 = u11[0];
            int i12 = u11[1];
            int i13 = u11[2];
            int i14 = u11[3];
            CompassView compassView2 = this.f79856d;
            if (compassView2 != null) {
                F(compassView2, i11, i12, i13, i14, iArr);
            }
        } else {
            int dimension = (int) resources.getDimension(R.dimen.maplibre_four_dp);
            CompassView compassView3 = this.f79856d;
            if (compassView3 != null) {
                F(compassView3, dimension, dimension, dimension, dimension, iArr);
            }
        }
        boolean q11 = mapLibreMapOptions.q();
        CompassView compassView4 = this.f79856d;
        if (compassView4 != null) {
            compassView4.a(q11);
        }
        if (mapLibreMapOptions.t() == null) {
            mapLibreMapOptions.b(androidx.core.content.res.g.d(resources, 2131235757, null));
        }
        Drawable t2 = mapLibreMapOptions.t();
        CompassView compassView5 = this.f79856d;
        if (compassView5 != null) {
            compassView5.setImageDrawable(t2);
        }
    }

    private void i(MapLibreMapOptions mapLibreMapOptions, @NonNull Resources resources) {
        this.f79851C = true;
        this.f79860h = this.f79854b.initialiseLogoView();
        B(mapLibreMapOptions.D());
        int E11 = mapLibreMapOptions.E();
        ImageView imageView = this.f79860h;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.gravity = E11;
            imageView.setLayoutParams(layoutParams);
        }
        int[] F11 = mapLibreMapOptions.F();
        int[] iArr = this.f79861i;
        if (F11 == null) {
            int dimension = (int) resources.getDimension(R.dimen.maplibre_four_dp);
            ImageView imageView2 = this.f79860h;
            if (imageView2 != null) {
                F(imageView2, dimension, dimension, dimension, dimension, iArr);
                return;
            }
            return;
        }
        int i11 = F11[0];
        int i12 = F11[1];
        int i13 = F11[2];
        int i14 = F11[3];
        ImageView imageView3 = this.f79860h;
        if (imageView3 != null) {
            F(imageView3, i11, i12, i13, i14, iArr);
        }
    }

    public final void A(PointF pointF) {
        this.f79878z = pointF;
        this.f79853a.a(pointF);
    }

    public final void B(boolean z11) {
        if (z11 && !this.f79851C) {
            MapView mapView = this.f79854b;
            i(mapView.maplibreMapOptions, mapView.getContext().getResources());
        }
        ImageView imageView = this.f79860h;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
    }

    public final void C(boolean z11) {
        this.f79863k = z11;
    }

    public final void D(boolean z11) {
        this.f79866n = z11;
    }

    public final void E(boolean z11) {
        this.f79864l = z11;
    }

    public final void G(boolean z11) {
        this.f79865m = z11;
    }

    final void H(@NonNull CameraPosition cameraPosition) {
        double d11 = -cameraPosition.bearing;
        this.f79852D = d11;
        CompassView compassView = this.f79856d;
        if (compassView != null) {
            compassView.g(d11);
        }
    }

    public final PointF a() {
        return this.f79878z;
    }

    public final float b() {
        return this.f79855c.c();
    }

    final float c() {
        return this.f79862j;
    }

    public final float d() {
        return this.f79855c.f();
    }

    public final float e() {
        return this.f79876x;
    }

    final void f(@NonNull Context context, @NonNull MapLibreMapOptions mapLibreMapOptions) {
        Resources resources = context.getResources();
        this.f79865m = mapLibreMapOptions.c0();
        this.f79866n = mapLibreMapOptions.U();
        this.f79867o = mapLibreMapOptions.A();
        this.f79863k = mapLibreMapOptions.T();
        this.f79864l = mapLibreMapOptions.Y();
        this.f79868p = mapLibreMapOptions.y();
        this.f79869q = mapLibreMapOptions.P();
        if (mapLibreMapOptions.p()) {
            h(mapLibreMapOptions, resources);
        }
        if (mapLibreMapOptions.D()) {
            i(mapLibreMapOptions, resources);
        }
        if (mapLibreMapOptions.j()) {
            g(context, mapLibreMapOptions);
        }
    }

    public final boolean j() {
        return this.f79877y;
    }

    public final boolean k() {
        return this.f79874v;
    }

    public final boolean l() {
        return this.f79868p;
    }

    public final boolean m() {
        return this.f79872t;
    }

    public final boolean n() {
        return this.f79867o;
    }

    public final boolean o() {
        return this.f79875w;
    }

    public final boolean p() {
        return this.f79869q;
    }

    public final boolean q() {
        return this.f79863k;
    }

    public final boolean r() {
        return this.f79871s;
    }

    public final boolean s() {
        return this.f79870r;
    }

    public final boolean t() {
        return this.f79866n;
    }

    public final boolean u() {
        return this.f79864l;
    }

    public final boolean v() {
        return this.f79865m;
    }

    final void w(@NonNull Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        this.f79867o = bundle.getBoolean("maplibre_horizontalScrollEnabled");
        this.f79865m = bundle.getBoolean("maplibre_zoomEnabled");
        this.f79866n = bundle.getBoolean("maplibre_scrollEnabled");
        this.f79863k = bundle.getBoolean("maplibre_rotateEnabled");
        this.f79864l = bundle.getBoolean("maplibre_tiltEnabled");
        this.f79868p = bundle.getBoolean("maplibre_doubleTapEnabled");
        this.f79870r = bundle.getBoolean("maplibre_scaleAnimationEnabled");
        this.f79871s = bundle.getBoolean("maplibre_rotateAnimationEnabled");
        this.f79872t = bundle.getBoolean("maplibre_flingAnimationEnabled");
        this.f79873u = bundle.getBoolean("maplibre_increaseRotateThreshold");
        this.f79874v = bundle.getBoolean("maplibre_disableRotateWhenScaling");
        this.f79875w = bundle.getBoolean("maplibre_increaseScaleThreshold");
        this.f79869q = bundle.getBoolean("maplibre_quickZoom");
        this.f79876x = bundle.getFloat("maplibre_zoomRate", 1.0f);
        boolean z11 = bundle.getBoolean("maplibre_compassEnabled");
        MapView mapView = this.f79854b;
        if (z11 && !this.f79849A) {
            this.f79856d = mapView.initialiseCompassView();
            this.f79849A = true;
        }
        z(bundle.getBoolean("maplibre_compassEnabled"));
        int i11 = bundle.getInt("maplibre_compassGravity");
        CompassView compassView = this.f79856d;
        if (compassView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) compassView.getLayoutParams();
            layoutParams.gravity = i11;
            compassView.setLayoutParams(layoutParams);
        }
        int i12 = bundle.getInt("maplibre_compassMarginLeft");
        int i13 = bundle.getInt("maplibre_compassMarginTop");
        int i14 = bundle.getInt("maplibre_compassMarginRight");
        int i15 = bundle.getInt("maplibre_compassMarginBottom");
        CompassView compassView2 = this.f79856d;
        if (compassView2 != null) {
            F(compassView2, i12, i13, i14, i15, this.f79857e);
        }
        boolean z12 = bundle.getBoolean("maplibre_compassFade");
        CompassView compassView3 = this.f79856d;
        if (compassView3 != null) {
            compassView3.a(z12);
        }
        Context context = mapView.getContext();
        byte[] byteArray = bundle.getByteArray("maplibre_compassImage");
        if (byteArray == null) {
            bitmapDrawable = null;
        } else {
            bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
        }
        CompassView compassView4 = this.f79856d;
        if (compassView4 != null) {
            compassView4.setImageDrawable(bitmapDrawable);
        }
        if (bundle.getBoolean("maplibre_logoEnabled") && !this.f79851C) {
            this.f79860h = mapView.initialiseLogoView();
            this.f79851C = true;
        }
        B(bundle.getBoolean("maplibre_logoEnabled"));
        int i16 = bundle.getInt("maplibre_logoGravity");
        ImageView imageView = this.f79860h;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.gravity = i16;
            imageView.setLayoutParams(layoutParams2);
        }
        int i17 = bundle.getInt("maplibre_logoMarginLeft");
        int i18 = bundle.getInt("maplibre_logoMarginTop");
        int i19 = bundle.getInt("maplibre_logoMarginRight");
        int i21 = bundle.getInt("maplibre_logoMarginBottom");
        ImageView imageView2 = this.f79860h;
        if (imageView2 != null) {
            F(imageView2, i17, i18, i19, i21, this.f79861i);
        }
        if (bundle.getBoolean("maplibre_atrrEnabled") && !this.f79850B) {
            this.f79858f = mapView.initialiseAttributionView();
            this.f79850B = true;
        }
        y(bundle.getBoolean("maplibre_atrrEnabled"));
        int i22 = bundle.getInt("maplibre_attrGravity");
        ImageView imageView3 = this.f79858f;
        if (imageView3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) imageView3.getLayoutParams();
            layoutParams3.gravity = i22;
            imageView3.setLayoutParams(layoutParams3);
        }
        int i23 = bundle.getInt("maplibre_attrMarginLeft");
        int i24 = bundle.getInt("maplibre_attrMarginTop");
        int i25 = bundle.getInt("maplibre_attrMarginRight");
        int i26 = bundle.getInt("maplibre_atrrMarginBottom");
        ImageView imageView4 = this.f79858f;
        if (imageView4 != null) {
            F(imageView4, i23, i24, i25, i26, this.f79859g);
        }
        this.f79877y = bundle.getBoolean("maplibre_deselectMarkerOnTap");
        PointF pointF = (PointF) bundle.getParcelable("maplibre_userFocalPoint");
        if (pointF != null) {
            A(pointF);
        }
    }

    final void x(@NonNull Bundle bundle) {
        Bitmap a11;
        bundle.putBoolean("maplibre_horizontalScrollEnabled", this.f79867o);
        bundle.putBoolean("maplibre_zoomEnabled", this.f79865m);
        bundle.putBoolean("maplibre_scrollEnabled", this.f79866n);
        bundle.putBoolean("maplibre_rotateEnabled", this.f79863k);
        bundle.putBoolean("maplibre_tiltEnabled", this.f79864l);
        bundle.putBoolean("maplibre_doubleTapEnabled", this.f79868p);
        bundle.putBoolean("maplibre_scaleAnimationEnabled", this.f79870r);
        bundle.putBoolean("maplibre_rotateAnimationEnabled", this.f79871s);
        bundle.putBoolean("maplibre_flingAnimationEnabled", this.f79872t);
        bundle.putBoolean("maplibre_increaseRotateThreshold", this.f79873u);
        bundle.putBoolean("maplibre_disableRotateWhenScaling", this.f79874v);
        bundle.putBoolean("maplibre_increaseScaleThreshold", this.f79875w);
        bundle.putBoolean("maplibre_quickZoom", this.f79869q);
        bundle.putFloat("maplibre_zoomRate", this.f79876x);
        CompassView compassView = this.f79856d;
        boolean z11 = false;
        bundle.putBoolean("maplibre_compassEnabled", compassView != null ? compassView.isEnabled() : false);
        CompassView compassView2 = this.f79856d;
        bundle.putInt("maplibre_compassGravity", compassView2 != null ? ((FrameLayout.LayoutParams) compassView2.getLayoutParams()).gravity : -1);
        int[] iArr = this.f79857e;
        bundle.putInt("maplibre_compassMarginLeft", iArr[0]);
        bundle.putInt("maplibre_compassMarginTop", iArr[1]);
        bundle.putInt("maplibre_compassMarginBottom", iArr[3]);
        bundle.putInt("maplibre_compassMarginRight", iArr[2]);
        CompassView compassView3 = this.f79856d;
        bundle.putBoolean("maplibre_compassFade", compassView3 != null ? compassView3.d() : false);
        CompassView compassView4 = this.f79856d;
        byte[] bArr = null;
        Drawable drawable = compassView4 != null ? compassView4.getDrawable() : null;
        if (drawable != null && (a11 = org.maplibre.android.utils.a.a(drawable)) != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                a11.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            } finally {
                if (!(drawable instanceof BitmapDrawable)) {
                    a11.recycle();
                }
            }
        }
        bundle.putByteArray("maplibre_compassImage", bArr);
        ImageView imageView = this.f79860h;
        bundle.putInt("maplibre_logoGravity", imageView != null ? ((FrameLayout.LayoutParams) imageView.getLayoutParams()).gravity : -1);
        int[] iArr2 = this.f79861i;
        bundle.putInt("maplibre_logoMarginLeft", iArr2[0]);
        bundle.putInt("maplibre_logoMarginTop", iArr2[1]);
        bundle.putInt("maplibre_logoMarginRight", iArr2[2]);
        bundle.putInt("maplibre_logoMarginBottom", iArr2[3]);
        ImageView imageView2 = this.f79860h;
        bundle.putBoolean("maplibre_logoEnabled", imageView2 != null && imageView2.getVisibility() == 0);
        ImageView imageView3 = this.f79858f;
        bundle.putInt("maplibre_attrGravity", imageView3 != null ? ((FrameLayout.LayoutParams) imageView3.getLayoutParams()).gravity : -1);
        int[] iArr3 = this.f79859g;
        bundle.putInt("maplibre_attrMarginLeft", iArr3[0]);
        bundle.putInt("maplibre_attrMarginTop", iArr3[1]);
        bundle.putInt("maplibre_attrMarginRight", iArr3[2]);
        bundle.putInt("maplibre_atrrMarginBottom", iArr3[3]);
        ImageView imageView4 = this.f79858f;
        if (imageView4 != null && imageView4.getVisibility() == 0) {
            z11 = true;
        }
        bundle.putBoolean("maplibre_atrrEnabled", z11);
        bundle.putBoolean("maplibre_deselectMarkerOnTap", this.f79877y);
        bundle.putParcelable("maplibre_userFocalPoint", this.f79878z);
    }

    public final void y(boolean z11) {
        if (z11 && !this.f79850B) {
            MapView mapView = this.f79854b;
            g(mapView.getContext(), mapView.maplibreMapOptions);
        }
        ImageView imageView = this.f79858f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
    }

    public final void z(boolean z11) {
        if (z11 && !this.f79849A) {
            MapView mapView = this.f79854b;
            h(mapView.maplibreMapOptions, mapView.getContext().getResources());
        }
        CompassView compassView = this.f79856d;
        if (compassView != null) {
            compassView.setEnabled(z11);
            this.f79856d.g(this.f79852D);
        }
    }
}
