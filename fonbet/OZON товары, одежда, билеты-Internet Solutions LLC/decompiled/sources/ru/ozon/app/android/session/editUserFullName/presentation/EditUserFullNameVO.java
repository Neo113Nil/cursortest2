package ru.ozon.app.android.session.editUserFullName.presentation;

import Ak.C2436a;
import B0.C2454a;
import C.o0;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Tl.b;
import c8.C5766e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001*B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJJ\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO$InputVO;", "inputs", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "submitButton", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "submitButtonAction", "<init>", "(JLjava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "copy", "(JLjava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "getSubmitButtonAction", "()Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "InputVO", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EditUserFullNameVO implements c {
    private final long id;

    @NotNull
    private final List<InputVO> inputs;

    @NotNull
    private final ButtonV3Atom.LargeButton submitButton;
    private final AtomAction.ComposerAction submitButtonAction;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJZ\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO$InputVO;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, HammersV3BodyDTO.PLACEHOLDER, "", "shouldBindValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "imeOptions", "shouldRequestFocusAndOpenKeyboard", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZLjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZLjava/lang/String;)Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO$InputVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getPlaceholder", "Z", "getShouldBindValue", "()Z", "getValue", "I", "getImeOptions", "getShouldRequestFocusAndOpenKeyboard", "getErrorMessage", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputVO {
        private final String errorMessage;
        private final int imeOptions;

        @NotNull
        private final String name;

        @NotNull
        private final String placeholder;
        private final boolean shouldBindValue;
        private final boolean shouldRequestFocusAndOpenKeyboard;
        private final String value;

        public InputVO(@NotNull String name, @NotNull String placeholder, boolean z11, String str, int i11, boolean z12, String str2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.name = name;
            this.placeholder = placeholder;
            this.shouldBindValue = z11;
            this.value = str;
            this.imeOptions = i11;
            this.shouldRequestFocusAndOpenKeyboard = z12;
            this.errorMessage = str2;
        }

        public static /* synthetic */ InputVO copy$default(InputVO inputVO, String str, String str2, boolean z11, String str3, int i11, boolean z12, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = inputVO.name;
            }
            if ((i12 & 2) != 0) {
                str2 = inputVO.placeholder;
            }
            if ((i12 & 4) != 0) {
                z11 = inputVO.shouldBindValue;
            }
            if ((i12 & 8) != 0) {
                str3 = inputVO.value;
            }
            if ((i12 & 16) != 0) {
                i11 = inputVO.imeOptions;
            }
            if ((i12 & 32) != 0) {
                z12 = inputVO.shouldRequestFocusAndOpenKeyboard;
            }
            if ((i12 & 64) != 0) {
                str4 = inputVO.errorMessage;
            }
            boolean z13 = z12;
            String str5 = str4;
            int i13 = i11;
            boolean z14 = z11;
            return inputVO.copy(str, str2, z14, str3, i13, z13, str5);
        }

        @NotNull
        public final InputVO copy(@NotNull String name, @NotNull String placeholder, boolean shouldBindValue, String value, int imeOptions, boolean shouldRequestFocusAndOpenKeyboard, String errorMessage) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            return new InputVO(name, placeholder, shouldBindValue, value, imeOptions, shouldRequestFocusAndOpenKeyboard, errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputVO)) {
                return false;
            }
            InputVO inputVO = (InputVO) other;
            return Intrinsics.d(this.name, inputVO.name) && Intrinsics.d(this.placeholder, inputVO.placeholder) && this.shouldBindValue == inputVO.shouldBindValue && Intrinsics.d(this.value, inputVO.value) && this.imeOptions == inputVO.imeOptions && this.shouldRequestFocusAndOpenKeyboard == inputVO.shouldRequestFocusAndOpenKeyboard && Intrinsics.d(this.errorMessage, inputVO.errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final int getImeOptions() {
            return this.imeOptions;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final boolean getShouldBindValue() {
            return this.shouldBindValue;
        }

        public final boolean getShouldRequestFocusAndOpenKeyboard() {
            return this.shouldRequestFocusAndOpenKeyboard;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(this.name.hashCode() * 31, 31, this.placeholder), 31, this.shouldBindValue);
            String str = this.value;
            int a12 = C3532b.a(C2454a.a(this.imeOptions, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.shouldRequestFocusAndOpenKeyboard);
            String str2 = this.errorMessage;
            return a12 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.placeholder;
            boolean z11 = this.shouldBindValue;
            String str3 = this.value;
            int i11 = this.imeOptions;
            boolean z12 = this.shouldRequestFocusAndOpenKeyboard;
            String str4 = this.errorMessage;
            StringBuilder d11 = C3660k.d("InputVO(name=", str, ", placeholder=", str2, ", shouldBindValue=");
            C5766e.a(", value=", str3, ", imeOptions=", d11, z11);
            Ql.c.d(d11, i11, ", shouldRequestFocusAndOpenKeyboard=", z12, ", errorMessage=");
            return o0.c(d11, str4, ")");
        }
    }

    public EditUserFullNameVO(long j11, @NotNull String title, @NotNull List<InputVO> inputs, @NotNull ButtonV3Atom.LargeButton submitButton, AtomAction.ComposerAction composerAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.id = j11;
        this.title = title;
        this.inputs = inputs;
        this.submitButton = submitButton;
        this.submitButtonAction = composerAction;
    }

    public static /* synthetic */ EditUserFullNameVO copy$default(EditUserFullNameVO editUserFullNameVO, long j11, String str, List list, ButtonV3Atom.LargeButton largeButton, AtomAction.ComposerAction composerAction, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = editUserFullNameVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = editUserFullNameVO.title;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            list = editUserFullNameVO.inputs;
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            largeButton = editUserFullNameVO.submitButton;
        }
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        if ((i11 & 16) != 0) {
            composerAction = editUserFullNameVO.submitButtonAction;
        }
        return editUserFullNameVO.copy(j12, str2, list2, largeButton2, composerAction);
    }

    @NotNull
    public final EditUserFullNameVO copy(long id2, @NotNull String title, @NotNull List<InputVO> inputs, @NotNull ButtonV3Atom.LargeButton submitButton, AtomAction.ComposerAction submitButtonAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new EditUserFullNameVO(id2, title, inputs, submitButton, submitButtonAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditUserFullNameVO)) {
            return false;
        }
        EditUserFullNameVO editUserFullNameVO = (EditUserFullNameVO) other;
        return this.id == editUserFullNameVO.id && Intrinsics.d(this.title, editUserFullNameVO.title) && Intrinsics.d(this.inputs, editUserFullNameVO.inputs) && Intrinsics.d(this.submitButton, editUserFullNameVO.submitButton) && Intrinsics.d(this.submitButtonAction, editUserFullNameVO.submitButtonAction);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<InputVO> getInputs() {
        return this.inputs;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSubmitButton() {
        return this.submitButton;
    }

    public final AtomAction.ComposerAction getSubmitButtonAction() {
        return this.submitButtonAction;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.submitButton, g.b(g.a(Long.hashCode(this.id) * 31, 31, this.title), 31, this.inputs), 31);
        AtomAction.ComposerAction composerAction = this.submitButtonAction;
        return a11 + (composerAction == null ? 0 : composerAction.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        List<InputVO> list = this.inputs;
        ButtonV3Atom.LargeButton largeButton = this.submitButton;
        AtomAction.ComposerAction composerAction = this.submitButtonAction;
        StringBuilder c11 = C2436a.c(j11, "EditUserFullNameVO(id=", ", title=", str);
        c11.append(", inputs=");
        c11.append(list);
        c11.append(", submitButton=");
        c11.append(largeButton);
        c11.append(", submitButtonAction=");
        c11.append(composerAction);
        c11.append(")");
        return c11.toString();
    }
}
