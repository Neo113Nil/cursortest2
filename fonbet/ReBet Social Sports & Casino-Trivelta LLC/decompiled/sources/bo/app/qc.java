package bo.app;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.IEventSubscriber;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import di.C4084d0;
import di.C4096j0;
import di.Z0;
import ei.AbstractC4212b;
import java.util.ArrayList;
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

/* loaded from: classes.dex */
public final class qc {

    /* renamed from: a, reason: collision with root package name */
    public final ue f25951a;

    /* renamed from: b, reason: collision with root package name */
    public final com.braze.storage.l f25952b;

    public qc(Context context, String apiKey, String str, r7 internalEventPublisher, ue serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f25951a = serverConfigStorageProvider;
        this.f25952b = new com.braze.storage.l(context, str, apiKey);
        internalEventPublisher.c(rc.class, new IEventSubscriber() { // from class: c3.N9
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.qc.a(bo.app.qc.this, (bo.app.rc) obj);
            }
        });
        c();
    }

    public static final void a(qc qcVar, rc it) {
        Intrinsics.checkNotNullParameter(it, "it");
        qcVar.f25952b.writeData(DataStoreKey.PUSH_MAX_LAST_UPDATE, Long.valueOf(it.f25989a));
    }

    public static final String b(String str) {
        return "Adding push campaign to storage with uid " + str;
    }

    public final void c() {
        String str;
        long nowInSeconds = DateTimeUtils.nowInSeconds() - TimeUnit.DAYS.toSeconds(45L);
        final List a10 = a();
        final ArrayList arrayList = new ArrayList();
        for (Object obj : a10) {
            if (((oc) obj).f25892b >= nowInSeconds) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != a10.size()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.O9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.qc.a(a10, arrayList);
                }
            }, 7, (Object) null);
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                oc ocVar = (oc) obj2;
                Pair pair = TuplesKt.to(ocVar.f25891a, Long.valueOf(ocVar.f25892b));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            if (linkedHashMap.isEmpty()) {
                this.f25952b.clearData(DataStoreKey.PUSH_MAX_CAMPAIGNS);
                return;
            }
            com.braze.storage.l lVar = this.f25952b;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
                return;
            }
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                    aVar.a();
                    str = aVar.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), linkedHashMap);
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                    str = "{}";
                }
                lVar.writeData(dataStoreKey, str);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
            }
        }
    }

    public static final String b(String str, long j10) {
        return "Adding push campaign to storage with uid " + str + " and time " + j10;
    }

    public static final String b() {
        return "Error reading push max campaign data from DataStore.";
    }

    public final void a(final String pushCampaign) {
        Intrinsics.checkNotNullParameter(pushCampaign, "pushCampaign");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.P9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.qc.b(pushCampaign);
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

    public final void a(final String pushCampaign, final long j10) {
        String str;
        Intrinsics.checkNotNullParameter(pushCampaign, "pushCampaign");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.R9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.qc.b(pushCampaign, j10);
            }
        }, 7, (Object) null);
        List<oc> a10 = a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(a10, 10)), 16));
        for (oc ocVar : a10) {
            Pair pair = TuplesKt.to(ocVar.f25891a, Long.valueOf(ocVar.f25892b));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
        mutableMap.put(pushCampaign, Long.valueOf(j10));
        com.braze.storage.l lVar = this.f25952b;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), mutableMap);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = "{}";
            }
            lVar.writeData(dataStoreKey, str);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x01a7 A[Catch: Exception -> 0x002a, LOOP:0: B:6:0x01a1->B:8:0x01a7, LOOP_END, TRY_LEAVE, TryCatch #2 {Exception -> 0x002a, blocks: (B:2:0x0000, B:4:0x000c, B:5:0x0190, B:6:0x01a1, B:8:0x01a7, B:61:0x0175, B:14:0x002e, B:16:0x0042, B:17:0x004d, B:19:0x0055, B:20:0x0167, B:21:0x005b, B:23:0x006b, B:53:0x0152), top: B:1:0x0000, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KClass orCreateKotlinClass;
        InterfaceC1901b k10;
        try {
            com.braze.storage.l lVar = this.f25952b;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = lVar.readData(dataStoreKey, "");
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
                                orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
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
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) pc.f25906a, 6, (Object) null);
                                        emptyMap = MapsKt.emptyMap();
                                    } catch (Exception e11) {
                                        e = e11;
                                        exc = e;
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
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
                                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                                while (r0.hasNext()) {
                                }
                                return arrayList2;
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
            ArrayList arrayList22 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList22.add(new oc((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
            return arrayList22;
        } catch (Exception e14) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e14, false, new Function0() { // from class: c3.Q9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.qc.b();
                }
            }, 4, (Object) null);
            return CollectionsKt.emptyList();
        }
    }
}
