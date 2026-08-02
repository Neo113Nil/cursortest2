package ru.ozon.app.android.marketing.widgets.coupon.core;

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
import ru.ozon.app.android.marketing.widgets.coupon.data.CouponDTO;
import ru.ozon.app.android.marketing.widgets.coupon.presentation.CouponVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/core/CouponMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO;Ll20/d;)Ljava/util/List;", "", "stateId", "mapDto", "(Lru/ozon/app/android/marketing/widgets/coupon/data/CouponDTO;J)Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponMapper implements Function2<CouponDTO, d, List<? extends CouponVO>> {
    @NotNull
    public final CouponVO mapDto(@NotNull CouponDTO state, long stateId) {
        Intrinsics.checkNotNullParameter(state, "state");
        CouponVO.Gradient gradient = new CouponVO.Gradient(state.getGradient().getStartColor(), state.getGradient().getEndColor());
        TextAtom code = state.getCode();
        TextAtom applyText = state.getApplyText();
        TextAtom subtitle = state.getSubtitle();
        String appliedColor = state.getAppliedColor();
        AtomActionDTO action = state.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return new CouponVO(stateId, gradient, code, applyText, subtitle, appliedColor, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(stateId), null, 2, null) : null, state.getCurrentMiniWidget());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CouponVO> invoke(@NotNull CouponDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(mapDto(state, widgetInfo.d().hashCode()));
    }
}
