package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay;

import Ef0.c;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayAvailableResult;", "", "isAvailable", "", "needUpdate", "<init>", "(ZZ)V", "()Z", "getNeedUpdate", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MirPayAvailableResult {
    private final boolean isAvailable;
    private final boolean needUpdate;

    public MirPayAvailableResult(@i(name = "mir_pay_available") boolean z11, @i(name = "should_update_mir_pay") boolean z12) {
        this.isAvailable = z11;
        this.needUpdate = z12;
    }

    public static /* synthetic */ MirPayAvailableResult copy$default(MirPayAvailableResult mirPayAvailableResult, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = mirPayAvailableResult.isAvailable;
        }
        if ((i11 & 2) != 0) {
            z12 = mirPayAvailableResult.needUpdate;
        }
        return mirPayAvailableResult.copy(z11, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getNeedUpdate() {
        return this.needUpdate;
    }

    @NotNull
    public final MirPayAvailableResult copy(@i(name = "mir_pay_available") boolean isAvailable, @i(name = "should_update_mir_pay") boolean needUpdate) {
        return new MirPayAvailableResult(isAvailable, needUpdate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MirPayAvailableResult)) {
            return false;
        }
        MirPayAvailableResult mirPayAvailableResult = (MirPayAvailableResult) other;
        return this.isAvailable == mirPayAvailableResult.isAvailable && this.needUpdate == mirPayAvailableResult.needUpdate;
    }

    public final boolean getNeedUpdate() {
        return this.needUpdate;
    }

    public int hashCode() {
        return Boolean.hashCode(this.needUpdate) + (Boolean.hashCode(this.isAvailable) * 31);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    @NotNull
    public String toString() {
        return c.c("MirPayAvailableResult(isAvailable=", ", needUpdate=", ")", this.isAvailable, this.needUpdate);
    }
}
