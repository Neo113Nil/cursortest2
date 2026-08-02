package ru.ozon.app.android.returns.creation.widgets.total.presentation.viewObject;

import Ak.C2436a;
import De.C2859b;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceDetailsBlock;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceRow;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b2\u0010%¨\u00063"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/total/presentation/viewObject/TotalVO;", "Ll20/c;", "", "id", "", "backgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/returns/creation/widgets/total/presentation/viewObject/Header;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;", "rows", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceDetailsBlock;", "refundDetailsBlock", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "description", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/creation/widgets/total/presentation/viewObject/Header;Ljava/util/List;Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceDetailsBlock;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/returns/creation/widgets/total/presentation/viewObject/Header;", "getHeader", "()Lru/ozon/app/android/returns/creation/widgets/total/presentation/viewObject/Header;", "Ljava/util/List;", "getRows", "()Ljava/util/List;", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceDetailsBlock;", "getRefundDetailsBlock", "()Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceDetailsBlock;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getDescription", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TotalVO implements c {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final ButtonV3DTO button;
    private final TextDTO description;
    private final Header header;
    private final long id;
    private final BalanceDetailsBlock refundDetailsBlock;
    private final List<BalanceRow> rows;
    private final TextDTO title;

    public TotalVO(long j11, @NotNull String backgroundColor, TextDTO textDTO, Header header, List<BalanceRow> list, BalanceDetailsBlock balanceDetailsBlock, @NotNull ButtonV3DTO button, TextDTO textDTO2) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.backgroundColor = backgroundColor;
        this.title = textDTO;
        this.header = header;
        this.rows = list;
        this.refundDetailsBlock = balanceDetailsBlock;
        this.button = button;
        this.description = textDTO2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalVO)) {
            return false;
        }
        TotalVO totalVO = (TotalVO) other;
        return this.id == totalVO.id && Intrinsics.d(this.backgroundColor, totalVO.backgroundColor) && Intrinsics.d(this.title, totalVO.title) && Intrinsics.d(this.header, totalVO.header) && Intrinsics.d(this.rows, totalVO.rows) && Intrinsics.d(this.refundDetailsBlock, totalVO.refundDetailsBlock) && Intrinsics.d(this.button, totalVO.button) && Intrinsics.d(this.description, totalVO.description);
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

    public final Header getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final BalanceDetailsBlock getRefundDetailsBlock() {
        return this.refundDetailsBlock;
    }

    public final List<BalanceRow> getRows() {
        return this.rows;
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
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.backgroundColor);
        TextDTO textDTO = this.title;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Header header = this.header;
        int hashCode2 = (hashCode + (header == null ? 0 : header.hashCode())) * 31;
        List<BalanceRow> list = this.rows;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        BalanceDetailsBlock balanceDetailsBlock = this.refundDetailsBlock;
        int c11 = C2859b.c(this.button, (hashCode3 + (balanceDetailsBlock == null ? 0 : balanceDetailsBlock.hashCode())) * 31, 31);
        TextDTO textDTO2 = this.description;
        return c11 + (textDTO2 != null ? textDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundColor;
        TextDTO textDTO = this.title;
        Header header = this.header;
        List<BalanceRow> list = this.rows;
        BalanceDetailsBlock balanceDetailsBlock = this.refundDetailsBlock;
        ButtonV3DTO buttonV3DTO = this.button;
        TextDTO textDTO2 = this.description;
        StringBuilder c11 = C2436a.c(j11, "TotalVO(id=", ", backgroundColor=", str);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", header=");
        c11.append(header);
        c11.append(", rows=");
        c11.append(list);
        c11.append(", refundDetailsBlock=");
        c11.append(balanceDetailsBlock);
        c11.append(", button=");
        c11.append(buttonV3DTO);
        c11.append(", description=");
        c11.append(textDTO2);
        c11.append(")");
        return c11.toString();
    }
}
