package bo.app;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.C2996j;
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
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
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
public final class hc {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f25517a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f25518b;

    /* renamed from: c, reason: collision with root package name */
    public final C2996j f25519c;

    public hc(Context context, String apiKey) {
        Map linkedHashMap;
        Map emptyMap;
        InterfaceC1901b k10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f25517a = reentrantLock;
        ArrayList arrayList = new ArrayList();
        this.f25518b = arrayList;
        C2996j c2996j = new C2996j(context, apiKey);
        this.f25519c = c2996j;
        reentrantLock.lock();
        try {
            arrayList.clear();
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = c2996j.readData(dataStoreKey, "");
                    Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) readData;
                    if (StringsKt.isBlank(str)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        if (StringsKt.isBlank(str)) {
                            emptyMap = MapsKt.emptyMap();
                        } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), "null")) {
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) ec.f25431a, 6, (Object) null);
                                    emptyMap = MapsKt.emptyMap();
                                }
                                Object d10 = AbstractC4212b.f46079d.d(k10, str);
                                Intrinsics.checkNotNull(d10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                                emptyMap = (Map) d10;
                            } catch (Exception e10) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
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
                this.f25518b.add(new dc((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String a(dc dcVar) {
        String string = dcVar.f25633b.getString("cid");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return "Clearing PDE from storage with uid " + string;
    }

    public static final String c(List list) {
        return "Re-adding PDEs to storage: " + list;
    }

    public final void b(final List events) {
        Intrinsics.checkNotNullParameter(events, "events");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.W2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.hc.c(events);
            }
        }, 7, (Object) null);
        ReentrantLock reentrantLock = this.f25517a;
        reentrantLock.lock();
        try {
            this.f25518b.addAll(events);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01c5 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #4 {all -> 0x004a, blocks: (B:6:0x001e, B:8:0x002e, B:9:0x01b2, B:11:0x01c5, B:12:0x022c, B:18:0x01e2, B:20:0x01e4, B:21:0x020b, B:26:0x01fa, B:29:0x0212, B:31:0x004d, B:33:0x0061, B:34:0x006d, B:36:0x0075, B:37:0x0185, B:38:0x007b, B:40:0x008b, B:42:0x0091, B:44:0x00a3, B:45:0x0149, B:46:0x00b8, B:48:0x00c4, B:49:0x00d6, B:51:0x00e2, B:52:0x00f3, B:54:0x00ff, B:55:0x0110, B:57:0x011c, B:58:0x012d, B:60:0x0139, B:61:0x0157, B:64:0x0160, B:65:0x0163, B:70:0x016c, B:74:0x0193), top: B:5:0x001e, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final String pushCampaignId) {
        Map linkedHashMap;
        Map emptyMap;
        InterfaceC1901b k10;
        DataStoreKey dataStoreKey;
        String str;
        Intrinsics.checkNotNullParameter(pushCampaignId, "pushCampaignId");
        ReentrantLock reentrantLock = this.f25517a;
        reentrantLock.lock();
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.V2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.hc.b(pushCampaignId);
                }
            }, 7, (Object) null);
            try {
                long nowInSeconds = DateTimeUtils.nowInSeconds();
                C2996j c2996j = this.f25519c;
                DataStoreKey dataStoreKey2 = DataStoreKey.PUSH_DELIVERY_EVENTS;
                if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                    BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                } else {
                    try {
                        Object readData = c2996j.readData(dataStoreKey2, "");
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
                                        try {
                                            BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) fc.f25459a, 6, (Object) null);
                                            emptyMap = MapsKt.emptyMap();
                                        } catch (Exception e10) {
                                            e = e10;
                                            dataStoreUtils = dataStoreUtils;
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e, false, (Function0) new DataStoreUtils.b(str2), 4, (Object) null);
                                            emptyMap = MapsKt.emptyMap();
                                            Map mutableMap = MapsKt.toMutableMap(emptyMap);
                                            Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                                            linkedHashMap = TypeIntrinsics.asMutableMap(mutableMap);
                                            linkedHashMap.put(pushCampaignId, Long.valueOf(nowInSeconds));
                                            C2996j c2996j2 = this.f25519c;
                                            dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
                                            if (dataStoreKey.getType() == DataStoreValueType.MAP) {
                                            }
                                            this.f25518b.add(new dc(pushCampaignId, nowInSeconds));
                                            reentrantLock.unlock();
                                        }
                                    }
                                    Object d10 = AbstractC4212b.f46079d.d(k10, str2);
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
                linkedHashMap.put(pushCampaignId, Long.valueOf(nowInSeconds));
                C2996j c2996j22 = this.f25519c;
                dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
                if (dataStoreKey.getType() == DataStoreValueType.MAP) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
                } else {
                    try {
                        DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                        try {
                            AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                            aVar.a();
                            str = aVar.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), linkedHashMap);
                        } catch (Exception e13) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                            str = "{}";
                        }
                        c2996j22.writeData(dataStoreKey, str);
                    } catch (Exception e14) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e14, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
                    }
                }
                this.f25518b.add(new dc(pushCampaignId, nowInSeconds));
                reentrantLock.unlock();
            } catch (Throwable th2) {
                th = th2;
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final String b(String str) {
        return "Adding push campaign to storage with uid " + str;
    }

    public final void a(List events) {
        Map linkedHashMap;
        Map emptyMap;
        InterfaceC1901b k10;
        String str;
        Intrinsics.checkNotNullParameter(events, "events");
        ReentrantLock reentrantLock = this.f25517a;
        reentrantLock.lock();
        try {
            C2996j c2996j = this.f25519c;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = c2996j.readData(dataStoreKey, "");
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) gc.f25488a, 6, (Object) null);
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
                final dc dcVar = (dc) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.U2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.hc.a(bo.app.dc.this);
                    }
                }, 7, (Object) null);
                String string = dcVar.f25633b.getString("cid");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                map.remove(string);
            }
            C2996j c2996j2 = this.f25519c;
            DataStoreKey dataStoreKey2 = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey2), 12, (Object) null);
            } else {
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
                    c2996j2.writeData(dataStoreKey2, str);
                } catch (Exception e13) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) new DataStoreProvider.r(dataStoreKey2), 8, (Object) null);
                }
            }
            this.f25518b.removeAll(events);
        } finally {
            reentrantLock.unlock();
        }
    }
}
