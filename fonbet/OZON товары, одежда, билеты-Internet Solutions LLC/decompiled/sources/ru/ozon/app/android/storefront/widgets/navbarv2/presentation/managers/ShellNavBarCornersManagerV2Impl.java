package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers;

import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerV2Impl;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarVO;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u000e*\u0001>\b\u0001\u0018\u0000 J2\u00020\u0001:\u0001JB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001b\u0010%\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010*\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b.\u0010+\"\u0004\b/\u0010-R$\u00100\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b0\u0010+\"\u0004\b1\u0010-R\u0016\u00102\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010+R\u0016\u00103\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010+R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00104R\u0016\u00105\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0018\u00106\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0014\u0010G\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0013R\u0014\u0010I\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0013¨\u0006K"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornersManagerV2Impl;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornerManager;", "Landroid/view/ViewGroup;", "composerRootView", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbar", "stickyContainer", "<init>", "(Landroid/view/ViewGroup;Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroid/view/ViewGroup;)V", "", "computeCorners", "()V", "makeCorners", "removeCorners", "setToolbarOutlineProvider", "observeStickyContainer", "removeStickyContainerObserver", "", "isDisableRounding", "()Z", "isRichPromoEnabled", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "item", "onBind", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;)V", "onViewDetached", "", "offset", "dy", "onNavbarOffsetChanged", "(II)V", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "Landroid/view/ViewGroup;", "defaultCornerRadius$delegate", "LSc/j;", "getDefaultCornerRadius", "()I", "defaultCornerRadius", "Landroid/animation/ValueAnimator;", "currentAnimator", "Landroid/animation/ValueAnimator;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "cornerRadius", "I", "setCornerRadius", "(I)V", "navbarOffset", "setNavbarOffset", "verticalScrollOffset", "setVerticalScrollOffset", "scrollDy", "offsetDy", "Z", "hasSticky", "boundData", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "Landroidx/recyclerview/widget/RecyclerView;", "composerRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/View$OnLayoutChangeListener;", "cornerRadiusListener", "Landroid/view/View$OnLayoutChangeListener;", "ru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornersManagerV2Impl$scrollListener$1", "scrollListener", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornersManagerV2Impl$scrollListener$1;", "getCornerAnimator", "()Landroid/animation/ValueAnimator;", "cornerAnimator", "getReversCornerAnimator", "reversCornerAnimator", "getNavbarCollapsed", "navbarCollapsed", "getScrolledByUser", "scrolledByUser", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarCornersManagerV2Impl implements ShellNavBarCornerManager {
    private ShellNavBarVO boundData;

    @NotNull
    private final CollapsingToolbarLayout collapsingToolbar;
    private RecyclerView composerRecyclerView;
    private int cornerRadius;

    @NotNull
    private final View.OnLayoutChangeListener cornerRadiusListener;
    private ValueAnimator currentAnimator;

    /* renamed from: defaultCornerRadius$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultCornerRadius;
    private boolean hasSticky;
    private boolean isRichPromoEnabled;
    private int navbarOffset;
    private int offsetDy;
    private int scrollDy;

    @NotNull
    private final ShellNavBarCornersManagerV2Impl$scrollListener$1 scrollListener;

    @NotNull
    private final ViewGroup stickyContainer;
    private int verticalScrollOffset;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornersManagerV2Impl$Companion;", "", "<init>", "()V", "ANIMATION_DURATION_MS", "", "ZERO", "", "RICH_PROMO_SCROLL_FLAG", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.recyclerview.widget.RecyclerView$t, ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerV2Impl$scrollListener$1] */
    public ShellNavBarCornersManagerV2Impl(@NotNull ViewGroup composerRootView, @NotNull CollapsingToolbarLayout collapsingToolbar, @NotNull ViewGroup stickyContainer) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(collapsingToolbar, "collapsingToolbar");
        Intrinsics.checkNotNullParameter(stickyContainer, "stickyContainer");
        this.collapsingToolbar = collapsingToolbar;
        this.stickyContainer = stickyContainer;
        this.defaultCornerRadius = LazyUtilsKt.unsafeLazy(ShellNavBarCornersManagerV2Impl$defaultCornerRadius$2.INSTANCE);
        this.cornerRadiusListener = new View.OnLayoutChangeListener() { // from class: hL.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                ShellNavBarCornersManagerV2Impl.cornerRadiusListener$lambda$6(ShellNavBarCornersManagerV2Impl.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        ?? r32 = new RecyclerView.t() { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerV2Impl$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                int i11;
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                ShellNavBarCornersManagerV2Impl.this.scrollDy = dy;
                i11 = ShellNavBarCornersManagerV2Impl.this.navbarOffset;
                if (i11 != 0) {
                    return;
                }
                ShellNavBarCornersManagerV2Impl.this.setVerticalScrollOffset(recyclerView2.computeVerticalScrollOffset());
            }
        };
        this.scrollListener = r32;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_cornerAnimator_$lambda$1$lambda$0(ShellNavBarCornersManagerV2Impl shellNavBarCornersManagerV2Impl, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        shellNavBarCornersManagerV2Impl.setCornerRadius(num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_reversCornerAnimator_$lambda$4$lambda$3(ShellNavBarCornersManagerV2Impl shellNavBarCornersManagerV2Impl, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        shellNavBarCornersManagerV2Impl.setCornerRadius(num != null ? num.intValue() : 0);
    }

    private final void computeCorners() {
        ShellNavBarVO shellNavBarVO;
        if (isDisableRounding() || isRichPromoEnabled()) {
            return;
        }
        if (this.hasSticky) {
            removeCorners();
        } else if (getNavbarCollapsed() || ((shellNavBarVO = this.boundData) != null && shellNavBarVO.getIsRounded())) {
            makeCorners();
        } else {
            removeCorners();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cornerRadiusListener$lambda$6(ShellNavBarCornersManagerV2Impl shellNavBarCornersManagerV2Impl, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        shellNavBarCornersManagerV2Impl.hasSticky = i14 - i12 != 0;
        shellNavBarCornersManagerV2Impl.computeCorners();
    }

    private final ValueAnimator getCornerAnimator() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.cornerRadius, getDefaultCornerRadius());
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new Qx.a(this, 2));
        this.currentAnimator = ofInt;
        Intrinsics.checkNotNullExpressionValue(ofInt, "also(...)");
        return ofInt;
    }

    private final int getDefaultCornerRadius() {
        return ((Number) this.defaultCornerRadius.getValue()).intValue();
    }

    private final boolean getNavbarCollapsed() {
        return (this.navbarOffset == 0 && this.verticalScrollOffset == 0) ? false : true;
    }

    private final ValueAnimator getReversCornerAnimator() {
        ValueAnimator ofInt = ValueAnimator.ofInt(this.cornerRadius, 0);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new AX.a(this, 3));
        this.currentAnimator = ofInt;
        Intrinsics.checkNotNullExpressionValue(ofInt, "also(...)");
        return ofInt;
    }

    private final boolean getScrolledByUser() {
        return (this.scrollDy == 0 && this.offsetDy == 0) ? false : true;
    }

    private final boolean isDisableRounding() {
        ShellNavBarVO shellNavBarVO = this.boundData;
        if (shellNavBarVO != null && shellNavBarVO.getDisableRounding()) {
            ValueAnimator valueAnimator = this.currentAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            setCornerRadius(0);
        }
        ShellNavBarVO shellNavBarVO2 = this.boundData;
        if (shellNavBarVO2 != null) {
            return shellNavBarVO2.getDisableRounding();
        }
        return false;
    }

    private final boolean isRichPromoEnabled() {
        if (this.isRichPromoEnabled && this.verticalScrollOffset < 48) {
            ValueAnimator valueAnimator = this.currentAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            setCornerRadius(0);
        }
        return this.isRichPromoEnabled && this.verticalScrollOffset < 48;
    }

    private final void makeCorners() {
        if (isDisableRounding() || isRichPromoEnabled()) {
            return;
        }
        if (!getScrolledByUser()) {
            setCornerRadius(getDefaultCornerRadius());
            return;
        }
        ValueAnimator valueAnimator = this.currentAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        getCornerAnimator().start();
    }

    private final void observeStickyContainer() {
        try {
            r.Companion companion = r.INSTANCE;
            this.stickyContainer.addOnLayoutChangeListener(this.cornerRadiusListener);
            Unit unit = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            s.a(th2);
        }
    }

    private final void removeCorners() {
        if (isDisableRounding() || isRichPromoEnabled()) {
            return;
        }
        if (!getScrolledByUser()) {
            setCornerRadius(0);
            return;
        }
        ValueAnimator valueAnimator = this.currentAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        getReversCornerAnimator().start();
    }

    private final void removeStickyContainerObserver() {
        try {
            r.Companion companion = r.INSTANCE;
            this.stickyContainer.removeOnLayoutChangeListener(this.cornerRadiusListener);
            Unit unit = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            s.a(th2);
        }
    }

    private final void setCornerRadius(int i11) {
        int i12 = this.cornerRadius;
        this.cornerRadius = i11;
        if (i12 != i11) {
            this.collapsingToolbar.invalidateOutline();
        }
    }

    private final void setNavbarOffset(int i11) {
        int i12 = this.navbarOffset;
        if (i12 == i11) {
            return;
        }
        this.navbarOffset = i11;
        if ((i11 == 0 || i12 != 0) && (i11 != 0 || i12 == 0)) {
            return;
        }
        computeCorners();
    }

    private final void setToolbarOutlineProvider() {
        this.collapsingToolbar.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerV2Impl$setToolbarOutlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                int i11;
                int i12;
                int width = view != null ? view.getWidth() : 0;
                int height = view != null ? view.getHeight() : 0;
                if (outline != null) {
                    i11 = ShellNavBarCornersManagerV2Impl.this.cornerRadius;
                    int i13 = 0 - i11;
                    i12 = ShellNavBarCornersManagerV2Impl.this.cornerRadius;
                    outline.setRoundRect(0, i13, width, height, i12);
                }
            }
        });
        this.collapsingToolbar.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVerticalScrollOffset(int i11) {
        boolean z11;
        int i12 = this.verticalScrollOffset;
        if (i12 == i11) {
            return;
        }
        this.verticalScrollOffset = i11;
        if (this.navbarOffset != 0) {
            return;
        }
        if ((i11 == 0 || i12 != 0) && ((i11 != 0 || i12 == 0) && ((!(z11 = this.isRichPromoEnabled) || i11 <= 48 || i12 > 48) && (!z11 || i11 > 48 || i12 <= 48 || this.scrollDy >= 0)))) {
            return;
        }
        computeCorners();
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornerManager
    public void onBind(@NotNull ShellNavBarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundData = item;
        this.isRichPromoEnabled = item.getRichPromoSettings().getIsRichPromoEnabled();
        if (!isRichPromoEnabled()) {
            setToolbarOutlineProvider();
        }
        setCornerRadius((item.getDisableRounding() || !item.getIsRounded()) ? 0 : getDefaultCornerRadius());
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornerManager
    public void onNavbarOffsetChanged(int offset, int dy) {
        this.offsetDy = dy;
        setNavbarOffset(offset);
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornerManager
    public void onViewDetached() {
        RecyclerView recyclerView = this.composerRecyclerView;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.scrollListener);
        }
        removeStickyContainerObserver();
    }
}
