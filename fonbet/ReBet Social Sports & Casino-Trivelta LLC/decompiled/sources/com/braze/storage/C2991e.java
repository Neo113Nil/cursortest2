package com.braze.storage;

import I0.InterfaceC1344i;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import android.content.Context;
import bo.app.s6;
import bo.app.t6;
import bo.app.u6;
import bo.app.v6;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import ei.AbstractC4212b;
import java.util.LinkedHashMap;
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

/* renamed from: com.braze.storage.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2991e extends DataStoreProvider {

    /* renamed from: b, reason: collision with root package name */
    public static final s6 f29417b = new s6();

    /* renamed from: a, reason: collision with root package name */
    public final Wh.a f29418a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2991e(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29418a = Wh.g.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x019c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(String key) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KClass orCreateKotlinClass;
        InterfaceC1901b k10;
        Long l10;
        Intrinsics.checkNotNullParameter(key, "key");
        DataStoreKey dataStoreKey = DataStoreKey.ENDPOINT_LAST_REQUEST_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = readData(dataStoreKey, "");
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) v6.f26142a, 6, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                    Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                    Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                    l10 = (Long) linkedHashMap.get(key);
                                    if (l10 != null) {
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
                            l10 = (Long) linkedHashMap.get(key);
                            if (l10 != null) {
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
        l10 = (Long) linkedHashMap.get(key);
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(new K0.a(getContext(), "persistent.com.braze.requests.metadata.last_req_at", null, null, new t6(), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "persistent.com.braze.endpoint_metadata";
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(String key, long j10) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KClass orCreateKotlinClass;
        InterfaceC1901b k10;
        Intrinsics.checkNotNullParameter(key, "key");
        DataStoreKey dataStoreKey = DataStoreKey.ENDPOINT_ATTEMPT_COUNT_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = readData(dataStoreKey, "");
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) u6.f26108a, 6, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                    Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                    Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                    Long l10 = (Long) linkedHashMap.get(key);
                                    if (l10 != null) {
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
                            Long l102 = (Long) linkedHashMap.get(key);
                            if (l102 != null) {
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
        Long l1022 = (Long) linkedHashMap.get(key);
        return l1022 != null ? l1022.longValue() : j10;
    }
}
