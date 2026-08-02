package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.secureDeal;

import De.C2860c;
import Ns.b;
import TY.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CellItem;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002By\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b0\u0010&R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b1\u0010)R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b2\u0010)R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;", "topBlockInput", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "topBlockDisclaimer", "cardsTitle", "cardsSubtitle", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CellItem;", "cards", "LWZ/t;", "tokenizedEvent", "inputDelay", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;LWZ/t;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getSubtitle", "()Ljava/util/List;", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;", "getTopBlockInput", "()Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getTopBlockDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getCardsTitle", "getCardsSubtitle", "getCards", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/Long;", "getInputDelay", "()Ljava/lang/Long;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SecureDealDataVO implements c {
    private final List<CellItem> cards;
    private final List<TextDTO> cardsSubtitle;
    private final TextDTO cardsTitle;
    private final long id;
    private final Long inputDelay;
    private final List<TextDTO> subtitle;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;
    private final DisclaimerDTO topBlockDisclaimer;
    private final InputMoleculeVO topBlockInput;

    public SecureDealDataVO(long j11, @NotNull TextDTO title, List<TextDTO> list, InputMoleculeVO inputMoleculeVO, DisclaimerDTO disclaimerDTO, TextDTO textDTO, List<TextDTO> list2, List<CellItem> list3, t tVar, Long l11) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.subtitle = list;
        this.topBlockInput = inputMoleculeVO;
        this.topBlockDisclaimer = disclaimerDTO;
        this.cardsTitle = textDTO;
        this.cardsSubtitle = list2;
        this.cards = list3;
        this.tokenizedEvent = tVar;
        this.inputDelay = l11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecureDealDataVO)) {
            return false;
        }
        SecureDealDataVO secureDealDataVO = (SecureDealDataVO) other;
        return this.id == secureDealDataVO.id && Intrinsics.d(this.title, secureDealDataVO.title) && Intrinsics.d(this.subtitle, secureDealDataVO.subtitle) && Intrinsics.d(this.topBlockInput, secureDealDataVO.topBlockInput) && Intrinsics.d(this.topBlockDisclaimer, secureDealDataVO.topBlockDisclaimer) && Intrinsics.d(this.cardsTitle, secureDealDataVO.cardsTitle) && Intrinsics.d(this.cardsSubtitle, secureDealDataVO.cardsSubtitle) && Intrinsics.d(this.cards, secureDealDataVO.cards) && Intrinsics.d(this.tokenizedEvent, secureDealDataVO.tokenizedEvent) && Intrinsics.d(this.inputDelay, secureDealDataVO.inputDelay);
    }

    public final List<CellItem> getCards() {
        return this.cards;
    }

    public final List<TextDTO> getCardsSubtitle() {
        return this.cardsSubtitle;
    }

    public final TextDTO getCardsTitle() {
        return this.cardsTitle;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Long getInputDelay() {
        return this.inputDelay;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final List<TextDTO> getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final DisclaimerDTO getTopBlockDisclaimer() {
        return this.topBlockDisclaimer;
    }

    public final InputMoleculeVO getTopBlockInput() {
        return this.topBlockInput;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        List<TextDTO> list = this.subtitle;
        int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        InputMoleculeVO inputMoleculeVO = this.topBlockInput;
        int hashCode2 = (hashCode + (inputMoleculeVO == null ? 0 : inputMoleculeVO.hashCode())) * 31;
        DisclaimerDTO disclaimerDTO = this.topBlockDisclaimer;
        int hashCode3 = (hashCode2 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31;
        TextDTO textDTO = this.cardsTitle;
        int hashCode4 = (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        List<TextDTO> list2 = this.cardsSubtitle;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CellItem> list3 = this.cards;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode7 = (hashCode6 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Long l11 = this.inputDelay;
        return hashCode7 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        List<TextDTO> list = this.subtitle;
        InputMoleculeVO inputMoleculeVO = this.topBlockInput;
        DisclaimerDTO disclaimerDTO = this.topBlockDisclaimer;
        TextDTO textDTO2 = this.cardsTitle;
        List<TextDTO> list2 = this.cardsSubtitle;
        List<CellItem> list3 = this.cards;
        t tVar = this.tokenizedEvent;
        Long l11 = this.inputDelay;
        StringBuilder b11 = a.b("SecureDealDataVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(list);
        b11.append(", topBlockInput=");
        b11.append(inputMoleculeVO);
        b11.append(", topBlockDisclaimer=");
        b11.append(disclaimerDTO);
        b11.append(", cardsTitle=");
        b11.append(textDTO2);
        C2860c.g(", cardsSubtitle=", ", cards=", b11, list2, list3);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", inputDelay=");
        b11.append(l11);
        b11.append(")");
        return b11.toString();
    }
}
