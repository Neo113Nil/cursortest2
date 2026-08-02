package ru.ozon.app.android.returns.total.presentation.viewObject;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceDetailsBlock;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceRow;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/returns/total/presentation/viewObject/ReturnDetailsTotalVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "backgroundColor", "", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;", "rows", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceDetailsBlock;", "refundDetailsBlock", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(JLjava/lang/String;Ljava/util/List;Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceDetailsBlock;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "()Ljava/lang/String;", "Ljava/util/List;", "getRows", "()Ljava/util/List;", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceDetailsBlock;", "getRefundDetailsBlock", "()Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceDetailsBlock;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnDetailsTotalVO implements c {

    @NotNull
    private final String backgroundColor;
    private final CommonControlSettings common;
    private final long id;
    private final BalanceDetailsBlock refundDetailsBlock;

    @NotNull
    private final List<BalanceRow> rows;

    public ReturnDetailsTotalVO(long j11, @NotNull String backgroundColor, @NotNull List<BalanceRow> rows, BalanceDetailsBlock balanceDetailsBlock, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.id = j11;
        this.backgroundColor = backgroundColor;
        this.rows = rows;
        this.refundDetailsBlock = balanceDetailsBlock;
        this.common = commonControlSettings;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final BalanceDetailsBlock getRefundDetailsBlock() {
        return this.refundDetailsBlock;
    }

    @NotNull
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
}
