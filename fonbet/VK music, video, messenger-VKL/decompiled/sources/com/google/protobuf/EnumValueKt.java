package com.google.protobuf;

import com.google.protobuf.EnumValue;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import xsna.zcl;

/* compiled from: EnumValueKt.kt */
/* loaded from: classes13.dex */
public final class EnumValueKt {
    public static final EnumValueKt INSTANCE = new EnumValueKt();

    /* compiled from: EnumValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final EnumValue.Builder _builder;

        /* compiled from: EnumValueKt.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(EnumValue.Builder builder) {
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: EnumValueKt.kt */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(EnumValue.Builder builder, zcl zclVar) {
            this(builder);
        }

        public final /* synthetic */ EnumValue _build() {
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

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            this._builder.clearOptions();
        }

        public final String getName() {
            return this._builder.getName();
        }

        public final int getNumber() {
            return this._builder.getNumber();
        }

        public final /* synthetic */ DslList getOptions() {
            return new DslList(this._builder.getOptionsList());
        }

        public final void setName(String str) {
            this._builder.setName(str);
        }

        public final void setNumber(int i) {
            this._builder.setNumber(i);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, Option option) {
            this._builder.setOptions(i, option);
        }

        private Dsl(EnumValue.Builder builder) {
            this._builder = builder;
        }
    }

    private EnumValueKt() {
    }
}
