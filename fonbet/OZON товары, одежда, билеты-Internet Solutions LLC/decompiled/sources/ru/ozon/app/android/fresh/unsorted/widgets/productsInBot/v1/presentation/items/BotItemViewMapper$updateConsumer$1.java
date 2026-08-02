package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.items;

import A00.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.ProductsInBotQuantityUpdate;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemVO;)Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class BotItemViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, BotItemVO, BotItemVO> {
    public static final BotItemViewMapper$updateConsumer$1 INSTANCE = new BotItemViewMapper$updateConsumer$1();

    BotItemViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final BotItemVO invoke(a.J.InterfaceC0007a update, BotItemVO oldVO) {
        BotItemVO copy;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if (!(update instanceof ProductsInBotQuantityUpdate)) {
            return null;
        }
        ProductsInBotQuantityUpdate productsInBotQuantityUpdate = (ProductsInBotQuantityUpdate) update;
        if (oldVO.getSkuId() != productsInBotQuantityUpdate.getSkuId()) {
            return null;
        }
        copy = oldVO.copy((r27 & 1) != 0 ? oldVO.id : 0L, (r27 & 2) != 0 ? oldVO.price : null, (r27 & 4) != 0 ? oldVO.title : null, (r27 & 8) != 0 ? oldVO.image : null, (r27 & 16) != 0 ? oldVO.maxQuantity : 0, (r27 & 32) != 0 ? oldVO.currentQuantity : productsInBotQuantityUpdate.getQty(), (r27 & 64) != 0 ? oldVO.isSelected : productsInBotQuantityUpdate.getIsSelected(), (r27 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldVO.skuId : 0L, (r27 & 256) != 0 ? oldVO.aspects : null, (r27 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldVO.minusButton : null, (r27 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldVO.plusButton : null);
        return copy;
    }
}
