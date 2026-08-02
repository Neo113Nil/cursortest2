package org.maplibre.android.annotations;

import android.content.res.Resources;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapView;
import ru.ozon.app.android.R;

@Deprecated
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Marker> f79596a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<MapLibreMap> f79597b;

    /* renamed from: c, reason: collision with root package name */
    protected WeakReference<View> f79598c;

    /* renamed from: d, reason: collision with root package name */
    private float f79599d;

    /* renamed from: e, reason: collision with root package name */
    private float f79600e;

    /* renamed from: f, reason: collision with root package name */
    private float f79601f;

    /* renamed from: g, reason: collision with root package name */
    private PointF f79602g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f79603h;

    /* renamed from: i, reason: collision with root package name */
    private int f79604i = R.layout.maplibre_infowindow_content;

    final class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c cVar = c.this;
            MapLibreMap mapLibreMap = (MapLibreMap) cVar.f79597b.get();
            if (mapLibreMap != null) {
                mapLibreMap.q();
                c.b(cVar);
            }
        }
    }

    final class b implements View.OnLongClickListener {
        b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            MapLibreMap mapLibreMap = (MapLibreMap) c.this.f79597b.get();
            if (mapLibreMap == null) {
                return true;
            }
            mapLibreMap.s();
            return true;
        }
    }

    c(MapLibreMap mapLibreMap, MapView mapView) {
        e(LayoutInflater.from(mapView.getContext()).inflate(R.layout.maplibre_infowindow_content, (ViewGroup) mapView, false), mapLibreMap);
    }

    static void b(c cVar) {
        MapLibreMap mapLibreMap = cVar.f79597b.get();
        Marker marker = cVar.f79596a.get();
        if (marker != null && mapLibreMap != null) {
            mapLibreMap.h(marker);
        }
        cVar.d();
    }

    private void e(@NonNull View view, MapLibreMap mapLibreMap) {
        this.f79597b = new WeakReference<>(mapLibreMap);
        this.f79603h = false;
        this.f79598c = new WeakReference<>(view);
        view.setOnClickListener(new a());
        view.setOnLongClickListener(new b());
    }

    final void c(@NonNull Marker marker, MapLibreMap mapLibreMap, @NonNull MapView mapView) {
        View view = this.f79598c.get();
        if (view == null) {
            view = LayoutInflater.from(mapView.getContext()).inflate(this.f79604i, (ViewGroup) mapView, false);
            e(view, mapLibreMap);
        }
        this.f79597b = new WeakReference<>(mapLibreMap);
        marker.getClass();
        TextView textView = (TextView) view.findViewById(R.id.infowindow_title);
        if (TextUtils.isEmpty(null)) {
            textView.setVisibility(8);
        } else {
            textView.setText((CharSequence) null);
            textView.setVisibility(0);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.infowindow_description);
        if (TextUtils.isEmpty(null)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText((CharSequence) null);
            textView2.setVisibility(0);
        }
    }

    @NonNull
    final void d() {
        MapLibreMap mapLibreMap = this.f79597b.get();
        if (!this.f79603h || mapLibreMap == null) {
            return;
        }
        this.f79603h = false;
        View view = this.f79598c.get();
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        WeakReference<Marker> weakReference = this.f79596a;
        if (weakReference != null) {
            weakReference.get();
        }
        mapLibreMap.r();
        this.f79596a = new WeakReference<>(null);
    }

    @NonNull
    final void f(@NonNull MapView mapView, Marker marker, @NonNull LatLng latLng) {
        float f7;
        boolean z11;
        float f11;
        boolean z12;
        this.f79596a = new WeakReference<>(marker);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        MapLibreMap mapLibreMap = this.f79597b.get();
        View view = this.f79598c.get();
        if (view == null || mapLibreMap == null) {
            return;
        }
        view.measure(0, 0);
        float f12 = 0;
        this.f79599d = 0;
        PointF g10 = mapLibreMap.t().g(latLng);
        this.f79602g = g10;
        float measuredWidth = (g10.x - (view.getMeasuredWidth() / 2)) + f12;
        float measuredHeight = (this.f79602g.y - view.getMeasuredHeight()) + f12;
        if (view instanceof BubbleLayout) {
            Resources resources = mapView.getContext().getResources();
            float measuredWidth2 = view.getMeasuredWidth() + measuredWidth;
            float right = mapView.getRight();
            float left = mapView.getLeft();
            float dimension = resources.getDimension(R.dimen.maplibre_infowindow_margin);
            float dimension2 = resources.getDimension(R.dimen.maplibre_infowindow_tipview_width) / 2.0f;
            float measuredWidth3 = (view.getMeasuredWidth() / 2) - dimension2;
            float f13 = this.f79602g.x;
            if (f13 >= 0.0f && f13 <= mapView.getWidth()) {
                float f14 = this.f79602g.y;
                if (f14 >= 0.0f && f14 <= mapView.getHeight()) {
                    if (measuredWidth2 > right) {
                        float f15 = measuredWidth2 - right;
                        f7 = measuredWidth - f15;
                        measuredWidth3 += f15 + dimension2;
                        measuredWidth2 = view.getMeasuredWidth() + f7;
                        z11 = true;
                    } else {
                        f7 = measuredWidth;
                        z11 = false;
                    }
                    if (measuredWidth < left) {
                        float f16 = left - measuredWidth;
                        f7 += f16;
                        float f17 = measuredWidth3 - (f16 + dimension2);
                        measuredWidth = f7;
                        f11 = f17;
                        z12 = true;
                    } else {
                        f11 = measuredWidth3;
                        z12 = false;
                    }
                    if (z11) {
                        float f18 = right - measuredWidth2;
                        if (f18 < dimension) {
                            float f19 = dimension - f18;
                            f7 -= f19;
                            f11 = (f19 - dimension2) + f11;
                            measuredWidth = f7;
                        }
                    }
                    if (z12) {
                        float f21 = measuredWidth - left;
                        if (f21 < dimension) {
                            float f22 = dimension - f21;
                            measuredWidth = f7 + f22;
                            measuredWidth3 = f11 - (f22 - dimension2);
                        }
                    }
                    measuredWidth = f7;
                    measuredWidth3 = f11;
                }
            }
            ((BubbleLayout) view).b(measuredWidth3);
        }
        view.setX(measuredWidth);
        view.setY(measuredHeight);
        this.f79600e = (measuredWidth - this.f79602g.x) - f12;
        this.f79601f = -view.getMeasuredHeight();
        d();
        mapView.addView(view, layoutParams);
        this.f79603h = true;
    }

    public final void g() {
        MapLibreMap mapLibreMap = this.f79597b.get();
        Marker marker = this.f79596a.get();
        View view = this.f79598c.get();
        if (mapLibreMap == null || marker == null || view == null) {
            return;
        }
        PointF g10 = mapLibreMap.t().g(marker.c());
        this.f79602g = g10;
        if (view instanceof BubbleLayout) {
            view.setX((g10.x + this.f79600e) - this.f79599d);
        } else {
            view.setX((g10.x - (view.getMeasuredWidth() / 2)) - this.f79599d);
        }
        view.setY(this.f79602g.y + this.f79601f);
    }
}
