package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16855a;

    /* renamed from: b, reason: collision with root package name */
    public String f16856b;

    /* renamed from: c, reason: collision with root package name */
    public String f16857c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f16858d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractMap f16859e;

    /* renamed from: f, reason: collision with root package name */
    public ConcurrentHashMap f16860f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f16861g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f16862h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f16863i;
    public Boolean j;

    /* renamed from: k, reason: collision with root package name */
    public HashMap f16864k;

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16855a != null) {
            aVar.u("type");
            aVar.K(this.f16855a);
        }
        if (this.f16856b != null) {
            aVar.u("description");
            aVar.K(this.f16856b);
        }
        if (this.f16857c != null) {
            aVar.u("help_link");
            aVar.K(this.f16857c);
        }
        if (this.f16858d != null) {
            aVar.u("handled");
            aVar.I(this.f16858d);
        }
        if (this.f16859e != null) {
            aVar.u("meta");
            aVar.H(iLogger, this.f16859e);
        }
        if (this.f16860f != null) {
            aVar.u("data");
            aVar.H(iLogger, this.f16860f);
        }
        if (this.f16861g != null) {
            aVar.u("synthetic");
            aVar.I(this.f16861g);
        }
        if (this.f16862h != null) {
            aVar.u("exception_id");
            aVar.H(iLogger, this.f16862h);
        }
        if (this.f16863i != null) {
            aVar.u("parent_id");
            aVar.H(iLogger, this.f16863i);
        }
        if (this.j != null) {
            aVar.u("is_exception_group");
            aVar.I(this.j);
        }
        HashMap hashMap = this.f16864k;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16864k, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
