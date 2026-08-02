package io.sentry;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final e6.g0 f16217i = new e6.g0(1);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f16218a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.a f16219b;

    /* renamed from: c, reason: collision with root package name */
    public Double f16220c;

    /* renamed from: d, reason: collision with root package name */
    public Double f16221d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16222e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16223f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16224g;

    /* renamed from: h, reason: collision with root package name */
    public final ILogger f16225h;

    public c(ILogger iLogger) {
        this(new ConcurrentHashMap(), null, null, null, false, iLogger);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c a(String str, ILogger iLogger) {
        Double d10;
        Double d11;
        boolean z5;
        Double d12;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        int i5 = 0;
        if (str != null) {
            try {
                String[] split = str.split(StringUtils.COMMA, -1);
                int length = split.length;
                int i10 = 0;
                z5 = false;
                d12 = null;
                d11 = null;
                while (i10 < length) {
                    try {
                        String str2 = split[i10];
                        if (str2.trim().startsWith("sentry-")) {
                            try {
                                int indexOf = str2.indexOf("=");
                                String trim = str2.substring(i5, indexOf).trim();
                                String decode = URLDecoder.decode(trim, "UTF-8");
                                String decode2 = URLDecoder.decode(str2.substring(indexOf + 1).trim(), "UTF-8");
                                if ("sentry-sample_rate".equals(decode)) {
                                    if (decode2 != null) {
                                        try {
                                            double parseDouble = Double.parseDouble(decode2);
                                            if (ci.c.I(Double.valueOf(parseDouble), false)) {
                                                d12 = Double.valueOf(parseDouble);
                                            }
                                        } catch (NumberFormatException unused) {
                                        }
                                    }
                                    d12 = null;
                                } else if ("sentry-sample_rand".equals(decode)) {
                                    if (decode2 != null) {
                                        try {
                                            double parseDouble2 = Double.parseDouble(decode2);
                                            if (ci.c.I(Double.valueOf(parseDouble2), false)) {
                                                d11 = Double.valueOf(parseDouble2);
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                    d11 = null;
                                } else {
                                    concurrentHashMap.put(decode, decode2);
                                }
                                if (!"sentry-sample_rand".equalsIgnoreCase(trim)) {
                                    z5 = true;
                                }
                            } catch (Throwable th2) {
                                iLogger.b(b5.ERROR, th2, "Unable to decode baggage key value pair %s", str2);
                            }
                        } else {
                            arrayList.add(str2.trim());
                        }
                        i10++;
                        i5 = 0;
                    } catch (Throwable th3) {
                        th = th3;
                        iLogger.b(b5.ERROR, th, "Unable to decode baggage header %s", str);
                        z7 = z5;
                        d10 = d12;
                        return new c(concurrentHashMap, d10, d11, !arrayList.isEmpty() ? null : io.sentry.util.l.c(arrayList), z7, iLogger);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                z5 = false;
                d12 = null;
                d11 = null;
            }
            z7 = z5;
            d10 = d12;
        } else {
            d10 = null;
            d11 = null;
        }
        return new c(concurrentHashMap, d10, d11, !arrayList.isEmpty() ? null : io.sentry.util.l.c(arrayList), z7, iLogger);
    }

    public static String c(Double d10) {
        if (ci.c.I(d10, false)) {
            return ((DecimalFormat) f16217i.get()).format(d10);
        }
        return null;
    }

    public final String b(String str) {
        return (String) this.f16218a.get(str);
    }

    public final void d(String str, String str2) {
        if (this.f16223f) {
            ConcurrentHashMap concurrentHashMap = this.f16218a;
            if (str2 == null) {
                concurrentHashMap.remove(str);
            } else {
                concurrentHashMap.put(str, str2);
            }
        }
    }

    public final void e(io.sentry.protocol.v vVar, io.sentry.protocol.v vVar2, b6 b6Var, c4.d dVar, String str, io.sentry.protocol.h0 h0Var) {
        d("sentry-trace_id", vVar.toString());
        d("sentry-public_key", b6Var.retrieveParsedDsn().f17267b);
        d("sentry-release", b6Var.getRelease());
        d("sentry-environment", b6Var.getEnvironment());
        if (h0Var == null || io.sentry.protocol.h0.URL.equals(h0Var)) {
            str = null;
        }
        d("sentry-transaction", str);
        if (vVar2 != null && !io.sentry.protocol.v.f16922b.equals(vVar2)) {
            d("sentry-replay_id", vVar2.toString());
        }
        Double d10 = dVar == null ? null : (Double) dVar.f3578c;
        if (this.f16223f) {
            this.f16220c = d10;
        }
        Boolean bool = dVar == null ? null : (Boolean) dVar.f3577b;
        d("sentry-sampled", bool == null ? null : bool.toString());
        Double d11 = dVar != null ? (Double) dVar.f3579d : null;
        if (this.f16223f) {
            this.f16221d = d11;
        }
    }

    public final t6 f() {
        String b10 = b("sentry-trace_id");
        String b11 = b("sentry-replay_id");
        String b12 = b("sentry-public_key");
        if (b10 == null || b12 == null) {
            return null;
        }
        t6 t6Var = new t6(new io.sentry.protocol.v(b10), b12, b("sentry-release"), b("sentry-environment"), b("sentry-user_id"), b("sentry-transaction"), c(this.f16220c), b("sentry-sampled"), b11 != null ? new io.sentry.protocol.v(b11) : null, c(this.f16221d));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        r a7 = this.f16219b.a();
        try {
            for (Map.Entry entry : this.f16218a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!b.f16203a.contains(str) && str2 != null) {
                    concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
                }
            }
            a7.close();
            t6Var.f17112k = concurrentHashMap;
            return t6Var;
        } finally {
        }
    }

    public c(ConcurrentHashMap concurrentHashMap, Double d10, Double d11, String str, boolean z5, ILogger iLogger) {
        this.f16219b = new io.sentry.util.a();
        this.f16218a = concurrentHashMap;
        this.f16220c = d10;
        this.f16221d = d11;
        this.f16225h = iLogger;
        this.f16222e = str;
        this.f16223f = true;
        this.f16224g = z5;
    }
}
