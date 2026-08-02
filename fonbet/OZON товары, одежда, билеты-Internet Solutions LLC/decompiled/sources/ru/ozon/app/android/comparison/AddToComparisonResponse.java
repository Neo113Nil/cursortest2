package ru.ozon.app.android.comparison;

import Bl.b;
import Kk.C3532b;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/comparison/AddToComparisonResponse;", "", "sku", "", "isInCompare", "", "message", "", "deeplink", "<init>", "(JZLjava/lang/String;Ljava/lang/String;)V", "getSku", "()J", "()Z", "getMessage", "()Ljava/lang/String;", "getDeeplink", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "comparison_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AddToComparisonResponse {
    private final String deeplink;
    private final boolean isInCompare;
    private final String message;
    private final long sku;

    public AddToComparisonResponse(long j11, boolean z11, String str, String str2) {
        this.sku = j11;
        this.isInCompare = z11;
        this.message = str;
        this.deeplink = str2;
    }

    public static /* synthetic */ AddToComparisonResponse copy$default(AddToComparisonResponse addToComparisonResponse, long j11, boolean z11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = addToComparisonResponse.sku;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            z11 = addToComparisonResponse.isInCompare;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            str = addToComparisonResponse.message;
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            str2 = addToComparisonResponse.deeplink;
        }
        return addToComparisonResponse.copy(j12, z12, str3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSku() {
        return this.sku;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsInCompare() {
        return this.isInCompare;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final AddToComparisonResponse copy(long sku, boolean isInCompare, String message, String deeplink) {
        return new AddToComparisonResponse(sku, isInCompare, message, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToComparisonResponse)) {
            return false;
        }
        AddToComparisonResponse addToComparisonResponse = (AddToComparisonResponse) other;
        return this.sku == addToComparisonResponse.sku && this.isInCompare == addToComparisonResponse.isInCompare && Intrinsics.d(this.message, addToComparisonResponse.message) && Intrinsics.d(this.deeplink, addToComparisonResponse.deeplink);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getMessage() {
        return this.message;
    }

    public final long getSku() {
        return this.sku;
    }

    public int hashCode() {
        int a11 = C3532b.a(Long.hashCode(this.sku) * 31, 31, this.isInCompare);
        String str = this.message;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deeplink;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isInCompare() {
        return this.isInCompare;
    }

    @NotNull
    public String toString() {
        long j11 = this.sku;
        boolean z11 = this.isInCompare;
        String str = this.message;
        String str2 = this.deeplink;
        StringBuilder c11 = b.c(j11, "AddToComparisonResponse(sku=", ", isInCompare=", z11);
        a.h(c11, ", message=", str, ", deeplink=", str2);
        c11.append(")");
        return c11.toString();
    }
}
