package com.google.protobuf;

import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: TimestampKt.kt */
/* loaded from: classes13.dex */
public final class TimestampKt {
    public static final TimestampKt INSTANCE = new TimestampKt();

    /* compiled from: TimestampKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Timestamp.Builder _builder;

        /* compiled from: TimestampKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Timestamp.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Timestamp.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ Timestamp _build() {
            return this._builder.build();
        }

        public final void clearNanos() {
            this._builder.clearNanos();
        }

        public final void clearSeconds() {
            this._builder.clearSeconds();
        }

        public final int getNanos() {
            return this._builder.getNanos();
        }

        public final long getSeconds() {
            return this._builder.getSeconds();
        }

        public final void setNanos(int i) {
            this._builder.setNanos(i);
        }

        public final void setSeconds(long j) {
            this._builder.setSeconds(j);
        }

        private Dsl(Timestamp.Builder builder) {
            this._builder = builder;
        }
    }

    private TimestampKt() {
    }
}
