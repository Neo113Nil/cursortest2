package com.vk.api.sdk;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import xsna.asp;
import xsna.bh10;
import xsna.bjv;
import xsna.bpn0;
import xsna.cpm0;
import xsna.d13;
import xsna.epx;
import xsna.fw3;
import xsna.g7r0;
import xsna.gzs;
import xsna.h7r0;
import xsna.hcw;
import xsna.jhg;
import xsna.jz2;
import xsna.k200;
import xsna.kaq;
import xsna.l6r0;
import xsna.l830;
import xsna.mer0;
import xsna.nay;
import xsna.ox70;
import xsna.qoy;
import xsna.r03;
import xsna.r460;
import xsna.s03;
import xsna.sf3;
import xsna.shy;
import xsna.tb8;
import xsna.tj0;
import xsna.tq;
import xsna.tx2;
import xsna.tx5;
import xsna.ub8;
import xsna.urd0;
import xsna.ux2;
import xsna.vtk0;
import xsna.vx5;
import xsna.w03;
import xsna.wv8;
import xsna.zrp;

/* compiled from: VKApiConfig.kt */
/* loaded from: classes.dex */
public final class VKApiConfig {
    public final r03 A;
    public final bpn0 B;
    public final Lazy<l6r0> C;
    public final List<nay> D;
    public final bpn0 E;
    public final s03 F;
    public final bjv G;
    public final int H;
    public final long I;
    public final bpn0 J;
    public final List<cpm0> K;
    public final ox70 L;
    public final bpn0 M = new bpn0(new tb8(this, 9));
    public final bpn0 N = new bpn0(new ub8(this, 6));
    public final Context a;
    public final int b;
    public final k200 c;
    public final vtk0 d;
    public final hcw e;
    public final Lazy<String> f;
    public final String g;
    public final r460 h;
    public final d13 i;
    public final w03 j;
    public final Lazy<List<h7r0>> k;
    public final String l;
    public final boolean m;
    public final bpn0 n;
    public final int o;
    public final gzs<String> p;
    public final gzs<String> q;
    public final gzs<String> r;
    public final mer0 s;
    public final wv8 t;
    public final long u;
    public final long v;
    public final long w;
    public final vx5 x;
    public final tx5 y;
    public final jz2 z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VKApiConfig.kt */
    public static final class EndpointPathName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EndpointPathName[] $VALUES;
        public static final EndpointPathName EMPTY;
        public static final EndpointPathName METHOD;
        private final String pathName;

        static {
            EndpointPathName endpointPathName = new EndpointPathName("METHOD", 0, "/method");
            METHOD = endpointPathName;
            EndpointPathName endpointPathName2 = new EndpointPathName("EMPTY", 1, "");
            EMPTY = endpointPathName2;
            EndpointPathName[] endpointPathNameArr = {endpointPathName, endpointPathName2};
            $VALUES = endpointPathNameArr;
            $ENTRIES = new asp(endpointPathNameArr);
        }

        public EndpointPathName(String str, int i, String str2) {
            this.pathName = str2;
        }

        public static EndpointPathName valueOf(String str) {
            return (EndpointPathName) Enum.valueOf(EndpointPathName.class, str);
        }

        public static EndpointPathName[] values() {
            return (EndpointPathName[]) $VALUES.clone();
        }

