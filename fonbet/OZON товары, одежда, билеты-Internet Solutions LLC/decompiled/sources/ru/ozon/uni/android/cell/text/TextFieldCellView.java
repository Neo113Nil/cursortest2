package ru.ozon.uni.android.cell.text;

import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.cell.label.SmartLabel;
import ru.ozon.uni.android.cell.text.data.TextFieldPreset;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;
import ru.ozon.uni.android.wrappers.mainaddon.data.Axis;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 \u008c\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u008c\u0001BE\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u00182\b\b\u0001\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00182\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00182\u0006\u00101\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0011\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u0010H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u0010H\u0016¢\u0006\u0004\b=\u0010<J'\u0010@\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u00102\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010>H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020\u00182\u0006\u0010B\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\u0010H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010J\u001a\u00020\u00182\u0006\u0010G\u001a\u00020FH\u0010¢\u0006\u0004\bH\u0010IJ\u000f\u0010M\u001a\u00020\u0018H\u0010¢\u0006\u0004\bK\u0010LR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\b\u0011\u0010OR*\u0010Q\u001a\u0002002\u0006\u0010P\u001a\u0002008\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u00103R\u001c\u0010X\u001a\n W*\u0004\u0018\u00010V0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR*\u0010Z\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010`\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010f\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR.\u0010l\u001a\u0004\u0018\u0001042\b\u0010P\u001a\u0004\u0018\u0001048\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u00106R*\u0010q\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR.\u0010x\u001a\u0004\u0018\u00010w2\b\u0010P\u001a\u0004\u0018\u00010w8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R+\u0010~\u001a\u00020\u00102\u0006\u0010P\u001a\u00020\u00108\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b~\u0010N\u001a\u0004\b\u007f\u0010O\"\u0005\b\u0080\u0001\u0010<R1\u0010\u0081\u0001\u001a\u00020\u00152\u0006\u0010P\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R'\u0010\u0089\u0001\u001a\u00020\u00102\u0006\u0010P\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010O\"\u0005\b\u0088\u0001\u0010<R\u0016\u0010\u008b\u0001\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010c¨\u0006\u008d\u0001"}, d2 = {"Lru/ozon/uni/android/cell/text/TextFieldCellView;", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "Lru/ozon/uni/android/cell/label/SmartLabel;", "Lru/ozon/uni/android/cell/text/TextFieldCellApi;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/cell/text/data/TextFieldPreset;", "defPreset", "", "isRootWrapper", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/cell/text/data/TextFieldPreset;Z)V", "labelIcon", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "labelIconPosition", "labelIconColor", "", "setLabelIcon", "(Ljava/lang/Integer;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Ljava/lang/Integer;)V", "color", "", "alpha", "setLabelColor", "(IF)V", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "type", "setInputKeyboardType", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;)V", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "action", "setInputKeyboardAction", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;)V", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "status", "setInputStatus", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;)V", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "state", "setInputState", "(Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;)V", "", "text", "setInputLabelText", "(Ljava/lang/String;)V", "", "setInputText", "(Ljava/lang/CharSequence;)V", "Landroid/text/Editable;", "getInputText", "()Landroid/text/Editable;", "flag", "inputCanCopy", "(Z)V", "inputCanReset", "Lkotlin/Function0;", "clickListener", "inputHasInfo", "(ZLkotlin/jvm/functions/Function0;)V", "isActive", "hidePassword", "inputHasPassword", "(ZZ)V", "Landroidx/constraintlayout/widget/d;", "constraintSet", "onConstraintsCollected$uni_release", "(Landroidx/constraintlayout/widget/d;)V", "onConstraintsCollected", "setAddonVisibility$uni_release", "()V", "setAddonVisibility", "Z", "()Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "Landroid/text/method/MovementMethod;", "kotlin.jvm.PlatformType", "moveMethod", "Landroid/text/method/MovementMethod;", "preset", "Lru/ozon/uni/android/cell/text/data/TextFieldPreset;", "getPreset", "()Lru/ozon/uni/android/cell/text/data/TextFieldPreset;", "setPreset", "(Lru/ozon/uni/android/cell/text/data/TextFieldPreset;)V", "mainView", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "getMainView", "()Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "setMainView", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;)V", "addonView", "Lru/ozon/uni/android/cell/label/SmartLabel;", "getAddonView", "()Lru/ozon/uni/android/cell/label/SmartLabel;", "setAddonView", "(Lru/ozon/uni/android/cell/label/SmartLabel;)V", "labelText", "Ljava/lang/CharSequence;", "getLabelText", "()Ljava/lang/CharSequence;", "setLabelText", "labelNumberOfLines", "I", "getLabelNumberOfLines", "()I", "setLabelNumberOfLines", "(I)V", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "labelTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getLabelTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setLabelTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "labelTagSupported", "getLabelTagSupported", "setLabelTagSupported", "labelIconSide", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "getLabelIconSide", "()Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "setLabelIconSide", "(Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;)V", "getTruncateOnLostFocus", "setTruncateOnLostFocus", "truncateOnLostFocus", "getOzonTextInputLayout", "ozonTextInputLayout", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextFieldCellView extends MainAddonWrapperV3<OzonTextInputLayout, SmartLabel> implements TextFieldCellApi, AtomView, AtomLocatableView {

    @NotNull
    private SmartLabel addonView;
    private final boolean isRootWrapper;

    @NotNull
    private AddonSide labelIconSide;
    private int labelNumberOfLines;
    private boolean labelTagSupported;
    private CharSequence labelText;
    private CommonAtomLabelDTO.TruncatingMode labelTruncatingMode;

    @NotNull
    private String locatorTag;

    @NotNull
    private OzonTextInputLayout mainView;
    private final MovementMethod moveMethod;

    @NotNull
    private TextFieldPreset preset;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/cell/text/TextFieldCellView$Companion;", "", "<init>", "()V", "TEXT_FIELD_LOCATOR_TAG", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CommonAtomLabelDTO.TruncatingMode.values().length];
            try {
                iArr[CommonAtomLabelDTO.TruncatingMode.TAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonAtomLabelDTO.TruncatingMode.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonAtomLabelDTO.TruncatingMode.HEAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Axis.values().length];
            try {
                iArr2[Axis.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Axis.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldCellView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, false, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final OzonTextInputLayout getOzonTextInputLayout() {
        return getMainView();
    }

    public Editable getInputText() {
        return getMainView().getInputText();
    }

    public boolean getLabelTagSupported() {
        return this.labelTagSupported;
    }

    public CharSequence getLabelText() {
        return this.labelText;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    public void inputCanCopy(boolean flag) {
        getMainView().canCopy(flag);
    }

    public void inputCanReset(boolean flag) {
        getMainView().canReset(flag);
    }

    public void inputHasInfo(boolean flag, Function0<Unit> clickListener) {
        getMainView().hasInfo(flag, clickListener);
    }

    @Override // ru.ozon.uni.android.cell.text.TextFieldCellApi
    public void inputHasPassword(boolean isActive, boolean hidePassword) {
        getMainView().hasPassword(isActive, hidePassword);
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    /* renamed from: isRootWrapper, reason: from getter */
    public boolean getIsRootWrapper() {
        return this.isRootWrapper;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    public void onConstraintsCollected$uni_release(@NotNull d constraintSet) {
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        super.onConstraintsCollected$uni_release(constraintSet);
        constraintSet.v(getOzonTextInputLayout().getId(), 0);
        constraintSet.w(getOzonTextInputLayout().getId(), -2);
        constraintSet.C(getOzonTextInputLayout().getId(), true);
        constraintSet.B(getOzonTextInputLayout().getId());
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    public void setAddonVisibility$uni_release() {
        Flow flowByViewId;
        super.setAddonVisibility$uni_release();
        Flow flowByViewId2 = getFlowByViewId(getAddonView().getId());
        if (flowByViewId2 == null || (flowByViewId = getFlowByViewId(flowByViewId2.getId())) == null) {
            return;
        }
        CharSequence labelText = getLabelText();
        if (labelText == null || labelText.length() == 0) {
            ViewExtKt.gone(getAddonView());
            Flow flowByViewId3 = getFlowByViewId(getAddonView().getId());
            if (flowByViewId3 != null) {
                ViewExtKt.gone(flowByViewId3);
            }
            int i11 = WhenMappings.$EnumSwitchMapping$1[getMainAddonSettings().getAxis().ordinal()];
            if (i11 == 1) {
                flowByViewId.setHorizontalGap(0);
                return;
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                flowByViewId.setVerticalGap(0);
                return;
            }
        }
        ViewExtKt.show(getAddonView());
        Flow flowByViewId4 = getFlowByViewId(getAddonView().getId());
        if (flowByViewId4 != null) {
            ViewExtKt.show(flowByViewId4);
        }
        int i12 = WhenMappings.$EnumSwitchMapping$1[getMainAddonSettings().getAxis().ordinal()];
        if (i12 == 1) {
            flowByViewId.setHorizontalGap(getMainAddonSettings().getGap());
        } else {
            if (i12 != 2) {
                throw new o();
            }
            flowByViewId.setVerticalGap(getMainAddonSettings().getGap());
        }
    }

    public void setInputKeyboardAction(@NotNull OzonTextInputLayoutModel.KeyboardAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        getMainView().setKeyboardAction(action);
    }

    public void setInputKeyboardType(@NotNull OzonTextInputLayoutModel.KeyboardType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        getMainView().setKeyboardType(type);
    }

    public void setInputLabelText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        getMainView().setLabelText(text);
    }

    public void setInputState(@NotNull OzonTextInputLayoutModel.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getMainView().setState(state);
    }

    public void setInputStatus(@NotNull OzonTextInputLayoutModel.Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        getMainView().setStatus(status);
    }

    public void setInputText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        getMainView().setInputText(text);
    }

    @Override // ru.ozon.uni.android.cell.text.TextFieldCellApi
    public void setLabelColor(int color, float alpha) {
        getAddonView().setTextColor(color);
        getAddonView().setAlpha(alpha);
    }

    public void setLabelIcon(Integer labelIcon, @NotNull AddonSide labelIconPosition, Integer labelIconColor) {
        Intrinsics.checkNotNullParameter(labelIconPosition, "labelIconPosition");
        if (labelIcon != null) {
            getAddonView().setIcon(labelIconPosition, Integer.valueOf(labelIcon.intValue()), labelIconColor);
        }
    }

    public void setLabelText(CharSequence charSequence) {
        CharSequence charSequence2 = this.labelText;
        boolean z11 = true;
        if (charSequence2 != null) {
            if ((charSequence2 == null || charSequence2.length() == 0) == (charSequence == null || charSequence.length() == 0)) {
                z11 = false;
            }
        }
        this.labelText = charSequence;
        if (getLabelTagSupported()) {
            getAddonView().setText(this.labelText);
            getAddonView().setMovementMethod(this.moveMethod);
        } else {
            SmartLabel addonView = getAddonView();
            CharSequence charSequence3 = this.labelText;
            addonView.setText(charSequence3 != null ? charSequence3.toString() : null);
        }
        if (z11) {
            changeAddonVisibilityIfNeeded();
        }
    }

    public void setLabelTruncatingMode(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.labelTruncatingMode = truncatingMode;
        int i11 = truncatingMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[truncatingMode.ordinal()];
        if (i11 == 1) {
            getAddonView().setEllipsize(TextUtils.TruncateAt.END);
            return;
        }
        if (i11 == 2) {
            getAddonView().setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i11 != 3) {
            getAddonView().setEllipsize(TextUtils.TruncateAt.END);
        } else {
            getAddonView().setEllipsize(TextUtils.TruncateAt.START);
        }
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    public final void setPreset(@NotNull TextFieldPreset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        getAddonView().withSmartLabelPreset(this.preset.getAddonPreset().getSmartLabelPreset());
        setMainAddonSettings(this.preset.getAddonPreset().getMainAddonSettings());
        getMainView().setStyle(this.preset.getMainPreset());
    }

    public void setTruncateOnLostFocus(boolean z11) {
        getMainView().setTruncateOnLostFocus$uni_release(z11);
    }

    public /* synthetic */ TextFieldCellView(Context context, AttributeSet attributeSet, int i11, int i12, TextFieldPreset textFieldPreset, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? TextFieldPresets.INSTANCE.getDefault500Start() : textFieldPreset, (i13 & 32) != 0 ? true : z11);
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public SmartLabel getAddonView() {
        return this.addonView;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public OzonTextInputLayout getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull TextFieldPreset defPreset, boolean z11) {
        super(context, attributeSet, i11, i12, defPreset.getAddonPreset().getMainAddonSettings(), z11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defPreset, "defPreset");
        this.isRootWrapper = z11;
        this.locatorTag = "textField";
        this.moveMethod = LinkMovementMethod.getInstance();
        this.preset = defPreset;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        int i14 = 0;
        this.mainView = new OzonTextInputLayout(context, attributeSet2, i14, i13, defaultConstructorMarker);
        this.addonView = new SmartLabel(context, attributeSet2, i14, i13, defaultConstructorMarker).withSmartLabelPreset(this.preset.getAddonPreset().getSmartLabelPreset());
        this.labelNumberOfLines = Integer.MAX_VALUE;
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.labelTruncatingMode = truncatingMode;
        this.labelIconSide = AddonSide.END;
        setViews();
        if (getIsRootWrapper()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TextFieldCellView, i11, i12);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            setLabelText(obtainStyledAttributes.getString(R$styleable.TextFieldCellView_textFieldAddonText));
            int color = obtainStyledAttributes.getColor(R$styleable.TextFieldCellView_textFieldAddonTextColor, -1);
            if (color != -1) {
                getAddonView().setTextColor(color);
            }
            setLabelTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.TextFieldCellView_textFieldAddonTruncatingMode, truncatingMode.ordinal())]);
            obtainStyledAttributes.recycle();
        }
        setContentDescription(getLocatorTag());
    }
}
