package com.squareup.wire.internal;

import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.controller.a;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoReader32;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.dmi;
import defpackage.duf;
import defpackage.fc6;
import defpackage.k13;
import defpackage.km5;
import defpackage.lm5;
import defpackage.lnb;
import defpackage.ogj;
import defpackage.sub;
import defpackage.tz9;
import defpackage.vha;
import defpackage.wt3;
import defpackage.wx4;
import defpackage.yhk;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006\u001a,\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u000bH\u0007\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\u001a>\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\rH\u0007\u001a2\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\r\u001a(\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\u001a:\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\r\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\r\u001a:\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\r\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\r\u001a!\u0010\u0010\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0012\u001a1\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001aH\u0007¢\u0006\u0002\b\u001b\u001aC\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\r\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00060\u001aH\u0007¢\u0006\u0002\b\u001b\u001a\u001a\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015\u001a'\u0010 \u001a\u00060!j\u0002`\"2\u0016\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150$\"\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010%\u001a\u0012\u0010&\u001a\u00020'2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b\u001a\u0016\u0010&\u001a\u00020'2\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r\u001a\u001a\u0010(\u001a\u00020)2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015\u001a$\u0010(\u001a\u00020)2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\b\u0010*\u001a\u0004\u0018\u00010\u0015\u001aK\u0010(\u001a\u00020)2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\b\u0010*\u001a\u0004\u0018\u00010\u00152\b\u0010+\u001a\u0004\u0018\u00010\u00152\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150$\"\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010-\u001a\u000e\u0010/\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t\u001a\u0014\u0010/\u001a\u00020\t2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u001a\u000e\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\t\u001a\u0016\u00103\u001a\u00020\t2\u0006\u00102\u001a\u00020\t2\u0006\u00104\u001a\u00020\t\u001a\u000e\u00105\u001a\u00020\t2\u0006\u00102\u001a\u00020\t\u001a\u001e\u00106\u001a\u00020'2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010<\u001a\u00020'2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010=\u001a\u00020'2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010>\u001a\u00020'2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010?\u001a\u00020'2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010@\u001a\u00020'2\u0006\u00107\u001a\u00020A2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010B\u001a\u00020'2\u0006\u00107\u001a\u00020A2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010C\u001a\u00020'2\u0006\u00107\u001a\u00020A2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010D\u001a\u00020'2\u0006\u00107\u001a\u00020A2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010E\u001a\u00020'2\u0006\u00107\u001a\u00020A2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010F\u001a\u00020'2\u0006\u00107\u001a\u00020G2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u001e\u0010H\u001a\u00020'2\u0006\u00107\u001a\u00020I2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)\u001a\u000e\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010O\u001a\u00020)2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010O\u001a\u00020)2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010P\u001a\u00020Q2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010P\u001a\u00020Q2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010R\u001a\u00020S2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010R\u001a\u00020S2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010T\u001a\u00020)2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010T\u001a\u00020)2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010U\u001a\u00020Q2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010U\u001a\u00020Q2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010V\u001a\u00020)2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010V\u001a\u00020)2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010W\u001a\u00020Q2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010W\u001a\u00020Q2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010X\u001a\u00020)2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010X\u001a\u00020)2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010Y\u001a\u00020Q2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010Y\u001a\u00020Q2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010Z\u001a\u00020)2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010Z\u001a\u00020)2\u0006\u0010L\u001a\u00020N\u001a\u000e\u0010[\u001a\u00020Q2\u0006\u0010L\u001a\u00020M\u001a\u000e\u0010[\u001a\u00020Q2\u0006\u0010L\u001a\u00020N\u001a\u001f\u0010\\\u001a\u00020\u001d*\u00060]j\u0002`^2\b\u0010_\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0002\u0010`\u001a\u0015\u0010a\u001a\u00020)*\u00060]j\u0002`^H\u0000¢\u0006\u0002\u0010b\u001a\u001f\u0010\\\u001a\u00020\u001d*\u00060cj\u0002`d2\b\u0010_\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0002\u0010e\u001a\u0015\u0010a\u001a\u00020)*\u00060cj\u0002`dH\u0000¢\u0006\u0002\u0010f\" \u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u000e\u0010.\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006g"}, d2 = {"newMutableList", "", "T", "newMutableMap", "", PlayerKt.AMERICAN_FOOTBALL_KICKER, "V", "copyOf", "name", "", "list", "", "map", "", "immutableCopyOf", "immutableCopyOfMapWithStructValues", "immutableCopyOfStruct", U3.i.X, "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "typeName", "Lkotlin/reflect/KClass;", "", "getTypeName$Internal__InternalKt", "(Ljava/lang/Object;)Lkotlin/reflect/KClass;", "redactElements", L6.G1, "Lcom/squareup/wire/ProtoAdapter;", "-redactElements", "equals", "", "a", "b", "missingRequiredFields", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "args", "", "([Ljava/lang/Object;)Ljava/lang/IllegalStateException;", "checkElementsNotNull", "", "countNonNull", "", a.q, "d", "rest", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)I", "ESCAPED_CHARS", "sanitize", "values", "boxedOneOfClassName", "oneOfName", "boxedOneOfKeyFieldName", "fieldName", "boxedOneOfKeysFieldName", "encodeArray_int32", "array", "", "writer", "Lcom/squareup/wire/ReverseProtoWriter;", "tag", "encodeArray_uint32", "encodeArray_sint32", "encodeArray_fixed32", "encodeArray_sfixed32", "encodeArray_int64", "", "encodeArray_uint64", "encodeArray_sint64", "encodeArray_fixed64", "encodeArray_sfixed64", "encodeArray_float", "", "encodeArray_double", "", "decodePrimitive_double", "", "reader", "Lcom/squareup/wire/ProtoReader32;", "Lcom/squareup/wire/ProtoReader;", "decodePrimitive_fixed32", "decodePrimitive_fixed64", "", "decodePrimitive_float", "", "decodePrimitive_int32", "decodePrimitive_int64", "decodePrimitive_sfixed32", "decodePrimitive_sfixed64", "decodePrimitive_sint32", "decodePrimitive_sint64", "decodePrimitive_uint32", "decodePrimitive_uint64", "commonEquals", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "other", "(Ljava/time/Instant;Ljava/lang/Object;)Z", "commonHashCode", "(Ljava/time/Instant;)I", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "(Ljava/time/Duration;Ljava/lang/Object;)Z", "(Ljava/time/Duration;)I", "wire-runtime"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/squareup/wire/internal/Internal")
/* loaded from: classes6.dex */
final /* synthetic */ class Internal__InternalKt {

    @NotNull
    private static final String ESCAPED_CHARS = ",[]{}\\";

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: -redactElements, reason: not valid java name */
    public static final <K, V> Map<K, V> m720redactElements(@NotNull Map<K, ? extends V> map, @NotNull ProtoAdapter<V> protoAdapter) {
        map.getClass();
        protoAdapter.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), protoAdapter.redact(entry.getValue()));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final String boxedOneOfClassName(@NotNull String str) {
        str.getClass();
        if (str.length() <= 0) {
            return str;
        }
        return ((Object) tz9.Q(str.charAt(0))) + str.substring(1);
    }

    @NotNull
    public static final String boxedOneOfKeyFieldName(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        String upperCase = (str + '_' + str2).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    @NotNull
    public static final String boxedOneOfKeysFieldName(@NotNull String str) {
        str.getClass();
        String upperCase = (str + "_keys").toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public static final void checkElementsNotNull(@NotNull Map<?, ?> map) {
        map.getClass();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                yhk.s("map.containsKey(null)");
                return;
            } else if (value == null) {
                yhk.s(lnb.m(key, "Value for key ", " is null"));
                return;
            }
        }
    }

    public static final boolean commonEquals(@NotNull Instant instant, @Nullable Object obj) {
        instant.getClass();
        if (instant == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Instant)) {
            return false;
        }
        Instant instant2 = (Instant) obj;
        return instant.getEpochSecond() == instant2.getEpochSecond() && instant.getNano() == instant2.getNano();
    }

    public static final int commonHashCode(@NotNull Instant instant) {
        instant.getClass();
        return Integer.hashCode(instant.getNano()) + (Long.hashCode(instant.getEpochSecond()) * 31);
    }

    @NotNull
    public static final <T> List<T> copyOf(@NotNull List<? extends T> list) {
        list.getClass();
        return (list == km5.a || (list instanceof ImmutableList)) ? new MutableOnWriteList(list) : new ArrayList(list);
    }

    public static final int countNonNull(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @NotNull Object... objArr) {
        objArr.getClass();
        int i = obj != null ? 1 : 0;
        if (obj2 != null) {
            i++;
        }
        if (obj3 != null) {
            i++;
        }
        if (obj4 != null) {
            i++;
        }
        for (Object obj5 : objArr) {
            if (obj5 != null) {
                i++;
            }
        }
        return i;
    }

    public static final double decodePrimitive_double(@NotNull ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return Double.longBitsToDouble(protoReader32.readFixed64());
    }

    public static final int decodePrimitive_fixed32(@NotNull ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readFixed32();
    }

    public static final long decodePrimitive_fixed64(@NotNull ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readFixed64();
    }

    public static final float decodePrimitive_float(@NotNull ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return Float.intBitsToFloat(protoReader32.readFixed32());
    }

    public static final int decodePrimitive_int32(@NotNull ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readVarint32();
    }

    public static final long decodePrimitive_int64(@NotNull ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readVarint64();
    }

    public static final int decodePrimitive_sfixed32(@NotNull ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readFixed32();
    }

    public static final long decodePrimitive_sfixed64(@NotNull ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readFixed64();
    }

    public static final int decodePrimitive_sint32(@NotNull ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(protoReader32.readVarint32());
    }

    public static final long decodePrimitive_sint64(@NotNull ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(protoReader32.readVarint64());
    }

    public static final int decodePrimitive_uint32(@NotNull ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readVarint32();
    }

    public static final long decodePrimitive_uint64(@NotNull ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return protoReader32.readVarint64();
    }

    public static final void encodeArray_double(@NotNull double[] dArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        dArr.getClass();
        reverseProtoWriter.getClass();
        if (dArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = dArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeFixed64(Double.doubleToLongBits(dArr[length]));
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        iArr.getClass();
        reverseProtoWriter.getClass();
        if (iArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = iArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeFixed32(iArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_fixed64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        jArr.getClass();
        reverseProtoWriter.getClass();
        if (jArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = jArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeFixed64(jArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_float(@NotNull float[] fArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        fArr.getClass();
        reverseProtoWriter.getClass();
        if (fArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = fArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeFixed32(Float.floatToIntBits(fArr[length]));
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_int32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        iArr.getClass();
        reverseProtoWriter.getClass();
        if (iArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = iArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeSignedVarint32$wire_runtime(iArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_int64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        jArr.getClass();
        reverseProtoWriter.getClass();
        if (jArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = jArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeVarint64(jArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sfixed32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        iArr.getClass();
        reverseProtoWriter.getClass();
        Internal.encodeArray_fixed32(iArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_sfixed64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        jArr.getClass();
        reverseProtoWriter.getClass();
        Internal.encodeArray_fixed64(jArr, reverseProtoWriter, i);
    }

    public static final void encodeArray_sint32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        iArr.getClass();
        reverseProtoWriter.getClass();
        if (iArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = iArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeVarint32(ProtoWriter.INSTANCE.encodeZigZag32$wire_runtime(iArr[length]));
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_sint64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        jArr.getClass();
        reverseProtoWriter.getClass();
        if (jArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = jArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeVarint64(ProtoWriter.INSTANCE.encodeZigZag64$wire_runtime(jArr[length]));
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint32(@NotNull int[] iArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        iArr.getClass();
        reverseProtoWriter.getClass();
        if (iArr.length == 0) {
            return;
        }
        int byteCount = reverseProtoWriter.getByteCount();
        for (int length = iArr.length - 1; -1 < length; length--) {
            reverseProtoWriter.writeVarint32(iArr[length]);
        }
        reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        reverseProtoWriter.writeTag(i, FieldEncoding.LENGTH_DELIMITED);
    }

    public static final void encodeArray_uint64(@NotNull long[] jArr, @NotNull ReverseProtoWriter reverseProtoWriter, int i) {
        jArr.getClass();
        reverseProtoWriter.getClass();
        Internal.encodeArray_int64(jArr, reverseProtoWriter, i);
    }

    public static final boolean equals(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private static final KClass<? extends Object> getTypeName$Internal__InternalKt(Object obj) {
        return duf.a.getOrCreateKotlinClass(obj.getClass());
    }

    @NotNull
    public static final <K, V> Map<K, V> immutableCopyOf(@NotNull String str, @NotNull Map<K, ? extends V> map) {
        str.getClass();
        map.getClass();
        if (map.isEmpty()) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return lm5Var;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set<K> keySet = linkedHashMap.keySet();
        keySet.getClass();
        if (keySet.contains(null)) {
            ogj.h(dmi.y(str, ".containsKey(null)"));
            return null;
        }
        Collection<V> values = linkedHashMap.values();
        values.getClass();
        if (values.contains(null)) {
            ogj.h(dmi.y(str, ".containsValue(null)"));
            return null;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> immutableCopyOfMapWithStructValues(@NotNull String str, @NotNull Map<K, ? extends V> map) {
        str.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null) {
                ogj.h(dmi.y(str, ".containsKey(null)"));
                return null;
            }
            linkedHashMap.put(key, Internal.immutableCopyOfStruct(str, value));
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public static final <T> T immutableCopyOfStruct(@NotNull String str, T t) {
        str.getClass();
        if (t == null) {
            return t;
        }
        if (t instanceof Boolean) {
            return t;
        }
        if (t instanceof Double) {
            return t;
        }
        if (t instanceof String) {
            return t;
        }
        if (t instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) t).iterator();
            while (it.hasNext()) {
                arrayList.add(Internal.immutableCopyOfStruct(str, it.next()));
            }
            T t2 = (T) Collections.unmodifiableList(arrayList);
            t2.getClass();
            return t2;
        }
        if (!(t instanceof Map)) {
            StringBuilder q = wt3.q("struct value ", str, " must be a JSON type (null, Boolean, Double, String, List, or Map) but was ");
            q.append(getTypeName$Internal__InternalKt(t));
            q.append(": ");
            q.append(t);
            throw new IllegalArgumentException(q.toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) t).entrySet()) {
            linkedHashMap.put(Internal.immutableCopyOfStruct(str, entry.getKey()), Internal.immutableCopyOfStruct(str, entry.getValue()));
        }
        T t3 = (T) Collections.unmodifiableMap(linkedHashMap);
        t3.getClass();
        return t3;
    }

    @NotNull
    public static final IllegalStateException missingRequiredFields(@NotNull Object... objArr) {
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int v = vha.v(0, objArr.length - 1, 2);
        String str = "";
        if (v >= 0) {
            while (true) {
                if (objArr[i] == null) {
                    if (sb.length() > 0) {
                        str = "s";
                    }
                    sb.append("\n  ");
                    sb.append(objArr[i + 1]);
                }
                if (i == v) {
                    break;
                }
                i += 2;
            }
        }
        throw new IllegalStateException(fc6.n("Required field", str, " not set:", sb.toString()));
    }

    @NotNull
    public static final <T> List<T> newMutableList() {
        return new MutableOnWriteList(km5.a);
    }

    @NotNull
    public static final <K, V> Map<K, V> newMutableMap() {
        return new LinkedHashMap();
    }

    @NotNull
    public static final String sanitize(@NotNull String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (StringsKt.K(ESCAPED_CHARS, charAt)) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static final int decodePrimitive_fixed32(@NotNull ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readFixed32();
    }

    public static final long decodePrimitive_fixed64(@NotNull ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readFixed64();
    }

    public static final int decodePrimitive_int32(@NotNull ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readVarint32();
    }

    public static final long decodePrimitive_int64(@NotNull ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readVarint64();
    }

    public static final int decodePrimitive_sfixed32(@NotNull ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readFixed32();
    }

    public static final long decodePrimitive_sfixed64(@NotNull ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readFixed64();
    }

    public static final int decodePrimitive_uint32(@NotNull ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readVarint32();
    }

    public static final long decodePrimitive_uint64(@NotNull ProtoReader protoReader) {
        protoReader.getClass();
        return protoReader.readVarint64();
    }

    public static final double decodePrimitive_double(@NotNull ProtoReader protoReader) {
        protoReader.getClass();
        return Double.longBitsToDouble(protoReader.readFixed64());
    }

    public static final float decodePrimitive_float(@NotNull ProtoReader protoReader) {
        protoReader.getClass();
        return Float.intBitsToFloat(protoReader.readFixed32());
    }

    public static final int decodePrimitive_sint32(@NotNull ProtoReader protoReader) {
        protoReader.getClass();
        return ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(protoReader.readVarint32());
    }

    public static final long decodePrimitive_sint64(@NotNull ProtoReader protoReader) {
        protoReader.getClass();
        return ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(protoReader.readVarint64());
    }

    public static final int commonHashCode(@NotNull Duration duration) {
        duration.getClass();
        return Integer.hashCode(duration.getNano()) + (Long.hashCode(duration.getSeconds()) * 31);
    }

    @wx4
    @NotNull
    public static final <K, V> Map<K, V> copyOf(@NotNull String str, @Nullable Map<K, ? extends V> map) {
        str.getClass();
        map.getClass();
        return Internal.copyOf(map);
    }

    @NotNull
    public static final <K, V> Map<K, V> copyOf(@NotNull Map<K, ? extends V> map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    @wx4
    @NotNull
    public static final <T> List<T> copyOf(@NotNull String str, @Nullable List<? extends T> list) {
        str.getClass();
        list.getClass();
        return Internal.copyOf(list);
    }

    public static final int countNonNull(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0) + (obj3 != null ? 1 : 0);
    }

    public static final int countNonNull(@Nullable Object obj, @Nullable Object obj2) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0);
    }

    public static final boolean commonEquals(@NotNull Duration duration, @Nullable Object obj) {
        duration.getClass();
        if (duration == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Duration)) {
            return false;
        }
        Duration duration2 = (Duration) obj;
        return duration.getSeconds() == duration2.getSeconds() && duration.getNano() == duration2.getNano();
    }

    @NotNull
    public static final String sanitize(@NotNull List<String> list) {
        list.getClass();
        return CollectionsKt.f0(list, null, U3.j.d, U3.j.e, Internal__InternalKt$sanitize$2.INSTANCE, 25);
    }

    public static final void checkElementsNotNull(@NotNull List<?> list) {
        list.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == null) {
                yhk.s(lnb.k(i, "Element at index ", " is null"));
                return;
            }
        }
    }

    @NotNull
    /* renamed from: -redactElements, reason: not valid java name */
    public static final <T> List<T> m719redactElements(@NotNull List<? extends T> list, @NotNull ProtoAdapter<T> protoAdapter) {
        list.getClass();
        protoAdapter.getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(protoAdapter.redact(it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> immutableCopyOf(@NotNull String str, @NotNull List<? extends T> list) {
        str.getClass();
        list.getClass();
        if (list instanceof MutableOnWriteList) {
            list = (List<T>) ((MutableOnWriteList) list).getMutableList$wire_runtime();
        }
        if (list != km5.a && !(list instanceof ImmutableList)) {
            ImmutableList immutableList = new ImmutableList(list);
            list = (List<T>) null;
            if (!immutableList.contains(null)) {
                return immutableList;
            }
            ogj.h(str.concat(".contains(null)"));
        }
        return (List<T>) list;
    }
}
