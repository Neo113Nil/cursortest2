package ru.ozon.app.android.returns.creation.widgets.total.data;

import Co.a;
import De.C2859b;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.balance.data.BalanceDetailsBlockDTO;
import ru.ozon.app.android.returns.ui.molecules.balance.data.BalanceRowDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J_\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015¨\u0006-"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/total/data/TotalDTO;", "", "backgroundColor", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/returns/creation/widgets/total/data/HeaderDTO;", "rows", "", "Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowDTO;", "refundDetailsBlock", "Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceDetailsBlockDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "description", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/creation/widgets/total/data/HeaderDTO;Ljava/util/List;Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceDetailsBlockDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getHeader", "()Lru/ozon/app/android/returns/creation/widgets/total/data/HeaderDTO;", "getRows", "()Ljava/util/List;", "getRefundDetailsBlock", "()Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceDetailsBlockDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getDescription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TotalDTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final ButtonV3DTO button;
    private final TextDTO description;
    private final HeaderDTO header;
    private final BalanceDetailsBlockDTO refundDetailsBlock;
    private final List<BalanceRowDTO> rows;
    private final TextDTO title;

    public TotalDTO(@NotNull String backgroundColor, TextDTO textDTO, HeaderDTO headerDTO, List<BalanceRowDTO> list, BalanceDetailsBlockDTO balanceDetailsBlockDTO, @NotNull ButtonV3DTO button, TextDTO textDTO2) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(button, "button");
        this.backgroundColor = backgroundColor;
        this.title = textDTO;
        this.header = headerDTO;
        this.rows = list;
        this.refundDetailsBlock = balanceDetailsBlockDTO;
        this.button = button;
        this.description = textDTO2;
    }

    public static /* synthetic */ TotalDTO copy$default(TotalDTO totalDTO, String str, TextDTO textDTO, HeaderDTO headerDTO, List list, BalanceDetailsBlockDTO balanceDetailsBlockDTO, ButtonV3DTO buttonV3DTO, TextDTO textDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = totalDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            textDTO = totalDTO.title;
        }
        if ((i11 & 4) != 0) {
            headerDTO = totalDTO.header;
        }
        if ((i11 & 8) != 0) {
            list = totalDTO.rows;
        }
        if ((i11 & 16) != 0) {
            balanceDetailsBlockDTO = totalDTO.refundDetailsBlock;
        }
        if ((i11 & 32) != 0) {
            buttonV3DTO = totalDTO.button;
        }
        if ((i11 & 64) != 0) {
            textDTO2 = totalDTO.description;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        TextDTO textDTO3 = textDTO2;
        BalanceDetailsBlockDTO balanceDetailsBlockDTO2 = balanceDetailsBlockDTO;
        HeaderDTO headerDTO2 = headerDTO;
        return totalDTO.copy(str, textDTO, headerDTO2, list, balanceDetailsBlockDTO2, buttonV3DTO2, textDTO3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final List<BalanceRowDTO> component4() {
        return this.rows;
    }

    /* renamed from: component5, reason: from getter */
    public final BalanceDetailsBlockDTO getRefundDetailsBlock() {
        return this.refundDetailsBlock;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component7, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final TotalDTO copy(@NotNull String backgroundColor, TextDTO title, HeaderDTO header, List<BalanceRowDTO> rows, BalanceDetailsBlockDTO refundDetailsBlock, @NotNull ButtonV3DTO button, TextDTO description) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(button, "button");
        return new TotalDTO(backgroundColor, title, header, rows, refundDetailsBlock, button, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalDTO)) {
            return false;
        }
        TotalDTO totalDTO = (TotalDTO) other;
        return Intrinsics.d(this.backgroundColor, totalDTO.backgroundColor) && Intrinsics.d(this.title, totalDTO.title) && Intrinsics.d(this.header, totalDTO.header) && Intrinsics.d(this.rows, totalDTO.rows) && Intrinsics.d(this.refundDetailsBlock, totalDTO.refundDetailsBlock) && Intrinsics.d(this.button, totalDTO.button) && Intrinsics.d(this.description, totalDTO.description);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final BalanceDetailsBlockDTO getRefundDetailsBlock() {
        return this.refundDetailsBlock;
    }

    public final List<BalanceRowDTO> getRows() {
        return this.rows;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.backgroundColor.hashCode() * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        HeaderDTO headerDTO = this.header;
        int hashCode3 = (hashCode2 + (headerDTO == null ? 0 : headerDTO.hashCode())) * 31;
        List<BalanceRowDTO> list = this.rows;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        BalanceDetailsBlockDTO balanceDetailsBlockDTO = this.refundDetailsBlock;
        int c11 = C2859b.c(this.button, (hashCode4 + (balanceDetailsBlockDTO == null ? 0 : balanceDetailsBlockDTO.hashCode())) * 31, 31);
        TextDTO textDTO2 = this.description;
        return c11 + (textDTO2 != null ? textDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        TextDTO textDTO = this.title;
        HeaderDTO headerDTO = this.header;
        List<BalanceRowDTO> list = this.rows;
        BalanceDetailsBlockDTO balanceDetailsBlockDTO = this.refundDetailsBlock;
        ButtonV3DTO buttonV3DTO = this.button;
        TextDTO textDTO2 = this.description;
        StringBuilder b11 = a.b("TotalDTO(backgroundColor=", textDTO, str, ", title=", ", header=");
        b11.append(headerDTO);
        b11.append(", rows=");
        b11.append(list);
        b11.append(", refundDetailsBlock=");
        b11.append(balanceDetailsBlockDTO);
        b11.append(", button=");
        b11.append(buttonV3DTO);
        b11.append(", description=");
        return b.e(b11, textDTO2, ")");
    }
}
