package androidx.work.impl.background.systemalarm;

import Ph.C0;
import Ph.L;
import Q2.AbstractC1508t;
import R2.C1549z;
import V2.n;
import X2.h;
import Y2.F;
import Y2.M;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import androidx.work.impl.constraints.b;
import androidx.work.impl.constraints.f;
import androidx.work.impl.constraints.i;
import androidx.work.impl.constraints.j;
import androidx.work.impl.model.WorkSpec;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c implements f, M.a {

    /* renamed from: o, reason: collision with root package name */
    public static final String f23808o = AbstractC1508t.i("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f23809a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23810b;

    /* renamed from: c, reason: collision with root package name */
    public final h f23811c;

    /* renamed from: d, reason: collision with root package name */
    public final d f23812d;

    /* renamed from: e, reason: collision with root package name */
    public final i f23813e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f23814f;

    /* renamed from: g, reason: collision with root package name */
    public int f23815g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f23816h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f23817i;

    /* renamed from: j, reason: collision with root package name */
    public PowerManager.WakeLock f23818j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23819k;

    /* renamed from: l, reason: collision with root package name */
    public final C1549z f23820l;

    /* renamed from: m, reason: collision with root package name */
    public final L f23821m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C0 f23822n;

    public c(Context context, int i10, d dVar, C1549z c1549z) {
        this.f23809a = context;
        this.f23810b = i10;
        this.f23812d = dVar;
        this.f23811c = c1549z.a();
        this.f23820l = c1549z;
        n r10 = dVar.g().r();
        this.f23816h = dVar.f().c();
        this.f23817i = dVar.f().a();
        this.f23821m = dVar.f().b();
        this.f23813e = new i(r10);
        this.f23819k = false;
        this.f23815g = 0;
        this.f23814f = new Object();
    }

    @Override // Y2.M.a
    public void a(h hVar) {
        AbstractC1508t.e().a(f23808o, "Exceeded time limits on execution for " + hVar);
        this.f23816h.execute(new T2.b(this));
    }

    public final void d() {
        synchronized (this.f23814f) {
            try {
                if (this.f23822n != null) {
                    this.f23822n.cancel((CancellationException) null);
                }
                this.f23812d.h().b(this.f23811c);
                PowerManager.WakeLock wakeLock = this.f23818j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    AbstractC1508t.e().a(f23808o, "Releasing wakelock " + this.f23818j + "for WorkSpec " + this.f23811c);
                    this.f23818j.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.constraints.f
    public void e(WorkSpec workSpec, androidx.work.impl.constraints.b bVar) {
        if (bVar instanceof b.a) {
            this.f23816h.execute(new T2.c(this));
        } else {
            this.f23816h.execute(new T2.b(this));
        }
    }

    public void f() {
        String b10 = this.f23811c.b();
        this.f23818j = F.b(this.f23809a, b10 + " (" + this.f23810b + ")");
        AbstractC1508t e10 = AbstractC1508t.e();
        String str = f23808o;
        e10.a(str, "Acquiring wakelock " + this.f23818j + "for WorkSpec " + b10);
        this.f23818j.acquire();
        WorkSpec i10 = this.f23812d.g().s().l().i(b10);
        if (i10 == null) {
            this.f23816h.execute(new T2.b(this));
            return;
        }
        boolean l10 = i10.l();
        this.f23819k = l10;
        if (l10) {
            this.f23822n = j.c(this.f23813e, i10, this.f23821m, this);
            return;
        }
        AbstractC1508t.e().a(str, "No constraints for " + b10);
        this.f23816h.execute(new T2.c(this));
    }

    public void g(boolean z10) {
        AbstractC1508t.e().a(f23808o, "onExecuted " + this.f23811c + ", " + z10);
        d();
        if (z10) {
            this.f23817i.execute(new d.b(this.f23812d, a.e(this.f23809a, this.f23811c), this.f23810b));
        }
        if (this.f23819k) {
            this.f23817i.execute(new d.b(this.f23812d, a.a(this.f23809a), this.f23810b));
        }
    }

    public final void h() {
        if (this.f23815g != 0) {
            AbstractC1508t.e().a(f23808o, "Already started work for " + this.f23811c);
            return;
        }
        this.f23815g = 1;
        AbstractC1508t.e().a(f23808o, "onAllConstraintsMet for " + this.f23811c);
        if (this.f23812d.e().o(this.f23820l)) {
            this.f23812d.h().a(this.f23811c, 600000L, this);
        } else {
            d();
        }
    }

    public final void i() {
        String b10 = this.f23811c.b();
        if (this.f23815g >= 2) {
            AbstractC1508t.e().a(f23808o, "Already stopped work for " + b10);
            return;
        }
        this.f23815g = 2;
        AbstractC1508t e10 = AbstractC1508t.e();
        String str = f23808o;
        e10.a(str, "Stopping work for WorkSpec " + b10);
        this.f23817i.execute(new d.b(this.f23812d, a.f(this.f23809a, this.f23811c), this.f23810b));
        if (!this.f23812d.e().k(this.f23811c.b())) {
            AbstractC1508t.e().a(str, "Processor does not have WorkSpec " + b10 + ". No need to reschedule");
            return;
        }
        AbstractC1508t.e().a(str, "WorkSpec " + b10 + " needs to be rescheduled");
        this.f23817i.execute(new d.b(this.f23812d, a.e(this.f23809a, this.f23811c), this.f23810b));
    }
}
