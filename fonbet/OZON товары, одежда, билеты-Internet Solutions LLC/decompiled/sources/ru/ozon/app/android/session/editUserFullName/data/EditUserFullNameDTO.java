package ru.ozon.app.android.session.editUserFullName.data;

import C.o0;
import G.g;
import N3.C3660k;
import Tl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "inputs", "", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameDTO$InputDTO;", "submitButton", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameDTO$SubmitButtonDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameDTO$SubmitButtonDTO;)V", "getTitle", "()Ljava/lang/String;", "getInputs", "()Ljava/util/List;", "getSubmitButton", "()Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameDTO$SubmitButtonDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "InputDTO", "SubmitButtonDTO", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EditUserFullNameDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<InputDTO> inputs;

    @NotNull
    private final SubmitButtonDTO submitButton;

    @NotNull
    private final String title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameDTO$InputDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", HammersV3BodyDTO.PLACEHOLDER, AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPlaceholder", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputDTO {
        public static final int $stable = 0;

        @NotNull
        private final String name;

        @NotNull
        private final String placeholder;
        private final String value;

        public InputDTO(@NotNull String name, @NotNull String placeholder, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.name = name;
            this.placeholder = placeholder;
            this.value = str;
        }

        public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = inputDTO.name;
            }
            if ((i11 & 2) != 0) {
                str2 = inputDTO.placeholder;
            }
            if ((i11 & 4) != 0) {
                str3 = inputDTO.value;
            }
            return inputDTO.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component3, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final InputDTO copy(@NotNull String name, @NotNull String placeholder, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            return new InputDTO(name, placeholder, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputDTO)) {
                return false;
            }
            InputDTO inputDTO = (InputDTO) other;
            return Intrinsics.d(this.name, inputDTO.name) && Intrinsics.d(this.placeholder, inputDTO.placeholder) && Intrinsics.d(this.value, inputDTO.value);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = g.a(this.name.hashCode() * 31, 31, this.placeholder);
            String str = this.value;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.placeholder;
            return o0.c(C3660k.d("InputDTO(name=", str, ", placeholder=", str2, ", value="), this.value, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameDTO$SubmitButtonDTO;", "", "text", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubmitButtonDTO {
        public static final int $stable = 0;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String text;

        public SubmitButtonDTO(@NotNull String text, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            this.text = text;
            this.action = action;
        }

        public static /* synthetic */ SubmitButtonDTO copy$default(SubmitButtonDTO submitButtonDTO, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = submitButtonDTO.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = submitButtonDTO.action;
            }
            return submitButtonDTO.copy(str, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final SubmitButtonDTO copy(@NotNull String text, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            return new SubmitButtonDTO(text, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubmitButtonDTO)) {
                return false;
            }
            SubmitButtonDTO submitButtonDTO = (SubmitButtonDTO) other;
            return Intrinsics.d(this.text, submitButtonDTO.text) && Intrinsics.d(this.action, submitButtonDTO.action);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SubmitButtonDTO(text=" + this.text + ", action=" + this.action + ")";
        }
    }

    public EditUserFullNameDTO(@NotNull String title, @NotNull List<InputDTO> inputs, @NotNull SubmitButtonDTO submitButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.title = title;
        this.inputs = inputs;
        this.submitButton = submitButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditUserFullNameDTO copy$default(EditUserFullNameDTO editUserFullNameDTO, String str, List list, SubmitButtonDTO submitButtonDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = editUserFullNameDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = editUserFullNameDTO.inputs;
        }
        if ((i11 & 4) != 0) {
            submitButtonDTO = editUserFullNameDTO.submitButton;
        }
        return editUserFullNameDTO.copy(str, list, submitButtonDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<InputDTO> component2() {
        return this.inputs;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SubmitButtonDTO getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final EditUserFullNameDTO copy(@NotNull String title, @NotNull List<InputDTO> inputs, @NotNull SubmitButtonDTO submitButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new EditUserFullNameDTO(title, inputs, submitButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditUserFullNameDTO)) {
            return false;
        }
        EditUserFullNameDTO editUserFullNameDTO = (EditUserFullNameDTO) other;
        return Intrinsics.d(this.title, editUserFullNameDTO.title) && Intrinsics.d(this.inputs, editUserFullNameDTO.inputs) && Intrinsics.d(this.submitButton, editUserFullNameDTO.submitButton);
    }

    @NotNull
    public final List<InputDTO> getInputs() {
        return this.inputs;
    }

    @NotNull
    public final SubmitButtonDTO getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.submitButton.hashCode() + g.b(this.title.hashCode() * 31, 31, this.inputs);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        List<InputDTO> list = this.inputs;
        SubmitButtonDTO submitButtonDTO = this.submitButton;
        StringBuilder f7 = b.f("EditUserFullNameDTO(title=", str, ", inputs=", ", submitButton=", list);
        f7.append(submitButtonDTO);
        f7.append(")");
        return f7.toString();
    }
}
