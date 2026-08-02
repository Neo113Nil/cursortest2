package ru.ozon.fintech.ui.buttonV20;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/ui/buttonV20/ButtonAtomWrapperV20View;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lru/ozon/fintech/ui/buttonV20/ButtonAtomWrapperV20State;", "bxButt", "Lru/ozon/uni/android/controls/button/ButtonView;", "bindState", "", "provideWidgetState", "provideActualWidget", "Landroid/view/View;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonAtomWrapperV20View extends WidgetFrameLayout {

    @NotNull
    private final ButtonView bxButt;
    private ButtonAtomWrapperV20State state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonAtomWrapperV20View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull ButtonAtomWrapperV20State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Common common = state.getCommon();
        ButtonAtomWrapperV20State buttonAtomWrapperV20State = this.state;
        CbottomExtKt.applyCbottomLayoutParams(this, common, buttonAtomWrapperV20State != null ? buttonAtomWrapperV20State.getCommon() : null);
        Common common2 = state.getCommon();
        ButtonAtomWrapperV20State buttonAtomWrapperV20State2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, buttonAtomWrapperV20State2 != null ? buttonAtomWrapperV20State2.getCommon() : null);
        ButtonHolderKt.bind$default(this.bxButt, state.getButtonDTO(), null, 2, null);
        Common common3 = state.getCommon();
        ButtonAtomWrapperV20State buttonAtomWrapperV20State3 = this.state;
        CbottomExtKt.applyClickListener(this, common3, buttonAtomWrapperV20State3 != null ? buttonAtomWrapperV20State3.getCommon() : null, this.bxButt);
        this.state = state;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    @NotNull
    public View provideActualWidget() {
        return this.bxButt;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonAtomWrapperV20View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState, reason: from getter */
    public ButtonAtomWrapperV20State getState() {
        return this.state;
    }

    public /* synthetic */ ButtonAtomWrapperV20View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonAtomWrapperV20View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ButtonView buttonView = new ButtonView(context, null, 0, 0, 14, null);
        this.bxButt = buttonView;
        setTag("ButtonAtomWrapperV20View");
        buttonView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        getPaddingFrameLayout().addView(buttonView);
    }
}
