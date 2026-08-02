package org.maplibre.android.maps;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class MapFragment extends ComponentCallbacksC5392m implements OnMapReadyCallback {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f79699a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private OnMapViewReadyCallback f79700b;

    /* renamed from: c, reason: collision with root package name */
    private MapView f79701c;

    public interface OnMapViewReadyCallback {
        void a();
    }

    @Override // org.maplibre.android.maps.OnMapReadyCallback
    public final void d(@NonNull MapLibreMap mapLibreMap) {
        Iterator it = this.f79699a.iterator();
        while (it.hasNext()) {
            ((OnMapReadyCallback) it.next()).d(mapLibreMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnMapViewReadyCallback) {
            this.f79700b = (OnMapViewReadyCallback) context;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Context context = layoutInflater.getContext();
        Bundle arguments = getArguments();
        MapView mapView = new MapView(context, (arguments == null || !arguments.containsKey("MapLibreMapOptions")) ? MapLibreMapOptions.c(context, null) : (MapLibreMapOptions) arguments.getParcelable("MapLibreMapOptions"));
        this.f79701c = mapView;
        return mapView;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        super.onDestroy();
        this.f79699a.clear();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f79701c.onDestroy();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onInflate(@NonNull Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        MapLibreMapOptions c11 = MapLibreMapOptions.c(context, attributeSet);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapLibreMapOptions", c11);
        setArguments(bundle2);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        MapView mapView = this.f79701c;
        if (mapView == null || mapView.isDestroyed()) {
            return;
        }
        this.f79701c.onLowMemory();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        super.onPause();
        this.f79701c.onPause();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        this.f79701c.onResume();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        MapView mapView = this.f79701c;
        if (mapView == null || mapView.isDestroyed()) {
            return;
        }
        this.f79701c.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        this.f79701c.onStart();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        this.f79701c.onStop();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f79701c.onCreate(bundle);
        this.f79701c.getMapAsync(this);
        OnMapViewReadyCallback onMapViewReadyCallback = this.f79700b;
        if (onMapViewReadyCallback != null) {
            onMapViewReadyCallback.a();
        }
    }
}
