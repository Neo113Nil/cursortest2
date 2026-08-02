package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import com.squareup.moshi.Moshi;
import java.util.Set;

/* loaded from: classes6.dex */
public final class NetworkModule_Companion_ProvideMoshiFactory implements e<Moshi> {
    public static Moshi provideMoshi(Set<Object> set) {
        Moshi provideMoshi = NetworkModule.INSTANCE.provideMoshi(set);
        j.d(provideMoshi);
        return provideMoshi;
    }
}
