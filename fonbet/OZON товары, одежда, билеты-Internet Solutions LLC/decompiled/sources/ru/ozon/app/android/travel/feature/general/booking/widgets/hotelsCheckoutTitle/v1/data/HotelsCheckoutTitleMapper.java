package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.data;

import WZ.t;
import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.data.HotelsCheckoutTitleDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.presentation.HotelsCheckoutTitleVO;
import ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/data/HotelsCheckoutTitleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/data/HotelsCheckoutTitleDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/data/HotelsCheckoutTitleDTO$CustomBadge;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO$CustomBadge;", "toVO", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/data/HotelsCheckoutTitleDTO$CustomBadge;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO$CustomBadge;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/data/HotelsCheckoutTitleDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsCheckoutTitleMapper implements Function2<HotelsCheckoutTitleDTO, d, List<? extends HotelsCheckoutTitleVO>> {

    @NotNull
    private final Context context;

    public HotelsCheckoutTitleMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final HotelsCheckoutTitleVO.CustomBadge toVO(HotelsCheckoutTitleDTO.CustomBadge customBadge) {
        AtomActionDTO action;
        TextDTO title = customBadge.getTitle();
        String backgroundColor = customBadge.getBackgroundColor();
        float pxF = ResourceExtKt.toPxF(customBadge.getCornerRadius().getPx(), this.context);
        CommonControlSettings common = customBadge.getCommon();
        return new HotelsCheckoutTitleVO.CustomBadge(title, backgroundColor, pxF, (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, customBadge.getCommon().getTrackingInfo()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsCheckoutTitleVO> invoke(@NotNull HotelsCheckoutTitleDTO state, @NotNull d widgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        HotelsCheckoutTitleDTO.CustomBadge badge = state.getBadge();
        t tVar = null;
        HotelsCheckoutTitleVO.CustomBadge vo = badge != null ? toVO(badge) : null;
        DateTime endTime = state.getEndTime();
        Integer timeLeft = state.getTimeLeft();
        Long valueOf = timeLeft != null ? Long.valueOf(DateExtensionsKt.toTimestamp(timeLeft.intValue())) : null;
        String backgroundColor = state.getBackgroundColor();
        CommonControlSettings common = state.getCommon();
        AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, state.getCommon().getTrackingInfo());
        CommonControlSettings common2 = state.getCommon();
        if (common2 != null && (trackingInfo = common2.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        }
        return C7714v.a0(new HotelsCheckoutTitleVO(hashCode, title, vo, endTime, valueOf, backgroundColor, atomAction, tVar));
    }
}
