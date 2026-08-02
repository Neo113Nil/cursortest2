package com.google.protobuf;

import com.google.protobuf.Duration;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: DurationKt.kt */
/* loaded from: classes13.dex */
public final class DurationKt {
    public static final DurationKt INSTANCE = new DurationKt();

    /* compiled from: DurationKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Duration.Builder _builder;

        /* compiled from: DurationKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Duration.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Duration.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ Duration _build() {
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

        private Dsl(Duration.Builder builder) {
            this._builder = builder;
        }
    }

    private DurationKt() {
    }
}
