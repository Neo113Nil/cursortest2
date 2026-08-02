package bo.app;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.C2992f;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4084d0;
import di.Z0;
import ei.AbstractC4212b;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final C2992f f25923a;

    public q1(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25923a = new C2992f(context, str, str2);
    }

    public static final String a(String str, String str2) {
        return "Could not create BrazeEvent from [serialized event string=" + str + ", unique identifier=" + str2 + "] ... Deleting!";
    }

    public static final String c(y8 y8Var) {
        return "Adding event to storage with uid " + ((k1) y8Var).f25635d;
    }

    public final Collection b() {
        Map linkedHashMap;
        Map emptyMap;
        InterfaceC1901b k10;
        Object linkedHashMap2;
        Map emptyMap2;
        InterfaceC1901b k11;
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C2992f c2992f = this.f25923a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        DataStoreValueType type = dataStoreKey.getType();
        DataStoreValueType dataStoreValueType = DataStoreValueType.MAP;
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Boolean.TYPE;
        Class cls5 = Long.TYPE;
        String str2 = "null";
        String str3 = "null cannot be cast to non-null type kotlin.String";
        String str4 = "";
        if (type != dataStoreValueType) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = c2992f.readData(dataStoreKey, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str5 = (String) readData;
                if (StringsKt.isBlank(str5)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str5)) {
                        emptyMap = MapsKt.emptyMap();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str5).toString(), "null")) {
                        emptyMap = MapsKt.emptyMap();
                    } else {
                        try {
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                k10 = AbstractC2028a.k(AbstractC2028a.H(stringCompanionObject), AbstractC2028a.H(stringCompanionObject));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls5))) {
                                k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.F(LongCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls4))) {
                                k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.z(BooleanCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls3))) {
                                k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.E(IntCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls2))) {
                                k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.C(DoubleCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls))) {
                                k10 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.D(FloatCompanionObject.INSTANCE));
                            } else {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) p1.f25898a, 6, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                            }
                            Object d10 = AbstractC4212b.f46079d.d(k10, str5);
                            Intrinsics.checkNotNull(d10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            emptyMap = (Map) d10;
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) new DataStoreUtils.b(str5), 4, (Object) null);
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
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            final String str6 = (String) entry.getKey();
            final String str7 = (String) entry.getValue();
            try {
                y8 e12 = k1.f25630g.e(str7, str6);
                if (e12 != null) {
                    linkedHashSet.add(e12);
                }
            } catch (Exception e13) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.f29470E;
                String str8 = str2;
                Function0 function0 = new Function0() { // from class: c3.g9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.q1.a(str7, str6);
                    }
                };
                String str9 = str3;
                String str10 = str4;
                LinkedHashSet linkedHashSet2 = linkedHashSet;
                Class cls6 = cls;
                Class cls7 = cls2;
                Class cls8 = cls3;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) e13, false, function0, 4, (Object) null);
                C2992f c2992f2 = this.f25923a;
                DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
                if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                    BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), priority, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
                    linkedHashMap2 = new LinkedHashMap();
                } else {
                    try {
                        Object readData2 = c2992f2.readData(dataStoreKey2, str10);
                        Intrinsics.checkNotNull(readData2, str9);
                        String str11 = (String) readData2;
                        if (StringsKt.isBlank(str11)) {
                            linkedHashMap2 = new LinkedHashMap();
                        } else {
                            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                            if (StringsKt.isBlank(str11)) {
                                emptyMap2 = MapsKt.emptyMap();
                            } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str11).toString(), str8)) {
                                emptyMap2 = MapsKt.emptyMap();
                            } else {
                                try {
                                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(String.class);
                                    if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                        k11 = AbstractC2028a.k(AbstractC2028a.H(stringCompanionObject2), AbstractC2028a.H(stringCompanionObject2));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls5))) {
                                        k11 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.F(LongCompanionObject.INSTANCE));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls4))) {
                                        k11 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.z(BooleanCompanionObject.INSTANCE));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls8))) {
                                        k11 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.E(IntCompanionObject.INSTANCE));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls7))) {
                                        k11 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.C(DoubleCompanionObject.INSTANCE));
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls6))) {
                                        k11 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.D(FloatCompanionObject.INSTANCE));
                                    } else {
                                        BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils2, priority, (Throwable) null, false, (Function0) n1.f25782a, 6, (Object) null);
                                        emptyMap2 = MapsKt.emptyMap();
                                    }
                                    Object d11 = AbstractC4212b.f46079d.d(k11, str11);
                                    Intrinsics.checkNotNull(d11, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                    emptyMap2 = (Map) d11;
                                } catch (Exception e14) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f29470E, (Throwable) e14, false, (Function0) new DataStoreUtils.b(str11), 4, (Object) null);
                                    emptyMap2 = MapsKt.emptyMap();
                                }
                            }
                            Map mutableMap2 = MapsKt.toMutableMap(emptyMap2);
                            Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                            linkedHashMap2 = TypeIntrinsics.asMutableMap(mutableMap2);
                        }
                    } catch (Exception e15) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e15, false, (Function0) new DataStoreProvider.m(dataStoreKey2), 8, (Object) null);
                        linkedHashMap2 = new LinkedHashMap();
                    }
                }
                Object obj = linkedHashMap2;
                TypeIntrinsics.asMutableMap(obj).remove(str6);
                C2992f c2992f3 = this.f25923a;
                DataStoreKey dataStoreKey3 = DataStoreKey.EVENT_STORAGE_MAP;
                if (dataStoreKey3.getType() != DataStoreValueType.MAP) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey3), 12, (Object) null);
                } else {
                    try {
                        DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                        try {
                            AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                            aVar.a();
                            Z0 z02 = Z0.f45341a;
                            str = aVar.b(new C4084d0(z02, z02), obj);
                        } catch (Exception e16) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f29470E, (Throwable) e16, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                            str = (!(obj instanceof Map) && (obj instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                        }
                        c2992f3.writeData(dataStoreKey3, str);
                    } catch (Exception e17) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e17, false, (Function0) new DataStoreProvider.r(dataStoreKey3), 8, (Object) null);
                    }
                }
                str2 = str8;
                str3 = str9;
                str4 = str10;
                linkedHashSet = linkedHashSet2;
                cls = cls6;
                cls2 = cls7;
                cls3 = cls8;
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final y8 event) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        KClass orCreateKotlinClass;
        InterfaceC1901b k10;
        DataStoreKey dataStoreKey;
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.h9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.q1.c(bo.app.y8.this);
            }
        }, 7, (Object) null);
        C2992f c2992f = this.f25923a;
        DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = c2992f.readData(dataStoreKey2, "");
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
                            orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
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
                                BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils2, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) m1.f25741a, 6, (Object) null);
                                dataStoreUtils = dataStoreUtils2;
                                try {
                                    emptyMap = MapsKt.emptyMap();
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str2), 4, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                    Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                    Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                    linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                    String str3 = ((k1) event).f25635d;
                                    event.getClass();
                                    String jSONObject = ((k1) event).getKey().toString();
                                    Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                                    linkedHashMap.put(str3, jSONObject);
                                    C2992f c2992f2 = this.f25923a;
                                    dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
                                    if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                    }
                                }
                            }
                            Object d10 = AbstractC4212b.f46079d.d(k10, str2);
                            Intrinsics.checkNotNull(d10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            emptyMap = (Map) d10;
                        } catch (Exception e12) {
                            exc = e12;
                            dataStoreUtils = dataStoreUtils2;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str2), 4, (Object) null);
                            emptyMap = MapsKt.emptyMap();
                            Map mutableMap2 = MapsKt.toMutableMap(emptyMap);
                            Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                            linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap2);
                            String str32 = ((k1) event).f25635d;
                            event.getClass();
                            String jSONObject2 = ((k1) event).getKey().toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                            linkedHashMap.put(str32, jSONObject2);
                            C2992f c2992f22 = this.f25923a;
                            dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
                            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                            }
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
        String str322 = ((k1) event).f25635d;
        event.getClass();
        String jSONObject22 = ((k1) event).getKey().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject22, "toString(...)");
        linkedHashMap.put(str322, jSONObject22);
        C2992f c2992f222 = this.f25923a;
        dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                Z0 z02 = Z0.f45341a;
                str = aVar.b(new C4084d0(z02, z02), linkedHashMap);
            } catch (Exception e14) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f29470E, (Throwable) e14, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = "{}";
            }
            c2992f222.writeData(dataStoreKey, str);
        } catch (Exception e15) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e15, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
        }
    }

    public final void a(Set events) {
        Map linkedHashMap;
        Map emptyMap;
        InterfaceC1901b k10;
        String str;
        Intrinsics.checkNotNullParameter(events, "events");
        C2992f c2992f = this.f25923a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = c2992f.readData(dataStoreKey, "");
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
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) o1.f25842a, 6, (Object) null);
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
        Iterator it = events.iterator();
        while (it.hasNext()) {
            final String str3 = ((k1) ((y8) it.next())).f25635d;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.i9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.q1.a(str3);
                }
            }, 7, (Object) null);
            map.remove(str3);
        }
        C2992f c2992f2 = this.f25923a;
        DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey2), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                Z0 z02 = Z0.f45341a;
                str = aVar.b(new C4084d0(z02, z02), map);
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f29470E, (Throwable) e12, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = (!(map instanceof Map) && (map instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            c2992f2.writeData(dataStoreKey2, str);
        } catch (Exception e13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) new DataStoreProvider.r(dataStoreKey2), 8, (Object) null);
        }
    }

    public static final String a(String str) {
        return "Deleting event from storage with uid " + str;
    }
}
