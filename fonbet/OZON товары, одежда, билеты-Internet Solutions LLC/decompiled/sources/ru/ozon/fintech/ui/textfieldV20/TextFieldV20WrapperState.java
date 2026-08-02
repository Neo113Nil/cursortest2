package ru.ozon.fintech.ui.textfieldV20;

import D3.h;
import Nh.a;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetState;
import ru.ozon.uni.android.cell.text.data.TextFieldPreset;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;

@Keep
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010:\u001a\u00020\u0010H\u0016J\t\u0010;\u001a\u00020\u0004HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010I\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010J\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010K\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u00108JØ\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020\u00192\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020\u001dHÖ\u0001J\t\u0010R\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00106\u001a\u0004\b\u0018\u00105R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00106\u001a\u0004\b\u001a\u00105R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00106\u001a\u0004\b\u001b\u00105R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108¨\u0006S"}, d2 = {"Lru/ozon/fintech/ui/textfieldV20/TextFieldV20WrapperState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "Lru/ozon/fintech/ui/utils/WidgetState;", "common", "Lru/ozon/fintech/ui/utils/Common;", "inputState", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "inputStatus", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "inputKeyboardType", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "inputKeyboardAction", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "textFieldPreset", "Lru/ozon/uni/android/cell/text/data/TextFieldPreset;", "inputTitle", "", "inputValue", "labelText", "labelTextColor", "labelIcon", "labelIconColor", "labelIconPosition", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "isInputCopyEnabled", "", "isInputResetEnabled", "isInputProtected", "versionStamp", "", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;Lru/ozon/uni/android/cell/text/data/TextFieldPreset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "getInputState", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "getInputStatus", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "getInputKeyboardType", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "getInputKeyboardAction", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "getTextFieldPreset", "()Lru/ozon/uni/android/cell/text/data/TextFieldPreset;", "getInputTitle", "()Ljava/lang/String;", "getInputValue", "getLabelText", "getLabelTextColor", "getLabelIcon", "getLabelIconColor", "getLabelIconPosition", "()Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVersionStamp", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "provideId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Lru/ozon/fintech/ui/utils/Common;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;Lru/ozon/uni/android/cell/text/data/TextFieldPreset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lru/ozon/fintech/ui/textfieldV20/TextFieldV20WrapperState;", "equals", "other", "", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextFieldV20WrapperState implements RecyclerItem, WidgetState {

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
    private final Integer versionStamp;

    public TextFieldV20WrapperState(@NotNull Common common, OzonTextInputLayoutModel.State state, OzonTextInputLayoutModel.Status status, OzonTextInputLayoutModel.KeyboardType keyboardType, OzonTextInputLayoutModel.KeyboardAction keyboardAction, TextFieldPreset textFieldPreset, String str, String str2, String str3, String str4, String str5, String str6, AddonSide addonSide, Boolean bool, Boolean bool2, Boolean bool3, Integer num) {
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
        this.versionStamp = num;
    }

    public static /* synthetic */ TextFieldV20WrapperState copy$default(TextFieldV20WrapperState textFieldV20WrapperState, Common common, OzonTextInputLayoutModel.State state, OzonTextInputLayoutModel.Status status, OzonTextInputLayoutModel.KeyboardType keyboardType, OzonTextInputLayoutModel.KeyboardAction keyboardAction, TextFieldPreset textFieldPreset, String str, String str2, String str3, String str4, String str5, String str6, AddonSide addonSide, Boolean bool, Boolean bool2, Boolean bool3, Integer num, int i11, Object obj) {
        Integer num2;
        Boolean bool4;
        Common common2;
        TextFieldV20WrapperState textFieldV20WrapperState2;
        Boolean bool5;
        OzonTextInputLayoutModel.State state2;
        OzonTextInputLayoutModel.Status status2;
        OzonTextInputLayoutModel.KeyboardType keyboardType2;
        OzonTextInputLayoutModel.KeyboardAction keyboardAction2;
        TextFieldPreset textFieldPreset2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        AddonSide addonSide2;
        Boolean bool6;
        Common common3 = (i11 & 1) != 0 ? textFieldV20WrapperState.common : common;
        OzonTextInputLayoutModel.State state3 = (i11 & 2) != 0 ? textFieldV20WrapperState.inputState : state;
        OzonTextInputLayoutModel.Status status3 = (i11 & 4) != 0 ? textFieldV20WrapperState.inputStatus : status;
        OzonTextInputLayoutModel.KeyboardType keyboardType3 = (i11 & 8) != 0 ? textFieldV20WrapperState.inputKeyboardType : keyboardType;
        OzonTextInputLayoutModel.KeyboardAction keyboardAction3 = (i11 & 16) != 0 ? textFieldV20WrapperState.inputKeyboardAction : keyboardAction;
        TextFieldPreset textFieldPreset3 = (i11 & 32) != 0 ? textFieldV20WrapperState.textFieldPreset : textFieldPreset;
        String str13 = (i11 & 64) != 0 ? textFieldV20WrapperState.inputTitle : str;
        String str14 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? textFieldV20WrapperState.inputValue : str2;
        String str15 = (i11 & 256) != 0 ? textFieldV20WrapperState.labelText : str3;
        String str16 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? textFieldV20WrapperState.labelTextColor : str4;
        String str17 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? textFieldV20WrapperState.labelIcon : str5;
        String str18 = (i11 & 2048) != 0 ? textFieldV20WrapperState.labelIconColor : str6;
        AddonSide addonSide3 = (i11 & 4096) != 0 ? textFieldV20WrapperState.labelIconPosition : addonSide;
        Boolean bool7 = (i11 & 8192) != 0 ? textFieldV20WrapperState.isInputCopyEnabled : bool;
        Common common4 = common3;
        Boolean bool8 = (i11 & 16384) != 0 ? textFieldV20WrapperState.isInputResetEnabled : bool2;
        Boolean bool9 = (i11 & 32768) != 0 ? textFieldV20WrapperState.isInputProtected : bool3;
        if ((i11 & 65536) != 0) {
            bool4 = bool9;
            num2 = textFieldV20WrapperState.versionStamp;
            bool5 = bool8;
            state2 = state3;
            status2 = status3;
            keyboardType2 = keyboardType3;
            keyboardAction2 = keyboardAction3;
            textFieldPreset2 = textFieldPreset3;
            str7 = str13;
            str8 = str14;
            str9 = str15;
            str10 = str16;
            str11 = str17;
            str12 = str18;
            addonSide2 = addonSide3;
            bool6 = bool7;
            common2 = common4;
            textFieldV20WrapperState2 = textFieldV20WrapperState;
        } else {
            num2 = num;
            bool4 = bool9;
            common2 = common4;
            textFieldV20WrapperState2 = textFieldV20WrapperState;
            bool5 = bool8;
            state2 = state3;
            status2 = status3;
            keyboardType2 = keyboardType3;
            keyboardAction2 = keyboardAction3;
            textFieldPreset2 = textFieldPreset3;
            str7 = str13;
            str8 = str14;
            str9 = str15;
            str10 = str16;
            str11 = str17;
            str12 = str18;
            addonSide2 = addonSide3;
            bool6 = bool7;
        }
        return textFieldV20WrapperState2.copy(common2, state2, status2, keyboardType2, keyboardAction2, textFieldPreset2, str7, str8, str9, str10, str11, str12, addonSide2, bool6, bool5, bool4, num2);
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

    /* renamed from: component17, reason: from getter */
    public final Integer getVersionStamp() {
        return this.versionStamp;
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
    public final TextFieldV20WrapperState copy(@NotNull Common common, OzonTextInputLayoutModel.State inputState, OzonTextInputLayoutModel.Status inputStatus, OzonTextInputLayoutModel.KeyboardType inputKeyboardType, OzonTextInputLayoutModel.KeyboardAction inputKeyboardAction, TextFieldPreset textFieldPreset, String inputTitle, String inputValue, String labelText, String labelTextColor, String labelIcon, String labelIconColor, AddonSide labelIconPosition, Boolean isInputCopyEnabled, Boolean isInputResetEnabled, Boolean isInputProtected, Integer versionStamp) {
        Intrinsics.checkNotNullParameter(common, "common");
        return new TextFieldV20WrapperState(common, inputState, inputStatus, inputKeyboardType, inputKeyboardAction, textFieldPreset, inputTitle, inputValue, labelText, labelTextColor, labelIcon, labelIconColor, labelIconPosition, isInputCopyEnabled, isInputResetEnabled, isInputProtected, versionStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldV20WrapperState)) {
            return false;
        }
        TextFieldV20WrapperState textFieldV20WrapperState = (TextFieldV20WrapperState) other;
        return Intrinsics.d(this.common, textFieldV20WrapperState.common) && this.inputState == textFieldV20WrapperState.inputState && this.inputStatus == textFieldV20WrapperState.inputStatus && this.inputKeyboardType == textFieldV20WrapperState.inputKeyboardType && this.inputKeyboardAction == textFieldV20WrapperState.inputKeyboardAction && Intrinsics.d(this.textFieldPreset, textFieldV20WrapperState.textFieldPreset) && Intrinsics.d(this.inputTitle, textFieldV20WrapperState.inputTitle) && Intrinsics.d(this.inputValue, textFieldV20WrapperState.inputValue) && Intrinsics.d(this.labelText, textFieldV20WrapperState.labelText) && Intrinsics.d(this.labelTextColor, textFieldV20WrapperState.labelTextColor) && Intrinsics.d(this.labelIcon, textFieldV20WrapperState.labelIcon) && Intrinsics.d(this.labelIconColor, textFieldV20WrapperState.labelIconColor) && this.labelIconPosition == textFieldV20WrapperState.labelIconPosition && Intrinsics.d(this.isInputCopyEnabled, textFieldV20WrapperState.isInputCopyEnabled) && Intrinsics.d(this.isInputResetEnabled, textFieldV20WrapperState.isInputResetEnabled) && Intrinsics.d(this.isInputProtected, textFieldV20WrapperState.isInputProtected) && Intrinsics.d(this.versionStamp, textFieldV20WrapperState.versionStamp);
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

    public final Integer getVersionStamp() {
        return this.versionStamp;
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
        int hashCode16 = (hashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.versionStamp;
        return hashCode16 + (num != null ? num.hashCode() : 0);
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
        Integer num = this.versionStamp;
        StringBuilder sb2 = new StringBuilder("TextFieldV20WrapperState(common=");
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
        h.h(sb2, bool2, ", isInputProtected=", bool3, ", versionStamp=");
        return Ep.a.c(sb2, num, ")");
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ TextFieldV20WrapperState(Common common, OzonTextInputLayoutModel.State state, OzonTextInputLayoutModel.Status status, OzonTextInputLayoutModel.KeyboardType keyboardType, OzonTextInputLayoutModel.KeyboardAction keyboardAction, TextFieldPreset textFieldPreset, String str, String str2, String str3, String str4, String str5, String str6, AddonSide addonSide, Boolean bool, Boolean bool2, Boolean bool3, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(common, state, status, keyboardType, keyboardAction, textFieldPreset, str, str2, str3, str4, str5, str6, addonSide, bool, bool2, bool3, (i11 & 65536) != 0 ? null : num);
    }
}
