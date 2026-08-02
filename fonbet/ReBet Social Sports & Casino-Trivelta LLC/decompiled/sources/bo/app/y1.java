package bo.app;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import bo.app.xe;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.enums.GeofenceTransitionType;
import com.braze.events.IEventSubscriber;
import com.braze.models.BrazeGeofence;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4084d0;
import di.C4096j0;
import di.Z0;
import ei.AbstractC4212b;
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
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final GeofenceDataStoreProvider f26305a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f26306b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f26307c;

    /* renamed from: d, reason: collision with root package name */
    public long f26308d;

    /* renamed from: e, reason: collision with root package name */
    public long f26309e;

    /* renamed from: f, reason: collision with root package name */
    public int f26310f;

    /* renamed from: g, reason: collision with root package name */
    public int f26311g;

    public y1(ue serverConfigStorageProvider, m9 internalIEventMessenger, GeofenceDataStoreProvider dataStoreProvider) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalIEventMessenger, "internalIEventMessenger");
        Intrinsics.checkNotNullParameter(dataStoreProvider, "dataStoreProvider");
        this.f26305a = dataStoreProvider;
        ((r7) internalIEventMessenger).c(xe.class, new IEventSubscriber() { // from class: c3.Nc
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.y1.a(bo.app.y1.this, (xe) obj);
            }
        });
        this.f26306b = a();
        this.f26307c = new AtomicBoolean(false);
        Object readData = dataStoreProvider.readData(DataStoreKey.GLOBAL_LAST_REQUEST, 0L);
        Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.Long");
        this.f26308d = ((Long) readData).longValue();
        Object readData2 = dataStoreProvider.readData(DataStoreKey.GLOBAL_LAST_REPORT, 0L);
        Intrinsics.checkNotNull(readData2, "null cannot be cast to non-null type kotlin.Long");
        this.f26309e = ((Long) readData2).longValue();
        this.f26310f = serverConfigStorageProvider.u();
        this.f26311g = serverConfigStorageProvider.t();
    }

    public static final String b(long j10, int i10, String str, GeofenceTransitionType geofenceTransitionType) {
        return j10 + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + i10 + "). id:" + str + " transition:" + geofenceTransitionType;
    }

    public static final String c(String str) {
        return "Deleting outdated id " + str + " from re-eligibility list.";
    }

    public static final String d(String str) {
        return "Retaining id " + str + " in re-eligibility list.";
    }

    public final void a(re serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        final int i10 = serverConfig.f26005e;
        if (i10 >= 0) {
            this.f26310f = i10;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.Qc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.y1.a(i10);
                }
            }, 6, (Object) null);
        }
        final int i11 = serverConfig.f26006f;
        if (i11 >= 0) {
            this.f26311g = i11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.Rc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.y1.b(i11);
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

    public static final String b(long j10, y1 y1Var, String str) {
        return "Geofence report eligible since " + j10 + " seconds have passed since the last time geofences were reported globally (minimum interval: " + y1Var.f26311g + "). id:" + str;
    }

    public static final String c(long j10) {
        return "Updating the last successful location request time to: " + j10;
    }

    public static final String b(long j10, y1 y1Var) {
        return j10 + " seconds have passed since the last time geofences were requested (minimum interval: " + y1Var.f26310f + ").";
    }

    public static final String b() {
        return "Geofences have not been requested for the current session yet. Request is eligible.";
    }

    public final void b(final long j10) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Uc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.y1.c(j10);
            }
        }, 7, (Object) null);
        this.f26308d = j10;
        this.f26305a.writeData(DataStoreKey.GLOBAL_LAST_REQUEST, Long.valueOf(j10));
    }

    public static final void a(y1 y1Var, xe it) {
        Intrinsics.checkNotNullParameter(it, "it");
        y1Var.f26307c.set(false);
    }

    public final void a(List brazeGeofenceList) {
        Map linkedHashMap;
        Map emptyMap;
        InterfaceC1901b k10;
        String str;
        Intrinsics.checkNotNullParameter(brazeGeofenceList, "brazeGeofenceList");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = brazeGeofenceList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((BrazeGeofence) it.next()).getId());
        }
        HashSet hashSet = new HashSet(this.f26306b.keySet());
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.f26305a;
        DataStoreKey dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
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
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str2).toString(), "null")) {
                        emptyMap = MapsKt.emptyMap();
                    } else {
                        try {
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) x1.f26220a, 6, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                            }
                            Object d10 = AbstractC4212b.f46079d.d(k10, str2);
                            Intrinsics.checkNotNull(d10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            emptyMap = (Map) d10;
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) new DataStoreUtils.b(str2), 4, (Object) null);
                            emptyMap = MapsKt.emptyMap();
                        }
                    }
                    Map mutableMap = MapsKt.toMutableMap(emptyMap);
                    Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
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
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Sc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.y1.c(str3);
                    }
                }, 7, (Object) null);
                this.f26306b.remove(str3);
                map.remove(str3);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Tc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.y1.d(str3);
                    }
                }, 7, (Object) null);
            }
        }
        GeofenceDataStoreProvider geofenceDataStoreProvider2 = this.f26305a;
        DataStoreKey dataStoreKey2 = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey2), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), map);
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f29470E, (Throwable) e12, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = (!(map instanceof Map) && (map instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            geofenceDataStoreProvider2.writeData(dataStoreKey2, str);
        } catch (Exception e13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) new DataStoreProvider.r(dataStoreKey2), 8, (Object) null);
        }
    }

    public static final String b(String str) {
        return "Exception trying to parse re-eligibility id: " + str;
    }

    public static final String b(int i10) {
        return "Min time since last geofence report reset via server configuration: " + i10 + ".";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x027a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j10, BrazeGeofence geofence, final GeofenceTransitionType transitionType) {
        final String str;
        final y1 y1Var;
        Map linkedHashMap;
        Map emptyMap;
        InterfaceC1901b k10;
        DataStoreKey dataStoreKey;
        String str2;
        Intrinsics.checkNotNullParameter(geofence, "geofence");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        final String id2 = geofence.getId();
        final long j11 = j10 - this.f26309e;
        if (this.f26311g > j11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.cd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.y1.a(j11, this, id2);
                }
            }, 7, (Object) null);
            return false;
        }
        String a10 = a(id2, transitionType);
        final int cooldownEnterSeconds = transitionType == GeofenceTransitionType.ENTER ? geofence.getCooldownEnterSeconds() : geofence.getCooldownExitSeconds();
        if (this.f26306b.containsKey(a10)) {
            Long l10 = (Long) this.f26306b.get(a10);
            if (l10 != null) {
                final long longValue = j10 - l10.longValue();
                if (cooldownEnterSeconds > longValue) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.dd
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.y1.a(longValue, cooldownEnterSeconds, id2, transitionType);
                        }
                    }, 7, (Object) null);
                    return false;
                }
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                Function0 function0 = new Function0() { // from class: c3.ed
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.y1.b(longValue, cooldownEnterSeconds, id2, transitionType);
                    }
                };
                str = id2;
                y1Var = this;
                BrazeLogger.brazelog$default(brazeLogger, (Object) y1Var, (BrazeLogger.Priority) null, (Throwable) null, false, function0, 7, (Object) null);
            } else {
                str = id2;
                y1Var = this;
            }
        } else {
            str = id2;
            y1Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) y1Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Oc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.y1.b(str, transitionType);
                }
            }, 7, (Object) null);
        }
        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger2, (Object) y1Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Pc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.y1.b(j11, y1Var, str);
            }
        }, 7, (Object) null);
        y1 y1Var2 = y1Var;
        y1Var2.f26306b.put(a10, Long.valueOf(j10));
        GeofenceDataStoreProvider geofenceDataStoreProvider = y1Var2.f26305a;
        DataStoreKey dataStoreKey2 = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger2, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
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
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str3).toString(), "null")) {
                        emptyMap = MapsKt.emptyMap();
                    } else {
                        try {
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
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
                                try {
                                    BrazeLogger.brazelog$default(brazeLogger2, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) w1.f26152a, 6, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                } catch (Exception e10) {
                                    e = e10;
                                    dataStoreUtils = dataStoreUtils;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e, false, (Function0) new DataStoreUtils.b(str3), 4, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                    Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                    Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                    linkedHashMap.put(a10, Long.valueOf(j10));
                                    GeofenceDataStoreProvider geofenceDataStoreProvider2 = y1Var2.f26305a;
                                    dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
                                    if (dataStoreKey.getType() == DataStoreValueType.MAP) {
                                    }
                                    y1Var2.f26309e = j10;
                                    y1Var2.f26305a.writeData(DataStoreKey.GLOBAL_LAST_REPORT, Long.valueOf(j10));
                                    return true;
                                }
                            }
                            Object d10 = AbstractC4212b.f46079d.d(k10, str3);
                            Intrinsics.checkNotNull(d10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            emptyMap = (Map) d10;
                        } catch (Exception e11) {
                            e = e11;
                        }
                    }
                    Map mutableMap2 = MapsKt.toMutableMap(emptyMap);
                    Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap2);
                }
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e12, false, (Function0) new DataStoreProvider.m(dataStoreKey2), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        linkedHashMap.put(a10, Long.valueOf(j10));
        GeofenceDataStoreProvider geofenceDataStoreProvider22 = y1Var2.f26305a;
        dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() == DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                try {
                    AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                    aVar.a();
                    str2 = aVar.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), linkedHashMap);
                } catch (Exception e13) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                    str2 = "{}";
                }
                geofenceDataStoreProvider22.writeData(dataStoreKey, str2);
            } catch (Exception e14) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e14, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
            }
        }
        y1Var2.f26309e = j10;
        y1Var2.f26305a.writeData(DataStoreKey.GLOBAL_LAST_REPORT, Long.valueOf(j10));
        return true;
    }

    public static final String a(long j10, y1 y1Var, String str) {
        return "Geofence report suppressed since only " + j10 + " seconds have passed since the last time geofences were reported globally (minimum interval: " + y1Var.f26311g + "). id:" + str;
    }

    public static final String a(long j10, int i10, String str, GeofenceTransitionType geofenceTransitionType) {
        return "Geofence report suppressed since only " + j10 + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + i10 + "). id:" + str + " transition:" + geofenceTransitionType;
    }

    public final boolean a(boolean z10, long j10) {
        final long j11 = j10 - this.f26308d;
        if (!z10 && this.f26310f > j11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Wc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.y1.a(j11, this);
                }
            }, 7, (Object) null);
            return false;
        }
        if (z10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Xc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.y1.a(j11);
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Yc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.y1.b(j11, this);
                }
            }, 7, (Object) null);
        }
        if (this.f26307c.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Zc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.y1.b();
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ad
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.y1.c();
            }
        }, 7, (Object) null);
        return false;
    }

    public static final String a(long j10, y1 y1Var) {
        return "Geofence request suppressed since only " + j10 + " seconds have passed since the last time geofences were requested (minimum interval: " + y1Var.f26310f + ").";
    }

    public static final String a(long j10) {
        return "Ignoring rate limit for this geofence request. Elapsed time since last request:" + j10;
    }

    public final String a(final String reEligibilityId) {
        Intrinsics.checkNotNullParameter(reEligibilityId, "reEligibilityId");
        try {
            return new Regex("_").split(reEligibilityId, 2).get(1);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Vc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.y1.b(reEligibilityId);
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

    public static final String a(int i10) {
        return "Min time since last geofence request reset via server configuration: " + i10 + ".";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x019f A[LOOP:0: B:5:0x0199->B:7:0x019f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ConcurrentHashMap a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        InterfaceC1901b k10;
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.f26305a;
        DataStoreKey dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
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
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), "null")) {
                        emptyMap = MapsKt.emptyMap();
                    } else {
                        try {
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
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
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) v1.f26136a, 6, (Object) null);
                                        emptyMap = MapsKt.emptyMap();
                                    } catch (Exception e10) {
                                        e = e10;
                                        exc = e;
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
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
                                Object d10 = AbstractC4212b.f46079d.d(k10, str);
                                Intrinsics.checkNotNull(d10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                emptyMap = (Map) d10;
                            } catch (Exception e11) {
                                exc = e11;
                                dataStoreUtils = dataStoreUtils2;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                                Map mutableMap2 = MapsKt.toMutableMap(emptyMap);
                                Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap2);
                                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                                while (r0.hasNext()) {
                                }
                                return concurrentHashMap2;
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
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        ConcurrentHashMap concurrentHashMap22 = new ConcurrentHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            final String str2 = (String) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.bd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.y1.a(bo.app.y1.this, str2);
                }
            }, 7, (Object) null);
            concurrentHashMap22.put(str2, Long.valueOf(longValue));
        }
        return concurrentHashMap22;
    }

    public static final String a(y1 y1Var, String str) {
        return "Retrieving geofence id " + y1Var.a(str) + " eligibility information from local storage.";
    }
}
