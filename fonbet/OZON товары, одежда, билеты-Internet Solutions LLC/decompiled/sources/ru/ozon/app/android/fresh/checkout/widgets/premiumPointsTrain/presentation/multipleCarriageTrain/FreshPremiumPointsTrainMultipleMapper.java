package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain;

import Sc.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.data.FreshPremiumPointsTrainDTO;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.FreshPremiumPointsTrainMultipleVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\f\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u0010J\u0013\u0010\f\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\f\u0010\u0013J\u0013\u0010\f\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\f\u0010\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0003j\u0002`\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh;", "", "stateId", "toVO", "(Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh;Ljava/lang/String;)Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$HeadCarriage;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO$PremiumPointsItem$HeadCarriage;", "(Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$HeadCarriage;)Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO$PremiumPointsItem$HeadCarriage;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$TailCarriage;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO$PremiumPointsItem$TailCarriage;", "(Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$TailCarriage;)Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO$PremiumPointsItem$TailCarriage;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$SignItem;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO$PremiumPointsItem$SignItem;", "(Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$SignItem;)Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO$PremiumPointsItem$SignItem;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO;Ll20/d;)Ljava/util/List;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshPremiumPointsTrainMultipleMapper implements Function2<FreshPremiumPointsTrainDTO, d, List<? extends FreshPremiumPointsTrainMultipleVO>> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    private final FreshPremiumPointsTrainMultipleVO toVO(FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh multipleCarriageTrainFresh, String str) {
        ?? r02;
        FreshPremiumPointsTrainMultipleVO.PremiumPointsItem vo;
        long hashCode = str.hashCode();
        TextDTO title = multipleCarriageTrainFresh.getTitle();
        List<FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem> premiumPointsItems = multipleCarriageTrainFresh.getPremiumPointsItems();
        if (premiumPointsItems != null) {
            List<FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem> list = premiumPointsItems;
            r02 = new ArrayList(C7714v.z(list, 10));
            for (FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem premiumPointsItem : list) {
                if (premiumPointsItem instanceof FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem.HeadCarriage) {
                    vo = toVO((FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem.HeadCarriage) premiumPointsItem);
                } else if (premiumPointsItem instanceof FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem.TailCarriage) {
                    vo = toVO((FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem.TailCarriage) premiumPointsItem);
                } else {
                    if (!(premiumPointsItem instanceof FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem.SignItem)) {
                        throw new o();
                    }
                    vo = toVO((FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem.SignItem) premiumPointsItem);
                }
                r02.add(vo);
            }
        } else {
            r02 = K.f71697a;
        }
        List list2 = r02;
        Map<String, TokenizedTrackingInfo> trackingInfo = multipleCarriageTrainFresh.getTrackingInfo();
        return new FreshPremiumPointsTrainMultipleVO(hashCode, title, list2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FreshPremiumPointsTrainMultipleVO> invoke(@NotNull FreshPremiumPointsTrainDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO((FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh) state, widgetInfo.d()));
    }

    private final FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.HeadCarriage toVO(FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem.HeadCarriage headCarriage) {
        TextDTO title = headCarriage.getTitle();
        String icon = headCarriage.getIcon();
        String iconTint = headCarriage.getIconTint();
        AtomActionDTO action = headCarriage.getAction();
        return new FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.HeadCarriage(title, icon, iconTint, action != null ? AtomActionMapperKt.toAtomAction(action, headCarriage.getTrackingInfo()) : null);
    }

    private final FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.TailCarriage toVO(FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem.TailCarriage tailCarriage) {
        String title = tailCarriage.getTitle();
        String titleTintColor = tailCarriage.getTitleTintColor();
        String points = tailCarriage.getPoints();
        String pointsIcon = tailCarriage.getPointsIcon();
        String pointsTintColor = tailCarriage.getPointsTintColor();
        String statusIcon = tailCarriage.getStatusIcon();
        String statusIconTint = tailCarriage.getStatusIconTint();
        AtomActionDTO action = tailCarriage.getAction();
        return new FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.TailCarriage(title, titleTintColor, points, pointsIcon, pointsTintColor, statusIcon, statusIconTint, action != null ? AtomActionMapperKt.toAtomAction(action, tailCarriage.getTrackingInfo()) : null);
    }

    private final FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.SignItem toVO(FreshPremiumPointsTrainDTO.MultipleCarriageTrainFresh.PremiumPointsItem.SignItem signItem) {
        return new FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.SignItem(signItem.getSignIcon(), signItem.getSignSize(), signItem.getSignIconTint());
    }
}
