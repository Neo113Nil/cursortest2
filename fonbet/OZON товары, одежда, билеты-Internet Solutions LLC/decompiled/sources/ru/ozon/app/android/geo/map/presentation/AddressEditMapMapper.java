package ru.ozon.app.android.geo.map.presentation;

import WZ.t;
import WZ.x;
import android.text.Html;
import android.text.Spanned;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.extensions.TraceApiKt;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u0013\u0010\u000b\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u000b\u0010\u0015J\u001b\u0010\u000b\u001a\u00020\u0019*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u000b\u0010\u001aJ\u0013\u0010\u000b\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u000b\u0010\u001dJ\u0013\u0010\u000b\u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b\u000b\u0010 J\u0013\u0010#\u001a\u00020\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\t*\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010\u000b\u001a\u00020(*\u00020'2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u000b\u0010)J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020.0-*\u00020*2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u000b\u0010/J\u001b\u0010\u000b\u001a\u000201*\u0002002\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u000b\u00102J/\u00108\u001a\u000207*\u0002032\b\u0010,\u001a\u0004\u0018\u00010+2\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00106\u001a\u00020\tH\u0002¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b:\u0010\u0012J\u0013\u0010;\u001a\u00020+*\u00020\u0010H\u0002¢\u0006\u0004\b;\u0010<J\u0013\u0010\u000b\u001a\u00020>*\u00020=H\u0002¢\u0006\u0004\b\u000b\u0010?J#\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010\u0004*\u00020@2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bB\u0010CJ\u001b\u0010\u000b\u001a\u00020A*\u00020!2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u000b\u0010DJ\u001b\u0010\u000b\u001a\u00020F*\u00020E2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u000b\u0010GJ\u0013\u0010J\u001a\u00020I*\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ*\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010L\u001a\u00020\u00022\n\u0010N\u001a\u00060\u0003j\u0002`MH\u0096\u0002¢\u0006\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO;", "Ll20/d;", "", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO;Ljava/lang/String;)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$ViewPort;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$ViewPort;)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MetaInfo;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MetaInfo;", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MetaInfo;)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MetaInfo;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationMarker;", "", "widgetId", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationMarker;J)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationTooltip;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationTooltip;", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationTooltip;)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationTooltip;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin;)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObjectCacheKey;", "getMapObjectCacheKey", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject;)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObjectCacheKey;", "getHashCodeForCache", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationMarker;)Ljava/lang/String;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Selector;", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector;J)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Selector;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox;", "boundingBox", "", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox;J)Ljava/util/List;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$BannerInfo;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$BannerInfo;J)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$SearchIcon$Options;", "LWZ/t;", "tokenizedEvent", "sheetDefaultTitle", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$SearchIcon$SearchDialogOptions;", "toSearchIconDialogOptions", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$SearchIcon$Options;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox;LWZ/t;Ljava/lang/String;)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$SearchIcon$SearchDialogOptions;", "toViewPort", "toBoundingBox", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$ViewPort;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions$BoundingBox;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin$Badge;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin$Badge;", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin$Badge;)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin$Badge;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MarkerBundle;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObject;", "getMapObjects", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MarkerBundle;J)Ljava/util/List;", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject;J)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObject;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MiniAppHeader;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MiniAppHeader;", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MiniAppHeader;J)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MiniAppHeader;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$NumberPVZ;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;", "toVo", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$NumberPVZ;)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO;Ll20/d;)Ljava/util/List;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapMapper implements Function2<AddressEditMapDTO, d, List<? extends AddressEditMapVO>> {
    private final String getHashCodeForCache(AddressEditMapDTO.LocationMarker locationMarker) {
        return String.valueOf(Arrays.hashCode(new String[]{locationMarker.getIcon() + locationMarker.getIconHeight() + locationMarker.getIconWidth() + locationMarker.getTooltip()}));
    }

    private final AddressEditMapVO.MapObjectCacheKey getMapObjectCacheKey(AddressEditMapDTO.MapObject mapObject) {
        return new AddressEditMapVO.MapObjectCacheKey(mapObject.getType(), mapObject.getPinsCount(), mapObject.getImage(), mapObject.getTintColor(), mapObject.getPinsCountColor(), mapObject.getBorderColor(), mapObject.getImageTintColor(), mapObject.getAdditionalContent(), mapObject.isSelected(), null, UserVerificationMethods.USER_VERIFY_NONE, null);
    }

    private final List<AddressEditMapVO.MapObject> getMapObjects(AddressEditMapDTO.MarkerBundle markerBundle, long j11) {
        List<AddressEditMapDTO.MapObject> mapObjects;
        if (!(markerBundle instanceof AddressEditMapDTO.MapObjectCollection) || (mapObjects = ((AddressEditMapDTO.MapObjectCollection) markerBundle).getMapObjects()) == null) {
            return null;
        }
        List<AddressEditMapDTO.MapObject> list = mapObjects;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((AddressEditMapDTO.MapObject) it.next(), j11));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((AddressEditMapVO.MapObject) obj).getType() != AddressEditMapDTO.MapObject.Type.UNKNOWN) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox toBoundingBox(AddressEditMapDTO.ViewPort viewPort) {
        return new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox(new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox.GeoCoordinate(viewPort.getRightTop().getLatitude(), viewPort.getRightTop().getLongitude()), new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox.GeoCoordinate(viewPort.getLeftBottom().getLatitude(), viewPort.getLeftBottom().getLongitude()));
    }

    private final AddressEditMapVO.MapIcon.SearchIcon.SearchDialogOptions toSearchIconDialogOptions(AddressEditMapDTO.Icons.SearchIcon.Options options, FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox boundingBox, t tVar, String str) {
        String title = options.getTitle();
        if (title == null) {
            title = str;
        }
        String placeholder = options.getPlaceholder();
        String query = options.getQuery();
        String geocodingActionPath = options.getGeocodingActionPath();
        String title2 = options.getTitle();
        int threshold = options.getThreshold();
        List<TextAtom> emptyStateElements = options.getEmptyStateElements();
        if (emptyStateElements == null) {
            emptyStateElements = K.f71697a;
        }
        List<TextAtom> list = emptyStateElements;
        List<TextAtom> unavailableStateElements = options.getUnavailableStateElements();
        if (unavailableStateElements == null) {
            unavailableStateElements = K.f71697a;
        }
        List<TextAtom> list2 = unavailableStateElements;
        List<TextAtom> initialElements = options.getInitialElements();
        if (initialElements == null) {
            initialElements = K.f71697a;
        }
        return new AddressEditMapVO.MapIcon.SearchIcon.SearchDialogOptions(title, placeholder, query, tVar, new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions(geocodingActionPath, title2, threshold, boundingBox, list, list2, initialElements));
    }

    private final AddressEditMapVO toVO(AddressEditMapDTO addressEditMapDTO, String str) {
        ArrayList arrayList;
        boolean z11;
        t tVar;
        AddressEditMapVO.NumberPVZ numberPVZ;
        long j11;
        t tVar2;
        long hashCode = str.hashCode();
        boolean showCenterPin = addressEditMapDTO.getShowCenterPin();
        AddressEditMapVO.Pin vo = toVO(addressEditMapDTO.getCenterPin());
        AtomActionDTO bottomSheetAction = addressEditMapDTO.getBottomSheetAction();
        List<BadgeDTO> bottomSheetBadges = addressEditMapDTO.getBottomSheetBadges();
        AddressEditMapDTO.ViewPort viewport = addressEditMapDTO.getViewport();
        AddressEditMapVO.ViewPort viewPort = viewport != null ? toViewPort(viewport) : null;
        AddressEditMapDTO.LocationMarker userLocationMarker = addressEditMapDTO.getUserLocationMarker();
        AddressEditMapVO.LocationMarker vo2 = userLocationMarker != null ? toVO(userLocationMarker, hashCode) : null;
        String linkTplDragCenter = addressEditMapDTO.getLinkTplDragCenter();
        String linkTplZoomInOut = addressEditMapDTO.getLinkTplZoomInOut();
        AddressEditMapDTO.Icons icons = addressEditMapDTO.getIcons();
        AddressEditMapDTO.ViewPort viewport2 = addressEditMapDTO.getViewport();
        List<AddressEditMapVO.MapIcon> vo3 = toVO(icons, viewport2 != null ? toBoundingBox(viewport2) : null, hashCode);
        AddressEditMapDTO.BannerInfo bannerInfo = addressEditMapDTO.getBannerInfo();
        AddressEditMapVO.MapIcon.BannerIcon vo4 = bannerInfo != null ? toVO(bannerInfo, hashCode) : null;
        List<AddressEditMapDTO.Selector> selector = addressEditMapDTO.getSelector();
        if (selector != null) {
            List<AddressEditMapDTO.Selector> list = selector;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toVO((AddressEditMapDTO.Selector) it.next(), hashCode));
            }
        } else {
            arrayList = null;
        }
        TabsDTO dsTabs = addressEditMapDTO.getDsTabs();
        boolean z12 = !addressEditMapDTO.isNavbarHidden();
        String navbarTitle = addressEditMapDTO.getNavbarTitle();
        String navbarSubtitle = addressEditMapDTO.getNavbarSubtitle();
        Map<String, TokenizedTrackingInfo> trackingInfo = addressEditMapDTO.getTrackingInfo();
        if (trackingInfo != null) {
            z11 = showCenterPin;
            tVar = x.b(trackingInfo, Long.valueOf(hashCode), null);
        } else {
            z11 = showCenterPin;
            tVar = null;
        }
        AddressEditMapDTO.MetaInfo metaInfo = addressEditMapDTO.getMetaInfo();
        AddressEditMapVO.MetaInfo vo5 = metaInfo != null ? toVO(metaInfo) : null;
        Boolean geolocationOnInit = addressEditMapDTO.getGeolocationOnInit();
        boolean booleanValue = geolocationOnInit != null ? geolocationOnInit.booleanValue() : false;
        AddressEditMapDTO.MarkerBundle markerBundle = addressEditMapDTO.getMarkerBundle();
        List<AddressEditMapVO.MapObject> mapObjects = markerBundle != null ? getMapObjects(markerBundle, hashCode) : null;
        AddressEditMapDTO.MiniAppHeader miniAppHeader = addressEditMapDTO.getMiniAppHeader();
        AddressEditMapVO.MiniAppHeader vo6 = miniAppHeader != null ? toVO(miniAppHeader, hashCode) : null;
        Map<String, TokenizedTrackingInfo> bottomSheetTrackingInfo = addressEditMapDTO.getBottomSheetTrackingInfo();
        if (bottomSheetTrackingInfo != null) {
            tVar2 = x.b(bottomSheetTrackingInfo, Long.valueOf(hashCode), null);
            numberPVZ = null;
            j11 = hashCode;
        } else {
            numberPVZ = null;
            j11 = hashCode;
            tVar2 = null;
        }
        AddressEditMapDTO.NumberPVZ numberPVZ2 = addressEditMapDTO.getNumberPVZ();
        AddressEditMapVO.NumberPVZ vo7 = numberPVZ2 != null ? toVo(numberPVZ2) : numberPVZ;
        Boolean clusterizationEnabled = addressEditMapDTO.getClusterizationEnabled();
        boolean booleanValue2 = clusterizationEnabled != null ? clusterizationEnabled.booleanValue() : false;
        String actionBaseLink = addressEditMapDTO.getActionBaseLink();
        String mergedPinsActionBaseLink = addressEditMapDTO.getMergedPinsActionBaseLink();
        Boolean isNeedStartClusterization = addressEditMapDTO.isNeedStartClusterization();
        return new AddressEditMapVO(j11, z11, vo, bottomSheetAction, bottomSheetBadges, vo2, viewPort, linkTplDragCenter, linkTplZoomInOut, vo3, vo4, arrayList, dsTabs, z12, navbarTitle, navbarSubtitle, tVar, vo5, false, booleanValue, false, mapObjects, vo6, tVar2, vo7, booleanValue2, isNeedStartClusterization != null ? isNeedStartClusterization.booleanValue() : false, mergedPinsActionBaseLink, actionBaseLink, 1310720, null);
    }

    private final AddressEditMapVO.ViewPort toViewPort(AddressEditMapDTO.ViewPort viewPort) {
        return new AddressEditMapVO.ViewPort(toVO(viewPort.getLeftBottom()), toVO(viewPort.getRightTop()));
    }

    private final AddressEditMapVO.NumberPVZ toVo(AddressEditMapDTO.NumberPVZ numberPVZ) {
        AtomActionDTO action;
        TextDTO number = numberPVZ.getNumber();
        CommonControlSettings common = numberPVZ.getCommon();
        return new AddressEditMapVO.NumberPVZ(number, (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, numberPVZ.getCommon().getTrackingInfo()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddressEditMapVO> invoke(@NotNull AddressEditMapDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        TraceApiKt.endDebugTrace("mapRequest", 1);
        TraceApiKt.beginDebugTrace("mapRequestMapped", 1);
        List<AddressEditMapVO> a02 = C7714v.a0(toVO(state, widgetInfo.d()));
        TraceApiKt.endDebugTrace("mapRequestMapped", 1);
        TraceApiKt.beginDebugTrace("mapRequestHandle", 1);
        return a02;
    }

    private final AddressEditMapVO.Coordinate toVO(AddressEditMapDTO.Coordinate coordinate) {
        return new AddressEditMapVO.Coordinate(coordinate.getLatitude(), coordinate.getLongitude());
    }

    private final AddressEditMapVO.ViewPort toVO(AddressEditMapDTO.ViewPort viewPort) {
        return new AddressEditMapVO.ViewPort(toVO(viewPort.getLeftBottom()), toVO(viewPort.getRightTop()));
    }

    private final AddressEditMapVO.MetaInfo toVO(AddressEditMapDTO.MetaInfo metaInfo) {
        return new AddressEditMapVO.MetaInfo(metaInfo.getDebounceDelay());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AddressEditMapVO.LocationMarker toVO(AddressEditMapDTO.LocationMarker locationMarker, long j11) {
        AddressEditMapVO.LocationTooltip locationTooltip;
        String str;
        t tVar;
        float f7;
        String icon = locationMarker.getIcon();
        Integer iconWidth = locationMarker.getIconWidth();
        Integer iconHeight = locationMarker.getIconHeight();
        AddressEditMapDTO.LocationTooltip tooltip = locationMarker.getTooltip();
        if (tooltip != null) {
            locationTooltip = toVO(tooltip);
            str = null;
        } else {
            locationTooltip = null;
            str = null;
        }
        String hashCodeForCache = getHashCodeForCache(locationMarker);
        float intValue = locationMarker.getZPriority() != null ? r7.intValue() : 0.0f;
        Map<String, TokenizedTrackingInfo> trackingInfo = locationMarker.getTrackingInfo();
        if (trackingInfo != null) {
            t b11 = x.b(trackingInfo, Long.valueOf(j11), str);
            f7 = intValue;
            tVar = b11;
        } else {
            float f11 = intValue;
            tVar = str;
            f7 = f11;
        }
        return new AddressEditMapVO.LocationMarker(icon, iconWidth, iconHeight, locationTooltip, hashCodeForCache, f7, tVar);
    }

    private final AddressEditMapVO.LocationTooltip toVO(AddressEditMapDTO.LocationTooltip locationTooltip) {
        return new AddressEditMapVO.LocationTooltip(locationTooltip.getText(), locationTooltip.getBackgroundColor(), locationTooltip.getTextColor(), locationTooltip.getTiming());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AddressEditMapVO.Pin toVO(AddressEditMapDTO.Pin pin) {
        String str;
        AddressEditMapVO.Coordinate vo = toVO(pin.getCoordinates());
        String icon = pin.getIcon();
        Integer pinsCount = pin.getPinsCount();
        if (pinsCount != null) {
            if (pinsCount.intValue() <= 1) {
                pinsCount = null;
            }
            if (pinsCount != null) {
                str = pinsCount.toString();
                AddressEditMapDTO.Pin.Badge badge = pin.getBadge();
                return new AddressEditMapVO.Pin(vo, icon, str, badge != null ? toVO(badge) : null);
            }
        }
        str = null;
        AddressEditMapDTO.Pin.Badge badge2 = pin.getBadge();
        return new AddressEditMapVO.Pin(vo, icon, str, badge2 != null ? toVO(badge2) : null);
    }

    private final AddressEditMapVO.Selector toVO(AddressEditMapDTO.Selector selector, long j11) {
        String title = selector.getTitle();
        boolean selected = selector.getSelected();
        AtomActionDTO action = selector.getAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = selector.getTrackingInfo();
        return new AddressEditMapVO.Selector(title, selected, action, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null, selector.getType());
    }

    private final List<AddressEditMapVO.MapIcon> toVO(AddressEditMapDTO.Icons icons, FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.BoundingBox boundingBox, long j11) {
        ArrayList arrayList = new ArrayList();
        String icon = icons.getLocation().getIcon();
        Map<String, TokenizedTrackingInfo> trackingInfo = icons.getLocation().getTrackingInfo();
        arrayList.add(new AddressEditMapVO.MapIcon.LocationIcon(icon, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null));
        AddressEditMapDTO.Icons.SearchIcon search = icons.getSearch();
        if (search != null) {
            String icon2 = search.getIcon();
            String title = search.getTitle();
            AddressEditMapDTO.Icons.SearchIcon.Options options = search.getOptions();
            Map<String, TokenizedTrackingInfo> trackingInfo2 = search.getTrackingInfo();
            AddressEditMapVO.MapIcon.SearchIcon.SearchDialogOptions searchIconDialogOptions = toSearchIconDialogOptions(options, boundingBox, trackingInfo2 != null ? x.b(trackingInfo2, Long.valueOf(j11), null) : null, search.getTitle());
            Map<String, TokenizedTrackingInfo> trackingInfo3 = search.getTrackingInfo();
            arrayList.add(new AddressEditMapVO.MapIcon.SearchIcon(title, icon2, searchIconDialogOptions, trackingInfo3 != null ? x.b(trackingInfo3, Long.valueOf(j11), null) : null));
        }
        return arrayList;
    }

    private final AddressEditMapVO.MapIcon.BannerIcon toVO(AddressEditMapDTO.BannerInfo bannerInfo, long j11) {
        String iconLink = bannerInfo.getIconLink();
        Spanned fromHtml = Html.fromHtml(bannerInfo.getHintText());
        Long hintDelay = bannerInfo.getHintDelay();
        Long hideTimer = bannerInfo.getHideTimer();
        String pinLink = bannerInfo.getPinLink();
        Map<String, TokenizedTrackingInfo> trackingInfo = bannerInfo.getTrackingInfo();
        return new AddressEditMapVO.MapIcon.BannerIcon(iconLink, fromHtml, hintDelay, hideTimer, pinLink, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null);
    }

    private final AddressEditMapVO.Pin.Badge toVO(AddressEditMapDTO.Pin.Badge badge) {
        return new AddressEditMapVO.Pin.Badge(badge.getColor());
    }

    private final AddressEditMapVO.MapObject toVO(AddressEditMapDTO.MapObject mapObject, long j11) {
        String coordinate = mapObject.getCoordinates().toString();
        AddressEditMapDTO.MapObject.Type type = mapObject.getType();
        if (type == null) {
            type = AddressEditMapDTO.MapObject.Type.UNKNOWN;
        }
        AddressEditMapDTO.MapObject.Type type2 = type;
        AddressEditMapVO.Coordinate vo = toVO(mapObject.getCoordinates());
        String pinsCount = mapObject.getPinsCount();
        String pinsCountColor = mapObject.getPinsCountColor();
        String image = mapObject.getImage();
        String imageTintColor = mapObject.getImageTintColor();
        AddressEditMapDTO.AdditionalPinContent additionalContent = mapObject.getAdditionalContent();
        String actionLink = mapObject.getActionLink();
        Boolean isSelected = mapObject.isSelected();
        boolean booleanValue = isSelected != null ? isSelected.booleanValue() : false;
        AddressEditMapDTO.ViewPort viewport = mapObject.getViewport();
        AddressEditMapVO.ViewPort vo2 = viewport != null ? toVO(viewport) : null;
        String tintColor = mapObject.getTintColor();
        String borderColor = mapObject.getBorderColor();
        float intValue = mapObject.getZPriority() != null ? r16.intValue() : 0.0f;
        AddressEditMapVO.MapObjectCacheKey mapObjectCacheKey = getMapObjectCacheKey(mapObject);
        Boolean isClickEnabled = mapObject.isClickEnabled();
        boolean booleanValue2 = isClickEnabled != null ? isClickEnabled.booleanValue() : true;
        Boolean ignoreCollapsedState = mapObject.getIgnoreCollapsedState();
        boolean booleanValue3 = ignoreCollapsedState != null ? ignoreCollapsedState.booleanValue() : false;
        Map<String, TokenizedTrackingInfo> trackingInfo = mapObject.getTrackingInfo();
        return new AddressEditMapVO.MapObject(coordinate, type2, vo, pinsCount, pinsCountColor, image, imageTintColor, tintColor, borderColor, vo2, additionalContent, actionLink, booleanValue, intValue, mapObjectCacheKey, booleanValue2, booleanValue3, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null);
    }

    private final AddressEditMapVO.MiniAppHeader toVO(AddressEditMapDTO.MiniAppHeader miniAppHeader, long j11) {
        TextDTO title = miniAppHeader.getTitle();
        IconDTO icon = miniAppHeader.getIcon();
        ImageDTO logo = miniAppHeader.getLogo();
        AtomActionDTO action = miniAppHeader.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, miniAppHeader.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = miniAppHeader.getTrackingInfo();
        return new AddressEditMapVO.MiniAppHeader(title, icon, logo, atomAction, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null, miniAppHeader.getRightButton(), miniAppHeader.getBackgroundColor());
    }
}
