package ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsState;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0019\b\u0001\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\b¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010 \u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010%R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010#R\u0016\u0010,\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010%R\u0016\u0010-\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010#R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010%R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010%¨\u00062"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBehaviorStateHandler;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroidx/lifecycle/v;", "lifecycle", "", "isBottomSheetReturn", "Landroid/widget/FrameLayout;", "composerContainer", "", "bottomSheetMaxHeight", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetBehavior;", "behavior", "Lkotlin/Function0;", "isBottomSheetShown", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsState;", "", "state", "<init>", "(Landroidx/lifecycle/v;ZLandroid/widget/FrameLayout;ILru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetBehavior;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "bottomSheet", "newState", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "isEnable", "animationEnable", "(Z)V", "topCollapsedPosition", "setupExternalCollapsedCallback", "(I)V", "Z", "Landroid/widget/FrameLayout;", "I", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/RelatedProductsBottomSheetBehavior;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "getState", "()Lkotlin/jvm/functions/Function1;", "isExternalTapEvent", "topHalfPosition", "lastSlideOffset", "F", "isAnimatedBottomNavigation", "lastBottomSheetTop", "lastState", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RelatedProductsBehaviorStateHandler extends BottomSheetBehavior.f {
    private final RelatedProductsBottomSheetBehavior<FrameLayout> behavior;
    private final int bottomSheetMaxHeight;

    @NotNull
    private final FrameLayout composerContainer;
    private boolean isAnimatedBottomNavigation;
    private final boolean isBottomSheetReturn;

    @NotNull
    private final Function0<Boolean> isBottomSheetShown;
    private boolean isExternalTapEvent;
    private int lastBottomSheetTop;
    private float lastSlideOffset;
    private int lastState;

    @NotNull
    private final Function1<RelatedProductsState, Unit> state;
    private int topCollapsedPosition;
    private int topHalfPosition;

    /* JADX WARN: Multi-variable type inference failed */
    public RelatedProductsBehaviorStateHandler(@NotNull final AbstractC5434v lifecycle, boolean z11, @NotNull FrameLayout composerContainer, int i11, RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior, @NotNull Function0<Boolean> isBottomSheetShown, @NotNull Function1<? super RelatedProductsState, Unit> state) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(composerContainer, "composerContainer");
        Intrinsics.checkNotNullParameter(isBottomSheetShown, "isBottomSheetShown");
        Intrinsics.checkNotNullParameter(state, "state");
        this.isBottomSheetReturn = z11;
        this.composerContainer = composerContainer;
        this.bottomSheetMaxHeight = i11;
        this.behavior = relatedProductsBottomSheetBehavior;
        this.isBottomSheetShown = isBottomSheetShown;
        this.state = state;
        this.lastState = 4;
        lifecycle.a(new G() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBehaviorStateHandler.1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBehaviorStateHandler$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AbstractC5434v.a.values().length];
                    try {
                        iArr[AbstractC5434v.a.ON_RESUME.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AbstractC5434v.a.ON_DESTROY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.lifecycle.G
            public void onStateChanged(J source, AbstractC5434v.a event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                int i12 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        return;
                    }
                    lifecycle.e(this);
                } else if (RelatedProductsBehaviorStateHandler.this.lastState == 3 && ((Boolean) RelatedProductsBehaviorStateHandler.this.isBottomSheetShown.invoke()).booleanValue()) {
                    RelatedProductsBehaviorStateHandler.this.getState().invoke(new RelatedProductsState.AnimationUp(1.0f));
                }
            }
        });
    }

    public final void animationEnable(boolean isEnable) {
        this.isAnimatedBottomNavigation = isEnable;
    }

    @NotNull
    public final Function1<RelatedProductsState, Unit> getState() {
        return this.state;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public void onSlide(@NotNull View bottomSheet, float slideOffset) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        if (this.lastBottomSheetTop == bottomSheet.getTop() && this.lastState == 3) {
            return;
        }
        this.lastBottomSheetTop = bottomSheet.getTop();
        if (this.isAnimatedBottomNavigation && bottomSheet.getTop() < this.topHalfPosition) {
            this.state.invoke(slideOffset >= this.lastSlideOffset ? new RelatedProductsState.AnimationUp(slideOffset) : new RelatedProductsState.AnimationDown(slideOffset));
        }
        this.lastSlideOffset = slideOffset;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public void onStateChanged(@NotNull View bottomSheet, int newState) {
        Function1<RelatedProductsState, Unit> function1;
        RelatedProductsState relatedProductsState;
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        if (newState == 1) {
            if (this.lastState == 4) {
                this.state.invoke(RelatedProductsState.Reopen.INSTANCE);
                return;
            }
            return;
        }
        if (newState == 6) {
            if (this.lastState == 6) {
                this.state.invoke(new RelatedProductsState.AnimationDown(0.0f));
                return;
            }
            this.topHalfPosition = bottomSheet.getTop();
            this.lastState = 6;
            this.isAnimatedBottomNavigation = true;
            ViewGroup.LayoutParams layoutParams = bottomSheet.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = this.bottomSheetMaxHeight;
            bottomSheet.setLayoutParams(layoutParams);
            FrameLayout frameLayout = this.composerContainer;
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = this.bottomSheetMaxHeight;
            frameLayout.setLayoutParams(layoutParams2);
            this.state.invoke(RelatedProductsState.Open.INSTANCE);
            return;
        }
        if (newState == 3) {
            this.lastBottomSheetTop = bottomSheet.getTop();
            this.topHalfPosition = this.topCollapsedPosition;
            RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior = this.behavior;
            if (relatedProductsBottomSheetBehavior != null) {
                relatedProductsBottomSheetBehavior.setFitToContents(true);
            }
            if (this.lastState == 4) {
                function1 = this.state;
                relatedProductsState = RelatedProductsState.ReopenFull.INSTANCE;
            } else {
                function1 = this.state;
                relatedProductsState = RelatedProductsState.OpenFull.INSTANCE;
            }
            function1.invoke(relatedProductsState);
            this.lastState = 3;
            return;
        }
        if (newState != 4) {
            return;
        }
        this.state.invoke(new RelatedProductsState.AnimationDown(0.0f));
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior2 = this.behavior;
        if (relatedProductsBottomSheetBehavior2 != null) {
            relatedProductsBottomSheetBehavior2.setFitToContents(true);
        }
        int i11 = this.lastState;
        if (i11 == 6 && !this.isExternalTapEvent) {
            this.state.invoke(new RelatedProductsState.Close(RelatedProductsState.Close.CloseType.SWIPE));
        } else if (i11 == 6 && this.isExternalTapEvent) {
            this.isExternalTapEvent = false;
            this.state.invoke(new RelatedProductsState.Close(RelatedProductsState.Close.CloseType.TAP));
        } else {
            this.state.invoke(new RelatedProductsState.Close(RelatedProductsState.Close.CloseType.FULL));
        }
        this.lastState = 4;
        if (this.isBottomSheetReturn) {
            return;
        }
        this.state.invoke(RelatedProductsState.Detach.INSTANCE);
    }

    public final void setupExternalCollapsedCallback(int topCollapsedPosition) {
        this.topCollapsedPosition = topCollapsedPosition;
        RelatedProductsBottomSheetBehavior<FrameLayout> relatedProductsBottomSheetBehavior = this.behavior;
        if (relatedProductsBottomSheetBehavior != null) {
            relatedProductsBottomSheetBehavior.setOnExternalCollapsedCallback(new RelatedProductsBehaviorStateHandler$setupExternalCollapsedCallback$1(this));
        }
    }
}
