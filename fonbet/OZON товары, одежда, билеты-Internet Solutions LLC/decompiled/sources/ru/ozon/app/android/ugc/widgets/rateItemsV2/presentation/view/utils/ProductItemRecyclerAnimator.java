package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils;

import Bi.a;
import E.RunnableC2901q;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import c3.C5740b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.adapter.RateItemsV2Adapter;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils.ProductItemRecyclerAnimator;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/utils/ProductItemRecyclerAnimator;", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onAnimationStart", "Lkotlin/Function0;", "", "onAnimationEnded", "", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "animateRateItemsRecycler", "expandItemToFullWidth", "smoothScroll", "animateItemRightMargin", "linearInterpolation", "", "start", "end", "fraction", "", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductItemRecyclerAnimator {

    @NotNull
    private final Function0<Unit> onAnimationEnded;

    @NotNull
    private final Function0<Boolean> onAnimationStart;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/utils/ProductItemRecyclerAnimator$Companion;", "", "<init>", "()V", "ANIMATION_DURATION", "", "MARGIN_ANIMATION_DURATION", "WIDTH_PADDING_DP", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ProductItemRecyclerAnimator(@NotNull RecyclerView recyclerView, @NotNull Function0<Boolean> onAnimationStart, @NotNull Function0<Unit> onAnimationEnded) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(onAnimationStart, "onAnimationStart");
        Intrinsics.checkNotNullParameter(onAnimationEnded, "onAnimationEnded");
        this.recyclerView = recyclerView;
        this.onAnimationStart = onAnimationStart;
        this.onAnimationEnded = onAnimationEnded;
    }

    private final void animateItemRightMargin() {
        RecyclerView.g adapter = this.recyclerView.getAdapter();
        RateItemsV2Adapter rateItemsV2Adapter = adapter instanceof RateItemsV2Adapter ? (RateItemsV2Adapter) adapter : null;
        if (rateItemsV2Adapter != null && rateItemsV2Adapter.getShimmersCount() >= 2) {
            final RecyclerView.C findViewHolderForAdapterPosition = this.recyclerView.findViewHolderForAdapterPosition(rateItemsV2Adapter.getShimmersCount() - 2);
            if (findViewHolderForAdapterPosition == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = findViewHolderForAdapterPosition.itemView.getLayoutParams();
            final RecyclerView.p pVar = layoutParams instanceof RecyclerView.p ? (RecyclerView.p) layoutParams : null;
            if (pVar == null) {
                return;
            }
            Dimens dimens = Dimens.INSTANCE;
            ValueAnimator ofInt = ValueAnimator.ofInt(dimens.getDP_16(), dimens.getDP_8());
            ofInt.setDuration(250L);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nW.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ProductItemRecyclerAnimator.animateItemRightMargin$lambda$8$lambda$7(RecyclerView.p.this, findViewHolderForAdapterPosition, valueAnimator);
                }
            });
            ofInt.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateItemRightMargin$lambda$8$lambda$7(RecyclerView.p pVar, RecyclerView.C c11, ValueAnimator valueAnimator) {
        ((ViewGroup.MarginLayoutParams) pVar).rightMargin = ((Integer) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
        c11.itemView.setLayoutParams(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateRateItemsRecycler$lambda$2$lambda$1(ProductItemRecyclerAnimator productItemRecyclerAnimator, int i11, int i12, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        float animatedFraction = animator.getAnimatedFraction();
        int childCount = productItemRecyclerAnimator.recyclerView.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = productItemRecyclerAnimator.recyclerView.getChildAt(i13);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.width = productItemRecyclerAnimator.linearInterpolation(i11, i12, animatedFraction);
            childAt.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r7 != (r4 != null ? r4.bottomMargin : 0)) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void expandItemToFullWidth$lambda$6(ProductItemRecyclerAnimator productItemRecyclerAnimator) {
        View view;
        RecyclerView.C findViewHolderForAdapterPosition = productItemRecyclerAnimator.recyclerView.findViewHolderForAdapterPosition(0);
        if (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            Dimens dimens = Dimens.INSTANCE;
            marginLayoutParams.leftMargin = dimens.getDP_16();
            marginLayoutParams.rightMargin = dimens.getDP_16();
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            view.setLayoutParams(marginLayoutParams);
        }
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        int i15 = layoutParams5.height;
        int i16 = layoutParams5.width;
        int width = productItemRecyclerAnimator.recyclerView.getWidth() - Dimens.INSTANCE.getDP_32();
        layoutParams5.width = width;
        if (i15 == layoutParams5.height && i16 == width) {
            return;
        }
        view.setLayoutParams(layoutParams5);
    }

    private final int linearInterpolation(int start, int end, float fraction) {
        return (int) (((end - start) * fraction) + start);
    }

    private final void smoothScroll() {
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        final Context context = this.recyclerView.getContext();
        r rVar = new r(context) { // from class: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils.ProductItemRecyclerAnimator$smoothScroll$scroller$1
            @Override // androidx.recyclerview.widget.r
            protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                RecyclerView recyclerView;
                Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                recyclerView = ProductItemRecyclerAnimator.this.recyclerView;
                return 350.0f / recyclerView.getWidth();
            }

            @Override // androidx.recyclerview.widget.r
            protected int getHorizontalSnapPreference() {
                return 1;
            }
        };
        rVar.setTargetPosition(findLastVisibleItemPosition + 1);
        this.recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils.ProductItemRecyclerAnimator$smoothScroll$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Function0 function0;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    recyclerView.removeOnScrollListener(this);
                    function0 = ProductItemRecyclerAnimator.this.onAnimationEnded;
                    function0.invoke();
                }
            }
        });
        linearLayoutManager.startSmoothScroll(rVar);
    }

    public final void animateRateItemsRecycler() {
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        if (!this.onAnimationStart.invoke().booleanValue()) {
            this.onAnimationEnded.invoke();
            return;
        }
        RecyclerView.g adapter = this.recyclerView.getAdapter();
        if (adapter == null || adapter.getShimmersCount() != 1) {
            animateItemRightMargin();
            if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() != 0) {
                smoothScroll();
                return;
            }
            final int width = this.recyclerView.getChildAt(0).getWidth();
            final int width2 = this.recyclerView.getWidth() - ResourceExtKt.toPx(64);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(350L);
            ofFloat.setInterpolator(new C5740b());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nW.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ProductItemRecyclerAnimator.animateRateItemsRecycler$lambda$2$lambda$1(ProductItemRecyclerAnimator.this, width, width2, valueAnimator);
                }
            });
            ofFloat.start();
            smoothScroll();
        }
    }

    public final void expandItemToFullWidth() {
        this.recyclerView.post(new RunnableC2901q(this, 4));
    }
}
