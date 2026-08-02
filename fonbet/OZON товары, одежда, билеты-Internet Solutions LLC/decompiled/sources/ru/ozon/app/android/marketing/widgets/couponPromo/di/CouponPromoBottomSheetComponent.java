package ru.ozon.app.android.marketing.widgets.couponPromo.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.coupon.di.CouponComponentApi;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.dialog.CouponPromoBottomSheetDialog;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/di/CouponPromoBottomSheetComponent;", "", "inject", "", "screen", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/dialog/CouponPromoBottomSheetDialog;", "Factory", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CouponPromoBottomSheetComponent {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/di/CouponPromoBottomSheetComponent$Factory;", "", "create", "Lru/ozon/app/android/marketing/widgets/couponPromo/di/CouponPromoBottomSheetComponent;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "couponComponentApi", "Lru/ozon/app/android/marketing/coupon/di/CouponComponentApi;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        CouponPromoBottomSheetComponent create(@NotNull StorageComponentApi storageComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull CouponComponentApi couponComponentApi);
    }

    void inject(@NotNull CouponPromoBottomSheetDialog screen);
}
