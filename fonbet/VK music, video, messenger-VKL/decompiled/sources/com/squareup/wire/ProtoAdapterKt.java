package com.squareup.wire;

import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.an8;
import xsna.bn8;
import xsna.c5g;
import xsna.dcy;
import xsna.epx;
import xsna.fpf0;
import xsna.on00;
import xsna.rfc;
import xsna.rl3;
import xsna.s1v;
import xsna.s3q0;
import xsna.vl8;

/* compiled from: ProtoAdapter.kt */
/* loaded from: classes14.dex */
public final class ProtoAdapterKt {
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final int FIXED_BOOL_SIZE = 1;

    public static final ProtoAdapter<Boolean> commonBool() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final rfc a = fpf0.a(Boolean.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Boolean>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonBool$1
            {
                Boolean bool = Boolean.FALSE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Boolean bool) {
                encode(protoWriter, bool.booleanValue());
            }

            public int encodedSize(boolean z) {
                return 1;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Boolean redact(Boolean bool) {
                return redact(bool.booleanValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader protoReader) throws IOException {
                return Boolean.valueOf(protoReader.readVarint32() != 0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Boolean bool) {
                encode(reverseProtoWriter, bool.booleanValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Boolean bool) {
                return encodedSize(bool.booleanValue());
            }

            public Boolean redact(boolean z) {
                throw new UnsupportedOperationException();
            }

            public void encode(ProtoWriter protoWriter, boolean z) throws IOException {
                protoWriter.writeVarint32(z ? 1 : 0);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, boolean z) throws IOException {
                reverseProtoWriter.writeVarint32(z ? 1 : 0);
            }
        };
    }

    public static final ProtoAdapter<ByteString> commonBytes() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final rfc a = fpf0.a(ByteString.class);
        final Syntax syntax = Syntax.PROTO_2;
        final ByteString byteString = ByteString.d;
        return new ProtoAdapter<ByteString>(fieldEncoding, a, syntax, byteString) { // from class: com.squareup.wire.ProtoAdapterKt$commonBytes$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ByteString byteString2) {
                return byteString2.n();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ByteString decode(ProtoReader protoReader) throws IOException {
                return protoReader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ByteString redact(ByteString byteString2) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, ByteString byteString2) throws IOException {
                protoWriter.writeBytes(byteString2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, ByteString byteString2) throws IOException {
                reverseProtoWriter.writeBytes(byteString2);
            }
        };
    }

    public static final <E> ProtoAdapter<List<E>> commonCreatePacked(ProtoAdapter<E> protoAdapter) {
        if (protoAdapter.getFieldEncoding$wire_runtime() != FieldEncoding.LENGTH_DELIMITED) {
            return new PackedProtoAdapter(protoAdapter);
        }
        throw new IllegalArgumentException("Unable to pack a length-delimited type.");
    }

    public static final <E> ProtoAdapter<List<E>> commonCreateRepeated(ProtoAdapter<E> protoAdapter) {
        return new RepeatedProtoAdapter(protoAdapter);
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, byte[] bArr) {
        vl8 vl8Var = new vl8();
        vl8Var.write(bArr, 0, bArr.length);
        return protoAdapter.decode(vl8Var);
    }

    public static final ProtoAdapter<Double> commonDouble() {
        final FieldEncoding fieldEncoding = FieldEncoding.FIXED64;
        final rfc a = fpf0.a(Double.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Double>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonDouble$1
            {
                Double valueOf = Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Double d) {
                encode(protoWriter, d.doubleValue());
            }

            public int encodedSize(double d) {
                return 8;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Double redact(Double d) {
                return redact(d.doubleValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Double decode(ProtoReader protoReader) throws IOException {
                return Double.valueOf(Double.longBitsToDouble(protoReader.readFixed64()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Double d) {
                encode(reverseProtoWriter, d.doubleValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Double d) {
                return encodedSize(d.doubleValue());
            }

            public Double redact(double d) {
                throw new UnsupportedOperationException();
            }

            public void encode(ProtoWriter protoWriter, double d) throws IOException {
                protoWriter.writeFixed64(Double.doubleToLongBits(d));
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, double d) throws IOException {
                reverseProtoWriter.writeFixed64(Double.doubleToLongBits(d));
            }
        };
    }

    public static final ProtoAdapter<Duration> commonDuration() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final rfc a = fpf0.a(Duration.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Duration>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonDuration$1
            private final int getSameSignNanos(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - 1000000000;
            }

            private final long getSameSignSeconds(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration redact(Duration duration) {
                return duration;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration decode(ProtoReader protoReader) {
                long beginMessage = protoReader.beginMessage();
                long j = 0;
                int i = 0;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(beginMessage);
                        return Duration.ofSeconds(j, i);
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.INT64.decode(protoReader).longValue();
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        i = ProtoAdapter.INT32.decode(protoReader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Duration duration) {
                long sameSignSeconds = getSameSignSeconds(duration);
                int encodedSizeWithTag = sameSignSeconds != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(sameSignSeconds)) : 0;
                int sameSignNanos = getSameSignNanos(duration);
                return sameSignNanos != 0 ? ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(sameSignNanos)) + encodedSizeWithTag : encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Duration duration) {
                long sameSignSeconds = getSameSignSeconds(duration);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, (int) Long.valueOf(sameSignSeconds));
                }
                int sameSignNanos = getSameSignNanos(duration);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, (int) Integer.valueOf(sameSignNanos));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, Duration duration) {
                int sameSignNanos = getSameSignNanos(duration);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, (int) Integer.valueOf(sameSignNanos));
                }
                long sameSignSeconds = getSameSignSeconds(duration);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, (int) Long.valueOf(sameSignSeconds));
                }
            }
        };
    }

    public static final ProtoAdapter<s3q0> commonEmpty() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final rfc a = fpf0.a(s3q0.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<s3q0>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonEmpty$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ s3q0 decode(ProtoReader protoReader) {
                decode2(protoReader);
                return s3q0.a;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ s3q0 redact(s3q0 s3q0Var) {
                redact2(s3q0Var);
                return s3q0.a;
            }

            /* renamed from: decode, reason: avoid collision after fix types in other method */
            public void decode2(ProtoReader protoReader) {
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(beginMessage);
                        return;
                    }
                    protoReader.readUnknownField(nextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(s3q0 s3q0Var) {
                return 0;
            }

            /* renamed from: redact, reason: avoid collision after fix types in other method */
            public void redact2(s3q0 s3q0Var) {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, s3q0 s3q0Var) {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, s3q0 s3q0Var) {
            }
        };
    }

    public static final <E> void commonEncode(ProtoAdapter<E> protoAdapter, an8 an8Var, E e) {
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        protoAdapter.encode(reverseProtoWriter, (ReverseProtoWriter) e);
        reverseProtoWriter.writeTo(an8Var);
    }

    public static final <E> ByteString commonEncodeByteString(ProtoAdapter<E> protoAdapter, E e) {
        vl8 vl8Var = new vl8();
        protoAdapter.encode((an8) vl8Var, (vl8) e);
        return vl8Var.F0(vl8Var.c);
    }

    public static final <E> void commonEncodeWithTag(ProtoAdapter<E> protoAdapter, ProtoWriter protoWriter, int i, E e) {
        if (e == null) {
            return;
        }
        protoWriter.writeTag(i, protoAdapter.getFieldEncoding$wire_runtime());
        if (protoAdapter.getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            protoWriter.writeVarint32(protoAdapter.encodedSize(e));
        }
        protoAdapter.encode(protoWriter, (ProtoWriter) e);
    }

    public static final <E> int commonEncodedSizeWithTag(ProtoAdapter<E> protoAdapter, int i, E e) {
        if (e == null) {
            return 0;
        }
        int encodedSize = protoAdapter.encodedSize(e);
        if (protoAdapter.getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            encodedSize += ProtoWriter.Companion.varint32Size$wire_runtime(encodedSize);
        }
        return ProtoWriter.Companion.tagSize$wire_runtime(i) + encodedSize;
    }

    public static final ProtoAdapter<Integer> commonFixed32() {
        final FieldEncoding fieldEncoding = FieldEncoding.FIXED32;
        final rfc a = fpf0.a(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonFixed32$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) {
                encode(protoWriter, num.intValue());
            }

            public int encodedSize(int i) {
                return 4;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(protoReader.readFixed32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            public Integer redact(int i) {
                throw new UnsupportedOperationException();
            }

            public void encode(ProtoWriter protoWriter, int i) throws IOException {
                protoWriter.writeFixed32(i);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, int i) throws IOException {
                reverseProtoWriter.writeFixed32(i);
            }
        };
    }

    public static final ProtoAdapter<Long> commonFixed64() {
        final FieldEncoding fieldEncoding = FieldEncoding.FIXED64;
        final rfc a = fpf0.a(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonFixed64$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) {
                encode(protoWriter, l.longValue());
            }

            public int encodedSize(long j) {
                return 8;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(protoReader.readFixed64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            public Long redact(long j) {
                throw new UnsupportedOperationException();
            }

            public void encode(ProtoWriter protoWriter, long j) throws IOException {
                protoWriter.writeFixed64(j);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, long j) throws IOException {
                reverseProtoWriter.writeFixed64(j);
            }
        };
    }

    public static final ProtoAdapter<Float> commonFloat() {
        final FieldEncoding fieldEncoding = FieldEncoding.FIXED32;
        final rfc a = fpf0.a(Float.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Float>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonFloat$1
            {
                Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Float f) {
                encode(protoWriter, f.floatValue());
            }

            public int encodedSize(float f) {
                return 4;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Float redact(Float f) {
                return redact(f.floatValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Float decode(ProtoReader protoReader) throws IOException {
                return Float.valueOf(Float.intBitsToFloat(protoReader.readFixed32()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Float f) {
                encode(reverseProtoWriter, f.floatValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Float f) {
                return encodedSize(f.floatValue());
            }

            public Float redact(float f) {
                throw new UnsupportedOperationException();
            }

            public void encode(ProtoWriter protoWriter, float f) throws IOException {
                protoWriter.writeFixed32(Float.floatToIntBits(f));
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, float f) throws IOException {
                reverseProtoWriter.writeFixed32(Float.floatToIntBits(f));
            }
        };
    }

    public static final ProtoAdapter<Instant> commonInstant() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final rfc a = fpf0.a(Instant.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Instant>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonInstant$1
            @Override // com.squareup.wire.ProtoAdapter
            public Instant redact(Instant instant) {
                return instant;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Instant decode(ProtoReader protoReader) {
                long beginMessage = protoReader.beginMessage();
                long j = 0;
                int i = 0;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(beginMessage);
                        return Instant.ofEpochSecond(j, i);
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.INT64.decode(protoReader).longValue();
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        i = ProtoAdapter.INT32.decode(protoReader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Instant instant) {
                long epochSecond = instant.getEpochSecond();
                int encodedSizeWithTag = epochSecond != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(epochSecond)) : 0;
                int nano = instant.getNano();
                return nano != 0 ? ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(nano)) + encodedSizeWithTag : encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Instant instant) {
                long epochSecond = instant.getEpochSecond();
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, (int) Long.valueOf(epochSecond));
                }
                int nano = instant.getNano();
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, (int) Integer.valueOf(nano));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, Instant instant) {
                int nano = instant.getNano();
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, (int) Integer.valueOf(nano));
                }
                long epochSecond = instant.getEpochSecond();
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, (int) Long.valueOf(epochSecond));
                }
            }
        };
    }

    public static final ProtoAdapter<Integer> commonInt32() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final rfc a = fpf0.a(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonInt32$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(protoReader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            public int encodedSize(int i) {
                return ProtoWriter.Companion.int32Size$wire_runtime(i);
            }

            public Integer redact(int i) {
                throw new UnsupportedOperationException();
            }

            public void encode(ProtoWriter protoWriter, int i) throws IOException {
                protoWriter.writeSignedVarint32$wire_runtime(i);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, int i) throws IOException {
                reverseProtoWriter.writeSignedVarint32$wire_runtime(i);
            }
        };
    }

    public static final ProtoAdapter<Long> commonInt64() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final rfc a = fpf0.a(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonInt64$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) {
                encode(protoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(protoReader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            public int encodedSize(long j) {
                return ProtoWriter.Companion.varint64Size$wire_runtime(j);
            }

            public Long redact(long j) {
                throw new UnsupportedOperationException();
            }

            public void encode(ProtoWriter protoWriter, long j) throws IOException {
                protoWriter.writeVarint64(j);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, long j) throws IOException {
                reverseProtoWriter.writeVarint64(j);
            }
        };
    }

    public static final <K, V> ProtoAdapter<Map<K, V>> commonNewMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return new MapProtoAdapter(protoAdapter, protoAdapter2);
    }

    public static final ProtoAdapter<Integer> commonSfixed32() {
        return commonFixed32();
    }

    public static final ProtoAdapter<Long> commonSfixed64() {
        return commonFixed64();
    }

    public static final ProtoAdapter<Integer> commonSint32() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final rfc a = fpf0.a(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonSint32$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(ProtoWriter.Companion.decodeZigZag32$wire_runtime(protoReader.readVarint32()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            public int encodedSize(int i) {
                ProtoWriter.Companion companion = ProtoWriter.Companion;
                return companion.varint32Size$wire_runtime(companion.encodeZigZag32$wire_runtime(i));
            }

            public Integer redact(int i) {
                throw new UnsupportedOperationException();
            }

            public void encode(ProtoWriter protoWriter, int i) throws IOException {
                protoWriter.writeVarint32(ProtoWriter.Companion.encodeZigZag32$wire_runtime(i));
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, int i) throws IOException {
                reverseProtoWriter.writeVarint32(ProtoWriter.Companion.encodeZigZag32$wire_runtime(i));
            }
        };
    }

    public static final ProtoAdapter<Long> commonSint64() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final rfc a = fpf0.a(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonSint64$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) {
                encode(protoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(ProtoWriter.Companion.decodeZigZag64$wire_runtime(protoReader.readVarint64()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            public int encodedSize(long j) {
                ProtoWriter.Companion companion = ProtoWriter.Companion;
                return companion.varint64Size$wire_runtime(companion.encodeZigZag64$wire_runtime(j));
            }

            public Long redact(long j) {
                throw new UnsupportedOperationException();
            }

            public void encode(ProtoWriter protoWriter, long j) throws IOException {
                protoWriter.writeVarint64(ProtoWriter.Companion.encodeZigZag64$wire_runtime(j));
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, long j) throws IOException {
                reverseProtoWriter.writeVarint64(ProtoWriter.Companion.encodeZigZag64$wire_runtime(j));
            }
        };
    }

    public static final ProtoAdapter<String> commonString() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final rfc a = fpf0.a(String.class);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<String>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonString$1
            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader protoReader) throws IOException {
                return protoReader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(String str) {
                return (int) s1v.s(str);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String redact(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, String str) throws IOException {
                protoWriter.writeString(str);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, String str) throws IOException {
                reverseProtoWriter.writeString(str);
            }
        };
    }

    public static final ProtoAdapter<List<?>> commonStructList() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final rfc a = fpf0.a(Map.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<List<?>>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructList$1
            @Override // com.squareup.wire.ProtoAdapter
            public List<?> decode(ProtoReader protoReader) {
                ArrayList arrayList = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(beginMessage);
                        return arrayList;
                    }
                    if (nextTag != 1) {
                        protoReader.skip();
                    } else {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(List<?> list) {
                int i = 0;
                if (list == null) {
                    return 0;
                }
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    i += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(1, it.next());
                }
                return i;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<Object> redact(List<?> list) {
                if (list == null) {
                    return null;
                }
                List<?> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(ProtoAdapter.STRUCT_VALUE.redact(it.next()));
                }
                return arrayList;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, List<?> list) {
                if (list == null) {
                    return;
                }
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(protoWriter, 1, (int) it.next());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, List<?> list) {
                int size;
                if (list == null || (size = list.size() - 1) < 0) {
                    return;
                }
                while (true) {
                    int i = size - 1;
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(reverseProtoWriter, 1, (int) list.get(size));
                    if (i < 0) {
                        return;
                    } else {
                        size = i;
                    }
                }
            }
        };
    }

    public static final ProtoAdapter<Map<String, ?>> commonStructMap() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final rfc a = fpf0.a(Map.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Map<String, ?>>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructMap$1
            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, ?> decode(ProtoReader protoReader) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(beginMessage);
                        return linkedHashMap;
                    }
                    if (nextTag != 1) {
                        protoReader.skip();
                    } else {
                        long beginMessage2 = protoReader.beginMessage();
                        String str = null;
                        Object obj = null;
                        while (true) {
                            int nextTag2 = protoReader.nextTag();
                            if (nextTag2 == -1) {
                                break;
                            }
                            if (nextTag2 == 1) {
                                str = ProtoAdapter.STRING.decode(protoReader);
                            } else if (nextTag2 != 2) {
                                protoReader.readUnknownField(nextTag2);
                            } else {
                                obj = ProtoAdapter.STRUCT_VALUE.decode(protoReader);
                            }
                        }
                        protoReader.endMessageAndGetUnknownFields(beginMessage2);
                        if (str != null) {
                            linkedHashMap.put(str, obj);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Map<String, ?> map) {
                int i = 0;
                if (map == null) {
                    return 0;
                }
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    int encodedSizeWithTag = ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(2, value) + ProtoAdapter.STRING.encodedSizeWithTag(1, key);
                    ProtoWriter.Companion companion = ProtoWriter.Companion;
                    i += companion.varint32Size$wire_runtime(encodedSizeWithTag) + companion.tagSize$wire_runtime(1) + encodedSizeWithTag;
                }
                return i;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, Object> redact(Map<String, ?> map) {
                if (map == null) {
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ProtoAdapter.STRUCT_VALUE.redact(entry));
                }
                return linkedHashMap;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Map<String, ?> map) {
                if (map == null) {
                    return;
                }
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, key);
                    ProtoAdapter<Object> protoAdapter2 = ProtoAdapter.STRUCT_VALUE;
                    int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, value) + encodedSizeWithTag;
                    protoWriter.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                    protoWriter.writeVarint32(encodedSizeWithTag2);
                    protoAdapter.encodeWithTag(protoWriter, 1, (int) key);
                    protoAdapter2.encodeWithTag(protoWriter, 2, (int) value);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, Map<String, ?> map) {
                if (map == null) {
                    return;
                }
                int i = 0;
                Object[] array = map.entrySet().toArray(new Map.Entry[0]);
                if (array != null) {
                    Map.Entry[] entryArr = (Map.Entry[]) array;
                    rl3.k0(entryArr);
                    int length = entryArr.length;
                    while (i < length) {
                        Map.Entry entry = entryArr[i];
                        i++;
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        int byteCount = reverseProtoWriter.getByteCount();
                        ProtoAdapter.STRUCT_VALUE.encodeWithTag(reverseProtoWriter, 2, (int) value);
                        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, (int) str);
                        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
                        reverseProtoWriter.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        };
    }

    public static final ProtoAdapter commonStructNull() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final rfc a = fpf0.a(Void.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructNull$1
            @Override // com.squareup.wire.ProtoAdapter
            public Void redact(Void r1) {
                return null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader protoReader) {
                int readVarint32 = protoReader.readVarint32();
                if (readVarint32 == 0) {
                    return null;
                }
                throw new IOException(epx.j(Integer.valueOf(readVarint32), "expected 0 but was "));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Void r2) {
                return ProtoWriter.Companion.varint32Size$wire_runtime(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int i, Void r3) {
                int encodedSize = encodedSize(r3);
                ProtoWriter.Companion companion = ProtoWriter.Companion;
                return companion.varint32Size$wire_runtime(encodedSize) + companion.tagSize$wire_runtime(i);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Void r2) {
                protoWriter.writeVarint32(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter protoWriter, int i, Void r4) {
                protoWriter.writeTag(i, getFieldEncoding$wire_runtime());
                encode(protoWriter, r4);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, Void r2) {
                reverseProtoWriter.writeVarint32(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i, Void r3) {
                encode(reverseProtoWriter, r3);
                reverseProtoWriter.writeTag(i, getFieldEncoding$wire_runtime());
            }
        };
    }

    public static final ProtoAdapter<Object> commonStructValue() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final rfc a = fpf0.a(Object.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Object>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructValue$1
            @Override // com.squareup.wire.ProtoAdapter
            public Object decode(ProtoReader protoReader) {
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRUCT_NULL.decode(protoReader);
                                break;
                            case 2:
                                obj = ProtoAdapter.DOUBLE.decode(protoReader);
                                break;
                            case 3:
                                obj = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                obj = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                obj = ProtoAdapter.STRUCT_MAP.decode(protoReader);
                                break;
                            case 6:
                                obj = ProtoAdapter.STRUCT_LIST.decode(protoReader);
                                break;
                            default:
                                protoReader.skip();
                                break;
                        }
                    } else {
                        protoReader.endMessageAndGetUnknownFields(beginMessage);
                        return obj;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Object obj) {
                if (obj == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(protoWriter, 1, (int) obj);
                    return;
                }
                if (obj instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, (int) Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, (int) obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, (int) obj);
                } else if (obj instanceof Map) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(protoWriter, 5, (int) obj);
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException(epx.j(obj, "unexpected struct value: "));
                    }
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(protoWriter, 6, (int) obj);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
                if (obj != null) {
                    super.encodeWithTag(protoWriter, i, (int) obj);
                    return;
                }
                protoWriter.writeTag(i, getFieldEncoding$wire_runtime());
                protoWriter.writeVarint32(encodedSize(obj));
                encode(protoWriter, obj);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Object obj) {
                if (obj == null) {
                    return ProtoAdapter.STRUCT_NULL.encodedSizeWithTag(1, obj);
                }
                if (obj instanceof Number) {
                    return ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(((Number) obj).doubleValue()));
                }
                if (obj instanceof String) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(3, obj);
                }
                if (obj instanceof Boolean) {
                    return ProtoAdapter.BOOL.encodedSizeWithTag(4, obj);
                }
                if (obj instanceof Map) {
                    return ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(5, (Map) obj);
                }
                if (obj instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.encodedSizeWithTag(6, obj);
                }
                throw new IllegalArgumentException(epx.j(obj, "unexpected struct value: "));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int i, Object obj) {
                if (obj != null) {
                    return super.encodedSizeWithTag(i, obj);
                }
                int encodedSize = encodedSize(obj);
                ProtoWriter.Companion companion = ProtoWriter.Companion;
                return companion.varint32Size$wire_runtime(encodedSize) + companion.tagSize$wire_runtime(i) + encodedSize;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Object redact(Object obj) {
                if (obj == null) {
                    return ProtoAdapter.STRUCT_NULL.redact(obj);
                }
                if (obj instanceof Number) {
                    return obj;
                }
                if (obj instanceof String) {
                    return null;
                }
                if (obj instanceof Boolean) {
                    return obj;
                }
                if (obj instanceof Map) {
                    return ProtoAdapter.STRUCT_MAP.redact((Map) obj);
                }
                if (obj instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.redact(obj);
                }
                throw new IllegalArgumentException(epx.j(obj, "unexpected struct value: "));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i, Object obj) {
                if (obj == null) {
                    int byteCount = reverseProtoWriter.getByteCount();
                    encode(reverseProtoWriter, obj);
                    reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
                    reverseProtoWriter.writeTag(i, getFieldEncoding$wire_runtime());
                    return;
                }
                super.encodeWithTag(reverseProtoWriter, i, (int) obj);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                if (obj == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(reverseProtoWriter, 1, (int) obj);
                    return;
                }
                if (obj instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 2, (int) Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, (int) obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, (int) obj);
                } else if (obj instanceof Map) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(reverseProtoWriter, 5, (int) obj);
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException(epx.j(obj, "unexpected struct value: "));
                    }
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(reverseProtoWriter, 6, (int) obj);
                }
            }
        };
    }

    public static final <E> String commonToString(E e) {
        return String.valueOf(e);
    }

    public static final ProtoAdapter<Integer> commonUint32() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final rfc a = fpf0.a(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonUint32$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(protoReader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            public int encodedSize(int i) {
                return ProtoWriter.Companion.varint32Size$wire_runtime(i);
            }

            public Integer redact(int i) {
                throw new UnsupportedOperationException();
            }

            public void encode(ProtoWriter protoWriter, int i) throws IOException {
                protoWriter.writeVarint32(i);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, int i) throws IOException {
                reverseProtoWriter.writeVarint32(i);
            }
        };
    }

    public static final ProtoAdapter<Long> commonUint64() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final rfc a = fpf0.a(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonUint64$1
            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) {
                encode(protoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(protoReader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            public int encodedSize(long j) {
                return ProtoWriter.Companion.varint64Size$wire_runtime(j);
            }

            public Long redact(long j) {
                throw new UnsupportedOperationException();
            }

            public void encode(ProtoWriter protoWriter, long j) throws IOException {
                protoWriter.writeVarint64(j);
            }

            public void encode(ReverseProtoWriter reverseProtoWriter, long j) throws IOException {
                reverseProtoWriter.writeVarint64(j);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> ProtoAdapter<?> commonWithLabel(ProtoAdapter<E> protoAdapter, WireField.Label label) {
        return label.isRepeated() ? label.isPacked() ? protoAdapter.asPacked() : protoAdapter.asRepeated() : protoAdapter;
    }

    public static final <T> ProtoAdapter<T> commonWrapper(final ProtoAdapter<T> protoAdapter, final String str) {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final dcy<?> type = protoAdapter.getType();
        final Syntax syntax = Syntax.PROTO_3;
        final T identity = protoAdapter.getIdentity();
        return new ProtoAdapter<T>(str, protoAdapter, fieldEncoding, type, syntax, identity) { // from class: com.squareup.wire.ProtoAdapterKt$commonWrapper$1
            final /* synthetic */ ProtoAdapter<T> $delegate;
            final /* synthetic */ String $typeUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(fieldEncoding, type, str, syntax, identity);
                this.$typeUrl = str;
                this.$delegate = protoAdapter;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public T decode(ProtoReader protoReader) {
                T identity2 = this.$delegate.getIdentity();
                ProtoAdapter<T> protoAdapter2 = this.$delegate;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(beginMessage);
                        return identity2;
                    }
                    if (nextTag == 1) {
                        identity2 = protoAdapter2.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, T t) {
                if (t == null || t.equals(this.$delegate.getIdentity())) {
                    return;
                }
                this.$delegate.encodeWithTag(protoWriter, 1, (int) t);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(T t) {
                if (t == null || t.equals(this.$delegate.getIdentity())) {
                    return 0;
                }
                return this.$delegate.encodedSizeWithTag(1, t);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public T redact(T t) {
                if (t == null) {
                    return null;
                }
                return this.$delegate.redact(t);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, T t) {
                if (t == null || t.equals(this.$delegate.getIdentity())) {
                    return;
                }
                this.$delegate.encodeWithTag(reverseProtoWriter, 1, (int) t);
            }
        };
    }

    public static final <E> void delegateEncode(ProtoAdapter<E> protoAdapter, ReverseProtoWriter reverseProtoWriter, E e) {
        reverseProtoWriter.writeForward$wire_runtime(new ProtoAdapterKt$delegateEncode$1(protoAdapter, e));
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, ByteString byteString) {
        vl8 vl8Var = new vl8();
        vl8Var.H(byteString);
        return protoAdapter.decode(vl8Var);
    }

    public static final <E> byte[] commonEncode(ProtoAdapter<E> protoAdapter, E e) {
        vl8 vl8Var = new vl8();
        protoAdapter.encode((an8) vl8Var, (vl8) e);
        return vl8Var.v(vl8Var.c);
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, bn8 bn8Var) {
        return protoAdapter.decode(new ProtoReader(bn8Var));
    }

    public static final <E> void commonEncodeWithTag(ProtoAdapter<E> protoAdapter, ReverseProtoWriter reverseProtoWriter, int i, E e) {
        if (e == null) {
            return;
        }
        if (protoAdapter.getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            int byteCount = reverseProtoWriter.getByteCount();
            protoAdapter.encode(reverseProtoWriter, (ReverseProtoWriter) e);
            reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        } else {
            protoAdapter.encode(reverseProtoWriter, (ReverseProtoWriter) e);
        }
        reverseProtoWriter.writeTag(i, protoAdapter.getFieldEncoding$wire_runtime());
    }
}
