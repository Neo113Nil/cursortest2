package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.data;

import Sc.o;
import T00.a;
import android.content.Context;
import android.graphics.PointF;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.BoundingBox;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.Coordinate;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.data.HotelsMapInfoV2DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO;
import ru.ozon.app.android.travel.molecules.dto.travelFiltersButton.TravelFiltersButtonDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonVO;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.UniColors;
import we0.m;
import we0.n;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 !2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001!B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u0003j\u0002`\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "provideDefaultBackButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;", "Lwe0/m;", "toLatLng", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;)Lwe0/m;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Pin;", "", "widgetId", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin;", "toVO", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Pin;J)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO$Pin;", "", "getPinHashCodeForCache", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Pin;)I", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Companion", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV2Mapper implements Function2<HotelsMapInfoV2DTO, d, List<? extends HotelsMapInfoV2VO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2Mapper$Companion;", "", "<init>", "()V", "PARAMS_URL_SERP_PAGE", "", "IC_BACK_BUTTON", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HotelsMapInfoV2DTO.Type.values().length];
            try {
                iArr[HotelsMapInfoV2DTO.Type.HOTEL_SIMPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HotelsMapInfoV2DTO.Type.HOTEL_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HotelsMapInfoV2DTO.Type.CLUSTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HotelsMapInfoV2DTO.Type.USER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HotelsMapInfoV2Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final int getPinHashCodeForCache(HotelsMapInfoV2DTO.Pin pin) {
        HotelsMapInfoV2DTO.Type type = pin.getRenderingInfo().getType();
        TextAtom title = pin.getRenderingInfo().getTitle();
        HotelsMapInfoV2DTO.ImageInfo imageInfo = pin.getRenderingInfo().getImageInfo();
        return Arrays.hashCode(new Object[]{type, title, imageInfo != null ? imageInfo.getIcon() : null});
    }

    private final ButtonV3Atom.SmallIconButton provideDefaultBackButton() {
        return new ButtonV3Atom.SmallIconButton("ic_m_back", new AtomActionDTO(AtomActionDTO.Behavior.DISMISS, null, null, null, 14, null), UniColors.GRAPHIC_PRIMARY.getToken(), ButtonV3Atom.SmallIconButtonStyle.STYLE_TYPE_CLEAR, null, null, null, 112, null);
    }

    private final m toLatLng(Coordinate coordinate) {
        return new m(coordinate.getLatitude(), coordinate.getLongitude());
    }

    private final HotelsMapInfoV2VO.Pin toVO(HotelsMapInfoV2DTO.Pin pin, long j11) {
        m latLng;
        Icon icon;
        m latLng2;
        HotelsMapInfoV2DTO.ColorInfo colorInfo;
        String borderColor;
        Icon icon2;
        int i11 = WhenMappings.$EnumSwitchMapping$0[pin.getRenderingInfo().getType().ordinal()];
        if (i11 == 1) {
            String id2 = pin.getId();
            if (id2 == null) {
                return null;
            }
            int pinHashCodeForCache = getPinHashCodeForCache(pin);
            Coordinate coordinate = pin.getCoordinate();
            if (coordinate != null && (latLng = toLatLng(coordinate)) != null) {
                PointF pointF = MapExtKt.toPointF(pin.getAnchorPoint());
                Boolean indivisibleCluster = pin.getIndivisibleCluster();
                HotelsMapInfoV2DTO.ImageInfo imageInfo = pin.getRenderingInfo().getImageInfo();
                if (imageInfo != null && (icon = imageInfo.getIcon()) != null) {
                    HotelsMapInfoV2VO.Size size = new HotelsMapInfoV2VO.Size(ResourceExtKt.toPx(pin.getRenderingInfo().getImageInfo().getSize().getWidth(), this.context), ResourceExtKt.toPx(pin.getRenderingInfo().getImageInfo().getSize().getHeight(), this.context));
                    Map<String, TokenizedTrackingInfo> trackingInfo = pin.getTrackingInfo();
                    return new HotelsMapInfoV2VO.Pin.IconPin(id2, pinHashCodeForCache, latLng, pointF, indivisibleCluster, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, icon, size);
                }
            }
            return null;
        }
        if (i11 != 2 && i11 != 3) {
            if (i11 != 4) {
                throw new o();
            }
            int pinHashCodeForCache2 = getPinHashCodeForCache(pin);
            PointF pointF2 = MapExtKt.toPointF(pin.getAnchorPoint());
            Boolean indivisibleCluster2 = pin.getIndivisibleCluster();
            HotelsMapInfoV2DTO.ImageInfo imageInfo2 = pin.getRenderingInfo().getImageInfo();
            if (imageInfo2 == null || (icon2 = imageInfo2.getIcon()) == null) {
                return null;
            }
            HotelsMapInfoV2VO.Size size2 = new HotelsMapInfoV2VO.Size(ResourceExtKt.toPx(pin.getRenderingInfo().getImageInfo().getSize().getWidth(), this.context), ResourceExtKt.toPx(pin.getRenderingInfo().getImageInfo().getSize().getHeight(), this.context));
            Map<String, TokenizedTrackingInfo> trackingInfo2 = pin.getTrackingInfo();
            return new HotelsMapInfoV2VO.Pin.UserPin(null, pinHashCodeForCache2, null, pointF2, indivisibleCluster2, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null, icon2, size2, null, 261, null);
        }
        String id3 = pin.getId();
        if (id3 == null) {
            return null;
        }
        int pinHashCodeForCache3 = getPinHashCodeForCache(pin);
        Coordinate coordinate2 = pin.getCoordinate();
        if (coordinate2 != null && (latLng2 = toLatLng(coordinate2)) != null) {
            PointF pointF3 = MapExtKt.toPointF(pin.getAnchorPoint());
            Boolean indivisibleCluster3 = pin.getIndivisibleCluster();
            TextAtom title = pin.getRenderingInfo().getTitle();
            if (title != null && (colorInfo = pin.getRenderingInfo().getColorInfo()) != null && (borderColor = colorInfo.getBorderColor()) != null) {
                String backgroundColor = pin.getRenderingInfo().getColorInfo().getBackgroundColor();
                Map<String, TokenizedTrackingInfo> trackingInfo3 = pin.getTrackingInfo();
                return new HotelsMapInfoV2VO.Pin.TitlePin(id3, pinHashCodeForCache3, latLng2, pointF3, indivisibleCluster3, trackingInfo3 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo3, Long.valueOf(j11), null, 2, null) : null, title, borderColor, backgroundColor);
            }
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsMapInfoV2VO> invoke(@NotNull HotelsMapInfoV2DTO state, @NotNull d widgetInfo) {
        HotelsMapInfoV2VO.Pin.UserPin userPin;
        boolean z11;
        m mVar;
        String c11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        BoundingBox visibleRegion = state.getVisibleRegion();
        n nVar = visibleRegion != null ? new n(toLatLng(visibleRegion.getSouthWest()), toLatLng(visibleRegion.getNorthEast())) : null;
        List<HotelsMapInfoV2DTO.Pin> pins = state.getPins();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = pins.iterator();
        while (it.hasNext()) {
            HotelsMapInfoV2VO.Pin vo = toVO((HotelsMapInfoV2DTO.Pin) it.next(), hashCode);
            if (vo != null) {
                arrayList.add(vo);
            }
        }
        HotelsMapInfoV2DTO.Pin userLocationPin = state.getUserLocationPin();
        HotelsMapInfoV2VO.Pin vo2 = userLocationPin != null ? toVO(userLocationPin, hashCode) : null;
        HotelsMapInfoV2VO.Pin.UserPin userPin2 = vo2 instanceof HotelsMapInfoV2VO.Pin.UserPin ? (HotelsMapInfoV2VO.Pin.UserPin) vo2 : null;
        Restriction locationDeniedAlert = state.getLocationDeniedAlert();
        a b11 = widgetInfo.b();
        String c12 = b11 != null ? b11.c() : null;
        a b12 = widgetInfo.b();
        boolean t2 = (b12 == null || (c11 = b12.c()) == null) ? false : h.t(c11, "serp=true", false);
        boolean z12 = state.getFiltersButton() != null;
        TravelFiltersButtonDTO filtersButton = state.getFiltersButton();
        TravelFiltersButtonVO vo3 = filtersButton != null ? MapperExtKt.toVO(filtersButton, Long.valueOf(hashCode)) : null;
        ButtonV3Atom.SmallIconButton zoomInButton = state.getZoomInButton();
        ButtonV3Atom.SmallIconButton zoomOutButton = state.getZoomOutButton();
        ButtonV3Atom.SmallIconButton geolocationButton = state.getGeolocationButton();
        ButtonV3Atom.SmallIconButton backButton = state.getBackButton();
        if (backButton == null) {
            backButton = provideDefaultBackButton();
        }
        List<Double> locationPoint = state.getLocationPoint();
        if (locationPoint == null || locationPoint.size() != 2) {
            userPin = userPin2;
            z11 = z12;
            mVar = null;
        } else {
            userPin = userPin2;
            z11 = z12;
            mVar = new m(state.getLocationPoint().get(0).doubleValue(), state.getLocationPoint().get(1).doubleValue());
        }
        return C7714v.a0(new HotelsMapInfoV2VO(hashCode, nVar, arrayList, userPin, backButton, locationDeniedAlert, c12, false, t2, z11, vo3, zoomInButton, zoomOutButton, geolocationButton, mVar, UserVerificationMethods.USER_VERIFY_PATTERN, null));
    }
}