        public final String h() {
            return this.pathName;
        }
    }

    /* compiled from: VKApiConfig.kt */
    public static final class a {
        public VKApiConfig a;
        public final ArrayList b;

        public a(VKApiConfig vKApiConfig) {
            this.a = vKApiConfig;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.a.D);
            this.b = arrayList;
        }

        public static tx5 a(a aVar, long j, long j2, long j3, int i) {
            VKApiConfig vKApiConfig = aVar.a;
            tx5 tx5Var = vKApiConfig.y;
            if ((i & 2) != 0) {
                j = vKApiConfig.u;
            }
            long j4 = j;
            if ((i & 4) != 0) {
                j2 = vKApiConfig.v;
            }
            long j5 = j2;
            if ((i & 8) != 0) {
                j3 = vKApiConfig.w;
            }
            long j6 = j3;
            if (tx5Var instanceof kaq) {
                return new kaq(j5, j4, j6);
            }
            if (tx5Var instanceof l830) {
                return new l830(j5, j4);
            }
            throw new IllegalStateException("Unexpected backoff algorithm");
        }
    }

    public VKApiConfig(Context context, int i, k200 k200Var, vtk0 vtk0Var, hcw hcwVar, Lazy lazy, String str, r460 r460Var, d13 d13Var, w03 w03Var, Lazy lazy2, String str2, boolean z, bpn0 bpn0Var, int i2, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, mer0 mer0Var, wv8 wv8Var, long j, long j2, long j3, vx5 vx5Var, tx5 tx5Var, jz2 jz2Var, r03 r03Var, bpn0 bpn0Var2, Lazy lazy3, List list, bpn0 bpn0Var3, s03 s03Var, bjv bjvVar, int i3, long j4, bpn0 bpn0Var4, List list2, ox70 ox70Var) {
        this.a = context;
        this.b = i;
        this.c = k200Var;
        this.d = vtk0Var;
        this.e = hcwVar;
        this.f = lazy;
        this.g = str;
        this.h = r460Var;
        this.i = d13Var;
        this.j = w03Var;
        this.k = lazy2;
        this.l = str2;
        this.m = z;
        this.n = bpn0Var;
        this.o = i2;
        this.p = gzsVar;
        this.q = gzsVar2;
        this.r = gzsVar3;
        this.s = mer0Var;
        this.t = wv8Var;
        this.u = j;
        this.v = j2;
        this.w = j3;
        this.x = vx5Var;
        this.y = tx5Var;
        this.z = jz2Var;
        this.A = r03Var;
        this.B = bpn0Var2;
        this.C = lazy3;
        this.D = list;
        this.E = bpn0Var3;
        this.F = s03Var;
        this.G = bjvVar;
        this.H = i3;
        this.I = j4;
        this.J = bpn0Var4;
        this.K = list2;
        this.L = ox70Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VKApiConfig a(VKApiConfig vKApiConfig, int i, bpn0 bpn0Var, String str, bpn0 bpn0Var2, String str2, tx2 tx2Var, ux2 ux2Var, jhg jhgVar, long j, long j2, long j3, tx5 tx5Var, bpn0 bpn0Var3, List list, int i2) {
        wv8 wv8Var;
        int i3;
        long j4;
        Context context = vKApiConfig.a;
        int i4 = (i2 & 2) != 0 ? vKApiConfig.b : i;
        k200 k200Var = vKApiConfig.c;
        int i5 = i4;
        vtk0 vtk0Var = vKApiConfig.d;
        hcw hcwVar = vKApiConfig.e;
        Lazy<String> lazy = (i2 & 32) != 0 ? vKApiConfig.f : bpn0Var;
        String str3 = (i2 & 64) != 0 ? vKApiConfig.g : str;
        r460 r460Var = vKApiConfig.h;
        Lazy<String> lazy2 = lazy;
        String str4 = str3;
        d13 d13Var = vKApiConfig.i;
        w03 w03Var = vKApiConfig.j;
        Lazy<List<h7r0>> lazy3 = (i2 & 1024) != 0 ? vKApiConfig.k : bpn0Var2;
        String str5 = (i2 & 2048) != 0 ? vKApiConfig.l : str2;
        boolean z = (i2 & 4096) != 0 ? vKApiConfig.m : true;
        bpn0 bpn0Var4 = vKApiConfig.n;
        int i6 = (i2 & 16384) != 0 ? vKApiConfig.o : 5;
        gzs gzsVar = (i2 & 32768) != 0 ? vKApiConfig.p : tx2Var;
        gzs gzsVar2 = (i2 & 65536) != 0 ? vKApiConfig.q : ux2Var;
        gzs gzsVar3 = (i2 & 131072) != 0 ? vKApiConfig.r : jhgVar;
        mer0 mer0Var = vKApiConfig.s;
        wv8 wv8Var2 = vKApiConfig.t;
        if ((i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
            wv8Var = wv8Var2;
            i3 = i6;
            j4 = vKApiConfig.u;
        } else {
            wv8Var = wv8Var2;
            i3 = i6;
            j4 = j;
        }
        return new VKApiConfig(context, i5, k200Var, vtk0Var, hcwVar, lazy2, str4, r460Var, d13Var, w03Var, lazy3, str5, z, bpn0Var4, i3, gzsVar, gzsVar2, gzsVar3, mer0Var, wv8Var, j4, (i2 & 2097152) != 0 ? vKApiConfig.v : j2, (i2 & 4194304) != 0 ? vKApiConfig.w : j3, vKApiConfig.x, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? vKApiConfig.y : tx5Var, vKApiConfig.z, vKApiConfig.A, vKApiConfig.B, (i2 & 268435456) != 0 ? vKApiConfig.C : bpn0Var3, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? vKApiConfig.D : list, vKApiConfig.E, vKApiConfig.F, vKApiConfig.G, vKApiConfig.H, vKApiConfig.I, vKApiConfig.J, vKApiConfig.K, vKApiConfig.L);
    }

    public final String b() {
        return this.r.invoke();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKApiConfig)) {
            return false;
        }
        VKApiConfig vKApiConfig = (VKApiConfig) obj;
        return epx.f(this.a, vKApiConfig.a) && this.b == vKApiConfig.b && this.c.equals(vKApiConfig.c) && this.d.equals(vKApiConfig.d) && this.e.equals(vKApiConfig.e) && epx.f(this.f, vKApiConfig.f) && epx.f(this.g, vKApiConfig.g) && this.h.equals(vKApiConfig.h) && this.i.equals(vKApiConfig.i) && this.j.equals(vKApiConfig.j) && epx.f(this.k, vKApiConfig.k) && epx.f(this.l, vKApiConfig.l) && this.m == vKApiConfig.m && this.n.equals(vKApiConfig.n) && this.o == vKApiConfig.o && epx.f(this.p, vKApiConfig.p) && epx.f(this.q, vKApiConfig.q) && epx.f(this.r, vKApiConfig.r) && this.s.equals(vKApiConfig.s) && this.t.equals(vKApiConfig.t) && this.u == vKApiConfig.u && this.v == vKApiConfig.v && this.w == vKApiConfig.w && this.x.equals(vKApiConfig.x) && epx.f(this.y, vKApiConfig.y) && epx.f(this.z, vKApiConfig.z) && this.A.equals(vKApiConfig.A) && this.B.equals(vKApiConfig.B) && epx.f(this.C, vKApiConfig.C) && epx.f(this.D, vKApiConfig.D) && this.E.equals(vKApiConfig.E) && this.F.equals(vKApiConfig.F) && this.G.equals(vKApiConfig.G) && this.H == vKApiConfig.H && this.I == vKApiConfig.I && this.J.equals(vKApiConfig.J) && epx.f(this.K, vKApiConfig.K) && epx.f(this.L, vKApiConfig.L);
    }

    public final int hashCode() {
        int a2 = fw3.a(tq.b(this.J, bh10.a(bh10.a(shy.a(this.H, (this.G.hashCode() + ((this.F.hashCode() + tq.b(this.E, fw3.a(g7r0.a(this.C, tq.b(this.B, (this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + bh10.a(bh10.a(bh10.a((this.t.hashCode() + ((this.s.hashCode() + sf3.a(sf3.a(sf3.a(shy.a(this.o, tq.b(this.n, qoy.b(urd0.a(g7r0.a(this.k, (this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + urd0.a(g7r0.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31), 31, this.g)) * 31)) * 31)) * 31, 31), 31, this.l), 31, this.m), 31), 31), 31, this.p), 31, this.q), 31, this.r)) * 31)) * 31, 31, this.u), 31, this.v), 31, this.w)) * 31)) * 31)) * 31)) * 31, 31), 31), 31, this.D), 31)) * 31)) * 31, 31), 31, this.I), 31, 0L), 961), 31, this.K);
        ox70 ox70Var = this.L;
        return a2 + (ox70Var == null ? 0 : ox70Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKApiConfig(context=");
        sb.append(this.a);
        sb.append(", appId=");
        sb.append(this.b);
        sb.append(", validationHandler=");
        sb.append(this.c);
        sb.append(", apiCallListener=");
        sb.append(this.d);
        sb.append(", sectionAvailabilityListener=");
        sb.append(this.e);
        sb.append(", deviceId=");
        sb.append(this.f);
        sb.append(", version=");
        sb.append(this.g);
        sb.append(", okHttpProvider=");
        sb.append(this.h);
        sb.append(", logger=");
        sb.append(this.i);
        sb.append(", loggingPrefixer=");
        sb.append(this.j);
        sb.append(", credentials=");
        sb.append(this.k);
        sb.append(", clientSecret=");
        sb.append(this.l);
        sb.append(", logFilterCredentials=");
        sb.append(this.m);
        sb.append(", debugCycleCalls=");
        sb.append(this.n);
        sb.append(", callsPerSecondLimit=");
        sb.append(this.o);
        sb.append(", apiHostProvider=");
        sb.append(this.p);
        sb.append(", oauthHostProvider=");
        sb.append(this.q);
        sb.append(", langProvider=");
        sb.append(this.r);
        sb.append(", keyValueStorage=");
        sb.append(this.s);
        sb.append(", customApiEndpoint=");
        sb.append(this.t);
        sb.append(", maxRateLimitBackoffTimeoutMs=");
        sb.append(this.u);
        tj0.d(sb, ", minRateLimitBackoffTimeoutMs=", this.v, ", leftBoundLimitBackoffTimeoutMs=");
        sb.append(this.w);
        sb.append(", backoffStore=");
        sb.append(this.x);
        sb.append(", backoffAlgorithm=");
        sb.append(this.y);
        sb.append(", apiMethodPriorityBackoff=");
        sb.append(this.z);
        sb.append(", skipRetryOnInternalServerError=");
        sb.append(this.A);
        sb.append(", externalDeviceId=");
        sb.append(this.B);
        sb.append(", anonymousTokenProvider=");
        sb.append(this.C);
        sb.append(", customJsonResponseTypeConverters=");
        sb.append(this.D);
        sb.append(", accessTokenRefresher=");
        sb.append(this.E);
        sb.append(", clientIdClientSecretMethodsTracker=");
        sb.append(this.F);
        sb.append(", xScreenProvider=");
        sb.append(this.G);
        sb.append(", allowedRequestsInWindow=");
        sb.append(this.H);
        tj0.d(sb, ", requestsTimeWindow=", this.I, ", backoffGracePeriodMs=0, apiCredentialsProvider=");
        sb.append(this.J);
        sb.append(", userAgentProvider=null, customResponseBodyToInputStreamConverter=");
        sb.append(this.K);
        sb.append(", okHttpCallTracker=");
        sb.append(this.L);
        sb.append(")");
        return sb.toString();
    }
}
