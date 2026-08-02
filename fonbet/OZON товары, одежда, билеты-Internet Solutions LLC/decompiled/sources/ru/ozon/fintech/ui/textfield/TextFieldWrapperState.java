package ru.ozon.fintech.ui.textfield;

import D3.h;
import E30.i;
import Kk.C3532b;
import Kk.d;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.text.data.TextFieldPreset;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;

@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0016\u0012\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010$J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010$J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010$J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010$J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010$J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010$J\u0012\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b:\u00109J\u0012\u0010;\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b;\u00109J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010$J\u0010\u0010=\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b?\u0010@J$\u0010A\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u008c\u0002\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00162\u001c\b\u0002\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bE\u0010$J\u0010\u0010G\u001a\u00020FHÖ\u0001¢\u0006\u0004\bG\u0010HJ\u001a\u0010K\u001a\u00020\u00162\b\u0010J\u001a\u0004\u0018\u00010IHÖ\u0003¢\u0006\u0004\bK\u0010LR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010M\u001a\u0004\bN\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010O\u001a\u0004\bP\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010Q\u001a\u0004\bR\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010S\u001a\u0004\bT\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010U\u001a\u0004\bV\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010W\u001a\u0004\bX\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bY\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bZ\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\b[\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\b\\\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\b]\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010M\u001a\u0004\b^\u0010$R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010_\u001a\u0004\b`\u00107R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010a\u001a\u0004\b\u0017\u00109R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010a\u001a\u0004\b\u0018\u00109R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010a\u001a\u0004\b\u0019\u00109R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010M\u001a\u0004\bb\u0010$R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010c\u001a\u0004\bd\u0010>R\u0017\u0010\u001d\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001d\u0010e\u001a\u0004\bf\u0010@R+\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b \u0010g\u001a\u0004\bh\u0010B¨\u0006i"}, d2 = {"Lru/ozon/fintech/ui/textfield/TextFieldWrapperState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "inputState", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "inputStatus", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "inputKeyboardType", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "inputKeyboardAction", "Lru/ozon/uni/android/cell/text/data/TextFieldPreset;", "textFieldPreset", "inputTitle", "inputValue", "labelText", "labelTextColor", "labelIcon", "labelIconColor", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "labelIconPosition", "", "isInputCopyEnabled", "isInputResetEnabled", "isInputProtected", "actionId", "Landroid/graphics/Rect;", "paddings", "closeOnClick", "Lkotlin/Function2;", "", "onClick", "<init>", "(Ljava/lang/String;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;Lru/ozon/uni/android/cell/text/data/TextFieldPreset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Landroid/graphics/Rect;ZLkotlin/jvm/functions/Function2;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "component3", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "component4", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "component5", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "component6", "()Lru/ozon/uni/android/cell/text/data/TextFieldPreset;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "component14", "()Ljava/lang/Boolean;", "component15", "component16", "component17", "component18", "()Landroid/graphics/Rect;", "component19", "()Z", "component20", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/lang/String;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;Lru/ozon/uni/android/cell/text/data/TextFieldPreset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Landroid/graphics/Rect;ZLkotlin/jvm/functions/Function2;)Lru/ozon/fintech/ui/textfield/TextFieldWrapperState;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "getInputState", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "getInputStatus", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "getInputKeyboardType", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "getInputKeyboardAction", "Lru/ozon/uni/android/cell/text/data/TextFieldPreset;", "getTextFieldPreset", "getInputTitle", "getInputValue", "getLabelText", "getLabelTextColor", "getLabelIcon", "getLabelIconColor", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "getLabelIconPosition", "Ljava/lang/Boolean;", "getActionId", "Landroid/graphics/Rect;", "getPaddings", "Z", "getCloseOnClick", "Lkotlin/jvm/functions/Function2;", "getOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextFieldWrapperState implements RecyclerItem {
    private final String actionId;
    private final boolean closeOnClick;

    @NotNull
    private final String id;
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
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;
    private final TextFieldPreset textFieldPreset;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldWrapperState(@NotNull String id2, OzonTextInputLayoutModel.State state, OzonTextInputLayoutModel.Status status, OzonTextInputLayoutModel.KeyboardType keyboardType, OzonTextInputLayoutModel.KeyboardAction keyboardAction, TextFieldPreset textFieldPreset, String str, String str2, String str3, String str4, String str5, String str6, AddonSide addonSide, Boolean bool, Boolean bool2, Boolean bool3, String str7, @NotNull Rect paddings, boolean z11, Function2<? super String, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
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
        this.actionId = str7;
        this.paddings = paddings;
        this.closeOnClick = z11;
        this.onClick = function2;
    }

    public static /* synthetic */ TextFieldWrapperState copy$default(TextFieldWrapperState textFieldWrapperState, String str, OzonTextInputLayoutModel.State state, OzonTextInputLayoutModel.Status status, OzonTextInputLayoutModel.KeyboardType keyboardType, OzonTextInputLayoutModel.KeyboardAction keyboardAction, TextFieldPreset textFieldPreset, String str2, String str3, String str4, String str5, String str6, String str7, AddonSide addonSide, Boolean bool, Boolean bool2, Boolean bool3, String str8, Rect rect, boolean z11, Function2 function2, int i11, Object obj) {
        Function2 function22;
        boolean z12;
        String str9 = (i11 & 1) != 0 ? textFieldWrapperState.id : str;
        OzonTextInputLayoutModel.State state2 = (i11 & 2) != 0 ? textFieldWrapperState.inputState : state;
        OzonTextInputLayoutModel.Status status2 = (i11 & 4) != 0 ? textFieldWrapperState.inputStatus : status;
        OzonTextInputLayoutModel.KeyboardType keyboardType2 = (i11 & 8) != 0 ? textFieldWrapperState.inputKeyboardType : keyboardType;
        OzonTextInputLayoutModel.KeyboardAction keyboardAction2 = (i11 & 16) != 0 ? textFieldWrapperState.inputKeyboardAction : keyboardAction;
        TextFieldPreset textFieldPreset2 = (i11 & 32) != 0 ? textFieldWrapperState.textFieldPreset : textFieldPreset;
        String str10 = (i11 & 64) != 0 ? textFieldWrapperState.inputTitle : str2;
        String str11 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? textFieldWrapperState.inputValue : str3;
        String str12 = (i11 & 256) != 0 ? textFieldWrapperState.labelText : str4;
        String str13 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? textFieldWrapperState.labelTextColor : str5;
        String str14 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? textFieldWrapperState.labelIcon : str6;
        String str15 = (i11 & 2048) != 0 ? textFieldWrapperState.labelIconColor : str7;
        AddonSide addonSide2 = (i11 & 4096) != 0 ? textFieldWrapperState.labelIconPosition : addonSide;
        Boolean bool4 = (i11 & 8192) != 0 ? textFieldWrapperState.isInputCopyEnabled : bool;
        String str16 = str9;
        Boolean bool5 = (i11 & 16384) != 0 ? textFieldWrapperState.isInputResetEnabled : bool2;
        Boolean bool6 = (i11 & 32768) != 0 ? textFieldWrapperState.isInputProtected : bool3;
        String str17 = (i11 & 65536) != 0 ? textFieldWrapperState.actionId : str8;
        Rect rect2 = (i11 & 131072) != 0 ? textFieldWrapperState.paddings : rect;
        boolean z13 = (i11 & 262144) != 0 ? textFieldWrapperState.closeOnClick : z11;
        if ((i11 & 524288) != 0) {
            z12 = z13;
            function22 = textFieldWrapperState.onClick;
        } else {
            function22 = function2;
            z12 = z13;
        }
        return textFieldWrapperState.copy(str16, state2, status2, keyboardType2, keyboardAction2, textFieldPreset2, str10, str11, str12, str13, str14, str15, addonSide2, bool4, bool5, bool6, str17, rect2, z12, function22);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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
    public final String getActionId() {
        return this.actionId;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    /* renamed from: component2, reason: from getter */
    public final OzonTextInputLayoutModel.State getInputState() {
        return this.inputState;
    }

    public final Function2<String, Boolean, Unit> component20() {
        return this.onClick;
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
    public final TextFieldWrapperState copy(@NotNull String id2, OzonTextInputLayoutModel.State inputState, OzonTextInputLayoutModel.Status inputStatus, OzonTextInputLayoutModel.KeyboardType inputKeyboardType, OzonTextInputLayoutModel.KeyboardAction inputKeyboardAction, TextFieldPreset textFieldPreset, String inputTitle, String inputValue, String labelText, String labelTextColor, String labelIcon, String labelIconColor, AddonSide labelIconPosition, Boolean isInputCopyEnabled, Boolean isInputResetEnabled, Boolean isInputProtected, String actionId, @NotNull Rect paddings, boolean closeOnClick, Function2<? super String, ? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new TextFieldWrapperState(id2, inputState, inputStatus, inputKeyboardType, inputKeyboardAction, textFieldPreset, inputTitle, inputValue, labelText, labelTextColor, labelIcon, labelIconColor, labelIconPosition, isInputCopyEnabled, isInputResetEnabled, isInputProtected, actionId, paddings, closeOnClick, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldWrapperState)) {
            return false;
        }
        TextFieldWrapperState textFieldWrapperState = (TextFieldWrapperState) other;
        return Intrinsics.d(this.id, textFieldWrapperState.id) && this.inputState == textFieldWrapperState.inputState && this.inputStatus == textFieldWrapperState.inputStatus && this.inputKeyboardType == textFieldWrapperState.inputKeyboardType && this.inputKeyboardAction == textFieldWrapperState.inputKeyboardAction && Intrinsics.d(this.textFieldPreset, textFieldWrapperState.textFieldPreset) && Intrinsics.d(this.inputTitle, textFieldWrapperState.inputTitle) && Intrinsics.d(this.inputValue, textFieldWrapperState.inputValue) && Intrinsics.d(this.labelText, textFieldWrapperState.labelText) && Intrinsics.d(this.labelTextColor, textFieldWrapperState.labelTextColor) && Intrinsics.d(this.labelIcon, textFieldWrapperState.labelIcon) && Intrinsics.d(this.labelIconColor, textFieldWrapperState.labelIconColor) && this.labelIconPosition == textFieldWrapperState.labelIconPosition && Intrinsics.d(this.isInputCopyEnabled, textFieldWrapperState.isInputCopyEnabled) && Intrinsics.d(this.isInputResetEnabled, textFieldWrapperState.isInputResetEnabled) && Intrinsics.d(this.isInputProtected, textFieldWrapperState.isInputProtected) && Intrinsics.d(this.actionId, textFieldWrapperState.actionId) && Intrinsics.d(this.paddings, textFieldWrapperState.paddings) && this.closeOnClick == textFieldWrapperState.closeOnClick && Intrinsics.d(this.onClick, textFieldWrapperState.onClick);
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    @NotNull
    public final String getId() {
        return this.id;
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

    public final Function2<String, Boolean, Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    public final Rect getPaddings() {
        return this.paddings;
    }

    public final TextFieldPreset getTextFieldPreset() {
        return this.textFieldPreset;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
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
        String str7 = this.actionId;
        int a11 = C3532b.a(d.a(this.paddings, (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31, 31), 31, this.closeOnClick);
        Function2<String, Boolean, Unit> function2 = this.onClick;
        return a11 + (function2 != null ? function2.hashCode() : 0);
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
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        OzonTextInputLayoutModel.State state = this.inputState;
        OzonTextInputLayoutModel.Status status = this.inputStatus;
        OzonTextInputLayoutModel.KeyboardType keyboardType = this.inputKeyboardType;
        OzonTextInputLayoutModel.KeyboardAction keyboardAction = this.inputKeyboardAction;
        TextFieldPreset textFieldPreset = this.textFieldPreset;
        String str2 = this.inputTitle;
        String str3 = this.inputValue;
        String str4 = this.labelText;
        String str5 = this.labelTextColor;
        String str6 = this.labelIcon;
        String str7 = this.labelIconColor;
        AddonSide addonSide = this.labelIconPosition;
        Boolean bool = this.isInputCopyEnabled;
        Boolean bool2 = this.isInputResetEnabled;
        Boolean bool3 = this.isInputProtected;
        String str8 = this.actionId;
        Rect rect = this.paddings;
        boolean z11 = this.closeOnClick;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        StringBuilder sb2 = new StringBuilder("TextFieldWrapperState(id=");
        sb2.append(str);
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
        Nh.a.h(sb2, str2, ", inputValue=", str3, ", labelText=");
        Nh.a.h(sb2, str4, ", labelTextColor=", str5, ", labelIcon=");
        Nh.a.h(sb2, str6, ", labelIconColor=", str7, ", labelIconPosition=");
        sb2.append(addonSide);
        sb2.append(", isInputCopyEnabled=");
        sb2.append(bool);
        sb2.append(", isInputResetEnabled=");
        h.h(sb2, bool2, ", isInputProtected=", bool3, ", actionId=");
        sb2.append(str8);
        sb2.append(", paddings=");
        sb2.append(rect);
        sb2.append(", closeOnClick=");
        sb2.append(z11);
        sb2.append(", onClick=");
        sb2.append(function2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ TextFieldWrapperState(String str, OzonTextInputLayoutModel.State state, OzonTextInputLayoutModel.Status status, OzonTextInputLayoutModel.KeyboardType keyboardType, OzonTextInputLayoutModel.KeyboardAction keyboardAction, TextFieldPreset textFieldPreset, String str2, String str3, String str4, String str5, String str6, String str7, AddonSide addonSide, Boolean bool, Boolean bool2, Boolean bool3, String str8, Rect rect, boolean z11, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, state, status, keyboardType, keyboardAction, textFieldPreset, str2, str3, str4, str5, str6, str7, addonSide, bool, bool2, bool3, str8, (i11 & 131072) != 0 ? i.a() : rect, (i11 & 262144) != 0 ? false : z11, function2);
    }
}
