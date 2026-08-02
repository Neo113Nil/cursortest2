package ru.ozon.app.android.cml.delivery.common.ext;

import Sc.o;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeDTO;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher.DelayedActionTextWatcher;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u000b\u001a\u00020\b*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "toOzonTextInputLayoutStatus", "(Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;)Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "Lru/ozon/uni/core/UniColors;", "toOzonColor", "(Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;)Lru/ozon/uni/core/UniColors;", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "Landroidx/appcompat/widget/AppCompatEditText;", "getEditText", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;)Landroidx/appcompat/widget/AppCompatEditText;", "editText", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/DelayedActionTextWatcher;", "getDelayedActionTextWatcher", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;)Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/DelayedActionTextWatcher;", "delayedActionTextWatcher", "delivery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OzonTextInputLayoutExtKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputMoleculeDTO.InputStatus.values().length];
            try {
                iArr[InputMoleculeDTO.InputStatus.STATUS_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputMoleculeDTO.InputStatus.NEUTRAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputMoleculeDTO.InputStatus.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InputMoleculeDTO.InputStatus.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InputMoleculeDTO.InputStatus.READONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final DelayedActionTextWatcher getDelayedActionTextWatcher(@NotNull OzonTextInputLayout ozonTextInputLayout) {
        Intrinsics.checkNotNullParameter(ozonTextInputLayout, "<this>");
        OzonTextWatcher textWatcher = ozonTextInputLayout.getTextWatcher();
        if (textWatcher instanceof DelayedActionTextWatcher) {
            return (DelayedActionTextWatcher) textWatcher;
        }
        return null;
    }

    @NotNull
    public static final AppCompatEditText getEditText(@NotNull OzonTextInputLayout ozonTextInputLayout) {
        Intrinsics.checkNotNullParameter(ozonTextInputLayout, "<this>");
        return ozonTextInputLayout.getInputViewGroup().getInputView();
    }

    @NotNull
    public static final UniColors toOzonColor(@NotNull InputMoleculeDTO.InputStatus inputStatus) {
        Intrinsics.checkNotNullParameter(inputStatus, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[inputStatus.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                return UniColors.TEXT_NEGATIVE;
            }
            if (i11 == 4) {
                return UniColors.TEXT_POSITIVE;
            }
            if (i11 != 5) {
                throw new o();
            }
        }
        return UniColors.TEXT_SECONDARY;
    }

    @NotNull
    public static final OzonTextInputLayoutModel.Status toOzonTextInputLayoutStatus(@NotNull InputMoleculeDTO.InputStatus inputStatus) {
        Intrinsics.checkNotNullParameter(inputStatus, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[inputStatus.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return OzonTextInputLayoutModel.Status.NEUTRAL;
        }
        if (i11 == 3) {
            return OzonTextInputLayoutModel.Status.ERROR;
        }
        if (i11 == 4) {
            return OzonTextInputLayoutModel.Status.SUCCESS;
        }
        if (i11 == 5) {
            return OzonTextInputLayoutModel.Status.READONLY;
        }
        throw new o();
    }
}
