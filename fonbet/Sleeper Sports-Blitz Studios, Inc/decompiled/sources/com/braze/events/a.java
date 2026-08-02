package com.braze.events;

import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.internal.a0;
import com.braze.events.internal.e0;
import com.braze.events.internal.f0;
import com.braze.events.internal.g;
import com.braze.events.internal.g0;
import com.braze.events.internal.i;
import com.braze.events.internal.l;
import com.braze.events.internal.m;
import com.braze.events.internal.n;
import com.braze.events.internal.u;
import com.braze.events.internal.w;
import com.braze.events.internal.y;
import com.braze.events.internal.z;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.managers.h0;
import com.braze.managers.j;
import com.braze.managers.k0;
import com.braze.managers.p;
import com.braze.managers.r;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.k;
import com.braze.requests.o;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.b3;
import com.braze.storage.n3;
import com.braze.storage.o0;
import com.braze.storage.p0;
import com.braze.storage.v0;
import com.braze.storage.w2;
import com.braze.storage.y2;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.triggers.managers.f;
import com.braze.triggers.managers.h;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;

/* loaded from: classes6.dex */
public final class a {
    public final AtomicBoolean A;
    public final AtomicBoolean B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f507a;
    public final p b;
    public final e c;
    public final r d;
    public final n3 e;
    public final v0 f;
    public final f g;
    public final h h;
    public final h0 i;
    public final BrazeGeofenceManager j;
    public final e k;
    public final BrazeConfigurationProvider l;
    public final com.braze.storage.p m;
    public final w2 n;
    public final b3 o;
    public final k0 p;
    public final com.braze.managers.v0 q;
    public final j r;
    public final AtomicBoolean s;
    public final AtomicBoolean t;
    public e0 u;
    public final AtomicBoolean v;
    public final AtomicBoolean w;
    public final AtomicBoolean x;
    public final AtomicBoolean y;
    public final AtomicBoolean z;

    public a(Context applicationContext, p locationManager, e internalEventPublisher, r brazeManager, n3 userCache, v0 deviceCache, f triggerManager, h triggerReEligibilityManager, h0 eventStorageManager, BrazeGeofenceManager geofenceManager, e externalEventPublisher, BrazeConfigurationProvider configurationProvider, com.braze.storage.p contentCardsStorageProvider, w2 sdkMetadataCache, b3 serverConfigStorageProvider, k0 featureFlagsManager, com.braze.managers.v0 pushDeliveryManager, j bannersManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(userCache, "userCache");
        Intrinsics.checkNotNullParameter(deviceCache, "deviceCache");
        Intrinsics.checkNotNullParameter(triggerManager, "triggerManager");
        Intrinsics.checkNotNullParameter(triggerReEligibilityManager, "triggerReEligibilityManager");
        Intrinsics.checkNotNullParameter(eventStorageManager, "eventStorageManager");
        Intrinsics.checkNotNullParameter(geofenceManager, "geofenceManager");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(contentCardsStorageProvider, "contentCardsStorageProvider");
        Intrinsics.checkNotNullParameter(sdkMetadataCache, "sdkMetadataCache");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(featureFlagsManager, "featureFlagsManager");
        Intrinsics.checkNotNullParameter(pushDeliveryManager, "pushDeliveryManager");
        Intrinsics.checkNotNullParameter(bannersManager, "bannersManager");
        this.f507a = applicationContext;
        this.b = locationManager;
        this.c = internalEventPublisher;
        this.d = brazeManager;
        this.e = userCache;
        this.f = deviceCache;
        this.g = triggerManager;
        this.h = triggerReEligibilityManager;
        this.i = eventStorageManager;
        this.j = geofenceManager;
        this.k = externalEventPublisher;
        this.l = configurationProvider;
        this.m = contentCardsStorageProvider;
        this.n = sdkMetadataCache;
        this.o = serverConfigStorageProvider;
        this.p = featureFlagsManager;
        this.q = pushDeliveryManager;
        this.r = bannersManager;
        this.s = new AtomicBoolean(false);
        this.t = new AtomicBoolean(false);
        this.v = new AtomicBoolean(false);
        this.w = new AtomicBoolean(false);
        this.x = new AtomicBoolean(false);
        this.y = new AtomicBoolean(false);
        this.z = new AtomicBoolean(false);
        this.A = new AtomicBoolean(false);
        this.B = new AtomicBoolean(false);
    }

    public static final String J() {
        return "Requesting Banners refresh on session created event due to configuration.";
    }

