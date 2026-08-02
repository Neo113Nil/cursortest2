package io.sentry;

import io.sentry.util.C4843a;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4734d {

    /* renamed from: i, reason: collision with root package name */
    public static final Integer f52005i = 8192;

    /* renamed from: j, reason: collision with root package name */
    public static final Integer f52006j = 64;

    /* renamed from: k, reason: collision with root package name */
    public static final c f52007k = new c();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f52008a;

    /* renamed from: b, reason: collision with root package name */
    public final C4843a f52009b;

    /* renamed from: c, reason: collision with root package name */
    public Double f52010c;

    /* renamed from: d, reason: collision with root package name */
    public Double f52011d;

    /* renamed from: e, reason: collision with root package name */
    public final String f52012e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f52013f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f52014g;

    /* renamed from: h, reason: collision with root package name */
    public final ILogger f52015h;

    /* renamed from: io.sentry.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final List f52016a = Arrays.asList("sentry-trace_id", "sentry-public_key", "sentry-release", "sentry-user_id", "sentry-environment", "sentry-transaction", "sentry-sample_rate", "sentry-sample_rand", "sentry-sampled", "sentry-replay_id", "sentry-org_id");
    }

    /* renamed from: io.sentry.d$c */
    public static class c extends ThreadLocal {
        public c() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DecimalFormat initialValue() {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
        }
    }

    public C4734d(ILogger iLogger) {
        this(new ConcurrentHashMap(), null, null, null, true, false, iLogger);
    }

    public static Double A(l4 l4Var) {
        if (l4Var == null) {
            return null;
        }
        return l4Var.d();
    }

    public static String B(Double d10) {
        if (io.sentry.util.A.h(d10, false)) {
            return ((DecimalFormat) f52007k.get()).format(d10);
        }
        return null;
    }

    public static Boolean C(l4 l4Var) {
        if (l4Var == null) {
            return null;
        }
        return l4Var.e();
    }

    public static Double R(String str) {
        if (str != null) {
            try {
                double parseDouble = Double.parseDouble(str);
                if (io.sentry.util.A.h(Double.valueOf(parseDouble), false)) {
                    return Double.valueOf(parseDouble);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String a(String str) {
        return URLDecoder.decode(str, "UTF-8");
    }

    public static C4734d e(AbstractC4810q2 abstractC4810q2, String str, F3 f32) {
        C4734d c4734d = new C4734d(f32.getLogger());
        a4 j10 = abstractC4810q2.C().j();
        c4734d.M(j10 != null ? j10.q().toString() : null);
        c4734d.G(f32.retrieveParsedDsn().e());
        c4734d.H(abstractC4810q2.J());
        c4734d.E(abstractC4810q2.F());
        c4734d.F(f32.getEffectiveOrgId());
        c4734d.N(str);
        c4734d.K(null);
        c4734d.L(null);
        c4734d.J(null);
        Object c10 = abstractC4810q2.C().c("replay_id");
        if (c10 != null && !c10.toString().equals(io.sentry.protocol.u.f52477c.toString())) {
            c4734d.I(c10.toString());
            abstractC4810q2.C().n("replay_id");
        }
        c4734d.d();
        return c4734d;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4734d f(String str, boolean z10, ILogger iLogger) {
        boolean z11;
        Double d10;
        Double d11;
        boolean z12;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        if (str != null) {
            try {
                String[] split = str.split(",", -1);
                int length = split.length;
                int i11 = 0;
                boolean z13 = false;
                d10 = null;
                d11 = null;
                while (i11 < length) {
                    try {
                        String str2 = split[i11];
                        if (str2.trim().startsWith("sentry-")) {
                            try {
                                int indexOf = str2.indexOf("=");
                                String trim = str2.substring(i10, indexOf).trim();
                                String a10 = a(trim);
                                String a11 = a(str2.substring(indexOf + 1).trim());
                                if ("sentry-sample_rate".equals(a10)) {
                                    d10 = R(a11);
                                } else if ("sentry-sample_rand".equals(a10)) {
                                    d11 = R(a11);
                                } else {
                                    concurrentHashMap.put(a10, a11);
                                }
                                if (!"sentry-sample_rand".equalsIgnoreCase(trim)) {
                                    z13 = true;
                                }
                            } catch (Throwable th2) {
                                iLogger.a(EnumC4788n3.ERROR, th2, "Unable to decode baggage key value pair %s", str2);
                            }
                        } else if (z10) {
                            arrayList.add(str2.trim());
                        }
                        i11++;
                        i10 = 0;
                    } catch (Throwable th3) {
                        th = th3;
                        z12 = z13;
                        iLogger.a(EnumC4788n3.ERROR, th, "Unable to decode baggage header %s", str);
                        z11 = z12;
                        return new C4734d(concurrentHashMap, d10, d11, !arrayList.isEmpty() ? null : io.sentry.util.D.g(",", arrayList), true, z11, iLogger);
                    }
                }
                z11 = z13;
            } catch (Throwable th4) {
                th = th4;
                z12 = false;
                d10 = null;
                d11 = null;
            }
        } else {
            z11 = false;
            d10 = null;
            d11 = null;
        }
        return new C4734d(concurrentHashMap, d10, d11, !arrayList.isEmpty() ? null : io.sentry.util.D.g(",", arrayList), true, z11, iLogger);
    }

    public static C4734d g(List list, ILogger iLogger) {
        return h(list, false, iLogger);
    }

    public static C4734d h(List list, boolean z10, ILogger iLogger) {
        return list != null ? f(io.sentry.util.D.g(",", list), z10, iLogger) : f(null, z10, iLogger);
    }

    public static boolean w(io.sentry.protocol.E e10) {
        return (e10 == null || io.sentry.protocol.E.URL.equals(e10)) ? false : true;
    }

    public static Double z(l4 l4Var) {
        if (l4Var == null) {
            return null;
        }
        return l4Var.c();
    }

    public void D(String str, String str2) {
        if (this.f52013f) {
            if (str2 == null) {
                this.f52008a.remove(str);
            } else {
                this.f52008a.put(str, str2);
            }
        }
    }

    public void E(String str) {
        D("sentry-environment", str);
    }

    public void F(String str) {
        D("sentry-org_id", str);
    }

    public void G(String str) {
        D("sentry-public_key", str);
    }

    public void H(String str) {
        D("sentry-release", str);
    }

    public void I(String str) {
        D("sentry-replay_id", str);
    }

    public void J(Double d10) {
        if (x()) {
            this.f52011d = d10;
        }
    }

    public void K(Double d10) {
        if (x()) {
            this.f52010c = d10;
        }
    }

    public void L(String str) {
        D("sentry-sampled", str);
    }

    public void M(String str) {
        D("sentry-trace_id", str);
    }

    public void N(String str) {
        D("sentry-transaction", str);
    }

    public void O(l4 l4Var) {
        if (l4Var == null) {
            return;
        }
        L(io.sentry.util.D.j(C(l4Var)));
        if (l4Var.c() != null) {
            J(z(l4Var));
        }
        if (l4Var.d() != null) {
            c(A(l4Var));
        }
    }

    public void P(InterfaceC4730c0 interfaceC4730c0, F3 f32) {
        E1 O10 = interfaceC4730c0.O();
        io.sentry.protocol.u r10 = interfaceC4730c0.r();
        M(O10.g().toString());
        G(f32.retrieveParsedDsn().e());
        H(f32.getRelease());
        E(f32.getEnvironment());
        if (!io.sentry.protocol.u.f52477c.equals(r10)) {
            I(r10.toString());
        }
        F(f32.getEffectiveOrgId());
        N(null);
        K(null);
        L(null);
    }

    public void Q(io.sentry.protocol.u uVar, io.sentry.protocol.u uVar2, F3 f32, l4 l4Var, String str, io.sentry.protocol.E e10) {
        M(uVar.toString());
        G(f32.retrieveParsedDsn().e());
        H(f32.getRelease());
        E(f32.getEnvironment());
        if (!w(e10)) {
            str = null;
        }
        N(str);
        if (uVar2 != null && !io.sentry.protocol.u.f52477c.equals(uVar2)) {
            I(uVar2.toString());
        }
        F(f32.getEffectiveOrgId());
        K(A(l4Var));
        L(io.sentry.util.D.j(C(l4Var)));
        J(z(l4Var));
    }

    public String S(String str) {
        String str2;
        int i10;
        StringBuilder sb2 = new StringBuilder();
        if (str == null || str.isEmpty()) {
            str2 = "";
            i10 = 0;
        } else {
            sb2.append(str);
            i10 = io.sentry.util.D.d(str, ',') + 1;
            str2 = ",";
        }
        InterfaceC4765j0 d10 = this.f52009b.d();
        try {
            TreeSet<String> treeSet = new TreeSet(Collections.list(this.f52008a.keys()));
            if (d10 != null) {
                d10.close();
            }
            treeSet.add("sentry-sample_rate");
            treeSet.add("sentry-sample_rand");
            for (String str3 : treeSet) {
                String B10 = "sentry-sample_rate".equals(str3) ? B(this.f52010c) : "sentry-sample_rand".equals(str3) ? B(this.f52011d) : (String) this.f52008a.get(str3);
                if (B10 != null) {
                    Integer num = f52006j;
                    if (i10 >= num.intValue()) {
                        this.f52015h.c(EnumC4788n3.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str3, num);
                    } else {
                        try {
                            String str4 = str2 + b(str3) + "=" + b(B10);
                            int length = sb2.length() + str4.length();
                            Integer num2 = f52005i;
                            if (length > num2.intValue()) {
                                this.f52015h.c(EnumC4788n3.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str3, num2);
                            } else {
                                i10++;
                                sb2.append(str4);
                                str2 = ",";
                            }
                        } catch (Throwable th2) {
                            this.f52015h.a(EnumC4788n3.ERROR, th2, "Unable to encode baggage key value pair (key=%s,value=%s).", str3, B10);
                        }
                    }
                }
            }
            return sb2.toString();
        } catch (Throwable th3) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public j4 T() {
        String s10 = s();
        String n10 = n();
        String l10 = l();
        if (s10 == null || l10 == null) {
            return null;
        }
        io.sentry.protocol.u uVar = new io.sentry.protocol.u(s10);
        io.sentry.protocol.u uVar2 = null;
        String m10 = m();
        String j10 = j();
        String v10 = v();
        String t10 = t();
        String B10 = B(p());
        String q10 = q();
        if (n10 != null) {
            uVar2 = new io.sentry.protocol.u(n10);
        }
        j4 j4Var = new j4(uVar, l10, m10, j10, v10, t10, B10, q10, uVar2, B(o()));
        j4Var.c(u());
        return j4Var;
    }

    public final String b(String str) {
        return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }

    public void c(Double d10) {
        this.f52010c = d10;
    }

    public void d() {
        this.f52013f = false;
    }

    public String i(String str) {
        if (str == null) {
            return null;
        }
        return (String) this.f52008a.get(str);
    }

    public String j() {
        return i("sentry-environment");
    }

    public String k() {
        return i("sentry-org_id");
    }

    public String l() {
        return i("sentry-public_key");
    }

    public String m() {
        return i("sentry-release");
    }

    public String n() {
        return i("sentry-replay_id");
    }

    public Double o() {
        return this.f52011d;
    }

    public Double p() {
        return this.f52010c;
    }

    public String q() {
        return i("sentry-sampled");
    }

    public String r() {
        return this.f52012e;
    }

    public String s() {
        return i("sentry-trace_id");
    }

    public String t() {
        return i("sentry-transaction");
    }

    public Map u() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        InterfaceC4765j0 d10 = this.f52009b.d();
        try {
            for (Map.Entry entry : this.f52008a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!b.f52016a.contains(str) && str2 != null) {
                    concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
                }
            }
            if (d10 != null) {
                d10.close();
            }
            return concurrentHashMap;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public String v() {
        return i("sentry-user_id");
    }

    public boolean x() {
        return this.f52013f;
    }

    public boolean y() {
        return this.f52014g;
    }

    public C4734d(ConcurrentHashMap concurrentHashMap, Double d10, Double d11, String str, boolean z10, boolean z11, ILogger iLogger) {
        this.f52009b = new C4843a();
        this.f52008a = concurrentHashMap;
        this.f52010c = d10;
        this.f52011d = d11;
        this.f52015h = iLogger;
        this.f52012e = str;
        this.f52013f = z10;
        this.f52014g = z11;
    }
}
