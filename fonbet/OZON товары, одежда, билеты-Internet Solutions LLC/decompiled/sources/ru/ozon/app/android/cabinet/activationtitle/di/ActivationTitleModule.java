package ru.ozon.app.android.cabinet.activationtitle.di;

import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.cabinet.activationtitle.ActivationTitleConfig;
import ru.ozon.app.android.cabinet.activationtitle.ActivationTitleViewMapper;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeApi;
import ru.ozon.app.android.composer.di.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/cabinet/activationtitle/di/ActivationTitleModule;", "", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ActivationTitleModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cabinet/activationtitle/di/ActivationTitleModule$Companion;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/di/Widget;", "activationTitleConfig", "Lru/ozon/app/android/cabinet/activationtitle/ActivationTitleConfig;", "activationTitleViewMapper", "Lru/ozon/app/android/cabinet/activationtitle/ActivationTitleViewMapper;", "provideDiscountCodeApi", "Lru/ozon/app/android/cabinet/activationtitle/data/DiscountCodeApi;", "retrofit", "Lretrofit2/Retrofit;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DiscountCodeApi provideDiscountCodeApi(@NotNull Retrofit retrofit) {
            return (DiscountCodeApi) C4598rp.b(retrofit, "retrofit", DiscountCodeApi.class, "create(...)");
        }

        @NotNull
        public final Widget provideWidget(@NotNull ActivationTitleConfig activationTitleConfig, @NotNull ActivationTitleViewMapper activationTitleViewMapper) {
            Intrinsics.checkNotNullParameter(activationTitleConfig, "activationTitleConfig");
            Intrinsics.checkNotNullParameter(activationTitleViewMapper, "activationTitleViewMapper");
            return new Widget("csma", "activationTitle", activationTitleConfig, new ActivationTitleViewMapper[]{activationTitleViewMapper});
        }

        private Companion() {
        }
    }
}
