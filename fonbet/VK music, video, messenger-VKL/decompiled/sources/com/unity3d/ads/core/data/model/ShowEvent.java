package com.unity3d.ads.core.data.model;

import com.unity3d.ads.adplayer.model.ShowStatus;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.zcl;

/* compiled from: ShowEvent.kt */
/* loaded from: classes14.dex */
public abstract class ShowEvent {

    /* compiled from: ShowEvent.kt */
    public static final class CancelTimeout extends ShowEvent {
        public static final CancelTimeout INSTANCE = new CancelTimeout();

        private CancelTimeout() {
            super(null);
        }
    }

    /* compiled from: ShowEvent.kt */
    public static final class Clicked extends ShowEvent {
        public static final Clicked INSTANCE = new Clicked();

        private Clicked() {
            super(null);
        }
    }

    /* compiled from: ShowEvent.kt */
    public static final class Completed extends ShowEvent {
        private final String reason;
        private final String reasonDebug;
        private final ShowStatus status;

        public Completed(ShowStatus showStatus, String str, String str2) {
            super(null);
            this.status = showStatus;
            this.reason = str;
            this.reasonDebug = str2;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, ShowStatus showStatus, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                showStatus = completed.status;
            }
            if ((i & 2) != 0) {
                str = completed.reason;
            }
            if ((i & 4) != 0) {
                str2 = completed.reasonDebug;
            }
            return completed.copy(showStatus, str, str2);
        }

        public final ShowStatus component1() {
            return this.status;
        }

        public final String component2() {
            return this.reason;
        }

        public final String component3() {
            return this.reasonDebug;
        }

        public final Completed copy(ShowStatus showStatus, String str, String str2) {
            return new Completed(showStatus, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) obj;
            return this.status == completed.status && epx.f(this.reason, completed.reason) && epx.f(this.reasonDebug, completed.reasonDebug);
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public final ShowStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int hashCode = this.status.hashCode() * 31;
            String str = this.reason;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.reasonDebug;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Completed(status=");
            sb.append(this.status);
            sb.append(", reason=");
            sb.append(this.reason);
            sb.append(", reasonDebug=");
            return ho8.a(sb, this.reasonDebug, ')');
        }

        public /* synthetic */ Completed(ShowStatus showStatus, String str, String str2, int i, zcl zclVar) {
            this(showStatus, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }
    }

    /* compiled from: ShowEvent.kt */
    public static final class Error extends ShowEvent {
        private final int errorCode;
        private final String message;
        private final String reason;

        public Error(String str, int i, String str2) {
            super(null);
            this.message = str;
            this.errorCode = i;
            this.reason = str2;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.errorCode;
            }
            if ((i2 & 4) != 0) {
                str2 = error.reason;
            }
            return error.copy(str, i, str2);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        public final String component3() {
            return this.reason;
        }

        public final Error copy(String str, int i, String str2) {
            return new Error(str, i, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return epx.f(this.message, error.message) && this.errorCode == error.errorCode && epx.f(this.reason, error.reason);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode() + shy.a(this.errorCode, this.message.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Error(message=");
            sb.append(this.message);
            sb.append(", errorCode=");
            sb.append(this.errorCode);
            sb.append(", reason=");
            return ho8.a(sb, this.reason, ')');
        }
    }

    /* compiled from: ShowEvent.kt */
    public static final class LeftApplication extends ShowEvent {
        public static final LeftApplication INSTANCE = new LeftApplication();

        private LeftApplication() {
            super(null);
        }
    }

    /* compiled from: ShowEvent.kt */
    public static final class ReceivedReward extends ShowEvent {
        public static final ReceivedReward INSTANCE = new ReceivedReward();

        private ReceivedReward() {
            super(null);
        }
    }

    /* compiled from: ShowEvent.kt */
    public static final class Started extends ShowEvent {
        public static final Started INSTANCE = new Started();

        private Started() {
            super(null);
        }
    }

    public /* synthetic */ ShowEvent(zcl zclVar) {
        this();
    }

    private ShowEvent() {
    }
}
