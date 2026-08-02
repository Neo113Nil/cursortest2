package bo.app;

import Ph.A;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.G0;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import bo.app.fe;
import com.braze.BrazeFlushPushDeliveryReceiver;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class e2 implements a9 {

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f25404u = {"android.os.deadsystemexception"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f25405a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25406b;

    /* renamed from: c, reason: collision with root package name */
    public final q2 f25407c;

    /* renamed from: d, reason: collision with root package name */
    public final r7 f25408d;

    /* renamed from: e, reason: collision with root package name */
    public final BrazeConfigurationProvider f25409e;

    /* renamed from: f, reason: collision with root package name */
    public final ue f25410f;

    /* renamed from: g, reason: collision with root package name */
    public final u7 f25411g;

    /* renamed from: h, reason: collision with root package name */
    public final f2 f25412h;

    /* renamed from: i, reason: collision with root package name */
    public final he f25413i;

    /* renamed from: j, reason: collision with root package name */
    public final qc f25414j;

    /* renamed from: k, reason: collision with root package name */
    public final hc f25415k;

    /* renamed from: l, reason: collision with root package name */
    public final mc f25416l;

    /* renamed from: m, reason: collision with root package name */
    public final u4 f25417m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f25418n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicInteger f25419o;

    /* renamed from: p, reason: collision with root package name */
    public final ReentrantLock f25420p;

    /* renamed from: q, reason: collision with root package name */
    public C0 f25421q;

    /* renamed from: r, reason: collision with root package name */
    public final m7 f25422r;

    /* renamed from: s, reason: collision with root package name */
    public volatile String f25423s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f25424t;

    public e2(Context context, String str, String apiKey, q2 sessionManager, r7 internalEventPublisher, BrazeConfigurationProvider configurationProvider, ue serverConfigStorageProvider, u7 eventStorageManager, f2 messagingSessionManager, he sdkEnablementProvider, qc pushMaxManager, hc pushDeliveryManager, mc pushIdentifierStorageProvider, u4 delayedInitializationProvider) {
        A b10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(eventStorageManager, "eventStorageManager");
        Intrinsics.checkNotNullParameter(messagingSessionManager, "messagingSessionManager");
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        Intrinsics.checkNotNullParameter(pushMaxManager, "pushMaxManager");
        Intrinsics.checkNotNullParameter(pushDeliveryManager, "pushDeliveryManager");
        Intrinsics.checkNotNullParameter(pushIdentifierStorageProvider, "pushIdentifierStorageProvider");
        Intrinsics.checkNotNullParameter(delayedInitializationProvider, "delayedInitializationProvider");
        this.f25405a = context;
        this.f25406b = str;
        this.f25407c = sessionManager;
        this.f25408d = internalEventPublisher;
        this.f25409e = configurationProvider;
        this.f25410f = serverConfigStorageProvider;
        this.f25411g = eventStorageManager;
        this.f25412h = messagingSessionManager;
        this.f25413i = sdkEnablementProvider;
        this.f25414j = pushMaxManager;
        this.f25415k = pushDeliveryManager;
        this.f25416l = pushIdentifierStorageProvider;
        this.f25417m = delayedInitializationProvider;
        this.f25418n = new AtomicInteger(0);
        this.f25419o = new AtomicInteger(0);
        this.f25420p = new ReentrantLock();
        b10 = G0.b(null, 1, null);
        this.f25421q = b10;
        this.f25422r = new m7(context, str, apiKey);
        this.f25423s = "";
        this.f25424t = new AtomicBoolean(false);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.P0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.a();
            }
        }, 6, (Object) null);
        internalEventPublisher.c(od.class, new IEventSubscriber() { // from class: c3.Q0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.e2 e2Var = bo.app.e2.this;
                android.support.v4.media.session.b.a(obj);
                bo.app.e2.a(e2Var, (bo.app.od) null);
            }
        });
        internalEventPublisher.c(be.class, new IEventSubscriber() { // from class: c3.R0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.e2.a(bo.app.e2.this, (bo.app.be) obj);
            }
        });
        internalEventPublisher.c(fe.class, new IEventSubscriber() { // from class: c3.T0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.e2.a(bo.app.e2.this, (fe) obj);
            }
        });
    }

    public static final String a() {
        return "BrazeManager init called";
    }

    public static final String c(e2 e2Var) {
        return "SDK delayed initialization mode: " + e2Var.f25417m.c() + " and GDPR disabled mode: " + e2Var.f25413i.a() + ". Not closing session.";
    }

    public static final String e() {
        return "BrazeManager got SdkDebuggerInitializationRequestedEvent";
    }

    public static final String f() {
        return "Braze SDK Debugger logs being sent";
    }

    public static final String h() {
        return "Publishing an internal push body clicked event for any awaiting triggers.";
    }

    public static final String i() {
        return "Adding push click to dispatcher pending list";
    }

    public static final String j() {
        return "Session in background, data syncing event on delay";
    }

    public static final String k() {
        return "Logging push max campaign";
    }

    public static final String m() {
        return "Flushing Push Delivery Events now";
    }

    public static final String n() {
        return "Attempted to flush Push Delivery events, but no events are available";
    }

    public static final String o() {
        return "Posting geofence report for geofence event.";
    }

    public static final String p() {
        return "Posting banners refresh request.";
    }

    public static final String q() {
        return "Posting feature flags refresh request.";
    }

    public static final String r() {
        return "Disallowing Content Cards sync due to Content Cards not being enabled.";
    }

    public static final String t() {
        return "Requesting DUST mite";
    }

    public static final String u() {
        return "Posting geofence request for location.";
    }

    public static final String w() {
        return "Sending Push Max data";
    }

    public static final String x() {
        return "Posting SDK Debugger Logs request.";
    }

    public final void b(f activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f25413i.a() || this.f25417m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.U0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.e2.f(bo.app.e2.this);
                }
            }, 6, (Object) null);
        } else {
            this.f25407c.c(activity.f25440a.toString());
            this.f25412h.b();
        }
    }

    public final void d() {
        if (this.f25413i.a() || this.f25417m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.N0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.e2.d(bo.app.e2.this);
                }
            }, 6, (Object) null);
        } else {
            this.f25407c.l();
        }
    }

    public final void g(y8 geofenceEvent) {
        Intrinsics.checkNotNullParameter(geofenceEvent, "geofenceEvent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.o();
            }
        }, 7, (Object) null);
        k1 k1Var = (k1) geofenceEvent;
        k1Var.f25636e.setValue(k1Var, k1.f25631h[0], this.f25406b);
        a(new t8(this.f25410f, this.f25409e.getBaseUrlForRequests(), k1Var));
    }

    public final void l() {
        if (this.f25413i.a() || this.f25417m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.H0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.e2.e(bo.app.e2.this);
                }
            }, 6, (Object) null);
        } else {
            this.f25407c.c((String) null);
        }
    }

    public final void s() {
        if (this.f25410f.G()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.k1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.e2.t();
                }
            }, 6, (Object) null);
            a(new v5(this.f25410f, this.f25409e.getBaseUrlForRequests(), this.f25406b));
        }
    }

    public final void v() {
        List list;
        if (this.f25410f.M()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.i1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.e2.w();
                }
            }, 7, (Object) null);
            ue ueVar = this.f25410f;
            String baseUrlForRequests = this.f25409e.getBaseUrlForRequests();
            String str = this.f25406b;
            qc qcVar = this.f25414j;
            Object readData = qcVar.f25952b.readData(DataStoreKey.PUSH_MAX_LAST_UPDATE, -1L);
            Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) readData).longValue() - qcVar.f25951a.v();
            List a10 = qcVar.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : a10) {
                if (((oc) obj).f25892b > longValue) {
                    arrayList.add(obj);
                }
            }
            List list2 = CollectionsKt.toList(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((oc) it.next()).f25891a);
            }
            Object readData2 = this.f25414j.f25952b.readData(DataStoreKey.PUSH_MAX_LAST_UPDATE, -1L);
            Intrinsics.checkNotNull(readData2, "null cannot be cast to non-null type kotlin.Long");
            long longValue2 = ((Long) readData2).longValue();
            mc mcVar = this.f25416l;
            long w10 = this.f25410f.w();
            if (w10 <= 0) {
                list = CollectionsKt.emptyList();
            } else {
                long nowInSeconds = DateTimeUtils.nowInSeconds() - w10;
                Map a11 = mcVar.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : a11.entrySet()) {
                    if (((Number) entry.getValue()).longValue() >= nowInSeconds) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                list = CollectionsKt.toList(linkedHashMap.keySet());
            }
            a(new sc(ueVar, baseUrlForRequests, str, arrayList2, longValue2, list));
        }
    }

    public static final void a(e2 e2Var, od it) {
        Intrinsics.checkNotNullParameter(it, "it");
        throw null;
    }

    public static final String e(e2 e2Var) {
        return "SDK delayed initialization mode: " + e2Var.f25417m.c() + " and GDPR disabled mode: " + e2Var.f25413i.a() + ". Not opening session.";
    }

    public static final String f(e2 e2Var) {
        return "SDK delayed initialization mode: " + e2Var.f25417m.c() + " and GDPR disabled mode: " + e2Var.f25413i.a() + ". Not opening session.";
    }

    public static final void a(e2 e2Var, be it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) e2Var, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.W0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.e();
            }
        }, 6, (Object) null);
        e2Var.b();
    }

    public static final String c(y8 y8Var) {
        return "Not processing event after validation failed: " + y8Var;
    }

    public static final String d(e2 e2Var) {
        return "SDK delayed initialization mode: " + e2Var.f25417m.c() + " and GDPR disabled mode: " + e2Var.f25413i.a() + ". Not force closing session.";
    }

    public static final String e(y8 y8Var) {
        return "Not adding user id to event: " + JsonUtils.getPrettyPrintedString(((k1) y8Var).getKey());
    }

    public static final String f(y8 y8Var) {
        return "Attempting to log event: " + JsonUtils.getPrettyPrintedString(((k1) y8Var).getKey());
    }

    public final void c(String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.b1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.k();
            }
        }, 7, (Object) null);
        this.f25414j.a(campaignId);
    }

    public static final void a(e2 e2Var, fe it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) e2Var, BrazeLogger.Priority.f29469D, (Throwable) null, true, new Function0() { // from class: c3.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.f();
            }
        }, 2, (Object) null);
        e2Var.a(it.f25463a);
    }

    public static final String c() {
        return "Requesting SDK Debugger Handshake";
    }

    public static final String d(y8 y8Var) {
        return "Not adding session id to event: " + JsonUtils.getPrettyPrintedString(((k1) y8Var).getKey());
    }

    public static final String b(y8 y8Var) {
        return "BrazeManager logEvent called for: " + JsonUtils.getPrettyPrintedString(((k1) y8Var).getKey());
    }

    public final void a(boolean z10) {
        this.f25424t.set(z10);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.a(bo.app.e2.this);
            }
        }, 6, (Object) null);
    }

    public static final String a(e2 e2Var) {
        return "Updated shouldRequestTriggersInNextRequest to: " + e2Var.f25424t;
    }

    public static final String b(e2 e2Var) {
        return "SDK delayed initialization mode: " + e2Var.f25417m.c() + " and GDPR disabled mode: " + e2Var.f25413i.a() + ". Not adding request to dispatch.";
    }

    public static final String g() {
        return "Failed to log error.";
    }

    public static final String b(Throwable th2) {
        return "Not logging duplicate error: " + th2;
    }

    public final void a(f activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!this.f25413i.a() && !this.f25417m.c()) {
            this.f25412h.e();
            q2 q2Var = this.f25407c;
            String cls = activity.f25440a.toString();
            Intrinsics.checkNotNullExpressionValue(cls, "toString(...)");
            q2Var.a(cls);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.O0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.c(bo.app.e2.this);
            }
        }, 6, (Object) null);
    }

    public static final String b(long j10) {
        return "Scheduling Push Delivery Events Flush in " + j10 + " ms";
    }

    public static final String b(String str) {
        return "Logging push delivery event for campaign id: " + str;
    }

    public final void b() {
        if (this.f25410f.N()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.c1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.e2.c();
                }
            }, 6, (Object) null);
            a(new ae(this.f25410f, this.f25409e.getBaseUrlForRequests(), this.f25406b));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(final y8 event) {
        boolean z10;
        boolean z11;
        k1 thisRef;
        w7 w7Var;
        w7 w7Var2;
        e2 e2Var;
        C0 d10;
        Intrinsics.checkNotNullParameter(event, "event");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.b(bo.app.y8.this);
            }
        }, 6, (Object) null);
        boolean z12 = false;
        if (!this.f25413i.a() && !this.f25417m.c()) {
            if (!this.f25422r.a(event)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.l1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.e2.c(bo.app.y8.this);
                    }
                }, 6, (Object) null);
                return false;
            }
            q2 q2Var = this.f25407c;
            ReentrantLock reentrantLock = q2Var.f25934h;
            reentrantLock.lock();
            try {
                za zaVar = q2Var.f25938l;
                if (zaVar != null) {
                    if (zaVar.f26208d) {
                        z10 = true;
                        if (z10 && this.f25407c.h() != null) {
                            ((k1) event).a(this.f25407c.h());
                            z11 = false;
                        } else {
                            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.m1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.e2.d(bo.app.y8.this);
                                }
                            }, 7, (Object) null);
                            z11 = true;
                        }
                        if (this.f25406b.length() != 0) {
                            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.n1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.e2.e(bo.app.y8.this);
                                }
                            }, 7, (Object) null);
                        } else {
                            k1 k1Var = (k1) event;
                            k1Var.f25636e.setValue(k1Var, k1.f25631h[0], this.f25406b);
                        }
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.o1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return bo.app.e2.f(bo.app.y8.this);
                            }
                        }, 6, (Object) null);
                        thisRef = (k1) event;
                        w7Var = thisRef.f25632a;
                        w7Var2 = w7.f26175h;
                        if (w7Var != w7Var2) {
                            e2Var = this;
                            BrazeLogger.brazelog$default(brazeLogger, (Object) e2Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.p1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.e2.h();
                                }
                            }, 7, (Object) null);
                            bc notificationTrackingBrazeEvent = (bc) event;
                            Intrinsics.checkNotNullParameter(notificationTrackingBrazeEvent, "notificationTrackingBrazeEvent");
                            String optString = notificationTrackingBrazeEvent.f25633b.optString("cid", "");
                            r7 r7Var = e2Var.f25408d;
                            Intrinsics.checkNotNull(optString);
                            r7Var.b(new fg(optString, notificationTrackingBrazeEvent), fg.class);
                        } else {
                            e2Var = this;
                        }
                        if (thisRef.f25632a == w7.f26177j || !thisRef.f25633b.optBoolean("nop", false)) {
                            e2Var.f25411g.a(event);
                        }
                        if (z11) {
                            w7 w7Var3 = thisRef.f25632a;
                            if (w7Var3 == w7.f26176i) {
                                Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.braze.models.outgoing.event.push.PushActionButtonClickedEvent");
                                z12 = !((yb) event).f26323i;
                            } else if (w7Var3 == w7Var2 || w7Var3 == w7.f26174g) {
                                z12 = true;
                            }
                        }
                        if (!z12) {
                            BrazeLogger.brazelog$default(brazeLogger, (Object) e2Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.q1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.e2.i();
                                }
                            }, 7, (Object) null);
                            r7 r7Var2 = e2Var.f25408d;
                            List events = CollectionsKt.listOf(event);
                            Intrinsics.checkNotNullParameter(events, "events");
                            r7Var2.b(new o5(n5.f25787a, events, null, null, 12), o5.class);
                        } else {
                            r7 r7Var3 = e2Var.f25408d;
                            List events2 = CollectionsKt.listOf(event);
                            Intrinsics.checkNotNullParameter(events2, "events");
                            r7Var3.b(new o5(n5.f25788b, events2, null, null, 12), o5.class);
                        }
                        if (thisRef.f25632a == w7.f26192y) {
                            r7 r7Var4 = e2Var.f25408d;
                            m5 m5Var = o5.f25848e;
                            ra raVar = thisRef.f25637f;
                            KProperty property = k1.f25631h[1];
                            raVar.getClass();
                            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                            Intrinsics.checkNotNullParameter(property, "property");
                            r7Var4.b(m5Var.a((ye) raVar.f25987a), o5.class);
                        }
                        if (z11) {
                            BrazeLogger.brazelog$default(brazeLogger, (Object) e2Var, priority, (Throwable) null, false, new Function0() { // from class: c3.r1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.e2.j();
                                }
                            }, 6, (Object) null);
                            C0.a.b(e2Var.f25421q, null, 1, null);
                            d10 = AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new d2(e2Var, null), 3, null);
                            e2Var.f25421q = d10;
                        }
                        return true;
                    }
                }
                z10 = false;
                if (z10) {
                }
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.m1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.e2.d(bo.app.y8.this);
                    }
                }, 7, (Object) null);
                z11 = true;
                if (this.f25406b.length() != 0) {
                }
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.o1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.e2.f(bo.app.y8.this);
                    }
                }, 6, (Object) null);
                thisRef = (k1) event;
                w7Var = thisRef.f25632a;
                w7Var2 = w7.f26175h;
                if (w7Var != w7Var2) {
                }
                if (thisRef.f25632a == w7.f26177j) {
                }
                e2Var.f25411g.a(event);
                if (z11) {
                }
                if (!z12) {
                }
                if (thisRef.f25632a == w7.f26192y) {
                }
                if (z11) {
                }
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.I0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.a(bo.app.e2.this, event);
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String a(e2 e2Var, y8 y8Var) {
        return "SDK delayed initialization mode: " + e2Var.f25417m.c() + " and GDPR disabled mode: " + e2Var.f25413i.a() + ". Not logging event: " + y8Var;
    }

    public final void a(kb respondWithBuilder) {
        Intrinsics.checkNotNullParameter(respondWithBuilder, "respondWithBuilder");
        Pair a10 = this.f25410f.a();
        if (a10 != null) {
            jb outboundConfigParams = new jb(((Number) a10.getFirst()).longValue(), ((Boolean) a10.getSecond()).booleanValue());
            Intrinsics.checkNotNullParameter(outboundConfigParams, "outboundConfigParams");
            respondWithBuilder.f25666c = outboundConfigParams;
        }
        if (this.f25424t.get()) {
            respondWithBuilder.f25665b = Boolean.TRUE;
        }
        respondWithBuilder.f25664a = this.f25406b;
        a(new l4(this.f25410f, this.f25409e.getBaseUrlForRequests(), new lb(respondWithBuilder.f25664a, respondWithBuilder.f25665b, respondWithBuilder.f25666c)));
        this.f25424t.set(false);
    }

    public final void a(IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.X0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.u();
            }
        }, 7, (Object) null);
        y8 a10 = k1.f25630g.a(location);
        if (a10 != null) {
            k1 k1Var = (k1) a10;
            k1Var.f25636e.setValue(k1Var, k1.f25631h[0], this.f25406b);
            a(new s8(this.f25410f, this.f25409e.getBaseUrlForRequests(), a10, this.f25406b));
        }
    }

    public final void a(j2 requestInitiatedBy) {
        Intrinsics.checkNotNullParameter(requestInitiatedBy, "requestInitiatedBy");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.q();
            }
        }, 7, (Object) null);
        a(new k8(this.f25410f, this.f25409e.getBaseUrlForRequests(), this.f25406b, requestInitiatedBy));
    }

    public final void a(ArrayList ids, List pendingDismissals) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(pendingDismissals, "pendingDismissals");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.p();
            }
        }, 7, (Object) null);
        a(new h0(ids, pendingDismissals, this.f25410f, this.f25409e.getBaseUrlForRequests(), this.f25406b));
    }

    public final void a(i2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!this.f25413i.a() && !this.f25417m.c()) {
            request.f25541b = this.f25406b;
            r7 r7Var = this.f25408d;
            Intrinsics.checkNotNullParameter(request, "request");
            r7Var.b(new o5(n5.f25790d, null, null, request, 6), o5.class);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.J0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.b(bo.app.e2.this);
            }
        }, 6, (Object) null);
    }

    public final void a(long j10, long j11, j2 requestInitiatedBy) {
        Intrinsics.checkNotNullParameter(requestInitiatedBy, "requestInitiatedBy");
        if (!this.f25410f.F()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.S0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.e2.r();
                }
            }, 6, (Object) null);
        } else {
            a(new y3(this.f25410f, this.f25409e.getBaseUrlForRequests(), j10, j11, this.f25406b, requestInitiatedBy));
        }
    }

    public final boolean a(Throwable th2) {
        ReentrantLock reentrantLock = this.f25420p;
        reentrantLock.lock();
        try {
            this.f25418n.getAndIncrement();
            if (Intrinsics.areEqual(this.f25423s, th2.getMessage()) && this.f25419o.get() > 3 && this.f25418n.get() < 25) {
                reentrantLock.unlock();
                return true;
            }
            if (Intrinsics.areEqual(this.f25423s, th2.getMessage())) {
                this.f25419o.getAndIncrement();
            } else {
                this.f25419o.set(0);
            }
            if (this.f25418n.get() >= 25) {
                this.f25418n.set(0);
            }
            this.f25423s = th2.getMessage();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29469D, (Throwable) null, true, new Function0() { // from class: c3.e1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.x();
            }
        }, 2, (Object) null);
        a(new ee(this.f25410f, this.f25409e.getBaseUrlForRequests(), this.f25406b, arrayList));
    }

    public final void a(final Throwable throwable, boolean z10) {
        y8 a10;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            if (a(throwable)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.g1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.e2.b(throwable);
                    }
                }, 6, (Object) null);
                return;
            }
            String th2 = throwable.toString();
            String str = f25404u[0];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = th2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) str, false, 2, (Object) null) || (a10 = k1.f25630g.a(throwable, this.f25407c.h(), z10)) == null) {
                return;
            }
            a(a10);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.h1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.e2.g();
                }
            }, 4, (Object) null);
        }
    }

    public final void a(final long j10) {
        Object systemService = this.f25405a.getSystemService("alarm");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        Intent intent = new Intent(this.f25405a, (Class<?>) BrazeFlushPushDeliveryReceiver.class);
        intent.setAction("com.braze.FLUSH_PUSH_DELIVERY");
        int i10 = 0;
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f25405a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 134217728);
        if (j10 <= 0) {
            alarmManager.cancel(broadcast);
            hc hcVar = this.f25415k;
            hcVar.getClass();
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = hcVar.f25517a;
            reentrantLock.lock();
            try {
                ArrayList arrayList2 = hcVar.f25518b;
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    dc dcVar = (dc) obj;
                    if (arrayList.size() >= 32) {
                        break;
                    } else {
                        arrayList.add(dcVar);
                    }
                }
                hcVar.f25518b.removeAll(arrayList);
                reentrantLock.unlock();
                if (!arrayList.isEmpty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.K0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.e2.m();
                        }
                    }, 7, (Object) null);
                    a(new ic(this.f25410f, this.f25409e.getBaseUrlForRequests(), this.f25406b, arrayList));
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.L0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.e2.n();
                        }
                    }, 7, (Object) null);
                    return;
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.M0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.b(j10);
            }
        }, 7, (Object) null);
        alarmManager.set(2, SystemClock.elapsedRealtime() + j10, broadcast);
    }

    public final void a(final String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.V0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.e2.b(campaignId);
            }
        }, 7, (Object) null);
        this.f25415k.a(campaignId);
    }
}
