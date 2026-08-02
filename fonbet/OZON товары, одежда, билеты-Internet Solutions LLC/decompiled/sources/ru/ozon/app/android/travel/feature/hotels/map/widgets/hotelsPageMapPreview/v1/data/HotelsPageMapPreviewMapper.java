package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.data;

import WZ.t;
import android.graphics.PointF;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.Coordinate;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.presentation.HotelsPageMapPreviewVO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import we0.m;
import we0.n;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/data/HotelsPageMapPreviewMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/data/HotelsPageMapPreviewDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/presentation/HotelsPageMapPreviewVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;", "Lwe0/m;", "toLatLng", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;)Lwe0/m;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/data/HotelsPageMapPreviewDTO;Ll20/d;)Ljava/util/List;", "", "", "", "radii", "Ljava/util/Map;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageMapPreviewMapper implements Function2<HotelsPageMapPreviewDTO, d, List<? extends HotelsPageMapPreviewVO>> {

    @NotNull
    private final Map<String, Integer> radii = U.j(new Pair("hotelsPageMapPreview", 20), new Pair("hotelsPageMapPreviewForTours", 24));

    private final m toLatLng(Coordinate coordinate) {
        return new m(coordinate.getLatitude(), coordinate.getLongitude());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsPageMapPreviewVO> invoke(@NotNull HotelsPageMapPreviewDTO state, @NotNull d widgetInfo) {
        long j11;
        int i11;
        t tVar;
        t tVar2;
        TextAtom textAtom;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        Integer num = this.radii.get(widgetInfo.c().b());
        if (num == null) {
            return K.f71697a;
        }
        int intValue = num.intValue();
        TextAtom title = state.getTitle();
        TextAtom subtitle = state.getSubtitle();
        LinkButtonVO vo = MapperExtKt.toVO(state.getCopyButton());
        m latLng = toLatLng(state.getPinCoordinate());
        Icon pinIcon = state.getPinIcon();
        String valueOf = String.valueOf(state.getPinIcon().hashCode());
        PointF pointF = MapExtKt.toPointF(state.getPinAnchorPoint());
        n nVar = new n(toLatLng(state.getBoundingBox().getSouthWest()), toLatLng(state.getBoundingBox().getNorthEast()));
        m latLng2 = toLatLng(state.getPinCoordinate());
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(state.getSelectAction(), state.getSelectActionTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        m mVar = null;
        if (trackingInfo != null) {
            j11 = hashCode;
            i11 = 2;
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        } else {
            j11 = hashCode;
            i11 = 2;
            tVar = null;
        }
        List<Double> locationPoint = state.getLocationPoint();
        if (locationPoint == null || locationPoint.size() != i11) {
            tVar2 = tVar;
            textAtom = title;
        } else {
            tVar2 = tVar;
            textAtom = title;
            mVar = new m(state.getLocationPoint().get(0).doubleValue(), state.getLocationPoint().get(1).doubleValue());
        }
        return C7714v.a0(new HotelsPageMapPreviewVO(j11, textAtom, subtitle, latLng, pinIcon, valueOf, pointF, nVar, latLng2, atomAction, vo, intValue, tVar2, mVar));
    }
}
