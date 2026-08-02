package io.radar.sdk;

import Gh.C1165b;
import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import io.radar.sdk.C4589c;
import io.radar.sdk.N0;
import io.radar.sdk.T;
import io.radar.sdk.X0;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class X0 {

    /* renamed from: r, reason: collision with root package name */
    public static final a f49845r = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f49846a;

    /* renamed from: b, reason: collision with root package name */
    public final G0 f49847b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f49848c;

    /* renamed from: d, reason: collision with root package name */
    public StandardIntegrityManager.StandardIntegrityTokenProvider f49849d;

    /* renamed from: e, reason: collision with root package name */
    public long f49850e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f49851f;

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f49852g;

    /* renamed from: h, reason: collision with root package name */
    public ConnectivityManager.NetworkCallback f49853h;

    /* renamed from: i, reason: collision with root package name */
    public int f49854i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f49855j;

    /* renamed from: k, reason: collision with root package name */
    public Runnable f49856k;

    /* renamed from: l, reason: collision with root package name */
    public Gh.D f49857l;

    /* renamed from: m, reason: collision with root package name */
    public long f49858m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f49859n;

    /* renamed from: o, reason: collision with root package name */
    public String f49860o;

    /* renamed from: p, reason: collision with root package name */
    public String f49861p;

    /* renamed from: q, reason: collision with root package name */
    public String f49862q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements C4589c.InterfaceC4609u {
        public b() {
        }

        @Override // io.radar.sdk.C4589c.InterfaceC4609u
        public void a(C4589c.EnumC4607s status, Gh.D d10) {
            Intrinsics.checkNotNullParameter(status, "status");
            X0.this.B();
        }
    }

    public static final class c extends ConnectivityManager.NetworkCallback {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f49865b;

        public c(Function0 function0) {
            this.f49865b = function0;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onAvailable(network);
            G0.b(X0.this.f49847b, "Network connected", null, null, 6, null);
            this.f49865b.invoke();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onLost(network);
            G0.b(X0.this.f49847b, "Network lost", null, null, 6, null);
            this.f49865b.invoke();
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ X0 f49867e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(X0 x02) {
            super(0);
            this.f49867e = x02;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m124invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m124invoke() {
            String u10 = X0.this.u();
            boolean z10 = false;
            if (X0.this.f49860o == null) {
                G0.b(X0.this.f49847b, "First time getting IPs", null, null, 6, null);
            } else {
                if (Intrinsics.areEqual(u10, "error")) {
                    G0.b(X0.this.f49847b, "Error getting IPs", null, null, 6, null);
                } else if (Intrinsics.areEqual(u10, X0.this.f49860o)) {
                    G0.b(X0.this.f49847b, "IPs unchanged", null, null, 6, null);
                } else {
                    G0.b(X0.this.f49847b, "IPs changed | ips = " + u10 + "; lastIPs = " + X0.this.f49860o, null, null, 6, null);
                }
                z10 = true;
            }
            X0.this.f49860o = u10;
            if (z10) {
                this.f49867e.p("ip_change");
            }
        }
    }

    public static final class e implements T.InterfaceC4580d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N0.b f49868a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4589c.InterfaceC4609u f49869b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ X0 f49870c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f49871d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49872e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49873f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f49874g;

        public static final class a implements C4589c.InterfaceC4595g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ X0 f49875a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Long f49876b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C4589c.InterfaceC4609u f49877c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f49878d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f49879e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f49880f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ boolean f49881g;

            /* renamed from: io.radar.sdk.X0$e$a$a, reason: collision with other inner class name */
            public static final class C0738a extends Lambda implements Function2 {

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f49882d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Location f49883e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ X0 f49884f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ String f49885g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ String f49886h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ boolean f49887i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ C4589c.InterfaceC4609u f49888j;

                /* renamed from: io.radar.sdk.X0$e$a$a$a, reason: collision with other inner class name */
                public static final class C0739a implements T.i {

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ Function1 f49889a;

                    /* renamed from: io.radar.sdk.X0$e$a$a$a$a, reason: collision with other inner class name */
                    public static final class C0740a implements C4589c.InterfaceC0745c {

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ Function1 f49890a;

                        public C0740a(Function1 function1) {
                            this.f49890a = function1;
                        }

                        @Override // io.radar.sdk.C4589c.InterfaceC0745c
                        public void a(C4589c.EnumC4607s status, C1165b[] c1165bArr) {
                            Intrinsics.checkNotNullParameter(status, "status");
                            if (status != C4589c.EnumC4607s.SUCCESS || c1165bArr == null) {
                                this.f49890a.invoke(null);
                            } else {
                                this.f49890a.invoke(c1165bArr);
                            }
                        }
                    }

                    /* renamed from: io.radar.sdk.X0$e$a$a$a$b */
                    public static final class b implements C4589c.InterfaceC0745c {

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ Function1 f49891a;

                        public b(Function1 function1) {
                            this.f49891a = function1;
                        }

                        @Override // io.radar.sdk.C4589c.InterfaceC0745c
                        public void a(C4589c.EnumC4607s status, C1165b[] c1165bArr) {
                            Intrinsics.checkNotNullParameter(status, "status");
                            if (status != C4589c.EnumC4607s.SUCCESS || c1165bArr == null) {
                                this.f49891a.invoke(null);
                            } else {
                                this.f49891a.invoke(c1165bArr);
                            }
                        }
                    }

                    public C0739a(Function1 function1) {
                        this.f49889a = function1;
                    }

                    @Override // io.radar.sdk.T.i
                    public void a(C4589c.EnumC4607s status, JSONObject jSONObject, C1165b[] c1165bArr, String[] strArr, String[] strArr2) {
                        Intrinsics.checkNotNullParameter(status, "status");
                        if ((strArr != null && strArr.length != 0) || (strArr2 != null && strArr2.length != 0)) {
                            C4589c c4589c = C4589c.f49918a;
                            c4589c.n().q(strArr, strArr2);
                            c4589c.n().m(strArr, strArr2, false, new C0740a(this.f49889a));
                        } else {
                            if (c1165bArr == null) {
                                this.f49889a.invoke(new C1165b[0]);
                                return;
                            }
                            C4589c c4589c2 = C4589c.f49918a;
                            c4589c2.n().r(c1165bArr);
                            c4589c2.n().o(c1165bArr, false, new b(this.f49889a));
                        }
                    }
                }

                /* renamed from: io.radar.sdk.X0$e$a$a$b */
                public static final class b extends Lambda implements Function1 {

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ Location f49892d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ X0 f49893e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ String f49894f;

                    /* renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ String f49895g;

                    /* renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ String f49896h;

                    /* renamed from: i, reason: collision with root package name */
                    public final /* synthetic */ String f49897i;

                    /* renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ boolean f49898j;

                    /* renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ C4589c.InterfaceC4609u f49899k;

                    /* renamed from: io.radar.sdk.X0$e$a$a$b$a, reason: collision with other inner class name */
                    public static final class C0741a implements T.m {

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ X0 f49900a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ boolean f49901b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ C4589c.InterfaceC4609u f49902c;

                        public C0741a(X0 x02, boolean z10, C4589c.InterfaceC4609u interfaceC4609u) {
                            this.f49900a = x02;
                            this.f49901b = z10;
                            this.f49902c = interfaceC4609u;
                        }

                        public static final void c(C4589c.EnumC4607s status, C4589c.InterfaceC4609u interfaceC4609u, Gh.D d10) {
                            Intrinsics.checkNotNullParameter(status, "$status");
                            if (status != C4589c.EnumC4607s.SUCCESS) {
                                C4589c.m0(C4589c.f49918a, status, null, 2, null);
                            }
                            if (interfaceC4609u != null) {
                                interfaceC4609u.a(status, d10);
                            }
                        }

                        @Override // io.radar.sdk.T.m
                        public void a(final C4589c.EnumC4607s status, JSONObject jSONObject, Gh.h[] hVarArr, Gh.C c10, Gh.j[] jVarArr, Gh.e eVar, final Gh.D d10) {
                            Intrinsics.checkNotNullParameter(status, "status");
                            if (status == C4589c.EnumC4607s.SUCCESS) {
                                C4589c.f49918a.x().O(eVar != null ? eVar.b() : null);
                            }
                            if (d10 != null) {
                                this.f49900a.f49857l = d10;
                                this.f49900a.f49858m = SystemClock.elapsedRealtime();
                                this.f49900a.f49859n = this.f49901b;
                            }
                            Handler t10 = C4589c.f49918a.t();
                            final C4589c.InterfaceC4609u interfaceC4609u = this.f49902c;
                            t10.post(new Runnable() { // from class: io.radar.sdk.a1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    X0.e.a.C0738a.b.C0741a.c(C4589c.EnumC4607s.this, interfaceC4609u, d10);
                                }
                            });
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(Location location, X0 x02, String str, String str2, String str3, String str4, boolean z10, C4589c.InterfaceC4609u interfaceC4609u) {
                        super(1);
                        this.f49892d = location;
                        this.f49893e = x02;
                        this.f49894f = str;
                        this.f49895g = str2;
                        this.f49896h = str3;
                        this.f49897i = str4;
                        this.f49898j = z10;
                        this.f49899k = interfaceC4609u;
                    }

                    public final void a(C1165b[] c1165bArr) {
                        T l10 = C4589c.f49918a.l();
                        Location location = this.f49892d;
                        boolean p10 = M0.f49714a.p(this.f49893e.f49846a);
                        boolean a10 = M.f49706d.a();
                        C4589c.EnumC4597i enumC4597i = C4589c.EnumC4597i.FOREGROUND_LOCATION;
                        String str = this.f49894f;
                        String str2 = this.f49895g;
                        Boolean bool = Boolean.FALSE;
                        String str3 = this.f49893e.f49861p;
                        String str4 = this.f49893e.f49862q;
                        String str5 = this.f49896h;
                        if (str5 == null) {
                            str5 = "manual";
                        }
                        l10.s(location, p10, a10, enumC4597i, false, c1165bArr, true, str, str2, bool, str3, str4, str5, this.f49897i, new C0741a(this.f49893e, this.f49898j, this.f49899k));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((C1165b[]) obj);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0738a(boolean z10, Location location, X0 x02, String str, String str2, boolean z11, C4589c.InterfaceC4609u interfaceC4609u) {
                    super(2);
                    this.f49882d = z10;
                    this.f49883e = location;
                    this.f49884f = x02;
                    this.f49885g = str;
                    this.f49886h = str2;
                    this.f49887i = z11;
                    this.f49888j = interfaceC4609u;
                }

                public final void a(String str, String str2) {
                    b bVar = new b(this.f49883e, this.f49884f, str, str2, this.f49885g, this.f49886h, this.f49887i, this.f49888j);
                    if (!this.f49882d || Build.VERSION.SDK_INT < 26) {
                        bVar.invoke(null);
                    } else {
                        C4589c.f49918a.l().o(this.f49883e, 1000, 10, new C0739a(bVar), false);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((String) obj, (String) obj2);
                    return Unit.INSTANCE;
                }
            }

            public a(X0 x02, Long l10, C4589c.InterfaceC4609u interfaceC4609u, boolean z10, String str, String str2, boolean z11) {
                this.f49875a = x02;
                this.f49876b = l10;
                this.f49877c = interfaceC4609u;
                this.f49878d = z10;
                this.f49879e = str;
                this.f49880f = str2;
                this.f49881g = z11;
            }

            public static final void c(C4589c.EnumC4607s status, C4589c.InterfaceC4609u interfaceC4609u) {
                Intrinsics.checkNotNullParameter(status, "$status");
                if (status != C4589c.EnumC4607s.SUCCESS) {
                    C4589c.m0(C4589c.f49918a, status, null, 2, null);
                }
                if (interfaceC4609u != null) {
                    C4589c.InterfaceC4609u.a.a(interfaceC4609u, status, null, 2, null);
                }
            }

            @Override // io.radar.sdk.C4589c.InterfaceC4595g
            public void a(final C4589c.EnumC4607s status, Location location, boolean z10) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (status != C4589c.EnumC4607s.SUCCESS || location == null) {
                    Handler t10 = C4589c.f49918a.t();
                    final C4589c.InterfaceC4609u interfaceC4609u = this.f49877c;
                    t10.post(new Runnable() { // from class: io.radar.sdk.Z0
                        @Override // java.lang.Runnable
                        public final void run() {
                            X0.e.a.c(C4589c.EnumC4607s.this, interfaceC4609u);
                        }
                    });
                } else {
                    String w10 = this.f49875a.w(location);
                    X0 x02 = this.f49875a;
                    x02.v(this.f49876b, w10, new C0738a(this.f49878d, location, x02, this.f49879e, this.f49880f, this.f49881g, this.f49877c));
                }
            }
        }

        public e(N0.b bVar, C4589c.InterfaceC4609u interfaceC4609u, X0 x02, boolean z10, String str, String str2, boolean z11) {
            this.f49868a = bVar;
            this.f49869b = interfaceC4609u;
            this.f49870c = x02;
            this.f49871d = z10;
            this.f49872e = str;
            this.f49873f = str2;
            this.f49874g = z11;
        }

        public static final void c(C4589c.EnumC4607s status, C4589c.InterfaceC4609u interfaceC4609u) {
            Intrinsics.checkNotNullParameter(status, "$status");
            if (status != C4589c.EnumC4607s.SUCCESS) {
                C4589c.m0(C4589c.f49918a, status, null, 2, null);
            }
            if (interfaceC4609u != null) {
                C4589c.InterfaceC4609u.a.a(interfaceC4609u, status, null, 2, null);
            }
        }

        @Override // io.radar.sdk.T.InterfaceC4580d
        public void a(final C4589c.EnumC4607s status, Gh.e eVar) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == C4589c.EnumC4607s.SUCCESS && eVar != null) {
                C4589c.f49918a.x().n(this.f49868a, C4589c.EnumC4597i.FOREGROUND_LOCATION, new a(this.f49870c, eVar.a(), this.f49869b, this.f49871d, this.f49872e, this.f49873f, this.f49874g));
            } else {
                Handler t10 = C4589c.f49918a.t();
                final C4589c.InterfaceC4609u interfaceC4609u = this.f49869b;
                t10.post(new Runnable() { // from class: io.radar.sdk.Y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        X0.e.c(C4589c.EnumC4607s.this, interfaceC4609u);
                    }
                });
            }
        }
    }

    public X0(Context context, G0 logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f49846a = context;
        this.f49847b = logger;
        this.f49851f = new Handler(context.getMainLooper());
        Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        this.f49852g = (ConnectivityManager) systemService;
    }

    public static final void C(X0 verificationManager, X0 this$0) {
        Intrinsics.checkNotNullParameter(verificationManager, "$verificationManager");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        G0.b(verificationManager.f49847b, "Token request interval fired", null, null, 6, null);
        this$0.p("interval");
    }

    public static final void H(X0 this$0, String str, Function2 block, StandardIntegrityManager.StandardIntegrityTokenProvider tokenProvider) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullExpressionValue(tokenProvider, "tokenProvider");
        this$0.f49849d = tokenProvider;
        G0.b(C4589c.f49918a.y(), "Successfully warmed up integrity token provider", null, null, 6, null);
        this$0.f49850e = System.currentTimeMillis() / 1000;
        this$0.r(str, block);
    }

    public static final void I(Function2 block, Exception exception) {
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(exception, "exception");
        String message = exception.getMessage();
        C4589c.f49918a.y().c("Error warming up integrity token provider | warmupException = " + message, C4589c.EnumC4600l.SDK_ERROR, exception);
        block.invoke(null, message);
    }

    public static final void s(X0 this$0, Function2 block, StandardIntegrityManager.StandardIntegrityToken standardIntegrityToken) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(block, "$block");
        String str = standardIntegrityToken.token();
        G0.b(this$0.f49847b, "Successfully requested integrity token | integrityToken = " + str, null, null, 6, null);
        block.invoke(str, null);
    }

    public static final void t(X0 this$0, Function2 block, Exception exception) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(exception, "exception");
        String message = exception.getMessage();
        G0.b(this$0.f49847b, "Error requesting integrity token | integrityException = " + message, null, null, 6, null);
        block.invoke(null, message);
    }

    public final boolean A() {
        Gh.D d10 = this.f49857l;
        boolean z10 = false;
        if (d10 == null) {
            return false;
        }
        long elapsedRealtime = (SystemClock.elapsedRealtime() - this.f49858m) / 1000;
        Gh.q h10 = d10.e().h();
        double a10 = h10 != null ? h10.a() : -1.0d;
        if (elapsedRealtime < d10.b() && d10.c() && a10 > 1609.0d) {
            z10 = true;
        }
        if (z10) {
            G0.b(C4589c.f49918a.y(), "Last token valid | lastToken.expiresIn = " + d10.b() + "; lastTokenElapsed = " + elapsedRealtime + "; lastToken.passed = " + d10.c() + "; lastDistanceToStateBorder = " + a10, null, null, 6, null);
            return z10;
        }
        G0.b(C4589c.f49918a.y(), "Last token invalid | lastToken.expiresIn = " + d10.b() + "; lastTokenElapsed = " + elapsedRealtime + "; lastToken.passed = " + d10.c() + "; lastDistanceToStateBorder = " + a10, null, null, 6, null);
        return z10;
    }

    public final void B() {
        int i10 = this.f49854i;
        Gh.D d10 = this.f49857l;
        if (d10 != null) {
            int elapsedRealtime = ((int) (SystemClock.elapsedRealtime() - this.f49858m)) / 1000;
            int min = Math.min(d10.b() - elapsedRealtime, this.f49854i);
            G0.b(this.f49847b, "Calculated next interval | minInterval = " + min + "; expiresIn = " + d10.b() + "; lastTokenElapsed = " + elapsedRealtime + "; startedInterval = " + this.f49854i, null, null, 6, null);
            i10 = min;
        }
        int i11 = i10 - 10;
        int i12 = i11 >= 10 ? i11 : 10;
        if (this.f49856k == null) {
            this.f49856k = new Runnable() { // from class: io.radar.sdk.S0
                @Override // java.lang.Runnable
                public final void run() {
                    X0.C(X0.this, this);
                }
            };
        }
        Runnable runnable = this.f49856k;
        if (runnable != null) {
            this.f49851f.removeCallbacks(runnable);
            if (this.f49848c) {
                G0.b(this.f49847b, "Requesting token again in " + i12 + " seconds", null, null, 6, null);
                this.f49851f.postDelayed(runnable, ((long) i12) * 1000);
            }
        }
    }

    public final void D(int i10, boolean z10) {
        E();
        this.f49848c = true;
        this.f49854i = i10;
        this.f49855j = z10;
        NetworkRequest build = new NetworkRequest.Builder().addTransportType(3).addTransportType(0).addTransportType(2).addTransportType(1).removeCapability(15).build();
        c cVar = new c(new d(this));
        this.f49853h = cVar;
        this.f49852g.registerNetworkCallback(build, cVar);
        if (this.f49854i < 20) {
            C4589c.f49918a.x().o().i(N0.b.HIGH, 0, 0, RadarLocationReceiver.INSTANCE.g(this.f49846a));
        }
        if (A()) {
            B();
        } else {
            p(ViewProps.START);
        }
    }

    public final void E() {
        this.f49848c = false;
        try {
            if (this.f49854i < 20) {
                C4589c.f49918a.x().o().h(RadarLocationReceiver.INSTANCE.g(this.f49846a));
            }
            ConnectivityManager.NetworkCallback networkCallback = this.f49853h;
            if (networkCallback != null) {
                this.f49852g.unregisterNetworkCallback(networkCallback);
            }
            Runnable runnable = this.f49856k;
            if (runnable != null) {
                this.f49851f.removeCallbacks(runnable);
            }
        } catch (Exception e10) {
            C4589c.f49918a.y().c("Error unregistering callbacks", C4589c.EnumC4600l.SDK_EXCEPTION, e10);
        }
    }

    public final void F(boolean z10, N0.b desiredAccuracy, String str, String str2, C4589c.InterfaceC4609u interfaceC4609u) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        C4589c.f49918a.l().e("trackVerified", true, new e(desiredAccuracy, interfaceC4609u, this, z10, str, str2, z10));
    }

    public final void G(long j10, final String str, final Function2 function2) {
        if (!z()) {
            G0.l(this.f49847b, "Integrity API not included", null, null, 6, null);
            function2.invoke(null, "Integrity API not included");
        } else {
            StandardIntegrityManager createStandard = IntegrityManagerFactory.createStandard(this.f49846a);
            Intrinsics.checkNotNullExpressionValue(createStandard, "createStandard(this.context)");
            createStandard.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(j10).build()).addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.T0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    X0.H(X0.this, str, function2, (StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.U0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    X0.I(Function2.this, exc);
                }
            });
        }
    }

    public final void p(String str) {
        if (this.f49848c) {
            F(this.f49855j, N0.b.HIGH, str, null, new b());
        }
    }

    public final void q() {
        this.f49857l = null;
    }

    public final void r(String str, final Function2 function2) {
        StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider = null;
        if (!z()) {
            G0.l(this.f49847b, "Integrity API not included", null, null, 6, null);
            function2.invoke(null, "Integrity API not included");
            return;
        }
        G0.b(this.f49847b, "Requesting integrity token", null, null, 6, null);
        StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider2 = this.f49849d;
        if (standardIntegrityTokenProvider2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("standardIntegrityTokenProvider");
        } else {
            standardIntegrityTokenProvider = standardIntegrityTokenProvider2;
        }
        Task<StandardIntegrityManager.StandardIntegrityToken> request = standardIntegrityTokenProvider.request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build());
        Intrinsics.checkNotNullExpressionValue(request, "this.standardIntegrityTo…       .build()\n        )");
        request.addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.V0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                X0.s(X0.this, function2, (StandardIntegrityManager.StandardIntegrityToken) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.W0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                X0.t(X0.this, function2, exc);
            }
        });
    }

    public final String u() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNullExpressionValue(networkInterfaces, "getNetworkInterfaces()");
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Intrinsics.checkNotNullExpressionValue(nextElement, "interfaces.nextElement()");
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                Intrinsics.checkNotNullExpressionValue(inetAddresses, "networkInterface.inetAddresses");
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    Intrinsics.checkNotNullExpressionValue(nextElement2, "addresses.nextElement()");
                    String hostAddress = nextElement2.getHostAddress();
                    if (hostAddress != null) {
                        arrayList.add(hostAddress);
                    }
                }
            }
            return arrayList.size() > 0 ? CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null) : "error";
        } catch (Exception e10) {
            G0.b(this.f49847b, "Error getting IPs | e = " + e10.getLocalizedMessage(), null, null, 6, null);
            return "error";
        }
    }

    public final void v(Long l10, String str, Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!z()) {
            G0.l(this.f49847b, "Integrity API not included", null, null, 6, null);
            block.invoke(null, "Integrity API not included");
            return;
        }
        if (str == null) {
            G0.b(this.f49847b, "Missing request hash", null, null, 6, null);
            block.invoke(null, "Missing request hash");
            return;
        }
        if (l10 == null) {
            G0.b(this.f49847b, "Error warming up integrity token provider: Google Play project number is null", null, null, 6, null);
            block.invoke(null, "Google Play project number is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (this.f49849d != null) {
            long j10 = this.f49850e;
            if (j10 != 0 && currentTimeMillis - j10 <= 43200) {
                r(str, block);
                return;
            }
        }
        G(l10.longValue(), str, block);
    }

    public final String w(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        R0 r02 = R0.f49781a;
        String str = L0.f49705a.g(this.f49846a) + location.getLatitude() + location.getLongitude() + location.isFromMockProvider() + false;
        Intrinsics.checkNotNullExpressionValue(str, "stringBuffer.toString()");
        return r02.l(str);
    }

    public final boolean x() {
        return this.f49848c;
    }

    public final void y(boolean z10, N0.b desiredAccuracy, C4589c.InterfaceC4609u interfaceC4609u) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        if (!A()) {
            F(z10, desiredAccuracy, "last_token_invalid", null, interfaceC4609u);
            return;
        }
        C4589c.h();
        if (interfaceC4609u != null) {
            interfaceC4609u.a(C4589c.EnumC4607s.SUCCESS, this.f49857l);
        }
    }

    public final boolean z() {
        return true;
    }
}
