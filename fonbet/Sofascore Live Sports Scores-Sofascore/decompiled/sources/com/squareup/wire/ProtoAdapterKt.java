package com.squareup.wire;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import defpackage.a70;
import defpackage.duf;
import defpackage.gc2;
import defpackage.is8;
import defpackage.k13;
import defpackage.k62;
import defpackage.l62;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.mha;
import defpackage.mz1;
import defpackage.ogj;
import defpackage.ph0;
import defpackage.sub;
import defpackage.vxd;
import defpackage.x52;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\u001a2\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\n\u0010\u000b\u001a:\u0010\r\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a:\u0010\r\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0080\b¢\u0006\u0004\b\r\u0010\u000f\u001a0\u0010\u0012\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a(\u0010\u0012\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0015\u001a(\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a(\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00020\u0014H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a(\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00020\u0016H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001c\u001a(\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001e\u001a\u00020\u001dH\u0080\b¢\u0006\u0004\b\u001a\u0010\u001f\u001a6\u0010$\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010!\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0080\b¢\u0006\u0004\b$\u0010%\u001a6\u0010$\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010!\u001a\u00020&2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0080\b¢\u0006\u0004\b$\u0010'\u001a\u001e\u0010)\u001a\u00020(\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b)\u0010*\u001a,\u0010-\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010,\u001a\u00020+H\u0080\b¢\u0006\u0004\b-\u0010.\u001a,\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000/0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b0\u00101\u001a,\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000/0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b2\u00101\u001aJ\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001070\u0001\"\u0004\b\u0000\u00103\"\u0004\b\u0001\u001042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0080\b¢\u0006\u0004\b8\u00109\u001a\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0001H\u0000¢\u0006\u0004\b;\u0010<\u001a\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b=\u0010<\u001a\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b>\u0010<\u001a\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b?\u0010<\u001a\u0015\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b@\u0010<\u001a\u0015\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\bA\u0010<\u001a\u0015\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u0001H\u0000¢\u0006\u0004\bC\u0010<\u001a\u0015\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\u0001H\u0000¢\u0006\u0004\bD\u0010<\u001a\u0015\u0010E\u001a\b\u0012\u0004\u0012\u00020B0\u0001H\u0000¢\u0006\u0004\bE\u0010<\u001a\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00020B0\u0001H\u0000¢\u0006\u0004\bF\u0010<\u001a\u0015\u0010G\u001a\b\u0012\u0004\u0012\u00020B0\u0001H\u0000¢\u0006\u0004\bG\u0010<\u001a\u000f\u0010I\u001a\u00020HH\u0000¢\u0006\u0004\bI\u0010J\u001a\u000f\u0010L\u001a\u00020KH\u0000¢\u0006\u0004\bL\u0010M\u001a\u0015\u0010N\u001a\b\u0012\u0004\u0012\u00020(0\u0001H\u0000¢\u0006\u0004\bN\u0010<\u001a\u0015\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001H\u0000¢\u0006\u0004\bO\u0010<\u001a\u0019\u0010R\u001a\f\u0012\b\u0012\u00060Pj\u0002`Q0\u0001H\u0000¢\u0006\u0004\bR\u0010<\u001a \u0010U\u001a\u00020\t2\u0006\u0010S\u001a\u00020B2\u0006\u0010T\u001a\u00020\u0002H\u0082\b¢\u0006\u0004\bU\u0010V\u001a\u0019\u0010Y\u001a\f\u0012\b\u0012\u00060Wj\u0002`X0\u0001H\u0000¢\u0006\u0004\bY\u0010<\u001a\u0015\u0010Z\u001a\b\u0012\u0004\u0012\u00020\t0\u0001H\u0000¢\u0006\u0004\bZ\u0010<\u001a!\u0010[\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0002\b\u0003\u0018\u0001070\u0001H\u0000¢\u0006\u0004\b[\u0010<\u001a\u001b\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010/0\u0001H\u0000¢\u0006\u0004\b\\\u0010<\u001a\u0017\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0\u0001H\u0000¢\u0006\u0004\b^\u0010<\u001a\u0017\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010_0\u0001H\u0000¢\u0006\u0004\b`\u0010<\u001a7\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\"\b\b\u0000\u0010a*\u00020_2\f\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010c\u001a\u00020(H\u0000¢\u0006\u0004\bd\u0010e\"\u0014\u0010f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010g\"\u0014\u0010h\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bh\u0010g\"\u0014\u0010i\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010g\"\u0014\u0010j\u001a\u00020B8\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010k\"\u0014\u0010l\u001a\u00020B8\u0002X\u0082T¢\u0006\u0006\n\u0004\bl\u0010k¨\u0006m"}, d2 = {"E", "Lcom/squareup/wire/ProtoAdapter;", "", "tag", U3.i.X, "commonEncodedSizeWithTag", "(Lcom/squareup/wire/ProtoAdapter;ILjava/lang/Object;)I", "Lcom/squareup/wire/ReverseProtoWriter;", "writer", "", "delegateEncode", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ReverseProtoWriter;Ljava/lang/Object;)V", "Lcom/squareup/wire/ProtoWriter;", "commonEncodeWithTag", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoWriter;ILjava/lang/Object;)V", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ReverseProtoWriter;ILjava/lang/Object;)V", "Lk62;", "sink", "commonEncode", "(Lcom/squareup/wire/ProtoAdapter;Lk62;Ljava/lang/Object;)V", "", "(Lcom/squareup/wire/ProtoAdapter;Ljava/lang/Object;)[B", "Lgc2;", "commonEncodeByteString", "(Lcom/squareup/wire/ProtoAdapter;Ljava/lang/Object;)Lgc2;", "bytes", "commonDecode", "(Lcom/squareup/wire/ProtoAdapter;[B)Ljava/lang/Object;", "(Lcom/squareup/wire/ProtoAdapter;Lgc2;)Ljava/lang/Object;", "Ll62;", "source", "(Lcom/squareup/wire/ProtoAdapter;Ll62;)Ljava/lang/Object;", "Lcom/squareup/wire/ProtoReader;", "reader", "", "destination", "commonTryDecode", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoReader;Ljava/util/List;)V", "Lcom/squareup/wire/ProtoReader32;", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoReader32;Ljava/util/List;)V", "", "commonToString", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/squareup/wire/WireField$Label;", "label", "commonWithLabel", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/WireField$Label;)Lcom/squareup/wire/ProtoAdapter;", "", "commonCreatePacked", "(Lcom/squareup/wire/ProtoAdapter;)Lcom/squareup/wire/ProtoAdapter;", "commonCreateRepeated", PlayerKt.AMERICAN_FOOTBALL_KICKER, "V", "keyAdapter", "valueAdapter", "", "commonNewMapAdapter", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)Lcom/squareup/wire/ProtoAdapter;", "", "commonBool", "()Lcom/squareup/wire/ProtoAdapter;", "commonInt32", "commonUint32", "commonSint32", "commonFixed32", "commonSfixed32", "", "commonInt64", "commonUint64", "commonSint64", "commonFixed64", "commonSfixed64", "Lcom/squareup/wire/FloatProtoAdapter;", "commonFloat", "()Lcom/squareup/wire/FloatProtoAdapter;", "Lcom/squareup/wire/DoubleProtoAdapter;", "commonDouble", "()Lcom/squareup/wire/DoubleProtoAdapter;", "commonString", "commonBytes", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "commonDuration", "seconds", "nanos", "checkTimestampRange", "(JI)V", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "commonInstant", "commonEmpty", "commonStructMap", "commonStructList", "", "commonStructNull", "", "commonStructValue", "T", "delegate", "typeUrl", "commonWrapper", "(Lcom/squareup/wire/ProtoAdapter;Ljava/lang/String;)Lcom/squareup/wire/ProtoAdapter;", "FIXED_BOOL_SIZE", "I", "FIXED_32_SIZE", "FIXED_64_SIZE", "TIMESTAMP_SECONDS_MIN", "J", "TIMESTAMP_SECONDS_MAX", "wire-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProtoAdapterKt {
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final int FIXED_BOOL_SIZE = 1;
    private static final long TIMESTAMP_SECONDS_MAX = 253402300799L;
    private static final long TIMESTAMP_SECONDS_MIN = -62135596800L;

    private static final void checkTimestampRange(long j, int i) {
        if (TIMESTAMP_SECONDS_MIN > j || j >= 253402300800L) {
            ogj.h(vxd.m("Timestamp seconds (", j, ") must be in range [-62135596800, 253402300799]"));
        } else if (i < 0 || i >= 1000000000) {
            ogj.h(lnb.k(i, "Timestamp nanos (", ") must be in range [0, 999999999]"));
        }
    }

    @NotNull
    public static final ProtoAdapter<Boolean> commonBool() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Boolean.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Boolean>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonBool$1
            {
                Boolean bool = Boolean.FALSE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader reader) {
                reader.getClass();
                return Boolean.valueOf(reader.readVarint32() != 0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Boolean bool) {
                encode(protoWriter, bool.booleanValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Boolean bool) {
                return encodedSize(bool.booleanValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Boolean redact(Boolean bool) {
                return redact(bool.booleanValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Boolean bool) {
                encode(reverseProtoWriter, bool.booleanValue());
            }

            public void encode(ProtoWriter writer, boolean value) {
                writer.getClass();
                writer.writeVarint32(value ? 1 : 0);
            }

            public int encodedSize(boolean value) {
                return 1;
            }

            public Boolean redact(boolean value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, boolean value) {
                writer.getClass();
                writer.writeVarint32(value ? 1 : 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader32 reader) {
                reader.getClass();
                return Boolean.valueOf(reader.readVarint32() != 0);
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<gc2> commonBytes() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(gc2.class);
        final Syntax syntax = Syntax.PROTO_2;
        final gc2 gc2Var = gc2.d;
        return new ProtoAdapter<gc2>(fieldEncoding, orCreateKotlinClass, syntax, gc2Var) { // from class: com.squareup.wire.ProtoAdapterKt$commonBytes$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public gc2 decode(ProtoReader reader) {
                reader.getClass();
                return reader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, gc2 value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(gc2 value) {
                value.getClass();
                return value.h();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public gc2 redact(gc2 value) {
                value.getClass();
                throw new UnsupportedOperationException();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public gc2 decode(ProtoReader32 reader) {
                reader.getClass();
                return reader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, gc2 value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value);
            }
        };
    }

    @NotNull
    public static final <E> ProtoAdapter<List<E>> commonCreatePacked(@NotNull ProtoAdapter<E> protoAdapter) {
        protoAdapter.getClass();
        if (protoAdapter.getFieldEncoding() != FieldEncoding.LENGTH_DELIMITED) {
            return new PackedProtoAdapter(protoAdapter);
        }
        a70.p("Unable to pack a length-delimited type.");
        return null;
    }

    @NotNull
    public static final <E> ProtoAdapter<List<E>> commonCreateRepeated(@NotNull ProtoAdapter<E> protoAdapter) {
        protoAdapter.getClass();
        return new RepeatedProtoAdapter(protoAdapter);
    }

    public static final <E> E commonDecode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull byte[] bArr) {
        protoAdapter.getClass();
        bArr.getClass();
        return protoAdapter.decode(ProtoReader32Kt.ProtoReader32$default(bArr, 0, 0, 6, (Object) null));
    }

    @NotNull
    public static final DoubleProtoAdapter commonDouble() {
        return new DoubleProtoAdapter();
    }

    @NotNull
    public static final ProtoAdapter<Duration> commonDuration() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Duration.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Duration>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonDuration$1
            private final int getSameSignNanos(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - 1000000000;
            }

            private final long getSameSignSeconds(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                long j = 0;
                int i = 0;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        Duration ofSeconds = Duration.ofSeconds(j, i);
                        ofSeconds.getClass();
                        return ofSeconds;
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        i = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Duration value) {
                writer.getClass();
                value.getClass();
                long sameSignSeconds = getSameSignSeconds(value);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(sameSignSeconds));
                }
                int sameSignNanos = getSameSignNanos(value);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(sameSignNanos));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Duration value) {
                value.getClass();
                long sameSignSeconds = getSameSignSeconds(value);
                int encodedSizeWithTag = sameSignSeconds != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(sameSignSeconds)) : 0;
                int sameSignNanos = getSameSignNanos(value);
                return sameSignNanos != 0 ? ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(sameSignNanos)) + encodedSizeWithTag : encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration redact(Duration value) {
                value.getClass();
                return value;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Duration value) {
                writer.getClass();
                value.getClass();
                int sameSignNanos = getSameSignNanos(value);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(sameSignNanos));
                }
                long sameSignSeconds = getSameSignSeconds(value);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(sameSignSeconds));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration decode(ProtoReader32 reader) {
                reader.getClass();
                int beginMessage = reader.beginMessage();
                long j = 0;
                int i = 0;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        Duration ofSeconds = Duration.ofSeconds(j, i);
                        ofSeconds.getClass();
                        return ofSeconds;
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        i = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Unit> commonEmpty() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Unit.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Unit>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonEmpty$1
            /* renamed from: decode, reason: avoid collision after fix types in other method */
            public void decode2(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return;
                    }
                    reader.readUnknownField(nextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Unit value) {
                writer.getClass();
                value.getClass();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Unit redact(Unit unit) {
                redact2(unit);
                return Unit.a;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Unit value) {
                writer.getClass();
                value.getClass();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Unit value) {
                value.getClass();
                return 0;
            }

            /* renamed from: redact, reason: avoid collision after fix types in other method */
            public void redact2(Unit value) {
                value.getClass();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Unit decode(ProtoReader protoReader) {
                decode2(protoReader);
                return Unit.a;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Unit decode(ProtoReader32 protoReader32) {
                decode2(protoReader32);
                return Unit.a;
            }

            /* renamed from: decode, reason: avoid collision after fix types in other method */
            public void decode2(ProtoReader32 reader) {
                reader.getClass();
                int beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag != -1) {
                        reader.readUnknownField(nextTag);
                    } else {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return;
                    }
                }
            }
        };
    }

    public static final <E> void commonEncode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull k62 k62Var, E e) {
        protoAdapter.getClass();
        k62Var.getClass();
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        protoAdapter.encode(reverseProtoWriter, (ReverseProtoWriter) e);
        reverseProtoWriter.writeTo(k62Var);
    }

    @NotNull
    public static final <E> gc2 commonEncodeByteString(@NotNull ProtoAdapter<E> protoAdapter, E e) {
        protoAdapter.getClass();
        x52 x52Var = new x52();
        protoAdapter.encode((k62) x52Var, (x52) e);
        return x52Var.l0(x52Var.b);
    }

    public static final <E> void commonEncodeWithTag(@NotNull ProtoAdapter<E> protoAdapter, @NotNull ReverseProtoWriter reverseProtoWriter, int i, @Nullable E e) {
        protoAdapter.getClass();
        reverseProtoWriter.getClass();
        if (e == null) {
            return;
        }
        if (protoAdapter.getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            int byteCount = reverseProtoWriter.getByteCount();
            protoAdapter.encode(reverseProtoWriter, (ReverseProtoWriter) e);
            reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        } else {
            protoAdapter.encode(reverseProtoWriter, (ReverseProtoWriter) e);
        }
        reverseProtoWriter.writeTag(i, protoAdapter.getFieldEncoding());
    }

    public static final <E> int commonEncodedSizeWithTag(@NotNull ProtoAdapter<E> protoAdapter, int i, @Nullable E e) {
        protoAdapter.getClass();
        if (e == null) {
            return 0;
        }
        int encodedSize = protoAdapter.encodedSize(e);
        if (protoAdapter.getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            encodedSize += ProtoWriter.INSTANCE.varint32Size$wire_runtime(encodedSize);
        }
        return ProtoWriter.INSTANCE.tagSize$wire_runtime(i) + encodedSize;
    }

    @NotNull
    public static final ProtoAdapter<Integer> commonFixed32() {
        final FieldEncoding fieldEncoding = FieldEncoding.FIXED32;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonFixed32$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                reader.getClass();
                return Integer.valueOf(reader.readFixed32());
            }

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

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            public void encode(ProtoWriter writer, int value) {
                writer.getClass();
                writer.writeFixed32(value);
            }

            public int encodedSize(int value) {
                return 4;
            }

            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, int value) {
                writer.getClass();
                writer.writeFixed32(value);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                reader.getClass();
                return Integer.valueOf(reader.readFixed32());
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Long> commonFixed64() {
        final FieldEncoding fieldEncoding = FieldEncoding.FIXED64;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonFixed64$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                reader.getClass();
                return Long.valueOf(reader.readFixed64());
            }

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

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            public void encode(ProtoWriter writer, long value) {
                writer.getClass();
                writer.writeFixed64(value);
            }

            public int encodedSize(long value) {
                return 8;
            }

            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, long value) {
                writer.getClass();
                writer.writeFixed64(value);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                reader.getClass();
                return Long.valueOf(reader.readFixed64());
            }
        };
    }

    @NotNull
    public static final FloatProtoAdapter commonFloat() {
        return new FloatProtoAdapter();
    }

    @NotNull
    public static final ProtoAdapter<Instant> commonInstant() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Instant.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Instant>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonInstant$1
            @Override // com.squareup.wire.ProtoAdapter
            public Instant decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                long j = 0;
                int i = 0;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        Instant ofEpochSecond = Instant.ofEpochSecond(j, i);
                        ofEpochSecond.getClass();
                        return ofEpochSecond;
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        i = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Instant value) {
                writer.getClass();
                value.getClass();
                long epochSecond = value.getEpochSecond();
                int nano = value.getNano();
                if (-62135596800L > epochSecond || epochSecond >= 253402300800L) {
                    ogj.h(vxd.m("Timestamp seconds (", epochSecond, ") must be in range [-62135596800, 253402300799]"));
                    return;
                }
                if (nano < 0 || nano >= 1000000000) {
                    ogj.h(lnb.k(nano, "Timestamp nanos (", ") must be in range [0, 999999999]"));
                    return;
                }
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(epochSecond));
                }
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(nano));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Instant value) {
                value.getClass();
                long epochSecond = value.getEpochSecond();
                int nano = value.getNano();
                if (-62135596800L > epochSecond || epochSecond >= 253402300800L) {
                    ogj.h(vxd.m("Timestamp seconds (", epochSecond, ") must be in range [-62135596800, 253402300799]"));
                    return 0;
                }
                if (nano < 0 || nano >= 1000000000) {
                    ogj.h(lnb.k(nano, "Timestamp nanos (", ") must be in range [0, 999999999]"));
                    return 0;
                }
                int encodedSizeWithTag = epochSecond != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(epochSecond)) : 0;
                return nano != 0 ? ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(nano)) + encodedSizeWithTag : encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Instant redact(Instant value) {
                value.getClass();
                return value;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Instant decode(ProtoReader32 reader) {
                reader.getClass();
                int beginMessage = reader.beginMessage();
                long j = 0;
                int i = 0;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        Instant ofEpochSecond = Instant.ofEpochSecond(j, i);
                        ofEpochSecond.getClass();
                        return ofEpochSecond;
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        i = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Instant value) {
                writer.getClass();
                value.getClass();
                long epochSecond = value.getEpochSecond();
                int nano = value.getNano();
                if (-62135596800L > epochSecond || epochSecond >= 253402300800L) {
                    ogj.h(vxd.m("Timestamp seconds (", epochSecond, ") must be in range [-62135596800, 253402300799]"));
                    return;
                }
                if (nano < 0 || nano >= 1000000000) {
                    ogj.h(lnb.k(nano, "Timestamp nanos (", ") must be in range [0, 999999999]"));
                    return;
                }
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(nano));
                }
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(epochSecond));
                }
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Integer> commonInt32() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonInt32$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                reader.getClass();
                return Integer.valueOf(reader.readVarint32());
            }

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

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            public void encode(ProtoWriter writer, int value) {
                writer.getClass();
                writer.writeSignedVarint32$wire_runtime(value);
            }

            public int encodedSize(int value) {
                return ProtoWriter.INSTANCE.int32Size$wire_runtime(value);
            }

            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, int value) {
                writer.getClass();
                writer.writeSignedVarint32$wire_runtime(value);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                reader.getClass();
                return Integer.valueOf(reader.readVarint32());
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Long> commonInt64() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonInt64$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                reader.getClass();
                return Long.valueOf(reader.readVarint64());
            }

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

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            public void encode(ProtoWriter writer, long value) {
                writer.getClass();
                writer.writeVarint64(value);
            }

            public int encodedSize(long value) {
                return ProtoWriter.INSTANCE.varint64Size$wire_runtime(value);
            }

            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, long value) {
                writer.getClass();
                writer.writeVarint64(value);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                reader.getClass();
                return Long.valueOf(reader.readVarint64());
            }
        };
    }

    @NotNull
    public static final <K, V> ProtoAdapter<Map<K, V>> commonNewMapAdapter(@NotNull ProtoAdapter<K> protoAdapter, @NotNull ProtoAdapter<V> protoAdapter2) {
        protoAdapter.getClass();
        protoAdapter2.getClass();
        return new MapProtoAdapter(protoAdapter, protoAdapter2);
    }

    @NotNull
    public static final ProtoAdapter<Integer> commonSfixed32() {
        return commonFixed32();
    }

    @NotNull
    public static final ProtoAdapter<Long> commonSfixed64() {
        return commonFixed64();
    }

    @NotNull
    public static final ProtoAdapter<Integer> commonSint32() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonSint32$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                reader.getClass();
                return Integer.valueOf(ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(reader.readVarint32()));
            }

            public void encode(ProtoWriter writer, int value) {
                writer.getClass();
                writer.writeVarint32(ProtoWriter.INSTANCE.encodeZigZag32$wire_runtime(value));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            public int encodedSize(int value) {
                ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                return companion.varint32Size$wire_runtime(companion.encodeZigZag32$wire_runtime(value));
            }

            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) {
                encode(protoWriter, num.intValue());
            }

            public void encode(ReverseProtoWriter writer, int value) {
                writer.getClass();
                writer.writeVarint32(ProtoWriter.INSTANCE.encodeZigZag32$wire_runtime(value));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                reader.getClass();
                return Integer.valueOf(ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(reader.readVarint32()));
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Long> commonSint64() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonSint64$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                reader.getClass();
                return Long.valueOf(ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(reader.readVarint64()));
            }

            public void encode(ProtoWriter writer, long value) {
                writer.getClass();
                writer.writeVarint64(ProtoWriter.INSTANCE.encodeZigZag64$wire_runtime(value));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            public int encodedSize(long value) {
                ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                return companion.varint64Size$wire_runtime(companion.encodeZigZag64$wire_runtime(value));
            }

            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) {
                encode(protoWriter, l.longValue());
            }

            public void encode(ReverseProtoWriter writer, long value) {
                writer.getClass();
                writer.writeVarint64(ProtoWriter.INSTANCE.encodeZigZag64$wire_runtime(value));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                reader.getClass();
                return Long.valueOf(ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(reader.readVarint64()));
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<String> commonString() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(String.class);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<String>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonString$1
            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader reader) {
                reader.getClass();
                return reader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, String value) {
                writer.getClass();
                value.getClass();
                writer.writeString(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(String value) {
                value.getClass();
                return (int) mha.B(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String redact(String value) {
                value.getClass();
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader32 reader) {
                reader.getClass();
                return reader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, String value) {
                writer.getClass();
                value.getClass();
                writer.writeString(value);
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<List<?>> commonStructList() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Map.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<List<?>>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructList$1
            @Override // com.squareup.wire.ProtoAdapter
            public List<?> decode(ProtoReader reader) {
                reader.getClass();
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return arrayList;
                    }
                    if (nextTag != 1) {
                        reader.skip();
                    } else {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, List<?> value) {
                writer.getClass();
                if (value == null) {
                    return;
                }
                Iterator<?> it = value.iterator();
                while (it.hasNext()) {
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 1, (int) it.next());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(List<?> value) {
                int i = 0;
                if (value == null) {
                    return 0;
                }
                Iterator<?> it = value.iterator();
                while (it.hasNext()) {
                    i += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(1, it.next());
                }
                return i;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<Object> redact(List<?> value) {
                if (value == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(k13.r(value, 10));
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    arrayList.add(ProtoAdapter.STRUCT_VALUE.redact(it.next()));
                }
                return arrayList;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, List<?> value) {
                writer.getClass();
                if (value == null) {
                    return;
                }
                for (int size = value.size() - 1; -1 < size; size--) {
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 1, (int) value.get(size));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<?> decode(ProtoReader32 reader) {
                reader.getClass();
                ArrayList arrayList = new ArrayList();
                int beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return arrayList;
                    }
                    if (nextTag != 1) {
                        reader.skip();
                    } else {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(reader));
                    }
                }
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Map<String, ?>> commonStructMap() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Map.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Map<String, ?>>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructMap$1
            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, ?> decode(ProtoReader reader) {
                reader.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return linkedHashMap;
                    }
                    if (nextTag != 1) {
                        reader.skip();
                    } else {
                        long beginMessage2 = reader.beginMessage();
                        String str = null;
                        Object obj = null;
                        while (true) {
                            int nextTag2 = reader.nextTag();
                            if (nextTag2 == -1) {
                                break;
                            }
                            if (nextTag2 == 1) {
                                str = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag2 != 2) {
                                reader.readUnknownField(nextTag2);
                            } else {
                                obj = ProtoAdapter.STRUCT_VALUE.decode(reader);
                            }
                        }
                        reader.endMessageAndGetUnknownFields(beginMessage2);
                        if (str != null) {
                            linkedHashMap.put(str, obj);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Map<String, ?> value) {
                writer.getClass();
                if (value == null) {
                    return;
                }
                Set<Map.Entry<String, ?>> entrySet = value.entrySet();
                Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[0]);
                ph0.O(entryArr);
                for (Map.Entry entry : entryArr) {
                    String str = (String) entry.getKey();
                    Object value2 = entry.getValue();
                    int byteCount = writer.getByteCount();
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 2, (int) value2);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) str);
                    writer.writeVarint32(writer.getByteCount() - byteCount);
                    writer.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Map<String, ?> value) {
                int i = 0;
                if (value == null) {
                    return 0;
                }
                for (Map.Entry<String, ?> entry : value.entrySet()) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    int encodedSizeWithTag = ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(2, value2) + ProtoAdapter.STRING.encodedSizeWithTag(1, key);
                    ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                    i += companion.varint32Size$wire_runtime(encodedSizeWithTag) + companion.tagSize$wire_runtime(1) + encodedSizeWithTag;
                }
                return i;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, Object> redact(Map<String, ?> value) {
                if (value == null) {
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(value.size()));
                Iterator<T> it = value.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ProtoAdapter.STRUCT_VALUE.redact(entry));
                }
                return linkedHashMap;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Map<String, ?> value) {
                writer.getClass();
                if (value == null) {
                    return;
                }
                for (Map.Entry<String, ?> entry : value.entrySet()) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, key);
                    ProtoAdapter<Object> protoAdapter2 = ProtoAdapter.STRUCT_VALUE;
                    int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, value2) + encodedSizeWithTag;
                    writer.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                    writer.writeVarint32(encodedSizeWithTag2);
                    protoAdapter.encodeWithTag(writer, 1, (int) key);
                    protoAdapter2.encodeWithTag(writer, 2, (int) value2);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, ?> decode(ProtoReader32 reader) {
                reader.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return linkedHashMap;
                    }
                    if (nextTag != 1) {
                        reader.skip();
                    } else {
                        int beginMessage2 = reader.beginMessage();
                        String str = null;
                        Object obj = null;
                        while (true) {
                            int nextTag2 = reader.nextTag();
                            if (nextTag2 == -1) {
                                break;
                            }
                            if (nextTag2 == 1) {
                                str = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag2 != 2) {
                                reader.readUnknownField(nextTag2);
                            } else {
                                obj = ProtoAdapter.STRUCT_VALUE.decode(reader);
                            }
                        }
                        reader.endMessageAndGetUnknownFields(beginMessage2);
                        if (str != null) {
                            linkedHashMap.put(str, obj);
                        }
                    }
                }
            }
        };
    }

    @NotNull
    public static final ProtoAdapter commonStructNull() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Void.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructNull$1
            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader reader) {
                reader.getClass();
                int readVarint32 = reader.readVarint32();
                if (readVarint32 == 0) {
                    return null;
                }
                is8.e(ljg.j(readVarint32, "expected 0 but was "));
                return null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Void value) {
                writer.getClass();
                writer.writeVarint32(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter writer, int tag, Void value) {
                writer.getClass();
                writer.writeTag(tag, getFieldEncoding());
                encode(writer, value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Void value) {
                return ProtoWriter.INSTANCE.varint32Size$wire_runtime(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int tag, Void value) {
                int encodedSize = encodedSize(value);
                ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                return companion.varint32Size$wire_runtime(encodedSize) + companion.tagSize$wire_runtime(tag);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void redact(Void value) {
                return null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Void value) {
                writer.getClass();
                writer.writeVarint32(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ReverseProtoWriter writer, int tag, Void value) {
                writer.getClass();
                encode(writer, value);
                writer.writeTag(tag, getFieldEncoding());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader32 reader) {
                reader.getClass();
                int readVarint32 = reader.readVarint32();
                if (readVarint32 == 0) {
                    return null;
                }
                is8.e(ljg.j(readVarint32, "expected 0 but was "));
                return null;
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Object> commonStructValue() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Object.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Object>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructValue$1
            @Override // com.squareup.wire.ProtoAdapter
            public Object decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return obj;
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRUCT_NULL.decode(reader);
                            break;
                        case 2:
                            obj = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        case 3:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 5:
                            obj = ProtoAdapter.STRUCT_MAP.decode(reader);
                            break;
                        case 6:
                            obj = ProtoAdapter.STRUCT_LIST.decode(reader);
                            break;
                        default:
                            reader.skip();
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Object value) {
                writer.getClass();
                if (value == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 1, (int) value);
                    return;
                }
                if (value instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(((Number) value).doubleValue()));
                    return;
                }
                if (value instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value);
                    return;
                }
                if (value instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) value);
                    return;
                }
                if (value instanceof Map) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (int) value);
                } else if (value instanceof List) {
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 6, (int) value);
                } else {
                    a70.p(mz1.m(value, "unexpected struct value: "));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ReverseProtoWriter writer, int tag, Object value) {
                writer.getClass();
                if (value != null) {
                    super.encodeWithTag(writer, tag, (int) value);
                    return;
                }
                int byteCount = writer.getByteCount();
                encode(writer, value);
                writer.writeVarint32(writer.getByteCount() - byteCount);
                writer.writeTag(tag, getFieldEncoding());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Object value) {
                if (value == null) {
                    return ProtoAdapter.STRUCT_NULL.encodedSizeWithTag(1, value);
                }
                if (value instanceof Number) {
                    return ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(((Number) value).doubleValue()));
                }
                if (value instanceof String) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(3, value);
                }
                if (value instanceof Boolean) {
                    return ProtoAdapter.BOOL.encodedSizeWithTag(4, value);
                }
                if (value instanceof Map) {
                    return ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(5, (Map) value);
                }
                if (value instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.encodedSizeWithTag(6, value);
                }
                a70.p(mz1.m(value, "unexpected struct value: "));
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int tag, Object value) {
                if (value != null) {
                    return super.encodedSizeWithTag(tag, value);
                }
                int encodedSize = encodedSize(value);
                ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                return companion.varint32Size$wire_runtime(encodedSize) + companion.tagSize$wire_runtime(tag) + encodedSize;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Object redact(Object value) {
                if (value == null) {
                    return ProtoAdapter.STRUCT_NULL.redact(value);
                }
                if (value instanceof Number) {
                    return value;
                }
                if (value instanceof String) {
                    return null;
                }
                if (value instanceof Boolean) {
                    return value;
                }
                if (value instanceof Map) {
                    return ProtoAdapter.STRUCT_MAP.redact((Map) value);
                }
                if (value instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.redact(value);
                }
                a70.p(mz1.m(value, "unexpected struct value: "));
                return null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter writer, int tag, Object value) {
                writer.getClass();
                if (value == null) {
                    writer.writeTag(tag, getFieldEncoding());
                    writer.writeVarint32(encodedSize(value));
                    encode(writer, value);
                    return;
                }
                super.encodeWithTag(writer, tag, (int) value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Object decode(ProtoReader32 reader) {
                reader.getClass();
                int beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRUCT_NULL.decode(reader);
                                break;
                            case 2:
                                obj = ProtoAdapter.DOUBLE.decode(reader);
                                break;
                            case 3:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                obj = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 5:
                                obj = ProtoAdapter.STRUCT_MAP.decode(reader);
                                break;
                            case 6:
                                obj = ProtoAdapter.STRUCT_LIST.decode(reader);
                                break;
                            default:
                                reader.skip();
                                break;
                        }
                    } else {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return obj;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Object value) {
                writer.getClass();
                if (value == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 1, (int) value);
                    return;
                }
                if (value instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(((Number) value).doubleValue()));
                    return;
                }
                if (value instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value);
                    return;
                }
                if (value instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) value);
                    return;
                }
                if (value instanceof Map) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (int) value);
                } else if (value instanceof List) {
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 6, (int) value);
                } else {
                    a70.p(mz1.m(value, "unexpected struct value: "));
                }
            }
        };
    }

    @NotNull
    public static final <E> String commonToString(E e) {
        return String.valueOf(e);
    }

    public static final <E> void commonTryDecode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull ProtoReader protoReader, @NotNull List<E> list) {
        protoAdapter.getClass();
        protoReader.getClass();
        list.getClass();
        if (protoReader.beforePossiblyPackedScalar$wire_runtime()) {
            list.add(protoAdapter.decode(protoReader));
        }
    }

    @NotNull
    public static final ProtoAdapter<Integer> commonUint32() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonUint32$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                reader.getClass();
                return Integer.valueOf(reader.readVarint32());
            }

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

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            public void encode(ProtoWriter writer, int value) {
                writer.getClass();
                writer.writeVarint32(value);
            }

            public int encodedSize(int value) {
                return ProtoWriter.INSTANCE.varint32Size$wire_runtime(value);
            }

            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, int value) {
                writer.getClass();
                writer.writeVarint32(value);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                reader.getClass();
                return Integer.valueOf(reader.readVarint32());
            }
        };
    }

    @NotNull
    public static final ProtoAdapter<Long> commonUint64() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonUint64$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                reader.getClass();
                return Long.valueOf(reader.readVarint64());
            }

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

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            public void encode(ProtoWriter writer, long value) {
                writer.getClass();
                writer.writeVarint64(value);
            }

            public int encodedSize(long value) {
                return ProtoWriter.INSTANCE.varint64Size$wire_runtime(value);
            }

            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, long value) {
                writer.getClass();
                writer.writeVarint64(value);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                reader.getClass();
                return Long.valueOf(reader.readVarint64());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> ProtoAdapter<?> commonWithLabel(@NotNull ProtoAdapter<E> protoAdapter, @NotNull WireField.Label label) {
        protoAdapter.getClass();
        label.getClass();
        return label.isRepeated() ? label.isPacked() ? protoAdapter.asPacked() : protoAdapter.asRepeated() : protoAdapter;
    }

    @NotNull
    public static final <T> ProtoAdapter<T> commonWrapper(@NotNull final ProtoAdapter<T> protoAdapter, @NotNull final String str) {
        protoAdapter.getClass();
        str.getClass();
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass<?> type = protoAdapter.getType();
        final Syntax syntax = Syntax.PROTO_3;
        final T identity = protoAdapter.getIdentity();
        return new ProtoAdapter<T>(str, fieldEncoding, type, syntax, identity) { // from class: com.squareup.wire.ProtoAdapterKt$commonWrapper$1
            @Override // com.squareup.wire.ProtoAdapter
            public T decode(ProtoReader reader) {
                reader.getClass();
                T identity2 = protoAdapter.getIdentity();
                ProtoAdapter<T> protoAdapter2 = protoAdapter;
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return identity2;
                    }
                    if (nextTag == 1) {
                        identity2 = protoAdapter2.decode(reader);
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, T value) {
                writer.getClass();
                if (value == null || value.equals(protoAdapter.getIdentity())) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(T value) {
                if (value == null || value.equals(protoAdapter.getIdentity())) {
                    return 0;
                }
                return protoAdapter.encodedSizeWithTag(1, value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public T redact(T value) {
                if (value == null) {
                    return null;
                }
                return protoAdapter.redact(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, T value) {
                writer.getClass();
                if (value == null || value.equals(protoAdapter.getIdentity())) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public T decode(ProtoReader32 reader) {
                reader.getClass();
                T identity2 = protoAdapter.getIdentity();
                ProtoAdapter<T> protoAdapter2 = protoAdapter;
                int beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return identity2;
                    }
                    if (nextTag == 1) {
                        identity2 = protoAdapter2.decode(reader);
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }
        };
    }

    public static final <E> void delegateEncode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull ReverseProtoWriter reverseProtoWriter, E e) {
        protoAdapter.getClass();
        reverseProtoWriter.getClass();
        reverseProtoWriter.writeForward$wire_runtime(new ProtoAdapterKt$delegateEncode$1(protoAdapter, e));
    }

    public static final <E> E commonDecode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull gc2 gc2Var) {
        protoAdapter.getClass();
        gc2Var.getClass();
        return protoAdapter.decode(ProtoReader32Kt.ProtoReader32$default(gc2Var, 0, 0, 6, (Object) null));
    }

    @NotNull
    public static final <E> byte[] commonEncode(@NotNull ProtoAdapter<E> protoAdapter, E e) {
        protoAdapter.getClass();
        x52 x52Var = new x52();
        protoAdapter.encode((k62) x52Var, (x52) e);
        return x52Var.j0(x52Var.b);
    }

    public static final <E> E commonDecode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull l62 l62Var) {
        protoAdapter.getClass();
        l62Var.getClass();
        return protoAdapter.decode(new ProtoReader(l62Var));
    }

    public static final <E> void commonTryDecode(@NotNull ProtoAdapter<E> protoAdapter, @NotNull ProtoReader32 protoReader32, @NotNull List<E> list) {
        protoAdapter.getClass();
        protoReader32.getClass();
        list.getClass();
        if (protoReader32.beforePossiblyPackedScalar()) {
            list.add(protoAdapter.decode(protoReader32));
        }
    }

    public static final <E> void commonEncodeWithTag(@NotNull ProtoAdapter<E> protoAdapter, @NotNull ProtoWriter protoWriter, int i, @Nullable E e) {
        protoAdapter.getClass();
        protoWriter.getClass();
        if (e == null) {
            return;
        }
        protoWriter.writeTag(i, protoAdapter.getFieldEncoding());
        if (protoAdapter.getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            protoWriter.writeVarint32(protoAdapter.encodedSize(e));
        }
        protoAdapter.encode(protoWriter, (ProtoWriter) e);
    }
}
