package com.braze.dispatch;

import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.enums.DeviceKey;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.IEventSubscriber;
import com.braze.managers.j1;
import com.braze.managers.n0;
import com.braze.managers.r0;
import com.braze.managers.x;
import com.braze.managers.y;
import com.braze.models.k;
import com.braze.models.outgoing.l;
import com.braze.models.q;
import com.braze.requests.o;
import com.braze.requests.r;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.h0;
import com.braze.storage.i0;
import com.braze.storage.n3;
import com.braze.storage.p;
import com.braze.storage.v0;
import com.braze.storage.w2;
import com.braze.storage.y2;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public final class h {
    public static final g d = new g();

    /* renamed from: a, reason: collision with root package name */
    public final j1 f500a;
    public final ConcurrentHashMap b;
    public final ConcurrentHashMap c;

    public h(j1 udm) {
        Intrinsics.checkNotNullParameter(udm, "udm");
        this.f500a = udm;
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        udm.n.c(com.braze.events.internal.dispatchmanager.c.class, new IEventSubscriber() { // from class: com.braze.dispatch.h$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                h.a(h.this, (com.braze.events.internal.dispatchmanager.c) obj);
            }
        });
    }

    public static final void a(h hVar, com.braze.events.internal.dispatchmanager.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<destruct>");
        com.braze.events.internal.dispatchmanager.b bVar = cVar.f518a;
        List<k> events = cVar.b;
        q qVar = cVar.c;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            hVar.getClass();
            Intrinsics.checkNotNullParameter(events, "events");
            for (k kVar : events) {
                hVar.c.putIfAbsent(((com.braze.models.outgoing.event.b) kVar).d, kVar);
            }
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            hVar.a(qVar);
        } else {
            hVar.getClass();
            Intrinsics.checkNotNullParameter(events, "events");
            for (k kVar2 : events) {
                hVar.b.putIfAbsent(((com.braze.models.outgoing.event.b) kVar2).d, kVar2);
            }
        }
    }

    public static final String b() {
        return "Push permissions were granted, but blocking automatic opt-in";
    }

    public static final String c() {
        return "Push permissions were granted, setting user push notifications to opt-in";
    }

    public static final String d() {
        return "Flushing pending events to dispatcher map";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        com.braze.support.BrazeLogger.brazelog$default(r4, (java.lang.Object) r12, com.braze.support.BrazeLogger.Priority.I, (java.lang.Throwable) null, false, new com.braze.dispatch.h$$ExternalSyntheticLambda5(), 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized com.braze.models.b e() {
        try {
            try {
                Collection values = this.b.values();
                Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = values.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    final k kVar = (k) next;
                    linkedHashSet.add(kVar);
                    values.remove(kVar);
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.h$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return h.a(k.this);
                        }
                    }, 7, (Object) null);
                    if (linkedHashSet.size() >= 32) {
                        break;
                    }
                }
                return new com.braze.models.b(linkedHashSet);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final r0 f() {
        return this.f500a;
    }

    public final void a(com.braze.requests.g dataSyncRequest) {
        Iterable arrayList;
        List emptyList;
        Intrinsics.checkNotNullParameter(dataSyncRequest, "dataSyncRequest");
        j1 j1Var = this.f500a;
        dataSyncRequest.p = ((x) j1Var.e).c;
        dataSyncRequest.l = j1Var.b.getSdkFlavor();
        dataSyncRequest.q = ((x) this.f500a.e).c();
        j1 j1Var2 = this.f500a;
        n0 n0Var = j1Var2.e;
        v0 deviceCache = j1Var2.m;
        if (deviceCache == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            deviceCache = null;
        }
        x xVar = (x) n0Var;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(deviceCache, "deviceCache");
        deviceCache.e = xVar.b();
        com.braze.models.outgoing.h hVar = (com.braze.models.outgoing.h) deviceCache.a();
        dataSyncRequest.i = hVar;
        if (hVar != null && hVar.l) {
            if (this.f500a.b.getShouldOptInWhenPushAuthorized()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.h$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.c();
                    }
                }, 6, (Object) null);
                n3 d2 = this.f500a.d();
                NotificationSubscriptionType notificationSubscriptionType = NotificationSubscriptionType.OPTED_IN;
                synchronized (d2) {
                    d2.c("push_subscribe", notificationSubscriptionType != null ? notificationSubscriptionType.getJsonKey() : null);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.h$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.b();
                    }
                }, 6, (Object) null);
            }
        }
        if (hVar != null && hVar.getJsonKey().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey())) {
            this.f500a.d().j();
        }
        dataSyncRequest.m = (l) this.f500a.d().a();
        com.braze.models.b e = e();
        dataSyncRequest.n = e;
        LinkedHashSet linkedHashSet = e.f619a;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (((com.braze.models.outgoing.event.b) ((k) it.next())).f640a == com.braze.enums.d.y) {
                j1 j1Var3 = this.f500a;
                w2 w2Var = j1Var3.x;
                EnumSet<BrazeSdkMetadata> newSdkMetadata = j1Var3.b.getSdkMetadata();
                w2Var.getClass();
                Intrinsics.checkNotNullParameter(newSdkMetadata, "newSdkMetadata");
                y2 y2Var = w2Var.f765a;
                DataStoreKey dataStoreKey = DataStoreKey.SDK_METADATA;
                if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(dataStoreKey), 12, (Object) null);
                    arrayList = new ArrayList();
                } else {
                    try {
                        Object readData = y2Var.readData(dataStoreKey, "");
                        Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) readData;
                        if (StringsKt.isBlank(str)) {
                            arrayList = new ArrayList();
                        } else {
                            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                            if (StringsKt.isBlank(str)) {
                                emptyList = CollectionsKt.emptyList();
                            } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), AbstractJsonLexerKt.NULL)) {
                                emptyList = CollectionsKt.emptyList();
                            } else {
                                try {
                                    Json.Companion companion = Json.INSTANCE;
                                    companion.getSerializersModule();
                                    emptyList = (List) companion.decodeFromString(new ArrayListSerializer(StringSerializer.INSTANCE), str);
                                } catch (Exception e2) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
                                    emptyList = CollectionsKt.emptyList();
                                }
                            }
                            arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                        }
                    } catch (Exception e3) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new i0(dataStoreKey), 8, (Object) null);
                        arrayList = new ArrayList();
                    }
                }
                dataSyncRequest.o = Intrinsics.areEqual(com.braze.support.k.a(newSdkMetadata), CollectionsKt.toSet(arrayList)) ? null : newSdkMetadata;
                return;
            }
        }
    }

    public static final String a(k kVar) {
        com.braze.models.outgoing.event.b bVar = (com.braze.models.outgoing.event.b) kVar;
        return "Event dispatched: " + bVar.getJsonKey() + " with uid: " + bVar.e();
    }

    public static final String a() {
        return "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch";
    }

    public final void a(q qVar) {
        if (qVar != null) {
            ConcurrentHashMap concurrentHashMap = this.c;
            if (!concurrentHashMap.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.h$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.d();
                    }
                }, 7, (Object) null);
                Collection values = concurrentHashMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    ((com.braze.models.outgoing.event.b) ((k) it.next())).a(qVar);
                }
                this.b.putAll(concurrentHashMap);
                Set keySet = concurrentHashMap.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
                Iterator it2 = keySet.iterator();
                while (it2.hasNext()) {
                    this.c.remove((String) it2.next());
                }
            }
        }
    }

    public final o a(o brazeRequest) {
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        g gVar = d;
        j1 j1Var = this.f500a;
        gVar.a(j1Var.b, j1Var.v, brazeRequest, ((y) j1Var.c).a());
        if (brazeRequest instanceof com.braze.requests.g) {
            a((com.braze.requests.g) brazeRequest);
            return brazeRequest;
        }
        if (brazeRequest instanceof r) {
            ((r) brazeRequest).i = ((x) this.f500a.e).b();
            return brazeRequest;
        }
        if (brazeRequest instanceof com.braze.requests.f) {
            p pVar = this.f500a.D;
            com.braze.requests.f fVar = (com.braze.requests.f) brazeRequest;
            fVar.k = pVar.d;
            fVar.l = pVar.e;
        }
        return brazeRequest;
    }
}
