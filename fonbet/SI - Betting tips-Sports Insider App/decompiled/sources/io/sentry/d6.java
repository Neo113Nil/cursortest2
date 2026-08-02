package io.sentry;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d6 extends h4 implements c2 {

    /* renamed from: p, reason: collision with root package name */
    public File f16320p;

    /* renamed from: t, reason: collision with root package name */
    public int f16323t;

    /* renamed from: v, reason: collision with root package name */
    public Date f16325v;

    /* renamed from: z, reason: collision with root package name */
    public HashMap f16329z;

    /* renamed from: s, reason: collision with root package name */
    public io.sentry.protocol.v f16322s = new io.sentry.protocol.v();
    public String q = "replay_event";

    /* renamed from: r, reason: collision with root package name */
    public c6 f16321r = c6.SESSION;

    /* renamed from: x, reason: collision with root package name */
    public List f16327x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public List f16328y = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public List f16326w = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public Date f16324u = com.google.android.play.core.appupdate.b.n();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d6.class == obj.getClass()) {
            d6 d6Var = (d6) obj;
            if (this.f16323t == d6Var.f16323t && y4.a.s(this.q, d6Var.q) && this.f16321r == d6Var.f16321r && y4.a.s(this.f16322s, d6Var.f16322s) && y4.a.s(this.f16326w, d6Var.f16326w) && y4.a.s(this.f16327x, d6Var.f16327x) && y4.a.s(this.f16328y, d6Var.f16328y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.q, this.f16321r, this.f16322s, Integer.valueOf(this.f16323t), this.f16326w, this.f16327x, this.f16328y});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("type");
        aVar.K(this.q);
        aVar.u("replay_type");
        aVar.H(iLogger, this.f16321r);
        aVar.u("segment_id");
        aVar.G(this.f16323t);
        aVar.u("timestamp");
        aVar.H(iLogger, this.f16324u);
        if (this.f16322s != null) {
            aVar.u("replay_id");
            aVar.H(iLogger, this.f16322s);
        }
        if (this.f16325v != null) {
            aVar.u("replay_start_timestamp");
            aVar.H(iLogger, this.f16325v);
        }
        if (this.f16326w != null) {
            aVar.u("urls");
            aVar.H(iLogger, this.f16326w);
        }
        if (this.f16327x != null) {
            aVar.u("error_ids");
            aVar.H(iLogger, this.f16327x);
        }
        if (this.f16328y != null) {
            aVar.u("trace_ids");
            aVar.H(iLogger, this.f16328y);
        }
        h8.b.z(this, aVar, iLogger);
        HashMap hashMap = this.f16329z;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16329z, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
