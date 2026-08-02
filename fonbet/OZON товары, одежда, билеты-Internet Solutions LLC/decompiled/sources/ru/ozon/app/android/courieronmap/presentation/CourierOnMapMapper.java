package ru.ozon.app.android.courieronmap.presentation;

import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.courieronmap.data.CourierOnMapDTO;
import ru.ozon.app.android.courieronmap.presentation.vo.CourierOnMapVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import we0.m;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/CourierOnMapMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO;", "Ll20/d;", "", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$PinInfo;", "", "isCourier", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO$PinInfo;", "toVo", "(Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$PinInfo;Z)Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO$PinInfo;", "Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$PinInfo$Coordinates;", "Lwe0/m;", "toLatLng", "(Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$PinInfo$Coordinates;)Lwe0/m;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO;Ll20/d;)Ljava/util/List;", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierOnMapMapper implements Function2<CourierOnMapDTO, d, List<? extends CourierOnMapVO>> {
    private final m toLatLng(CourierOnMapDTO.PinInfo.Coordinates coordinates) {
        return new m(coordinates.getLatitude(), coordinates.getLongitude());
    }

    private final CourierOnMapVO.PinInfo toVo(CourierOnMapDTO.PinInfo pinInfo, boolean z11) {
        return new CourierOnMapVO.PinInfo(toLatLng(pinInfo.getCoordinates()), pinInfo.getImage(), pinInfo.getId(), pinInfo.getCaption(), z11);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CourierOnMapVO> invoke(@NotNull CourierOnMapDTO state, @NotNull d widgetInfo) {
        ArrayList arrayList;
        CourierOnMapVO.PinInfo pinInfo;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        CourierOnMapDTO.PinInfo courier = state.getCourier();
        t tVar = null;
        CourierOnMapVO.PinInfo vo = courier != null ? toVo(courier, true) : null;
        CourierOnMapVO.PinInfo vo2 = toVo(state.getCustomer(), false);
        TextAtom title = state.getTitle();
        TextAtom subtitle = state.getSubtitle();
        int refreshInterval = state.getRefreshInterval();
        DisclaimerAtom annotation = state.getAnnotation();
        TextAtom deliveryTime = state.getDeliveryTime();
        List<CourierOnMapDTO.Cell> orderInfo = state.getOrderInfo();
        if (orderInfo != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : orderInfo) {
                if (obj instanceof CellAtom) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        ButtonV3Atom.LargeButton button = state.getButton();
        int pinAnimationDuration = state.getPinAnimationDuration();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        if (trackingInfo != null) {
            pinInfo = vo;
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        } else {
            pinInfo = vo;
        }
        return C7714v.a0(new CourierOnMapVO(hashCode, pinInfo, vo2, title, subtitle, refreshInterval, annotation, deliveryTime, arrayList, button, pinAnimationDuration, tVar, state.getCourierDetails()));
    }
}
