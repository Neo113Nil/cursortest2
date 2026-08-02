package com.braze.triggers.managers;

import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.k0;
import com.braze.storage.l0;
import com.braze.storage.m3;
import com.braze.storage.q0;
import com.braze.storage.r0;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
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
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final m3 f819a;
    public final Map b;
    public final LinkedHashMap c;

    public h(m3 triggerDataStoreProvider) {
        Intrinsics.checkNotNullParameter(triggerDataStoreProvider, "triggerDataStoreProvider");
        this.f819a = triggerDataStoreProvider;
        this.b = a();
        this.c = new LinkedHashMap();
    }

    public static final String b(String str) {
        return "Deleting outdated triggered action id " + str + " from stored re-eligibility list.";
    }

    public static final String c(com.braze.triggers.actions.a aVar) {
        return "Triggered action id " + ((com.braze.triggers.actions.g) aVar).c() + " no longer eligible due to having been triggered in the past and is only eligible once.";
    }

    public final boolean a(final com.braze.triggers.actions.g triggeredAction) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        final com.braze.triggers.config.b bVar = triggeredAction.b.f;
        if (bVar.f809a == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.h$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.a(com.braze.triggers.actions.a.this);
                }
            }, 7, (Object) null);
            return true;
        }
        if (!this.b.containsKey(triggeredAction.f801a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.h$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.b(com.braze.triggers.actions.a.this);
                }
            }, 7, (Object) null);
            return true;
        }
        if (bVar.e()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.h$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.c(com.braze.triggers.actions.a.this);
                }
            }, 7, (Object) null);
            return false;
        }
        Long l = (Long) this.b.get(triggeredAction.f801a);
        final long longValue = l != null ? l.longValue() : 0L;
        if (DateTimeUtils.nowInSeconds() + triggeredAction.b.d >= (bVar.d() != null ? r0.intValue() : 0) + longValue) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.h$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.b(longValue, bVar);
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.h$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.a(longValue, bVar);
            }
        }, 7, (Object) null);
        return false;
    }

    public final void d(com.braze.triggers.actions.a triggeredAction) {
        String str;
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        final com.braze.triggers.actions.g gVar = (com.braze.triggers.actions.g) triggeredAction;
        if (gVar.d().e().e()) {
            this.b.remove(gVar.c());
        } else {
            Long l = (Long) this.c.get(gVar.c());
            final long longValue = l != null ? l.longValue() : 0L;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.h$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.b(com.braze.triggers.actions.a.this, longValue);
                }
            }, 7, (Object) null);
            this.b.put(gVar.c(), Long.valueOf(longValue));
        }
        m3 m3Var = this.f819a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        Map map = this.b;
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
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) i.f781a, 4, (Object) null);
                str = (!(map instanceof Map) && (map instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            m3Var.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String b(com.braze.triggers.actions.a aVar) {
        return "Triggered action id " + ((com.braze.triggers.actions.g) aVar).c() + " always eligible via never having been triggered. Returning true for eligibility status";
    }

    public static final String c(String str) {
        return "Retrieving triggered action id " + str + " eligibility information from DataStore.";
    }

    public static final String b(long j, com.braze.triggers.config.a aVar) {
        return "Trigger action is re-eligible for display since " + (DateTimeUtils.nowInSeconds() - j) + " seconds have passed since the last time it was triggered (minimum interval: " + ((com.braze.triggers.config.b) aVar).d() + ").";
    }

    public static final String b(com.braze.triggers.actions.a aVar, long j) {
        return "Resetting re-eligibility for action Id " + ((com.braze.triggers.actions.g) aVar).c() + " to " + j;
    }

    public static final String b(Map map) {
        return "Retrieved " + map.size() + " trigger re-eligibility entries from DataStore";
    }

    public static final String b() {
        return "No trigger re-eligibility information found in DataStore";
    }

    public static final String a(String str) {
        return "Retaining triggered action " + str + " in re-eligibility list.";
    }

    public static final String a(Map map) {
        return "Successfully updated re-eligibility map in DataStore with " + map.size() + " entries";
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return "Triggered action id " + ((com.braze.triggers.actions.g) aVar).c() + " always eligible via configuration. Returning true for eligibility status";
    }

    public static final String a(long j, com.braze.triggers.config.a aVar) {
        return "Trigger action is not re-eligible for display since only " + (DateTimeUtils.nowInSeconds() - j) + " seconds have passed since the last time it was triggered (minimum interval: " + ((com.braze.triggers.config.b) aVar).d() + ").";
    }

    public final void a(final com.braze.triggers.actions.h triggeredAction, final long j) {
        String str;
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.h$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.a(com.braze.triggers.actions.a.this, j);
            }
        }, 7, (Object) null);
        LinkedHashMap linkedHashMap = this.c;
        String c = triggeredAction.c();
        Long l = (Long) this.b.get(triggeredAction.c());
        linkedHashMap.put(c, Long.valueOf(l != null ? l.longValue() : 0L));
        this.b.put(triggeredAction.c(), Long.valueOf(j));
        m3 m3Var = this.f819a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        Map map = this.b;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE), map);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) i.f781a, 4, (Object) null);
                str = (!(map instanceof Map) && (map instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            m3Var.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(com.braze.triggers.actions.a aVar, long j) {
        return "Updating re-eligibility for action Id " + ((com.braze.triggers.actions.g) aVar).c() + " to time " + j + ".";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KSerializer MapSerializer;
        final Map map;
        m3 m3Var = this.f819a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = m3Var.readData(dataStoreKey, "");
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
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) g.f818a, 6, (Object) null);
                                        emptyMap = MapsKt.emptyMap();
                                    } catch (Exception e) {
                                        e = e;
                                        exc = e;
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                                        emptyMap = MapsKt.emptyMap();
                                        Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                        Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                        linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                        map = linkedHashMap;
                                        if (!map.isEmpty()) {
                                        }
                                        return map;
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
                                map = linkedHashMap;
                                if (!map.isEmpty()) {
                                }
                                return map;
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
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new l0(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        map = linkedHashMap;
        if (!map.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.h$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.b(map);
                }
            }, 7, (Object) null);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                final String str2 = (String) ((Map.Entry) it.next()).getKey();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.h$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.c(str2);
                    }
                }, 7, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.h$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.b();
                }
            }, 7, (Object) null);
        }
        return map;
    }

    public final void a(List triggeredActions) {
        String str;
        h hVar = this;
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(triggeredActions, 10));
        Iterator it = triggeredActions.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) it.next())).c());
        }
        Map map = hVar.b;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            final String str2 = (String) entry.getKey();
            boolean contains = arrayList.contains(str2);
            if (contains) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) hVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.h$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.a(str2);
                    }
                }, 7, (Object) null);
                hVar = this;
            } else {
                hVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) hVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.h$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.b(str2);
                    }
                }, 7, (Object) null);
            }
            if (contains) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        m3 m3Var = hVar.f819a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    Json.Companion companion = Json.INSTANCE;
                    companion.getSerializersModule();
                    str = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE), linkedHashMap);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) i.f781a, 4, (Object) null);
                    str = "{}";
                }
                m3Var.writeData(dataStoreKey, str);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) hVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.h$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.a(linkedHashMap);
            }
        }, 7, (Object) null);
    }
}
