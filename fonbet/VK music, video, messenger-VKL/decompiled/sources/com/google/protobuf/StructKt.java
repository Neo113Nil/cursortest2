package com.google.protobuf;

import com.google.protobuf.Struct;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.Map;
import xsna.zcl;

/* compiled from: StructKt.kt */
/* loaded from: classes13.dex */
public final class StructKt {
    public static final StructKt INSTANCE = new StructKt();

    /* compiled from: StructKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Struct.Builder _builder;

        /* compiled from: StructKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Struct.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: StructKt.kt */
        public static final class FieldsProxy extends DslProxy {
            private FieldsProxy() {
            }
        }

        public /* synthetic */ Dsl(Struct.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ Struct _build() {
            return this._builder.build();
        }

        public final /* synthetic */ void clearFields(DslMap dslMap) {
            this._builder.clearFields();
        }

        public final /* synthetic */ DslMap getFieldsMap() {
            return new DslMap(this._builder.getFieldsMap());
        }

        public final /* synthetic */ void putAllFields(DslMap dslMap, Map map) {
            this._builder.putAllFields(map);
        }

        /* renamed from: putFields, reason: merged with bridge method [inline-methods] */
        public final void setFields(DslMap<String, Value, FieldsProxy> dslMap, String str, Value value) {
            this._builder.putFields(str, value);
        }

        public final /* synthetic */ void removeFields(DslMap dslMap, String str) {
            this._builder.removeFields(str);
        }

        private Dsl(Struct.Builder builder) {
            this._builder = builder;
        }
    }

    private StructKt() {
    }
}
