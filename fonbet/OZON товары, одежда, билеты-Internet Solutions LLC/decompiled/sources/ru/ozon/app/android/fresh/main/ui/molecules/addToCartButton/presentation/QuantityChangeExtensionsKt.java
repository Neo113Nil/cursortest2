package ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.data.AddToCartButtonDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\u0010\b\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¨\u0006\f"}, d2 = {"plusCount", "", "maxCount", "updateCartAction", "Lru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "quantSize", "(IILru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO$QuantityButton$UpdateCartAction;Ljava/lang/Integer;)I", "minusCount", "(ILru/ozon/app/android/fresh/main/ui/molecules/addToCartButton/data/AddToCartButtonDTO$QuantityButton$UpdateCartAction;Ljava/lang/Integer;)I", "plusQuant", "currentCount", "minusQuant", "widgets-main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class QuantityChangeExtensionsKt {
    public static final int minusCount(int i11, @NotNull AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction, Integer num) {
        Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
        return num != null ? minusQuant(i11, num.intValue()) : i11 - updateCartAction.getQuantity();
    }

    private static final int minusQuant(int i11, int i12) {
        int i13 = i11 % i12;
        if (i13 == 0 || i11 <= i12) {
            return (i13 != 0 || i11 <= i12) ? i11 - 1 : i11 - i12;
        }
        return (int) (i12 * ((float) Math.floor(i11 / r3)));
    }

    public static final int plusCount(int i11, int i12, @NotNull AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction, Integer num) {
        Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
        return num != null ? plusQuant(i11, num.intValue(), i12) : updateCartAction.getQuantity() + i11;
    }

    private static final int plusQuant(int i11, int i12, int i13) {
        if (i11 < i12) {
            return i11 + 1;
        }
        int i14 = i11 + i12;
        if (i14 >= i13) {
            return i13;
        }
        int i15 = i11 % i12;
        if (i15 == 0 || i11 <= i12) {
            return i15 == 0 ? i14 : i11 + 1;
        }
        return (int) (i12 * ((float) Math.ceil(i11 / r3)));
    }
}
