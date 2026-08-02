package com.yandex.mapkit.places.panorama.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.places.panorama.PanoramaService;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class PanoramaServiceBinding implements PanoramaService {
    private final NativeObject nativeObject;

    public static class SearchSessionBinding implements PanoramaService.SearchSession {
        private final NativeObject nativeObject;

        protected SearchSessionBinding(NativeObject nativeObject) {
            this.nativeObject = nativeObject;
        }

        @Override // com.yandex.mapkit.places.panorama.PanoramaService.SearchSession
        public native void cancel();

        @Override // com.yandex.mapkit.places.panorama.PanoramaService.SearchSession
        public native void retry(@NonNull PanoramaService.SearchListener searchListener);
    }

    protected PanoramaServiceBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.panorama.PanoramaService
    @NonNull
    public native PanoramaService.SearchSession findNearest(@NonNull Point point, @NonNull PanoramaService.SearchListener searchListener);
}
