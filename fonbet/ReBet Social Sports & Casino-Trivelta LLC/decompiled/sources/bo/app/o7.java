package bo.app;

import Ph.AbstractC1455i;
import android.content.Context;
import bo.app.af;
import bo.app.fg;
import bo.app.hg;
import bo.app.jf;
import bo.app.sg;
import bo.app.te;
import bo.app.ug;
import bo.app.xe;
import bo.app.ze;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.Banner;
import com.braze.models.BannerPendingDismissal;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.storage.C2987a;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import di.C4087f;
import di.Z0;
import ei.AbstractC4212b;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o7 {

    /* renamed from: A, reason: collision with root package name */
    public final AtomicBoolean f25860A;

    /* renamed from: B, reason: collision with root package name */
    public final AtomicBoolean f25861B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25862a;

    /* renamed from: b, reason: collision with root package name */
    public final c2 f25863b;

    /* renamed from: c, reason: collision with root package name */
    public final r7 f25864c;

    /* renamed from: d, reason: collision with root package name */
    public final e2 f25865d;

    /* renamed from: e, reason: collision with root package name */
    public final xg f25866e;

    /* renamed from: f, reason: collision with root package name */
    public final z4 f25867f;

    /* renamed from: g, reason: collision with root package name */
    public final mg f25868g;

    /* renamed from: h, reason: collision with root package name */
    public final x9 f25869h;

    /* renamed from: i, reason: collision with root package name */
    public final u7 f25870i;

    /* renamed from: j, reason: collision with root package name */
    public final BrazeGeofenceManager f25871j;

    /* renamed from: k, reason: collision with root package name */
    public final m9 f25872k;

    /* renamed from: l, reason: collision with root package name */
    public final BrazeConfigurationProvider f25873l;

    /* renamed from: m, reason: collision with root package name */
    public final x3 f25874m;

    /* renamed from: n, reason: collision with root package name */
    public final ie f25875n;

    /* renamed from: o, reason: collision with root package name */
    public final ue f25876o;

    /* renamed from: p, reason: collision with root package name */
    public final g8 f25877p;

    /* renamed from: q, reason: collision with root package name */
    public final hc f25878q;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f25879r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f25880s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f25881t;

    /* renamed from: u, reason: collision with root package name */
    public fg f25882u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f25883v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f25884w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f25885x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f25886y;

    /* renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f25887z;

    public o7(Context applicationContext, c2 locationManager, r7 internalEventPublisher, e2 brazeManager, xg userCache, z4 deviceCache, mg triggerManager, x9 triggerReEligibilityManager, u7 eventStorageManager, BrazeGeofenceManager geofenceManager, m9 externalEventPublisher, BrazeConfigurationProvider configurationProvider, x3 contentCardsStorageProvider, ie sdkMetadataCache, ue serverConfigStorageProvider, g8 featureFlagsManager, hc pushDeliveryManager, d0 bannersManager) {
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
        this.f25862a = applicationContext;
        this.f25863b = locationManager;
        this.f25864c = internalEventPublisher;
        this.f25865d = brazeManager;
        this.f25866e = userCache;
        this.f25867f = deviceCache;
        this.f25868g = triggerManager;
        this.f25869h = triggerReEligibilityManager;
        this.f25870i = eventStorageManager;
        this.f25871j = geofenceManager;
        this.f25872k = externalEventPublisher;
        this.f25873l = configurationProvider;
        this.f25874m = contentCardsStorageProvider;
        this.f25875n = sdkMetadataCache;
        this.f25876o = serverConfigStorageProvider;
        this.f25877p = featureFlagsManager;
        this.f25878q = pushDeliveryManager;
        this.f25879r = bannersManager;
        this.f25880s = new AtomicBoolean(false);
        this.f25881t = new AtomicBoolean(false);
        this.f25883v = new AtomicBoolean(false);
        this.f25884w = new AtomicBoolean(false);
        this.f25885x = new AtomicBoolean(false);
        this.f25886y = new AtomicBoolean(false);
        this.f25887z = new AtomicBoolean(false);
        this.f25860A = new AtomicBoolean(false);
        this.f25861B = new AtomicBoolean(false);
    }

    public static final String M() {
        return "Requesting Banners refresh on session created event due to configuration.";
    }

    public static final String N() {
        return "Banners already initialized. Not retrieving.";
    }

    public static final String P() {
        return "Requesting Content Card refresh on session created event due to configuration.";
    }

    public static final String Q() {
        return "Content Cards already initialized. Not retrieving.";
    }

    public static final String S() {
        return "Starting DUST subscription due to configuration.";
    }

    public static final String T() {
        return "DUST initial subscription already started. Not starting again.";
    }

    public static final String V() {
        return "Requesting Feature Flags refresh on session created event due to configuration.";
    }

    public static final String W() {
        return "Feature Flags already initialized. Not retrieving.";
    }

    public static final String Y() {
        return "Requesting Push Max request on session created event due to configuration.";
    }

    public static final String Z() {
        return "Push Max already requested for this session. Not requesting again.";
    }

    public static final void a(o7 o7Var, e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<destruct>");
        List acknowledgedDismissals = eVar.f25400a;
        d0 d0Var = o7Var.f25879r;
        Intrinsics.checkNotNullParameter(acknowledgedDismissals, "acknowledgedDismissals");
        d0Var.f25381g.a(acknowledgedDismissals);
    }

    public static final String b() {
        return "Failed to request a content card refresh.";
    }

    public static final String b0() {
        return "Doing Debugger Handshake.";
    }

    public static final String c() {
        return "Failed to request a feature flag refresh.";
    }

    public static final String c0() {
        return "Debugger Initialization already attempted. Not doing Debugger initialization again.";
    }

    public static final String d() {
        return "Session created event for new session received.";
    }

    public static final String e() {
        return "Requesting Braze Geofence refresh on session created event due to configuration.";
    }

    public static final String e0() {
        return "Performing push delivery event flush";
    }

    public static final String f() {
        return "Not automatically requesting Braze Geofence refresh on session created event due to configuration.";
    }

    public static final String g() {
        return "Session start event for new session received.";
    }

    public static final String g0() {
        return "Requesting trigger refresh in next sync";
    }

    public static final String h() {
        return "Not automatically requesting Content Card refresh on session created event due to server configuration.";
    }

    public static final String i() {
        return "Not automatically requesting Feature Flags refresh on session created event due to server configuration.";
    }

    public static final String j() {
        return "Not automatically requesting Push Max on session created event due to server configuration.";
    }

    public static final String k() {
        return "Not automatically starting DUST subscription on session created event due to server configuration.";
    }

    public static final String l() {
        return "Not automatically requesting Banners refresh on session created event due to server configuration.";
    }

    public static final String m() {
        return "Not automatically starting SDK Debugger on session created event due to server configuration.";
    }

    public static final String n() {
        return "Failed to log the storage exception.";
    }

    public static final String o() {
        return "Requesting trigger update due to trigger-eligible push click event";
    }

    public static final String w() {
        return "Failed to log error.";
    }

    public final IEventSubscriber A() {
        return new IEventSubscriber() { // from class: c3.B7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (bo.app.la) obj);
            }
        };
    }

    public final IEventSubscriber B() {
        return new IEventSubscriber() { // from class: c3.r8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (bo.app.ya) obj);
            }
        };
    }

    public final IEventSubscriber C() {
        return new IEventSubscriber() { // from class: c3.o8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (te) obj);
            }
        };
    }

    public final IEventSubscriber D() {
        return new IEventSubscriber() { // from class: c3.C7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (xe) obj);
            }
        };
    }

    public final IEventSubscriber E() {
        return new IEventSubscriber() { // from class: c3.t7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (ze) obj);
            }
        };
    }

    public final IEventSubscriber F() {
        return new IEventSubscriber() { // from class: c3.p8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (af) obj);
            }
        };
    }

    public final IEventSubscriber G() {
        return new IEventSubscriber() { // from class: c3.s7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (jf) obj);
            }
        };
    }

    public final IEventSubscriber H() {
        return new IEventSubscriber() { // from class: c3.n8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (fg) obj);
            }
        };
    }

    public final IEventSubscriber I() {
        return new IEventSubscriber() { // from class: c3.Y7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (hg) obj);
            }
        };
    }

    public final IEventSubscriber J() {
        return new IEventSubscriber() { // from class: c3.v7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (sg) obj);
            }
        };
    }

    public final IEventSubscriber K() {
        return new IEventSubscriber() { // from class: c3.q8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (ug) obj);
            }
        };
    }

    public final void L() {
        if (!this.f25860A.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.G7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.N();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.F7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.M();
                }
            }, 7, (Object) null);
            this.f25879r.a();
        }
    }

    public final void O() {
        if (!this.f25884w.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.I7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.Q();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.H7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o7.P();
            }
        }, 7, (Object) null);
        e2 e2Var = this.f25865d;
        x3 x3Var = this.f25874m;
        e2Var.a(x3Var.f26227d, x3Var.f26228e, j2.f25585b);
    }

    public final void R() {
        if (!this.f25887z.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.W7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.T();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.V7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.S();
                }
            }, 7, (Object) null);
            this.f25865d.s();
        }
    }

    public final void U() {
        if (!this.f25885x.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.d8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.W();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.c8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o7.V();
            }
        }, 7, (Object) null);
        g8 g8Var = this.f25877p;
        j2 requestInitiatedBy = j2.f25585b;
        Intrinsics.checkNotNullParameter(requestInitiatedBy, "requestInitiatedBy");
        g8Var.f25483d.a(requestInitiatedBy);
    }

    public final void X() {
        if (!this.f25886y.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.f8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.Z();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.e8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.Y();
                }
            }, 7, (Object) null);
            this.f25865d.v();
        }
    }

    public final void a0() {
        if (!this.f25861B.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.b8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.c0();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.a8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.b0();
                }
            }, 7, (Object) null);
            this.f25864c.b(new be(), be.class);
        }
    }

    public final void d0() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Z7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o7.e0();
            }
        }, 7, (Object) null);
        this.f25865d.a(0L);
    }

    public final void f0() {
        o7 o7Var;
        kb kbVar = new kb();
        if (this.f25865d.f25424t.get()) {
            this.f25880s.set(true);
            o7Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.m8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.g0();
                }
            }, 7, (Object) null);
            kbVar.f25665b = Boolean.TRUE;
            o7Var.f25865d.a(false);
        } else {
            o7Var = this;
        }
        if (Intrinsics.areEqual(kbVar.f25665b, Boolean.TRUE)) {
            o7Var.f25865d.a(kbVar);
        }
    }

    public final IEventSubscriber p() {
        return new IEventSubscriber() { // from class: c3.D7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (bo.app.e) obj);
            }
        };
    }

    public final IEventSubscriber q() {
        return new IEventSubscriber() { // from class: c3.y7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (bo.app.e0) obj);
            }
        };
    }

    public final IEventSubscriber r() {
        return new IEventSubscriber() { // from class: c3.j8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (bo.app.o3) obj);
            }
        };
    }

    public final IEventSubscriber s() {
        return new IEventSubscriber() { // from class: c3.z7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (bo.app.p3) obj);
            }
        };
    }

    public final IEventSubscriber t() {
        return new IEventSubscriber() { // from class: c3.N7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (bo.app.r5) obj);
            }
        };
    }

    public final IEventSubscriber u() {
        return new IEventSubscriber() { // from class: c3.A7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (bo.app.s5) obj);
            }
        };
    }

    public final IEventSubscriber v() {
        final Semaphore semaphore = null;
        return new IEventSubscriber() { // from class: c3.x7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, semaphore, (Throwable) obj);
            }
        };
    }

    public final IEventSubscriber x() {
        return new IEventSubscriber() { // from class: c3.w7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (bo.app.a8) obj);
            }
        };
    }

    public final IEventSubscriber y() {
        return new IEventSubscriber() { // from class: c3.E7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (bo.app.h8) obj);
            }
        };
    }

    public final IEventSubscriber z() {
        return new IEventSubscriber() { // from class: c3.u7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.o7.a(bo.app.o7.this, (bo.app.u8) obj);
            }
        };
    }

    public static final void a(o7 o7Var, r5 r5Var) {
        fg fgVar;
        Intrinsics.checkNotNullParameter(r5Var, "<destruct>");
        d9 d9Var = r5Var.f25974a;
        x4 x4Var = ((i2) d9Var).f25549j;
        if (x4Var != null) {
            o7Var.f25867f.a((Object) x4Var, false);
        }
        if (d9Var instanceof l4) {
            l4 l4Var = (l4) d9Var;
            if (l4Var.f25694l.b()) {
                if (o7Var.f25880s.compareAndSet(true, false)) {
                    o7Var.f25868g.a((gg) new hb());
                }
                if (o7Var.f25881t.compareAndSet(true, false) && (fgVar = o7Var.f25882u) != null) {
                    o7Var.f25868g.a((gg) new ac(fgVar.f25465a, fgVar.f25466b));
                    o7Var.f25882u = null;
                }
                o7Var.f25865d.a(true);
            }
            mb mbVar = l4Var.f25696n;
            if (mbVar != null) {
                o7Var.f25866e.a((Object) mbVar, false);
                if (mbVar.f25755a.has(DataStoreKey.PUSH_TOKEN.getKey())) {
                    o7Var.f25866e.j();
                    o7Var.f25867f.e();
                }
            }
            l1 l1Var = l4Var.f25697o;
            if (l1Var != null) {
                for (y8 y8Var : l1Var.f25680a) {
                    r7 r7Var = o7Var.f25864c;
                    List events = CollectionsKt.listOf(y8Var);
                    Intrinsics.checkNotNullParameter(events, "events");
                    r7Var.b(new o5(n5.f25788b, events, null, null, 12), o5.class);
                }
            }
            if (l4Var.f25694l.f25729c != null) {
                o7Var.f25876o.O();
            }
        }
        if (d9Var instanceof ic) {
            o7Var.f25878q.b(((ic) d9Var).f25568l);
        }
    }

    public static final void a(o7 o7Var, s5 s5Var) {
        String str;
        Intrinsics.checkNotNullParameter(s5Var, "<destruct>");
        d9 d9Var = s5Var.f26039a;
        x4 x4Var = ((i2) d9Var).f25549j;
        if (x4Var != null) {
            o7Var.f25867f.a((Object) x4Var, true);
        }
        if (d9Var instanceof l4) {
            l4 l4Var = (l4) d9Var;
            mb mbVar = l4Var.f25696n;
            if (mbVar != null) {
                o7Var.f25866e.a((Object) mbVar, true);
            }
            l1 l1Var = l4Var.f25697o;
            if (l1Var != null) {
                o7Var.f25870i.a(l1Var.f25680a);
            }
            if (l4Var.f25694l.b()) {
                o7Var.f25865d.a(false);
            }
            EnumSet sdkMetadata = l4Var.f25698p;
            if (sdkMetadata != null) {
                ie ieVar = o7Var.f25875n;
                Intrinsics.checkNotNullParameter(sdkMetadata, "sdkMetadata");
                com.braze.storage.o oVar = ieVar.f25579a;
                DataStoreKey dataStoreKey = DataStoreKey.SDK_METADATA;
                List list = CollectionsKt.toList(com.braze.support.d.a(sdkMetadata));
                if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
                } else {
                    try {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        try {
                            AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                            aVar.a();
                            str = aVar.b(new C4087f(Z0.f45341a), list);
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                            str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                        }
                        oVar.writeData(dataStoreKey, str);
                    } catch (Exception e11) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
                    }
                }
            }
            if (l4Var.f25694l.f25729c != null) {
                o7Var.f25876o.O();
            }
        }
        if (d9Var instanceof ic) {
            o7Var.f25878q.a(((ic) d9Var).f25568l);
        }
    }

    public static final void a(o7 o7Var, h8 h8Var) {
        Intrinsics.checkNotNullParameter(h8Var, "<destruct>");
        ((r7) o7Var.f25872k).b(o7Var.f25877p.a(h8Var.f25516a), FeatureFlagsUpdatedEvent.class);
    }

    public static final void a(o7 o7Var, u8 u8Var) {
        Intrinsics.checkNotNullParameter(u8Var, "<destruct>");
        o7Var.f25871j.registerGeofences(u8Var.f26111a);
    }

    public static final void a(o7 o7Var, la laVar) {
        Intrinsics.checkNotNullParameter(laVar, "<destruct>");
        v9 v9Var = laVar.f25723a;
        final y9 y9Var = laVar.f25724b;
        IInAppMessage iInAppMessage = laVar.f25725c;
        String str = laVar.f25726d;
        synchronized (o7Var.f25869h) {
            try {
                if (((qg) o7Var.f25869h).a(y9Var)) {
                    ((r7) o7Var.f25872k).b(new InAppMessageEvent(v9Var, y9Var, iInAppMessage, str), InAppMessageEvent.class);
                    ((qg) o7Var.f25869h).a(y9Var, DateTimeUtils.nowInSeconds());
                    o7Var.f25868g.b(DateTimeUtils.nowInSeconds());
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.L7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.o7.a(bo.app.y9.this);
                        }
                    }, 7, (Object) null);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void a(o7 o7Var, te teVar) {
        Intrinsics.checkNotNullParameter(teVar, "<destruct>");
        re reVar = teVar.f26090a;
        o7Var.f25871j.configureFromServerConfig(reVar);
        if (o7Var.f25883v.get()) {
            if (reVar.f26010j) {
                o7Var.O();
            }
            if (reVar.f26013m) {
                o7Var.U();
            }
            if (reVar.f26015o) {
                o7Var.X();
            }
            if (reVar.f26020t) {
                o7Var.R();
            }
            if (reVar.f25998G) {
                o7Var.L();
            }
            if (reVar.f26026z) {
                o7Var.a0();
            }
        }
    }

    public static final void a(o7 o7Var, hg hgVar) {
        Intrinsics.checkNotNullParameter(hgVar, "<destruct>");
        o7Var.f25868g.a((gg) hgVar.f25538a);
    }

    public static final void a(o7 o7Var, sg sgVar) {
        Intrinsics.checkNotNullParameter(sgVar, "<destruct>");
        o7Var.f25868g.a(sgVar.f26062a, sgVar.f26063b);
    }

    public static final void a(o7 o7Var, ug ugVar) {
        fg fgVar;
        Intrinsics.checkNotNullParameter(ugVar, "<destruct>");
        o7Var.f25868g.a(ugVar.f26130a);
        if (o7Var.f25880s.compareAndSet(true, false)) {
            o7Var.f25868g.a((gg) new hb());
        }
        if (!o7Var.f25881t.compareAndSet(true, false) || (fgVar = o7Var.f25882u) == null) {
            return;
        }
        o7Var.f25868g.a((gg) new ac(fgVar.f25465a, fgVar.f25466b));
        o7Var.f25882u = null;
    }

    public static final void a(o7 o7Var, o3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!event.f25844a.f26010j || event.f25845b.f26010j) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.K7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o7.a();
            }
        }, 7, (Object) null);
        o7Var.f25874m.a();
    }

    public static final void a(o7 o7Var, xe it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.h8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o7.d();
            }
        }, 7, (Object) null);
        o7Var.f25884w.set(false);
        o7Var.f25885x.set(false);
        o7Var.f25886y.set(false);
        o7Var.f25887z.set(false);
        o7Var.f25861B.set(false);
        o7Var.f25863b.f();
        y8 a10 = k1.f25630g.a(it.f26284a.f26205a);
        if (a10 != null) {
            ((k1) a10).a(it.f26284a.f26205a);
        }
        if (a10 != null) {
            o7Var.f25865d.a(a10);
        }
        o7Var.f25865d.a(true);
        o7Var.f25866e.j();
        o7Var.f25867f.e();
        o7Var.d0();
        if (o7Var.f25873l.isAutomaticGeofenceRequestsEnabled()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.i8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.e();
                }
            }, 7, (Object) null);
            BrazeInternal.requestGeofenceRefresh(o7Var.f25862a, false);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.k8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.f();
                }
            }, 7, (Object) null);
        }
        o7Var.f25877p.f25484e.clearData(DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP);
        o7Var.f25879r.j();
        o7Var.f0();
    }

    public static final void a(o7 o7Var, af it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.O7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o7.g();
            }
        }, 7, (Object) null);
        o7Var.f25883v.set(true);
        if (o7Var.f25876o.F()) {
            o7Var.O();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.P7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.h();
                }
            }, 7, (Object) null);
        }
        if (o7Var.f25876o.I()) {
            o7Var.U();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Q7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.i();
                }
            }, 7, (Object) null);
        }
        if (o7Var.f25876o.M()) {
            o7Var.X();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.R7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.j();
                }
            }, 7, (Object) null);
        }
        if (o7Var.f25876o.G()) {
            o7Var.R();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.S7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.k();
                }
            }, 7, (Object) null);
        }
        if (o7Var.f25876o.d()) {
            o7Var.L();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.T7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.l();
                }
            }, 7, (Object) null);
        }
        if (o7Var.f25876o.N()) {
            o7Var.a0();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.U7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.m();
                }
            }, 7, (Object) null);
        }
    }

    public static final void a(o7 o7Var, ya it) {
        Intrinsics.checkNotNullParameter(it, "it");
        o7Var.f25865d.a(true);
        o7Var.f0();
    }

    public static final void a(o7 o7Var, ze message) {
        Intrinsics.checkNotNullParameter(message, "message");
        o7Var.getClass();
        we weVar = message.f26358a;
        y8 a10 = k1.f25630g.a(weVar.c());
        if (a10 != null) {
            ((k1) a10).a(weVar.f26205a);
            o7Var.f25865d.a(a10);
        }
        Braze.INSTANCE.getInstance(o7Var.f25862a).requestImmediateDataFlush();
        o7Var.d0();
    }

    public static final void a(o7 o7Var, e0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d0 d0Var = o7Var.f25879r;
        JSONObject bannersJson = event.f25401a;
        Long l10 = event.f25402b;
        List<d> acknowledgedDismissals = event.f25403c;
        Intrinsics.checkNotNullParameter(bannersJson, "bannerData");
        Intrinsics.checkNotNullParameter(acknowledgedDismissals, "acknowledgedDismissals");
        Banner.Companion.getClass();
        Intrinsics.checkNotNullParameter(bannersJson, "bannersJson");
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = bannersJson.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            Banner a10 = Banner.Companion.a(bannersJson.optJSONObject(keys.next()));
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (((Banner) obj).getIsTestSend()) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List<Banner> list = (List) pair.component1();
        List<Banner> incomingBanners = (List) pair.component2();
        for (Banner banner : list) {
            d0.f25369k.put(banner.getPlacementId(), banner);
        }
        q qVar = d0Var.f25382h;
        List existingCache = d0Var.f25380f;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(incomingBanners, "incomingBanners");
        Intrinsics.checkNotNullParameter(acknowledgedDismissals, "acknowledgedDismissals");
        Intrinsics.checkNotNullParameter(existingCache, "existingCache");
        Map a11 = qVar.f25921a.a();
        List pendingDismissals = qVar.f25921a.b();
        Intrinsics.checkNotNullParameter(pendingDismissals, "pendingDismissals");
        Intrinsics.checkNotNullParameter(acknowledgedDismissals, "acknowledgedDismissals");
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(acknowledgedDismissals, 10));
        for (d dVar : acknowledgedDismissals) {
            arrayList4.add(TuplesKt.to(dVar.f25366a, Long.valueOf(dVar.f25367b)));
        }
        Set set = CollectionsKt.toSet(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : pendingDismissals) {
            BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) obj2;
            if (!set.contains(TuplesKt.to(bannerPendingDismissal.getBannerId(), Long.valueOf(bannerPendingDismissal.getDismissalTimeMs())))) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList5.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj3 = arrayList5.get(i12);
            i12++;
            String stableKey = ((BannerPendingDismissal) obj3).getStableKey();
            if (stableKey != null) {
                arrayList6.add(stableKey);
            }
        }
        Set set2 = CollectionsKt.toSet(arrayList6);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(existingCache, 10)), 16));
        for (Object obj4 : existingCache) {
            linkedHashMap.put(((Banner) obj4).getPlacementId(), obj4);
        }
        ArrayList arrayList7 = new ArrayList();
        for (Banner banner2 : incomingBanners) {
            if ((!qVar.a(banner2, l10, a11) && (banner2 = (Banner) linkedHashMap.get(banner2.getPlacementId())) == null) || !qVar.a(banner2, set2) || !qVar.a(banner2)) {
                banner2 = null;
            }
            if (banner2 != null) {
                arrayList7.add(banner2);
            }
        }
        if (l10 != null) {
            C2987a c2987a = d0Var.f25379e;
            ArrayList placementIds = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
            int size3 = arrayList7.size();
            while (i10 < size3) {
                Object obj5 = arrayList7.get(i10);
                i10++;
                placementIds.add(((Banner) obj5).getPlacementId());
            }
            long longValue = l10.longValue();
            c2987a.getClass();
            Intrinsics.checkNotNullParameter(placementIds, "placementIds");
            if (!placementIds.isEmpty()) {
                AbstractC1455i.e(c2987a.getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new w(c2987a, placementIds, longValue, null));
            }
        }
        d0Var.f25380f = arrayList7;
        d0Var.h();
        d0Var.l();
        List list2 = d0Var.f25380f;
        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList8.add(((Banner) it.next()).deepcopy$android_sdk_base_release());
        }
        ((r7) o7Var.f25872k).b(new BannersUpdatedEvent(arrayList8), BannersUpdatedEvent.class);
    }

    public static final void a(o7 o7Var, fg message) {
        Intrinsics.checkNotNullParameter(message, "message");
        o7Var.f25881t.set(true);
        o7Var.f25882u = message;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.g8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o7.o();
            }
        }, 6, (Object) null);
        e2 e2Var = o7Var.f25865d;
        kb kbVar = new kb();
        kbVar.f25665b = Boolean.TRUE;
        e2Var.a(kbVar);
    }

    public static final String a(y9 y9Var) {
        return "Could not publish in-app message with trigger action id: " + ((rg) y9Var).f26028a;
    }

    public static final void a(o7 o7Var, jf throwable) {
        Intrinsics.checkNotNullParameter(throwable, "storageException");
        try {
            e2 e2Var = o7Var.f25865d;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            e2Var.a((Throwable) throwable, false);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.l8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.n();
                }
            }, 4, (Object) null);
        }
    }

    public static final void a(o7 o7Var, p3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            e2 e2Var = o7Var.f25865d;
            x3 x3Var = o7Var.f25874m;
            long j10 = x3Var.f26227d;
            long j11 = x3Var.f26228e;
            it.getClass();
            e2Var.a(j10, j11, j2.f25586c);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.X7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.b();
                }
            }, 4, (Object) null);
        }
    }

    public static final void a(o7 o7Var, a8 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            e2 e2Var = o7Var.f25865d;
            it.getClass();
            e2Var.a(j2.f25586c);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.J7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o7.c();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a() {
        return "Content cards have moved to disabled. Clearing content card data.";
    }

    public final void a(final r7 eventMessenger) {
        Intrinsics.checkNotNullParameter(eventMessenger, "eventMessenger");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.r7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o7.a(bo.app.m9.this);
            }
        }, 7, (Object) null);
        eventMessenger.c(r5.class, t());
        eventMessenger.c(s5.class, u());
        eventMessenger.c(xe.class, D());
        eventMessenger.c(af.class, F());
        eventMessenger.c(ze.class, E());
        eventMessenger.c(fg.class, H());
        eventMessenger.c(te.class, C());
        eventMessenger.c(Throwable.class, v());
        eventMessenger.c(jf.class, G());
        eventMessenger.c(ug.class, K());
        eventMessenger.c(ya.class, B());
        eventMessenger.c(u8.class, z());
        eventMessenger.c(h8.class, y());
        eventMessenger.c(e0.class, q());
        eventMessenger.c(e.class, p());
        eventMessenger.c(hg.class, I());
        eventMessenger.c(la.class, A());
        eventMessenger.c(sg.class, J());
        eventMessenger.c(p3.class, s());
        eventMessenger.c(a8.class, x());
        eventMessenger.c(o3.class, r());
    }

    public static final String a(m9 m9Var) {
        return "Subscribing to events with " + m9Var;
    }

    public static final void a(o7 o7Var, Semaphore semaphore, Throwable throwable) {
        try {
            if (throwable != null) {
                try {
                    e2 e2Var = o7Var.f25865d;
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    e2Var.a(throwable, true);
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.M7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.o7.w();
                        }
                    }, 4, (Object) null);
                    if (semaphore != null) {
                        semaphore.release();
                        return;
                    }
                    return;
                }
            }
            if (semaphore != null) {
                semaphore.release();
            }
        } finally {
        }
    }
}
