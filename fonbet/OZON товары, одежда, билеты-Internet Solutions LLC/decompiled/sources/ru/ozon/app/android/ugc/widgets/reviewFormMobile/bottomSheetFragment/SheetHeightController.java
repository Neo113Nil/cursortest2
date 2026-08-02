package ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment;

import Xc.a;
import Xc.b;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import hd.C6915b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qW.c;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.SheetHeightController;
import v10.C10183a;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 82\u00020\u0001:\u000289B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0005J\u0016\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005J\u0006\u0010'\u001a\u00020!JG\u0010(\u001a\u00020!2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\b\u0010,\u001a\u0004\u0018\u00010\u00052\u0006\u0010-\u001a\u00020\u001e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020!0/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020!0/¢\u0006\u0002\u00101J\u0014\u00102\u001a\u00020!2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\u0006\u00103\u001a\u00020\u0005J\u0006\u00104\u001a\u00020!J\b\u00105\u001a\u00020\u0005H\u0002J\b\u00106\u001a\u00020\u0005H\u0002J\f\u00107\u001a\u00020!*\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001f¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/SheetHeightController;", "", "rootView", "Landroid/view/View;", "screenHeight", "", "restoredPeekHeight", "<init>", "(Landroid/view/View;II)V", "renderState", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/SheetHeightController$RenderState;", "revealAnimator", "Landroid/animation/ValueAnimator;", "visibleFrame", "Landroid/graphics/Rect;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "peekContentHeight", "getPeekContentHeight", "()I", "recyclerview", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerview", "()Landroidx/recyclerview/widget/RecyclerView;", "contentViews", "", "getContentViews", "()Ljava/util/List;", "availableHeight", "getAvailableHeight", "isAwaitingReveal", "", "()Z", "setCoordinatorHeight", "", "height", "applySlideHeight", "fraction", "", "maxHeight", "hideContentViews", "revealSheet", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "fullScreenRestoreHeight", "alreadyRevealed", "onFirstRevealStarted", "Lkotlin/Function0;", "onRevealCompleted", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "syncPeekHeight", "committedItemCount", "clear", "measureRecyclerNaturalHeight", "resolveTargetHeight", "fadeIn", "Companion", "RenderState", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SheetHeightController {
    private int peekContentHeight;

    @NotNull
    private RenderState renderState;
    private ValueAnimator revealAnimator;

    @NotNull
    private final View rootView;
    private final int screenHeight;

    @NotNull
    private final Rect visibleFrame;
    public static final int $stable = 8;
    private static final int PEEK_TOP_MIN_SPACE = Dimens.INSTANCE.getDP_32();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/SheetHeightController$RenderState;", "", "<init>", "(Ljava/lang/String;I)V", "AWAITING_RENDER", "ANIMATING", "READY", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RenderState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RenderState[] $VALUES;
        public static final RenderState AWAITING_RENDER = new RenderState("AWAITING_RENDER", 0);
        public static final RenderState ANIMATING = new RenderState("ANIMATING", 1);
        public static final RenderState READY = new RenderState("READY", 2);

        private static final /* synthetic */ RenderState[] $values() {
            return new RenderState[]{AWAITING_RENDER, ANIMATING, READY};
        }

        static {
            RenderState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RenderState(String str, int i11) {
        }

        public static RenderState valueOf(String str) {
            return (RenderState) Enum.valueOf(RenderState.class, str);
        }

        public static RenderState[] values() {
            return (RenderState[]) $VALUES.clone();
        }
    }

    public SheetHeightController(@NotNull View rootView, int i11, int i12) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.rootView = rootView;
        this.screenHeight = i11;
        this.renderState = RenderState.AWAITING_RENDER;
        this.visibleFrame = new Rect();
        Integer valueOf = Integer.valueOf(i12);
        valueOf = valueOf.intValue() <= 0 ? null : valueOf;
        this.peekContentHeight = valueOf != null ? valueOf.intValue() : ComposerScreenConfig.BottomSheetConfig.INSTANCE.getMIN_HEIGHT_DEFAULT();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fadeIn(View view) {
        view.animate().alpha(1.0f).setDuration(250L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAvailableHeight() {
        this.rootView.getWindowVisibleDisplayFrame(this.visibleFrame);
        Integer valueOf = Integer.valueOf(this.visibleFrame.height());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int intValue = (valueOf != null ? valueOf.intValue() : this.screenHeight) - PEEK_TOP_MIN_SPACE;
        int min_height_default = ComposerScreenConfig.BottomSheetConfig.INSTANCE.getMIN_HEIGHT_DEFAULT();
        return intValue < min_height_default ? min_height_default : intValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<View> getContentViews() {
        return C7714v.b0(getRecyclerview(), ComposerViewExtensionKt.composerTopContainer(this.rootView), C10183a.c(this.rootView));
    }

    private final RecyclerView getRecyclerview() {
        return ComposerViewExtensionKt.composerRecyclerView(this.rootView);
    }

    private final int measureRecyclerNaturalHeight() {
        getRecyclerview().measure(View.MeasureSpec.makeMeasureSpec(getRecyclerview().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.screenHeight, LinearLayoutManager.INVALID_OFFSET));
        return getRecyclerview().getMeasuredHeight();
    }

    private final int resolveTargetHeight() {
        int max = Math.max(measureRecyclerNaturalHeight(), ComposerScreenConfig.BottomSheetConfig.INSTANCE.getMIN_HEIGHT_DEFAULT());
        int availableHeight = getAvailableHeight();
        return max > availableHeight ? availableHeight : max;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void revealSheet$lambda$9$lambda$5(BottomSheetBehavior bottomSheetBehavior, SheetHeightController sheetHeightController, ValueAnimator valueAnimator) {
        int intValue = ((Integer) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
        int availableHeight = sheetHeightController.getAvailableHeight();
        if (intValue > availableHeight) {
            intValue = availableHeight;
        }
        bottomSheetBehavior.setPeekHeight(intValue);
    }

    public final void applySlideHeight(float fraction, int maxHeight) {
        setCoordinatorHeight(C6915b.c((fraction * maxHeight) + ((1.0f - fraction) * this.peekContentHeight)));
    }

    public final void clear() {
        ValueAnimator valueAnimator = this.revealAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
        }
        this.revealAnimator = null;
    }

    public final int committedItemCount() {
        RecyclerView.g adapter = getRecyclerview().getAdapter();
        if (adapter != null) {
            return adapter.getShimmersCount();
        }
        return 0;
    }

    public final int getPeekContentHeight() {
        return this.peekContentHeight;
    }

    public final void hideContentViews() {
        Iterator<T> it = getContentViews().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(0.0f);
        }
    }

    public final boolean isAwaitingReveal() {
        return this.renderState == RenderState.AWAITING_RENDER;
    }

    public final void revealSheet(@NotNull final BottomSheetBehavior<FrameLayout> behavior, Integer fullScreenRestoreHeight, boolean alreadyRevealed, @NotNull final Function0<Unit> onFirstRevealStarted, @NotNull final Function0<Unit> onRevealCompleted) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(onFirstRevealStarted, "onFirstRevealStarted");
        Intrinsics.checkNotNullParameter(onRevealCompleted, "onRevealCompleted");
        if (this.renderState != RenderState.AWAITING_RENDER) {
            return;
        }
        this.renderState = RenderState.ANIMATING;
        final int resolveTargetHeight = resolveTargetHeight();
        if (!alreadyRevealed) {
            int i11 = this.peekContentHeight;
            setCoordinatorHeight(resolveTargetHeight);
            ValueAnimator ofInt = ValueAnimator.ofInt(i11, resolveTargetHeight);
            ofInt.setDuration(300L);
            ofInt.setInterpolator(new DecelerateInterpolator(1.5f));
            ofInt.addUpdateListener(new c(0, behavior, this));
            ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.SheetHeightController$revealSheet$lambda$9$$inlined$doOnStart$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                    List contentViews;
                    Function0.this.invoke();
                    contentViews = this.getContentViews();
                    Iterator it = contentViews.iterator();
                    while (it.hasNext()) {
                        this.fadeIn((View) it.next());
                    }
                }
            });
            ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.SheetHeightController$revealSheet$lambda$9$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                    int availableHeight;
                    SheetHeightController.this.revealAnimator = null;
                    SheetHeightController.this.renderState = SheetHeightController.RenderState.READY;
                    SheetHeightController sheetHeightController = SheetHeightController.this;
                    int i12 = resolveTargetHeight;
                    availableHeight = sheetHeightController.getAvailableHeight();
                    if (i12 > availableHeight) {
                        i12 = availableHeight;
                    }
                    sheetHeightController.peekContentHeight = i12;
                    behavior.setPeekHeight(SheetHeightController.this.getPeekContentHeight());
                    onRevealCompleted.invoke();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }
            });
            ofInt.start();
            this.revealAnimator = ofInt;
            return;
        }
        Iterator<T> it = getContentViews().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(1.0f);
        }
        int i12 = this.peekContentHeight;
        int availableHeight = getAvailableHeight();
        if (i12 > availableHeight) {
            i12 = availableHeight;
        }
        this.peekContentHeight = i12;
        behavior.setPeekHeight(i12);
        if (fullScreenRestoreHeight != null) {
            i12 = fullScreenRestoreHeight.intValue();
        }
        setCoordinatorHeight(i12);
        this.renderState = RenderState.READY;
    }

    public final void setCoordinatorHeight(int height) {
        CoordinatorLayout composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(this.rootView);
        if (composerCoordinatorLayout != null) {
            ViewGroup.LayoutParams layoutParams = composerCoordinatorLayout.getLayoutParams();
            int i11 = layoutParams.height;
            layoutParams.height = height;
            if (i11 == height) {
                return;
            }
            composerCoordinatorLayout.setLayoutParams(layoutParams);
        }
    }

    public final void syncPeekHeight(@NotNull BottomSheetBehavior<FrameLayout> behavior) {
        int resolveTargetHeight;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        if (this.renderState != RenderState.READY || getRecyclerview().getVisibility() == 4 || (resolveTargetHeight = resolveTargetHeight()) <= 0 || resolveTargetHeight == this.peekContentHeight) {
            return;
        }
        this.peekContentHeight = resolveTargetHeight;
        behavior.setPeekHeight(resolveTargetHeight);
        setCoordinatorHeight(resolveTargetHeight);
    }
}
