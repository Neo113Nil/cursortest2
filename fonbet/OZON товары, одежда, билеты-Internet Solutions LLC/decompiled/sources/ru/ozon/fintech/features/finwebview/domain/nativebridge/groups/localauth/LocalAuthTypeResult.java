package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.localauth;

import Ef0.c;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/localauth/LocalAuthTypeResult;", "", "isFaceIdAvailable", "", "isFingerPrintAvailable", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LocalAuthTypeResult {
    private final boolean isFaceIdAvailable;
    private final boolean isFingerPrintAvailable;

    public LocalAuthTypeResult(@i(name = "face_id") boolean z11, @i(name = "touch_id") boolean z12) {
        this.isFaceIdAvailable = z11;
        this.isFingerPrintAvailable = z12;
    }

    public static /* synthetic */ LocalAuthTypeResult copy$default(LocalAuthTypeResult localAuthTypeResult, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = localAuthTypeResult.isFaceIdAvailable;
        }
        if ((i11 & 2) != 0) {
            z12 = localAuthTypeResult.isFingerPrintAvailable;
        }
        return localAuthTypeResult.copy(z11, z12);
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
    public final LocalAuthTypeResult copy(@i(name = "face_id") boolean isFaceIdAvailable, @i(name = "touch_id") boolean isFingerPrintAvailable) {
        return new LocalAuthTypeResult(isFaceIdAvailable, isFingerPrintAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalAuthTypeResult)) {
            return false;
        }
        LocalAuthTypeResult localAuthTypeResult = (LocalAuthTypeResult) other;
        return this.isFaceIdAvailable == localAuthTypeResult.isFaceIdAvailable && this.isFingerPrintAvailable == localAuthTypeResult.isFingerPrintAvailable;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFingerPrintAvailable) + (Boolean.hashCode(this.isFaceIdAvailable) * 31);
    }

    public final boolean isFaceIdAvailable() {
        return this.isFaceIdAvailable;
    }

    public final boolean isFingerPrintAvailable() {
        return this.isFingerPrintAvailable;
    }

    @NotNull
    public String toString() {
        return c.c("LocalAuthTypeResult(isFaceIdAvailable=", ", isFingerPrintAvailable=", ")", this.isFaceIdAvailable, this.isFingerPrintAvailable);
    }
}
