package com.google.protobuf;

import com.google.protobuf.Type;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: TypeKt.kt */
/* loaded from: classes13.dex */
public final class TypeKt {
    public static final TypeKt INSTANCE = new TypeKt();

    /* compiled from: TypeKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Type.Builder _builder;

        /* compiled from: TypeKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Type.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: TypeKt.kt */
        public static final class FieldsProxy extends DslProxy {
            private FieldsProxy() {
            }
        }

        /* compiled from: TypeKt.kt */
        public static final class OneofsProxy extends DslProxy {
            private OneofsProxy() {
            }
        }

        /* compiled from: TypeKt.kt */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Type.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ Type _build() {
            return this._builder.build();
        }

        /* renamed from: addAllFields, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllFields(DslList dslList, Iterable iterable) {
            this._builder.addAllFields(iterable);
        }

        /* renamed from: addAllOneofs, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllOneofs(DslList dslList, Iterable iterable) {
            this._builder.addAllOneofs(iterable);
        }

        /* renamed from: addAllOptions, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllOptions(DslList dslList, Iterable iterable) {
            this._builder.addAllOptions(iterable);
        }

        /* renamed from: addFields, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignFields(DslList dslList, Field field) {
            this._builder.addFields(field);
        }

        /* renamed from: addOneofs, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignOneofs(DslList dslList, String str) {
            this._builder.addOneofs(str);
        }

        /* renamed from: addOptions, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignOptions(DslList dslList, Option option) {
            this._builder.addOptions(option);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        public final /* synthetic */ void clearFields(DslList dslList) {
            this._builder.clearFields();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOneofs(DslList dslList) {
            this._builder.clearOneofs();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            this._builder.clearOptions();
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        public final String getEdition() {
            return this._builder.getEdition();
        }

        public final /* synthetic */ DslList getFields() {
            return new DslList(this._builder.getFieldsList());
        }

        public final String getName() {
            return this._builder.getName();
        }

        public final DslList<String, OneofsProxy> getOneofs() {
            return new DslList<>(this._builder.getOneofsList());
        }

        public final /* synthetic */ DslList getOptions() {
            return new DslList(this._builder.getOptionsList());
        }

        public final SourceContext getSourceContext() {
            return this._builder.getSourceContext();
        }

        public final Syntax getSyntax() {
            return this._builder.getSyntax();
        }

        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final void setEdition(String str) {
            this._builder.setEdition(str);
        }

        public final /* synthetic */ void setFields(DslList dslList, int i, Field field) {
            this._builder.setFields(i, field);
        }

        public final void setName(String str) {
            this._builder.setName(str);
        }

        public final /* synthetic */ void setOneofs(DslList dslList, int i, String str) {
            this._builder.setOneofs(i, str);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, Option option) {
            this._builder.setOptions(i, option);
        }

        public final void setSourceContext(SourceContext sourceContext) {
            this._builder.setSourceContext(sourceContext);
        }

        public final void setSyntax(Syntax syntax) {
            this._builder.setSyntax(syntax);
        }

        public final void setSyntaxValue(int i) {
            this._builder.setSyntaxValue(i);
        }

        private Dsl(Type.Builder builder) {
            this._builder = builder;
        }
    }

    private TypeKt() {
    }
}
