package bo.app;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.FeatureFlag;
import com.braze.storage.C2994h;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import di.C4084d0;
import di.C4087f;
import di.C4093i;
import di.Z0;
import ei.AbstractC4212b;
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
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public final r7 f25480a;

    /* renamed from: b, reason: collision with root package name */
    public final m9 f25481b;

    /* renamed from: c, reason: collision with root package name */
    public final ue f25482c;

    /* renamed from: d, reason: collision with root package name */
    public final e2 f25483d;

    /* renamed from: e, reason: collision with root package name */
    public final C2994h f25484e;

    /* renamed from: f, reason: collision with root package name */
    public List f25485f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f25486g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f25487h;

    public g8(Context context, String apiKey, String str, r7 internalEventPublisher, m9 externalEventPublisher, ue serverConfigStorageProvider, e2 brazeManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f25480a = internalEventPublisher;
        this.f25481b = externalEventPublisher;
        this.f25482c = serverConfigStorageProvider;
        this.f25483d = brazeManager;
        this.f25484e = new C2994h(context, str, apiKey);
        this.f25485f = CollectionsKt.emptyList();
        this.f25486g = new AtomicBoolean(false);
        this.f25487h = new AtomicInteger(0);
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
        Iterator it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, featureFlagsJson.length())), new l8(featureFlagsJson)), new m8(featureFlagsJson)).iterator();
        while (it.hasNext()) {
            FeatureFlag a10 = com.braze.support.e.f29482a.a((JSONObject) it.next());
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        this.f25485f = arrayList;
        C2994h c2994h = this.f25484e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                    aVar.a();
                    str = aVar.b(new C4087f(FeatureFlag.Companion.serializer()), arrayList);
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                    str = arrayList instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                }
                c2994h.writeData(dataStoreKey, str);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.z2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g8.b(bo.app.g8.this);
            }
        }, 7, (Object) null);
        List list = this.f25485f;
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
        ?? r12;
        if (str != null) {
            List list = this.f25485f;
            r12 = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((FeatureFlag) obj).getId(), str)) {
                    r12.add(obj);
                }
            }
        } else {
            r12 = this.f25485f;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(r12, 10));
        Iterator it = r12.iterator();
        while (it.hasNext()) {
            arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(final String id2) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        InterfaceC1901b k10;
        DataStoreKey dataStoreKey;
        String str;
        Intrinsics.checkNotNullParameter(id2, "id");
        C2994h c2994h = this.f25484e;
        DataStoreKey dataStoreKey2 = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = c2994h.readData(dataStoreKey2, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) readData;
                if (StringsKt.isBlank(str2)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str2)) {
                        emptyMap = MapsKt.emptyMap();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str2).toString(), "null")) {
                        emptyMap = MapsKt.emptyMap();
                    } else {
                        try {
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
                            try {
                                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                    k10 = AbstractC2028a.k(AbstractC2028a.H(stringCompanionObject), AbstractC2028a.H(stringCompanionObject));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                    k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.F(LongCompanionObject.INSTANCE));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                    k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.z(BooleanCompanionObject.INSTANCE));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                    k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.E(IntCompanionObject.INSTANCE));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                    k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.C(DoubleCompanionObject.INSTANCE));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                    k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.D(FloatCompanionObject.INSTANCE));
                                } else {
                                    dataStoreUtils = dataStoreUtils2;
                                    try {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) e8.f25428a, 6, (Object) null);
                                        emptyMap = MapsKt.emptyMap();
                                    } catch (Exception e10) {
                                        e = e10;
                                        exc = e;
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str2), 4, (Object) null);
                                        emptyMap = MapsKt.emptyMap();
                                        Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                        Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                        linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                        linkedHashMap.put(id2, Boolean.TRUE);
                                        C2994h c2994h2 = this.f25484e;
                                        dataStoreKey = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
                                        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                        }
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.y2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return bo.app.g8.e(id2);
                                            }
                                        }, 7, (Object) null);
                                    }
                                }
                                Object d10 = AbstractC4212b.f46079d.d(k10, str2);
                                Intrinsics.checkNotNull(d10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                emptyMap = (Map) d10;
                            } catch (Exception e11) {
                                exc = e11;
                                dataStoreUtils = dataStoreUtils2;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str2), 4, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                                Map mutableMap2 = MapsKt.toMutableMap(emptyMap);
                                Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap2);
                                linkedHashMap.put(id2, Boolean.TRUE);
                                C2994h c2994h22 = this.f25484e;
                                dataStoreKey = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
                                if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                }
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.y2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return bo.app.g8.e(id2);
                                    }
                                }, 7, (Object) null);
                            }
                        } catch (Exception e12) {
                            e = e12;
                            dataStoreUtils = dataStoreUtils2;
                        }
                    }
                    Map mutableMap22 = MapsKt.toMutableMap(emptyMap);
                    Intrinsics.checkNotNull(mutableMap22, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap22);
                }
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) new DataStoreProvider.m(dataStoreKey2), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        linkedHashMap.put(id2, Boolean.TRUE);
        C2994h c2994h222 = this.f25484e;
        dataStoreKey = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                try {
                    AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                    aVar.a();
                    str = aVar.b(new C4084d0(Z0.f45341a, C4093i.f45370a), linkedHashMap);
                } catch (Exception e14) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f29470E, (Throwable) e14, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                    str = "{}";
                }
                c2994h222.writeData(dataStoreKey, str);
            } catch (Exception e15) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e15, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.y2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g8.e(id2);
            }
        }, 7, (Object) null);
    }

    public final void e() {
        j2 requestInitiatedBy = j2.f25587d;
        Intrinsics.checkNotNullParameter(requestInitiatedBy, "requestInitiatedBy");
        if (this.f25487h.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.t2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g8.a(bo.app.g8.this);
                }
            }, 7, (Object) null);
            return;
        }
        final int n10 = this.f25482c.n();
        if (n10 <= 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.B2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g8.a(n10);
                }
            }, 6, (Object) null);
            this.f25480a.b(new i8(), i8.class);
            return;
        }
        final long nowInSeconds = DateTimeUtils.nowInSeconds();
        Object readData = this.f25484e.readData(DataStoreKey.LAST_REFRESH_IN_SECONDS, 0L);
        Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.Long");
        if (nowInSeconds - ((Long) readData).longValue() < n10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.C2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g8.a(bo.app.g8.this, nowInSeconds, n10);
                }
            }, 6, (Object) null);
            this.f25480a.b(new i8(), i8.class);
        } else {
            Intrinsics.checkNotNullParameter(requestInitiatedBy, "requestInitiatedBy");
            this.f25483d.a(requestInitiatedBy);
        }
    }

    public final void f() {
        this.f25480a.c(ad.class, new IEventSubscriber() { // from class: c3.D2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.g8.a(bo.app.g8.this, (bo.app.ad) obj);
            }
        });
        this.f25480a.c(zc.class, new IEventSubscriber() { // from class: c3.E2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.g8.a(bo.app.g8.this, (bo.app.zc) obj);
            }
        });
        this.f25480a.c(j8.class, new IEventSubscriber() { // from class: c3.F2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.g8.a(bo.app.g8.this, (bo.app.j8) obj);
            }
        });
        this.f25480a.c(i8.class, new IEventSubscriber() { // from class: c3.G2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.g8.a(bo.app.g8.this, (bo.app.i8) obj);
            }
        });
        this.f25480a.c(o3.class, new IEventSubscriber() { // from class: c3.H2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.g8.a(bo.app.g8.this, (bo.app.o3) obj);
            }
        });
    }

    public final void h() {
        final long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.w2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g8.a(nowInSeconds);
            }
        }, 6, (Object) null);
        this.f25484e.writeData(DataStoreKey.LAST_REFRESH_IN_SECONDS, Long.valueOf(nowInSeconds));
    }

    public static final String b(g8 g8Var) {
        return "Added new Feature Flags:" + g8Var.f25485f + " to DataStore.";
    }

    public static final String b() {
        return "Clearing Feature Flags.";
    }

    public final void c() {
        final List arrayList;
        List emptyList;
        C2994h c2994h = this.f25484e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = c2994h.readData(dataStoreKey, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str = (String) readData;
                if (StringsKt.isBlank(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str)) {
                        emptyList = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), "null")) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        try {
                            AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                            aVar.a();
                            emptyList = (List) aVar.d(new C4087f(FeatureFlag.Companion.serializer()), str);
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) new DataStoreUtils.a(str), 4, (Object) null);
                            emptyList = CollectionsKt.emptyList();
                        }
                    }
                    arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.u2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g8.d();
                }
            }, 6, (Object) null);
            this.f25485f = CollectionsKt.emptyList();
        } else {
            this.f25485f = arrayList;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.v2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g8.a(arrayList);
                }
            }, 7, (Object) null);
        }
    }

    public static final String e(String str) {
        return "Stored impression logged for Feature Flag with id:" + str + ".";
    }

    public static final void a(g8 g8Var, o3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.f25844a.f26013m || it.f25845b.f26013m) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g8Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.x2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g8.g();
            }
        }, 7, (Object) null);
        g8Var.a();
    }

    public static final void a(g8 g8Var, ad it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f25252a instanceof k8) {
            g8Var.f25487h.incrementAndGet();
        }
    }

    public static final String d() {
        return "Did not find stored Feature Flags in DataStore.";
    }

    public static final void a(g8 g8Var, zc it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f26356a instanceof k8) {
            g8Var.f25487h.decrementAndGet();
        }
    }

    public static final String a(g8 g8Var, long j10, int i10) {
        Object readData = g8Var.f25484e.readData(DataStoreKey.LAST_REFRESH_IN_SECONDS, 0L);
        Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.Long");
        return "Not enough time has passed since last Feature Flags refresh. Not refreshing Feature Flags. " + ((((Long) readData).longValue() - j10) + i10) + " seconds remaining until next available refresh.";
    }

    public static final void a(g8 g8Var, j8 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        g8Var.f25486g.set(true);
        g8Var.h();
    }

    public static final void a(g8 g8Var, i8 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        g8Var.f25486g.set(true);
        if (g8Var.f25486g.get()) {
            List list = g8Var.f25485f;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((FeatureFlag) it2.next()).deepcopy$android_sdk_base_release());
            }
            ((r7) g8Var.f25481b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
        }
    }

    public static final String a(g8 g8Var) {
        return "Not refreshing Feature Flags since another " + g8Var.f25487h.get() + " request is currently in-flight.";
    }

    public static final String a(int i10) {
        return "Feature Flags refresh rate limit is " + i10 + "; refreshes are disabled by server config. Not refreshing Feature Flags.";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final String id2) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KClass orCreateKotlinClass;
        InterfaceC1901b k10;
        Intrinsics.checkNotNullParameter(id2, "id");
        final FeatureFlag featureFlag = (FeatureFlag) CollectionsKt.firstOrNull((List) c(id2));
        if ((featureFlag != null ? featureFlag.getTrackingString() : null) != null) {
            String id3 = featureFlag.getId();
            Intrinsics.checkNotNullParameter(id3, "id");
            C2994h c2994h = this.f25484e;
            DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = c2994h.readData(dataStoreKey, "");
                    Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) readData;
                    if (StringsKt.isBlank(str)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                        if (StringsKt.isBlank(str)) {
                            emptyMap = MapsKt.emptyMap();
                        } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), "null")) {
                            emptyMap = MapsKt.emptyMap();
                        } else {
                            try {
                                orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
                            } catch (Exception e10) {
                                e = e10;
                                dataStoreUtils = dataStoreUtils2;
                            }
                            try {
                                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                    k10 = AbstractC2028a.k(AbstractC2028a.H(stringCompanionObject), AbstractC2028a.H(stringCompanionObject));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                    k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.F(LongCompanionObject.INSTANCE));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                    k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.z(BooleanCompanionObject.INSTANCE));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                    k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.E(IntCompanionObject.INSTANCE));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                    k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.C(DoubleCompanionObject.INSTANCE));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                    k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.D(FloatCompanionObject.INSTANCE));
                                } else {
                                    dataStoreUtils = dataStoreUtils2;
                                    try {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) f8.f25455a, 6, (Object) null);
                                        emptyMap = MapsKt.emptyMap();
                                    } catch (Exception e11) {
                                        e = e11;
                                        exc = e;
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
                                        emptyMap = MapsKt.emptyMap();
                                        Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                        Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                        linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                        if (!Intrinsics.areEqual(linkedHashMap.get(id3), Boolean.TRUE)) {
                                        }
                                    }
                                }
                                Object d10 = AbstractC4212b.f46079d.d(k10, str);
                                Intrinsics.checkNotNull(d10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                emptyMap = (Map) d10;
                            } catch (Exception e12) {
                                exc = e12;
                                dataStoreUtils = dataStoreUtils2;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                                Map mutableMap2 = MapsKt.toMutableMap(emptyMap);
                                Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap2);
                                if (!Intrinsics.areEqual(linkedHashMap.get(id3), Boolean.TRUE)) {
                                }
                            }
                        }
                        Map mutableMap22 = MapsKt.toMutableMap(emptyMap);
                        Intrinsics.checkNotNull(mutableMap22, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                        linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap22);
                    }
                } catch (Exception e13) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            if (!Intrinsics.areEqual(linkedHashMap.get(id3), Boolean.TRUE)) {
                y8 a10 = k1.f25630g.a(featureFlag);
                if (a10 != null) {
                    this.f25483d.a(a10);
                }
                d(featureFlag.getId());
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.I2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g8.a(FeatureFlag.this);
                }
            }, 6, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.J2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g8.b(id2);
            }
        }, 6, (Object) null);
    }

    public static final String a(FeatureFlag featureFlag) {
        return "Not logging a Feature Flag impression for Feature Flag with id " + featureFlag.getId() + ". The Feature Flag already had an impression logged in the current session";
    }

    public static final String a(long j10) {
        return "Updating last Feature Flags refresh time: " + j10;
    }

    public static final String a(List list) {
        return "Loaded " + list.size() + " Feature Flags from DataStore.";
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.A2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g8.b();
            }
        }, 7, (Object) null);
        this.f25484e.clearData(DataStoreKey.FEATURE_FLAGS);
        this.f25485f = CollectionsKt.emptyList();
        if (this.f25486g.get()) {
            List list = this.f25485f;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
            }
            ((r7) this.f25481b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
        }
    }
}
