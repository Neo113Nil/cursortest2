package ru.ozon.app.android.travel.feature.tours.widgets.toursDetailsAccordion.presentation;

import El.C2971a;
import G.g;
import K1.G;
import Kk.C3532b;
import TY.a;
import Tl.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001:\u0002)*B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI$ContentVO;", "content", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI$ContentVO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI$ContentVO;", "getContent", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI$ContentVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ContentVO", "CellBlockVO", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursDetailsAccordionVI implements c {

    @NotNull
    private final ContentVO content;

    @NotNull
    private final IconDTO icon;
    private final long id;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010\u000e¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI$CellBlockVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Ljava/lang/String;", "getBackgroundColor", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellBlockVO {

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final List<CellDTO> cells;

        @NotNull
        private final CornerRadius cornerRadius;
        private final TextDTO title;

        public CellBlockVO(TextDTO textDTO, @NotNull List<CellDTO> cells, @NotNull CornerRadius cornerRadius, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.title = textDTO;
            this.cells = cells;
            this.cornerRadius = cornerRadius;
            this.backgroundColor = backgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellBlockVO)) {
                return false;
            }
            CellBlockVO cellBlockVO = (CellBlockVO) other;
            return Intrinsics.d(this.title, cellBlockVO.title) && Intrinsics.d(this.cells, cellBlockVO.cells) && this.cornerRadius == cellBlockVO.cornerRadius && Intrinsics.d(this.backgroundColor, cellBlockVO.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<CellDTO> getCells() {
            return this.cells;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            return this.backgroundColor.hashCode() + b.b(this.cornerRadius, g.b((textDTO == null ? 0 : textDTO.hashCode()) * 31, 31, this.cells), 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            List<CellDTO> list = this.cells;
            CornerRadius cornerRadius = this.cornerRadius;
            String str = this.backgroundColor;
            StringBuilder e11 = G.e("CellBlockVO(title=", textDTO, ", cells=", list, ", cornerRadius=");
            e11.append(cornerRadius);
            e11.append(", backgroundColor=");
            e11.append(str);
            e11.append(")");
            return e11.toString();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI$ContentVO;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "", "inBadgesVisible", "Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI$CellBlockVO;", "cellBlock", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;ZLru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI$CellBlockVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Z", "getInBadgesVisible", "()Z", "Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI$CellBlockVO;", "getCellBlock", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI$CellBlockVO;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentVO {

        @NotNull
        private final List<BadgeDTO> badges;
        private final CellDTO cell;
        private final CellBlockVO cellBlock;
        private final boolean inBadgesVisible;

        public ContentVO(CellDTO cellDTO, @NotNull List<BadgeDTO> badges, boolean z11, CellBlockVO cellBlockVO) {
            Intrinsics.checkNotNullParameter(badges, "badges");
            this.cell = cellDTO;
            this.badges = badges;
            this.inBadgesVisible = z11;
            this.cellBlock = cellBlockVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentVO)) {
                return false;
            }
            ContentVO contentVO = (ContentVO) other;
            return Intrinsics.d(this.cell, contentVO.cell) && Intrinsics.d(this.badges, contentVO.badges) && this.inBadgesVisible == contentVO.inBadgesVisible && Intrinsics.d(this.cellBlock, contentVO.cellBlock);
        }

        @NotNull
        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        public final CellDTO getCell() {
            return this.cell;
        }

        public final CellBlockVO getCellBlock() {
            return this.cellBlock;
        }

        public final boolean getInBadgesVisible() {
            return this.inBadgesVisible;
        }

        public int hashCode() {
            CellDTO cellDTO = this.cell;
            int a11 = C3532b.a(g.b((cellDTO == null ? 0 : cellDTO.hashCode()) * 31, 31, this.badges), 31, this.inBadgesVisible);
            CellBlockVO cellBlockVO = this.cellBlock;
            return a11 + (cellBlockVO != null ? cellBlockVO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ContentVO(cell=" + this.cell + ", badges=" + this.badges + ", inBadgesVisible=" + this.inBadgesVisible + ", cellBlock=" + this.cellBlock + ")";
        }
    }

    public ToursDetailsAccordionVI(long j11, @NotNull TextDTO title, @NotNull IconDTO icon, @NotNull ContentVO content, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = j11;
        this.title = title;
        this.icon = icon;
        this.content = content;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursDetailsAccordionVI)) {
            return false;
        }
        ToursDetailsAccordionVI toursDetailsAccordionVI = (ToursDetailsAccordionVI) other;
        return this.id == toursDetailsAccordionVI.id && Intrinsics.d(this.title, toursDetailsAccordionVI.title) && Intrinsics.d(this.icon, toursDetailsAccordionVI.icon) && Intrinsics.d(this.content, toursDetailsAccordionVI.content) && Intrinsics.d(this.tokenizedEvent, toursDetailsAccordionVI.tokenizedEvent);
    }

    @NotNull
    public final ContentVO getContent() {
        return this.content;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.content.hashCode() + C2971a.a(this.icon, Ns.b.a(this.title, Long.hashCode(this.id) * 31, 31), 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        IconDTO iconDTO = this.icon;
        ContentVO contentVO = this.content;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("ToursDetailsAccordionVI(id=", j11, ", title=", textDTO);
        b11.append(", icon=");
        b11.append(iconDTO);
        b11.append(", content=");
        b11.append(contentVO);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
