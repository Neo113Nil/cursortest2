package com.braze.managers;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.IEventSubscriber;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.b3;
import com.braze.storage.o2;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
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
import kotlin.ranges.RangesKt;
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
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final b3 f616a;
    public final o2 b;

    public y0(Context context, String apiKey, String str, com.braze.events.d internalEventPublisher, b3 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f616a = serverConfigStorageProvider;
        this.b = new o2(context, str, apiKey);
        internalEventPublisher.c(com.braze.events.internal.p.class, new IEventSubscriber() { // from class: com.braze.managers.y0$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                y0.a(y0.this, (com.braze.events.internal.p) obj);
            }
        });
        c();
    }

    public static final void a(y0 y0Var, com.braze.events.internal.p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        y0Var.b.writeData(DataStoreKey.PUSH_MAX_LAST_UPDATE, Long.valueOf(it.f532a));
    }

    public static final String b(String str) {
        return "Adding push campaign to storage with uid " + str;
    }

    public final void c() {
        String str;
        long nowInSeconds = DateTimeUtils.nowInSeconds() - TimeUnit.DAYS.toSeconds(45L);
        final List a2 = a();
        final ArrayList arrayList = new ArrayList();
        for (Object obj : a2) {
            if (((w0) obj).b() >= nowInSeconds) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != a2.size()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.y0$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return y0.a(a2, arrayList);
                }
            }, 7, (Object) null);
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w0 w0Var = (w0) it.next();
                Pair pair = TuplesKt.to(w0Var.a(), Long.valueOf(w0Var.b()));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            if (linkedHashMap.isEmpty()) {
                this.b.clearData(DataStoreKey.PUSH_MAX_CAMPAIGNS);
                return;
            }
            o2 o2Var = this.b;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey), 12, (Object) null);
                return;
            }
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    Json.Companion companion = Json.INSTANCE;
                    companion.getSerializersModule();
                    str = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE), linkedHashMap);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                    str = "{}";
                }
                o2Var.writeData(dataStoreKey, str);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new com.braze.storage.r0(dataStoreKey), 8, (Object) null);
            }
        }
    }

    public static final String b(String str, long j) {
        return "Adding push campaign to storage with uid " + str + " and time " + j;
    }

    public static final String b() {
        return "Error reading push max campaign data from DataStore.";
    }

    public final void a(final String pushCampaign) {
        Intrinsics.checkNotNullParameter(pushCampaign, "pushCampaign");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.y0$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y0.b(pushCampaign);
            }
        }, 7, (Object) null);
        if (StringsKt.isBlank(pushCampaign)) {
            return;
        }
        a(pushCampaign, DateTimeUtils.nowInSeconds());
    }

    public static final String a(List list, List list2) {
        return "Pruning " + (list.size() - list2.size()) + " expired campaigns";
    }

    public final void a(final String pushCampaign, final long j) {
        String str;
        Intrinsics.checkNotNullParameter(pushCampaign, "pushCampaign");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.y0$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y0.b(pushCampaign, j);
            }
        }, 7, (Object) null);
        List<w0> a2 = a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(a2, 10)), 16));
        for (w0 w0Var : a2) {
            Pair pair = TuplesKt.to(w0Var.a(), Long.valueOf(w0Var.b()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
        mutableMap.put(pushCampaign, Long.valueOf(j));
        o2 o2Var = this.b;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey), 12, (Object) null);
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
            o2Var.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new com.braze.storage.r0(dataStoreKey), 8, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x019f A[Catch: Exception -> 0x01be, LOOP:0: B:6:0x0199->B:8:0x019f, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x01be, blocks: (B:2:0x0000, B:4:0x000c, B:5:0x0188, B:6:0x0199, B:8:0x019f, B:61:0x016d, B:14:0x002a, B:16:0x003e, B:17:0x0045, B:19:0x004d, B:20:0x015d, B:21:0x0053, B:23:0x0063, B:53:0x0148), top: B:1:0x0000, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KSerializer MapSerializer;
        try {
            o2 o2Var = this.b;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = o2Var.readData(dataStoreKey, "");
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
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) x0.f614a, 6, (Object) null);
                                            emptyMap = MapsKt.emptyMap();
                                        } catch (Exception e) {
                                            e = e;
                                            exc = e;
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                                            emptyMap = MapsKt.emptyMap();
                                            Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                            Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                            linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                            ArrayList arrayList = new ArrayList(linkedHashMap.size());
                                            while (r0.hasNext()) {
                                            }
                                            return arrayList;
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
                                    ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                                    while (r0.hasNext()) {
                                    }
                                    return arrayList2;
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
            ArrayList arrayList22 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList22.add(new w0((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
            return arrayList22;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, new Function0() { // from class: com.braze.managers.y0$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return y0.b();
                }
            }, 4, (Object) null);
            return CollectionsKt.emptyList();
        }
    }
}
