package ru.ozon.app.android.account.orders.cancel.presentation;

import N3.C3660k;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;", "", "<init>", "()V", "Reason", "Comment", "Annotation", "Checkbox", "Button", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Annotation;", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Comment;", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Reason;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class CancelReasonVO {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Annotation;", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotation", "<init>", "(Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Annotation extends CancelReasonVO {

        @NotNull
        private final DisclaimerAtom annotation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Annotation(@NotNull DisclaimerAtom annotation) {
            super(null);
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            this.annotation = annotation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Annotation) && Intrinsics.d(this.annotation, ((Annotation) other).annotation);
        }

        @NotNull
        public final DisclaimerAtom getAnnotation() {
            return this.annotation;
        }

        public int hashCode() {
            return this.annotation.hashCode();
        }

        @NotNull
        public String toString() {
            return "Annotation(annotation=" + this.annotation + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Button;", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "", "isEnabled", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Z)V", "copy", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Z)Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Button;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Z", "()Z", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button {
        public static final int $stable = ButtonV3Atom.LargeButton.$stable;

        @NotNull
        private final ButtonV3Atom.LargeButton button;
        private final boolean isEnabled;

        public Button(@NotNull ButtonV3Atom.LargeButton button, boolean z11) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.isEnabled = z11;
        }

        public static /* synthetic */ Button copy$default(Button button, ButtonV3Atom.LargeButton largeButton, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                largeButton = button.button;
            }
            if ((i11 & 2) != 0) {
                z11 = button.isEnabled;
            }
            return button.copy(largeButton, z11);
        }

        @NotNull
        public final Button copy(@NotNull ButtonV3Atom.LargeButton button, boolean isEnabled) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new Button(button, isEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.d(this.button, button.button) && this.isEnabled == button.isEnabled;
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getButton() {
            return this.button;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isEnabled) + (this.button.hashCode() * 31);
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public String toString() {
            return "Button(button=" + this.button + ", isEnabled=" + this.isEnabled + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0011\u0010\u001c\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Checkbox;", "", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxState;", "state", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "status", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxState;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)V", "", "toBoolean", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)Z", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxState;)Z", "isCheckedAndEnabled", "()Z", "copy", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxState;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Checkbox;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxState;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "isChecked", "isEnabled", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Checkbox {
        private final CheckBoxDTO.CheckboxState state;
        private final CheckBoxDTO.CheckboxStatus status;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[CheckBoxDTO.CheckboxStatus.values().length];
                try {
                    iArr[CheckBoxDTO.CheckboxStatus.SELECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CheckBoxDTO.CheckboxStatus.INDETERMINATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CheckBoxDTO.CheckboxStatus.EMPTY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[CheckBoxDTO.CheckboxState.values().length];
                try {
                    iArr2[CheckBoxDTO.CheckboxState.ENABLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[CheckBoxDTO.CheckboxState.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[CheckBoxDTO.CheckboxState.DISABLED.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public Checkbox(CheckBoxDTO.CheckboxState checkboxState, CheckBoxDTO.CheckboxStatus checkboxStatus) {
            this.state = checkboxState;
            this.status = checkboxStatus;
        }

        public static /* synthetic */ Checkbox copy$default(Checkbox checkbox, CheckBoxDTO.CheckboxState checkboxState, CheckBoxDTO.CheckboxStatus checkboxStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                checkboxState = checkbox.state;
            }
            if ((i11 & 2) != 0) {
                checkboxStatus = checkbox.status;
            }
            return checkbox.copy(checkboxState, checkboxStatus);
        }

        private final boolean toBoolean(CheckBoxDTO.CheckboxStatus checkboxStatus) {
            return (checkboxStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[checkboxStatus.ordinal()]) == 1;
        }

        @NotNull
        public final Checkbox copy(CheckBoxDTO.CheckboxState state, CheckBoxDTO.CheckboxStatus status) {
            return new Checkbox(state, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Checkbox)) {
                return false;
            }
            Checkbox checkbox = (Checkbox) other;
            return this.state == checkbox.state && this.status == checkbox.status;
        }

        public int hashCode() {
            CheckBoxDTO.CheckboxState checkboxState = this.state;
            int hashCode = (checkboxState == null ? 0 : checkboxState.hashCode()) * 31;
            CheckBoxDTO.CheckboxStatus checkboxStatus = this.status;
            return hashCode + (checkboxStatus != null ? checkboxStatus.hashCode() : 0);
        }

        public final boolean isChecked() {
            return toBoolean(this.status);
        }

        public final boolean isCheckedAndEnabled() {
            return isChecked() && isEnabled();
        }

        public final boolean isEnabled() {
            return toBoolean(this.state);
        }

        @NotNull
        public String toString() {
            return "Checkbox(state=" + this.state + ", status=" + this.status + ")";
        }

        private final boolean toBoolean(CheckBoxDTO.CheckboxState checkboxState) {
            return (checkboxState == null ? -1 : WhenMappings.$EnumSwitchMapping$1[checkboxState.ordinal()]) == 1;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Comment;", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;", "", "text", "hint", "", "isHidden", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Comment;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getHint", "Z", "()Z", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Comment extends CancelReasonVO {
        private final String hint;
        private final boolean isHidden;
        private final String text;

        public Comment(String str, String str2, boolean z11) {
            super(null);
            this.text = str;
            this.hint = str2;
            this.isHidden = z11;
        }

        public static /* synthetic */ Comment copy$default(Comment comment, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = comment.text;
            }
            if ((i11 & 2) != 0) {
                str2 = comment.hint;
            }
            if ((i11 & 4) != 0) {
                z11 = comment.isHidden;
            }
            return comment.copy(str, str2, z11);
        }

        @NotNull
        public final Comment copy(String text, String hint, boolean isHidden) {
            return new Comment(text, hint, isHidden);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Comment)) {
                return false;
            }
            Comment comment = (Comment) other;
            return Intrinsics.d(this.text, comment.text) && Intrinsics.d(this.hint, comment.hint) && this.isHidden == comment.isHidden;
        }

        public final String getHint() {
            return this.hint;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.hint;
            return Boolean.hashCode(this.isHidden) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        /* renamed from: isHidden, reason: from getter */
        public final boolean getIsHidden() {
            return this.isHidden;
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.hint;
            return a.a(")", C3660k.d("Comment(text=", str, ", hint=", str2, ", isHidden="), this.isHidden);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Reason;", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "cell", "", "reasonId", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;Ljava/lang/String;)V", "copy", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;Ljava/lang/String;)Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Reason;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "Ljava/lang/String;", "getReasonId", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Reason extends CancelReasonVO {

        @NotNull
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell;

        @NotNull
        private final String reasonId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reason(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell, @NotNull String reasonId) {
            super(null);
            Intrinsics.checkNotNullParameter(cell, "cell");
            Intrinsics.checkNotNullParameter(reasonId, "reasonId");
            this.cell = cell;
            this.reasonId = reasonId;
        }

        public static /* synthetic */ Reason copy$default(Reason reason, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cellWithSubtitleCheckboxRadio, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellWithSubtitleCheckboxRadio = reason.cell;
            }
            if ((i11 & 2) != 0) {
                str = reason.reasonId;
            }
            return reason.copy(cellWithSubtitleCheckboxRadio, str);
        }

        @NotNull
        public final Reason copy(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell, @NotNull String reasonId) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            Intrinsics.checkNotNullParameter(reasonId, "reasonId");
            return new Reason(cell, reasonId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reason)) {
                return false;
            }
            Reason reason = (Reason) other;
            return Intrinsics.d(this.cell, reason.cell) && Intrinsics.d(this.reasonId, reason.reasonId);
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio getCell() {
            return this.cell;
        }

        @NotNull
        public final String getReasonId() {
            return this.reasonId;
        }

        public int hashCode() {
            return this.reasonId.hashCode() + (this.cell.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Reason(cell=" + this.cell + ", reasonId=" + this.reasonId + ")";
        }
    }

    public /* synthetic */ CancelReasonVO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CancelReasonVO() {
    }
}
