package com.yandex.mapkit.places.panorama.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Direction;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Span;
import com.yandex.mapkit.logo.Logo;
import com.yandex.mapkit.places.panorama.CompanyTapListener;
import com.yandex.mapkit.places.panorama.DirectionChangeListener;
import com.yandex.mapkit.places.panorama.ErrorListener;
import com.yandex.mapkit.places.panorama.HistoricalPanorama;
import com.yandex.mapkit.places.panorama.IconImageFactory;
import com.yandex.mapkit.places.panorama.IconUrlProvider;
import com.yandex.mapkit.places.panorama.PanoramaChangeListener;
import com.yandex.mapkit.places.panorama.PanoramaDescription;
import com.yandex.mapkit.places.panorama.Player;
import com.yandex.mapkit.places.panorama.SpanChangeListener;
import com.yandex.mapkit.places.panorama.TileImageFactory;
import com.yandex.mapkit.places.panorama.TileUrlProvider;
import com.yandex.mapkit.places.panorama.UserPanoramaEventListener;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes9.dex */
public class PlayerBinding implements Player {
    private final NativeObject nativeObject;
    protected Subscription<CompanyTapListener> companyTapListenerSubscription = new Subscription<CompanyTapListener>() { // from class: com.yandex.mapkit.places.panorama.internal.PlayerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(CompanyTapListener companyTapListener) {
            return PlayerBinding.createCompanyTapListener(companyTapListener);
        }
    };
    protected Subscription<DirectionChangeListener> directionChangeListenerSubscription = new Subscription<DirectionChangeListener>() { // from class: com.yandex.mapkit.places.panorama.internal.PlayerBinding.2
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(DirectionChangeListener directionChangeListener) {
            return PlayerBinding.createDirectionChangeListener(directionChangeListener);
        }
    };
    protected Subscription<ErrorListener> errorListenerSubscription = new Subscription<ErrorListener>() { // from class: com.yandex.mapkit.places.panorama.internal.PlayerBinding.3
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(ErrorListener errorListener) {
            return PlayerBinding.createErrorListener(errorListener);
        }
    };
    protected Subscription<PanoramaChangeListener> panoramaChangeListenerSubscription = new Subscription<PanoramaChangeListener>() { // from class: com.yandex.mapkit.places.panorama.internal.PlayerBinding.4
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(PanoramaChangeListener panoramaChangeListener) {
            return PlayerBinding.createPanoramaChangeListener(panoramaChangeListener);
        }
    };
    protected Subscription<SpanChangeListener> spanChangeListenerSubscription = new Subscription<SpanChangeListener>() { // from class: com.yandex.mapkit.places.panorama.internal.PlayerBinding.5
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(SpanChangeListener spanChangeListener) {
            return PlayerBinding.createSpanChangeListener(spanChangeListener);
        }
    };
    protected Subscription<UserPanoramaEventListener> userPanoramaEventListenerSubscription = new Subscription<UserPanoramaEventListener>() { // from class: com.yandex.mapkit.places.panorama.internal.PlayerBinding.6
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(UserPanoramaEventListener userPanoramaEventListener) {
            return PlayerBinding.createUserPanoramaEventListener(userPanoramaEventListener);
        }
    };

    protected PlayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createCompanyTapListener(CompanyTapListener companyTapListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createDirectionChangeListener(DirectionChangeListener directionChangeListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createErrorListener(ErrorListener errorListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createPanoramaChangeListener(PanoramaChangeListener panoramaChangeListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createSpanChangeListener(SpanChangeListener spanChangeListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createUserPanoramaEventListener(UserPanoramaEventListener userPanoramaEventListener);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void addCompanyTapListener(@NonNull CompanyTapListener companyTapListener);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void addDirectionChangeListener(@NonNull DirectionChangeListener directionChangeListener);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void addErrorListener(@NonNull ErrorListener errorListener);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void addPanoramaChangeListener(@NonNull PanoramaChangeListener panoramaChangeListener);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void addSpanChangeListener(@NonNull SpanChangeListener spanChangeListener);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native boolean companiesEnabled();

    @Override // com.yandex.mapkit.places.panorama.Player
    @NonNull
    public native Direction direction();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void disableCompanies();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void disableLoadingWheel();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void disableMarkers();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void disableMove();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void disableRotation();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void disableZoom();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void enableCompanies();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void enableLoadingWheel();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void enableMarkers();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void enableMove();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void enableRotation();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void enableZoom();

    @Override // com.yandex.mapkit.places.panorama.Player
    @NonNull
    public native Logo getLogo();

    @Override // com.yandex.mapkit.places.panorama.Player
    @NonNull
    public native List<HistoricalPanorama> historicalPanoramas();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native boolean isValid();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native boolean loadingWheelEnabled();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void lookAt(@NonNull Point point);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native boolean markersEnabled();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native boolean moveEnabled();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void onMemoryWarning();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void openPanorama(@NonNull String str);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void openUserPanoramaWithLocalDataSource(@NonNull PanoramaDescription panoramaDescription, @NonNull TileImageFactory tileImageFactory, @NonNull IconImageFactory iconImageFactory, @NonNull UserPanoramaEventListener userPanoramaEventListener);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void openUserPanoramaWithNetworkDataSource(@NonNull PanoramaDescription panoramaDescription, @NonNull TileUrlProvider tileUrlProvider, @NonNull IconUrlProvider iconUrlProvider, @NonNull UserPanoramaEventListener userPanoramaEventListener);

    @Override // com.yandex.mapkit.places.panorama.Player
    @NonNull
    public native String panoramaId();

    @Override // com.yandex.mapkit.places.panorama.Player
    @NonNull
    public native Point position();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void removeCompanyTapListener(@NonNull CompanyTapListener companyTapListener);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void removeDirectionChangeListener(@NonNull DirectionChangeListener directionChangeListener);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void removeErrorListener(@NonNull ErrorListener errorListener);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void removePanoramaChangeListener(@NonNull PanoramaChangeListener panoramaChangeListener);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void removeSpanChangeListener(@NonNull SpanChangeListener spanChangeListener);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void reset();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native boolean rotationEnabled();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void setDirection(@NonNull Direction direction);

    @Override // com.yandex.mapkit.places.panorama.Player
    public native void setSpan(@NonNull Span span);

    @Override // com.yandex.mapkit.places.panorama.Player
    @NonNull
    public native Span span();

    @Override // com.yandex.mapkit.places.panorama.Player
    public native boolean zoomEnabled();
}
