package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui;

import Sc.o;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import jF.C7315a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.CharacteristicsGroupViewHolder;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002.1\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000289B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u000b*\u00020\u00052\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u00020\u000b*\u00020\u00052\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0014\u0010)\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00106\u001a\n 5*\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Landroid/view/View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "carouselContainer", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/view/ViewGroup;", "composerContainer", "Lkotlin/Function1;", "", "", "onElevationChanged", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselViewModel;", "comparisonCarouselViewModel", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselViewModel;)V", "", "newHeight", "applyHeight", "(Landroid/view/ViewGroup;I)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$Mode;", "mode", "animateCarousel", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$Mode;)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "view", "setExpansionListener", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V", "removeExpansionListener", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/ViewGroup;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselViewModel;", "carouselMaxHeight", "I", "carouselMinHeight", "initialDiff", "F", "ru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$onScrollListener$1", "onScrollListener", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$onScrollListener$1;", "ru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$onChildAttachedListener$1", "onChildAttachedListener", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$onChildAttachedListener$1;", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animator", "Landroid/animation/ValueAnimator;", "Companion", "Mode", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComparisonCarouselBehavior extends CoordinatorLayout.c<View> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final ValueAnimator animator;

    @NotNull
    private final ConstraintLayout carouselContainer;
    private final int carouselMaxHeight;
    private final int carouselMinHeight;

    @NotNull
    private final ComparisonCarouselViewModel comparisonCarouselViewModel;

    @NotNull
    private final ViewGroup composerContainer;
    private float initialDiff;

    @NotNull
    private final ComparisonCarouselBehavior$onChildAttachedListener$1 onChildAttachedListener;

    @NotNull
    private final Function1<Float, Unit> onElevationChanged;

    @NotNull
    private final ComparisonCarouselBehavior$onScrollListener$1 onScrollListener;

    @NotNull
    private final RecyclerView recyclerView;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$Companion;", "", "<init>", "()V", "ELEVATION_COMPENSATION_VALUE", "", "CAROUSEL_EXPANSION_ANIMATION_DURATION", "", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0004\u0005J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$Mode;", "", "isCollapsed", "", "Collapsed", "Expanded", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$Mode$Collapsed;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$Mode$Expanded;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public interface Mode {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$Mode$Collapsed;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$Mode;", "<init>", "()V", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Collapsed implements Mode {

            @NotNull
            public static final Collapsed INSTANCE = new Collapsed();

            private Collapsed() {
            }

            @Override // ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselBehavior.Mode
            public boolean isCollapsed() {
                return DefaultImpls.isCollapsed(this);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class DefaultImpls {
            public static boolean isCollapsed(@NotNull Mode mode) {
                return Intrinsics.d(mode, Collapsed.INSTANCE);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$Mode$Expanded;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselBehavior$Mode;", "<init>", "()V", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Expanded implements Mode {

            @NotNull
            public static final Expanded INSTANCE = new Expanded();

            private Expanded() {
            }

            @Override // ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselBehavior.Mode
            public boolean isCollapsed() {
                return DefaultImpls.isCollapsed(this);
            }
        }

        boolean isCollapsed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.recyclerview.widget.RecyclerView$t, ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselBehavior$onScrollListener$1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.recyclerview.widget.RecyclerView$q, ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselBehavior$onChildAttachedListener$1] */
    public ComparisonCarouselBehavior(@NotNull ConstraintLayout carouselContainer, @NotNull RecyclerView recyclerView, @NotNull ViewGroup composerContainer, @NotNull Function1<? super Float, Unit> onElevationChanged, @NotNull ComparisonCarouselViewModel comparisonCarouselViewModel) {
        Intrinsics.checkNotNullParameter(carouselContainer, "carouselContainer");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(composerContainer, "composerContainer");
        Intrinsics.checkNotNullParameter(onElevationChanged, "onElevationChanged");
        Intrinsics.checkNotNullParameter(comparisonCarouselViewModel, "comparisonCarouselViewModel");
        this.carouselContainer = carouselContainer;
        this.recyclerView = recyclerView;
        this.composerContainer = composerContainer;
        this.onElevationChanged = onElevationChanged;
        this.comparisonCarouselViewModel = comparisonCarouselViewModel;
        int maxHeight = carouselContainer.getMaxHeight();
        this.carouselMaxHeight = maxHeight;
        int minHeight = carouselContainer.getMinHeight();
        this.carouselMinHeight = minHeight;
        this.initialDiff = maxHeight - minHeight;
        ?? r62 = new RecyclerView.t() { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselBehavior$onScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                ComparisonCarouselBehavior.this.onScrollStateChanged(recyclerView2, newState);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                ComparisonCarouselBehavior.this.onScrolled(recyclerView2, dx, dy);
            }
        };
        this.onScrollListener = r62;
        ?? r72 = new RecyclerView.q() { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselBehavior$onChildAttachedListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.q
            public void onChildViewAttachedToWindow(View view) {
                RecyclerView recyclerView2;
                Intrinsics.checkNotNullParameter(view, "view");
                ComparisonCarouselBehavior comparisonCarouselBehavior = ComparisonCarouselBehavior.this;
                recyclerView2 = comparisonCarouselBehavior.recyclerView;
                comparisonCarouselBehavior.setExpansionListener(recyclerView2, view);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.q
            public void onChildViewDetachedFromWindow(View view) {
                RecyclerView recyclerView2;
                Intrinsics.checkNotNullParameter(view, "view");
                ComparisonCarouselBehavior comparisonCarouselBehavior = ComparisonCarouselBehavior.this;
                recyclerView2 = comparisonCarouselBehavior.recyclerView;
                comparisonCarouselBehavior.removeExpansionListener(recyclerView2, view);
            }
        };
        this.onChildAttachedListener = r72;
        ValueAnimator ofInt = ValueAnimator.ofInt(minHeight, maxHeight);
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new C7315a(this, 0));
        this.animator = ofInt;
        recyclerView.addOnScrollListener(r62);
        recyclerView.addOnChildAttachStateChangeListener(r72);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateCarousel(Mode mode) {
        int[] iArr;
        if (Intrinsics.d(this.comparisonCarouselViewModel.getCarouselBehaviorMode(), mode)) {
            return;
        }
        this.comparisonCarouselViewModel.setCarouselBehaviorMode(mode);
        if (Intrinsics.d(mode, Mode.Collapsed.INSTANCE)) {
            iArr = new int[]{this.carouselMaxHeight, this.carouselMinHeight};
        } else {
            if (!Intrinsics.d(mode, Mode.Expanded.INSTANCE)) {
                throw new o();
            }
            iArr = new int[]{this.carouselMinHeight, this.carouselMaxHeight};
        }
        int[] iArr2 = (int[]) WhenExtKt.getExhaustive(iArr);
        this.animator.cancel();
        this.animator.setIntValues(Arrays.copyOf(iArr2, iArr2.length));
        this.animator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animator$lambda$2$lambda$1(ComparisonCarouselBehavior comparisonCarouselBehavior, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        if (num != null) {
            comparisonCarouselBehavior.applyHeight(comparisonCarouselBehavior.carouselContainer, num.intValue());
        }
    }

    private final void applyHeight(ViewGroup viewGroup, int i11) {
        int i12 = this.carouselMinHeight;
        float f7 = (i11 - i12) / this.initialDiff;
        if (f7 >= 1.0f || i11 > this.carouselMaxHeight) {
            f7 = 1.0f;
        } else if (f7 <= 0.0f || i11 < i12) {
            f7 = 0.0f;
        }
        for (View view : ViewGroupExtKt.children(this.carouselContainer)) {
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                RecyclerView.g adapter = recyclerView.getAdapter();
                ComparisonCarouselAdapter comparisonCarouselAdapter = adapter instanceof ComparisonCarouselAdapter ? (ComparisonCarouselAdapter) adapter : null;
                if (comparisonCarouselAdapter != null) {
                    comparisonCarouselAdapter.setCurrentScalingPercent(f7);
                    comparisonCarouselAdapter.setContainerHeight(i11);
                    Context context = viewGroup.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    if (!ThemeExtKt.isDarkThemeActive(context)) {
                        this.onElevationChanged.invoke(Float.valueOf((1.0f - f7) * 30));
                    }
                    ViewGroup viewGroup2 = (ViewGroup) view;
                    int childCount = viewGroup2.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        RecyclerView.C childViewHolder = recyclerView.getChildViewHolder(viewGroup2.getChildAt(i13));
                        ComparisonCarouselProductViewHolder comparisonCarouselProductViewHolder = childViewHolder instanceof ComparisonCarouselProductViewHolder ? (ComparisonCarouselProductViewHolder) childViewHolder : null;
                        if (comparisonCarouselProductViewHolder != null) {
                            comparisonCarouselProductViewHolder.applyTransformationsToViewHolder(f7, i11);
                        }
                    }
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.height = i11;
                    viewGroup.setLayoutParams(layoutParams2);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        if (!this.animator.isRunning() && newState == 0) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition()) : null;
            if (valueOf == null || valueOf.intValue() != 0) {
                animateCarousel(Mode.Collapsed.INSTANCE);
            } else if (valueOf.intValue() == 0) {
                animateCarousel(Mode.Expanded.INSTANCE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        if (dy == 0 || dx != 0 || this.animator.isRunning()) {
            return;
        }
        if (dy <= 0 || this.carouselContainer.getMeasuredHeight() != this.carouselMinHeight) {
            if (dy > 0 || this.carouselContainer.getMeasuredHeight() != this.carouselMaxHeight) {
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition()) : null;
                if (dy > 0 && (valueOf == null || valueOf.intValue() != 0)) {
                    animateCarousel(Mode.Collapsed.INSTANCE);
                } else {
                    if (dy > 0 || valueOf == null || valueOf.intValue() != 0) {
                        return;
                    }
                    animateCarousel(Mode.Expanded.INSTANCE);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeExpansionListener(RecyclerView recyclerView, View view) {
        RecyclerView.C childViewHolder = recyclerView.getChildViewHolder(view);
        CharacteristicsGroupViewHolder characteristicsGroupViewHolder = childViewHolder instanceof CharacteristicsGroupViewHolder ? (CharacteristicsGroupViewHolder) childViewHolder : null;
        if (characteristicsGroupViewHolder != null) {
            characteristicsGroupViewHolder.removeOnExpansionStateChangeListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setExpansionListener(RecyclerView recyclerView, View view) {
        RecyclerView.C childViewHolder = recyclerView.getChildViewHolder(view);
        CharacteristicsGroupViewHolder characteristicsGroupViewHolder = childViewHolder instanceof CharacteristicsGroupViewHolder ? (CharacteristicsGroupViewHolder) childViewHolder : null;
        if (characteristicsGroupViewHolder != null) {
            characteristicsGroupViewHolder.addOnExpansionStateChangeListener(new ComparisonCarouselBehavior$setExpansionListener$1(this, recyclerView));
        }
    }
}
