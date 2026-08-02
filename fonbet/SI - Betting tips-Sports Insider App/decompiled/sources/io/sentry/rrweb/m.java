package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends b implements c2 {

    /* renamed from: c, reason: collision with root package name */
    public String f17037c;

    /* renamed from: d, reason: collision with root package name */
    public int f17038d;

    /* renamed from: e, reason: collision with root package name */
    public long f17039e;

    /* renamed from: f, reason: collision with root package name */
    public long f17040f;

    /* renamed from: g, reason: collision with root package name */
    public String f17041g;

    /* renamed from: h, reason: collision with root package name */
    public String f17042h;

    /* renamed from: i, reason: collision with root package name */
    public int f17043i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f17044k;

    /* renamed from: l, reason: collision with root package name */
    public String f17045l;

    /* renamed from: m, reason: collision with root package name */
    public int f17046m;

    /* renamed from: n, reason: collision with root package name */
    public int f17047n;

    /* renamed from: o, reason: collision with root package name */
    public int f17048o;

    /* renamed from: p, reason: collision with root package name */
    public HashMap f17049p;
    public ConcurrentHashMap q;

    /* renamed from: r, reason: collision with root package name */
    public ConcurrentHashMap f17050r;

    public m() {
        super(c.Custom);
        this.f17041g = "h264";
        this.f17042h = "mp4";
        this.f17045l = "constant";
        this.f17037c = "video";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f17038d == mVar.f17038d && this.f17039e == mVar.f17039e && this.f17040f == mVar.f17040f && this.f17043i == mVar.f17043i && this.j == mVar.j && this.f17044k == mVar.f17044k && this.f17046m == mVar.f17046m && this.f17047n == mVar.f17047n && this.f17048o == mVar.f17048o && y4.a.s(this.f17037c, mVar.f17037c) && y4.a.s(this.f17041g, mVar.f17041g) && y4.a.s(this.f17042h, mVar.f17042h) && y4.a.s(this.f17045l, mVar.f17045l);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f17037c, Integer.valueOf(this.f17038d), Long.valueOf(this.f17039e), Long.valueOf(this.f17040f), this.f17041g, this.f17042h, Integer.valueOf(this.f17043i), Integer.valueOf(this.j), Integer.valueOf(this.f17044k), this.f17045l, Integer.valueOf(this.f17046m), Integer.valueOf(this.f17047n), Integer.valueOf(this.f17048o)});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("type");
        aVar.H(iLogger, this.f17004a);
        aVar.u("timestamp");
        aVar.G(this.f17005b);
        aVar.u("data");
        aVar.j();
        aVar.u("tag");
        aVar.K(this.f17037c);
        aVar.u("payload");
        aVar.j();
        aVar.u("segmentId");
        aVar.G(this.f17038d);
        aVar.u("size");
        aVar.G(this.f17039e);
        aVar.u("duration");
        aVar.G(this.f17040f);
        aVar.u("encoding");
        aVar.K(this.f17041g);
        aVar.u("container");
        aVar.K(this.f17042h);
        aVar.u("height");
        aVar.G(this.f17043i);
        aVar.u("width");
        aVar.G(this.j);
        aVar.u("frameCount");
        aVar.G(this.f17044k);
        aVar.u("frameRate");
        aVar.G(this.f17046m);
        aVar.u("frameRateType");
        aVar.K(this.f17045l);
        aVar.u("left");
        aVar.G(this.f17047n);
        aVar.u("top");
        aVar.G(this.f17048o);
        ConcurrentHashMap concurrentHashMap = this.q;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.q, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
        ConcurrentHashMap concurrentHashMap2 = this.f17050r;
        if (concurrentHashMap2 != null) {
            for (K k9 : concurrentHashMap2.keySet()) {
                d9.e.v(this.f17050r, k9, aVar, k9, iLogger);
            }
        }
        aVar.o();
        HashMap hashMap = this.f17049p;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f17049p, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
