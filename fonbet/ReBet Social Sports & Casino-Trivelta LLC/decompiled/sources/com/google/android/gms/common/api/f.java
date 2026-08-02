package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import ca.AbstractC2904d;
import ca.C2901a;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.internal.AbstractC3124d;
import com.google.android.gms.common.api.internal.C3123c0;
import com.google.android.gms.common.api.internal.C3134i;
import com.google.android.gms.common.api.internal.InterfaceC3128f;
import com.google.android.gms.common.api.internal.InterfaceC3146o;
import com.google.android.gms.common.api.internal.InterfaceC3155t;
import com.google.android.gms.common.api.internal.c1;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.C3180d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import z.C6900a;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f32295a = Collections.newSetFromMap(new WeakHashMap());

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Account f32296a;

        /* renamed from: d, reason: collision with root package name */
        public int f32299d;

        /* renamed from: e, reason: collision with root package name */
        public View f32300e;

        /* renamed from: f, reason: collision with root package name */
        public String f32301f;

        /* renamed from: g, reason: collision with root package name */
        public String f32302g;

        /* renamed from: i, reason: collision with root package name */
        public final Context f32304i;

        /* renamed from: k, reason: collision with root package name */
        public C3134i f32306k;

        /* renamed from: m, reason: collision with root package name */
        public c f32308m;

        /* renamed from: n, reason: collision with root package name */
        public Looper f32309n;

        /* renamed from: b, reason: collision with root package name */
        public final Set f32297b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        public final Set f32298c = new HashSet();

        /* renamed from: h, reason: collision with root package name */
        public final Map f32303h = new C6900a();

        /* renamed from: j, reason: collision with root package name */
        public final Map f32305j = new C6900a();

        /* renamed from: l, reason: collision with root package name */
        public int f32307l = -1;

        /* renamed from: o, reason: collision with root package name */
        public GoogleApiAvailability f32310o = GoogleApiAvailability.r();

        /* renamed from: p, reason: collision with root package name */
        public C3117a.AbstractC0488a f32311p = AbstractC2904d.f27638c;

        /* renamed from: q, reason: collision with root package name */
        public final ArrayList f32312q = new ArrayList();

        /* renamed from: r, reason: collision with root package name */
        public final ArrayList f32313r = new ArrayList();

        public a(Context context) {
            this.f32304i = context;
            this.f32309n = context.getMainLooper();
            this.f32301f = context.getPackageName();
            this.f32302g = context.getClass().getName();
        }

        public a a(C3117a c3117a) {
            AbstractC3191o.n(c3117a, "Api must not be null");
            this.f32305j.put(c3117a, null);
            List<Scope> impliedScopes = ((C3117a.e) AbstractC3191o.n(c3117a.c(), "Base client builder must not be null")).getImpliedScopes(null);
            this.f32298c.addAll(impliedScopes);
            this.f32297b.addAll(impliedScopes);
            return this;
        }

        public a b(b bVar) {
            AbstractC3191o.n(bVar, "Listener must not be null");
            this.f32312q.add(bVar);
            return this;
        }

        public a c(c cVar) {
            AbstractC3191o.n(cVar, "Listener must not be null");
            this.f32313r.add(cVar);
            return this;
        }

        public f d() {
            AbstractC3191o.b(!this.f32305j.isEmpty(), "must call addApi() to add at least one API");
            C3180d e10 = e();
            Map k10 = e10.k();
            C6900a c6900a = new C6900a();
            C6900a c6900a2 = new C6900a();
            ArrayList arrayList = new ArrayList();
            C3117a c3117a = null;
            boolean z10 = false;
            for (C3117a c3117a2 : this.f32305j.keySet()) {
                Object obj = this.f32305j.get(c3117a2);
                boolean z11 = k10.get(c3117a2) != null;
                c6900a.put(c3117a2, Boolean.valueOf(z11));
                j1 j1Var = new j1(c3117a2, z11);
                arrayList.add(j1Var);
                C3117a.AbstractC0488a abstractC0488a = (C3117a.AbstractC0488a) AbstractC3191o.m(c3117a2.a());
                C3117a.f buildClient = abstractC0488a.buildClient(this.f32304i, this.f32309n, e10, obj, (b) j1Var, (c) j1Var);
                c6900a2.put(c3117a2.b(), buildClient);
                if (abstractC0488a.getPriority() == 1) {
                    z10 = obj != null;
                }
                if (buildClient.providesSignIn()) {
                    if (c3117a != null) {
                        throw new IllegalStateException(c3117a2.d() + " cannot be used with " + c3117a.d());
                    }
                    c3117a = c3117a2;
                }
            }
            if (c3117a != null) {
                if (z10) {
                    throw new IllegalStateException("With using " + c3117a.d() + ", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                }
                AbstractC3191o.r(this.f32296a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", c3117a.d());
                AbstractC3191o.r(this.f32297b.equals(this.f32298c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", c3117a.d());
            }
            C3123c0 c3123c0 = new C3123c0(this.f32304i, new ReentrantLock(), this.f32309n, e10, this.f32310o, this.f32311p, c6900a, this.f32312q, this.f32313r, c6900a2, this.f32307l, C3123c0.s(c6900a2.values(), true), arrayList);
            synchronized (f.f32295a) {
                f.f32295a.add(c3123c0);
            }
            if (this.f32307l >= 0) {
                c1.i(this.f32306k).j(this.f32307l, c3123c0, this.f32308m);
            }
            return c3123c0;
        }

        public final C3180d e() {
            C2901a c2901a = C2901a.f27626j;
            Map map = this.f32305j;
            C3117a c3117a = AbstractC2904d.f27642g;
            if (map.containsKey(c3117a)) {
                c2901a = (C2901a) this.f32305j.get(c3117a);
            }
            return new C3180d(this.f32296a, this.f32297b, this.f32303h, this.f32299d, this.f32300e, this.f32301f, this.f32302g, c2901a, false);
        }
    }

    public interface b extends InterfaceC3128f {
    }

    public interface c extends InterfaceC3146o {
    }

    public static Set i() {
        Set set = f32295a;
        synchronized (set) {
        }
        return set;
    }

    public abstract void d();

    public abstract void e();

    public abstract void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract AbstractC3124d g(AbstractC3124d abstractC3124d);

    public abstract AbstractC3124d h(AbstractC3124d abstractC3124d);

    public C3117a.f j(C3117a.c cVar) {
        throw new UnsupportedOperationException();
    }

    public abstract Context k();

    public abstract Looper l();

    public abstract boolean m();

    public boolean n(InterfaceC3155t interfaceC3155t) {
        throw new UnsupportedOperationException();
    }

    public void o() {
        throw new UnsupportedOperationException();
    }

    public abstract void p(c cVar);

    public abstract void q(c cVar);
}
