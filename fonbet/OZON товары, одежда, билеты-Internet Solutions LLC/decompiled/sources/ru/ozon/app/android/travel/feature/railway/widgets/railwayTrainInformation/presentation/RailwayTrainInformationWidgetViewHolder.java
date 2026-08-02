package ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.railway.databinding.WidgetRailwayTrainInformationBinding;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.presentation.RailwayTrainInformationVO;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.presentation.adapter.RailwayTrainInformationAdapter;
import ru.ozon.app.android.travel.molecules.view.timer.TimerView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00110\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/railway/databinding/WidgetRailwayTrainInformationBinding;", "binding", "Lru/ozon/app/android/travel/feature/railway/databinding/WidgetRailwayTrainInformationBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/adapter/RailwayTrainInformationAdapter;", "adapter", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/adapter/RailwayTrainInformationAdapter;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwayTrainInformationWidgetViewHolder extends k<RailwayTrainInformationVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final RailwayTrainInformationAdapter adapter;

    @NotNull
    private final WidgetRailwayTrainInformationBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RailwayTrainInformationWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetRailwayTrainInformationBinding bind = WidgetRailwayTrainInformationBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.actionHandler = buildHandler;
        RailwayTrainInformationAdapter railwayTrainInformationAdapter = new RailwayTrainInformationAdapter(buildHandler);
        this.adapter = railwayTrainInformationAdapter;
        bind.railwayTrainInformationSegmentsRv.setAdapter(railwayTrainInformationAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RailwayTrainInformationVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.setItems(item.getSegments());
        final TimerView timerView = this.binding.railwayTrainInformationTimerTv;
        timerView.bindOrGone(item.getTimer(), K.a(this.references.getContainer().f()), this.actionHandler);
        timerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.presentation.RailwayTrainInformationWidgetViewHolder$bind$lambda$3$lambda$2$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                View view;
                if (timerView.getMeasuredWidth() <= 0 || timerView.getMeasuredHeight() <= 0) {
                    return;
                }
                timerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                TimerView timerView2 = (TimerView) timerView;
                view = this.containerView;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = timerView2.getHeight() / 2;
                view.setLayoutParams(marginLayoutParams);
            }
        });
        TextAtomView railwayTrainInformationTitleTav = this.binding.railwayTrainInformationTitleTav;
        Intrinsics.checkNotNullExpressionValue(railwayTrainInformationTitleTav, "railwayTrainInformationTitleTav");
        TextAtomHolderKt.bindOrGone$default(railwayTrainInformationTitleTav, item.getTitle(), null, 2, null);
        PriceView railwayTrainInformationPricePv = this.binding.railwayTrainInformationPricePv;
        Intrinsics.checkNotNullExpressionValue(railwayTrainInformationPricePv, "railwayTrainInformationPricePv");
        RailwayTrainInformationVO.PriceInfoVO priceInfo = item.getPriceInfo();
        PriceHolderKt.bindOrGone$default(railwayTrainInformationPricePv, priceInfo != null ? priceInfo.getPrice() : null, null, 2, null);
        TextAtomView railwayTrainInformationDescriptionTav = this.binding.railwayTrainInformationDescriptionTav;
        Intrinsics.checkNotNullExpressionValue(railwayTrainInformationDescriptionTav, "railwayTrainInformationDescriptionTav");
        RailwayTrainInformationVO.PriceInfoVO priceInfo2 = item.getPriceInfo();
        TextAtomHolderKt.bindOrGone$default(railwayTrainInformationDescriptionTav, priceInfo2 != null ? priceInfo2.getDescription() : null, null, 2, null);
        TextAtomView railwayTrainInformationLocalTimeInfoTav = this.binding.railwayTrainInformationLocalTimeInfoTav;
        Intrinsics.checkNotNullExpressionValue(railwayTrainInformationLocalTimeInfoTav, "railwayTrainInformationLocalTimeInfoTav");
        TextAtomHolderKt.bindOrGone$default(railwayTrainInformationLocalTimeInfoTav, item.getLocalTimeInfo(), null, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull RailwayTrainInformationVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((RailwayTrainInformationWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
