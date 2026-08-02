package ru.ozon.app.android.returns.ui.molecules.cellContent.viewObject;

import D3.h;
import G.g;
import Ns.b;
import TY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002./BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b,\u0010\"R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b-\u0010%¨\u00060"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO;", "Ll20/c;", "Lru/ozon/composer/network/widget/item/ViewItem;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$BalanceRow;", "rows", "Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$Separator;", "separator", "total", "description", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "buttons", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$Separator;Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$BalanceRow;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getRows", "()Ljava/util/List;", "Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$Separator;", "getSeparator", "()Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$Separator;", "Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$BalanceRow;", "getTotal", "()Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$BalanceRow;", "getDescription", "getButtons", "BalanceRow", "Separator", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnCellContentVO implements c {

    @NotNull
    private final List<ButtonsDTO> buttons;
    private final TextDTO description;
    private final long id;

    @NotNull
    private final List<BalanceRow> rows;

    @NotNull
    private final Separator separator;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final BalanceRow total;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$BalanceRow;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BalanceRow {
        private final long id;

        @NotNull
        private final PriceDTO price;

        @NotNull
        private final TextDTO text;

        public BalanceRow(long j11, @NotNull TextDTO text, @NotNull PriceDTO price) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(price, "price");
            this.id = j11;
            this.text = text;
            this.price = price;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BalanceRow)) {
                return false;
            }
            BalanceRow balanceRow = (BalanceRow) other;
            return this.id == balanceRow.id && Intrinsics.d(this.text, balanceRow.text) && Intrinsics.d(this.price, balanceRow.price);
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.price.hashCode() + b.a(this.text, Long.hashCode(this.id) * 31, 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextDTO textDTO = this.text;
            PriceDTO priceDTO = this.price;
            StringBuilder b11 = a.b("BalanceRow(id=", j11, ", text=", textDTO);
            b11.append(", price=");
            b11.append(priceDTO);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO$Separator;", "", "", "color", "", "height", "<init>", "(Ljava/lang/String;F)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColor", "F", "getHeight", "()F", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Separator {

        @NotNull
        private final String color;
        private final float height;

        public Separator(@NotNull String color, float f7) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.color = color;
            this.height = f7;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Separator)) {
                return false;
            }
            Separator separator = (Separator) other;
            return Intrinsics.d(this.color, separator.color) && Float.compare(this.height, separator.height) == 0;
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        public final float getHeight() {
            return this.height;
        }

        public int hashCode() {
            return Float.hashCode(this.height) + (this.color.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Separator(color=" + this.color + ", height=" + this.height + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnCellContentVO(long j11, @NotNull TextDTO title, @NotNull List<BalanceRow> rows, @NotNull Separator separator, @NotNull BalanceRow total, TextDTO textDTO, @NotNull List<? extends ButtonsDTO> buttons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.id = j11;
        this.title = title;
        this.rows = rows;
        this.separator = separator;
        this.total = total;
        this.description = textDTO;
        this.buttons = buttons;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnCellContentVO)) {
            return false;
        }
        ReturnCellContentVO returnCellContentVO = (ReturnCellContentVO) other;
        return this.id == returnCellContentVO.id && Intrinsics.d(this.title, returnCellContentVO.title) && Intrinsics.d(this.rows, returnCellContentVO.rows) && Intrinsics.d(this.separator, returnCellContentVO.separator) && Intrinsics.d(this.total, returnCellContentVO.total) && Intrinsics.d(this.description, returnCellContentVO.description) && Intrinsics.d(this.buttons, returnCellContentVO.buttons);
    }

    @NotNull
    public final List<ButtonsDTO> getButtons() {
        return this.buttons;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<BalanceRow> getRows() {
        return this.rows;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Separator getSeparator() {
        return this.separator;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final BalanceRow getTotal() {
        return this.total;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.total.hashCode() + ((this.separator.hashCode() + g.b(b.a(this.title, Long.hashCode(this.id) * 31, 31), 31, this.rows)) * 31)) * 31;
        TextDTO textDTO = this.description;
        return this.buttons.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        List<BalanceRow> list = this.rows;
        Separator separator = this.separator;
        BalanceRow balanceRow = this.total;
        TextDTO textDTO2 = this.description;
        List<ButtonsDTO> list2 = this.buttons;
        StringBuilder b11 = a.b("ReturnCellContentVO(id=", j11, ", title=", textDTO);
        b11.append(", rows=");
        b11.append(list);
        b11.append(", separator=");
        b11.append(separator);
        b11.append(", total=");
        b11.append(balanceRow);
        b11.append(", description=");
        b11.append(textDTO2);
        return h.c(b11, ", buttons=", list2, ")");
    }
}
