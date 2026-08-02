package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import Ak.C2436a;
import B0.C2454a;
import B90.C2619v;
import Bi.b;
import C.o0;
import Cm.e;
import G.g;
import J0.C3349u1;
import Kk.C3532b;
import Lc.a;
import N3.C3660k;
import WZ.t;
import android.graphics.PointF;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import we0.m;
import we0.n;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b%\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002IJB\u0099\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ¾\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010\"R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\b\u0013\u0010?R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\b\u0014\u0010?R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b\u0015\u0010?R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0018\u00106\u001a\u0004\bC\u00108R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0019\u00106\u001a\u0004\bD\u00108R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001a\u00106\u001a\u0004\bE\u00108R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010F\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lwe0/n;", "visibleRegion", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin;", "pins", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$UserPin;", "userLocationPin", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "backButton", "Lru/ozon/uni/android/flashbar/model/Restriction;", "locationDeniedAlert", "", "currentUrl", "", "isBottomWidgetShow", "isSerpPage", "isFiltersButtonVisible", "Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;", "filtersButton", "zoomInButton", "zoomOutButton", "geolocationButton", "Lwe0/m;", "locationPoint", "<init>", "(JLwe0/n;Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$UserPin;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/android/flashbar/model/Restriction;Ljava/lang/String;ZZZLru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lwe0/m;)V", "copy", "(JLwe0/n;Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$UserPin;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/android/flashbar/model/Restriction;Ljava/lang/String;ZZZLru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lwe0/m;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lwe0/n;", "getVisibleRegion", "()Lwe0/n;", "Ljava/util/List;", "getPins", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$UserPin;", "getUserLocationPin", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$UserPin;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getBackButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/android/flashbar/model/Restriction;", "getLocationDeniedAlert", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "Ljava/lang/String;", "getCurrentUrl", "Z", "()Z", "Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;", "getFiltersButton", "()Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;", "getZoomInButton", "getZoomOutButton", "getGeolocationButton", "Lwe0/m;", "getLocationPoint", "()Lwe0/m;", "Pin", "Size", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsMapInfoV2VO implements c {

    @NotNull
    private final ButtonV3Atom.SmallIconButton backButton;
    private final String currentUrl;
    private final TravelFiltersButtonVO filtersButton;
    private final ButtonV3Atom.SmallIconButton geolocationButton;
    private final long id;
    private final boolean isBottomWidgetShow;
    private final boolean isFiltersButtonVisible;
    private final boolean isSerpPage;
    private final Restriction locationDeniedAlert;
    private final m locationPoint;

    @NotNull
    private final List<Pin> pins;
    private final Pin.UserPin userLocationPin;
    private final n visibleRegion;
    private final ButtonV3Atom.SmallIconButton zoomInButton;
    private final ButtonV3Atom.SmallIconButton zoomOutButton;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u001eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0003\u001f !¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin;", "", "<init>", "()V", "", "getId", "()Ljava/lang/String;", "id", "", "getCacheHash", "()I", "cacheHash", "Lwe0/m;", "getCoordinate", "()Lwe0/m;", "coordinate", "Landroid/graphics/PointF;", "getAnchorPoint", "()Landroid/graphics/PointF;", "anchorPoint", "", "isIndivisibleCluster", "()Ljava/lang/Boolean;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getTokenizedEvent", "()LWZ/t;", "tokenizedEvent", "IconPin", "TitlePin", "UserPin", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$IconPin;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$TitlePin;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$UserPin;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Pin {

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b\u000b\u0010(R\"\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$IconPin;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin;", "", "id", "", "cacheHash", "Lwe0/m;", "coordinate", "Landroid/graphics/PointF;", "anchorPoint", "", "isIndivisibleCluster", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Size;", "size", "<init>", "(Ljava/lang/String;ILwe0/m;Landroid/graphics/PointF;Ljava/lang/Boolean;LWZ/t;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Size;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getCacheHash", "Lwe0/m;", "getCoordinate", "()Lwe0/m;", "Landroid/graphics/PointF;", "getAnchorPoint", "()Landroid/graphics/PointF;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Size;", "getSize", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Size;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class IconPin extends Pin {

            @NotNull
            private final PointF anchorPoint;
            private final int cacheHash;

            @NotNull
            private final m coordinate;

            @NotNull
            private final Icon icon;

            @NotNull
            private final String id;
            private final Boolean isIndivisibleCluster;

            @NotNull
            private final Size size;
            private final t tokenizedEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconPin(@NotNull String id2, int i11, @NotNull m coordinate, @NotNull PointF anchorPoint, Boolean bool, t tVar, @NotNull Icon icon, @NotNull Size size) {
                super(null);
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(coordinate, "coordinate");
                Intrinsics.checkNotNullParameter(anchorPoint, "anchorPoint");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(size, "size");
                this.id = id2;
                this.cacheHash = i11;
                this.coordinate = coordinate;
                this.anchorPoint = anchorPoint;
                this.isIndivisibleCluster = bool;
                this.tokenizedEvent = tVar;
                this.icon = icon;
                this.size = size;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IconPin)) {
                    return false;
                }
                IconPin iconPin = (IconPin) other;
                return Intrinsics.d(this.id, iconPin.id) && this.cacheHash == iconPin.cacheHash && Intrinsics.d(this.coordinate, iconPin.coordinate) && Intrinsics.d(this.anchorPoint, iconPin.anchorPoint) && Intrinsics.d(this.isIndivisibleCluster, iconPin.isIndivisibleCluster) && Intrinsics.d(this.tokenizedEvent, iconPin.tokenizedEvent) && Intrinsics.d(this.icon, iconPin.icon) && Intrinsics.d(this.size, iconPin.size);
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            @NotNull
            public PointF getAnchorPoint() {
                return this.anchorPoint;
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            public int getCacheHash() {
                return this.cacheHash;
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            @NotNull
            public m getCoordinate() {
                return this.coordinate;
            }

            @NotNull
            public final Icon getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            @NotNull
            public String getId() {
                return this.id;
            }

            @NotNull
            public final Size getSize() {
                return this.size;
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int hashCode = (this.anchorPoint.hashCode() + ((this.coordinate.hashCode() + C2454a.a(this.cacheHash, this.id.hashCode() * 31, 31)) * 31)) * 31;
                Boolean bool = this.isIndivisibleCluster;
                int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return this.size.hashCode() + a.a(this.icon, (hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31, 31);
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            /* renamed from: isIndivisibleCluster, reason: from getter */
            public Boolean getIsIndivisibleCluster() {
                return this.isIndivisibleCluster;
            }

            @NotNull
            public String toString() {
                String str = this.id;
                int i11 = this.cacheHash;
                m mVar = this.coordinate;
                PointF pointF = this.anchorPoint;
                Boolean bool = this.isIndivisibleCluster;
                t tVar = this.tokenizedEvent;
                Icon icon = this.icon;
                Size size = this.size;
                StringBuilder c11 = C3660k.c(i11, "IconPin(id=", str, ", cacheHash=", ", coordinate=");
                c11.append(mVar);
                c11.append(", anchorPoint=");
                c11.append(pointF);
                c11.append(", isIndivisibleCluster=");
                c11.append(bool);
                c11.append(", tokenizedEvent=");
                c11.append(tVar);
                c11.append(", icon=");
                c11.append(icon);
                c11.append(", size=");
                c11.append(size);
                c11.append(")");
                return c11.toString();
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b\u000b\u0010(R\"\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b/\u0010\u0016R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b0\u0010\u0016¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$TitlePin;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin;", "", "id", "", "cacheHash", "Lwe0/m;", "coordinate", "Landroid/graphics/PointF;", "anchorPoint", "", "isIndivisibleCluster", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "borderColor", "backgroundColor", "<init>", "(Ljava/lang/String;ILwe0/m;Landroid/graphics/PointF;Ljava/lang/Boolean;LWZ/t;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getCacheHash", "Lwe0/m;", "getCoordinate", "()Lwe0/m;", "Landroid/graphics/PointF;", "getAnchorPoint", "()Landroid/graphics/PointF;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBorderColor", "getBackgroundColor", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TitlePin extends Pin {

            @NotNull
            private final PointF anchorPoint;

            @NotNull
            private final String backgroundColor;

            @NotNull
            private final String borderColor;
            private final int cacheHash;

            @NotNull
            private final m coordinate;

            @NotNull
            private final String id;
            private final Boolean isIndivisibleCluster;

            @NotNull
            private final TextAtom title;
            private final t tokenizedEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TitlePin(@NotNull String id2, int i11, @NotNull m coordinate, @NotNull PointF anchorPoint, Boolean bool, t tVar, @NotNull TextAtom title, @NotNull String borderColor, @NotNull String backgroundColor) {
                super(null);
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(coordinate, "coordinate");
                Intrinsics.checkNotNullParameter(anchorPoint, "anchorPoint");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(borderColor, "borderColor");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.id = id2;
                this.cacheHash = i11;
                this.coordinate = coordinate;
                this.anchorPoint = anchorPoint;
                this.isIndivisibleCluster = bool;
                this.tokenizedEvent = tVar;
                this.title = title;
                this.borderColor = borderColor;
                this.backgroundColor = backgroundColor;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TitlePin)) {
                    return false;
                }
                TitlePin titlePin = (TitlePin) other;
                return Intrinsics.d(this.id, titlePin.id) && this.cacheHash == titlePin.cacheHash && Intrinsics.d(this.coordinate, titlePin.coordinate) && Intrinsics.d(this.anchorPoint, titlePin.anchorPoint) && Intrinsics.d(this.isIndivisibleCluster, titlePin.isIndivisibleCluster) && Intrinsics.d(this.tokenizedEvent, titlePin.tokenizedEvent) && Intrinsics.d(this.title, titlePin.title) && Intrinsics.d(this.borderColor, titlePin.borderColor) && Intrinsics.d(this.backgroundColor, titlePin.backgroundColor);
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            @NotNull
            public PointF getAnchorPoint() {
                return this.anchorPoint;
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final String getBorderColor() {
                return this.borderColor;
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            public int getCacheHash() {
                return this.cacheHash;
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            @NotNull
            public m getCoordinate() {
                return this.coordinate;
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            @NotNull
            public String getId() {
                return this.id;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int hashCode = (this.anchorPoint.hashCode() + ((this.coordinate.hashCode() + C2454a.a(this.cacheHash, this.id.hashCode() * 31, 31)) * 31)) * 31;
                Boolean bool = this.isIndivisibleCluster;
                int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return this.backgroundColor.hashCode() + g.a(C2619v.b((hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31, 31, this.title), 31, this.borderColor);
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            /* renamed from: isIndivisibleCluster, reason: from getter */
            public Boolean getIsIndivisibleCluster() {
                return this.isIndivisibleCluster;
            }

            @NotNull
            public String toString() {
                String str = this.id;
                int i11 = this.cacheHash;
                m mVar = this.coordinate;
                PointF pointF = this.anchorPoint;
                Boolean bool = this.isIndivisibleCluster;
                t tVar = this.tokenizedEvent;
                TextAtom textAtom = this.title;
                String str2 = this.borderColor;
                String str3 = this.backgroundColor;
                StringBuilder c11 = C3660k.c(i11, "TitlePin(id=", str, ", cacheHash=", ", coordinate=");
                c11.append(mVar);
                c11.append(", anchorPoint=");
                c11.append(pointF);
                c11.append(", isIndivisibleCluster=");
                c11.append(bool);
                c11.append(", tokenizedEvent=");
                c11.append(tVar);
                c11.append(", title=");
                c11.append(textAtom);
                c11.append(", borderColor=");
                c11.append(str2);
                c11.append(", backgroundColor=");
                return o0.c(c11, str3, ")");
            }
        }

        public /* synthetic */ Pin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public abstract PointF getAnchorPoint();

        public abstract int getCacheHash();

        @NotNull
        public abstract m getCoordinate();

        public abstract String getId();

        public abstract t getTokenizedEvent();

        /* renamed from: isIndivisibleCluster */
        public abstract Boolean getIsIndivisibleCluster();

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016Jx\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b\u000b\u0010,R\"\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$UserPin;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin;", "", "id", "", "cacheHash", "Lwe0/m;", "coordinate", "Landroid/graphics/PointF;", "anchorPoint", "", "isIndivisibleCluster", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Size;", "size", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/lang/String;ILwe0/m;Landroid/graphics/PointF;Ljava/lang/Boolean;LWZ/t;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Size;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "copy", "(Ljava/lang/String;ILwe0/m;Landroid/graphics/PointF;Ljava/lang/Boolean;LWZ/t;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Size;Lru/ozon/uni/atoms/data/texts/TextAtom;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin$UserPin;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getCacheHash", "Lwe0/m;", "getCoordinate", "()Lwe0/m;", "Landroid/graphics/PointF;", "getAnchorPoint", "()Landroid/graphics/PointF;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Size;", "getSize", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Size;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UserPin extends Pin {

            @NotNull
            private final PointF anchorPoint;
            private final int cacheHash;

            @NotNull
            private final m coordinate;

            @NotNull
            private final Icon icon;
            private final String id;
            private final Boolean isIndivisibleCluster;

            @NotNull
            private final Size size;
            private final TextAtom title;
            private final t tokenizedEvent;

            public /* synthetic */ UserPin(String str, int i11, m mVar, PointF pointF, Boolean bool, t tVar, Icon icon, Size size, TextAtom textAtom, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this((i12 & 1) != 0 ? null : str, i11, (i12 & 4) != 0 ? new m(0.0d, 0.0d) : mVar, pointF, bool, tVar, icon, size, (i12 & 256) != 0 ? null : textAtom);
            }

            public static /* synthetic */ UserPin copy$default(UserPin userPin, String str, int i11, m mVar, PointF pointF, Boolean bool, t tVar, Icon icon, Size size, TextAtom textAtom, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = userPin.id;
                }
                if ((i12 & 2) != 0) {
                    i11 = userPin.cacheHash;
                }
                if ((i12 & 4) != 0) {
                    mVar = userPin.coordinate;
                }
                if ((i12 & 8) != 0) {
                    pointF = userPin.anchorPoint;
                }
                if ((i12 & 16) != 0) {
                    bool = userPin.isIndivisibleCluster;
                }
                if ((i12 & 32) != 0) {
                    tVar = userPin.tokenizedEvent;
                }
                if ((i12 & 64) != 0) {
                    icon = userPin.icon;
                }
                if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    size = userPin.size;
                }
                if ((i12 & 256) != 0) {
                    textAtom = userPin.title;
                }
                Size size2 = size;
                TextAtom textAtom2 = textAtom;
                t tVar2 = tVar;
                Icon icon2 = icon;
                Boolean bool2 = bool;
                m mVar2 = mVar;
                return userPin.copy(str, i11, mVar2, pointF, bool2, tVar2, icon2, size2, textAtom2);
            }

            @NotNull
            public final UserPin copy(String id2, int cacheHash, @NotNull m coordinate, @NotNull PointF anchorPoint, Boolean isIndivisibleCluster, t tokenizedEvent, @NotNull Icon icon, @NotNull Size size, TextAtom title) {
                Intrinsics.checkNotNullParameter(coordinate, "coordinate");
                Intrinsics.checkNotNullParameter(anchorPoint, "anchorPoint");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(size, "size");
                return new UserPin(id2, cacheHash, coordinate, anchorPoint, isIndivisibleCluster, tokenizedEvent, icon, size, title);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UserPin)) {
                    return false;
                }
                UserPin userPin = (UserPin) other;
                return Intrinsics.d(this.id, userPin.id) && this.cacheHash == userPin.cacheHash && Intrinsics.d(this.coordinate, userPin.coordinate) && Intrinsics.d(this.anchorPoint, userPin.anchorPoint) && Intrinsics.d(this.isIndivisibleCluster, userPin.isIndivisibleCluster) && Intrinsics.d(this.tokenizedEvent, userPin.tokenizedEvent) && Intrinsics.d(this.icon, userPin.icon) && Intrinsics.d(this.size, userPin.size) && Intrinsics.d(this.title, userPin.title);
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            @NotNull
            public PointF getAnchorPoint() {
                return this.anchorPoint;
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            public int getCacheHash() {
                return this.cacheHash;
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            @NotNull
            public m getCoordinate() {
                return this.coordinate;
            }

            @NotNull
            public final Icon getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            public String getId() {
                return this.id;
            }

            @NotNull
            public final Size getSize() {
                return this.size;
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                String str = this.id;
                int hashCode = (this.anchorPoint.hashCode() + ((this.coordinate.hashCode() + C2454a.a(this.cacheHash, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31)) * 31;
                Boolean bool = this.isIndivisibleCluster;
                int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                int hashCode3 = (this.size.hashCode() + a.a(this.icon, (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31)) * 31;
                TextAtom textAtom = this.title;
                return hashCode3 + (textAtom != null ? textAtom.hashCode() : 0);
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO.Pin
            /* renamed from: isIndivisibleCluster, reason: from getter */
            public Boolean getIsIndivisibleCluster() {
                return this.isIndivisibleCluster;
            }

            @NotNull
            public String toString() {
                String str = this.id;
                int i11 = this.cacheHash;
                m mVar = this.coordinate;
                PointF pointF = this.anchorPoint;
                Boolean bool = this.isIndivisibleCluster;
                t tVar = this.tokenizedEvent;
                Icon icon = this.icon;
                Size size = this.size;
                TextAtom textAtom = this.title;
                StringBuilder c11 = C3660k.c(i11, "UserPin(id=", str, ", cacheHash=", ", coordinate=");
                c11.append(mVar);
                c11.append(", anchorPoint=");
                c11.append(pointF);
                c11.append(", isIndivisibleCluster=");
                c11.append(bool);
                c11.append(", tokenizedEvent=");
                c11.append(tVar);
                c11.append(", icon=");
                c11.append(icon);
                c11.append(", size=");
                c11.append(size);
                c11.append(", title=");
                return b.g(c11, textAtom, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserPin(String str, int i11, @NotNull m coordinate, @NotNull PointF anchorPoint, Boolean bool, t tVar, @NotNull Icon icon, @NotNull Size size, TextAtom textAtom) {
                super(null);
                Intrinsics.checkNotNullParameter(coordinate, "coordinate");
                Intrinsics.checkNotNullParameter(anchorPoint, "anchorPoint");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(size, "size");
                this.id = str;
                this.cacheHash = i11;
                this.coordinate = coordinate;
                this.anchorPoint = anchorPoint;
                this.isIndivisibleCluster = bool;
                this.tokenizedEvent = tVar;
                this.icon = icon;
                this.size = size;
                this.title = textAtom;
            }
        }

        private Pin() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Size;", "", "", "width", "height", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidth", "getHeight", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Size {
        private final int height;
        private final int width;

        public Size(int i11, int i12) {
            this.width = i11;
            this.height = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Size)) {
                return false;
            }
            Size size = (Size) other;
            return this.width == size.width && this.height == size.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("Size(width=", this.width, ", height=", ")", this.height);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HotelsMapInfoV2VO(long j11, n nVar, @NotNull List<? extends Pin> pins, Pin.UserPin userPin, @NotNull ButtonV3Atom.SmallIconButton backButton, Restriction restriction, String str, boolean z11, boolean z12, boolean z13, TravelFiltersButtonVO travelFiltersButtonVO, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallIconButton smallIconButton2, ButtonV3Atom.SmallIconButton smallIconButton3, m mVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        this.id = j11;
        this.visibleRegion = nVar;
        this.pins = pins;
        this.userLocationPin = userPin;
        this.backButton = backButton;
        this.locationDeniedAlert = restriction;
        this.currentUrl = str;
        this.isBottomWidgetShow = z11;
        this.isSerpPage = z12;
        this.isFiltersButtonVisible = z13;
        this.filtersButton = travelFiltersButtonVO;
        this.zoomInButton = smallIconButton;
        this.zoomOutButton = smallIconButton2;
        this.geolocationButton = smallIconButton3;
        this.locationPoint = mVar;
    }

    @NotNull
    public final HotelsMapInfoV2VO copy(long id2, n visibleRegion, @NotNull List<? extends Pin> pins, Pin.UserPin userLocationPin, @NotNull ButtonV3Atom.SmallIconButton backButton, Restriction locationDeniedAlert, String currentUrl, boolean isBottomWidgetShow, boolean isSerpPage, boolean isFiltersButtonVisible, TravelFiltersButtonVO filtersButton, ButtonV3Atom.SmallIconButton zoomInButton, ButtonV3Atom.SmallIconButton zoomOutButton, ButtonV3Atom.SmallIconButton geolocationButton, m locationPoint) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        return new HotelsMapInfoV2VO(id2, visibleRegion, pins, userLocationPin, backButton, locationDeniedAlert, currentUrl, isBottomWidgetShow, isSerpPage, isFiltersButtonVisible, filtersButton, zoomInButton, zoomOutButton, geolocationButton, locationPoint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsMapInfoV2VO)) {
            return false;
        }
        HotelsMapInfoV2VO hotelsMapInfoV2VO = (HotelsMapInfoV2VO) other;
        return this.id == hotelsMapInfoV2VO.id && Intrinsics.d(this.visibleRegion, hotelsMapInfoV2VO.visibleRegion) && Intrinsics.d(this.pins, hotelsMapInfoV2VO.pins) && Intrinsics.d(this.userLocationPin, hotelsMapInfoV2VO.userLocationPin) && Intrinsics.d(this.backButton, hotelsMapInfoV2VO.backButton) && Intrinsics.d(this.locationDeniedAlert, hotelsMapInfoV2VO.locationDeniedAlert) && Intrinsics.d(this.currentUrl, hotelsMapInfoV2VO.currentUrl) && this.isBottomWidgetShow == hotelsMapInfoV2VO.isBottomWidgetShow && this.isSerpPage == hotelsMapInfoV2VO.isSerpPage && this.isFiltersButtonVisible == hotelsMapInfoV2VO.isFiltersButtonVisible && Intrinsics.d(this.filtersButton, hotelsMapInfoV2VO.filtersButton) && Intrinsics.d(this.zoomInButton, hotelsMapInfoV2VO.zoomInButton) && Intrinsics.d(this.zoomOutButton, hotelsMapInfoV2VO.zoomOutButton) && Intrinsics.d(this.geolocationButton, hotelsMapInfoV2VO.geolocationButton) && Intrinsics.d(this.locationPoint, hotelsMapInfoV2VO.locationPoint);
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getBackButton() {
        return this.backButton;
    }

    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    public final TravelFiltersButtonVO getFiltersButton() {
        return this.filtersButton;
    }

    public final ButtonV3Atom.SmallIconButton getGeolocationButton() {
        return this.geolocationButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Restriction getLocationDeniedAlert() {
        return this.locationDeniedAlert;
    }

    public final m getLocationPoint() {
        return this.locationPoint;
    }

    @NotNull
    public final List<Pin> getPins() {
        return this.pins;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Pin.UserPin getUserLocationPin() {
        return this.userLocationPin;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final n getVisibleRegion() {
        return this.visibleRegion;
    }

    public final ButtonV3Atom.SmallIconButton getZoomInButton() {
        return this.zoomInButton;
    }

    public final ButtonV3Atom.SmallIconButton getZoomOutButton() {
        return this.zoomOutButton;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        n nVar = this.visibleRegion;
        int b11 = g.b((hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31, 31, this.pins);
        Pin.UserPin userPin = this.userLocationPin;
        int d11 = C3349u1.d(this.backButton, (b11 + (userPin == null ? 0 : userPin.hashCode())) * 31, 31);
        Restriction restriction = this.locationDeniedAlert;
        int hashCode2 = (d11 + (restriction == null ? 0 : restriction.hashCode())) * 31;
        String str = this.currentUrl;
        int a11 = C3532b.a(C3532b.a(C3532b.a((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isBottomWidgetShow), 31, this.isSerpPage), 31, this.isFiltersButtonVisible);
        TravelFiltersButtonVO travelFiltersButtonVO = this.filtersButton;
        int hashCode3 = (a11 + (travelFiltersButtonVO == null ? 0 : travelFiltersButtonVO.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.zoomInButton;
        int hashCode4 = (hashCode3 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton2 = this.zoomOutButton;
        int hashCode5 = (hashCode4 + (smallIconButton2 == null ? 0 : smallIconButton2.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton3 = this.geolocationButton;
        int hashCode6 = (hashCode5 + (smallIconButton3 == null ? 0 : smallIconButton3.hashCode())) * 31;
        m mVar = this.locationPoint;
        return hashCode6 + (mVar != null ? mVar.hashCode() : 0);
    }

    /* renamed from: isFiltersButtonVisible, reason: from getter */
    public final boolean getIsFiltersButtonVisible() {
        return this.isFiltersButtonVisible;
    }

    /* renamed from: isSerpPage, reason: from getter */
    public final boolean getIsSerpPage() {
        return this.isSerpPage;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        n nVar = this.visibleRegion;
        List<Pin> list = this.pins;
        Pin.UserPin userPin = this.userLocationPin;
        ButtonV3Atom.SmallIconButton smallIconButton = this.backButton;
        Restriction restriction = this.locationDeniedAlert;
        String str = this.currentUrl;
        boolean z11 = this.isBottomWidgetShow;
        boolean z12 = this.isSerpPage;
        boolean z13 = this.isFiltersButtonVisible;
        TravelFiltersButtonVO travelFiltersButtonVO = this.filtersButton;
        ButtonV3Atom.SmallIconButton smallIconButton2 = this.zoomInButton;
        ButtonV3Atom.SmallIconButton smallIconButton3 = this.zoomOutButton;
        ButtonV3Atom.SmallIconButton smallIconButton4 = this.geolocationButton;
        m mVar = this.locationPoint;
        StringBuilder sb2 = new StringBuilder("HotelsMapInfoV2VO(id=");
        sb2.append(j11);
        sb2.append(", visibleRegion=");
        sb2.append(nVar);
        sb2.append(", pins=");
        sb2.append(list);
        sb2.append(", userLocationPin=");
        sb2.append(userPin);
        sb2.append(", backButton=");
        sb2.append(smallIconButton);
        sb2.append(", locationDeniedAlert=");
        sb2.append(restriction);
        D40.a.g(", currentUrl=", str, ", isBottomWidgetShow=", sb2, z11);
        C2436a.e(", isSerpPage=", ", isFiltersButtonVisible=", sb2, z12, z13);
        sb2.append(", filtersButton=");
        sb2.append(travelFiltersButtonVO);
        sb2.append(", zoomInButton=");
        sb2.append(smallIconButton2);
        sb2.append(", zoomOutButton=");
        sb2.append(smallIconButton3);
        sb2.append(", geolocationButton=");
        sb2.append(smallIconButton4);
        sb2.append(", locationPoint=");
        sb2.append(mVar);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ HotelsMapInfoV2VO(long j11, n nVar, List list, Pin.UserPin userPin, ButtonV3Atom.SmallIconButton smallIconButton, Restriction restriction, String str, boolean z11, boolean z12, boolean z13, TravelFiltersButtonVO travelFiltersButtonVO, ButtonV3Atom.SmallIconButton smallIconButton2, ButtonV3Atom.SmallIconButton smallIconButton3, ButtonV3Atom.SmallIconButton smallIconButton4, m mVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, nVar, list, userPin, smallIconButton, restriction, str, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11, z12, z13, travelFiltersButtonVO, smallIconButton2, smallIconButton3, smallIconButton4, mVar);
    }
}
