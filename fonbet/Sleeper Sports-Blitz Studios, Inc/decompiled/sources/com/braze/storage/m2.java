package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public final class m2 {
    public static final long b = TimeUnit.DAYS.toSeconds(45);

    /* renamed from: a, reason: collision with root package name */
    public final k2 f730a;

    public m2(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f730a = new k2(context, str2, str);
        b();
    }

    public static final String b(String str) {
        return "Push dedupe id " + str + " has already been seen. Returning false.";
    }

    public static final String c() {
        return "Push dedupe id is blank. Returning true.";
    }

    public final boolean a(final String pushId) {
        String str;
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        if (StringsKt.isBlank(pushId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.m2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m2.c();
                }
            }, 7, (Object) null);
            return true;
        }
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        if (a().containsKey(pushId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.m2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m2.b(pushId);
                }
            }, 7, (Object) null);
            return false;
        }
        b();
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        Map mutableMap = MapsKt.toMutableMap(a());
        mutableMap.put(pushId, Long.valueOf(DateTimeUtils.nowInSeconds()));
        k2 k2Var = this.f730a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    Json.Companion companion = Json.INSTANCE;
                    companion.getSerializersModule();
                    str = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE), mutableMap);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                    str = "{}";
                }
                k2Var.writeData(dataStoreKey, str);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
            }
        }
        return true;
    }

    public final void b() {
        String str;
        final long nowInSeconds = DateTimeUtils.nowInSeconds() - b;
        Map mutableMap = MapsKt.toMutableMap(a());
        Iterator it = mutableMap.entrySet().iterator();
        while (it.hasNext()) {
            final Map.Entry entry = (Map.Entry) it.next();
            if (((Number) entry.getValue()).longValue() < nowInSeconds) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.m2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m2.a(entry, nowInSeconds);
                    }
                }, 6, (Object) null);
                it.remove();
            }
        }
        k2 k2Var = this.f730a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE), mutableMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = "{}";
            }
            k2Var.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(Map.Entry entry, long j) {
        return "Evicting push id key " + entry.getKey() + " based on cutoff: " + j;
    }

    public final Map a() {
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KSerializer MapSerializer;
        k2 k2Var = this.f730a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object readData = k2Var.readData(dataStoreKey, "");
            Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
            String str = (String) readData;
            if (StringsKt.isBlank(str)) {
                return new LinkedHashMap();
            }
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            if (StringsKt.isBlank(str)) {
                emptyMap = MapsKt.emptyMap();
            } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), AbstractJsonLexerKt.NULL)) {
                emptyMap = MapsKt.emptyMap();
            } else {
                try {
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
                    try {
                        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(stringCompanionObject), BuiltinSerializersKt.serializer(stringCompanionObject));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                            MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                            MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                            MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                            MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                            MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
                        } else {
                            dataStoreUtils = dataStoreUtils2;
                            try {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) l2.f727a, 6, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                            } catch (Exception e) {
                                e = e;
                                exc = e;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                                Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                return TypeIntrinsics.asMutableMap(mutableMap);
                            }
                        }
                        Object decodeFromString = Json.INSTANCE.decodeFromString(MapSerializer, str);
                        Intrinsics.checkNotNull(decodeFromString, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                        emptyMap = (Map) decodeFromString;
                    } catch (Exception e2) {
                        exc = e2;
                        dataStoreUtils = dataStoreUtils2;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                        emptyMap = MapsKt.emptyMap();
                        Map mutableMap2 = MapsKt.toMutableMap(emptyMap);
                        Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                        return TypeIntrinsics.asMutableMap(mutableMap2);
                    }
                } catch (Exception e3) {
                    e = e3;
                    dataStoreUtils = dataStoreUtils2;
                }
            }
            Map mutableMap22 = MapsKt.toMutableMap(emptyMap);
            Intrinsics.checkNotNull(mutableMap22, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
            return TypeIntrinsics.asMutableMap(mutableMap22);
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new l0(dataStoreKey), 8, (Object) null);
            return new LinkedHashMap();
        }
    }
}
