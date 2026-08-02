package com.braze.managers;

import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.enums.GeofenceTransitionType;
import com.braze.events.IEventSubscriber;
import com.braze.models.BrazeGeofence;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
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
import kotlin.text.Regex;
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
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final GeofenceDataStoreProvider f599a;
    public final ConcurrentHashMap b;
    public final AtomicBoolean c;
    public long d;
    public long e;
    public int f;
    public int g;

    public n(b3 serverConfigStorageProvider, com.braze.events.e internalIEventMessenger, GeofenceDataStoreProvider dataStoreProvider) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalIEventMessenger, "internalIEventMessenger");
        Intrinsics.checkNotNullParameter(dataStoreProvider, "dataStoreProvider");
        this.f599a = dataStoreProvider;
        ((com.braze.events.d) internalIEventMessenger).c(com.braze.events.internal.y.class, new IEventSubscriber() { // from class: com.braze.managers.n$$ExternalSyntheticLambda8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                n.a(n.this, (com.braze.events.internal.y) obj);
            }
        });
        this.b = a();
        this.c = new AtomicBoolean(false);
        Object readData = dataStoreProvider.readData(DataStoreKey.GLOBAL_LAST_REQUEST, 0L);
        Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.Long");
        this.d = ((Long) readData).longValue();
        Object readData2 = dataStoreProvider.readData(DataStoreKey.GLOBAL_LAST_REPORT, 0L);
        Intrinsics.checkNotNull(readData2, "null cannot be cast to non-null type kotlin.Long");
        this.e = ((Long) readData2).longValue();
        this.f = serverConfigStorageProvider.t();
        this.g = serverConfigStorageProvider.s();
    }

    public static final String b(long j, int i, String str, GeofenceTransitionType geofenceTransitionType) {
        return j + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + i + "). id:" + str + " transition:" + geofenceTransitionType;
    }

    public static final String c(String str) {
        return "Deleting outdated id " + str + " from re-eligibility list.";
    }

    public static final String d(String str) {
        return "Retaining id " + str + " in re-eligibility list.";
    }

    public final void a(com.braze.models.response.m serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        final int i = serverConfig.e;
        if (i >= 0) {
            this.f = i;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.a(i);
                }
            }, 6, (Object) null);
        }
        final int i2 = serverConfig.f;
        if (i2 >= 0) {
            this.g = i2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.b(i2);
                }
            }, 6, (Object) null);
        }
    }

    public static final String b(String str, GeofenceTransitionType geofenceTransitionType) {
        return "Geofence report eligible since this geofence/transition combination has never been reported.id:" + str + " transition:" + geofenceTransitionType;
    }

    public static final String c() {
        return "Geofences have already been requested for the current session. Geofence request not eligible.";
    }

    public static final String b(long j, n nVar, String str) {
        return "Geofence report eligible since " + j + " seconds have passed since the last time geofences were reported globally (minimum interval: " + nVar.g + "). id:" + str;
    }

    public static final String c(long j) {
        return "Updating the last successful location request time to: " + j;
    }

    public static final String b(long j, n nVar) {
        return "Geofence request suppressed since only " + j + " seconds have passed since the last time geofences were requested (minimum interval: " + nVar.f + ").";
    }

    public static final String b() {
        return "Geofences have not been requested for the current session yet. Request is eligible.";
    }

    public final void b(final long j) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.c(j);
            }
        }, 7, (Object) null);
        this.d = j;
        this.f599a.writeData(DataStoreKey.GLOBAL_LAST_REQUEST, Long.valueOf(j));
    }

    public static final void a(n nVar, com.braze.events.internal.y it) {
        Intrinsics.checkNotNullParameter(it, "it");
        nVar.c.set(false);
    }

    public final void a(List brazeGeofenceList) {
        Map linkedHashMap;
        Map emptyMap;
        KSerializer MapSerializer;
        String str;
        Intrinsics.checkNotNullParameter(brazeGeofenceList, "brazeGeofenceList");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = brazeGeofenceList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((BrazeGeofence) it.next()).getId());
        }
        HashSet hashSet = new HashSet(this.b.keySet());
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.f599a;
        DataStoreKey dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = geofenceDataStoreProvider.readData(dataStoreKey, "");
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) m.f598a, 6, (Object) null);
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
        Iterator it2 = hashSet.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            final String str3 = (String) it2.next();
            Intrinsics.checkNotNull(str3);
            if (!linkedHashSet.contains(a(str3))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.c(str3);
                    }
                }, 7, (Object) null);
                this.b.remove(str3);
                map.remove(str3);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.d(str3);
                    }
                }, 7, (Object) null);
            }
        }
        GeofenceDataStoreProvider geofenceDataStoreProvider2 = this.f599a;
        DataStoreKey dataStoreKey2 = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey2), 12, (Object) null);
            return;
        }
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
            geofenceDataStoreProvider2.writeData(dataStoreKey2, str);
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new com.braze.storage.r0(dataStoreKey2), 8, (Object) null);
        }
    }

    public static final String b(String str) {
        return "Exception trying to parse re-eligibility id: " + str;
    }

    public static final String b(int i) {
        return "Min time since last geofence report reset via server configuration: " + i + ".";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0275 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j, BrazeGeofence geofence, final GeofenceTransitionType transitionType) {
        final String str;
        final n nVar;
        Map linkedHashMap;
        Map emptyMap;
        KSerializer MapSerializer;
        DataStoreKey dataStoreKey;
        String str2;
        Intrinsics.checkNotNullParameter(geofence, "geofence");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        final String id = geofence.getId();
        final long j2 = j - this.e;
        if (this.g > j2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.a(j2, this, id);
                }
            }, 7, (Object) null);
            return false;
        }
        String a2 = a(id, transitionType);
        final int cooldownEnterSeconds = transitionType == GeofenceTransitionType.ENTER ? geofence.getCooldownEnterSeconds() : geofence.getCooldownExitSeconds();
        if (this.b.containsKey(a2)) {
            Long l = (Long) this.b.get(a2);
            if (l != null) {
                final long longValue = j - l.longValue();
                if (cooldownEnterSeconds > longValue) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return n.a(longValue, cooldownEnterSeconds, id, transitionType);
                        }
                    }, 7, (Object) null);
                    return false;
                }
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                Function0 function0 = new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.b(longValue, cooldownEnterSeconds, id, transitionType);
                    }
                };
                str = id;
                nVar = this;
                BrazeLogger.brazelog$default(brazeLogger, (Object) nVar, (BrazeLogger.Priority) null, (Throwable) null, false, function0, 7, (Object) null);
            } else {
                str = id;
                nVar = this;
            }
        } else {
            str = id;
            nVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) nVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.b(str, transitionType);
                }
            }, 7, (Object) null);
        }
        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger2, (Object) nVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.b(j2, nVar, str);
            }
        }, 7, (Object) null);
        n nVar2 = nVar;
        nVar2.b.put(a2, Long.valueOf(j));
        GeofenceDataStoreProvider geofenceDataStoreProvider = nVar2.f599a;
        DataStoreKey dataStoreKey2 = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger2, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey2), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = geofenceDataStoreProvider.readData(dataStoreKey2, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) readData;
                if (StringsKt.isBlank(str3)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str3)) {
                        emptyMap = MapsKt.emptyMap();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str3).toString(), AbstractJsonLexerKt.NULL)) {
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
                                    BrazeLogger.brazelog$default(brazeLogger2, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) l.f596a, 6, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                } catch (Exception e) {
                                    e = e;
                                    dataStoreUtils = dataStoreUtils;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.f(str3), 4, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                    Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                    Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                    linkedHashMap.put(a2, Long.valueOf(j));
                                    GeofenceDataStoreProvider geofenceDataStoreProvider2 = nVar2.f599a;
                                    dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
                                    if (dataStoreKey.getType() == DataStoreValueType.MAP) {
                                    }
                                    nVar2.e = j;
                                    nVar2.f599a.writeData(DataStoreKey.GLOBAL_LAST_REPORT, Long.valueOf(j));
                                    return true;
                                }
                            }
                            Object decodeFromString = Json.INSTANCE.decodeFromString(MapSerializer, str3);
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
        linkedHashMap.put(a2, Long.valueOf(j));
        GeofenceDataStoreProvider geofenceDataStoreProvider22 = nVar2.f599a;
        dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() == DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                try {
                    Json.Companion companion = Json.INSTANCE;
                    companion.getSerializersModule();
                    str2 = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE), linkedHashMap);
                } catch (Exception e4) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                    str2 = "{}";
                }
                geofenceDataStoreProvider22.writeData(dataStoreKey, str2);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.storage.r0(dataStoreKey), 8, (Object) null);
            }
        }
        nVar2.e = j;
        nVar2.f599a.writeData(DataStoreKey.GLOBAL_LAST_REPORT, Long.valueOf(j));
        return true;
    }

    public static final String a(long j, n nVar, String str) {
        return "Geofence report suppressed since only " + j + " seconds have passed since the last time geofences were reported globally (minimum interval: " + nVar.g + "). id:" + str;
    }

    public static final String a(long j, int i, String str, GeofenceTransitionType geofenceTransitionType) {
        return "Geofence report suppressed since only " + j + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + i + "). id:" + str + " transition:" + geofenceTransitionType;
    }

    public final boolean a(boolean z, long j) {
        final long j2 = j - this.d;
        if (!z && this.f > j2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.b(j2, this);
                }
            }, 7, (Object) null);
            return false;
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.a(j2);
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.a(j2, this);
                }
            }, 7, (Object) null);
        }
        if (this.c.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.b();
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.c();
            }
        }, 7, (Object) null);
        return false;
    }

    public static final String a(long j) {
        return "Ignoring rate limit for this geofence request. Elapsed time since last request:" + j;
    }

    public static final String a(long j, n nVar) {
        return j + " seconds have passed since the last time geofences were requested (minimum interval: " + nVar.f + ").";
    }

    public final String a(final String reEligibilityId) {
        Intrinsics.checkNotNullParameter(reEligibilityId, "reEligibilityId");
        try {
            return new Regex("_").split(reEligibilityId, 2).get(1);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.b(reEligibilityId);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static String a(String geofenceId, GeofenceTransitionType transitionType) {
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        String obj = transitionType.toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = obj.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase + "_" + geofenceId;
    }

    public static final String a(int i) {
        return "Min time since last geofence request reset via server configuration: " + i + ".";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x019b A[LOOP:0: B:5:0x0195->B:7:0x019b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ConcurrentHashMap a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KSerializer MapSerializer;
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.f599a;
        DataStoreKey dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = geofenceDataStoreProvider.readData(dataStoreKey, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str = (String) readData;
                if (StringsKt.isBlank(str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
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
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) k.f594a, 6, (Object) null);
                                        emptyMap = MapsKt.emptyMap();
                                    } catch (Exception e) {
                                        e = e;
                                        exc = e;
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                                        emptyMap = MapsKt.emptyMap();
                                        Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                        Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                        linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                        while (r0.hasNext()) {
                                        }
                                        return concurrentHashMap;
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
                                linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap2);
                                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                                while (r0.hasNext()) {
                                }
                                return concurrentHashMap2;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            dataStoreUtils = dataStoreUtils2;
                        }
                    }
                    Map mutableMap22 = MapsKt.toMutableMap(emptyMap);
                    Intrinsics.checkNotNull(mutableMap22, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap22);
                }
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new com.braze.storage.l0(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        ConcurrentHashMap concurrentHashMap22 = new ConcurrentHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            final String str2 = (String) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.n$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.a(n.this, str2);
                }
            }, 7, (Object) null);
            concurrentHashMap22.put(str2, Long.valueOf(longValue));
        }
        return concurrentHashMap22;
    }

    public static final String a(n nVar, String str) {
        return "Retrieving geofence id " + nVar.a(str) + " eligibility information from local storage.";
    }
}
