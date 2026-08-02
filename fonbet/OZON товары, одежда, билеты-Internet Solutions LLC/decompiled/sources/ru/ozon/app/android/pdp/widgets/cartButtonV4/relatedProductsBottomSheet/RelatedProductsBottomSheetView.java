package ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet;

import AP.b;
import B90.C;
import E.RunnableC2901q;
import Lm0.a;
import Sc.InterfaceC4008j;
import WZ.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.fragment.app.r;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import i10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ExtKt;
import ru.ozon.app.android.uikit.container.ExternalOffsetHandler;
import ru.ozon.app.android.uikit.view.discount.ProgressiveDiscountViewKt;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.core.UniColors;
import y7.k;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0002\u0081\u0001\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0011H\u0002¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010$J\u000f\u0010*\u001a\u00020\u0011H\u0002¢\u0006\u0004\b*\u0010$J\u001b\u0010.\u001a\u00020\u0011*\u00020+2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u00020\u00112\u0006\u00100\u001a\u00020\t2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0011H\u0002¢\u0006\u0004\b5\u0010$J\u000f\u00106\u001a\u00020\u0007H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u00107J\u000f\u0010<\u001a\u00020\u0007H\u0002¢\u0006\u0004\b<\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010=R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010>R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010?R\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010>R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010G\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010ER\u0016\u0010J\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010>R\u0016\u0010K\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010>R\u0016\u0010L\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010>R\u0016\u0010M\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010>R\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010QR\u0014\u0010R\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010ER\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001b\u0010`\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u00107R\u0014\u0010a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010BR\u001b\u0010d\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010^\u001a\u0004\bc\u00107R\u0018\u0010e\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010g\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010i\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010hR\u001d\u0010n\u001a\u0004\u0018\u00010j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010^\u001a\u0004\bl\u0010mR\u001d\u0010s\u001a\u0004\u0018\u00010o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010^\u001a\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010yR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0084\u0001\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010(¨\u0006\u0085\u0001"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetView;", "Lcom/google/android/material/card/MaterialCardView;", "Lru/ozon/app/android/pdp/utils/DPS;", "Landroid/content/Context;", "context", "Ll10/i;", "container", "Landroid/view/View;", "initialHeaderView", "", "isBottomSheetReturn", "isBottomSheetCloseAfterScroll", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "isSnapshotOutsideScreenEnabled", "Lkotlin/Function1;", "", "onVisibleBottomSheet", "<init>", "(Landroid/content/Context;Ll10/i;Landroid/view/View;ZZLWZ/l;ZLkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "analytics", "", "deeplink", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;Ljava/lang/String;)V", "view", "updateHeaderView", "(Landroid/view/View;)V", "loadComposer", "(Ljava/lang/String;)V", "isValidatedShow", "showMiniState", "(Z)V", "onDetach", "()V", "setupExpandedMiniState", "tryShowMiniState", "canShowMiniState", "()Z", "attachCloseButton", "ensureComposerContainerAttached", "Landroidx/fragment/app/G;", "Landroidx/lifecycle/J;", "lifecycleOwner", "setupFragmentResultListener", "(Landroidx/fragment/app/G;Landroidx/lifecycle/J;)V", "isUp", "", "slideOffset", "animation", "(ZF)V", "onExternalTapEvent", "createCloseButton", "()Landroid/view/View;", "Landroid/widget/FrameLayout;", "createComposerContainer", "()Landroid/widget/FrameLayout;", "createAndSetupComposerDimming", "createDimingView", "Ll10/i;", "Z", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "headerView", "Landroid/view/View;", "", "bottomSheetMaxHeight", "I", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetBehavior;", "behavior", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetBehavior;", "targetCollapsedPeekHeight", "isShownBottomSheet", "isValidatedShowWithExternalState", "isValidatedShowWithComposerWidgetState", "isValidatedShowWithExternalDialogFragment", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "composerFragment", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "halfRatio", "F", "bottomPadding", "Landroidx/recyclerview/widget/RecyclerView;", "composerRv", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "bottomNavigationAnimationController", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "composerContainer", "Landroid/widget/FrameLayout;", "closeButton$delegate", "LSc/j;", "getCloseButton", "closeButton", "composerDimmingView", "dimmingView$delegate", "getDimmingView", "dimmingView", "lastDeeplink", "Ljava/lang/String;", "composerLoaderElevation", "Ljava/lang/Float;", "composerSnapshotElevation", "Lru/ozon/composer/ui/view/issue/PageIssueStateView;", "screenStateView$delegate", "getScreenStateView", "()Lru/ozon/composer/ui/view/issue/PageIssueStateView;", "screenStateView", "Landroidx/appcompat/widget/AppCompatImageView;", "snapshotView$delegate", "getSnapshotView", "()Landroidx/appcompat/widget/AppCompatImageView;", "snapshotView", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "runnableExternalTapEvent", "Ljava/lang/Runnable;", "headerRunnable", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBehaviorStateHandler;", "behaviorStateHandler", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBehaviorStateHandler;", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "ru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetView$fragmentLifecycleCallbacks$1", "fragmentLifecycleCallbacks", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetView$fragmentLifecycleCallbacks$1;", "isValidatedShowWithComposerScroll", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class RelatedProductsBottomSheetView extends MaterialCardView implements DPS {
    private CurtainTrackingInfoVO analytics;
    private RelatedProductsBottomSheetBehavior<FrameLayout> behavior;

    @NotNull
    private final RelatedProductsBehaviorStateHandler behaviorStateHandler;
    private BottomNavigationAnimationController bottomNavigationAnimationController;
    private int bottomPadding;
    private final int bottomSheetMaxHeight;

    /* renamed from: closeButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j closeButton;

    @NotNull
    private final FrameLayout composerContainer;

    @NotNull
    private final View composerDimmingView;
    private ComposerFragment composerFragment;
    private Float composerLoaderElevation;
    private RecyclerView composerRv;
    private Float composerSnapshotElevation;

    @NotNull
    private final i container;

    /* renamed from: dimmingView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dimmingView;

    @NotNull
    private final RelatedProductsBottomSheetView$fragmentLifecycleCallbacks$1 fragmentLifecycleCallbacks;
    private final float halfRatio;

    @NotNull
    private final Handler handler;

    @NotNull
    private final Runnable headerRunnable;
    private View headerView;
    private final boolean isBottomSheetCloseAfterScroll;
    private final boolean isBottomSheetReturn;
    private boolean isShownBottomSheet;
    private final boolean isSnapshotOutsideScreenEnabled;
    private boolean isValidatedShowWithComposerWidgetState;
    private boolean isValidatedShowWithExternalDialogFragment;
    private boolean isValidatedShowWithExternalState;
    private String lastDeeplink;

    @NotNull
    private final View.OnLayoutChangeListener layoutChangeListener;

    @NotNull
    private final Function1<Boolean, Unit> onVisibleBottomSheet;

    @NotNull
    private final Runnable runnableExternalTapEvent;

    /* renamed from: screenStateView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j screenStateView;

    /* renamed from: snapshotView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j snapshotView;
    private int targetCollapsedPeekHeight;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.fragment.app.G$m, ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBottomSheetView$fragmentLifecycleCallbacks$1] */
    public RelatedProductsBottomSheetView(@NotNull Context context, @NotNull i container, View view, boolean z11, boolean z12, @NotNull l tokenizedAnalytics, boolean z13, @NotNull Function1<? super Boolean, Unit> onVisibleBottomSheet) {
        super(context);
        int i11;
        int i12;
        int i13;
        ComponentCallbacksC5392m parentFragment;
        View view2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onVisibleBottomSheet, "onVisibleBottomSheet");
        this.container = container;
        this.isBottomSheetReturn = z11;
        this.isBottomSheetCloseAfterScroll = z12;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.isSnapshotOutsideScreenEnabled = z13;
        this.onVisibleBottomSheet = onVisibleBottomSheet;
        this.headerView = view;
        int i14 = context.getResources().getDisplayMetrics().heightPixels;
        i11 = RelatedProductsBottomSheetViewKt.TOP_PADDING;
        int statusBarHeight = ResourceExtKt.getStatusBarHeight(context) + (i14 - i11);
        this.bottomSheetMaxHeight = statusBarHeight;
        this.behavior = new RelatedProductsBottomSheetBehavior<>(context, null);
        this.isValidatedShowWithExternalDialogFragment = true;
        i12 = RelatedProductsBottomSheetViewKt.BOTTOM_SHEET_MINI_HEIGHT;
        this.halfRatio = i12 / context.getResources().getDisplayMetrics().heightPixels;
        InterfaceC5431s b11 = container.K().b();
        ExternalOffsetHandler externalOffsetHandler = b11 instanceof ExternalOffsetHandler ? (ExternalOffsetHandler) b11 : null;
        this.bottomPadding = externalOffsetHandler != null ? externalOffsetHandler.getMaxBottomOffset() : 0;
        ComponentCallbacksC5392m b12 = container.K().b();
        this.composerRv = (b12 == null || (view2 = b12.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerViewOrNull(view2);
        ComponentCallbacksC5392m b13 = container.K().b();
        InterfaceC5431s parentFragment2 = (b13 == null || (parentFragment = b13.getParentFragment()) == null) ? null : parentFragment.getParentFragment();
        this.bottomNavigationAnimationController = parentFragment2 instanceof BottomNavigationAnimationController ? (BottomNavigationAnimationController) parentFragment2 : null;
        FrameLayout createComposerContainer = createComposerContainer();
        this.composerContainer = createComposerContainer;
        this.closeButton = DelegatesKt.lazyUnsafe(new RelatedProductsBottomSheetView$closeButton$2(this));
        this.composerDimmingView = createAndSetupComposerDimming();
        this.dimmingView = DelegatesKt.lazyUnsafe(new RelatedProductsBottomSheetView$dimmingView$2(this));
        this.composerSnapshotElevation = this.composerLoaderElevation;
        this.screenStateView = DelegatesKt.lazyUnsafe(new RelatedProductsBottomSheetView$screenStateView$2(this));
        this.snapshotView = DelegatesKt.lazyUnsafe(new RelatedProductsBottomSheetView$snapshotView$2(this));
        this.handler = new Handler(Looper.getMainLooper());
        this.runnableExternalTapEvent = new B50.l(this, 4);
        this.headerRunnable = new RunnableC2901q(this, 6);
        this.behaviorStateHandler = new RelatedProductsBehaviorStateHandler(container.K().f().getLifecycle(), z11, createComposerContainer, statusBarHeight, this.behavior, new RelatedProductsBottomSheetView$behaviorStateHandler$1(this), new RelatedProductsBottomSheetView$behaviorStateHandler$2(this));
        View.OnLayoutChangeListener bVar = new b(this, 2);
        this.layoutChangeListener = bVar;
        ?? r32 = new G.m() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBottomSheetView$fragmentLifecycleCallbacks$1
            @Override // androidx.fragment.app.G.m
            public void onFragmentDestroyed(G fm, ComponentCallbacksC5392m fr) {
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fr, "fr");
                if (fr instanceof DialogInterfaceOnCancelListenerC5390k) {
                    RelatedProductsBottomSheetView.this.isValidatedShowWithExternalDialogFragment = true;
                }
                super.onFragmentDestroyed(fm, fr);
            }

            @Override // androidx.fragment.app.G.m
            public void onFragmentResumed(G fm, ComponentCallbacksC5392m fr) {
                RelatedProductsBottomSheetBehavior relatedProductsBottomSheetBehavior;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fr, "fr");
                if (fr instanceof DialogInterfaceOnCancelListenerC5390k) {
                    RelatedProductsBottomSheetView.this.isValidatedShowWithExternalDialogFragment = false;
                    try {
                        relatedProductsBottomSheetBehavior = RelatedProductsBottomSheetView.this.behavior;
                        if (relatedProductsBottomSheetBehavior != null) {
                            relatedProductsBottomSheetBehavior.setState(4);
                        }
                    } catch (Exception e11) {
                        a.f17149a.e(e11);
                    }
                }
                super.onFragmentResumed(fm, fr);
            }
        };
        this.fragmentLifecycleCallbacks = r32;
        int dp2 = getDp2() + getResources().getDisplayMetrics().widthPixels;
        int i15 = this.bottomPadding;
        Integer valueOf = i15 != 0 ? Integer.valueOf(i15) : null;
        int intValue = valueOf != null ? valueOf.intValue() : RelatedProductsBottomSheetViewKt.staticBottomPadding;
        i13 = RelatedProductsBottomSheetViewKt.DEFAULT_HEADER_HEIGHT;
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(dp2, i13 + intValue);
        fVar.i(this.behavior);
        fVar.f41884c = 1;
        setLayoutParams(fVar);
        setClipToPadding(false);
        k.a aVar = new k.a(new k());
        aVar.n(getDpf24());
        aVar.r(getDpf24());
        setShapeAppearanceModel(aVar.a());
        setStrokeWidth(ProgressiveDiscountViewKt.getDp1());
        setStrokeColor(ColorStateList.valueOf(androidx.core.content.a.getColor(context, UniColors.GRAPHIC_NEUTRAL.getResId())));
        View view3 = this.headerView;
        if (view3 != null) {
            addView(view3);
        }
        addView(createComposerContainer);
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBottomSheetView.4
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view4, Outline outline) {
                if (outline != null) {
                    outline.setRoundRect(0, 0, RelatedProductsBottomSheetView.this.getWidth(), RelatedProductsBottomSheetView.this.getDp24() + RelatedProductsBottomSheetView.this.getHeight(), RelatedProductsBottomSheetView.this.getDpf24());
                }
            }
        });
        setClipToOutline(true);
        G c11 = container.K().c();
        if (c11 != 0) {
            c11.Y0(r32, false);
        }
        addOnLayoutChangeListener(bVar);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animation(boolean isUp, float slideOffset) {
        if (slideOffset == 0.0f) {
            ViewExtKt.gone(getCloseButton());
            ViewExtKt.gone(this.composerDimmingView);
        } else {
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(getCloseButton());
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(this.composerDimmingView);
        }
        getCloseButton().setAlpha(slideOffset);
        getDimmingView().setAlpha(slideOffset);
        this.composerDimmingView.setAlpha(slideOffset);
        View view = this.headerView;
        if (view != null) {
            ExtKt.hideToTopAnimation(view, view.getHeight(), slideOffset);
            ExtKt.hideToTopAnimation(this.composerContainer, view.getHeight(), slideOffset);
        }
        if (isUp) {
            BottomNavigationAnimationController bottomNavigationAnimationController = this.bottomNavigationAnimationController;
            if (bottomNavigationAnimationController != null) {
                BottomNavigationAnimationController.DefaultImpls.hideBottomNavigationWithTranslationAnimation$default(bottomNavigationAnimationController, 0L, 1, null);
                return;
            }
            return;
        }
        BottomNavigationAnimationController bottomNavigationAnimationController2 = this.bottomNavigationAnimationController;
        if (bottomNavigationAnimationController2 != null) {
            BottomNavigationAnimationController.DefaultImpls.showBottomNavigationWithTranslationAnimation$default(bottomNavigationAnimationController2, 0L, 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r6 != (r2 != null ? r2.bottomMargin : 0)) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void attachCloseButton() {
        ViewParent parent = getCloseButton().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(getCloseButton());
        }
        View closeButton = getCloseButton();
        if (getPaddingTop() != 0) {
            ViewGroup.LayoutParams layoutParams = closeButton.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i11 = marginLayoutParams.leftMargin;
                int i12 = marginLayoutParams.topMargin;
                int i13 = marginLayoutParams.rightMargin;
                int i14 = marginLayoutParams.bottomMargin;
                marginLayoutParams.topMargin = getDp16() + (-getPaddingTop());
                if (i11 == marginLayoutParams.leftMargin) {
                    ViewGroup.LayoutParams layoutParams2 = closeButton.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams3 = closeButton.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                            ViewGroup.LayoutParams layoutParams4 = closeButton.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        }
                    }
                }
                closeButton.setLayoutParams(marginLayoutParams);
            }
        }
        addView(closeButton);
    }

    private final boolean canShowMiniState() {
        return this.isValidatedShowWithExternalState && this.isValidatedShowWithComposerWidgetState && isValidatedShowWithComposerScroll();
    }

    private final View createAndSetupComposerDimming() {
        View view = new View(getContext());
        view.setBackgroundColor(androidx.core.content.a.getColor(view.getContext(), UniColors.LAYER_OVERLAY_DIMMING.getResId()));
        view.setAlpha(0.0f);
        ViewExtKt.gone(view);
        ComposerViewExtensionKt.composerContainer(this.container.Z()).addView(view);
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createCloseButton() {
        View view = new View(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getDp32(), getDp32());
        layoutParams.gravity = 8388613;
        layoutParams.topMargin = getDp16();
        layoutParams.rightMargin = getDp16();
        view.setLayoutParams(layoutParams);
        view.setBackground(androidx.core.content.a.getDrawable(view.getContext(), R$drawable.ic_close_related_products_curtain));
        ViewExtKt.gone(view);
        view.setAlpha(0.0f);
        view.setElevation(1.0f);
        view.setOnClickListener(new GD.b(7, view, this));
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCloseButton$lambda$26$lambda$25(View view, RelatedProductsBottomSheetView relatedProductsBottomSheetView, View view2) {
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior;
        if (view.getVisibility() == 0 && view.getAlpha() == 1.0f && (relatedProductsBottomSheetBehavior = relatedProductsBottomSheetView.behavior) != null) {
            relatedProductsBottomSheetBehavior.setState(4);
        }
    }

    private final FrameLayout createComposerContainer() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R$id.relatedProductComposerContainer);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createDimingView() {
        Window window;
        View view = new View(getContext());
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, ResourceExtKt.getStatusBarHeight(context)));
        view.setBackgroundColor(androidx.core.content.a.getColor(view.getContext(), UniColors.LAYER_OVERLAY_DIMMING.getResId()));
        r a11 = this.container.K().a();
        View decorView = (a11 == null || (window = a11.getWindow()) == null) ? null : window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
        return view;
    }

    private final void ensureComposerContainerAttached() {
        if (Intrinsics.d(this.composerContainer.getParent(), this)) {
            return;
        }
        ViewParent parent = this.composerContainer.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.composerContainer);
        }
        addView(this.composerContainer);
    }

    private final View getCloseButton() {
        return (View) this.closeButton.getValue();
    }

    private final View getDimmingView() {
        return (View) this.dimmingView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PageIssueStateView getScreenStateView() {
        return (PageIssueStateView) this.screenStateView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatImageView getSnapshotView() {
        return (AppCompatImageView) this.snapshotView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void headerRunnable$lambda$2(RelatedProductsBottomSheetView relatedProductsBottomSheetView) {
        View view = relatedProductsBottomSheetView.headerView;
        int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
        int i11 = relatedProductsBottomSheetView.bottomPadding;
        relatedProductsBottomSheetView.targetCollapsedPeekHeight = measuredHeight + i11;
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior = relatedProductsBottomSheetView.behavior;
        if (relatedProductsBottomSheetBehavior != null) {
            relatedProductsBottomSheetBehavior.setPeekHeight(i11 + measuredHeight);
        }
        ViewGroup.LayoutParams layoutParams = relatedProductsBottomSheetView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = measuredHeight + relatedProductsBottomSheetView.bottomPadding;
        relatedProductsBottomSheetView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValidatedShowWithComposerScroll() {
        RecyclerView recyclerView = this.composerRv;
        return recyclerView != null && recyclerView.getScrollState() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r9 != (r6 != null ? r6.bottomMargin : 0)) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void layoutChangeListener$lambda$5(RelatedProductsBottomSheetView relatedProductsBottomSheetView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (view.getPaddingTop() != 0) {
            FrameLayout frameLayout = relatedProductsBottomSheetView.composerContainer;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i19 = marginLayoutParams.leftMargin;
                int i21 = marginLayoutParams.topMargin;
                int i22 = marginLayoutParams.rightMargin;
                int i23 = marginLayoutParams.bottomMargin;
                View view2 = relatedProductsBottomSheetView.headerView;
                marginLayoutParams.topMargin = (view2 != null ? view2.getMeasuredHeight() : RelatedProductsBottomSheetViewKt.DEFAULT_HEADER_HEIGHT) - relatedProductsBottomSheetView.getPaddingTop();
                if (i19 == marginLayoutParams.leftMargin) {
                    ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (i21 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        if (i22 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                            ViewGroup.LayoutParams layoutParams4 = frameLayout.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        }
                    }
                }
                frameLayout.setLayoutParams(marginLayoutParams);
            }
            View view3 = relatedProductsBottomSheetView.headerView;
            if (view3 != null) {
                ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                if (marginLayoutParams5 == null) {
                    return;
                }
                int i24 = marginLayoutParams5.leftMargin;
                int i25 = marginLayoutParams5.topMargin;
                int i26 = marginLayoutParams5.rightMargin;
                int i27 = marginLayoutParams5.bottomMargin;
                marginLayoutParams5.topMargin = -relatedProductsBottomSheetView.getPaddingTop();
                if (i24 == marginLayoutParams5.leftMargin) {
                    ViewGroup.LayoutParams layoutParams6 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                    if (i25 == (marginLayoutParams6 != null ? marginLayoutParams6.topMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams7 = view3.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                        if (i26 == (marginLayoutParams7 != null ? marginLayoutParams7.rightMargin : 0)) {
                            ViewGroup.LayoutParams layoutParams8 = view3.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                            if (i27 == (marginLayoutParams8 != null ? marginLayoutParams8.bottomMargin : 0)) {
                                return;
                            }
                        }
                    }
                }
                view3.setLayoutParams(marginLayoutParams5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExternalTapEvent() {
        if (!this.isBottomSheetCloseAfterScroll || isValidatedShowWithComposerScroll()) {
            RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior = this.behavior;
            if (relatedProductsBottomSheetBehavior != null) {
                relatedProductsBottomSheetBehavior.setState(4);
                return;
            }
            return;
        }
        RecyclerView recyclerView = this.composerRv;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBottomSheetView$onExternalTapEvent$1
                @Override // androidx.recyclerview.widget.RecyclerView.t
                public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                    boolean isValidatedShowWithComposerScroll;
                    RelatedProductsBottomSheetBehavior relatedProductsBottomSheetBehavior2;
                    RecyclerView recyclerView3;
                    Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                    super.onScrollStateChanged(recyclerView2, newState);
                    isValidatedShowWithComposerScroll = RelatedProductsBottomSheetView.this.isValidatedShowWithComposerScroll();
                    if (isValidatedShowWithComposerScroll) {
                        relatedProductsBottomSheetBehavior2 = RelatedProductsBottomSheetView.this.behavior;
                        if (relatedProductsBottomSheetBehavior2 != null) {
                            relatedProductsBottomSheetBehavior2.setState(4);
                        }
                        recyclerView3 = RelatedProductsBottomSheetView.this.composerRv;
                        if (recyclerView3 != null) {
                            recyclerView3.removeOnScrollListener(this);
                        }
                    }
                }
            });
        }
    }

    private final void setupExpandedMiniState() {
        int i11;
        this.behaviorStateHandler.animationEnable(false);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        i11 = RelatedProductsBottomSheetViewKt.BOTTOM_SHEET_MINI_HEIGHT;
        layoutParams.height = i11;
        setLayoutParams(layoutParams);
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior = this.behavior;
        if (relatedProductsBottomSheetBehavior != null) {
            relatedProductsBottomSheetBehavior.setFitToContents(false);
        }
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior2 = this.behavior;
        if (relatedProductsBottomSheetBehavior2 != null) {
            relatedProductsBottomSheetBehavior2.setHalfExpandedRatio(this.halfRatio);
        }
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior3 = this.behavior;
        if (relatedProductsBottomSheetBehavior3 != null) {
            relatedProductsBottomSheetBehavior3.setState(6);
        }
    }

    private final void setupFragmentResultListener(G g10, J j11) {
        g10.n1("relatedProductsBottomSheetConfigurator_LoadCompleted_requestCode", j11, new C(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupFragmentResultListener$lambda$22(RelatedProductsBottomSheetView relatedProductsBottomSheetView, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (bundle.getBoolean("loadCompleted_state")) {
            relatedProductsBottomSheetView.isValidatedShowWithComposerWidgetState = true;
            relatedProductsBottomSheetView.tryShowMiniState();
        } else {
            relatedProductsBottomSheetView.isValidatedShowWithComposerWidgetState = false;
            if (relatedProductsBottomSheetView.isShownBottomSheet) {
                return;
            }
            relatedProductsBottomSheetView.onDetach();
        }
    }

    private final void tryShowMiniState() {
        if (this.isShownBottomSheet || canShowMiniState()) {
            attachCloseButton();
            this.isShownBottomSheet = true;
            getDimmingView().setAlpha(0.0f);
            if (this.isValidatedShowWithExternalDialogFragment) {
                setupExpandedMiniState();
                return;
            }
            if (!this.isBottomSheetReturn) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = this.targetCollapsedPeekHeight;
                setLayoutParams(layoutParams);
                onDetach();
                return;
            }
            this.behaviorStateHandler.animationEnable(true);
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = this.bottomSheetMaxHeight;
            setLayoutParams(layoutParams2);
            FrameLayout frameLayout = this.composerContainer;
            ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.height = this.bottomSheetMaxHeight;
            frameLayout.setLayoutParams(layoutParams3);
        }
    }

    public final void bind(CurtainTrackingInfoVO analytics, @NotNull String deeplink) {
        int i11;
        int i12;
        String tag;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (this.isShownBottomSheet) {
            if (Intrinsics.d(this.lastDeeplink, deeplink)) {
                return;
            }
            ComposerFragment composerFragment = this.composerFragment;
            if (composerFragment != null) {
                ComposerFragment.startLoading$default(composerFragment, deeplink, null, 2, null);
            }
            this.lastDeeplink = deeplink;
            return;
        }
        ComponentCallbacksC5392m b11 = this.container.K().b();
        if (b11 == null || (tag = b11.getTag()) == null || !h.t(tag, "miniapp=seller", false)) {
            int i13 = this.bottomPadding;
            if (i13 == 0) {
                i11 = RelatedProductsBottomSheetViewKt.staticBottomPadding;
                this.bottomPadding = i11;
            } else {
                RelatedProductsBottomSheetViewKt.staticBottomPadding = i13;
            }
        }
        this.analytics = analytics;
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior = this.behavior;
        if (relatedProductsBottomSheetBehavior != null) {
            relatedProductsBottomSheetBehavior.setHideable(false);
        }
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior2 = this.behavior;
        if (relatedProductsBottomSheetBehavior2 != null) {
            i12 = RelatedProductsBottomSheetViewKt.TOP_PADDING;
            relatedProductsBottomSheetBehavior2.setExpandedOffset(i12);
        }
        View view = this.headerView;
        int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
        int i14 = this.bottomPadding + measuredHeight;
        this.targetCollapsedPeekHeight = i14;
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior3 = this.behavior;
        if (relatedProductsBottomSheetBehavior3 != null) {
            relatedProductsBottomSheetBehavior3.setPeekHeight(i14);
        }
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior4 = this.behavior;
        if (relatedProductsBottomSheetBehavior4 != null) {
            relatedProductsBottomSheetBehavior4.setState(4);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = measuredHeight + this.bottomPadding;
        setLayoutParams(layoutParams);
    }

    public int getDp16() {
        return DPS.DefaultImpls.getDp16(this);
    }

    public int getDp2() {
        return DPS.DefaultImpls.getDp2(this);
    }

    public int getDp24() {
        return DPS.DefaultImpls.getDp24(this);
    }

    public int getDp32() {
        return DPS.DefaultImpls.getDp32(this);
    }

    public float getDpf24() {
        return DPS.DefaultImpls.getDpf24(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r8 != (r4 != null ? r4.bottomMargin : 0)) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void loadComposer(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (this.isShownBottomSheet) {
            return;
        }
        this.lastDeeplink = deeplink;
        ensureComposerContainerAttached();
        FrameLayout frameLayout = this.composerContainer;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        String str = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            View view = this.headerView;
            marginLayoutParams.topMargin = view != null ? view.getMeasuredHeight() : 0;
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = frameLayout.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            frameLayout.setLayoutParams(marginLayoutParams);
        }
        ComposerFragment newInstance$default = ComposerFragment.Companion.newInstance$default(ComposerFragment.INSTANCE, new ComposerScreenConfig(new h.c.a(deeplink, str, str, 14), null, false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, null, 0, false, false, false, false, false, false, 1918, null), false, false, false, false, null, false, false, false, e0.h(RelatedProductsBottomSheetConfigurator.class), null, Integer.valueOf(UniColors.LAYER_FLOOR_1.getResId()), null, false, null, null, null, false, false, null, null, 14659476, null), null, null, 6, null);
        G c11 = this.container.K().c();
        if (c11 != null) {
            Q p11 = c11.p();
            p11.r(this.composerContainer.getId(), newInstance$default, null);
            p11.l();
        }
        G c12 = this.container.K().c();
        if (c12 != null) {
            J viewLifecycleOwner = newInstance$default.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            setupFragmentResultListener(c12, viewLifecycleOwner);
        }
        this.composerFragment = newInstance$default;
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior = this.behavior;
        if (relatedProductsBottomSheetBehavior != null) {
            relatedProductsBottomSheetBehavior.addBottomSheetCallback(this.behaviorStateHandler);
        }
        this.behaviorStateHandler.setupExternalCollapsedCallback(getTop());
    }

    public final void onDetach() {
        Window window;
        G c11;
        if (!this.isSnapshotOutsideScreenEnabled) {
            this.handler.removeCallbacksAndMessages(null);
            Float f7 = this.composerSnapshotElevation;
            if (f7 != null) {
                float floatValue = f7.floatValue();
                AppCompatImageView snapshotView = getSnapshotView();
                if (snapshotView != null) {
                    snapshotView.setElevation(floatValue);
                }
            }
            Float f11 = this.composerLoaderElevation;
            if (f11 != null) {
                float floatValue2 = f11.floatValue();
                PageIssueStateView screenStateView = getScreenStateView();
                if (screenStateView != null) {
                    screenStateView.setElevation(floatValue2);
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
        ((ViewGroup.MarginLayoutParams) fVar).height = this.targetCollapsedPeekHeight;
        setLayoutParams(fVar);
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior = this.behavior;
        if (relatedProductsBottomSheetBehavior != null) {
            relatedProductsBottomSheetBehavior.setDraggable(false);
        }
        this.isShownBottomSheet = false;
        ViewExtKt.gone(this.composerDimmingView);
        G c12 = this.container.K().c();
        if (c12 != null) {
            c12.t1(this.fragmentLifecycleCallbacks);
        }
        ComposerFragment composerFragment = this.composerFragment;
        if (composerFragment != null && (c11 = this.container.K().c()) != null) {
            Q p11 = c11.p();
            p11.q(composerFragment);
            p11.j();
        }
        r a11 = this.container.K().a();
        View decorView = (a11 == null || (window = a11.getWindow()) == null) ? null : window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.removeView(getDimmingView());
        }
        ComposerViewExtensionKt.composerContainer(this.container.Z()).removeView(this.composerDimmingView);
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior2 = this.behavior;
        if (relatedProductsBottomSheetBehavior2 != null) {
            relatedProductsBottomSheetBehavior2.setOnExternalCollapsedCallback(null);
        }
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior3 = this.behavior;
        if (relatedProductsBottomSheetBehavior3 != null) {
            relatedProductsBottomSheetBehavior3.removeBottomSheetCallback(this.behaviorStateHandler);
        }
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior4 = this.behavior;
        if (relatedProductsBottomSheetBehavior4 != null) {
            relatedProductsBottomSheetBehavior4.onDetachedFromLayoutParams();
        }
        this.behavior = null;
    }

    public final void showMiniState(boolean isValidatedShow) {
        this.isValidatedShowWithExternalState = isValidatedShow;
        if (isValidatedShow) {
            tryShowMiniState();
        }
    }

    public final void updateHeaderView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        removeView(this.headerView);
        addView(view);
        this.headerView = view;
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior = this.behavior;
        if (relatedProductsBottomSheetBehavior == null || relatedProductsBottomSheetBehavior.getState() != 4) {
            return;
        }
        this.handler.post(this.headerRunnable);
    }
}
