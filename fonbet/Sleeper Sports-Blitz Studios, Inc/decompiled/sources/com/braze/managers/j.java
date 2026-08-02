package com.braze.managers;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.Banner;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
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
import kotlinx.coroutines.Job;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class j {
    public static Job j;

    /* renamed from: a, reason: collision with root package name */
    public final String f591a;
    public final com.braze.events.e b;
    public final b3 c;
    public final r d;
    public final com.braze.storage.e e;
    public List f;
    public final AtomicInteger g;
    public static final g h = new g();
    public static final LinkedHashMap i = new LinkedHashMap();
    public static final ReentrantLock k = new ReentrantLock();
    public static final ArrayList l = new ArrayList();
    public static final ReentrantLock m = new ReentrantLock();
    public static final ArrayList n = new ArrayList();

    public j(Context context, String apiKey, String str, com.braze.events.e internalEventPublisher, com.braze.events.e externalEventPublisher, b3 serverConfigStorageProvider, r brazeManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f591a = str;
        this.b = externalEventPublisher;
        this.c = serverConfigStorageProvider;
        this.d = brazeManager;
        this.e = new com.braze.storage.e(context, str, apiKey);
        this.f = CollectionsKt.emptyList();
        this.g = new AtomicInteger(0);
        e();
        com.braze.events.d dVar = (com.braze.events.d) internalEventPublisher;
        dVar.c(com.braze.events.internal.q.class, new IEventSubscriber() { // from class: com.braze.managers.j$$ExternalSyntheticLambda26
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                j.a(j.this, (com.braze.events.internal.q) obj);
            }
        });
        dVar.c(com.braze.events.internal.c.class, new IEventSubscriber() { // from class: com.braze.managers.j$$ExternalSyntheticLambda27
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                j.a(j.this, (com.braze.events.internal.c) obj);
            }
        });
        dVar.c(com.braze.events.internal.b.class, new IEventSubscriber() { // from class: com.braze.managers.j$$ExternalSyntheticLambda28
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                j.a(j.this, (com.braze.events.internal.b) obj);
            }
        });
        dVar.d(BrazeUserChangeEvent.class, new IEventSubscriber() { // from class: com.braze.managers.j$$ExternalSyntheticLambda29
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                j.a(j.this, (BrazeUserChangeEvent) obj);
            }
        });
        dVar.c(com.braze.events.internal.d.class, new IEventSubscriber() { // from class: com.braze.managers.j$$ExternalSyntheticLambda30
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                j.a(j.this, (com.braze.events.internal.d) obj);
            }
        });
    }

    public static final void a(j jVar, com.braze.events.internal.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.f515a.G || it.b.G) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) jVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.d();
            }
        }, 7, (Object) null);
        jVar.getClass();
        jVar.f = CollectionsKt.emptyList();
        jVar.e.clearData(DataStoreKey.BANNERS);
        jVar.j();
    }

    public static final String b(BrazeUserChangeEvent brazeUserChangeEvent) {
        return "Done updating banners because of user change to " + brazeUserChangeEvent.getCurrentUserId() + ".";
    }

    public static final String c() {
        return "Refreshing Banners on forced internal refresh.";
    }

    public static final String d() {
        return "Banners have moved to disabled. Clearing banners data.";
    }

    public static final String e(String str) {
        return "Not logging a Banner click for Banner with placement id " + str + ". The Banner was not present in cache.";
    }

    public static final String g(String str) {
        return "Not logging a Banner impression for Banner with placement id " + str + ". The Banner was not present in cache.";
    }

    public static final String h(String str) {
        return "Logging impression for Banner with placement id " + str + ".";
    }

    public static final String i() {
        return "Resetting BannersManager for new session.";
    }

    public static final String k() {
        return "View is not an IBannerView. Cannot update banner data.";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(final String id) {
        Map linkedHashMap;
        Map emptyMap;
        KSerializer MapSerializer;
        Map linkedHashMap2;
        Map emptyMap2;
        KSerializer MapSerializer2;
        DataStoreKey dataStoreKey;
        String str;
        Banner banner;
        Intrinsics.checkNotNullParameter(id, "id");
        Banner banner2 = (Banner) i.get(id);
        if (banner2 == null) {
            Iterator it = this.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    banner = 0;
                    break;
                }
                banner = it.next();
                if (Intrinsics.areEqual(id, ((Banner) banner).getPlacementId())) {
                    break;
                }
            }
            banner2 = banner;
        }
        final Banner banner3 = banner2;
        if (banner3 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.g(id);
                }
            }, 6, (Object) null);
            return false;
        }
        String id2 = banner3.getTrackingId();
        Intrinsics.checkNotNullParameter(id2, "id");
        com.braze.storage.e eVar = this.e;
        DataStoreKey dataStoreKey2 = DataStoreKey.BANNERS_IMPRESSION_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey2), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = eVar.readData(dataStoreKey2, "");
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
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) i.f588a, 6, (Object) null);
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
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new com.braze.storage.l0(dataStoreKey2), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        if (Intrinsics.areEqual(linkedHashMap.get(id2), Boolean.TRUE)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.b(Banner.this);
                }
            }, 6, (Object) null);
            return true;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.h(id);
            }
        }, 7, (Object) null);
        com.braze.models.k a2 = com.braze.models.outgoing.event.b.g.a(banner3.getTrackingId());
        if (a2 != null) {
            this.d.a(a2);
        }
        Intrinsics.checkNotNullParameter(id2, "id");
        com.braze.storage.e eVar2 = this.e;
        DataStoreKey dataStoreKey3 = DataStoreKey.BANNERS_IMPRESSION_MAP;
        if (dataStoreKey3.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey3), 12, (Object) null);
            linkedHashMap2 = new LinkedHashMap();
        } else {
            try {
                Object readData2 = eVar2.readData(dataStoreKey3, "");
                Intrinsics.checkNotNull(readData2, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) readData2;
                if (StringsKt.isBlank(str3)) {
                    linkedHashMap2 = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str3)) {
                        emptyMap2 = MapsKt.emptyMap();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str3).toString(), AbstractJsonLexerKt.NULL)) {
                        emptyMap2 = MapsKt.emptyMap();
                    } else {
                        try {
                            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Boolean.class);
                            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(stringCompanionObject2), BuiltinSerializersKt.serializer(stringCompanionObject2));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
                            } else {
                                try {
                                    BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) h.f585a, 6, (Object) null);
                                    emptyMap2 = MapsKt.emptyMap();
                                } catch (Exception e3) {
                                    e = e3;
                                    dataStoreUtils2 = dataStoreUtils2;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.f(str3), 4, (Object) null);
                                    emptyMap2 = MapsKt.emptyMap();
                                    Map mutableMap2 = MapsKt.toMutableMap(emptyMap2);
                                    Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                    linkedHashMap2 = TypeIntrinsics.asMutableMap(mutableMap2);
                                    linkedHashMap2.put(id2, Boolean.TRUE);
                                    com.braze.storage.e eVar3 = this.e;
                                    dataStoreKey = DataStoreKey.BANNERS_IMPRESSION_MAP;
                                    if (dataStoreKey.getType() == DataStoreValueType.MAP) {
                                    }
                                }
                            }
                            Object decodeFromString2 = Json.INSTANCE.decodeFromString(MapSerializer2, str3);
                            Intrinsics.checkNotNull(decodeFromString2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            emptyMap2 = (Map) decodeFromString2;
                        } catch (Exception e4) {
                            e = e4;
                        }
                    }
                    Map mutableMap22 = MapsKt.toMutableMap(emptyMap2);
                    Intrinsics.checkNotNull(mutableMap22, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap2 = TypeIntrinsics.asMutableMap(mutableMap22);
                }
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.storage.l0(dataStoreKey3), 8, (Object) null);
                linkedHashMap2 = new LinkedHashMap();
            }
        }
        linkedHashMap2.put(id2, Boolean.TRUE);
        com.braze.storage.e eVar32 = this.e;
        dataStoreKey = DataStoreKey.BANNERS_IMPRESSION_MAP;
        if (dataStoreKey.getType() == DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey), 12, (Object) null);
            return true;
        }
        try {
            DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, BooleanSerializer.INSTANCE), linkedHashMap2);
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e6, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = "{}";
            }
            eVar32.writeData(dataStoreKey, str);
            return true;
        } catch (Exception e7) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e7, false, (Function0) new com.braze.storage.r0(dataStoreKey), 8, (Object) null);
            return true;
        }
    }

    public final void j() {
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock = k;
        reentrantLock.lock();
        try {
            List<d> list = CollectionsKt.toList(l);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            for (final d dVar : list) {
                try {
                    KeyEvent.Callback callback = (View) dVar.b.get();
                    if (callback == null) {
                        arrayList.add(dVar);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return j.a(d.this);
                            }
                        }, 7, (Object) null);
                    } else if (callback instanceof IBannerView) {
                        ((IBannerView) callback).initBanner(dVar.f579a);
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda23
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return j.k();
                            }
                        }, 6, (Object) null);
                        arrayList.add(dVar);
                    }
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j.b(d.this);
                        }
                    }, 4, (Object) null);
                    arrayList.add(dVar);
                }
            }
            k.lock();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    l.remove((d) it.next());
                }
                Unit unit2 = Unit.INSTANCE;
            } finally {
            }
        } finally {
        }
    }

    public final void l() {
        final long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.a(nowInSeconds);
            }
        }, 6, (Object) null);
        this.e.writeData(DataStoreKey.LAST_REFRESH_IN_SECONDS, Long.valueOf(nowInSeconds));
    }

    public static final String b() {
        return "Cached Banners placement IDs are empty. Not refreshing Banners on forced internal call.";
    }

    public static final String c(String str) {
        return "Banner with placement id " + str + " not found in cache. Returning null for this Banner.";
    }

    public static final String d(String str) {
        return "Encountered unexpected exception while parsing stored banner: " + str;
    }

    public static final String g() {
        return "Received blank serialized Banner string from DataStore. Not parsing.";
    }

    public final void e() {
        List<String> arrayList;
        List emptyList;
        com.braze.storage.e eVar = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = eVar.readData(dataStoreKey, "");
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
                            emptyList = (List) companion.decodeFromString(new ArrayListSerializer(StringSerializer.INSTANCE), str);
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.f();
                }
            }, 7, (Object) null);
            this.f = CollectionsKt.emptyList();
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        for (final String str2 : arrayList) {
            try {
                if (StringsKt.isBlank(str2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j.g();
                        }
                    }, 6, (Object) null);
                } else {
                    Banner a2 = Banner.Companion.a(new JSONObject(str2));
                    if (a2 != null) {
                        arrayList2.add(a2);
                    }
                }
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.d(str2);
                    }
                }, 4, (Object) null);
            }
        }
        this.f = arrayList2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.a(arrayList2);
            }
        }, 7, (Object) null);
    }

    public final void h() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.i();
            }
        }, 6, (Object) null);
        this.e.clearData(DataStoreKey.BANNERS_IMPRESSION_MAP);
        g.b();
    }

    public static final String c(Banner banner) {
        return "Error converting Banner to JSON: " + banner;
    }

    public final boolean b(final List ids) {
        String str;
        Object obj;
        Intrinsics.checkNotNullParameter(ids, "ids");
        if (this.g.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.a(j.this);
                }
            }, 7, (Object) null);
            return false;
        }
        if (ids.size() > this.c.p()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.a(j.this, ids);
                }
            }, 7, (Object) null);
        }
        this.g.incrementAndGet();
        List<String> ids2 = CollectionsKt.take(ids, this.c.p());
        Intrinsics.checkNotNullParameter(ids2, "ids");
        ArrayList arrayList = new ArrayList();
        for (String str2 : ids2) {
            Iterator it = this.f.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((Banner) obj).getPlacementId(), str2)) {
                    break;
                }
            }
            Banner banner = (Banner) obj;
            if (banner != null) {
                str = banner.getTrackingId();
            }
            arrayList.add(new Pair(str2, str));
        }
        this.d.a(arrayList);
        return true;
    }

    public static final String c(List list) {
        return "Added " + list.size() + " new Banners to DataStore.";
    }

    public static final void a(j jVar, com.braze.events.internal.q it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f533a instanceof com.braze.requests.a) {
            jVar.g.decrementAndGet();
        }
    }

    public static final void a(j jVar, com.braze.events.internal.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        jVar.l();
    }

    public static final void a(j jVar, com.braze.events.internal.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((com.braze.events.d) jVar.b).b(it, com.braze.events.internal.b.class);
    }

    public static final void a(j jVar, final BrazeUserChangeEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) jVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.a(BrazeUserChangeEvent.this);
            }
        }, 7, (Object) null);
        jVar.j();
        BrazeLogger.brazelog$default(brazeLogger, (Object) jVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.b(BrazeUserChangeEvent.this);
            }
        }, 7, (Object) null);
    }

    public static final String a(BrazeUserChangeEvent brazeUserChangeEvent) {
        return "Updating banners because of user change to " + brazeUserChangeEvent.getCurrentUserId() + ".";
    }

    public final void a() {
        ReentrantLock reentrantLock = m;
        reentrantLock.lock();
        try {
            List mutableList = CollectionsKt.toMutableList((Collection) n);
            reentrantLock.unlock();
            if (mutableList.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.b();
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.c();
                    }
                }, 7, (Object) null);
                b(mutableList);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(j jVar) {
        return "Not refreshing Banners since another " + jVar.g.get() + " request is currently in-flight.";
    }

    public static final String a(j jVar, List list) {
        return "The number of Banner placements requested exceeds the maximum allowed by the server. The server allows a maximum of " + jVar.c.p() + " placements, but " + list.size() + " were requested. Truncating request to fit.\nPlacements that will be requested: " + CollectionsKt.take(list, jVar.c.p()) + "\nTruncated placements not requested: " + list.subList(jVar.c.p(), list.size());
    }

    public final Banner a(final String id) {
        Object obj;
        Intrinsics.checkNotNullParameter(id, "id");
        final Banner banner = (Banner) i.get(id);
        if (banner != null) {
            if (banner.isExpired()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.a(Banner.this);
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.b(id);
                    }
                }, 6, (Object) null);
                banner.setUserId(this.f591a);
                return banner;
            }
        }
        Iterator it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Banner) obj).getPlacementId(), id)) {
                break;
            }
        }
        final Banner banner2 = (Banner) obj;
        if (banner2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.c(id);
                }
            }, 6, (Object) null);
            return null;
        }
        if (banner2.isExpired()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.a(id, banner2);
                }
            }, 6, (Object) null);
            return null;
        }
        banner2.setUserId(this.f591a);
        return banner2;
    }

    public static final String a(Banner banner) {
        return "Found test banner, but it is expired. Attempting to find non-test banner. " + banner;
    }

    public static final String a(String str, Banner banner) {
        return "Banner with placement id " + str + " has expired. Returning null for this Banner " + banner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    public final void a(final String id, final String str) {
        Banner banner;
        Intrinsics.checkNotNullParameter(id, "id");
        Banner banner2 = (Banner) i.get(id);
        if (banner2 == null) {
            Iterator it = this.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    banner = 0;
                    break;
                } else {
                    banner = it.next();
                    if (Intrinsics.areEqual(id, ((Banner) banner).getPlacementId())) {
                        break;
                    }
                }
            }
            banner2 = banner;
        }
        if (banner2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.e(id);
                }
            }, 6, (Object) null);
            return;
        }
        String trackingId = banner2.getTrackingId();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.b(id, str);
            }
        }, 7, (Object) null);
        com.braze.models.k c = com.braze.models.outgoing.event.b.g.c(trackingId, str);
        if (c != null) {
            this.d.a(c);
        }
    }

    public static final String b(String str) {
        return "Returning test Banner with placement id " + str + ".";
    }

    public static final String b(Banner banner) {
        return "Not logging a Banner impression for Banner " + banner + ". The Banner already had an impression logged in the current session";
    }

    public static final String b(String str, String str2) {
        return "Logging click for Banner with placement id " + str + " with buttonID of " + str2 + ".";
    }

    public static final String b(d dVar) {
        return "Error checking banner visibility for " + dVar.a() + ".Removing banner from visibility monitoring.";
    }

    public final BannersUpdatedEvent a(JSONObject bannersJson) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(bannersJson, "bannerData");
        Banner.Companion.getClass();
        Intrinsics.checkNotNullParameter(bannersJson, "bannersJson");
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = bannersJson.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            Banner a2 = Banner.Companion.a(bannersJson.optJSONObject(keys.next()));
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Banner) next).getIsTestSend()) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List<Banner> list = (List) pair.component1();
        List list2 = (List) pair.component2();
        for (Banner banner : list) {
            i.put(banner.getPlacementId(), banner);
        }
        this.f = list2;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list2) {
            if (!((Banner) obj).isExpired()) {
                arrayList4.add(obj);
            }
        }
        final ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            final Banner banner2 = (Banner) it2.next();
            try {
                str2 = banner2.getJsonKey().toString();
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.c(Banner.this);
                    }
                }, 4, (Object) null);
                str2 = null;
            }
            if (str2 != null) {
                arrayList5.add(str2);
            }
        }
        com.braze.storage.e eVar = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.o0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    Json.Companion companion = Json.INSTANCE;
                    companion.getSerializersModule();
                    str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), arrayList5);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                    str = arrayList5 instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                }
                eVar.writeData(dataStoreKey, str);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new com.braze.storage.p0(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.j$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.c(arrayList5);
            }
        }, 7, (Object) null);
        j();
        List list3 = this.f;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList6.add(((Banner) it3.next()).deepcopy$android_sdk_base_release());
        }
        return new BannersUpdatedEvent(arrayList6);
    }

    public static final String f() {
        return "Did not find stored Banners in DataStore.";
    }

    public static final String a(long j2) {
        return "Updating last Banners refresh time: " + j2;
    }

    public static final String a(List list) {
        return "Loaded " + list.size() + " banners from DataStore.";
    }

    public static final String a(d dVar) {
        return "Banner " + dVar.a() + " removed because view is null";
    }
}
