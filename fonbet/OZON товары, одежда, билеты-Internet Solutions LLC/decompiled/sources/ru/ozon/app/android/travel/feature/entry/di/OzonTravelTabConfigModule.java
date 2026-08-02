package ru.ozon.app.android.travel.feature.entry.di;

import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.travel.feature.entry.network.OzonTravelTabConfigApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/di/OzonTravelTabConfigModule;", "", "Companion", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OzonTravelTabConfigModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/di/OzonTravelTabConfigModule$Companion;", "", "<init>", "()V", "provideTabConfigApi", "Lru/ozon/app/android/travel/feature/entry/network/OzonTravelTabConfigApi;", "retrofit", "Lretrofit2/Retrofit;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OzonTravelTabConfigApi provideTabConfigApi(@NotNull Retrofit retrofit) {
            return (OzonTravelTabConfigApi) C4598rp.b(retrofit, "retrofit", OzonTravelTabConfigApi.class, "create(...)");
        }

        private Companion() {
        }
    }
}
