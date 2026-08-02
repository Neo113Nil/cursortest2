package ru.ozon.app.android.returns.total.data.dto;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.balance.data.BalanceDetailsBlockDTO;
import ru.ozon.app.android.returns.ui.molecules.balance.data.BalanceRowDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/total/data/dto/ReturnDetailsTotalDto;", "", "backgroundColor", "", "rows", "", "Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowDTO;", "refundDetailsBlock", "Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceDetailsBlockDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceDetailsBlockDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getBackgroundColor", "()Ljava/lang/String;", "getRows", "()Ljava/util/List;", "getRefundDetailsBlock", "()Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceDetailsBlockDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnDetailsTotalDto {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;
    private final CommonControlSettings common;
    private final BalanceDetailsBlockDTO refundDetailsBlock;
    private final List<BalanceRowDTO> rows;

    public ReturnDetailsTotalDto(@NotNull String backgroundColor, List<BalanceRowDTO> list, BalanceDetailsBlockDTO balanceDetailsBlockDTO, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.backgroundColor = backgroundColor;
        this.rows = list;
        this.refundDetailsBlock = balanceDetailsBlockDTO;
        this.common = commonControlSettings;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final BalanceDetailsBlockDTO getRefundDetailsBlock() {
        return this.refundDetailsBlock;
    }

    public final List<BalanceRowDTO> getRows() {
        return this.rows;
    }
}
