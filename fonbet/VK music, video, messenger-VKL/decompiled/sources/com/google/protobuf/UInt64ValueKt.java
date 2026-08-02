package com.google.protobuf;

import com.google.protobuf.UInt64Value;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: UInt64ValueKt.kt */
/* loaded from: classes13.dex */
public final class UInt64ValueKt {
    public static final UInt64ValueKt INSTANCE = new UInt64ValueKt();

    /* compiled from: UInt64ValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UInt64Value.Builder _builder;

        /* compiled from: UInt64ValueKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UInt64Value.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(UInt64Value.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ UInt64Value _build() {
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

        private Dsl(UInt64Value.Builder builder) {
            this._builder = builder;
        }
    }

    private UInt64ValueKt() {
    }
}
