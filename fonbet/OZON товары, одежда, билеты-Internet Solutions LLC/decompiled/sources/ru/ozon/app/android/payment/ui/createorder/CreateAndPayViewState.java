package ru.ozon.app.android.payment.ui.createorder;

import i10.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "", "HideLoading", "ShowLoading", "HighLoadProgressBar", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState$HideLoading;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState$HighLoadProgressBar;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState$ShowLoading;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CreateAndPayViewState {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState$HideLoading;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "<init>", "()V", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HideLoading implements CreateAndPayViewState {

        @NotNull
        public static final HideLoading INSTANCE = new HideLoading();

        private HideLoading() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState$HighLoadProgressBar;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "Show", "Hide", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState$HighLoadProgressBar$Hide;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState$HighLoadProgressBar$Show;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface HighLoadProgressBar extends CreateAndPayViewState {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState$HighLoadProgressBar$Hide;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState$HighLoadProgressBar;", "<init>", "()V", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Hide implements HighLoadProgressBar {

            @NotNull
            public static final Hide INSTANCE = new Hide();

            private Hide() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState$HighLoadProgressBar$Show;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState$HighLoadProgressBar;", "<init>", "()V", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Show implements HighLoadProgressBar {

            @NotNull
            public static final Show INSTANCE = new Show();

            private Show() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState$ShowLoading;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "Li10/l$a;", "type", "<init>", "(Li10/l$a;)V", "Li10/l$a;", "getType", "()Li10/l$a;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowLoading implements CreateAndPayViewState {

        @NotNull
        private final l.a type;

        public ShowLoading(@NotNull l.a type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }

        @NotNull
        public final l.a getType() {
            return this.type;
        }
    }
}
