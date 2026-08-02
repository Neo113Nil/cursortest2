package io.sentry;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h4 {

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.protocol.v f16455a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.protocol.c f16456b;

    /* renamed from: c, reason: collision with root package name */
    public io.sentry.protocol.t f16457c;

    /* renamed from: d, reason: collision with root package name */
    public io.sentry.protocol.p f16458d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractMap f16459e;

    /* renamed from: f, reason: collision with root package name */
    public String f16460f;

    /* renamed from: g, reason: collision with root package name */
    public String f16461g;

    /* renamed from: h, reason: collision with root package name */
    public String f16462h;

    /* renamed from: i, reason: collision with root package name */
    public io.sentry.protocol.i0 f16463i;
    public transient Throwable j;

    /* renamed from: k, reason: collision with root package name */
    public String f16464k;

    /* renamed from: l, reason: collision with root package name */
    public String f16465l;

    /* renamed from: m, reason: collision with root package name */
    public List f16466m;

    /* renamed from: n, reason: collision with root package name */
    public io.sentry.protocol.d f16467n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractMap f16468o;

    public h4(io.sentry.protocol.v vVar) {
        this.f16456b = new io.sentry.protocol.c();
        this.f16455a = vVar;
    }

    public final Throwable a() {
        Throwable th2 = this.j;
        return th2 instanceof io.sentry.exception.a ? ((io.sentry.exception.a) th2).f16384b : th2;
    }

    public final void b(String str, String str2) {
        if (this.f16459e == null) {
            this.f16459e = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 != null) {
            this.f16459e.put(str, str2);
            return;
        }
        AbstractMap abstractMap = this.f16459e;
        if (abstractMap != null) {
            abstractMap.remove(str);
        }
    }

    public h4() {
        this(new io.sentry.protocol.v());
    }
}
