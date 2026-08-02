package ru.ozon.fintech.ui.toggleatom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import eI.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;
import ru.ozon.fintech.ui.utils.WidgetState;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.atoms.v3.holders.selectionControls.ToggleHolderKt;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/ui/toggleatom/ToggleAtomWrapperView;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bxToggle", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "state", "Lru/ozon/fintech/ui/toggleatom/ToggleAtomWrapperState;", "bindState", "", "provideActualWidget", "Landroid/view/View;", "provideWidgetState", "Lru/ozon/fintech/ui/utils/WidgetState;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes3.dex */
public final class ToggleAtomWrapperView extends WidgetFrameLayout {

    @NotNull
    private final ToggleView bxToggle;
    private ToggleAtomWrapperState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToggleAtomWrapperView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(ToggleAtomWrapperView toggleAtomWrapperView, View view, MotionEvent motionEvent) {
        Common common;
        if (motionEvent.getAction() != 0) {
            return false;
        }
        ToggleAtomWrapperState toggleAtomWrapperState = toggleAtomWrapperView.state;
        if (toggleAtomWrapperState == null || (common = toggleAtomWrapperState.getCommon()) == null) {
            return true;
        }
        if (!Intrinsics.d(common.getClickable(), Boolean.TRUE)) {
            common = null;
        }
        if (common == null) {
            return true;
        }
        common.getActionListener().invoke(new ActionResult2UI(common.getCbottomId(), common.getWidgetId(), ActionResult2UI.Type.CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097144, null));
        return true;
    }

    public final void bindState(@NotNull ToggleAtomWrapperState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Common common = state.getCommon();
        ToggleAtomWrapperState toggleAtomWrapperState = this.state;
        CbottomExtKt.applyCbottomLayoutParams(this, common, toggleAtomWrapperState != null ? toggleAtomWrapperState.getCommon() : null);
        Common common2 = state.getCommon();
        ToggleAtomWrapperState toggleAtomWrapperState2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, toggleAtomWrapperState2 != null ? toggleAtomWrapperState2.getCommon() : null);
        ToggleHolderKt.bind$default(this.bxToggle, state.getToggleV3DTO(), null, 2, null);
        this.state = state;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    @NotNull
    public View provideActualWidget() {
        return this.bxToggle;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState */
    public WidgetState getState() {
        return this.state;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToggleAtomWrapperView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ToggleAtomWrapperView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleAtomWrapperView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ToggleView toggleView = new ToggleView(context, null, 0, 6, null);
        this.bxToggle = toggleView;
        setTag("ToggleAtomWrapperView");
        toggleView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        getPaddingFrameLayout().addView(toggleView);
        toggleView.setOnTouchListener(new e(this, 1));
    }
}
