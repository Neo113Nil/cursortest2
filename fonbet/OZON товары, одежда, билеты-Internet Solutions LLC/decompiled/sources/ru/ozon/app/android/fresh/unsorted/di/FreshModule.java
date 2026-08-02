package ru.ozon.app.android.fresh.unsorted.di;

import Ve.C4598rp;
import android.app.Application;
import bh0.InterfaceC5666b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.unsorted.liveActivity.FreshLiveActivityListener;
import ru.ozon.app.android.fresh.unsorted.liveActivity.LiveActivityNotificationProvider;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.data.RecShelfApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/di/FreshModule;", "", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class FreshModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/di/FreshModule$Companion;", "", "<init>", "()V", "Lretrofit2/Retrofit;", "retrofit", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/data/RecShelfApi;", "provideRecShelfApi", "(Lretrofit2/Retrofit;)Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/data/RecShelfApi;", "Landroid/app/Application;", "application", "Lru/ozon/app/android/fresh/unsorted/liveActivity/LiveActivityNotificationProvider;", "notificationProvider", "Lbh0/b;", "provideOrderStatusLiveActivityListener", "(Landroid/app/Application;Lru/ozon/app/android/fresh/unsorted/liveActivity/LiveActivityNotificationProvider;)Lbh0/b;", "provideClickLiveActivityListener", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC5666b provideClickLiveActivityListener(@NotNull Application application, @NotNull LiveActivityNotificationProvider notificationProvider) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(notificationProvider, "notificationProvider");
            return new FreshLiveActivityListener(application, notificationProvider, "ClickDeliveryLiveActivity", "key");
        }

        @NotNull
        public final InterfaceC5666b provideOrderStatusLiveActivityListener(@NotNull Application application, @NotNull LiveActivityNotificationProvider notificationProvider) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(notificationProvider, "notificationProvider");
            return new FreshLiveActivityListener(application, notificationProvider, "OrderStatusLiveActivity", "orderId");
        }

        @NotNull
        public final RecShelfApi provideRecShelfApi(@NotNull Retrofit retrofit) {
            return (RecShelfApi) C4598rp.b(retrofit, "retrofit", RecShelfApi.class, "create(...)");
        }

        private Companion() {
        }
    }
}
