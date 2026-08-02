package io.sentry;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g3 implements c2 {

    /* renamed from: b, reason: collision with root package name */
    public io.sentry.protocol.v f16426b;

    /* renamed from: c, reason: collision with root package name */
    public io.sentry.protocol.v f16427c;

    /* renamed from: d, reason: collision with root package name */
    public io.sentry.protocol.t f16428d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f16429e;

    /* renamed from: f, reason: collision with root package name */
    public String f16430f;

    /* renamed from: g, reason: collision with root package name */
    public String f16431g;

    /* renamed from: h, reason: collision with root package name */
    public String f16432h;

    /* renamed from: i, reason: collision with root package name */
    public String f16433i;
    public double j;

    /* renamed from: k, reason: collision with root package name */
    public final File f16434k;

    /* renamed from: m, reason: collision with root package name */
    public io.sentry.protocol.profiling.a f16436m;

    /* renamed from: n, reason: collision with root package name */
    public ConcurrentHashMap f16437n;

    /* renamed from: l, reason: collision with root package name */
    public String f16435l = null;

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.protocol.d f16425a = null;

    public g3(io.sentry.protocol.v vVar, io.sentry.protocol.v vVar2, File file, Map map, Double d10, String str, b6 b6Var) {
        this.f16426b = vVar;
        this.f16427c = vVar2;
        this.f16434k = file;
        this.f16429e = map;
        this.f16428d = b6Var.getSdkVersion();
        this.f16431g = b6Var.getRelease() != null ? b6Var.getRelease() : "";
        this.f16432h = b6Var.getEnvironment();
        this.f16430f = str;
        this.f16433i = "2";
        this.j = d10.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return Objects.equals(this.f16425a, g3Var.f16425a) && Objects.equals(this.f16426b, g3Var.f16426b) && Objects.equals(this.f16427c, g3Var.f16427c) && Objects.equals(this.f16428d, g3Var.f16428d) && Objects.equals(this.f16429e, g3Var.f16429e) && Objects.equals(this.f16430f, g3Var.f16430f) && Objects.equals(this.f16431g, g3Var.f16431g) && Objects.equals(this.f16432h, g3Var.f16432h) && Objects.equals(this.f16433i, g3Var.f16433i) && Objects.equals(this.f16435l, g3Var.f16435l) && Objects.equals(this.f16437n, g3Var.f16437n) && Objects.equals(this.f16436m, g3Var.f16436m);
    }

    public final int hashCode() {
        return Objects.hash(this.f16425a, this.f16426b, this.f16427c, this.f16428d, this.f16429e, this.f16430f, this.f16431g, this.f16432h, this.f16433i, this.f16435l, this.f16436m, this.f16437n);
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16425a != null) {
            aVar.u("debug_meta");
            aVar.H(iLogger, this.f16425a);
        }
        aVar.u("profiler_id");
        aVar.H(iLogger, this.f16426b);
        aVar.u("chunk_id");
        aVar.H(iLogger, this.f16427c);
        if (this.f16428d != null) {
            aVar.u("client_sdk");
            aVar.H(iLogger, this.f16428d);
        }
        Map map = this.f16429e;
        if (!map.isEmpty()) {
            String str = ((io.sentry.vendor.gson.stream.c) aVar.f19314b).f17221d;
            aVar.C("");
            aVar.u("measurements");
            aVar.H(iLogger, map);
            aVar.C(str);
        }
        aVar.u("platform");
        aVar.H(iLogger, this.f16430f);
        aVar.u("release");
        aVar.H(iLogger, this.f16431g);
        if (this.f16432h != null) {
            aVar.u("environment");
            aVar.H(iLogger, this.f16432h);
        }
        aVar.u("version");
        aVar.H(iLogger, this.f16433i);
        if (this.f16435l != null) {
            aVar.u("sampled_profile");
            aVar.H(iLogger, this.f16435l);
        }
        aVar.u("timestamp");
        aVar.H(iLogger, BigDecimal.valueOf(this.j).setScale(6, RoundingMode.DOWN));
        if (this.f16436m != null) {
            aVar.u("profile");
            aVar.H(iLogger, this.f16436m);
        }
        ConcurrentHashMap concurrentHashMap = this.f16437n;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16437n, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
