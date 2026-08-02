package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay;

import C.o0;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import androidx.annotation.Keep;
import c8.C5766e;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayCardStatus;", "", "referenceId", "", "mirCardStatus", "canAdded", "", "maskedPan", "expiryDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getReferenceId", "()Ljava/lang/String;", "getMirCardStatus", "getCanAdded", "()Z", "getMaskedPan", "getExpiryDate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MirPayCardStatus {
    private final boolean canAdded;

    @NotNull
    private final String expiryDate;

    @NotNull
    private final String maskedPan;

    @NotNull
    private final String mirCardStatus;

    @NotNull
    private final String referenceId;

    public MirPayCardStatus(@i(name = "reference_id") @NotNull String referenceId, @i(name = "state") @NotNull String mirCardStatus, @i(name = "can_add") boolean z11, @i(name = "masked_pan") @NotNull String maskedPan, @i(name = "expiry_date") @NotNull String expiryDate) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(mirCardStatus, "mirCardStatus");
        Intrinsics.checkNotNullParameter(maskedPan, "maskedPan");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        this.referenceId = referenceId;
        this.mirCardStatus = mirCardStatus;
        this.canAdded = z11;
        this.maskedPan = maskedPan;
        this.expiryDate = expiryDate;
    }

    public static /* synthetic */ MirPayCardStatus copy$default(MirPayCardStatus mirPayCardStatus, String str, String str2, boolean z11, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mirPayCardStatus.referenceId;
        }
        if ((i11 & 2) != 0) {
            str2 = mirPayCardStatus.mirCardStatus;
        }
        if ((i11 & 4) != 0) {
            z11 = mirPayCardStatus.canAdded;
        }
        if ((i11 & 8) != 0) {
            str3 = mirPayCardStatus.maskedPan;
        }
        if ((i11 & 16) != 0) {
            str4 = mirPayCardStatus.expiryDate;
        }
        String str5 = str4;
        boolean z12 = z11;
        return mirPayCardStatus.copy(str, str2, z12, str3, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMirCardStatus() {
        return this.mirCardStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCanAdded() {
        return this.canAdded;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getMaskedPan() {
        return this.maskedPan;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    @NotNull
    public final MirPayCardStatus copy(@i(name = "reference_id") @NotNull String referenceId, @i(name = "state") @NotNull String mirCardStatus, @i(name = "can_add") boolean canAdded, @i(name = "masked_pan") @NotNull String maskedPan, @i(name = "expiry_date") @NotNull String expiryDate) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(mirCardStatus, "mirCardStatus");
        Intrinsics.checkNotNullParameter(maskedPan, "maskedPan");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        return new MirPayCardStatus(referenceId, mirCardStatus, canAdded, maskedPan, expiryDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MirPayCardStatus)) {
            return false;
        }
        MirPayCardStatus mirPayCardStatus = (MirPayCardStatus) other;
        return Intrinsics.d(this.referenceId, mirPayCardStatus.referenceId) && Intrinsics.d(this.mirCardStatus, mirPayCardStatus.mirCardStatus) && this.canAdded == mirPayCardStatus.canAdded && Intrinsics.d(this.maskedPan, mirPayCardStatus.maskedPan) && Intrinsics.d(this.expiryDate, mirPayCardStatus.expiryDate);
    }

    public final boolean getCanAdded() {
        return this.canAdded;
    }

    @NotNull
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    @NotNull
    public final String getMaskedPan() {
        return this.maskedPan;
    }

    @NotNull
    public final String getMirCardStatus() {
        return this.mirCardStatus;
    }

    @NotNull
    public final String getReferenceId() {
        return this.referenceId;
    }

    public int hashCode() {
        return this.expiryDate.hashCode() + g.a(C3532b.a(g.a(this.referenceId.hashCode() * 31, 31, this.mirCardStatus), 31, this.canAdded), 31, this.maskedPan);
    }

    @NotNull
    public String toString() {
        String str = this.referenceId;
        String str2 = this.mirCardStatus;
        boolean z11 = this.canAdded;
        String str3 = this.maskedPan;
        String str4 = this.expiryDate;
        StringBuilder d11 = C3660k.d("MirPayCardStatus(referenceId=", str, ", mirCardStatus=", str2, ", canAdded=");
        C5766e.a(", maskedPan=", str3, ", expiryDate=", d11, z11);
        return o0.c(d11, str4, ")");
    }
}
