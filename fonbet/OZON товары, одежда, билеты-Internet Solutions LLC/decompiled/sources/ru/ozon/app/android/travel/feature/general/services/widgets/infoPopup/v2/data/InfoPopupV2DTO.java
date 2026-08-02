package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v2.data;

import B90.C2616s;
import H3.c;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellDTO;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002+,B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003Ji\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2DTO;", "", "image", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2DTO$Image;", "textInfoCells", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2DTO$TextInfoCells;", "cells", "", "Lru/ozon/uni/atoms/data/cell/IconTitleSubtitleCellDTO;", "buttons", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "deleteServiceButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2DTO$Image;Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2DTO$TextInfoCells;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2DTO$Image;", "getTextInfoCells", "()Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2DTO$TextInfoCells;", "getCells", "()Ljava/util/List;", "getButtons", "getDeleteServiceButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "TextInfoCells", "Image", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InfoPopupV2DTO {
    public static final int $stable = 8;
    private final List<ButtonV3DTO> buttons;
    private final List<IconTitleSubtitleCellDTO> cells;
    private final IconButtonV3DTO deleteServiceButton;
    private final Image image;
    private final TextInfoCells textInfoCells;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2DTO$Image;", "", "src", "", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSrc", "()Ljava/lang/String;", "getBackgroundColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image {
        public static final int $stable = 0;
        private final String backgroundColor;

        @NotNull
        private final String src;

        public Image(@NotNull String src, String str) {
            Intrinsics.checkNotNullParameter(src, "src");
            this.src = src;
            this.backgroundColor = str;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = image.src;
            }
            if ((i11 & 2) != 0) {
                str2 = image.backgroundColor;
            }
            return image.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getSrc() {
            return this.src;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final Image copy(@NotNull String src, String backgroundColor) {
            Intrinsics.checkNotNullParameter(src, "src");
            return new Image(src, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.d(this.src, image.src) && Intrinsics.d(this.backgroundColor, image.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getSrc() {
            return this.src;
        }

        public int hashCode() {
            int hashCode = this.src.hashCode() * 31;
            String str = this.backgroundColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("Image(src=", this.src, ", backgroundColor=", this.backgroundColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2DTO$TextInfoCells;", "", "cells", "", "Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO;", "<init>", "(Ljava/util/List;)V", "getCells", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextInfoCells {
        public static final int $stable = 8;

        @NotNull
        private final List<TextInfoCellDTO> cells;

        public TextInfoCells(@NotNull List<TextInfoCellDTO> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.cells = cells;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TextInfoCells copy$default(TextInfoCells textInfoCells, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = textInfoCells.cells;
            }
            return textInfoCells.copy(list);
        }

        @NotNull
        public final List<TextInfoCellDTO> component1() {
            return this.cells;
        }

        @NotNull
        public final TextInfoCells copy(@NotNull List<TextInfoCellDTO> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            return new TextInfoCells(cells);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextInfoCells) && Intrinsics.d(this.cells, ((TextInfoCells) other).cells);
        }

        @NotNull
        public final List<TextInfoCellDTO> getCells() {
            return this.cells;
        }

        public int hashCode() {
            return this.cells.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("TextInfoCells(cells=", ")", this.cells);
        }
    }

    public InfoPopupV2DTO(Image image, TextInfoCells textInfoCells, List<IconTitleSubtitleCellDTO> list, List<ButtonV3DTO> list2, IconButtonV3DTO iconButtonV3DTO, Map<String, TokenizedTrackingInfo> map) {
        this.image = image;
        this.textInfoCells = textInfoCells;
        this.cells = list;
        this.buttons = list2;
        this.deleteServiceButton = iconButtonV3DTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ InfoPopupV2DTO copy$default(InfoPopupV2DTO infoPopupV2DTO, Image image, TextInfoCells textInfoCells, List list, List list2, IconButtonV3DTO iconButtonV3DTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            image = infoPopupV2DTO.image;
        }
        if ((i11 & 2) != 0) {
            textInfoCells = infoPopupV2DTO.textInfoCells;
        }
        if ((i11 & 4) != 0) {
            list = infoPopupV2DTO.cells;
        }
        if ((i11 & 8) != 0) {
            list2 = infoPopupV2DTO.buttons;
        }
        if ((i11 & 16) != 0) {
            iconButtonV3DTO = infoPopupV2DTO.deleteServiceButton;
        }
        if ((i11 & 32) != 0) {
            map = infoPopupV2DTO.trackingInfo;
        }
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        Map map2 = map;
        return infoPopupV2DTO.copy(image, textInfoCells, list, list2, iconButtonV3DTO2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final TextInfoCells getTextInfoCells() {
        return this.textInfoCells;
    }

    public final List<IconTitleSubtitleCellDTO> component3() {
        return this.cells;
    }

    public final List<ButtonV3DTO> component4() {
        return this.buttons;
    }

    /* renamed from: component5, reason: from getter */
    public final IconButtonV3DTO getDeleteServiceButton() {
        return this.deleteServiceButton;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final InfoPopupV2DTO copy(Image image, TextInfoCells textInfoCells, List<IconTitleSubtitleCellDTO> cells, List<ButtonV3DTO> buttons, IconButtonV3DTO deleteServiceButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new InfoPopupV2DTO(image, textInfoCells, cells, buttons, deleteServiceButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoPopupV2DTO)) {
            return false;
        }
        InfoPopupV2DTO infoPopupV2DTO = (InfoPopupV2DTO) other;
        return Intrinsics.d(this.image, infoPopupV2DTO.image) && Intrinsics.d(this.textInfoCells, infoPopupV2DTO.textInfoCells) && Intrinsics.d(this.cells, infoPopupV2DTO.cells) && Intrinsics.d(this.buttons, infoPopupV2DTO.buttons) && Intrinsics.d(this.deleteServiceButton, infoPopupV2DTO.deleteServiceButton) && Intrinsics.d(this.trackingInfo, infoPopupV2DTO.trackingInfo);
    }

    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final List<IconTitleSubtitleCellDTO> getCells() {
        return this.cells;
    }

    public final IconButtonV3DTO getDeleteServiceButton() {
        return this.deleteServiceButton;
    }

    public final Image getImage() {
        return this.image;
    }

    public final TextInfoCells getTextInfoCells() {
        return this.textInfoCells;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Image image = this.image;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        TextInfoCells textInfoCells = this.textInfoCells;
        int hashCode2 = (hashCode + (textInfoCells == null ? 0 : textInfoCells.hashCode())) * 31;
        List<IconTitleSubtitleCellDTO> list = this.cells;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ButtonV3DTO> list2 = this.buttons;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.deleteServiceButton;
        int hashCode5 = (hashCode4 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Image image = this.image;
        TextInfoCells textInfoCells = this.textInfoCells;
        List<IconTitleSubtitleCellDTO> list = this.cells;
        List<ButtonV3DTO> list2 = this.buttons;
        IconButtonV3DTO iconButtonV3DTO = this.deleteServiceButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("InfoPopupV2DTO(image=");
        sb2.append(image);
        sb2.append(", textInfoCells=");
        sb2.append(textInfoCells);
        sb2.append(", cells=");
        C2616s.g(", buttons=", ", deleteServiceButton=", sb2, list, list2);
        sb2.append(iconButtonV3DTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }
}
