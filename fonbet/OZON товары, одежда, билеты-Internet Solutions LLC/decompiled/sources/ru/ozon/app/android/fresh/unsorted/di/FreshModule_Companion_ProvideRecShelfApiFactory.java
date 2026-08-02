package ru.ozon.app.android.fresh.unsorted.di;

import Jb.e;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.data.RecShelfApi;

/* loaded from: classes6.dex */
public final class FreshModule_Companion_ProvideRecShelfApiFactory implements e<RecShelfApi> {
    private final a<Retrofit> retrofitProvider;

    public FreshModule_Companion_ProvideRecShelfApiFactory(a<Retrofit> aVar) {
        this.retrofitProvider = aVar;
    }

    public static FreshModule_Companion_ProvideRecShelfApiFactory create(a<Retrofit> aVar) {
        return new FreshModule_Companion_ProvideRecShelfApiFactory(aVar);
    }

    public static RecShelfApi provideRecShelfApi(Retrofit retrofit) {
        RecShelfApi provideRecShelfApi = FreshModule.INSTANCE.provideRecShelfApi(retrofit);
        j.d(provideRecShelfApi);
        return provideRecShelfApi;
    }

    @Override // Pc.a
    public RecShelfApi get() {
        return provideRecShelfApi(this.retrofitProvider.get());
    }
}
