package ru.ozon.app.android.orderdetails.customsfees.data;

import D3.g;
import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImagesDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orderdetails/customsfees/data/CustomsFeesDTO;", "", "fees", "", "Lru/ozon/app/android/orderdetails/customsfees/data/CustomsFeesDTO$FeeDTO;", "<init>", "(Ljava/util/List;)V", "getFees", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FeeDTO", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CustomsFeesDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<FeeDTO> fees;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/orderdetails/customsfees/data/CustomsFeesDTO$FeeDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "copyText", "copyIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "copyAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "subtitle", "images", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCopyText", "getCopyIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCopyAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSubtitle", "getImages", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FeeDTO {
        public static final int $stable = ImagesDTO.$stable | IconDTO.$stable;

        @NotNull
        private final ButtonV3DTO button;
        private final AtomActionDTO copyAction;
        private final IconDTO copyIcon;
        private final TextDTO copyText;

        @NotNull
        private final ImagesDTO images;
        private final TextDTO subtitle;
        private final TextDTO title;

        public FeeDTO(TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, AtomActionDTO atomActionDTO, TextDTO textDTO3, @NotNull ImagesDTO images, @NotNull ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(button, "button");
            this.title = textDTO;
            this.copyText = textDTO2;
            this.copyIcon = iconDTO;
            this.copyAction = atomActionDTO;
            this.subtitle = textDTO3;
            this.images = images;
            this.button = button;
        }

        public static /* synthetic */ FeeDTO copy$default(FeeDTO feeDTO, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, AtomActionDTO atomActionDTO, TextDTO textDTO3, ImagesDTO imagesDTO, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = feeDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = feeDTO.copyText;
            }
            if ((i11 & 4) != 0) {
                iconDTO = feeDTO.copyIcon;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = feeDTO.copyAction;
            }
            if ((i11 & 16) != 0) {
                textDTO3 = feeDTO.subtitle;
            }
            if ((i11 & 32) != 0) {
                imagesDTO = feeDTO.images;
            }
            if ((i11 & 64) != 0) {
                buttonV3DTO = feeDTO.button;
            }
            ImagesDTO imagesDTO2 = imagesDTO;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            TextDTO textDTO4 = textDTO3;
            IconDTO iconDTO2 = iconDTO;
            return feeDTO.copy(textDTO, textDTO2, iconDTO2, atomActionDTO, textDTO4, imagesDTO2, buttonV3DTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getCopyText() {
            return this.copyText;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getCopyIcon() {
            return this.copyIcon;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getCopyAction() {
            return this.copyAction;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final ImagesDTO getImages() {
            return this.images;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final FeeDTO copy(TextDTO title, TextDTO copyText, IconDTO copyIcon, AtomActionDTO copyAction, TextDTO subtitle, @NotNull ImagesDTO images, @NotNull ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(button, "button");
            return new FeeDTO(title, copyText, copyIcon, copyAction, subtitle, images, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeeDTO)) {
                return false;
            }
            FeeDTO feeDTO = (FeeDTO) other;
            return Intrinsics.d(this.title, feeDTO.title) && Intrinsics.d(this.copyText, feeDTO.copyText) && Intrinsics.d(this.copyIcon, feeDTO.copyIcon) && Intrinsics.d(this.copyAction, feeDTO.copyAction) && Intrinsics.d(this.subtitle, feeDTO.subtitle) && Intrinsics.d(this.images, feeDTO.images) && Intrinsics.d(this.button, feeDTO.button);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final AtomActionDTO getCopyAction() {
            return this.copyAction;
        }

        public final IconDTO getCopyIcon() {
            return this.copyIcon;
        }

        public final TextDTO getCopyText() {
            return this.copyText;
        }

        @NotNull
        public final ImagesDTO getImages() {
            return this.images;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.copyText;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            IconDTO iconDTO = this.copyIcon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.copyAction;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            TextDTO textDTO3 = this.subtitle;
            return this.button.hashCode() + ((this.images.hashCode() + ((hashCode4 + (textDTO3 != null ? textDTO3.hashCode() : 0)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.copyText;
            IconDTO iconDTO = this.copyIcon;
            AtomActionDTO atomActionDTO = this.copyAction;
            TextDTO textDTO3 = this.subtitle;
            ImagesDTO imagesDTO = this.images;
            ButtonV3DTO buttonV3DTO = this.button;
            StringBuilder g10 = g.g("FeeDTO(title=", textDTO, ", copyText=", textDTO2, ", copyIcon=");
            g10.append(iconDTO);
            g10.append(", copyAction=");
            g10.append(atomActionDTO);
            g10.append(", subtitle=");
            g10.append(textDTO3);
            g10.append(", images=");
            g10.append(imagesDTO);
            g10.append(", button=");
            g10.append(buttonV3DTO);
            g10.append(")");
            return g10.toString();
        }
    }

    public CustomsFeesDTO(@NotNull List<FeeDTO> fees) {
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.fees = fees;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomsFeesDTO copy$default(CustomsFeesDTO customsFeesDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = customsFeesDTO.fees;
        }
        return customsFeesDTO.copy(list);
    }

    @NotNull
    public final List<FeeDTO> component1() {
        return this.fees;
    }

    @NotNull
    public final CustomsFeesDTO copy(@NotNull List<FeeDTO> fees) {
        Intrinsics.checkNotNullParameter(fees, "fees");
        return new CustomsFeesDTO(fees);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CustomsFeesDTO) && Intrinsics.d(this.fees, ((CustomsFeesDTO) other).fees);
    }

    @NotNull
    public final List<FeeDTO> getFees() {
        return this.fees;
    }

    public int hashCode() {
        return this.fees.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("CustomsFeesDTO(fees=", ")", this.fees);
    }
}
