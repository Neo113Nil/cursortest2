package ru.ozon.app.android.checkoutcomposer.common.cardbinding.data;

import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/cardbinding/data/CardBindingApiDataSource;", "", "", "actionName", "Lio/reactivex/y;", "Lru/ozon/app/android/checkoutcomposer/common/cardbinding/data/CardBindingResponseDTO;", "createCardBinding", "(Ljava/lang/String;)Lio/reactivex/y;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CardBindingApiDataSource {
    @POST("composer-api.bx/_action/{actionName}")
    @NotNull
    y<CardBindingResponseDTO> createCardBinding(@Path("actionName") @NotNull String actionName);
}
