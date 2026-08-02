package ru.ozon.app.android.cart.controls.v3.presentation;

import Dy.ViewOnClickListenerC2883a;
import En.ViewOnClickListenerC2972a;
import Vg.c;
import WZ.l;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3VO;
import ru.ozon.app.android.cart.scroll.ScrollUtilsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001:\b\u0001\u0018\u0000 =2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004:\u0001=BU\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00110\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u00022\n\u0010+\u001a\u00060)j\u0002`*H\u0014¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00102R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00103R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00105R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00106R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001b078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3View;", "containerView", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "", "cartProductSelectMode", "Lru/ozon/app/android/utils/AppType;", "appType", "Lkotlin/Function0;", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "handlersStoreProvider", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "asyncCartViewModel", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3View;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/composer/ComposerReferences;ZLru/ozon/app/android/utils/AppType;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;LWZ/l;)V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "isDisabled", "", "setDisabledStyle", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Z)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "addParamsToAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/atoms/af/AtomAction;", "Lkotlin/Pair;", "", "findPreviousScrollAnchor", "()Lkotlin/Pair;", "item", "processCheckBoxClick", "(Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;Ll20/d;)V", "Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3View;", "getContainerView", "()Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3View;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/composer/ComposerReferences;", "Z", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "LWZ/l;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/cart/controls/v3/presentation/ControlsV3ViewHolder$lockableActionHandler$1", "lockableActionHandler", "Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3ViewHolder$lockableActionHandler$1;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ControlsV3ViewHolder extends k<ControlsV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AppType appType;

    @NotNull
    private final AsyncCartViewModel asyncCartViewModel;
    private final boolean cartProductSelectMode;

    @NotNull
    private final ControlsV3View containerView;

    @NotNull
    private final HandlersInhibitor handlersInhibitor;

    @NotNull
    private final ControlsV3ViewHolder$lockableActionHandler$1 lockableActionHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3ViewHolder$Companion;", "", "<init>", "()V", "ENABLED_ALPHA", "", "DISABLED_ALPHA", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlsV3ViewHolder(@NotNull ControlsV3View containerView, @NotNull HandlersInhibitor handlersInhibitor, @NotNull ComposerReferences refs, boolean z11, @NotNull AppType appType, @NotNull Function0<? extends c> handlersStoreProvider, @NotNull AsyncCartViewModel asyncCartViewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(handlersStoreProvider, "handlersStoreProvider");
        Intrinsics.checkNotNullParameter(asyncCartViewModel, "asyncCartViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.handlersInhibitor = handlersInhibitor;
        this.refs = refs;
        this.cartProductSelectMode = z11;
        this.appType = appType;
        this.asyncCartViewModel = asyncCartViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(handlersStoreProvider).customAnalyticHandler(ControlsV3ViewHolder$actionHandler$1.INSTANCE).buildHandler();
        this.lockableActionHandler = new ControlsV3ViewHolder$lockableActionHandler$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomAction addParamsToAction(AtomAction action) {
        LinkedHashMap linkedHashMap;
        View view;
        View rootView;
        RecyclerView composerRecyclerViewOrNull;
        RecyclerView.C findViewHolderForAdapterPosition;
        View view2;
        if (!(action instanceof AtomAction.Click)) {
            return action;
        }
        Pair<Integer, Integer> findPreviousScrollAnchor = findPreviousScrollAnchor();
        int intValue = findPreviousScrollAnchor.a().intValue();
        int intValue2 = findPreviousScrollAnchor.b().intValue();
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        int y11 = (c11 == null || (view = c11.getView()) == null || (rootView = view.getRootView()) == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(rootView)) == null || (findViewHolderForAdapterPosition = composerRecyclerViewOrNull.findViewHolderForAdapterPosition(intValue)) == null || (view2 = findViewHolderForAdapterPosition.itemView) == null) ? 0 : (int) view2.getY();
        AtomAction.Click click = (AtomAction.Click) action;
        Map<String, String> params = click.getParams();
        if (params != null) {
            linkedHashMap = U.u(params);
            linkedHashMap.put("widgetScrollId", String.valueOf(intValue2));
            linkedHashMap.put("widgetOffsetScroll", String.valueOf(y11));
        } else {
            linkedHashMap = null;
        }
        return AtomAction.Click.copy$default(click, null, null, null, linkedHashMap, null, null, 55, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$0(ControlsV3ViewHolder controlsV3ViewHolder, ControlsV3VO controlsV3VO, View view) {
        HandlersInhibitor.run$default(controlsV3ViewHolder.handlersInhibitor, 0L, new ControlsV3ViewHolder$bind$1$1$1(controlsV3ViewHolder, controlsV3VO), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(ControlsV3ViewHolder controlsV3ViewHolder, ControlsV3VO controlsV3VO, View view) {
        HandlersInhibitor.run$default(controlsV3ViewHolder.handlersInhibitor, 0L, new ControlsV3ViewHolder$bind$1$2$1(controlsV3ViewHolder, controlsV3VO), 1, null);
    }

    private final Pair<Integer, Integer> findPreviousScrollAnchor() {
        Integer num;
        View view;
        View rootView;
        RecyclerView composerRecyclerViewOrNull;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        RecyclerView.o layoutManager = (c11 == null || (view = c11.getView()) == null || (rootView = view.getRootView()) == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(rootView)) == null) ? null : composerRecyclerViewOrNull.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return new Pair<>(0, -1);
        }
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        loop0: while (true) {
            num = null;
            while (findLastVisibleItemPosition > 0 && num == null) {
                findLastVisibleItemPosition--;
                C8042d bindingAdapter = getBindingAdapter();
                l20.c b11 = bindingAdapter != null ? bindingAdapter.b(findLastVisibleItemPosition) : null;
                if (b11 != null) {
                    num = b11.getScrollWidgetKey();
                }
            }
        }
        return new Pair<>(Integer.valueOf(findLastVisibleItemPosition), Integer.valueOf(num != null ? num.intValue() : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processCheckBoxClick(ControlsV3VO item) {
        AtomAction action;
        ControlsV3View containerView = getContainerView();
        ControlsV3VO.SelectAll selectAll = item.getSelectAll();
        if ((selectAll != null ? selectAll.isSelected() : null) != null) {
            containerView.getCheckboxTv().setSelected(!containerView.getCheckboxTv().isSelected());
        }
        ControlsV3VO.SelectAll selectAll2 = item.getSelectAll();
        if (selectAll2 == null || (action = selectAll2.getAction()) == null) {
            return;
        }
        if (action instanceof AtomAction.Refresh) {
            String link = ((AtomAction.Refresh) action).getLink();
            if (link != null) {
                ScrollUtilsKt.refreshWithScroll(this.refs, link);
                return;
            }
            return;
        }
        this.actionHandler.invoke(action);
        if (this.asyncCartViewModel.isEnabled()) {
            C10727i.c(K.a(this), C10720e0.a(), null, new ControlsV3ViewHolder$processCheckBoxClick$1$2(item, this, null), 2);
        }
    }

    private final void setDisabledStyle(IconButtonV3View iconButtonV3View, boolean z11) {
        iconButtonV3View.setAlpha(z11 ? 0.4f : 1.0f);
        iconButtonV3View.setHoverDisabled(z11);
    }

    @NotNull
    public ControlsV3View getContainerView() {
        return this.containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ControlsV3VO item, @NotNull d info) {
        CheckBoxDTO checkbox;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.lockableActionHandler.setLocked(item.getLockButtons());
        ControlsV3View containerView = getContainerView();
        containerView.bind(item, this.lockableActionHandler, this.cartProductSelectMode, this.appType == AppType.SELECT);
        AppCompatTextView checkboxTv = containerView.getCheckboxTv();
        ControlsV3VO.SelectAll selectAll = item.getSelectAll();
        checkboxTv.setEnabled(((selectAll == null || (checkbox = selectAll.getCheckbox()) == null) ? null : checkbox.getState()) != CheckBoxDTO.CheckboxState.DISABLED);
        containerView.getCheckboxTv().setOnClickListener(new ViewOnClickListenerC2883a(1, this, item));
        containerView.getCheckbox().setOnCheckedChangeListener(null);
        containerView.getCheckbox().setOnClickListener(new ViewOnClickListenerC2972a(0, this, item));
        if (item.getRemoveIconButton() != null) {
            setDisabledStyle(getContainerView().getRemoveIconButton(), item.getLockButtons());
        }
        if (item.getShareIconButton() != null) {
            setDisabledStyle(getContainerView().getShareIconButton(), item.getLockButtons());
        }
    }
}
