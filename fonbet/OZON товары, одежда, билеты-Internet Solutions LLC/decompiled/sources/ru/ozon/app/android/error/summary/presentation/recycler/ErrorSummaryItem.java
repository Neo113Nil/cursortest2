package ru.ozon.app.android.error.summary.presentation.recycler;

import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem;", "", "<init>", "()V", "Ab", "Cell", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem$Ab;", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem$Cell;", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ErrorSummaryItem {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem$Ab;", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem;", "<init>", "()V", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "getTitle", "()Ljava/lang/String;", "Experiments", "FeatureFlags", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem$Ab$Experiments;", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem$Ab$FeatureFlags;", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Ab extends ErrorSummaryItem {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem$Ab$Experiments;", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem$Ab;", "<init>", "()V", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "getTitle", "()Ljava/lang/String;", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Experiments extends Ab {

            @NotNull
            public static final Experiments INSTANCE = new Experiments();

            @NotNull
            private static final String title = "Remote user ab experiments";

            private Experiments() {
                super(null);
            }

            @Override // ru.ozon.app.android.error.summary.presentation.recycler.ErrorSummaryItem.Ab
            @NotNull
            public String getTitle() {
                return title;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem$Ab$FeatureFlags;", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem$Ab;", "<init>", "()V", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "getTitle", "()Ljava/lang/String;", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class FeatureFlags extends Ab {

            @NotNull
            public static final FeatureFlags INSTANCE = new FeatureFlags();

            @NotNull
            private static final String title = "Feature flags";

            private FeatureFlags() {
                super(null);
            }

            @Override // ru.ozon.app.android.error.summary.presentation.recycler.ErrorSummaryItem.Ab
            @NotNull
            public String getTitle() {
                return title;
            }
        }

        public /* synthetic */ Ab(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public abstract String getTitle();

        private Ab() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem$Cell;", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "textValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTextValue", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Cell extends ErrorSummaryItem {

        @NotNull
        private final String textValue;

        @NotNull
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cell(@NotNull String title, @NotNull String textValue) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(textValue, "textValue");
            this.title = title;
            this.textValue = textValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cell)) {
                return false;
            }
            Cell cell = (Cell) other;
            return Intrinsics.d(this.title, cell.title) && Intrinsics.d(this.textValue, cell.textValue);
        }

        @NotNull
        public final String getTextValue() {
            return this.textValue;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.textValue.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Cell(title=", this.title, ", textValue=", this.textValue, ")");
        }
    }

    public /* synthetic */ ErrorSummaryItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ErrorSummaryItem() {
    }
}
