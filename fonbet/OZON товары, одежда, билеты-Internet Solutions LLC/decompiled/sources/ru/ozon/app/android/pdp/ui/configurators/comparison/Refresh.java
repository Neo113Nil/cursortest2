package ru.ozon.app.android.pdp.ui.configurators.comparison;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/comparison/Refresh;", "", "<init>", "()V", "ComparisonDiff", "Lru/ozon/app/android/pdp/ui/configurators/comparison/Refresh$ComparisonDiff;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class Refresh {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/comparison/Refresh$ComparisonDiff;", "Lru/ozon/app/android/pdp/ui/configurators/comparison/Refresh;", "", "sku", "", "isInComparison", "<init>", "(Ljava/lang/Long;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "Z", "()Z", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ComparisonDiff extends Refresh {
        private final boolean isInComparison;
        private final Long sku;

        public ComparisonDiff(Long l11, boolean z11) {
            super(null);
            this.sku = l11;
            this.isInComparison = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ComparisonDiff)) {
                return false;
            }
            ComparisonDiff comparisonDiff = (ComparisonDiff) other;
            return Intrinsics.d(this.sku, comparisonDiff.sku) && this.isInComparison == comparisonDiff.isInComparison;
        }

        public final Long getSku() {
            return this.sku;
        }

        public int hashCode() {
            Long l11 = this.sku;
            return Boolean.hashCode(this.isInComparison) + ((l11 == null ? 0 : l11.hashCode()) * 31);
        }

        /* renamed from: isInComparison, reason: from getter */
        public final boolean getIsInComparison() {
            return this.isInComparison;
        }

        @NotNull
        public String toString() {
            return "ComparisonDiff(sku=" + this.sku + ", isInComparison=" + this.isInComparison + ")";
        }
    }

    public /* synthetic */ Refresh(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Refresh() {
    }
}
