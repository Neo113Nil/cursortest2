package ru.ozon.app.android.search.widgets.expandableCells.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.expandableCells.data.api.GetWarlockSectionResponse;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/WarlockResult;", "", "<init>", "()V", "WarlockFailure", "WarlockSuccess", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/WarlockResult$WarlockFailure;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/WarlockResult$WarlockSuccess;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class WarlockResult {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/WarlockResult$WarlockFailure;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/WarlockResult;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;", "savedItem", "<init>", "(Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;", "getSavedItem", "()Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WarlockFailure extends WarlockResult {

        @NotNull
        private final ExpandableCellVO savedItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WarlockFailure(@NotNull ExpandableCellVO savedItem) {
            super(null);
            Intrinsics.checkNotNullParameter(savedItem, "savedItem");
            this.savedItem = savedItem;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WarlockFailure) && Intrinsics.d(this.savedItem, ((WarlockFailure) other).savedItem);
        }

        @NotNull
        public final ExpandableCellVO getSavedItem() {
            return this.savedItem;
        }

        public int hashCode() {
            return this.savedItem.hashCode();
        }

        @NotNull
        public String toString() {
            return "WarlockFailure(savedItem=" + this.savedItem + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/WarlockResult$WarlockSuccess;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/WarlockResult;", "Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionResponse;", "response", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;", "savedItem", "<init>", "(Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionResponse;Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionResponse;", "getResponse", "()Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionResponse;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;", "getSavedItem", "()Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WarlockSuccess extends WarlockResult {

        @NotNull
        private final GetWarlockSectionResponse response;

        @NotNull
        private final ExpandableCellVO savedItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WarlockSuccess(@NotNull GetWarlockSectionResponse response, @NotNull ExpandableCellVO savedItem) {
            super(null);
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(savedItem, "savedItem");
            this.response = response;
            this.savedItem = savedItem;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WarlockSuccess)) {
                return false;
            }
            WarlockSuccess warlockSuccess = (WarlockSuccess) other;
            return Intrinsics.d(this.response, warlockSuccess.response) && Intrinsics.d(this.savedItem, warlockSuccess.savedItem);
        }

        @NotNull
        public final GetWarlockSectionResponse getResponse() {
            return this.response;
        }

        @NotNull
        public final ExpandableCellVO getSavedItem() {
            return this.savedItem;
        }

        public int hashCode() {
            return this.savedItem.hashCode() + (this.response.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "WarlockSuccess(response=" + this.response + ", savedItem=" + this.savedItem + ")";
        }
    }

    public /* synthetic */ WarlockResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WarlockResult() {
    }
}
