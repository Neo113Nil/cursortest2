package ru.ozon.app.android.account.currency;

import Mc.a;
import io.reactivex.AbstractC7094b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.account.currency.CurrencyRepositoryImpl;
import ru.ozon.app.android.account.currency.api.CurrencyApi;
import vc.C10301f;
import vc.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/account/currency/CurrencyRepositoryImpl;", "Lru/ozon/app/android/account/currency/CurrencyRepository;", "Lru/ozon/app/android/account/currency/api/CurrencyApi;", "currencyApi", "Lru/ozon/app/android/account/currency/CurrencyState;", "currencyState", "<init>", "(Lru/ozon/app/android/account/currency/api/CurrencyApi;Lru/ozon/app/android/account/currency/CurrencyState;)V", "", "link", "", "params", "Lio/reactivex/b;", "changeCurrency", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "Lru/ozon/app/android/account/currency/api/CurrencyApi;", "Lru/ozon/app/android/account/currency/CurrencyState;", "Companion", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurrencyRepositoryImpl implements CurrencyRepository {

    @NotNull
    private final CurrencyApi currencyApi;

    @NotNull
    private final CurrencyState currencyState;

    public CurrencyRepositoryImpl(@NotNull CurrencyApi currencyApi, @NotNull CurrencyState currencyState) {
        Intrinsics.checkNotNullParameter(currencyApi, "currencyApi");
        Intrinsics.checkNotNullParameter(currencyState, "currencyState");
        this.currencyApi = currencyApi;
        this.currencyState = currencyState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeCurrency$lambda$0(CurrencyRepositoryImpl currencyRepositoryImpl, String str) {
        currencyRepositoryImpl.currencyState.changeCurrencyCode(str);
    }

    @Override // ru.ozon.app.android.account.currency.CurrencyRepository
    @NotNull
    public AbstractC7094b changeCurrency(@NotNull String link, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(params, "params");
        final String str = params.get("currency_code");
        if (str == null) {
            C10301f h11 = AbstractC7094b.h(new IllegalArgumentException("currency_code param is missing"));
            Intrinsics.checkNotNullExpressionValue(h11, "error(...)");
            return h11;
        }
        p k11 = this.currencyApi.changeCurrency(link, params).d(new InterfaceC9019a() { // from class: dk.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                CurrencyRepositoryImpl.changeCurrency$lambda$0(CurrencyRepositoryImpl.this, str);
            }
        }).k(a.b());
        Intrinsics.checkNotNullExpressionValue(k11, "subscribeOn(...)");
        return k11;
    }
}
