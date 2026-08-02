package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay;

import V.e;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayAddCardRequest;", "", "bankId", "", "encryptedData", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBankId", "()Ljava/lang/String;", "getEncryptedData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MirPayAddCardRequest {

    @NotNull
    private final String bankId;

    @NotNull
    private final String encryptedData;

    public MirPayAddCardRequest(@i(name = "bank_id") @NotNull String bankId, @i(name = "encrypted_card_data") @NotNull String encryptedData) {
        Intrinsics.checkNotNullParameter(bankId, "bankId");
        Intrinsics.checkNotNullParameter(encryptedData, "encryptedData");
        this.bankId = bankId;
        this.encryptedData = encryptedData;
    }

    public static /* synthetic */ MirPayAddCardRequest copy$default(MirPayAddCardRequest mirPayAddCardRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mirPayAddCardRequest.bankId;
        }
        if ((i11 & 2) != 0) {
            str2 = mirPayAddCardRequest.encryptedData;
        }
        return mirPayAddCardRequest.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBankId() {
        return this.bankId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEncryptedData() {
        return this.encryptedData;
    }

    @NotNull
    public final MirPayAddCardRequest copy(@i(name = "bank_id") @NotNull String bankId, @i(name = "encrypted_card_data") @NotNull String encryptedData) {
        Intrinsics.checkNotNullParameter(bankId, "bankId");
        Intrinsics.checkNotNullParameter(encryptedData, "encryptedData");
        return new MirPayAddCardRequest(bankId, encryptedData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MirPayAddCardRequest)) {
            return false;
        }
        MirPayAddCardRequest mirPayAddCardRequest = (MirPayAddCardRequest) other;
        return Intrinsics.d(this.bankId, mirPayAddCardRequest.bankId) && Intrinsics.d(this.encryptedData, mirPayAddCardRequest.encryptedData);
    }

    @NotNull
    public final String getBankId() {
        return this.bankId;
    }

    @NotNull
    public final String getEncryptedData() {
        return this.encryptedData;
    }

    public int hashCode() {
        return this.encryptedData.hashCode() + (this.bankId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("MirPayAddCardRequest(bankId=", this.bankId, ", encryptedData=", this.encryptedData, ")");
    }
}
