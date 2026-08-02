package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.ReflectionKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import okio.ByteString;
import xsna.an8;
import xsna.bn8;
import xsna.d8f0;
import xsna.dcy;
import xsna.drm0;
import xsna.e8f0;
import xsna.epx;
import xsna.fpf0;
import xsna.ji;
import xsna.mq9;
import xsna.pfc;
import xsna.s3q0;
import xsna.vl8;
import xsna.zcl;

/* compiled from: ProtoAdapter.kt */
/* loaded from: classes14.dex */
public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<Boolean> BOOL_VALUE;
    public static final ProtoAdapter<ByteString> BYTES;
    public static final ProtoAdapter<ByteString> BYTES_VALUE;
    public static final Companion Companion = new Companion(null);
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<Double> DOUBLE_VALUE;
    public static final ProtoAdapter<Duration> DURATION;
    public static final ProtoAdapter<s3q0> EMPTY;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<Long> FIXED64;
    public static final ProtoAdapter<Float> FLOAT;
    public static final ProtoAdapter<Float> FLOAT_VALUE;
    public static final ProtoAdapter<Instant> INSTANT;
    public static final ProtoAdapter<Integer> INT32;
    public static final ProtoAdapter<Integer> INT32_VALUE;
    public static final ProtoAdapter<Long> INT64;
    public static final ProtoAdapter<Long> INT64_VALUE;
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<Integer> SINT32;
    public static final ProtoAdapter<Long> SINT64;
    public static final ProtoAdapter<String> STRING;
    public static final ProtoAdapter<String> STRING_VALUE;
    public static final ProtoAdapter<List<?>> STRUCT_LIST;
    public static final ProtoAdapter<Map<String, ?>> STRUCT_MAP;
    public static final ProtoAdapter STRUCT_NULL;
    public static final ProtoAdapter<Object> STRUCT_VALUE;
    public static final ProtoAdapter<Integer> UINT32;
    public static final ProtoAdapter<Integer> UINT32_VALUE;
    public static final ProtoAdapter<Long> UINT64;
    public static final ProtoAdapter<Long> UINT64_VALUE;
    private final FieldEncoding fieldEncoding;
    private final E identity;
    private final ProtoAdapter<List<E>> packedAdapter;
    private final ProtoAdapter<List<E>> repeatedAdapter;
    private final String sourceFile;
    private final Syntax syntax;
    private final dcy<?> type;
    private final String typeUrl;

    /* compiled from: ProtoAdapter.kt */
    public static final class Companion {

        /* compiled from: ProtoAdapter.kt */
        public static final class UnsupportedTypeProtoAdapter extends ProtoAdapter {
            public UnsupportedTypeProtoAdapter() {
                super(FieldEncoding.LENGTH_DELIMITED, fpf0.a(Void.class));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return ((Number) encodedSize((Void) obj)).intValue();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader protoReader) {
                throw new IllegalStateException("Operation not supported.");
            }

            public Void encodedSize(Void r2) {
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void redact(Void r2) {
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void encode(ProtoWriter protoWriter, Void r2) {
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void encode(ReverseProtoWriter reverseProtoWriter, Void r2) {
                throw new IllegalStateException("Operation not supported.");
            }
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final <M extends Message<?, ?>> ProtoAdapter<M> get(M m) {
            return get(m.getClass());
        }

        public final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(Class<E> cls) {
            return new RuntimeEnumAdapter(cls);
        }

        public final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            return new MapProtoAdapter(protoAdapter, protoAdapter2);
        }

        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
            return ReflectionKt.createRuntimeMessageAdapter$default(cls, null, Syntax.PROTO_2, false, 8, null);
        }

        private Companion() {
        }

        public final <M> ProtoAdapter<M> get(Class<M> cls) {
            try {
                Object obj = cls.getField("ADAPTER").get(null);
                if (obj != null) {
                    return (ProtoAdapter) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<M of com.squareup.wire.ProtoAdapter.Companion.get>");
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException("failed to access " + ((Object) cls.getName()) + "#ADAPTER", e);
            } catch (NoSuchFieldException e2) {
                throw new IllegalArgumentException("failed to access " + ((Object) cls.getName()) + "#ADAPTER", e2);
            }
        }

        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str) {
            return ReflectionKt.createRuntimeMessageAdapter$default(cls, str, Syntax.PROTO_2, false, 8, null);
        }

        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str, Syntax syntax) {
            return ReflectionKt.createRuntimeMessageAdapter$default(cls, str, syntax, false, 8, null);
        }

        public final ProtoAdapter<?> get(String str) {
            try {
                int L = drm0.L(str, '#', 0, 6);
                String substring = str.substring(0, L);
                Object obj = Class.forName(substring).getField(str.substring(L + 1)).get(null);
                if (obj != null) {
                    return (ProtoAdapter) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            } catch (ClassNotFoundException e) {
                throw new IllegalArgumentException(epx.j(str, "failed to access "), e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException(epx.j(str, "failed to access "), e2);
            } catch (NoSuchFieldException e3) {
                throw new IllegalArgumentException(epx.j(str, "failed to access "), e3);
            }
        }
    }

    static {
        ProtoAdapter<Duration> unsupportedTypeProtoAdapter;
        ProtoAdapter<Instant> unsupportedTypeProtoAdapter2;
        ProtoAdapter<Boolean> commonBool = ProtoAdapterKt.commonBool();
        BOOL = commonBool;
        ProtoAdapter<Integer> commonInt32 = ProtoAdapterKt.commonInt32();
        INT32 = commonInt32;
        ProtoAdapter<Integer> commonUint32 = ProtoAdapterKt.commonUint32();
        UINT32 = commonUint32;
        SINT32 = ProtoAdapterKt.commonSint32();
        FIXED32 = ProtoAdapterKt.commonFixed32();
        SFIXED32 = ProtoAdapterKt.commonSfixed32();
        ProtoAdapter<Long> commonInt64 = ProtoAdapterKt.commonInt64();
        INT64 = commonInt64;
        ProtoAdapter<Long> commonUint64 = ProtoAdapterKt.commonUint64();
        UINT64 = commonUint64;
        SINT64 = ProtoAdapterKt.commonSint64();
        FIXED64 = ProtoAdapterKt.commonFixed64();
        SFIXED64 = ProtoAdapterKt.commonSfixed64();
        ProtoAdapter<Float> commonFloat = ProtoAdapterKt.commonFloat();
        FLOAT = commonFloat;
        ProtoAdapter<Double> commonDouble = ProtoAdapterKt.commonDouble();
        DOUBLE = commonDouble;
        ProtoAdapter<ByteString> commonBytes = ProtoAdapterKt.commonBytes();
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

    public ProtoAdapter(FieldEncoding fieldEncoding, dcy<?> dcyVar, String str, Syntax syntax, E e, String str2) {
        PackedProtoAdapter packedProtoAdapter;
        FieldEncoding fieldEncoding2;
        this.fieldEncoding = fieldEncoding;
        this.type = dcyVar;
        this.typeUrl = str;
        this.syntax = syntax;
        this.identity = e;
        this.sourceFile = str2;
        boolean z = this instanceof PackedProtoAdapter;
        RepeatedProtoAdapter repeatedProtoAdapter = null;
        if (z || (this instanceof RepeatedProtoAdapter) || fieldEncoding == (fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED)) {
            packedProtoAdapter = null;
        } else {
            if (getFieldEncoding$wire_runtime() == fieldEncoding2) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.");
            }
            packedProtoAdapter = new PackedProtoAdapter(this);
        }
        this.packedAdapter = packedProtoAdapter;
        if (!(this instanceof RepeatedProtoAdapter) && !z) {
            repeatedProtoAdapter = new RepeatedProtoAdapter(this);
        }
        this.repeatedAdapter = repeatedProtoAdapter;
    }

    public static final <M extends Message<?, ?>> ProtoAdapter<M> get(M m) {
        return Companion.get((Companion) m);
    }

    public static final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(Class<E> cls) {
        return Companion.newEnumAdapter(cls);
    }

    public static final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return Companion.newMapAdapter(protoAdapter, protoAdapter2);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        return Companion.newMessageAdapter(cls);
    }

    public final ProtoAdapter<List<E>> asPacked() {
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            throw new IllegalArgumentException("Unable to pack a length-delimited type.");
        }
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a packed adapter from a packed or repeated adapter.");
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public abstract E decode(ProtoReader protoReader) throws IOException;

    public final E decode(InputStream inputStream) throws IOException {
        return decode(new e8f0(mq9.d(inputStream)));
    }

    public abstract void encode(ProtoWriter protoWriter, E e) throws IOException;

    public final void encode(OutputStream outputStream, E e) throws IOException {
        d8f0 d8f0Var = new d8f0(mq9.b(outputStream));
        encode((an8) d8f0Var, (d8f0) e);
        d8f0Var.t3();
    }

    public final ByteString encodeByteString(E e) {
        vl8 vl8Var = new vl8();
        encode((an8) vl8Var, (vl8) e);
        return vl8Var.F0(vl8Var.c);
    }

    public void encodeWithTag(ProtoWriter protoWriter, int i, E e) throws IOException {
        if (e == null) {
            return;
        }
        protoWriter.writeTag(i, getFieldEncoding$wire_runtime());
        if (getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            protoWriter.writeVarint32(encodedSize(e));
        }
        encode(protoWriter, (ProtoWriter) e);
    }

    public abstract int encodedSize(E e);

    public int encodedSizeWithTag(int i, E e) {
        if (e == null) {
            return 0;
        }
        int encodedSize = encodedSize(e);
        if (getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            encodedSize += ProtoWriter.Companion.varint32Size$wire_runtime(encodedSize);
        }
        return ProtoWriter.Companion.tagSize$wire_runtime(i) + encodedSize;
    }

    public final FieldEncoding getFieldEncoding$wire_runtime() {
        return this.fieldEncoding;
    }

    public final E getIdentity() {
        return this.identity;
    }

    public final ProtoAdapter<List<E>> getPackedAdapter$wire_runtime() {
        return this.packedAdapter;
    }

    public final ProtoAdapter<List<E>> getRepeatedAdapter$wire_runtime() {
        return this.repeatedAdapter;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final Syntax getSyntax() {
        return this.syntax;
    }

    public final dcy<?> getType() {
        return this.type;
    }

    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final boolean isStruct$wire_runtime() {
        return equals(STRUCT_MAP) || equals(STRUCT_LIST) || equals(STRUCT_VALUE) || equals(STRUCT_NULL);
    }

    public abstract E redact(E e);

    public String toString(E e) {
        return String.valueOf(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ProtoAdapter<?> withLabel$wire_runtime(WireField.Label label) {
        return label.isRepeated() ? label.isPacked() ? asPacked() : asRepeated() : this;
    }

    /* compiled from: ProtoAdapter.kt */
    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        public EnumConstantNotFoundException(int i, Class<?> cls) {
            this(i, fpf0.a(cls));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public EnumConstantNotFoundException(int i, dcy<?> dcyVar) {
            super(r0.toString());
            Class<?> a;
            StringBuilder b = ji.b(i, "Unknown enum tag ", " for ");
            String str = null;
            if (dcyVar != null && (a = ((pfc) dcyVar).a()) != null) {
                str = a.getName();
            }
            b.append((Object) str);
            this.value = i;
        }
    }

    public static final <M> ProtoAdapter<M> get(Class<M> cls) {
        return Companion.get(cls);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str) {
        return Companion.newMessageAdapter(cls, str);
    }

    public static final ProtoAdapter<?> get(String str) {
        return Companion.get(str);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str, Syntax syntax) {
        return Companion.newMessageAdapter(cls, str, syntax);
    }

    public final E decode(byte[] bArr) throws IOException {
        vl8 vl8Var = new vl8();
        vl8Var.write(bArr, 0, bArr.length);
        return decode(vl8Var);
    }

    public void encode(ReverseProtoWriter reverseProtoWriter, E e) throws IOException {
        reverseProtoWriter.writeForward$wire_runtime(new ProtoAdapterKt$delegateEncode$1(this, e));
    }

    public void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i, E e) throws IOException {
        if (e == null) {
            return;
        }
        if (getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            int byteCount = reverseProtoWriter.getByteCount();
            encode(reverseProtoWriter, (ReverseProtoWriter) e);
            reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        } else {
            encode(reverseProtoWriter, (ReverseProtoWriter) e);
        }
        reverseProtoWriter.writeTag(i, getFieldEncoding$wire_runtime());
    }

    public final void encode(an8 an8Var, E e) throws IOException {
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        encode(reverseProtoWriter, (ReverseProtoWriter) e);
        reverseProtoWriter.writeTo(an8Var);
    }

    public final E decode(ByteString byteString) throws IOException {
        vl8 vl8Var = new vl8();
        vl8Var.H(byteString);
        return decode(vl8Var);
    }

    public final E decode(bn8 bn8Var) throws IOException {
        return decode(new ProtoReader(bn8Var));
    }

    public final byte[] encode(E e) {
        vl8 vl8Var = new vl8();
        encode((an8) vl8Var, (vl8) e);
        return vl8Var.v(vl8Var.c);
    }

    public /* synthetic */ ProtoAdapter(FieldEncoding fieldEncoding, dcy dcyVar, String str, Syntax syntax, Object obj, String str2, int i, zcl zclVar) {
        this(fieldEncoding, (dcy<?>) dcyVar, str, syntax, (i & 16) != 0 ? null : obj, (i & 32) != 0 ? null : str2);
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, dcy<?> dcyVar) {
        this(fieldEncoding, dcyVar, (String) null, Syntax.PROTO_2);
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, dcy<?> dcyVar, String str) {
        this(fieldEncoding, dcyVar, str, Syntax.PROTO_2);
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, dcy<?> dcyVar, String str, Syntax syntax) {
        this(fieldEncoding, dcyVar, str, syntax, (Object) null);
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls) {
        this(fieldEncoding, fpf0.a(cls));
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls, String str) {
        this(fieldEncoding, fpf0.a(cls), str, Syntax.PROTO_2);
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls, String str, Syntax syntax) {
        this(fieldEncoding, fpf0.a(cls), str, syntax);
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls, String str, Syntax syntax, E e) {
        this(fieldEncoding, fpf0.a(cls), str, syntax, e, (String) null);
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls, String str, Syntax syntax, E e, String str2) {
        this(fieldEncoding, fpf0.a(cls), str, syntax, e, str2);
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, dcy<?> dcyVar, String str, Syntax syntax, E e) {
        this(fieldEncoding, dcyVar, str, syntax, e, (String) null);
    }
}
