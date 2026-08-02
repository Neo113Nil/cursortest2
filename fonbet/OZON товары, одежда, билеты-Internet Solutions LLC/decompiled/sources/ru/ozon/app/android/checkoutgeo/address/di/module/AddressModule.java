package ru.ozon.app.android.checkoutgeo.address.di.module;

import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.ActionAddressBookBarGeoApi;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/di/module/AddressModule;", "", "Companion", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AddressModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/di/module/AddressModule$Companion;", "", "<init>", "()V", "provideAddressUiInfoApi", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoApi;", "retrofit", "Lretrofit2/Retrofit;", "provideActionAddressBookBarGeoApi", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/ActionAddressBookBarGeoApi;", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionAddressBookBarGeoApi provideActionAddressBookBarGeoApi(@NotNull Retrofit retrofit) {
            return (ActionAddressBookBarGeoApi) C4598rp.b(retrofit, "retrofit", ActionAddressBookBarGeoApi.class, "create(...)");
        }

        @NotNull
        public final AddressUiInfoApi provideAddressUiInfoApi(@NotNull Retrofit retrofit) {
            return (AddressUiInfoApi) C4598rp.b(retrofit, "retrofit", AddressUiInfoApi.class, "create(...)");
        }

        private Companion() {
        }
    }
}
