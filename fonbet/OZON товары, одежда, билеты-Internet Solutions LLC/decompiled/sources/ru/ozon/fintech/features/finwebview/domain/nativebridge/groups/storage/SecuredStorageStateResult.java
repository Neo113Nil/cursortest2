package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.storage;

import G.g;
import I0.C3173b;
import Kk.C3532b;
import Lh.a;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/storage/SecuredStorageStateResult;", "", "isFaceIdAvailable", "", "isFingerPrintAvailable", "tokenId", "", "tokenState", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getTokenId", "()Ljava/lang/String;", "getTokenState", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SecuredStorageStateResult {
    private final boolean isFaceIdAvailable;
    private final boolean isFingerPrintAvailable;

    @NotNull
    private final String tokenId;

    @NotNull
    private final String tokenState;

    public SecuredStorageStateResult(@i(name = "face_id") boolean z11, @i(name = "touch_id") boolean z12, @i(name = "token_id") @NotNull String tokenId, @i(name = "token_state") @NotNull String tokenState) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(tokenState, "tokenState");
        this.isFaceIdAvailable = z11;
        this.isFingerPrintAvailable = z12;
        this.tokenId = tokenId;
        this.tokenState = tokenState;
    }

    public static /* synthetic */ SecuredStorageStateResult copy$default(SecuredStorageStateResult securedStorageStateResult, boolean z11, boolean z12, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = securedStorageStateResult.isFaceIdAvailable;
        }
        if ((i11 & 2) != 0) {
            z12 = securedStorageStateResult.isFingerPrintAvailable;
        }
        if ((i11 & 4) != 0) {
            str = securedStorageStateResult.tokenId;
        }
        if ((i11 & 8) != 0) {
            str2 = securedStorageStateResult.tokenState;
        }
        return securedStorageStateResult.copy(z11, z12, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsFaceIdAvailable() {
        return this.isFaceIdAvailable;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFingerPrintAvailable() {
        return this.isFingerPrintAvailable;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTokenState() {
        return this.tokenState;
    }

    @NotNull
    public final SecuredStorageStateResult copy(@i(name = "face_id") boolean isFaceIdAvailable, @i(name = "touch_id") boolean isFingerPrintAvailable, @i(name = "token_id") @NotNull String tokenId, @i(name = "token_state") @NotNull String tokenState) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(tokenState, "tokenState");
        return new SecuredStorageStateResult(isFaceIdAvailable, isFingerPrintAvailable, tokenId, tokenState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecuredStorageStateResult)) {
            return false;
        }
        SecuredStorageStateResult securedStorageStateResult = (SecuredStorageStateResult) other;
        return this.isFaceIdAvailable == securedStorageStateResult.isFaceIdAvailable && this.isFingerPrintAvailable == securedStorageStateResult.isFingerPrintAvailable && Intrinsics.d(this.tokenId, securedStorageStateResult.tokenId) && Intrinsics.d(this.tokenState, securedStorageStateResult.tokenState);
    }

    @NotNull
    public final String getTokenId() {
        return this.tokenId;
    }

    @NotNull
    public final String getTokenState() {
        return this.tokenState;
    }

    public int hashCode() {
        return this.tokenState.hashCode() + g.a(C3532b.a(Boolean.hashCode(this.isFaceIdAvailable) * 31, 31, this.isFingerPrintAvailable), 31, this.tokenId);
    }

    public final boolean isFaceIdAvailable() {
        return this.isFaceIdAvailable;
    }

    public final boolean isFingerPrintAvailable() {
        return this.isFingerPrintAvailable;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isFaceIdAvailable;
        boolean z12 = this.isFingerPrintAvailable;
        return C3173b.c(a.d("SecuredStorageStateResult(isFaceIdAvailable=", ", isFingerPrintAvailable=", ", tokenId=", z11, z12), this.tokenId, ", tokenState=", this.tokenState, ")");
    }
}
