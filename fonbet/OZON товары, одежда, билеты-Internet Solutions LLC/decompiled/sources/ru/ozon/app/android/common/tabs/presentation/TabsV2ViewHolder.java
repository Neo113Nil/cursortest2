package ru.ozon.app.android.common.tabs.presentation;

import A00.a;
import P4.f;
import Vg.c;
import android.view.View;
import android.view.ViewGroup;
import i10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.common.actionHandlers.SetCookieAndRefreshHandler;
import ru.ozon.app.android.common.tabs.core.TabsV2ViewModel;
import ru.ozon.app.android.common.tabs.presentation.TabsV2VO;
import ru.ozon.app.android.common.tabs.presentation.onboarding.TabsOnBoardingViewModel;
import ru.ozon.app.android.common.ui.tabs.databinding.TabsV2Binding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateExtKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.tabs.TabsView;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.tabs.TabAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.v3.holders.tabs.TabHolderKt;
import ru.ozon.uni.atoms.v3.holders.tabs.TabsHolderKt;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u0000 L2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001LB;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J)\u0010'\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J5\u0010/\u001a\u00020\u0017*\u00020,2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0017\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u0004\u0018\u00010#*\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u0004\u0018\u00010#*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b3\u00104J#\u00109\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u00022\n\u00108\u001a\u000606j\u0002`7H\u0014¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010?R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00170-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lru/ozon/app/android/common/tabs/presentation/TabsV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/tabs/presentation/TabsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/common/tabs/presentation/onboarding/TabsOnBoardingViewModel;", "viewModel", "Lru/ozon/app/android/common/actionHandlers/SetCookieAndRefreshHandler;", "setCookieAndRefreshHandler", "Lru/ozon/app/android/common/tabs/core/TabsV2ViewModel;", "tabsViewModel", "<init>", "(Landroid/view/View;LVg/c;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/common/tabs/presentation/onboarding/TabsOnBoardingViewModel;Lru/ozon/app/android/common/actionHandlers/SetCookieAndRefreshHandler;Lru/ozon/app/android/common/tabs/core/TabsV2ViewModel;)V", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "dsTabs", "Lru/ozon/app/android/common/tabs/presentation/TabsV2VO$OnBoardingVO;", "onBoarding", "", "bindDsTabsOrGone", "(Lru/ozon/uni/atoms/data/tabs/TabsDTO;Lru/ozon/app/android/common/tabs/presentation/TabsV2VO$OnBoardingVO;)V", "Lru/ozon/uni/atoms/data/tabs/Tabs;", DynamicElementDTO.TABS, "bindTabsOrGone", "(Lru/ozon/uni/atoms/data/tabs/Tabs;Lru/ozon/app/android/common/tabs/presentation/TabsV2VO$OnBoardingVO;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "onActionClick", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "onboarding", "Lru/ozon/uni/atoms/af/AtomAction;", "targetTabAction", "", "tabsSize", "bindOnboarding", "(Lru/ozon/app/android/common/tabs/presentation/TabsV2VO$OnBoardingVO;Lru/ozon/uni/atoms/af/AtomAction;I)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "initDelegate", "(Lru/ozon/app/android/common/tabs/presentation/onboarding/TabsOnBoardingViewModel;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "Lru/ozon/uni/android/uikit/view/atoms/tabs/TabAtomView;", "Lkotlin/Function1;", "onAction", "bindOrGone", "(Lru/ozon/uni/android/uikit/view/atoms/tabs/TabAtomView;Lru/ozon/uni/atoms/data/tabs/Tabs;Lkotlin/jvm/functions/Function1;)V", "getTargetTabAtomAction", "(Lru/ozon/uni/atoms/data/tabs/Tabs;Lru/ozon/app/android/common/tabs/presentation/TabsV2VO$OnBoardingVO;)Lru/ozon/uni/atoms/af/AtomAction;", "getTargetDsTabAtomAction", "(Lru/ozon/uni/atoms/data/tabs/TabsDTO;Lru/ozon/app/android/common/tabs/presentation/TabsV2VO$OnBoardingVO;)Lru/ozon/uni/atoms/af/AtomAction;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/tabs/presentation/TabsV2VO;Ll20/d;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/common/tabs/presentation/onboarding/TabsOnBoardingViewModel;", "Lru/ozon/app/android/common/actionHandlers/SetCookieAndRefreshHandler;", "Lru/ozon/app/android/common/tabs/core/TabsV2ViewModel;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Lru/ozon/app/android/common/ui/tabs/databinding/TabsV2Binding;", "binding", "Lru/ozon/app/android/common/ui/tabs/databinding/TabsV2Binding;", "", "getOnboardingCornerRadius", "()F", "onboardingCornerRadius", "Companion", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabsV2ViewHolder extends k<TabsV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TabsV2Binding binding;

    @NotNull
    private final View containerView;
    private OnBoardingDelegate onBoardingDelegate;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SetCookieAndRefreshHandler setCookieAndRefreshHandler;

    @NotNull
    private final TabsV2ViewModel tabsViewModel;

    @NotNull
    private final TabsOnBoardingViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int TABS_DEFAULT_MARGIN = UiExtKt.toPx(16);
    private static final float ONBOARDING_RADIUS = UiExtKt.toPxF(CornerRadius.RADIUS_600.getPx());
    private static final float ONBOARDING_ROUNDED_RADIUS = UiExtKt.toPxF(CornerRadius.RADIUS_500.getPx());
    private static final int ONBOARDING_HORIZONTAL_MARGIN = UiExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a;", "kotlin.jvm.PlatformType", "event", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.common.tabs.presentation.TabsV2ViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<a, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
            invoke2(aVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(a aVar) {
            if (aVar instanceof a.C2370k) {
                TabsV2ViewHolder.this.tabsViewModel.checkTabCookie();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/common/tabs/presentation/TabsV2ViewHolder$Companion;", "", "<init>", "()V", "", "ONBOARDING_HORIZONTAL_MARGIN", "I", "getONBOARDING_HORIZONTAL_MARGIN", "()I", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getONBOARDING_HORIZONTAL_MARGIN() {
            return TabsV2ViewHolder.ONBOARDING_HORIZONTAL_MARGIN;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsV2ViewHolder(@NotNull View containerView, @NotNull c customActionHandlersStore, @NotNull ComposerReferences refs, @NotNull TabsOnBoardingViewModel viewModel, @NotNull SetCookieAndRefreshHandler setCookieAndRefreshHandler, @NotNull TabsV2ViewModel tabsViewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(setCookieAndRefreshHandler, "setCookieAndRefreshHandler");
        Intrinsics.checkNotNullParameter(tabsViewModel, "tabsViewModel");
        this.containerView = containerView;
        this.refs = refs;
        this.viewModel = viewModel;
        this.setCookieAndRefreshHandler = setCookieAndRefreshHandler;
        this.tabsViewModel = tabsViewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new TabsV2ViewHolder$actionHandler$1(this)).onPreProcess(new TabsV2ViewHolder$actionHandler$2(this)).customActionHandlers(new TabsV2ViewHolder$actionHandler$3(customActionHandlersStore)).buildHandler();
        TabsV2Binding bind = TabsV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.getConstraintLayout().setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
        refs.getController().getEvents().observe(this, new TabsV2ViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
    }

    private final void bindDsTabsOrGone(TabsDTO dsTabs, TabsV2VO.OnBoardingVO onBoarding) {
        TabsView dsTabs2 = this.binding.dsTabs;
        Intrinsics.checkNotNullExpressionValue(dsTabs2, "dsTabs");
        TabsHolderKt.bindOrGone(dsTabs2, dsTabs, this.actionHandler);
        TabAtomView tabs = this.binding.tabs;
        Intrinsics.checkNotNullExpressionValue(tabs, "tabs");
        ViewExtKt.gone(tabs);
        if (onBoarding != null) {
            bindOnboarding(onBoarding, getTargetDsTabAtomAction(dsTabs, onBoarding), dsTabs.getTabs().size());
        }
    }

    private final void bindOnboarding(TabsV2VO.OnBoardingVO onboarding, AtomAction targetTabAction, int tabsSize) {
        View view = this.containerView;
        OnBoardingDelegateExtKt.checkForBindDelegate(this.refs.getContainer(), "tab_on_boarding_is_shown", this.viewModel, view, new TabsV2ViewHolder$bindOnboarding$1$1(this, onboarding, view, tabsSize, targetTabAction));
    }

    private final void bindOrGone(TabAtomView tabAtomView, Tabs tabs, Function1<? super AtomAction, Unit> function1) {
        if (tabs == null) {
            tabAtomView.setVisibility(8);
        } else {
            tabAtomView.setVisibility(0);
            TabHolderKt.bind(tabAtomView, tabs, function1);
        }
    }

    private final void bindTabsOrGone(Tabs tabs, TabsV2VO.OnBoardingVO onBoarding) {
        TabsView dsTabs = this.binding.dsTabs;
        Intrinsics.checkNotNullExpressionValue(dsTabs, "dsTabs");
        ViewExtKt.gone(dsTabs);
        TabAtomView tabs2 = this.binding.tabs;
        Intrinsics.checkNotNullExpressionValue(tabs2, "tabs");
        bindOrGone(tabs2, tabs, this.actionHandler);
        if (tabs == null) {
            return;
        }
        int i11 = tabs.getDisableDefaultHorizontalMargins() ? 0 : TABS_DEFAULT_MARGIN;
        TabAtomView tabs3 = this.binding.tabs;
        Intrinsics.checkNotNullExpressionValue(tabs3, "tabs");
        ViewGroup.LayoutParams layoutParams = tabs3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(i11, 0, i11, 0);
        tabs3.setLayoutParams(marginLayoutParams);
        if (onBoarding != null) {
            bindOnboarding(onBoarding, getTargetTabAtomAction(tabs, onBoarding), tabs.getTabItems().size());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getOnboardingCornerRadius() {
        return UniGlobalConfigKt.getRoundCornersFlag(getContext()) ? ONBOARDING_RADIUS : ONBOARDING_ROUNDED_RADIUS;
    }

    private final AtomAction getTargetDsTabAtomAction(TabsDTO tabsDTO, TabsV2VO.OnBoardingVO onBoardingVO) {
        AtomActionDTO action;
        TabsDTO.TabDTO tabDTO = tabsDTO.getTabs().get(onBoardingVO.getTabPosition());
        CommonControlSettings common = tabDTO.getCommon();
        if (common == null || (action = common.getAction()) == null) {
            return null;
        }
        CommonControlSettings common2 = tabDTO.getCommon();
        return AtomActionMapperKt.toAtomAction(action, common2 != null ? common2.getTrackingInfo() : null);
    }

    private final AtomAction getTargetTabAtomAction(Tabs tabs, TabsV2VO.OnBoardingVO onBoardingVO) {
        Tabs.TabsItem tabsItem = tabs.getTabItems().get(onBoardingVO.getTabPosition());
        AtomActionDTO action = tabsItem.getAction();
        if (action != null) {
            return AtomActionMapperKt.toAtomAction(action, tabsItem.getTrackingInfo());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(TabsOnBoardingViewModel viewModel, OnBoardingDTO onboarding) {
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl("tab_on_boarding_is_shown", this.refs, this.containerView, onboarding, this, viewModel, null, 0.0f, 192, null);
        onBoardingDelegateImpl.setOnShownListener(new TabsV2ViewHolder$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActionClick(AtomAction.Click action) {
        String b11 = f.b("toString(...)");
        TabsV2VO boundedData = getBoundedData();
        Integer scrollWidgetKey = boundedData != null ? boundedData.getScrollWidgetKey() : null;
        h.b bVar = scrollWidgetKey != null ? new h.b(new a.C.d(scrollWidgetKey.intValue(), (int) this.itemView.getY(), 24, false), null, 2) : null;
        this.tabsViewModel.onTabChanged(action.getParams());
        this.setCookieAndRefreshHandler.handleAction(action.getId(), action.getParams(), action.getLink(), bVar, b11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TabsV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getDsTabs() != null) {
            bindDsTabsOrGone(item.getDsTabs(), item.getOnBoarding());
        } else {
            bindTabsOrGone(item.getTabs(), item.getOnBoarding());
        }
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor());
        if (parseColor != null) {
            this.binding.getConstraintLayout().setBackgroundColor(parseColor.intValue());
        }
    }
}
