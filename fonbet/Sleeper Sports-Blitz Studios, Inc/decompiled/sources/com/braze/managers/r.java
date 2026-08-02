package com.braze.managers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.C;
import com.braze.BrazeFlushPushDeliveryReceiver;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.models.IBrazeLocation;
import com.braze.storage.b3;
import com.braze.storage.m2;
import com.braze.storage.s1;
import com.braze.storage.v2;
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
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class r implements m0 {
    public static final String[] u = {"android.os.deadsystemexception"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f602a;
    public final String b;
    public final w c;
    public final com.braze.events.e d;
    public final BrazeConfigurationProvider e;
    public final b3 f;
    public final h0 g;
    public final s h;
    public final v2 i;
    public final y0 j;
    public final v0 k;
    public final m2 l;
    public final com.braze.storage.t0 m;
    public final AtomicInteger n;
    public final AtomicInteger o;
    public final ReentrantLock p;
    public Job q;
    public final s1 r;
    public volatile String s;
    public final AtomicBoolean t;

    public r(Context context, String str, String apiKey, w sessionManager, com.braze.events.e internalEventPublisher, BrazeConfigurationProvider configurationProvider, b3 serverConfigStorageProvider, h0 eventStorageManager, s messagingSessionManager, v2 sdkEnablementProvider, y0 pushMaxManager, v0 pushDeliveryManager, m2 pushIdentifierStorageProvider, com.braze.storage.t0 delayedInitializationProvider) {
        CompletableJob Job$default;
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
        this.f602a = context;
        this.b = str;
        this.c = sessionManager;
        this.d = internalEventPublisher;
        this.e = configurationProvider;
        this.f = serverConfigStorageProvider;
        this.g = eventStorageManager;
        this.h = messagingSessionManager;
        this.i = sdkEnablementProvider;
        this.j = pushMaxManager;
        this.k = pushDeliveryManager;
        this.l = pushIdentifierStorageProvider;
        this.m = delayedInitializationProvider;
        this.n = new AtomicInteger(0);
        this.o = new AtomicInteger(0);
        this.p = new ReentrantLock();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.q = Job$default;
        this.r = new s1(context, str, apiKey);
        this.s = "";
        this.t = new AtomicBoolean(false);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.a();
            }
        }, 6, (Object) null);
        com.braze.events.d dVar = (com.braze.events.d) internalEventPublisher;
        dVar.c(com.braze.events.internal.s.class, new IEventSubscriber() { // from class: com.braze.managers.r$$ExternalSyntheticLambda8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                r.a(r.this, (com.braze.events.internal.s) obj);
            }
        });
        dVar.c(com.braze.events.internal.u.class, new IEventSubscriber() { // from class: com.braze.managers.r$$ExternalSyntheticLambda9
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                r.a(r.this, (com.braze.events.internal.u) obj);
            }
        });
        dVar.c(com.braze.events.internal.v.class, new IEventSubscriber() { // from class: com.braze.managers.r$$ExternalSyntheticLambda10
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                r.a(r.this, (com.braze.events.internal.v) obj);
            }
        });
    }

    public static final String a() {
        return "BrazeManager init called";
    }

    public static final String c(r rVar) {
        return "SDK delayed initialization mode: " + rVar.m.c() + " and GDPR disabled mode: " + rVar.i.a() + ". Not closing session.";
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

    public static final String r() {
        return "Posting feature flags refresh request.";
    }

    public static final String s() {
        return "Disallowing Content Cards sync due to Content Cards not being enabled.";
    }

    public static final String u() {
        return "Requesting DUST mite";
    }

    public static final String v() {
        return "Posting geofence request for location.";
    }

    public static final String x() {
        return "Sending Push Max data";
    }

    public static final String y() {
        return "Posting SDK Debugger Logs request.";
    }

    public final void b(a activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.i.a() || this.m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.f(r.this);
                }
            }, 6, (Object) null);
        } else {
            this.c.c(activity.f573a.toString());
            this.h.b();
        }
    }

    public final void d() {
        if (this.i.a() || this.m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.d(r.this);
                }
            }, 6, (Object) null);
        } else {
            this.c.l();
        }
    }

    public final void g(com.braze.models.k geofenceEvent) {
        Intrinsics.checkNotNullParameter(geofenceEvent, "geofenceEvent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.o();
            }
        }, 7, (Object) null);
        com.braze.models.outgoing.event.b bVar = (com.braze.models.outgoing.event.b) geofenceEvent;
        bVar.e.setValue(bVar, com.braze.models.outgoing.event.b.h[0], this.b);
        a(new com.braze.requests.l(this.f, this.e.getBaseUrlForRequests(), bVar));
    }

    public final void l() {
        if (this.i.a() || this.m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.e(r.this);
                }
            }, 6, (Object) null);
        } else {
            this.c.c((String) null);
        }
    }

    public final void q() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.r();
            }
        }, 7, (Object) null);
        a(new com.braze.requests.j(this.f, this.e.getBaseUrlForRequests(), this.b));
    }

    public final void t() {
        if (this.f.F()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.u();
                }
            }, 6, (Object) null);
            a(new com.braze.requests.h(this.f, this.e.getBaseUrlForRequests(), this.b));
        }
    }

    public final void w() {
        List list;
        if (this.f.L()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.x();
                }
            }, 7, (Object) null);
            b3 b3Var = this.f;
            String baseUrlForRequests = this.e.getBaseUrlForRequests();
            String str = this.b;
            y0 y0Var = this.j;
            Object readData = y0Var.b.readData(DataStoreKey.PUSH_MAX_LAST_UPDATE, -1L);
            Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) readData).longValue() - y0Var.f616a.u();
            List a2 = y0Var.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : a2) {
                if (((w0) obj).b > longValue) {
                    arrayList.add(obj);
                }
            }
            List list2 = CollectionsKt.toList(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((w0) it.next()).f612a);
            }
            Object readData2 = this.j.b.readData(DataStoreKey.PUSH_MAX_LAST_UPDATE, -1L);
            Intrinsics.checkNotNull(readData2, "null cannot be cast to non-null type kotlin.Long");
            long longValue2 = ((Long) readData2).longValue();
            m2 m2Var = this.l;
            long v = this.f.v();
            if (v <= 0) {
                list = CollectionsKt.emptyList();
            } else {
                long nowInSeconds = DateTimeUtils.nowInSeconds() - v;
                Map a3 = m2Var.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : a3.entrySet()) {
                    if (((Number) entry.getValue()).longValue() >= nowInSeconds) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                list = CollectionsKt.toList(linkedHashMap.keySet());
            }
            a(new com.braze.requests.s(b3Var, baseUrlForRequests, str, arrayList2, longValue2, list));
        }
    }

    public static final void a(r rVar, com.braze.events.internal.s it) {
        Intrinsics.checkNotNullParameter(it, "it");
        throw null;
    }

    public static final String e(r rVar) {
        return "SDK delayed initialization mode: " + rVar.m.c() + " and GDPR disabled mode: " + rVar.i.a() + ". Not opening session.";
    }

    public static final String f(r rVar) {
        return "SDK delayed initialization mode: " + rVar.m.c() + " and GDPR disabled mode: " + rVar.i.a() + ". Not opening session.";
    }

    public static final void a(r rVar, com.braze.events.internal.u it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) rVar, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.e();
            }
        }, 6, (Object) null);
        rVar.b();
    }

    public static final String c(com.braze.models.k kVar) {
        return "Not processing event after validation failed: " + kVar;
    }

    public static final String e(com.braze.models.k kVar) {
        return "Not adding user id to event: " + JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) kVar).getJsonKey());
    }

    public static final String f(com.braze.models.k kVar) {
        return "Attempting to log event: " + JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) kVar).getJsonKey());
    }

    public final void c(String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.k();
            }
        }, 7, (Object) null);
        this.j.a(campaignId);
    }

    public static final void a(r rVar, com.braze.events.internal.v it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) rVar, BrazeLogger.Priority.D, (Throwable) null, true, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.f();
            }
        }, 2, (Object) null);
        rVar.b(it.f536a);
    }

    public static final String c() {
        return "Requesting SDK Debugger Handshake";
    }

    public final void a(boolean z) {
        this.t.set(z);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.a(r.this);
            }
        }, 6, (Object) null);
    }

    public static final String a(r rVar) {
        return "Updated shouldRequestTriggersInNextRequest to: " + rVar.t;
    }

    public static final String g() {
        return "Failed to log error.";
    }

    public final void a(a activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!this.i.a() && !this.m.c()) {
            this.h.e();
            w wVar = this.c;
            String cls = activity.f573a.toString();
            Intrinsics.checkNotNullExpressionValue(cls, "toString(...)");
            wVar.a(cls);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.c(r.this);
            }
        }, 6, (Object) null);
    }

    public static final String d(r rVar) {
        return "SDK delayed initialization mode: " + rVar.m.c() + " and GDPR disabled mode: " + rVar.i.a() + ". Not force closing session.";
    }

    public static final String d(com.braze.models.k kVar) {
        return "Not adding session id to event: " + JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) kVar).getJsonKey());
    }

    public static final String b(com.braze.models.k kVar) {
        return "BrazeManager logEvent called for: " + JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) kVar).getJsonKey());
    }

    public static final String b(r rVar) {
        return "SDK delayed initialization mode: " + rVar.m.c() + " and GDPR disabled mode: " + rVar.i.a() + ". Not adding request to dispatch.";
    }

    public final void b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, true, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.y();
            }
        }, 2, (Object) null);
        a(new com.braze.requests.x(this.f, this.e.getBaseUrlForRequests(), this.b, arrayList));
    }

    public static final String b(Throwable th) {
        return "Not logging duplicate error: " + th;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(final com.braze.models.k event) {
        boolean z;
        boolean z2;
        String str;
        com.braze.models.outgoing.event.b thisRef;
        com.braze.enums.d dVar;
        com.braze.enums.d dVar2;
        r rVar;
        Job launch$default;
        Intrinsics.checkNotNullParameter(event, "event");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.b(com.braze.models.k.this);
            }
        }, 6, (Object) null);
        boolean z3 = false;
        if (!this.i.a() && !this.m.c()) {
            if (!this.r.a(event)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.c(com.braze.models.k.this);
                    }
                }, 6, (Object) null);
                return false;
            }
            w wVar = this.c;
            ReentrantLock reentrantLock = wVar.h;
            reentrantLock.lock();
            try {
                com.braze.models.n nVar = wVar.l;
                if (nVar != null) {
                    if (nVar.d) {
                        z = true;
                        if (z && this.c.h() != null) {
                            ((com.braze.models.outgoing.event.b) event).a(this.c.h());
                            z2 = false;
                        } else {
                            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda21
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return r.d(com.braze.models.k.this);
                                }
                            }, 7, (Object) null);
                            z2 = true;
                        }
                        str = this.b;
                        if (str == null && str.length() != 0) {
                            com.braze.models.outgoing.event.b bVar = (com.braze.models.outgoing.event.b) event;
                            bVar.e.setValue(bVar, com.braze.models.outgoing.event.b.h[0], this.b);
                        } else {
                            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda23
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return r.e(com.braze.models.k.this);
                                }
                            }, 7, (Object) null);
                        }
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return r.f(com.braze.models.k.this);
                            }
                        }, 6, (Object) null);
                        thisRef = (com.braze.models.outgoing.event.b) event;
                        dVar = thisRef.f640a;
                        dVar2 = com.braze.enums.d.h;
                        if (dVar != dVar2) {
                            rVar = this;
                            BrazeLogger.brazelog$default(brazeLogger, (Object) rVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda25
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return r.h();
                                }
                            }, 7, (Object) null);
                            com.braze.models.outgoing.event.push.c notificationTrackingBrazeEvent = (com.braze.models.outgoing.event.push.c) event;
                            Intrinsics.checkNotNullParameter(notificationTrackingBrazeEvent, "notificationTrackingBrazeEvent");
                            String optString = notificationTrackingBrazeEvent.b.optString("cid", "");
                            com.braze.events.e eVar = rVar.d;
                            Intrinsics.checkNotNull(optString);
                            ((com.braze.events.d) eVar).b(new com.braze.events.internal.e0(optString, notificationTrackingBrazeEvent), com.braze.events.internal.e0.class);
                        } else {
                            rVar = this;
                        }
                        if (thisRef.f640a == com.braze.enums.d.j || !thisRef.b.optBoolean("nop", false)) {
                            rVar.g.a(event);
                        }
                        if (z2) {
                            com.braze.enums.d dVar3 = thisRef.f640a;
                            if (dVar3 == com.braze.enums.d.i) {
                                Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.braze.models.outgoing.event.push.PushActionButtonClickedEvent");
                                z3 = !((com.braze.models.outgoing.event.push.a) event).i;
                            } else if (dVar3 == dVar2 || dVar3 == com.braze.enums.d.g) {
                                z3 = true;
                            }
                        }
                        if (!z3) {
                            BrazeLogger.brazelog$default(brazeLogger, (Object) rVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda26
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return r.i();
                                }
                            }, 7, (Object) null);
                            com.braze.events.e eVar2 = rVar.d;
                            List events = CollectionsKt.listOf(event);
                            Intrinsics.checkNotNullParameter(events, "events");
                            ((com.braze.events.d) eVar2).b(new com.braze.events.internal.dispatchmanager.c(com.braze.events.internal.dispatchmanager.b.f517a, events, null, null, 12), com.braze.events.internal.dispatchmanager.c.class);
                        } else {
                            com.braze.events.e eVar3 = rVar.d;
                            List events2 = CollectionsKt.listOf(event);
                            Intrinsics.checkNotNullParameter(events2, "events");
                            ((com.braze.events.d) eVar3).b(new com.braze.events.internal.dispatchmanager.c(com.braze.events.internal.dispatchmanager.b.b, events2, null, null, 12), com.braze.events.internal.dispatchmanager.c.class);
                        }
                        if (thisRef.f640a == com.braze.enums.d.y) {
                            com.braze.events.e eVar4 = rVar.d;
                            com.braze.events.internal.dispatchmanager.a aVar = com.braze.events.internal.dispatchmanager.c.e;
                            com.braze.support.delegates.a aVar2 = thisRef.f;
                            KProperty property = com.braze.models.outgoing.event.b.h[1];
                            aVar2.getClass();
                            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                            Intrinsics.checkNotNullParameter(property, "property");
                            ((com.braze.events.d) eVar4).b(aVar.a((com.braze.models.q) aVar2.f776a), com.braze.events.internal.dispatchmanager.c.class);
                        }
                        if (z2) {
                            BrazeLogger.brazelog$default(brazeLogger, (Object) rVar, priority, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda27
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return r.j();
                                }
                            }, 6, (Object) null);
                            Job.DefaultImpls.cancel$default(rVar.q, (CancellationException) null, 1, (Object) null);
                            launch$default = BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new q(this, null), 3, null);
                            rVar.q = launch$default;
                        }
                        return true;
                    }
                }
                z = false;
                if (z) {
                }
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.d(com.braze.models.k.this);
                    }
                }, 7, (Object) null);
                z2 = true;
                str = this.b;
                if (str == null) {
                }
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.e(com.braze.models.k.this);
                    }
                }, 7, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.f(com.braze.models.k.this);
                    }
                }, 6, (Object) null);
                thisRef = (com.braze.models.outgoing.event.b) event;
                dVar = thisRef.f640a;
                dVar2 = com.braze.enums.d.h;
                if (dVar != dVar2) {
                }
                if (thisRef.f640a == com.braze.enums.d.j) {
                }
                rVar.g.a(event);
                if (z2) {
                }
                if (!z3) {
                }
                if (thisRef.f640a == com.braze.enums.d.y) {
                }
                if (z2) {
                }
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.a(r.this, event);
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String b(long j) {
        return "Scheduling Push Delivery Events Flush in " + j + " ms";
    }

    public static final String b(String str) {
        return "Logging push delivery event for campaign id: " + str;
    }

    public final void b() {
        if (this.f.M()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.c();
                }
            }, 6, (Object) null);
            a(new com.braze.requests.w(this.f, this.e.getBaseUrlForRequests(), this.b));
        }
    }

    public static final String a(r rVar, com.braze.models.k kVar) {
        return "SDK delayed initialization mode: " + rVar.m.c() + " and GDPR disabled mode: " + rVar.i.a() + ". Not logging event: " + kVar;
    }

    public final void a(com.braze.models.outgoing.j respondWithBuilder) {
        Intrinsics.checkNotNullParameter(respondWithBuilder, "respondWithBuilder");
        Pair a2 = this.f.a();
        if (a2 != null) {
            com.braze.models.outgoing.i outboundConfigParams = new com.braze.models.outgoing.i(((Number) a2.getFirst()).longValue(), ((Boolean) a2.getSecond()).booleanValue());
            Intrinsics.checkNotNullParameter(outboundConfigParams, "outboundConfigParams");
            respondWithBuilder.c = outboundConfigParams;
        }
        if (this.t.get()) {
            respondWithBuilder.b = Boolean.TRUE;
        }
        respondWithBuilder.f644a = this.b;
        a(new com.braze.requests.g(this.f, this.e.getBaseUrlForRequests(), respondWithBuilder.a()));
        this.t.set(false);
    }

    public final void a(IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.v();
            }
        }, 7, (Object) null);
        com.braze.models.k a2 = com.braze.models.outgoing.event.b.g.a(location);
        if (a2 != null) {
            com.braze.models.outgoing.event.b bVar = (com.braze.models.outgoing.event.b) a2;
            bVar.e.setValue(bVar, com.braze.models.outgoing.event.b.h[0], this.b);
            a(new com.braze.requests.k(this.f, this.e.getBaseUrlForRequests(), a2, this.b));
        }
    }

    public final void a(ArrayList ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.p();
            }
        }, 7, (Object) null);
        a(new com.braze.requests.a(ids, this.f, this.e.getBaseUrlForRequests(), this.b));
    }

    public final void a(com.braze.requests.b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!this.i.a() && !this.m.c()) {
            request.b = this.b;
            com.braze.events.e eVar = this.d;
            Intrinsics.checkNotNullParameter(request, "request");
            ((com.braze.events.d) eVar).b(new com.braze.events.internal.dispatchmanager.c(com.braze.events.internal.dispatchmanager.b.d, null, null, request, 6), com.braze.events.internal.dispatchmanager.c.class);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.b(r.this);
            }
        }, 6, (Object) null);
    }

    public final void a(long j, long j2, int i, com.braze.requests.c requestInitiatedBy) {
        Intrinsics.checkNotNullParameter(requestInitiatedBy, "requestInitiatedBy");
        if (!this.f.E()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.s();
                }
            }, 6, (Object) null);
        } else {
            a(new com.braze.requests.f(this.f, this.e.getBaseUrlForRequests(), j, j2, this.b, i, requestInitiatedBy));
        }
    }

    public final boolean a(Throwable th) {
        ReentrantLock reentrantLock = this.p;
        reentrantLock.lock();
        try {
            this.n.getAndIncrement();
            if (Intrinsics.areEqual(this.s, th.getMessage()) && this.o.get() > 3 && this.n.get() < 25) {
                reentrantLock.unlock();
                return true;
            }
            if (Intrinsics.areEqual(this.s, th.getMessage())) {
                this.o.getAndIncrement();
            } else {
                this.o.set(0);
            }
            if (this.n.get() >= 25) {
                this.n.set(0);
            }
            this.s = th.getMessage();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(final Throwable throwable, boolean z) {
        com.braze.models.k a2;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            if (a(throwable)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.b(throwable);
                    }
                }, 6, (Object) null);
                return;
            }
            String th = throwable.toString();
            String str = u[0];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = th.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) str, false, 2, (Object) null) || (a2 = com.braze.models.outgoing.event.b.g.a(throwable, this.c.h(), z)) == null) {
                return;
            }
            a(a2);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.g();
                }
            }, 4, (Object) null);
        }
    }

    public final void a(final long j) {
        Object systemService = this.f602a.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        Intent intent = new Intent(this.f602a, (Class<?>) BrazeFlushPushDeliveryReceiver.class);
        intent.setAction(BrazeFlushPushDeliveryReceiver.FLUSH_BRAZE_PUSH_DELIVERIES_ACTION);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f602a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | C.BUFFER_FLAG_FIRST_SAMPLE);
        if (j <= 0) {
            alarmManager.cancel(broadcast);
            v0 v0Var = this.k;
            v0Var.getClass();
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = v0Var.f610a;
            reentrantLock.lock();
            try {
                Iterator it = v0Var.b.iterator();
                while (it.hasNext()) {
                    com.braze.models.push.a aVar = (com.braze.models.push.a) it.next();
                    if (arrayList.size() >= 32) {
                        break;
                    } else {
                        arrayList.add(aVar);
                    }
                }
                v0Var.b.removeAll(arrayList);
                reentrantLock.unlock();
                if (!arrayList.isEmpty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda33
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return r.m();
                        }
                    }, 7, (Object) null);
                    a(new com.braze.requests.r(this.f, this.e.getBaseUrlForRequests(), this.b, arrayList));
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda34
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return r.n();
                        }
                    }, 7, (Object) null);
                    return;
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.b(j);
            }
        }, 7, (Object) null);
        alarmManager.set(2, SystemClock.elapsedRealtime() + j, broadcast);
    }

    public final void a(final String campaignId) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.r$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.b(campaignId);
            }
        }, 7, (Object) null);
        this.k.a(campaignId);
    }
}
