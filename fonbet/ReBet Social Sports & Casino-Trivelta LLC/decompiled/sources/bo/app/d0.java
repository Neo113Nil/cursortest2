package bo.app;

import Ph.C0;
import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.BannerDismissedEvent;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.managers.banners.IBannerView;
import com.braze.models.Banner;
import com.braze.storage.C2987a;
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
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: l, reason: collision with root package name */
    public static C0 f25370l;

    /* renamed from: a, reason: collision with root package name */
    public final String f25375a;

    /* renamed from: b, reason: collision with root package name */
    public final m9 f25376b;

    /* renamed from: c, reason: collision with root package name */
    public final ue f25377c;

    /* renamed from: d, reason: collision with root package name */
    public final e2 f25378d;

    /* renamed from: e, reason: collision with root package name */
    public final C2987a f25379e;

    /* renamed from: f, reason: collision with root package name */
    public List f25380f;

    /* renamed from: g, reason: collision with root package name */
    public final n f25381g;

    /* renamed from: h, reason: collision with root package name */
    public final q f25382h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f25383i;

    /* renamed from: j, reason: collision with root package name */
    public static final a0 f25368j = new a0();

    /* renamed from: k, reason: collision with root package name */
    public static final LinkedHashMap f25369k = new LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final ReentrantLock f25371m = new ReentrantLock();

    /* renamed from: n, reason: collision with root package name */
    public static final ArrayList f25372n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public static final ReentrantLock f25373o = new ReentrantLock();

    /* renamed from: p, reason: collision with root package name */
    public static final ArrayList f25374p = new ArrayList();

    public d0(Context context, String apiKey, String str, r7 internalEventPublisher, m9 externalEventPublisher, ue serverConfigStorageProvider, e2 brazeManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f25375a = str;
        this.f25376b = externalEventPublisher;
        this.f25377c = serverConfigStorageProvider;
        this.f25378d = brazeManager;
        C2987a c2987a = new C2987a(context, str, apiKey);
        this.f25379e = c2987a;
        this.f25380f = CollectionsKt.emptyList();
        this.f25381g = new n(c2987a, serverConfigStorageProvider);
        this.f25382h = new q(c2987a);
        this.f25383i = new AtomicInteger(0);
        e();
        internalEventPublisher.c(zc.class, new IEventSubscriber() { // from class: c3.Y
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.d0.a(bo.app.d0.this, (bo.app.zc) obj);
            }
        });
        internalEventPublisher.c(g0.class, new IEventSubscriber() { // from class: c3.j0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.d0.a(bo.app.d0.this, (bo.app.g0) obj);
            }
        });
        internalEventPublisher.c(f0.class, new IEventSubscriber() { // from class: c3.u0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.d0.a(bo.app.d0.this, (bo.app.f0) obj);
            }
        });
        internalEventPublisher.d(BrazeUserChangeEvent.class, new IEventSubscriber() { // from class: c3.z0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.d0.a(bo.app.d0.this, (BrazeUserChangeEvent) obj);
            }
        });
        internalEventPublisher.c(o3.class, new IEventSubscriber() { // from class: c3.A0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.d0.a(bo.app.d0.this, (bo.app.o3) obj);
            }
        });
    }

    public static final void a(d0 d0Var, o3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.f25844a.f25998G || it.f25845b.f25998G) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.d0.d();
            }
        }, 7, (Object) null);
        d0Var.getClass();
        d0Var.f25380f = CollectionsKt.emptyList();
        d0Var.f25379e.clearData(DataStoreKey.BANNERS);
        d0Var.l();
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

    public static final String k() {
        return "Resetting BannersManager for new session.";
    }

    public static final String m() {
        return "View is not an IBannerView. Cannot update banner data.";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    public final boolean f(final String id2) {
        Map linkedHashMap;
        Map emptyMap;
        InterfaceC1901b k10;
        Map linkedHashMap2;
        Map emptyMap2;
        InterfaceC1901b k11;
        String str;
        Banner banner;
        Intrinsics.checkNotNullParameter(id2, "id");
        Banner banner2 = (Banner) f25369k.get(id2);
        if (banner2 == null) {
            Iterator it = this.f25380f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    banner = 0;
                    break;
                }
                banner = it.next();
                if (Intrinsics.areEqual(id2, ((Banner) banner).getPlacementId())) {
                    break;
                }
            }
            banner2 = banner;
        }
        final Banner banner3 = banner2;
        if (banner3 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.E0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.d0.g(id2);
                }
            }, 6, (Object) null);
            return false;
        }
        String id3 = banner3.getTrackingId();
        Intrinsics.checkNotNullParameter(id3, "id");
        C2987a c2987a = this.f25379e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS_IMPRESSION_MAP;
        DataStoreValueType type = dataStoreKey.getType();
        DataStoreValueType dataStoreValueType = DataStoreValueType.MAP;
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Boolean.TYPE;
        Class cls5 = Long.TYPE;
        if (type != dataStoreValueType) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = c2987a.readData(dataStoreKey, "");
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
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) c0.f25306a, 6, (Object) null);
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
        if (Intrinsics.areEqual(linkedHashMap.get(id3), Boolean.TRUE)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.Z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.d0.d(Banner.this);
                }
            }, 6, (Object) null);
            return true;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.F0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.d0.h(id2);
            }
        }, 7, (Object) null);
        y8 c10 = k1.f25630g.c(banner3.getTrackingId());
        if (c10 != null) {
            this.f25378d.a(c10);
        }
        Intrinsics.checkNotNullParameter(id3, "id");
        C2987a c2987a2 = this.f25379e;
        DataStoreKey dataStoreKey2 = DataStoreKey.BANNERS_IMPRESSION_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
            linkedHashMap2 = new LinkedHashMap();
        } else {
            try {
                Object readData2 = c2987a2.readData(dataStoreKey2, "");
                Intrinsics.checkNotNull(readData2, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) readData2;
                if (StringsKt.isBlank(str3)) {
                    linkedHashMap2 = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str3)) {
                        emptyMap2 = MapsKt.emptyMap();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str3).toString(), "null")) {
                        emptyMap2 = MapsKt.emptyMap();
                    } else {
                        try {
                            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Boolean.class);
                            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                k11 = AbstractC2028a.k(AbstractC2028a.H(stringCompanionObject2), AbstractC2028a.H(stringCompanionObject2));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls5))) {
                                k11 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.F(LongCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls4))) {
                                k11 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.z(BooleanCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls3))) {
                                k11 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.E(IntCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls2))) {
                                k11 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.C(DoubleCompanionObject.INSTANCE));
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls))) {
                                k11 = AbstractC2028a.k(AbstractC2028a.H(StringCompanionObject.INSTANCE), AbstractC2028a.D(FloatCompanionObject.INSTANCE));
                            } else {
                                BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils2, BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) b0.f25286a, 6, (Object) null);
                                emptyMap2 = MapsKt.emptyMap();
                            }
                            Object d11 = AbstractC4212b.f46079d.d(k11, str3);
                            Intrinsics.checkNotNull(d11, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                            emptyMap2 = (Map) d11;
                        } catch (Exception e12) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f29470E, (Throwable) e12, false, (Function0) new DataStoreUtils.b(str3), 4, (Object) null);
                            emptyMap2 = MapsKt.emptyMap();
                        }
                    }
                    Map mutableMap2 = MapsKt.toMutableMap(emptyMap2);
                    Intrinsics.checkNotNull(mutableMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                    linkedHashMap2 = TypeIntrinsics.asMutableMap(mutableMap2);
                }
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e13, false, (Function0) new DataStoreProvider.m(dataStoreKey2), 8, (Object) null);
                linkedHashMap2 = new LinkedHashMap();
            }
        }
        linkedHashMap2.put(id3, Boolean.TRUE);
        C2987a c2987a3 = this.f25379e;
        DataStoreKey dataStoreKey3 = DataStoreKey.BANNERS_IMPRESSION_MAP;
        if (dataStoreKey3.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey3), 12, (Object) null);
            return true;
        }
        try {
            DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4084d0(Z0.f45341a, C4093i.f45370a), linkedHashMap2);
            } catch (Exception e14) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.f29470E, (Throwable) e14, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = "{}";
            }
            c2987a3.writeData(dataStoreKey3, str);
            return true;
        } catch (Exception e15) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e15, false, (Function0) new DataStoreProvider.r(dataStoreKey3), 8, (Object) null);
            return true;
        }
    }

    public final void i() {
        List list = this.f25380f;
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Banner) it.next()).deepcopy$android_sdk_base_release());
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.D0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.d0.c(arrayList);
            }
        }, 6, (Object) null);
        ((r7) this.f25376b).b(new BannersUpdatedEvent(arrayList), BannersUpdatedEvent.class);
    }

    public final void j() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.d0.k();
            }
        }, 6, (Object) null);
        this.f25379e.clearData(DataStoreKey.BANNERS_IMPRESSION_MAP);
        a0.b();
    }

    public final void l() {
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock = f25371m;
        reentrantLock.lock();
        try {
            List<x> list = CollectionsKt.toList(f25372n);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            for (final x xVar : list) {
                try {
                    KeyEvent.Callback callback = (View) xVar.f26212b.get();
                    if (callback == null) {
                        arrayList.add(xVar);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.r0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return bo.app.d0.a(bo.app.x.this);
                            }
                        }, 7, (Object) null);
                    } else if (callback instanceof IBannerView) {
                        ((IBannerView) callback).initBanner(xVar.f26211a);
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.s0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return bo.app.d0.m();
                            }
                        }, 6, (Object) null);
                        arrayList.add(xVar);
                    }
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.t0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.d0.b(bo.app.x.this);
                        }
                    }, 4, (Object) null);
                    arrayList.add(xVar);
                }
            }
            f25371m.lock();
            try {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    f25372n.remove((x) obj);
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void n() {
        final long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.d0.a(nowInSeconds);
            }
        }, 6, (Object) null);
        this.f25379e.writeData(DataStoreKey.LAST_REFRESH_IN_SECONDS, Long.valueOf(nowInSeconds));
    }

    public static final String b() {
        return "Cached Banners placement IDs are empty. Not refreshing Banners on forced internal call.";
    }

    public static final String c(Banner banner) {
        return "Found test banner, but it is expired. Attempting to find non-test banner. " + banner;
    }

    public static final String e(Banner banner) {
        return "Error converting Banner to JSON: " + banner;
    }

    public static final String g() {
        return "Received blank serialized Banner string from DataStore. Not parsing.";
    }

    public final boolean d(final List ids) {
        String str;
        Object obj;
        Intrinsics.checkNotNullParameter(ids, "ids");
        if (this.f25383i.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.B0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.d0.a(bo.app.d0.this);
                }
            }, 7, (Object) null);
            return false;
        }
        if (ids.size() > this.f25377c.q()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.C0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.d0.a(bo.app.d0.this, ids);
                }
            }, 7, (Object) null);
        }
        this.f25383i.incrementAndGet();
        List<String> ids2 = CollectionsKt.take(ids, this.f25377c.q());
        Intrinsics.checkNotNullParameter(ids2, "ids");
        ArrayList arrayList = new ArrayList();
        for (String str2 : ids2) {
            Iterator it = this.f25380f.iterator();
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
        this.f25378d.a(arrayList, this.f25379e.b());
        return true;
    }

    public final void h() {
        String str;
        String str2;
        List<Banner> list = this.f25380f;
        final ArrayList arrayList = new ArrayList();
        for (final Banner banner : list) {
            try {
                str2 = banner.getKey().toString();
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.p0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.d0.e(Banner.this);
                    }
                }, 4, (Object) null);
                str2 = null;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        C2987a c2987a = this.f25379e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                    aVar.a();
                    str = aVar.b(new C4087f(Z0.f45341a), arrayList);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                    str = arrayList instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                }
                c2987a.writeData(dataStoreKey, str);
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e12, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.d0.b(arrayList);
            }
        }, 7, (Object) null);
    }

    public static final String b(String str) {
        return "Returning test Banner with placement id " + str + ".";
    }

    public static final String c(String str) {
        return "Banner with placement id " + str + " not found in cache. Returning null for this Banner.";
    }

    public final void e() {
        List<String> arrayList;
        List emptyList;
        C2987a c2987a = this.f25379e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = c2987a.readData(dataStoreKey, "");
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
                            emptyList = (List) aVar.d(new C4087f(Z0.f45341a), str);
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.k0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.d0.f();
                }
            }, 7, (Object) null);
            this.f25380f = CollectionsKt.emptyList();
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        for (final String str2 : arrayList) {
            try {
                if (StringsKt.isBlank(str2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.d0.g();
                        }
                    }, 6, (Object) null);
                } else {
                    Banner a10 = Banner.Companion.a(new JSONObject(str2));
                    if (a10 != null) {
                        arrayList2.add(a10);
                    }
                }
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e12, false, new Function0() { // from class: c3.m0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.d0.d(str2);
                    }
                }, 4, (Object) null);
            }
        }
        this.f25380f = arrayList2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.d0.a(arrayList2);
            }
        }, 7, (Object) null);
    }

    public static final String b(String str, String str2) {
        return "Logging click for Banner with placement id " + str + " with buttonID of " + str2 + ".";
    }

    public static final String c(List list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Banner) it.next()).getPlacementId());
        }
        return "Publishing BannersUpdatedEvent to subscribers: count=" + size + ", placementIds=" + arrayList;
    }

    public static final String b(Banner banner) {
        return "Banner dismiss: started. placementId=" + banner.getPlacementId() + " trackingId=" + banner.getTrackingId();
    }

    public static final String b(List list) {
        return "Added " + list.size() + " new Banners to DataStore.";
    }

    public static final String b(x xVar) {
        return "Error checking banner visibility for " + xVar.f26211a + ".Removing banner from visibility monitoring.";
    }

    public static final void a(d0 d0Var, zc it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f26356a instanceof h0) {
            d0Var.f25383i.decrementAndGet();
        }
    }

    public static final void a(d0 d0Var, g0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        d0Var.n();
    }

    public static final void a(d0 d0Var, f0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((r7) d0Var.f25376b).b(it, f0.class);
    }

    public static final void a(d0 d0Var, final BrazeUserChangeEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) d0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.d0.a(BrazeUserChangeEvent.this);
            }
        }, 7, (Object) null);
        d0Var.l();
        BrazeLogger.brazelog$default(brazeLogger, (Object) d0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.d0.b(BrazeUserChangeEvent.this);
            }
        }, 7, (Object) null);
    }

    public static final String d(Banner banner) {
        return "Not logging a Banner impression for Banner " + banner + ". The Banner already had an impression logged in the current session";
    }

    public static final String a(BrazeUserChangeEvent brazeUserChangeEvent) {
        return "Updating banners because of user change to " + brazeUserChangeEvent.getCurrentUserId() + ".";
    }

    public static final String d(String str) {
        return "Encountered unexpected exception while parsing stored banner: " + str;
    }

    public final void a() {
        ReentrantLock reentrantLock = f25373o;
        reentrantLock.lock();
        try {
            List mutableList = CollectionsKt.toMutableList((Collection) f25374p);
            reentrantLock.unlock();
            if (mutableList.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.w0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.d0.b();
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.x0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.d0.c();
                    }
                }, 7, (Object) null);
                d(mutableList);
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String a(d0 d0Var) {
        return "Not refreshing Banners since another " + d0Var.f25383i.get() + " request is currently in-flight.";
    }

    public static final String a(d0 d0Var, List list) {
        return "The number of Banner placements requested exceeds the maximum allowed by the server. The server allows a maximum of " + d0Var.f25377c.q() + " placements, but " + list.size() + " were requested. Truncating request to fit.\nPlacements that will be requested: " + CollectionsKt.take(list, d0Var.f25377c.q()) + "\nTruncated placements not requested: " + list.subList(d0Var.f25377c.q(), list.size());
    }

    public final Banner a(final String id2) {
        Object obj;
        Intrinsics.checkNotNullParameter(id2, "id");
        final Banner banner = (Banner) f25369k.get(id2);
        if (banner != null) {
            if (banner.isExpired()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.d0.c(Banner.this);
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.d0.b(id2);
                    }
                }, 6, (Object) null);
                banner.setUserId(this.f25375a);
                return banner;
            }
        }
        Iterator it = this.f25380f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Banner) obj).getPlacementId(), id2)) {
                break;
            }
        }
        final Banner banner2 = (Banner) obj;
        if (banner2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.d0.c(id2);
                }
            }, 6, (Object) null);
            return null;
        }
        if (banner2.isExpired()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.d0.a(id2, banner2);
                }
            }, 6, (Object) null);
            return null;
        }
        banner2.setUserId(this.f25375a);
        return banner2;
    }

    public static final String a(String str, Banner banner) {
        return "Banner with placement id " + str + " has expired. Returning null for this Banner " + banner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    public final void a(final String id2, final String str) {
        Banner banner;
        Intrinsics.checkNotNullParameter(id2, "id");
        Banner banner2 = (Banner) f25369k.get(id2);
        if (banner2 == null) {
            Iterator it = this.f25380f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    banner = 0;
                    break;
                } else {
                    banner = it.next();
                    if (Intrinsics.areEqual(id2, ((Banner) banner).getPlacementId())) {
                        break;
                    }
                }
            }
            banner2 = banner;
        }
        if (banner2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.d0.e(id2);
                }
            }, 6, (Object) null);
            return;
        }
        String trackingId = banner2.getTrackingId();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.d0.b(id2, str);
            }
        }, 7, (Object) null);
        y8 c10 = k1.f25630g.c(trackingId, str);
        if (c10 != null) {
            this.f25378d.a(c10);
        }
    }

    public final void a(final Banner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.d0.b(Banner.this);
            }
        }, 6, (Object) null);
        this.f25381g.a(banner, this.f25378d);
        f25369k.remove(banner.getPlacementId());
        List list = this.f25380f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(((Banner) obj).getPlacementId(), banner.getPlacementId())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != this.f25380f.size()) {
            this.f25380f = arrayList;
            h();
        }
        a0.b(banner.getPlacementId());
        ((r7) this.f25376b).b(new BannerDismissedEvent(banner.getPlacementId()), BannerDismissedEvent.class);
        i();
    }

    public static final String a(long j10) {
        return "Updating last Banners refresh time: " + j10;
    }

    public static final String a(List list) {
        return "Loaded " + list.size() + " banners from DataStore.";
    }

    public static final String a(x xVar) {
        return "Banner " + xVar.f26211a + " removed because view is null";
    }

    public static final String f() {
        return "Did not find stored Banners in DataStore.";
    }
}
