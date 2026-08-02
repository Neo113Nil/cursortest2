package ru.ozon.fintech.ui.bottom;

import FG.a;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.databinding.FintechBottomSheetContainerBinding;
import ru.ozon.fintech.ui.databinding.FintechBottomSheetViewBinding;

@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0010\b&\u0018\u0000 $2\u00020\u0001:\u0001$B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0016H&J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0016H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000e8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lru/ozon/fintech/ui/bottom/FintechBottomSheetView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/fintech/ui/databinding/FintechBottomSheetViewBinding;", "sheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "bottomSheetCallback", "ru/ozon/fintech/ui/bottom/FintechBottomSheetView$bottomSheetCallback$1", "Lru/ozon/fintech/ui/bottom/FintechBottomSheetView$bottomSheetCallback$1;", "bottomSheetContainer", "getBottomSheetContainer", "()Landroid/widget/FrameLayout;", "expand", "", "close", "", "setPadding", "left", "top", "right", "bottom", "isBottomSheetDraggerVisible", "onBottomSheetClosed", "animateBottomSheetFrameTranslationY", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "setMaxAlpha", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FintechBottomSheetView extends CoordinatorLayout {
    private static final long BOTTOM_VIEW_ANIMATION_DURATION = 200;
    private FintechBottomSheetViewBinding binding;

    @NotNull
    private final FintechBottomSheetView$bottomSheetCallback$1 bottomSheetCallback;
    private BottomSheetBehavior<FrameLayout> sheetBehavior;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FintechBottomSheetView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateBottomSheetFrameTranslationY(float value) {
        FrameLayout frameLayout;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        FintechBottomSheetViewBinding fintechBottomSheetViewBinding = this.binding;
        if (fintechBottomSheetViewBinding == null || (frameLayout = fintechBottomSheetViewBinding.bottomSheetFrame) == null || (animate = frameLayout.animate()) == null || (translationY = animate.translationY(value)) == null) {
            return;
        }
        translationY.setDuration(200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(FintechBottomSheetView fintechBottomSheetView, View view) {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = fintechBottomSheetView.sheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMaxAlpha() {
        FintechBottomSheetViewBinding fintechBottomSheetViewBinding = this.binding;
        if (fintechBottomSheetViewBinding != null) {
            fintechBottomSheetViewBinding.bottomSheetBackground.setAlpha(1.0f);
        }
    }

    public final boolean close() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.sheetBehavior;
        if (bottomSheetBehavior != null && bottomSheetBehavior.getState() == 5) {
            return false;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.sheetBehavior;
        if (bottomSheetBehavior2 != null && bottomSheetBehavior2.getState() == 4) {
            return false;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior3 = this.sheetBehavior;
        if (bottomSheetBehavior3 == null) {
            return true;
        }
        bottomSheetBehavior3.setState(5);
        return true;
    }

    public final void expand() {
        FintechBottomSheetContainerBinding fintechBottomSheetContainerBinding;
        View view;
        FintechBottomSheetViewBinding fintechBottomSheetViewBinding = this.binding;
        if (fintechBottomSheetViewBinding != null && (fintechBottomSheetContainerBinding = fintechBottomSheetViewBinding.bottomSheet) != null && (view = fintechBottomSheetContainerBinding.baseBottomSheetDragger) != null) {
            view.setVisibility(isBottomSheetDraggerVisible() ? 0 : 8);
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.sheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.sheetBehavior;
        if (bottomSheetBehavior2 == null || bottomSheetBehavior2.getState() != 3) {
            return;
        }
        setMaxAlpha();
    }

    protected final FrameLayout getBottomSheetContainer() {
        FintechBottomSheetContainerBinding fintechBottomSheetContainerBinding;
        FintechBottomSheetViewBinding fintechBottomSheetViewBinding = this.binding;
        if (fintechBottomSheetViewBinding == null || (fintechBottomSheetContainerBinding = fintechBottomSheetViewBinding.bottomSheet) == null) {
            return null;
        }
        return fintechBottomSheetContainerBinding.bottomSheetContentContainer;
    }

    public boolean isBottomSheetDraggerVisible() {
        return true;
    }

    public abstract void onBottomSheetClosed();

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        FrameLayout frameLayout;
        FintechBottomSheetViewBinding fintechBottomSheetViewBinding = this.binding;
        if (fintechBottomSheetViewBinding == null || (frameLayout = fintechBottomSheetViewBinding.bottomSheetFrame) == null) {
            return;
        }
        frameLayout.setPadding(left, top, right, bottom);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FintechBottomSheetView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FintechBottomSheetView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.material.bottomsheet.BottomSheetBehavior$f, ru.ozon.fintech.ui.bottom.FintechBottomSheetView$bottomSheetCallback$1] */
    public FintechBottomSheetView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ?? r42 = new BottomSheetBehavior.f() { // from class: ru.ozon.fintech.ui.bottom.FintechBottomSheetView$bottomSheetCallback$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onSlide(View bottomSheet, float slideOffset) {
                FintechBottomSheetViewBinding fintechBottomSheetViewBinding;
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                fintechBottomSheetViewBinding = FintechBottomSheetView.this.binding;
                if (fintechBottomSheetViewBinding != null) {
                    fintechBottomSheetViewBinding.bottomSheetBackground.setAlpha(1 + slideOffset);
                }
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onStateChanged(View bottomSheet, int newState) {
                FintechBottomSheetViewBinding fintechBottomSheetViewBinding;
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                if (newState == 5) {
                    FintechBottomSheetView.this.onBottomSheetClosed();
                }
                if (newState == 3) {
                    FintechBottomSheetView.this.setMaxAlpha();
                    fintechBottomSheetViewBinding = FintechBottomSheetView.this.binding;
                    if (fintechBottomSheetViewBinding != null) {
                        FintechBottomSheetView.this.animateBottomSheetFrameTranslationY(fintechBottomSheetViewBinding.getRoot().getHeight() - fintechBottomSheetViewBinding.bottomSheetFrame.getBottom());
                    }
                }
            }
        };
        this.bottomSheetCallback = r42;
        FintechBottomSheetViewBinding inflate = FintechBottomSheetViewBinding.inflate(LayoutInflater.from(context), this, true);
        BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(inflate.bottomSheetFrame);
        from.addBottomSheetCallback(r42);
        from.setHideable(true);
        from.setPeekHeight(-1);
        this.sheetBehavior = from;
        inflate.bottomSheetBackground.setOnClickListener(new a(this, 19));
        this.binding = inflate;
        setBackgroundColor(androidx.core.content.a.getColor(context, R.color.transparent));
    }
}
