package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation;

import G.g;
import Kk.C3532b;
import Pk0.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.copyInput.CopyInputVO;
import ru.ozon.app.android.travel.molecules.view.textInfoCells.TextInfoCellVO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b#\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001DBw\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b\b\u0010-R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b1\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010A\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/InfoPopupV4VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageInfo", "", "isImageOutline", "", "Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellVO;", "textCells", "areCellBlockVisible", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/InfoPopupV4VO$CellBlockVO;", "cellBlock", "Lru/ozon/app/android/travel/molecules/view/copyInput/CopyInputVO;", "copyInput", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "deleteServiceButton", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "note", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "detailsLinkBadge", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;ZLjava/util/List;ZLru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/InfoPopupV4VO$CellBlockVO;Lru/ozon/app/android/travel/molecules/view/copyInput/CopyInputVO;LWZ/t;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImageInfo", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Z", "()Z", "Ljava/util/List;", "getTextCells", "()Ljava/util/List;", "getAreCellBlockVisible", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/InfoPopupV4VO$CellBlockVO;", "getCellBlock", "()Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/InfoPopupV4VO$CellBlockVO;", "Lru/ozon/app/android/travel/molecules/view/copyInput/CopyInputVO;", "getCopyInput", "()Lru/ozon/app/android/travel/molecules/view/copyInput/CopyInputVO;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDeleteServiceButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getNote", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDetailsLinkBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "CellBlockVO", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InfoPopupV4VO implements c {
    private final boolean areCellBlockVisible;

    @NotNull
    private final CellBlockVO cellBlock;
    private final CopyInputVO copyInput;
    private final IconButtonV3DTO deleteServiceButton;
    private final BadgeDTO detailsLinkBadge;
    private final long id;
    private final ImageDTO imageInfo;
    private final boolean isImageOutline;
    private final CellDTO note;

    @NotNull
    private final List<TextInfoCellVO> textCells;
    private final t viewEvent;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/InfoPopupV4VO$CellBlockVO;", "", "", "backgroundColor", "", "radius", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "Lru/ozon/uni/atoms/data/text/TextDTO;", "label", "<init>", "(Ljava/lang/String;FLjava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "F", "getRadius", "()F", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellBlockVO {
        private final String backgroundColor;

        @NotNull
        private final List<CellDTO> cells;
        private final TextDTO label;
        private final float radius;

        public CellBlockVO(String str, float f7, @NotNull List<CellDTO> cells, TextDTO textDTO) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.backgroundColor = str;
            this.radius = f7;
            this.cells = cells;
            this.label = textDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellBlockVO)) {
                return false;
            }
            CellBlockVO cellBlockVO = (CellBlockVO) other;
            return Intrinsics.d(this.backgroundColor, cellBlockVO.backgroundColor) && Float.compare(this.radius, cellBlockVO.radius) == 0 && Intrinsics.d(this.cells, cellBlockVO.cells) && Intrinsics.d(this.label, cellBlockVO.label);
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

        public final float getRadius() {
            return this.radius;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int b11 = g.b(b.a(this.radius, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.cells);
            TextDTO textDTO = this.label;
            return b11 + (textDTO != null ? textDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CellBlockVO(backgroundColor=" + this.backgroundColor + ", radius=" + this.radius + ", cells=" + this.cells + ", label=" + this.label + ")";
        }
    }

    public InfoPopupV4VO(long j11, ImageDTO imageDTO, boolean z11, @NotNull List<TextInfoCellVO> textCells, boolean z12, @NotNull CellBlockVO cellBlock, CopyInputVO copyInputVO, t tVar, IconButtonV3DTO iconButtonV3DTO, CellDTO cellDTO, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(textCells, "textCells");
        Intrinsics.checkNotNullParameter(cellBlock, "cellBlock");
        this.id = j11;
        this.imageInfo = imageDTO;
        this.isImageOutline = z11;
        this.textCells = textCells;
        this.areCellBlockVisible = z12;
        this.cellBlock = cellBlock;
        this.copyInput = copyInputVO;
        this.viewEvent = tVar;
        this.deleteServiceButton = iconButtonV3DTO;
        this.note = cellDTO;
        this.detailsLinkBadge = badgeDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoPopupV4VO)) {
            return false;
        }
        InfoPopupV4VO infoPopupV4VO = (InfoPopupV4VO) other;
        return this.id == infoPopupV4VO.id && Intrinsics.d(this.imageInfo, infoPopupV4VO.imageInfo) && this.isImageOutline == infoPopupV4VO.isImageOutline && Intrinsics.d(this.textCells, infoPopupV4VO.textCells) && this.areCellBlockVisible == infoPopupV4VO.areCellBlockVisible && Intrinsics.d(this.cellBlock, infoPopupV4VO.cellBlock) && Intrinsics.d(this.copyInput, infoPopupV4VO.copyInput) && Intrinsics.d(this.viewEvent, infoPopupV4VO.viewEvent) && Intrinsics.d(this.deleteServiceButton, infoPopupV4VO.deleteServiceButton) && Intrinsics.d(this.note, infoPopupV4VO.note) && Intrinsics.d(this.detailsLinkBadge, infoPopupV4VO.detailsLinkBadge);
    }

    public final boolean getAreCellBlockVisible() {
        return this.areCellBlockVisible;
    }

    @NotNull
    public final CellBlockVO getCellBlock() {
        return this.cellBlock;
    }

    public final CopyInputVO getCopyInput() {
        return this.copyInput;
    }

    public final BadgeDTO getDetailsLinkBadge() {
        return this.detailsLinkBadge;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ImageDTO getImageInfo() {
        return this.imageInfo;
    }

    public final CellDTO getNote() {
        return this.note;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<TextInfoCellVO> getTextCells() {
        return this.textCells;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ImageDTO imageDTO = this.imageInfo;
        int hashCode2 = (this.cellBlock.hashCode() + C3532b.a(g.b(C3532b.a((hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31, this.isImageOutline), 31, this.textCells), 31, this.areCellBlockVisible)) * 31;
        CopyInputVO copyInputVO = this.copyInput;
        int hashCode3 = (hashCode2 + (copyInputVO == null ? 0 : copyInputVO.hashCode())) * 31;
        t tVar = this.viewEvent;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.deleteServiceButton;
        int hashCode5 = (hashCode4 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        CellDTO cellDTO = this.note;
        int hashCode6 = (hashCode5 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.detailsLinkBadge;
        return hashCode6 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageDTO imageDTO = this.imageInfo;
        boolean z11 = this.isImageOutline;
        List<TextInfoCellVO> list = this.textCells;
        boolean z12 = this.areCellBlockVisible;
        CellBlockVO cellBlockVO = this.cellBlock;
        CopyInputVO copyInputVO = this.copyInput;
        t tVar = this.viewEvent;
        IconButtonV3DTO iconButtonV3DTO = this.deleteServiceButton;
        CellDTO cellDTO = this.note;
        BadgeDTO badgeDTO = this.detailsLinkBadge;
        StringBuilder c11 = Nh.b.c("InfoPopupV4VO(id=", j11, ", imageInfo=", imageDTO);
        c11.append(", isImageOutline=");
        c11.append(z11);
        c11.append(", textCells=");
        c11.append(list);
        c11.append(", areCellBlockVisible=");
        c11.append(z12);
        c11.append(", cellBlock=");
        c11.append(cellBlockVO);
        c11.append(", copyInput=");
        c11.append(copyInputVO);
        c11.append(", viewEvent=");
        c11.append(tVar);
        c11.append(", deleteServiceButton=");
        c11.append(iconButtonV3DTO);
        c11.append(", note=");
        c11.append(cellDTO);
        c11.append(", detailsLinkBadge=");
        c11.append(badgeDTO);
        c11.append(")");
        return c11.toString();
    }
}
