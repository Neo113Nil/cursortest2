package com.google.protobuf;

import com.google.protobuf.Method;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: MethodKt.kt */
/* loaded from: classes13.dex */
public final class MethodKt {
    public static final MethodKt INSTANCE = new MethodKt();

    /* compiled from: MethodKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Method.Builder _builder;

        /* compiled from: MethodKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Method.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: MethodKt.kt */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Method.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ Method _build() {
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

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            this._builder.clearOptions();
        }

        public final void clearRequestStreaming() {
            this._builder.clearRequestStreaming();
        }

        public final void clearRequestTypeUrl() {
            this._builder.clearRequestTypeUrl();
        }

        public final void clearResponseStreaming() {
            this._builder.clearResponseStreaming();
        }

        public final void clearResponseTypeUrl() {
            this._builder.clearResponseTypeUrl();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        public final String getName() {
            return this._builder.getName();
        }

        public final /* synthetic */ DslList getOptions() {
            return new DslList(this._builder.getOptionsList());
        }

        public final boolean getRequestStreaming() {
            return this._builder.getRequestStreaming();
        }

        public final String getRequestTypeUrl() {
            return this._builder.getRequestTypeUrl();
        }

        public final boolean getResponseStreaming() {
            return this._builder.getResponseStreaming();
        }

        public final String getResponseTypeUrl() {
            return this._builder.getResponseTypeUrl();
        }

        public final Syntax getSyntax() {
            return this._builder.getSyntax();
        }

        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final void setName(String str) {
            this._builder.setName(str);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, Option option) {
            this._builder.setOptions(i, option);
        }

        public final void setRequestStreaming(boolean z) {
            this._builder.setRequestStreaming(z);
        }

        public final void setRequestTypeUrl(String str) {
            this._builder.setRequestTypeUrl(str);
        }

        public final void setResponseStreaming(boolean z) {
            this._builder.setResponseStreaming(z);
        }

        public final void setResponseTypeUrl(String str) {
            this._builder.setResponseTypeUrl(str);
        }

        public final void setSyntax(Syntax syntax) {
            this._builder.setSyntax(syntax);
        }

        public final void setSyntaxValue(int i) {
            this._builder.setSyntaxValue(i);
        }

        private Dsl(Method.Builder builder) {
            this._builder = builder;
        }
    }

    private MethodKt() {
    }
}
