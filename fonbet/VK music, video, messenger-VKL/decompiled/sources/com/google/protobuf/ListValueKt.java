package com.google.protobuf;

import com.google.protobuf.ListValue;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: ListValueKt.kt */
/* loaded from: classes13.dex */
public final class ListValueKt {
    public static final ListValueKt INSTANCE = new ListValueKt();

    /* compiled from: ListValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ListValue.Builder _builder;

        /* compiled from: ListValueKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ListValue.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: ListValueKt.kt */
        public static final class ValuesProxy extends DslProxy {
            private ValuesProxy() {
            }
        }

        public /* synthetic */ Dsl(ListValue.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ ListValue _build() {
            return this._builder.build();
        }

        /* renamed from: addAllValues, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllValues(DslList dslList, Iterable iterable) {
            this._builder.addAllValues(iterable);
        }

        /* renamed from: addValues, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignValues(DslList dslList, Value value) {
            this._builder.addValues(value);
        }

        public final /* synthetic */ void clearValues(DslList dslList) {
            this._builder.clearValues();
        }

        public final /* synthetic */ DslList getValues() {
            return new DslList(this._builder.getValuesList());
        }

        public final /* synthetic */ void setValues(DslList dslList, int i, Value value) {
            this._builder.setValues(i, value);
        }

        private Dsl(ListValue.Builder builder) {
            this._builder = builder;
        }
    }

    private ListValueKt() {
    }
}
