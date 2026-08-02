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
import org.maplibre.android.maps.MapFragment;

/* loaded from: classes10.dex */
public class SupportMapFragment extends ComponentCallbacksC5392m implements OnMapReadyCallback {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f79836a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private MapFragment.OnMapViewReadyCallback f79837b;

    /* renamed from: c, reason: collision with root package name */
    private MapView f79838c;

    @Override // org.maplibre.android.maps.OnMapReadyCallback
    public final void d(@NonNull MapLibreMap mapLibreMap) {
        Iterator it = this.f79836a.iterator();
        while (it.hasNext()) {
            ((OnMapReadyCallback) it.next()).d(mapLibreMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MapFragment.OnMapViewReadyCallback) {
            this.f79837b = (MapFragment.OnMapViewReadyCallback) context;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Context context = layoutInflater.getContext();
        Bundle arguments = getArguments();
        MapView mapView = new MapView(context, (arguments == null || !arguments.containsKey("MapLibreMapOptions")) ? MapLibreMapOptions.c(context, null) : (MapLibreMapOptions) arguments.getParcelable("MapLibreMapOptions"));
        this.f79838c = mapView;
        return mapView;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        super.onDestroy();
        this.f79836a.clear();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f79838c.onDestroy();
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
        MapView mapView = this.f79838c;
        if (mapView != null) {
            mapView.onLowMemory();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        super.onPause();
        this.f79838c.onPause();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        this.f79838c.onResume();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        MapView mapView = this.f79838c;
        if (mapView != null) {
            mapView.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        this.f79838c.onStart();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        this.f79838c.onStop();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f79838c.onCreate(bundle);
        this.f79838c.getMapAsync(this);
        MapFragment.OnMapViewReadyCallback onMapViewReadyCallback = this.f79837b;
        if (onMapViewReadyCallback != null) {
            onMapViewReadyCallback.a();
        }
    }
}
