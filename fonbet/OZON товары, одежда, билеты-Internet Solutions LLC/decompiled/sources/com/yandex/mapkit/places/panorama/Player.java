package com.yandex.mapkit.places.panorama;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Direction;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Span;
import com.yandex.mapkit.logo.Logo;
import java.util.List;

/* loaded from: classes9.dex */
public interface Player {
    void addCompanyTapListener(@NonNull CompanyTapListener companyTapListener);

    void addDirectionChangeListener(@NonNull DirectionChangeListener directionChangeListener);

    void addErrorListener(@NonNull ErrorListener errorListener);

    void addPanoramaChangeListener(@NonNull PanoramaChangeListener panoramaChangeListener);

    void addSpanChangeListener(@NonNull SpanChangeListener spanChangeListener);

    boolean companiesEnabled();

    @NonNull
    Direction direction();

    void disableCompanies();

    void disableLoadingWheel();

    void disableMarkers();

    void disableMove();

    void disableRotation();

    void disableZoom();

    void enableCompanies();

    void enableLoadingWheel();

    void enableMarkers();

    void enableMove();

    void enableRotation();

    void enableZoom();

    @NonNull
    Logo getLogo();

    @NonNull
    List<HistoricalPanorama> historicalPanoramas();

    boolean isValid();

    boolean loadingWheelEnabled();

    void lookAt(@NonNull Point point);

    boolean markersEnabled();

    boolean moveEnabled();

    void onMemoryWarning();

    void openPanorama(@NonNull String str);

    void openUserPanoramaWithLocalDataSource(@NonNull PanoramaDescription panoramaDescription, @NonNull TileImageFactory tileImageFactory, @NonNull IconImageFactory iconImageFactory, @NonNull UserPanoramaEventListener userPanoramaEventListener);

    void openUserPanoramaWithNetworkDataSource(@NonNull PanoramaDescription panoramaDescription, @NonNull TileUrlProvider tileUrlProvider, @NonNull IconUrlProvider iconUrlProvider, @NonNull UserPanoramaEventListener userPanoramaEventListener);

    @NonNull
    String panoramaId();

    @NonNull
    Point position();

    void removeCompanyTapListener(@NonNull CompanyTapListener companyTapListener);

    void removeDirectionChangeListener(@NonNull DirectionChangeListener directionChangeListener);

    void removeErrorListener(@NonNull ErrorListener errorListener);

    void removePanoramaChangeListener(@NonNull PanoramaChangeListener panoramaChangeListener);

    void removeSpanChangeListener(@NonNull SpanChangeListener spanChangeListener);

    void reset();

    boolean rotationEnabled();

    void setDirection(@NonNull Direction direction);

    void setSpan(@NonNull Span span);

    @NonNull
    Span span();

    boolean zoomEnabled();
}
