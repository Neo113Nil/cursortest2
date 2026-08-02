package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Ak.C2436a;
import Am.C2438a;
import B0.C2454a;
import C.o0;
import Cm.e;
import El.C2971a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import T7.P;
import Ve.C4598rp;
import Ve.C4636t5;
import WZ.t;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;
import ru.ozon.app.android.travel.molecules.view.awardBadge.AwardBadgeVI;
import ru.ozon.app.android.travel.pageconfigurator.fullScreen.WindowInsetsWrapper;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import we0.m;
import we0.n;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\bE\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\fmnopqrstuvwxBÝ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001a0\u0016\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001e\u001a\u00020\f\u0012\u0006\u0010\u001f\u001a\u00020\f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010.J\u008c\u0002\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001a0\u00162\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010*\u001a\u00020)HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020)2\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bA\u0010@R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010Q\u001a\u0004\bR\u0010SR#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010T\u001a\u0004\bU\u0010VR#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001a0\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010T\u001a\u0004\bW\u0010VR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\u001e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010E\u001a\u0004\b[\u0010GR\u0017\u0010\u001f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010E\u001a\u0004\b\\\u0010GR\u0019\u0010 \u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b \u0010]\u001a\u0004\b^\u0010.R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010b\u001a\u0004\bc\u0010dR\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010e\u001a\u0004\bf\u0010gR\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010k\u001a\u0004\b*\u0010l¨\u0006y"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lwe0/n;", "visibleRegion", "Lwe0/m;", "centerLatLng", "locationPoint", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinsDisplaySettings;", "pinsDisplaySettings", "Lru/ozon/uni/atoms/af/AtomAction;", "fetchPinsAction", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$DownloadPinsAction;", "downloadPinsAction", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinTypes;", "pinTypes", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;", "cardStyle", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "outOfBoundsBar", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "pins", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "cards", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO;", "districts", "onBackPressedAction", "fetchCardsAction", "regionHash", "Lru/ozon/app/android/travel/pageconfigurator/fullScreen/WindowInsetsWrapper;", "insetsWrapper", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;", "pinLimits", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$DelaySettings;", "delaySettings", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$TrackingEvents;", "trackingEvents", "", "isNewVersion", "<init>", "(JLwe0/n;Lwe0/m;Lwe0/m;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinsDisplaySettings;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$DownloadPinsAction;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinTypes;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/app/android/travel/pageconfigurator/fullScreen/WindowInsetsWrapper;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$DelaySettings;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$TrackingEvents;Z)V", "toString", "()Ljava/lang/String;", "copy", "(JLwe0/n;Lwe0/m;Lwe0/m;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinsDisplaySettings;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$DownloadPinsAction;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinTypes;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/app/android/travel/pageconfigurator/fullScreen/WindowInsetsWrapper;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$DelaySettings;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$TrackingEvents;Z)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lwe0/n;", "getVisibleRegion", "()Lwe0/n;", "Lwe0/m;", "getCenterLatLng", "()Lwe0/m;", "getLocationPoint", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinsDisplaySettings;", "getPinsDisplaySettings", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinsDisplaySettings;", "Lru/ozon/uni/atoms/af/AtomAction;", "getFetchPinsAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$DownloadPinsAction;", "getDownloadPinsAction", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$DownloadPinsAction;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinTypes;", "getPinTypes", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinTypes;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;", "getCardStyle", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getOutOfBoundsBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Ljava/util/concurrent/ConcurrentHashMap;", "getPins", "()Ljava/util/concurrent/ConcurrentHashMap;", "getCards", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO;", "getDistricts", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DistrictsVO;", "getOnBackPressedAction", "getFetchCardsAction", "Ljava/lang/String;", "getRegionHash", "Lru/ozon/app/android/travel/pageconfigurator/fullScreen/WindowInsetsWrapper;", "getInsetsWrapper", "()Lru/ozon/app/android/travel/pageconfigurator/fullScreen/WindowInsetsWrapper;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;", "getPinLimits", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$PinLimits;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$DelaySettings;", "getDelaySettings", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$DelaySettings;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$TrackingEvents;", "getTrackingEvents", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$TrackingEvents;", "Z", "()Z", "Pin", "DownloadPinsAction", "CardState", "Loader", "PriceLoader", "Card", "ImageVO", "PinTypes", "PricePinStates", "PointPinStates", "PinsDisplaySettings", "TrackingEvents", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsMapInfoV4VO implements c {

    @NotNull
    private final HotelsMapInfoV4DTO.CardStyle cardStyle;

    @NotNull
    private final ConcurrentHashMap<String, Card> cards;
    private final m centerLatLng;
    private final HotelsMapInfoV4DTO.DelaySettings delaySettings;
    private final DistrictsVO districts;

    @NotNull
    private final DownloadPinsAction downloadPinsAction;

    @NotNull
    private final AtomAction fetchCardsAction;

    @NotNull
    private final AtomAction fetchPinsAction;
    private final long id;
    private final WindowInsetsWrapper insetsWrapper;
    private final boolean isNewVersion;
    private final m locationPoint;

    @NotNull
    private final AtomAction onBackPressedAction;
    private final NotificationDTO outOfBoundsBar;

    @NotNull
    private final HotelsMapInfoV4DTO.PinLimits pinLimits;

    @NotNull
    private final PinTypes pinTypes;

    @NotNull
    private final ConcurrentHashMap<String, Pin> pins;

    @NotNull
    private final PinsDisplaySettings pinsDisplaySettings;
    private final String regionHash;
    private final TrackingEvents trackingEvents;
    private final n visibleRegion;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;", "", "id", "", "getId", "()Ljava/lang/String;", "isCompactWidth", "", "()Z", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Loader;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PriceLoader;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CardState {
        @NotNull
        String getId();

        /* renamed from: isCompactWidth */
        boolean getIsCompactWidth();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$DownloadPinsAction;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "nextAction", "", "nextFetchInterval", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getNextAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "J", "getNextFetchInterval", "()J", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DownloadPinsAction {
        private final AtomAction nextAction;
        private final long nextFetchInterval;

        public DownloadPinsAction(AtomAction atomAction, long j11) {
            this.nextAction = atomAction;
            this.nextFetchInterval = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadPinsAction)) {
                return false;
            }
            DownloadPinsAction downloadPinsAction = (DownloadPinsAction) other;
            return Intrinsics.d(this.nextAction, downloadPinsAction.nextAction) && this.nextFetchInterval == downloadPinsAction.nextFetchInterval;
        }

        public final AtomAction getNextAction() {
            return this.nextAction;
        }

        public final long getNextFetchInterval() {
            return this.nextFetchInterval;
        }

        public int hashCode() {
            AtomAction atomAction = this.nextAction;
            return Long.hashCode(this.nextFetchInterval) + ((atomAction == null ? 0 : atomAction.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "DownloadPinsAction(nextAction=" + this.nextAction + ", nextFetchInterval=" + this.nextFetchInterval + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$ImageVO;", "", "", "id", "", ImagesContract.URL, "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getUrl", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageVO {
        private final int id;

        @NotNull
        private final String url;

        public ImageVO(int i11, @NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.id = i11;
            this.url = url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageVO)) {
                return false;
            }
            ImageVO imageVO = (ImageVO) other;
            return this.id == imageVO.id && Intrinsics.d(this.url, imageVO.url);
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return Nh.a.c(this.id, "ImageVO(id=", ", url=", this.url, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Loader;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;", "", "id", "", "isCompactWidth", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Z", "()Z", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loader implements CardState {

        @NotNull
        private final String id;
        private final boolean isCompactWidth;

        public Loader(@NotNull String id2, boolean z11) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.id = id2;
            this.isCompactWidth = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loader)) {
                return false;
            }
            Loader loader = (Loader) other;
            return Intrinsics.d(this.id, loader.id) && this.isCompactWidth == loader.isCompactWidth;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO.CardState
        @NotNull
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCompactWidth) + (this.id.hashCode() * 31);
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO.CardState
        /* renamed from: isCompactWidth, reason: from getter */
        public boolean getIsCompactWidth() {
            return this.isCompactWidth;
        }

        @NotNull
        public String toString() {
            return Ak.b.f("Loader(id=", this.id, ", isCompactWidth=", ")", this.isCompactWidth);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinTypes;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates;", "highRanked", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates;", "lowRanked", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates;", "getHighRanked", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates;", "getLowRanked", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PinTypes {

        @NotNull
        private final PricePinStates highRanked;

        @NotNull
        private final PointPinStates lowRanked;

        public PinTypes(@NotNull PricePinStates highRanked, @NotNull PointPinStates lowRanked) {
            Intrinsics.checkNotNullParameter(highRanked, "highRanked");
            Intrinsics.checkNotNullParameter(lowRanked, "lowRanked");
            this.highRanked = highRanked;
            this.lowRanked = lowRanked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PinTypes)) {
                return false;
            }
            PinTypes pinTypes = (PinTypes) other;
            return Intrinsics.d(this.highRanked, pinTypes.highRanked) && Intrinsics.d(this.lowRanked, pinTypes.lowRanked);
        }

        @NotNull
        public final PricePinStates getHighRanked() {
            return this.highRanked;
        }

        @NotNull
        public final PointPinStates getLowRanked() {
            return this.lowRanked;
        }

        public int hashCode() {
            return this.lowRanked.hashCode() + (this.highRanked.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PinTypes(highRanked=" + this.highRanked + ", lowRanked=" + this.lowRanked + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PinsDisplaySettings;", "", "", "latitudeCellPxSize", "longitudeCellPxSize", "", "lowRankedPercentPerCell", "lowRankedPerCellMin", "lowRankedPerCellMax", "showHighRankedZoom", "<init>", "(IIFLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLatitudeCellPxSize", "getLongitudeCellPxSize", "F", "getLowRankedPercentPerCell", "()F", "Ljava/lang/Integer;", "getLowRankedPerCellMin", "()Ljava/lang/Integer;", "getLowRankedPerCellMax", "Ljava/lang/Float;", "getShowHighRankedZoom", "()Ljava/lang/Float;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PinsDisplaySettings {
        private final int latitudeCellPxSize;
        private final int longitudeCellPxSize;
        private final Integer lowRankedPerCellMax;
        private final Integer lowRankedPerCellMin;
        private final float lowRankedPercentPerCell;
        private final Float showHighRankedZoom;

        public PinsDisplaySettings(int i11, int i12, float f7, Integer num, Integer num2, Float f11) {
            this.latitudeCellPxSize = i11;
            this.longitudeCellPxSize = i12;
            this.lowRankedPercentPerCell = f7;
            this.lowRankedPerCellMin = num;
            this.lowRankedPerCellMax = num2;
            this.showHighRankedZoom = f11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PinsDisplaySettings)) {
                return false;
            }
            PinsDisplaySettings pinsDisplaySettings = (PinsDisplaySettings) other;
            return this.latitudeCellPxSize == pinsDisplaySettings.latitudeCellPxSize && this.longitudeCellPxSize == pinsDisplaySettings.longitudeCellPxSize && Float.compare(this.lowRankedPercentPerCell, pinsDisplaySettings.lowRankedPercentPerCell) == 0 && Intrinsics.d(this.lowRankedPerCellMin, pinsDisplaySettings.lowRankedPerCellMin) && Intrinsics.d(this.lowRankedPerCellMax, pinsDisplaySettings.lowRankedPerCellMax) && Intrinsics.d(this.showHighRankedZoom, pinsDisplaySettings.showHighRankedZoom);
        }

        public final int getLatitudeCellPxSize() {
            return this.latitudeCellPxSize;
        }

        public final int getLongitudeCellPxSize() {
            return this.longitudeCellPxSize;
        }

        public final Integer getLowRankedPerCellMax() {
            return this.lowRankedPerCellMax;
        }

        public final Integer getLowRankedPerCellMin() {
            return this.lowRankedPerCellMin;
        }

        public final float getLowRankedPercentPerCell() {
            return this.lowRankedPercentPerCell;
        }

        public final Float getShowHighRankedZoom() {
            return this.showHighRankedZoom;
        }

        public int hashCode() {
            int a11 = Pk0.b.a(this.lowRankedPercentPerCell, C2454a.a(this.longitudeCellPxSize, Integer.hashCode(this.latitudeCellPxSize) * 31, 31), 31);
            Integer num = this.lowRankedPerCellMin;
            int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.lowRankedPerCellMax;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Float f7 = this.showHighRankedZoom;
            return hashCode2 + (f7 != null ? f7.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.latitudeCellPxSize;
            int i12 = this.longitudeCellPxSize;
            float f7 = this.lowRankedPercentPerCell;
            Integer num = this.lowRankedPerCellMin;
            Integer num2 = this.lowRankedPerCellMax;
            Float f11 = this.showHighRankedZoom;
            StringBuilder a11 = C2438a.a("PinsDisplaySettings(latitudeCellPxSize=", i11, ", longitudeCellPxSize=", ", lowRankedPercentPerCell=", i12);
            a11.append(f7);
            a11.append(", lowRankedPerCellMin=");
            a11.append(num);
            a11.append(", lowRankedPerCellMax=");
            a11.append(num2);
            a11.append(", showHighRankedZoom=");
            a11.append(f11);
            a11.append(")");
            return a11.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates$PinStyles;", "default", "selected", "viewed", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates$PinStyles;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates$PinStyles;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates$PinStyles;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates$PinStyles;", "getDefault", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates$PinStyles;", "getSelected", "getViewed", "PinStyles", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PointPinStates {

        @NotNull
        private final PinStyles default;
        private final PinStyles selected;
        private final PinStyles viewed;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PointPinStates$PinStyles;", "", "", "edgeSize", "", "backgroundColor", "", "borderWidth", "borderColor", "<init>", "(ILjava/lang/String;FLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getEdgeSize", "Ljava/lang/String;", "getBackgroundColor", "F", "getBorderWidth", "()F", "getBorderColor", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PinStyles {

            @NotNull
            private final String backgroundColor;
            private final String borderColor;
            private final float borderWidth;
            private final int edgeSize;

            public PinStyles(int i11, @NotNull String backgroundColor, float f7, String str) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.edgeSize = i11;
                this.backgroundColor = backgroundColor;
                this.borderWidth = f7;
                this.borderColor = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PinStyles)) {
                    return false;
                }
                PinStyles pinStyles = (PinStyles) other;
                return this.edgeSize == pinStyles.edgeSize && Intrinsics.d(this.backgroundColor, pinStyles.backgroundColor) && Float.compare(this.borderWidth, pinStyles.borderWidth) == 0 && Intrinsics.d(this.borderColor, pinStyles.borderColor);
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            public final float getBorderWidth() {
                return this.borderWidth;
            }

            public final int getEdgeSize() {
                return this.edgeSize;
            }

            public int hashCode() {
                int a11 = Pk0.b.a(this.borderWidth, g.a(Integer.hashCode(this.edgeSize) * 31, 31, this.backgroundColor), 31);
                String str = this.borderColor;
                return a11 + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                int i11 = this.edgeSize;
                String str = this.backgroundColor;
                float f7 = this.borderWidth;
                String str2 = this.borderColor;
                StringBuilder g10 = e.g(i11, "PinStyles(edgeSize=", ", backgroundColor=", str, ", borderWidth=");
                g10.append(f7);
                g10.append(", borderColor=");
                g10.append(str2);
                g10.append(")");
                return g10.toString();
            }
        }

        public PointPinStates(@NotNull PinStyles pinStyles, PinStyles pinStyles2, PinStyles pinStyles3) {
            Intrinsics.checkNotNullParameter(pinStyles, "default");
            this.default = pinStyles;
            this.selected = pinStyles2;
            this.viewed = pinStyles3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointPinStates)) {
                return false;
            }
            PointPinStates pointPinStates = (PointPinStates) other;
            return Intrinsics.d(this.default, pointPinStates.default) && Intrinsics.d(this.selected, pointPinStates.selected) && Intrinsics.d(this.viewed, pointPinStates.viewed);
        }

        @NotNull
        public final PinStyles getDefault() {
            return this.default;
        }

        public final PinStyles getSelected() {
            return this.selected;
        }

        public final PinStyles getViewed() {
            return this.viewed;
        }

        public int hashCode() {
            int hashCode = this.default.hashCode() * 31;
            PinStyles pinStyles = this.selected;
            int hashCode2 = (hashCode + (pinStyles == null ? 0 : pinStyles.hashCode())) * 31;
            PinStyles pinStyles2 = this.viewed;
            return hashCode2 + (pinStyles2 != null ? pinStyles2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PointPinStates(default=" + this.default + ", selected=" + this.selected + ", viewed=" + this.viewed + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PriceLoader;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;", "", "id", "", "isCompactWidth", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "partialState", "<init>", "(Ljava/lang/String;ZLru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Z", "()Z", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "getPartialState", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceLoader implements CardState {

        @NotNull
        private final String id;
        private final boolean isCompactWidth;

        @NotNull
        private final Card partialState;

        public PriceLoader(@NotNull String id2, boolean z11, @NotNull Card partialState) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(partialState, "partialState");
            this.id = id2;
            this.isCompactWidth = z11;
            this.partialState = partialState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceLoader)) {
                return false;
            }
            PriceLoader priceLoader = (PriceLoader) other;
            return Intrinsics.d(this.id, priceLoader.id) && this.isCompactWidth == priceLoader.isCompactWidth && Intrinsics.d(this.partialState, priceLoader.partialState);
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO.CardState
        @NotNull
        public String getId() {
            return this.id;
        }

        @NotNull
        public final Card getPartialState() {
            return this.partialState;
        }

        public int hashCode() {
            return this.partialState.hashCode() + C3532b.a(this.id.hashCode() * 31, 31, this.isCompactWidth);
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO.CardState
        /* renamed from: isCompactWidth, reason: from getter */
        public boolean getIsCompactWidth() {
            return this.isCompactWidth;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            boolean z11 = this.isCompactWidth;
            Card card = this.partialState;
            StringBuilder b11 = C4636t5.b("PriceLoader(id=", str, ", isCompactWidth=", ", partialState=", z11);
            b11.append(card);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$TrackingEvents;", "", "LWZ/t;", "readyTrackingInfo", "pinCommonTrackingInfo", "loaderTrackingInfo", "<init>", "(LWZ/t;LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getReadyTrackingInfo", "()LWZ/t;", "getPinCommonTrackingInfo", "getLoaderTrackingInfo", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackingEvents {
        private final t loaderTrackingInfo;
        private final t pinCommonTrackingInfo;
        private final t readyTrackingInfo;

        public TrackingEvents(t tVar, t tVar2, t tVar3) {
            this.readyTrackingInfo = tVar;
            this.pinCommonTrackingInfo = tVar2;
            this.loaderTrackingInfo = tVar3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackingEvents)) {
                return false;
            }
            TrackingEvents trackingEvents = (TrackingEvents) other;
            return Intrinsics.d(this.readyTrackingInfo, trackingEvents.readyTrackingInfo) && Intrinsics.d(this.pinCommonTrackingInfo, trackingEvents.pinCommonTrackingInfo) && Intrinsics.d(this.loaderTrackingInfo, trackingEvents.loaderTrackingInfo);
        }

        public final t getLoaderTrackingInfo() {
            return this.loaderTrackingInfo;
        }

        public final t getPinCommonTrackingInfo() {
            return this.pinCommonTrackingInfo;
        }

        public final t getReadyTrackingInfo() {
            return this.readyTrackingInfo;
        }

        public int hashCode() {
            t tVar = this.readyTrackingInfo;
            int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
            t tVar2 = this.pinCommonTrackingInfo;
            int hashCode2 = (hashCode + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
            t tVar3 = this.loaderTrackingInfo;
            return hashCode2 + (tVar3 != null ? tVar3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            t tVar = this.readyTrackingInfo;
            t tVar2 = this.pinCommonTrackingInfo;
            t tVar3 = this.loaderTrackingInfo;
            StringBuilder sb2 = new StringBuilder("TrackingEvents(readyTrackingInfo=");
            sb2.append(tVar);
            sb2.append(", pinCommonTrackingInfo=");
            sb2.append(tVar2);
            sb2.append(", loaderTrackingInfo=");
            return Tl.b.d(sb2, tVar3, ")");
        }
    }

    public HotelsMapInfoV4VO(long j11, n nVar, m mVar, m mVar2, @NotNull PinsDisplaySettings pinsDisplaySettings, @NotNull AtomAction fetchPinsAction, @NotNull DownloadPinsAction downloadPinsAction, @NotNull PinTypes pinTypes, @NotNull HotelsMapInfoV4DTO.CardStyle cardStyle, NotificationDTO notificationDTO, @NotNull ConcurrentHashMap<String, Pin> pins, @NotNull ConcurrentHashMap<String, Card> cards, DistrictsVO districtsVO, @NotNull AtomAction onBackPressedAction, @NotNull AtomAction fetchCardsAction, String str, WindowInsetsWrapper windowInsetsWrapper, @NotNull HotelsMapInfoV4DTO.PinLimits pinLimits, HotelsMapInfoV4DTO.DelaySettings delaySettings, TrackingEvents trackingEvents, boolean z11) {
        Intrinsics.checkNotNullParameter(pinsDisplaySettings, "pinsDisplaySettings");
        Intrinsics.checkNotNullParameter(fetchPinsAction, "fetchPinsAction");
        Intrinsics.checkNotNullParameter(downloadPinsAction, "downloadPinsAction");
        Intrinsics.checkNotNullParameter(pinTypes, "pinTypes");
        Intrinsics.checkNotNullParameter(cardStyle, "cardStyle");
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(onBackPressedAction, "onBackPressedAction");
        Intrinsics.checkNotNullParameter(fetchCardsAction, "fetchCardsAction");
        Intrinsics.checkNotNullParameter(pinLimits, "pinLimits");
        this.id = j11;
        this.visibleRegion = nVar;
        this.centerLatLng = mVar;
        this.locationPoint = mVar2;
        this.pinsDisplaySettings = pinsDisplaySettings;
        this.fetchPinsAction = fetchPinsAction;
        this.downloadPinsAction = downloadPinsAction;
        this.pinTypes = pinTypes;
        this.cardStyle = cardStyle;
        this.outOfBoundsBar = notificationDTO;
        this.pins = pins;
        this.cards = cards;
        this.districts = districtsVO;
        this.onBackPressedAction = onBackPressedAction;
        this.fetchCardsAction = fetchCardsAction;
        this.regionHash = str;
        this.insetsWrapper = windowInsetsWrapper;
        this.pinLimits = pinLimits;
        this.delaySettings = delaySettings;
        this.trackingEvents = trackingEvents;
        this.isNewVersion = z11;
    }

    public static /* synthetic */ HotelsMapInfoV4VO copy$default(HotelsMapInfoV4VO hotelsMapInfoV4VO, long j11, n nVar, m mVar, m mVar2, PinsDisplaySettings pinsDisplaySettings, AtomAction atomAction, DownloadPinsAction downloadPinsAction, PinTypes pinTypes, HotelsMapInfoV4DTO.CardStyle cardStyle, NotificationDTO notificationDTO, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, DistrictsVO districtsVO, AtomAction atomAction2, AtomAction atomAction3, String str, WindowInsetsWrapper windowInsetsWrapper, HotelsMapInfoV4DTO.PinLimits pinLimits, HotelsMapInfoV4DTO.DelaySettings delaySettings, TrackingEvents trackingEvents, boolean z11, int i11, Object obj) {
        boolean z12;
        TrackingEvents trackingEvents2;
        long j12 = (i11 & 1) != 0 ? hotelsMapInfoV4VO.id : j11;
        n nVar2 = (i11 & 2) != 0 ? hotelsMapInfoV4VO.visibleRegion : nVar;
        m mVar3 = (i11 & 4) != 0 ? hotelsMapInfoV4VO.centerLatLng : mVar;
        m mVar4 = (i11 & 8) != 0 ? hotelsMapInfoV4VO.locationPoint : mVar2;
        PinsDisplaySettings pinsDisplaySettings2 = (i11 & 16) != 0 ? hotelsMapInfoV4VO.pinsDisplaySettings : pinsDisplaySettings;
        AtomAction atomAction4 = (i11 & 32) != 0 ? hotelsMapInfoV4VO.fetchPinsAction : atomAction;
        DownloadPinsAction downloadPinsAction2 = (i11 & 64) != 0 ? hotelsMapInfoV4VO.downloadPinsAction : downloadPinsAction;
        PinTypes pinTypes2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? hotelsMapInfoV4VO.pinTypes : pinTypes;
        HotelsMapInfoV4DTO.CardStyle cardStyle2 = (i11 & 256) != 0 ? hotelsMapInfoV4VO.cardStyle : cardStyle;
        NotificationDTO notificationDTO2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? hotelsMapInfoV4VO.outOfBoundsBar : notificationDTO;
        ConcurrentHashMap concurrentHashMap3 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? hotelsMapInfoV4VO.pins : concurrentHashMap;
        ConcurrentHashMap concurrentHashMap4 = (i11 & 2048) != 0 ? hotelsMapInfoV4VO.cards : concurrentHashMap2;
        DistrictsVO districtsVO2 = (i11 & 4096) != 0 ? hotelsMapInfoV4VO.districts : districtsVO;
        long j13 = j12;
        AtomAction atomAction5 = (i11 & 8192) != 0 ? hotelsMapInfoV4VO.onBackPressedAction : atomAction2;
        AtomAction atomAction6 = (i11 & 16384) != 0 ? hotelsMapInfoV4VO.fetchCardsAction : atomAction3;
        String str2 = (i11 & 32768) != 0 ? hotelsMapInfoV4VO.regionHash : str;
        WindowInsetsWrapper windowInsetsWrapper2 = (i11 & 65536) != 0 ? hotelsMapInfoV4VO.insetsWrapper : windowInsetsWrapper;
        HotelsMapInfoV4DTO.PinLimits pinLimits2 = (i11 & 131072) != 0 ? hotelsMapInfoV4VO.pinLimits : pinLimits;
        HotelsMapInfoV4DTO.DelaySettings delaySettings2 = (i11 & 262144) != 0 ? hotelsMapInfoV4VO.delaySettings : delaySettings;
        TrackingEvents trackingEvents3 = (i11 & 524288) != 0 ? hotelsMapInfoV4VO.trackingEvents : trackingEvents;
        if ((i11 & 1048576) != 0) {
            trackingEvents2 = trackingEvents3;
            z12 = hotelsMapInfoV4VO.isNewVersion;
        } else {
            z12 = z11;
            trackingEvents2 = trackingEvents3;
        }
        return hotelsMapInfoV4VO.copy(j13, nVar2, mVar3, mVar4, pinsDisplaySettings2, atomAction4, downloadPinsAction2, pinTypes2, cardStyle2, notificationDTO2, concurrentHashMap3, concurrentHashMap4, districtsVO2, atomAction5, atomAction6, str2, windowInsetsWrapper2, pinLimits2, delaySettings2, trackingEvents2, z12);
    }

    @NotNull
    public final HotelsMapInfoV4VO copy(long id2, n visibleRegion, m centerLatLng, m locationPoint, @NotNull PinsDisplaySettings pinsDisplaySettings, @NotNull AtomAction fetchPinsAction, @NotNull DownloadPinsAction downloadPinsAction, @NotNull PinTypes pinTypes, @NotNull HotelsMapInfoV4DTO.CardStyle cardStyle, NotificationDTO outOfBoundsBar, @NotNull ConcurrentHashMap<String, Pin> pins, @NotNull ConcurrentHashMap<String, Card> cards, DistrictsVO districts, @NotNull AtomAction onBackPressedAction, @NotNull AtomAction fetchCardsAction, String regionHash, WindowInsetsWrapper insetsWrapper, @NotNull HotelsMapInfoV4DTO.PinLimits pinLimits, HotelsMapInfoV4DTO.DelaySettings delaySettings, TrackingEvents trackingEvents, boolean isNewVersion) {
        Intrinsics.checkNotNullParameter(pinsDisplaySettings, "pinsDisplaySettings");
        Intrinsics.checkNotNullParameter(fetchPinsAction, "fetchPinsAction");
        Intrinsics.checkNotNullParameter(downloadPinsAction, "downloadPinsAction");
        Intrinsics.checkNotNullParameter(pinTypes, "pinTypes");
        Intrinsics.checkNotNullParameter(cardStyle, "cardStyle");
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(onBackPressedAction, "onBackPressedAction");
        Intrinsics.checkNotNullParameter(fetchCardsAction, "fetchCardsAction");
        Intrinsics.checkNotNullParameter(pinLimits, "pinLimits");
        return new HotelsMapInfoV4VO(id2, visibleRegion, centerLatLng, locationPoint, pinsDisplaySettings, fetchPinsAction, downloadPinsAction, pinTypes, cardStyle, outOfBoundsBar, pins, cards, districts, onBackPressedAction, fetchCardsAction, regionHash, insetsWrapper, pinLimits, delaySettings, trackingEvents, isNewVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsMapInfoV4VO)) {
            return false;
        }
        HotelsMapInfoV4VO hotelsMapInfoV4VO = (HotelsMapInfoV4VO) other;
        return this.id == hotelsMapInfoV4VO.id && Intrinsics.d(this.visibleRegion, hotelsMapInfoV4VO.visibleRegion) && Intrinsics.d(this.centerLatLng, hotelsMapInfoV4VO.centerLatLng) && Intrinsics.d(this.locationPoint, hotelsMapInfoV4VO.locationPoint) && Intrinsics.d(this.pinsDisplaySettings, hotelsMapInfoV4VO.pinsDisplaySettings) && Intrinsics.d(this.fetchPinsAction, hotelsMapInfoV4VO.fetchPinsAction) && Intrinsics.d(this.downloadPinsAction, hotelsMapInfoV4VO.downloadPinsAction) && Intrinsics.d(this.pinTypes, hotelsMapInfoV4VO.pinTypes) && Intrinsics.d(this.cardStyle, hotelsMapInfoV4VO.cardStyle) && Intrinsics.d(this.outOfBoundsBar, hotelsMapInfoV4VO.outOfBoundsBar) && Intrinsics.d(this.pins, hotelsMapInfoV4VO.pins) && Intrinsics.d(this.cards, hotelsMapInfoV4VO.cards) && Intrinsics.d(this.districts, hotelsMapInfoV4VO.districts) && Intrinsics.d(this.onBackPressedAction, hotelsMapInfoV4VO.onBackPressedAction) && Intrinsics.d(this.fetchCardsAction, hotelsMapInfoV4VO.fetchCardsAction) && Intrinsics.d(this.regionHash, hotelsMapInfoV4VO.regionHash) && Intrinsics.d(this.insetsWrapper, hotelsMapInfoV4VO.insetsWrapper) && Intrinsics.d(this.pinLimits, hotelsMapInfoV4VO.pinLimits) && Intrinsics.d(this.delaySettings, hotelsMapInfoV4VO.delaySettings) && Intrinsics.d(this.trackingEvents, hotelsMapInfoV4VO.trackingEvents) && this.isNewVersion == hotelsMapInfoV4VO.isNewVersion;
    }

    @NotNull
    public final HotelsMapInfoV4DTO.CardStyle getCardStyle() {
        return this.cardStyle;
    }

    @NotNull
    public final ConcurrentHashMap<String, Card> getCards() {
        return this.cards;
    }

    public final m getCenterLatLng() {
        return this.centerLatLng;
    }

    public final HotelsMapInfoV4DTO.DelaySettings getDelaySettings() {
        return this.delaySettings;
    }

    public final DistrictsVO getDistricts() {
        return this.districts;
    }

    @NotNull
    public final DownloadPinsAction getDownloadPinsAction() {
        return this.downloadPinsAction;
    }

    @NotNull
    public final AtomAction getFetchCardsAction() {
        return this.fetchCardsAction;
    }

    @NotNull
    public final AtomAction getFetchPinsAction() {
        return this.fetchPinsAction;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final WindowInsetsWrapper getInsetsWrapper() {
        return this.insetsWrapper;
    }

    public final m getLocationPoint() {
        return this.locationPoint;
    }

    @NotNull
    public final AtomAction getOnBackPressedAction() {
        return this.onBackPressedAction;
    }

    public final NotificationDTO getOutOfBoundsBar() {
        return this.outOfBoundsBar;
    }

    @NotNull
    public final HotelsMapInfoV4DTO.PinLimits getPinLimits() {
        return this.pinLimits;
    }

    @NotNull
    public final PinTypes getPinTypes() {
        return this.pinTypes;
    }

    @NotNull
    public final ConcurrentHashMap<String, Pin> getPins() {
        return this.pins;
    }

    @NotNull
    public final PinsDisplaySettings getPinsDisplaySettings() {
        return this.pinsDisplaySettings;
    }

    public final String getRegionHash() {
        return this.regionHash;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TrackingEvents getTrackingEvents() {
        return this.trackingEvents;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final n getVisibleRegion() {
        return this.visibleRegion;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        n nVar = this.visibleRegion;
        int hashCode2 = (hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        m mVar = this.centerLatLng;
        int hashCode3 = (hashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        m mVar2 = this.locationPoint;
        int hashCode4 = (this.cardStyle.hashCode() + ((this.pinTypes.hashCode() + ((this.downloadPinsAction.hashCode() + C4598rp.a(this.fetchPinsAction, (this.pinsDisplaySettings.hashCode() + ((hashCode3 + (mVar2 == null ? 0 : mVar2.hashCode())) * 31)) * 31, 31)) * 31)) * 31)) * 31;
        NotificationDTO notificationDTO = this.outOfBoundsBar;
        int hashCode5 = (this.cards.hashCode() + ((this.pins.hashCode() + ((hashCode4 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31)) * 31)) * 31;
        DistrictsVO districtsVO = this.districts;
        int a11 = C4598rp.a(this.fetchCardsAction, C4598rp.a(this.onBackPressedAction, (hashCode5 + (districtsVO == null ? 0 : districtsVO.hashCode())) * 31, 31), 31);
        String str = this.regionHash;
        int hashCode6 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        WindowInsetsWrapper windowInsetsWrapper = this.insetsWrapper;
        int hashCode7 = (this.pinLimits.hashCode() + ((hashCode6 + (windowInsetsWrapper == null ? 0 : windowInsetsWrapper.hashCode())) * 31)) * 31;
        HotelsMapInfoV4DTO.DelaySettings delaySettings = this.delaySettings;
        int hashCode8 = (hashCode7 + (delaySettings == null ? 0 : delaySettings.hashCode())) * 31;
        TrackingEvents trackingEvents = this.trackingEvents;
        return Boolean.hashCode(this.isNewVersion) + ((hashCode8 + (trackingEvents != null ? trackingEvents.hashCode() : 0)) * 31);
    }

    /* renamed from: isNewVersion, reason: from getter */
    public final boolean getIsNewVersion() {
        return this.isNewVersion;
    }

    @NotNull
    public String toString() {
        ConcurrentHashMap<String, DistrictsVO.Polygon> polygons;
        long id2 = getId();
        n nVar = this.visibleRegion;
        AtomAction atomAction = this.fetchPinsAction;
        int size = this.pins.size();
        int size2 = this.cards.size();
        DistrictsVO districtsVO = this.districts;
        return "id=" + id2 + "-visibleRegion=" + nVar + "-fetchHotelsAction=" + atomAction + "-pinsSize" + size + "-cardsSize" + size2 + "-districtSize" + ((districtsVO == null || (polygons = districtsVO.getPolygons()) == null) ? null : Integer.valueOf(polygons.size()));
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates$PinStyles;", "default", "selected", "viewed", "", "singlePinTemplateTitle", "clusterPinTemplateTitle", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates$PinStyles;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates$PinStyles;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates$PinStyles;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates$PinStyles;", "getDefault", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates$PinStyles;", "getSelected", "getViewed", "Ljava/lang/String;", "getSinglePinTemplateTitle", "getClusterPinTemplateTitle", "PinStyles", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PricePinStates {
        private final String clusterPinTemplateTitle;

        @NotNull
        private final PinStyles default;
        private final PinStyles selected;
        private final String singlePinTemplateTitle;
        private final PinStyles viewed;

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b'\u0010$R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$PricePinStates$PinStyles;", "", "", "backgroundColor", "borderColor", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "discountIcon", "favoriteIcon", "", "", "icons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBorderColor", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getDiscountIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getDiscountIcon$annotations", "()V", "getFavoriteIcon", "Ljava/util/Map;", "getIcons", "()Ljava/util/Map;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PinStyles {

            @NotNull
            private final String backgroundColor;
            private final BadgeDTO badge;
            private final String borderColor;
            private final IconDTO discountIcon;

            @NotNull
            private final IconDTO favoriteIcon;

            @NotNull
            private final Map<Integer, IconDTO> icons;

            @NotNull
            private final TextDTO text;

            public PinStyles(@NotNull String backgroundColor, String str, BadgeDTO badgeDTO, @NotNull TextDTO text, IconDTO iconDTO, @NotNull IconDTO favoriteIcon, @NotNull Map<Integer, IconDTO> icons) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(favoriteIcon, "favoriteIcon");
                Intrinsics.checkNotNullParameter(icons, "icons");
                this.backgroundColor = backgroundColor;
                this.borderColor = str;
                this.badge = badgeDTO;
                this.text = text;
                this.discountIcon = iconDTO;
                this.favoriteIcon = favoriteIcon;
                this.icons = icons;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PinStyles)) {
                    return false;
                }
                PinStyles pinStyles = (PinStyles) other;
                return Intrinsics.d(this.backgroundColor, pinStyles.backgroundColor) && Intrinsics.d(this.borderColor, pinStyles.borderColor) && Intrinsics.d(this.badge, pinStyles.badge) && Intrinsics.d(this.text, pinStyles.text) && Intrinsics.d(this.discountIcon, pinStyles.discountIcon) && Intrinsics.d(this.favoriteIcon, pinStyles.favoriteIcon) && Intrinsics.d(this.icons, pinStyles.icons);
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final BadgeDTO getBadge() {
                return this.badge;
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            public final IconDTO getDiscountIcon() {
                return this.discountIcon;
            }

            @NotNull
            public final IconDTO getFavoriteIcon() {
                return this.favoriteIcon;
            }

            @NotNull
            public final Map<Integer, IconDTO> getIcons() {
                return this.icons;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.backgroundColor.hashCode() * 31;
                String str = this.borderColor;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                BadgeDTO badgeDTO = this.badge;
                int a11 = Ns.b.a(this.text, (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31);
                IconDTO iconDTO = this.discountIcon;
                return this.icons.hashCode() + C2971a.a(this.favoriteIcon, (a11 + (iconDTO != null ? iconDTO.hashCode() : 0)) * 31, 31);
            }

            @NotNull
            public String toString() {
                String str = this.backgroundColor;
                String str2 = this.borderColor;
                BadgeDTO badgeDTO = this.badge;
                TextDTO textDTO = this.text;
                IconDTO iconDTO = this.discountIcon;
                IconDTO iconDTO2 = this.favoriteIcon;
                Map<Integer, IconDTO> map = this.icons;
                StringBuilder d11 = C3660k.d("PinStyles(backgroundColor=", str, ", borderColor=", str2, ", badge=");
                d11.append(badgeDTO);
                d11.append(", text=");
                d11.append(textDTO);
                d11.append(", discountIcon=");
                d11.append(iconDTO);
                d11.append(", favoriteIcon=");
                d11.append(iconDTO2);
                d11.append(", icons=");
                return P.f(d11, map, ")");
            }
        }

        public PricePinStates(@NotNull PinStyles pinStyles, PinStyles pinStyles2, PinStyles pinStyles3, String str, String str2) {
            Intrinsics.checkNotNullParameter(pinStyles, "default");
            this.default = pinStyles;
            this.selected = pinStyles2;
            this.viewed = pinStyles3;
            this.singlePinTemplateTitle = str;
            this.clusterPinTemplateTitle = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PricePinStates)) {
                return false;
            }
            PricePinStates pricePinStates = (PricePinStates) other;
            return Intrinsics.d(this.default, pricePinStates.default) && Intrinsics.d(this.selected, pricePinStates.selected) && Intrinsics.d(this.viewed, pricePinStates.viewed) && Intrinsics.d(this.singlePinTemplateTitle, pricePinStates.singlePinTemplateTitle) && Intrinsics.d(this.clusterPinTemplateTitle, pricePinStates.clusterPinTemplateTitle);
        }

        public final String getClusterPinTemplateTitle() {
            return this.clusterPinTemplateTitle;
        }

        @NotNull
        public final PinStyles getDefault() {
            return this.default;
        }

        public final PinStyles getSelected() {
            return this.selected;
        }

        public final String getSinglePinTemplateTitle() {
            return this.singlePinTemplateTitle;
        }

        public final PinStyles getViewed() {
            return this.viewed;
        }

        public int hashCode() {
            int hashCode = this.default.hashCode() * 31;
            PinStyles pinStyles = this.selected;
            int hashCode2 = (hashCode + (pinStyles == null ? 0 : pinStyles.hashCode())) * 31;
            PinStyles pinStyles2 = this.viewed;
            int hashCode3 = (hashCode2 + (pinStyles2 == null ? 0 : pinStyles2.hashCode())) * 31;
            String str = this.singlePinTemplateTitle;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.clusterPinTemplateTitle;
            return hashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            PinStyles pinStyles = this.default;
            PinStyles pinStyles2 = this.selected;
            PinStyles pinStyles3 = this.viewed;
            String str = this.singlePinTemplateTitle;
            String str2 = this.clusterPinTemplateTitle;
            StringBuilder sb2 = new StringBuilder("PricePinStates(default=");
            sb2.append(pinStyles);
            sb2.append(", selected=");
            sb2.append(pinStyles2);
            sb2.append(", viewed=");
            sb2.append(pinStyles3);
            sb2.append(", singlePinTemplateTitle=");
            sb2.append(str);
            sb2.append(", clusterPinTemplateTitle=");
            return o0.c(sb2, str2, ")");
        }

        public /* synthetic */ PricePinStates(PinStyles pinStyles, PinStyles pinStyles2, PinStyles pinStyles3, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(pinStyles, pinStyles2, pinStyles3, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001:\u0001HB\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJÀ\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\r2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b0\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b\u000f\u00106R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b\u0010\u00106R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b\u0011\u00106R\"\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00104\u001a\u0004\b\u0012\u00106\"\u0004\b7\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b9\u0010\u001fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b:\u00103R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\b;\u00103R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0016\u00104\u001a\u0004\b\u0016\u00106R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010<\u001a\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010!\"\u0004\bB\u0010CR\"\u0010D\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010'\u001a\u0004\bE\u0010)\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "", "", "id", "", "rank", "Lwe0/m;", "coords", "", "geohash", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "price", "", "hasDiscount", "isFavorite", "isViewed", "isSelected", "isTop", "sku", "rightIconId", "leftIconId", "isIndivisiblePin", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin$InnerPin;", "innerIds", "<init>", "(Ljava/lang/String;FLwe0/m;JLjava/lang/String;Ljava/lang/Integer;ZZZZZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;)V", "copy", "(Ljava/lang/String;FLwe0/m;JLjava/lang/String;Ljava/lang/Integer;ZZZZZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "F", "getRank", "()F", "Lwe0/m;", "getCoords", "()Lwe0/m;", "J", "getGeohash", "()J", "getTitle", "Ljava/lang/Integer;", "getPrice", "()Ljava/lang/Integer;", "Z", "getHasDiscount", "()Z", "setTop", "(Z)V", "getSku", "getRightIconId", "getLeftIconId", "Ljava/util/List;", "getInnerIds", "()Ljava/util/List;", "cacheHash", "I", "getCacheHash", "setCacheHash", "(I)V", "zIndex", "getZIndex", "setZIndex", "(F)V", "InnerPin", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pin {
        private int cacheHash;

        @NotNull
        private final m coords;
        private final long geohash;
        private final boolean hasDiscount;

        @NotNull
        private final String id;

        @NotNull
        private final List<InnerPin> innerIds;
        private final boolean isFavorite;
        private final boolean isIndivisiblePin;
        private final boolean isSelected;
        private boolean isTop;
        private final boolean isViewed;
        private final Integer leftIconId;
        private final Integer price;
        private final float rank;
        private final Integer rightIconId;
        private final String sku;
        private final String title;
        private float zIndex;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Pin$InnerPin;", "", "", "id", "", "rank", "<init>", "(Ljava/lang/String;F)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "F", "getRank", "()F", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InnerPin {

            @NotNull
            private final String id;
            private final float rank;

            public InnerPin(@NotNull String id2, float f7) {
                Intrinsics.checkNotNullParameter(id2, "id");
                this.id = id2;
                this.rank = f7;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InnerPin)) {
                    return false;
                }
                InnerPin innerPin = (InnerPin) other;
                return Intrinsics.d(this.id, innerPin.id) && Float.compare(this.rank, innerPin.rank) == 0;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public final float getRank() {
                return this.rank;
            }

            public int hashCode() {
                return Float.hashCode(this.rank) + (this.id.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "InnerPin(id=" + this.id + ", rank=" + this.rank + ")";
            }
        }

        public Pin(@NotNull String id2, float f7, @NotNull m coords, long j11, String str, Integer num, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str2, Integer num2, Integer num3, boolean z16, @NotNull List<InnerPin> innerIds) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(coords, "coords");
            Intrinsics.checkNotNullParameter(innerIds, "innerIds");
            this.id = id2;
            this.rank = f7;
            this.coords = coords;
            this.geohash = j11;
            this.title = str;
            this.price = num;
            this.hasDiscount = z11;
            this.isFavorite = z12;
            this.isViewed = z13;
            this.isSelected = z14;
            this.isTop = z15;
            this.sku = str2;
            this.rightIconId = num2;
            this.leftIconId = num3;
            this.isIndivisiblePin = z16;
            this.innerIds = innerIds;
        }

        @NotNull
        public final Pin copy(@NotNull String id2, float rank, @NotNull m coords, long geohash, String title, Integer price, boolean hasDiscount, boolean isFavorite, boolean isViewed, boolean isSelected, boolean isTop, String sku, Integer rightIconId, Integer leftIconId, boolean isIndivisiblePin, @NotNull List<InnerPin> innerIds) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(coords, "coords");
            Intrinsics.checkNotNullParameter(innerIds, "innerIds");
            return new Pin(id2, rank, coords, geohash, title, price, hasDiscount, isFavorite, isViewed, isSelected, isTop, sku, rightIconId, leftIconId, isIndivisiblePin, innerIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return Intrinsics.d(this.id, pin.id) && Float.compare(this.rank, pin.rank) == 0 && Intrinsics.d(this.coords, pin.coords) && this.geohash == pin.geohash && Intrinsics.d(this.title, pin.title) && Intrinsics.d(this.price, pin.price) && this.hasDiscount == pin.hasDiscount && this.isFavorite == pin.isFavorite && this.isViewed == pin.isViewed && this.isSelected == pin.isSelected && this.isTop == pin.isTop && Intrinsics.d(this.sku, pin.sku) && Intrinsics.d(this.rightIconId, pin.rightIconId) && Intrinsics.d(this.leftIconId, pin.leftIconId) && this.isIndivisiblePin == pin.isIndivisiblePin && Intrinsics.d(this.innerIds, pin.innerIds);
        }

        public final int getCacheHash() {
            return this.cacheHash;
        }

        @NotNull
        public final m getCoords() {
            return this.coords;
        }

        public final long getGeohash() {
            return this.geohash;
        }

        public final boolean getHasDiscount() {
            return this.hasDiscount;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final List<InnerPin> getInnerIds() {
            return this.innerIds;
        }

        public final Integer getLeftIconId() {
            return this.leftIconId;
        }

        public final Integer getPrice() {
            return this.price;
        }

        public final float getRank() {
            return this.rank;
        }

        public final Integer getRightIconId() {
            return this.rightIconId;
        }

        public final String getSku() {
            return this.sku;
        }

        public final String getTitle() {
            return this.title;
        }

        public final float getZIndex() {
            return this.zIndex;
        }

        public int hashCode() {
            int a11 = Pk0.c.a((this.coords.hashCode() + Pk0.b.a(this.rank, this.id.hashCode() * 31, 31)) * 31, 31, this.geohash);
            String str = this.title;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.price;
            int a12 = C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.hasDiscount), 31, this.isFavorite), 31, this.isViewed), 31, this.isSelected), 31, this.isTop);
            String str2 = this.sku;
            int hashCode2 = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.rightIconId;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.leftIconId;
            return this.innerIds.hashCode() + C3532b.a((hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31, 31, this.isIndivisiblePin);
        }

        /* renamed from: isFavorite, reason: from getter */
        public final boolean getIsFavorite() {
            return this.isFavorite;
        }

        /* renamed from: isIndivisiblePin, reason: from getter */
        public final boolean getIsIndivisiblePin() {
            return this.isIndivisiblePin;
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: isTop, reason: from getter */
        public final boolean getIsTop() {
            return this.isTop;
        }

        /* renamed from: isViewed, reason: from getter */
        public final boolean getIsViewed() {
            return this.isViewed;
        }

        public final void setCacheHash(int i11) {
            this.cacheHash = i11;
        }

        public final void setTop(boolean z11) {
            this.isTop = z11;
        }

        public final void setZIndex(float f7) {
            this.zIndex = f7;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            float f7 = this.rank;
            m mVar = this.coords;
            long j11 = this.geohash;
            String str2 = this.title;
            Integer num = this.price;
            boolean z11 = this.hasDiscount;
            boolean z12 = this.isFavorite;
            boolean z13 = this.isViewed;
            boolean z14 = this.isSelected;
            boolean z15 = this.isTop;
            String str3 = this.sku;
            Integer num2 = this.rightIconId;
            Integer num3 = this.leftIconId;
            boolean z16 = this.isIndivisiblePin;
            List<InnerPin> list = this.innerIds;
            StringBuilder sb2 = new StringBuilder("Pin(id=");
            sb2.append(str);
            sb2.append(", rank=");
            sb2.append(f7);
            sb2.append(", coords=");
            sb2.append(mVar);
            sb2.append(", geohash=");
            sb2.append(j11);
            sb2.append(", title=");
            sb2.append(str2);
            sb2.append(", price=");
            sb2.append(num);
            C2436a.e(", hasDiscount=", ", isFavorite=", sb2, z11, z12);
            C2436a.e(", isViewed=", ", isSelected=", sb2, z13, z14);
            sb2.append(", isTop=");
            sb2.append(z15);
            sb2.append(", sku=");
            sb2.append(str3);
            sb2.append(", rightIconId=");
            sb2.append(num2);
            sb2.append(", leftIconId=");
            sb2.append(num3);
            sb2.append(", isIndivisiblePin=");
            sb2.append(z16);
            sb2.append(", innerIds=");
            sb2.append(list);
            sb2.append(")");
            return sb2.toString();
        }

        public Pin(String str, float f7, m mVar, long j11, String str2, Integer num, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str3, Integer num2, Integer num3, boolean z16, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f7, mVar, j11, str2, num, z11, z12, z13, z14, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z15, str3, num2, num3, (i11 & 16384) != 0 ? false : z16, (i11 & 32768) != 0 ? K.f71697a : list);
        }
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#Jð\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010!\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010'R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b\u0005\u00102R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u00105R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u00108R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\bB\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\bF\u00108R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\bG\u0010>R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010N\u001a\u0004\bQ\u0010PR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001d\u0010N\u001a\u0004\bR\u0010PR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001e\u0010N\u001a\u0004\bS\u0010PR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010T\u001a\u0004\bU\u0010VR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b!\u00102¨\u0006W"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$CardState;", "", "id", "", "isCompactWidth", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$ImageVO;", "images", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "favoriteButton", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "rating", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "reviewsIcon", "reviewsText", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "priceText", "badgeText", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle$CardLayoutVariant;", "layoutVariant", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "gallerySlideEvent", "addToFavoriteEvent", "removeFromFavoriteEvent", "Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;", "awardBadgeVI", "isOzonChoice", "<init>", "(Ljava/lang/String;ZLjava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle$CardLayoutVariant;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;LWZ/t;LWZ/t;LWZ/t;Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;Z)V", "copy", "(Ljava/lang/String;ZLjava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle$CardLayoutVariant;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;LWZ/t;LWZ/t;LWZ/t;Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;Z)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Z", "()Z", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getRating", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getReviewsIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getReviewsText", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPriceText", "getBadgeText", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle$CardLayoutVariant;", "getLayoutVariant", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle$CardLayoutVariant;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getGallerySlideEvent", "getAddToFavoriteEvent", "getRemoveFromFavoriteEvent", "Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;", "getAwardBadgeVI", "()Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Card implements CardState {
        private final AtomAction action;
        private final t addToFavoriteEvent;
        private final AwardBadgeVI awardBadgeVI;
        private final BadgeDTO badgeText;
        private final FavoriteProductModel favoriteButton;
        private final t gallerySlideEvent;

        @NotNull
        private final String id;

        @NotNull
        private final List<ImageVO> images;
        private final boolean isCompactWidth;
        private final boolean isOzonChoice;

        @NotNull
        private final HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant layoutVariant;
        private final PriceDTO price;
        private final TextDTO priceText;
        private final BadgeDTO rating;
        private final t removeFromFavoriteEvent;
        private final IconDTO reviewsIcon;
        private final TextDTO reviewsText;
        private final TextDTO title;
        private final t tokenizedEvent;

        public Card(@NotNull String id2, boolean z11, @NotNull List<ImageVO> images, TextDTO textDTO, FavoriteProductModel favoriteProductModel, BadgeDTO badgeDTO, IconDTO iconDTO, TextDTO textDTO2, PriceDTO priceDTO, TextDTO textDTO3, BadgeDTO badgeDTO2, @NotNull HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant layoutVariant, AtomAction atomAction, t tVar, t tVar2, t tVar3, t tVar4, AwardBadgeVI awardBadgeVI, boolean z12) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(layoutVariant, "layoutVariant");
            this.id = id2;
            this.isCompactWidth = z11;
            this.images = images;
            this.title = textDTO;
            this.favoriteButton = favoriteProductModel;
            this.rating = badgeDTO;
            this.reviewsIcon = iconDTO;
            this.reviewsText = textDTO2;
            this.price = priceDTO;
            this.priceText = textDTO3;
            this.badgeText = badgeDTO2;
            this.layoutVariant = layoutVariant;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
            this.gallerySlideEvent = tVar2;
            this.addToFavoriteEvent = tVar3;
            this.removeFromFavoriteEvent = tVar4;
            this.awardBadgeVI = awardBadgeVI;
            this.isOzonChoice = z12;
        }

        public static /* synthetic */ Card copy$default(Card card, String str, boolean z11, List list, TextDTO textDTO, FavoriteProductModel favoriteProductModel, BadgeDTO badgeDTO, IconDTO iconDTO, TextDTO textDTO2, PriceDTO priceDTO, TextDTO textDTO3, BadgeDTO badgeDTO2, HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant cardLayoutVariant, AtomAction atomAction, t tVar, t tVar2, t tVar3, t tVar4, AwardBadgeVI awardBadgeVI, boolean z12, int i11, Object obj) {
            boolean z13;
            AwardBadgeVI awardBadgeVI2;
            String str2 = (i11 & 1) != 0 ? card.id : str;
            boolean z14 = (i11 & 2) != 0 ? card.isCompactWidth : z11;
            List list2 = (i11 & 4) != 0 ? card.images : list;
            TextDTO textDTO4 = (i11 & 8) != 0 ? card.title : textDTO;
            FavoriteProductModel favoriteProductModel2 = (i11 & 16) != 0 ? card.favoriteButton : favoriteProductModel;
            BadgeDTO badgeDTO3 = (i11 & 32) != 0 ? card.rating : badgeDTO;
            IconDTO iconDTO2 = (i11 & 64) != 0 ? card.reviewsIcon : iconDTO;
            TextDTO textDTO5 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? card.reviewsText : textDTO2;
            PriceDTO priceDTO2 = (i11 & 256) != 0 ? card.price : priceDTO;
            TextDTO textDTO6 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? card.priceText : textDTO3;
            BadgeDTO badgeDTO4 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? card.badgeText : badgeDTO2;
            HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant cardLayoutVariant2 = (i11 & 2048) != 0 ? card.layoutVariant : cardLayoutVariant;
            AtomAction atomAction2 = (i11 & 4096) != 0 ? card.action : atomAction;
            t tVar5 = (i11 & 8192) != 0 ? card.tokenizedEvent : tVar;
            String str3 = str2;
            t tVar6 = (i11 & 16384) != 0 ? card.gallerySlideEvent : tVar2;
            t tVar7 = (i11 & 32768) != 0 ? card.addToFavoriteEvent : tVar3;
            t tVar8 = (i11 & 65536) != 0 ? card.removeFromFavoriteEvent : tVar4;
            AwardBadgeVI awardBadgeVI3 = (i11 & 131072) != 0 ? card.awardBadgeVI : awardBadgeVI;
            if ((i11 & 262144) != 0) {
                awardBadgeVI2 = awardBadgeVI3;
                z13 = card.isOzonChoice;
            } else {
                z13 = z12;
                awardBadgeVI2 = awardBadgeVI3;
            }
            return card.copy(str3, z14, list2, textDTO4, favoriteProductModel2, badgeDTO3, iconDTO2, textDTO5, priceDTO2, textDTO6, badgeDTO4, cardLayoutVariant2, atomAction2, tVar5, tVar6, tVar7, tVar8, awardBadgeVI2, z13);
        }

        @NotNull
        public final Card copy(@NotNull String id2, boolean isCompactWidth, @NotNull List<ImageVO> images, TextDTO title, FavoriteProductModel favoriteButton, BadgeDTO rating, IconDTO reviewsIcon, TextDTO reviewsText, PriceDTO price, TextDTO priceText, BadgeDTO badgeText, @NotNull HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant layoutVariant, AtomAction action, t tokenizedEvent, t gallerySlideEvent, t addToFavoriteEvent, t removeFromFavoriteEvent, AwardBadgeVI awardBadgeVI, boolean isOzonChoice) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(layoutVariant, "layoutVariant");
            return new Card(id2, isCompactWidth, images, title, favoriteButton, rating, reviewsIcon, reviewsText, price, priceText, badgeText, layoutVariant, action, tokenizedEvent, gallerySlideEvent, addToFavoriteEvent, removeFromFavoriteEvent, awardBadgeVI, isOzonChoice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return Intrinsics.d(this.id, card.id) && this.isCompactWidth == card.isCompactWidth && Intrinsics.d(this.images, card.images) && Intrinsics.d(this.title, card.title) && Intrinsics.d(this.favoriteButton, card.favoriteButton) && Intrinsics.d(this.rating, card.rating) && Intrinsics.d(this.reviewsIcon, card.reviewsIcon) && Intrinsics.d(this.reviewsText, card.reviewsText) && Intrinsics.d(this.price, card.price) && Intrinsics.d(this.priceText, card.priceText) && Intrinsics.d(this.badgeText, card.badgeText) && this.layoutVariant == card.layoutVariant && Intrinsics.d(this.action, card.action) && Intrinsics.d(this.tokenizedEvent, card.tokenizedEvent) && Intrinsics.d(this.gallerySlideEvent, card.gallerySlideEvent) && Intrinsics.d(this.addToFavoriteEvent, card.addToFavoriteEvent) && Intrinsics.d(this.removeFromFavoriteEvent, card.removeFromFavoriteEvent) && Intrinsics.d(this.awardBadgeVI, card.awardBadgeVI) && this.isOzonChoice == card.isOzonChoice;
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final t getAddToFavoriteEvent() {
            return this.addToFavoriteEvent;
        }

        public final AwardBadgeVI getAwardBadgeVI() {
            return this.awardBadgeVI;
        }

        public final BadgeDTO getBadgeText() {
            return this.badgeText;
        }

        public final FavoriteProductModel getFavoriteButton() {
            return this.favoriteButton;
        }

        public final t getGallerySlideEvent() {
            return this.gallerySlideEvent;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO.CardState
        @NotNull
        public String getId() {
            return this.id;
        }

        @NotNull
        public final List<ImageVO> getImages() {
            return this.images;
        }

        @NotNull
        public final HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant getLayoutVariant() {
            return this.layoutVariant;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        public final TextDTO getPriceText() {
            return this.priceText;
        }

        public final BadgeDTO getRating() {
            return this.rating;
        }

        public final t getRemoveFromFavoriteEvent() {
            return this.removeFromFavoriteEvent;
        }

        public final IconDTO getReviewsIcon() {
            return this.reviewsIcon;
        }

        public final TextDTO getReviewsText() {
            return this.reviewsText;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int b11 = g.b(C3532b.a(this.id.hashCode() * 31, 31, this.isCompactWidth), 31, this.images);
            TextDTO textDTO = this.title;
            int hashCode = (b11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            FavoriteProductModel favoriteProductModel = this.favoriteButton;
            int hashCode2 = (hashCode + (favoriteProductModel == null ? 0 : favoriteProductModel.hashCode())) * 31;
            BadgeDTO badgeDTO = this.rating;
            int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            IconDTO iconDTO = this.reviewsIcon;
            int hashCode4 = (hashCode3 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.reviewsText;
            int hashCode5 = (hashCode4 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            PriceDTO priceDTO = this.price;
            int hashCode6 = (hashCode5 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            TextDTO textDTO3 = this.priceText;
            int hashCode7 = (hashCode6 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
            BadgeDTO badgeDTO2 = this.badgeText;
            int hashCode8 = (this.layoutVariant.hashCode() + ((hashCode7 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31)) * 31;
            AtomAction atomAction = this.action;
            int hashCode9 = (hashCode8 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            int hashCode10 = (hashCode9 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            t tVar2 = this.gallerySlideEvent;
            int hashCode11 = (hashCode10 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
            t tVar3 = this.addToFavoriteEvent;
            int hashCode12 = (hashCode11 + (tVar3 == null ? 0 : tVar3.hashCode())) * 31;
            t tVar4 = this.removeFromFavoriteEvent;
            int hashCode13 = (hashCode12 + (tVar4 == null ? 0 : tVar4.hashCode())) * 31;
            AwardBadgeVI awardBadgeVI = this.awardBadgeVI;
            return Boolean.hashCode(this.isOzonChoice) + ((hashCode13 + (awardBadgeVI != null ? awardBadgeVI.hashCode() : 0)) * 31);
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO.CardState
        /* renamed from: isCompactWidth, reason: from getter */
        public boolean getIsCompactWidth() {
            return this.isCompactWidth;
        }

        /* renamed from: isOzonChoice, reason: from getter */
        public final boolean getIsOzonChoice() {
            return this.isOzonChoice;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            boolean z11 = this.isCompactWidth;
            List<ImageVO> list = this.images;
            TextDTO textDTO = this.title;
            FavoriteProductModel favoriteProductModel = this.favoriteButton;
            BadgeDTO badgeDTO = this.rating;
            IconDTO iconDTO = this.reviewsIcon;
            TextDTO textDTO2 = this.reviewsText;
            PriceDTO priceDTO = this.price;
            TextDTO textDTO3 = this.priceText;
            BadgeDTO badgeDTO2 = this.badgeText;
            HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant cardLayoutVariant = this.layoutVariant;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            t tVar2 = this.gallerySlideEvent;
            t tVar3 = this.addToFavoriteEvent;
            t tVar4 = this.removeFromFavoriteEvent;
            AwardBadgeVI awardBadgeVI = this.awardBadgeVI;
            boolean z12 = this.isOzonChoice;
            StringBuilder b11 = C4636t5.b("Card(id=", str, ", isCompactWidth=", ", images=", z11);
            b11.append(list);
            b11.append(", title=");
            b11.append(textDTO);
            b11.append(", favoriteButton=");
            b11.append(favoriteProductModel);
            b11.append(", rating=");
            b11.append(badgeDTO);
            b11.append(", reviewsIcon=");
            b11.append(iconDTO);
            b11.append(", reviewsText=");
            b11.append(textDTO2);
            b11.append(", price=");
            b11.append(priceDTO);
            b11.append(", priceText=");
            b11.append(textDTO3);
            b11.append(", badgeText=");
            b11.append(badgeDTO2);
            b11.append(", layoutVariant=");
            b11.append(cardLayoutVariant);
            b11.append(", action=");
            b11.append(atomAction);
            b11.append(", tokenizedEvent=");
            b11.append(tVar);
            b11.append(", gallerySlideEvent=");
            b11.append(tVar2);
            b11.append(", addToFavoriteEvent=");
            b11.append(tVar3);
            b11.append(", removeFromFavoriteEvent=");
            b11.append(tVar4);
            b11.append(", awardBadgeVI=");
            b11.append(awardBadgeVI);
            b11.append(", isOzonChoice=");
            return Pk0.a.a(")", b11, z12);
        }

        public /* synthetic */ Card(String str, boolean z11, List list, TextDTO textDTO, FavoriteProductModel favoriteProductModel, BadgeDTO badgeDTO, IconDTO iconDTO, TextDTO textDTO2, PriceDTO priceDTO, TextDTO textDTO3, BadgeDTO badgeDTO2, HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant cardLayoutVariant, AtomAction atomAction, t tVar, t tVar2, t tVar3, t tVar4, AwardBadgeVI awardBadgeVI, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? false : z11, list, textDTO, favoriteProductModel, badgeDTO, iconDTO, textDTO2, priceDTO, textDTO3, badgeDTO2, cardLayoutVariant, atomAction, tVar, tVar2, tVar3, tVar4, awardBadgeVI, z12);
        }
    }

    public /* synthetic */ HotelsMapInfoV4VO(long j11, n nVar, m mVar, m mVar2, PinsDisplaySettings pinsDisplaySettings, AtomAction atomAction, DownloadPinsAction downloadPinsAction, PinTypes pinTypes, HotelsMapInfoV4DTO.CardStyle cardStyle, NotificationDTO notificationDTO, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, DistrictsVO districtsVO, AtomAction atomAction2, AtomAction atomAction3, String str, WindowInsetsWrapper windowInsetsWrapper, HotelsMapInfoV4DTO.PinLimits pinLimits, HotelsMapInfoV4DTO.DelaySettings delaySettings, TrackingEvents trackingEvents, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, nVar, mVar, mVar2, pinsDisplaySettings, atomAction, downloadPinsAction, pinTypes, cardStyle, notificationDTO, concurrentHashMap, concurrentHashMap2, districtsVO, atomAction2, atomAction3, str, (i11 & 65536) != 0 ? null : windowInsetsWrapper, pinLimits, delaySettings, trackingEvents, (i11 & 1048576) != 0 ? false : z11);
    }
}
