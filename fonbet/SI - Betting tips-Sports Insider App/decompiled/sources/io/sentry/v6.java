package io.sentry;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v6 extends n6 {

    /* renamed from: s, reason: collision with root package name */
    public static final io.sentry.protocol.h0 f17198s = io.sentry.protocol.h0.CUSTOM;

    /* renamed from: p, reason: collision with root package name */
    public String f17199p;
    public io.sentry.protocol.h0 q;

    /* renamed from: r, reason: collision with root package name */
    public c4.d f17200r;

    public v6(String str, io.sentry.protocol.h0 h0Var, String str2, c4.d dVar) {
        super(new io.sentry.protocol.v(), new p6(), str2, null);
        y4.a.C(str, "name is required");
        this.f17199p = str;
        this.q = h0Var;
        a(dVar);
        this.f16678m = com.google.android.gms.internal.measurement.y3.i(null, dVar == null ? null : (Boolean) dVar.f3577b, dVar == null ? null : (Double) dVar.f3578c, dVar == null ? null : (Double) dVar.f3579d);
    }

    public static v6 b(androidx.appcompat.app.v0 v0Var) {
        v0Var.getClass();
        c cVar = (c) v0Var.f366d;
        Double d10 = cVar.f16220c;
        v6 v6Var = new v6((io.sentry.protocol.v) v0Var.f364b, (p6) v0Var.f365c, "default", (p6) null);
        v6Var.f17199p = "<unlabeled transaction>";
        v6Var.f17200r = null;
        v6Var.q = f17198s;
        v6Var.f16678m = com.google.android.gms.internal.measurement.y3.i(cVar, null, null, null);
        return v6Var;
    }
}
