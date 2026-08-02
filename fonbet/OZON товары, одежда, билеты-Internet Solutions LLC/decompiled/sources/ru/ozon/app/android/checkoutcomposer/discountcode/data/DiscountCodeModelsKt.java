package ru.ozon.app.android.checkoutcomposer.discountcode.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.Input;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeVO;", "Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeDTO;", "stateId", "", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DiscountCodeModelsKt {
    @NotNull
    public static final DiscountCodeVO toVO(@NotNull DiscountCodeDTO discountCodeDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(discountCodeDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return new DiscountCodeVO(stateId.hashCode(), new Input(null, discountCodeDTO.getInput().getHint(), discountCodeDTO.getInput().getText(), null, null, null, null, 121, null), new Button(discountCodeDTO.getButton().getTitle(), null, null, discountCodeDTO.getButton().getAction(), null, null, null, 118, null));
    }
}
