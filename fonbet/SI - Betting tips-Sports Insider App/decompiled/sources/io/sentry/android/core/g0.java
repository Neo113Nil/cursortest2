package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 implements DefaultLifecycleObserver, q4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15584a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15585b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15586c;

    public g0(androidx.lifecycle.y yVar, eg.e1 e1Var) {
        this.f15584a = 1;
        this.f15585b = yVar;
        this.f15586c = e1Var;
    }

    @Override // q4.o
    public void a() {
        ((androidx.lifecycle.y) this.f15585b).b(this);
    }

    @Override // q4.o
    public Object d(c4.t tVar) {
        Object a7 = v4.j.a((androidx.lifecycle.y) this.f15585b, tVar);
        return a7 == lf.a.f20034a ? a7 : Unit.f19194a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(androidx.lifecycle.e0 e0Var) {
        int i5 = this.f15584a;
        androidx.lifecycle.j.a(this, e0Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(androidx.lifecycle.e0 e0Var) {
        switch (this.f15584a) {
            case 0:
                androidx.lifecycle.j.b(this, e0Var);
                break;
            default:
                ((eg.e1) this.f15586c).k(null);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(androidx.lifecycle.e0 e0Var) {
        int i5 = this.f15584a;
        androidx.lifecycle.j.c(this, e0Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(androidx.lifecycle.e0 e0Var) {
        int i5 = this.f15584a;
        androidx.lifecycle.j.d(this, e0Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(androidx.lifecycle.e0 e0Var) {
        switch (this.f15584a) {
            case 0:
                ((h0) this.f15586c).f15621d = Boolean.FALSE;
                Iterator it = ((f0) this.f15585b).iterator();
                while (it.hasNext()) {
                    ((e0) it.next()).k();
                }
                break;
            default:
                androidx.lifecycle.j.e(this, e0Var);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(androidx.lifecycle.e0 e0Var) {
        switch (this.f15584a) {
            case 0:
                ((h0) this.f15586c).f15621d = Boolean.TRUE;
                Iterator it = ((f0) this.f15585b).iterator();
                while (it.hasNext()) {
                    ((e0) it.next()).n();
                }
                break;
            default:
                androidx.lifecycle.j.f(this, e0Var);
                break;
        }
    }

    @Override // q4.o
    public void start() {
        ((androidx.lifecycle.y) this.f15585b).a(this);
    }

    public g0(h0 h0Var) {
        this.f15584a = 0;
        this.f15586c = h0Var;
        this.f15585b = new f0(0, this);
    }

    @Override // q4.o
    public /* synthetic */ void b() {
    }
}
