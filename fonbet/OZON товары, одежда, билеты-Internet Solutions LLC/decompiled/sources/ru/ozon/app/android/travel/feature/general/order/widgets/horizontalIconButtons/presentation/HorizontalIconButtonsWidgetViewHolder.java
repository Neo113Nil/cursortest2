package ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.presentation.HorizontalIconButtonsVO;
import ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.view.HorizontalIconButtonsContainerView;
import ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.view.IconButtonView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 22\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00012B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010%\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` 2\u000e\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#H\u0016¢\u0006\u0004\b%\u0010&R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001c0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/presentation/HorizontalIconButtonsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/presentation/HorizontalIconButtonsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;LWZ/l;)V", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/presentation/HorizontalIconButtonsVO$IconButtonVO;", "iconButtons", "prepareViews", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/view/IconButtonView;", "createIconButtonView", "()Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/view/IconButtonView;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/presentation/HorizontalIconButtonsVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/presentation/HorizontalIconButtonsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/view/HorizontalIconButtonsContainerView;", "container", "Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/view/HorizontalIconButtonsContainerView;", "", "viewPool", "Ljava/util/List;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HorizontalIconButtonsWidgetViewHolder extends k<HorizontalIconButtonsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final HorizontalIconButtonsContainerView container;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final List<IconButtonView> viewPool;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/presentation/HorizontalIconButtonsWidgetViewHolder$Companion;", "", "<init>", "()V", "PRECREATED_VIEWS_SIZE", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalIconButtonsWidgetViewHolder(@NotNull View view, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.container = view instanceof HorizontalIconButtonsContainerView ? (HorizontalIconButtonsContainerView) view : null;
        this.viewPool = new ArrayList();
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new HorizontalIconButtonsWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        for (int i11 = 0; i11 < 2; i11++) {
            this.viewPool.add(createIconButtonView());
        }
    }

    private final IconButtonView createIconButtonView() {
        IconButtonView iconButtonView = new IconButtonView(getContext(), null, 0, 0, 14, null);
        iconButtonView.setId(View.generateViewId());
        return iconButtonView;
    }

    private final List<View> prepareViews(List<HorizontalIconButtonsVO.IconButtonVO> iconButtons) {
        int size = this.viewPool.size() - iconButtons.size();
        int i11 = 0;
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                List<IconButtonView> list = this.viewPool;
                list.remove(C7714v.P(list));
            }
        } else if (size < 0) {
            int i13 = -size;
            for (int i14 = 0; i14 < i13; i14++) {
                this.viewPool.add(createIconButtonView());
            }
        }
        for (Object obj : this.viewPool) {
            int i15 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ((IconButtonView) obj).bind(iconButtons.get(i11), this.actionHandler);
            i11 = i15;
        }
        return this.viewPool;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HorizontalIconButtonsVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        List<View> prepareViews = prepareViews(item.getIconButtons());
        HorizontalIconButtonsContainerView horizontalIconButtonsContainerView = this.container;
        if (horizontalIconButtonsContainerView != null) {
            horizontalIconButtonsContainerView.placeViews(prepareViews);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HorizontalIconButtonsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HorizontalIconButtonsWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
