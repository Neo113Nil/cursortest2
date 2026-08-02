package ru.ozon.app.android.comparison;

import Ak.C2436a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/comparison/RemoveFromComparisonResponse;", "", "sku", "", "deeplink", "", "<init>", "(JLjava/lang/String;)V", "getSku", "()J", "getDeeplink", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "comparison_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RemoveFromComparisonResponse {
    private final String deeplink;
    private final long sku;

    public RemoveFromComparisonResponse(long j11, String str) {
        this.sku = j11;
        this.deeplink = str;
    }

    public static /* synthetic */ RemoveFromComparisonResponse copy$default(RemoveFromComparisonResponse removeFromComparisonResponse, long j11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = removeFromComparisonResponse.sku;
        }
        if ((i11 & 2) != 0) {
            str = removeFromComparisonResponse.deeplink;
        }
        return removeFromComparisonResponse.copy(j11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSku() {
        return this.sku;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final RemoveFromComparisonResponse copy(long sku, String deeplink) {
        return new RemoveFromComparisonResponse(sku, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoveFromComparisonResponse)) {
            return false;
        }
        RemoveFromComparisonResponse removeFromComparisonResponse = (RemoveFromComparisonResponse) other;
        return this.sku == removeFromComparisonResponse.sku && Intrinsics.d(this.deeplink, removeFromComparisonResponse.deeplink);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final long getSku() {
        return this.sku;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.sku) * 31;
        String str = this.deeplink;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder c11 = C2436a.c(this.sku, "RemoveFromComparisonResponse(sku=", ", deeplink=", this.deeplink);
        c11.append(")");
        return c11.toString();
    }
}
