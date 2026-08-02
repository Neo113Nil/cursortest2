package com.google.protobuf;

import com.google.protobuf.UInt32Value;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: UInt32ValueKt.kt */
/* loaded from: classes13.dex */
public final class UInt32ValueKt {
    public static final UInt32ValueKt INSTANCE = new UInt32ValueKt();

    /* compiled from: UInt32ValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UInt32Value.Builder _builder;

        /* compiled from: UInt32ValueKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UInt32Value.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(UInt32Value.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ UInt32Value _build() {
            return this._builder.build();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final int getValue() {
            return this._builder.getValue();
        }

        public final void setValue(int i) {
            this._builder.setValue(i);
        }

        private Dsl(UInt32Value.Builder builder) {
            this._builder = builder;
        }
    }

    private UInt32ValueKt() {
    }
}
