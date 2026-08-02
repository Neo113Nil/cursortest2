package ru.ozon.app.android.commonwidgets.widgets.logosList.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Vg.d;
import android.view.View;
import androidx.core.view.Y;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipShowService;
import ru.ozon.app.android.commonwidgets.widgets.logosList.presentation.LogosListVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.tiles.skuGrid2.BackgroundDrawBySkuGrid2DecoratorDisabled;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ;2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004:\u0001;B;\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010%\u001a\u00060#j\u0002`$H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00162\u0006\u0010%\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010-R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00160/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/product/tiles/skuGrid2/BackgroundDrawBySkuGrid2DecoratorDisabled;", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "cartNavigationService", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "asyncCartViewModel", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/cart/common/domain/CartNavigationService;Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;)V", "", "lock", "", "updateLocking", "(Z)V", "item", "showOnboardingIfNeed", "(Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO;)V", "", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Item;", "elements", "scrollToSelectedItem", "(Ljava/util/List;)V", "onAttach", "()V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Landroidx/recyclerview/widget/RecyclerView;", "LVg/d;", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListAdapter;", "logosListAdapter", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListAdapter;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipShowService;", "tooltipService", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipShowService;", "pendingOnboardingItem", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO;", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LogosListWidgetViewHolder extends k<LogosListVO> implements BackgroundDrawBySkuGrid2DecoratorDisabled {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AsyncCartViewModel asyncCartViewModel;

    @NotNull
    private final CartNavigationService cartNavigationService;

    @NotNull
    private final RecyclerView containerView;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final LogosListAdapter logosListAdapter;
    private LogosListVO pendingOnboardingItem;

    @NotNull
    private final CartTooltipShowService tooltipService;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListWidgetViewHolder$Companion;", "", "<init>", "()V", "ONBOARDING_VISIBLE_THRESHOLD", "", "DISABLED_ALPHA", "ENABLED_ALPHA", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogosListWidgetViewHolder(@NotNull RecyclerView containerView, @NotNull AppType appType, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull CartNavigationService cartNavigationService, @NotNull AsyncCartViewModel asyncCartViewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(cartNavigationService, "cartNavigationService");
        Intrinsics.checkNotNullParameter(asyncCartViewModel, "asyncCartViewModel");
        this.containerView = containerView;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.cartNavigationService = cartNavigationService;
        this.asyncCartViewModel = asyncCartViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new LogosListWidgetViewHolder$actionHandler$1(this)).onPreProcess(new LogosListWidgetViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        LogosListAdapter logosListAdapter = new LogosListAdapter(buildHandler, refs.getTokenizedAnalytics(), appType, this);
        this.logosListAdapter = logosListAdapter;
        this.tooltipService = new CartTooltipShowService(refs, false, false, true, 6, null);
        containerView.setAdapter(logosListAdapter);
        containerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        containerView.addItemDecoration(new LogosListDecoration(getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttach$updateLocking(LogosListWidgetViewHolder logosListWidgetViewHolder, boolean z11, kotlin.coroutines.d dVar) {
        logosListWidgetViewHolder.updateLocking(z11);
        return Unit.f71690a;
    }

    private final void scrollToSelectedItem(List<LogosListVO.Item> elements) {
        Object obj;
        RecyclerView.o layoutManager = this.containerView.getLayoutManager();
        if (layoutManager != null) {
            Iterator<T> it = elements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((LogosListVO.Item) obj).getIsSelected()) {
                        break;
                    }
                }
            }
            layoutManager.scrollToPosition(C7714v.S(obj, elements));
        }
    }

    private final void showOnboardingIfNeed(LogosListVO item) {
        View view;
        final LogosListVO.Onboarding onboarding = item.getOnboarding();
        if (onboarding == null) {
            return;
        }
        RecyclerView recyclerView = this.containerView;
        int i11 = Y.f42258g;
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.commonwidgets.widgets.logosList.presentation.LogosListWidgetViewHolder$showOnboardingIfNeed$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    View view3;
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    RecyclerView.C findViewHolderForAdapterPosition = LogosListWidgetViewHolder.this.containerView.findViewHolderForAdapterPosition(onboarding.getIndex());
                    if (findViewHolderForAdapterPosition == null || (view3 = findViewHolderForAdapterPosition.itemView) == null) {
                        return;
                    }
                    CartTooltipShowService.showTooltipIfNeed$default(LogosListWidgetViewHolder.this.tooltipService, onboarding.getTooltipWithOnboardingAction(), view3, 0, false, LogosListWidgetViewHolder.this.actionHandler, 12, null);
                }
            });
            return;
        }
        RecyclerView.C findViewHolderForAdapterPosition = this.containerView.findViewHolderForAdapterPosition(onboarding.getIndex());
        if (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
            return;
        }
        CartTooltipShowService.showTooltipIfNeed$default(this.tooltipService, onboarding.getTooltipWithOnboardingAction(), view, 0, false, this.actionHandler, 12, null);
    }

    private final void updateLocking(boolean lock) {
        this.logosListAdapter.setEnabled(!lock);
        this.containerView.setAlpha(lock ? 0.4f : 1.0f);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        C2399j.C(new C2408n0(this.asyncCartViewModel.isProcessing(), new LogosListWidgetViewHolder$onAttach$1(this)), K.a(this));
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        LogosListVO logosListVO;
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        if (o.a(itemView, info, false) < 0.9f || (logosListVO = this.pendingOnboardingItem) == null) {
            return;
        }
        this.pendingOnboardingItem = null;
        showOnboardingIfNeed(logosListVO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull LogosListVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.logosListAdapter.submitList(item.getItems());
        scrollToSelectedItem(item.getItems());
        this.pendingOnboardingItem = item;
        updateLocking(this.asyncCartViewModel.isProcessing().getValue().booleanValue());
    }
}
