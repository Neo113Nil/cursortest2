package ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.mapper;

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
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.data.CouponGoalsV2DTO;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.mapper.CouponGoalsV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u000e*\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/data/CouponGoalsV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/data/CouponGoalsV2DTO;J)Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO;", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/data/CouponGoalsV2DTO$CouponGoalItem;", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO$CouponGoalItemVO;", "(Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/data/CouponGoalsV2DTO$CouponGoalItem;J)Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO$CouponGoalItemVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/data/CouponGoalsV2DTO;Ll20/d;)Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponGoalsV2Mapper implements Function2<CouponGoalsV2DTO, d, List<? extends CouponGoalsV2VO>> {
    private final CouponGoalsV2VO toVO(CouponGoalsV2DTO couponGoalsV2DTO, long j11) {
        List<CouponGoalsV2DTO.CouponGoalItem> items = couponGoalsV2DTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((CouponGoalsV2DTO.CouponGoalItem) it.next(), j11));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = couponGoalsV2DTO.getTrackingInfo();
        return new CouponGoalsV2VO(j11, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CouponGoalsV2VO> invoke(@NotNull CouponGoalsV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(widgetInfo)));
    }

    private final CouponGoalsV2VO.CouponGoalItemVO toVO(CouponGoalsV2DTO.CouponGoalItem couponGoalItem, long j11) {
        boolean isCompleted = couponGoalItem.isCompleted();
        String image = couponGoalItem.getImage();
        TextDTO title = couponGoalItem.getTitle();
        TextDTO description = couponGoalItem.getDescription();
        BadgeDTO badge = couponGoalItem.getBadge();
        TextDTO actionText = couponGoalItem.getActionText();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(couponGoalItem.getAction(), couponGoalItem.getTrackingInfo());
        Integer progress = couponGoalItem.getProgress();
        Map<String, TokenizedTrackingInfo> trackingInfo = couponGoalItem.getTrackingInfo();
        return new CouponGoalsV2VO.CouponGoalItemVO(j11, isCompleted, image, title, description, badge, actionText, progress, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
