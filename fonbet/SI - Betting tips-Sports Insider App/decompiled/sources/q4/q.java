package q4;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.y;
import c4.t;
import c4.v;
import eg.e1;
import java.util.concurrent.CancellationException;
import k2.x;
import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q implements o, DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final v f22023a;

    /* renamed from: b, reason: collision with root package name */
    public final h f22024b;

    /* renamed from: c, reason: collision with root package name */
    public final s4.a f22025c;

    /* renamed from: d, reason: collision with root package name */
    public final y f22026d;

    /* renamed from: e, reason: collision with root package name */
    public final e1 f22027e;

    public q(v vVar, h hVar, s4.a aVar, y yVar, e1 e1Var) {
        this.f22023a = vVar;
        this.f22024b = hVar;
        this.f22025c = aVar;
        this.f22026d = yVar;
        this.f22027e = e1Var;
    }

    @Override // q4.o
    public final void b() {
        s4.a aVar = this.f22025c;
        if (aVar.f22622b.isAttachedToWindow()) {
            return;
        }
        s s8 = x.s(aVar.f22622b);
        q qVar = s8.f22032c;
        if (qVar != null) {
            qVar.e();
        }
        s8.f22032c = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // q4.o
    public final Object d(t tVar) {
        y yVar = this.f22026d;
        if (yVar == null) {
            return Unit.f19194a;
        }
        Object a7 = v4.j.a(yVar, tVar);
        return a7 == lf.a.f20034a ? a7 : Unit.f19194a;
    }

    public final void e() {
        this.f22027e.k(null);
        s4.a aVar = this.f22025c;
        boolean z5 = aVar instanceof d0;
        y yVar = this.f22026d;
        if (z5 && yVar != null) {
            yVar.b(aVar);
        }
        if (yVar != null) {
            yVar.b(this);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(e0 e0Var) {
        androidx.lifecycle.j.a(this, e0Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(e0 e0Var) {
        x.s(this.f22025c.f22622b).a();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(e0 e0Var) {
        androidx.lifecycle.j.c(this, e0Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(e0 e0Var) {
        androidx.lifecycle.j.d(this, e0Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(e0 e0Var) {
        androidx.lifecycle.j.e(this, e0Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(e0 e0Var) {
        androidx.lifecycle.j.f(this, e0Var);
    }

    @Override // q4.o
    public final void start() {
        y yVar = this.f22026d;
        if (yVar != null) {
            yVar.a(this);
        }
        s4.a aVar = this.f22025c;
        if ((aVar instanceof d0) && yVar != null) {
            s4.a aVar2 = aVar;
            yVar.b(aVar2);
            yVar.a(aVar2);
        }
        s s8 = x.s(aVar.f22622b);
        q qVar = s8.f22032c;
        if (qVar != null) {
            qVar.e();
        }
        s8.f22032c = this;
    }

    @Override // q4.o
    public final /* synthetic */ void a() {
    }
}
