package defpackage;

import android.content.Context;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i5d {
    public int a;
    public boolean b;
    public final Object c;
    public List d;
    public Object e;
    public Object f;
    public Object g;

    public i5d() {
        this.c = new ReentrantLock();
        this.d = new ArrayList();
        Duration duration = vvd.y;
        this.e = new qvd().a();
    }

    public void a() {
        if (((ArrayList) this.d).size() > 1) {
            Collections.shuffle((ArrayList) this.d, ThreadLocalRandom.current());
        }
        this.b = false;
        int i = -1;
        for (int i2 = 0; i2 < ((ArrayList) this.d).size(); i2++) {
            v5d v5dVar = ((p6h) ((ArrayList) this.d).get(i2)).a;
            this.b |= v5dVar.b;
            if (v5dVar.equals((v5d) this.f)) {
                i = i2;
            }
        }
        if (i != -1) {
            ArrayList arrayList = (ArrayList) this.d;
            arrayList.add(arrayList.remove(i));
        }
    }

    public void b(ot9 ot9Var, fo5 fo5Var) {
        Context context = ot9Var.a;
        ot9 ot9Var2 = (ot9) this.c;
        if (context != ot9Var2.a) {
            vp2.b(fo5Var, "' cannot modify the request's context.", "Interceptor '");
            return;
        }
        if (ot9Var.b == f8h.g) {
            vp2.b(fo5Var, "' cannot set the request's data to null.", "Interceptor '");
            return;
        }
        if (ot9Var.c != ot9Var2.c) {
            vp2.b(fo5Var, "' cannot modify the request's target.", "Interceptor '");
        } else if (ot9Var.p != ot9Var2.p) {
            vp2.b(fo5Var, "' cannot modify the request's lifecycle.", "Interceptor '");
        } else {
            if (ot9Var.q == ot9Var2.q) {
                return;
            }
            vp2.b(fo5Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        }
    }

    public void c(v5d v5dVar) {
        ReentrantLock reentrantLock = (ReentrantLock) this.c;
        reentrantLock.lock();
        try {
            for (int size = ((ArrayList) this.d).size() - 1; size >= 0; size--) {
                p6h p6hVar = (p6h) ((ArrayList) this.d).get(size);
                if (p6hVar.a.equals(v5dVar)) {
                    ((ArrayList) this.d).remove(size);
                    int i = p6hVar.c + 1;
                    p6hVar.c = i;
                    if (i < this.a) {
                        ((ArrayList) this.d).add(p6hVar);
                    }
                    return;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void d(v5d v5dVar) {
        ReentrantLock reentrantLock = (ReentrantLock) this.c;
        reentrantLock.lock();
        try {
            for (int size = ((ArrayList) this.d).size() - 1; size >= 0; size--) {
                p6h p6hVar = (p6h) ((ArrayList) this.d).get(size);
                if (p6hVar.a.equals(v5dVar)) {
                    this.f = v5dVar;
                    p6hVar.c = 0;
                    return;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public v5d e() {
        ReentrantLock reentrantLock = (ReentrantLock) this.c;
        reentrantLock.lock();
        try {
            if (((ArrayList) this.d).isEmpty()) {
                reentrantLock.unlock();
                return null;
            }
            p6h p6hVar = (p6h) ((ArrayList) this.d).remove(0);
            System.currentTimeMillis();
            p6hVar.getClass();
            ((ArrayList) this.d).add(p6hVar);
            return p6hVar.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(sq3 sq3Var) {
        cpf cpfVar;
        int i;
        eo5 eo5Var;
        nt9 a;
        nt9 nt9Var = (nt9) this.c;
        int i2 = this.a;
        if (sq3Var instanceof cpf) {
            cpfVar = (cpf) sq3Var;
            int i3 = cpfVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cpfVar.u = i3 - Integer.MIN_VALUE;
                cpf cpfVar2 = cpfVar;
                Object obj = cpfVar2.s;
                lu3 lu3Var = lu3.a;
                i = cpfVar2.u;
                if (i != 0) {
                    y6a.M(obj);
                    eo5 eo5Var2 = (eo5) this.d.get(i2);
                    i5d i5dVar = new i5d(nt9Var, this.d, i2 + 1, (nt9) this.e, (kjh) this.f, (f7a) this.g, this.b);
                    cpfVar2.r = eo5Var2;
                    cpfVar2.u = 1;
                    obj = eo5Var2.d(i5dVar, cpfVar2);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    eo5Var = eo5Var2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eo5Var = cpfVar2.r;
                    y6a.M(obj);
                }
                wt9 wt9Var = (wt9) obj;
                a = wt9Var.a();
                if (a.a == nt9Var.a) {
                    vp2.b(eo5Var, "' cannot modify the request's context.", "Interceptor '");
                    return null;
                }
                if (a.b == oid.a) {
                    vp2.b(eo5Var, "' cannot set the request's data to null.", "Interceptor '");
                    return null;
                }
                if (a.c != nt9Var.c) {
                    vp2.b(eo5Var, "' cannot modify the request's target.", "Interceptor '");
                    return null;
                }
                if (a.s == nt9Var.s) {
                    return wt9Var;
                }
                vp2.b(eo5Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
                return null;
            }
        }
        cpfVar = new cpf(this, sq3Var);
        cpf cpfVar22 = cpfVar;
        Object obj2 = cpfVar22.s;
        lu3 lu3Var2 = lu3.a;
        i = cpfVar22.u;
        if (i != 0) {
        }
        wt9 wt9Var2 = (wt9) obj2;
        a = wt9Var2.a();
        if (a.a == nt9Var.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(ot9 ot9Var, sq3 sq3Var) {
        dpf dpfVar;
        int i;
        ot9 ot9Var2;
        fo5 fo5Var;
        Object d;
        i5d i5dVar = this;
        List list = i5dVar.d;
        int i2 = i5dVar.a;
        if (sq3Var instanceof dpf) {
            dpfVar = (dpf) sq3Var;
            int i3 = dpfVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dpfVar.v = i3 - Integer.MIN_VALUE;
                Object obj = dpfVar.t;
                lu3 lu3Var = lu3.a;
                i = dpfVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    if (i2 > 0) {
                        ot9Var2 = ot9Var;
                        i5dVar.b(ot9Var2, (fo5) list.get(i2 - 1));
                    } else {
                        ot9Var2 = ot9Var;
                    }
                    fo5Var = (fo5) list.get(i2);
                    i5d i5dVar2 = new i5d((ot9) i5dVar.c, i5dVar.d, i2 + 1, ot9Var2, (jjh) i5dVar.f, (e26) i5dVar.g, i5dVar.b);
                    dpfVar.r = i5dVar;
                    dpfVar.s = fo5Var;
                    dpfVar.v = 1;
                    d = fo5Var.d(i5dVar2, dpfVar);
                    if (d == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fo5 fo5Var2 = dpfVar.s;
                    i5d i5dVar3 = dpfVar.r;
                    y6a.M(obj);
                    fo5Var = fo5Var2;
                    i5dVar = i5dVar3;
                    d = obj;
                }
                xt9 xt9Var = (xt9) d;
                i5dVar.b(xt9Var.b(), fo5Var);
                return xt9Var;
            }
        }
        dpfVar = new dpf(i5dVar, sq3Var);
        Object obj2 = dpfVar.t;
        lu3 lu3Var2 = lu3.a;
        i = dpfVar.v;
        if (i != 0) {
        }
        xt9 xt9Var2 = (xt9) d;
        i5dVar.b(xt9Var2.b(), fo5Var);
        return xt9Var2;
    }

    public /* synthetic */ i5d(Object obj, List list, int i, Object obj2, Object obj3, Object obj4, boolean z) {
        this.c = obj;
        this.d = list;
        this.a = i;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.b = z;
    }
}
