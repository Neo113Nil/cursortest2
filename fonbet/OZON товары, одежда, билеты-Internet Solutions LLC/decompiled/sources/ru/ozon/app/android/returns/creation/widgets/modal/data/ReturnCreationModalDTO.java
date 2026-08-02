package ru.ozon.app.android.returns.creation.widgets.modal.data;

import B90.C2616s;
import B90.C2618u;
import G.g;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001%BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/modal/data/ReturnCreationModalDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "components", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "buttons", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonsSettings", "Lru/ozon/app/android/returns/creation/widgets/modal/data/ReturnCreationModalDTO$ButtonsSettings;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/returns/creation/widgets/modal/data/ReturnCreationModalDTO$ButtonsSettings;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getComponents", "()Ljava/util/List;", "getButtons", "getButtonsSettings", "()Lru/ozon/app/android/returns/creation/widgets/modal/data/ReturnCreationModalDTO$ButtonsSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ButtonsSettings", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnCreationModalDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ButtonV3DTO> buttons;
    private final ButtonsSettings buttonsSettings;
    private final List<AtomDTO> components;
    private final ImageDTO image;

    @NotNull
    private final TextDTO text;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/modal/data/ReturnCreationModalDTO$ButtonsSettings;", "", "isHorizontal", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonsSettings {
        public static final int $stable = 0;
        private final boolean isHorizontal;

        public ButtonsSettings() {
            this(false, 1, null);
        }

        public static /* synthetic */ ButtonsSettings copy$default(ButtonsSettings buttonsSettings, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = buttonsSettings.isHorizontal;
            }
            return buttonsSettings.copy(z11);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsHorizontal() {
            return this.isHorizontal;
        }

        @NotNull
        public final ButtonsSettings copy(boolean isHorizontal) {
            return new ButtonsSettings(isHorizontal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ButtonsSettings) && this.isHorizontal == ((ButtonsSettings) other).isHorizontal;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isHorizontal);
        }

        public final boolean isHorizontal() {
            return this.isHorizontal;
        }

        @NotNull
        public String toString() {
            return C2618u.g("ButtonsSettings(isHorizontal=", ")", this.isHorizontal);
        }

        public ButtonsSettings(boolean z11) {
            this.isHorizontal = z11;
        }

        public /* synthetic */ ButtonsSettings(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnCreationModalDTO(ImageDTO imageDTO, @NotNull TextDTO text, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "text", name = "Text", type = TextDTO.class), @ProtoOneOfSignature(fieldName = "annotation", name = "Annotation", type = DisclaimerAtom.class), @ProtoOneOfSignature(fieldName = "cell", name = "Cell", type = CellDTO.class)}) @ProtoOneOf(label = "type") List<? extends AtomDTO> list, @NotNull List<ButtonV3DTO> buttons, ButtonsSettings buttonsSettings) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.image = imageDTO;
        this.text = text;
        this.components = list;
        this.buttons = buttons;
        this.buttonsSettings = buttonsSettings;
    }

    public static /* synthetic */ ReturnCreationModalDTO copy$default(ReturnCreationModalDTO returnCreationModalDTO, ImageDTO imageDTO, TextDTO textDTO, List list, List list2, ButtonsSettings buttonsSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = returnCreationModalDTO.image;
        }
        if ((i11 & 2) != 0) {
            textDTO = returnCreationModalDTO.text;
        }
        if ((i11 & 4) != 0) {
            list = returnCreationModalDTO.components;
        }
        if ((i11 & 8) != 0) {
            list2 = returnCreationModalDTO.buttons;
        }
        if ((i11 & 16) != 0) {
            buttonsSettings = returnCreationModalDTO.buttonsSettings;
        }
        ButtonsSettings buttonsSettings2 = buttonsSettings;
        List list3 = list;
        return returnCreationModalDTO.copy(imageDTO, textDTO, list3, list2, buttonsSettings2);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    public final List<AtomDTO> component3() {
        return this.components;
    }

    @NotNull
    public final List<ButtonV3DTO> component4() {
        return this.buttons;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonsSettings getButtonsSettings() {
        return this.buttonsSettings;
    }

    @NotNull
    public final ReturnCreationModalDTO copy(ImageDTO image, @NotNull TextDTO text, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "text", name = "Text", type = TextDTO.class), @ProtoOneOfSignature(fieldName = "annotation", name = "Annotation", type = DisclaimerAtom.class), @ProtoOneOfSignature(fieldName = "cell", name = "Cell", type = CellDTO.class)}) @ProtoOneOf(label = "type") List<? extends AtomDTO> components, @NotNull List<ButtonV3DTO> buttons, ButtonsSettings buttonsSettings) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new ReturnCreationModalDTO(image, text, components, buttons, buttonsSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnCreationModalDTO)) {
            return false;
        }
        ReturnCreationModalDTO returnCreationModalDTO = (ReturnCreationModalDTO) other;
        return Intrinsics.d(this.image, returnCreationModalDTO.image) && Intrinsics.d(this.text, returnCreationModalDTO.text) && Intrinsics.d(this.components, returnCreationModalDTO.components) && Intrinsics.d(this.buttons, returnCreationModalDTO.buttons) && Intrinsics.d(this.buttonsSettings, returnCreationModalDTO.buttonsSettings);
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final ButtonsSettings getButtonsSettings() {
        return this.buttonsSettings;
    }

    public final List<AtomDTO> getComponents() {
        return this.components;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        ImageDTO imageDTO = this.image;
        int a11 = b.a(this.text, (imageDTO == null ? 0 : imageDTO.hashCode()) * 31, 31);
        List<AtomDTO> list = this.components;
        int b11 = g.b((a11 + (list == null ? 0 : list.hashCode())) * 31, 31, this.buttons);
        ButtonsSettings buttonsSettings = this.buttonsSettings;
        return b11 + (buttonsSettings != null ? buttonsSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.text;
        List<AtomDTO> list = this.components;
        List<ButtonV3DTO> list2 = this.buttons;
        ButtonsSettings buttonsSettings = this.buttonsSettings;
        StringBuilder d11 = C2616s.d("ReturnCreationModalDTO(image=", imageDTO, ", text=", textDTO, ", components=");
        C2616s.g(", buttons=", ", buttonsSettings=", d11, list, list2);
        d11.append(buttonsSettings);
        d11.append(")");
        return d11.toString();
    }
}
