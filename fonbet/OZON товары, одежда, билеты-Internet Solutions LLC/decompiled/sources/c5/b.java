package c5;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.c;
import androidx.work.impl.C;
import androidx.work.impl.InterfaceC5476d;
import androidx.work.impl.r;
import androidx.work.impl.t;
import androidx.work.impl.u;
import androidx.work.o;
import androidx.work.v;
import d5.C6089d;
import d5.InterfaceC6088c;
import f5.C6437o;
import g5.C6627B;
import g5.C6643p;
import g5.S;
import h5.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements r, InterfaceC6088c, InterfaceC5476d {

    /* renamed from: j, reason: collision with root package name */
    private static final String f56501j = o.i("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f56502a;

    /* renamed from: b, reason: collision with root package name */
    private final C f56503b;

    /* renamed from: c, reason: collision with root package name */
    private final C6089d f56504c;

    /* renamed from: e, reason: collision with root package name */
    private C5745a f56506e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f56507f;

    /* renamed from: i, reason: collision with root package name */
    Boolean f56510i;

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f56505d = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final u f56509h = new u();

    /* renamed from: g, reason: collision with root package name */
    private final Object f56508g = new Object();

    public b(@NonNull Context context, @NonNull c cVar, @NonNull C6437o c6437o, @NonNull C c11) {
        this.f56502a = context;
        this.f56503b = c11;
        this.f56504c = new C6089d(c6437o, this);
        this.f56506e = new C5745a(this, cVar.f());
    }

    @Override // androidx.work.impl.r
    public final void a(@NonNull C6627B... c6627bArr) {
        if (this.f56510i == null) {
            this.f56510i = Boolean.valueOf(n.a(this.f56502a, this.f56503b.h()));
        }
        if (!this.f56510i.booleanValue()) {
            o.e().f(f56501j, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f56507f) {
            this.f56503b.k().c(this);
            this.f56507f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C6627B spec : c6627bArr) {
            if (!this.f56509h.a(S.a(spec))) {
                long a11 = spec.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (spec.f63800b == v.a.ENQUEUED) {
                    if (currentTimeMillis < a11) {
                        C5745a c5745a = this.f56506e;
                        if (c5745a != null) {
                            c5745a.a(spec);
                        }
                    } else if (spec.e()) {
                        if (spec.f63808j.h()) {
                            o.e().a(f56501j, "Ignoring " + spec + ". Requires device idle.");
                        } else if (spec.f63808j.e()) {
                            o.e().a(f56501j, "Ignoring " + spec + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(spec);
                            hashSet2.add(spec.f63799a);
                        }
                    } else if (!this.f56509h.a(S.a(spec))) {
                        o.e().a(f56501j, "Starting work for " + spec.f63799a);
                        C c11 = this.f56503b;
                        u uVar = this.f56509h;
                        uVar.getClass();
                        Intrinsics.checkNotNullParameter(spec, "spec");
                        c11.u(uVar.d(S.a(spec)), null);
                    }
                }
            }
        }
        synchronized (this.f56508g) {
            try {
                if (!hashSet.isEmpty()) {
                    o.e().a(f56501j, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.f56505d.addAll(hashSet);
                    this.f56504c.d(this.f56505d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC5476d
    public final void b(@NonNull C6643p c6643p, boolean z11) {
        this.f56509h.b(c6643p);
        synchronized (this.f56508g) {
            try {
                Iterator it = this.f56505d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C6627B c6627b = (C6627B) it.next();
                    if (S.a(c6627b).equals(c6643p)) {
                        o.e().a(f56501j, "Stopping tracking for " + c6643p);
                        this.f56505d.remove(c6627b);
                        this.f56504c.d(this.f56505d);
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.r
    public final boolean c() {
        return false;
    }

    @Override // androidx.work.impl.r
    public final void d(@NonNull String str) {
        Boolean bool = this.f56510i;
        C c11 = this.f56503b;
        if (bool == null) {
            this.f56510i = Boolean.valueOf(n.a(this.f56502a, c11.h()));
        }
        boolean booleanValue = this.f56510i.booleanValue();
        String str2 = f56501j;
        if (!booleanValue) {
            o.e().f(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f56507f) {
            c11.k().c(this);
            this.f56507f = true;
        }
        o.e().a(str2, "Cancelling work ID " + str);
        C5745a c5745a = this.f56506e;
        if (c5745a != null) {
            c5745a.b(str);
        }
        Iterator<t> it = this.f56509h.c(str).iterator();
        while (it.hasNext()) {
            c11.w(it.next());
        }
    }

    @Override // d5.InterfaceC6088c
    public final void e(@NonNull ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6643p a11 = S.a((C6627B) it.next());
            o.e().a(f56501j, "Constraints not met: Cancelling work ID " + a11);
            t b11 = this.f56509h.b(a11);
            if (b11 != null) {
                this.f56503b.w(b11);
            }
        }
    }

    @Override // d5.InterfaceC6088c
    public final void f(@NonNull List<C6627B> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C6643p a11 = S.a((C6627B) it.next());
            u uVar = this.f56509h;
            if (!uVar.a(a11)) {
                o.e().a(f56501j, "Constraints met: Scheduling work ID " + a11);
                this.f56503b.u(uVar.d(a11), null);
            }
        }
    }
}
