package bo.app;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import bo.app.qg;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import di.C4084d0;
import di.C4096j0;
import di.Z0;
import ei.AbstractC4212b;
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
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class qg implements x9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.storage.t f25959a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f25960b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f25961c;

    public qg(com.braze.storage.t triggerDataStoreProvider) {
        Intrinsics.checkNotNullParameter(triggerDataStoreProvider, "triggerDataStoreProvider");
        this.f25959a = triggerDataStoreProvider;
        this.f25960b = a();
        this.f25961c = new LinkedHashMap();
    }

    public static final String a(String str) {
        return "Retaining triggered action " + str + " in re-eligibility list.";
    }

    public static final String b(String str) {
        return "Deleting outdated triggered action id " + str + " from stored re-eligibility list.";
    }

    public static final String c(y9 y9Var) {
        return "Triggered action id " + ((rg) y9Var).f26028a + " always eligible via never having been triggered. Returning true for eligibility status";
    }

    public static final String d(y9 y9Var) {
        return "Triggered action id " + ((rg) y9Var).f26028a + " no longer eligible due to having been triggered in the past and is only eligible once.";
    }

    public final void e(final y9 triggeredAction) {
        String str;
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        rg rgVar = (rg) triggeredAction;
        if (rgVar.f26029b.f25831f.f26144a == -1) {
            this.f25960b.remove(rgVar.f26028a);
        } else {
            Long l10 = (Long) this.f25961c.get(rgVar.f26028a);
            final long longValue = l10 != null ? l10.longValue() : 0L;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Z9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qg.c(bo.app.y9.this, longValue);
                }
            }, 7, (Object) null);
            this.f25960b.put(rgVar.f26028a, Long.valueOf(longValue));
        }
        com.braze.storage.t tVar = this.f25959a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        Map map = this.f25960b;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), map);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = (!(map instanceof Map) && (map instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            tVar.writeData(dataStoreKey, str);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(Map map) {
        return "Successfully updated re-eligibility map in DataStore with " + map.size() + " entries";
    }

    public static final String b(y9 y9Var) {
        return "Triggered action id " + ((rg) y9Var).f26028a + " always eligible via configuration. Returning true for eligibility status";
    }

    public final boolean a(final y9 triggeredAction) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        rg rgVar = (rg) triggeredAction;
        final vc vcVar = rgVar.f26029b.f25831f;
        if (vcVar.f26144a == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ea
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qg.b(bo.app.y9.this);
                }
            }, 7, (Object) null);
            return true;
        }
        if (!this.f25960b.containsKey(rgVar.f26028a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.fa
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qg.c(bo.app.y9.this);
                }
            }, 7, (Object) null);
            return true;
        }
        if (vcVar.f26144a == -1) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.U9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qg.d(bo.app.y9.this);
                }
            }, 7, (Object) null);
            return false;
        }
        Long l10 = (Long) this.f25960b.get(rgVar.f26028a);
        final long longValue = l10 != null ? l10.longValue() : 0L;
        long nowInSeconds = DateTimeUtils.nowInSeconds() + rgVar.f26029b.f25829d;
        int i10 = vcVar.f26144a;
        if (nowInSeconds >= ((i10 > 0 ? Integer.valueOf(i10) : null) != null ? r0.intValue() : 0) + longValue) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.V9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qg.a(longValue, vcVar);
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.W9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qg.b(longValue, vcVar);
            }
        }, 7, (Object) null);
        return false;
    }

    public static final String c(y9 y9Var, long j10) {
        return "Resetting re-eligibility for action Id " + ((rg) y9Var).f26028a + " to " + j10;
    }

    public static final String b(long j10, q9 q9Var) {
        long nowInSeconds = DateTimeUtils.nowInSeconds() - j10;
        int i10 = ((vc) q9Var).f26144a;
        return "Trigger action is not re-eligible for display since only " + nowInSeconds + " seconds have passed since the last time it was triggered (minimum interval: " + (i10 > 0 ? Integer.valueOf(i10) : null) + ").";
    }

    public static final String c(String str) {
        return "Retrieving triggered action id " + str + " eligibility information from DataStore.";
    }

    public static final String b(y9 y9Var, long j10) {
        return "Updating re-eligibility for action Id " + ((rg) y9Var).f26028a + " to time " + j10 + ".";
    }

    public static final String b(Map map) {
        return "Retrieved " + map.size() + " trigger re-eligibility entries from DataStore";
    }

    public static final String b() {
        return "No trigger re-eligibility information found in DataStore";
    }

    public static final String a(long j10, q9 q9Var) {
        long nowInSeconds = DateTimeUtils.nowInSeconds() - j10;
        int i10 = ((vc) q9Var).f26144a;
        return "Trigger action is re-eligible for display since " + nowInSeconds + " seconds have passed since the last time it was triggered (minimum interval: " + (i10 > 0 ? Integer.valueOf(i10) : null) + ").";
    }

    public final void a(final y9 triggeredAction, final long j10) {
        String str;
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.aa
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qg.b(bo.app.y9.this, j10);
            }
        }, 7, (Object) null);
        LinkedHashMap linkedHashMap = this.f25961c;
        rg rgVar = (rg) triggeredAction;
        String str2 = rgVar.f26028a;
        Long l10 = (Long) this.f25960b.get(str2);
        linkedHashMap.put(str2, Long.valueOf(l10 != null ? l10.longValue() : 0L));
        this.f25960b.put(rgVar.f26028a, Long.valueOf(j10));
        com.braze.storage.t tVar = this.f25959a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        Map map = this.f25960b;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), map);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = (!(map instanceof Map) && (map instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            tVar.writeData(dataStoreKey, str);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        InterfaceC1901b k10;
        final Map map;
        com.braze.storage.t tVar = this.f25959a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = tVar.readData(dataStoreKey, "");
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
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) pg.f25920a, 6, (Object) null);
                                        emptyMap = MapsKt.emptyMap();
                                    } catch (Exception e10) {
                                        e = e10;
                                        exc = e;
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
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
                                map = linkedHashMap;
                                if (!map.isEmpty()) {
                                }
                                return map;
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
        map = linkedHashMap;
        if (!map.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.T9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qg.b(map);
                }
            }, 7, (Object) null);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                final String str2 = (String) ((Map.Entry) it.next()).getKey();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.X9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qg.c(str2);
                    }
                }, 7, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Y9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qg.b();
                }
            }, 7, (Object) null);
        }
        return map;
    }

    public final void a(List triggeredActions) {
        String str;
        qg qgVar = this;
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(triggeredActions, 10));
        Iterator it = triggeredActions.iterator();
        while (it.hasNext()) {
            arrayList.add(((rg) ((y9) it.next())).f26028a);
        }
        Map map = qgVar.f25960b;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            final String str2 = (String) entry.getKey();
            boolean contains = arrayList.contains(str2);
            if (contains) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) qgVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ba
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qg.a(str2);
                    }
                }, 7, (Object) null);
                qgVar = this;
            } else {
                qgVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) qgVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ca
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qg.b(str2);
                    }
                }, 7, (Object) null);
            }
            if (contains) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        com.braze.storage.t tVar = qgVar.f25959a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
        } else {
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
                tVar.writeData(dataStoreKey, str);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) qgVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.da
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return qg.a(linkedHashMap);
            }
        }, 7, (Object) null);
    }
}
