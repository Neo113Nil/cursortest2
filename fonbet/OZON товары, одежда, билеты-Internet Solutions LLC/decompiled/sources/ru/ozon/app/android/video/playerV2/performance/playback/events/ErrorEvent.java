package ru.ozon.app.android.video.playerV2.performance.playback.events;

import C.o0;
import N3.C3660k;
import j3.w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/ErrorEvent;", "", "<init>", "()V", "NonFatalErrorEvent", "FatalErrorEvent", "Lru/ozon/app/android/video/playerV2/performance/playback/events/ErrorEvent$FatalErrorEvent;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/ErrorEvent$NonFatalErrorEvent;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ErrorEvent {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/ErrorEvent$FatalErrorEvent;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/ErrorEvent;", "Lj3/w;", "error", "<init>", "(Lj3/w;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj3/w;", "getError", "()Lj3/w;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FatalErrorEvent extends ErrorEvent {

        @NotNull
        private final w error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FatalErrorEvent(@NotNull w error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FatalErrorEvent) && Intrinsics.d(this.error, ((FatalErrorEvent) other).error);
        }

        @NotNull
        public final w getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "FatalErrorEvent(error=" + this.error + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/events/ErrorEvent$NonFatalErrorEvent;", "Lru/ozon/app/android/video/playerV2/performance/playback/events/ErrorEvent;", "", "nonFatalReason", "errorMessage", "errorCause", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNonFatalReason", "getErrorMessage", "getErrorCause", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NonFatalErrorEvent extends ErrorEvent {

        @NotNull
        private final String errorCause;
        private final String errorMessage;

        @NotNull
        private final String nonFatalReason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NonFatalErrorEvent(@NotNull String nonFatalReason, String str, @NotNull String errorCause) {
            super(null);
            Intrinsics.checkNotNullParameter(nonFatalReason, "nonFatalReason");
            Intrinsics.checkNotNullParameter(errorCause, "errorCause");
            this.nonFatalReason = nonFatalReason;
            this.errorMessage = str;
            this.errorCause = errorCause;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NonFatalErrorEvent)) {
                return false;
            }
            NonFatalErrorEvent nonFatalErrorEvent = (NonFatalErrorEvent) other;
            return Intrinsics.d(this.nonFatalReason, nonFatalErrorEvent.nonFatalReason) && Intrinsics.d(this.errorMessage, nonFatalErrorEvent.errorMessage) && Intrinsics.d(this.errorCause, nonFatalErrorEvent.errorCause);
        }

        @NotNull
        public final String getErrorCause() {
            return this.errorCause;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @NotNull
        public final String getNonFatalReason() {
            return this.nonFatalReason;
        }

        public int hashCode() {
            int hashCode = this.nonFatalReason.hashCode() * 31;
            String str = this.errorMessage;
            return this.errorCause.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.nonFatalReason;
            String str2 = this.errorMessage;
            return o0.c(C3660k.d("NonFatalErrorEvent(nonFatalReason=", str, ", errorMessage=", str2, ", errorCause="), this.errorCause, ")");
        }
    }

    public /* synthetic */ ErrorEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ErrorEvent() {
    }
}
