package ru.ozon.app.android.returns.ui.molecules.balance.mappers;

import Lh.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.balance.data.BalanceDetailsBlockDTO;
import ru.ozon.app.android.returns.ui.molecules.balance.data.BalanceRowDTO;
import ru.ozon.app.android.returns.ui.molecules.balance.data.BalanceRowItemDTO;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceDetailsBlock;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceRow;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceRowItem;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\f"}, d2 = {"toVO", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;", "Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowDTO;", "stateId", "", "position", "", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRowItem;", "Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO;", "toRowVO", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceDetailsBlock;", "Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceDetailsBlockDTO;", "returns_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BalanceMapperKt {
    @NotNull
    public static final BalanceRow toRowVO(@NotNull BalanceRowItemDTO balanceRowItemDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(balanceRowItemDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return new BalanceRow(stateId.hashCode(), new BalanceRowItem(balanceRowItemDTO.getText(), balanceRowItemDTO.getIcon(), balanceRowItemDTO.getIconPosition(), balanceRowItemDTO.getCommon()), null, 4, null);
    }

    @NotNull
    public static final BalanceRow toVO(@NotNull BalanceRowDTO balanceRowDTO, @NotNull String stateId, int i11) {
        Intrinsics.checkNotNullParameter(balanceRowDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return new BalanceRow(b.a(i11, stateId, "_"), toVO(balanceRowDTO.getLeftItem()), balanceRowDTO.getPrice());
    }

    @NotNull
    public static final BalanceRowItem toVO(@NotNull BalanceRowItemDTO balanceRowItemDTO) {
        Intrinsics.checkNotNullParameter(balanceRowItemDTO, "<this>");
        return new BalanceRowItem(balanceRowItemDTO.getText(), balanceRowItemDTO.getIcon(), balanceRowItemDTO.getIconPosition(), balanceRowItemDTO.getCommon());
    }

    @NotNull
    public static final BalanceDetailsBlock toVO(@NotNull BalanceDetailsBlockDTO balanceDetailsBlockDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(balanceDetailsBlockDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        String backgroundColor = balanceDetailsBlockDTO.getBackgroundColor();
        TextDTO title = balanceDetailsBlockDTO.getTitle();
        List<BalanceRowDTO> rows = balanceDetailsBlockDTO.getRows();
        ArrayList arrayList = new ArrayList(C7714v.z(rows, 10));
        int i11 = 0;
        for (Object obj : rows) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO((BalanceRowDTO) obj, stateId, i11));
            i11 = i12;
        }
        return new BalanceDetailsBlock(backgroundColor, title, arrayList);
    }
}
