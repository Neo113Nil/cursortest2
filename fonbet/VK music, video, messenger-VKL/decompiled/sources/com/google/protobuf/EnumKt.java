package com.google.protobuf;

import com.google.protobuf.Enum;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: EnumKt.kt */
/* loaded from: classes13.dex */
public final class EnumKt {
    public static final EnumKt INSTANCE = new EnumKt();

    /* compiled from: EnumKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Enum.Builder _builder;

        /* compiled from: EnumKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Enum.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: EnumKt.kt */
        public static final class EnumvalueProxy extends DslProxy {
            private EnumvalueProxy() {
            }
        }

        /* compiled from: EnumKt.kt */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Enum.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ Enum _build() {
            return this._builder.build();
        }

        /* renamed from: addAllEnumvalue, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllEnumvalue(DslList dslList, Iterable iterable) {
            this._builder.addAllEnumvalue(iterable);
        }

        /* renamed from: addAllOptions, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllOptions(DslList dslList, Iterable iterable) {
            this._builder.addAllOptions(iterable);
        }

        /* renamed from: addEnumvalue, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignEnumvalue(DslList dslList, EnumValue enumValue) {
            this._builder.addEnumvalue(enumValue);
        }

        /* renamed from: addOptions, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignOptions(DslList dslList, Option option) {
            this._builder.addOptions(option);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        public final /* synthetic */ void clearEnumvalue(DslList dslList) {
            this._builder.clearEnumvalue();
        }

        public final void clearName() {
            this._builder.clearName();
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

        public final /* synthetic */ DslList getEnumvalue() {
            return new DslList(this._builder.getEnumvalueList());
        }

        public final String getName() {
            return this._builder.getName();
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

        public final /* synthetic */ void setEnumvalue(DslList dslList, int i, EnumValue enumValue) {
            this._builder.setEnumvalue(i, enumValue);
        }

        public final void setName(String str) {
            this._builder.setName(str);
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

        private Dsl(Enum.Builder builder) {
            this._builder = builder;
        }
    }

    private EnumKt() {
    }
}
