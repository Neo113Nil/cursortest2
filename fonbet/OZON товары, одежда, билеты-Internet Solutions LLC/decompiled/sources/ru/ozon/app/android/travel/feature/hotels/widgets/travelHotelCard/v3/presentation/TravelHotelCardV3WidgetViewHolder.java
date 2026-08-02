package ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.lifecycle.K;
import com.google.android.flexbox.FlexboxLayout;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.databinding.WidgetTravelHotelCardV3Binding;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.presentation.TravelHotelCardV3VO;
import ru.ozon.app.android.travel.molecules.dto.timer.TimerDTO;
import ru.ozon.app.android.travel.molecules.view.timer.TimerView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010&\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\"\u001a\u00060 j\u0002`!2\u000e\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00110.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3ViewModel;", "viewModel", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3ViewModel;LWZ/l;)V", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "badges", "", "bindBadges", "(Ljava/util/List;)V", "Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "payUntilBadge", "bindPayUntilBadge", "(Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;)V", "onAttach", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3VO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelHotelCard/v3/presentation/TravelHotelCardV3ViewModel;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetTravelHotelCardV3Binding;", "binding", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetTravelHotelCardV3Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/molecules/view/timer/TimerView;", "timerView", "Lru/ozon/app/android/travel/molecules/view/timer/TimerView;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelHotelCardV3WidgetViewHolder extends k<TravelHotelCardV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTravelHotelCardV3Binding binding;

    @NotNull
    private final ComposerReferences references;
    private TimerView timerView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TravelHotelCardV3ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelHotelCardV3WidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull TravelHotelCardV3ViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.references = references;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetTravelHotelCardV3Binding bind = WidgetTravelHotelCardV3Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
    }

    private final void bindBadges(List<Badge> badges) {
        for (Badge badge : badges) {
            FlexboxLayout flexboxLayout = this.binding.travelHotelCardV3BadgesFl;
            View g10 = q.f64554a.g(N.b(BadgeView.class), getContext());
            BadgeHolderKt.bind$default((BadgeView) g10, badge, (Function1) null, 2, (Object) null);
            flexboxLayout.addView(g10);
        }
    }

    private final void bindPayUntilBadge(TimerDTO payUntilBadge) {
        if (this.timerView == null) {
            this.timerView = new TimerView(getContext(), null, 0, 6, null);
        }
        TimerView timerView = this.timerView;
        if (timerView != null) {
            FlexboxLayout flexboxLayout = this.binding.travelHotelCardV3BadgesFl;
            timerView.bindOrGone(payUntilBadge, K.a(this.references.getContainer().f()), this.actionHandler);
            flexboxLayout.addView(timerView);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.actionLiveData().observe(this, new TravelHotelCardV3WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelHotelCardV3WidgetViewHolder$onAttach$1(this.actionHandler)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelHotelCardV3VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        FlexboxLayout travelHotelCardV3BadgesFl = this.binding.travelHotelCardV3BadgesFl;
        Intrinsics.checkNotNullExpressionValue(travelHotelCardV3BadgesFl, "travelHotelCardV3BadgesFl");
        travelHotelCardV3BadgesFl.setVisibility(item.getIsVisibleBadges() ? 0 : 8);
        TimerView timerView = this.timerView;
        if (timerView != null) {
            timerView.destroyTimer();
        }
        this.binding.travelHotelCardV3BadgesFl.removeAllViews();
        List<Badge> badges = item.getBadges();
        if (badges != null) {
            bindBadges(badges);
        }
        TimerDTO payUntilBadge = item.getPayUntilBadge();
        if (payUntilBadge != null) {
            bindPayUntilBadge(payUntilBadge);
        }
        TextAtomView travelHotelCardV3NameTv = this.binding.travelHotelCardV3NameTv;
        Intrinsics.checkNotNullExpressionValue(travelHotelCardV3NameTv, "travelHotelCardV3NameTv");
        TextAtomHolderKt.bind$default(travelHotelCardV3NameTv, item.getHotelName(), null, 2, null);
        TextAtomView travelHotelCardV3AddressTv = this.binding.travelHotelCardV3AddressTv;
        Intrinsics.checkNotNullExpressionValue(travelHotelCardV3AddressTv, "travelHotelCardV3AddressTv");
        TextAtomHolderKt.bindOrGone$default(travelHotelCardV3AddressTv, item.getHotelAddress(), null, 2, null);
        TextAtomView travelHotelCardV3CheckInTitleTv = this.binding.travelHotelCardV3CheckInTitleTv;
        Intrinsics.checkNotNullExpressionValue(travelHotelCardV3CheckInTitleTv, "travelHotelCardV3CheckInTitleTv");
        TextAtomHolderKt.bindOrGone$default(travelHotelCardV3CheckInTitleTv, item.getCheckInTitle(), null, 2, null);
        TextAtomView travelHotelCardV3CheckInDateTv = this.binding.travelHotelCardV3CheckInDateTv;
        Intrinsics.checkNotNullExpressionValue(travelHotelCardV3CheckInDateTv, "travelHotelCardV3CheckInDateTv");
        TextAtomHolderKt.bindOrGone$default(travelHotelCardV3CheckInDateTv, item.getCheckInDateWithTime(), null, 2, null);
        TextAtomView travelHotelCardV3CheckOutTitleTv = this.binding.travelHotelCardV3CheckOutTitleTv;
        Intrinsics.checkNotNullExpressionValue(travelHotelCardV3CheckOutTitleTv, "travelHotelCardV3CheckOutTitleTv");
        TextAtomHolderKt.bindOrGone$default(travelHotelCardV3CheckOutTitleTv, item.getCheckOutTitle(), null, 2, null);
        TextAtomView travelHotelCardV3CheckOutDateTv = this.binding.travelHotelCardV3CheckOutDateTv;
        Intrinsics.checkNotNullExpressionValue(travelHotelCardV3CheckOutDateTv, "travelHotelCardV3CheckOutDateTv");
        TextAtomHolderKt.bindOrGone$default(travelHotelCardV3CheckOutDateTv, item.getCheckOutDateWithTime(), null, 2, null);
        PriceView travelHotelCardV3TotalPricePv = this.binding.travelHotelCardV3TotalPricePv;
        Intrinsics.checkNotNullExpressionValue(travelHotelCardV3TotalPricePv, "travelHotelCardV3TotalPricePv");
        PriceHolderKt.bindOrGone$default(travelHotelCardV3TotalPricePv, item.getTotalPrice(), null, 2, null);
        TextAtomView travelHotelCardV3PriceDescriptionTv = this.binding.travelHotelCardV3PriceDescriptionTv;
        Intrinsics.checkNotNullExpressionValue(travelHotelCardV3PriceDescriptionTv, "travelHotelCardV3PriceDescriptionTv");
        TextAtomHolderKt.bindOrGone$default(travelHotelCardV3PriceDescriptionTv, item.getPriceDescription(), null, 2, null);
        TravelHotelCardV3VO.PendingAction pendingAction = item.getPendingAction();
        if (pendingAction != null) {
            this.viewModel.startTimer(pendingAction.getTimeLeft(), pendingAction.getAction());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TravelHotelCardV3VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TravelHotelCardV3WidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
