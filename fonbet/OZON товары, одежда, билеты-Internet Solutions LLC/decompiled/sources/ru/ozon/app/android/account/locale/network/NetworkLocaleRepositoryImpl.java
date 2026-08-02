package ru.ozon.app.android.account.locale.network;

import He.b;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.locale.network.api.LocaleApi;
import ru.ozon.app.android.account.locale.network.model.SaveLocaleResponse;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/locale/network/NetworkLocaleRepositoryImpl;", "Lru/ozon/app/android/account/locale/network/NetworkLocaleRepository;", "Lru/ozon/app/android/account/locale/network/api/LocaleApi;", "localeApi", "<init>", "(Lru/ozon/app/android/account/locale/network/api/LocaleApi;)V", "", "languageCode", "Lru/ozon/app/android/account/locale/network/model/SaveLocaleResponse;", "saveLocale", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/account/locale/network/api/LocaleApi;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NetworkLocaleRepositoryImpl implements NetworkLocaleRepository {

    @NotNull
    private final LocaleApi localeApi;

    public NetworkLocaleRepositoryImpl(@NotNull LocaleApi localeApi) {
        Intrinsics.checkNotNullParameter(localeApi, "localeApi");
        this.localeApi = localeApi;
    }

    @Override // ru.ozon.app.android.account.locale.network.NetworkLocaleRepository
    public Object saveLocale(@NotNull String str, @NotNull d<? super SaveLocaleResponse> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new NetworkLocaleRepositoryImpl$saveLocale$2(str, this, null), dVar);
    }
}
