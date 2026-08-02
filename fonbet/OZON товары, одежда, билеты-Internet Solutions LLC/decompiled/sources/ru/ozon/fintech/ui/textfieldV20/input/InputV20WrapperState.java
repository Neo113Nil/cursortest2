package ru.ozon.fintech.ui.textfieldV20.input;

import Nh.a;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;
import ru.ozon.uni.android.cell.text.data.TextFieldPreset;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;

@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00105\u001a\u00020\u0010H\u0016J\t\u00106\u001a\u00020\u0004HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010D\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010E\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00103JÌ\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\u00192\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00104\u001a\u0004\b\u0018\u00103R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00104\u001a\u0004\b\u001a\u00103R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00104\u001a\u0004\b\u001b\u00103¨\u0006N"}, d2 = {"Lru/ozon/fintech/ui/textfieldV20/input/InputV20WrapperState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "inputState", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "inputStatus", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "inputKeyboardType", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "inputKeyboardAction", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "textFieldPreset", "Lru/ozon/uni/android/cell/text/data/TextFieldPreset;", "inputTitle", "", "inputValue", "labelText", "labelTextColor", "labelIcon", "labelIconColor", "labelIconPosition", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "isInputCopyEnabled", "", "isInputResetEnabled", "isInputProtected", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;Lru/ozon/uni/android/cell/text/data/TextFieldPreset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getInputState", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "getInputStatus", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "getInputKeyboardType", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "getInputKeyboardAction", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "getTextFieldPreset", "()Lru/ozon/uni/android/cell/text/data/TextFieldPreset;", "getInputTitle", "()Ljava/lang/String;", "getInputValue", "getLabelText", "getLabelTextColor", "getLabelIcon", "getLabelIconColor", "getLabelIconPosition", "()Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "provideId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Lru/ozon/fintech/ui/utils/Common;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;Lru/ozon/uni/android/cell/text/data/TextFieldPreset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/fintech/ui/textfieldV20/input/InputV20WrapperState;", "equals", "other", "", "hashCode", "", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputV20WrapperState implements RecyclerItem, WidgetState {

    @NotNull
    private final Common common;
    private final OzonTextInputLayoutModel.KeyboardAction inputKeyboardAction;
    private final OzonTextInputLayoutModel.KeyboardType inputKeyboardType;
    private final OzonTextInputLayoutModel.State inputState;
    private final OzonTextInputLayoutModel.Status inputStatus;
    private final String inputTitle;
    private final String inputValue;
    private final Boolean isInputCopyEnabled;
    private final Boolean isInputProtected;
    private final Boolean isInputResetEnabled;
    private final String labelIcon;
    private final String labelIconColor;
    private final AddonSide labelIconPosition;
    private final String labelText;
    private final String labelTextColor;
    private final TextFieldPreset textFieldPreset;

    public InputV20WrapperState(@NotNull Common common, OzonTextInputLayoutModel.State state, OzonTextInputLayoutModel.Status status, OzonTextInputLayoutModel.KeyboardType keyboardType, OzonTextInputLayoutModel.KeyboardAction keyboardAction, TextFieldPreset textFieldPreset, String str, String str2, String str3, String str4, String str5, String str6, AddonSide addonSide, Boolean bool, Boolean bool2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(common, "common");
        this.common = common;
        this.inputState = state;
        this.inputStatus = status;
        this.inputKeyboardType = keyboardType;
        this.inputKeyboardAction = keyboardAction;
        this.textFieldPreset = textFieldPreset;
        this.inputTitle = str;
        this.inputValue = str2;
        this.labelText = str3;
        this.labelTextColor = str4;
        this.labelIcon = str5;
        this.labelIconColor = str6;
        this.labelIconPosition = addonSide;
        this.isInputCopyEnabled = bool;
        this.isInputResetEnabled = bool2;
        this.isInputProtected = bool3;
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Common getCommon() {
        return this.common;
    }

    /* renamed from: component10, reason: from getter */
    public final String getLabelTextColor() {
        return this.labelTextColor;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLabelIcon() {
        return this.labelIcon;
    }

    /* renamed from: component12, reason: from getter */
    public final String getLabelIconColor() {
        return this.labelIconColor;
    }

    /* renamed from: component13, reason: from getter */
    public final AddonSide getLabelIconPosition() {
        return this.labelIconPosition;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getIsInputCopyEnabled() {
        return this.isInputCopyEnabled;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getIsInputResetEnabled() {
        return this.isInputResetEnabled;
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getIsInputProtected() {
        return this.isInputProtected;
    }

    /* renamed from: component2, reason: from getter */
    public final OzonTextInputLayoutModel.State getInputState() {
        return this.inputState;
    }

    /* renamed from: component3, reason: from getter */
    public final OzonTextInputLayoutModel.Status getInputStatus() {
        return this.inputStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final OzonTextInputLayoutModel.KeyboardType getInputKeyboardType() {
        return this.inputKeyboardType;
    }

    /* renamed from: component5, reason: from getter */
    public final OzonTextInputLayoutModel.KeyboardAction getInputKeyboardAction() {
        return this.inputKeyboardAction;
    }

    /* renamed from: component6, reason: from getter */
    public final TextFieldPreset getTextFieldPreset() {
        return this.textFieldPreset;
    }

    /* renamed from: component7, reason: from getter */
    public final String getInputTitle() {
        return this.inputTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final String getInputValue() {
        return this.inputValue;
    }

    /* renamed from: component9, reason: from getter */
    public final String getLabelText() {
        return this.labelText;
    }

    @NotNull
    public final InputV20WrapperState copy(@NotNull Common common, OzonTextInputLayoutModel.State inputState, OzonTextInputLayoutModel.Status inputStatus, OzonTextInputLayoutModel.KeyboardType inputKeyboardType, OzonTextInputLayoutModel.KeyboardAction inputKeyboardAction, TextFieldPreset textFieldPreset, String inputTitle, String inputValue, String labelText, String labelTextColor, String labelIcon, String labelIconColor, AddonSide labelIconPosition, Boolean isInputCopyEnabled, Boolean isInputResetEnabled, Boolean isInputProtected) {
        Intrinsics.checkNotNullParameter(common, "common");
        return new InputV20WrapperState(common, inputState, inputStatus, inputKeyboardType, inputKeyboardAction, textFieldPreset, inputTitle, inputValue, labelText, labelTextColor, labelIcon, labelIconColor, labelIconPosition, isInputCopyEnabled, isInputResetEnabled, isInputProtected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputV20WrapperState)) {
            return false;
        }
        InputV20WrapperState inputV20WrapperState = (InputV20WrapperState) other;
        return Intrinsics.d(this.common, inputV20WrapperState.common) && this.inputState == inputV20WrapperState.inputState && this.inputStatus == inputV20WrapperState.inputStatus && this.inputKeyboardType == inputV20WrapperState.inputKeyboardType && this.inputKeyboardAction == inputV20WrapperState.inputKeyboardAction && Intrinsics.d(this.textFieldPreset, inputV20WrapperState.textFieldPreset) && Intrinsics.d(this.inputTitle, inputV20WrapperState.inputTitle) && Intrinsics.d(this.inputValue, inputV20WrapperState.inputValue) && Intrinsics.d(this.labelText, inputV20WrapperState.labelText) && Intrinsics.d(this.labelTextColor, inputV20WrapperState.labelTextColor) && Intrinsics.d(this.labelIcon, inputV20WrapperState.labelIcon) && Intrinsics.d(this.labelIconColor, inputV20WrapperState.labelIconColor) && this.labelIconPosition == inputV20WrapperState.labelIconPosition && Intrinsics.d(this.isInputCopyEnabled, inputV20WrapperState.isInputCopyEnabled) && Intrinsics.d(this.isInputResetEnabled, inputV20WrapperState.isInputResetEnabled) && Intrinsics.d(this.isInputProtected, inputV20WrapperState.isInputProtected);
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetState
    @NotNull
    public Common getCommon() {
        return this.common;
    }

    public final OzonTextInputLayoutModel.KeyboardAction getInputKeyboardAction() {
        return this.inputKeyboardAction;
    }

    public final OzonTextInputLayoutModel.KeyboardType getInputKeyboardType() {
        return this.inputKeyboardType;
    }

    public final OzonTextInputLayoutModel.State getInputState() {
        return this.inputState;
    }

    public final OzonTextInputLayoutModel.Status getInputStatus() {
        return this.inputStatus;
    }

    public final String getInputTitle() {
        return this.inputTitle;
    }

    public final String getInputValue() {
        return this.inputValue;
    }

    public final String getLabelIcon() {
        return this.labelIcon;
    }

    public final String getLabelIconColor() {
        return this.labelIconColor;
    }

    public final AddonSide getLabelIconPosition() {
        return this.labelIconPosition;
    }

    public final String getLabelText() {
        return this.labelText;
    }

    public final String getLabelTextColor() {
        return this.labelTextColor;
    }

    public final TextFieldPreset getTextFieldPreset() {
        return this.textFieldPreset;
    }

    public int hashCode() {
        int hashCode = this.common.hashCode() * 31;
        OzonTextInputLayoutModel.State state = this.inputState;
        int hashCode2 = (hashCode + (state == null ? 0 : state.hashCode())) * 31;
        OzonTextInputLayoutModel.Status status = this.inputStatus;
        int hashCode3 = (hashCode2 + (status == null ? 0 : status.hashCode())) * 31;
        OzonTextInputLayoutModel.KeyboardType keyboardType = this.inputKeyboardType;
        int hashCode4 = (hashCode3 + (keyboardType == null ? 0 : keyboardType.hashCode())) * 31;
        OzonTextInputLayoutModel.KeyboardAction keyboardAction = this.inputKeyboardAction;
        int hashCode5 = (hashCode4 + (keyboardAction == null ? 0 : keyboardAction.hashCode())) * 31;
        TextFieldPreset textFieldPreset = this.textFieldPreset;
        int hashCode6 = (hashCode5 + (textFieldPreset == null ? 0 : textFieldPreset.hashCode())) * 31;
        String str = this.inputTitle;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.inputValue;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.labelText;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.labelTextColor;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.labelIcon;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.labelIconColor;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        AddonSide addonSide = this.labelIconPosition;
        int hashCode13 = (hashCode12 + (addonSide == null ? 0 : addonSide.hashCode())) * 31;
        Boolean bool = this.isInputCopyEnabled;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isInputResetEnabled;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isInputProtected;
        return hashCode15 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final Boolean isInputCopyEnabled() {
        return this.isInputCopyEnabled;
    }

    public final Boolean isInputProtected() {
        return this.isInputProtected;
    }

    public final Boolean isInputResetEnabled() {
        return this.isInputResetEnabled;
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return getCommon().getWidgetId();
    }

    @NotNull
    public String toString() {
        Common common = this.common;
        OzonTextInputLayoutModel.State state = this.inputState;
        OzonTextInputLayoutModel.Status status = this.inputStatus;
        OzonTextInputLayoutModel.KeyboardType keyboardType = this.inputKeyboardType;
        OzonTextInputLayoutModel.KeyboardAction keyboardAction = this.inputKeyboardAction;
        TextFieldPreset textFieldPreset = this.textFieldPreset;
        String str = this.inputTitle;
        String str2 = this.inputValue;
        String str3 = this.labelText;
        String str4 = this.labelTextColor;
        String str5 = this.labelIcon;
        String str6 = this.labelIconColor;
        AddonSide addonSide = this.labelIconPosition;
        Boolean bool = this.isInputCopyEnabled;
        Boolean bool2 = this.isInputResetEnabled;
        Boolean bool3 = this.isInputProtected;
        StringBuilder sb2 = new StringBuilder("InputV20WrapperState(common=");
        sb2.append(common);
        sb2.append(", inputState=");
        sb2.append(state);
        sb2.append(", inputStatus=");
        sb2.append(status);
        sb2.append(", inputKeyboardType=");
        sb2.append(keyboardType);
        sb2.append(", inputKeyboardAction=");
        sb2.append(keyboardAction);
        sb2.append(", textFieldPreset=");
        sb2.append(textFieldPreset);
        sb2.append(", inputTitle=");
        a.h(sb2, str, ", inputValue=", str2, ", labelText=");
        a.h(sb2, str3, ", labelTextColor=", str4, ", labelIcon=");
        a.h(sb2, str5, ", labelIconColor=", str6, ", labelIconPosition=");
        sb2.append(addonSide);
        sb2.append(", isInputCopyEnabled=");
        sb2.append(bool);
        sb2.append(", isInputResetEnabled=");
        sb2.append(bool2);
        sb2.append(", isInputProtected=");
        sb2.append(bool3);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }
}
