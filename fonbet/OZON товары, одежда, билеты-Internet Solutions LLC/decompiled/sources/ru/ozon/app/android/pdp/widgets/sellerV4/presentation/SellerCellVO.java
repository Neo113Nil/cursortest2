package ru.ozon.app.android.pdp.widgets.sellerV4.presentation;

import B6.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerCellVO;", "", "Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;", "cell", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SellerCellVO {
    public static final int $stable = AtomAction.$stable | DisclosureIconTitleSubtitleCellDTO.$stable;
    private final AtomAction action;
    private final String backgroundColor;

    @NotNull
    private final DisclosureIconTitleSubtitleCellDTO cell;

    public SellerCellVO(@NotNull DisclosureIconTitleSubtitleCellDTO cell, String str, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.cell = cell;
        this.backgroundColor = str;
        this.action = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerCellVO)) {
            return false;
        }
        SellerCellVO sellerCellVO = (SellerCellVO) other;
        return Intrinsics.d(this.cell, sellerCellVO.cell) && Intrinsics.d(this.backgroundColor, sellerCellVO.backgroundColor) && Intrinsics.d(this.action, sellerCellVO.action);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleCellDTO getCell() {
        return this.cell;
    }

    public int hashCode() {
        int hashCode = this.cell.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        DisclosureIconTitleSubtitleCellDTO disclosureIconTitleSubtitleCellDTO = this.cell;
        String str = this.backgroundColor;
        AtomAction atomAction = this.action;
        StringBuilder sb2 = new StringBuilder("SellerCellVO(cell=");
        sb2.append(disclosureIconTitleSubtitleCellDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", action=");
        return b.b(sb2, atomAction, ")");
    }
}
