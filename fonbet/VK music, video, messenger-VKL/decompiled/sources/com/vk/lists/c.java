package com.vk.lists;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import java.util.ArrayList;
import xsna.b8a0;
import xsna.c4e0;
import xsna.da90;
import xsna.df90;
import xsna.gxp;
import xsna.gzs;
import xsna.hp1;
import xsna.j5j;
import xsna.ktp0;
import xsna.s0d0;
import xsna.s170;
import xsna.s3q0;
import xsna.v1d0;
import xsna.whp;

/* compiled from: PaginationHelper.java */
/* loaded from: classes3.dex */
public final class c {
    public final a a;
    public final j b;
    public final s170 c;
    public final ktp0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final l i;
    public final m j;

    @Nullable
    public final i k;
    public final v1d0 l;

    @Nullable
    public final gxp m;

    @Nullable
    public final whp n;

    @Nullable
    public final gzs<Boolean> o;
    public boolean p;
    public n q;

    @Nullable
    public Throwable r;
    public boolean s;
    public long t;
    public final boolean u;
    public final boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* compiled from: PaginationHelper.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            n nVar = c.this.q;
            if (nVar == null) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                nVar.Mk();
            } else if (i == 1) {
                nVar.K9();
            }
        }
    }

    /* compiled from: PaginationHelper.java */
    public class b implements gzs<s3q0> {
        public b() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            c cVar = c.this;
            gzs<Boolean> gzsVar = cVar.o;
            if (gzsVar == null || !gzsVar.invoke().booleanValue()) {
                cVar.y = true;
                cVar.p(true);
            }
            return s3q0.a;
        }
    }

    /* compiled from: PaginationHelper.java */
    /* renamed from: com.vk.lists.c$c, reason: collision with other inner class name */
    public class C1258c implements gzs<s3q0> {
        public C1258c() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            c cVar = c.this;
            cVar.s = false;
            cVar.r = null;
            cVar.p(false);
            return s3q0.a;
        }
    }

    /* compiled from: PaginationHelper.java */
    public class d implements gzs<s3q0> {
        public d() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            c cVar = c.this;
            cVar.s = false;
            cVar.r = null;
            cVar.n(false);
            return s3q0.a;
        }
    }

    /* compiled from: PaginationHelper.java */
    public class e implements gzs<s3q0> {
        public e() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            c.this.c();
            return s3q0.a;
        }
    }

    /* compiled from: PaginationHelper.java */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            if (cVar.s) {
                if (!cVar.m()) {
                    n nVar = cVar.q;
                    if (nVar != null) {
                        nVar.Fe();
                        return;
                    }
                    return;
                }
                Throwable th = cVar.r;
                n nVar2 = cVar.q;
                if (nVar2 != null) {
                    nVar2.fj(th, cVar.m);
                    return;
                }
                return;
            }
            if (cVar.w) {
                return;
            }
            if (!cVar.m()) {
                n nVar3 = cVar.q;
                if (nVar3 != null) {
                    nVar3.f0();
                    return;
                }
                return;
            }
            n nVar4 = cVar.q;
            if (nVar4 == null || !cVar.u) {
                return;
            }
            nVar4.qg(cVar.n);
        }
    }

    /* compiled from: PaginationHelper.java */
    public class g implements Runnable {
        public final /* synthetic */ boolean b;

        public g(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = this.b;
            c cVar = c.this;
            if (z) {
                a aVar = cVar.a;
                aVar.removeMessages(0);
                aVar.sendMessage(Message.obtain(aVar, 1));
            } else {
                if (cVar.m()) {
                    n nVar = cVar.q;
                    if (nVar != null) {
                        nVar.e0();
                        return;
                    }
                    return;
                }
                n nVar2 = cVar.q;
                if (nVar2 != null) {
                    nVar2.lb();
                }
            }
        }
    }

    /* compiled from: PaginationHelper.java */
    public interface i {
        boolean I();

        void clear();
    }

    /* compiled from: PaginationHelper.java */
    public interface l<T> extends k<T> {
        default q<T> ri(int i, int i2, c cVar) {
            return g0.b;
        }

        q<T> ui(int i, c cVar);
    }

    /* compiled from: PaginationHelper.java */
    public interface m<T> extends k<T> {
        q<T> O9(String str, c cVar);
    }

    /* compiled from: PaginationHelper.java */
    public interface n {
        void Fe();

        void K9();

        void M9(df90 df90Var);

        void Mk();

        void Om(df90 df90Var);

        void e0();

        void f0();

        void fj(@Nullable Throwable th, @Nullable gxp gxpVar);

        void gl();

        void lb();

        void qg(@Nullable whp whpVar);

        void setDataObserver(gzs<s3q0> gzsVar);

        void setOnLoadNextRetryClickListener(gzs<s3q0> gzsVar);

        void setOnRefreshListener(gzs<s3q0> gzsVar);

        void setOnReloadRetryClickListener(gzs<s3q0> gzsVar);
    }

    public c() {
        throw null;
    }

    public c(l lVar, m mVar, i iVar, v1d0 v1d0Var, boolean z, int i2, boolean z2, int i3, int i4, da90 da90Var, String str, gxp gxpVar, whp whpVar, gzs gzsVar, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = new a(Looper.getMainLooper());
        this.b = new j();
        s170 s170Var = new s170();
        this.c = s170Var;
        ktp0 ktp0Var = new ktp0();
        ktp0Var.d = 0;
        ktp0Var.f = j5j.d;
        this.d = ktp0Var;
        this.t = 0L;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        if (lVar == null && mVar == null) {
            throw new IllegalArgumentException("You should provide PagedDataProvider");
        }
        this.e = z;
        this.h = i2;
        this.i = lVar;
        this.j = mVar;
        this.k = iVar;
        this.l = v1d0Var;
        this.m = gxpVar;
        this.n = whpVar;
        this.o = gzsVar;
        this.p = z3;
        this.f = z4;
        this.g = z5;
        this.u = z6;
        this.v = z7;
        if (z4) {
            if (da90Var == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new c4e0.a(5, 1.5f));
                arrayList.add(new c4e0.a(5, 2.0f));
                arrayList.add(new c4e0.a(5, 3.0f));
                arrayList.add(0, new c4e0.a(5, 1.0f));
                c4e0 c4e0Var = new c4e0(arrayList, i3, i4);
                ktp0Var.c = c4e0Var;
                ktp0Var.f = c4e0Var;
            } else {
                ktp0Var.c = da90Var;
                ktp0Var.f = da90Var;
            }
            ktp0Var.f(str);
            ktp0Var.j(0);
        } else {
            if (da90Var == null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new c4e0.a(5, 1.5f));
                arrayList2.add(new c4e0.a(5, 2.0f));
                arrayList2.add(new c4e0.a(5, 3.0f));
                arrayList2.add(0, new c4e0.a(5, 1.0f));
                s170Var.c = new c4e0(arrayList2, i3, i4);
            } else {
                s170Var.c = da90Var;
            }
            s170Var.f(str);
        }
        r(z2);
    }

    public static void a(c cVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            cVar.a.post(new com.vk.lists.d(cVar));
            return;
        }
        n nVar = cVar.q;
        if (nVar != null) {
            nVar.gl();
        }
    }

    public static h e(hp1 hp1Var) {
        return new h(hp1Var);
    }

    public static h f(b8a0 b8a0Var) {
        return new h(b8a0Var);
    }

    public final void b(@NonNull n nVar, boolean z, boolean z2, long j2, @Nullable gzs<s3q0> gzsVar) {
        n nVar2;
        this.q = nVar;
        this.t = j2;
        v1d0 v1d0Var = this.l;
        if (v1d0Var != null) {
            nVar.Om(v1d0Var);
        }
        this.q.Om(this.b);
        this.q.setOnRefreshListener(new b());
        this.q.setOnReloadRetryClickListener(new C1258c());
        this.q.setOnLoadNextRetryClickListener(new d());
        this.q.setDataObserver(new e());
        if (!this.z || (!z2 && (!m() || !z))) {
            c();
            return;
        }
        if (j2 > 0 && (nVar2 = this.q) != null) {
            nVar2.e0();
        }
        if (z2 && gzsVar != null) {
            gzsVar.invoke();
        }
        p(false);
    }

    public final void c() {
        if (this.q == null) {
            return;
        }
        f fVar = new f();
        if (Looper.getMainLooper() == Looper.myLooper()) {
            fVar.run();
        } else {
            this.a.post(fVar);
        }
    }

    public final void d() {
        this.k.clear();
        p(false);
    }

    @Nullable
    public final <T> q<T> g(q<T> qVar, boolean z, boolean z2) {
        if (this.x) {
            return null;
        }
        t(false, false, z2);
        return (q<T>) qVar.p(new com.vk.lists.e(this, false, z, true));
    }

    public final int h() {
        if (this.f) {
            return this.d.i();
        }
        return 0;
    }

    public final int i() {
        return this.f ? this.d.a() : this.c.a();
    }

    @Nullable
    public final String j() {
        return this.f ? this.d.b() : this.c.b();
    }

    public final int k() {
        return this.f ? this.d.c.a() : this.c.c.a();
    }

    public final void l(int i2) {
        if (this.i == null) {
            throw new IllegalStateException("You shouldn't call incrementPage with pagedDataProviderWithStartFrom");
        }
        if (this.f) {
            this.d.c(i2);
        } else {
            this.c.c(i2);
        }
    }

    public final boolean m() {
        i iVar = this.k;
        return iVar == null || iVar.I();
    }

    public final void n(boolean z) {
        String j2 = j();
        if (this.x || TextUtils.isEmpty(j2)) {
            return;
        }
        t(false, z, false);
        m mVar = this.j;
        if (mVar != null) {
            mVar.wd(mVar.O9(j2, this).p(new com.vk.lists.e(this, false, false, true)), false, this);
            return;
        }
        l lVar = this.i;
        if (lVar != null) {
            lVar.wd(lVar.ui(i(), this).p(new com.vk.lists.e(this, false, false, true)), false, this);
        }
    }

    public final void o() {
        u(true);
        c();
    }

    public final void p(boolean z) {
        if (this.x) {
            return;
        }
        t(z, false, false);
        m mVar = this.j;
        if (mVar != null) {
            s("0");
            mVar.wd(mVar.hj(this, z).p(new com.vk.lists.e(this, z, true, true)), true, this);
            return;
        }
        q(0);
        l lVar = this.i;
        if (lVar != null) {
            lVar.wd(lVar.hj(this, z).p(new com.vk.lists.e(this, z, true, true)), true, this);
        }
    }

    public final void q(int i2) {
        if (this.f) {
            this.d.e(i2);
        } else {
            this.c.e(i2);
        }
    }

    public final void r(boolean z) {
        if (this.z != z) {
            this.z = z;
        }
    }

    public final void s(String str) {
        if (this.j == null) {
            throw new IllegalStateException("You shouldn't call setNextFrom with pagedDataProviderWithOffset");
        }
        if (this.f) {
            this.d.f(str);
        } else {
            this.c.f(str);
        }
    }

    public final void t(boolean z, boolean z2, boolean z3) {
        this.x = true;
        this.w = true;
        if (z) {
            return;
        }
        a aVar = this.a;
        if (z2 || Looper.getMainLooper() != Looper.myLooper()) {
            aVar.post(new g(z3));
            return;
        }
        if (z3) {
            aVar.removeMessages(0);
            aVar.sendMessage(Message.obtain(aVar, 1));
        } else {
            if (m()) {
                n nVar = this.q;
                if (nVar != null) {
                    nVar.e0();
                    return;
                }
                return;
            }
            n nVar2 = this.q;
            if (nVar2 != null) {
                nVar2.lb();
            }
        }
    }

    public final void u(boolean z) {
        this.x = false;
        this.w = false;
        if (this.v || z || this.y) {
            a aVar = this.a;
            aVar.removeMessages(0);
            aVar.sendMessage(Message.obtain(aVar, 0));
            this.y = false;
        }
    }

    public final void v() {
        n nVar = this.q;
        if (nVar != null) {
            v1d0 v1d0Var = this.l;
            if (v1d0Var != null) {
                nVar.M9(v1d0Var);
            }
            this.q.M9(this.b);
            this.q.setOnRefreshListener(null);
            this.q.setDataObserver(null);
            this.q.setOnReloadRetryClickListener(null);
            this.q.setOnLoadNextRetryClickListener(null);
            this.q = null;
        }
    }

    /* compiled from: PaginationHelper.java */
    public static class h {
        public final l a;
        public final m b;
        public int c;
        public boolean d;
        public boolean e;
        public i f;
        public boolean g;
        public da90 h;
        public int i;
        public int j;
        public String k;
        public boolean l;
        public boolean m;
        public gxp n;
        public whp o;
        public long p;
        public boolean q;
        public gzs<Boolean> r;
        public int s;
        public s0d0 t;
        public gzs<s3q0> u;
        public boolean v;
        public boolean w;
        public boolean x;

        public h(l lVar) {
            this.c = 5;
            this.d = false;
            this.e = true;
            this.g = true;
            this.h = null;
            this.i = 30;
            this.j = 1073741823;
            this.k = "0";
            this.l = true;
            this.m = true;
            this.p = 0L;
            this.q = true;
            this.s = 3;
            this.v = false;
            this.w = true;
            this.x = true;
            this.a = lVar;
            this.b = null;
        }

        public final c a() {
            i iVar = this.f;
            s0d0 s0d0Var = this.t;
            return new c(this.a, this.b, iVar, s0d0Var != null ? new v1d0(this.s, s0d0Var) : null, this.q, this.c, this.g, this.i, this.j, this.h, this.k, this.n, this.o, this.r, this.v, this.d, this.e, this.w, this.x);
        }

        public final c b(n nVar) {
            c a = a();
            a.b(nVar, this.m, this.l, this.p, this.u);
            return a;
        }

        public final void c() {
            this.i = 30;
        }

        public h(m mVar) {
            this.c = 5;
            this.d = false;
            this.e = true;
            this.g = true;
            this.h = null;
            this.i = 30;
            this.j = 1073741823;
            this.k = "0";
            this.l = true;
            this.m = true;
            this.p = 0L;
            this.q = true;
            this.s = 3;
            this.v = false;
            this.w = true;
            this.x = true;
            this.a = null;
            this.b = mVar;
        }
    }

    /* compiled from: PaginationHelper.java */
    public class j implements df90 {
        public j() {
        }

        @Override // xsna.df90
        public final void e(int i, int i2, int i3, int i4) {
            int i5 = i - i3;
            c cVar = c.this;
            boolean z = cVar.f;
            int i6 = cVar.h;
            boolean z2 = i5 < i6;
            boolean z3 = i2 - i6 <= 0 && cVar.h() > 0 && z && cVar.g;
            if (z2 && cVar.z && !cVar.s) {
                cVar.n(true);
            }
            if (!z3 || !cVar.z || cVar.s || cVar.h() <= 0) {
                return;
            }
            l lVar = cVar.i;
            if (z) {
                int h = cVar.h();
                int h2 = cVar.h() - cVar.k() < 0 ? 0 : cVar.h() - cVar.k();
                int i7 = h - h2;
                if (cVar.x || h == 0 || lVar == null) {
                    return;
                }
                cVar.t(false, true, false);
                lVar.X5(lVar.ri(h2, i7, cVar).p(new com.vk.lists.e(cVar, false, false, false)), cVar);
            }
        }

        @Override // xsna.df90
        public final void l(int i) {
        }
    }

    /* compiled from: PaginationHelper.java */
    public interface k<T> {
        q<T> hj(c cVar, boolean z);

        void wd(q<T> qVar, boolean z, c cVar);

        default void X5(q qVar, c cVar) {
        }
    }
}
