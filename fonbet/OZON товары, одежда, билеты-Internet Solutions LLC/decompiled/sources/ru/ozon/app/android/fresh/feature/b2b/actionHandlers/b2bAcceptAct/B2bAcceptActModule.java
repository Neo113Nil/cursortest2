package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct;

import Ve.C4598rp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.api.B2bAcceptActApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActModule;", "", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface B2bAcceptActModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActModule$Companion;", "", "<init>", "()V", "provideB2bAcceptActApi", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/api/B2bAcceptActApi;", "retrofit", "Lretrofit2/Retrofit;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final B2bAcceptActApi provideB2bAcceptActApi(@NotNull Retrofit retrofit) {
            return (B2bAcceptActApi) C4598rp.b(retrofit, "retrofit", B2bAcceptActApi.class, "create(...)");
        }
    }
}
