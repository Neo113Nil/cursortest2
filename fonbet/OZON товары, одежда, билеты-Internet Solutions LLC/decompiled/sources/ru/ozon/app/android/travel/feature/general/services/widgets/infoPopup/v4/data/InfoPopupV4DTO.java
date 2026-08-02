package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.data;

import G.g;
import H3.c;
import J0.P;
import Kk.C3532b;
import Pk0.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.copyInput.CopyInputDTO;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002>?B}\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0091\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\u0013\u00109\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006@"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "isImageOutline", "", "textInfoCells", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO$TextInfoCells;", "cellBlock", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO$CellBlockDTO;", "copyInput", "Lru/ozon/app/android/travel/molecules/dto/copyInput/CopyInputDTO;", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "viewTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "deleteServiceButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "note", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "detailsLinkBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;ZLru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO$TextInfoCells;Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO$CellBlockDTO;Lru/ozon/app/android/travel/molecules/dto/copyInput/CopyInputDTO;Ljava/util/List;Ljava/util/Map;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "()Z", "getTextInfoCells", "()Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO$TextInfoCells;", "getCellBlock", "()Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO$CellBlockDTO;", "getCopyInput", "()Lru/ozon/app/android/travel/molecules/dto/copyInput/CopyInputDTO;", "getButtons", "()Ljava/util/List;", "getViewTrackingInfo", "()Ljava/util/Map;", "getDeleteServiceButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getNote", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getDetailsLinkBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "TextInfoCells", "CellBlockDTO", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InfoPopupV4DTO {
    public static final int $stable = 8;
    private final List<ButtonV3DTO> buttons;
    private final CellBlockDTO cellBlock;
    private final CopyInputDTO copyInput;
    private final IconButtonV3DTO deleteServiceButton;
    private final BadgeDTO detailsLinkBadge;
    private final ImageDTO image;
    private final boolean isImageOutline;
    private final CellDTO note;
    private final TextInfoCells textInfoCells;
    private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO$TextInfoCells;", "", "cells", "", "Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO;", "<init>", "(Ljava/util/List;)V", "getCells", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public InfoPopupV4DTO(ImageDTO imageDTO, boolean z11, TextInfoCells textInfoCells, CellBlockDTO cellBlockDTO, CopyInputDTO copyInputDTO, List<ButtonV3DTO> list, Map<String, TokenizedTrackingInfo> map, IconButtonV3DTO iconButtonV3DTO, CellDTO cellDTO, BadgeDTO badgeDTO) {
        this.image = imageDTO;
        this.isImageOutline = z11;
        this.textInfoCells = textInfoCells;
        this.cellBlock = cellBlockDTO;
        this.copyInput = copyInputDTO;
        this.buttons = list;
        this.viewTrackingInfo = map;
        this.deleteServiceButton = iconButtonV3DTO;
        this.note = cellDTO;
        this.detailsLinkBadge = badgeDTO;
    }

    public static /* synthetic */ InfoPopupV4DTO copy$default(InfoPopupV4DTO infoPopupV4DTO, ImageDTO imageDTO, boolean z11, TextInfoCells textInfoCells, CellBlockDTO cellBlockDTO, CopyInputDTO copyInputDTO, List list, Map map, IconButtonV3DTO iconButtonV3DTO, CellDTO cellDTO, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = infoPopupV4DTO.image;
        }
        if ((i11 & 2) != 0) {
            z11 = infoPopupV4DTO.isImageOutline;
        }
        if ((i11 & 4) != 0) {
            textInfoCells = infoPopupV4DTO.textInfoCells;
        }
        if ((i11 & 8) != 0) {
            cellBlockDTO = infoPopupV4DTO.cellBlock;
        }
        if ((i11 & 16) != 0) {
            copyInputDTO = infoPopupV4DTO.copyInput;
        }
        if ((i11 & 32) != 0) {
            list = infoPopupV4DTO.buttons;
        }
        if ((i11 & 64) != 0) {
            map = infoPopupV4DTO.viewTrackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            iconButtonV3DTO = infoPopupV4DTO.deleteServiceButton;
        }
        if ((i11 & 256) != 0) {
            cellDTO = infoPopupV4DTO.note;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            badgeDTO = infoPopupV4DTO.detailsLinkBadge;
        }
        CellDTO cellDTO2 = cellDTO;
        BadgeDTO badgeDTO2 = badgeDTO;
        Map map2 = map;
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        CopyInputDTO copyInputDTO2 = copyInputDTO;
        List list2 = list;
        return infoPopupV4DTO.copy(imageDTO, z11, textInfoCells, cellBlockDTO, copyInputDTO2, list2, map2, iconButtonV3DTO2, cellDTO2, badgeDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component10, reason: from getter */
    public final BadgeDTO getDetailsLinkBadge() {
        return this.detailsLinkBadge;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsImageOutline() {
        return this.isImageOutline;
    }

    /* renamed from: component3, reason: from getter */
    public final TextInfoCells getTextInfoCells() {
        return this.textInfoCells;
    }

    /* renamed from: component4, reason: from getter */
    public final CellBlockDTO getCellBlock() {
        return this.cellBlock;
    }

    /* renamed from: component5, reason: from getter */
    public final CopyInputDTO getCopyInput() {
        return this.copyInput;
    }

    public final List<ButtonV3DTO> component6() {
        return this.buttons;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.viewTrackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final IconButtonV3DTO getDeleteServiceButton() {
        return this.deleteServiceButton;
    }

    /* renamed from: component9, reason: from getter */
    public final CellDTO getNote() {
        return this.note;
    }

    @NotNull
    public final InfoPopupV4DTO copy(ImageDTO image, boolean isImageOutline, TextInfoCells textInfoCells, CellBlockDTO cellBlock, CopyInputDTO copyInput, List<ButtonV3DTO> buttons, Map<String, TokenizedTrackingInfo> viewTrackingInfo, IconButtonV3DTO deleteServiceButton, CellDTO note, BadgeDTO detailsLinkBadge) {
        return new InfoPopupV4DTO(image, isImageOutline, textInfoCells, cellBlock, copyInput, buttons, viewTrackingInfo, deleteServiceButton, note, detailsLinkBadge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoPopupV4DTO)) {
            return false;
        }
        InfoPopupV4DTO infoPopupV4DTO = (InfoPopupV4DTO) other;
        return Intrinsics.d(this.image, infoPopupV4DTO.image) && this.isImageOutline == infoPopupV4DTO.isImageOutline && Intrinsics.d(this.textInfoCells, infoPopupV4DTO.textInfoCells) && Intrinsics.d(this.cellBlock, infoPopupV4DTO.cellBlock) && Intrinsics.d(this.copyInput, infoPopupV4DTO.copyInput) && Intrinsics.d(this.buttons, infoPopupV4DTO.buttons) && Intrinsics.d(this.viewTrackingInfo, infoPopupV4DTO.viewTrackingInfo) && Intrinsics.d(this.deleteServiceButton, infoPopupV4DTO.deleteServiceButton) && Intrinsics.d(this.note, infoPopupV4DTO.note) && Intrinsics.d(this.detailsLinkBadge, infoPopupV4DTO.detailsLinkBadge);
    }

    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final CellBlockDTO getCellBlock() {
        return this.cellBlock;
    }

    public final CopyInputDTO getCopyInput() {
        return this.copyInput;
    }

    public final IconButtonV3DTO getDeleteServiceButton() {
        return this.deleteServiceButton;
    }

    public final BadgeDTO getDetailsLinkBadge() {
        return this.detailsLinkBadge;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    public final CellDTO getNote() {
        return this.note;
    }

    public final TextInfoCells getTextInfoCells() {
        return this.textInfoCells;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
        return this.viewTrackingInfo;
    }

    public int hashCode() {
        ImageDTO imageDTO = this.image;
        int a11 = C3532b.a((imageDTO == null ? 0 : imageDTO.hashCode()) * 31, 31, this.isImageOutline);
        TextInfoCells textInfoCells = this.textInfoCells;
        int hashCode = (a11 + (textInfoCells == null ? 0 : textInfoCells.hashCode())) * 31;
        CellBlockDTO cellBlockDTO = this.cellBlock;
        int hashCode2 = (hashCode + (cellBlockDTO == null ? 0 : cellBlockDTO.hashCode())) * 31;
        CopyInputDTO copyInputDTO = this.copyInput;
        int hashCode3 = (hashCode2 + (copyInputDTO == null ? 0 : copyInputDTO.hashCode())) * 31;
        List<ButtonV3DTO> list = this.buttons;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.deleteServiceButton;
        int hashCode6 = (hashCode5 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        CellDTO cellDTO = this.note;
        int hashCode7 = (hashCode6 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.detailsLinkBadge;
        return hashCode7 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    public final boolean isImageOutline() {
        return this.isImageOutline;
    }

    @NotNull
    public String toString() {
        return "InfoPopupV4DTO(image=" + this.image + ", isImageOutline=" + this.isImageOutline + ", textInfoCells=" + this.textInfoCells + ", cellBlock=" + this.cellBlock + ", copyInput=" + this.copyInput + ", buttons=" + this.buttons + ", viewTrackingInfo=" + this.viewTrackingInfo + ", deleteServiceButton=" + this.deleteServiceButton + ", note=" + this.note + ", detailsLinkBadge=" + this.detailsLinkBadge + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JL\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO$CellBlockDTO;", "", "backgroundColor", "", "radius", "", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "label", "Lru/ozon/uni/atoms/data/text/TextDTO;", "isHTMLParsingEnabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Z)V", "getBackgroundColor", "()Ljava/lang/String;", "getRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCells", "()Ljava/util/List;", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Z)Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO$CellBlockDTO;", "equals", "other", "hashCode", "toString", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellBlockDTO {
        public static final int $stable = 8;
        private final String backgroundColor;

        @NotNull
        private final List<CellDTO> cells;
        private final boolean isHTMLParsingEnabled;
        private final TextDTO label;
        private final Integer radius;

        public CellBlockDTO(String str, Integer num, @NotNull List<CellDTO> cells, TextDTO textDTO, boolean z11) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.backgroundColor = str;
            this.radius = num;
            this.cells = cells;
            this.label = textDTO;
            this.isHTMLParsingEnabled = z11;
        }

        public static /* synthetic */ CellBlockDTO copy$default(CellBlockDTO cellBlockDTO, String str, Integer num, List list, TextDTO textDTO, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cellBlockDTO.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                num = cellBlockDTO.radius;
            }
            if ((i11 & 4) != 0) {
                list = cellBlockDTO.cells;
            }
            if ((i11 & 8) != 0) {
                textDTO = cellBlockDTO.label;
            }
            if ((i11 & 16) != 0) {
                z11 = cellBlockDTO.isHTMLParsingEnabled;
            }
            boolean z12 = z11;
            List list2 = list;
            return cellBlockDTO.copy(str, num, list2, textDTO, z12);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getRadius() {
            return this.radius;
        }

        @NotNull
        public final List<CellDTO> component3() {
            return this.cells;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getLabel() {
            return this.label;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsHTMLParsingEnabled() {
            return this.isHTMLParsingEnabled;
        }

        @NotNull
        public final CellBlockDTO copy(String backgroundColor, Integer radius, @NotNull List<CellDTO> cells, TextDTO label, boolean isHTMLParsingEnabled) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            return new CellBlockDTO(backgroundColor, radius, cells, label, isHTMLParsingEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellBlockDTO)) {
                return false;
            }
            CellBlockDTO cellBlockDTO = (CellBlockDTO) other;
            return Intrinsics.d(this.backgroundColor, cellBlockDTO.backgroundColor) && Intrinsics.d(this.radius, cellBlockDTO.radius) && Intrinsics.d(this.cells, cellBlockDTO.cells) && Intrinsics.d(this.label, cellBlockDTO.label) && this.isHTMLParsingEnabled == cellBlockDTO.isHTMLParsingEnabled;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<CellDTO> getCells() {
            return this.cells;
        }

        public final TextDTO getLabel() {
            return this.label;
        }

        public final Integer getRadius() {
            return this.radius;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.radius;
            int b11 = g.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.cells);
            TextDTO textDTO = this.label;
            return Boolean.hashCode(this.isHTMLParsingEnabled) + ((b11 + (textDTO != null ? textDTO.hashCode() : 0)) * 31);
        }

        public final boolean isHTMLParsingEnabled() {
            return this.isHTMLParsingEnabled;
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            Integer num = this.radius;
            List<CellDTO> list = this.cells;
            TextDTO textDTO = this.label;
            boolean z11 = this.isHTMLParsingEnabled;
            StringBuilder b11 = P.b("CellBlockDTO(backgroundColor=", str, num, ", radius=", ", cells=");
            b11.append(list);
            b11.append(", label=");
            b11.append(textDTO);
            b11.append(", isHTMLParsingEnabled=");
            return a.a(")", b11, z11);
        }

        public /* synthetic */ CellBlockDTO(String str, Integer num, List list, TextDTO textDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, num, list, textDTO, (i11 & 16) != 0 ? false : z11);
        }
    }

    public /* synthetic */ InfoPopupV4DTO(ImageDTO imageDTO, boolean z11, TextInfoCells textInfoCells, CellBlockDTO cellBlockDTO, CopyInputDTO copyInputDTO, List list, Map map, IconButtonV3DTO iconButtonV3DTO, CellDTO cellDTO, BadgeDTO badgeDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageDTO, (i11 & 2) != 0 ? false : z11, textInfoCells, cellBlockDTO, copyInputDTO, list, map, iconButtonV3DTO, cellDTO, badgeDTO);
    }
}
