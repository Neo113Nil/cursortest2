package ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation.adapter;

import W10.c;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.mapper.CouponGoalsV2VO;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation.CouponGoalViewV2;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/adapter/CouponGoalItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO$CouponGoalItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/CouponGoalViewV2;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function0;", "", "isSingleState", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/CouponGoalViewV2;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO$CouponGoalItemVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO$CouponGoalItemVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/CouponGoalViewV2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponGoalItemViewHolder extends k<CouponGoalsV2VO.CouponGoalItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CouponGoalViewV2 containerView;

    @NotNull
    private final Function0<Boolean> isSingleState;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CouponGoalItemViewHolder(@NotNull CouponGoalViewV2 containerView, @NotNull ComposerReferences refs, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<Boolean> isSingleState) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(isSingleState, "isSingleState");
        this.containerView = containerView;
        this.refs = refs;
        this.actionHandler = actionHandler;
        this.isSingleState = isSingleState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CouponGoalsV2VO.CouponGoalItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CouponGoalViewV2 couponGoalViewV2 = this.containerView;
        couponGoalViewV2.setCompleted(item.getIsCompleted());
        couponGoalViewV2.setSingle(this.isSingleState.invoke().booleanValue());
        couponGoalViewV2.bindTitle(item.getTitle());
        couponGoalViewV2.bindImage(item.getImage());
        couponGoalViewV2.bindBadge(item.getBadge());
        couponGoalViewV2.bindProgress(item.getProgress());
        couponGoalViewV2.bindActionText(item.getActionText());
        couponGoalViewV2.bindDescription(item.getDescription());
        couponGoalViewV2.disableTextCopyable$widgets_main_prodGoogleAllVendorsRelease();
        couponGoalViewV2.bindAction(new CouponGoalItemViewHolder$bind$1$1(this, item));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CouponGoalsV2VO.CouponGoalItemVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CouponGoalItemViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
