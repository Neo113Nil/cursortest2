package ru.ozon.app.android.geo.map.presentation.viewmapper;

import W10.c;
import WZ.t;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010\u001f\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u001f\u0010 J5\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\"\u0010#J5\u0010%\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH&¢\u0006\u0004\b+\u0010\f¨\u0006,"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewListener;", "", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", RichContentDTO.ALIGN_CENTER, "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "viewport", "", "zoom", "", "onCameraEndMoveAction", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;F)V", "onCameraStartMoveAction", "()V", "LWZ/t;", "tokenizedEvent", "", "fromLocationButton", "onCurrentLocationAction", "(LWZ/t;Z)V", "", ImagesContract.URL, "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "type", "onSelectorPressed", "(Ljava/lang/String;FLru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;LWZ/t;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;)V", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$SearchIcon$SearchDialogOptions;", "options", "LW10/c;", "trackingData", "onSearchAction", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$SearchIcon$SearchDialogOptions;LW10/c;)V", "selectPinFromBannerAction", "(Ljava/lang/String;Ljava/lang/Float;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;LWZ/t;)V", "link", "onPinClickedAction", "(Ljava/lang/String;FLru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;LWZ/t;)V", "event", "onClusterClickedAction", "(Ljava/lang/String;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;FLWZ/t;)V", "", "hintDelayMs", "onBannerLoaded", "(J)V", "onCameraCentered", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AddressEditMapViewListener {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onCurrentLocationAction$default(AddressEditMapViewListener addressEditMapViewListener, t tVar, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCurrentLocationAction");
            }
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            addressEditMapViewListener.onCurrentLocationAction(tVar, z11);
        }
    }

    void onBannerLoaded(long hintDelayMs);

    void onCameraCentered();

    void onCameraEndMoveAction(@NotNull AddressEditMapVO.Coordinate center, AddressEditMapVO.ViewPort viewport, float zoom);

    void onCameraStartMoveAction();

    void onClusterClickedAction(String link, AddressEditMapVO.ViewPort viewport, float zoom, t event);

    void onCurrentLocationAction(t tokenizedEvent, boolean fromLocationButton);

    void onPinClickedAction(String link, float zoom, AddressEditMapVO.ViewPort viewport, t tokenizedEvent);

    void onSearchAction(@NotNull AddressEditMapVO.MapIcon.SearchIcon.SearchDialogOptions options, c trackingData);

    void onSelectorPressed(@NotNull String url, float zoom, AddressEditMapVO.ViewPort viewport, t tokenizedEvent, @NotNull AddressEditMapDTO.Selector.Type type);

    void selectPinFromBannerAction(String url, Float zoom, AddressEditMapVO.ViewPort viewport, t tokenizedEvent);
}
