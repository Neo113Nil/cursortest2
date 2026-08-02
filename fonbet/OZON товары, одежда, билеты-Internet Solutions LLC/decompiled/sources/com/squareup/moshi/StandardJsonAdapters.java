package com.squareup.moshi;

import I0.C3173b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class StandardJsonAdapters implements JsonAdapter.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final StandardJsonAdapters f60373a = new StandardJsonAdapters();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final StandardJsonAdapters$BOOLEAN_JSON_ADAPTER$1 f60374b = new JsonAdapter<Boolean>() { // from class: com.squareup.moshi.StandardJsonAdapters$BOOLEAN_JSON_ADAPTER$1
        @NotNull
        public String toString() {
            return "JsonAdapter(Boolean)";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        @NotNull
        public Boolean fromJson(@NotNull n reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return Boolean.valueOf(reader.k());
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo44toJson(@NotNull x writer, Boolean value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.W(value.booleanValue());
        }
    };

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final StandardJsonAdapters$BYTE_JSON_ADAPTER$1 f60375c = new JsonAdapter<Byte>() { // from class: com.squareup.moshi.StandardJsonAdapters$BYTE_JSON_ADAPTER$1
        @NotNull
        public String toString() {
            return "JsonAdapter(Byte)";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        @NotNull
        public Byte fromJson(@NotNull n reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            StandardJsonAdapters standardJsonAdapters = StandardJsonAdapters.f60373a;
            return Byte.valueOf((byte) StandardJsonAdapters.a(reader, "a byte", -128, 255));
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo44toJson(@NotNull x writer, Byte value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.O(value.byteValue() & 255);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final StandardJsonAdapters$CHARACTER_JSON_ADAPTER$1 f60376d = new JsonAdapter<Character>() { // from class: com.squareup.moshi.StandardJsonAdapters$CHARACTER_JSON_ADAPTER$1
        @NotNull
        public String toString() {
            return "JsonAdapter(Character)";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        @NotNull
        public Character fromJson(@NotNull n reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            String nextString = reader.nextString();
            if (nextString.length() <= 1) {
                return Character.valueOf(nextString.charAt(0));
            }
            throw new k(V.e.b(new Object[]{"a char", C3173b.a('\"', "\"", nextString), reader.d()}, 3, "Expected %s but was %s at path %s", "format(this, *args)"));
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo44toJson(@NotNull x writer, Character value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.R(String.valueOf(value.charValue()));
        }
    };

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final StandardJsonAdapters$DOUBLE_JSON_ADAPTER$1 f60377e = new JsonAdapter<Double>() { // from class: com.squareup.moshi.StandardJsonAdapters$DOUBLE_JSON_ADAPTER$1
        @NotNull
        public String toString() {
            return "JsonAdapter(Double)";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        @NotNull
        public Double fromJson(@NotNull n reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return Double.valueOf(reader.nextDouble());
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo44toJson(@NotNull x writer, Double value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.L(value.doubleValue());
        }
    };

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final StandardJsonAdapters$FLOAT_JSON_ADAPTER$1 f60378f = new JsonAdapter<Float>() { // from class: com.squareup.moshi.StandardJsonAdapters$FLOAT_JSON_ADAPTER$1
        @NotNull
        public String toString() {
            return "JsonAdapter(Float)";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        @NotNull
        public Float fromJson(@NotNull n reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            float nextDouble = (float) reader.nextDouble();
            if (reader.j() || !Float.isInfinite(nextDouble)) {
                return Float.valueOf(nextDouble);
            }
            throw new k("JSON forbids NaN and infinities: " + nextDouble + " at path " + reader.d());
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo44toJson(@NotNull x writer, Float value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            value.getClass();
            writer.Q(value);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final StandardJsonAdapters$INTEGER_JSON_ADAPTER$1 f60379g = new JsonAdapter<Integer>() { // from class: com.squareup.moshi.StandardJsonAdapters$INTEGER_JSON_ADAPTER$1
        @NotNull
        public String toString() {
            return "JsonAdapter(Integer)";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        @NotNull
        public Integer fromJson(@NotNull n reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return Integer.valueOf(reader.nextInt());
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo44toJson(@NotNull x writer, Integer value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.O(value.intValue());
        }
    };

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final StandardJsonAdapters$LONG_JSON_ADAPTER$1 f60380h = new JsonAdapter<Long>() { // from class: com.squareup.moshi.StandardJsonAdapters$LONG_JSON_ADAPTER$1
        @NotNull
        public String toString() {
            return "JsonAdapter(Long)";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        @NotNull
        public Long fromJson(@NotNull n reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return Long.valueOf(reader.nextLong());
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo44toJson(@NotNull x writer, Long value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.O(value.longValue());
        }
    };

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final StandardJsonAdapters$SHORT_JSON_ADAPTER$1 f60381i = new JsonAdapter<Short>() { // from class: com.squareup.moshi.StandardJsonAdapters$SHORT_JSON_ADAPTER$1
        @NotNull
        public String toString() {
            return "JsonAdapter(Short)";
        }

        @Override // com.squareup.moshi.JsonAdapter
        @NotNull
        public Short fromJson(@NotNull n reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            StandardJsonAdapters standardJsonAdapters = StandardJsonAdapters.f60373a;
            return Short.valueOf((short) StandardJsonAdapters.a(reader, "a short", -32768, 32767));
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo44toJson(@NotNull x writer, Short value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.O(value.shortValue());
        }
    };

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final StandardJsonAdapters$STRING_JSON_ADAPTER$1 f60382j = new JsonAdapter<String>() { // from class: com.squareup.moshi.StandardJsonAdapters$STRING_JSON_ADAPTER$1
        @NotNull
        public String toString() {
            return "JsonAdapter(String)";
        }

        @Override // com.squareup.moshi.JsonAdapter
        public String fromJson(@NotNull n reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return reader.nextString();
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo44toJson(@NotNull x writer, String value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.R(value);
        }
    };

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/squareup/moshi/StandardJsonAdapters$EnumJsonAdapter;", "", "T", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/Class;", "enumType", "<init>", "(Ljava/lang/Class;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Enum;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Enum;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Class;", "", "constants", "[Ljava/lang/Enum;", "nameStrings", "[Ljava/lang/String;", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "moshi"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {

        @NotNull
        private final T[] constants;

        @NotNull
        private final Class<T> enumType;

        @NotNull
        private final String[] nameStrings;

        @NotNull
        private n.a options;

        public EnumJsonAdapter(@NotNull Class<T> enumType) {
            Intrinsics.checkNotNullParameter(enumType, "enumType");
            this.enumType = enumType;
            T[] enumConstants = enumType.getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(enumConstants, "enumType.enumConstants");
            T[] tArr = enumConstants;
            this.constants = tArr;
            int length = tArr.length;
            String[] strArr = new String[length];
            for (int i11 = 0; i11 < length; i11++) {
                String declaredName = this.constants[i11].name();
                try {
                    Field field = this.enumType.getField(declaredName);
                    Intrinsics.checkNotNullExpressionValue(field, "enumType.getField(constantName)");
                    M m11 = Y9.c.f34861a;
                    Intrinsics.checkNotNullParameter(field, "<this>");
                    Intrinsics.checkNotNullParameter(declaredName, "declaredName");
                    i iVar = (i) field.getAnnotation(i.class);
                    Intrinsics.checkNotNullParameter(declaredName, "declaredName");
                    if (iVar != null) {
                        String name = iVar.name();
                        if (!"\u0000".equals(name)) {
                            declaredName = name;
                        }
                    }
                    strArr[i11] = declaredName;
                } catch (NoSuchFieldException e11) {
                    throw new AssertionError("Missing field in ".concat(this.enumType.getName()), e11);
                }
            }
            this.nameStrings = strArr;
            this.options = n.a.C0918a.a((String[]) Arrays.copyOf(strArr, length));
        }

        @NotNull
        public String toString() {
            return "JsonAdapter(" + this.enumType.getName() + ')';
        }

        @Override // com.squareup.moshi.JsonAdapter
        @NotNull
        public T fromJson(@NotNull n reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            int w11 = reader.w(this.options);
            if (w11 != -1) {
                return this.constants[w11];
            }
            String d11 = reader.d();
            String nextString = reader.nextString();
            StringBuilder sb2 = new StringBuilder("Expected one of ");
            Cm.e.i(" but was ", nextString, " at path ", sb2, C7705l.f0(this.nameStrings));
            sb2.append(d11);
            throw new k(sb2.toString());
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
        public void mo44toJson(@NotNull x writer, T value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.R(this.nameStrings[value.ordinal()]);
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u001e\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001bR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001b¨\u0006\u0004"}, d2 = {"Lcom/squareup/moshi/StandardJsonAdapters$ObjectJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Ljava/lang/Class;", "valueClass", "toJsonType", "(Ljava/lang/Class;)Ljava/lang/Class;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Object;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/Moshi;", "", "listJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "mapAdapter", "stringAdapter", "", "doubleAdapter", "", "booleanAdapter"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ObjectJsonAdapter extends JsonAdapter<Object> {

        @NotNull
        private final JsonAdapter<Boolean> booleanAdapter;

        @NotNull
        private final JsonAdapter<Double> doubleAdapter;

        @NotNull
        private final JsonAdapter<List<?>> listJsonAdapter;

        @NotNull
        private final JsonAdapter<Map<?, ?>> mapAdapter;

        @NotNull
        private final Moshi moshi;

        @NotNull
        private final JsonAdapter<String> stringAdapter;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f60383a;

            static {
                int[] iArr = new int[n.b.values().length];
                iArr[n.b.BEGIN_ARRAY.ordinal()] = 1;
                iArr[n.b.BEGIN_OBJECT.ordinal()] = 2;
                iArr[n.b.STRING.ordinal()] = 3;
                iArr[n.b.NUMBER.ordinal()] = 4;
                iArr[n.b.BOOLEAN.ordinal()] = 5;
                iArr[n.b.NULL.ordinal()] = 6;
                f60383a = iArr;
            }
        }

        public ObjectJsonAdapter(@NotNull Moshi moshi) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            this.moshi = moshi;
            this.listJsonAdapter = moshi.c(List.class);
            this.mapAdapter = moshi.c(Map.class);
            this.stringAdapter = moshi.c(String.class);
            this.doubleAdapter = moshi.c(Double.TYPE);
            this.booleanAdapter = moshi.c(Boolean.TYPE);
        }

        private final Class<?> toJsonType(Class<?> valueClass) {
            return Map.class.isAssignableFrom(valueClass) ? Map.class : Collection.class.isAssignableFrom(valueClass) ? Collection.class : valueClass;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(@NotNull n reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            switch (a.f60383a[reader.p().ordinal()]) {
                case 1:
                    return this.listJsonAdapter.fromJson(reader);
                case 2:
                    return this.mapAdapter.fromJson(reader);
                case 3:
                    return this.stringAdapter.fromJson(reader);
                case 4:
                    return this.doubleAdapter.fromJson(reader);
                case 5:
                    return this.booleanAdapter.fromJson(reader);
                case 6:
                    reader.m();
                    return null;
                default:
                    throw new IllegalStateException("Expected a value but was " + reader.p() + " at path " + reader.d());
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson */
        public void mo44toJson(@NotNull x writer, Object value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Class<?> cls = value.getClass();
            if (!cls.equals(Object.class)) {
                this.moshi.e(toJsonType(cls), Y9.c.f34861a).mo44toJson(writer, (x) value);
            } else {
                writer.j();
                writer.p();
            }
        }

        @NotNull
        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    public static int a(@NotNull n reader, String str, int i11, int i12) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        int nextInt = reader.nextInt();
        if (i11 > nextInt || nextInt > i12) {
            throw new k(V.e.b(new Object[]{str, Integer.valueOf(nextInt), reader.d()}, 3, "Expected %s but was %s at path %s", "format(this, *args)"));
        }
        return nextInt;
    }

    @Override // com.squareup.moshi.JsonAdapter.a
    public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        if (!annotations.isEmpty()) {
            return null;
        }
        Class cls = Boolean.TYPE;
        StandardJsonAdapters$BOOLEAN_JSON_ADAPTER$1 standardJsonAdapters$BOOLEAN_JSON_ADAPTER$1 = f60374b;
        if (type == cls) {
            return standardJsonAdapters$BOOLEAN_JSON_ADAPTER$1;
        }
        Class cls2 = Byte.TYPE;
        StandardJsonAdapters$BYTE_JSON_ADAPTER$1 standardJsonAdapters$BYTE_JSON_ADAPTER$1 = f60375c;
        if (type == cls2) {
            return standardJsonAdapters$BYTE_JSON_ADAPTER$1;
        }
        Class cls3 = Character.TYPE;
        StandardJsonAdapters$CHARACTER_JSON_ADAPTER$1 standardJsonAdapters$CHARACTER_JSON_ADAPTER$1 = f60376d;
        if (type == cls3) {
            return standardJsonAdapters$CHARACTER_JSON_ADAPTER$1;
        }
        Class cls4 = Double.TYPE;
        StandardJsonAdapters$DOUBLE_JSON_ADAPTER$1 standardJsonAdapters$DOUBLE_JSON_ADAPTER$1 = f60377e;
        if (type == cls4) {
            return standardJsonAdapters$DOUBLE_JSON_ADAPTER$1;
        }
        Class cls5 = Float.TYPE;
        StandardJsonAdapters$FLOAT_JSON_ADAPTER$1 standardJsonAdapters$FLOAT_JSON_ADAPTER$1 = f60378f;
        if (type == cls5) {
            return standardJsonAdapters$FLOAT_JSON_ADAPTER$1;
        }
        Class cls6 = Integer.TYPE;
        StandardJsonAdapters$INTEGER_JSON_ADAPTER$1 standardJsonAdapters$INTEGER_JSON_ADAPTER$1 = f60379g;
        if (type == cls6) {
            return standardJsonAdapters$INTEGER_JSON_ADAPTER$1;
        }
        Class cls7 = Long.TYPE;
        StandardJsonAdapters$LONG_JSON_ADAPTER$1 standardJsonAdapters$LONG_JSON_ADAPTER$1 = f60380h;
        if (type == cls7) {
            return standardJsonAdapters$LONG_JSON_ADAPTER$1;
        }
        Class cls8 = Short.TYPE;
        StandardJsonAdapters$SHORT_JSON_ADAPTER$1 standardJsonAdapters$SHORT_JSON_ADAPTER$1 = f60381i;
        if (type == cls8) {
            return standardJsonAdapters$SHORT_JSON_ADAPTER$1;
        }
        if (type == Boolean.class) {
            return standardJsonAdapters$BOOLEAN_JSON_ADAPTER$1.nullSafe();
        }
        if (type == Byte.class) {
            return standardJsonAdapters$BYTE_JSON_ADAPTER$1.nullSafe();
        }
        if (type == Character.class) {
            return standardJsonAdapters$CHARACTER_JSON_ADAPTER$1.nullSafe();
        }
        if (type == Double.class) {
            return standardJsonAdapters$DOUBLE_JSON_ADAPTER$1.nullSafe();
        }
        if (type == Float.class) {
            return standardJsonAdapters$FLOAT_JSON_ADAPTER$1.nullSafe();
        }
        if (type == Integer.class) {
            return standardJsonAdapters$INTEGER_JSON_ADAPTER$1.nullSafe();
        }
        if (type == Long.class) {
            return standardJsonAdapters$LONG_JSON_ADAPTER$1.nullSafe();
        }
        if (type == Short.class) {
            return standardJsonAdapters$SHORT_JSON_ADAPTER$1.nullSafe();
        }
        if (type == String.class) {
            return f60382j.nullSafe();
        }
        if (type == Object.class) {
            return new ObjectJsonAdapter(moshi).nullSafe();
        }
        Class<?> a11 = F.a(type);
        JsonAdapter<?> c11 = Y9.c.c(moshi, type, a11);
        if (c11 != null) {
            return c11;
        }
        if (a11.isEnum()) {
            return new EnumJsonAdapter(a11).nullSafe();
        }
        return null;
    }
}
