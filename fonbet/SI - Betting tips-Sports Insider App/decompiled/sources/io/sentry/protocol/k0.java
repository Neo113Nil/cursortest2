package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k0 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16840a;

    /* renamed from: b, reason: collision with root package name */
    public String f16841b;

    /* renamed from: c, reason: collision with root package name */
    public String f16842c;

    /* renamed from: d, reason: collision with root package name */
    public String f16843d;

    /* renamed from: e, reason: collision with root package name */
    public Double f16844e;

    /* renamed from: f, reason: collision with root package name */
    public Double f16845f;

    /* renamed from: g, reason: collision with root package name */
    public Double f16846g;

    /* renamed from: h, reason: collision with root package name */
    public Double f16847h;

    /* renamed from: i, reason: collision with root package name */
    public String f16848i;
    public Double j;

    /* renamed from: k, reason: collision with root package name */
    public List f16849k;

    /* renamed from: l, reason: collision with root package name */
    public HashMap f16850l;

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16840a != null) {
            aVar.u("rendering_system");
            aVar.K(this.f16840a);
        }
        if (this.f16841b != null) {
            aVar.u("type");
            aVar.K(this.f16841b);
        }
        if (this.f16842c != null) {
            aVar.u("identifier");
            aVar.K(this.f16842c);
        }
        if (this.f16843d != null) {
            aVar.u("tag");
            aVar.K(this.f16843d);
        }
        if (this.f16844e != null) {
            aVar.u("width");
            aVar.J(this.f16844e);
        }
        if (this.f16845f != null) {
            aVar.u("height");
            aVar.J(this.f16845f);
        }
        if (this.f16846g != null) {
            aVar.u("x");
            aVar.J(this.f16846g);
        }
        if (this.f16847h != null) {
            aVar.u("y");
            aVar.J(this.f16847h);
        }
        if (this.f16848i != null) {
            aVar.u("visibility");
            aVar.K(this.f16848i);
        }
        if (this.j != null) {
            aVar.u("alpha");
            aVar.J(this.j);
        }
        List list = this.f16849k;
        if (list != null && !list.isEmpty()) {
            aVar.u("children");
            aVar.H(iLogger, this.f16849k);
        }
        HashMap hashMap = this.f16850l;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16850l, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
