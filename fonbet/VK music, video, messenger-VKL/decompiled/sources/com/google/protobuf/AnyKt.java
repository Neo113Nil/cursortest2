package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: AnyKt.kt */
/* loaded from: classes13.dex */
public final class AnyKt {
    public static final AnyKt INSTANCE = new AnyKt();

    /* compiled from: AnyKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Any.Builder _builder;

        /* compiled from: AnyKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Any.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Any.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ Any _build() {
            return this._builder.build();
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getTypeUrl() {
            return this._builder.getTypeUrl();
        }

        public final ByteString getValue() {
            return this._builder.getValue();
        }

        public final void setTypeUrl(String str) {
            this._builder.setTypeUrl(str);
        }

        public final void setValue(ByteString byteString) {
            this._builder.setValue(byteString);
        }

        private Dsl(Any.Builder builder) {
            this._builder = builder;
        }
    }

    private AnyKt() {
    }
}
