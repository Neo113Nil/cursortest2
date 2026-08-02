package F8;

import com.giphy.sdk.analytics.models.Session;
import com.giphy.sdk.analytics.network.response.PingbackResponse;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    public static final a f3620g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static int f3621h = 10;

    /* renamed from: i, reason: collision with root package name */
    public static long f3622i = 5000;

    /* renamed from: j, reason: collision with root package name */
    public static long f3623j = 3;

    /* renamed from: a, reason: collision with root package name */
    public int f3624a;

    /* renamed from: b, reason: collision with root package name */
    public ScheduledFuture f3625b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f3626c;

    /* renamed from: d, reason: collision with root package name */
    public G8.a f3627d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f3628e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f3629f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements K8.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Session f3631b;

        public b(Session session) {
            this.f3631b = session;
        }

        @Override // K8.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PingbackResponse pingbackResponse, Throwable th2) {
            if (th2 != null) {
                if (E8.a.f3012a.d()) {
                    th2.getLocalizedMessage();
                }
                i.this.k().addLast(this.f3631b);
                i.this.o();
                i.this.m();
                return;
            }
            i.this.f3624a = 0;
            if (E8.a.f3012a.d()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(String.format("Successfully submitted session %s %s", Arrays.copyOf(new Object[]{this.f3631b.getSessionId(), Integer.valueOf(this.f3631b.getEvents().size())}, 2)), "format(...)");
            }
        }
    }

    public i(String apiKey, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        this.f3626c = executorService;
        this.f3628e = new LinkedList();
        this.f3629f = new Runnable() { // from class: F8.f
            @Override // java.lang.Runnable
            public final void run() {
                i.l(i.this);
            }
        };
        Intrinsics.checkNotNullExpressionValue(executorService, "executorService");
        Intrinsics.checkNotNullExpressionValue(executorService, "executorService");
        this.f3627d = new G8.b(apiKey, new L8.c(executorService, executorService), new F8.a(apiKey, z10, z11));
    }

    public static final void h(i this$0, Session session) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(session, "$session");
        if (this$0.f3628e.contains(session)) {
            return;
        }
        this$0.f3628e.addFirst(session);
        this$0.o();
        this$0.n();
    }

    public static final void j(i this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.n();
    }

    public static final void l(i this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.n();
    }

    public final void g(final Session session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f3626c.execute(new Runnable() { // from class: F8.g
            @Override // java.lang.Runnable
            public final void run() {
                i.h(i.this, session);
            }
        });
    }

    public final void i() {
        this.f3626c.execute(new Runnable() { // from class: F8.h
            @Override // java.lang.Runnable
            public final void run() {
                i.j(i.this);
            }
        });
    }

    public final LinkedList k() {
        return this.f3628e;
    }

    public final void m() {
        ScheduledFuture scheduledFuture = this.f3625b;
        if (scheduledFuture != null) {
            Intrinsics.checkNotNull(scheduledFuture);
            if (!scheduledFuture.isCancelled()) {
                ScheduledFuture scheduledFuture2 = this.f3625b;
                Intrinsics.checkNotNull(scheduledFuture2);
                scheduledFuture2.cancel(false);
            }
        }
        int i10 = this.f3624a;
        if (i10 < f3623j) {
            this.f3625b = this.f3626c.schedule(this.f3629f, f3622i * ((long) Math.pow(3.0d, i10)), TimeUnit.MILLISECONDS);
        } else {
            this.f3624a = i10 + 1;
        }
    }

    public final void n() {
        while (!this.f3628e.isEmpty()) {
            Session session = (Session) this.f3628e.pollFirst();
            if (session != null) {
                this.f3627d.a(session, new b(session));
            }
        }
    }

    public final void o() {
        while (this.f3628e.size() > f3621h) {
            if (E8.a.f3012a.d()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(String.format("trimming queued session because count == %s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f3628e.size())}, 1)), "format(...)");
            }
            LinkedList linkedList = this.f3628e;
            linkedList.remove(CollectionsKt.getLastIndex(linkedList));
        }
    }
}
