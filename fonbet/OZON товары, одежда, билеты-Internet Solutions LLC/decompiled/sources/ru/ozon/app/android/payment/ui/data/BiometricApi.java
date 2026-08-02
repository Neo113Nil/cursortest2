package ru.ozon.app.android.payment.ui.data;

import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/payment/ui/data/BiometricApi;", "", "Lru/ozon/app/android/payment/ui/data/CreateBiometricBody;", "CreateBiometricBody", "Lio/reactivex/b;", "createKey", "(Lru/ozon/app/android/payment/ui/data/CreateBiometricBody;)Lio/reactivex/b;", "Lru/ozon/app/android/payment/ui/data/DeleteBiometricBody;", "DeleteBiometricBody", "deleteKey", "(Lru/ozon/app/android/payment/ui/data/DeleteBiometricBody;)Lio/reactivex/b;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface BiometricApi {
    @POST("composer-api.bx/_action/touchId")
    @NotNull
    AbstractC7094b createKey(@Body @NotNull CreateBiometricBody CreateBiometricBody);

    @POST("composer-api.bx/_action/touchIdDelete")
    @NotNull
    AbstractC7094b deleteKey(@Body @NotNull DeleteBiometricBody DeleteBiometricBody);
}
