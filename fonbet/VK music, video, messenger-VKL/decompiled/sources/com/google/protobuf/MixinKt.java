package com.google.protobuf;

import com.google.protobuf.Mixin;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: MixinKt.kt */
/* loaded from: classes13.dex */
public final class MixinKt {
    public static final MixinKt INSTANCE = new MixinKt();

    /* compiled from: MixinKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Mixin.Builder _builder;

        /* compiled from: MixinKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Mixin.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Mixin.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ Mixin _build() {
            return this._builder.build();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearRoot() {
            this._builder.clearRoot();
        }

        public final String getName() {
            return this._builder.getName();
        }

        public final String getRoot() {
            return this._builder.getRoot();
        }

        public final void setName(String str) {
            this._builder.setName(str);
        }

        public final void setRoot(String str) {
            this._builder.setRoot(str);
        }

        private Dsl(Mixin.Builder builder) {
            this._builder = builder;
        }
    }

    private MixinKt() {
    }
}
