package io.sentry;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f6 {

    /* renamed from: s, reason: collision with root package name */
    public static final List f16399s = DesugarCollections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));

    /* renamed from: a, reason: collision with root package name */
    public Double f16400a;

    /* renamed from: b, reason: collision with root package name */
    public Double f16401b;

    /* renamed from: c, reason: collision with root package name */
    public CopyOnWriteArraySet f16402c;

    /* renamed from: d, reason: collision with root package name */
    public CopyOnWriteArraySet f16403d;

    /* renamed from: e, reason: collision with root package name */
    public e6 f16404e;

    /* renamed from: f, reason: collision with root package name */
    public int f16405f;

    /* renamed from: g, reason: collision with root package name */
    public long f16406g;

    /* renamed from: h, reason: collision with root package name */
    public long f16407h;

    /* renamed from: i, reason: collision with root package name */
    public long f16408i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public io.sentry.protocol.t f16409k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16410l;

    /* renamed from: m, reason: collision with root package name */
    public z3 f16411m;

    /* renamed from: n, reason: collision with root package name */
    public List f16412n;

    /* renamed from: o, reason: collision with root package name */
    public List f16413o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16414p;
    public List q;

    /* renamed from: r, reason: collision with root package name */
    public List f16415r;

    public final List a() {
        return this.f16412n;
    }

    public final List b() {
        return this.f16413o;
    }

    public final List c() {
        return this.q;
    }

    public final List d() {
        return this.f16415r;
    }

    public final Double e() {
        return this.f16401b;
    }

    public final Double f() {
        return this.f16400a;
    }

    public final boolean g() {
        return this.f16414p;
    }

    public final void h(boolean z5) {
        this.f16410l = z5;
    }

    public final void i(boolean z5) {
        this.f16414p = z5;
    }

    public final void j(ArrayList arrayList) {
        this.f16412n = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void k(ArrayList arrayList) {
        this.f16413o = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void l(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(f16399s);
        linkedHashSet.addAll(arrayList);
        this.q = DesugarCollections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void m(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(f16399s);
        linkedHashSet.addAll(arrayList);
        this.f16415r = DesugarCollections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void n(Double d10) {
        if (ci.c.I(d10, true)) {
            this.f16401b = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public final void o(Double d10) {
        if (ci.c.I(d10, true)) {
            this.f16400a = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }
}
