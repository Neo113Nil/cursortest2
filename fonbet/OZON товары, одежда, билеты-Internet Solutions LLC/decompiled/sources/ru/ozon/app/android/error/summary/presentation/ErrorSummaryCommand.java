package ru.ozon.app.android.error.summary.presentation;

import B0.A0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/ErrorSummaryCommand;", "", "<init>", "()V", "Share", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryCommand$Share;", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ErrorSummaryCommand {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/ErrorSummaryCommand$Share;", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryCommand;", "", "jsonData", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getJsonData", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Share extends ErrorSummaryCommand {

        @NotNull
        private final String jsonData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Share(@NotNull String jsonData) {
            super(null);
            Intrinsics.checkNotNullParameter(jsonData, "jsonData");
            this.jsonData = jsonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Share) && Intrinsics.d(this.jsonData, ((Share) other).jsonData);
        }

        @NotNull
        public final String getJsonData() {
            return this.jsonData;
        }

        public int hashCode() {
            return this.jsonData.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Share(jsonData=", this.jsonData, ")");
        }
    }

    public /* synthetic */ ErrorSummaryCommand(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ErrorSummaryCommand() {
    }
}
