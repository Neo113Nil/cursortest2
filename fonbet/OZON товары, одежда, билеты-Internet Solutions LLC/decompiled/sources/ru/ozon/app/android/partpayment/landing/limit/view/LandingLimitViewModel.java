package ru.ozon.app.android.partpayment.landing.limit.view;

import B0.A0;
import androidx.lifecycle.P;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\u000e\u000fJ'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel;", "", "", ImagesContract.URL, AppMeasurementSdk.ConditionalUserProperty.NAME, "limitText", "", "sendLimit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$UiAction;", "getUiAction", "()Landroidx/lifecycle/P;", "uiAction", "NoUiAction", "UiAction", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface LandingLimitViewModel {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$NoUiAction;", "", "<init>", "()V", "ShowLoader", "HideLoader", "SendSuccess", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$NoUiAction$HideLoader;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$NoUiAction$SendSuccess;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$NoUiAction$ShowLoader;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class NoUiAction {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$NoUiAction$HideLoader;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$NoUiAction;", "<init>", "()V", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HideLoader extends NoUiAction {

            @NotNull
            public static final HideLoader INSTANCE = new HideLoader();

            private HideLoader() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$NoUiAction$SendSuccess;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$NoUiAction;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SendSuccess extends NoUiAction {

            @NotNull
            private final String deeplink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendSuccess(@NotNull String deeplink) {
                super(null);
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.deeplink = deeplink;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendSuccess) && Intrinsics.d(this.deeplink, ((SendSuccess) other).deeplink);
            }

            @NotNull
            public final String getDeeplink() {
                return this.deeplink;
            }

            public int hashCode() {
                return this.deeplink.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("SendSuccess(deeplink=", this.deeplink, ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$NoUiAction$ShowLoader;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$NoUiAction;", "<init>", "()V", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ShowLoader extends NoUiAction {

            @NotNull
            public static final ShowLoader INSTANCE = new ShowLoader();

            private ShowLoader() {
                super(null);
            }
        }

        public /* synthetic */ NoUiAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private NoUiAction() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$UiAction;", "", "<init>", "()V", "SendProblem", "WrongLimit", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$UiAction$SendProblem;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$UiAction$WrongLimit;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class UiAction {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$UiAction$SendProblem;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$UiAction;", "<init>", "()V", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SendProblem extends UiAction {

            @NotNull
            public static final SendProblem INSTANCE = new SendProblem();

            private SendProblem() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$UiAction$WrongLimit;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel$UiAction;", "", "error", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class WrongLimit extends UiAction {

            @NotNull
            private final String error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WrongLimit(@NotNull String error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WrongLimit) && Intrinsics.d(this.error, ((WrongLimit) other).error);
            }

            @NotNull
            public final String getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("WrongLimit(error=", this.error, ")");
            }
        }

        public /* synthetic */ UiAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UiAction() {
        }
    }

    @NotNull
    P<UiAction> getUiAction();

    void sendLimit(@NotNull String url, @NotNull String name, @NotNull String limitText);
}
