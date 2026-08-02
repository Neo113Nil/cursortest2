package ru.ozon.app.android.account.locale.network.di.module;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.account.locale.network.api.LocaleApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/account/locale/network/di/module/NetworkLocaleModule;", "", "Companion", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class NetworkLocaleModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/account/locale/network/di/module/NetworkLocaleModule$Companion;", "", "<init>", "()V", "provideLocaleApi", "Lru/ozon/app/android/account/locale/network/api/LocaleApi;", "retrofit", "Lretrofit2/Retrofit;", "provideLocaleApi$account_prodGoogleAllVendorsRelease", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LocaleApi provideLocaleApi$account_prodGoogleAllVendorsRelease(@NotNull Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            return (LocaleApi) retrofit.create(LocaleApi.class);
        }

        private Companion() {
        }
    }
}
