package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation;

import androidx.lifecycle.P;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.WannaDiscountV2DTO;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.model.WannaDiscountV2Action;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.model.WannaDiscountV2Result;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.vo.WannaDiscountV2VO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/WannaDiscountV2ViewModel;", "", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action;", "action", "", "sendUserAction", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action;)V", "", "priceStr", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;", "priceInput", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;", "priceBlock", "", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO$Discount;", "discounts", "checkPrice", "(Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;Ljava/util/List;)V", "", "userQuantity", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;", "quantityInput", "checkQuantity", "(Ljava/lang/Long;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;)V", "Landroidx/lifecycle/P;", "Ljava/util/concurrent/LinkedBlockingQueue;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result;", "getResultLiveData", "()Landroidx/lifecycle/P;", "resultLiveData", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface WannaDiscountV2ViewModel {
    void checkPrice(@NotNull String priceStr, @NotNull WannaDiscountV2DTO.PriceInputBlock priceInput, @NotNull WannaDiscountV2DTO.PriceBlock priceBlock, @NotNull List<WannaDiscountV2VO.Discount> discounts);

    void checkQuantity(Long userQuantity, @NotNull WannaDiscountV2DTO.QuantityInputBlock quantityInput);

    @NotNull
    P<LinkedBlockingQueue<WannaDiscountV2Result>> getResultLiveData();

    void sendUserAction(@NotNull WannaDiscountV2Action action);
}
