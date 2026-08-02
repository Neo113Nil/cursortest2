package ru.ozon.app.android.orderdetails.orderactions.v1.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsWithPayloads;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action;", "", "<init>", "()V", "ShowLoader", "HideLoader", "Fail", "OpenCart", "OpenReasons", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action$Fail;", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action$HideLoader;", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action$OpenCart;", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action$OpenReasons;", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action$ShowLoader;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class Action {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action$Fail;", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action;", "<init>", "()V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Fail extends Action {

        @NotNull
        public static final Fail INSTANCE = new Fail();

        private Fail() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action$HideLoader;", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action;", "<init>", "()V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HideLoader extends Action {

        @NotNull
        public static final HideLoader INSTANCE = new HideLoader();

        private HideLoader() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action$OpenCart;", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action;", "<init>", "()V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OpenCart extends Action {

        @NotNull
        public static final OpenCart INSTANCE = new OpenCart();

        private OpenCart() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action$OpenReasons;", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action;", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;", "cancelReasons", "<init>", "(Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;", "getCancelReasons", "()Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OpenReasons extends Action {

        @NotNull
        private final CancelReasonsWithPayloads cancelReasons;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenReasons(@NotNull CancelReasonsWithPayloads cancelReasons) {
            super(null);
            Intrinsics.checkNotNullParameter(cancelReasons, "cancelReasons");
            this.cancelReasons = cancelReasons;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenReasons) && Intrinsics.d(this.cancelReasons, ((OpenReasons) other).cancelReasons);
        }

        @NotNull
        public final CancelReasonsWithPayloads getCancelReasons() {
            return this.cancelReasons;
        }

        public int hashCode() {
            return this.cancelReasons.hashCode();
        }

        @NotNull
        public String toString() {
            return "OpenReasons(cancelReasons=" + this.cancelReasons + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action$ShowLoader;", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/Action;", "<init>", "()V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowLoader extends Action {

        @NotNull
        public static final ShowLoader INSTANCE = new ShowLoader();

        private ShowLoader() {
            super(null);
        }
    }

    public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Action() {
    }
}
