package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers;

import Hy.RunnableC3170a;
import I1.w;
import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import hL.ViewOnLayoutChangeListenerC6887a;
import hd.C6915b;
import id.c;
import id.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.domain.flags.NavBarV2OnDrawCallbackFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerImpl;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarVO;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001<\b\u0001\u0018\u0000 U2\u00020\u0001:\u0001UB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0011J\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0013J\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u001b\u0010(\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR+\u0010J\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010'\"\u0004\bI\u0010\u0017R#\u0010P\u001a\n L*\u0004\u0018\u00010K0K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010%\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010'R\u0014\u0010S\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006V"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornersManagerImpl;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornerManager;", "Landroid/view/ViewGroup;", "composerRootView", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbar", "Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "stickyContainer", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Landroid/view/ViewGroup;Lcom/google/android/material/appbar/CollapsingToolbarLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroid/view/ViewGroup;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "item", "", "configCorners", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;)V", "setToolbarOutlineProvider", "()V", "", "offset", "playCornerAnimationOnScroll", "(I)V", "setStickyAppearance", "observeStickyContainer", "removeStickyContainerObserver", "onBind", "onViewDetached", "dy", "onNavbarOffsetChanged", "(II)V", "Landroid/view/ViewGroup;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "dp24$delegate", "LSc/j;", "getDp24", "()I", "dp24", "Landroid/graphics/Rect;", "appBarRect$delegate", "getAppBarRect", "()Landroid/graphics/Rect;", "appBarRect", "", "isStickyVisible", "Z", "prevOffset", "I", "prevScrollDy", "Landroidx/recyclerview/widget/RecyclerView;", "composerRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "boundedData", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "ru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornersManagerImpl$scrollListener$1", "scrollListener", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornersManagerImpl$scrollListener$1;", "Landroid/view/View$OnLayoutChangeListener;", "cornerRadiusListener", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "cornerRadiusListenerV2", "Landroid/view/ViewTreeObserver$OnDrawListener;", "<set-?>", "cornerRadius$delegate", "Lid/f;", "getCornerRadius", "setCornerRadius", "cornerRadius", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "cornerAnimator$delegate", "getCornerAnimator", "()Landroid/animation/ValueAnimator;", "cornerAnimator", "getDefaultCornerRadius", "defaultCornerRadius", "isRoundCorners", "()Z", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShellNavBarCornersManagerImpl implements ShellNavBarCornerManager {

    @NotNull
    private final AppBarLayout appBar;

    /* renamed from: appBarRect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j appBarRect;
    private ShellNavBarVO boundedData;

    @NotNull
    private final CollapsingToolbarLayout collapsingToolbar;
    private RecyclerView composerRecyclerView;

    @NotNull
    private final ViewGroup composerRootView;

    /* renamed from: cornerAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cornerAnimator;

    /* renamed from: cornerRadius$delegate, reason: from kotlin metadata */
    @NotNull
    private final f cornerRadius;

    @NotNull
    private final View.OnLayoutChangeListener cornerRadiusListener;

    @NotNull
    private final ViewTreeObserver.OnDrawListener cornerRadiusListenerV2;

    /* renamed from: dp24$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp24;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final Handler handler;
    private boolean isStickyVisible;
    private int prevOffset;
    private int prevScrollDy;

    @NotNull
    private final ShellNavBarCornersManagerImpl$scrollListener$1 scrollListener;

    @NotNull
    private final ViewGroup stickyContainer;
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {w.c(ShellNavBarCornersManagerImpl.class, "cornerRadius", "getCornerRadius()I", 0)};

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornersManagerImpl$Companion;", "", "<init>", "()V", "ANIMATION_DURATION_MS", "", "ZERO_OFFSET", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.recyclerview.widget.RecyclerView$t, ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerImpl$scrollListener$1] */
    public ShellNavBarCornersManagerImpl(@NotNull ViewGroup composerRootView, @NotNull CollapsingToolbarLayout collapsingToolbar, @NotNull AppBarLayout appBar, @NotNull ViewGroup stickyContainer, @NotNull FeatureChecker featureChecker) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(collapsingToolbar, "collapsingToolbar");
        Intrinsics.checkNotNullParameter(appBar, "appBar");
        Intrinsics.checkNotNullParameter(stickyContainer, "stickyContainer");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.composerRootView = composerRootView;
        this.collapsingToolbar = collapsingToolbar;
        this.appBar = appBar;
        this.stickyContainer = stickyContainer;
        this.featureChecker = featureChecker;
        this.dp24 = LazyUtilsKt.unsafeLazy(ShellNavBarCornersManagerImpl$dp24$2.INSTANCE);
        this.appBarRect = LazyUtilsKt.unsafeLazy(ShellNavBarCornersManagerImpl$appBarRect$2.INSTANCE);
        this.handler = new Handler(Looper.getMainLooper());
        ?? r32 = new RecyclerView.t() { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerImpl$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                super.onScrolled(recyclerView2, dx, dy);
                ShellNavBarCornersManagerImpl.this.prevScrollDy = dy;
            }
        };
        this.scrollListener = r32;
        this.cornerRadiusListener = new ViewOnLayoutChangeListenerC6887a(this, 0);
        this.cornerRadiusListenerV2 = new ViewTreeObserver.OnDrawListener() { // from class: hL.b
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                ShellNavBarCornersManagerImpl.this.setStickyAppearance();
            }
        };
        final Integer valueOf = Integer.valueOf(getDefaultCornerRadius());
        this.cornerRadius = new c<Integer>(valueOf) { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerImpl$special$$inlined$observable$1
            @Override // id.c
            protected void afterChange(m<?> property, Integer oldValue, Integer newValue) {
                CollapsingToolbarLayout collapsingToolbarLayout;
                Intrinsics.checkNotNullParameter(property, "property");
                if (oldValue.intValue() != newValue.intValue()) {
                    collapsingToolbarLayout = this.collapsingToolbar;
                    collapsingToolbarLayout.invalidateOutline();
                }
            }
        };
        this.cornerAnimator = LazyUtilsKt.unsafeLazy(new ShellNavBarCornersManagerImpl$cornerAnimator$2(this));
        RecyclerView composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(composerRootView);
        if (composerRecyclerViewOrNull != 0) {
            composerRecyclerViewOrNull.addOnScrollListener(r32);
            recyclerView = composerRecyclerViewOrNull;
        } else {
            recyclerView = null;
        }
        this.composerRecyclerView = recyclerView;
        observeStickyContainer();
    }

    private final void configCorners(ShellNavBarVO item) {
        setToolbarOutlineProvider();
        setCornerRadius((item.getDisableRounding() || !item.getIsRounded()) ? 0 : getDefaultCornerRadius());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cornerRadiusListener$lambda$1(ShellNavBarCornersManagerImpl shellNavBarCornersManagerImpl, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        shellNavBarCornersManagerImpl.handler.post(new RunnableC3170a(shellNavBarCornersManagerImpl, 6));
    }

    private final Rect getAppBarRect() {
        return (Rect) this.appBarRect.getValue();
    }

    private final ValueAnimator getCornerAnimator() {
        return (ValueAnimator) this.cornerAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getCornerRadius() {
        return ((Number) this.cornerRadius.getValue(this, $$delegatedProperties[0])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDefaultCornerRadius() {
        ShellNavBarVO shellNavBarVO = this.boundedData;
        if (shellNavBarVO == null || !shellNavBarVO.getDisableRounding()) {
            return getDp24();
        }
        return 0;
    }

    private final int getDp24() {
        return ((Number) this.dp24.getValue()).intValue();
    }

    private final boolean isRoundCorners() {
        return getCornerRadius() != 0;
    }

    private final void observeStickyContainer() {
        if (!this.featureChecker.isEnabled(NavBarV2OnDrawCallbackFlag.INSTANCE)) {
            this.stickyContainer.addOnLayoutChangeListener(this.cornerRadiusListener);
            return;
        }
        try {
            r.Companion companion = r.INSTANCE;
            this.stickyContainer.getViewTreeObserver().addOnDrawListener(this.cornerRadiusListenerV2);
            Unit unit = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            s.a(th2);
        }
    }

    private final void playCornerAnimationOnScroll(int offset) {
        ShellNavBarVO shellNavBarVO;
        ShellNavBarVO shellNavBarVO2 = this.boundedData;
        if (shellNavBarVO2 != null && shellNavBarVO2.getDisableRounding()) {
            setCornerRadius(getDefaultCornerRadius());
            return;
        }
        if (offset < 0 && !isRoundCorners() && !this.isStickyVisible) {
            getCornerAnimator().start();
        }
        if (offset != 0 || (shellNavBarVO = this.boundedData) == null || shellNavBarVO.getIsRounded() || !isRoundCorners()) {
            return;
        }
        getCornerAnimator().reverse();
    }

    private final void removeStickyContainerObserver() {
        if (!this.featureChecker.isEnabled(NavBarV2OnDrawCallbackFlag.INSTANCE)) {
            this.stickyContainer.removeOnLayoutChangeListener(this.cornerRadiusListener);
            return;
        }
        try {
            r.Companion companion = r.INSTANCE;
            this.stickyContainer.getViewTreeObserver().removeOnDrawListener(this.cornerRadiusListenerV2);
            Unit unit = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            s.a(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCornerRadius(int i11) {
        this.cornerRadius.setValue(this, $$delegatedProperties[0], Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStickyAppearance() {
        this.appBar.getGlobalVisibleRect(getAppBarRect());
        boolean z11 = this.stickyContainer.getMeasuredHeight() > 0 && getAppBarRect().bottom == C6915b.c(this.stickyContainer.getY());
        boolean z12 = this.isStickyVisible != z11;
        this.isStickyVisible = z11;
        ShellNavBarVO shellNavBarVO = this.boundedData;
        if ((!z11 && !z12) || this.prevOffset == 0) {
            getCornerAnimator().cancel();
            if (shellNavBarVO != null && !shellNavBarVO.getDisableRounding() && (shellNavBarVO.getIsRounded() || this.prevOffset != 0)) {
                r2 = getDefaultCornerRadius();
            }
            setCornerRadius(r2);
            this.isStickyVisible = z11;
            return;
        }
        if (z12) {
            if (z11) {
                if (this.prevScrollDy != 0) {
                    getCornerAnimator().reverse();
                    return;
                } else {
                    getCornerAnimator().cancel();
                    setCornerRadius(0);
                    return;
                }
            }
            if (this.prevScrollDy != 0 && shellNavBarVO != null && !shellNavBarVO.getDisableRounding()) {
                getCornerAnimator().start();
            } else {
                getCornerAnimator().cancel();
                setCornerRadius(z11 ? 0 : getDefaultCornerRadius());
            }
        }
    }

    private final void setToolbarOutlineProvider() {
        this.collapsingToolbar.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerImpl$setToolbarOutlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                int cornerRadius;
                int cornerRadius2;
                int width = view != null ? view.getWidth() : 0;
                int height = view != null ? view.getHeight() : 0;
                if (outline != null) {
                    cornerRadius = ShellNavBarCornersManagerImpl.this.getCornerRadius();
                    int i11 = 0 - cornerRadius;
                    cornerRadius2 = ShellNavBarCornersManagerImpl.this.getCornerRadius();
                    outline.setRoundRect(0, i11, width, height, cornerRadius2);
                }
            }
        });
        this.collapsingToolbar.setClipToOutline(true);
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornerManager
    public void onBind(@NotNull ShellNavBarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundedData = item;
        this.prevScrollDy = 0;
        configCorners(item);
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornerManager
    public void onNavbarOffsetChanged(int offset, int dy) {
        this.prevOffset = offset;
        ShellNavBarVO shellNavBarVO = this.boundedData;
        if (shellNavBarVO == null || shellNavBarVO.getDisableRounding()) {
            return;
        }
        playCornerAnimationOnScroll(offset);
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornerManager
    public void onViewDetached() {
        RecyclerView recyclerView = this.composerRecyclerView;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.scrollListener);
        }
        removeStickyContainerObserver();
        this.handler.removeCallbacksAndMessages(null);
    }
}
