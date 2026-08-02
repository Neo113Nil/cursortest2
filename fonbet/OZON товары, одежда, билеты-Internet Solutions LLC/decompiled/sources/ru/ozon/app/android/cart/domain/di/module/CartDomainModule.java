package ru.ozon.app.android.cart.domain.di.module;

import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.domain.VersionCartState;
import ru.ozon.app.android.cart.domain.data.CartDomainApi;
import ru.ozon.app.android.cart.domain.local.LocalCartDataStorage;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/cart/domain/di/module/CartDomainModule;", "", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CartDomainModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cart/domain/di/module/CartDomainModule$Companion;", "", "<init>", "()V", "provideCartDomainApi", "Lru/ozon/app/android/cart/domain/data/CartDomainApi;", "retrofit", "Lretrofit2/Retrofit;", "provideLocalCartDataStorage", "Lru/ozon/app/android/cart/domain/local/LocalCartDataStorage;", "versionCartState", "Lru/ozon/app/android/cart/domain/VersionCartState;", "provideLocalFamilyCartDataStorage", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CartDomainApi provideCartDomainApi(@NotNull Retrofit retrofit) {
            return (CartDomainApi) C4598rp.b(retrofit, "retrofit", CartDomainApi.class, "create(...)");
        }

        @NotNull
        public final LocalCartDataStorage provideLocalCartDataStorage(@NotNull VersionCartState versionCartState) {
            Intrinsics.checkNotNullParameter(versionCartState, "versionCartState");
            return new LocalCartDataStorage(versionCartState, CartType.MAIN_CART);
        }

        @NotNull
        public final LocalCartDataStorage provideLocalFamilyCartDataStorage(@NotNull VersionCartState versionCartState) {
            Intrinsics.checkNotNullParameter(versionCartState, "versionCartState");
            return new LocalCartDataStorage(versionCartState, CartType.FAMILY_CART);
        }

        private Companion() {
        }
    }
}
