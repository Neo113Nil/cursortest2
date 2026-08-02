package ru.ozon.app.android.payment.feature.webpage;

import androidx.lifecycle.P;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/payment/feature/webpage/PaymentViewModel;", "", "", ImagesContract.URL, "", "init", "(Ljava/lang/String;)V", "", "onRedirectPage", "(Ljava/lang/String;)Z", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/payment/feature/webpage/PaymentViewModel$Action;", "getActions", "()Landroidx/lifecycle/P;", "actions", "Action", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PaymentViewModel {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/payment/feature/webpage/PaymentViewModel$Action;", "", "<init>", "()V", "LoadPage", "OpenDeeplink", "Lru/ozon/app/android/payment/feature/webpage/PaymentViewModel$Action$LoadPage;", "Lru/ozon/app/android/payment/feature/webpage/PaymentViewModel$Action$OpenDeeplink;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/payment/feature/webpage/PaymentViewModel$Action$LoadPage;", "Lru/ozon/app/android/payment/feature/webpage/PaymentViewModel$Action;", ImagesContract.URL, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class LoadPage extends Action {

            @NotNull
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadPage(@NotNull String url) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/payment/feature/webpage/PaymentViewModel$Action$OpenDeeplink;", "Lru/ozon/app/android/payment/feature/webpage/PaymentViewModel$Action;", "deeplink", "", "shouldFinish", "", "<init>", "(Ljava/lang/String;Z)V", "getDeeplink", "()Ljava/lang/String;", "getShouldFinish", "()Z", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class OpenDeeplink extends Action {

            @NotNull
            private final String deeplink;
            private final boolean shouldFinish;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenDeeplink(@NotNull String deeplink, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.deeplink = deeplink;
                this.shouldFinish = z11;
            }

            @NotNull
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final boolean getShouldFinish() {
                return this.shouldFinish;
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @NotNull
    P<Action> getActions();

    void init(@NotNull String url);

    boolean onRedirectPage(@NotNull String url);
}
