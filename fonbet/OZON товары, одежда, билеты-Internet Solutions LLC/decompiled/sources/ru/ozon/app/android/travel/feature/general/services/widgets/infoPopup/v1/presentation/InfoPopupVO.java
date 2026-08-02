package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.presentation;

import Ak.C2436a;
import De.C2860c;
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
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.travel.molecules.view.textInfoCells.TextInfoCellVO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00011Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b\b\u0010(R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b\t\u0010(R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b\u000f\u0010(R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b-\u0010+R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/presentation/InfoPopupVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/presentation/InfoPopupVO$InfoPopupImageVO;", "image", "", "isBgInvisible", "isImageGone", "", "Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellVO;", "textInfoCells", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "cells", "isCellsVisible", "Lru/ozon/uni/atoms/data/AtomDTO;", "buttons", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/presentation/InfoPopupVO$InfoPopupImageVO;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/presentation/InfoPopupVO$InfoPopupImageVO;", "getImage", "()Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/presentation/InfoPopupVO$InfoPopupImageVO;", "Z", "()Z", "Ljava/util/List;", "getTextInfoCells", "()Ljava/util/List;", "getCells", "getButtons", "LWZ/t;", "getViewEvent", "()LWZ/t;", "InfoPopupImageVO", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InfoPopupVO implements c {

    @NotNull
    private final List<AtomDTO> buttons;

    @NotNull
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> cells;
    private final long id;
    private final InfoPopupImageVO image;
    private final boolean isBgInvisible;
    private final boolean isCellsVisible;
    private final boolean isImageGone;

    @NotNull
    private final List<TextInfoCellVO> textInfoCells;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/presentation/InfoPopupVO$InfoPopupImageVO;", "", "", "src", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSrc", "getBackgroundColor", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InfoPopupImageVO {
        private final String backgroundColor;

        @NotNull
        private final String src;

        public InfoPopupImageVO(@NotNull String src, String str) {
            Intrinsics.checkNotNullParameter(src, "src");
            this.src = src;
            this.backgroundColor = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoPopupImageVO)) {
                return false;
            }
            InfoPopupImageVO infoPopupImageVO = (InfoPopupImageVO) other;
            return Intrinsics.d(this.src, infoPopupImageVO.src) && Intrinsics.d(this.backgroundColor, infoPopupImageVO.backgroundColor);
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
            return e.a("InfoPopupImageVO(src=", this.src, ", backgroundColor=", this.backgroundColor, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InfoPopupVO(long j11, InfoPopupImageVO infoPopupImageVO, boolean z11, boolean z12, @NotNull List<TextInfoCellVO> textInfoCells, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> cells, boolean z13, @NotNull List<? extends AtomDTO> buttons, t tVar) {
        Intrinsics.checkNotNullParameter(textInfoCells, "textInfoCells");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.id = j11;
        this.image = infoPopupImageVO;
        this.isBgInvisible = z11;
        this.isImageGone = z12;
        this.textInfoCells = textInfoCells;
        this.cells = cells;
        this.isCellsVisible = z13;
        this.buttons = buttons;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoPopupVO)) {
            return false;
        }
        InfoPopupVO infoPopupVO = (InfoPopupVO) other;
        return this.id == infoPopupVO.id && Intrinsics.d(this.image, infoPopupVO.image) && this.isBgInvisible == infoPopupVO.isBgInvisible && this.isImageGone == infoPopupVO.isImageGone && Intrinsics.d(this.textInfoCells, infoPopupVO.textInfoCells) && Intrinsics.d(this.cells, infoPopupVO.cells) && this.isCellsVisible == infoPopupVO.isCellsVisible && Intrinsics.d(this.buttons, infoPopupVO.buttons) && Intrinsics.d(this.viewEvent, infoPopupVO.viewEvent);
    }

    @NotNull
    public final List<AtomDTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> getCells() {
        return this.cells;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final InfoPopupImageVO getImage() {
        return this.image;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<TextInfoCellVO> getTextInfoCells() {
        return this.textInfoCells;
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
        InfoPopupImageVO infoPopupImageVO = this.image;
        int b11 = g.b(C3532b.a(g.b(g.b(C3532b.a(C3532b.a((hashCode + (infoPopupImageVO == null ? 0 : infoPopupImageVO.hashCode())) * 31, 31, this.isBgInvisible), 31, this.isImageGone), 31, this.textInfoCells), 31, this.cells), 31, this.isCellsVisible), 31, this.buttons);
        t tVar = this.viewEvent;
        return b11 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isBgInvisible, reason: from getter */
    public final boolean getIsBgInvisible() {
        return this.isBgInvisible;
    }

    /* renamed from: isCellsVisible, reason: from getter */
    public final boolean getIsCellsVisible() {
        return this.isCellsVisible;
    }

    /* renamed from: isImageGone, reason: from getter */
    public final boolean getIsImageGone() {
        return this.isImageGone;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        InfoPopupImageVO infoPopupImageVO = this.image;
        boolean z11 = this.isBgInvisible;
        boolean z12 = this.isImageGone;
        List<TextInfoCellVO> list = this.textInfoCells;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list2 = this.cells;
        boolean z13 = this.isCellsVisible;
        List<AtomDTO> list3 = this.buttons;
        t tVar = this.viewEvent;
        StringBuilder sb2 = new StringBuilder("InfoPopupVO(id=");
        sb2.append(j11);
        sb2.append(", image=");
        sb2.append(infoPopupImageVO);
        C2436a.e(", isBgInvisible=", ", isImageGone=", sb2, z11, z12);
        C2860c.g(", textInfoCells=", ", cells=", sb2, list, list2);
        sb2.append(", isCellsVisible=");
        sb2.append(z13);
        sb2.append(", buttons=");
        sb2.append(list3);
        return a.b(sb2, ", viewEvent=", tVar, ")");
    }
}
