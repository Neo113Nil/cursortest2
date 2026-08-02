package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h5 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.protocol.v f16469a;

    /* renamed from: b, reason: collision with root package name */
    public p6 f16470b;

    /* renamed from: c, reason: collision with root package name */
    public Double f16471c;

    /* renamed from: d, reason: collision with root package name */
    public String f16472d;

    /* renamed from: e, reason: collision with root package name */
    public String f16473e;

    /* renamed from: f, reason: collision with root package name */
    public String f16474f;

    /* renamed from: g, reason: collision with root package name */
    public Double f16475g;

    /* renamed from: h, reason: collision with root package name */
    public Map f16476h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f16477i;

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("timestamp");
        aVar.H(iLogger, com.google.android.play.core.appupdate.b.k(this.f16471c));
        aVar.u("type");
        aVar.K(this.f16474f);
        aVar.u("name");
        aVar.K(this.f16472d);
        aVar.u("value");
        aVar.J(this.f16475g);
        aVar.u("trace_id");
        aVar.H(iLogger, this.f16469a);
        if (this.f16470b != null) {
            aVar.u("span_id");
            aVar.H(iLogger, this.f16470b);
        }
        if (this.f16473e != null) {
            aVar.u("unit");
            aVar.H(iLogger, this.f16473e);
        }
        if (this.f16476h != null) {
            aVar.u("attributes");
            aVar.H(iLogger, this.f16476h);
        }
        HashMap hashMap = this.f16477i;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16477i, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
