package ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.view.AvailablePromotionView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/presentation/AvailablePromotionWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/presentation/AvailablePromotionVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/view/AvailablePromotionView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/view/AvailablePromotionView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/presentation/AvailablePromotionVO;Ll20/d;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/view/AvailablePromotionView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AvailablePromotionWidgetViewHolder extends k<AvailablePromotionVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AvailablePromotionView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailablePromotionWidgetViewHolder(@NotNull AvailablePromotionView view, @NotNull ComposerReferences composerReferences, @NotNull HandlersInhibitor handlersInhibitor) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.view = view;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).onPreProcess(new AvailablePromotionWidgetViewHolder$actionHandler$1(this, composerReferences)).enableClickThrottling(handlersInhibitor).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AvailablePromotionVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item, this.actionHandler, new AvailablePromotionWidgetViewHolder$bind$1(item));
    }
}
