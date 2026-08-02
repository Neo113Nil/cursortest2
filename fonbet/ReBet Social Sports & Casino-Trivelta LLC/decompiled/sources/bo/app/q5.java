package bo.app;

import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.enums.DeviceKey;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.IEventSubscriber;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4087f;
import di.Z0;
import ei.AbstractC4212b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class q5 {

    /* renamed from: d, reason: collision with root package name */
    public static final p5 f25943d = new p5();

    /* renamed from: a, reason: collision with root package name */
    public final ah f25944a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f25945b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f25946c;

    public q5(ah udm) {
        Intrinsics.checkNotNullParameter(udm, "udm");
        this.f25944a = udm;
        this.f25945b = new ConcurrentHashMap();
        this.f25946c = new ConcurrentHashMap();
        udm.f25267i.c(o5.class, new IEventSubscriber() { // from class: c3.H9
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.q5.a(bo.app.q5.this, (bo.app.o5) obj);
            }
        });
    }

    public static final void a(q5 q5Var, o5 o5Var) {
        Intrinsics.checkNotNullParameter(o5Var, "<destruct>");
        n5 n5Var = o5Var.f25849a;
        List<y8> events = o5Var.f25850b;
        ye yeVar = o5Var.f25851c;
        int ordinal = n5Var.ordinal();
        if (ordinal == 0) {
            q5Var.getClass();
            Intrinsics.checkNotNullParameter(events, "events");
            for (y8 y8Var : events) {
                q5Var.f25946c.putIfAbsent(((k1) y8Var).f25635d, y8Var);
            }
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            q5Var.a(yeVar);
        } else {
            q5Var.getClass();
            Intrinsics.checkNotNullParameter(events, "events");
            for (y8 y8Var2 : events) {
                q5Var.f25945b.putIfAbsent(((k1) y8Var2).f25635d, y8Var2);
            }
        }
    }

    public static final String b() {
        return "Push permissions were granted, setting user push notifications to opt-in";
    }

    public static final String c() {
        return "Push permissions were granted, but blocking automatic opt-in";
    }

    public static final String d() {
        return "Flushing pending events to dispatcher map";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        com.braze.support.BrazeLogger.brazelog$default(r4, (java.lang.Object) r12, com.braze.support.BrazeLogger.Priority.f29471I, (java.lang.Throwable) null, false, new c3.M9(), 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized l1 e() {
        try {
            try {
                Collection values = this.f25945b.values();
                Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = values.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    final y8 y8Var = (y8) next;
                    linkedHashSet.add(y8Var);
                    values.remove(y8Var);
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.L9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.q5.a(bo.app.y8.this);
                        }
                    }, 7, (Object) null);
                    if (linkedHashSet.size() >= 32) {
                        break;
                    }
                }
                return new l1(linkedHashSet);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void a(l4 dataSyncRequest) {
        Iterable arrayList;
        List emptyList;
        String key;
        Intrinsics.checkNotNullParameter(dataSyncRequest, "dataSyncRequest");
        ah ahVar = this.f25944a;
        dataSyncRequest.f25699q = ((c5) ahVar.f25262d).f25317c;
        dataSyncRequest.f25695m = ahVar.f25260b.getSdkFlavor();
        dataSyncRequest.f25700r = ((c5) this.f25944a.f25262d).c();
        ah ahVar2 = this.f25944a;
        g9 g9Var = ahVar2.f25262d;
        z4 deviceCache = ahVar2.f25266h;
        if (deviceCache == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            deviceCache = null;
        }
        c5 c5Var = (c5) g9Var;
        c5Var.getClass();
        Intrinsics.checkNotNullParameter(deviceCache, "deviceCache");
        deviceCache.f26345d = c5Var.b();
        x4 x4Var = (x4) deviceCache.a();
        dataSyncRequest.f25549j = x4Var;
        if (x4Var != null && x4Var.f26246l) {
            if (this.f25944a.f25260b.getShouldOptInWhenPushAuthorized()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.J9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.q5.b();
                    }
                }, 6, (Object) null);
                xg a10 = this.f25944a.a();
                NotificationSubscriptionType notificationSubscriptionType = NotificationSubscriptionType.OPTED_IN;
                synchronized (a10) {
                    if (notificationSubscriptionType != null) {
                        try {
                            key = notificationSubscriptionType.getKey();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        key = null;
                    }
                    a10.c("push_subscribe", key);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.K9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.q5.c();
                    }
                }, 6, (Object) null);
            }
        }
        if (x4Var != null && x4Var.getKey().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey())) {
            this.f25944a.a().j();
        }
        dataSyncRequest.f25696n = (mb) this.f25944a.a().a();
        l1 e10 = e();
        dataSyncRequest.f25697o = e10;
        LinkedHashSet linkedHashSet = e10.f25680a;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (((k1) ((y8) it.next())).f25632a == w7.f26192y) {
                ah ahVar3 = this.f25944a;
                ie ieVar = ahVar3.f25277s;
                EnumSet<BrazeSdkMetadata> newSdkMetadata = ahVar3.f25260b.getSdkMetadata();
                ieVar.getClass();
                Intrinsics.checkNotNullParameter(newSdkMetadata, "newSdkMetadata");
                com.braze.storage.o oVar = ieVar.f25579a;
                DataStoreKey dataStoreKey = DataStoreKey.SDK_METADATA;
                if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
                    arrayList = new ArrayList();
                } else {
                    try {
                        Object readData = oVar.readData(dataStoreKey, "");
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
                                } catch (Exception e11) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreUtils.a(str), 4, (Object) null);
                                    emptyList = CollectionsKt.emptyList();
                                }
                            }
                            arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                        }
                    } catch (Exception e12) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e12, false, (Function0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                        arrayList = new ArrayList();
                    }
                }
                dataSyncRequest.f25698p = Intrinsics.areEqual(com.braze.support.d.a(newSdkMetadata), CollectionsKt.toSet(arrayList)) ? null : newSdkMetadata;
                return;
            }
        }
    }

    public static final String a(y8 y8Var) {
        k1 k1Var = (k1) y8Var;
        return "Event dispatched: " + k1Var.getKey() + " with uid: " + k1Var.f25635d;
    }

    public static final String a() {
        return "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch";
    }

    public final void a(ye yeVar) {
        if (yeVar != null) {
            ConcurrentHashMap concurrentHashMap = this.f25946c;
            if (!concurrentHashMap.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.I9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.q5.d();
                    }
                }, 7, (Object) null);
                Collection values = concurrentHashMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    ((k1) ((y8) it.next())).a(yeVar);
                }
                this.f25945b.putAll(concurrentHashMap);
                Set keySet = concurrentHashMap.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
                Iterator it2 = keySet.iterator();
                while (it2.hasNext()) {
                    this.f25946c.remove((String) it2.next());
                }
            }
        }
    }

    public final d9 a(d9 brazeRequest) {
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        p5 p5Var = f25943d;
        ah ahVar = this.f25944a;
        p5Var.a(ahVar.f25260b, ahVar.f25275q, brazeRequest, ((f5) ahVar.f25261c).a());
        if (brazeRequest instanceof l4) {
            a((l4) brazeRequest);
            return brazeRequest;
        }
        if (brazeRequest instanceof ic) {
            ((ic) brazeRequest).f25549j = ((c5) this.f25944a.f25262d).b();
            return brazeRequest;
        }
        if (brazeRequest instanceof y3) {
            x3 x3Var = this.f25944a.f25283y;
            y3 y3Var = (y3) brazeRequest;
            y3Var.f26314l = x3Var.f26227d;
            y3Var.f26315m = x3Var.f26228e;
        }
        return brazeRequest;
    }
}
