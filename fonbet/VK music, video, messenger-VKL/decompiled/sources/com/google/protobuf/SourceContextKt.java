package com.google.protobuf;

import com.google.protobuf.SourceContext;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: SourceContextKt.kt */
/* loaded from: classes13.dex */
public final class SourceContextKt {
    public static final SourceContextKt INSTANCE = new SourceContextKt();

    /* compiled from: SourceContextKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SourceContext.Builder _builder;

        /* compiled from: SourceContextKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(SourceContext.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(SourceContext.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ SourceContext _build() {
            return this._builder.build();
        }

        public final void clearFileName() {
            this._builder.clearFileName();
        }

        public final String getFileName() {
            return this._builder.getFileName();
        }

        public final void setFileName(String str) {
            this._builder.setFileName(str);
        }

        private Dsl(SourceContext.Builder builder) {
            this._builder = builder;
        }
    }

    private SourceContextKt() {
    }
}
