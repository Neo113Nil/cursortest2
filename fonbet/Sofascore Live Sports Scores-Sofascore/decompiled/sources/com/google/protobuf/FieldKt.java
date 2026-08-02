package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/FieldKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FieldKt {

    @NotNull
    public static final FieldKt INSTANCE = new FieldKt();

    private FieldKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u001c\n\u0002\b\f\b\u0007\u0018\u0000 V2\u00020\u0001:\u0002VWB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010<\u001a\u00020=H\u0001J\u0006\u0010>\u001a\u00020?J\u0006\u0010@\u001a\u00020?J\u0006\u0010A\u001a\u00020?J\u0006\u0010B\u001a\u00020?J\u0006\u0010C\u001a\u00020?J\u0006\u0010D\u001a\u00020?J\u0006\u0010E\u001a\u00020?J\u0006\u0010F\u001a\u00020?J\u0006\u0010G\u001a\u00020?J%\u0010H\u001a\u00020?*\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0006\u0010\u0005\u001a\u00020/H\u0007¢\u0006\u0002\bIJ+\u0010J\u001a\u00020?*\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020/0LH\u0007¢\u0006\u0002\bMJ\u001d\u0010N\u001a\u00020?*\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.H\u0007¢\u0006\u0002\bOJ&\u0010P\u001a\u00020?*\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0006\u0010\u0005\u001a\u00020/H\u0087\n¢\u0006\u0002\bQJ,\u0010P\u001a\u00020?*\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020/0LH\u0087\n¢\u0006\u0002\bRJ.\u0010S\u001a\u00020?*\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0006\u0010T\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020/H\u0087\u0002¢\u0006\u0002\bUR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R$\u0010$\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R$\u0010'\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R$\u0010*\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u001d\u0010-\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.8F¢\u0006\u0006\u001a\u0004\b1\u00102R$\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u00109\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017¨\u0006X"}, d2 = {"Lcom/google/protobuf/FieldKt$Dsl;", "", "_builder", "Lcom/google/protobuf/Field$Builder;", "(Lcom/google/protobuf/Field$Builder;)V", U3.i.X, "Lcom/google/protobuf/Field$Cardinality;", "cardinality", "getCardinality", "()Lcom/google/protobuf/Field$Cardinality;", "setCardinality", "(Lcom/google/protobuf/Field$Cardinality;)V", "", "cardinalityValue", "getCardinalityValue", "()I", "setCardinalityValue", "(I)V", "", "defaultValue", "getDefaultValue", "()Ljava/lang/String;", "setDefaultValue", "(Ljava/lang/String;)V", "jsonName", "getJsonName", "setJsonName", "Lcom/google/protobuf/Field$Kind;", "kind", "getKind", "()Lcom/google/protobuf/Field$Kind;", "setKind", "(Lcom/google/protobuf/Field$Kind;)V", "kindValue", "getKindValue", "setKindValue", "name", "getName", "setName", "number", "getNumber", "setNumber", "oneofIndex", "getOneofIndex", "setOneofIndex", "options", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/Option;", "Lcom/google/protobuf/FieldKt$Dsl$OptionsProxy;", "getOptions", "()Lcom/google/protobuf/kotlin/DslList;", "", "packed", "getPacked", "()Z", "setPacked", "(Z)V", "typeUrl", "getTypeUrl", "setTypeUrl", "_build", "Lcom/google/protobuf/Field;", "clearCardinality", "", "clearDefaultValue", "clearJsonName", "clearKind", "clearName", "clearNumber", "clearOneofIndex", "clearPacked", "clearTypeUrl", "add", "addOptions", "addAll", "values", "", "addAllOptions", "clear", "clearOptions", "plusAssign", "plusAssignOptions", "plusAssignAllOptions", "set", "index", "setOptions", "Companion", "OptionsProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final Field.Builder _builder;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FieldKt$Dsl$OptionsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        private Dsl(Field.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Field _build() {
            Field build = this._builder.build();
            build.getClass();
            return build;
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            dslList.getClass();
            option.getClass();
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
            dslList.getClass();
            this._builder.clearOptions();
        }

        public final void clearPacked() {
            this._builder.clearPacked();
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        @NotNull
        public final Field.Cardinality getCardinality() {
            Field.Cardinality cardinality = this._builder.getCardinality();
            cardinality.getClass();
            return cardinality;
        }

        public final int getCardinalityValue() {
            return this._builder.getCardinalityValue();
        }

        @NotNull
        public final String getDefaultValue() {
            String defaultValue = this._builder.getDefaultValue();
            defaultValue.getClass();
            return defaultValue;
        }

        @NotNull
        public final String getJsonName() {
            String jsonName = this._builder.getJsonName();
            jsonName.getClass();
            return jsonName;
        }

        @NotNull
        public final Field.Kind getKind() {
            Field.Kind kind = this._builder.getKind();
            kind.getClass();
            return kind;
        }

        public final int getKindValue() {
            return this._builder.getKindValue();
        }

        @NotNull
        public final String getName() {
            String name = this._builder.getName();
            name.getClass();
            return name;
        }

        public final int getNumber() {
            return this._builder.getNumber();
        }

        public final int getOneofIndex() {
            return this._builder.getOneofIndex();
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            optionsList.getClass();
            return new DslList(optionsList);
        }

        public final boolean getPacked() {
            return this._builder.getPacked();
        }

        @NotNull
        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            typeUrl.getClass();
            return typeUrl;
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option option) {
            dslList.getClass();
            option.getClass();
            addOptions(dslList, option);
        }

        public final void setCardinality(@NotNull Field.Cardinality cardinality) {
            cardinality.getClass();
            this._builder.setCardinality(cardinality);
        }

        public final void setCardinalityValue(int i) {
            this._builder.setCardinalityValue(i);
        }

        public final void setDefaultValue(@NotNull String str) {
            str.getClass();
            this._builder.setDefaultValue(str);
        }

        public final void setJsonName(@NotNull String str) {
            str.getClass();
            this._builder.setJsonName(str);
        }

        public final void setKind(@NotNull Field.Kind kind) {
            kind.getClass();
            this._builder.setKind(kind);
        }

        public final void setKindValue(int i) {
            this._builder.setKindValue(i);
        }

        public final void setName(@NotNull String str) {
            str.getClass();
            this._builder.setName(str);
        }

        public final void setNumber(int i) {
            this._builder.setNumber(i);
        }

        public final void setOneofIndex(int i) {
            this._builder.setOneofIndex(i);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, Option option) {
            dslList.getClass();
            option.getClass();
            this._builder.setOptions(i, option);
        }

        public final void setPacked(boolean z) {
            this._builder.setPacked(z);
        }

        public final void setTypeUrl(@NotNull String str) {
            str.getClass();
            this._builder.setTypeUrl(str);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/FieldKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/FieldKt$Dsl;", "builder", "Lcom/google/protobuf/Field$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(Field.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Field.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
