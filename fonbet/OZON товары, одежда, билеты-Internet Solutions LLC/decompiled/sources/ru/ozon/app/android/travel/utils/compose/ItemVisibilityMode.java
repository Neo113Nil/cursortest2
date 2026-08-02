package ru.ozon.app.android.travel.utils.compose;

import T7.E;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/utils/compose/ItemVisibilityMode;", "", "OnePixel", "FullyVisible", "Percent", "Lru/ozon/app/android/travel/utils/compose/ItemVisibilityMode$FullyVisible;", "Lru/ozon/app/android/travel/utils/compose/ItemVisibilityMode$OnePixel;", "Lru/ozon/app/android/travel/utils/compose/ItemVisibilityMode$Percent;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ItemVisibilityMode {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/utils/compose/ItemVisibilityMode$FullyVisible;", "Lru/ozon/app/android/travel/utils/compose/ItemVisibilityMode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FullyVisible implements ItemVisibilityMode {

        @NotNull
        public static final FullyVisible INSTANCE = new FullyVisible();

        private FullyVisible() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FullyVisible);
        }

        public int hashCode() {
            return -966097146;
        }

        @NotNull
        public String toString() {
            return "FullyVisible";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/utils/compose/ItemVisibilityMode$OnePixel;", "Lru/ozon/app/android/travel/utils/compose/ItemVisibilityMode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnePixel implements ItemVisibilityMode {

        @NotNull
        public static final OnePixel INSTANCE = new OnePixel();

        private OnePixel() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OnePixel);
        }

        public int hashCode() {
            return -82806658;
        }

        @NotNull
        public String toString() {
            return "OnePixel";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/utils/compose/ItemVisibilityMode$Percent;", "Lru/ozon/app/android/travel/utils/compose/ItemVisibilityMode;", "", "percent", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPercent", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Percent implements ItemVisibilityMode {
        private final int percent;

        public Percent(int i11) {
            this.percent = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Percent) && this.percent == ((Percent) other).percent;
        }

        public final int getPercent() {
            return this.percent;
        }

        public int hashCode() {
            return Integer.hashCode(this.percent);
        }

        @NotNull
        public String toString() {
            return E.a(this.percent, "Percent(percent=", ")");
        }
    }
}
