package F8;

import F8.j;
import com.appsflyer.AdRevenueScheme;
import com.facebook.react.uimanager.ViewProps;
import com.giphy.sdk.analytics.models.AnalyticsEvent;
import com.giphy.sdk.analytics.models.Session;
import com.giphy.sdk.analytics.models.enums.ActionType;
import com.giphy.sdk.analytics.models.enums.EventType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: n, reason: collision with root package name */
    public static final a f3598n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static long f3599o = 3000;

    /* renamed from: p, reason: collision with root package name */
    public static long f3600p = 10000;

    /* renamed from: q, reason: collision with root package name */
    public static int f3601q = 100;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f3602r;

    /* renamed from: a, reason: collision with root package name */
    public final String f3603a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3604b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3605c;

    /* renamed from: d, reason: collision with root package name */
    public final i f3606d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3607e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f3608f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f3609g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f3610h;

    /* renamed from: i, reason: collision with root package name */
    public ScheduledFuture f3611i;

    /* renamed from: j, reason: collision with root package name */
    public final j f3612j;

    /* renamed from: k, reason: collision with root package name */
    public final List f3613k;

    /* renamed from: l, reason: collision with root package name */
    public final F8.a f3614l;

    /* renamed from: m, reason: collision with root package name */
    public final Runnable f3615m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public e(String apiKey, boolean z10, boolean z11, i submissionQueue, boolean z12) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(submissionQueue, "submissionQueue");
        this.f3603a = apiKey;
        this.f3604b = z10;
        this.f3605c = z11;
        this.f3606d = submissionQueue;
        this.f3607e = z12;
        this.f3614l = new F8.a(apiKey, z10, z11);
        this.f3615m = new Runnable() { // from class: F8.b
            @Override // java.lang.Runnable
            public final void run() {
                e.e(e.this);
            }
        };
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this.f3608f = newSingleThreadScheduledExecutor;
        this.f3609g = new HashMap();
        this.f3613k = new ArrayList();
        this.f3612j = new j();
    }

    public static final void e(e this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k();
        this$0.l();
    }

    public static final void g(e this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k();
        this$0.n();
        this$0.f3606d.i();
    }

    public static final void m(e this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.n();
    }

    public final void d(String loggedInUserId, String str, String str2, EventType eventType, String mediaId, String str3, ActionType actionType, String str4, String str5, int i10, String str6) {
        j.a a10;
        int size;
        String analyticsResponsePayload = str;
        Intrinsics.checkNotNullParameter(loggedInUserId, "loggedInUserId");
        Intrinsics.checkNotNullParameter(analyticsResponsePayload, "analyticsResponsePayload");
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        synchronized (this.f3612j) {
            try {
                if (f3602r) {
                    analyticsResponsePayload = analyticsResponsePayload + "&mode=verification";
                }
                a10 = this.f3612j.a(this.f3614l.b(), loggedInUserId, this.f3614l.c(), analyticsResponsePayload, str2, eventType, mediaId, str3, actionType, str4, str5, i10, str6);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f3613k) {
            try {
                List list = this.f3613k;
                if (a10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pingbackWrapper");
                    a10 = null;
                }
                list.add(a10);
                size = this.f3613k.size();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ScheduledFuture scheduledFuture = this.f3610h;
        if (scheduledFuture != null) {
            Intrinsics.checkNotNull(scheduledFuture);
            if (!scheduledFuture.isCancelled()) {
                ScheduledFuture scheduledFuture2 = this.f3610h;
                Intrinsics.checkNotNull(scheduledFuture2);
                scheduledFuture2.cancel(false);
            }
        }
        if (str3 != null) {
            f();
        } else if (size < f3601q) {
            this.f3610h = this.f3608f.schedule(this.f3615m, f3599o, TimeUnit.MILLISECONDS);
        } else {
            this.f3608f.execute(this.f3615m);
        }
    }

    public final void f() {
        this.f3608f.execute(new Runnable() { // from class: F8.d
            @Override // java.lang.Runnable
            public final void run() {
                e.g(e.this);
            }
        });
    }

    public final String h(String str) {
        return "user:" + str;
    }

    public final F8.a i() {
        return this.f3614l;
    }

    public final Session j(String str, String str2) {
        String p10 = p(str, str2);
        Session session = (Session) this.f3609g.get(p10);
        if (session != null) {
            return session;
        }
        Session session2 = new Session(str, null, 2, null);
        this.f3609g.put(p10, session2);
        return session2;
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f3613k) {
            arrayList.addAll(this.f3613k);
            this.f3613k.clear();
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j.a aVar = (j.a) it.next();
            HashMap hashMap = new HashMap();
            Session j10 = j(aVar.k(), aVar.n());
            String d10 = aVar.d();
            if (d10 != null) {
                hashMap.put("layout_type", d10);
            }
            if (aVar.h() >= 0) {
                String num = Integer.toString(aVar.h());
                Intrinsics.checkNotNullExpressionValue(num, "toString(pingbackWrapper.position)");
                hashMap.put(ViewProps.POSITION, num);
            }
            String g10 = aVar.g();
            if (g10 != null) {
                hashMap.put(AdRevenueScheme.PLACEMENT, g10);
            }
            ArrayList arrayList2 = arrayList;
            j10.getEvents().add(new AnalyticsEvent(aVar.b(), aVar.c(), aVar.a(), aVar.f(), aVar.l(), aVar.m(), hashMap, aVar.n(), aVar.e(), aVar.i()));
            if (E8.a.f3012a.d()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(String.format("Event added %s %s %s | %s %s %s %s | %s | %s %s %s", Arrays.copyOf(new Object[]{aVar.a(), aVar.f(), Long.valueOf(aVar.m()), aVar.b(), aVar.i(), aVar.j(), aVar.c(), aVar.k(), aVar.d(), Integer.valueOf(aVar.h()), aVar.g()}, 11)), "format(...)");
            }
            if (j10.getEvents().size() >= f3601q) {
                o(j10);
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = arrayList;
        synchronized (this.f3612j) {
            try {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    j.a eventWrapper = (j.a) it2.next();
                    j jVar = this.f3612j;
                    Intrinsics.checkNotNullExpressionValue(eventWrapper, "eventWrapper");
                    jVar.b(eventWrapper);
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        ScheduledFuture scheduledFuture = this.f3611i;
        if (scheduledFuture != null) {
            Intrinsics.checkNotNull(scheduledFuture);
            if (!scheduledFuture.isCancelled()) {
                ScheduledFuture scheduledFuture2 = this.f3611i;
                Intrinsics.checkNotNull(scheduledFuture2);
                scheduledFuture2.cancel(false);
            }
        }
        this.f3611i = this.f3608f.schedule(new Runnable() { // from class: F8.c
            @Override // java.lang.Runnable
            public final void run() {
                e.m(e.this);
            }
        }, f3600p, TimeUnit.MILLISECONDS);
    }

    public final void n() {
        Iterator it = this.f3609g.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.next().value");
            Session session = (Session) value;
            if (!session.getEvents().isEmpty()) {
                if (E8.a.f3012a.d()) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(String.format("Enqueueing session %s %s", Arrays.copyOf(new Object[]{session.getSessionId(), Integer.valueOf(session.getEvents().size())}, 2)), "format(...)");
                }
                this.f3606d.g(session);
            }
            it.remove();
        }
    }

    public final void o(Session session) {
        if (E8.a.f3012a.d()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(String.format("Enqueueing ready session %s %s", Arrays.copyOf(new Object[]{session.getSessionId(), Integer.valueOf(session.getEvents().size())}, 2)), "format(...)");
        }
        this.f3606d.g(session);
        HashMap hashMap = this.f3609g;
        String sessionId = session.getSessionId();
        String userId = session.getUserId();
        if (userId == null) {
            userId = "";
        }
        hashMap.remove(p(sessionId, userId));
    }

    public final String p(String str, String str2) {
        return (str == null || str.length() == 0) ? h(str2) : str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ e(String str, boolean z10, boolean z11, i iVar, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, z11, (i10 & 8) != 0 ? new i(str, z10, z11) : iVar, (i10 & 16) != 0 ? false : z12);
        z10 = (i10 & 2) != 0 ? false : z10;
        z11 = (i10 & 4) != 0 ? false : z11;
    }
}
