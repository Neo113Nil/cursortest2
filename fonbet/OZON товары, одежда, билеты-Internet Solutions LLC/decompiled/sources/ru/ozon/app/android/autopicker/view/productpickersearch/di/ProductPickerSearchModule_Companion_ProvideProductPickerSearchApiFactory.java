package ru.ozon.app.android.autopicker.view.productpickersearch.di;

import Jb.e;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.ProductPickerSearchApi;

/* loaded from: classes11.dex */
public final class ProductPickerSearchModule_Companion_ProvideProductPickerSearchApiFactory implements e<ProductPickerSearchApi> {
    private final a<Retrofit> retrofitProvider;

    public ProductPickerSearchModule_Companion_ProvideProductPickerSearchApiFactory(a<Retrofit> aVar) {
        this.retrofitProvider = aVar;
    }

    public static ProductPickerSearchModule_Companion_ProvideProductPickerSearchApiFactory create(a<Retrofit> aVar) {
        return new ProductPickerSearchModule_Companion_ProvideProductPickerSearchApiFactory(aVar);
    }

    public static ProductPickerSearchApi provideProductPickerSearchApi(Retrofit retrofit) {
        ProductPickerSearchApi provideProductPickerSearchApi = ProductPickerSearchModule.INSTANCE.provideProductPickerSearchApi(retrofit);
        j.d(provideProductPickerSearchApi);
        return provideProductPickerSearchApi;
    }

    @Override // Pc.a
    public ProductPickerSearchApi get() {
        return provideProductPickerSearchApi(this.retrofitProvider.get());
    }
}
