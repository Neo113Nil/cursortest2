package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16733a;

    /* renamed from: b, reason: collision with root package name */
    public Date f16734b;

    /* renamed from: c, reason: collision with root package name */
    public String f16735c;

    /* renamed from: d, reason: collision with root package name */
    public String f16736d;

    /* renamed from: e, reason: collision with root package name */
    public String f16737e;

    /* renamed from: f, reason: collision with root package name */
    public String f16738f;

    /* renamed from: g, reason: collision with root package name */
    public String f16739g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractMap f16740h;

    /* renamed from: i, reason: collision with root package name */
    public List f16741i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f16742k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f16743l;

    /* renamed from: m, reason: collision with root package name */
    public List f16744m;

    /* renamed from: n, reason: collision with root package name */
    public ConcurrentHashMap f16745n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return y4.a.s(this.f16733a, aVar.f16733a) && y4.a.s(this.f16734b, aVar.f16734b) && y4.a.s(this.f16735c, aVar.f16735c) && y4.a.s(this.f16736d, aVar.f16736d) && y4.a.s(this.f16737e, aVar.f16737e) && y4.a.s(this.f16738f, aVar.f16738f) && y4.a.s(this.f16739g, aVar.f16739g) && y4.a.s(this.f16740h, aVar.f16740h) && y4.a.s(this.f16742k, aVar.f16742k) && y4.a.s(this.f16741i, aVar.f16741i) && y4.a.s(this.j, aVar.j) && y4.a.s(this.f16743l, aVar.f16743l) && y4.a.s(this.f16744m, aVar.f16744m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16733a, this.f16734b, this.f16735c, this.f16736d, this.f16737e, this.f16738f, this.f16739g, this.f16740h, this.f16742k, this.f16741i, this.j, this.f16743l, this.f16744m});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16733a != null) {
            aVar.u("app_identifier");
            aVar.K(this.f16733a);
        }
        if (this.f16734b != null) {
            aVar.u("app_start_time");
            aVar.H(iLogger, this.f16734b);
        }
        if (this.f16735c != null) {
            aVar.u("device_app_hash");
            aVar.K(this.f16735c);
        }
        if (this.f16736d != null) {
            aVar.u("build_type");
            aVar.K(this.f16736d);
        }
        if (this.f16737e != null) {
            aVar.u("app_name");
            aVar.K(this.f16737e);
        }
        if (this.f16738f != null) {
            aVar.u("app_version");
            aVar.K(this.f16738f);
        }
        if (this.f16739g != null) {
            aVar.u("app_build");
            aVar.K(this.f16739g);
        }
        AbstractMap abstractMap = this.f16740h;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            aVar.u("permissions");
            aVar.H(iLogger, this.f16740h);
        }
        if (this.f16742k != null) {
            aVar.u("in_foreground");
            aVar.I(this.f16742k);
        }
        if (this.f16741i != null) {
            aVar.u("view_names");
            aVar.H(iLogger, this.f16741i);
        }
        if (this.j != null) {
            aVar.u("start_type");
            aVar.K(this.j);
        }
        if (this.f16743l != null) {
            aVar.u("is_split_apks");
            aVar.I(this.f16743l);
        }
        List list = this.f16744m;
        if (list != null && !list.isEmpty()) {
            aVar.u("split_names");
            aVar.H(iLogger, this.f16744m);
        }
        ConcurrentHashMap concurrentHashMap = this.f16745n;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16745n, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
