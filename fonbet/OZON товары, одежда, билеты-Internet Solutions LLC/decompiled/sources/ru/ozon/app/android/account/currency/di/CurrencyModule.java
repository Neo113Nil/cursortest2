package ru.ozon.app.android.account.currency.di;

import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.account.currency.api.CurrencyApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/account/currency/di/CurrencyModule;", "", "Companion", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CurrencyModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/account/currency/di/CurrencyModule$Companion;", "", "<init>", "()V", "provideCurrencyApi", "Lru/ozon/app/android/account/currency/api/CurrencyApi;", "retrofit", "Lretrofit2/Retrofit;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CurrencyApi provideCurrencyApi(@NotNull Retrofit retrofit) {
            return (CurrencyApi) C4598rp.b(retrofit, "retrofit", CurrencyApi.class, "create(...)");
        }

        private Companion() {
        }
    }
}
