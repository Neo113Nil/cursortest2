package com.braze.managers;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.FeatureFlag;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.b3;
import com.braze.storage.z1;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
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
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.events.e f595a;
    public final com.braze.events.e b;
    public final b3 c;
    public final r d;
    public final z1 e;
    public List f;
    public final AtomicBoolean g;
    public final AtomicInteger h;

    public k0(Context context, String apiKey, String str, com.braze.events.e internalEventPublisher, com.braze.events.e externalEventPublisher, b3 serverConfigStorageProvider, r brazeManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f595a = internalEventPublisher;
        this.b = externalEventPublisher;
        this.c = serverConfigStorageProvider;
        this.d = brazeManager;
        this.e = new z1(context, str, apiKey);
        this.f = CollectionsKt.emptyList();
        this.g = new AtomicBoolean(false);
        this.h = new AtomicInteger(0);
        c();
        f();
    }

    public static final String b(String str) {
        return "Not logging a Feature Flag impression for Feature Flag with id " + str + ". The Feature Flag was not part of any matching campaign";
    }

    public static final String g() {
        return "Features flags have moved to disabled. Clearing feature flag data.";
    }

    public final FeatureFlagsUpdatedEvent a(JSONArray featureFlagsJson) {
        String str;
        Intrinsics.checkNotNullParameter(featureFlagsJson, "featureFlagsData");
        Intrinsics.checkNotNullParameter(featureFlagsJson, "featureFlagsJson");
        ArrayList arrayList = new ArrayList();
        Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, featureFlagsJson.length())), new com.braze.support.l(featureFlagsJson)), new com.braze.support.m(featureFlagsJson)).iterator();
        while (it.hasNext()) {
            FeatureFlag a2 = com.braze.support.n.f786a.a((JSONObject) it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        this.f = arrayList;
        z1 z1Var = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.o0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    Json.Companion companion = Json.INSTANCE;
                    companion.getSerializersModule();
                    str = companion.encodeToString(new ArrayListSerializer(FeatureFlag.Companion.serializer()), arrayList);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                    str = arrayList instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                }
                z1Var.writeData(dataStoreKey, str);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new com.braze.storage.p0(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.b(k0.this);
            }
        }, 7, (Object) null);
        List list = this.f;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FeatureFlag) it2.next()).deepcopy$android_sdk_base_release());
        }
        return new FeatureFlagsUpdatedEvent(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public final ArrayList c(String str) {
        ?? r1;
        if (str != null) {
            List list = this.f;
            r1 = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((FeatureFlag) obj).getId(), str)) {
                    r1.add(obj);
                }
            }
        } else {
            r1 = this.f;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(r1, 10));
        Iterator it = r1.iterator();
        while (it.hasNext()) {
            arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x01b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(final String id) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KClass orCreateKotlinClass;
        KSerializer MapSerializer;
        DataStoreKey dataStoreKey;
        String str;
        Intrinsics.checkNotNullParameter(id, "id");
        z1 z1Var = this.e;
        DataStoreKey dataStoreKey2 = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey2), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = z1Var.readData(dataStoreKey2, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) readData;
                if (StringsKt.isBlank(str2)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str2)) {
                        emptyMap = MapsKt.emptyMap();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str2).toString(), AbstractJsonLexerKt.NULL)) {
                        emptyMap = MapsKt.emptyMap();
                    } else {
                        try {
                            orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
                        } catch (Exception e) {
                            e = e;
                            dataStoreUtils = dataStoreUtils2;
                        }
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) i0.f589a, 6, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                } catch (Exception e2) {
                                    e = e2;
                                    exc = e;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                    Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                    Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                    linkedHashMap.put(id, Boolean.TRUE);
                                    z1 z1Var2 = this.e;
                                    dataStoreKey = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
                                    if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                    }
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return k0.e(id);
                                        }
                                    }, 7, (Object) null);
                                }
                            }
                            Object decodeFromString = Json.INSTANCE.decodeFromString(MapSerializer, str2);
                            Intrinsics.checkNotNull(decodeFromString, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            emptyMap = (Map) decodeFromString;
                        } catch (Exception e3) {
                            exc = e3;
                            dataStoreUtils = dataStoreUtils2;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                            emptyMap = MapsKt.emptyMap();
                            Map mutableMap2 = MapsKt.toMutableMap(emptyMap);
                            Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                            linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap2);
                            linkedHashMap.put(id, Boolean.TRUE);
                            z1 z1Var22 = this.e;
                            dataStoreKey = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
                            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                            }
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return k0.e(id);
                                }
                            }, 7, (Object) null);
                        }
                    }
                    Map mutableMap22 = MapsKt.toMutableMap(emptyMap);
                    Intrinsics.checkNotNull(mutableMap22, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap22);
                }
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new com.braze.storage.l0(dataStoreKey2), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        linkedHashMap.put(id, Boolean.TRUE);
        z1 z1Var222 = this.e;
        dataStoreKey = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                try {
                    Json.Companion companion = Json.INSTANCE;
                    companion.getSerializersModule();
                    str = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, BooleanSerializer.INSTANCE), linkedHashMap);
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                    str = "{}";
                }
                z1Var222.writeData(dataStoreKey, str);
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e6, false, (Function0) new com.braze.storage.r0(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.e(id);
            }
        }, 7, (Object) null);
    }

    public final void e() {
        if (this.h.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.a(k0.this);
                }
            }, 7, (Object) null);
            return;
        }
        final long nowInSeconds = DateTimeUtils.nowInSeconds();
        Object readData = this.e.readData(DataStoreKey.LAST_REFRESH_IN_SECONDS, 0L);
        Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.Long");
        if (nowInSeconds - ((Long) readData).longValue() >= this.c.m()) {
            this.d.q();
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.a(k0.this, nowInSeconds);
            }
        }, 6, (Object) null);
        ((com.braze.events.d) this.f595a).b(new com.braze.events.internal.j(), com.braze.events.internal.j.class);
    }

    public final void f() {
        ((com.braze.events.d) this.f595a).c(com.braze.events.internal.r.class, new IEventSubscriber() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                k0.a(k0.this, (com.braze.events.internal.r) obj);
            }
        });
        ((com.braze.events.d) this.f595a).c(com.braze.events.internal.q.class, new IEventSubscriber() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda9
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                k0.a(k0.this, (com.braze.events.internal.q) obj);
            }
        });
        ((com.braze.events.d) this.f595a).c(com.braze.events.internal.k.class, new IEventSubscriber() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda10
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                k0.a(k0.this, (com.braze.events.internal.k) obj);
            }
        });
        ((com.braze.events.d) this.f595a).c(com.braze.events.internal.j.class, new IEventSubscriber() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda11
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                k0.a(k0.this, (com.braze.events.internal.j) obj);
            }
        });
        ((com.braze.events.d) this.f595a).c(com.braze.events.internal.d.class, new IEventSubscriber() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda12
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                k0.a(k0.this, (com.braze.events.internal.d) obj);
            }
        });
    }

    public final void h() {
        final long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.a(nowInSeconds);
            }
        }, 6, (Object) null);
        this.e.writeData(DataStoreKey.LAST_REFRESH_IN_SECONDS, Long.valueOf(nowInSeconds));
    }

    public static final String b(k0 k0Var) {
        return "Added new Feature Flags:" + k0Var.f + " to DataStore.";
    }

    public static final String b() {
        return "Clearing Feature Flags.";
    }

    public static final String e(String str) {
        return "Stored impression logged for Feature Flag with id:" + str + ".";
    }

    public static final String d() {
        return "Did not find stored Feature Flags in DataStore.";
    }

    public static final void a(k0 k0Var, com.braze.events.internal.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.f515a.m || it.b.m) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) k0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.g();
            }
        }, 7, (Object) null);
        k0Var.a();
    }

    public static final void a(k0 k0Var, com.braze.events.internal.r it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f534a instanceof com.braze.requests.j) {
            k0Var.h.incrementAndGet();
        }
    }

    public static final void a(k0 k0Var, com.braze.events.internal.q it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f533a instanceof com.braze.requests.j) {
            k0Var.h.decrementAndGet();
        }
    }

    public static final String a(k0 k0Var, long j) {
        Object readData = k0Var.e.readData(DataStoreKey.LAST_REFRESH_IN_SECONDS, 0L);
        Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.Long");
        return "Not enough time has passed since last Feature Flags refresh. Not refreshing Feature Flags. " + ((((Long) readData).longValue() - j) + k0Var.c.m()) + " seconds remaining until next available flush.";
    }

    public static final void a(k0 k0Var, com.braze.events.internal.k it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k0Var.g.set(true);
        k0Var.h();
    }

    public static final void a(k0 k0Var, com.braze.events.internal.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k0Var.g.set(true);
        if (k0Var.g.get()) {
            List list = k0Var.f;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((FeatureFlag) it2.next()).deepcopy$android_sdk_base_release());
            }
            ((com.braze.events.d) k0Var.b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
        }
    }

    public final void c() {
        final List arrayList;
        List emptyList;
        z1 z1Var = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = z1Var.readData(dataStoreKey, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str = (String) readData;
                if (StringsKt.isBlank(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str)) {
                        emptyList = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), AbstractJsonLexerKt.NULL)) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        try {
                            Json.Companion companion = Json.INSTANCE;
                            companion.getSerializersModule();
                            emptyList = (List) companion.decodeFromString(new ArrayListSerializer(FeatureFlag.Companion.serializer()), str);
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
                            emptyList = CollectionsKt.emptyList();
                        }
                    }
                    arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new com.braze.storage.i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.d();
                }
            }, 6, (Object) null);
            this.f = CollectionsKt.emptyList();
        } else {
            this.f = arrayList;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.a(arrayList);
                }
            }, 7, (Object) null);
        }
    }

    public static final String a(k0 k0Var) {
        return "Not refreshing Feature Flags since another " + k0Var.h.get() + " request is currently in-flight.";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final String id) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KSerializer MapSerializer;
        Intrinsics.checkNotNullParameter(id, "id");
        final FeatureFlag featureFlag = (FeatureFlag) CollectionsKt.firstOrNull((List) c(id));
        if ((featureFlag != null ? featureFlag.getTrackingString$android_sdk_base_release() : null) != null) {
            String id2 = featureFlag.getId();
            Intrinsics.checkNotNullParameter(id2, "id");
            z1 z1Var = this.e;
            DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = z1Var.readData(dataStoreKey, "");
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
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
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
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) j0.f592a, 6, (Object) null);
                                            emptyMap = MapsKt.emptyMap();
                                        } catch (Exception e) {
                                            e = e;
                                            exc = e;
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                                            emptyMap = MapsKt.emptyMap();
                                            Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                            Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                            linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                            if (!Intrinsics.areEqual(linkedHashMap.get(id2), Boolean.TRUE)) {
                                            }
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
                                    if (!Intrinsics.areEqual(linkedHashMap.get(id2), Boolean.TRUE)) {
                                    }
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
            if (!Intrinsics.areEqual(linkedHashMap.get(id2), Boolean.TRUE)) {
                com.braze.models.k a2 = com.braze.models.outgoing.event.b.g.a(featureFlag);
                if (a2 != null) {
                    this.d.a(a2);
                }
                d(featureFlag.getId());
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.a(FeatureFlag.this);
                }
            }, 6, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.b(id);
            }
        }, 6, (Object) null);
    }

    public static final String a(FeatureFlag featureFlag) {
        return "Not logging a Feature Flag impression for Feature Flag with id " + featureFlag.getId() + ". The Feature Flag already had an impression logged in the current session";
    }

    public static final String a(long j) {
        return "Updating last Feature Flags refresh time: " + j;
    }

    public static final String a(List list) {
        return "Loaded " + list.size() + " Feature Flags from DataStore.";
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.k0$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.b();
            }
        }, 7, (Object) null);
        this.e.clearData(DataStoreKey.FEATURE_FLAGS);
        this.f = CollectionsKt.emptyList();
        if (this.g.get()) {
            List list = this.f;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
            }
            ((com.braze.events.d) this.b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
        }
    }
}