    public static final String K() {
        return "Banners already initialized. Not retrieving.";
    }

    public static final String M() {
        return "Requesting Content Card refresh on session created event due to configuration.";
    }

    public static final String N() {
        return "Content Cards already initialized. Not retrieving.";
    }

    public static final String P() {
        return "Starting DUST subscription due to configuration.";
    }

    public static final String Q() {
        return "DUST initial subscription already started. Not starting again.";
    }

    public static final String S() {
        return "Requesting Feature Flags refresh on session created event due to configuration.";
    }

    public static final String T() {
        return "Feature Flags already initialized. Not retrieving.";
    }

    public static final String V() {
        return "Requesting Push Max request on session created event due to configuration.";
    }

    public static final String W() {
        return "Push Max already requested for this session. Not requesting again.";
    }

    public static final String Y() {
        return "Doing Debugger Handshake.";
    }

    public static final String Z() {
        return "Debugger Initialization already attempted. Not doing Debugger initialization again.";
    }

    public static final void a(a aVar, com.braze.events.internal.a aVar2) {
        Intrinsics.checkNotNullParameter(aVar2, "<destruct>");
        ((d) aVar.k).b(aVar.r.a(aVar2.f510a), BannersUpdatedEvent.class);
    }

    public static final String b() {
        return "Failed to request a content card refresh.";
    }

    public static final String b0() {
        return "Performing push delivery event flush";
    }

    public static final String c() {
        return "Requesting Braze Geofence refresh on session created event due to configuration.";
    }

    public static final String d() {
        return "Not automatically requesting Braze Geofence refresh on session created event due to configuration.";
    }

    public static final String d0() {
        return "Requesting trigger refresh in next sync";
    }

    public static final String e() {
        return "Session created event for new session received.";
    }

    public static final String f() {
        return "Session start event for new session received.";
    }

    public static final String g() {
        return "Not automatically requesting Content Card refresh on session created event due to server configuration.";
    }

    public static final String h() {
        return "Not automatically requesting Feature Flags refresh on session created event due to server configuration.";
    }

    public static final String i() {
        return "Not automatically requesting Push Max on session created event due to server configuration.";
    }

    public static final String j() {
        return "Not automatically starting DUST subscription on session created event due to server configuration.";
    }

    public static final String k() {
        return "Not automatically requesting Banners refresh on session created event due to server configuration.";
    }

    public static final String l() {
        return "Not automatically starting SDK Debugger on session created event due to server configuration.";
    }

    public static final String m() {
        return "Failed to log the storage exception.";
    }

    public static final String n() {
        return "Requesting trigger update due to trigger-eligible push click event";
    }

    public static final String u() {
        return "Failed to log error.";
    }

