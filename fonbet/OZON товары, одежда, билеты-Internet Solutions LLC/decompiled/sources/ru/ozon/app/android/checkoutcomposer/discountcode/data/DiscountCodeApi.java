package ru.ozon.app.android.checkoutcomposer.discountcode.data;

import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeApi;", "", "", "actionName", "Lru/ozon/app/android/checkoutcomposer/discountcode/data/ValidateCodeBody;", "body", "Lio/reactivex/y;", "Lru/ozon/app/android/checkoutcomposer/discountcode/data/ValidateCodeResponse;", "validateCode", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/discountcode/data/ValidateCodeBody;)Lio/reactivex/y;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DiscountCodeApi {
    @POST("composer-api.bx/_action/{actionName}")
    @NotNull
    y<ValidateCodeResponse> validateCode(@Path("actionName") @NotNull String actionName, @Body @NotNull ValidateCodeBody body);
}
