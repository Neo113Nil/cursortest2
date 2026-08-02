package ru.ozon.app.android.autopicker.view.productpickersearch.data;

import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchApi;", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerV1Body;", "body", "Lio/reactivex/y;", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchDTO;", "tirePickerAction", "(Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerV1Body;)Lio/reactivex/y;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ProductPickerSearchApi {
    @POST("composer-api.bx/_action/productPickerV1")
    @NotNull
    y<ProductPickerSearchDTO> tirePickerAction(@Body @NotNull ProductPickerV1Body body);
}
