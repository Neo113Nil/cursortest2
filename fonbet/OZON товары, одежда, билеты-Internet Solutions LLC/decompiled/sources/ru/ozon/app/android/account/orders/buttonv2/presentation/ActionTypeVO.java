package ru.ozon.app.android.account.orders.buttonv2.presentation;

import B0.A0;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionTypeVO;", "", "<init>", "()V", "MoveAction", "ComposerAction", "Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionTypeVO$ComposerAction;", "Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionTypeVO$MoveAction;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ActionTypeVO {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionTypeVO$ComposerAction;", "Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionTypeVO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getParams", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ComposerAction extends ActionTypeVO {

        @NotNull
        private final String name;
        private final String params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComposerAction(@NotNull String name, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.params = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ComposerAction)) {
                return false;
            }
            ComposerAction composerAction = (ComposerAction) other;
            return Intrinsics.d(this.name, composerAction.name) && Intrinsics.d(this.params, composerAction.params);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final String getParams() {
            return this.params;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.params;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("ComposerAction(name=", this.name, ", params=", this.params, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionTypeVO$MoveAction;", "Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionTypeVO;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MoveAction extends ActionTypeVO {

        @NotNull
        private final String deeplink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoveAction(@NotNull String deeplink) {
            super(null);
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MoveAction) && Intrinsics.d(this.deeplink, ((MoveAction) other).deeplink);
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
            return A0.b("MoveAction(deeplink=", this.deeplink, ")");
        }
    }

    public /* synthetic */ ActionTypeVO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ActionTypeVO() {
    }
}
