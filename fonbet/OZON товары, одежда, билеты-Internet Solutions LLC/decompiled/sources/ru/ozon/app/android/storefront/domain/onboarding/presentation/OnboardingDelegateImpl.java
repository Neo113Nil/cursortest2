package ru.ozon.app.android.storefront.domain.onboarding.presentation;

import FY.e;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import jk0.l;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.layoutManager.scroll.ScrollExtKt;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingResolver;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingDelegateImpl;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog.OnboardingBannerView;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog.OnboardingDialog;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog.OnboardingDialogCutConfig;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog.OnboardingResultState;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.cell.ImageTitleSubtitleCellDTO;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 `2\u00020\u0001:\u0001`B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0002\b\u00030\u0006j\u0006\u0012\u0002\b\u0003`\u0007¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u000f2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020 *\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020 *\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010\u0016J\u000f\u0010%\u001a\u00020 H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010\u0017\u001a\u00020\u000f*\u00020'H\u0002¢\u0006\u0004\b\u0017\u0010(J\u000f\u0010)\u001a\u00020\u0018H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\u000f*\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u0013\u0010\u0017\u001a\u00020\u000f*\u00020+H\u0002¢\u0006\u0004\b\u0017\u0010-J\u0015\u0010/\u001a\u0004\u0018\u00010.*\u00020\u0004H\u0002¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R \u0010\b\u001a\u000e\u0012\u0002\b\u00030\u0006j\u0006\u0012\u0002\b\u0003`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R0\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u001fR\u0016\u00109\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001d\u0010E\u001a\u0004\u0018\u00010@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001d\u0010I\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010HR\u001b\u0010L\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010B\u001a\u0004\bK\u0010&R\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010P\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u00102R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010QR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010RR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020Z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010&¨\u0006a"}, d2 = {"Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingDelegateImpl;", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingDelegate;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Landroid/view/View;", "recyclerItemView", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/View;Lru/ozon/composer/ui/widget/k;)V", "view", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingCutConfig;", "onboardingCutConfig", "Lkotlin/Function0;", "", "onCropAreaClick", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "onboardingModel", "bind", "(Landroid/view/View;Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingCutConfig;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;)V", "unbind", "()V", "showOnboarding", "", "isShown", "onShownOnboarding", "(Z)V", "Lkotlin/Function1;", "isNoUiWidget", "handleWidget", "(Lkotlin/jvm/functions/Function1;)V", "", "getHeightPxLocation", "(Landroid/view/View;)I", "getLeftPxLocation", "startFindViewJob", "measureBannerView", "()I", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroidx/recyclerview/widget/RecyclerView;)V", "isViewInAcceptableRange", "()Z", "Landroidx/fragment/app/G;", "setupFragmentResultListener", "(Landroidx/fragment/app/G;)V", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialogCutConfig;", "createOnboardingValues", "(Landroid/view/View;)Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialogCutConfig;", "Lru/ozon/app/android/composer/ComposerReferences;", "Landroid/view/View;", "Lru/ozon/composer/ui/widget/k;", "onShownListener", "Lkotlin/jvm/functions/Function1;", "getOnShownListener", "()Lkotlin/jvm/functions/Function1;", "setOnShownListener", "fragmentManager", "Landroidx/fragment/app/G;", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialog;", "onBoardingDialog", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialog;", "windowHeight", "I", "Landroid/view/ViewGroup;", "rootView$delegate", "LSc/j;", "getRootView", "()Landroid/view/ViewGroup;", "rootView", "composerRv$delegate", "getComposerRv", "()Landroidx/recyclerview/widget/RecyclerView;", "composerRv", "statusBarHeight$delegate", "getStatusBarHeight", "statusBarHeight", "Lxe/B0;", "visibleItemJob", "Lxe/B0;", "targetView", "Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingCutConfig;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "Lxe/J;", "exceptionHandler", "Lxe/J;", "Landroid/view/View$OnLayoutChangeListener;", "itemViewLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Ljk0/l;", "getOverlapInfo", "()Ljk0/l;", "overlapInfo", "getBottomOffset", "bottomOffset", "Companion", "onboarding_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnboardingDelegateImpl implements OnboardingDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* renamed from: composerRv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j composerRv;

    @NotNull
    private final J exceptionHandler;
    private final G fragmentManager;

    @NotNull
    private final View.OnLayoutChangeListener itemViewLayoutChangeListener;
    private OnboardingDialog onBoardingDialog;
    private Function0<Unit> onCropAreaClick;
    private Function1<? super Boolean, Unit> onShownListener;
    private OnboardingCutConfig onboardingCutConfig;
    private OnboardingModel onboardingModel;
    private final View recyclerItemView;

    @NotNull
    private final ComposerReferences refs;

    /* renamed from: rootView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rootView;

    /* renamed from: statusBarHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j statusBarHeight;
    private View targetView;
    private B0 visibleItemJob;

    @NotNull
    private final k<?> widgetViewHolder;
    private final int windowHeight;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/domain/onboarding/presentation/OnboardingDelegateImpl$Companion;", "", "<init>", "()V", "COMPLETELY_VISIBLE_VIEW_PERCENT", "", "onboarding_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OnboardingDelegateImpl(@NotNull ComposerReferences refs, View view, @NotNull k<?> widgetViewHolder) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        this.refs = refs;
        this.recyclerItemView = view;
        this.widgetViewHolder = widgetViewHolder;
        r a11 = refs.getContainer().a();
        this.fragmentManager = a11 != null ? a11.getSupportFragmentManager() : null;
        r a12 = refs.getContainer().a();
        this.windowHeight = (a12 == null || (resources = a12.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0 : displayMetrics.heightPixels;
        this.rootView = LazyUtilsKt.unsafeLazy(new OnboardingDelegateImpl$rootView$2(this));
        this.composerRv = LazyUtilsKt.unsafeLazy(new OnboardingDelegateImpl$composerRv$2(this));
        this.statusBarHeight = LazyUtilsKt.unsafeLazy(new OnboardingDelegateImpl$statusBarHeight$2(this));
        this.exceptionHandler = new OnboardingDelegateImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.itemViewLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: VJ.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                OnboardingDelegateImpl.itemViewLayoutChangeListener$lambda$2(OnboardingDelegateImpl.this, view2, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        widgetViewHolder.getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingDelegateImpl.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(androidx.lifecycle.J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onDestroy(owner);
                OnboardingDelegateImpl.this.unbind();
                OnboardingDelegateImpl.this.widgetViewHolder.getLifecycle().e(this);
            }
        });
    }

    private final OnboardingDialogCutConfig createOnboardingValues(View view) {
        int heightPxLocation = getHeightPxLocation(view);
        int leftPxLocation = getLeftPxLocation(view);
        OnboardingCutConfig onboardingCutConfig = this.onboardingCutConfig;
        if (onboardingCutConfig == null) {
            return null;
        }
        return new OnboardingDialogCutConfig(leftPxLocation, heightPxLocation, view.getWidth() + leftPxLocation, view.getHeight() + heightPxLocation, onboardingCutConfig.getViewCornerRadius(), onboardingCutConfig.getBackgroundCornerRadius(), onboardingCutConfig.getBackgroundPadding());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBottomOffset() {
        int i11 = getOverlapInfo().f().bottom - getOverlapInfo().e().bottom;
        if (i11 < 0) {
            return 0;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getComposerRv() {
        return (RecyclerView) this.composerRv.getValue();
    }

    private final int getHeightPxLocation(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[1] - getStatusBarHeight();
    }

    private final int getLeftPxLocation(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[0];
    }

    private final l getOverlapInfo() {
        return this.widgetViewHolder.getViewHolderPositionInfo().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup getRootView() {
        return (ViewGroup) this.rootView.getValue();
    }

    private final int getStatusBarHeight() {
        return ((Number) this.statusBarHeight.getValue()).intValue();
    }

    private final void handleWidget(Function1<? super Boolean, Unit> isNoUiWidget) {
        if (this.recyclerItemView == null) {
            isNoUiWidget.invoke(Boolean.TRUE);
            return;
        }
        try {
            RecyclerView composerRv = getComposerRv();
            if (composerRv != null) {
                composerRv.getChildViewHolder(this.recyclerItemView);
            }
            isNoUiWidget.invoke(Boolean.FALSE);
        } catch (Throwable unused) {
            isNoUiWidget.invoke(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isViewInAcceptableRange() {
        q viewHolderPositionInfo = this.widgetViewHolder.getViewHolderPositionInfo();
        View itemView = this.widgetViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return o.a(itemView, viewHolderPositionInfo, false) >= 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void itemViewLayoutChangeListener$lambda$2(OnboardingDelegateImpl onboardingDelegateImpl, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        OnboardingDialogCutConfig createOnboardingValues;
        OnboardingDialog onboardingDialog;
        View view2 = onboardingDelegateImpl.targetView;
        if (view2 == null || (createOnboardingValues = onboardingDelegateImpl.createOnboardingValues(view2)) == null || (onboardingDialog = onboardingDelegateImpl.onBoardingDialog) == null) {
            return;
        }
        onboardingDialog.updateVerticalConfig(createOnboardingValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int measureBannerView() {
        Context context;
        ViewGroup rootView = getRootView();
        if (rootView == null || (context = rootView.getContext()) == null) {
            return 0;
        }
        OnboardingBannerView onboardingBannerView = new OnboardingBannerView(context, null, 0, 6, null);
        OnboardingModel onboardingModel = this.onboardingModel;
        if (onboardingModel == null) {
            return 0;
        }
        OnboardingBannerView.bind$default(onboardingBannerView, OnboardingModel.copy$default(onboardingModel, ImageTitleSubtitleCellDTO.copy$default(onboardingModel.getBanner(), null, null, null, null, null, null, 47, null), null, null, null, 14, null), null, 2, null);
        int i11 = onboardingBannerView.getContext().getResources().getDisplayMetrics().widthPixels;
        ViewGroup.LayoutParams layoutParams = onboardingBannerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i12 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = onboardingBannerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        onboardingBannerView.measure(View.MeasureSpec.makeMeasureSpec(i11 - (i12 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return onboardingBannerView.getMeasuredHeight();
    }

    private final void onShownOnboarding(boolean isShown) {
        RecyclerView composerRv = getComposerRv();
        if (composerRv != null) {
            ScrollExtKt.scrollEnable(composerRv, true);
        }
        Function1<Boolean, Unit> onShownListener = getOnShownListener();
        if (onShownListener != null) {
            onShownListener.invoke(Boolean.valueOf(isShown));
        }
    }

    private final void setupFragmentResultListener(G g10) {
        g10.n1("OnboardingResultFragment", this.widgetViewHolder, new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupFragmentResultListener$lambda$5(OnboardingDelegateImpl onboardingDelegateImpl, String str, Bundle bundle) {
        OnboardingResultState onboardingResultState;
        Object parcelable;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundle.getParcelable("onBoardingState", OnboardingResultState.class);
            onboardingResultState = (OnboardingResultState) parcelable;
        } else {
            onboardingResultState = (OnboardingResultState) bundle.getParcelable("onBoardingState");
        }
        if (onboardingResultState == null) {
            return;
        }
        if (onboardingResultState instanceof OnboardingResultState.Shown) {
            onboardingDelegateImpl.onShownOnboarding(((OnboardingResultState.Shown) onboardingResultState).getIsShown());
            return;
        }
        if (!(onboardingResultState instanceof OnboardingResultState.Tap)) {
            throw new Sc.o();
        }
        Function0<Unit> function0 = onboardingDelegateImpl.onCropAreaClick;
        if (function0 != null) {
            function0.invoke();
        } else {
            View view = onboardingDelegateImpl.targetView;
            if (view != null) {
                OnboardingResultState.Tap tap = (OnboardingResultState.Tap) onboardingResultState;
                ViewExtKt.onTapEvent(view, tap.getX(), tap.getY());
            }
        }
        RecyclerView composerRv = onboardingDelegateImpl.getComposerRv();
        if (composerRv != null) {
            ScrollExtKt.scrollEnable(composerRv, true);
        }
    }

    private final void showOnboarding() {
        handleWidget(new OnboardingDelegateImpl$showOnboarding$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startFindViewJob() {
        B0 b02 = this.visibleItemJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.visibleItemJob = C10727i.c(K.a(this.widgetViewHolder), this.exceptionHandler.plus(C10720e0.a()), null, new OnboardingDelegateImpl$startFindViewJob$1(this, null), 2);
    }

    @Override // ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingDelegate
    public void bind(@NotNull View view, @NotNull OnboardingCutConfig onboardingCutConfig, Function0<Unit> onCropAreaClick, OnboardingModel onboardingModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onboardingCutConfig, "onboardingCutConfig");
        this.targetView = view;
        this.onboardingCutConfig = onboardingCutConfig;
        this.onCropAreaClick = onCropAreaClick;
        this.onboardingModel = onboardingModel;
        showOnboarding();
    }

    public Function1<Boolean, Unit> getOnShownListener() {
        return this.onShownListener;
    }

    public void setOnShownListener(Function1<? super Boolean, Unit> function1) {
        this.onShownListener = function1;
    }

    @Override // ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingDelegate
    public void unbind() {
        OnboardingDialog onboardingDialog;
        this.targetView = null;
        OnboardingDialog onboardingDialog2 = this.onBoardingDialog;
        if (onboardingDialog2 != null && onboardingDialog2.isAdded() && (onboardingDialog = this.onBoardingDialog) != null) {
            onboardingDialog.dismiss();
        }
        this.onBoardingDialog = null;
        B0 b02 = this.visibleItemJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.visibleItemJob = null;
        CommonOnboardingResolver.INSTANCE.onStopShow();
        View view = this.recyclerItemView;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.itemViewLayoutChangeListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOnboarding(RecyclerView recyclerView) {
        View view = this.recyclerItemView;
        if (view != null) {
            view.addOnLayoutChangeListener(this.itemViewLayoutChangeListener);
        }
        ScrollExtKt.scrollEnable(recyclerView, false);
        recyclerView.stopScroll();
        if (!isViewInAcceptableRange()) {
            CommonOnboardingResolver.INSTANCE.onStopShow();
            ScrollExtKt.scrollEnable(recyclerView, true);
            return;
        }
        G g10 = this.fragmentManager;
        if (g10 != null) {
            setupFragmentResultListener(g10);
            showOnboarding(g10);
        }
    }

    private final void showOnboarding(G g10) {
        View view;
        OnboardingDialogCutConfig createOnboardingValues;
        OnboardingModel onboardingModel = this.onboardingModel;
        if (onboardingModel == null || (view = this.targetView) == null || (createOnboardingValues = createOnboardingValues(view)) == null) {
            return;
        }
        OnboardingDialog newInstance = OnboardingDialog.INSTANCE.newInstance(createOnboardingValues, onboardingModel);
        newInstance.show(g10, "OnboardingDialog");
        this.onBoardingDialog = newInstance;
    }
}
