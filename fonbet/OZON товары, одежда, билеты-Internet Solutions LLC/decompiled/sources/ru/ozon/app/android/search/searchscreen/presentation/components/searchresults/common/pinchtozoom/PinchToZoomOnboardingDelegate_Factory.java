package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom;

import Jb.e;
import Pc.a;

/* loaded from: classes7.dex */
public final class PinchToZoomOnboardingDelegate_Factory implements e<PinchToZoomOnboardingDelegate> {
    private final a<PinchToZoomStorage> pinchToZoomStorageProvider;

    public PinchToZoomOnboardingDelegate_Factory(a<PinchToZoomStorage> aVar) {
        this.pinchToZoomStorageProvider = aVar;
    }

    public static PinchToZoomOnboardingDelegate_Factory create(a<PinchToZoomStorage> aVar) {
        return new PinchToZoomOnboardingDelegate_Factory(aVar);
    }

    public static PinchToZoomOnboardingDelegate newInstance(PinchToZoomStorage pinchToZoomStorage) {
        return new PinchToZoomOnboardingDelegate(pinchToZoomStorage);
    }

    @Override // Pc.a
    public PinchToZoomOnboardingDelegate get() {
        return newInstance(this.pinchToZoomStorageProvider.get());
    }
}
