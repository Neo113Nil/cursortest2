package ru.ozon.app.android.pdp.ui.configurators.addToComparision;

import A00.a;
import Bi.b;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/addToComparision/AddToComparisonUpdateKey;", "LA00/a$J$a;", "", "skuId", "", "isInComparison", "wasListDeleted", "<init>", "(JZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getSkuId", "()J", "Z", "()Z", "getWasListDeleted", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AddToComparisonUpdateKey implements a.J.InterfaceC0007a {
    private final boolean isInComparison;
    private final long skuId;
    private final boolean wasListDeleted;

    public AddToComparisonUpdateKey(long j11, boolean z11, boolean z12) {
        this.skuId = j11;
        this.isInComparison = z11;
        this.wasListDeleted = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToComparisonUpdateKey)) {
            return false;
        }
        AddToComparisonUpdateKey addToComparisonUpdateKey = (AddToComparisonUpdateKey) other;
        return this.skuId == addToComparisonUpdateKey.skuId && this.isInComparison == addToComparisonUpdateKey.isInComparison && this.wasListDeleted == addToComparisonUpdateKey.wasListDeleted;
    }

    public final long getSkuId() {
        return this.skuId;
    }

    public final boolean getWasListDeleted() {
        return this.wasListDeleted;
    }

    public int hashCode() {
        return Boolean.hashCode(this.wasListDeleted) + C3532b.a(Long.hashCode(this.skuId) * 31, 31, this.isInComparison);
    }

    /* renamed from: isInComparison, reason: from getter */
    public final boolean getIsInComparison() {
        return this.isInComparison;
    }

    @NotNull
    public String toString() {
        long j11 = this.skuId;
        boolean z11 = this.isInComparison;
        return b.f(Bl.b.c(j11, "AddToComparisonUpdateKey(skuId=", ", isInComparison=", z11), ", wasListDeleted=", this.wasListDeleted, ")");
    }

    public /* synthetic */ AddToComparisonUpdateKey(long j11, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, z11, (i11 & 4) != 0 ? false : z12);
    }
}
