package ru.ozon.app.android.composer.configurators;

import Lm0.a;
import com.appsflyer.AppsFlyerProperties;
import com.google.gson.internal.f;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.currency.CurrencyState;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/composer/configurators/RefreshByCurrencyConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "currencyState", "Lru/ozon/app/android/account/currency/CurrencyState;", "<init>", "(Lru/ozon/app/android/account/currency/CurrencyState;)V", AppsFlyerProperties.CURRENCY_CODE, "", "onComposerInitialized", "", "isChanged", "", "code", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshByCurrencyConfigurator extends ComposerScreenConfig.PageConfigurator {
    private String currencyCode;

    @NotNull
    private final CurrencyState currencyState;

    public RefreshByCurrencyConfigurator(@NotNull CurrencyState currencyState) {
        Intrinsics.checkNotNullParameter(currencyState, "currencyState");
        this.currencyState = currencyState;
        this.currencyCode = currencyState.getCurrencyCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isChanged(String code) {
        boolean z11 = !Intrinsics.d(code, this.currencyCode);
        this.currencyCode = code;
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onComposerInitialized$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        p<String> observeOn = this.currencyState.observeCurrencyCode().filter(new f(new RefreshByCurrencyConfigurator$onComposerInitialized$1(this))).observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        RxExtKt.observe$default(observeOn, getOwner(), new RefreshByCurrencyConfigurator$onComposerInitialized$2(this), new RefreshByCurrencyConfigurator$onComposerInitialized$3(a.f17149a), null, 8, null);
    }
}
