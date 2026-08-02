package ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation;

import A00.a;
import Sc.InterfaceC4008j;
import Vg.c;
import WZ.l;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.C5423j;
import androidx.lifecycle.T;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.pdp.databinding.PdpWidgetPriceActionsBinding;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.ListItemsAdapterKt;
import ru.ozon.app.android.pdp.view.animationsaleblock.ObjectAnimation;
import ru.ozon.app.android.pdp.view.animationsaleblock.SaleBlockViewModel;
import ru.ozon.app.android.pdp.view.shared.HorizontalPanelSpaceItemDecoration;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.PriceActionsVO;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.recycler.PriceActionsLayoutManager;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.recycler.PriceActionsRecyclerAdapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001IBK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00132\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00192\u0006\u0010)\u001a\u00020$H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0019058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001b\u0010D\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010H¨\u0006J"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO;", "", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "saleBlockViewModel", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "", "isSelect", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LVg/c;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;Z)V", "Lru/ozon/app/android/pdp/databinding/PdpWidgetPriceActionsBinding;", "binding", "", "setupUi", "(Lru/ozon/app/android/pdp/databinding/PdpWidgetPriceActionsBinding;)V", "item", "bindInternal", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO;)V", "isVisible", "Lkotlin/Function0;", "launchAnimation", "visibilityStateAlert", "(ZLkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "view", "onOnboardingShow", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Landroid/view/View;)V", "onBoarding", "initDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/databinding/PdpWidgetPriceActionsBinding;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/recycler/PriceActionsRecyclerAdapter;", "actionsRecyclerAdapter", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/recycler/PriceActionsRecyclerAdapter;", "viewModelSaleBlock$delegate", "LSc/j;", "getViewModelSaleBlock", "()Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "viewModelSaleBlock", "", "delayAnimation", "Ljava/lang/Integer;", "Lkotlin/jvm/functions/Function0;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceActionsViewHolder extends k<PriceActionsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PriceActionsRecyclerAdapter actionsRecyclerAdapter;

    @NotNull
    private final PdpWidgetPriceActionsBinding binding;

    @NotNull
    private final View containerView;
    private Integer delayAnimation;
    private Function0<Unit> launchAnimation;
    private OnBoardingDelegate onBoardingDelegate;

    @NotNull
    private final BaseOnBoardingViewModel onBoardingViewModel;

    @NotNull
    private final ComposerReferences refs;

    /* renamed from: viewModelSaleBlock$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModelSaleBlock;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$u$c;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LA00/a$u$c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.PriceActionsViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<a.u.c, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a.u.c cVar) {
            invoke2(cVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(a.u.c cVar) {
            PriceActionsViewHolder.this.binding.priceActionsRv.scrollToPosition(0);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsViewHolder$Companion;", "", "<init>", "()V", "PRICE_ACTIONS_ONBOARDING_KEY", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceActionsViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull c customActionHandlersStore, @NotNull HandlersInhibitor inhibitor, @NotNull SaleBlockViewModel saleBlockViewModel, @NotNull BaseOnBoardingViewModel onBoardingViewModel, boolean z11) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(saleBlockViewModel, "saleBlockViewModel");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        this.containerView = containerView;
        this.refs = refs;
        this.onBoardingViewModel = onBoardingViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new PriceActionsViewHolder$actionHandler$1(customActionHandlersStore)).enableClickThrottling(inhibitor).configureBottomSheet(new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, SheetSoftInputMode.ADJUST_RESIZE, 0, false, false, false, false, false, false, 2038, null)).buildHandler();
        this.actionHandler = buildHandler;
        PdpWidgetPriceActionsBinding bind = PdpWidgetPriceActionsBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionsRecyclerAdapter = new PriceActionsRecyclerAdapter(this, new PriceActionsViewHolder$actionsRecyclerAdapter$1(this), new PriceActionsViewHolder$actionsRecyclerAdapter$2(tokenizedAnalytics), new PriceActionsViewHolder$actionsRecyclerAdapter$3(this), new PriceActionsViewHolder$actionsRecyclerAdapter$4(this), buildHandler, z11);
        this.viewModelSaleBlock = DelegatesKt.lazyUnsafe(new PriceActionsViewHolder$viewModelSaleBlock$2(this, saleBlockViewModel));
        setupUi(bind);
        C5423j events = refs.getController().getEvents();
        T t2 = new T();
        t2.a(events, new PriceActionsViewHolder$inlined$sam$i$androidx_lifecycle_Observer$0(new PriceActionsViewHolder$special$$inlined$filterIsInstance$1(t2)));
        t2.observe(refs.getContainer().g(), new PriceActionsViewHolderKt$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
    }

    private final void bindInternal(PriceActionsVO item) {
        long id2;
        this.binding.priceActionsRv.setBackgroundColor(ContextExtKt.parseColor(getContext(), item.getBackgroundColor()));
        PriceActionsRecyclerAdapter priceActionsRecyclerAdapter = this.actionsRecyclerAdapter;
        List<PriceActionsVO.Action> actions = item.getActions();
        ArrayList arrayList = new ArrayList(C7714v.z(actions, 10));
        for (PriceActionsVO.Action action : actions) {
            id2 = PriceActionsViewHolderKt.getId(action);
            arrayList.add(ListItemsAdapterKt.toListItem(action, Long.valueOf(id2)));
        }
        priceActionsRecyclerAdapter.submitList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SaleBlockViewModel getViewModelSaleBlock() {
        return (SaleBlockViewModel) this.viewModelSaleBlock.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding) {
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl("price_actions_on_boarding_is_shown", this.refs, this.binding.getConstraintLayout(), onBoarding, this, this.onBoardingViewModel, null, 0.0f, 192, null);
        onBoardingDelegateImpl.setOnShownListener(new PriceActionsViewHolder$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOnboardingShow(final OnBoardingDTO onboarding, final View view) {
        final RecyclerView recyclerView = this.binding.priceActionsRv;
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.PriceActionsViewHolder$onOnboardingShow$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ComposerReferences composerReferences;
                if (recyclerView.getMeasuredWidth() <= 0 || recyclerView.getMeasuredHeight() <= 0) {
                    return;
                }
                recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                composerReferences = this.refs;
                ComposerExtKt.withPageTag(composerReferences.getContainer(), new PriceActionsViewHolder$onOnboardingShow$1$1(this, onboarding, view));
            }
        });
    }

    private final void setupUi(PdpWidgetPriceActionsBinding binding) {
        int i11;
        int i12;
        RecyclerView recyclerView = binding.priceActionsRv;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.actionsRecyclerAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setLayoutManager(new PriceActionsLayoutManager(context));
        i11 = PriceActionsViewHolderKt.ITEM_SPACING_IN_BETWEEN_PX;
        i12 = PriceActionsViewHolderKt.ITEM_SPACING_FROM_EDGES_PX;
        recyclerView.addItemDecoration(new HorizontalPanelSpaceItemDecoration(i11, i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void visibilityStateAlert(boolean isVisible, Function0<Unit> launchAnimation) {
        this.launchAnimation = launchAnimation;
        if (!isVisible) {
            if (this.delayAnimation != null) {
                getViewModelSaleBlock().leftTheScreen(ObjectAnimation.PRICE_ACTION);
            }
        } else {
            Integer num = this.delayAnimation;
            if (num != null) {
                getViewModelSaleBlock().appearedOnScreen(ObjectAnimation.PRICE_ACTION, num.intValue());
            }
        }
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PriceActionsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindInternal(item);
        for (PriceActionsVO.Action action : item.getActions()) {
            if (action.getAnimationTimer() != null) {
                this.delayAnimation = Integer.valueOf(action.getAnimationTimer().intValue() / 1000);
            }
        }
    }
}
