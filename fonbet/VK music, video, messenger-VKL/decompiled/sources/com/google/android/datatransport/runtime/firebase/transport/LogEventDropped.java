package com.google.android.datatransport.runtime.firebase.transport;

import xsna.p8e0;

/* loaded from: classes12.dex */
public final class LogEventDropped {
    public final long a;
    public final Reason b;

    public enum Reason implements p8e0 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        Reason(int i) {
            this.number_ = i;
        }

        @Override // xsna.p8e0
        public final int getNumber() {
            return this.number_;
        }
    }

    public LogEventDropped(long j, Reason reason) {
        this.a = j;
        this.b = reason;
    }
}
