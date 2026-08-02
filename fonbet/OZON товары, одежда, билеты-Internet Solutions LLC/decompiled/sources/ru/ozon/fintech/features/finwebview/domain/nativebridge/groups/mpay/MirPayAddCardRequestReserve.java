package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay;

import G.g;
import I0.C3173b;
import N3.C3660k;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayAddCardRequestReserve;", "", "bankId", "", "referenceId", "pan", "expiryDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankId", "()Ljava/lang/String;", "getReferenceId", "getPan", "getExpiryDate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MirPayAddCardRequestReserve {

    @NotNull
    private final String bankId;
    private final String expiryDate;
    private final String pan;

    @NotNull
    private final String referenceId;

    public MirPayAddCardRequestReserve(@i(name = "bank_id") @NotNull String bankId, @i(name = "MirPayCardReferenceId") @NotNull String referenceId, @i(name = "maskedPan") String str, @i(name = "expiryDate") String str2) {
        Intrinsics.checkNotNullParameter(bankId, "bankId");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        this.bankId = bankId;
        this.referenceId = referenceId;
        this.pan = str;
        this.expiryDate = str2;
    }

    public static /* synthetic */ MirPayAddCardRequestReserve copy$default(MirPayAddCardRequestReserve mirPayAddCardRequestReserve, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mirPayAddCardRequestReserve.bankId;
        }
        if ((i11 & 2) != 0) {
            str2 = mirPayAddCardRequestReserve.referenceId;
        }
        if ((i11 & 4) != 0) {
            str3 = mirPayAddCardRequestReserve.pan;
        }
        if ((i11 & 8) != 0) {
            str4 = mirPayAddCardRequestReserve.expiryDate;
        }
        return mirPayAddCardRequestReserve.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBankId() {
        return this.bankId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPan() {
        return this.pan;
    }

    /* renamed from: component4, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    @NotNull
    public final MirPayAddCardRequestReserve copy(@i(name = "bank_id") @NotNull String bankId, @i(name = "MirPayCardReferenceId") @NotNull String referenceId, @i(name = "maskedPan") String pan, @i(name = "expiryDate") String expiryDate) {
        Intrinsics.checkNotNullParameter(bankId, "bankId");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        return new MirPayAddCardRequestReserve(bankId, referenceId, pan, expiryDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MirPayAddCardRequestReserve)) {
            return false;
        }
        MirPayAddCardRequestReserve mirPayAddCardRequestReserve = (MirPayAddCardRequestReserve) other;
        return Intrinsics.d(this.bankId, mirPayAddCardRequestReserve.bankId) && Intrinsics.d(this.referenceId, mirPayAddCardRequestReserve.referenceId) && Intrinsics.d(this.pan, mirPayAddCardRequestReserve.pan) && Intrinsics.d(this.expiryDate, mirPayAddCardRequestReserve.expiryDate);
    }

    @NotNull
    public final String getBankId() {
        return this.bankId;
    }

    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public final String getPan() {
        return this.pan;
    }

    @NotNull
    public final String getReferenceId() {
        return this.referenceId;
    }

    public int hashCode() {
        int a11 = g.a(this.bankId.hashCode() * 31, 31, this.referenceId);
        String str = this.pan;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expiryDate;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.bankId;
        String str2 = this.referenceId;
        return C3173b.c(C3660k.d("MirPayAddCardRequestReserve(bankId=", str, ", referenceId=", str2, ", pan="), this.pan, ", expiryDate=", this.expiryDate, ")");
    }
}
