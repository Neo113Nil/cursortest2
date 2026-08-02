package com.google.protobuf;

import com.google.protobuf.Empty;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: EmptyKt.kt */
/* loaded from: classes13.dex */
public final class EmptyKt {
    public static final EmptyKt INSTANCE = new EmptyKt();

    /* compiled from: EmptyKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Empty.Builder _builder;

        /* compiled from: EmptyKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Empty.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Empty.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ Empty _build() {
            return this._builder.build();
        }

        private Dsl(Empty.Builder builder) {
            this._builder = builder;
        }
    }

    private EmptyKt() {
    }
}
