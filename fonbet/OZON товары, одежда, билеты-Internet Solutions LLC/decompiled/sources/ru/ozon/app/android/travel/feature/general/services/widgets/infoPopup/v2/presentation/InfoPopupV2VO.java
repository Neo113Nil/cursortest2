package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v2.presentation;

import G.g;
import Kk.C3532b;
import Lh.a;
import V.e;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.textInfoCells.TextInfoCellVO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00013Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b.\u0010+R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b/\u0010(R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/presentation/InfoPopupV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/presentation/InfoPopupV2VO$ImageInfo;", "imageInfo", "", "Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellVO;", "textCells", "", "areCellsVisible", "Lru/ozon/uni/atoms/data/AtomDTO;", "cells", "areButtonsVisible", "areButtonsHorizontal", "buttons", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/presentation/InfoPopupV2VO$ImageInfo;Ljava/util/List;ZLjava/util/List;ZZLjava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/presentation/InfoPopupV2VO$ImageInfo;", "getImageInfo", "()Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/presentation/InfoPopupV2VO$ImageInfo;", "Ljava/util/List;", "getTextCells", "()Ljava/util/List;", "Z", "getAreCellsVisible", "()Z", "getCells", "getAreButtonsVisible", "getAreButtonsHorizontal", "getButtons", "LWZ/t;", "getViewEvent", "()LWZ/t;", "ImageInfo", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InfoPopupV2VO implements c {
    private final boolean areButtonsHorizontal;
    private final boolean areButtonsVisible;
    private final boolean areCellsVisible;

    @NotNull
    private final List<AtomDTO> buttons;

    @NotNull
    private final List<AtomDTO> cells;
    private final long id;
    private final ImageInfo imageInfo;
    private final List<TextInfoCellVO> textCells;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/presentation/InfoPopupV2VO$ImageInfo;", "", "", "link", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "getBackgroundColor", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageInfo {

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final String link;

        public ImageInfo(@NotNull String link, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.link = link;
            this.backgroundColor = backgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageInfo)) {
                return false;
            }
            ImageInfo imageInfo = (ImageInfo) other;
            return Intrinsics.d(this.link, imageInfo.link) && Intrinsics.d(this.backgroundColor, imageInfo.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode() + (this.link.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("ImageInfo(link=", this.link, ", backgroundColor=", this.backgroundColor, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InfoPopupV2VO(long j11, ImageInfo imageInfo, List<TextInfoCellVO> list, boolean z11, @NotNull List<? extends AtomDTO> cells, boolean z12, boolean z13, @NotNull List<? extends AtomDTO> buttons, t tVar) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.id = j11;
        this.imageInfo = imageInfo;
        this.textCells = list;
        this.areCellsVisible = z11;
        this.cells = cells;
        this.areButtonsVisible = z12;
        this.areButtonsHorizontal = z13;
        this.buttons = buttons;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoPopupV2VO)) {
            return false;
        }
        InfoPopupV2VO infoPopupV2VO = (InfoPopupV2VO) other;
        return this.id == infoPopupV2VO.id && Intrinsics.d(this.imageInfo, infoPopupV2VO.imageInfo) && Intrinsics.d(this.textCells, infoPopupV2VO.textCells) && this.areCellsVisible == infoPopupV2VO.areCellsVisible && Intrinsics.d(this.cells, infoPopupV2VO.cells) && this.areButtonsVisible == infoPopupV2VO.areButtonsVisible && this.areButtonsHorizontal == infoPopupV2VO.areButtonsHorizontal && Intrinsics.d(this.buttons, infoPopupV2VO.buttons) && Intrinsics.d(this.viewEvent, infoPopupV2VO.viewEvent);
    }

    public final boolean getAreButtonsHorizontal() {
        return this.areButtonsHorizontal;
    }

    public final boolean getAreButtonsVisible() {
        return this.areButtonsVisible;
    }

    public final boolean getAreCellsVisible() {
        return this.areCellsVisible;
    }

    @NotNull
    public final List<AtomDTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final List<AtomDTO> getCells() {
        return this.cells;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ImageInfo getImageInfo() {
        return this.imageInfo;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

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
        ImageInfo imageInfo = this.imageInfo;
        int hashCode2 = (hashCode + (imageInfo == null ? 0 : imageInfo.hashCode())) * 31;
        List<TextInfoCellVO> list = this.textCells;
        int b11 = g.b(C3532b.a(C3532b.a(g.b(C3532b.a((hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.areCellsVisible), 31, this.cells), 31, this.areButtonsVisible), 31, this.areButtonsHorizontal), 31, this.buttons);
        t tVar = this.viewEvent;
        return b11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageInfo imageInfo = this.imageInfo;
        List<TextInfoCellVO> list = this.textCells;
        boolean z11 = this.areCellsVisible;
        List<AtomDTO> list2 = this.cells;
        boolean z12 = this.areButtonsVisible;
        boolean z13 = this.areButtonsHorizontal;
        List<AtomDTO> list3 = this.buttons;
        t tVar = this.viewEvent;
        StringBuilder sb2 = new StringBuilder("InfoPopupV2VO(id=");
        sb2.append(j11);
        sb2.append(", imageInfo=");
        sb2.append(imageInfo);
        AZ.c.c(sb2, ", textCells=", list, ", areCellsVisible=", z11);
        AZ.c.c(sb2, ", cells=", list2, ", areButtonsVisible=", z12);
        sb2.append(", areButtonsHorizontal=");
        sb2.append(z13);
        sb2.append(", buttons=");
        sb2.append(list3);
        return a.b(sb2, ", viewEvent=", tVar, ")");
    }
}
