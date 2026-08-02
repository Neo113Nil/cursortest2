package com.braze.managers;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.h2;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
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
import okhttp3.HttpUrl;

/* loaded from: classes6.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f610a;
    public final ArrayList b;
    public final h2 c;

    public v0(Context context, String apiKey) {
        Map linkedHashMap;
        Map emptyMap;
        KSerializer MapSerializer;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f610a = reentrantLock;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        h2 h2Var = new h2(context, apiKey);
        this.c = h2Var;
        reentrantLock.lock();
        try {
            arrayList.clear();
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = h2Var.readData(dataStoreKey, "");
                    Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) readData;
                    if (StringsKt.isBlank(str)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        if (StringsKt.isBlank(str)) {
                            emptyMap = MapsKt.emptyMap();
                        } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), AbstractJsonLexerKt.NULL)) {
                            emptyMap = MapsKt.emptyMap();
                        } else {
                            try {
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) s0.f604a, 6, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                }
                                Object decodeFromString = Json.INSTANCE.decodeFromString(MapSerializer, str);
                                Intrinsics.checkNotNull(decodeFromString, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                emptyMap = (Map) decodeFromString;
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                            }
                        }
                        Map mutableMap = MapsKt.toMutableMap(emptyMap);
                        Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                        linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                    }
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new com.braze.storage.l0(dataStoreKey), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                this.b.add(new com.braze.models.push.a((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(List list) {
        return "Re-adding PDEs to storage: " + list;
    }

    public final void b(final ArrayList events) {
        Intrinsics.checkNotNullParameter(events, "events");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.v0$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v0.a(events);
            }
        }, 7, (Object) null);
        ReentrantLock reentrantLock = this.f610a;
        reentrantLock.lock();
        try {
            this.b.addAll(events);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01be A[Catch: all -> 0x0234, TRY_LEAVE, TryCatch #3 {all -> 0x0234, blocks: (B:6:0x001f, B:8:0x002f, B:9:0x01ab, B:11:0x01be, B:12:0x0226, B:18:0x01db, B:20:0x01dd, B:21:0x0205, B:26:0x01f3, B:29:0x020c, B:31:0x004b, B:33:0x005f, B:34:0x0066, B:36:0x006e, B:37:0x017b, B:38:0x0074, B:40:0x0084, B:42:0x008a, B:44:0x009c, B:45:0x013d, B:46:0x00ac, B:48:0x00b8, B:49:0x00ca, B:51:0x00d6, B:52:0x00e7, B:54:0x00f3, B:55:0x0104, B:57:0x0110, B:58:0x0121, B:60:0x012d, B:61:0x014b, B:64:0x0154, B:65:0x0157, B:70:0x0162, B:74:0x018c), top: B:5:0x001f, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final String pushCampaignId) {
        Map linkedHashMap;
        Map emptyMap;
        KSerializer MapSerializer;
        DataStoreKey dataStoreKey;
        String str;
        Intrinsics.checkNotNullParameter(pushCampaignId, "pushCampaignId");
        ReentrantLock reentrantLock = this.f610a;
        reentrantLock.lock();
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.v0$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v0.b(pushCampaignId);
                }
            }, 7, (Object) null);
            try {
                long nowInSeconds = DateTimeUtils.nowInSeconds();
                h2 h2Var = this.c;
                DataStoreKey dataStoreKey2 = DataStoreKey.PUSH_DELIVERY_EVENTS;
                if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                    BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey2), 12, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                } else {
                    try {
                        Object readData = h2Var.readData(dataStoreKey2, "");
                        Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                        String str2 = (String) readData;
                        if (StringsKt.isBlank(str2)) {
                            linkedHashMap = new LinkedHashMap();
                        } else {
                            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                            if (StringsKt.isBlank(str2)) {
                                emptyMap = MapsKt.emptyMap();
                            } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str2).toString(), AbstractJsonLexerKt.NULL)) {
                                emptyMap = MapsKt.emptyMap();
                            } else {
                                try {
                                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
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
                                        try {
                                            BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) t0.f606a, 6, (Object) null);
                                            emptyMap = MapsKt.emptyMap();
                                        } catch (Exception e) {
                                            e = e;
                                            dataStoreUtils = dataStoreUtils;
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                                            emptyMap = MapsKt.emptyMap();
                                            Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                            Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                            linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                            linkedHashMap.put(pushCampaignId, Long.valueOf(nowInSeconds));
                                            h2 h2Var2 = this.c;
                                            dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
                                            if (dataStoreKey.getType() == DataStoreValueType.MAP) {
                                            }
                                            this.b.add(new com.braze.models.push.a(pushCampaignId, nowInSeconds));
                                            reentrantLock.unlock();
                                        }
                                    }
                                    Object decodeFromString = Json.INSTANCE.decodeFromString(MapSerializer, str2);
                                    Intrinsics.checkNotNull(decodeFromString, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                    emptyMap = (Map) decodeFromString;
                                } catch (Exception e2) {
                                    e = e2;
                                }
                            }
                            Map mutableMap2 = MapsKt.toMutableMap(emptyMap);
                            Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                            linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap2);
                        }
                    } catch (Exception e3) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new com.braze.storage.l0(dataStoreKey2), 8, (Object) null);
                        linkedHashMap = new LinkedHashMap();
                    }
                }
                linkedHashMap.put(pushCampaignId, Long.valueOf(nowInSeconds));
                h2 h2Var22 = this.c;
                dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
                if (dataStoreKey.getType() == DataStoreValueType.MAP) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey), 12, (Object) null);
                } else {
                    try {
                        DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                        try {
                            Json.Companion companion = Json.INSTANCE;
                            companion.getSerializersModule();
                            str = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE), linkedHashMap);
                        } catch (Exception e4) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                            str = "{}";
                        }
                        h2Var22.writeData(dataStoreKey, str);
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.storage.r0(dataStoreKey), 8, (Object) null);
                    }
                }
                this.b.add(new com.braze.models.push.a(pushCampaignId, nowInSeconds));
                reentrantLock.unlock();
            } catch (Throwable th) {
                th = th;
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final String b(String str) {
        return "Adding push campaign to storage with uid " + str;
    }

    public final void a(ArrayList events) {
        Map linkedHashMap;
        Map emptyMap;
        KSerializer MapSerializer;
        String str;
        Intrinsics.checkNotNullParameter(events, "events");
        ReentrantLock reentrantLock = this.f610a;
        reentrantLock.lock();
        try {
            h2 h2Var = this.c;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = h2Var.readData(dataStoreKey, "");
                    Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) readData;
                    if (StringsKt.isBlank(str2)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        if (StringsKt.isBlank(str2)) {
                            emptyMap = MapsKt.emptyMap();
                        } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str2).toString(), AbstractJsonLexerKt.NULL)) {
                            emptyMap = MapsKt.emptyMap();
                        } else {
                            try {
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) u0.f608a, 6, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                }
                                Object decodeFromString = Json.INSTANCE.decodeFromString(MapSerializer, str2);
                                Intrinsics.checkNotNull(decodeFromString, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                emptyMap = (Map) decodeFromString;
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                            }
                        }
                        Map mutableMap = MapsKt.toMutableMap(emptyMap);
                        Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                        linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                    }
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new com.braze.storage.l0(dataStoreKey), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            Map map = linkedHashMap;
            Iterator it = events.iterator();
            while (it.hasNext()) {
                final com.braze.models.push.a aVar = (com.braze.models.push.a) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.v0$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return v0.a(com.braze.models.push.a.this);
                    }
                }, 7, (Object) null);
                map.remove(aVar.f());
            }
            h2 h2Var2 = this.c;
            DataStoreKey dataStoreKey2 = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey2), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    try {
                        Json.Companion companion = Json.INSTANCE;
                        companion.getSerializersModule();
                        str = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE), map);
                    } catch (Exception e3) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                        str = (!(map instanceof Map) && (map instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                    }
                    h2Var2.writeData(dataStoreKey2, str);
                } catch (Exception e4) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new com.braze.storage.r0(dataStoreKey2), 8, (Object) null);
                }
            }
            this.b.removeAll(events);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(com.braze.models.push.a aVar) {
        return "Clearing PDE from storage with uid " + aVar.f();
    }
}
