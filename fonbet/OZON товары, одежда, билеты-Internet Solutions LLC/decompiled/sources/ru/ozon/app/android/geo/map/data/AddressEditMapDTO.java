package ru.ozon.app.android.geo.map.data;

import B0.A0;
import B0.C2454a;
import B90.C2619v;
import Bk.C2638a;
import Bl.C2639a;
import C.o0;
import Cm.e;
import D3.h;
import De.C2860c;
import El.C2971a;
import G.g;
import H3.c;
import I0.C3173b;
import I1.w;
import J0.P;
import Kk.C3532b;
import N3.C3660k;
import TY.a;
import Ul.C4070a;
import Ve.C4636t5;
import Xc.b;
import c8.C5766e;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import spay.sdk.domain.model.FraudMonInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0018z{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001B¯\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010,\u001a\u0004\u0018\u00010-¢\u0006\u0004\b.\u0010/J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\\\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010a\u001a\u00020\u0013HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\tHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010!HÆ\u0003J\u0010\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010MJ\u000b\u0010m\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010(HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010*HÆ\u0003J\u0017\u0010q\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010-HÆ\u0003Jâ\u0002\u0010s\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-HÆ\u0001¢\u0006\u0002\u0010tJ\u0013\u0010u\u001a\u00020\u00032\b\u0010v\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010w\u001a\u00020xHÖ\u0001J\t\u0010y\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b>\u0010=R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bC\u00107R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u00101R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bF\u0010=R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bG\u0010=R\u001f\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0015\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010MR\u0015\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010N\u001a\u0004\bO\u0010MR\u0015\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010N\u001a\u0004\b$\u0010MR\u0013\u0010%\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bP\u0010=R\u0013\u0010&\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010=R\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u001f\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bV\u0010IR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bW\u0010X¨\u0006\u0089\u0001"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO;", "", "showCenterPin", "", "centerPin", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin;", "bottomSheetAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "bottomSheetBadges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "viewport", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$ViewPort;", "userLocationMarker", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationMarker;", "linkTplDragCenter", "", "linkTplZoomInOut", "icons", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons;", "bannerInfo", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$BannerInfo;", "selector", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector;", "dsTabs", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "isNavbarHidden", "navbarTitle", "navbarSubtitle", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "metaInfo", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MetaInfo;", "geolocationOnInit", "clusterizationEnabled", "isNeedStartClusterization", "mergedPinsActionBaseLink", "actionBaseLink", "markerBundle", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MarkerBundle;", "miniAppHeader", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MiniAppHeader;", "bottomSheetTrackingInfo", "numberPVZ", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$NumberPVZ;", "<init>", "(ZLru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$ViewPort;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationMarker;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$BannerInfo;Ljava/util/List;Lru/ozon/uni/atoms/data/tabs/TabsDTO;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MetaInfo;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MarkerBundle;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MiniAppHeader;Ljava/util/Map;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$NumberPVZ;)V", "getShowCenterPin", "()Z", "getCenterPin", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin;", "getBottomSheetAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBottomSheetBadges", "()Ljava/util/List;", "getViewport", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$ViewPort;", "getUserLocationMarker", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationMarker;", "getLinkTplDragCenter", "()Ljava/lang/String;", "getLinkTplZoomInOut", "getIcons", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons;", "getBannerInfo", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$BannerInfo;", "getSelector", "getDsTabs", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "getNavbarTitle", "getNavbarSubtitle", "getTrackingInfo", "()Ljava/util/Map;", "getMetaInfo", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MetaInfo;", "getGeolocationOnInit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getClusterizationEnabled", "getMergedPinsActionBaseLink", "getActionBaseLink", "getMarkerBundle", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MarkerBundle;", "getMiniAppHeader", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MiniAppHeader;", "getBottomSheetTrackingInfo", "getNumberPVZ", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$NumberPVZ;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(ZLru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$ViewPort;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationMarker;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$BannerInfo;Ljava/util/List;Lru/ozon/uni/atoms/data/tabs/TabsDTO;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MetaInfo;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MarkerBundle;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MiniAppHeader;Ljava/util/Map;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$NumberPVZ;)Lru/ozon/app/android/geo/map/data/AddressEditMapDTO;", "equals", "other", "hashCode", "", "toString", "MetaInfo", "Selector", "Icons", "BannerInfo", "Pin", "ViewPort", "Coordinate", "LocationMarker", "LocationTooltip", "MarkerBundle", "MapObjectCollection", "MapObject", "AdditionalPinContent", "MiniAppHeader", "NumberPVZ", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditMapDTO {
    private final String actionBaseLink;
    private final BannerInfo bannerInfo;
    private final AtomActionDTO bottomSheetAction;
    private final List<BadgeDTO> bottomSheetBadges;
    private final Map<String, TokenizedTrackingInfo> bottomSheetTrackingInfo;

    @NotNull
    private final Pin centerPin;
    private final Boolean clusterizationEnabled;
    private final TabsDTO dsTabs;
    private final Boolean geolocationOnInit;

    @NotNull
    private final Icons icons;
    private final boolean isNavbarHidden;
    private final Boolean isNeedStartClusterization;
    private final String linkTplDragCenter;
    private final String linkTplZoomInOut;
    private final MarkerBundle markerBundle;
    private final String mergedPinsActionBaseLink;
    private final MetaInfo metaInfo;
    private final MiniAppHeader miniAppHeader;
    private final String navbarSubtitle;
    private final String navbarTitle;
    private final NumberPVZ numberPVZ;
    private final List<Selector> selector;
    private final boolean showCenterPin;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final LocationMarker userLocationMarker;
    private final ViewPort viewport;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;", "", "text", "", "textColor", "icon", "iconTintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getTextColor", "getIcon", "getIconTintColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalPinContent {
        private final String icon;
        private final String iconTintColor;
        private final String text;
        private final String textColor;

        public AdditionalPinContent(String str, String str2, String str3, String str4) {
            this.text = str;
            this.textColor = str2;
            this.icon = str3;
            this.iconTintColor = str4;
        }

        public static /* synthetic */ AdditionalPinContent copy$default(AdditionalPinContent additionalPinContent, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = additionalPinContent.text;
            }
            if ((i11 & 2) != 0) {
                str2 = additionalPinContent.textColor;
            }
            if ((i11 & 4) != 0) {
                str3 = additionalPinContent.icon;
            }
            if ((i11 & 8) != 0) {
                str4 = additionalPinContent.iconTintColor;
            }
            return additionalPinContent.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        @NotNull
        public final AdditionalPinContent copy(String text, String textColor, String icon, String iconTintColor) {
            return new AdditionalPinContent(text, textColor, icon, iconTintColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalPinContent)) {
                return false;
            }
            AdditionalPinContent additionalPinContent = (AdditionalPinContent) other;
            return Intrinsics.d(this.text, additionalPinContent.text) && Intrinsics.d(this.textColor, additionalPinContent.textColor) && Intrinsics.d(this.icon, additionalPinContent.icon) && Intrinsics.d(this.iconTintColor, additionalPinContent.iconTintColor);
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.textColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.icon;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.iconTintColor;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.textColor;
            return C3173b.c(C3660k.d("AdditionalPinContent(text=", str, ", textColor=", str2, ", icon="), this.icon, ", iconTintColor=", this.iconTintColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J`\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$BannerInfo;", "", "iconLink", "", "hintText", "hintDelay", "", "hideTimer", "pinLink", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)V", "getIconLink", "()Ljava/lang/String;", "getHintText", "getHintDelay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHideTimer", "getPinLink", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$BannerInfo;", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BannerInfo {
        private final Long hideTimer;
        private final Long hintDelay;
        private final String hintText;

        @NotNull
        private final String iconLink;
        private final String pinLink;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public BannerInfo(@NotNull String iconLink, String str, Long l11, Long l12, String str2, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(iconLink, "iconLink");
            this.iconLink = iconLink;
            this.hintText = str;
            this.hintDelay = l11;
            this.hideTimer = l12;
            this.pinLink = str2;
            this.trackingInfo = map;
        }

        public static /* synthetic */ BannerInfo copy$default(BannerInfo bannerInfo, String str, String str2, Long l11, Long l12, String str3, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bannerInfo.iconLink;
            }
            if ((i11 & 2) != 0) {
                str2 = bannerInfo.hintText;
            }
            if ((i11 & 4) != 0) {
                l11 = bannerInfo.hintDelay;
            }
            if ((i11 & 8) != 0) {
                l12 = bannerInfo.hideTimer;
            }
            if ((i11 & 16) != 0) {
                str3 = bannerInfo.pinLink;
            }
            if ((i11 & 32) != 0) {
                map = bannerInfo.trackingInfo;
            }
            String str4 = str3;
            Map map2 = map;
            return bannerInfo.copy(str, str2, l11, l12, str4, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIconLink() {
            return this.iconLink;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHintText() {
            return this.hintText;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getHintDelay() {
            return this.hintDelay;
        }

        /* renamed from: component4, reason: from getter */
        public final Long getHideTimer() {
            return this.hideTimer;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPinLink() {
            return this.pinLink;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final BannerInfo copy(@NotNull String iconLink, String hintText, Long hintDelay, Long hideTimer, String pinLink, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(iconLink, "iconLink");
            return new BannerInfo(iconLink, hintText, hintDelay, hideTimer, pinLink, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerInfo)) {
                return false;
            }
            BannerInfo bannerInfo = (BannerInfo) other;
            return Intrinsics.d(this.iconLink, bannerInfo.iconLink) && Intrinsics.d(this.hintText, bannerInfo.hintText) && Intrinsics.d(this.hintDelay, bannerInfo.hintDelay) && Intrinsics.d(this.hideTimer, bannerInfo.hideTimer) && Intrinsics.d(this.pinLink, bannerInfo.pinLink) && Intrinsics.d(this.trackingInfo, bannerInfo.trackingInfo);
        }

        public final Long getHideTimer() {
            return this.hideTimer;
        }

        public final Long getHintDelay() {
            return this.hintDelay;
        }

        public final String getHintText() {
            return this.hintText;
        }

        @NotNull
        public final String getIconLink() {
            return this.iconLink;
        }

        public final String getPinLink() {
            return this.pinLink;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.iconLink.hashCode() * 31;
            String str = this.hintText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l11 = this.hintDelay;
            int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.hideTimer;
            int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str2 = this.pinLink;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.iconLink;
            String str2 = this.hintText;
            Long l11 = this.hintDelay;
            Long l12 = this.hideTimer;
            String str3 = this.pinLink;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("BannerInfo(iconLink=", str, ", hintText=", str2, ", hintDelay=");
            a.e(d11, l11, ", hideTimer=", l12, ", pinLink=");
            return C4070a.a(d11, str3, ", trackingInfo=", map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;", "", "latitude", "", "longitude", "<init>", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons;", "", "location", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$LocationIcon;", "search", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$SearchIcon;", "<init>", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$LocationIcon;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$SearchIcon;)V", "getLocation", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$LocationIcon;", "getSearch", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$SearchIcon;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LocationIcon", "SearchIcon", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Icons {

        @NotNull
        private final LocationIcon location;
        private final SearchIcon search;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$LocationIcon;", "", "icon", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocationIcon {

            @NotNull
            private final String icon;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public LocationIcon(@NotNull String icon, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ LocationIcon copy$default(LocationIcon locationIcon, String str, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = locationIcon.icon;
                }
                if ((i11 & 2) != 0) {
                    map = locationIcon.trackingInfo;
                }
                return locationIcon.copy(str, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            public final Map<String, TokenizedTrackingInfo> component2() {
                return this.trackingInfo;
            }

            @NotNull
            public final LocationIcon copy(@NotNull String icon, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                return new LocationIcon(icon, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LocationIcon)) {
                    return false;
                }
                LocationIcon locationIcon = (LocationIcon) other;
                return Intrinsics.d(this.icon, locationIcon.icon) && Intrinsics.d(this.trackingInfo, locationIcon.trackingInfo);
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.icon.hashCode() * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public String toString() {
                return Nh.a.d("LocationIcon(icon=", this.icon, ", trackingInfo=", ")", this.trackingInfo);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$SearchIcon;", "", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "options", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$SearchIcon$Options;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$SearchIcon$Options;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getTitle", "getOptions", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$SearchIcon$Options;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Options", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class SearchIcon {

            @NotNull
            private final String icon;

            @NotNull
            private final Options options;

            @NotNull
            private final String title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003Js\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0007HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018¨\u0006)"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Icons$SearchIcon$Options;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", HammersV3BodyDTO.PLACEHOLDER, SearchIntents.EXTRA_QUERY, "threshold", "", "geocodingActionPath", "emptyStateElements", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "unavailableStateElements", "initialElements", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getPlaceholder", "getQuery", "getThreshold", "()I", "getGeocodingActionPath", "getEmptyStateElements", "()Ljava/util/List;", "getUnavailableStateElements", "getInitialElements", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Options {
                private final List<TextAtom> emptyStateElements;

                @NotNull
                private final String geocodingActionPath;
                private final List<TextAtom> initialElements;

                @NotNull
                private final String placeholder;

                @NotNull
                private final String query;
                private final int threshold;
                private final String title;
                private final List<TextAtom> unavailableStateElements;

                public Options(String str, @NotNull String placeholder, @NotNull String query, int i11, @NotNull String geocodingActionPath, List<TextAtom> list, List<TextAtom> list2, List<TextAtom> list3) {
                    Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                    Intrinsics.checkNotNullParameter(query, "query");
                    Intrinsics.checkNotNullParameter(geocodingActionPath, "geocodingActionPath");
                    this.title = str;
                    this.placeholder = placeholder;
                    this.query = query;
                    this.threshold = i11;
                    this.geocodingActionPath = geocodingActionPath;
                    this.emptyStateElements = list;
                    this.unavailableStateElements = list2;
                    this.initialElements = list3;
                }

                public static /* synthetic */ Options copy$default(Options options, String str, String str2, String str3, int i11, String str4, List list, List list2, List list3, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = options.title;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = options.placeholder;
                    }
                    if ((i12 & 4) != 0) {
                        str3 = options.query;
                    }
                    if ((i12 & 8) != 0) {
                        i11 = options.threshold;
                    }
                    if ((i12 & 16) != 0) {
                        str4 = options.geocodingActionPath;
                    }
                    if ((i12 & 32) != 0) {
                        list = options.emptyStateElements;
                    }
                    if ((i12 & 64) != 0) {
                        list2 = options.unavailableStateElements;
                    }
                    if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        list3 = options.initialElements;
                    }
                    List list4 = list2;
                    List list5 = list3;
                    String str5 = str4;
                    List list6 = list;
                    return options.copy(str, str2, str3, i11, str5, list6, list4, list5);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final String getQuery() {
                    return this.query;
                }

                /* renamed from: component4, reason: from getter */
                public final int getThreshold() {
                    return this.threshold;
                }

                @NotNull
                /* renamed from: component5, reason: from getter */
                public final String getGeocodingActionPath() {
                    return this.geocodingActionPath;
                }

                public final List<TextAtom> component6() {
                    return this.emptyStateElements;
                }

                public final List<TextAtom> component7() {
                    return this.unavailableStateElements;
                }

                public final List<TextAtom> component8() {
                    return this.initialElements;
                }

                @NotNull
                public final Options copy(String title, @NotNull String placeholder, @NotNull String query, int threshold, @NotNull String geocodingActionPath, List<TextAtom> emptyStateElements, List<TextAtom> unavailableStateElements, List<TextAtom> initialElements) {
                    Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                    Intrinsics.checkNotNullParameter(query, "query");
                    Intrinsics.checkNotNullParameter(geocodingActionPath, "geocodingActionPath");
                    return new Options(title, placeholder, query, threshold, geocodingActionPath, emptyStateElements, unavailableStateElements, initialElements);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Options)) {
                        return false;
                    }
                    Options options = (Options) other;
                    return Intrinsics.d(this.title, options.title) && Intrinsics.d(this.placeholder, options.placeholder) && Intrinsics.d(this.query, options.query) && this.threshold == options.threshold && Intrinsics.d(this.geocodingActionPath, options.geocodingActionPath) && Intrinsics.d(this.emptyStateElements, options.emptyStateElements) && Intrinsics.d(this.unavailableStateElements, options.unavailableStateElements) && Intrinsics.d(this.initialElements, options.initialElements);
                }

                public final List<TextAtom> getEmptyStateElements() {
                    return this.emptyStateElements;
                }

                @NotNull
                public final String getGeocodingActionPath() {
                    return this.geocodingActionPath;
                }

                public final List<TextAtom> getInitialElements() {
                    return this.initialElements;
                }

                @NotNull
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                @NotNull
                public final String getQuery() {
                    return this.query;
                }

                public final int getThreshold() {
                    return this.threshold;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final List<TextAtom> getUnavailableStateElements() {
                    return this.unavailableStateElements;
                }

                public int hashCode() {
                    String str = this.title;
                    int a11 = g.a(C2454a.a(this.threshold, g.a(g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.placeholder), 31, this.query), 31), 31, this.geocodingActionPath);
                    List<TextAtom> list = this.emptyStateElements;
                    int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
                    List<TextAtom> list2 = this.unavailableStateElements;
                    int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
                    List<TextAtom> list3 = this.initialElements;
                    return hashCode2 + (list3 != null ? list3.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.title;
                    String str2 = this.placeholder;
                    String str3 = this.query;
                    int i11 = this.threshold;
                    String str4 = this.geocodingActionPath;
                    List<TextAtom> list = this.emptyStateElements;
                    List<TextAtom> list2 = this.unavailableStateElements;
                    List<TextAtom> list3 = this.initialElements;
                    StringBuilder d11 = C3660k.d("Options(title=", str, ", placeholder=", str2, ", query=");
                    Pk0.g.d(i11, str3, ", threshold=", ", geocodingActionPath=", d11);
                    w.d(str4, ", emptyStateElements=", ", unavailableStateElements=", d11, list);
                    d11.append(list2);
                    d11.append(", initialElements=");
                    d11.append(list3);
                    d11.append(")");
                    return d11.toString();
                }
            }

            public SearchIcon(@NotNull String icon, @NotNull String title, @NotNull Options options, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(options, "options");
                this.icon = icon;
                this.title = title;
                this.options = options;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SearchIcon copy$default(SearchIcon searchIcon, String str, String str2, Options options, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = searchIcon.icon;
                }
                if ((i11 & 2) != 0) {
                    str2 = searchIcon.title;
                }
                if ((i11 & 4) != 0) {
                    options = searchIcon.options;
                }
                if ((i11 & 8) != 0) {
                    map = searchIcon.trackingInfo;
                }
                return searchIcon.copy(str, str2, options, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final Options getOptions() {
                return this.options;
            }

            public final Map<String, TokenizedTrackingInfo> component4() {
                return this.trackingInfo;
            }

            @NotNull
            public final SearchIcon copy(@NotNull String icon, @NotNull String title, @NotNull Options options, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(options, "options");
                return new SearchIcon(icon, title, options, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SearchIcon)) {
                    return false;
                }
                SearchIcon searchIcon = (SearchIcon) other;
                return Intrinsics.d(this.icon, searchIcon.icon) && Intrinsics.d(this.title, searchIcon.title) && Intrinsics.d(this.options, searchIcon.options) && Intrinsics.d(this.trackingInfo, searchIcon.trackingInfo);
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            public final Options getOptions() {
                return this.options;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = (this.options.hashCode() + g.a(this.icon.hashCode() * 31, 31, this.title)) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                String str2 = this.title;
                Options options = this.options;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C3660k.d("SearchIcon(icon=", str, ", title=", str2, ", options=");
                d11.append(options);
                d11.append(", trackingInfo=");
                d11.append(map);
                d11.append(")");
                return d11.toString();
            }
        }

        public Icons(@NotNull LocationIcon location, SearchIcon searchIcon) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.location = location;
            this.search = searchIcon;
        }

        public static /* synthetic */ Icons copy$default(Icons icons, LocationIcon locationIcon, SearchIcon searchIcon, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                locationIcon = icons.location;
            }
            if ((i11 & 2) != 0) {
                searchIcon = icons.search;
            }
            return icons.copy(locationIcon, searchIcon);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final LocationIcon getLocation() {
            return this.location;
        }

        /* renamed from: component2, reason: from getter */
        public final SearchIcon getSearch() {
            return this.search;
        }

        @NotNull
        public final Icons copy(@NotNull LocationIcon location, SearchIcon search) {
            Intrinsics.checkNotNullParameter(location, "location");
            return new Icons(location, search);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icons)) {
                return false;
            }
            Icons icons = (Icons) other;
            return Intrinsics.d(this.location, icons.location) && Intrinsics.d(this.search, icons.search);
        }

        @NotNull
        public final LocationIcon getLocation() {
            return this.location;
        }

        public final SearchIcon getSearch() {
            return this.search;
        }

        public int hashCode() {
            int hashCode = this.location.hashCode() * 31;
            SearchIcon searchIcon = this.search;
            return hashCode + (searchIcon == null ? 0 : searchIcon.hashCode());
        }

        @NotNull
        public String toString() {
            return "Icons(location=" + this.location + ", search=" + this.search + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J`\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationMarker;", "", "icon", "", "iconWidth", "", "iconHeight", "tooltip", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationTooltip;", "zPriority", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationTooltip;Ljava/lang/Integer;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getIconWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIconHeight", "getTooltip", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationTooltip;", "getZPriority", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationTooltip;Ljava/lang/Integer;Ljava/util/Map;)Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationMarker;", "equals", "", "other", "hashCode", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationMarker {

        @NotNull
        private final String icon;
        private final Integer iconHeight;
        private final Integer iconWidth;
        private final LocationTooltip tooltip;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final Integer zPriority;

        public LocationMarker(@NotNull String icon, Integer num, Integer num2, LocationTooltip locationTooltip, Integer num3, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.iconWidth = num;
            this.iconHeight = num2;
            this.tooltip = locationTooltip;
            this.zPriority = num3;
            this.trackingInfo = map;
        }

        public static /* synthetic */ LocationMarker copy$default(LocationMarker locationMarker, String str, Integer num, Integer num2, LocationTooltip locationTooltip, Integer num3, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = locationMarker.icon;
            }
            if ((i11 & 2) != 0) {
                num = locationMarker.iconWidth;
            }
            if ((i11 & 4) != 0) {
                num2 = locationMarker.iconHeight;
            }
            if ((i11 & 8) != 0) {
                locationTooltip = locationMarker.tooltip;
            }
            if ((i11 & 16) != 0) {
                num3 = locationMarker.zPriority;
            }
            if ((i11 & 32) != 0) {
                map = locationMarker.trackingInfo;
            }
            Integer num4 = num3;
            Map map2 = map;
            return locationMarker.copy(str, num, num2, locationTooltip, num4, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getIconWidth() {
            return this.iconWidth;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getIconHeight() {
            return this.iconHeight;
        }

        /* renamed from: component4, reason: from getter */
        public final LocationTooltip getTooltip() {
            return this.tooltip;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getZPriority() {
            return this.zPriority;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final LocationMarker copy(@NotNull String icon, Integer iconWidth, Integer iconHeight, LocationTooltip tooltip, Integer zPriority, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new LocationMarker(icon, iconWidth, iconHeight, tooltip, zPriority, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationMarker)) {
                return false;
            }
            LocationMarker locationMarker = (LocationMarker) other;
            return Intrinsics.d(this.icon, locationMarker.icon) && Intrinsics.d(this.iconWidth, locationMarker.iconWidth) && Intrinsics.d(this.iconHeight, locationMarker.iconHeight) && Intrinsics.d(this.tooltip, locationMarker.tooltip) && Intrinsics.d(this.zPriority, locationMarker.zPriority) && Intrinsics.d(this.trackingInfo, locationMarker.trackingInfo);
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final Integer getIconHeight() {
            return this.iconHeight;
        }

        public final Integer getIconWidth() {
            return this.iconWidth;
        }

        public final LocationTooltip getTooltip() {
            return this.tooltip;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final Integer getZPriority() {
            return this.zPriority;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            Integer num = this.iconWidth;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.iconHeight;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            LocationTooltip locationTooltip = this.tooltip;
            int hashCode4 = (hashCode3 + (locationTooltip == null ? 0 : locationTooltip.hashCode())) * 31;
            Integer num3 = this.zPriority;
            int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            Integer num = this.iconWidth;
            Integer num2 = this.iconHeight;
            LocationTooltip locationTooltip = this.tooltip;
            Integer num3 = this.zPriority;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder b11 = P.b("LocationMarker(icon=", str, num, ", iconWidth=", ", iconHeight=");
            b11.append(num2);
            b11.append(", tooltip=");
            b11.append(locationTooltip);
            b11.append(", zPriority=");
            b11.append(num3);
            b11.append(", trackingInfo=");
            b11.append(map);
            b11.append(")");
            return b11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$LocationTooltip;", "", "text", "", "backgroundColor", "textColor", "timing", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getText", "()Ljava/lang/String;", "getBackgroundColor", "getTextColor", "getTiming", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public static /* synthetic */ LocationTooltip copy$default(LocationTooltip locationTooltip, String str, String str2, String str3, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = locationTooltip.text;
            }
            if ((i11 & 2) != 0) {
                str2 = locationTooltip.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                str3 = locationTooltip.textColor;
            }
            if ((i11 & 8) != 0) {
                j11 = locationTooltip.timing;
            }
            String str4 = str3;
            return locationTooltip.copy(str, str2, str4, j11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component4, reason: from getter */
        public final long getTiming() {
            return this.timing;
        }

        @NotNull
        public final LocationTooltip copy(@NotNull String text, String backgroundColor, String textColor, long timing) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new LocationTooltip(text, backgroundColor, textColor, timing);
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

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001:\u0001KB¯\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010A\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010B\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010C\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010-J\u0017\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003JÖ\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020\u00132\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0015HÖ\u0001J\t\u0010J\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010.\u001a\u0004\b\u0012\u0010-R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010.\u001a\u0004\b\u0016\u0010-R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010.\u001a\u0004\b2\u0010-R\u001f\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006L"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject;", "", "type", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;", "coordinates", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;", "pinsCount", "", "pinsCountColor", "image", "imageTintColor", "tintColor", "borderColor", "viewport", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$ViewPort;", "additionalContent", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;", "actionLink", "isSelected", "", "zPriority", "", "isClickEnabled", "ignoreCollapsedState", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$ViewPort;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)V", "getType", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;", "getCoordinates", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;", "getPinsCount", "()Ljava/lang/String;", "getPinsCountColor", "getImage", "getImageTintColor", "getTintColor", "getBorderColor", "getViewport", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$ViewPort;", "getAdditionalContent", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;", "getActionLink", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getZPriority", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIgnoreCollapsedState", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$ViewPort;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$AdditionalPinContent;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject;", "equals", "other", "hashCode", "toString", "Type", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class MapObject {

        @NotNull
        private final String actionLink;
        private final AdditionalPinContent additionalContent;
        private final String borderColor;

        @NotNull
        private final Coordinate coordinates;
        private final Boolean ignoreCollapsedState;
        private final String image;
        private final String imageTintColor;
        private final Boolean isClickEnabled;
        private final Boolean isSelected;
        private final String pinsCount;
        private final String pinsCountColor;
        private final String tintColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final Type type;
        private final ViewPort viewport;
        private final Integer zPriority;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject$Type;", "", "<init>", "(Ljava/lang/String;I)V", FraudMonInfo.UNKNOWN, "PIN", "CLUSTER", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type UNKNOWN = new Type(FraudMonInfo.UNKNOWN, 0);
            public static final Type PIN = new Type("PIN", 1);
            public static final Type CLUSTER = new Type("CLUSTER", 2);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{UNKNOWN, PIN, CLUSTER};
            }

            static {
                Type[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Type(String str, int i11) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public MapObject(Type type, @NotNull Coordinate coordinates, String str, String str2, String str3, String str4, String str5, String str6, ViewPort viewPort, AdditionalPinContent additionalPinContent, @NotNull String actionLink, Boolean bool, Integer num, Boolean bool2, Boolean bool3, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Intrinsics.checkNotNullParameter(actionLink, "actionLink");
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
            this.isSelected = bool;
            this.zPriority = num;
            this.isClickEnabled = bool2;
            this.ignoreCollapsedState = bool3;
            this.trackingInfo = map;
        }

        /* renamed from: component1, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component10, reason: from getter */
        public final AdditionalPinContent getAdditionalContent() {
            return this.additionalContent;
        }

        @NotNull
        /* renamed from: component11, reason: from getter */
        public final String getActionLink() {
            return this.actionLink;
        }

        /* renamed from: component12, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component13, reason: from getter */
        public final Integer getZPriority() {
            return this.zPriority;
        }

        /* renamed from: component14, reason: from getter */
        public final Boolean getIsClickEnabled() {
            return this.isClickEnabled;
        }

        /* renamed from: component15, reason: from getter */
        public final Boolean getIgnoreCollapsedState() {
            return this.ignoreCollapsedState;
        }

        public final Map<String, TokenizedTrackingInfo> component16() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Coordinate getCoordinates() {
            return this.coordinates;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPinsCount() {
            return this.pinsCount;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPinsCountColor() {
            return this.pinsCountColor;
        }

        /* renamed from: component5, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component6, reason: from getter */
        public final String getImageTintColor() {
            return this.imageTintColor;
        }

        /* renamed from: component7, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        /* renamed from: component8, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component9, reason: from getter */
        public final ViewPort getViewport() {
            return this.viewport;
        }

        @NotNull
        public final MapObject copy(Type type, @NotNull Coordinate coordinates, String pinsCount, String pinsCountColor, String image, String imageTintColor, String tintColor, String borderColor, ViewPort viewport, AdditionalPinContent additionalContent, @NotNull String actionLink, Boolean isSelected, Integer zPriority, Boolean isClickEnabled, Boolean ignoreCollapsedState, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Intrinsics.checkNotNullParameter(actionLink, "actionLink");
            return new MapObject(type, coordinates, pinsCount, pinsCountColor, image, imageTintColor, tintColor, borderColor, viewport, additionalContent, actionLink, isSelected, zPriority, isClickEnabled, ignoreCollapsedState, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapObject)) {
                return false;
            }
            MapObject mapObject = (MapObject) other;
            return this.type == mapObject.type && Intrinsics.d(this.coordinates, mapObject.coordinates) && Intrinsics.d(this.pinsCount, mapObject.pinsCount) && Intrinsics.d(this.pinsCountColor, mapObject.pinsCountColor) && Intrinsics.d(this.image, mapObject.image) && Intrinsics.d(this.imageTintColor, mapObject.imageTintColor) && Intrinsics.d(this.tintColor, mapObject.tintColor) && Intrinsics.d(this.borderColor, mapObject.borderColor) && Intrinsics.d(this.viewport, mapObject.viewport) && Intrinsics.d(this.additionalContent, mapObject.additionalContent) && Intrinsics.d(this.actionLink, mapObject.actionLink) && Intrinsics.d(this.isSelected, mapObject.isSelected) && Intrinsics.d(this.zPriority, mapObject.zPriority) && Intrinsics.d(this.isClickEnabled, mapObject.isClickEnabled) && Intrinsics.d(this.ignoreCollapsedState, mapObject.ignoreCollapsedState) && Intrinsics.d(this.trackingInfo, mapObject.trackingInfo);
        }

        @NotNull
        public final String getActionLink() {
            return this.actionLink;
        }

        public final AdditionalPinContent getAdditionalContent() {
            return this.additionalContent;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final Coordinate getCoordinates() {
            return this.coordinates;
        }

        public final Boolean getIgnoreCollapsedState() {
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

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final Type getType() {
            return this.type;
        }

        public final ViewPort getViewport() {
            return this.viewport;
        }

        public final Integer getZPriority() {
            return this.zPriority;
        }

        public int hashCode() {
            Type type = this.type;
            int hashCode = (this.coordinates.hashCode() + ((type == null ? 0 : type.hashCode()) * 31)) * 31;
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
            AdditionalPinContent additionalPinContent = this.additionalContent;
            int a11 = g.a((hashCode8 + (additionalPinContent == null ? 0 : additionalPinContent.hashCode())) * 31, 31, this.actionLink);
            Boolean bool = this.isSelected;
            int hashCode9 = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.zPriority;
            int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool2 = this.isClickEnabled;
            int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.ignoreCollapsedState;
            int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode12 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isClickEnabled() {
            return this.isClickEnabled;
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            Type type = this.type;
            Coordinate coordinate = this.coordinates;
            String str = this.pinsCount;
            String str2 = this.pinsCountColor;
            String str3 = this.image;
            String str4 = this.imageTintColor;
            String str5 = this.tintColor;
            String str6 = this.borderColor;
            ViewPort viewPort = this.viewport;
            AdditionalPinContent additionalPinContent = this.additionalContent;
            String str7 = this.actionLink;
            Boolean bool = this.isSelected;
            Integer num = this.zPriority;
            Boolean bool2 = this.isClickEnabled;
            Boolean bool3 = this.ignoreCollapsedState;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("MapObject(type=");
            sb2.append(type);
            sb2.append(", coordinates=");
            sb2.append(coordinate);
            sb2.append(", pinsCount=");
            Nh.a.h(sb2, str, ", pinsCountColor=", str2, ", image=");
            Nh.a.h(sb2, str3, ", imageTintColor=", str4, ", tintColor=");
            Nh.a.h(sb2, str5, ", borderColor=", str6, ", viewport=");
            sb2.append(viewPort);
            sb2.append(", additionalContent=");
            sb2.append(additionalPinContent);
            sb2.append(", actionLink=");
            Sh.a.d(bool, str7, ", isSelected=", ", zPriority=", sb2);
            C2860c.f(bool2, num, ", isClickEnabled=", ", ignoreCollapsedState=", sb2);
            sb2.append(bool3);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObjectCollection;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MarkerBundle;", "mapObjects", "", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MapObject;", "<init>", "(Ljava/util/List;)V", "getMapObjects", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapObjectCollection implements MarkerBundle {
        private final List<MapObject> mapObjects;

        public MapObjectCollection(List<MapObject> list) {
            this.mapObjects = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MapObjectCollection copy$default(MapObjectCollection mapObjectCollection, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = mapObjectCollection.mapObjects;
            }
            return mapObjectCollection.copy(list);
        }

        public final List<MapObject> component1() {
            return this.mapObjects;
        }

        @NotNull
        public final MapObjectCollection copy(List<MapObject> mapObjects) {
            return new MapObjectCollection(mapObjects);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MapObjectCollection) && Intrinsics.d(this.mapObjects, ((MapObjectCollection) other).mapObjects);
        }

        public final List<MapObject> getMapObjects() {
            return this.mapObjects;
        }

        public int hashCode() {
            List<MapObject> list = this.mapObjects;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("MapObjectCollection(mapObjects=", ")", this.mapObjects);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MarkerBundle;", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface MarkerBundle {
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MetaInfo;", "", "debounceDelay", "", "<init>", "(Ljava/lang/Integer;)V", "getDebounceDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MetaInfo;", "equals", "", "other", "hashCode", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MetaInfo {
        private final Integer debounceDelay;

        public MetaInfo(Integer num) {
            this.debounceDelay = num;
        }

        public static /* synthetic */ MetaInfo copy$default(MetaInfo metaInfo, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = metaInfo.debounceDelay;
            }
            return metaInfo.copy(num);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getDebounceDelay() {
            return this.debounceDelay;
        }

        @NotNull
        public final MetaInfo copy(Integer debounceDelay) {
            return new MetaInfo(debounceDelay);
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J_\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$MiniAppHeader;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "logo", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "rightButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getLogo", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getRightButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MiniAppHeader {
        private final AtomActionDTO action;

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
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public MiniAppHeader(@NotNull TextDTO title, @NotNull IconDTO icon, @NotNull ImageDTO logo, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, @NotNull IconButtonV3DTO rightButton, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(logo, "logo");
            Intrinsics.checkNotNullParameter(rightButton, "rightButton");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.title = title;
            this.icon = icon;
            this.logo = logo;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.rightButton = rightButton;
            this.backgroundColor = backgroundColor;
        }

        public static /* synthetic */ MiniAppHeader copy$default(MiniAppHeader miniAppHeader, TextDTO textDTO, IconDTO iconDTO, ImageDTO imageDTO, AtomActionDTO atomActionDTO, Map map, IconButtonV3DTO iconButtonV3DTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = miniAppHeader.title;
            }
            if ((i11 & 2) != 0) {
                iconDTO = miniAppHeader.icon;
            }
            if ((i11 & 4) != 0) {
                imageDTO = miniAppHeader.logo;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = miniAppHeader.action;
            }
            if ((i11 & 16) != 0) {
                map = miniAppHeader.trackingInfo;
            }
            if ((i11 & 32) != 0) {
                iconButtonV3DTO = miniAppHeader.rightButton;
            }
            if ((i11 & 64) != 0) {
                str = miniAppHeader.backgroundColor;
            }
            IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
            String str2 = str;
            Map map2 = map;
            ImageDTO imageDTO2 = imageDTO;
            return miniAppHeader.copy(textDTO, iconDTO, imageDTO2, atomActionDTO, map2, iconButtonV3DTO2, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ImageDTO getLogo() {
            return this.logo;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final IconButtonV3DTO getRightButton() {
            return this.rightButton;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final MiniAppHeader copy(@NotNull TextDTO title, @NotNull IconDTO icon, @NotNull ImageDTO logo, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull IconButtonV3DTO rightButton, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(logo, "logo");
            Intrinsics.checkNotNullParameter(rightButton, "rightButton");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new MiniAppHeader(title, icon, logo, action, trackingInfo, rightButton, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MiniAppHeader)) {
                return false;
            }
            MiniAppHeader miniAppHeader = (MiniAppHeader) other;
            return Intrinsics.d(this.title, miniAppHeader.title) && Intrinsics.d(this.icon, miniAppHeader.icon) && Intrinsics.d(this.logo, miniAppHeader.logo) && Intrinsics.d(this.action, miniAppHeader.action) && Intrinsics.d(this.trackingInfo, miniAppHeader.trackingInfo) && Intrinsics.d(this.rightButton, miniAppHeader.rightButton) && Intrinsics.d(this.backgroundColor, miniAppHeader.backgroundColor);
        }

        public final AtomActionDTO getAction() {
            return this.action;
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

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = Nh.a.b(this.logo, C2971a.a(this.icon, this.title.hashCode() * 31, 31), 31);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return this.backgroundColor.hashCode() + GR.b.c(this.rightButton, (hashCode + (map != null ? map.hashCode() : 0)) * 31, 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.icon;
            ImageDTO imageDTO = this.logo;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            IconButtonV3DTO iconButtonV3DTO = this.rightButton;
            String str = this.backgroundColor;
            StringBuilder d11 = C2639a.d("MiniAppHeader(title=", ", icon=", ", logo=", iconDTO, textDTO);
            d11.append(imageDTO);
            d11.append(", action=");
            d11.append(atomActionDTO);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(", rightButton=");
            d11.append(iconButtonV3DTO);
            d11.append(", backgroundColor=");
            return o0.c(d11, str, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$NumberPVZ;", "", "number", "Lru/ozon/uni/atoms/data/text/TextDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NumberPVZ {
        private final CommonControlSettings common;

        @NotNull
        private final TextDTO number;

        public NumberPVZ(@NotNull TextDTO number, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(number, "number");
            this.number = number;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ NumberPVZ copy$default(NumberPVZ numberPVZ, TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = numberPVZ.number;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = numberPVZ.common;
            }
            return numberPVZ.copy(textDTO, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getNumber() {
            return this.number;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final NumberPVZ copy(@NotNull TextDTO number, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(number, "number");
            return new NumberPVZ(number, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NumberPVZ)) {
                return false;
            }
            NumberPVZ numberPVZ = (NumberPVZ) other;
            return Intrinsics.d(this.number, numberPVZ.number) && Intrinsics.d(this.common, numberPVZ.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final TextDTO getNumber() {
            return this.number;
        }

        public int hashCode() {
            int hashCode = this.number.hashCode() * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
        }

        @NotNull
        public String toString() {
            return "NumberPVZ(number=" + this.number + ", common=" + this.common + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin;", "", "coordinates", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;", "icon", "", "pinsCount", "", "badge", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin$Badge;", "<init>", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin$Badge;)V", "getCoordinates", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;", "getIcon", "()Ljava/lang/String;", "getPinsCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBadge", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin$Badge;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin$Badge;)Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin;", "equals", "", "other", "hashCode", "toString", "Badge", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Pin {
        private final Badge badge;

        @NotNull
        private final Coordinate coordinates;

        @NotNull
        private final String icon;
        private final Integer pinsCount;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Pin$Badge;", "", "color", "", "<init>", "(Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Badge {

            @NotNull
            private final String color;

            public Badge(@NotNull String color) {
                Intrinsics.checkNotNullParameter(color, "color");
                this.color = color;
            }

            public static /* synthetic */ Badge copy$default(Badge badge, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = badge.color;
                }
                return badge.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            @NotNull
            public final Badge copy(@NotNull String color) {
                Intrinsics.checkNotNullParameter(color, "color");
                return new Badge(color);
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

        public Pin(@NotNull Coordinate coordinates, @NotNull String icon, Integer num, Badge badge) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.coordinates = coordinates;
            this.icon = icon;
            this.pinsCount = num;
            this.badge = badge;
        }

        public static /* synthetic */ Pin copy$default(Pin pin, Coordinate coordinate, String str, Integer num, Badge badge, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                coordinate = pin.coordinates;
            }
            if ((i11 & 2) != 0) {
                str = pin.icon;
            }
            if ((i11 & 4) != 0) {
                num = pin.pinsCount;
            }
            if ((i11 & 8) != 0) {
                badge = pin.badge;
            }
            return pin.copy(coordinate, str, num, badge);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Coordinate getCoordinates() {
            return this.coordinates;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getPinsCount() {
            return this.pinsCount;
        }

        /* renamed from: component4, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        public final Pin copy(@NotNull Coordinate coordinates, @NotNull String icon, Integer pinsCount, Badge badge) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new Pin(coordinates, icon, pinsCount, badge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return Intrinsics.d(this.coordinates, pin.coordinates) && Intrinsics.d(this.icon, pin.icon) && Intrinsics.d(this.pinsCount, pin.pinsCount) && Intrinsics.d(this.badge, pin.badge);
        }

        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        public final Coordinate getCoordinates() {
            return this.coordinates;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final Integer getPinsCount() {
            return this.pinsCount;
        }

        public int hashCode() {
            int a11 = g.a(this.coordinates.hashCode() * 31, 31, this.icon);
            Integer num = this.pinsCount;
            int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            Badge badge = this.badge;
            return hashCode + (badge != null ? badge.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Pin(coordinates=" + this.coordinates + ", icon=" + this.icon + ", pinsCount=" + this.pinsCount + ", badge=" + this.badge + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$ViewPort;", "", "leftBottom", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;", "rightTop", "<init>", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;)V", "getLeftBottom", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Coordinate;", "getRightTop", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public AddressEditMapDTO(boolean z11, @NotNull Pin centerPin, AtomActionDTO atomActionDTO, List<BadgeDTO> list, ViewPort viewPort, LocationMarker locationMarker, String str, String str2, @NotNull Icons icons, BannerInfo bannerInfo, List<Selector> list2, TabsDTO tabsDTO, boolean z12, String str3, String str4, Map<String, TokenizedTrackingInfo> map, MetaInfo metaInfo, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, @ProtoOneOfSignature(name = "mapObjectCollection", type = MapObjectCollection.class) @ProtoOneOf(label = "type") MarkerBundle markerBundle, MiniAppHeader miniAppHeader, Map<String, TokenizedTrackingInfo> map2, NumberPVZ numberPVZ) {
        Intrinsics.checkNotNullParameter(centerPin, "centerPin");
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.showCenterPin = z11;
        this.centerPin = centerPin;
        this.bottomSheetAction = atomActionDTO;
        this.bottomSheetBadges = list;
        this.viewport = viewPort;
        this.userLocationMarker = locationMarker;
        this.linkTplDragCenter = str;
        this.linkTplZoomInOut = str2;
        this.icons = icons;
        this.bannerInfo = bannerInfo;
        this.selector = list2;
        this.dsTabs = tabsDTO;
        this.isNavbarHidden = z12;
        this.navbarTitle = str3;
        this.navbarSubtitle = str4;
        this.trackingInfo = map;
        this.metaInfo = metaInfo;
        this.geolocationOnInit = bool;
        this.clusterizationEnabled = bool2;
        this.isNeedStartClusterization = bool3;
        this.mergedPinsActionBaseLink = str5;
        this.actionBaseLink = str6;
        this.markerBundle = markerBundle;
        this.miniAppHeader = miniAppHeader;
        this.bottomSheetTrackingInfo = map2;
        this.numberPVZ = numberPVZ;
    }

    public static /* synthetic */ AddressEditMapDTO copy$default(AddressEditMapDTO addressEditMapDTO, boolean z11, Pin pin, AtomActionDTO atomActionDTO, List list, ViewPort viewPort, LocationMarker locationMarker, String str, String str2, Icons icons, BannerInfo bannerInfo, List list2, TabsDTO tabsDTO, boolean z12, String str3, String str4, Map map, MetaInfo metaInfo, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, MarkerBundle markerBundle, MiniAppHeader miniAppHeader, Map map2, NumberPVZ numberPVZ, int i11, Object obj) {
        NumberPVZ numberPVZ2;
        Map map3;
        boolean z13 = (i11 & 1) != 0 ? addressEditMapDTO.showCenterPin : z11;
        Pin pin2 = (i11 & 2) != 0 ? addressEditMapDTO.centerPin : pin;
        AtomActionDTO atomActionDTO2 = (i11 & 4) != 0 ? addressEditMapDTO.bottomSheetAction : atomActionDTO;
        List list3 = (i11 & 8) != 0 ? addressEditMapDTO.bottomSheetBadges : list;
        ViewPort viewPort2 = (i11 & 16) != 0 ? addressEditMapDTO.viewport : viewPort;
        LocationMarker locationMarker2 = (i11 & 32) != 0 ? addressEditMapDTO.userLocationMarker : locationMarker;
        String str7 = (i11 & 64) != 0 ? addressEditMapDTO.linkTplDragCenter : str;
        String str8 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? addressEditMapDTO.linkTplZoomInOut : str2;
        Icons icons2 = (i11 & 256) != 0 ? addressEditMapDTO.icons : icons;
        BannerInfo bannerInfo2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? addressEditMapDTO.bannerInfo : bannerInfo;
        List list4 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? addressEditMapDTO.selector : list2;
        TabsDTO tabsDTO2 = (i11 & 2048) != 0 ? addressEditMapDTO.dsTabs : tabsDTO;
        boolean z14 = (i11 & 4096) != 0 ? addressEditMapDTO.isNavbarHidden : z12;
        String str9 = (i11 & 8192) != 0 ? addressEditMapDTO.navbarTitle : str3;
        boolean z15 = z13;
        String str10 = (i11 & 16384) != 0 ? addressEditMapDTO.navbarSubtitle : str4;
        Map map4 = (i11 & 32768) != 0 ? addressEditMapDTO.trackingInfo : map;
        MetaInfo metaInfo2 = (i11 & 65536) != 0 ? addressEditMapDTO.metaInfo : metaInfo;
        Boolean bool4 = (i11 & 131072) != 0 ? addressEditMapDTO.geolocationOnInit : bool;
        Boolean bool5 = (i11 & 262144) != 0 ? addressEditMapDTO.clusterizationEnabled : bool2;
        Boolean bool6 = (i11 & 524288) != 0 ? addressEditMapDTO.isNeedStartClusterization : bool3;
        String str11 = (i11 & 1048576) != 0 ? addressEditMapDTO.mergedPinsActionBaseLink : str5;
        String str12 = (i11 & 2097152) != 0 ? addressEditMapDTO.actionBaseLink : str6;
        MarkerBundle markerBundle2 = (i11 & 4194304) != 0 ? addressEditMapDTO.markerBundle : markerBundle;
        MiniAppHeader miniAppHeader2 = (i11 & 8388608) != 0 ? addressEditMapDTO.miniAppHeader : miniAppHeader;
        Map map5 = (i11 & 16777216) != 0 ? addressEditMapDTO.bottomSheetTrackingInfo : map2;
        if ((i11 & 33554432) != 0) {
            map3 = map5;
            numberPVZ2 = addressEditMapDTO.numberPVZ;
        } else {
            numberPVZ2 = numberPVZ;
            map3 = map5;
        }
        return addressEditMapDTO.copy(z15, pin2, atomActionDTO2, list3, viewPort2, locationMarker2, str7, str8, icons2, bannerInfo2, list4, tabsDTO2, z14, str9, str10, map4, metaInfo2, bool4, bool5, bool6, str11, str12, markerBundle2, miniAppHeader2, map3, numberPVZ2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowCenterPin() {
        return this.showCenterPin;
    }

    /* renamed from: component10, reason: from getter */
    public final BannerInfo getBannerInfo() {
        return this.bannerInfo;
    }

    public final List<Selector> component11() {
        return this.selector;
    }

    /* renamed from: component12, reason: from getter */
    public final TabsDTO getDsTabs() {
        return this.dsTabs;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsNavbarHidden() {
        return this.isNavbarHidden;
    }

    /* renamed from: component14, reason: from getter */
    public final String getNavbarTitle() {
        return this.navbarTitle;
    }

    /* renamed from: component15, reason: from getter */
    public final String getNavbarSubtitle() {
        return this.navbarSubtitle;
    }

    public final Map<String, TokenizedTrackingInfo> component16() {
        return this.trackingInfo;
    }

    /* renamed from: component17, reason: from getter */
    public final MetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getGeolocationOnInit() {
        return this.geolocationOnInit;
    }

    /* renamed from: component19, reason: from getter */
    public final Boolean getClusterizationEnabled() {
        return this.clusterizationEnabled;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Pin getCenterPin() {
        return this.centerPin;
    }

    /* renamed from: component20, reason: from getter */
    public final Boolean getIsNeedStartClusterization() {
        return this.isNeedStartClusterization;
    }

    /* renamed from: component21, reason: from getter */
    public final String getMergedPinsActionBaseLink() {
        return this.mergedPinsActionBaseLink;
    }

    /* renamed from: component22, reason: from getter */
    public final String getActionBaseLink() {
        return this.actionBaseLink;
    }

    /* renamed from: component23, reason: from getter */
    public final MarkerBundle getMarkerBundle() {
        return this.markerBundle;
    }

    /* renamed from: component24, reason: from getter */
    public final MiniAppHeader getMiniAppHeader() {
        return this.miniAppHeader;
    }

    public final Map<String, TokenizedTrackingInfo> component25() {
        return this.bottomSheetTrackingInfo;
    }

    /* renamed from: component26, reason: from getter */
    public final NumberPVZ getNumberPVZ() {
        return this.numberPVZ;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getBottomSheetAction() {
        return this.bottomSheetAction;
    }

    public final List<BadgeDTO> component4() {
        return this.bottomSheetBadges;
    }

    /* renamed from: component5, reason: from getter */
    public final ViewPort getViewport() {
        return this.viewport;
    }

    /* renamed from: component6, reason: from getter */
    public final LocationMarker getUserLocationMarker() {
        return this.userLocationMarker;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLinkTplDragCenter() {
        return this.linkTplDragCenter;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLinkTplZoomInOut() {
        return this.linkTplZoomInOut;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final Icons getIcons() {
        return this.icons;
    }

    @NotNull
    public final AddressEditMapDTO copy(boolean showCenterPin, @NotNull Pin centerPin, AtomActionDTO bottomSheetAction, List<BadgeDTO> bottomSheetBadges, ViewPort viewport, LocationMarker userLocationMarker, String linkTplDragCenter, String linkTplZoomInOut, @NotNull Icons icons, BannerInfo bannerInfo, List<Selector> selector, TabsDTO dsTabs, boolean isNavbarHidden, String navbarTitle, String navbarSubtitle, Map<String, TokenizedTrackingInfo> trackingInfo, MetaInfo metaInfo, Boolean geolocationOnInit, Boolean clusterizationEnabled, Boolean isNeedStartClusterization, String mergedPinsActionBaseLink, String actionBaseLink, @ProtoOneOfSignature(name = "mapObjectCollection", type = MapObjectCollection.class) @ProtoOneOf(label = "type") MarkerBundle markerBundle, MiniAppHeader miniAppHeader, Map<String, TokenizedTrackingInfo> bottomSheetTrackingInfo, NumberPVZ numberPVZ) {
        Intrinsics.checkNotNullParameter(centerPin, "centerPin");
        Intrinsics.checkNotNullParameter(icons, "icons");
        return new AddressEditMapDTO(showCenterPin, centerPin, bottomSheetAction, bottomSheetBadges, viewport, userLocationMarker, linkTplDragCenter, linkTplZoomInOut, icons, bannerInfo, selector, dsTabs, isNavbarHidden, navbarTitle, navbarSubtitle, trackingInfo, metaInfo, geolocationOnInit, clusterizationEnabled, isNeedStartClusterization, mergedPinsActionBaseLink, actionBaseLink, markerBundle, miniAppHeader, bottomSheetTrackingInfo, numberPVZ);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditMapDTO)) {
            return false;
        }
        AddressEditMapDTO addressEditMapDTO = (AddressEditMapDTO) other;
        return this.showCenterPin == addressEditMapDTO.showCenterPin && Intrinsics.d(this.centerPin, addressEditMapDTO.centerPin) && Intrinsics.d(this.bottomSheetAction, addressEditMapDTO.bottomSheetAction) && Intrinsics.d(this.bottomSheetBadges, addressEditMapDTO.bottomSheetBadges) && Intrinsics.d(this.viewport, addressEditMapDTO.viewport) && Intrinsics.d(this.userLocationMarker, addressEditMapDTO.userLocationMarker) && Intrinsics.d(this.linkTplDragCenter, addressEditMapDTO.linkTplDragCenter) && Intrinsics.d(this.linkTplZoomInOut, addressEditMapDTO.linkTplZoomInOut) && Intrinsics.d(this.icons, addressEditMapDTO.icons) && Intrinsics.d(this.bannerInfo, addressEditMapDTO.bannerInfo) && Intrinsics.d(this.selector, addressEditMapDTO.selector) && Intrinsics.d(this.dsTabs, addressEditMapDTO.dsTabs) && this.isNavbarHidden == addressEditMapDTO.isNavbarHidden && Intrinsics.d(this.navbarTitle, addressEditMapDTO.navbarTitle) && Intrinsics.d(this.navbarSubtitle, addressEditMapDTO.navbarSubtitle) && Intrinsics.d(this.trackingInfo, addressEditMapDTO.trackingInfo) && Intrinsics.d(this.metaInfo, addressEditMapDTO.metaInfo) && Intrinsics.d(this.geolocationOnInit, addressEditMapDTO.geolocationOnInit) && Intrinsics.d(this.clusterizationEnabled, addressEditMapDTO.clusterizationEnabled) && Intrinsics.d(this.isNeedStartClusterization, addressEditMapDTO.isNeedStartClusterization) && Intrinsics.d(this.mergedPinsActionBaseLink, addressEditMapDTO.mergedPinsActionBaseLink) && Intrinsics.d(this.actionBaseLink, addressEditMapDTO.actionBaseLink) && Intrinsics.d(this.markerBundle, addressEditMapDTO.markerBundle) && Intrinsics.d(this.miniAppHeader, addressEditMapDTO.miniAppHeader) && Intrinsics.d(this.bottomSheetTrackingInfo, addressEditMapDTO.bottomSheetTrackingInfo) && Intrinsics.d(this.numberPVZ, addressEditMapDTO.numberPVZ);
    }

    public final String getActionBaseLink() {
        return this.actionBaseLink;
    }

    public final BannerInfo getBannerInfo() {
        return this.bannerInfo;
    }

    public final AtomActionDTO getBottomSheetAction() {
        return this.bottomSheetAction;
    }

    public final List<BadgeDTO> getBottomSheetBadges() {
        return this.bottomSheetBadges;
    }

    public final Map<String, TokenizedTrackingInfo> getBottomSheetTrackingInfo() {
        return this.bottomSheetTrackingInfo;
    }

    @NotNull
    public final Pin getCenterPin() {
        return this.centerPin;
    }

    public final Boolean getClusterizationEnabled() {
        return this.clusterizationEnabled;
    }

    public final TabsDTO getDsTabs() {
        return this.dsTabs;
    }

    public final Boolean getGeolocationOnInit() {
        return this.geolocationOnInit;
    }

    @NotNull
    public final Icons getIcons() {
        return this.icons;
    }

    public final String getLinkTplDragCenter() {
        return this.linkTplDragCenter;
    }

    public final String getLinkTplZoomInOut() {
        return this.linkTplZoomInOut;
    }

    public final MarkerBundle getMarkerBundle() {
        return this.markerBundle;
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

    public final List<Selector> getSelector() {
        return this.selector;
    }

    public final boolean getShowCenterPin() {
        return this.showCenterPin;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final LocationMarker getUserLocationMarker() {
        return this.userLocationMarker;
    }

    public final ViewPort getViewport() {
        return this.viewport;
    }

    public int hashCode() {
        int hashCode = (this.centerPin.hashCode() + (Boolean.hashCode(this.showCenterPin) * 31)) * 31;
        AtomActionDTO atomActionDTO = this.bottomSheetAction;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        List<BadgeDTO> list = this.bottomSheetBadges;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ViewPort viewPort = this.viewport;
        int hashCode4 = (hashCode3 + (viewPort == null ? 0 : viewPort.hashCode())) * 31;
        LocationMarker locationMarker = this.userLocationMarker;
        int hashCode5 = (hashCode4 + (locationMarker == null ? 0 : locationMarker.hashCode())) * 31;
        String str = this.linkTplDragCenter;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.linkTplZoomInOut;
        int hashCode7 = (this.icons.hashCode() + ((hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        BannerInfo bannerInfo = this.bannerInfo;
        int hashCode8 = (hashCode7 + (bannerInfo == null ? 0 : bannerInfo.hashCode())) * 31;
        List<Selector> list2 = this.selector;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        TabsDTO tabsDTO = this.dsTabs;
        int a11 = C3532b.a((hashCode9 + (tabsDTO == null ? 0 : tabsDTO.hashCode())) * 31, 31, this.isNavbarHidden);
        String str3 = this.navbarTitle;
        int hashCode10 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.navbarSubtitle;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode12 = (hashCode11 + (map == null ? 0 : map.hashCode())) * 31;
        MetaInfo metaInfo = this.metaInfo;
        int hashCode13 = (hashCode12 + (metaInfo == null ? 0 : metaInfo.hashCode())) * 31;
        Boolean bool = this.geolocationOnInit;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.clusterizationEnabled;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isNeedStartClusterization;
        int hashCode16 = (hashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.mergedPinsActionBaseLink;
        int hashCode17 = (hashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.actionBaseLink;
        int hashCode18 = (hashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
        MarkerBundle markerBundle = this.markerBundle;
        int hashCode19 = (hashCode18 + (markerBundle == null ? 0 : markerBundle.hashCode())) * 31;
        MiniAppHeader miniAppHeader = this.miniAppHeader;
        int hashCode20 = (hashCode19 + (miniAppHeader == null ? 0 : miniAppHeader.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.bottomSheetTrackingInfo;
        int hashCode21 = (hashCode20 + (map2 == null ? 0 : map2.hashCode())) * 31;
        NumberPVZ numberPVZ = this.numberPVZ;
        return hashCode21 + (numberPVZ != null ? numberPVZ.hashCode() : 0);
    }

    public final boolean isNavbarHidden() {
        return this.isNavbarHidden;
    }

    public final Boolean isNeedStartClusterization() {
        return this.isNeedStartClusterization;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.showCenterPin;
        Pin pin = this.centerPin;
        AtomActionDTO atomActionDTO = this.bottomSheetAction;
        List<BadgeDTO> list = this.bottomSheetBadges;
        ViewPort viewPort = this.viewport;
        LocationMarker locationMarker = this.userLocationMarker;
        String str = this.linkTplDragCenter;
        String str2 = this.linkTplZoomInOut;
        Icons icons = this.icons;
        BannerInfo bannerInfo = this.bannerInfo;
        List<Selector> list2 = this.selector;
        TabsDTO tabsDTO = this.dsTabs;
        boolean z12 = this.isNavbarHidden;
        String str3 = this.navbarTitle;
        String str4 = this.navbarSubtitle;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        MetaInfo metaInfo = this.metaInfo;
        Boolean bool = this.geolocationOnInit;
        Boolean bool2 = this.clusterizationEnabled;
        Boolean bool3 = this.isNeedStartClusterization;
        String str5 = this.mergedPinsActionBaseLink;
        String str6 = this.actionBaseLink;
        MarkerBundle markerBundle = this.markerBundle;
        MiniAppHeader miniAppHeader = this.miniAppHeader;
        Map<String, TokenizedTrackingInfo> map2 = this.bottomSheetTrackingInfo;
        NumberPVZ numberPVZ = this.numberPVZ;
        StringBuilder sb2 = new StringBuilder("AddressEditMapDTO(showCenterPin=");
        sb2.append(z11);
        sb2.append(", centerPin=");
        sb2.append(pin);
        sb2.append(", bottomSheetAction=");
        sb2.append(atomActionDTO);
        sb2.append(", bottomSheetBadges=");
        sb2.append(list);
        sb2.append(", viewport=");
        sb2.append(viewPort);
        sb2.append(", userLocationMarker=");
        sb2.append(locationMarker);
        sb2.append(", linkTplDragCenter=");
        Nh.a.h(sb2, str, ", linkTplZoomInOut=", str2, ", icons=");
        sb2.append(icons);
        sb2.append(", bannerInfo=");
        sb2.append(bannerInfo);
        sb2.append(", selector=");
        sb2.append(list2);
        sb2.append(", dsTabs=");
        sb2.append(tabsDTO);
        sb2.append(", isNavbarHidden=");
        C5766e.a(", navbarTitle=", str3, ", navbarSubtitle=", sb2, z12);
        C2638a.e(sb2, str4, ", trackingInfo=", map, ", metaInfo=");
        sb2.append(metaInfo);
        sb2.append(", geolocationOnInit=");
        sb2.append(bool);
        sb2.append(", clusterizationEnabled=");
        h.h(sb2, bool2, ", isNeedStartClusterization=", bool3, ", mergedPinsActionBaseLink=");
        Nh.a.h(sb2, str5, ", actionBaseLink=", str6, ", markerBundle=");
        sb2.append(markerBundle);
        sb2.append(", miniAppHeader=");
        sb2.append(miniAppHeader);
        sb2.append(", bottomSheetTrackingInfo=");
        sb2.append(map2);
        sb2.append(", numberPVZ=");
        sb2.append(numberPVZ);
        sb2.append(")");
        return sb2.toString();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "selected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "type", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "<init>", "(Ljava/lang/String;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;)V", "getTitle", "()Ljava/lang/String;", "getSelected", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getType", "()Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Type", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Selector {

        @NotNull
        private final AtomActionDTO action;
        private final boolean selected;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_INVALID", "TYPE_COURIER", "TYPE_PICKUP_POINT", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type TYPE_INVALID = new Type("TYPE_INVALID", 0);
            public static final Type TYPE_COURIER = new Type("TYPE_COURIER", 1);
            public static final Type TYPE_PICKUP_POINT = new Type("TYPE_PICKUP_POINT", 2);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{TYPE_INVALID, TYPE_COURIER, TYPE_PICKUP_POINT};
            }

            static {
                Type[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Type(String str, int i11) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public Selector(@NotNull String title, boolean z11, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, @NotNull Type type) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(type, "type");
            this.title = title;
            this.selected = z11;
            this.action = action;
            this.trackingInfo = map;
            this.type = type;
        }

        public static /* synthetic */ Selector copy$default(Selector selector, String str, boolean z11, AtomActionDTO atomActionDTO, Map map, Type type, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = selector.title;
            }
            if ((i11 & 2) != 0) {
                z11 = selector.selected;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = selector.action;
            }
            if ((i11 & 8) != 0) {
                map = selector.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                type = selector.type;
            }
            Type type2 = type;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return selector.copy(str, z11, atomActionDTO2, map, type2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        @NotNull
        public final Selector copy(@NotNull String title, boolean selected, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull Type type) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Selector(title, selected, action, trackingInfo, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selector)) {
                return false;
            }
            Selector selector = (Selector) other;
            return Intrinsics.d(this.title, selector.title) && this.selected == selector.selected && Intrinsics.d(this.action, selector.action) && Intrinsics.d(this.trackingInfo, selector.trackingInfo) && this.type == selector.type;
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final boolean getSelected() {
            return this.selected;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            int b11 = Ih.a.b(this.action, C3532b.a(this.title.hashCode() * 31, 31, this.selected), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return this.type.hashCode() + ((b11 + (map == null ? 0 : map.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            boolean z11 = this.selected;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Type type = this.type;
            StringBuilder b11 = C4636t5.b("Selector(title=", str, ", selected=", ", action=", z11);
            Sh.b.f(b11, atomActionDTO, ", trackingInfo=", map, ", type=");
            b11.append(type);
            b11.append(")");
            return b11.toString();
        }

        public /* synthetic */ Selector(String str, boolean z11, AtomActionDTO atomActionDTO, Map map, Type type, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? false : z11, atomActionDTO, map, type);
        }
    }

    public /* synthetic */ AddressEditMapDTO(boolean z11, Pin pin, AtomActionDTO atomActionDTO, List list, ViewPort viewPort, LocationMarker locationMarker, String str, String str2, Icons icons, BannerInfo bannerInfo, List list2, TabsDTO tabsDTO, boolean z12, String str3, String str4, Map map, MetaInfo metaInfo, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, MarkerBundle markerBundle, MiniAppHeader miniAppHeader, Map map2, NumberPVZ numberPVZ, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, pin, atomActionDTO, list, viewPort, locationMarker, str, str2, icons, bannerInfo, list2, tabsDTO, (i11 & 4096) != 0 ? false : z12, str3, str4, map, metaInfo, (i11 & 131072) != 0 ? Boolean.FALSE : bool, bool2, bool3, str5, str6, markerBundle, miniAppHeader, map2, numberPVZ);
    }
}
