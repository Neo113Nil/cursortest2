package com.squareup.wire.internal;

import com.ironsource.L6;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.gc2;
import defpackage.pvd;
import defpackage.q1f;
import defpackage.sha;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\b+,-./012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\u000eH&¢\u0006\u0002\u0010\u000fJ)\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00002\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0013\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00028\u00012\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0012H&¢\u0006\u0002\u0010\u0019JA\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\b\b\u0002\u0010\u001c*\u00020\u0003\"\b\b\u0003\u0010\u001d*\u00020\u00032\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d0\u001f2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010 JE\u0010!\u001a\u00028\u0001\"\b\b\u0002\u0010\u001c*\u00020\u0003\"\b\b\u0003\u0010\u001d*\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001d0%H\u0002¢\u0006\u0002\u0010&J\"\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\"\u001a\u00020#2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030)H\u0002J\u0018\u0010*\u001a\u0006\u0012\u0002\b\u00030\u00122\n\u0010(\u001a\u0006\u0012\u0002\b\u00030)H\u0002¨\u00063"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration;", "F", "A", "", "<init>", "()V", "frameworkAdapter", "framework", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "listAdapter", "elementAdapter", "skipNull", "", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "mapAdapter", "keyFormatter", "Lcom/squareup/wire/internal/JsonFormatter;", "valueAdapter", "(Ljava/lang/Object;Lcom/squareup/wire/internal/JsonFormatter;Ljava/lang/Object;)Ljava/lang/Object;", "structAdapter", "(Ljava/lang/Object;)Ljava/lang/Object;", "formatterAdapter", "jsonStringAdapter", "(Lcom/squareup/wire/internal/JsonFormatter;)Ljava/lang/Object;", "jsonAdapters", "", PlayerKt.FOOTBALL_MIDFIELDER, "B", L6.G1, "Lcom/squareup/wire/internal/RuntimeMessageAdapter;", "(Lcom/squareup/wire/internal/RuntimeMessageAdapter;Ljava/lang/Object;)Ljava/util/List;", "jsonAdapter", "syntax", "Lcom/squareup/wire/Syntax;", "field", "Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "(Ljava/lang/Object;Lcom/squareup/wire/Syntax;Lcom/squareup/wire/internal/FieldOrOneOfBinding;)Ljava/lang/Object;", "jsonFormatter", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "mapKeyJsonFormatter", "UnsignedLongAsNumberJsonFormatter", "UnsignedLongAsStringJsonFormatter", "LongAsStringJsonFormatter", "UnsignedIntAsNumberJsonFormatter", "UnsignedIntAsStringJsonFormatter", "IntAsStringJsonFormatter", "ByteStringJsonFormatter", "StringJsonFormatter", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class JsonIntegration<F, A> {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$ByteStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "Lgc2;", "<init>", "()V", U3.i.X, "", "toStringOrNumber", "(Lgc2;)Ljava/lang/String;", "fromString", "(Ljava/lang/String;)Lgc2;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ByteStringJsonFormatter implements JsonFormatter<gc2> {

        @NotNull
        public static final ByteStringJsonFormatter INSTANCE = new ByteStringJsonFormatter();

        private ByteStringJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        @Nullable
        public gc2 fromString(@NotNull String value) {
            value.getClass();
            gc2 gc2Var = gc2.d;
            return q1f.j(value);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        @NotNull
        public String toStringOrNumber(@NotNull gc2 value) {
            value.getClass();
            return value.d();
        }
    }

    private final <M, B> A jsonAdapter(F framework, Syntax syntax, FieldOrOneOfBinding<M, B> field) {
        A frameworkAdapter;
        if (field.getSingleAdapter().isStruct$wire_runtime()) {
            return structAdapter(framework);
        }
        JsonFormatter<?> jsonFormatter = jsonFormatter(syntax, field.getSingleAdapter());
        if (jsonFormatter != null) {
            frameworkAdapter = formatterAdapter(jsonFormatter);
        } else {
            KClass<?> type = field.getSingleAdapter().getType();
            Class y = type != null ? sha.y(type) : null;
            y.getClass();
            frameworkAdapter = frameworkAdapter(framework, y);
        }
        if (field.getLabel().isRepeated()) {
            return listAdapter(frameworkAdapter, jsonFormatter instanceof EnumJsonFormatter);
        }
        return field.isMap() ? mapAdapter(framework, mapKeyJsonFormatter(field.getKeyAdapter()), frameworkAdapter) : frameworkAdapter;
    }

    private final JsonFormatter<?> jsonFormatter(Syntax syntax, ProtoAdapter<?> protoAdapter) {
        if (Intrinsics.c(protoAdapter, ProtoAdapter.BYTES) || Intrinsics.c(protoAdapter, ProtoAdapter.BYTES_VALUE)) {
            return ByteStringJsonFormatter.INSTANCE;
        }
        if (Intrinsics.c(protoAdapter, ProtoAdapter.DURATION)) {
            return DurationJsonFormatter.INSTANCE;
        }
        if (Intrinsics.c(protoAdapter, ProtoAdapter.INSTANT)) {
            return InstantJsonFormatter.INSTANCE;
        }
        if (protoAdapter instanceof EnumAdapter) {
            return new EnumJsonFormatter((EnumAdapter) protoAdapter);
        }
        if (syntax == Syntax.PROTO_2) {
            if (Intrinsics.c(protoAdapter, ProtoAdapter.UINT64) || Intrinsics.c(protoAdapter, ProtoAdapter.UINT64_VALUE)) {
                return UnsignedLongAsNumberJsonFormatter.INSTANCE;
            }
            return null;
        }
        if (Intrinsics.c(protoAdapter, ProtoAdapter.UINT32) || Intrinsics.c(protoAdapter, ProtoAdapter.FIXED32) || Intrinsics.c(protoAdapter, ProtoAdapter.UINT32_VALUE)) {
            return UnsignedIntAsNumberJsonFormatter.INSTANCE;
        }
        if (Intrinsics.c(protoAdapter, ProtoAdapter.INT64) || Intrinsics.c(protoAdapter, ProtoAdapter.SFIXED64) || Intrinsics.c(protoAdapter, ProtoAdapter.SINT64) || Intrinsics.c(protoAdapter, ProtoAdapter.INT64_VALUE)) {
            return LongAsStringJsonFormatter.INSTANCE;
        }
        if (Intrinsics.c(protoAdapter, ProtoAdapter.FIXED64) || Intrinsics.c(protoAdapter, ProtoAdapter.UINT64) || Intrinsics.c(protoAdapter, ProtoAdapter.UINT64_VALUE)) {
            return UnsignedLongAsStringJsonFormatter.INSTANCE;
        }
        return null;
    }

    private final JsonFormatter<?> mapKeyJsonFormatter(ProtoAdapter<?> protoAdapter) {
        if (Intrinsics.c(protoAdapter, ProtoAdapter.STRING)) {
            return StringJsonFormatter.INSTANCE;
        }
        if (Intrinsics.c(protoAdapter, ProtoAdapter.INT32) || Intrinsics.c(protoAdapter, ProtoAdapter.SINT32) || Intrinsics.c(protoAdapter, ProtoAdapter.SFIXED32)) {
            return IntAsStringJsonFormatter.INSTANCE;
        }
        if (Intrinsics.c(protoAdapter, ProtoAdapter.FIXED32) || Intrinsics.c(protoAdapter, ProtoAdapter.UINT32)) {
            return UnsignedIntAsStringJsonFormatter.INSTANCE;
        }
        if (Intrinsics.c(protoAdapter, ProtoAdapter.INT64) || Intrinsics.c(protoAdapter, ProtoAdapter.SFIXED64) || Intrinsics.c(protoAdapter, ProtoAdapter.SINT64)) {
            return LongAsStringJsonFormatter.INSTANCE;
        }
        if (Intrinsics.c(protoAdapter, ProtoAdapter.FIXED64) || Intrinsics.c(protoAdapter, ProtoAdapter.UINT64)) {
            return UnsignedLongAsStringJsonFormatter.INSTANCE;
        }
        pvd.z(protoAdapter.getType(), "Unexpected map key type: ");
        return null;
    }

    public abstract A formatterAdapter(@NotNull JsonFormatter<?> jsonStringAdapter);

    public abstract A frameworkAdapter(F framework, @NotNull Type type);

    @NotNull
    public final <M, B> List<A> jsonAdapters(@NotNull RuntimeMessageAdapter<M, B> adapter, F framework) {
        adapter.getClass();
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr = (FieldOrOneOfBinding[]) adapter.getFields().values().toArray(new FieldOrOneOfBinding[0]);
        ArrayList arrayList = new ArrayList(fieldOrOneOfBindingArr.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : fieldOrOneOfBindingArr) {
            arrayList.add(jsonAdapter(framework, adapter.getSyntax(), fieldOrOneOfBinding));
        }
        return arrayList;
    }

    public abstract A listAdapter(A elementAdapter, boolean skipNull);

    public abstract A mapAdapter(F framework, @NotNull JsonFormatter<?> keyFormatter, A valueAdapter);

    public abstract A structAdapter(F framework);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$StringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "<init>", "()V", "toStringOrNumber", U3.i.X, "fromString", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StringJsonFormatter implements JsonFormatter<String> {

        @NotNull
        public static final StringJsonFormatter INSTANCE = new StringJsonFormatter();

        private StringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        @NotNull
        public String fromString(@NotNull String value) {
            value.getClass();
            return value;
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        @NotNull
        public String toStringOrNumber(@NotNull String value) {
            value.getClass();
            return value;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$IntAsStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "<init>", "()V", "fromString", U3.i.X, "", "(Ljava/lang/String;)Ljava/lang/Integer;", "toStringOrNumber", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IntAsStringJsonFormatter implements JsonFormatter<Integer> {

        @NotNull
        public static final IntAsStringJsonFormatter INSTANCE = new IntAsStringJsonFormatter();

        private IntAsStringJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        @NotNull
        public Integer fromString(@NotNull String value) {
            value.getClass();
            return Integer.valueOf(Integer.parseInt(value));
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }

        @NotNull
        public String toStringOrNumber(int value) {
            return String.valueOf(value);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$LongAsStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "<init>", "()V", "toStringOrNumber", "", U3.i.X, "fromString", "(Ljava/lang/String;)Ljava/lang/Long;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LongAsStringJsonFormatter implements JsonFormatter<Long> {

        @NotNull
        public static final LongAsStringJsonFormatter INSTANCE = new LongAsStringJsonFormatter();

        private LongAsStringJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        @NotNull
        public Long fromString(@NotNull String value) {
            long longValueExact;
            value.getClass();
            try {
                longValueExact = Long.parseLong(value);
            } catch (Exception unused) {
                longValueExact = new BigDecimal(value).longValueExact();
            }
            return Long.valueOf(longValueExact);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l) {
            return toStringOrNumber(l.longValue());
        }

        @NotNull
        public String toStringOrNumber(long value) {
            return String.valueOf(value);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$UnsignedLongAsStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "<init>", "()V", "toStringOrNumber", "", U3.i.X, "fromString", "(Ljava/lang/String;)Ljava/lang/Long;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnsignedLongAsStringJsonFormatter implements JsonFormatter<Long> {

        @NotNull
        public static final UnsignedLongAsStringJsonFormatter INSTANCE = new UnsignedLongAsStringJsonFormatter();

        private UnsignedLongAsStringJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        @NotNull
        public Long fromString(@NotNull String value) {
            value.getClass();
            return UnsignedLongAsNumberJsonFormatter.INSTANCE.fromString(value);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l) {
            return toStringOrNumber(l.longValue());
        }

        @NotNull
        public String toStringOrNumber(long value) {
            return UnsignedLongAsNumberJsonFormatter.INSTANCE.toStringOrNumber(value).toString();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$UnsignedIntAsNumberJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "<init>", "()V", "power32", "", "maxInt", "fromString", U3.i.X, "", "(Ljava/lang/String;)Ljava/lang/Integer;", "toStringOrNumber", "", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnsignedIntAsNumberJsonFormatter implements JsonFormatter<Integer> {

        @NotNull
        public static final UnsignedIntAsNumberJsonFormatter INSTANCE = new UnsignedIntAsNumberJsonFormatter();
        private static final long maxInt = 2147483647L;
        private static final long power32 = 4294967296L;

        private UnsignedIntAsNumberJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        @NotNull
        public Integer fromString(@NotNull String value) {
            value.getClass();
            long parseDouble = (long) Double.parseDouble(value);
            if (parseDouble >= maxInt) {
                parseDouble -= power32;
            }
            return Integer.valueOf((int) parseDouble);
        }

        @NotNull
        public Object toStringOrNumber(int value) {
            return value < 0 ? Long.valueOf(value + power32) : Integer.valueOf(value);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$UnsignedIntAsStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "<init>", "()V", "power32", "", "fromString", U3.i.X, "", "(Ljava/lang/String;)Ljava/lang/Integer;", "toStringOrNumber", "", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnsignedIntAsStringJsonFormatter implements JsonFormatter<Integer> {

        @NotNull
        public static final UnsignedIntAsStringJsonFormatter INSTANCE = new UnsignedIntAsStringJsonFormatter();
        private static final long power32 = 4294967296L;

        private UnsignedIntAsStringJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        @NotNull
        public Integer fromString(@NotNull String value) {
            value.getClass();
            return Integer.valueOf((int) Long.parseLong(value));
        }

        @NotNull
        public Object toStringOrNumber(int value) {
            return value < 0 ? String.valueOf(value + power32) : String.valueOf(value);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$UnsignedLongAsNumberJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "<init>", "()V", "power64", "Ljava/math/BigInteger;", "maxLong", "kotlin.jvm.PlatformType", "fromString", U3.i.X, "", "(Ljava/lang/String;)Ljava/lang/Long;", "toStringOrNumber", "", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnsignedLongAsNumberJsonFormatter implements JsonFormatter<Long> {

        @NotNull
        public static final UnsignedLongAsNumberJsonFormatter INSTANCE = new UnsignedLongAsNumberJsonFormatter();

        @NotNull
        private static final BigInteger power64 = new BigInteger("18446744073709551616");
        private static final BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);

        private UnsignedLongAsNumberJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        @NotNull
        public Long fromString(@NotNull String value) {
            BigInteger bigInteger;
            value.getClass();
            try {
                bigInteger = new BigInteger(value);
            } catch (Exception unused) {
                bigInteger = new BigDecimal(value).toBigInteger();
            }
            return Long.valueOf(bigInteger.compareTo(maxLong) > 0 ? bigInteger.subtract(power64).longValue() : bigInteger.longValue());
        }

        @NotNull
        public Object toStringOrNumber(long value) {
            return value < 0 ? power64.add(BigInteger.valueOf(value)) : Long.valueOf(value);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l) {
            return toStringOrNumber(l.longValue());
        }
    }
}
