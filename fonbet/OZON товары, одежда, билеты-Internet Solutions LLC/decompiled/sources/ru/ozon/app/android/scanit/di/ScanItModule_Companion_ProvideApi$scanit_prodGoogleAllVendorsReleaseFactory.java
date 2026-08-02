package ru.ozon.app.android.scanit.di;

import Jb.e;
import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.scanit.scanit.ScanItApi;

/* loaded from: classes13.dex */
public final class ScanItModule_Companion_ProvideApi$scanit_prodGoogleAllVendorsReleaseFactory implements e<ScanItApi> {
    private final a<Retrofit> retrofitProvider;

    public ScanItModule_Companion_ProvideApi$scanit_prodGoogleAllVendorsReleaseFactory(a<Retrofit> aVar) {
        this.retrofitProvider = aVar;
    }

    public static ScanItModule_Companion_ProvideApi$scanit_prodGoogleAllVendorsReleaseFactory create(a<Retrofit> aVar) {
        return new ScanItModule_Companion_ProvideApi$scanit_prodGoogleAllVendorsReleaseFactory(aVar);
    }

    public static ScanItApi provideApi$scanit_prodGoogleAllVendorsRelease(Retrofit retrofit) {
        ScanItApi provideApi$scanit_prodGoogleAllVendorsRelease = ScanItModule.INSTANCE.provideApi$scanit_prodGoogleAllVendorsRelease(retrofit);
        j.d(provideApi$scanit_prodGoogleAllVendorsRelease);
        return provideApi$scanit_prodGoogleAllVendorsRelease;
    }

    @Override // Pc.a
    public ScanItApi get() {
        return provideApi$scanit_prodGoogleAllVendorsRelease(this.retrofitProvider.get());
    }
}
