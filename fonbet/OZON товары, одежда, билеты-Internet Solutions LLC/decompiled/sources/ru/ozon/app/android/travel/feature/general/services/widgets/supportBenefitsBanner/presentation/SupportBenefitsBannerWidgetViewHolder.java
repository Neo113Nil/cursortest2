package ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.presentation;

import W10.c;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.presentation.view.SupportBenefitsBannerView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/view/SupportBenefitsBannerView;", "containerView", "Ll10/i;", "container", "<init>", "(Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/view/SupportBenefitsBannerView;Ll10/i;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/view/SupportBenefitsBannerView;", "Ll10/i;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SupportBenefitsBannerWidgetViewHolder extends k<SupportBenefitsBannerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final SupportBenefitsBannerView containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportBenefitsBannerWidgetViewHolder(@NotNull SupportBenefitsBannerView containerView, @NotNull i container) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(container, "container");
        this.containerView = containerView;
        this.container = container;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SupportBenefitsBannerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SupportBenefitsBannerVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), viewEvent, null, 2, null);
        }
    }
}
