package ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.presentation;

import Bl.C2639a;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.molecules.view.textInfoCells.TextInfoCellVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001%B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/presentation/AccountBalanceInfoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", DynamicElementDTO.LARGE_BUTTON, "", "Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/presentation/AccountBalanceInfoVO$TextInfoCellsVO;", "textElements", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getLargeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/util/List;", "getTextElements", "()Ljava/util/List;", "TextInfoCellsVO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AccountBalanceInfoVO implements c {
    private final long id;
    private final ButtonV3Atom.LargeButton largeButton;

    @NotNull
    private final List<TextInfoCellsVO> textElements;
    private final TextAtom title;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/presentation/AccountBalanceInfoVO$TextInfoCellsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellVO;", "cells", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextInfoCellsVO implements c {

        @NotNull
        private final List<TextInfoCellVO> cells;
        private final long id;

        public TextInfoCellsVO(long j11, @NotNull List<TextInfoCellVO> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.id = j11;
            this.cells = cells;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextInfoCellsVO)) {
                return false;
            }
            TextInfoCellsVO textInfoCellsVO = (TextInfoCellsVO) other;
            return this.id == textInfoCellsVO.id && Intrinsics.d(this.cells, textInfoCellsVO.cells);
        }

        @NotNull
        public final List<TextInfoCellVO> getCells() {
            return this.cells;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return null;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return hashCode();
        }

        public int hashCode() {
            return this.cells.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder b11 = b.b(this.id, "TextInfoCellsVO(id=", ", cells=", this.cells);
            b11.append(")");
            return b11.toString();
        }
    }

    public AccountBalanceInfoVO(long j11, TextAtom textAtom, ButtonV3Atom.LargeButton largeButton, @NotNull List<TextInfoCellsVO> textElements) {
        Intrinsics.checkNotNullParameter(textElements, "textElements");
        this.id = j11;
        this.title = textAtom;
        this.largeButton = largeButton;
        this.textElements = textElements;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountBalanceInfoVO)) {
            return false;
        }
        AccountBalanceInfoVO accountBalanceInfoVO = (AccountBalanceInfoVO) other;
        return this.id == accountBalanceInfoVO.id && Intrinsics.d(this.title, accountBalanceInfoVO.title) && Intrinsics.d(this.largeButton, accountBalanceInfoVO.largeButton) && Intrinsics.d(this.textElements, accountBalanceInfoVO.textElements);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ButtonV3Atom.LargeButton getLargeButton() {
        return this.largeButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<TextInfoCellsVO> getTextElements() {
        return this.textElements;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextAtom textAtom = this.title;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.largeButton;
        return this.textElements.hashCode() + ((hashCode2 + (largeButton != null ? largeButton.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        ButtonV3Atom.LargeButton largeButton = this.largeButton;
        List<TextInfoCellsVO> list = this.textElements;
        StringBuilder c11 = C2639a.c("AccountBalanceInfoVO(id=", j11, ", title=", textAtom);
        c11.append(", largeButton=");
        c11.append(largeButton);
        c11.append(", textElements=");
        c11.append(list);
        c11.append(")");
        return c11.toString();
    }
}
