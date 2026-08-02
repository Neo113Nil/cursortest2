package defpackage;

import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vwj implements cdi {
    public final q4k a;
    public final e1d b;
    public final e1d c;
    public final e1d d;
    public h0h e;
    public vti f;
    public final e1d g;
    public final xnh h;
    public boolean i;
    public final e1d j;
    public j80 k;
    public final boh l;
    public boolean m;
    public final g0i n;
    public final /* synthetic */ axj o;

    public vwj(axj axjVar, Object obj, j80 j80Var, q4k q4kVar) {
        this.o = axjVar;
        this.a = q4kVar;
        e1d f = e.f(obj);
        this.b = f;
        Object obj2 = null;
        e1d f2 = e.f(s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7));
        this.c = f2;
        this.d = e.f(new vti((j38) ((eoh) f2).getValue(), q4kVar, obj, ((eoh) f).getValue(), j80Var));
        this.g = e.f(Boolean.TRUE);
        this.h = e.b(-1.0f);
        this.j = e.f(obj);
        this.k = j80Var;
        this.l = e.d(c().e());
        Float f3 = (Float) hwk.a.get(q4kVar);
        if (f3 != null) {
            float floatValue = f3.floatValue();
            j80 j80Var2 = (j80) q4kVar.a.invoke(obj);
            int b = j80Var2.b();
            for (int i = 0; i < b; i++) {
                j80Var2.e(floatValue, i);
            }
            obj2 = this.a.b.invoke(j80Var2);
        }
        this.n = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, obj2, 3);
    }

    public final vti c() {
        return (vti) ((eoh) this.d).getValue();
    }

    public final void d(long j) {
        if (this.h.h() == -1.0f) {
            this.m = true;
            if (Intrinsics.c(c().c, c().d)) {
                e(c().c);
            } else {
                e(c().g(j));
                this.k = c().c(j);
            }
        }
    }

    public final void e(Object obj) {
        ((eoh) this.j).setValue(obj);
    }

    public final void f(Object obj, boolean z) {
        vti vtiVar = this.f;
        Object obj2 = vtiVar != null ? vtiVar.c : null;
        eoh eohVar = (eoh) this.b;
        boolean c = Intrinsics.c(obj2, eohVar.getValue());
        boh bohVar = this.l;
        e1d e1dVar = this.d;
        j38 j38Var = this.n;
        if (c) {
            ((eoh) e1dVar).setValue(new vti(j38Var, this.a, obj, obj, this.k.c()));
            this.i = true;
            bohVar.i(c().e());
            return;
        }
        e1d e1dVar2 = this.c;
        if (!z || this.m) {
            j38Var = (j38) ((eoh) e1dVar2).getValue();
        } else if (((j38) ((eoh) e1dVar2).getValue()) instanceof g0i) {
            j38Var = (j38) ((eoh) e1dVar2).getValue();
        }
        axj axjVar = this.o;
        long e = axjVar.e();
        e1d e1dVar3 = axjVar.h;
        ((eoh) e1dVar).setValue(new vti(e <= 0 ? j38Var : new ybi(j38Var, axjVar.e()), this.a, obj, eohVar.getValue(), this.k));
        bohVar.i(c().e());
        this.i = false;
        ((eoh) e1dVar3).setValue(Boolean.TRUE);
        if (axjVar.i()) {
            SnapshotStateList snapshotStateList = axjVar.i;
            int size = snapshotStateList.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                vwj vwjVar = (vwj) snapshotStateList.get(i);
                j = Math.max(j, vwjVar.l.h());
                vwjVar.d(0L);
            }
            ((eoh) e1dVar3).setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, j38 j38Var) {
        ((eoh) this.b).setValue(obj2);
        ((eoh) this.c).setValue(j38Var);
        if (Intrinsics.c(c().d, obj) && Intrinsics.c(c().c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // defpackage.cdi
    public final Object getValue() {
        return ((eoh) this.j).getValue();
    }

    public final void h(Object obj, j38 j38Var) {
        if (this.i) {
            vti vtiVar = this.f;
            if (Intrinsics.c(obj, vtiVar != null ? vtiVar.c : null)) {
                return;
            }
        }
        e1d e1dVar = this.b;
        boolean c = Intrinsics.c(((eoh) e1dVar).getValue(), obj);
        xnh xnhVar = this.h;
        if (c && xnhVar.h() == -1.0f) {
            return;
        }
        ((eoh) e1dVar).setValue(obj);
        ((eoh) this.c).setValue(j38Var);
        Object value = xnhVar.h() == -3.0f ? obj : ((eoh) this.j).getValue();
        e1d e1dVar2 = this.g;
        f(value, !((Boolean) ((eoh) e1dVar2).getValue()).booleanValue());
        ((eoh) e1dVar2).setValue(Boolean.valueOf(xnhVar.h() == -3.0f));
        if (xnhVar.h() >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            e(c().g((long) (xnhVar.h() * c().e())));
        } else if (xnhVar.h() == -3.0f) {
            e(obj);
        }
        this.i = false;
        xnhVar.i(-1.0f);
    }

    public final String toString() {
        return "current value: " + ((eoh) this.j).getValue() + ", target: " + ((eoh) this.b).getValue() + ", spec: " + ((j38) ((eoh) this.c).getValue());
    }
}
