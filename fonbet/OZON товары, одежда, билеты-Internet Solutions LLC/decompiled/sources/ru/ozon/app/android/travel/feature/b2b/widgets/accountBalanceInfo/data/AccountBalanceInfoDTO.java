package ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.data;

import B90.C2618u;
import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/data/AccountBalanceInfoDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", DynamicElementDTO.LARGE_BUTTON, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "textElements", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/data/AccountBalanceInfoDTO$TextInfoCellsDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getLargeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTextElements", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TextInfoCellsDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AccountBalanceInfoDTO {
    public static final int $stable = 8;
    private final ButtonV3Atom.LargeButton largeButton;

    @NotNull
    private final List<TextInfoCellsDTO> textElements;
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/data/AccountBalanceInfoDTO$TextInfoCellsDTO;", "", "cells", "", "Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO;", "<init>", "(Ljava/util/List;)V", "getCells", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextInfoCellsDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<TextInfoCellDTO> cells;

        public TextInfoCellsDTO(@NotNull List<TextInfoCellDTO> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.cells = cells;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TextInfoCellsDTO copy$default(TextInfoCellsDTO textInfoCellsDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = textInfoCellsDTO.cells;
            }
            return textInfoCellsDTO.copy(list);
        }

        @NotNull
        public final List<TextInfoCellDTO> component1() {
            return this.cells;
        }

        @NotNull
        public final TextInfoCellsDTO copy(@NotNull List<TextInfoCellDTO> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            return new TextInfoCellsDTO(cells);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextInfoCellsDTO) && Intrinsics.d(this.cells, ((TextInfoCellsDTO) other).cells);
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
            return c.a("TextInfoCellsDTO(cells=", ")", this.cells);
        }
    }

    public AccountBalanceInfoDTO(TextAtom textAtom, ButtonV3Atom.LargeButton largeButton, @NotNull List<TextInfoCellsDTO> textElements) {
        Intrinsics.checkNotNullParameter(textElements, "textElements");
        this.title = textAtom;
        this.largeButton = largeButton;
        this.textElements = textElements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountBalanceInfoDTO copy$default(AccountBalanceInfoDTO accountBalanceInfoDTO, TextAtom textAtom, ButtonV3Atom.LargeButton largeButton, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = accountBalanceInfoDTO.title;
        }
        if ((i11 & 2) != 0) {
            largeButton = accountBalanceInfoDTO.largeButton;
        }
        if ((i11 & 4) != 0) {
            list = accountBalanceInfoDTO.textElements;
        }
        return accountBalanceInfoDTO.copy(textAtom, largeButton, list);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.LargeButton getLargeButton() {
        return this.largeButton;
    }

    @NotNull
    public final List<TextInfoCellsDTO> component3() {
        return this.textElements;
    }

    @NotNull
    public final AccountBalanceInfoDTO copy(TextAtom title, ButtonV3Atom.LargeButton largeButton, @NotNull List<TextInfoCellsDTO> textElements) {
        Intrinsics.checkNotNullParameter(textElements, "textElements");
        return new AccountBalanceInfoDTO(title, largeButton, textElements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountBalanceInfoDTO)) {
            return false;
        }
        AccountBalanceInfoDTO accountBalanceInfoDTO = (AccountBalanceInfoDTO) other;
        return Intrinsics.d(this.title, accountBalanceInfoDTO.title) && Intrinsics.d(this.largeButton, accountBalanceInfoDTO.largeButton) && Intrinsics.d(this.textElements, accountBalanceInfoDTO.textElements);
    }

    public final ButtonV3Atom.LargeButton getLargeButton() {
        return this.largeButton;
    }

    @NotNull
    public final List<TextInfoCellsDTO> getTextElements() {
        return this.textElements;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        ButtonV3Atom.LargeButton largeButton = this.largeButton;
        return this.textElements.hashCode() + ((hashCode + (largeButton != null ? largeButton.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        ButtonV3Atom.LargeButton largeButton = this.largeButton;
        List<TextInfoCellsDTO> list = this.textElements;
        StringBuilder sb2 = new StringBuilder("AccountBalanceInfoDTO(title=");
        sb2.append(textAtom);
        sb2.append(", largeButton=");
        sb2.append(largeButton);
        sb2.append(", textElements=");
        return C2618u.h(sb2, list, ")");
    }
}
