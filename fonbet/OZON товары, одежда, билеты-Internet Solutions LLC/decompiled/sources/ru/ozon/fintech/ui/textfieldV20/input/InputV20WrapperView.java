package ru.ozon.fintech.ui.textfieldV20.input;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.data.TextInputStyle;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.core.UniColors;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/fintech/ui/textfieldV20/input/InputV20WrapperView;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lru/ozon/fintech/ui/textfieldV20/input/InputV20WrapperState;", "getState", "()Lru/ozon/fintech/ui/textfieldV20/input/InputV20WrapperState;", "setState", "(Lru/ozon/fintech/ui/textfieldV20/input/InputV20WrapperState;)V", "ozonTextInputLayout", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "provideWidgetState", "provideActualWidget", "Landroid/view/View;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputV20WrapperView extends WidgetFrameLayout {

    @NotNull
    private final OzonTextInputLayout ozonTextInputLayout;
    private InputV20WrapperState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputV20WrapperView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull InputV20WrapperState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Common common = state.getCommon();
        InputV20WrapperState inputV20WrapperState = this.state;
        CbottomExtKt.applyCbottomLayoutParams(this, common, inputV20WrapperState != null ? inputV20WrapperState.getCommon() : null);
        Common common2 = state.getCommon();
        InputV20WrapperState inputV20WrapperState2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, inputV20WrapperState2 != null ? inputV20WrapperState2.getCommon() : null);
        Common common3 = state.getCommon();
        InputV20WrapperState inputV20WrapperState3 = this.state;
        CbottomExtKt.applyClickListener$default(this, common3, inputV20WrapperState3 != null ? inputV20WrapperState3.getCommon() : null, null, 4, null);
        this.state = state;
        OzonTextInputLayoutModel ozonTextInputLayoutModel = new OzonTextInputLayoutModel(TextInputStyle.INSTANCE.createInput600Style(), OzonTextInputLayoutModel.State.ACTIVE, OzonTextInputLayoutModel.KeyboardType.TEXT, OzonTextInputLayoutModel.KeyboardAction.UNSPECIFIED, UniColors.GRAPHIC_NEUTRAL.getResId(), OzonTextInputLayoutModel.Status.SUCCESS, true, "Это лэйбл", "", new OzonTextInputLayoutModel.ActionButtonConfig(false, false, false, null, 15, null));
        this.ozonTextInputLayout.canReset(true);
        this.ozonTextInputLayout.setStyle(ozonTextInputLayoutModel.getStyle());
        this.ozonTextInputLayout.setState(ozonTextInputLayoutModel.getState());
        this.ozonTextInputLayout.setKeyboardType(ozonTextInputLayoutModel.getKeyBoardType());
        this.ozonTextInputLayout.setKeyboardAction(ozonTextInputLayoutModel.getKeyboardAction());
        this.ozonTextInputLayout.setStatus(ozonTextInputLayoutModel.getStatus());
        this.ozonTextInputLayout.setLabelText(ozonTextInputLayoutModel.getLabelText());
        this.ozonTextInputLayout.setInputText(ozonTextInputLayoutModel.getInputText());
        this.ozonTextInputLayout.setKeyboardAction(ozonTextInputLayoutModel.getKeyboardAction());
        ozonTextInputLayoutModel.getHasFocus();
    }

    public final InputV20WrapperState getState() {
        return this.state;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    @NotNull
    public View provideActualWidget() {
        return this.ozonTextInputLayout;
    }

    public final void setState(InputV20WrapperState inputV20WrapperState) {
        this.state = inputV20WrapperState;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputV20WrapperView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState */
    public InputV20WrapperState getState() {
        return this.state;
    }

    public /* synthetic */ InputV20WrapperView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputV20WrapperView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        OzonTextInputLayout ozonTextInputLayout = new OzonTextInputLayout(context, null, 0, 6, null);
        this.ozonTextInputLayout = ozonTextInputLayout;
        setTag("InputV20WrapperView");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(ozonTextInputLayout);
    }
}
