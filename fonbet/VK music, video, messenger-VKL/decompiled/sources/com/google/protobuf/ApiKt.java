package com.google.protobuf;

import com.google.protobuf.Api;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: ApiKt.kt */
/* loaded from: classes13.dex */
public final class ApiKt {
    public static final ApiKt INSTANCE = new ApiKt();

    /* compiled from: ApiKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Api.Builder _builder;

        /* compiled from: ApiKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Api.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: ApiKt.kt */
        public static final class MethodsProxy extends DslProxy {
            private MethodsProxy() {
            }
        }

        /* compiled from: ApiKt.kt */
        public static final class MixinsProxy extends DslProxy {
            private MixinsProxy() {
            }
        }

        /* compiled from: ApiKt.kt */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Api.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ Api _build() {
            return this._builder.build();
        }

        /* renamed from: addAllMethods, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllMethods(DslList dslList, Iterable iterable) {
            this._builder.addAllMethods(iterable);
        }

        /* renamed from: addAllMixins, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllMixins(DslList dslList, Iterable iterable) {
            this._builder.addAllMixins(iterable);
        }

        /* renamed from: addAllOptions, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignAllOptions(DslList dslList, Iterable iterable) {
            this._builder.addAllOptions(iterable);
        }

        /* renamed from: addMethods, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignMethods(DslList dslList, Method method) {
            this._builder.addMethods(method);
        }

        /* renamed from: addMixins, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignMixins(DslList dslList, Mixin mixin) {
            this._builder.addMixins(mixin);
        }

        /* renamed from: addOptions, reason: merged with bridge method [inline-methods] */
        public final /* synthetic */ void plusAssignOptions(DslList dslList, Option option) {
            this._builder.addOptions(option);
        }

        public final /* synthetic */ void clearMethods(DslList dslList) {
            this._builder.clearMethods();
        }

        public final /* synthetic */ void clearMixins(DslList dslList) {
            this._builder.clearMixins();
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

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final /* synthetic */ DslList getMethods() {
            return new DslList(this._builder.getMethodsList());
        }

        public final /* synthetic */ DslList getMixins() {
            return new DslList(this._builder.getMixinsList());
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

        public final String getVersion() {
            return this._builder.getVersion();
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void setMethods(DslList dslList, int i, Method method) {
            this._builder.setMethods(i, method);
        }

        public final /* synthetic */ void setMixins(DslList dslList, int i, Mixin mixin) {
            this._builder.setMixins(i, mixin);
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

        public final void setVersion(String str) {
            this._builder.setVersion(str);
        }

        private Dsl(Api.Builder builder) {
            this._builder = builder;
        }
    }

    private ApiKt() {
    }
}
