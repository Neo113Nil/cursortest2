package ru.ozon.app.android.payment.ui.fastPay.checkFastPay;

import De.C2859b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayEvent;", "", "<init>", "()V", "Error", "Action", "Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayEvent$Action;", "Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayEvent$Error;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CheckFastPayEvent {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayEvent$Action;", "Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayEvent;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action extends CheckFastPayEvent {

        @NotNull
        private final AtomActionDTO action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Action(@NotNull AtomActionDTO action) {
            super(null);
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Action) && Intrinsics.d(this.action, ((Action) other).action);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        @NotNull
        public String toString() {
            return C2859b.f("Action(action=", ")", this.action);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayEvent$Error;", "Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends CheckFastPayEvent {

        @NotNull
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 297569333;
        }

        @NotNull
        public String toString() {
            return "Error";
        }
    }

    public /* synthetic */ CheckFastPayEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CheckFastPayEvent() {
    }
}
