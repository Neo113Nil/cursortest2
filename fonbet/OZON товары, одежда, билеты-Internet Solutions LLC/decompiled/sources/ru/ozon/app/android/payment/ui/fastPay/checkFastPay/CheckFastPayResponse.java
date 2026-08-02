package ru.ozon.app.android.payment.ui.fastPay.checkFastPay;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayResponse;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "poolingDetails", "Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayResponse$PoolingDetails;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayResponse$PoolingDetails;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPoolingDetails", "()Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayResponse$PoolingDetails;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PoolingDetails", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CheckFastPayResponse {
    private final AtomActionDTO action;
    private final PoolingDetails poolingDetails;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayResponse$PoolingDetails;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "delay", "", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Long;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getDelay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Long;)Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayResponse$PoolingDetails;", "equals", "", "other", "hashCode", "", "toString", "", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PoolingDetails {
        private final AtomActionDTO action;
        private final Long delay;

        public PoolingDetails(AtomActionDTO atomActionDTO, Long l11) {
            this.action = atomActionDTO;
            this.delay = l11;
        }

        public static /* synthetic */ PoolingDetails copy$default(PoolingDetails poolingDetails, AtomActionDTO atomActionDTO, Long l11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = poolingDetails.action;
            }
            if ((i11 & 2) != 0) {
                l11 = poolingDetails.delay;
            }
            return poolingDetails.copy(atomActionDTO, l11);
        }

        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getDelay() {
            return this.delay;
        }

        @NotNull
        public final PoolingDetails copy(AtomActionDTO action, Long delay) {
            return new PoolingDetails(action, delay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PoolingDetails)) {
                return false;
            }
            PoolingDetails poolingDetails = (PoolingDetails) other;
            return Intrinsics.d(this.action, poolingDetails.action) && Intrinsics.d(this.delay, poolingDetails.delay);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Long getDelay() {
            return this.delay;
        }

        public int hashCode() {
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
            Long l11 = this.delay;
            return hashCode + (l11 != null ? l11.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PoolingDetails(action=" + this.action + ", delay=" + this.delay + ")";
        }
    }

    public CheckFastPayResponse(AtomActionDTO atomActionDTO, PoolingDetails poolingDetails) {
        this.action = atomActionDTO;
        this.poolingDetails = poolingDetails;
    }

    public static /* synthetic */ CheckFastPayResponse copy$default(CheckFastPayResponse checkFastPayResponse, AtomActionDTO atomActionDTO, PoolingDetails poolingDetails, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = checkFastPayResponse.action;
        }
        if ((i11 & 2) != 0) {
            poolingDetails = checkFastPayResponse.poolingDetails;
        }
        return checkFastPayResponse.copy(atomActionDTO, poolingDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final PoolingDetails getPoolingDetails() {
        return this.poolingDetails;
    }

    @NotNull
    public final CheckFastPayResponse copy(AtomActionDTO action, PoolingDetails poolingDetails) {
        return new CheckFastPayResponse(action, poolingDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckFastPayResponse)) {
            return false;
        }
        CheckFastPayResponse checkFastPayResponse = (CheckFastPayResponse) other;
        return Intrinsics.d(this.action, checkFastPayResponse.action) && Intrinsics.d(this.poolingDetails, checkFastPayResponse.poolingDetails);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final PoolingDetails getPoolingDetails() {
        return this.poolingDetails;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        PoolingDetails poolingDetails = this.poolingDetails;
        return hashCode + (poolingDetails != null ? poolingDetails.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CheckFastPayResponse(action=" + this.action + ", poolingDetails=" + this.poolingDetails + ")";
    }
}
