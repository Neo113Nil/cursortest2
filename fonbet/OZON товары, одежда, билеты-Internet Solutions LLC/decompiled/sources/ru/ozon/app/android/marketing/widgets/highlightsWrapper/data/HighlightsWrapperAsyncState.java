package ru.ozon.app.android.marketing.widgets.highlightsWrapper.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState;", "", "<init>", "()V", "NetworkException", "ParseException", "WidgetSkippedException", "Success", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState$NetworkException;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState$ParseException;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState$Success;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState$WidgetSkippedException;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class HighlightsWrapperAsyncState {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState$NetworkException;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NetworkException extends HighlightsWrapperAsyncState {

        @NotNull
        public static final NetworkException INSTANCE = new NetworkException();

        private NetworkException() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NetworkException);
        }

        public int hashCode() {
            return -1273109404;
        }

        @NotNull
        public String toString() {
            return "NetworkException";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState$ParseException;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ParseException extends HighlightsWrapperAsyncState {

        @NotNull
        public static final ParseException INSTANCE = new ParseException();

        private ParseException() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ParseException);
        }

        public int hashCode() {
            return 969619007;
        }

        @NotNull
        public String toString() {
            return "ParseException";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState$Success;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperDTO;", "state", "<init>", "(Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperDTO;", "getState", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperDTO;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends HighlightsWrapperAsyncState {

        @NotNull
        private final HighlightsWrapperDTO state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull HighlightsWrapperDTO state) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.d(this.state, ((Success) other).state);
        }

        @NotNull
        public final HighlightsWrapperDTO getState() {
            return this.state;
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(state=" + this.state + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState$WidgetSkippedException;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetSkippedException extends HighlightsWrapperAsyncState {

        @NotNull
        public static final WidgetSkippedException INSTANCE = new WidgetSkippedException();

        private WidgetSkippedException() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof WidgetSkippedException);
        }

        public int hashCode() {
            return -1561581114;
        }

        @NotNull
        public String toString() {
            return "WidgetSkippedException";
        }
    }

    public /* synthetic */ HighlightsWrapperAsyncState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HighlightsWrapperAsyncState() {
    }
}
