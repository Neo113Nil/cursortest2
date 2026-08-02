package ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation;

import WZ.l;
import WZ.t;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5423j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.T;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.storefront.ui.navslider.databinding.WidgetNavigationSliderV2LayoutBinding;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;
import ru.ozon.app.android.tools.ItemAdapterCallback;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 H2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001HB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\u0014J\u000f\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u0014J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u0014J#\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00022\n\u0010'\u001a\u00060%j\u0002`&H\u0014¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0012¢\u0006\u0004\b*\u0010\u0014J\u0011\u0010,\u001a\u00020\u0012*\u00020+¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\u0002088\u0004X\u0084\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010?\u001a\b\u0012\u0004\u0012\u00020>0=8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00120C8&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2BaseWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Landroidx/fragment/app/r;", "activity", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2OnBoardingViewModel;", "onBoardingViewModel", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Landroidx/fragment/app/r;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2OnBoardingViewModel;LWZ/l;)V", "", "observeRefresh", "()V", "showOnboardingIfExist", "", "hasOpenedDialogFragment", "()Z", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoarding", "initDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "", "position", "getOnboardingView", "(I)Landroid/view/View;", "onAttach", "onRecycle", "onDetach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO;Ll20/d;)V", "restoreScroll", "Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerViewSettings", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2OnBoardingViewModel;", "LWZ/l;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onboardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Landroid/os/Handler;", "navsliderHandler", "Landroid/os/Handler;", "Lru/ozon/app/android/storefront/ui/navslider/databinding/WidgetNavigationSliderV2LayoutBinding;", "binding", "Lru/ozon/app/android/storefront/ui/navslider/databinding/WidgetNavigationSliderV2LayoutBinding;", "getBinding", "()Lru/ozon/app/android/storefront/ui/navslider/databinding/WidgetNavigationSliderV2LayoutBinding;", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;", "adapterCallback", "Lru/ozon/app/android/tools/ItemAdapterCallback;", "getAdapterCallback", "()Lru/ozon/app/android/tools/ItemAdapterCallback;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class NavigationSliderV2BaseWidgetViewHolder extends k<NavigationSliderV2VO> {

    @NotNull
    private final ItemAdapterCallback<NavigationSliderV2VO.NavigationItemV2> adapterCallback;

    @NotNull
    private final WidgetNavigationSliderV2LayoutBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final View containerView;

    @NotNull
    private final Handler navsliderHandler;

    @NotNull
    private final NavigationSliderV2OnBoardingViewModel onBoardingViewModel;
    private OnBoardingDelegate onboardingDelegate;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float ONBOARDING_CORNER_RADIUS = ResourceExtKt.toPxF(16);
    private static final int ONBOARDING_VERTICAL_MARGIN = -ResourceExtKt.toPx(6);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2BaseWidgetViewHolder$Companion;", "", "<init>", "()V", "ONBOARDING_CORNER_RADIUS", "", "getONBOARDING_CORNER_RADIUS", "()F", "ONBOARDING_VERTICAL_MARGIN", "", "getONBOARDING_VERTICAL_MARGIN", "()I", "ONBOARDING_WIDGET_KEY", "", "ONBOARDING_SHOW_DELAY", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getONBOARDING_CORNER_RADIUS() {
            return NavigationSliderV2BaseWidgetViewHolder.ONBOARDING_CORNER_RADIUS;
        }

        public final int getONBOARDING_VERTICAL_MARGIN() {
            return NavigationSliderV2BaseWidgetViewHolder.ONBOARDING_VERTICAL_MARGIN;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationSliderV2BaseWidgetViewHolder(@NotNull View containerView, @NotNull final AdultHandler adultHandler, @NotNull final r activity, @NotNull ComposerReferences composerReferences, @NotNull NavigationSliderV2OnBoardingViewModel onBoardingViewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.composerReferences = composerReferences;
        this.onBoardingViewModel = onBoardingViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.navsliderHandler = new Handler(Looper.getMainLooper());
        WidgetNavigationSliderV2LayoutBinding bind = WidgetNavigationSliderV2LayoutBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.adapterCallback = new ItemAdapterCallback<NavigationSliderV2VO.NavigationItemV2>() { // from class: ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2BaseWidgetViewHolder$adapterCallback$1
            @Override // ru.ozon.app.android.tools.ItemAdapterCallback
            public void click(int position, final NavigationSliderV2VO.NavigationItemV2 item) {
                if (item != null) {
                    AdultHandler adultHandler2 = adultHandler;
                    r rVar = activity;
                    final NavigationSliderV2BaseWidgetViewHolder navigationSliderV2BaseWidgetViewHolder = NavigationSliderV2BaseWidgetViewHolder.this;
                    boolean shouldBlur = item.getShouldBlur();
                    G supportFragmentManager = rVar.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    AdultHandler.DefaultImpls.showAdultDialog$default(adultHandler2, shouldBlur, supportFragmentManager, new AdultListener() { // from class: ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2BaseWidgetViewHolder$adapterCallback$1$click$1$1
                        @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                        public void onAdultAccept() {
                            NavigationSliderV2BaseWidgetViewHolder.this.getActionHandler().invoke(item.getAction());
                        }

                        @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                        public void onAdultReject() {
                            AdultListener.DefaultImpls.onAdultReject(this);
                        }
                    }, null, false, 24, null);
                }
            }

            @Override // ru.ozon.app.android.tools.ItemAdapterCallback
            public void view(int position, NavigationSliderV2VO.NavigationItemV2 item) {
                t tokenizedEvent;
                ComposerReferences composerReferences2;
                if (item == null || (tokenizedEvent = item.getTokenizedEvent()) == null) {
                    return;
                }
                composerReferences2 = NavigationSliderV2BaseWidgetViewHolder.this.composerReferences;
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(composerReferences2.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasOpenedDialogFragment() {
        G supportFragmentManager;
        List<ComponentCallbacksC5392m> r02;
        Object obj;
        r a11 = this.composerReferences.getContainer().a();
        if (a11 == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null || (r02 = supportFragmentManager.r0()) == null) {
            return false;
        }
        Iterator<T> it = r02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ComponentCallbacksC5392m) obj) instanceof DialogInterfaceOnCancelListenerC5390k) {
                break;
            }
        }
        ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) obj;
        if (componentCallbacksC5392m == null) {
            return false;
        }
        final AbstractC5434v lifecycle = componentCallbacksC5392m.getLifecycle();
        if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
            showOnboardingIfExist();
            return true;
        }
        lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2BaseWidgetViewHolder$hasOpenedDialogFragment$$inlined$whenDestroyed$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.showOnboardingIfExist();
                AbstractC5434v.this.e(this);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding) {
        if (this.onboardingDelegate != null || onBoarding == null) {
            return;
        }
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl("navsliderV2OnboardingKey", this.composerReferences, this.containerView, onBoarding, this, this.onBoardingViewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        onBoardingDelegateImpl.setOnShownListener(new NavigationSliderV2BaseWidgetViewHolder$initDelegate$1$1(this));
        this.onboardingDelegate = onBoardingDelegateImpl;
    }

    private final void observeRefresh() {
        C5423j events = this.composerReferences.getController().getEvents();
        T t2 = new T();
        t2.a(events, new NavigationSliderV2BaseWidgetViewHolder$inlined$sam$i$androidx_lifecycle_Observer$0(new NavigationSliderV2BaseWidgetViewHolder$observeRefresh$$inlined$filterIsInstance$1(t2)));
        t2.observe(this, new NavigationSliderV2BaseWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new NavigationSliderV2BaseWidgetViewHolder$observeRefresh$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOnboardingIfExist() {
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        String tag = c11 != null ? c11.getTag() : null;
        if (this.onboardingDelegate == null || tag == null) {
            return;
        }
        this.onBoardingViewModel.showIfNeed(tag, "navsliderV2OnboardingKey", new NavigationSliderV2BaseWidgetViewHolder$showOnboardingIfExist$1(this));
    }

    protected void bind(@NotNull NavigationSliderV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.itemsRv.setFocusableInTouchMode(false);
        initDelegate(item.getOnboarding());
        observeRefresh();
        showOnboardingIfExist();
    }

    @NotNull
    public abstract Function1<AtomAction, Unit> getActionHandler();

    @NotNull
    protected final ItemAdapterCallback<NavigationSliderV2VO.NavigationItemV2> getAdapterCallback() {
        return this.adapterCallback;
    }

    @NotNull
    protected final WidgetNavigationSliderV2LayoutBinding getBinding() {
        return this.binding;
    }

    public abstract View getOnboardingView(int position);

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        restoreScroll();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        String tag;
        super.onDetach();
        NavigationSliderV2VO boundedData = getBoundedData();
        if (boundedData != null) {
            RecyclerView.o layoutManager = this.binding.itemsRv.getLayoutManager();
            boundedData.setRecyclerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
        OnBoardingDelegate onBoardingDelegate = this.onboardingDelegate;
        if (onBoardingDelegate != null) {
            onBoardingDelegate.unbind();
        }
        this.onboardingDelegate = null;
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        if (c11 != null && (tag = c11.getTag()) != null) {
            this.onBoardingViewModel.removePageFromCache(tag);
        }
        this.navsliderHandler.removeCallbacksAndMessages(null);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        NavigationSliderV2VO boundedData = getBoundedData();
        if (boundedData != null) {
            RecyclerView.o layoutManager = this.binding.itemsRv.getLayoutManager();
            boundedData.setRecyclerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
    }

    public final void restoreScroll() {
        Parcelable recyclerState;
        NavigationSliderV2VO boundedData = getBoundedData();
        if (boundedData == null || (recyclerState = boundedData.getRecyclerState()) == null) {
            return;
        }
        RecyclerView.o layoutManager = this.binding.itemsRv.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.onRestoreInstanceState(recyclerState);
        }
        boundedData.setRecyclerState(null);
    }

    public final void setRecyclerViewSettings(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutAnimation(null);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addItemDecoration(new NavigationSliderV2Decoration());
        NavigationSliderV2LayoutManager navigationSliderV2LayoutManager = new NavigationSliderV2LayoutManager(this.containerView.getContext());
        navigationSliderV2LayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(navigationSliderV2LayoutManager);
    }
}
