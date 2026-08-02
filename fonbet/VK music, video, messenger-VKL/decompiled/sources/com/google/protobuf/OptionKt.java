package com.google.protobuf;

import com.google.protobuf.Option;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: OptionKt.kt */
/* loaded from: classes13.dex */
public final class OptionKt {
    public static final OptionKt INSTANCE = new OptionKt();

    /* compiled from: OptionKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Option.Builder _builder;

        /* compiled from: OptionKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Option.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Option.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ Option _build() {
            return this._builder.build();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getName() {
            return this._builder.getName();
        }

        public final Any getValue() {
            return this._builder.getValue();
        }

        public final boolean hasValue() {
            return this._builder.hasValue();
        }

        public final void setName(String str) {
            this._builder.setName(str);
        }

        public final void setValue(Any any) {
            this._builder.setValue(any);
        }

        private Dsl(Option.Builder builder) {
            this._builder = builder;
        }
    }

    private OptionKt() {
    }
}
