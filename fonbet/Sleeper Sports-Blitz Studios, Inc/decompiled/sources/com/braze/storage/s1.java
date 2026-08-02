package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
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
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public final class s1 {
    public static final long c = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final u1 f751a;
    public final Mutex b;

    public s1(Context context, String str, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f751a = new u1(context, str, apiKey);
        this.b = MutexKt.Mutex$default(false, 1, null);
        b();
    }

    public static final String b(com.braze.models.k kVar) {
        return "Event already seen in cache. Ignoring duplicate: " + kVar;
    }

    public final boolean a(final com.braze.models.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (((com.braze.models.outgoing.event.b) event).f640a != com.braze.enums.d.h) {
            return true;
        }
        b();
        String eventKey = o1.a(event);
        if (a().containsKey(eventKey)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.s1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s1.b(com.braze.models.k.this);
                }
            }, 7, (Object) null);
            return false;
        }
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds() + c;
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        BuildersKt__BuildersKt.runBlocking$default(null, new p1(this, eventKey, nowInMilliseconds, null), 1, null);
        return true;
    }

    public final void b() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        for (final Map.Entry entry : a().entrySet()) {
            try {
                if (nowInMilliseconds >= ((Number) entry.getValue()).longValue()) {
                    BuildersKt__BuildersKt.runBlocking$default(null, new q1(this, (String) entry.getKey(), null), 1, null);
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.s1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return s1.a(entry);
                    }
                }, 4, (Object) null);
                BuildersKt__BuildersKt.runBlocking$default(null, new q1(this, (String) entry.getKey(), null), 1, null);
            }
        }
    }

    public static final void a(s1 s1Var, Map map) {
        String str;
        u1 u1Var = s1Var.f751a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE), map);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = "{}";
            }
            u1Var.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
        }
    }

    public final Map a() {
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KSerializer MapSerializer;
        u1 u1Var = this.f751a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object readData = u1Var.readData(dataStoreKey, "");
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) r1.f747a, 6, (Object) null);
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

    public static final String a(Map.Entry entry) {
        return "Failed to get expiration time. Deleting entry: " + entry;
    }
}
