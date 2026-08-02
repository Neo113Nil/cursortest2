package ru.ozon.app.android.travel.commonapi.di;

import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/travel/commonapi/di/TravelCommonApiModule;", "", "Companion", "commonapi_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class TravelCommonApiModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/commonapi/di/TravelCommonApiModule$Companion;", "", "<init>", "()V", "Lretrofit2/Retrofit;", "retrofit", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "provideTravelCommonActionResultApi", "(Lretrofit2/Retrofit;)Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "commonapi_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TravelCommonActionResultApi provideTravelCommonActionResultApi(@NotNull Retrofit retrofit) {
            return (TravelCommonActionResultApi) C4598rp.b(retrofit, "retrofit", TravelCommonActionResultApi.class, "create(...)");
        }

        private Companion() {
        }
    }
}
