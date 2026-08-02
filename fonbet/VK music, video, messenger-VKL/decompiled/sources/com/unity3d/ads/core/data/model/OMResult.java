package com.unity3d.ads.core.data.model;

import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: OMResult.kt */
/* loaded from: classes14.dex */
public abstract class OMResult {

    /* compiled from: OMResult.kt */
    public static final class Failure extends OMResult {
        private final String reason;
        private final String reasonDebug;

        public /* synthetic */ Failure(String str, String str2, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.reason;
            }
            if ((i & 2) != 0) {
                str2 = failure.reasonDebug;
            }
            return failure.copy(str, str2);
        }

        public final String component1() {
            return this.reason;
        }

        public final String component2() {
            return this.reasonDebug;
        }

        public final Failure copy(String str, String str2) {
            return new Failure(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return epx.f(this.reason, failure.reason) && epx.f(this.reasonDebug, failure.reasonDebug);
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public int hashCode() {
            int hashCode = this.reason.hashCode() * 31;
            String str = this.reasonDebug;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Failure(reason=");
            sb.append(this.reason);
            sb.append(", reasonDebug=");
            return ho8.a(sb, this.reasonDebug, ')');
        }

        public Failure(String str, String str2) {
            super(null);
            this.reason = str;
            this.reasonDebug = str2;
        }
    }

    /* compiled from: OMResult.kt */
    public static final class Success extends OMResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ OMResult(zcl zclVar) {
        this();
    }

    private OMResult() {
    }
}