    public final IEventSubscriber A() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda41
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (y) obj);
            }
        };
    }

    public final IEventSubscriber B() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda6
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (z) obj);
            }
        };
    }

    public final IEventSubscriber C() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda27
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (a0) obj);
            }
        };
    }

    public final IEventSubscriber D() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda46
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (com.braze.exceptions.b) obj);
            }
        };
    }

    public final IEventSubscriber E() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda40
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (e0) obj);
            }
        };
    }

    public final IEventSubscriber F() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda31
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (f0) obj);
            }
        };
    }

    public final IEventSubscriber G() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda9
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (g0) obj);
            }
        };
    }

    public final IEventSubscriber H() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (com.braze.events.internal.h0) obj);
            }
        };
    }

    public final void I() {
        if (!this.A.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.K();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.J();
                }
            }, 7, (Object) null);
            this.r.a();
        }
    }

    public final void L() {
        if (!this.w.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.N();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.M();
            }
        }, 7, (Object) null);
        r rVar = this.d;
        com.braze.storage.p pVar = this.m;
        rVar.a(pVar.d, pVar.e, 0, com.braze.requests.c.b);
    }

    public final void O() {
        if (!this.z.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.Q();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.P();
                }
            }, 7, (Object) null);
            this.d.t();
        }
    }

    public final void R() {
        if (!this.x.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.T();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.S();
                }
            }, 7, (Object) null);
            this.p.d.q();
        }
    }

    public final void U() {
        if (!this.y.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda48
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.W();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.V();
                }
            }, 7, (Object) null);
            this.d.w();
        }
    }

    public final void X() {
        if (!this.B.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.Z();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.Y();
            }
        }, 7, (Object) null);
        ((d) this.c).b(new u(), u.class);
    }

    public final void a0() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b0();
            }
        }, 7, (Object) null);
        this.d.a(0L);
    }

    public final void c0() {
        a aVar;
        com.braze.models.outgoing.j jVar = new com.braze.models.outgoing.j();
        if (this.d.t.get()) {
            this.s.set(true);
            aVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.d0();
                }
            }, 7, (Object) null);
            jVar.b = Boolean.TRUE;
            aVar.d.a(false);
        } else {
            aVar = this;
        }
        if (Intrinsics.areEqual(jVar.b, Boolean.TRUE)) {
            aVar.d.a(jVar);
        }
    }

    public final IEventSubscriber o() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda11
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (com.braze.events.internal.a) obj);
            }
        };
    }

    public final IEventSubscriber p() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (com.braze.events.internal.d) obj);
            }
        };
    }

    public final IEventSubscriber q() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda5
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (com.braze.events.internal.e) obj);
            }
        };
    }

    public final IEventSubscriber r() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda49
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (com.braze.events.internal.f) obj);
            }
        };
    }

    public final IEventSubscriber s() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda15
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (g) obj);
            }
        };
    }

    public final IEventSubscriber t() {
        final Semaphore semaphore = null;
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda17
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, semaphore, (Throwable) obj);
            }
        };
    }

    public final IEventSubscriber v() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda14
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (i) obj);
            }
        };
    }

    public final IEventSubscriber w() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda32
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (l) obj);
            }
        };
    }

    public final IEventSubscriber x() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda42
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (m) obj);
            }
        };
    }

    public final IEventSubscriber y() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda30
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (n) obj);
            }
        };
    }

    public final IEventSubscriber z() {
        return new IEventSubscriber() { // from class: com.braze.events.a$$ExternalSyntheticLambda43
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                a.a(a.this, (w) obj);
            }
        };
    }

    public static final void a(a aVar, com.braze.events.internal.f fVar) {
        e0 e0Var;
        Intrinsics.checkNotNullParameter(fVar, "<destruct>");
        o oVar = fVar.f520a;
        com.braze.models.outgoing.h hVar = ((com.braze.requests.b) oVar).i;
        if (hVar != null) {
            aVar.f.a((Object) hVar, false);
        }
        if (oVar instanceof com.braze.requests.g) {
            com.braze.requests.g gVar = (com.braze.requests.g) oVar;
            if (gVar.k.c()) {
                if (aVar.s.compareAndSet(true, false)) {
                    aVar.g.a((com.braze.triggers.events.i) new com.braze.triggers.events.e());
                }
                if (aVar.t.compareAndSet(true, false) && (e0Var = aVar.u) != null) {
                    aVar.g.a((com.braze.triggers.events.i) new com.braze.triggers.events.g(e0Var.f519a, e0Var.b));
                    aVar.u = null;
                }
                aVar.d.a(true);
            }
            com.braze.models.outgoing.l lVar = gVar.m;
            if (lVar != null) {
                aVar.e.a((Object) lVar, false);
                if (lVar.f646a.has(DataStoreKey.PUSH_TOKEN.getKey())) {
                    aVar.e.j();
                    aVar.f.e();
                }
            }
            com.braze.models.b bVar = gVar.n;
            if (bVar != null) {
                for (k kVar : bVar.f619a) {
                    e eVar = aVar.c;
                    List events = CollectionsKt.listOf(kVar);
                    Intrinsics.checkNotNullParameter(events, "events");
                    ((d) eVar).b(new com.braze.events.internal.dispatchmanager.c(com.braze.events.internal.dispatchmanager.b.b, events, null, null, 12), com.braze.events.internal.dispatchmanager.c.class);
                }
            }
            if (gVar.k.c != null) {
                aVar.o.N();
            }
        }
        if (oVar instanceof com.braze.requests.r) {
            aVar.q.b(((com.braze.requests.r) oVar).k);
        }
    }

    public static final void a(a aVar, g gVar) {
        String str;
        Intrinsics.checkNotNullParameter(gVar, "<destruct>");
        o oVar = gVar.f522a;
        com.braze.models.outgoing.h hVar = ((com.braze.requests.b) oVar).i;
        if (hVar != null) {
            aVar.f.a((Object) hVar, true);
        }
        if (oVar instanceof com.braze.requests.g) {
            com.braze.requests.g gVar2 = (com.braze.requests.g) oVar;
            com.braze.models.outgoing.l lVar = gVar2.m;
            if (lVar != null) {
                aVar.e.a((Object) lVar, true);
            }
            com.braze.models.b bVar = gVar2.n;
            if (bVar != null) {
                aVar.i.a(bVar.f619a);
            }
            if (gVar2.k.c()) {
                aVar.d.a(false);
            }
            EnumSet sdkMetadata = gVar2.o;
            if (sdkMetadata != null) {
                w2 w2Var = aVar.n;
                w2Var.getClass();
                Intrinsics.checkNotNullParameter(sdkMetadata, "sdkMetadata");
                y2 y2Var = w2Var.f765a;
                DataStoreKey dataStoreKey = DataStoreKey.SDK_METADATA;
                List list = CollectionsKt.toList(com.braze.support.k.a(sdkMetadata));
                if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
                } else {
                    try {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        try {
                            Json.Companion companion = Json.INSTANCE;
                            companion.getSerializersModule();
                            str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                            str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                        }
                        y2Var.writeData(dataStoreKey, str);
                    } catch (Exception e2) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
                    }
                }
            }
            if (gVar2.k.c != null) {
                aVar.o.N();
            }
        }
        if (oVar instanceof com.braze.requests.r) {
            aVar.q.a(((com.braze.requests.r) oVar).k);
        }
    }

    public static final void a(a aVar, i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<destruct>");
        ((d) aVar.k).b(aVar.p.a(iVar.f526a), FeatureFlagsUpdatedEvent.class);
    }

    public static final void a(a aVar, l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<destruct>");
        aVar.j.registerGeofences(lVar.f528a);
    }

    public static final void a(a aVar, m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<destruct>");
        com.braze.triggers.events.b bVar = mVar.f529a;
        final com.braze.triggers.actions.h hVar = mVar.b;
        IInAppMessage iInAppMessage = mVar.c;
        String str = mVar.d;
        synchronized (aVar.h) {
            if (aVar.h.a((com.braze.triggers.actions.g) hVar)) {
                ((d) aVar.k).b(new InAppMessageEvent(bVar, hVar, iInAppMessage, str), InAppMessageEvent.class);
                aVar.h.a(hVar, DateTimeUtils.nowInSeconds());
                aVar.g.b(DateTimeUtils.nowInSeconds());
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return a.a(com.braze.triggers.actions.a.this);
                    }
                }, 7, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void a(a aVar, w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<destruct>");
        com.braze.models.response.m mVar = wVar.f537a;
        aVar.j.configureFromServerConfig(mVar);
        if (aVar.v.get()) {
            if (mVar.j) {
                aVar.L();
            }
            if (mVar.m) {
                aVar.R();
            }
            if (mVar.o) {
                aVar.U();
            }
            if (mVar.t) {
                aVar.O();
            }
            if (mVar.G) {
                aVar.I();
            }
            if (mVar.z) {
                aVar.X();
            }
        }
    }

    public static final void a(a aVar, f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<destruct>");
        aVar.g.a((com.braze.triggers.events.i) f0Var.f521a);
    }

    public static final void a(a aVar, g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<destruct>");
        aVar.g.a(g0Var.f523a, g0Var.b);
    }

    public static final void a(a aVar, com.braze.events.internal.h0 h0Var) {
        e0 e0Var;
        Intrinsics.checkNotNullParameter(h0Var, "<destruct>");
        aVar.g.a(h0Var.f525a);
        if (aVar.s.compareAndSet(true, false)) {
            aVar.g.a((com.braze.triggers.events.i) new com.braze.triggers.events.e());
        }
        if (!aVar.t.compareAndSet(true, false) || (e0Var = aVar.u) == null) {
            return;
        }
        aVar.g.a((com.braze.triggers.events.i) new com.braze.triggers.events.g(e0Var.f519a, e0Var.b));
        aVar.u = null;
    }

    public static final void a(a aVar, com.braze.events.internal.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!event.f515a.j || event.b.j) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.a();
            }
        }, 7, (Object) null);
        aVar.m.a();
    }

    public static final void a(a aVar, y it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.e();
            }
        }, 7, (Object) null);
        aVar.w.set(false);
        aVar.x.set(false);
        aVar.y.set(false);
        aVar.z.set(false);
        aVar.B.set(false);
        aVar.b.f();
        k a2 = com.braze.models.outgoing.event.b.g.a(it.f539a.f647a);
        if (a2 != null) {
            ((com.braze.models.outgoing.event.b) a2).a(it.f539a.f647a);
        }
        if (a2 != null) {
            aVar.d.a(a2);
        }
        aVar.d.a(true);
        aVar.e.j();
        aVar.f.e();
        aVar.a0();
        if (aVar.l.isAutomaticGeofenceRequestsEnabled()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.c();
                }
            }, 7, (Object) null);
            BrazeInternal.requestGeofenceRefresh(aVar.f507a, false);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.d();
                }
            }, 7, (Object) null);
        }
        aVar.p.e.clearData(DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP);
        aVar.r.h();
        aVar.c0();
    }

    public static final void a(a aVar, a0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.f();
            }
        }, 7, (Object) null);
        aVar.v.set(true);
        if (aVar.o.E()) {
            aVar.L();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.g();
                }
            }, 7, (Object) null);
        }
        if (aVar.o.H()) {
            aVar.R();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.h();
                }
            }, 7, (Object) null);
        }
        if (aVar.o.L()) {
            aVar.U();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.i();
                }
            }, 7, (Object) null);
        }
        if (aVar.o.F()) {
            aVar.O();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.j();
                }
            }, 7, (Object) null);
        }
        if (aVar.o.d()) {
            aVar.I();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.k();
                }
            }, 7, (Object) null);
        }
        if (aVar.o.M()) {
            aVar.X();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.l();
                }
            }, 7, (Object) null);
        }
    }

    public static final void a(a aVar, n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d.a(true);
        aVar.c0();
    }

    public static final void a(a aVar, z message) {
        Intrinsics.checkNotNullParameter(message, "message");
        aVar.getClass();
        com.braze.models.p pVar = message.f540a;
        k a2 = com.braze.models.outgoing.event.b.g.a(pVar.d());
        if (a2 != null) {
            ((com.braze.models.outgoing.event.b) a2).a(pVar.f647a);
            aVar.d.a(a2);
        }
        Braze.INSTANCE.getInstance(aVar.f507a).requestImmediateDataFlush();
        aVar.a0();
    }

    public static final void a(a aVar, e0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        aVar.t.set(true);
        aVar.u = message;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.n();
            }
        }, 6, (Object) null);
        r rVar = aVar.d;
        com.braze.models.outgoing.j jVar = new com.braze.models.outgoing.j();
        jVar.b = Boolean.TRUE;
        rVar.a(jVar);
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return "Could not publish in-app message with trigger action id: " + ((com.braze.triggers.actions.g) aVar).c();
    }

    public static final void a(a aVar, com.braze.exceptions.b throwable) {
        Intrinsics.checkNotNullParameter(throwable, "storageException");
        try {
            r rVar = aVar.d;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            rVar.a((Throwable) throwable, false);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.m();
                }
            }, 4, (Object) null);
        }
    }

    public static final void a(a aVar, com.braze.events.internal.e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            r rVar = aVar.d;
            com.braze.storage.p pVar = aVar.m;
            long j = pVar.d;
            long j2 = pVar.e;
            it.getClass();
            rVar.a(j, j2, 0, com.braze.requests.c.c);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.b();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a() {
        return "Content cards have moved to disabled. Clearing content card data.";
    }

    public final void a(final d eventMessenger) {
        Intrinsics.checkNotNullParameter(eventMessenger, "eventMessenger");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.a(e.this);
            }
        }, 7, (Object) null);
        eventMessenger.c(com.braze.events.internal.f.class, r());
        eventMessenger.c(g.class, s());
        eventMessenger.c(y.class, A());
        eventMessenger.c(a0.class, C());
        eventMessenger.c(z.class, B());
        eventMessenger.c(e0.class, E());
        eventMessenger.c(w.class, z());
        eventMessenger.c(Throwable.class, t());
        eventMessenger.c(com.braze.exceptions.b.class, D());
        eventMessenger.c(com.braze.events.internal.h0.class, H());
        eventMessenger.c(n.class, y());
        eventMessenger.c(l.class, w());
        eventMessenger.c(i.class, v());
        eventMessenger.c(com.braze.events.internal.a.class, o());
        eventMessenger.c(f0.class, F());
        eventMessenger.c(m.class, x());
        eventMessenger.c(g0.class, G());
        eventMessenger.c(com.braze.events.internal.e.class, q());
        eventMessenger.c(com.braze.events.internal.d.class, p());
    }

    public static final String a(e eVar) {
        return "Subscribing to events with " + eVar;
    }

    public static final void a(a aVar, Semaphore semaphore, Throwable throwable) {
        if (throwable != null) {
            try {
                try {
                    r rVar = aVar.d;
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    rVar.a(throwable, true);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.events.a$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return a.u();
                        }
                    }, 4, (Object) null);
                    if (semaphore == null) {
                        return;
                    }
                }
            } finally {
            }
        }
        if (semaphore == null) {
            return;
        }
        semaphore.release();
    }
}
