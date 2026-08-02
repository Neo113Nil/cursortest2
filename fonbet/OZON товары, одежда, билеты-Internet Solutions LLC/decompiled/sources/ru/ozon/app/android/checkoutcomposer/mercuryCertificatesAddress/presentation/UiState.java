package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation;

import H3.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.vo.AddressesVO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState;", "", "<init>", "()V", "isLoading", "", "isError", "ErrorState", "LoadingState", "AddressesState", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState$AddressesState;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState$ErrorState;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState$LoadingState;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class UiState {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState$AddressesState;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState;", "", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/AddressesVO$AddressVO;", "addresses", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAddresses", "()Ljava/util/List;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddressesState extends UiState {
        private final List<AddressesVO.AddressVO> addresses;

        /* JADX WARN: Multi-variable type inference failed */
        public AddressesState() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddressesState) && Intrinsics.d(this.addresses, ((AddressesState) other).addresses);
        }

        public final List<AddressesVO.AddressVO> getAddresses() {
            return this.addresses;
        }

        public int hashCode() {
            List<AddressesVO.AddressVO> list = this.addresses;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("AddressesState(addresses=", ")", this.addresses);
        }

        public /* synthetic */ AddressesState(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : list);
        }

        public AddressesState(List<AddressesVO.AddressVO> list) {
            super(null);
            this.addresses = list;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState$ErrorState;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorState extends UiState {

        @NotNull
        public static final ErrorState INSTANCE = new ErrorState();

        private ErrorState() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ErrorState);
        }

        public int hashCode() {
            return -140410136;
        }

        @NotNull
        public String toString() {
            return "ErrorState";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState$LoadingState;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadingState extends UiState {

        @NotNull
        public static final LoadingState INSTANCE = new LoadingState();

        private LoadingState() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof LoadingState);
        }

        public int hashCode() {
            return 1259466868;
        }

        @NotNull
        public String toString() {
            return "LoadingState";
        }
    }

    public /* synthetic */ UiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isError() {
        return this instanceof ErrorState;
    }

    public final boolean isLoading() {
        return this instanceof LoadingState;
    }

    private UiState() {
    }
}
