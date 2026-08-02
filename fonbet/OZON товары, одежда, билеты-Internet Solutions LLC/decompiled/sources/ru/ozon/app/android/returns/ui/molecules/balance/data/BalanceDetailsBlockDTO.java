package ru.ozon.app.android.returns.ui.molecules.balance.data;

import B90.C2618u;
import Co.a;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceDetailsBlockDTO;", "", "backgroundColor", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "rows", "", "Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRows", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BalanceDetailsBlockDTO {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final List<BalanceRowDTO> rows;

    @NotNull
    private final TextDTO title;

    public BalanceDetailsBlockDTO(@NotNull String backgroundColor, @NotNull TextDTO title, @NotNull List<BalanceRowDTO> rows) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.backgroundColor = backgroundColor;
        this.title = title;
        this.rows = rows;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BalanceDetailsBlockDTO copy$default(BalanceDetailsBlockDTO balanceDetailsBlockDTO, String str, TextDTO textDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = balanceDetailsBlockDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            textDTO = balanceDetailsBlockDTO.title;
        }
        if ((i11 & 4) != 0) {
            list = balanceDetailsBlockDTO.rows;
        }
        return balanceDetailsBlockDTO.copy(str, textDTO, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<BalanceRowDTO> component3() {
        return this.rows;
    }

    @NotNull
    public final BalanceDetailsBlockDTO copy(@NotNull String backgroundColor, @NotNull TextDTO title, @NotNull List<BalanceRowDTO> rows) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new BalanceDetailsBlockDTO(backgroundColor, title, rows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceDetailsBlockDTO)) {
            return false;
        }
        BalanceDetailsBlockDTO balanceDetailsBlockDTO = (BalanceDetailsBlockDTO) other;
        return Intrinsics.d(this.backgroundColor, balanceDetailsBlockDTO.backgroundColor) && Intrinsics.d(this.title, balanceDetailsBlockDTO.title) && Intrinsics.d(this.rows, balanceDetailsBlockDTO.rows);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<BalanceRowDTO> getRows() {
        return this.rows;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.rows.hashCode() + b.a(this.title, this.backgroundColor.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        TextDTO textDTO = this.title;
        return C2618u.h(a.b("BalanceDetailsBlockDTO(backgroundColor=", textDTO, str, ", title=", ", rows="), this.rows, ")");
    }
}
