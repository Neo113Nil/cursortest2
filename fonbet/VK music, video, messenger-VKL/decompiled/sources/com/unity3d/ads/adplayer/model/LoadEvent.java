package com.unity3d.ads.adplayer.model;

import xsna.epx;
import xsna.vu5;
import xsna.zcl;

/* compiled from: LoadEvent.kt */
/* loaded from: classes14.dex */
public abstract class LoadEvent {

    /* compiled from: LoadEvent.kt */
    public static final class Completed extends LoadEvent {
        public static final Completed INSTANCE = new Completed();

        private Completed() {
            super(null);
        }
    }

    /* compiled from: LoadEvent.kt */
    public static final class Error extends LoadEvent {
        private final int errorCode;
        private final String message;

        public Error(String str, int i) {
            super(null);
            this.message = str;
            this.errorCode = i;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.errorCode;
            }
            return error.copy(str, i);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        public final Error copy(String str, int i) {
            return new Error(str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return epx.f(this.message, error.message) && this.errorCode == error.errorCode;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return Integer.hashCode(this.errorCode) + (this.message.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Error(message=");
            sb.append(this.message);
            sb.append(", errorCode=");
            return vu5.b(sb, this.errorCode, ')');
        }
    }

    public /* synthetic */ LoadEvent(zcl zclVar) {
        this();
    }

    private LoadEvent() {
    }
}
