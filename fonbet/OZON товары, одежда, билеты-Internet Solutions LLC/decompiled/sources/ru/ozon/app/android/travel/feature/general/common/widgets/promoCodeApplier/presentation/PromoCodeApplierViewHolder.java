package ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.presentation.PromoCodeApplierVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.view.PromoCodeApplierView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/view/PromoCodeApplierView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/view/PromoCodeApplierView;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;LWZ/l;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "item", "", "onAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierVO;)V", "sendClickEvent", "()V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/presentation/PromoCodeApplierVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "onDetach", "Lru/ozon/app/android/travel/feature/general/common/widgets/promoCodeApplier/view/PromoCodeApplierView;", "LWZ/l;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromoCodeApplierViewHolder extends k<PromoCodeApplierVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PromoCodeApplierView containerView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodeApplierViewHolder(@NotNull PromoCodeApplierView containerView, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new PromoCodeApplierViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAction(AtomAction action, PromoCodeApplierVO item) {
        if (!(action instanceof AtomAction.ComposerAction) || item.getInput().getName() == null) {
            return;
        }
        LinkedHashMap l11 = U.l(new Pair(item.getInput().getName(), this.containerView.getCurrentPromoAndClearFocus()));
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        Map<String, String> params = composerAction.getParams();
        if (params != null) {
            l11.putAll(params);
        }
        this.actionHandler.invoke(AtomAction.ComposerAction.copy$default(composerAction, null, null, l11, null, null, 27, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendClickEvent() {
        PromoCodeApplierVO.InputVO input;
        t trackingInfo;
        PromoCodeApplierVO boundData = getBoundData();
        if (boundData == null || (input = boundData.getInput()) == null || (trackingInfo = input.getTrackingInfo()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.containerView.addFocusChangeListener();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.containerView.removeFocusChangeListener();
        this.containerView.clearWatcher();
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PromoCodeApplierVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item, new PromoCodeApplierViewHolder$bind$1(this), new PromoCodeApplierViewHolder$bind$2(this, item));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PromoCodeApplierVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((PromoCodeApplierViewHolder) item, trackingData, viewedPond);
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
    }
}
