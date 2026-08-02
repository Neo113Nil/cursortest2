package ru.ozon.app.android.returns.ui.molecules.cellContent.data;

import G.g;
import K1.G;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002'(BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005HÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006)"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "rows", "", "Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO$BalanceRowDTO;", "separator", "Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO$SeparatorDTO;", "total", "description", "buttons", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO$SeparatorDTO;Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO$BalanceRowDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRows", "()Ljava/util/List;", "getSeparator", "()Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO$SeparatorDTO;", "getTotal", "()Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO$BalanceRowDTO;", "getDescription", "getButtons", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BalanceRowDTO", "SeparatorDTO", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnCellContentDTO {
    private final List<ButtonV3DTO> buttons;
    private final TextDTO description;

    @NotNull
    private final List<BalanceRowDTO> rows;

    @NotNull
    private final SeparatorDTO separator;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final BalanceRowDTO total;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO$BalanceRowDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BalanceRowDTO {

        @NotNull
        private final PriceDTO price;

        @NotNull
        private final TextDTO text;

        public BalanceRowDTO(@NotNull TextDTO text, @NotNull PriceDTO price) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(price, "price");
            this.text = text;
            this.price = price;
        }

        public static /* synthetic */ BalanceRowDTO copy$default(BalanceRowDTO balanceRowDTO, TextDTO textDTO, PriceDTO priceDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = balanceRowDTO.text;
            }
            if ((i11 & 2) != 0) {
                priceDTO = balanceRowDTO.price;
            }
            return balanceRowDTO.copy(textDTO, priceDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final BalanceRowDTO copy(@NotNull TextDTO text, @NotNull PriceDTO price) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(price, "price");
            return new BalanceRowDTO(text, price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BalanceRowDTO)) {
                return false;
            }
            BalanceRowDTO balanceRowDTO = (BalanceRowDTO) other;
            return Intrinsics.d(this.text, balanceRowDTO.text) && Intrinsics.d(this.price, balanceRowDTO.price);
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
            return this.price.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "BalanceRowDTO(text=" + this.text + ", price=" + this.price + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO$SeparatorDTO;", "", "color", "", "height", "", "<init>", "(Ljava/lang/String;Ljava/lang/Float;)V", "getColor", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Float;)Lru/ozon/app/android/returns/ui/molecules/cellContent/data/ReturnCellContentDTO$SeparatorDTO;", "equals", "", "other", "hashCode", "", "toString", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeparatorDTO {
        private final String color;
        private final Float height;

        public SeparatorDTO(String str, Float f7) {
            this.color = str;
            this.height = f7;
        }

        public static /* synthetic */ SeparatorDTO copy$default(SeparatorDTO separatorDTO, String str, Float f7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = separatorDTO.color;
            }
            if ((i11 & 2) != 0) {
                f7 = separatorDTO.height;
            }
            return separatorDTO.copy(str, f7);
        }

        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final Float getHeight() {
            return this.height;
        }

        @NotNull
        public final SeparatorDTO copy(String color, Float height) {
            return new SeparatorDTO(color, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeparatorDTO)) {
                return false;
            }
            SeparatorDTO separatorDTO = (SeparatorDTO) other;
            return Intrinsics.d(this.color, separatorDTO.color) && Intrinsics.d(this.height, separatorDTO.height);
        }

        public final String getColor() {
            return this.color;
        }

        public final Float getHeight() {
            return this.height;
        }

        public int hashCode() {
            String str = this.color;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Float f7 = this.height;
            return hashCode + (f7 != null ? f7.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SeparatorDTO(color=" + this.color + ", height=" + this.height + ")";
        }
    }

    public ReturnCellContentDTO(@NotNull TextDTO title, @NotNull List<BalanceRowDTO> rows, @NotNull SeparatorDTO separator, @NotNull BalanceRowDTO total, TextDTO textDTO, List<ButtonV3DTO> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(total, "total");
        this.title = title;
        this.rows = rows;
        this.separator = separator;
        this.total = total;
        this.description = textDTO;
        this.buttons = list;
    }

    public static /* synthetic */ ReturnCellContentDTO copy$default(ReturnCellContentDTO returnCellContentDTO, TextDTO textDTO, List list, SeparatorDTO separatorDTO, BalanceRowDTO balanceRowDTO, TextDTO textDTO2, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = returnCellContentDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = returnCellContentDTO.rows;
        }
        if ((i11 & 4) != 0) {
            separatorDTO = returnCellContentDTO.separator;
        }
        if ((i11 & 8) != 0) {
            balanceRowDTO = returnCellContentDTO.total;
        }
        if ((i11 & 16) != 0) {
            textDTO2 = returnCellContentDTO.description;
        }
        if ((i11 & 32) != 0) {
            list2 = returnCellContentDTO.buttons;
        }
        TextDTO textDTO3 = textDTO2;
        List list3 = list2;
        return returnCellContentDTO.copy(textDTO, list, separatorDTO, balanceRowDTO, textDTO3, list3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<BalanceRowDTO> component2() {
        return this.rows;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SeparatorDTO getSeparator() {
        return this.separator;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BalanceRowDTO getTotal() {
        return this.total;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    public final List<ButtonV3DTO> component6() {
        return this.buttons;
    }

    @NotNull
    public final ReturnCellContentDTO copy(@NotNull TextDTO title, @NotNull List<BalanceRowDTO> rows, @NotNull SeparatorDTO separator, @NotNull BalanceRowDTO total, TextDTO description, List<ButtonV3DTO> buttons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(total, "total");
        return new ReturnCellContentDTO(title, rows, separator, total, description, buttons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnCellContentDTO)) {
            return false;
        }
        ReturnCellContentDTO returnCellContentDTO = (ReturnCellContentDTO) other;
        return Intrinsics.d(this.title, returnCellContentDTO.title) && Intrinsics.d(this.rows, returnCellContentDTO.rows) && Intrinsics.d(this.separator, returnCellContentDTO.separator) && Intrinsics.d(this.total, returnCellContentDTO.total) && Intrinsics.d(this.description, returnCellContentDTO.description) && Intrinsics.d(this.buttons, returnCellContentDTO.buttons);
    }

    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final List<BalanceRowDTO> getRows() {
        return this.rows;
    }

    @NotNull
    public final SeparatorDTO getSeparator() {
        return this.separator;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final BalanceRowDTO getTotal() {
        return this.total;
    }

    public int hashCode() {
        int hashCode = (this.total.hashCode() + ((this.separator.hashCode() + g.b(this.title.hashCode() * 31, 31, this.rows)) * 31)) * 31;
        TextDTO textDTO = this.description;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        List<ButtonV3DTO> list = this.buttons;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<BalanceRowDTO> list = this.rows;
        SeparatorDTO separatorDTO = this.separator;
        BalanceRowDTO balanceRowDTO = this.total;
        TextDTO textDTO2 = this.description;
        List<ButtonV3DTO> list2 = this.buttons;
        StringBuilder e11 = G.e("ReturnCellContentDTO(title=", textDTO, ", rows=", list, ", separator=");
        e11.append(separatorDTO);
        e11.append(", total=");
        e11.append(balanceRowDTO);
        e11.append(", description=");
        e11.append(textDTO2);
        e11.append(", buttons=");
        e11.append(list2);
        e11.append(")");
        return e11.toString();
    }
}
