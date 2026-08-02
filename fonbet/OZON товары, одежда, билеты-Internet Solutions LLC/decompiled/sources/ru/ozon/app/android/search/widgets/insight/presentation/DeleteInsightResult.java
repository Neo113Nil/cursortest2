package ru.ozon.app.android.search.widgets.insight.presentation;

import Sh.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/presentation/DeleteInsightResult;", "", "<init>", "()V", "DeleteInsightSuccess", "DeleteInsightError", "Lru/ozon/app/android/search/widgets/insight/presentation/DeleteInsightResult$DeleteInsightError;", "Lru/ozon/app/android/search/widgets/insight/presentation/DeleteInsightResult$DeleteInsightSuccess;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class DeleteInsightResult {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/presentation/DeleteInsightResult$DeleteInsightError;", "Lru/ozon/app/android/search/widgets/insight/presentation/DeleteInsightResult;", "", "widgetId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeleteInsightError extends DeleteInsightResult {
        private final long widgetId;

        public DeleteInsightError(long j11) {
            super(null);
            this.widgetId = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeleteInsightError) && this.widgetId == ((DeleteInsightError) other).widgetId;
        }

        public final long getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            return Long.hashCode(this.widgetId);
        }

        @NotNull
        public String toString() {
            return b.b(this.widgetId, "DeleteInsightError(widgetId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/presentation/DeleteInsightResult$DeleteInsightSuccess;", "Lru/ozon/app/android/search/widgets/insight/presentation/DeleteInsightResult;", "", "widgetId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeleteInsightSuccess extends DeleteInsightResult {
        private final long widgetId;

        public DeleteInsightSuccess(long j11) {
            super(null);
            this.widgetId = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeleteInsightSuccess) && this.widgetId == ((DeleteInsightSuccess) other).widgetId;
        }

        public final long getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            return Long.hashCode(this.widgetId);
        }

        @NotNull
        public String toString() {
            return b.b(this.widgetId, "DeleteInsightSuccess(widgetId=", ")");
        }
    }

    public /* synthetic */ DeleteInsightResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DeleteInsightResult() {
    }
}
