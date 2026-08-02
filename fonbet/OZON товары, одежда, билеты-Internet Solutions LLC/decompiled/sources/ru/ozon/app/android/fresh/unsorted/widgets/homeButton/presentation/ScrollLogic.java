package ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation;

import B90.C2618u;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/ScrollLogic;", "", "Default", "PDP", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/ScrollLogic$Default;", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/ScrollLogic$PDP;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ScrollLogic {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/ScrollLogic$Default;", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/ScrollLogic;", "", "isBelow", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Default implements ScrollLogic {
        private final boolean isBelow;

        public Default(boolean z11) {
            this.isBelow = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Default) && this.isBelow == ((Default) other).isBelow;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isBelow);
        }

        /* renamed from: isBelow, reason: from getter */
        public final boolean getIsBelow() {
            return this.isBelow;
        }

        @NotNull
        public String toString() {
            return C2618u.g("Default(isBelow=", ")", this.isBelow);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/ScrollLogic$PDP;", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/ScrollLogic;", "", "isBelow", "", "dy", "<init>", "(ZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "I", "getDy", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PDP implements ScrollLogic {
        private final int dy;
        private final boolean isBelow;

        public PDP(boolean z11, int i11) {
            this.isBelow = z11;
            this.dy = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PDP)) {
                return false;
            }
            PDP pdp = (PDP) other;
            return this.isBelow == pdp.isBelow && this.dy == pdp.dy;
        }

        public final int getDy() {
            return this.dy;
        }

        public int hashCode() {
            return Integer.hashCode(this.dy) + (Boolean.hashCode(this.isBelow) * 31);
        }

        /* renamed from: isBelow, reason: from getter */
        public final boolean getIsBelow() {
            return this.isBelow;
        }

        @NotNull
        public String toString() {
            return "PDP(isBelow=" + this.isBelow + ", dy=" + this.dy + ")";
        }
    }
}
