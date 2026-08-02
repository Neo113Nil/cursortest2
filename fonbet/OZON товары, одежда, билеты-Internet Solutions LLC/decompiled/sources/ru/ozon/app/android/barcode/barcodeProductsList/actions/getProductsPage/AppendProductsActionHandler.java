package ru.ozon.app.android.barcode.barcodeProductsList.actions.getProductsPage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/actions/getProductsPage/AppendProductsActionHandler;", "Lru/ozon/app/android/barcode/barcodeProductsList/actions/getProductsPage/BaseGetProductsPageActionHandler;", "actionV2Repository", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "actionId", "", "getActionId", "()Ljava/lang/String;", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppendProductsActionHandler extends BaseGetProductsPageActionHandler {

    @NotNull
    private final String actionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppendProductsActionHandler(@NotNull ActionV2Repository actionV2Repository) {
        super(actionV2Repository);
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionId = ActionType.APPEND_PRODUCTS.getActionId();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }
}
