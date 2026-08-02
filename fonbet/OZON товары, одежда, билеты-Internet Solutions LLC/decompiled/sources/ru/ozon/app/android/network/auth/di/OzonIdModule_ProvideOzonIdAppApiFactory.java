package ru.ozon.app.android.network.auth.di;

import Jb.e;
import Jb.j;
import Ld0.c;
import Ob0.a;

/* loaded from: classes6.dex */
public final class OzonIdModule_ProvideOzonIdAppApiFactory implements e<a> {
    public static a provideOzonIdAppApi(c cVar) {
        a provideOzonIdAppApi = OzonIdModule.INSTANCE.provideOzonIdAppApi(cVar);
        j.d(provideOzonIdAppApi);
        return provideOzonIdAppApi;
    }
}
