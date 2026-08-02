package ru.ozon.app.android.checkoutgeo.payment.sberpay;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayPreferencesImpl;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayPreferences;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isWithRealBankApp", "()Z", "", "changeIsWithRealBankApp", "(Z)V", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "preferences$delegate", "LSc/j;", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences", "Companion", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SberPayPreferencesImpl implements SberPayPreferences {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* renamed from: preferences$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j preferences;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayPreferencesImpl$Companion;", "", "<init>", "()V", "SBER_PAY_PREFERENCES", "", "IS_WITH_REAL_BANK_APP", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SberPayPreferencesImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.preferences = k.b(new SberPayPreferencesImpl$preferences$2(context));
    }

    private final SharedPreferences getPreferences() {
        return (SharedPreferences) this.preferences.getValue();
    }

    @Override // ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayPreferences
    public void changeIsWithRealBankApp(boolean isWithRealBankApp) {
        getPreferences().edit().putBoolean("is_with_real_bank_app", isWithRealBankApp).apply();
    }

    @Override // ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayPreferences
    public boolean isWithRealBankApp() {
        return getPreferences().getBoolean("is_with_real_bank_app", false);
    }
}
