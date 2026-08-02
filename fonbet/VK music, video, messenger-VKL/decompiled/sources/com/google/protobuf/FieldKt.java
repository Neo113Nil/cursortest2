package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: FieldKt.kt */
/* loaded from: classes13.dex */
public final class FieldKt {
    public static final FieldKt INSTANCE = new FieldKt();

    /* compiled from: FieldKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Field.Builder _builder;

        /* compiled from: FieldKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Field.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: FieldKt.kt */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Field.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ Field _build() {
            return this._builder.build();
        }

        /* renamed from: addAllOptions, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllOptions(DslList dslList, Iterable iterable) {
            this._builder.addAllOptions(iterable);
        }

        /* renamed from: addOptions, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignOptions(DslList dslList, Option option) {
            this._builder.addOptions(option);
        }

        public final void clearCardinality() {
            this._builder.clearCardinality();
        }

        public final void clearDefaultValue() {
            this._builder.clearDefaultValue();
        }

        public final void clearJsonName() {
            this._builder.clearJsonName();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final void clearOneofIndex() {
            this._builder.clearOneofIndex();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            this._builder.clearOptions();
        }

        public final void clearPacked() {
            this._builder.clearPacked();
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final Field.Cardinality getCardinality() {
            return this._builder.getCardinality();
        }

        public final int getCardinalityValue() {
            return this._builder.getCardinalityValue();
        }

        public final String getDefaultValue() {
            return this._builder.getDefaultValue();
        }

        public final String getJsonName() {
            return this._builder.getJsonName();
        }

        public final Field.Kind getKind() {
            return this._builder.getKind();
        }

        public final int getKindValue() {
            return this._builder.getKindValue();
        }

        public final String getName() {
            return this._builder.getName();
        }

        public final int getNumber() {
            return this._builder.getNumber();
        }

        public final int getOneofIndex() {
            return this._builder.getOneofIndex();
        }

        public final /* synthetic */ DslList getOptions() {
            return new DslList(this._builder.getOptionsList());
        }

        public final boolean getPacked() {
            return this._builder.getPacked();
        }

        public final String getTypeUrl() {
            return this._builder.getTypeUrl();
        }

        public final void setCardinality(Field.Cardinality cardinality) {
            this._builder.setCardinality(cardinality);
        }

        public final void setCardinalityValue(int i) {
            this._builder.setCardinalityValue(i);
        }

        public final void setDefaultValue(String str) {
            this._builder.setDefaultValue(str);
        }

        public final void setJsonName(String str) {
            this._builder.setJsonName(str);
        }

        public final void setKind(Field.Kind kind) {
            this._builder.setKind(kind);
        }

        public final void setKindValue(int i) {
            this._builder.setKindValue(i);
        }

        public final void setName(String str) {
            this._builder.setName(str);
        }

        public final void setNumber(int i) {
            this._builder.setNumber(i);
        }

        public final void setOneofIndex(int i) {
            this._builder.setOneofIndex(i);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, Option option) {
            this._builder.setOptions(i, option);
        }

        public final void setPacked(boolean z) {
            this._builder.setPacked(z);
        }

        public final void setTypeUrl(String str) {
            this._builder.setTypeUrl(str);
        }

        private Dsl(Field.Builder builder) {
            this._builder = builder;
        }
    }

    private FieldKt() {
    }
}
