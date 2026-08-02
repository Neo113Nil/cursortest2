package hh0;

import C.o0;
import N3.C3660k;
import Sc.o;
import Yg0.a;
import Zg0.d;
import Zg0.g;
import Zg0.h;
import android.app.NotificationChannel;
import android.content.Context;
import androidx.core.app.n;
import bc.C5637m;
import ch.C5833d;
import ch.InterfaceC5830a;
import dh0.C6200a;
import eh0.c;
import fh0.AbstractC6566a;
import fh0.C6568c;
import fh0.C6569d;
import ih0.C7080a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jh0.C7429a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import oh0.C8736a;
import org.jetbrains.annotations.NotNull;
import qh0.C9059c;
import rh0.C9277d;
import ru.ozon.push.sdk.external.service.RemoteMessage;
import uh0.C10059a;
import yh0.C10906d;

/* renamed from: hh0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6957b implements InterfaceC6956a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f65506a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f65507b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C10906d f65508c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<h> f65509d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C9277d f65510e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C7080a f65511f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C10059a f65512g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Ah0.b f65513h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Ah0.a f65514i;

    /* renamed from: j, reason: collision with root package name */
    private final ph0.h f65515j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC5830a f65516k;

    /* renamed from: hh0.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65517a;

        static {
            int[] iArr = new int[h.a.values().length];
            try {
                iArr[h.a.IMPORTANCE_MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.a.IMPORTANCE_LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.a.IMPORTANCE_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.a.IMPORTANCE_HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.a.IMPORTANCE_MAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f65517a = iArr;
        }
    }

    /* renamed from: hh0.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C1068b extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f65518b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1068b(String str) {
            super(0);
            this.f65518b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return o0.c(new StringBuilder("The onDeletedMessages method was called from the service "), this.f65518b, ".");
        }
    }

    /* renamed from: hh0.b$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f65519b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f65519b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "onMessageReceived threadId is " + this.f65519b;
        }
    }

    /* renamed from: hh0.b$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RemoteMessage f65520b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C6568c f65521c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f65522d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(RemoteMessage remoteMessage, C6568c c6568c, long j11) {
            super(0);
            this.f65520b = remoteMessage;
            this.f65521c = c6568c;
            this.f65522d = j11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return P4.f.a(this.f65522d, " milliseconds", C3660k.c(this.f65521c.n(), "onMessageReceived ", this.f65520b.getF97687a(), " mapped to ", " in "));
        }
    }

    /* renamed from: hh0.b$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ eh0.c f65523b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(eh0.c cVar) {
            super(0);
            this.f65523b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "preShowHandlingResult is ".concat(this.f65523b.getClass().getName());
        }
    }

    /* renamed from: hh0.b$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ jh0.b f65524b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RemoteMessage f65525c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(jh0.b bVar, RemoteMessage remoteMessage) {
            super(0);
            this.f65524b = bVar;
            this.f65525c = remoteMessage;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f65524b + " push message was received (message id: " + this.f65525c.getF97687a() + ").";
        }
    }

    public C6957b(@NotNull Context context, @NotNull g configuration, @NotNull C10906d cloudMessageManager, @NotNull List notificationChannels, @NotNull C9277d liveActivityInteractor, @NotNull C7080a pushServiceStartupTracker, @NotNull C5637m pushChecker, @NotNull C10059a mapper, @NotNull Ah0.b deliveryStatusFallbackSenderScheduler, @NotNull Ah0.a lastPushMessageDataHolder, ph0.h hVar, InterfaceC5830a interfaceC5830a) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(cloudMessageManager, "cloudMessageManager");
        Intrinsics.checkNotNullParameter(notificationChannels, "notificationChannels");
        Intrinsics.checkNotNullParameter(liveActivityInteractor, "liveActivityInteractor");
        Intrinsics.checkNotNullParameter(pushServiceStartupTracker, "pushServiceStartupTracker");
        Intrinsics.checkNotNullParameter(pushChecker, "pushChecker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(deliveryStatusFallbackSenderScheduler, "deliveryStatusFallbackSenderScheduler");
        Intrinsics.checkNotNullParameter(lastPushMessageDataHolder, "lastPushMessageDataHolder");
        this.f65506a = context;
        this.f65507b = configuration;
        this.f65508c = cloudMessageManager;
        this.f65509d = notificationChannels;
        this.f65510e = liveActivityInteractor;
        this.f65511f = pushServiceStartupTracker;
        this.f65512g = mapper;
        this.f65513h = deliveryStatusFallbackSenderScheduler;
        this.f65514i = lastPushMessageDataHolder;
        this.f65515j = hVar;
        this.f65516k = interfaceC5830a;
    }

    @Override // hh0.InterfaceC6956a
    public final void a(@NotNull String serviceName) {
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        this.f65511f.c(serviceName);
    }

    @Override // hh0.InterfaceC6956a
    public final void b(@NotNull String token, @NotNull jh0.b pushTokenType) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(pushTokenType, "pushTokenType");
        Zg0.d b11 = C6200a.b();
        if (b11 instanceof d.b) {
            C6200a.c().a(C6200a.a("New " + pushTokenType + " push token was received (token: " + token + ")."), null);
            ((d.b) b11).getClass();
        }
        C7429a c7429a = new C7429a(token, pushTokenType, jh0.c.TOKEN_CHANGED_BY_PROVIDER);
        Yg0.a.f35038y.getClass();
        Yg0.a b12 = a.C0652a.b();
        ((Nh0.d) b12.v()).n(c7429a, b12.y());
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a5, code lost:
    
        if (r6 != null) goto L65;
     */
    @Override // hh0.InterfaceC6956a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(@NotNull RemoteMessage message, @NotNull jh0.b pushTokenType, @NotNull String serviceName) {
        String a11;
        boolean z11;
        h hVar;
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(pushTokenType, "pushTokenType");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        f fVar = new f(pushTokenType, message);
        Zg0.d b11 = C6200a.b();
        Object obj = null;
        if (b11 instanceof d.b) {
            C6200a.c().a(C6200a.a((String) fVar.invoke()), null);
            ((d.b) b11).getClass();
        }
        Intrinsics.checkNotNullParameter(message, "message");
        Map<String, String> b12 = message.b();
        boolean d11 = Intrinsics.d(b12.get("service"), "ozs");
        g gVar = this.f65507b;
        if (!d11 || !Intrinsics.d(b12.get("pw_msg"), "1") || (str = b12.get("message_id")) == null || !str.equals(b12.get("pw_msg_tag"))) {
            Zg0.d b13 = C6200a.b();
            if (b13 instanceof d.b) {
                C6200a.c().a(C6200a.a("The received push message isn't an Ozon push message."), null);
                ((d.b) b13).getClass();
            }
            Zg0.c e11 = gVar.e();
            if (e11.k()) {
                int i11 = sh0.b.f98783c;
                Tc.d builder = new Tc.d();
                int i12 = Jg0.a.f14752e;
                builder.put("isRooted", Boolean.valueOf(Jg0.a.a(this.f65506a)));
                Unit unit = Unit.f71690a;
                Intrinsics.checkNotNullParameter(builder, "builder");
                sh0.b.b("OzonPushServiceDelegate", null, null, builder.u(), hh0.d.f65527b, 4);
            }
            if (e11.h()) {
                return;
            }
        }
        String a12 = message.a();
        if (a12 != null) {
            this.f65514i.b(a12);
            if (gVar.e().l()) {
                this.f65513h.a(a12);
            }
        }
        C6568c a13 = this.f65512g.a(message);
        ph0.h hVar2 = this.f65515j;
        if (hVar2 != null) {
            hVar2.g(a13);
        }
        String s11 = a13.s();
        if (s11 == null || s11.length() == 0 || kotlin.text.h.K(s11)) {
            int i13 = sh0.b.f98783c;
            sh0.b.b("OzonPushServiceDelegate", message, null, U.i(new Pair("notification_id", Integer.valueOf(a13.n()))), new c(s11), 4);
        }
        Yg0.a.f35038y.getClass();
        Yg0.a b14 = a.C0652a.b();
        Long b15 = this.f65511f.b(serviceName);
        long longValue = b15 != null ? b15.longValue() : 0L;
        int i14 = sh0.b.f98783c;
        sh0.b.f("OzonPushServiceDelegate", sj.f.b(new Pair("message_id", message.getF97687a()), new Pair("notification_id", Integer.valueOf(a13.n()))), new d(message, a13, longValue), 4);
        eh0.c bVar = C6569d.a(a13) ? new c.b(a13) : b14.o().a(a13, message);
        C9059c h11 = bVar.getModel().h();
        if (h11 != null) {
            if (!h11.c()) {
                h11 = null;
            }
            if (h11 != null) {
                AbstractC6566a a14 = h11.a();
                if (a14 != null) {
                    a11 = a14.a();
                }
            }
        }
        AbstractC6566a g10 = bVar.getModel().g();
        a11 = g10 != null ? g10.a() : null;
        b14.i().c(message, longValue, a11, b14.y());
        if (!C6569d.a(a13)) {
            InterfaceC5830a interfaceC5830a = this.f65516k;
            if (interfaceC5830a != null) {
                new C5833d(a13.f());
                interfaceC5830a.a();
            }
            if (this.f65510e.g(a13)) {
                sh0.b.f("OzonPushServiceDelegate", sj.f.b(new Pair("notification_id", Integer.valueOf(a13.n()))), hh0.e.f65528b, 4);
                return;
            } else if (bVar instanceof c.a) {
                sh0.b.f("OzonPushServiceDelegate", sj.f.b(new Pair("notification_id", Integer.valueOf(a13.n()))), new hh0.f((c.a) bVar), 4);
                if (hVar2 != null) {
                    hVar2.f(a13);
                    return;
                }
                return;
            }
        }
        sh0.b.f("OzonPushServiceDelegate", sj.f.b(new Pair("notification_id", Integer.valueOf(a13.n()))), new e(bVar), 4);
        if (bVar instanceof c.b) {
            C6568c model = ((c.b) bVar).getModel();
            try {
                Iterator<T> it = this.f65509d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ((C8736a) ((h) next).a()).getClass();
                    Intrinsics.checkNotNullParameter(model, "model");
                    if (Intrinsics.d(model.q(), "ozs")) {
                        obj = next;
                        break;
                    }
                }
                hVar = (h) obj;
            } catch (Exception e12) {
                int i15 = sh0.b.f98783c;
                sh0.b.a("OzonPushServiceDelegate", message, e12, U.i(new Pair("notification_id", Integer.valueOf(model.n()))), new hh0.c(e12));
                z11 = false;
            }
            if (hVar == null) {
                throw new Exception("Failed to getNotificationChannel");
            }
            this.f65508c.a(model, hVar);
            z11 = true;
            Yg0.a.f35038y.getClass();
            a.C0652a.b().o().c(model.p(), z11);
        }
    }

    @Override // hh0.InterfaceC6956a
    public final void d(@NotNull Context context) {
        int i11;
        Intrinsics.checkNotNullParameter(context, "context");
        n e11 = n.e(context);
        Intrinsics.checkNotNullExpressionValue(e11, "from(...)");
        for (h hVar : this.f65509d) {
            int i12 = a.f65517a[hVar.d().ordinal()];
            if (i12 == 1) {
                i11 = 1;
            } else if (i12 != 2) {
                i11 = 3;
                if (i12 != 3) {
                    i11 = 4;
                    if (i12 != 4) {
                        i11 = 5;
                        if (i12 != 5) {
                            throw new o();
                        }
                    }
                }
            } else {
                i11 = 2;
            }
            NotificationChannel notificationChannel = new NotificationChannel(hVar.b(), hVar.c(), i11);
            notificationChannel.setShowBadge(true);
            if (i11 == 0 || i11 == 1 || i11 == 2) {
                notificationChannel.setSound(null, null);
            }
            e11.c(notificationChannel);
        }
    }

    @Override // hh0.InterfaceC6956a
    public final void e(@NotNull String serviceName) {
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        if (this.f65507b.e().m()) {
            int i11 = sh0.b.f98783c;
            sh0.b.f("OzonPushServiceDelegate", null, new C1068b(serviceName), 2);
        }
    }
}
