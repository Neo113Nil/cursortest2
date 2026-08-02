package ru.ozon.uni.android.input.textinput.data;

import B0.C2454a;
import Ef0.c;
import G.g;
import Kk.C3532b;
import Lh.a;
import Xc.b;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001:\u0005=>?@ABi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017Jt\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u0010\u001bR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<¨\u0006B"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel;", "", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "style", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "state", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "keyBoardType", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "keyboardAction", "", "borderColor", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "status", "", "hasFocus", "", "labelText", "", "inputText", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$ActionButtonConfig;", "actionButtonConfig", "<init>", "(Lru/ozon/uni/android/input/textinput/data/TextInputStyle;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;ILru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;ZLjava/lang/String;Ljava/lang/CharSequence;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$ActionButtonConfig;)V", "copy", "(Lru/ozon/uni/android/input/textinput/data/TextInputStyle;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;ILru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;ZLjava/lang/String;Ljava/lang/CharSequence;Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$ActionButtonConfig;)Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "getStyle", "()Lru/ozon/uni/android/input/textinput/data/TextInputStyle;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "getState", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "getKeyBoardType", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "getKeyboardAction", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "I", "getBorderColor", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "getStatus", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "Z", "getHasFocus", "()Z", "Ljava/lang/String;", "getLabelText", "Ljava/lang/CharSequence;", "getInputText", "()Ljava/lang/CharSequence;", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$ActionButtonConfig;", "getActionButtonConfig", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$ActionButtonConfig;", "KeyboardType", "KeyboardAction", "State", "Status", "ActionButtonConfig", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OzonTextInputLayoutModel {

    @NotNull
    private final ActionButtonConfig actionButtonConfig;
    private final int borderColor;
    private final boolean hasFocus;

    @NotNull
    private final CharSequence inputText;

    @NotNull
    private final KeyboardType keyBoardType;

    @NotNull
    private final KeyboardAction keyboardAction;

    @NotNull
    private final String labelText;

    @NotNull
    private final State state;

    @NotNull
    private final Status status;

    @NotNull
    private final TextInputStyle style;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$ActionButtonConfig;", "", "", "canCopy", "canReset", "hasInfoButton", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$ActionButtonConfig$PasswordConfig;", "passwordConfig", "<init>", "(ZZZLru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$ActionButtonConfig$PasswordConfig;)V", "copy", "(ZZZLru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$ActionButtonConfig$PasswordConfig;)Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$ActionButtonConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getCanCopy", "()Z", "getCanReset", "getHasInfoButton", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$ActionButtonConfig$PasswordConfig;", "getPasswordConfig", "()Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$ActionButtonConfig$PasswordConfig;", "PasswordConfig", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionButtonConfig {
        private final boolean canCopy;
        private final boolean canReset;
        private final boolean hasInfoButton;

        @NotNull
        private final PasswordConfig passwordConfig;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$ActionButtonConfig$PasswordConfig;", "", "", "isActive", "hidePassword", "<init>", "(ZZ)V", "copy", "(ZZ)Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$ActionButtonConfig$PasswordConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "getHidePassword", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PasswordConfig {
            private final boolean hidePassword;
            private final boolean isActive;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PasswordConfig() {
                this(r2, r2, 3, null);
                boolean z11 = false;
            }

            @NotNull
            public final PasswordConfig copy(boolean isActive, boolean hidePassword) {
                return new PasswordConfig(isActive, hidePassword);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PasswordConfig)) {
                    return false;
                }
                PasswordConfig passwordConfig = (PasswordConfig) other;
                return this.isActive == passwordConfig.isActive && this.hidePassword == passwordConfig.hidePassword;
            }

            public final boolean getHidePassword() {
                return this.hidePassword;
            }

            public int hashCode() {
                return Boolean.hashCode(this.hidePassword) + (Boolean.hashCode(this.isActive) * 31);
            }

            /* renamed from: isActive, reason: from getter */
            public final boolean getIsActive() {
                return this.isActive;
            }

            @NotNull
            public String toString() {
                return c.c("PasswordConfig(isActive=", ", hidePassword=", ")", this.isActive, this.hidePassword);
            }

            public PasswordConfig(boolean z11, boolean z12) {
                this.isActive = z11;
                this.hidePassword = z12;
            }

            public /* synthetic */ PasswordConfig(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? true : z12);
            }
        }

        public ActionButtonConfig() {
            this(false, false, false, null, 15, null);
        }

        public static /* synthetic */ ActionButtonConfig copy$default(ActionButtonConfig actionButtonConfig, boolean z11, boolean z12, boolean z13, PasswordConfig passwordConfig, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = actionButtonConfig.canCopy;
            }
            if ((i11 & 2) != 0) {
                z12 = actionButtonConfig.canReset;
            }
            if ((i11 & 4) != 0) {
                z13 = actionButtonConfig.hasInfoButton;
            }
            if ((i11 & 8) != 0) {
                passwordConfig = actionButtonConfig.passwordConfig;
            }
            return actionButtonConfig.copy(z11, z12, z13, passwordConfig);
        }

        @NotNull
        public final ActionButtonConfig copy(boolean canCopy, boolean canReset, boolean hasInfoButton, @NotNull PasswordConfig passwordConfig) {
            Intrinsics.checkNotNullParameter(passwordConfig, "passwordConfig");
            return new ActionButtonConfig(canCopy, canReset, hasInfoButton, passwordConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionButtonConfig)) {
                return false;
            }
            ActionButtonConfig actionButtonConfig = (ActionButtonConfig) other;
            return this.canCopy == actionButtonConfig.canCopy && this.canReset == actionButtonConfig.canReset && this.hasInfoButton == actionButtonConfig.hasInfoButton && Intrinsics.d(this.passwordConfig, actionButtonConfig.passwordConfig);
        }

        public final boolean getCanCopy() {
            return this.canCopy;
        }

        public final boolean getCanReset() {
            return this.canReset;
        }

        public final boolean getHasInfoButton() {
            return this.hasInfoButton;
        }

        @NotNull
        public final PasswordConfig getPasswordConfig() {
            return this.passwordConfig;
        }

        public int hashCode() {
            return this.passwordConfig.hashCode() + C3532b.a(C3532b.a(Boolean.hashCode(this.canCopy) * 31, 31, this.canReset), 31, this.hasInfoButton);
        }

        @NotNull
        public String toString() {
            boolean z11 = this.canCopy;
            boolean z12 = this.canReset;
            boolean z13 = this.hasInfoButton;
            PasswordConfig passwordConfig = this.passwordConfig;
            StringBuilder d11 = a.d("ActionButtonConfig(canCopy=", ", canReset=", ", hasInfoButton=", z11, z12);
            d11.append(z13);
            d11.append(", passwordConfig=");
            d11.append(passwordConfig);
            d11.append(")");
            return d11.toString();
        }

        public ActionButtonConfig(boolean z11, boolean z12, boolean z13, @NotNull PasswordConfig passwordConfig) {
            Intrinsics.checkNotNullParameter(passwordConfig, "passwordConfig");
            this.canCopy = z11;
            this.canReset = z12;
            this.hasInfoButton = z13;
            this.passwordConfig = passwordConfig;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ActionButtonConfig(boolean z11, boolean z12, boolean z13, PasswordConfig passwordConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? new PasswordConfig(r0, r0, 3, null) : passwordConfig);
            boolean z14 = false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardAction;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "UNSPECIFIED", "GO", "SEARCH", "SEND", "NEXT", "DONE", "PREVIOUS", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class KeyboardAction {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ KeyboardAction[] $VALUES;
        public static final KeyboardAction NONE = new KeyboardAction("NONE", 0);
        public static final KeyboardAction UNSPECIFIED = new KeyboardAction("UNSPECIFIED", 1);

        /* renamed from: GO, reason: collision with root package name */
        public static final KeyboardAction f97906GO = new KeyboardAction("GO", 2);
        public static final KeyboardAction SEARCH = new KeyboardAction("SEARCH", 3);
        public static final KeyboardAction SEND = new KeyboardAction("SEND", 4);
        public static final KeyboardAction NEXT = new KeyboardAction("NEXT", 5);
        public static final KeyboardAction DONE = new KeyboardAction("DONE", 6);
        public static final KeyboardAction PREVIOUS = new KeyboardAction("PREVIOUS", 7);

        private static final /* synthetic */ KeyboardAction[] $values() {
            return new KeyboardAction[]{NONE, UNSPECIFIED, f97906GO, SEARCH, SEND, NEXT, DONE, PREVIOUS};
        }

        static {
            KeyboardAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private KeyboardAction(String str, int i11) {
        }

        public static KeyboardAction valueOf(String str) {
            return (KeyboardAction) Enum.valueOf(KeyboardAction.class, str);
        }

        public static KeyboardAction[] values() {
            return (KeyboardAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$KeyboardType;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT", "NUMBER", "PHONE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class KeyboardType {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ KeyboardType[] $VALUES;
        public static final KeyboardType TEXT = new KeyboardType("TEXT", 0);
        public static final KeyboardType NUMBER = new KeyboardType("NUMBER", 1);
        public static final KeyboardType PHONE = new KeyboardType("PHONE", 2);

        private static final /* synthetic */ KeyboardType[] $values() {
            return new KeyboardType[]{TEXT, NUMBER, PHONE};
        }

        static {
            KeyboardType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private KeyboardType(String str, int i11) {
        }

        public static KeyboardType valueOf(String str) {
            return (KeyboardType) Enum.valueOf(KeyboardType.class, str);
        }

        public static KeyboardType[] values() {
            return (KeyboardType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$State;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "ACTIVE", "DISABLED", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State DEFAULT = new State("DEFAULT", 0);
        public static final State ACTIVE = new State("ACTIVE", 1);
        public static final State DISABLED = new State("DISABLED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{DEFAULT, ACTIVE, DISABLED};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private State(String str, int i11) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/input/textinput/data/OzonTextInputLayoutModel$Status;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "ERROR", "SUCCESS", "READONLY", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status NEUTRAL = new Status("NEUTRAL", 0);
        public static final Status ERROR = new Status("ERROR", 1);
        public static final Status SUCCESS = new Status("SUCCESS", 2);
        public static final Status READONLY = new Status("READONLY", 3);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{NEUTRAL, ERROR, SUCCESS, READONLY};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Status(String str, int i11) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public OzonTextInputLayoutModel(@NotNull TextInputStyle style, @NotNull State state, @NotNull KeyboardType keyBoardType, @NotNull KeyboardAction keyboardAction, int i11, @NotNull Status status, boolean z11, @NotNull String labelText, @NotNull CharSequence inputText, @NotNull ActionButtonConfig actionButtonConfig) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(keyBoardType, "keyBoardType");
        Intrinsics.checkNotNullParameter(keyboardAction, "keyboardAction");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        Intrinsics.checkNotNullParameter(actionButtonConfig, "actionButtonConfig");
        this.style = style;
        this.state = state;
        this.keyBoardType = keyBoardType;
        this.keyboardAction = keyboardAction;
        this.borderColor = i11;
        this.status = status;
        this.hasFocus = z11;
        this.labelText = labelText;
        this.inputText = inputText;
        this.actionButtonConfig = actionButtonConfig;
    }

    public static /* synthetic */ OzonTextInputLayoutModel copy$default(OzonTextInputLayoutModel ozonTextInputLayoutModel, TextInputStyle textInputStyle, State state, KeyboardType keyboardType, KeyboardAction keyboardAction, int i11, Status status, boolean z11, String str, CharSequence charSequence, ActionButtonConfig actionButtonConfig, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            textInputStyle = ozonTextInputLayoutModel.style;
        }
        if ((i12 & 2) != 0) {
            state = ozonTextInputLayoutModel.state;
        }
        if ((i12 & 4) != 0) {
            keyboardType = ozonTextInputLayoutModel.keyBoardType;
        }
        if ((i12 & 8) != 0) {
            keyboardAction = ozonTextInputLayoutModel.keyboardAction;
        }
        if ((i12 & 16) != 0) {
            i11 = ozonTextInputLayoutModel.borderColor;
        }
        if ((i12 & 32) != 0) {
            status = ozonTextInputLayoutModel.status;
        }
        if ((i12 & 64) != 0) {
            z11 = ozonTextInputLayoutModel.hasFocus;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str = ozonTextInputLayoutModel.labelText;
        }
        if ((i12 & 256) != 0) {
            charSequence = ozonTextInputLayoutModel.inputText;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            actionButtonConfig = ozonTextInputLayoutModel.actionButtonConfig;
        }
        CharSequence charSequence2 = charSequence;
        ActionButtonConfig actionButtonConfig2 = actionButtonConfig;
        boolean z12 = z11;
        String str2 = str;
        int i13 = i11;
        Status status2 = status;
        return ozonTextInputLayoutModel.copy(textInputStyle, state, keyboardType, keyboardAction, i13, status2, z12, str2, charSequence2, actionButtonConfig2);
    }

    @NotNull
    public final OzonTextInputLayoutModel copy(@NotNull TextInputStyle style, @NotNull State state, @NotNull KeyboardType keyBoardType, @NotNull KeyboardAction keyboardAction, int borderColor, @NotNull Status status, boolean hasFocus, @NotNull String labelText, @NotNull CharSequence inputText, @NotNull ActionButtonConfig actionButtonConfig) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(keyBoardType, "keyBoardType");
        Intrinsics.checkNotNullParameter(keyboardAction, "keyboardAction");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        Intrinsics.checkNotNullParameter(actionButtonConfig, "actionButtonConfig");
        return new OzonTextInputLayoutModel(style, state, keyBoardType, keyboardAction, borderColor, status, hasFocus, labelText, inputText, actionButtonConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OzonTextInputLayoutModel)) {
            return false;
        }
        OzonTextInputLayoutModel ozonTextInputLayoutModel = (OzonTextInputLayoutModel) other;
        return Intrinsics.d(this.style, ozonTextInputLayoutModel.style) && this.state == ozonTextInputLayoutModel.state && this.keyBoardType == ozonTextInputLayoutModel.keyBoardType && this.keyboardAction == ozonTextInputLayoutModel.keyboardAction && this.borderColor == ozonTextInputLayoutModel.borderColor && this.status == ozonTextInputLayoutModel.status && this.hasFocus == ozonTextInputLayoutModel.hasFocus && Intrinsics.d(this.labelText, ozonTextInputLayoutModel.labelText) && Intrinsics.d(this.inputText, ozonTextInputLayoutModel.inputText) && Intrinsics.d(this.actionButtonConfig, ozonTextInputLayoutModel.actionButtonConfig);
    }

    @NotNull
    public final ActionButtonConfig getActionButtonConfig() {
        return this.actionButtonConfig;
    }

    public final boolean getHasFocus() {
        return this.hasFocus;
    }

    @NotNull
    public final CharSequence getInputText() {
        return this.inputText;
    }

    @NotNull
    public final KeyboardType getKeyBoardType() {
        return this.keyBoardType;
    }

    @NotNull
    public final KeyboardAction getKeyboardAction() {
        return this.keyboardAction;
    }

    @NotNull
    public final String getLabelText() {
        return this.labelText;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final TextInputStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        return this.actionButtonConfig.hashCode() + ((this.inputText.hashCode() + g.a(C3532b.a((this.status.hashCode() + C2454a.a(this.borderColor, (this.keyboardAction.hashCode() + ((this.keyBoardType.hashCode() + ((this.state.hashCode() + (this.style.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31, 31, this.hasFocus), 31, this.labelText)) * 31);
    }

    @NotNull
    public String toString() {
        TextInputStyle textInputStyle = this.style;
        State state = this.state;
        KeyboardType keyboardType = this.keyBoardType;
        KeyboardAction keyboardAction = this.keyboardAction;
        int i11 = this.borderColor;
        Status status = this.status;
        boolean z11 = this.hasFocus;
        String str = this.labelText;
        CharSequence charSequence = this.inputText;
        ActionButtonConfig actionButtonConfig = this.actionButtonConfig;
        StringBuilder sb2 = new StringBuilder("OzonTextInputLayoutModel(style=");
        sb2.append(textInputStyle);
        sb2.append(", state=");
        sb2.append(state);
        sb2.append(", keyBoardType=");
        sb2.append(keyboardType);
        sb2.append(", keyboardAction=");
        sb2.append(keyboardAction);
        sb2.append(", borderColor=");
        sb2.append(i11);
        sb2.append(", status=");
        sb2.append(status);
        sb2.append(", hasFocus=");
        C5766e.a(", labelText=", str, ", inputText=", sb2, z11);
        sb2.append((Object) charSequence);
        sb2.append(", actionButtonConfig=");
        sb2.append(actionButtonConfig);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ OzonTextInputLayoutModel(TextInputStyle textInputStyle, State state, KeyboardType keyboardType, KeyboardAction keyboardAction, int i11, Status status, boolean z11, String str, CharSequence charSequence, ActionButtonConfig actionButtonConfig, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? TextInputStyle.INSTANCE.createInput600Style() : textInputStyle, (i12 & 2) != 0 ? State.DEFAULT : state, (i12 & 4) != 0 ? KeyboardType.TEXT : keyboardType, (i12 & 8) != 0 ? KeyboardAction.UNSPECIFIED : keyboardAction, (i12 & 16) != 0 ? UniColors.GRAPHIC_NEUTRAL.getResId() : i11, (i12 & 32) != 0 ? Status.NEUTRAL : status, z11, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str, (i12 & 256) != 0 ? "" : charSequence, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? new ActionButtonConfig(false, false, false, null, 15, null) : actionButtonConfig);
    }
}
