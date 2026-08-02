package ru.ozon.uni.android.input.textinput.domain;

import Sc.o;
import Vc.a;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\f\u0010\u000b\u001a\u00020\u0004*\u00020\nH\u0002J\f\u0010\f\u001a\u00020\r*\u00020\nH\u0002J\f\u0010\u000e\u001a\u00020\u000f*\u00020\nH\u0002J\f\u0010\u0010\u001a\u00020\u0011*\u00020\nH\u0002J\f\u0010\u0012\u001a\u00020\u0011*\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019*\u00020\nH\u0002J\u000e\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\nH\u0002J\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u001a*\u00020\nH\u0002J\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u001a*\u00020\nH\u0002J\u000e\u0010\u001e\u001a\u0004\u0018\u00010\u001a*\u00020\nH\u0002J\u0016\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\f\u0010\"\u001a\u00020\r*\u00020\nH\u0002J\f\u0010#\u001a\u00020\u000f*\u00020\nH\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lru/ozon/uni/android/input/textinput/domain/StateProvider;", "", "renderStateListener", "Lkotlin/Function1;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "renderState", "state", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel;", "mapUI", "getBorderSize", "", "getBorderColor", "", "getIsActive", "", "getHasFocus", "mapKeyboardType", "model", "mapKeyboardAction", "action", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "extractActionButtons", "", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;", "createCopyButton", "createResetButton", "createInfoButton", "createPasswordButton", "getTransformationInputMethod", "Landroid/text/method/TransformationMethod;", "actionButtons", "extractInputAlpha", "extractInputTextColor", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StateProvider {
    private static final float activeBorderSize = UiExtKt.toPxF(2);
    private static final float inactiveBorderSize = UiExtKt.toPxF(1);

    @NotNull
    private final Function1<OzonTextInputUIModel, Unit> renderStateListener;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[OzonTextInputLayoutModel.State.values().length];
            try {
                iArr[OzonTextInputLayoutModel.State.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OzonTextInputLayoutModel.State.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OzonTextInputLayoutModel.State.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OzonTextInputLayoutModel.Status.values().length];
            try {
                iArr2[OzonTextInputLayoutModel.Status.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OzonTextInputLayoutModel.Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OzonTextInputLayoutModel.Status.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OzonTextInputLayoutModel.Status.READONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OzonTextInputLayoutModel.KeyboardType.values().length];
            try {
                iArr3[OzonTextInputLayoutModel.KeyboardType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[OzonTextInputLayoutModel.KeyboardType.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[OzonTextInputLayoutModel.KeyboardType.PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OzonTextInputLayoutModel.KeyboardAction.values().length];
            try {
                iArr4[OzonTextInputLayoutModel.KeyboardAction.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[OzonTextInputLayoutModel.KeyboardAction.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[OzonTextInputLayoutModel.KeyboardAction.f97906GO.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[OzonTextInputLayoutModel.KeyboardAction.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OzonTextInputLayoutModel.KeyboardAction.SEND.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[OzonTextInputLayoutModel.KeyboardAction.NEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[OzonTextInputLayoutModel.KeyboardAction.DONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[OzonTextInputLayoutModel.KeyboardAction.PREVIOUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StateProvider(@NotNull Function1<? super OzonTextInputUIModel, Unit> renderStateListener) {
        Intrinsics.checkNotNullParameter(renderStateListener, "renderStateListener");
        this.renderStateListener = renderStateListener;
    }

    private final OzonTextInputUIModel.ActionButton createCopyButton(OzonTextInputLayoutModel ozonTextInputLayoutModel) {
        boolean z11 = ozonTextInputLayoutModel.getState() == OzonTextInputLayoutModel.State.DEFAULT;
        boolean z12 = ozonTextInputLayoutModel.getStatus() == OzonTextInputLayoutModel.Status.NEUTRAL || ozonTextInputLayoutModel.getStatus() == OzonTextInputLayoutModel.Status.READONLY;
        if (!h.K(ozonTextInputLayoutModel.getInputText()) && z11 && z12 && ozonTextInputLayoutModel.getActionButtonConfig().getCanCopy()) {
            return OzonTextInputUIModel.ActionButton.INSTANCE.createCopyButtonModel();
        }
        return null;
    }

    private final OzonTextInputUIModel.ActionButton createInfoButton(OzonTextInputLayoutModel ozonTextInputLayoutModel) {
        if (ozonTextInputLayoutModel.getState() != OzonTextInputLayoutModel.State.DISABLED && h.K(ozonTextInputLayoutModel.getInputText()) && ozonTextInputLayoutModel.getActionButtonConfig().getHasInfoButton()) {
            return OzonTextInputUIModel.ActionButton.INSTANCE.createInfoButtonModel();
        }
        return null;
    }

    private final OzonTextInputUIModel.ActionButton createPasswordButton(OzonTextInputLayoutModel ozonTextInputLayoutModel) {
        if (ozonTextInputLayoutModel.getStatus() == OzonTextInputLayoutModel.Status.READONLY || ozonTextInputLayoutModel.getState() == OzonTextInputLayoutModel.State.DISABLED || !ozonTextInputLayoutModel.getActionButtonConfig().getPasswordConfig().getIsActive()) {
            return null;
        }
        return ozonTextInputLayoutModel.getActionButtonConfig().getPasswordConfig().getHidePassword() ? OzonTextInputUIModel.ActionButton.INSTANCE.createHiddenPasswordState() : OzonTextInputUIModel.ActionButton.INSTANCE.createVisiblePasswordState();
    }

    private final OzonTextInputUIModel.ActionButton createResetButton(OzonTextInputLayoutModel ozonTextInputLayoutModel) {
        if (ozonTextInputLayoutModel.getActionButtonConfig().getCanReset() && ozonTextInputLayoutModel.getHasFocus() && ozonTextInputLayoutModel.getState() == OzonTextInputLayoutModel.State.ACTIVE && !h.K(ozonTextInputLayoutModel.getInputText())) {
            return OzonTextInputUIModel.ActionButton.INSTANCE.createResetButtonModel();
        }
        return null;
    }

    private final List<OzonTextInputUIModel.ActionButton> extractActionButtons(OzonTextInputLayoutModel ozonTextInputLayoutModel) {
        ArrayList arrayList = new ArrayList();
        if (ozonTextInputLayoutModel.getStatus() == OzonTextInputLayoutModel.Status.SUCCESS) {
            arrayList.add(OzonTextInputUIModel.ActionButton.INSTANCE.createSuccessButtonModel());
            return arrayList;
        }
        OzonTextInputUIModel.ActionButton createCopyButton = createCopyButton(ozonTextInputLayoutModel);
        if (createCopyButton != null) {
            arrayList.add(createCopyButton);
        }
        OzonTextInputUIModel.ActionButton createResetButton = createResetButton(ozonTextInputLayoutModel);
        if (createResetButton != null) {
            arrayList.add(createResetButton);
        }
        OzonTextInputUIModel.ActionButton createInfoButton = createInfoButton(ozonTextInputLayoutModel);
        if (createInfoButton != null) {
            arrayList.add(createInfoButton);
        }
        OzonTextInputUIModel.ActionButton createPasswordButton = createPasswordButton(ozonTextInputLayoutModel);
        if (createPasswordButton != null) {
            arrayList.add(createPasswordButton);
        }
        return C7714v.I0(new Comparator() { // from class: ru.ozon.uni.android.input.textinput.domain.StateProvider$extractActionButtons$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return a.b(Integer.valueOf(((OzonTextInputUIModel.ActionButton) t2).getSortingId()), Integer.valueOf(((OzonTextInputUIModel.ActionButton) t11).getSortingId()));
            }
        }, arrayList);
    }

    private final float extractInputAlpha(OzonTextInputLayoutModel ozonTextInputLayoutModel) {
        return ozonTextInputLayoutModel.getState() != OzonTextInputLayoutModel.State.DISABLED ? 1.0f : 0.4f;
    }

    private final int extractInputTextColor(OzonTextInputLayoutModel ozonTextInputLayoutModel) {
        return ozonTextInputLayoutModel.getState() != OzonTextInputLayoutModel.State.DISABLED ? UniColors.TEXT_PRIMARY.getResId() : UniColors.TEXT_TERTIARY.getResId();
    }

    private final int getBorderColor(OzonTextInputLayoutModel ozonTextInputLayoutModel) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[ozonTextInputLayoutModel.getStatus().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return R$attr.graphicNegativePrimary;
            }
            if (i11 == 3) {
                return R$attr.graphicPositivePrimary;
            }
            if (i11 == 4) {
                return R$attr.graphicDisabled;
            }
            throw new o();
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[ozonTextInputLayoutModel.getState().ordinal()];
        if (i12 == 1) {
            return R$attr.graphicNeutral;
        }
        if (i12 == 2) {
            return R$attr.graphicActionPrimary;
        }
        if (i12 == 3) {
            return R$attr.graphicDisabled;
        }
        throw new o();
    }

    private final float getBorderSize(OzonTextInputLayoutModel ozonTextInputLayoutModel) {
        return ozonTextInputLayoutModel.getState() == OzonTextInputLayoutModel.State.ACTIVE ? activeBorderSize : inactiveBorderSize;
    }

    private final boolean getHasFocus(OzonTextInputLayoutModel ozonTextInputLayoutModel) {
        if (ozonTextInputLayoutModel.getState() == OzonTextInputLayoutModel.State.DISABLED || ozonTextInputLayoutModel.getStatus() == OzonTextInputLayoutModel.Status.READONLY || ozonTextInputLayoutModel.getStatus() == OzonTextInputLayoutModel.Status.SUCCESS) {
            return false;
        }
        if (ozonTextInputLayoutModel.getState() == OzonTextInputLayoutModel.State.ACTIVE) {
            return true;
        }
        return ozonTextInputLayoutModel.getHasFocus();
    }

    private final boolean getIsActive(OzonTextInputLayoutModel ozonTextInputLayoutModel) {
        return (ozonTextInputLayoutModel.getStatus() == OzonTextInputLayoutModel.Status.READONLY || ozonTextInputLayoutModel.getState() == OzonTextInputLayoutModel.State.DISABLED) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    private final TransformationMethod getTransformationInputMethod(List<? extends OzonTextInputUIModel.ActionButton> actionButtons) {
        OzonTextInputUIModel.ActionButton.Password password;
        Iterator it = actionButtons.iterator();
        while (true) {
            if (!it.hasNext()) {
                password = 0;
                break;
            }
            password = it.next();
            if (((OzonTextInputUIModel.ActionButton) password) instanceof OzonTextInputUIModel.ActionButton.Password) {
                break;
            }
        }
        OzonTextInputUIModel.ActionButton.Password password2 = password instanceof OzonTextInputUIModel.ActionButton.Password ? password : null;
        if (password2 == null || !password2.getHidePassword()) {
            SingleLineTransformationMethod singleLineTransformationMethod = SingleLineTransformationMethod.getInstance();
            Intrinsics.f(singleLineTransformationMethod);
            return singleLineTransformationMethod;
        }
        PasswordTransformationMethod passwordTransformationMethod = PasswordTransformationMethod.getInstance();
        Intrinsics.f(passwordTransformationMethod);
        return passwordTransformationMethod;
    }

    private final int mapKeyboardAction(OzonTextInputLayoutModel.KeyboardAction action) {
        switch (WhenMappings.$EnumSwitchMapping$3[action.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            default:
                throw new o();
        }
    }

    private final int mapKeyboardType(OzonTextInputLayoutModel model) {
        int i11 = WhenMappings.$EnumSwitchMapping$2[model.getKeyBoardType().ordinal()];
        if (i11 == 1) {
            return model.getActionButtonConfig().getPasswordConfig().getIsActive() ? 129 : 1;
        }
        if (i11 == 2) {
            return 2;
        }
        if (i11 == 3) {
            return 3;
        }
        throw new o();
    }

    private final OzonTextInputUIModel mapUI(OzonTextInputLayoutModel ozonTextInputLayoutModel) {
        List<OzonTextInputUIModel.ActionButton> extractActionButtons = extractActionButtons(ozonTextInputLayoutModel);
        return new OzonTextInputUIModel(ozonTextInputLayoutModel.getStyle(), mapKeyboardType(ozonTextInputLayoutModel), mapKeyboardAction(ozonTextInputLayoutModel.getKeyboardAction()), getBorderSize(ozonTextInputLayoutModel), getBorderColor(ozonTextInputLayoutModel), getIsActive(ozonTextInputLayoutModel), getHasFocus(ozonTextInputLayoutModel), ozonTextInputLayoutModel.getInputText(), ozonTextInputLayoutModel.getLabelText(), extractInputAlpha(ozonTextInputLayoutModel), extractInputTextColor(ozonTextInputLayoutModel), ozonTextInputLayoutModel.getStatus() == OzonTextInputLayoutModel.Status.READONLY, extractActionButtons, getTransformationInputMethod(extractActionButtons));
    }

    public final void renderState(@NotNull OzonTextInputLayoutModel state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.renderStateListener.invoke(mapUI(state));
    }
}
