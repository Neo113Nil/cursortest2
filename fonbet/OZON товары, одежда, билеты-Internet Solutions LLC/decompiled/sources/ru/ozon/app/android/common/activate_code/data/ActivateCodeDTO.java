package ru.ozon.app.android.common.activate_code.data;

import Ak.C2436a;
import B0.A0;
import Tl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002()BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u0001HÆ\u0003JM\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\f\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lru/ozon/app/android/common/activate_code/data/ActivateCodeDTO;", "", "backgroundColor", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "input", "Lru/ozon/app/android/common/activate_code/data/ActivateCodeDTO$Input;", "activateButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "termsButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "activatedData", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/common/activate_code/data/ActivateCodeDTO$Input;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/lang/Object;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getInput", "()Lru/ozon/app/android/common/activate_code/data/ActivateCodeDTO$Input;", "getActivateButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTermsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getActivatedData", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ActivatedState", "Input", "activate-code_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ActivateCodeDTO {

    @NotNull
    private final ButtonV3Atom.LargeButton activateButton;

    @NotNull
    private final Object activatedData;
    private final String backgroundColor;
    private final Input input;
    private final ButtonV3Atom.SmallBorderlessButton termsButton;
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/common/activate_code/data/ActivateCodeDTO$ActivatedState;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "activate-code_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActivatedState {

        @NotNull
        private final Icon icon;

        @NotNull
        private final TextAtom title;

        public ActivatedState(@NotNull Icon icon, @NotNull TextAtom title) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.title = title;
        }

        public static /* synthetic */ ActivatedState copy$default(ActivatedState activatedState, Icon icon, TextAtom textAtom, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = activatedState.icon;
            }
            if ((i11 & 2) != 0) {
                textAtom = activatedState.title;
            }
            return activatedState.copy(icon, textAtom);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final ActivatedState copy(@NotNull Icon icon, @NotNull TextAtom title) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            return new ActivatedState(icon, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActivatedState)) {
                return false;
            }
            ActivatedState activatedState = (ActivatedState) other;
            return Intrinsics.d(this.icon, activatedState.icon) && Intrinsics.d(this.title, activatedState.title);
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ActivatedState(icon=" + this.icon + ", title=" + this.title + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/common/activate_code/data/ActivateCodeDTO$Input;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "activate-code_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        private final String value;

        public Input(String str) {
            this.value = str;
        }

        public static /* synthetic */ Input copy$default(Input input, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = input.value;
            }
            return input.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final Input copy(String value) {
            return new Input(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Input) && Intrinsics.d(this.value, ((Input) other).value);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Input(value=", this.value, ")");
        }
    }

    public ActivateCodeDTO(String str, TextAtom textAtom, Input input, @NotNull ButtonV3Atom.LargeButton activateButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "state", type = ActivatedState.class), @ProtoOneOfSignature(name = "button", type = ButtonV3Atom.LargeButton.class)}) @NotNull @ProtoOneOf(label = "type") Object activatedData) {
        Intrinsics.checkNotNullParameter(activateButton, "activateButton");
        Intrinsics.checkNotNullParameter(activatedData, "activatedData");
        this.backgroundColor = str;
        this.title = textAtom;
        this.input = input;
        this.activateButton = activateButton;
        this.termsButton = smallBorderlessButton;
        this.activatedData = activatedData;
    }

    public static /* synthetic */ ActivateCodeDTO copy$default(ActivateCodeDTO activateCodeDTO, String str, TextAtom textAtom, Input input, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = activateCodeDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            textAtom = activateCodeDTO.title;
        }
        if ((i11 & 4) != 0) {
            input = activateCodeDTO.input;
        }
        if ((i11 & 8) != 0) {
            largeButton = activateCodeDTO.activateButton;
        }
        if ((i11 & 16) != 0) {
            smallBorderlessButton = activateCodeDTO.termsButton;
        }
        if ((i11 & 32) != 0) {
            obj = activateCodeDTO.activatedData;
        }
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2 = smallBorderlessButton;
        Object obj3 = obj;
        return activateCodeDTO.copy(str, textAtom, input, largeButton, smallBorderlessButton2, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final Input getInput() {
        return this.input;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getActivateButton() {
        return this.activateButton;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButton getTermsButton() {
        return this.termsButton;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Object getActivatedData() {
        return this.activatedData;
    }

    @NotNull
    public final ActivateCodeDTO copy(String backgroundColor, TextAtom title, Input input, @NotNull ButtonV3Atom.LargeButton activateButton, ButtonV3Atom.SmallBorderlessButton termsButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "state", type = ActivatedState.class), @ProtoOneOfSignature(name = "button", type = ButtonV3Atom.LargeButton.class)}) @NotNull @ProtoOneOf(label = "type") Object activatedData) {
        Intrinsics.checkNotNullParameter(activateButton, "activateButton");
        Intrinsics.checkNotNullParameter(activatedData, "activatedData");
        return new ActivateCodeDTO(backgroundColor, title, input, activateButton, termsButton, activatedData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivateCodeDTO)) {
            return false;
        }
        ActivateCodeDTO activateCodeDTO = (ActivateCodeDTO) other;
        return Intrinsics.d(this.backgroundColor, activateCodeDTO.backgroundColor) && Intrinsics.d(this.title, activateCodeDTO.title) && Intrinsics.d(this.input, activateCodeDTO.input) && Intrinsics.d(this.activateButton, activateCodeDTO.activateButton) && Intrinsics.d(this.termsButton, activateCodeDTO.termsButton) && Intrinsics.d(this.activatedData, activateCodeDTO.activatedData);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getActivateButton() {
        return this.activateButton;
    }

    @NotNull
    public final Object getActivatedData() {
        return this.activatedData;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Input getInput() {
        return this.input;
    }

    public final ButtonV3Atom.SmallBorderlessButton getTermsButton() {
        return this.termsButton;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TextAtom textAtom = this.title;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Input input = this.input;
        int a11 = b.a(this.activateButton, (hashCode2 + (input == null ? 0 : input.hashCode())) * 31, 31);
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.termsButton;
        return this.activatedData.hashCode() + ((a11 + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        TextAtom textAtom = this.title;
        Input input = this.input;
        ButtonV3Atom.LargeButton largeButton = this.activateButton;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.termsButton;
        Object obj = this.activatedData;
        StringBuilder d11 = C2436a.d("ActivateCodeDTO(backgroundColor=", str, ", title=", ", input=", textAtom);
        d11.append(input);
        d11.append(", activateButton=");
        d11.append(largeButton);
        d11.append(", termsButton=");
        d11.append(smallBorderlessButton);
        d11.append(", activatedData=");
        d11.append(obj);
        d11.append(")");
        return d11.toString();
    }
}
