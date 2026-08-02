package bo.app;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import android.content.Context;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
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

/* loaded from: classes.dex */
public final class mc {

    /* renamed from: b, reason: collision with root package name */
    public static final long f25757b = TimeUnit.DAYS.toSeconds(45);

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.storage.k f25758a;

    public mc(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25758a = new com.braze.storage.k(context, str2, str);
        b();
    }

    public static final String b(String str) {
        return "Push dedupe id " + str + " has already been seen. Returning false.";
    }

    public static final String c() {
        return "Push dedupe id is blank. Returning true.";
    }

    public final boolean a(final String pushId) {
        String str;
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        if (StringsKt.isBlank(pushId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.B5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.mc.c();
                }
            }, 7, (Object) null);
            return true;
        }
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        if (a().containsKey(pushId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.C5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.mc.b(pushId);
                }
            }, 7, (Object) null);
            return false;
        }
        b();
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        Map mutableMap = MapsKt.toMutableMap(a());
        mutableMap.put(pushId, Long.valueOf(DateTimeUtils.nowInSeconds()));
        com.braze.storage.k kVar = this.f25758a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
        } else {
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
                kVar.writeData(dataStoreKey, str);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
            }
        }
        return true;
    }

    public final void b() {
        String str;
        final long nowInSeconds = DateTimeUtils.nowInSeconds() - f25757b;
        Map mutableMap = MapsKt.toMutableMap(a());
        Iterator it = mutableMap.entrySet().iterator();
        while (it.hasNext()) {
            final Map.Entry entry = (Map.Entry) it.next();
            if (((Number) entry.getValue()).longValue() < nowInSeconds) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.A5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.mc.a(entry, nowInSeconds);
                    }
                }, 6, (Object) null);
                it.remove();
            }
        }
        com.braze.storage.k kVar = this.f25758a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
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
            kVar.writeData(dataStoreKey, str);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(Map.Entry entry, long j10) {
        return "Evicting push id key " + entry.getKey() + " based on cutoff: " + j10;
    }

    public final Map a() {
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map emptyMap;
        InterfaceC1901b k10;
        com.braze.storage.k kVar = this.f25758a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object readData = kVar.readData(dataStoreKey, "");
            Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
            String str = (String) readData;
            if (StringsKt.isBlank(str)) {
                return new LinkedHashMap();
            }
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) lc.f25730a, 6, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                            } catch (Exception e10) {
                                e = e10;
                                exc = e;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
                                emptyMap = MapsKt.emptyMap();
                                Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                return TypeIntrinsics.asMutableMap(mutableMap);
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
                        return TypeIntrinsics.asMutableMap(mutableMap2);
                    }
                } catch (Exception e12) {
                    e = e12;
                    dataStoreUtils = dataStoreUtils2;
                }
            }
            Map mutableMap22 = MapsKt.toMutableMap(emptyMap);
            Intrinsics.checkNotNull(mutableMap22, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
            return TypeIntrinsics.asMutableMap(mutableMap22);
        } catch (Exception e13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
            return new LinkedHashMap();
        }
    }
}
