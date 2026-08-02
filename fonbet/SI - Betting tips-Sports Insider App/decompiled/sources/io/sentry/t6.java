package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t6 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.v f17103a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17104b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17105c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17106d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17107e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17108f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17109g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17110h;

    /* renamed from: i, reason: collision with root package name */
    public final String f17111i;
    public final io.sentry.protocol.v j;

    /* renamed from: k, reason: collision with root package name */
    public ConcurrentHashMap f17112k;

    public t6(io.sentry.protocol.v vVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.v vVar2, String str8) {
        this.f17103a = vVar;
        this.f17104b = str;
        this.f17105c = str2;
        this.f17106d = str3;
        this.f17107e = str4;
        this.f17108f = str5;
        this.f17109g = str6;
        this.f17111i = str7;
        this.j = vVar2;
        this.f17110h = str8;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("trace_id");
        aVar.H(iLogger, this.f17103a);
        aVar.u("public_key");
        aVar.K(this.f17104b);
        String str = this.f17105c;
        if (str != null) {
            aVar.u("release");
            aVar.K(str);
        }
        String str2 = this.f17106d;
        if (str2 != null) {
            aVar.u("environment");
            aVar.K(str2);
        }
        String str3 = this.f17107e;
        if (str3 != null) {
            aVar.u("user_id");
            aVar.K(str3);
        }
        String str4 = this.f17108f;
        if (str4 != null) {
            aVar.u("transaction");
            aVar.K(str4);
        }
        String str5 = this.f17109g;
        if (str5 != null) {
            aVar.u("sample_rate");
            aVar.K(str5);
        }
        String str6 = this.f17110h;
        if (str6 != null) {
            aVar.u("sample_rand");
            aVar.K(str6);
        }
        String str7 = this.f17111i;
        if (str7 != null) {
            aVar.u("sampled");
            aVar.K(str7);
        }
        io.sentry.protocol.v vVar = this.j;
        if (vVar != null) {
            aVar.u("replay_id");
            aVar.H(iLogger, vVar);
        }
        ConcurrentHashMap concurrentHashMap = this.f17112k;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f17112k, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
