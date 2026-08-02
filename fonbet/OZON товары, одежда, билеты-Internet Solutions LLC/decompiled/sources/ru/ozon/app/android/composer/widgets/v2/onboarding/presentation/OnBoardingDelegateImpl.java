package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import El.C2971a;
import Sc.InterfaceC4008j;
import WZ.l;
import WZ.t;
import WZ.x;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.layoutManager.scroll.ScrollExtKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingBannerView;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialog;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialogCutConfig;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.cell.ImageTitleSubtitleCellDTO;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 t2\u00020\u0001:\u0001tBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001b\u001a\u00020\u00192\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020\u00192\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00190$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0019H\u0002¢\u0006\u0004\b(\u0010\u001eJ\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010\u001f\u001a\u00020\u0019*\u00020,H\u0002¢\u0006\u0004\b\u001f\u0010-J\u0013\u0010\u001f\u001a\u00020\u0019*\u00020.H\u0002¢\u0006\u0004\b\u001f\u0010/J\u000f\u00100\u001a\u00020\u0019H\u0002¢\u0006\u0004\b0\u0010\u001eJ\u001b\u00101\u001a\u00020 2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0002¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\u00020 2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0002¢\u0006\u0004\b3\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00109R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010;R0\u0010<\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0019\u0018\u00010$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010'R*\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0016\u0010G\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001d\u0010S\u001a\u0004\u0018\u00010N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001d\u0010W\u001a\u0004\u0018\u00010,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010P\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010P\u001a\u0004\bY\u0010+R\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u001c\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010`R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010aR\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010BR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010n\u001a\u0004\u0018\u00010k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010+R\u0016\u0010s\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006u"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegateImpl;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "", "widgetKey", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Landroid/view/View;", "recyclerItemView", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoardingDto", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "viewModel", "LWZ/l;", "tokenizedAnalytics", "", "completelyVisibleViewPercent", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/View;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Landroidx/lifecycle/J;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;LWZ/l;F)V", "Lru/ozon/composer/ui/widget/k;", "viewHolder", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "onBoardingCutConfig", "Lkotlin/Function0;", "", "onCropAreaClick", "bind", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;Lkotlin/jvm/functions/Function0;)V", "unbind", "()V", "showOnboarding", "", "isShown", "onShownOnboarding", "(Z)V", "Lkotlin/Function1;", "isNoUiWidget", "handleWidget", "(Lkotlin/jvm/functions/Function1;)V", "startFindViewJob", "", "measureBannerView", "()I", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroidx/fragment/app/G;", "(Landroidx/fragment/app/G;)V", "trackOnboardingView", "isViewInAcceptableRange", "(Lru/ozon/composer/ui/widget/k;)Z", "isEnoughSpaceForOnboarding", "Ljava/lang/String;", "Lru/ozon/app/android/composer/ComposerReferences;", "Landroid/view/View;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "LWZ/l;", "F", "onShownListener", "Lkotlin/jvm/functions/Function1;", "getOnShownListener", "()Lkotlin/jvm/functions/Function1;", "setOnShownListener", "onUnbindListener", "Lkotlin/jvm/functions/Function0;", "getOnUnbindListener", "()Lkotlin/jvm/functions/Function0;", "setOnUnbindListener", "(Lkotlin/jvm/functions/Function0;)V", "fragmentManager", "Landroidx/fragment/app/G;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialog;", "onBoardingDialog", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialog;", "windowHeight", "I", "Landroid/view/ViewGroup;", "rootView$delegate", "LSc/j;", "getRootView", "()Landroid/view/ViewGroup;", "rootView", "composerRv$delegate", "getComposerRv", "()Landroidx/recyclerview/widget/RecyclerView;", "composerRv", "statusBarHeight$delegate", "getStatusBarHeight", "statusBarHeight", "Lxe/B0;", "visibleItemJob", "Lxe/B0;", "isFindView", "Z", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "Lxe/J;", "exceptionHandler", "Lxe/J;", "Landroid/view/View$OnLayoutChangeListener;", "itemViewLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BottomSheetVisibilityObserver;", "bottomSheetObserver", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BottomSheetVisibilityObserver;", "Ljk0/l;", "getOverlapInfo", "()Ljk0/l;", "overlapInfo", "getBottomOffset", "bottomOffset", "getTargetView", "()Landroid/view/View;", "targetView", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OnBoardingDelegateImpl implements OnBoardingDelegate {

    @NotNull
    private final BottomSheetVisibilityObserver bottomSheetObserver;
    private final float completelyVisibleViewPercent;

    /* renamed from: composerRv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j composerRv;

    @NotNull
    private final J exceptionHandler;
    private final G fragmentManager;
    private boolean isFindView;

    @NotNull
    private final View.OnLayoutChangeListener itemViewLayoutChangeListener;

    @NotNull
    private final androidx.lifecycle.J lifecycleOwner;
    private OnBoardingCutConfig onBoardingCutConfig;
    private OnBoardingDialog onBoardingDialog;

    @NotNull
    private final OnBoardingDTO onBoardingDto;
    private Function0<Unit> onCropAreaClick;
    private Function1<? super Boolean, Unit> onShownListener;
    private Function0<Unit> onUnbindListener;
    private final View recyclerItemView;

    @NotNull
    private final ComposerReferences refs;

    /* renamed from: rootView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rootView;

    /* renamed from: statusBarHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j statusBarHeight;
    private final l tokenizedAnalytics;
    private k<?> viewHolder;

    @NotNull
    private final BaseOnBoardingViewModel viewModel;
    private B0 visibleItemJob;

    @NotNull
    private final String widgetKey;
    private final int windowHeight;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegateImpl$Companion;", "", "<init>", "()V", "COMPLETELY_VISIBLE_VIEW_PERCENT", "", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OnBoardingDelegateImpl(@NotNull String widgetKey, @NotNull ComposerReferences refs, View view, @NotNull OnBoardingDTO onBoardingDto, @NotNull androidx.lifecycle.J lifecycleOwner, @NotNull BaseOnBoardingViewModel viewModel, l lVar, float f7) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(onBoardingDto, "onBoardingDto");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.widgetKey = widgetKey;
        this.refs = refs;
        this.recyclerItemView = view;
        this.onBoardingDto = onBoardingDto;
        this.lifecycleOwner = lifecycleOwner;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = lVar;
        this.completelyVisibleViewPercent = f7;
        r a11 = refs.getContainer().a();
        this.fragmentManager = a11 != null ? a11.getSupportFragmentManager() : null;
        r a12 = refs.getContainer().a();
        this.windowHeight = (a12 == null || (resources = a12.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0 : displayMetrics.heightPixels;
        this.rootView = LazyUtilsKt.unsafeLazy(new OnBoardingDelegateImpl$rootView$2(this));
        this.composerRv = LazyUtilsKt.unsafeLazy(new OnBoardingDelegateImpl$composerRv$2(this));
        this.statusBarHeight = LazyUtilsKt.unsafeLazy(new OnBoardingDelegateImpl$statusBarHeight$2(this));
        this.isFindView = true;
        this.exceptionHandler = new OnBoardingDelegateImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.itemViewLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: Ur.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                OnBoardingDelegateImpl.itemViewLayoutChangeListener$lambda$3(OnBoardingDelegateImpl.this, view2, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.bottomSheetObserver = new BottomSheetVisibilityObserver(new OnBoardingDelegateImpl$bottomSheetObserver$1(this));
        final AbstractC5434v lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
            unbind();
        } else {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl$special$$inlined$whenDestroyed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(androidx.lifecycle.J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    this.unbind();
                    AbstractC5434v.this.e(this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBottomOffset() {
        int i11;
        jk0.l overlapInfo = getOverlapInfo();
        if (overlapInfo == null || (i11 = overlapInfo.f().bottom - overlapInfo.e().bottom) < 0) {
            return 0;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getComposerRv() {
        return (RecyclerView) this.composerRv.getValue();
    }

    private final jk0.l getOverlapInfo() {
        q viewHolderPositionInfo;
        k<?> kVar = this.viewHolder;
        if (kVar == null || (viewHolderPositionInfo = kVar.getViewHolderPositionInfo()) == null) {
            return null;
        }
        return viewHolderPositionInfo.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup getRootView() {
        return (ViewGroup) this.rootView.getValue();
    }

    private final int getStatusBarHeight() {
        return ((Number) this.statusBarHeight.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getTargetView() {
        k<?> kVar = this.viewHolder;
        if (kVar != null) {
            return kVar.itemView;
        }
        return null;
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
    public final boolean isEnoughSpaceForOnboarding(k<?> viewHolder) {
        int intValue;
        LinearLayout composerBottomContainer;
        OnBoardingCutConfig onBoardingCutConfig = this.onBoardingCutConfig;
        if (onBoardingCutConfig == null) {
            return true;
        }
        Integer marginVertical = onBoardingCutConfig.getMarginVertical();
        if (marginVertical != null) {
            intValue = marginVertical.intValue();
        } else {
            Integer marginBottom = onBoardingCutConfig.getMarginBottom();
            if (marginBottom == null) {
                return true;
            }
            intValue = marginBottom.intValue();
        }
        if (intValue >= 0) {
            return true;
        }
        ViewGroup b11 = C2971a.b(this.refs);
        return viewHolder.itemView.getBottom() + (-intValue) < ((b11 == null || (composerBottomContainer = ComposerViewExtensionKt.composerBottomContainer(b11)) == null) ? Integer.MAX_VALUE : composerBottomContainer.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isViewInAcceptableRange(k<?> viewHolder) {
        q viewHolderPositionInfo = viewHolder.getViewHolderPositionInfo();
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return o.a(itemView, viewHolderPositionInfo, false) >= this.completelyVisibleViewPercent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void itemViewLayoutChangeListener$lambda$3(OnBoardingDelegateImpl onBoardingDelegateImpl, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        OnBoardingDialogCutConfig createOnboardingValues;
        OnBoardingDialog onBoardingDialog;
        View targetView = onBoardingDelegateImpl.getTargetView();
        if (targetView == null || (createOnboardingValues = OnBoardingDelegateExtKt.createOnboardingValues(targetView, onBoardingDelegateImpl.getStatusBarHeight(), onBoardingDelegateImpl.onBoardingCutConfig)) == null || (onBoardingDialog = onBoardingDelegateImpl.onBoardingDialog) == null) {
            return;
        }
        onBoardingDialog.updateVerticalConfig(onBoardingDelegateImpl.getRootView(), createOnboardingValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int measureBannerView() {
        Context context;
        ViewGroup rootView = getRootView();
        if (rootView == null || (context = rootView.getContext()) == null) {
            return 0;
        }
        OnBoardingBannerView onBoardingBannerView = new OnBoardingBannerView(context, null, 0, 6, null);
        OnBoardingDTO onBoardingDTO = this.onBoardingDto;
        OnBoardingBannerView.bind$default(onBoardingBannerView, OnBoardingDTO.copy$default(onBoardingDTO, ImageTitleSubtitleCellDTO.copy$default(onBoardingDTO.getBanner(), null, null, null, null, null, null, 47, null), null, null, null, null, null, 62, null), null, 2, null);
        int i11 = onBoardingBannerView.getContext().getResources().getDisplayMetrics().widthPixels;
        ViewGroup.LayoutParams layoutParams = onBoardingBannerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i12 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = onBoardingBannerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        onBoardingBannerView.measure(View.MeasureSpec.makeMeasureSpec(i11 - (i12 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return onBoardingBannerView.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShownOnboarding(boolean isShown) {
        if (isShown) {
            ComposerExtKt.withPageTag(this.refs.getContainer(), new OnBoardingDelegateImpl$onShownOnboarding$1(this.viewModel));
        }
        this.viewModel.onShown(this.widgetKey, isShown);
        RecyclerView composerRv = getComposerRv();
        if (composerRv != null) {
            ScrollExtKt.scrollEnable(composerRv, true);
        }
        Function1<Boolean, Unit> onShownListener = getOnShownListener();
        if (onShownListener != null) {
            onShownListener.invoke(Boolean.valueOf(isShown));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOnboarding() {
        handleWidget(new OnBoardingDelegateImpl$showOnboarding$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startFindViewJob() {
        B0 b02 = this.visibleItemJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.visibleItemJob = C10727i.c(K.a(this.lifecycleOwner), this.exceptionHandler.plus(C10720e0.a()), null, new OnBoardingDelegateImpl$startFindViewJob$1(this, null), 2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l20.c] */
    private final void trackOnboardingView() {
        t b11;
        l lVar;
        ?? boundData;
        k<?> kVar = this.viewHolder;
        Long valueOf = (kVar == null || (boundData = kVar.getBoundData()) == 0) ? null : Long.valueOf(boundData.getId());
        Map<String, TokenizedTrackingInfo> trackingInfo = this.onBoardingDto.getTrackingInfo();
        if (trackingInfo == null || (b11 = x.b(trackingInfo, valueOf, null)) == null || (lVar = this.tokenizedAnalytics) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, b11, null, 2, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate
    public void bind(@NotNull k<?> viewHolder, @NotNull OnBoardingCutConfig onBoardingCutConfig, Function0<Unit> onCropAreaClick) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(onBoardingCutConfig, "onBoardingCutConfig");
        this.viewHolder = viewHolder;
        this.onBoardingCutConfig = onBoardingCutConfig;
        this.onCropAreaClick = onCropAreaClick;
        OnBoardingDelegateExtKt.showOnboarding(this.refs.getContainer(), this.widgetKey, this.viewModel, new OnBoardingDelegateImpl$bind$1(this));
    }

    public Function1<Boolean, Unit> getOnShownListener() {
        return this.onShownListener;
    }

    public Function0<Unit> getOnUnbindListener() {
        return this.onUnbindListener;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate
    public void setOnShownListener(Function1<? super Boolean, Unit> function1) {
        this.onShownListener = function1;
    }

    public void setOnUnbindListener(Function0<Unit> function0) {
        this.onUnbindListener = function0;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate
    public void unbind() {
        Function0<Unit> onUnbindListener = getOnUnbindListener();
        if (onUnbindListener != null) {
            onUnbindListener.invoke();
        }
        this.viewModel.onUnbind$composer_prodGoogleAllVendorsRelease();
        this.viewHolder = null;
        OnBoardingDelegateExtKt.unbind(this.onBoardingDialog);
        this.onBoardingDialog = null;
        B0 b02 = this.visibleItemJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.isFindView = false;
        View view = this.recyclerItemView;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.itemViewLayoutChangeListener);
        }
        setOnShownListener(null);
        setOnUnbindListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOnboarding(RecyclerView recyclerView) {
        View view = this.recyclerItemView;
        if (view != null) {
            view.addOnLayoutChangeListener(this.itemViewLayoutChangeListener);
        }
        ScrollExtKt.scrollEnable(recyclerView, false);
        recyclerView.stopScroll();
        G g10 = this.fragmentManager;
        if (g10 != null) {
            OnBoardingDelegateExtKt.setupFragmentResultListener(g10, getTargetView(), this.lifecycleOwner, new OnBoardingDelegateImpl$showOnboarding$2$1(this), this.onCropAreaClick);
            showOnboarding(g10);
        }
    }

    private final void showOnboarding(G g10) {
        OnBoardingDialogCutConfig createOnboardingValues;
        View targetView = getTargetView();
        if (targetView == null || (createOnboardingValues = OnBoardingDelegateExtKt.createOnboardingValues(targetView, getStatusBarHeight(), this.onBoardingCutConfig)) == null) {
            return;
        }
        OnBoardingDialog newInstance = OnBoardingDialog.INSTANCE.newInstance(createOnboardingValues, this.onBoardingDto);
        newInstance.show(g10, "OnBoardingDialog");
        trackOnboardingView();
        this.onBoardingDialog = newInstance;
    }

    public /* synthetic */ OnBoardingDelegateImpl(String str, ComposerReferences composerReferences, View view, OnBoardingDTO onBoardingDTO, androidx.lifecycle.J j11, BaseOnBoardingViewModel baseOnBoardingViewModel, l lVar, float f7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, composerReferences, (i11 & 4) != 0 ? null : view, onBoardingDTO, j11, baseOnBoardingViewModel, (i11 & 64) != 0 ? null : lVar, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 1.0f : f7);
    }
}
