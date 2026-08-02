package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoReader32;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.WireEnum;
import defpackage.wx4;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"com/squareup/wire/internal/Internal__InternalJvmKt", "com/squareup/wire/internal/Internal__InternalKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Internal {
    @NotNull
    /* renamed from: -redactElements, reason: not valid java name */
    public static final <T> List<T> m717redactElements(@NotNull List<? extends T> list, @NotNull ProtoAdapter<T> protoAdapter) {
        return Internal__InternalKt.m719redactElements(list, protoAdapter);
    }

    @NotNull
    public static final String boxedOneOfClassName(@NotNull String str) {
        return Internal__InternalKt.boxedOneOfClassName(str);
    }

    @NotNull
    public static final String boxedOneOfKeyFieldName(@NotNull String str, @NotNull String str2) {
        return Internal__InternalKt.boxedOneOfKeyFieldName(str, str2);
    }

    @NotNull
    public static final String boxedOneOfKeysFieldName(@NotNull String str) {
        return Internal__InternalKt.boxedOneOfKeysFieldName(str);
    }

    public static final void checkElementsNotNull(@NotNull List<?> list) {
        Internal__InternalKt.checkElementsNotNull(list);
    }

    public static final boolean commonEquals(@NotNull Duration duration, @Nullable Object obj) {
        return Internal__InternalKt.commonEquals(duration, obj);
    }

    public static final int commonHashCode(@NotNull Duration duration) {
        return Internal__InternalKt.commonHashCode(duration);
    }

    @wx4
    @NotNull
    public static final <T> List<T> copyOf(@NotNull String str, @Nullable List<? extends T> list) {
        return Internal__InternalKt.copyOf(str, list);
    }

    public static final int countNonNull(@Nullable Object obj, @Nullable Object obj2) {
        return Internal__InternalKt.countNonNull(obj, obj2);
    }

    public static final double decodePrimitive_double(@NotNull ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_double(protoReader32);
    }

    public static final int decodePrimitive_fixed32(@NotNull ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_fixed32(protoReader32);
    }

    public static final long decodePrimitive_fixed64(@NotNull ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_fixed64(protoReader32);
    }

    public static final float decodePrimitive_float(@NotNull ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_float(protoReader32);
    }

    public static final int decodePrimitive_int32(@NotNull ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_int32(protoReader32);
    }

    public static final long decodePrimitive_int64(@NotNull ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_int64(protoReader32);
    }

    public static final int decodePrimitive_sfixed32(@NotNull ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_sfixed32(protoReader32);
    }

    public static final long decodePrimitive_sfixed64(@NotNull ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_sfixed64(protoReader32);
    }

    public static final int decodePrimitive_sint32(@NotNull ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_sint32(protoReader32);
    }

    public static final long decodePrimitive_sint64(@NotNull ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_sint64(protoReader32);
    }

    public static final int decodePrimitive_uint32(@NotNull ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_uint32(protoReader32);
    }

    public static final long decodePrimitive_uint64(@NotNull ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_uint64(protoReader32);
    }

    public static final void encodeArray_double(@NotNull double[] dArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        Internal__InternalKt.encodeArray_double(dArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_fixed32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        Internal__InternalKt.encodeArray_fixed32(iArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_fixed64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        Internal__InternalKt.encodeArray_fixed64(jArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_float(@NotNull float[] fArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        Internal__InternalKt.encodeArray_float(fArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_int32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        Internal__InternalKt.encodeArray_int32(iArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_int64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        Internal__InternalKt.encodeArray_int64(jArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_sfixed32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        Internal__InternalKt.encodeArray_sfixed32(iArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_sfixed64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        Internal__InternalKt.encodeArray_sfixed64(jArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_sint32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        Internal__InternalKt.encodeArray_sint32(iArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_sint64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        Internal__InternalKt.encodeArray_sint64(jArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_uint32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        Internal__InternalKt.encodeArray_uint32(iArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_uint64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        Internal__InternalKt.encodeArray_uint64(jArr, reverseProtoWriter, i);
    }

    public static final boolean equals(@Nullable Object obj, @Nullable Object obj2) {
        return Internal__InternalKt.equals(obj, obj2);
    }

    @Nullable
    public static final <E extends WireEnum> E getIdentityOrNull(@NotNull Class<E> cls) {
        return (E) Internal__InternalJvmKt.getIdentityOrNull(cls);
    }

    @NotNull
    public static final <T> List<T> immutableCopyOf(@NotNull String str, @NotNull List<? extends T> list) {
        return Internal__InternalKt.immutableCopyOf(str, list);
    }

    @NotNull
    public static final <K, V> Map<K, V> immutableCopyOfMapWithStructValues(@NotNull String str, @NotNull Map<K, ? extends V> map) {
        return Internal__InternalKt.immutableCopyOfMapWithStructValues(str, map);
    }

    public static final <T> T immutableCopyOfStruct(@NotNull String str, T t) {
        return (T) Internal__InternalKt.immutableCopyOfStruct(str, t);
    }

    @NotNull
    public static final IllegalStateException missingRequiredFields(@NotNull Object... objArr) {
        return Internal__InternalKt.missingRequiredFields(objArr);
    }

    @NotNull
    public static final <T> List<T> newMutableList() {
        return Internal__InternalKt.newMutableList();
    }

    @NotNull
    public static final <K, V> Map<K, V> newMutableMap() {
        return Internal__InternalKt.newMutableMap();
    }

    public static final <T> void redactElements(@NotNull List<T> list, @NotNull ProtoAdapter<T> protoAdapter) {
        Internal__InternalJvmKt.redactElements(list, protoAdapter);
    }

    @NotNull
    public static final String sanitize(@NotNull String str) {
        return Internal__InternalKt.sanitize(str);
    }

    public static final void checkElementsNotNull(@NotNull Map<?, ?> map) {
        Internal__InternalKt.checkElementsNotNull(map);
    }

    public static final <T> void redactElements(@NotNull Map<?, T> map, @NotNull ProtoAdapter<T> protoAdapter) {
        Internal__InternalJvmKt.redactElements(map, protoAdapter);
    }

    @NotNull
    /* renamed from: -redactElements, reason: not valid java name */
    public static final <K, V> Map<K, V> m718redactElements(@NotNull Map<K, ? extends V> map, @NotNull ProtoAdapter<V> protoAdapter) {
        return Internal__InternalKt.m720redactElements(map, protoAdapter);
    }

    public static final boolean commonEquals(@NotNull Instant instant, @Nullable Object obj) {
        return Internal__InternalKt.commonEquals(instant, obj);
    }

    public static final int commonHashCode(@NotNull Instant instant) {
        return Internal__InternalKt.commonHashCode(instant);
    }

    @NotNull
    public static final <T> List<T> copyOf(@NotNull List<? extends T> list) {
        return Internal__InternalKt.copyOf(list);
    }

    public static final int countNonNull(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        return Internal__InternalKt.countNonNull(obj, obj2, obj3);
    }

    public static final double decodePrimitive_double(@NotNull ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_double(protoReader);
    }

    public static final int decodePrimitive_fixed32(@NotNull ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_fixed32(protoReader);
    }

    public static final long decodePrimitive_fixed64(@NotNull ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_fixed64(protoReader);
    }

    public static final float decodePrimitive_float(@NotNull ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_float(protoReader);
    }

    public static final int decodePrimitive_int32(@NotNull ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_int32(protoReader);
    }

    public static final long decodePrimitive_int64(@NotNull ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_int64(protoReader);
    }

    public static final int decodePrimitive_sfixed32(@NotNull ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_sfixed32(protoReader);
    }

    public static final long decodePrimitive_sfixed64(@NotNull ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_sfixed64(protoReader);
    }

    public static final int decodePrimitive_sint32(@NotNull ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_sint32(protoReader);
    }

    public static final long decodePrimitive_sint64(@NotNull ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_sint64(protoReader);
    }

    public static final int decodePrimitive_uint32(@NotNull ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_uint32(protoReader);
    }

    public static final long decodePrimitive_uint64(@NotNull ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_uint64(protoReader);
    }

    @NotNull
    public static final <K, V> Map<K, V> immutableCopyOf(@NotNull String str, @NotNull Map<K, ? extends V> map) {
        return Internal__InternalKt.immutableCopyOf(str, map);
    }

    @NotNull
    public static final String sanitize(@NotNull List<String> list) {
        return Internal__InternalKt.sanitize(list);
    }

    @wx4
    @NotNull
    public static final <K, V> Map<K, V> copyOf(@NotNull String str, @Nullable Map<K, ? extends V> map) {
        return Internal__InternalKt.copyOf(str, map);
    }

    public static final int countNonNull(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @NotNull Object... objArr) {
        return Internal__InternalKt.countNonNull(obj, obj2, obj3, obj4, objArr);
    }

    @NotNull
    public static final <K, V> Map<K, V> copyOf(@NotNull Map<K, ? extends V> map) {
        return Internal__InternalKt.copyOf(map);
    }
}
