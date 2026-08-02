package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.di;

import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.api.WannaDiscountV2Api;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/di/WannaDiscountModule;", "", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class WannaDiscountModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/di/WannaDiscountModule$Companion;", "", "<init>", "()V", "provideWannaDiscountApi", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Api;", "retrofit", "Lretrofit2/Retrofit;", "provideWannaDiscountApi$marketing_prodGoogleAllVendorsRelease", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WannaDiscountV2Api provideWannaDiscountApi$marketing_prodGoogleAllVendorsRelease(@NotNull Retrofit retrofit) {
            return (WannaDiscountV2Api) C4598rp.b(retrofit, "retrofit", WannaDiscountV2Api.class, "create(...)");
        }

        private Companion() {
        }
    }
}
