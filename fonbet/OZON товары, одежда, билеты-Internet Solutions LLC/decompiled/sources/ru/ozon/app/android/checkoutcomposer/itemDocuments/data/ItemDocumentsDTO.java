package ru.ozon.app.android.checkoutcomposer.itemDocuments.data;

import D3.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00012Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003Jy\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/itemDocuments/data/ItemDocumentsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "rightIcon", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "documents", "", "Lru/ozon/app/android/checkoutcomposer/itemDocuments/data/ItemDocumentsDTO$DocumentDTO;", "warning", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "infoText", "paddings", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getRightIcon", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDocuments", "()Ljava/util/List;", "getWarning", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getInfoText", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "DocumentDTO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ItemDocumentsDTO {
    public static final int $stable = 8;
    private final List<DocumentDTO> documents;
    private final TextDTO infoText;
    private final Paddings paddings;
    private final IconButtonV3DTO rightIcon;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final CellDTO warning;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/itemDocuments/data/ItemDocumentsDTO$DocumentDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtext", "aspect", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/aspect/AspectDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtext", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DocumentDTO {
        public static final int $stable = AspectDTO.$stable;
        private final AspectDTO aspect;
        private final TextDTO subtext;
        private final TextDTO text;

        public DocumentDTO(TextDTO textDTO, TextDTO textDTO2, AspectDTO aspectDTO) {
            this.text = textDTO;
            this.subtext = textDTO2;
            this.aspect = aspectDTO;
        }

        public static /* synthetic */ DocumentDTO copy$default(DocumentDTO documentDTO, TextDTO textDTO, TextDTO textDTO2, AspectDTO aspectDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = documentDTO.text;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = documentDTO.subtext;
            }
            if ((i11 & 4) != 0) {
                aspectDTO = documentDTO.aspect;
            }
            return documentDTO.copy(textDTO, textDTO2, aspectDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtext() {
            return this.subtext;
        }

        /* renamed from: component3, reason: from getter */
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        @NotNull
        public final DocumentDTO copy(TextDTO text, TextDTO subtext, AspectDTO aspect) {
            return new DocumentDTO(text, subtext, aspect);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentDTO)) {
                return false;
            }
            DocumentDTO documentDTO = (DocumentDTO) other;
            return Intrinsics.d(this.text, documentDTO.text) && Intrinsics.d(this.subtext, documentDTO.subtext) && Intrinsics.d(this.aspect, documentDTO.aspect);
        }

        public final AspectDTO getAspect() {
            return this.aspect;
        }

        public final TextDTO getSubtext() {
            return this.subtext;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            TextDTO textDTO = this.text;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.subtext;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            AspectDTO aspectDTO = this.aspect;
            return hashCode2 + (aspectDTO != null ? aspectDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            TextDTO textDTO2 = this.subtext;
            AspectDTO aspectDTO = this.aspect;
            StringBuilder g10 = g.g("DocumentDTO(text=", textDTO, ", subtext=", textDTO2, ", aspect=");
            g10.append(aspectDTO);
            g10.append(")");
            return g10.toString();
        }
    }

    public ItemDocumentsDTO(@NotNull TextDTO title, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, List<DocumentDTO> list, CellDTO cellDTO, TextDTO textDTO2, Paddings paddings, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = textDTO;
        this.rightIcon = iconButtonV3DTO;
        this.documents = list;
        this.warning = cellDTO;
        this.infoText = textDTO2;
        this.paddings = paddings;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ItemDocumentsDTO copy$default(ItemDocumentsDTO itemDocumentsDTO, TextDTO textDTO, TextDTO textDTO2, IconButtonV3DTO iconButtonV3DTO, List list, CellDTO cellDTO, TextDTO textDTO3, Paddings paddings, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = itemDocumentsDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = itemDocumentsDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = itemDocumentsDTO.rightIcon;
        }
        if ((i11 & 8) != 0) {
            list = itemDocumentsDTO.documents;
        }
        if ((i11 & 16) != 0) {
            cellDTO = itemDocumentsDTO.warning;
        }
        if ((i11 & 32) != 0) {
            textDTO3 = itemDocumentsDTO.infoText;
        }
        if ((i11 & 64) != 0) {
            paddings = itemDocumentsDTO.paddings;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = itemDocumentsDTO.trackingInfo;
        }
        Paddings paddings2 = paddings;
        Map map2 = map;
        CellDTO cellDTO2 = cellDTO;
        TextDTO textDTO4 = textDTO3;
        return itemDocumentsDTO.copy(textDTO, textDTO2, iconButtonV3DTO, list, cellDTO2, textDTO4, paddings2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getRightIcon() {
        return this.rightIcon;
    }

    public final List<DocumentDTO> component4() {
        return this.documents;
    }

    /* renamed from: component5, reason: from getter */
    public final CellDTO getWarning() {
        return this.warning;
    }

    /* renamed from: component6, reason: from getter */
    public final TextDTO getInfoText() {
        return this.infoText;
    }

    /* renamed from: component7, reason: from getter */
    public final Paddings getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final ItemDocumentsDTO copy(@NotNull TextDTO title, TextDTO subtitle, IconButtonV3DTO rightIcon, List<DocumentDTO> documents, CellDTO warning, TextDTO infoText, Paddings paddings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ItemDocumentsDTO(title, subtitle, rightIcon, documents, warning, infoText, paddings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemDocumentsDTO)) {
            return false;
        }
        ItemDocumentsDTO itemDocumentsDTO = (ItemDocumentsDTO) other;
        return Intrinsics.d(this.title, itemDocumentsDTO.title) && Intrinsics.d(this.subtitle, itemDocumentsDTO.subtitle) && Intrinsics.d(this.rightIcon, itemDocumentsDTO.rightIcon) && Intrinsics.d(this.documents, itemDocumentsDTO.documents) && Intrinsics.d(this.warning, itemDocumentsDTO.warning) && Intrinsics.d(this.infoText, itemDocumentsDTO.infoText) && Intrinsics.d(this.paddings, itemDocumentsDTO.paddings) && Intrinsics.d(this.trackingInfo, itemDocumentsDTO.trackingInfo);
    }

    public final List<DocumentDTO> getDocuments() {
        return this.documents;
    }

    public final TextDTO getInfoText() {
        return this.infoText;
    }

    public final Paddings getPaddings() {
        return this.paddings;
    }

    public final IconButtonV3DTO getRightIcon() {
        return this.rightIcon;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final CellDTO getWarning() {
        return this.warning;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.rightIcon;
        int hashCode3 = (hashCode2 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        List<DocumentDTO> list = this.documents;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        CellDTO cellDTO = this.warning;
        int hashCode5 = (hashCode4 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.infoText;
        int hashCode6 = (hashCode5 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        Paddings paddings = this.paddings;
        int hashCode7 = (hashCode6 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        IconButtonV3DTO iconButtonV3DTO = this.rightIcon;
        List<DocumentDTO> list = this.documents;
        CellDTO cellDTO = this.warning;
        TextDTO textDTO3 = this.infoText;
        Paddings paddings = this.paddings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = g.g("ItemDocumentsDTO(title=", textDTO, ", subtitle=", textDTO2, ", rightIcon=");
        g10.append(iconButtonV3DTO);
        g10.append(", documents=");
        g10.append(list);
        g10.append(", warning=");
        g10.append(cellDTO);
        g10.append(", infoText=");
        g10.append(textDTO3);
        g10.append(", paddings=");
        g10.append(paddings);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(")");
        return g10.toString();
    }
}
