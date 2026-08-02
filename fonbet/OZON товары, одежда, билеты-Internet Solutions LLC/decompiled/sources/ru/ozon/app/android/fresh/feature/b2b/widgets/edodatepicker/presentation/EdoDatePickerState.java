package ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.presentation;

import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerState;", "", "Unfilled", "Filled", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerState$Filled;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerState$Unfilled;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface EdoDatePickerState {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerState$Filled;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerState;", "", "startDate", "endDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStartDate", "getEndDate", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Filled implements EdoDatePickerState {
        private final String endDate;
        private final String startDate;

        public Filled(String str, String str2) {
            this.startDate = str;
            this.endDate = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Filled)) {
                return false;
            }
            Filled filled = (Filled) other;
            return Intrinsics.d(this.startDate, filled.startDate) && Intrinsics.d(this.endDate, filled.endDate);
        }

        public final String getEndDate() {
            return this.endDate;
        }

        public final String getStartDate() {
            return this.startDate;
        }

        public int hashCode() {
            String str = this.startDate;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.endDate;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("Filled(startDate=", this.startDate, ", endDate=", this.endDate, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerState$Unfilled;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerState;", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unfilled implements EdoDatePickerState {

        @NotNull
        public static final Unfilled INSTANCE = new Unfilled();

        private Unfilled() {
        }
    }
}
