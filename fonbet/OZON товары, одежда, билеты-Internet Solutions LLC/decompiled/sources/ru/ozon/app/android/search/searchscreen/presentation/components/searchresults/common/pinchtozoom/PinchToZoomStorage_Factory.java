package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom;

import Jb.e;
import Pc.a;
import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public final class PinchToZoomStorage_Factory implements e<PinchToZoomStorage> {
    private final a<SharedPreferences> prefsProvider;

    public PinchToZoomStorage_Factory(a<SharedPreferences> aVar) {
        this.prefsProvider = aVar;
    }

    public static PinchToZoomStorage_Factory create(a<SharedPreferences> aVar) {
        return new PinchToZoomStorage_Factory(aVar);
    }

    public static PinchToZoomStorage newInstance(SharedPreferences sharedPreferences) {
        return new PinchToZoomStorage(sharedPreferences);
    }

    @Override // Pc.a
    public PinchToZoomStorage get() {
        return newInstance(this.prefsProvider.get());
    }
}
