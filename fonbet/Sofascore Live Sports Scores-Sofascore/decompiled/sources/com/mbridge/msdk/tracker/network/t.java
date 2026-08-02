package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.C4427z5;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.tracker.network.b;
import com.mbridge.msdk.tracker.network.v;
import defpackage.dmi;
import defpackage.vp2;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class t<T> implements Comparable<t<T>> {
    private c a;
    private String b;
    private volatile p c;
    private long d;
    private Map<String, String> e;
    private int f;
    private final String g;
    private final int h;
    private final String i;
    private final int j;
    private final Object k;
    private v.a l;
    private Integer m;
    private u n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private x t;
    private b.a u;
    private long v;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public t(int i, String str, int i2, String str2) {
        this.k = new Object();
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.u = null;
        this.v = 0L;
        this.f = i;
        this.g = str;
        this.h = i2;
        this.i = str2;
        a((x) new e());
        this.j = b(str);
        this.d = SystemClock.elapsedRealtime();
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i++;
                if (entry.getKey() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append(C4427z5.U);
                    sb.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i <= map.size() - 1) {
                        sb.append('&');
                    }
                }
            }
            if (!map.containsKey("rk") || !map.containsKey("erk") || !"1".equals(map.get("erk"))) {
                return sb.toString().getBytes(str);
            }
            return ("p=" + URLEncoder.encode(v0.b(sb.toString(), "ebmclXzZOhtU2sRlZxGL8A"), str)).getBytes(str);
        } catch (UnsupportedEncodingException e) {
            vp2.e(dmi.q("Encoding not supported: ", str), e);
            return null;
        }
    }

    public final boolean A() {
        return this.s;
    }

    public final boolean B() {
        return this.r;
    }

    public abstract v<T> a(q qVar);

    public abstract void a(T t);

    public byte[] b() {
        Map<String, String> i = i();
        if (i == null || i.size() <= 0) {
            this.v = 0L;
            return null;
        }
        byte[] a2 = a(i, j());
        this.v = a2.length;
        return a2;
    }

    public String c() {
        return "application/x-www-form-urlencoded; charset=" + j();
    }

    public String d(String str) {
        if (this.e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public String e() {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        c cVar = this.a;
        if (cVar == null) {
            cVar = new com.mbridge.msdk.tracker.network.toolbox.e();
            this.a = cVar;
        }
        String a2 = cVar.a(this);
        this.b = a2;
        return a2;
    }

    public Map<String, String> f() {
        return Collections.EMPTY_MAP;
    }

    public int g() {
        return this.f;
    }

    public p h() {
        return this.c;
    }

    public Map<String, String> i() {
        return null;
    }

    public String j() {
        return C.UTF8_NAME;
    }

    public int k() {
        return this.h;
    }

    public a l() {
        return a.NORMAL;
    }

    public long m() {
        return this.v;
    }

    public long n() {
        return SystemClock.elapsedRealtime() - this.d;
    }

    public x o() {
        return this.t;
    }

    public String p() {
        return this.i;
    }

    public final int q() {
        x o = o();
        if (o == null) {
            return 30000;
        }
        return o.b();
    }

    public final long r() {
        x o = o();
        if (o == null) {
            return CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        }
        long a2 = o.a();
        return a2 < 0 ? CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL : a2;
    }

    public int s() {
        return this.j;
    }

    public String t() {
        return this.g;
    }

    public String toString() {
        return (v() ? "[X] " : "[ ] ") + t() + " " + ("0x" + Integer.toHexString(s())) + " " + l() + " " + this.m;
    }

    public boolean u() {
        boolean z;
        synchronized (this.k) {
            z = this.q;
        }
        return z;
    }

    public boolean v() {
        boolean z;
        synchronized (this.k) {
            z = this.p;
        }
        return z;
    }

    public void w() {
        synchronized (this.k) {
            this.q = true;
        }
    }

    public void x() {
        synchronized (this.k) {
        }
    }

    public boolean y() {
        return true;
    }

    public final boolean z() {
        return this.o;
    }

    public void c(String str) {
        u uVar = this.n;
        if (uVar != null) {
            uVar.c(this);
        }
    }

    public b0 c(b0 b0Var) {
        return b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> c(boolean z) {
        this.r = z;
        return this;
    }

    public b.a d() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(int i) {
        this.m = Integer.valueOf(i);
        return this;
    }

    private static int b(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(boolean z) {
        this.s = z;
        return this;
    }

    public void b(b0 b0Var) {
        v.a aVar;
        synchronized (this.k) {
            aVar = this.l;
        }
        if (aVar != null) {
            aVar.a(b0Var);
        }
    }

    public t(int i, String str, int i2) {
        this(i, str, i2, "un_known");
    }

    public t(int i, String str) {
        this(i, str, 0);
    }

    public void a(String str) {
    }

    public boolean a() {
        return false;
    }

    public void a(v.a aVar) {
        this.l = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(x xVar) {
        this.t = xVar;
        return this;
    }

    public void a(int i) {
        u uVar = this.n;
        if (uVar != null) {
            uVar.a(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(u uVar) {
        this.n = uVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> a(boolean z) {
        this.o = z;
        return this;
    }

    public void a(v<?> vVar) {
        synchronized (this.k) {
        }
    }

    public void a(p pVar) {
        this.c = pVar;
    }

    public void a(String str, String str2) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.e.put(str, str2);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(t<T> tVar) {
        int ordinal;
        int ordinal2;
        a l = l();
        a l2 = tVar.l();
        if (l == l2) {
            ordinal = this.m.intValue();
            ordinal2 = tVar.m.intValue();
        } else {
            ordinal = l2.ordinal();
            ordinal2 = l.ordinal();
        }
        return ordinal - ordinal2;
    }
}
