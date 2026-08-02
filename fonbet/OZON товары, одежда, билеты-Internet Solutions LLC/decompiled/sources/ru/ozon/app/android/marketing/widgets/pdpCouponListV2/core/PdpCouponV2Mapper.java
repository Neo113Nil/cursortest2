package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.data.PdpCouponListV2DTO;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.model.PdpCouponItemListV2VO;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.model.PdpCouponListV2VO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/core/PdpCouponV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponListV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$PdpCouponV2DTO;", "", "id", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponItemListV2VO;", "toVo", "(Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO$PdpCouponV2DTO;J)Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponItemListV2VO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/data/PdpCouponListV2DTO;Ll20/d;)Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PdpCouponV2Mapper implements Function2<PdpCouponListV2DTO, d, List<? extends PdpCouponListV2VO>> {
    private final PdpCouponItemListV2VO toVo(PdpCouponListV2DTO.PdpCouponV2DTO pdpCouponV2DTO, long j11) {
        PdpCouponItemListV2VO.Gradient gradient = new PdpCouponItemListV2VO.Gradient(pdpCouponV2DTO.getGradient().getStartColor(), pdpCouponV2DTO.getGradient().getEndColor());
        String promocode = pdpCouponV2DTO.getPromocode().getPromocode();
        String appliedColor = pdpCouponV2DTO.getPromocode().getAppliedColor();
        TextAtom applyText = pdpCouponV2DTO.getPromocode().getApplyText();
        boolean isApplied = pdpCouponV2DTO.getPromocode().isApplied();
        Map<String, TokenizedTrackingInfo> trackingInfo = pdpCouponV2DTO.getPromocode().getTrackingInfo();
        PdpCouponItemListV2VO.Promocode promocode2 = new PdpCouponItemListV2VO.Promocode(promocode, appliedColor, applyText, isApplied, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, pdpCouponV2DTO.getPromocode().getAction(), pdpCouponV2DTO.getPromocode().getTrackingInfo());
        PdpCouponItemListV2VO.CouponText couponText = new PdpCouponItemListV2VO.CouponText(pdpCouponV2DTO.getCouponText().getPrimaryText(), pdpCouponV2DTO.getCouponText().getSecondaryText());
        PdpCouponItemListV2VO.CouponAction couponAction = pdpCouponV2DTO.getCouponAction() != null ? new PdpCouponItemListV2VO.CouponAction(pdpCouponV2DTO.getCouponAction().getAction(), pdpCouponV2DTO.getCouponAction().getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo2 = pdpCouponV2DTO.getTrackingInfo();
        return new PdpCouponItemListV2VO(j11, gradient, couponText, promocode2, couponAction, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PdpCouponListV2VO> invoke(@NotNull PdpCouponListV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<PdpCouponListV2DTO.PdpCouponV2DTO> coupons = state.getCoupons();
        ArrayList arrayList = new ArrayList(C7714v.z(coupons, 10));
        Iterator<T> it = coupons.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((PdpCouponListV2DTO.PdpCouponV2DTO) it.next(), hashCode));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new PdpCouponListV2VO(hashCode, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
