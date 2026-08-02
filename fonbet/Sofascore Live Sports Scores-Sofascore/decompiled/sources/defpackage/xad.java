package defpackage;

import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xad extends pe0 implements l7h {
    public static final l10 h = l10.c();
    public final List a;
    public final GaugeManager b;
    public final fyj c;
    public final qad d;
    public final WeakReference e;
    public String f;
    public boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xad(fyj fyjVar) {
        super(r0);
        oe0 a = oe0.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.d = wad.B();
        this.e = new WeakReference(this);
        this.c = fyjVar;
        this.b = gaugeManager;
        this.a = w1l.n();
        registerForAppState();
    }

    @Override // defpackage.l7h
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            h.getClass();
            return;
        }
        qad qadVar = this.d;
        if (!qadVar.k() || qadVar.m()) {
            return;
        }
        this.a.add(perfSession);
    }

    public final void b() {
        List unmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.e);
        unregisterForAppState();
        synchronized (this.a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.a) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        sde[] b = PerfSession.b(unmodifiableList);
        if (b != null) {
            this.d.d(Arrays.asList(b));
        }
        wad wadVar = (wad) this.d.build();
        String str = this.f;
        if (str == null) {
            Pattern pattern = yad.a;
        } else if (yad.a.matcher(str).matches()) {
            h.getClass();
            return;
        }
        if (this.g) {
            return;
        }
        fyj fyjVar = this.c;
        fyjVar.i.execute(new kdc(19, fyjVar, wadVar, getAppState()));
        this.g = true;
    }

    public final void c(String str) {
        tad tadVar;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    tadVar = tad.OPTIONS;
                    break;
                case "GET":
                    tadVar = tad.GET;
                    break;
                case "PUT":
                    tadVar = tad.PUT;
                    break;
                case "HEAD":
                    tadVar = tad.HEAD;
                    break;
                case "POST":
                    tadVar = tad.POST;
                    break;
                case "PATCH":
                    tadVar = tad.PATCH;
                    break;
                case "TRACE":
                    tadVar = tad.TRACE;
                    break;
                case "CONNECT":
                    tadVar = tad.CONNECT;
                    break;
                case "DELETE":
                    tadVar = tad.DELETE;
                    break;
                default:
                    tadVar = tad.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.d.o(tadVar);
        }
    }

    public final void d(int i) {
        this.d.p(i);
    }

    public final void f(long j) {
        this.d.r(j);
    }

    public final void g(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.e);
        this.d.n(j);
        a(perfSession);
        if (perfSession.c) {
            this.b.collectGaugeMetricOnce(perfSession.b);
        }
    }

    public final void h(String str) {
        int i;
        qad qadVar = this.d;
        if (str == null) {
            qadVar.i();
            return;
        }
        if (str.length() <= 128) {
            while (i < str.length()) {
                char charAt = str.charAt(i);
                i = (charAt > 31 && charAt <= 127) ? i + 1 : 0;
            }
            qadVar.s(str);
            return;
        }
        "The content type of the response is not a valid content-type:".concat(str);
        h.getClass();
    }

    public final void i(long j) {
        this.d.t(j);
    }

    public final void j(long j) {
        this.d.v(j);
        if (SessionManager.getInstance().perfSession().c) {
            this.b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().b);
        }
    }

    public final void k(String str) {
        jl9 jl9Var;
        int lastIndexOf;
        if (str != null) {
            jl9 jl9Var2 = null;
            try {
                il9 il9Var = new il9(0);
                il9Var.h(null, str);
                jl9Var = il9Var.c();
            } catch (IllegalArgumentException unused) {
                jl9Var = null;
            }
            if (jl9Var != null) {
                il9 g = jl9Var.g();
                g.d = rz8.w(0, 0, "", " \"':;<=>@[]^`{}|/\\?#", Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
                g.e = rz8.w(0, 0, "", " \"':;<=>@[]^`{}|/\\?#", Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
                g.i = null;
                g.g = null;
                str = g.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        il9 il9Var2 = new il9(0);
                        il9Var2.h(null, str);
                        jl9Var2 = il9Var2.c();
                    } catch (IllegalArgumentException unused2) {
                    }
                    str = jl9Var2 == null ? str.substring(0, 2000) : (jl9Var2.b().lastIndexOf(47) < 0 || (lastIndexOf = str.lastIndexOf(47, 1999)) < 0) ? str.substring(0, 2000) : str.substring(0, lastIndexOf);
                }
            }
            this.d.x(str);
        }
    }
}
