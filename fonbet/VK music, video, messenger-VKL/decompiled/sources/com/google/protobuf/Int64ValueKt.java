package com.google.protobuf;

import com.google.protobuf.Int64Value;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: Int64ValueKt.kt */
/* loaded from: classes13.dex */
public final class Int64ValueKt {
    public static final Int64ValueKt INSTANCE = new Int64ValueKt();

    /* compiled from: Int64ValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Int64Value.Builder _builder;

        /* compiled from: Int64ValueKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Int64Value.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Int64Value.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ Int64Value _build() {
            return this._builder.build();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final long getValue() {
            return this._builder.getValue();
        }

        public final void setValue(long j) {
            this._builder.setValue(j);
        }

        private Dsl(Int64Value.Builder builder) {
            this._builder = builder;
        }
    }

    private Int64ValueKt() {
    }
}
