package com.squareup.wire;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.ReflectionKt;
import defpackage.a70;
import defpackage.duf;
import defpackage.f6a;
import defpackage.gc2;
import defpackage.k62;
import defpackage.kof;
import defpackage.l62;
import defpackage.lnb;
import defpackage.lof;
import defpackage.pij;
import defpackage.sha;
import defpackage.wk0;
import defpackage.x52;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 n*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002onBG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000f¢\u0006\u0004\b\r\u0010\u0010B'\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u0011B/\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0012B9\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u0013B\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u0014B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u0015B1\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0016B;\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u0017BC\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u0018J\u0017\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u0000H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00028\u0000H&¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00028\u0000H&¢\u0006\u0004\b%\u0010&J\u001f\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020'2\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010(J)\u0010)\u001a\u00020$2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b)\u0010*J)\u0010)\u001a\u00020$2\u0006\u0010#\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b)\u0010+J\u001d\u0010%\u001a\u00020$2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b%\u0010.J\u0015\u0010%\u001a\u00020/2\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b%\u00100J\u0015\u00102\u001a\u0002012\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b2\u00103J\u001d\u0010%\u001a\u00020$2\u0006\u00105\u001a\u0002042\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b%\u00106J\u0017\u00109\u001a\u00028\u00002\u0006\u00108\u001a\u000207H&¢\u0006\u0004\b9\u0010:J\u0017\u00109\u001a\u00028\u00002\u0006\u00108\u001a\u00020;H\u0016¢\u0006\u0004\b9\u0010<J\u0015\u00109\u001a\u00028\u00002\u0006\u0010=\u001a\u00020/¢\u0006\u0004\b9\u0010>J\u0015\u00109\u001a\u00028\u00002\u0006\u0010=\u001a\u000201¢\u0006\u0004\b9\u0010?J\u0015\u00109\u001a\u00028\u00002\u0006\u0010A\u001a\u00020@¢\u0006\u0004\b9\u0010BJ#\u0010E\u001a\u00020$2\u0006\u00108\u001a\u0002072\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C¢\u0006\u0004\bE\u0010FJ#\u0010E\u001a\u00020$2\u0006\u00108\u001a\u00020;2\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C¢\u0006\u0004\bE\u0010GJ\u0015\u00109\u001a\u00028\u00002\u0006\u00105\u001a\u00020H¢\u0006\u0004\b9\u0010IJ\u0017\u0010J\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\bJ\u0010KJ\u001b\u0010P\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010M\u001a\u00020LH\u0000¢\u0006\u0004\bN\u0010OJ\u0019\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Q0\u0000¢\u0006\u0004\bR\u0010SJ\u0019\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Q0\u0000¢\u0006\u0004\bT\u0010SR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010U\u001a\u0004\bV\u0010WR\u001d\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010a\u001a\u0004\bb\u0010cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010[\u001a\u0004\bd\u0010]R(\u0010e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Q\u0018\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010SR(\u0010h\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Q\u0018\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010f\u001a\u0004\bi\u0010SR\u0014\u0010m\u001a\u00020j8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006p"}, d2 = {"Lcom/squareup/wire/ProtoAdapter;", "E", "", "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", "Lkotlin/reflect/KClass;", "type", "", "typeUrl", "Lcom/squareup/wire/Syntax;", "syntax", "identity", "sourceFile", "<init>", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;Ljava/lang/String;)V", "Ljava/lang/Class;", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;Lcom/squareup/wire/Syntax;)V", "(Lcom/squareup/wire/FieldEncoding;Lkotlin/reflect/KClass;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;)V", "(Lcom/squareup/wire/FieldEncoding;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/Object;Ljava/lang/String;)V", U3.i.X, "redact", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "encodedSize", "(Ljava/lang/Object;)I", "tag", "encodedSizeWithTag", "(ILjava/lang/Object;)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "", "encode", "(Lcom/squareup/wire/ProtoWriter;Ljava/lang/Object;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Ljava/lang/Object;)V", "encodeWithTag", "(Lcom/squareup/wire/ProtoWriter;ILjava/lang/Object;)V", "(Lcom/squareup/wire/ReverseProtoWriter;ILjava/lang/Object;)V", "Lk62;", "sink", "(Lk62;Ljava/lang/Object;)V", "", "(Ljava/lang/Object;)[B", "Lgc2;", "encodeByteString", "(Ljava/lang/Object;)Lgc2;", "Ljava/io/OutputStream;", "stream", "(Ljava/io/OutputStream;Ljava/lang/Object;)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Ljava/lang/Object;", "Lcom/squareup/wire/ProtoReader32;", "(Lcom/squareup/wire/ProtoReader32;)Ljava/lang/Object;", "bytes", "([B)Ljava/lang/Object;", "(Lgc2;)Ljava/lang/Object;", "Ll62;", "source", "(Ll62;)Ljava/lang/Object;", "", "destination", "tryDecode", "(Lcom/squareup/wire/ProtoReader;Ljava/util/List;)V", "(Lcom/squareup/wire/ProtoReader32;Ljava/util/List;)V", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)Ljava/lang/Object;", "toString", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/squareup/wire/WireField$Label;", "label", "withLabel$wire_runtime", "(Lcom/squareup/wire/WireField$Label;)Lcom/squareup/wire/ProtoAdapter;", "withLabel", "", "asPacked", "()Lcom/squareup/wire/ProtoAdapter;", "asRepeated", "Lcom/squareup/wire/FieldEncoding;", "getFieldEncoding$wire_runtime", "()Lcom/squareup/wire/FieldEncoding;", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "Ljava/lang/String;", "getTypeUrl", "()Ljava/lang/String;", "Lcom/squareup/wire/Syntax;", "getSyntax", "()Lcom/squareup/wire/Syntax;", "Ljava/lang/Object;", "getIdentity", "()Ljava/lang/Object;", "getSourceFile", "packedAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getPackedAdapter$wire_runtime", "repeatedAdapter", "getRepeatedAdapter$wire_runtime", "", "isStruct$wire_runtime", "()Z", "isStruct", "Companion", "EnumConstantNotFoundException", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ProtoAdapter<E> {

    @NotNull
    public static final ProtoAdapter<Boolean> BOOL;

    @NotNull
    public static final ProtoAdapter<Boolean> BOOL_VALUE;

    @NotNull
    public static final ProtoAdapter<gc2> BYTES;

    @NotNull
    public static final ProtoAdapter<gc2> BYTES_VALUE;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ProtoAdapter<Double> DOUBLE;

    @NotNull
    public static final ProtoAdapter<double[]> DOUBLE_ARRAY;

    @NotNull
    public static final ProtoAdapter<Double> DOUBLE_VALUE;

    @NotNull
    public static final ProtoAdapter<Duration> DURATION;

    @NotNull
    public static final ProtoAdapter<Unit> EMPTY;

    @NotNull
    public static final ProtoAdapter<Integer> FIXED32;

    @NotNull
    public static final ProtoAdapter<int[]> FIXED32_ARRAY;

    @NotNull
    public static final ProtoAdapter<Long> FIXED64;

    @NotNull
    public static final ProtoAdapter<long[]> FIXED64_ARRAY;

    @NotNull
    public static final ProtoAdapter<Float> FLOAT;

    @NotNull
    public static final ProtoAdapter<float[]> FLOAT_ARRAY;

    @NotNull
    public static final ProtoAdapter<Float> FLOAT_VALUE;

    @NotNull
    public static final ProtoAdapter<Instant> INSTANT;

    @NotNull
    public static final ProtoAdapter<Integer> INT32;

    @NotNull
    public static final ProtoAdapter<int[]> INT32_ARRAY;

    @NotNull
    public static final ProtoAdapter<Integer> INT32_VALUE;

    @NotNull
    public static final ProtoAdapter<Long> INT64;

    @NotNull
    public static final ProtoAdapter<long[]> INT64_ARRAY;

    @NotNull
    public static final ProtoAdapter<Long> INT64_VALUE;

    @NotNull
    public static final ProtoAdapter<Integer> SFIXED32;

    @NotNull
    public static final ProtoAdapter<int[]> SFIXED32_ARRAY;

    @NotNull
    public static final ProtoAdapter<Long> SFIXED64;

    @NotNull
    public static final ProtoAdapter<long[]> SFIXED64_ARRAY;

    @NotNull
    public static final ProtoAdapter<Integer> SINT32;

    @NotNull
    public static final ProtoAdapter<int[]> SINT32_ARRAY;

    @NotNull
    public static final ProtoAdapter<Long> SINT64;

    @NotNull
    public static final ProtoAdapter<long[]> SINT64_ARRAY;

    @NotNull
    public static final ProtoAdapter<String> STRING;

    @NotNull
    public static final ProtoAdapter<String> STRING_VALUE;

    @NotNull
    public static final ProtoAdapter<List<?>> STRUCT_LIST;

    @NotNull
    public static final ProtoAdapter<Map<String, ?>> STRUCT_MAP;

    @NotNull
    public static final ProtoAdapter STRUCT_NULL;

    @NotNull
    public static final ProtoAdapter<Object> STRUCT_VALUE;

    @NotNull
    public static final ProtoAdapter<Integer> UINT32;

    @NotNull
    public static final ProtoAdapter<int[]> UINT32_ARRAY;

    @NotNull
    public static final ProtoAdapter<Integer> UINT32_VALUE;

    @NotNull
    public static final ProtoAdapter<Long> UINT64;

    @NotNull
    public static final ProtoAdapter<long[]> UINT64_ARRAY;

    @NotNull
    public static final ProtoAdapter<Long> UINT64_VALUE;

    @NotNull
    private final FieldEncoding fieldEncoding;

    @Nullable
    private final E identity;

    @Nullable
    private final ProtoAdapter<List<E>> packedAdapter;

    @Nullable
    private final ProtoAdapter<List<E>> repeatedAdapter;

    @Nullable
    private final String sourceFile;

    @NotNull
    private final Syntax syntax;

    @Nullable
    private final KClass<?> type;

    @Nullable
    private final String typeUrl;

    static {
        ProtoAdapter<Duration> unsupportedTypeProtoAdapter;
        ProtoAdapter<Instant> unsupportedTypeProtoAdapter2;
        ProtoAdapter<Boolean> commonBool = ProtoAdapterKt.commonBool();
        BOOL = commonBool;
        ProtoAdapter<Integer> commonInt32 = ProtoAdapterKt.commonInt32();
        INT32 = commonInt32;
        INT32_ARRAY = new IntArrayProtoAdapter(commonInt32);
        ProtoAdapter<Integer> commonUint32 = ProtoAdapterKt.commonUint32();
        UINT32 = commonUint32;
        UINT32_ARRAY = new IntArrayProtoAdapter(commonUint32);
        ProtoAdapter<Integer> commonSint32 = ProtoAdapterKt.commonSint32();
        SINT32 = commonSint32;
        SINT32_ARRAY = new IntArrayProtoAdapter(commonSint32);
        ProtoAdapter<Integer> commonFixed32 = ProtoAdapterKt.commonFixed32();
        FIXED32 = commonFixed32;
        FIXED32_ARRAY = new IntArrayProtoAdapter(commonFixed32);
        ProtoAdapter<Integer> commonSfixed32 = ProtoAdapterKt.commonSfixed32();
        SFIXED32 = commonSfixed32;
        SFIXED32_ARRAY = new IntArrayProtoAdapter(commonSfixed32);
        ProtoAdapter<Long> commonInt64 = ProtoAdapterKt.commonInt64();
        INT64 = commonInt64;
        INT64_ARRAY = new LongArrayProtoAdapter(commonInt64);
        ProtoAdapter<Long> commonUint64 = ProtoAdapterKt.commonUint64();
        UINT64 = commonUint64;
        UINT64_ARRAY = new LongArrayProtoAdapter(commonUint64);
        ProtoAdapter<Long> commonSint64 = ProtoAdapterKt.commonSint64();
        SINT64 = commonSint64;
        SINT64_ARRAY = new LongArrayProtoAdapter(commonSint64);
        ProtoAdapter<Long> commonFixed64 = ProtoAdapterKt.commonFixed64();
        FIXED64 = commonFixed64;
        FIXED64_ARRAY = new LongArrayProtoAdapter(commonFixed64);
        ProtoAdapter<Long> commonSfixed64 = ProtoAdapterKt.commonSfixed64();
        SFIXED64 = commonSfixed64;
        SFIXED64_ARRAY = new LongArrayProtoAdapter(commonSfixed64);
        FloatProtoAdapter commonFloat = ProtoAdapterKt.commonFloat();
        FLOAT = commonFloat;
        FLOAT_ARRAY = new FloatArrayProtoAdapter(commonFloat);
        DoubleProtoAdapter commonDouble = ProtoAdapterKt.commonDouble();
        DOUBLE = commonDouble;
        DOUBLE_ARRAY = new DoubleArrayProtoAdapter(commonDouble);
        ProtoAdapter<gc2> commonBytes = ProtoAdapterKt.commonBytes();
        BYTES = commonBytes;
        ProtoAdapter<String> commonString = ProtoAdapterKt.commonString();
        STRING = commonString;
        EMPTY = ProtoAdapterKt.commonEmpty();
        STRUCT_MAP = ProtoAdapterKt.commonStructMap();
        STRUCT_LIST = ProtoAdapterKt.commonStructList();
        STRUCT_NULL = ProtoAdapterKt.commonStructNull();
        STRUCT_VALUE = ProtoAdapterKt.commonStructValue();
        DOUBLE_VALUE = ProtoAdapterKt.commonWrapper(commonDouble, "type.googleapis.com/google.protobuf.DoubleValue");
        FLOAT_VALUE = ProtoAdapterKt.commonWrapper(commonFloat, "type.googleapis.com/google.protobuf.FloatValue");
        INT64_VALUE = ProtoAdapterKt.commonWrapper(commonInt64, "type.googleapis.com/google.protobuf.Int64Value");
        UINT64_VALUE = ProtoAdapterKt.commonWrapper(commonUint64, "type.googleapis.com/google.protobuf.UInt64Value");
        INT32_VALUE = ProtoAdapterKt.commonWrapper(commonInt32, "type.googleapis.com/google.protobuf.Int32Value");
        UINT32_VALUE = ProtoAdapterKt.commonWrapper(commonUint32, "type.googleapis.com/google.protobuf.UInt32Value");
        BOOL_VALUE = ProtoAdapterKt.commonWrapper(commonBool, "type.googleapis.com/google.protobuf.BoolValue");
        STRING_VALUE = ProtoAdapterKt.commonWrapper(commonString, "type.googleapis.com/google.protobuf.StringValue");
        BYTES_VALUE = ProtoAdapterKt.commonWrapper(commonBytes, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            unsupportedTypeProtoAdapter = ProtoAdapterKt.commonDuration();
        } catch (NoClassDefFoundError unused) {
            unsupportedTypeProtoAdapter = new Companion.UnsupportedTypeProtoAdapter();
        }
        DURATION = unsupportedTypeProtoAdapter;
        try {
            unsupportedTypeProtoAdapter2 = ProtoAdapterKt.commonInstant();
        } catch (NoClassDefFoundError unused2) {
            unsupportedTypeProtoAdapter2 = new Companion.UnsupportedTypeProtoAdapter();
        }
        INSTANT = unsupportedTypeProtoAdapter2;
    }

    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @Nullable KClass<?> kClass, @Nullable String str, @NotNull Syntax syntax, @Nullable E e, @Nullable String str2) {
        PackedProtoAdapter packedProtoAdapter;
        FieldEncoding fieldEncoding2;
        fieldEncoding.getClass();
        syntax.getClass();
        this.fieldEncoding = fieldEncoding;
        this.type = kClass;
        this.typeUrl = str;
        this.syntax = syntax;
        this.identity = e;
        this.sourceFile = str2;
        boolean z = this instanceof PackedProtoAdapter;
        RepeatedProtoAdapter repeatedProtoAdapter = null;
        if (z || (this instanceof RepeatedProtoAdapter) || fieldEncoding == (fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED)) {
            packedProtoAdapter = null;
        } else {
            if (getFieldEncoding() == fieldEncoding2) {
                a70.p("Unable to pack a length-delimited type.");
                throw null;
            }
            packedProtoAdapter = new PackedProtoAdapter(this);
        }
        this.packedAdapter = packedProtoAdapter;
        if (!(this instanceof RepeatedProtoAdapter) && !z) {
            repeatedProtoAdapter = new RepeatedProtoAdapter(this);
        }
        this.repeatedAdapter = repeatedProtoAdapter;
    }

    @NotNull
    public static final <M extends Message<?, ?>> ProtoAdapter<M> get(@NotNull M m) {
        return INSTANCE.get((Companion) m);
    }

    @NotNull
    public static final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(@NotNull Class<E> cls) {
        return INSTANCE.newEnumAdapter(cls);
    }

    @NotNull
    public static final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(@NotNull ProtoAdapter<K> protoAdapter, @NotNull ProtoAdapter<V> protoAdapter2) {
        return INSTANCE.newMapAdapter(protoAdapter, protoAdapter2);
    }

    @NotNull
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> cls) {
        return INSTANCE.newMessageAdapter(cls);
    }

    @NotNull
    public final ProtoAdapter<List<E>> asPacked() {
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            a70.p("Unable to pack a length-delimited type.");
            return null;
        }
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        a70.m("Can't create a packed adapter from a packed or repeated adapter.");
        return null;
    }

    @NotNull
    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        a70.m("Can't create a repeated adapter from a repeated or packed adapter.");
        return null;
    }

    public abstract E decode(@NotNull ProtoReader reader) throws IOException;

    public final E decode(@NotNull InputStream stream) throws IOException {
        stream.getClass();
        return decode(new lof(f6a.I(stream)));
    }

    public abstract void encode(@NotNull ProtoWriter writer, E value) throws IOException;

    public final void encode(@NotNull OutputStream stream, E value) throws IOException {
        stream.getClass();
        kof kofVar = new kof(new wk0(stream, new pij()));
        encode((k62) kofVar, (kof) value);
        kofVar.h();
    }

    @NotNull
    public final gc2 encodeByteString(E value) {
        x52 x52Var = new x52();
        encode((k62) x52Var, (x52) value);
        return x52Var.l0(x52Var.b);
    }

    public void encodeWithTag(@NotNull ReverseProtoWriter writer, int tag, @Nullable E value) throws IOException {
        writer.getClass();
        if (value != null) {
            if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
                int byteCount = writer.getByteCount();
                encode(writer, (ReverseProtoWriter) value);
                writer.writeVarint32(writer.getByteCount() - byteCount);
            } else {
                encode(writer, (ReverseProtoWriter) value);
            }
            writer.writeTag(tag, getFieldEncoding());
        }
    }

    public abstract int encodedSize(E value);

    public int encodedSizeWithTag(int tag, @Nullable E value) {
        if (value == null) {
            return 0;
        }
        int encodedSize = encodedSize(value);
        if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            encodedSize += ProtoWriter.INSTANCE.varint32Size$wire_runtime(encodedSize);
        }
        return ProtoWriter.INSTANCE.tagSize$wire_runtime(tag) + encodedSize;
    }

    @NotNull
    /* renamed from: getFieldEncoding$wire_runtime, reason: from getter */
    public final FieldEncoding getFieldEncoding() {
        return this.fieldEncoding;
    }

    @Nullable
    public final E getIdentity() {
        return this.identity;
    }

    @Nullable
    public final ProtoAdapter<List<E>> getPackedAdapter$wire_runtime() {
        return this.packedAdapter;
    }

    @Nullable
    public final ProtoAdapter<List<E>> getRepeatedAdapter$wire_runtime() {
        return this.repeatedAdapter;
    }

    @Nullable
    public final String getSourceFile() {
        return this.sourceFile;
    }

    @NotNull
    public final Syntax getSyntax() {
        return this.syntax;
    }

    @Nullable
    public final KClass<?> getType() {
        return this.type;
    }

    @Nullable
    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final boolean isStruct$wire_runtime() {
        return equals(STRUCT_MAP) || equals(STRUCT_LIST) || equals(STRUCT_VALUE) || equals(STRUCT_NULL);
    }

    public abstract E redact(E value);

    @NotNull
    public String toString(E value) {
        return String.valueOf(value);
    }

    public final void tryDecode(@NotNull ProtoReader reader, @NotNull List<E> destination) throws IOException {
        reader.getClass();
        destination.getClass();
        if (reader.beforePossiblyPackedScalar$wire_runtime()) {
            destination.add(decode(reader));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ProtoAdapter<?> withLabel$wire_runtime(@NotNull WireField.Label label) {
        label.getClass();
        return label.isRepeated() ? label.isPacked() ? asPacked() : asRepeated() : this;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\u0006\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJO\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013JW\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0012\u0010\u0016J_\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0012\u0010\u0019Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u0012\u0010\u001cJ-\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001f\"\b\b\u0001\u0010\u001e*\u00020\u001d2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0007¢\u0006\u0004\b \u0010!J/\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0010\b\u0001\u0010\r*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\"\u001a\u00028\u0001H\u0007¢\u0006\u0004\b#\u0010$J)\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0007¢\u0006\u0004\b#\u0010\u0013J\u001b\u0010#\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010%\u001a\u00020\u0014H\u0007¢\u0006\u0004\b#\u0010&J%\u0010#\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010%\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b#\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010*R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020-0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010*R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010*R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020-0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010*R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010*R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020-0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010*R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010*R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020-0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010*R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010*R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010*R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010*R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010*R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010*R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010*R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010*R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010*R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010*R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010*R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010*R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010*R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010*R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010*R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010*R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00140\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010*R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010*R&\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0002\b\u0003\u0018\u00010\t0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010*R \u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010Q0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010*R\u001c\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010*R\u001c\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010*R\u001c\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010*R\u001c\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010*R\u001c\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010*R\u001c\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010*R\u001c\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010*R\u001c\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010*R\u001c\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010*R\u001c\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010*R\u001c\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010*R\u001e\u0010a\u001a\f\u0012\b\u0012\u00060_j\u0002``0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010*R\u001e\u0010d\u001a\f\u0012\b\u0012\u00060bj\u0002`c0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010*¨\u0006f"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$Companion;", "", "<init>", "()V", PlayerKt.AMERICAN_FOOTBALL_KICKER, "V", "Lcom/squareup/wire/ProtoAdapter;", "keyAdapter", "valueAdapter", "", "newMapAdapter", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/Message;", PlayerKt.FOOTBALL_MIDFIELDER, "Lcom/squareup/wire/Message$Builder;", "B", "Ljava/lang/Class;", "type", "newMessageAdapter", "(Ljava/lang/Class;)Lcom/squareup/wire/ProtoAdapter;", "", "typeUrl", "(Ljava/lang/Class;Ljava/lang/String;)Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/Syntax;", "syntax", "(Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;)Lcom/squareup/wire/ProtoAdapter;", "Ljava/lang/ClassLoader;", "classLoader", "(Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/Syntax;Ljava/lang/ClassLoader;)Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/WireEnum;", "E", "Lcom/squareup/wire/EnumAdapter;", "newEnumAdapter", "(Ljava/lang/Class;)Lcom/squareup/wire/EnumAdapter;", PglCryptUtils.KEY_MESSAGE, "get", "(Lcom/squareup/wire/Message;)Lcom/squareup/wire/ProtoAdapter;", "adapterString", "(Ljava/lang/String;)Lcom/squareup/wire/ProtoAdapter;", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Lcom/squareup/wire/ProtoAdapter;", "", "BOOL", "Lcom/squareup/wire/ProtoAdapter;", "", "INT32", "", "INT32_ARRAY", "UINT32", "UINT32_ARRAY", "SINT32", "SINT32_ARRAY", "FIXED32", "FIXED32_ARRAY", "SFIXED32", "SFIXED32_ARRAY", "", "INT64", "", "INT64_ARRAY", "UINT64", "UINT64_ARRAY", "SINT64", "SINT64_ARRAY", "FIXED64", "FIXED64_ARRAY", "SFIXED64", "SFIXED64_ARRAY", "", "FLOAT", "", "FLOAT_ARRAY", "", "DOUBLE", "", "DOUBLE_ARRAY", "Lgc2;", "BYTES", "STRING", "", "EMPTY", "STRUCT_MAP", "", "STRUCT_LIST", "", "STRUCT_NULL", "STRUCT_VALUE", "DOUBLE_VALUE", "FLOAT_VALUE", "INT64_VALUE", "UINT64_VALUE", "INT32_VALUE", "UINT32_VALUE", "BOOL_VALUE", "STRING_VALUE", "BYTES_VALUE", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "DURATION", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "INSTANT", "UnsupportedTypeProtoAdapter", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <M> ProtoAdapter<M> get(@NotNull Class<M> type) {
            type.getClass();
            try {
                Object obj = type.getField("ADAPTER").get(null);
                obj.getClass();
                return (ProtoAdapter) obj;
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e);
            } catch (NoSuchFieldException e2) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e2);
            }
        }

        @NotNull
        public final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(@NotNull Class<E> type) {
            type.getClass();
            return new RuntimeEnumAdapter(type);
        }

        @NotNull
        public final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(@NotNull ProtoAdapter<K> keyAdapter, @NotNull ProtoAdapter<V> valueAdapter) {
            keyAdapter.getClass();
            valueAdapter.getClass();
            return new MapProtoAdapter(keyAdapter, valueAdapter);
        }

        @NotNull
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> type, @NotNull String typeUrl, @NotNull Syntax syntax) {
            type.getClass();
            typeUrl.getClass();
            syntax.getClass();
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, syntax, null, false, false, 56, null);
        }

        private Companion() {
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$Companion$UnsupportedTypeProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", "redact", U3.i.X, "encodedSize", "encode", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "Lcom/squareup/wire/ProtoReader32;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UnsupportedTypeProtoAdapter extends ProtoAdapter {
            public UnsupportedTypeProtoAdapter() {
                super(FieldEncoding.LENGTH_DELIMITED, (KClass<?>) duf.a.getOrCreateKotlinClass(Void.class));
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Void decode(@NotNull ProtoReader reader) {
                reader.getClass();
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Void encode(@NotNull ProtoWriter writer, @NotNull Void value) {
                writer.getClass();
                value.getClass();
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return ((Number) encodedSize((Void) obj)).intValue();
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Void redact(@NotNull Void value) {
                value.getClass();
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Void decode(@NotNull ProtoReader32 reader) {
                reader.getClass();
                throw new IllegalStateException("Operation not supported.");
            }

            @NotNull
            public Void encodedSize(@NotNull Void value) {
                value.getClass();
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            @NotNull
            public Void encode(@NotNull ReverseProtoWriter writer, @NotNull Void value) {
                writer.getClass();
                value.getClass();
                throw new IllegalStateException("Operation not supported.");
            }
        }

        @NotNull
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> type, @NotNull String typeUrl) {
            type.getClass();
            typeUrl.getClass();
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, Syntax.PROTO_2, null, false, false, 56, null);
        }

        @NotNull
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> type) {
            type.getClass();
            return ReflectionKt.createRuntimeMessageAdapter$default(type, null, Syntax.PROTO_2, null, false, false, 56, null);
        }

        @NotNull
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> type, @NotNull String typeUrl, @NotNull Syntax syntax, @Nullable ClassLoader classLoader) {
            type.getClass();
            typeUrl.getClass();
            syntax.getClass();
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, syntax, classLoader, false, false, 48, null);
        }

        @NotNull
        public final <M extends Message<?, ?>> ProtoAdapter<M> get(@NotNull M message) {
            message.getClass();
            return get(message.getClass());
        }

        @NotNull
        public final ProtoAdapter<?> get(@NotNull String adapterString) {
            adapterString.getClass();
            return get(adapterString, ProtoAdapter.class.getClassLoader());
        }

        @NotNull
        public final ProtoAdapter<?> get(@NotNull String adapterString, @Nullable ClassLoader classLoader) {
            adapterString.getClass();
            try {
                int O = StringsKt.O(adapterString, '#', 0, 6);
                String substring = adapterString.substring(0, O);
                Object obj = Class.forName(substring, true, classLoader).getField(adapterString.substring(O + 1)).get(null);
                obj.getClass();
                return (ProtoAdapter) obj;
            } catch (ClassNotFoundException e) {
                throw new IllegalArgumentException("failed to access ".concat(adapterString), e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("failed to access ".concat(adapterString), e2);
            } catch (NoSuchFieldException e3) {
                throw new IllegalArgumentException("failed to access ".concat(adapterString), e3);
            }
        }
    }

    @NotNull
    public static final <M> ProtoAdapter<M> get(@NotNull Class<M> cls) {
        return INSTANCE.get(cls);
    }

    @NotNull
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> cls, @NotNull String str) {
        return INSTANCE.newMessageAdapter(cls, str);
    }

    @NotNull
    public static final ProtoAdapter<?> get(@NotNull String str) {
        return INSTANCE.get(str);
    }

    @NotNull
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> cls, @NotNull String str, @NotNull Syntax syntax) {
        return INSTANCE.newMessageAdapter(cls, str, syntax);
    }

    @NotNull
    public static final ProtoAdapter<?> get(@NotNull String str, @Nullable ClassLoader classLoader) {
        return INSTANCE.get(str, classLoader);
    }

    @NotNull
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> cls, @NotNull String str, @NotNull Syntax syntax, @Nullable ClassLoader classLoader) {
        return INSTANCE.newMessageAdapter(cls, str, syntax, classLoader);
    }

    public E decode(@NotNull ProtoReader32 reader) throws IOException {
        reader.getClass();
        return decode(reader.asProtoReader());
    }

    public final E decode(@NotNull byte[] bytes) throws IOException {
        bytes.getClass();
        return decode(ProtoReader32Kt.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public final E decode(@NotNull gc2 bytes) throws IOException {
        bytes.getClass();
        return decode(ProtoReader32Kt.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public final E decode(@NotNull l62 source) throws IOException {
        source.getClass();
        return decode(new ProtoReader(source));
    }

    public final void tryDecode(@NotNull ProtoReader32 reader, @NotNull List<E> destination) throws IOException {
        reader.getClass();
        destination.getClass();
        if (reader.beforePossiblyPackedScalar()) {
            destination.add(decode(reader));
        }
    }

    public void encode(@NotNull ReverseProtoWriter writer, E value) throws IOException {
        writer.getClass();
        writer.writeForward$wire_runtime(new ProtoAdapterKt$delegateEncode$1(this, value));
    }

    public final void encode(@NotNull k62 sink, E value) throws IOException {
        sink.getClass();
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        encode(reverseProtoWriter, (ReverseProtoWriter) value);
        reverseProtoWriter.writeTo(sink);
    }

    @NotNull
    public final byte[] encode(E value) {
        x52 x52Var = new x52();
        encode((k62) x52Var, (x52) value);
        return x52Var.j0(x52Var.b);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u0007\u0010\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", U3.i.X, "", "type", "Lkotlin/reflect/KClass;", "<init>", "(ILkotlin/reflect/KClass;)V", "Ljava/lang/Class;", "(ILjava/lang/Class;)V", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public EnumConstantNotFoundException(int i, @Nullable KClass<?> kClass) {
            super(r0.toString());
            StringBuilder t = lnb.t(i, "Unknown enum tag ", " for ");
            t.append(kClass != null ? sha.x(kClass).getName() : null);
            this.value = i;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public EnumConstantNotFoundException(int i, @NotNull Class<?> cls) {
            this(i, (KClass<?>) sha.A(cls));
            cls.getClass();
        }
    }

    public void encodeWithTag(@NotNull ProtoWriter writer, int tag, @Nullable E value) throws IOException {
        writer.getClass();
        if (value != null) {
            writer.writeTag(tag, getFieldEncoding());
            if (getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
                writer.writeVarint32(encodedSize(value));
            }
            encode(writer, (ProtoWriter) value);
        }
    }

    public /* synthetic */ ProtoAdapter(FieldEncoding fieldEncoding, KClass kClass, String str, Syntax syntax, Object obj, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldEncoding, (KClass<?>) kClass, str, syntax, (i & 16) != 0 ? null : obj, (i & 32) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @NotNull Class<?> cls) {
        this(fieldEncoding, (KClass<?>) sha.A(cls));
        fieldEncoding.getClass();
        cls.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @NotNull Class<?> cls, @Nullable String str) {
        this(fieldEncoding, (KClass<?>) sha.A(cls), str, Syntax.PROTO_2);
        fieldEncoding.getClass();
        cls.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @NotNull Class<?> cls, @Nullable String str, @NotNull Syntax syntax) {
        this(fieldEncoding, (KClass<?>) sha.A(cls), str, syntax);
        fieldEncoding.getClass();
        cls.getClass();
        syntax.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @NotNull Class<?> cls, @Nullable String str, @NotNull Syntax syntax, @Nullable E e) {
        this(fieldEncoding, (KClass<?>) sha.A(cls), str, syntax, e, (String) null);
        fieldEncoding.getClass();
        cls.getClass();
        syntax.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @Nullable KClass<?> kClass) {
        this(fieldEncoding, kClass, (String) null, Syntax.PROTO_2);
        fieldEncoding.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @Nullable KClass<?> kClass, @Nullable String str) {
        this(fieldEncoding, kClass, str, Syntax.PROTO_2);
        fieldEncoding.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @Nullable KClass<?> kClass, @Nullable String str, @NotNull Syntax syntax) {
        this(fieldEncoding, kClass, str, syntax, (Object) null);
        fieldEncoding.getClass();
        syntax.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @Nullable KClass<?> kClass, @Nullable String str, @NotNull Syntax syntax, @Nullable E e) {
        this(fieldEncoding, kClass, str, syntax, e, (String) null);
        fieldEncoding.getClass();
        syntax.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(@NotNull FieldEncoding fieldEncoding, @NotNull Class<?> cls, @Nullable String str, @NotNull Syntax syntax, @Nullable E e, @Nullable String str2) {
        this(fieldEncoding, (KClass<?>) sha.A(cls), str, syntax, e, str2);
        fieldEncoding.getClass();
        cls.getClass();
        syntax.getClass();
    }
}
