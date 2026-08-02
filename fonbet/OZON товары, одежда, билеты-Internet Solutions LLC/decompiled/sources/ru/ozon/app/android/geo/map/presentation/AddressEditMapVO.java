package ru.ozon.app.android.geo.map.presentation;

import Ak.C2436a;
import B0.A0;
import B90.C2619v;
import Bl.C2639a;
import C.o0;
import Cm.e;
import El.C2971a;
import G.g;
import J0.P;
import Kk.C3532b;
import N3.C3660k;
import Pk0.b;
import TY.a;
import Ve.C4636t5;
import WZ.t;
import android.text.Spanned;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\bH\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0011uvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001B³\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010$\u001a\u00020\u0005\u0012\b\b\u0002\u0010%\u001a\u00020\u0005\u0012\b\b\u0002\u0010&\u001a\u00020\u0005\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000b\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010+\u001a\u0004\u0018\u00010 \u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u0010.\u001a\u00020\u0005\u0012\u0006\u0010/\u001a\u00020\u0005\u0012\b\u00100\u001a\u0004\u0018\u00010\u0012\u0012\b\u00101\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b2\u00103Jð\u0002\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00052\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010.\u001a\u00020\u00052\b\b\u0002\u0010/\u001a\u00020\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bI\u0010JR\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010T\u001a\u0004\bU\u00107R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010T\u001a\u0004\bV\u00107R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\bW\u0010MR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010X\u001a\u0004\bY\u0010ZR\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010K\u001a\u0004\b[\u0010MR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u001d\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010B\u001a\u0004\b\u001d\u0010DR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u001e\u0010T\u001a\u0004\b_\u00107R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u001f\u0010T\u001a\u0004\b`\u00107R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010a\u001a\u0004\bb\u0010cR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010d\u001a\u0004\be\u0010fR\u0017\u0010$\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010B\u001a\u0004\bg\u0010DR\u0017\u0010%\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010B\u001a\u0004\bh\u0010DR\u0017\u0010&\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010B\u001a\u0004\bi\u0010DR\u001f\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010K\u001a\u0004\bj\u0010MR\u0019\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b*\u0010k\u001a\u0004\bl\u0010mR\u0019\u0010+\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b+\u0010a\u001a\u0004\bn\u0010cR\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\b-\u0010o\u001a\u0004\bp\u0010qR\u0017\u0010.\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010B\u001a\u0004\br\u0010DR\u0017\u0010/\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u0010B\u001a\u0004\b/\u0010DR\u0019\u00100\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b0\u0010T\u001a\u0004\bs\u00107R\u0019\u00101\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b1\u0010T\u001a\u0004\bt\u00107¨\u0006\u0083\u0001"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "showCenterPin", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;", "centerPin", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "bottomSheetAction", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "bottomSheetBadges", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "userLocationMarker", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "viewPort", "", "linkTplDragCenter", "linkTplZoomInOut", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;", "icons", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "bannerIcon", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Selector;", "selector", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "dsTabs", "isShowNavbarBackground", "navbarTitle", "navbarSubtitle", "LWZ/t;", "event", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MetaInfo;", "metaInfo", "processApplicationMove", "geolocationOnInit", "processInitializeMap", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObject;", "mapObjects", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MiniAppHeader;", "miniAppHeader", "bottomSheetTokenizedEvent", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;", "numberPVZ", "clusterizationEnabled", "isNeedStartClusterization", "mergedPinsActionBaseLink", "actionBaseLink", "<init>", "(JZLru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;Ljava/util/List;Lru/ozon/uni/atoms/data/tabs/TabsDTO;ZLjava/lang/String;Ljava/lang/String;LWZ/t;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MetaInfo;ZZZLjava/util/List;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MiniAppHeader;LWZ/t;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;ZZLjava/lang/String;Ljava/lang/String;)V", "copy", "(JZLru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;Ljava/util/List;Lru/ozon/uni/atoms/data/tabs/TabsDTO;ZLjava/lang/String;Ljava/lang/String;LWZ/t;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MetaInfo;ZZZLjava/util/List;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MiniAppHeader;LWZ/t;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;ZZLjava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "getShowCenterPin", "()Z", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;", "getCenterPin", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBottomSheetAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/List;", "getBottomSheetBadges", "()Ljava/util/List;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "getUserLocationMarker", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "getViewPort", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "Ljava/lang/String;", "getLinkTplDragCenter", "getLinkTplZoomInOut", "getIcons", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "getBannerIcon", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "getSelector", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "getDsTabs", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "getNavbarTitle", "getNavbarSubtitle", "LWZ/t;", "getEvent", "()LWZ/t;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MetaInfo;", "getMetaInfo", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MetaInfo;", "getProcessApplicationMove", "getGeolocationOnInit", "getProcessInitializeMap", "getMapObjects", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MiniAppHeader;", "getMiniAppHeader", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MiniAppHeader;", "getBottomSheetTokenizedEvent", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;", "getNumberPVZ", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;", "getClusterizationEnabled", "getMergedPinsActionBaseLink", "getActionBaseLink", "MetaInfo", "Selector", "MapIcon", "Pin", "CacheKey", "PinCacheKey", "MapObjectCacheKey", "ViewPort", "Coordinate", "LocationMarker", "LocationTooltip", "MapObject", "MiniAppHeader", "NumberPVZ", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditMapVO implements c {
    private final String actionBaseLink;
    private final MapIcon.BannerIcon bannerIcon;
    private final AtomActionDTO bottomSheetAction;
    private final List<BadgeDTO> bottomSheetBadges;
    private final t bottomSheetTokenizedEvent;

    @NotNull
    private final Pin centerPin;
    private final boolean clusterizationEnabled;
    private final TabsDTO dsTabs;
    private final t event;
    private final boolean geolocationOnInit;

    @NotNull
    private final List<MapIcon> icons;
    private final long id;
    private final boolean isNeedStartClusterization;
    private final boolean isShowNavbarBackground;
    private final String linkTplDragCenter;
    private final String linkTplZoomInOut;
    private final List<MapObject> mapObjects;
    private final String mergedPinsActionBaseLink;
    private final MetaInfo metaInfo;
    private final MiniAppHeader miniAppHeader;
    private final String navbarSubtitle;
    private final String navbarTitle;
    private final NumberPVZ numberPVZ;
    private final boolean processApplicationMove;
    private final boolean processInitializeMap;
    private final List<Selector> selector;
    private final boolean showCenterPin;
    private final LocationMarker userLocationMarker;
    private final ViewPort viewPort;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$CacheKey;", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CacheKey {
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "", "latitude", "", "longitude", "<init>", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Coordinate {
        private final double latitude;
        private final double longitude;

        public Coordinate(double d11, double d12) {
            this.latitude = d11;
            this.longitude = d12;
        }

        public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, double d11, double d12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                d11 = coordinate.latitude;
            }
            if ((i11 & 2) != 0) {
                d12 = coordinate.longitude;
            }
            return coordinate.copy(d11, d12);
        }

        /* renamed from: component1, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        @NotNull
        public final Coordinate copy(double latitude, double longitude) {
            return new Coordinate(latitude, longitude);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Coordinate)) {
                return false;
            }
            Coordinate coordinate = (Coordinate) other;
            return Double.compare(this.latitude, coordinate.latitude) == 0 && Double.compare(this.longitude, coordinate.longitude) == 0;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public int hashCode() {
            return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
        }

        @NotNull
        public String toString() {
            double d11 = this.latitude;
            return C2619v.c(e.e(d11, "Coordinate(latitude=", ", longitude="), this.longitude, ")");
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b!\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "", "", "icon", "", "iconWidth", "iconHeight", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationTooltip;", "tooltip", "hashId", "", "zPriority", "LWZ/t;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationTooltip;Ljava/lang/String;FLWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "Ljava/lang/Integer;", "getIconWidth", "()Ljava/lang/Integer;", "getIconHeight", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationTooltip;", "getTooltip", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationTooltip;", "getHashId", "F", "getZPriority", "()F", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationMarker {

        @NotNull
        private final String hashId;

        @NotNull
        private final String icon;
        private final Integer iconHeight;
        private final Integer iconWidth;
        private final t tokenizedEvent;
        private final LocationTooltip tooltip;
        private final float zPriority;

        public LocationMarker(@NotNull String icon, Integer num, Integer num2, LocationTooltip locationTooltip, @NotNull String hashId, float f7, t tVar) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(hashId, "hashId");
            this.icon = icon;
            this.iconWidth = num;
            this.iconHeight = num2;
            this.tooltip = locationTooltip;
            this.hashId = hashId;
            this.zPriority = f7;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationMarker)) {
                return false;
            }
            LocationMarker locationMarker = (LocationMarker) other;
            return Intrinsics.d(this.icon, locationMarker.icon) && Intrinsics.d(this.iconWidth, locationMarker.iconWidth) && Intrinsics.d(this.iconHeight, locationMarker.iconHeight) && Intrinsics.d(this.tooltip, locationMarker.tooltip) && Intrinsics.d(this.hashId, locationMarker.hashId) && Float.compare(this.zPriority, locationMarker.zPriority) == 0 && Intrinsics.d(this.tokenizedEvent, locationMarker.tokenizedEvent);
        }

        @NotNull
        public final String getHashId() {
            return this.hashId;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public final LocationTooltip getTooltip() {
            return this.tooltip;
        }

        public final float getZPriority() {
            return this.zPriority;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            Integer num = this.iconWidth;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.iconHeight;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            LocationTooltip locationTooltip = this.tooltip;
            int a11 = b.a(this.zPriority, g.a((hashCode3 + (locationTooltip == null ? 0 : locationTooltip.hashCode())) * 31, 31, this.hashId), 31);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            Integer num = this.iconWidth;
            Integer num2 = this.iconHeight;
            LocationTooltip locationTooltip = this.tooltip;
            String str2 = this.hashId;
            float f7 = this.zPriority;
            t tVar = this.tokenizedEvent;
            StringBuilder b11 = P.b("LocationMarker(icon=", str, num, ", iconWidth=", ", iconHeight=");
            b11.append(num2);
            b11.append(", tooltip=");
            b11.append(locationTooltip);
            b11.append(", hashId=");
            b11.append(str2);
            b11.append(", zPriority=");
            b11.append(f7);
            b11.append(", tokenizedEvent=");
            return Tl.b.d(b11, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationTooltip;", "", "", "text", "backgroundColor", "textColor", "", "timing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getBackgroundColor", "getTextColor", "J", "getTiming", "()J", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationTooltip {
        private final String backgroundColor;

        @NotNull
        private final String text;
        private final String textColor;
        private final long timing;

        public LocationTooltip(@NotNull String text, String str, String str2, long j11) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.backgroundColor = str;
            this.textColor = str2;
            this.timing = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationTooltip)) {
                return false;
            }
            LocationTooltip locationTooltip = (LocationTooltip) other;
            return Intrinsics.d(this.text, locationTooltip.text) && Intrinsics.d(this.backgroundColor, locationTooltip.backgroundColor) && Intrinsics.d(this.textColor, locationTooltip.textColor) && this.timing == locationTooltip.timing;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public final long getTiming() {
            return this.timing;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.textColor;
            return Long.hashCode(this.timing) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.backgroundColor;
            String str3 = this.textColor;
            long j11 = this.timing;
            StringBuilder d11 = C3660k.d("LocationTooltip(text=", str, ", backgroundColor=", str2, ", textColor=");
            d11.append(str3);
            d11.append(", timing=");
            d11.append(j11);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;", "", "<init>", "()V", "LocationIcon", "SearchIcon", "BannerIcon", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$LocationIcon;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$SearchIcon;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class MapIcon {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b!\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;", "", "iconLink", "Landroid/text/Spanned;", "hintText", "", "hintDelay", "hideTimer", "pinLink", "LWZ/t;", "event", "<init>", "(Ljava/lang/String;Landroid/text/Spanned;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIconLink", "Landroid/text/Spanned;", "getHintText", "()Landroid/text/Spanned;", "Ljava/lang/Long;", "getHintDelay", "()Ljava/lang/Long;", "getHideTimer", "getPinLink", "LWZ/t;", "getEvent", "()LWZ/t;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BannerIcon extends MapIcon {
            private final t event;
            private final Long hideTimer;
            private final Long hintDelay;
            private final Spanned hintText;

            @NotNull
            private final String iconLink;
            private final String pinLink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BannerIcon(@NotNull String iconLink, Spanned spanned, Long l11, Long l12, String str, t tVar) {
                super(null);
                Intrinsics.checkNotNullParameter(iconLink, "iconLink");
                this.iconLink = iconLink;
                this.hintText = spanned;
                this.hintDelay = l11;
                this.hideTimer = l12;
                this.pinLink = str;
                this.event = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BannerIcon)) {
                    return false;
                }
                BannerIcon bannerIcon = (BannerIcon) other;
                return Intrinsics.d(this.iconLink, bannerIcon.iconLink) && Intrinsics.d(this.hintText, bannerIcon.hintText) && Intrinsics.d(this.hintDelay, bannerIcon.hintDelay) && Intrinsics.d(this.hideTimer, bannerIcon.hideTimer) && Intrinsics.d(this.pinLink, bannerIcon.pinLink) && Intrinsics.d(this.event, bannerIcon.event);
            }

            public final t getEvent() {
                return this.event;
            }

            public final Long getHideTimer() {
                return this.hideTimer;
            }

            public final Long getHintDelay() {
                return this.hintDelay;
            }

            public final Spanned getHintText() {
                return this.hintText;
            }

            @NotNull
            public final String getIconLink() {
                return this.iconLink;
            }

            public final String getPinLink() {
                return this.pinLink;
            }

            public int hashCode() {
                int hashCode = this.iconLink.hashCode() * 31;
                Spanned spanned = this.hintText;
                int hashCode2 = (hashCode + (spanned == null ? 0 : spanned.hashCode())) * 31;
                Long l11 = this.hintDelay;
                int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
                Long l12 = this.hideTimer;
                int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
                String str = this.pinLink;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                t tVar = this.event;
                return hashCode5 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.iconLink;
                Spanned spanned = this.hintText;
                Long l11 = this.hintDelay;
                Long l12 = this.hideTimer;
                String str2 = this.pinLink;
                t tVar = this.event;
                StringBuilder sb2 = new StringBuilder("BannerIcon(iconLink=");
                sb2.append(str);
                sb2.append(", hintText=");
                sb2.append((Object) spanned);
                sb2.append(", hintDelay=");
                a.e(sb2, l11, ", hideTimer=", l12, ", pinLink=");
                sb2.append(str2);
                sb2.append(", event=");
                sb2.append(tVar);
                sb2.append(")");
                return sb2.toString();
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$LocationIcon;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;", "", "icon", "LWZ/t;", "event", "<init>", "(Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "LWZ/t;", "getEvent", "()LWZ/t;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocationIcon extends MapIcon {
            private final t event;

            @NotNull
            private final String icon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocationIcon(@NotNull String icon, t tVar) {
                super(null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.event = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LocationIcon)) {
                    return false;
                }
                LocationIcon locationIcon = (LocationIcon) other;
                return Intrinsics.d(this.icon, locationIcon.icon) && Intrinsics.d(this.event, locationIcon.event);
            }

            public final t getEvent() {
                return this.event;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            public int hashCode() {
                int hashCode = this.icon.hashCode() * 31;
                t tVar = this.event;
                return hashCode + (tVar == null ? 0 : tVar.hashCode());
            }

            @NotNull
            public String toString() {
                return "LocationIcon(icon=" + this.icon + ", event=" + this.event + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$SearchIcon;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "icon", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$SearchIcon$SearchDialogOptions;", "searchDialogOptions", "LWZ/t;", "event", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$SearchIcon$SearchDialogOptions;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getIcon", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$SearchIcon$SearchDialogOptions;", "getSearchDialogOptions", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$SearchIcon$SearchDialogOptions;", "LWZ/t;", "getEvent", "()LWZ/t;", "SearchDialogOptions", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SearchIcon extends MapIcon {
            private final t event;

            @NotNull
            private final String icon;

            @NotNull
            private final SearchDialogOptions searchDialogOptions;

            @NotNull
            private final String title;

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$SearchIcon$SearchDialogOptions;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, HammersV3BodyDTO.PLACEHOLDER, SearchIntents.EXTRA_QUERY, "LWZ/t;", "event", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;", "searchOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LWZ/t;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getPlaceholder", "getQuery", "LWZ/t;", "getEvent", "()LWZ/t;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;", "getSearchOptions", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SearchDialogOptions {
                private final t event;

                @NotNull
                private final String placeholder;

                @NotNull
                private final String query;

                @NotNull
                private final FormBuilderBlockVO.Field.YandexSearchField.SearchOptions searchOptions;

                @NotNull
                private final String title;

                public SearchDialogOptions(@NotNull String title, @NotNull String placeholder, @NotNull String query, t tVar, @NotNull FormBuilderBlockVO.Field.YandexSearchField.SearchOptions searchOptions) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                    Intrinsics.checkNotNullParameter(query, "query");
                    Intrinsics.checkNotNullParameter(searchOptions, "searchOptions");
                    this.title = title;
                    this.placeholder = placeholder;
                    this.query = query;
                    this.event = tVar;
                    this.searchOptions = searchOptions;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SearchDialogOptions)) {
                        return false;
                    }
                    SearchDialogOptions searchDialogOptions = (SearchDialogOptions) other;
                    return Intrinsics.d(this.title, searchDialogOptions.title) && Intrinsics.d(this.placeholder, searchDialogOptions.placeholder) && Intrinsics.d(this.query, searchDialogOptions.query) && Intrinsics.d(this.event, searchDialogOptions.event) && Intrinsics.d(this.searchOptions, searchDialogOptions.searchOptions);
                }

                public final t getEvent() {
                    return this.event;
                }

                @NotNull
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                @NotNull
                public final String getQuery() {
                    return this.query;
                }

                @NotNull
                public final FormBuilderBlockVO.Field.YandexSearchField.SearchOptions getSearchOptions() {
                    return this.searchOptions;
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int a11 = g.a(g.a(this.title.hashCode() * 31, 31, this.placeholder), 31, this.query);
                    t tVar = this.event;
                    return this.searchOptions.hashCode() + ((a11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
                }

                @NotNull
                public String toString() {
                    String str = this.title;
                    String str2 = this.placeholder;
                    String str3 = this.query;
                    t tVar = this.event;
                    FormBuilderBlockVO.Field.YandexSearchField.SearchOptions searchOptions = this.searchOptions;
                    StringBuilder d11 = C3660k.d("SearchDialogOptions(title=", str, ", placeholder=", str2, ", query=");
                    d11.append(str3);
                    d11.append(", event=");
                    d11.append(tVar);
                    d11.append(", searchOptions=");
                    d11.append(searchOptions);
                    d11.append(")");
                    return d11.toString();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SearchIcon(@NotNull String title, @NotNull String icon, @NotNull SearchDialogOptions searchDialogOptions, t tVar) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(searchDialogOptions, "searchDialogOptions");
                this.title = title;
                this.icon = icon;
                this.searchDialogOptions = searchDialogOptions;
                this.event = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SearchIcon)) {
                    return false;
                }
                SearchIcon searchIcon = (SearchIcon) other;
                return Intrinsics.d(this.title, searchIcon.title) && Intrinsics.d(this.icon, searchIcon.icon) && Intrinsics.d(this.searchDialogOptions, searchIcon.searchDialogOptions) && Intrinsics.d(this.event, searchIcon.event);
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            public final SearchDialogOptions getSearchDialogOptions() {
                return this.searchDialogOptions;
            }

            public int hashCode() {
                int hashCode = (this.searchDialogOptions.hashCode() + g.a(this.title.hashCode() * 31, 31, this.icon)) * 31;
                t tVar = this.event;
                return hashCode + (tVar == null ? 0 : tVar.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.title;
                String str2 = this.icon;
                SearchDialogOptions searchDialogOptions = this.searchDialogOptions;
                t tVar = this.event;
                StringBuilder d11 = C3660k.d("SearchIcon(title=", str, ", icon=", str2, ", searchDialogOptions=");
                d11.append(searchDialogOptions);
                d11.append(", event=");
                d11.append(tVar);
                d11.append(")");
                return d11.toString();
            }
        }

        public /* synthetic */ MapIcon(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private MapIcon() {
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b/\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b0\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b1\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b2\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b3\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b4\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b;\u0010 R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b\u0014\u0010=R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0019\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010<\u001a\u0004\b\u0019\u0010=R\u0017\u0010\u001a\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u0010<\u001a\u0004\bD\u0010=R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObject;", "", "", "uid", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;", "type", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "coordinates", "pinsCount", "pinsCountColor", "image", "imageTintColor", "tintColor", "borderColor", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "viewport", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;", "additionalContent", "actionLink", "", "isSelected", "", "zPriority", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObjectCacheKey;", "cacheHash", "isClickEnabled", "ignoreCollapsedState", "LWZ/t;", "event", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;Ljava/lang/String;ZFLru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObjectCacheKey;ZZLWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUid", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;", "getType", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "getCoordinates", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "getPinsCount", "getPinsCountColor", "getImage", "getImageTintColor", "getTintColor", "getBorderColor", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "getViewport", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;", "getAdditionalContent", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;", "getActionLink", "Z", "()Z", "F", "getZPriority", "()F", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObjectCacheKey;", "getCacheHash", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObjectCacheKey;", "getIgnoreCollapsedState", "LWZ/t;", "getEvent", "()LWZ/t;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapObject {

        @NotNull
        private final String actionLink;
        private final AddressEditMapDTO.AdditionalPinContent additionalContent;
        private final String borderColor;

        @NotNull
        private final MapObjectCacheKey cacheHash;

        @NotNull
        private final Coordinate coordinates;
        private final t event;
        private final boolean ignoreCollapsedState;
        private final String image;
        private final String imageTintColor;
        private final boolean isClickEnabled;
        private final boolean isSelected;
        private final String pinsCount;
        private final String pinsCountColor;
        private final String tintColor;

        @NotNull
        private final AddressEditMapDTO.MapObject.Type type;

        @NotNull
        private final String uid;
        private final ViewPort viewport;
        private final float zPriority;

        public MapObject(@NotNull String uid, @NotNull AddressEditMapDTO.MapObject.Type type, @NotNull Coordinate coordinates, String str, String str2, String str3, String str4, String str5, String str6, ViewPort viewPort, AddressEditMapDTO.AdditionalPinContent additionalPinContent, @NotNull String actionLink, boolean z11, float f7, @NotNull MapObjectCacheKey cacheHash, boolean z12, boolean z13, t tVar) {
            Intrinsics.checkNotNullParameter(uid, "uid");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Intrinsics.checkNotNullParameter(actionLink, "actionLink");
            Intrinsics.checkNotNullParameter(cacheHash, "cacheHash");
            this.uid = uid;
            this.type = type;
            this.coordinates = coordinates;
            this.pinsCount = str;
            this.pinsCountColor = str2;
            this.image = str3;
            this.imageTintColor = str4;
            this.tintColor = str5;
            this.borderColor = str6;
            this.viewport = viewPort;
            this.additionalContent = additionalPinContent;
            this.actionLink = actionLink;
            this.isSelected = z11;
            this.zPriority = f7;
            this.cacheHash = cacheHash;
            this.isClickEnabled = z12;
            this.ignoreCollapsedState = z13;
            this.event = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapObject)) {
                return false;
            }
            MapObject mapObject = (MapObject) other;
            return Intrinsics.d(this.uid, mapObject.uid) && this.type == mapObject.type && Intrinsics.d(this.coordinates, mapObject.coordinates) && Intrinsics.d(this.pinsCount, mapObject.pinsCount) && Intrinsics.d(this.pinsCountColor, mapObject.pinsCountColor) && Intrinsics.d(this.image, mapObject.image) && Intrinsics.d(this.imageTintColor, mapObject.imageTintColor) && Intrinsics.d(this.tintColor, mapObject.tintColor) && Intrinsics.d(this.borderColor, mapObject.borderColor) && Intrinsics.d(this.viewport, mapObject.viewport) && Intrinsics.d(this.additionalContent, mapObject.additionalContent) && Intrinsics.d(this.actionLink, mapObject.actionLink) && this.isSelected == mapObject.isSelected && Float.compare(this.zPriority, mapObject.zPriority) == 0 && Intrinsics.d(this.cacheHash, mapObject.cacheHash) && this.isClickEnabled == mapObject.isClickEnabled && this.ignoreCollapsedState == mapObject.ignoreCollapsedState && Intrinsics.d(this.event, mapObject.event);
        }

        @NotNull
        public final String getActionLink() {
            return this.actionLink;
        }

        public final AddressEditMapDTO.AdditionalPinContent getAdditionalContent() {
            return this.additionalContent;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final MapObjectCacheKey getCacheHash() {
            return this.cacheHash;
        }

        @NotNull
        public final Coordinate getCoordinates() {
            return this.coordinates;
        }

        public final t getEvent() {
            return this.event;
        }

        public final boolean getIgnoreCollapsedState() {
            return this.ignoreCollapsedState;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getImageTintColor() {
            return this.imageTintColor;
        }

        public final String getPinsCount() {
            return this.pinsCount;
        }

        public final String getPinsCountColor() {
            return this.pinsCountColor;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        public final AddressEditMapDTO.MapObject.Type getType() {
            return this.type;
        }

        @NotNull
        public final String getUid() {
            return this.uid;
        }

        public final ViewPort getViewport() {
            return this.viewport;
        }

        public final float getZPriority() {
            return this.zPriority;
        }

        public int hashCode() {
            int hashCode = (this.coordinates.hashCode() + ((this.type.hashCode() + (this.uid.hashCode() * 31)) * 31)) * 31;
            String str = this.pinsCount;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.pinsCountColor;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.image;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.imageTintColor;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.tintColor;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.borderColor;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            ViewPort viewPort = this.viewport;
            int hashCode8 = (hashCode7 + (viewPort == null ? 0 : viewPort.hashCode())) * 31;
            AddressEditMapDTO.AdditionalPinContent additionalPinContent = this.additionalContent;
            int a11 = C3532b.a(C3532b.a((this.cacheHash.hashCode() + b.a(this.zPriority, C3532b.a(g.a((hashCode8 + (additionalPinContent == null ? 0 : additionalPinContent.hashCode())) * 31, 31, this.actionLink), 31, this.isSelected), 31)) * 31, 31, this.isClickEnabled), 31, this.ignoreCollapsedState);
            t tVar = this.event;
            return a11 + (tVar != null ? tVar.hashCode() : 0);
        }

        /* renamed from: isClickEnabled, reason: from getter */
        public final boolean getIsClickEnabled() {
            return this.isClickEnabled;
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.uid;
            AddressEditMapDTO.MapObject.Type type = this.type;
            Coordinate coordinate = this.coordinates;
            String str2 = this.pinsCount;
            String str3 = this.pinsCountColor;
            String str4 = this.image;
            String str5 = this.imageTintColor;
            String str6 = this.tintColor;
            String str7 = this.borderColor;
            ViewPort viewPort = this.viewport;
            AddressEditMapDTO.AdditionalPinContent additionalPinContent = this.additionalContent;
            String str8 = this.actionLink;
            boolean z11 = this.isSelected;
            float f7 = this.zPriority;
            MapObjectCacheKey mapObjectCacheKey = this.cacheHash;
            boolean z12 = this.isClickEnabled;
            boolean z13 = this.ignoreCollapsedState;
            t tVar = this.event;
            StringBuilder sb2 = new StringBuilder("MapObject(uid=");
            sb2.append(str);
            sb2.append(", type=");
            sb2.append(type);
            sb2.append(", coordinates=");
            sb2.append(coordinate);
            sb2.append(", pinsCount=");
            sb2.append(str2);
            sb2.append(", pinsCountColor=");
            Nh.a.h(sb2, str3, ", image=", str4, ", imageTintColor=");
            Nh.a.h(sb2, str5, ", tintColor=", str6, ", borderColor=");
            sb2.append(str7);
            sb2.append(", viewport=");
            sb2.append(viewPort);
            sb2.append(", additionalContent=");
            sb2.append(additionalPinContent);
            sb2.append(", actionLink=");
            sb2.append(str8);
            sb2.append(", isSelected=");
            sb2.append(z11);
            sb2.append(", zPriority=");
            sb2.append(f7);
            sb2.append(", cacheHash=");
            sb2.append(mapObjectCacheKey);
            sb2.append(", isClickEnabled=");
            sb2.append(z12);
            sb2.append(", ignoreCollapsedState=");
            sb2.append(z13);
            sb2.append(", event=");
            sb2.append(tVar);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0088\u0001\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b$\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b%\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b&\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b\u000e\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b\u000f\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObjectCacheKey;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$CacheKey;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;", "type", "", "pinsCount", "image", "tintColor", "pinsCountColor", "borderColor", "imageTintColor", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;", "additionalContent", "", "isSelected", "isCollapsed", "<init>", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "copy", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObjectCacheKey;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;", "getType", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;", "Ljava/lang/String;", "getPinsCount", "getImage", "getTintColor", "getPinsCountColor", "getBorderColor", "getImageTintColor", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;", "getAdditionalContent", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapObjectCacheKey implements CacheKey {
        private final AddressEditMapDTO.AdditionalPinContent additionalContent;
        private final String borderColor;
        private final String image;
        private final String imageTintColor;
        private final Boolean isCollapsed;
        private final Boolean isSelected;
        private final String pinsCount;
        private final String pinsCountColor;
        private final String tintColor;
        private final AddressEditMapDTO.MapObject.Type type;

        public MapObjectCacheKey() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        public static /* synthetic */ MapObjectCacheKey copy$default(MapObjectCacheKey mapObjectCacheKey, AddressEditMapDTO.MapObject.Type type, String str, String str2, String str3, String str4, String str5, String str6, AddressEditMapDTO.AdditionalPinContent additionalPinContent, Boolean bool, Boolean bool2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                type = mapObjectCacheKey.type;
            }
            if ((i11 & 2) != 0) {
                str = mapObjectCacheKey.pinsCount;
            }
            if ((i11 & 4) != 0) {
                str2 = mapObjectCacheKey.image;
            }
            if ((i11 & 8) != 0) {
                str3 = mapObjectCacheKey.tintColor;
            }
            if ((i11 & 16) != 0) {
                str4 = mapObjectCacheKey.pinsCountColor;
            }
            if ((i11 & 32) != 0) {
                str5 = mapObjectCacheKey.borderColor;
            }
            if ((i11 & 64) != 0) {
                str6 = mapObjectCacheKey.imageTintColor;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                additionalPinContent = mapObjectCacheKey.additionalContent;
            }
            if ((i11 & 256) != 0) {
                bool = mapObjectCacheKey.isSelected;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                bool2 = mapObjectCacheKey.isCollapsed;
            }
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            String str7 = str6;
            AddressEditMapDTO.AdditionalPinContent additionalPinContent2 = additionalPinContent;
            String str8 = str4;
            String str9 = str5;
            return mapObjectCacheKey.copy(type, str, str2, str3, str8, str9, str7, additionalPinContent2, bool3, bool4);
        }

        @NotNull
        public final MapObjectCacheKey copy(AddressEditMapDTO.MapObject.Type type, String pinsCount, String image, String tintColor, String pinsCountColor, String borderColor, String imageTintColor, AddressEditMapDTO.AdditionalPinContent additionalContent, Boolean isSelected, Boolean isCollapsed) {
            return new MapObjectCacheKey(type, pinsCount, image, tintColor, pinsCountColor, borderColor, imageTintColor, additionalContent, isSelected, isCollapsed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapObjectCacheKey)) {
                return false;
            }
            MapObjectCacheKey mapObjectCacheKey = (MapObjectCacheKey) other;
            return this.type == mapObjectCacheKey.type && Intrinsics.d(this.pinsCount, mapObjectCacheKey.pinsCount) && Intrinsics.d(this.image, mapObjectCacheKey.image) && Intrinsics.d(this.tintColor, mapObjectCacheKey.tintColor) && Intrinsics.d(this.pinsCountColor, mapObjectCacheKey.pinsCountColor) && Intrinsics.d(this.borderColor, mapObjectCacheKey.borderColor) && Intrinsics.d(this.imageTintColor, mapObjectCacheKey.imageTintColor) && Intrinsics.d(this.additionalContent, mapObjectCacheKey.additionalContent) && Intrinsics.d(this.isSelected, mapObjectCacheKey.isSelected) && Intrinsics.d(this.isCollapsed, mapObjectCacheKey.isCollapsed);
        }

        public int hashCode() {
            AddressEditMapDTO.MapObject.Type type = this.type;
            int hashCode = (type == null ? 0 : type.hashCode()) * 31;
            String str = this.pinsCount;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.image;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tintColor;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.pinsCountColor;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.borderColor;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.imageTintColor;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            AddressEditMapDTO.AdditionalPinContent additionalPinContent = this.additionalContent;
            int hashCode8 = (hashCode7 + (additionalPinContent == null ? 0 : additionalPinContent.hashCode())) * 31;
            Boolean bool = this.isSelected;
            int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isCollapsed;
            return hashCode9 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            AddressEditMapDTO.MapObject.Type type = this.type;
            String str = this.pinsCount;
            String str2 = this.image;
            String str3 = this.tintColor;
            String str4 = this.pinsCountColor;
            String str5 = this.borderColor;
            String str6 = this.imageTintColor;
            AddressEditMapDTO.AdditionalPinContent additionalPinContent = this.additionalContent;
            Boolean bool = this.isSelected;
            Boolean bool2 = this.isCollapsed;
            StringBuilder sb2 = new StringBuilder("MapObjectCacheKey(type=");
            sb2.append(type);
            sb2.append(", pinsCount=");
            sb2.append(str);
            sb2.append(", image=");
            Nh.a.h(sb2, str2, ", tintColor=", str3, ", pinsCountColor=");
            Nh.a.h(sb2, str4, ", borderColor=", str5, ", imageTintColor=");
            sb2.append(str6);
            sb2.append(", additionalContent=");
            sb2.append(additionalPinContent);
            sb2.append(", isSelected=");
            sb2.append(bool);
            sb2.append(", isCollapsed=");
            sb2.append(bool2);
            sb2.append(")");
            return sb2.toString();
        }

        public MapObjectCacheKey(AddressEditMapDTO.MapObject.Type type, String str, String str2, String str3, String str4, String str5, String str6, AddressEditMapDTO.AdditionalPinContent additionalPinContent, Boolean bool, Boolean bool2) {
            this.type = type;
            this.pinsCount = str;
            this.image = str2;
            this.tintColor = str3;
            this.pinsCountColor = str4;
            this.borderColor = str5;
            this.imageTintColor = str6;
            this.additionalContent = additionalPinContent;
            this.isSelected = bool;
            this.isCollapsed = bool2;
        }

        public /* synthetic */ MapObjectCacheKey(AddressEditMapDTO.MapObject.Type type, String str, String str2, String str3, String str4, String str5, String str6, AddressEditMapDTO.AdditionalPinContent additionalPinContent, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : type, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : additionalPinContent, (i11 & 256) != 0 ? Boolean.FALSE : bool, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? Boolean.FALSE : bool2);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MetaInfo;", "", "", "debounceDelay", "<init>", "(Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getDebounceDelay", "()Ljava/lang/Integer;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MetaInfo {
        private final Integer debounceDelay;

        public MetaInfo(Integer num) {
            this.debounceDelay = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MetaInfo) && Intrinsics.d(this.debounceDelay, ((MetaInfo) other).debounceDelay);
        }

        public final Integer getDebounceDelay() {
            return this.debounceDelay;
        }

        public int hashCode() {
            Integer num = this.debounceDelay;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @NotNull
        public String toString() {
            return "MetaInfo(debounceDelay=" + this.debounceDelay + ")";
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010\u0013¨\u0006/"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MiniAppHeader;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "logo", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightButton", "", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getLogo", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Ljava/lang/String;", "getBackgroundColor", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MiniAppHeader {
        private final AtomAction action;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final ImageDTO logo;

        @NotNull
        private final IconButtonV3DTO rightButton;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;

        public MiniAppHeader(@NotNull TextDTO title, @NotNull IconDTO icon, @NotNull ImageDTO logo, AtomAction atomAction, t tVar, @NotNull IconButtonV3DTO rightButton, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(logo, "logo");
            Intrinsics.checkNotNullParameter(rightButton, "rightButton");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.title = title;
            this.icon = icon;
            this.logo = logo;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
            this.rightButton = rightButton;
            this.backgroundColor = backgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MiniAppHeader)) {
                return false;
            }
            MiniAppHeader miniAppHeader = (MiniAppHeader) other;
            return Intrinsics.d(this.title, miniAppHeader.title) && Intrinsics.d(this.icon, miniAppHeader.icon) && Intrinsics.d(this.logo, miniAppHeader.logo) && Intrinsics.d(this.action, miniAppHeader.action) && Intrinsics.d(this.tokenizedEvent, miniAppHeader.tokenizedEvent) && Intrinsics.d(this.rightButton, miniAppHeader.rightButton) && Intrinsics.d(this.backgroundColor, miniAppHeader.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final ImageDTO getLogo() {
            return this.logo;
        }

        @NotNull
        public final IconButtonV3DTO getRightButton() {
            return this.rightButton;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b11 = Nh.a.b(this.logo, C2971a.a(this.icon, this.title.hashCode() * 31, 31), 31);
            AtomAction atomAction = this.action;
            int hashCode = (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return this.backgroundColor.hashCode() + GR.b.c(this.rightButton, (hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31, 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.icon;
            ImageDTO imageDTO = this.logo;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            IconButtonV3DTO iconButtonV3DTO = this.rightButton;
            String str = this.backgroundColor;
            StringBuilder d11 = C2639a.d("MiniAppHeader(title=", ", icon=", ", logo=", iconDTO, textDTO);
            d11.append(imageDTO);
            d11.append(", action=");
            d11.append(atomAction);
            d11.append(", tokenizedEvent=");
            d11.append(tVar);
            d11.append(", rightButton=");
            d11.append(iconButtonV3DTO);
            d11.append(", backgroundColor=");
            return o0.c(d11, str, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "number", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NumberPVZ {
        private final AtomAction action;

        @NotNull
        private final TextDTO number;

        public NumberPVZ(@NotNull TextDTO number, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(number, "number");
            this.number = number;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NumberPVZ)) {
                return false;
            }
            NumberPVZ numberPVZ = (NumberPVZ) other;
            return Intrinsics.d(this.number, numberPVZ.number) && Intrinsics.d(this.action, numberPVZ.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final TextDTO getNumber() {
            return this.number;
        }

        public int hashCode() {
            int hashCode = this.number.hashCode() * 31;
            AtomAction atomAction = this.action;
            return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            return "NumberPVZ(number=" + this.number + ", action=" + this.action + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;", "", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "coordinate", "", "icon", "pinsCount", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin$Badge;", "badge", "<init>", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin$Badge;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "getCoordinate", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "Ljava/lang/String;", "getIcon", "getPinsCount", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin$Badge;", "getBadge", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin$Badge;", "Badge", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pin {
        private final Badge badge;

        @NotNull
        private final Coordinate coordinate;

        @NotNull
        private final String icon;
        private final String pinsCount;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin$Badge;", "", "", "color", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColor", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Badge {

            @NotNull
            private final String color;

            public Badge(@NotNull String color) {
                Intrinsics.checkNotNullParameter(color, "color");
                this.color = color;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Badge) && Intrinsics.d(this.color, ((Badge) other).color);
            }

            @NotNull
            public final String getColor() {
                return this.color;
            }

            public int hashCode() {
                return this.color.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Badge(color=", this.color, ")");
            }
        }

        public Pin(@NotNull Coordinate coordinate, @NotNull String icon, String str, Badge badge) {
            Intrinsics.checkNotNullParameter(coordinate, "coordinate");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.coordinate = coordinate;
            this.icon = icon;
            this.pinsCount = str;
            this.badge = badge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return Intrinsics.d(this.coordinate, pin.coordinate) && Intrinsics.d(this.icon, pin.icon) && Intrinsics.d(this.pinsCount, pin.pinsCount) && Intrinsics.d(this.badge, pin.badge);
        }

        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        public final Coordinate getCoordinate() {
            return this.coordinate;
        }

        public final String getPinsCount() {
            return this.pinsCount;
        }

        public int hashCode() {
            int a11 = g.a(this.coordinate.hashCode() * 31, 31, this.icon);
            String str = this.pinsCount;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            Badge badge = this.badge;
            return hashCode + (badge != null ? badge.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Pin(coordinate=" + this.coordinate + ", icon=" + this.icon + ", pinsCount=" + this.pinsCount + ", badge=" + this.badge + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$PinCacheKey;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$CacheKey;", "", "locationMarker", "", "showTooltip", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLocationMarker", "Ljava/lang/Boolean;", "getShowTooltip", "()Ljava/lang/Boolean;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PinCacheKey implements CacheKey {
        private final String locationMarker;
        private final Boolean showTooltip;

        /* JADX WARN: Multi-variable type inference failed */
        public PinCacheKey() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PinCacheKey)) {
                return false;
            }
            PinCacheKey pinCacheKey = (PinCacheKey) other;
            return Intrinsics.d(this.locationMarker, pinCacheKey.locationMarker) && Intrinsics.d(this.showTooltip, pinCacheKey.showTooltip);
        }

        public int hashCode() {
            String str = this.locationMarker;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.showTooltip;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PinCacheKey(locationMarker=" + this.locationMarker + ", showTooltip=" + this.showTooltip + ")";
        }

        public PinCacheKey(String str, Boolean bool) {
            this.locationMarker = str;
            this.showTooltip = bool;
        }

        public /* synthetic */ PinCacheKey(String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Selector;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "selected", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "LWZ/t;", "event", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "type", "<init>", "(Ljava/lang/String;ZLru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Z", "getSelected", "()Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "LWZ/t;", "getEvent", "()LWZ/t;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "getType", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Selector {

        @NotNull
        private final AtomActionDTO action;
        private final t event;
        private final boolean selected;

        @NotNull
        private final String title;

        @NotNull
        private final AddressEditMapDTO.Selector.Type type;

        public Selector(@NotNull String title, boolean z11, @NotNull AtomActionDTO action, t tVar, @NotNull AddressEditMapDTO.Selector.Type type) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(type, "type");
            this.title = title;
            this.selected = z11;
            this.action = action;
            this.event = tVar;
            this.type = type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selector)) {
                return false;
            }
            Selector selector = (Selector) other;
            return Intrinsics.d(this.title, selector.title) && this.selected == selector.selected && Intrinsics.d(this.action, selector.action) && Intrinsics.d(this.event, selector.event) && this.type == selector.type;
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final t getEvent() {
            return this.event;
        }

        public final boolean getSelected() {
            return this.selected;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final AddressEditMapDTO.Selector.Type getType() {
            return this.type;
        }

        public int hashCode() {
            int b11 = Ih.a.b(this.action, C3532b.a(this.title.hashCode() * 31, 31, this.selected), 31);
            t tVar = this.event;
            return this.type.hashCode() + ((b11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            boolean z11 = this.selected;
            AtomActionDTO atomActionDTO = this.action;
            t tVar = this.event;
            AddressEditMapDTO.Selector.Type type = this.type;
            StringBuilder b11 = C4636t5.b("Selector(title=", str, ", selected=", ", action=", z11);
            b11.append(atomActionDTO);
            b11.append(", event=");
            b11.append(tVar);
            b11.append(", type=");
            b11.append(type);
            b11.append(")");
            return b11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "", "leftBottom", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "rightTop", "<init>", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;)V", "getLeftBottom", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "getRightTop", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewPort {

        @NotNull
        private final Coordinate leftBottom;

        @NotNull
        private final Coordinate rightTop;

        public ViewPort(@NotNull Coordinate leftBottom, @NotNull Coordinate rightTop) {
            Intrinsics.checkNotNullParameter(leftBottom, "leftBottom");
            Intrinsics.checkNotNullParameter(rightTop, "rightTop");
            this.leftBottom = leftBottom;
            this.rightTop = rightTop;
        }

        public static /* synthetic */ ViewPort copy$default(ViewPort viewPort, Coordinate coordinate, Coordinate coordinate2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                coordinate = viewPort.leftBottom;
            }
            if ((i11 & 2) != 0) {
                coordinate2 = viewPort.rightTop;
            }
            return viewPort.copy(coordinate, coordinate2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Coordinate getLeftBottom() {
            return this.leftBottom;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Coordinate getRightTop() {
            return this.rightTop;
        }

        @NotNull
        public final ViewPort copy(@NotNull Coordinate leftBottom, @NotNull Coordinate rightTop) {
            Intrinsics.checkNotNullParameter(leftBottom, "leftBottom");
            Intrinsics.checkNotNullParameter(rightTop, "rightTop");
            return new ViewPort(leftBottom, rightTop);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewPort)) {
                return false;
            }
            ViewPort viewPort = (ViewPort) other;
            return Intrinsics.d(this.leftBottom, viewPort.leftBottom) && Intrinsics.d(this.rightTop, viewPort.rightTop);
        }

        @NotNull
        public final Coordinate getLeftBottom() {
            return this.leftBottom;
        }

        @NotNull
        public final Coordinate getRightTop() {
            return this.rightTop;
        }

        public int hashCode() {
            return this.rightTop.hashCode() + (this.leftBottom.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ViewPort(leftBottom=" + this.leftBottom + ", rightTop=" + this.rightTop + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditMapVO(long j11, boolean z11, @NotNull Pin centerPin, AtomActionDTO atomActionDTO, List<BadgeDTO> list, LocationMarker locationMarker, ViewPort viewPort, String str, String str2, @NotNull List<? extends MapIcon> icons, MapIcon.BannerIcon bannerIcon, List<Selector> list2, TabsDTO tabsDTO, boolean z12, String str3, String str4, t tVar, MetaInfo metaInfo, boolean z13, boolean z14, boolean z15, List<MapObject> list3, MiniAppHeader miniAppHeader, t tVar2, NumberPVZ numberPVZ, boolean z16, boolean z17, String str5, String str6) {
        Intrinsics.checkNotNullParameter(centerPin, "centerPin");
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.id = j11;
        this.showCenterPin = z11;
        this.centerPin = centerPin;
        this.bottomSheetAction = atomActionDTO;
        this.bottomSheetBadges = list;
        this.userLocationMarker = locationMarker;
        this.viewPort = viewPort;
        this.linkTplDragCenter = str;
        this.linkTplZoomInOut = str2;
        this.icons = icons;
        this.bannerIcon = bannerIcon;
        this.selector = list2;
        this.dsTabs = tabsDTO;
        this.isShowNavbarBackground = z12;
        this.navbarTitle = str3;
        this.navbarSubtitle = str4;
        this.event = tVar;
        this.metaInfo = metaInfo;
        this.processApplicationMove = z13;
        this.geolocationOnInit = z14;
        this.processInitializeMap = z15;
        this.mapObjects = list3;
        this.miniAppHeader = miniAppHeader;
        this.bottomSheetTokenizedEvent = tVar2;
        this.numberPVZ = numberPVZ;
        this.clusterizationEnabled = z16;
        this.isNeedStartClusterization = z17;
        this.mergedPinsActionBaseLink = str5;
        this.actionBaseLink = str6;
    }

    public static /* synthetic */ AddressEditMapVO copy$default(AddressEditMapVO addressEditMapVO, long j11, boolean z11, Pin pin, AtomActionDTO atomActionDTO, List list, LocationMarker locationMarker, ViewPort viewPort, String str, String str2, List list2, MapIcon.BannerIcon bannerIcon, List list3, TabsDTO tabsDTO, boolean z12, String str3, String str4, t tVar, MetaInfo metaInfo, boolean z13, boolean z14, boolean z15, List list4, MiniAppHeader miniAppHeader, t tVar2, NumberPVZ numberPVZ, boolean z16, boolean z17, String str5, String str6, int i11, Object obj) {
        String str7;
        String str8;
        long j12 = (i11 & 1) != 0 ? addressEditMapVO.id : j11;
        boolean z18 = (i11 & 2) != 0 ? addressEditMapVO.showCenterPin : z11;
        Pin pin2 = (i11 & 4) != 0 ? addressEditMapVO.centerPin : pin;
        AtomActionDTO atomActionDTO2 = (i11 & 8) != 0 ? addressEditMapVO.bottomSheetAction : atomActionDTO;
        List list5 = (i11 & 16) != 0 ? addressEditMapVO.bottomSheetBadges : list;
        LocationMarker locationMarker2 = (i11 & 32) != 0 ? addressEditMapVO.userLocationMarker : locationMarker;
        ViewPort viewPort2 = (i11 & 64) != 0 ? addressEditMapVO.viewPort : viewPort;
        String str9 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? addressEditMapVO.linkTplDragCenter : str;
        String str10 = (i11 & 256) != 0 ? addressEditMapVO.linkTplZoomInOut : str2;
        List list6 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? addressEditMapVO.icons : list2;
        MapIcon.BannerIcon bannerIcon2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? addressEditMapVO.bannerIcon : bannerIcon;
        List list7 = (i11 & 2048) != 0 ? addressEditMapVO.selector : list3;
        TabsDTO tabsDTO2 = (i11 & 4096) != 0 ? addressEditMapVO.dsTabs : tabsDTO;
        long j13 = j12;
        boolean z19 = (i11 & 8192) != 0 ? addressEditMapVO.isShowNavbarBackground : z12;
        String str11 = (i11 & 16384) != 0 ? addressEditMapVO.navbarTitle : str3;
        String str12 = (i11 & 32768) != 0 ? addressEditMapVO.navbarSubtitle : str4;
        t tVar3 = (i11 & 65536) != 0 ? addressEditMapVO.event : tVar;
        MetaInfo metaInfo2 = (i11 & 131072) != 0 ? addressEditMapVO.metaInfo : metaInfo;
        boolean z21 = (i11 & 262144) != 0 ? addressEditMapVO.processApplicationMove : z13;
        boolean z22 = (i11 & 524288) != 0 ? addressEditMapVO.geolocationOnInit : z14;
        boolean z23 = (i11 & 1048576) != 0 ? addressEditMapVO.processInitializeMap : z15;
        List list8 = (i11 & 2097152) != 0 ? addressEditMapVO.mapObjects : list4;
        MiniAppHeader miniAppHeader2 = (i11 & 4194304) != 0 ? addressEditMapVO.miniAppHeader : miniAppHeader;
        t tVar4 = (i11 & 8388608) != 0 ? addressEditMapVO.bottomSheetTokenizedEvent : tVar2;
        NumberPVZ numberPVZ2 = (i11 & 16777216) != 0 ? addressEditMapVO.numberPVZ : numberPVZ;
        boolean z24 = (i11 & 33554432) != 0 ? addressEditMapVO.clusterizationEnabled : z16;
        boolean z25 = (i11 & 67108864) != 0 ? addressEditMapVO.isNeedStartClusterization : z17;
        String str13 = (i11 & 134217728) != 0 ? addressEditMapVO.mergedPinsActionBaseLink : str5;
        if ((i11 & 268435456) != 0) {
            str8 = str13;
            str7 = addressEditMapVO.actionBaseLink;
        } else {
            str7 = str6;
            str8 = str13;
        }
        return addressEditMapVO.copy(j13, z18, pin2, atomActionDTO2, list5, locationMarker2, viewPort2, str9, str10, list6, bannerIcon2, list7, tabsDTO2, z19, str11, str12, tVar3, metaInfo2, z21, z22, z23, list8, miniAppHeader2, tVar4, numberPVZ2, z24, z25, str8, str7);
    }

    @NotNull
    public final AddressEditMapVO copy(long id2, boolean showCenterPin, @NotNull Pin centerPin, AtomActionDTO bottomSheetAction, List<BadgeDTO> bottomSheetBadges, LocationMarker userLocationMarker, ViewPort viewPort, String linkTplDragCenter, String linkTplZoomInOut, @NotNull List<? extends MapIcon> icons, MapIcon.BannerIcon bannerIcon, List<Selector> selector, TabsDTO dsTabs, boolean isShowNavbarBackground, String navbarTitle, String navbarSubtitle, t event, MetaInfo metaInfo, boolean processApplicationMove, boolean geolocationOnInit, boolean processInitializeMap, List<MapObject> mapObjects, MiniAppHeader miniAppHeader, t bottomSheetTokenizedEvent, NumberPVZ numberPVZ, boolean clusterizationEnabled, boolean isNeedStartClusterization, String mergedPinsActionBaseLink, String actionBaseLink) {
        Intrinsics.checkNotNullParameter(centerPin, "centerPin");
        Intrinsics.checkNotNullParameter(icons, "icons");
        return new AddressEditMapVO(id2, showCenterPin, centerPin, bottomSheetAction, bottomSheetBadges, userLocationMarker, viewPort, linkTplDragCenter, linkTplZoomInOut, icons, bannerIcon, selector, dsTabs, isShowNavbarBackground, navbarTitle, navbarSubtitle, event, metaInfo, processApplicationMove, geolocationOnInit, processInitializeMap, mapObjects, miniAppHeader, bottomSheetTokenizedEvent, numberPVZ, clusterizationEnabled, isNeedStartClusterization, mergedPinsActionBaseLink, actionBaseLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditMapVO)) {
            return false;
        }
        AddressEditMapVO addressEditMapVO = (AddressEditMapVO) other;
        return this.id == addressEditMapVO.id && this.showCenterPin == addressEditMapVO.showCenterPin && Intrinsics.d(this.centerPin, addressEditMapVO.centerPin) && Intrinsics.d(this.bottomSheetAction, addressEditMapVO.bottomSheetAction) && Intrinsics.d(this.bottomSheetBadges, addressEditMapVO.bottomSheetBadges) && Intrinsics.d(this.userLocationMarker, addressEditMapVO.userLocationMarker) && Intrinsics.d(this.viewPort, addressEditMapVO.viewPort) && Intrinsics.d(this.linkTplDragCenter, addressEditMapVO.linkTplDragCenter) && Intrinsics.d(this.linkTplZoomInOut, addressEditMapVO.linkTplZoomInOut) && Intrinsics.d(this.icons, addressEditMapVO.icons) && Intrinsics.d(this.bannerIcon, addressEditMapVO.bannerIcon) && Intrinsics.d(this.selector, addressEditMapVO.selector) && Intrinsics.d(this.dsTabs, addressEditMapVO.dsTabs) && this.isShowNavbarBackground == addressEditMapVO.isShowNavbarBackground && Intrinsics.d(this.navbarTitle, addressEditMapVO.navbarTitle) && Intrinsics.d(this.navbarSubtitle, addressEditMapVO.navbarSubtitle) && Intrinsics.d(this.event, addressEditMapVO.event) && Intrinsics.d(this.metaInfo, addressEditMapVO.metaInfo) && this.processApplicationMove == addressEditMapVO.processApplicationMove && this.geolocationOnInit == addressEditMapVO.geolocationOnInit && this.processInitializeMap == addressEditMapVO.processInitializeMap && Intrinsics.d(this.mapObjects, addressEditMapVO.mapObjects) && Intrinsics.d(this.miniAppHeader, addressEditMapVO.miniAppHeader) && Intrinsics.d(this.bottomSheetTokenizedEvent, addressEditMapVO.bottomSheetTokenizedEvent) && Intrinsics.d(this.numberPVZ, addressEditMapVO.numberPVZ) && this.clusterizationEnabled == addressEditMapVO.clusterizationEnabled && this.isNeedStartClusterization == addressEditMapVO.isNeedStartClusterization && Intrinsics.d(this.mergedPinsActionBaseLink, addressEditMapVO.mergedPinsActionBaseLink) && Intrinsics.d(this.actionBaseLink, addressEditMapVO.actionBaseLink);
    }

    public final String getActionBaseLink() {
        return this.actionBaseLink;
    }

    public final MapIcon.BannerIcon getBannerIcon() {
        return this.bannerIcon;
    }

    public final AtomActionDTO getBottomSheetAction() {
        return this.bottomSheetAction;
    }

    public final List<BadgeDTO> getBottomSheetBadges() {
        return this.bottomSheetBadges;
    }

    public final t getBottomSheetTokenizedEvent() {
        return this.bottomSheetTokenizedEvent;
    }

    @NotNull
    public final Pin getCenterPin() {
        return this.centerPin;
    }

    public final boolean getClusterizationEnabled() {
        return this.clusterizationEnabled;
    }

    public final TabsDTO getDsTabs() {
        return this.dsTabs;
    }

    public final t getEvent() {
        return this.event;
    }

    public final boolean getGeolocationOnInit() {
        return this.geolocationOnInit;
    }

    @NotNull
    public final List<MapIcon> getIcons() {
        return this.icons;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getLinkTplDragCenter() {
        return this.linkTplDragCenter;
    }

    public final List<MapObject> getMapObjects() {
        return this.mapObjects;
    }

    public final String getMergedPinsActionBaseLink() {
        return this.mergedPinsActionBaseLink;
    }

    public final MetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    public final MiniAppHeader getMiniAppHeader() {
        return this.miniAppHeader;
    }

    public final String getNavbarSubtitle() {
        return this.navbarSubtitle;
    }

    public final String getNavbarTitle() {
        return this.navbarTitle;
    }

    public final NumberPVZ getNumberPVZ() {
        return this.numberPVZ;
    }

    public final boolean getProcessApplicationMove() {
        return this.processApplicationMove;
    }

    public final boolean getProcessInitializeMap() {
        return this.processInitializeMap;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final List<Selector> getSelector() {
        return this.selector;
    }

    public final boolean getShowCenterPin() {
        return this.showCenterPin;
    }

    public final LocationMarker getUserLocationMarker() {
        return this.userLocationMarker;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final ViewPort getViewPort() {
        return this.viewPort;
    }

    public int hashCode() {
        int hashCode = (this.centerPin.hashCode() + C3532b.a(Long.hashCode(this.id) * 31, 31, this.showCenterPin)) * 31;
        AtomActionDTO atomActionDTO = this.bottomSheetAction;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        List<BadgeDTO> list = this.bottomSheetBadges;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        LocationMarker locationMarker = this.userLocationMarker;
        int hashCode4 = (hashCode3 + (locationMarker == null ? 0 : locationMarker.hashCode())) * 31;
        ViewPort viewPort = this.viewPort;
        int hashCode5 = (hashCode4 + (viewPort == null ? 0 : viewPort.hashCode())) * 31;
        String str = this.linkTplDragCenter;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.linkTplZoomInOut;
        int b11 = g.b((hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.icons);
        MapIcon.BannerIcon bannerIcon = this.bannerIcon;
        int hashCode7 = (b11 + (bannerIcon == null ? 0 : bannerIcon.hashCode())) * 31;
        List<Selector> list2 = this.selector;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        TabsDTO tabsDTO = this.dsTabs;
        int a11 = C3532b.a((hashCode8 + (tabsDTO == null ? 0 : tabsDTO.hashCode())) * 31, 31, this.isShowNavbarBackground);
        String str3 = this.navbarTitle;
        int hashCode9 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.navbarSubtitle;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        t tVar = this.event;
        int hashCode11 = (hashCode10 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        MetaInfo metaInfo = this.metaInfo;
        int a12 = C3532b.a(C3532b.a(C3532b.a((hashCode11 + (metaInfo == null ? 0 : metaInfo.hashCode())) * 31, 31, this.processApplicationMove), 31, this.geolocationOnInit), 31, this.processInitializeMap);
        List<MapObject> list3 = this.mapObjects;
        int hashCode12 = (a12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        MiniAppHeader miniAppHeader = this.miniAppHeader;
        int hashCode13 = (hashCode12 + (miniAppHeader == null ? 0 : miniAppHeader.hashCode())) * 31;
        t tVar2 = this.bottomSheetTokenizedEvent;
        int hashCode14 = (hashCode13 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        NumberPVZ numberPVZ = this.numberPVZ;
        int a13 = C3532b.a(C3532b.a((hashCode14 + (numberPVZ == null ? 0 : numberPVZ.hashCode())) * 31, 31, this.clusterizationEnabled), 31, this.isNeedStartClusterization);
        String str5 = this.mergedPinsActionBaseLink;
        int hashCode15 = (a13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.actionBaseLink;
        return hashCode15 + (str6 != null ? str6.hashCode() : 0);
    }

    /* renamed from: isNeedStartClusterization, reason: from getter */
    public final boolean getIsNeedStartClusterization() {
        return this.isNeedStartClusterization;
    }

    /* renamed from: isShowNavbarBackground, reason: from getter */
    public final boolean getIsShowNavbarBackground() {
        return this.isShowNavbarBackground;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.showCenterPin;
        Pin pin = this.centerPin;
        AtomActionDTO atomActionDTO = this.bottomSheetAction;
        List<BadgeDTO> list = this.bottomSheetBadges;
        LocationMarker locationMarker = this.userLocationMarker;
        ViewPort viewPort = this.viewPort;
        String str = this.linkTplDragCenter;
        String str2 = this.linkTplZoomInOut;
        List<MapIcon> list2 = this.icons;
        MapIcon.BannerIcon bannerIcon = this.bannerIcon;
        List<Selector> list3 = this.selector;
        TabsDTO tabsDTO = this.dsTabs;
        boolean z12 = this.isShowNavbarBackground;
        String str3 = this.navbarTitle;
        String str4 = this.navbarSubtitle;
        t tVar = this.event;
        MetaInfo metaInfo = this.metaInfo;
        boolean z13 = this.processApplicationMove;
        boolean z14 = this.geolocationOnInit;
        boolean z15 = this.processInitializeMap;
        List<MapObject> list4 = this.mapObjects;
        MiniAppHeader miniAppHeader = this.miniAppHeader;
        t tVar2 = this.bottomSheetTokenizedEvent;
        NumberPVZ numberPVZ = this.numberPVZ;
        boolean z16 = this.clusterizationEnabled;
        boolean z17 = this.isNeedStartClusterization;
        String str5 = this.mergedPinsActionBaseLink;
        String str6 = this.actionBaseLink;
        StringBuilder c11 = Bl.b.c(j11, "AddressEditMapVO(id=", ", showCenterPin=", z11);
        c11.append(", centerPin=");
        c11.append(pin);
        c11.append(", bottomSheetAction=");
        c11.append(atomActionDTO);
        c11.append(", bottomSheetBadges=");
        c11.append(list);
        c11.append(", userLocationMarker=");
        c11.append(locationMarker);
        c11.append(", viewPort=");
        c11.append(viewPort);
        c11.append(", linkTplDragCenter=");
        c11.append(str);
        Nh.a.g(", linkTplZoomInOut=", str2, ", icons=", c11, list2);
        c11.append(", bannerIcon=");
        c11.append(bannerIcon);
        c11.append(", selector=");
        c11.append(list3);
        c11.append(", dsTabs=");
        c11.append(tabsDTO);
        c11.append(", isShowNavbarBackground=");
        c11.append(z12);
        Nh.a.h(c11, ", navbarTitle=", str3, ", navbarSubtitle=", str4);
        c11.append(", event=");
        c11.append(tVar);
        c11.append(", metaInfo=");
        c11.append(metaInfo);
        C2436a.e(", processApplicationMove=", ", geolocationOnInit=", c11, z13, z14);
        c11.append(", processInitializeMap=");
        c11.append(z15);
        c11.append(", mapObjects=");
        c11.append(list4);
        c11.append(", miniAppHeader=");
        c11.append(miniAppHeader);
        c11.append(", bottomSheetTokenizedEvent=");
        c11.append(tVar2);
        c11.append(", numberPVZ=");
        c11.append(numberPVZ);
        c11.append(", clusterizationEnabled=");
        c11.append(z16);
        c11.append(", isNeedStartClusterization=");
        c11.append(z17);
        c11.append(", mergedPinsActionBaseLink=");
        c11.append(str5);
        return C6594f.a(", actionBaseLink=", str6, ")", c11);
    }

    public /* synthetic */ AddressEditMapVO(long j11, boolean z11, Pin pin, AtomActionDTO atomActionDTO, List list, LocationMarker locationMarker, ViewPort viewPort, String str, String str2, List list2, MapIcon.BannerIcon bannerIcon, List list3, TabsDTO tabsDTO, boolean z12, String str3, String str4, t tVar, MetaInfo metaInfo, boolean z13, boolean z14, boolean z15, List list4, MiniAppHeader miniAppHeader, t tVar2, NumberPVZ numberPVZ, boolean z16, boolean z17, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, z11, pin, atomActionDTO, list, locationMarker, viewPort, str, str2, list2, bannerIcon, list3, tabsDTO, z12, str3, str4, tVar, metaInfo, (i11 & 262144) != 0 ? false : z13, (i11 & 524288) != 0 ? false : z14, (i11 & 1048576) != 0 ? false : z15, list4, miniAppHeader, tVar2, numberPVZ, z16, z17, str5, str6);
    }
}
