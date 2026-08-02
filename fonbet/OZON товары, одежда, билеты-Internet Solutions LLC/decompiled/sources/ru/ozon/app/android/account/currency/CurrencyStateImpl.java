package ru.ozon.app.android.account.currency;

import Nc.C3667a;
import com.appsflyer.AppsFlyerProperties;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00050\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/account/currency/CurrencyStateImpl;", "Lru/ozon/app/android/account/currency/CurrencyState;", "<init>", "()V", "Lio/reactivex/p;", "", "observeCurrencyCode", "()Lio/reactivex/p;", "code", "", "changeCurrencyCode", "(Ljava/lang/String;)V", "getCurrencyCode", "()Ljava/lang/String;", "LNc/a;", "kotlin.jvm.PlatformType", AppsFlyerProperties.CURRENCY_CODE, "LNc/a;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurrencyStateImpl implements CurrencyState {

    @NotNull
    private final C3667a<String> currencyCode;

    public CurrencyStateImpl() {
        C3667a<String> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.currencyCode = d11;
    }

    @Override // ru.ozon.app.android.account.currency.CurrencyState
    public void changeCurrencyCode(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.currencyCode.onNext(code);
    }

    @Override // ru.ozon.app.android.account.currency.CurrencyState
    public String getCurrencyCode() {
        return this.currencyCode.f();
    }

    @Override // ru.ozon.app.android.account.currency.CurrencyState
    @NotNull
    public p<String> observeCurrencyCode() {
        return this.currencyCode;
    }
}
