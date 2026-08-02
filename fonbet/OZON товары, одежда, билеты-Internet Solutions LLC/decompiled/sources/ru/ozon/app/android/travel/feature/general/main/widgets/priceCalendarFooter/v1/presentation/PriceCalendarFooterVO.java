package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation;

import Bl.C2639a;
import Lh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jn\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "informer", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "toggles", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "resetButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "confirmButton", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "updateWidgetState", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;)Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getInformer", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getToggles", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getResetButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getConfirmButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getUpdateWidgetState", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PriceCalendarFooterVO implements c {
    private final ButtonV3Atom.LargeButton confirmButton;
    private final long id;
    private final TextAtom informer;
    private final ButtonV3Atom.SmallIconButton resetButton;
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> toggles;
    private final t tokenizedEvent;
    private final AtomActionDTO updateWidgetState;

    public PriceCalendarFooterVO(long j11, TextAtom textAtom, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> list, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.LargeButton largeButton, AtomActionDTO atomActionDTO, t tVar) {
        this.id = j11;
        this.informer = textAtom;
        this.toggles = list;
        this.resetButton = smallIconButton;
        this.confirmButton = largeButton;
        this.updateWidgetState = atomActionDTO;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ PriceCalendarFooterVO copy$default(PriceCalendarFooterVO priceCalendarFooterVO, long j11, TextAtom textAtom, List list, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.LargeButton largeButton, AtomActionDTO atomActionDTO, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = priceCalendarFooterVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textAtom = priceCalendarFooterVO.informer;
        }
        TextAtom textAtom2 = textAtom;
        if ((i11 & 4) != 0) {
            list = priceCalendarFooterVO.toggles;
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            smallIconButton = priceCalendarFooterVO.resetButton;
        }
        ButtonV3Atom.SmallIconButton smallIconButton2 = smallIconButton;
        if ((i11 & 16) != 0) {
            largeButton = priceCalendarFooterVO.confirmButton;
        }
        return priceCalendarFooterVO.copy(j12, textAtom2, list2, smallIconButton2, largeButton, (i11 & 32) != 0 ? priceCalendarFooterVO.updateWidgetState : atomActionDTO, (i11 & 64) != 0 ? priceCalendarFooterVO.tokenizedEvent : tVar);
    }

    @NotNull
    public final PriceCalendarFooterVO copy(long id2, TextAtom informer, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> toggles, ButtonV3Atom.SmallIconButton resetButton, ButtonV3Atom.LargeButton confirmButton, AtomActionDTO updateWidgetState, t tokenizedEvent) {
        return new PriceCalendarFooterVO(id2, informer, toggles, resetButton, confirmButton, updateWidgetState, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceCalendarFooterVO)) {
            return false;
        }
        PriceCalendarFooterVO priceCalendarFooterVO = (PriceCalendarFooterVO) other;
        return this.id == priceCalendarFooterVO.id && Intrinsics.d(this.informer, priceCalendarFooterVO.informer) && Intrinsics.d(this.toggles, priceCalendarFooterVO.toggles) && Intrinsics.d(this.resetButton, priceCalendarFooterVO.resetButton) && Intrinsics.d(this.confirmButton, priceCalendarFooterVO.confirmButton) && Intrinsics.d(this.updateWidgetState, priceCalendarFooterVO.updateWidgetState) && Intrinsics.d(this.tokenizedEvent, priceCalendarFooterVO.tokenizedEvent);
    }

    public final ButtonV3Atom.LargeButton getConfirmButton() {
        return this.confirmButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TextAtom getInformer() {
        return this.informer;
    }

    public final ButtonV3Atom.SmallIconButton getResetButton() {
        return this.resetButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> getToggles() {
        return this.toggles;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final AtomActionDTO getUpdateWidgetState() {
        return this.updateWidgetState;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextAtom textAtom = this.informer;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> list = this.toggles;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.resetButton;
        int hashCode4 = (hashCode3 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.confirmButton;
        int hashCode5 = (hashCode4 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.updateWidgetState;
        int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode6 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.informer;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle> list = this.toggles;
        ButtonV3Atom.SmallIconButton smallIconButton = this.resetButton;
        ButtonV3Atom.LargeButton largeButton = this.confirmButton;
        AtomActionDTO atomActionDTO = this.updateWidgetState;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2639a.c("PriceCalendarFooterVO(id=", j11, ", informer=", textAtom);
        c11.append(", toggles=");
        c11.append(list);
        c11.append(", resetButton=");
        c11.append(smallIconButton);
        c11.append(", confirmButton=");
        c11.append(largeButton);
        c11.append(", updateWidgetState=");
        c11.append(atomActionDTO);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
