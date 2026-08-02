package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class jxj extends xwj {
    public int G;
    public xwj[] J;
    public ArrayList E = new ArrayList();
    public boolean F = true;
    public boolean H = false;
    public int I = 0;

    @Override // defpackage.xwj
    public final xwj A(wwj wwjVar) {
        super.A(wwjVar);
        return this;
    }

    @Override // defpackage.xwj
    public final void B(View view) {
        for (int i = 0; i < this.E.size(); i++) {
            ((xwj) this.E.get(i)).B(view);
        }
        this.f.remove(view);
    }

    @Override // defpackage.xwj
    public final void C(View view) {
        super.C(view);
        xwj[] xwjVarArr = this.J;
        this.J = null;
        if (xwjVarArr == null) {
            xwjVarArr = new xwj[this.E.size()];
        }
        xwj[] xwjVarArr2 = (xwj[]) this.E.toArray(xwjVarArr);
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            xwjVarArr2[i].C(view);
        }
        Arrays.fill(xwjVarArr2, (Object) null);
        this.J = xwjVarArr2;
    }

    @Override // defpackage.xwj
    public final void D() {
        ArrayList arrayList;
        if (this.E.isEmpty()) {
            N();
            m();
            return;
        }
        ixj ixjVar = new ixj();
        ixjVar.b = this;
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((xwj) it.next()).a(ixjVar);
        }
        this.G = this.E.size();
        if (this.F) {
            Iterator it2 = this.E.iterator();
            while (it2.hasNext()) {
                ((xwj) it2.next()).D();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.E.size();
            arrayList = this.E;
            if (i >= size) {
                break;
            }
            ((xwj) arrayList.get(i - 1)).a(new ixj((xwj) this.E.get(i), 2));
            i++;
        }
        xwj xwjVar = (xwj) arrayList.get(0);
        if (xwjVar != null) {
            xwjVar.D();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.xwj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(long j, long j2) {
        long j3;
        long j4 = this.x;
        long j5 = 0;
        if (this.i != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.r = false;
            x(this, ogj.b, z);
        }
        if (!this.F) {
            int i = 1;
            while (true) {
                int size = this.E.size();
                ArrayList arrayList = this.E;
                if (i >= size) {
                    i = arrayList.size();
                    break;
                } else if (((xwj) arrayList.get(i)).z > j2) {
                    break;
                } else {
                    i++;
                }
            }
            int i2 = i - 1;
            if (j >= j2) {
                while (i2 < this.E.size()) {
                    xwj xwjVar = (xwj) this.E.get(i2);
                    long j6 = xwjVar.z;
                    j3 = j5;
                    long j7 = j - j6;
                    if (j7 < j3) {
                        break;
                    }
                    xwjVar.E(j7, j2 - j6);
                    i2++;
                    j5 = j3;
                }
            } else {
                j3 = 0;
                while (i2 >= 0) {
                    xwj xwjVar2 = (xwj) this.E.get(i2);
                    long j8 = xwjVar2.z;
                    long j9 = j - j8;
                    xwjVar2.E(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            if (this.i == null) {
                if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.r = true;
                }
                x(this, ogj.c, z);
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < this.E.size(); i3++) {
            ((xwj) this.E.get(i3)).E(j, j2);
        }
        j3 = j5;
        if (this.i == null) {
        }
    }

    @Override // defpackage.xwj
    public final void F(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.E) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((xwj) this.E.get(i)).F(j);
        }
    }

    @Override // defpackage.xwj
    public final void G(nq8 nq8Var) {
        this.v = nq8Var;
        this.I |= 8;
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            ((xwj) this.E.get(i)).G(nq8Var);
        }
    }

    @Override // defpackage.xwj
    public final void I(TimeInterpolator timeInterpolator) {
        this.I |= 1;
        ArrayList arrayList = this.E;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((xwj) this.E.get(i)).I(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // defpackage.xwj
    public final void J(wkf wkfVar) {
        super.J(wkfVar);
        this.I |= 4;
        if (this.E != null) {
            for (int i = 0; i < this.E.size(); i++) {
                ((xwj) this.E.get(i)).J(wkfVar);
            }
        }
    }

    @Override // defpackage.xwj
    public final void K() {
        this.I |= 2;
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            ((xwj) this.E.get(i)).K();
        }
    }

    @Override // defpackage.xwj
    public final void L(long j) {
        this.b = j;
    }

    @Override // defpackage.xwj
    public final String O(String str) {
        String O = super.O(str);
        for (int i = 0; i < this.E.size(); i++) {
            StringBuilder r = mz1.r(O, "\n");
            r.append(((xwj) this.E.get(i)).O(str.concat("  ")));
            O = r.toString();
        }
        return O;
    }

    public final void P(xwj xwjVar) {
        this.E.add(xwjVar);
        xwjVar.i = this;
        long j = this.c;
        if (j >= 0) {
            xwjVar.F(j);
        }
        if ((this.I & 1) != 0) {
            xwjVar.I(this.d);
        }
        if ((this.I & 2) != 0) {
            xwjVar.K();
        }
        if ((this.I & 4) != 0) {
            xwjVar.J(this.w);
        }
        if ((this.I & 8) != 0) {
            xwjVar.G(this.v);
        }
    }

    public final xwj Q(int i) {
        if (i < 0 || i >= this.E.size()) {
            return null;
        }
        return (xwj) this.E.get(i);
    }

    @Override // defpackage.xwj
    public final void b(View view) {
        for (int i = 0; i < this.E.size(); i++) {
            ((xwj) this.E.get(i)).b(view);
        }
        this.f.add(view);
    }

    @Override // defpackage.xwj
    public final void cancel() {
        super.cancel();
        xwj[] xwjVarArr = this.J;
        this.J = null;
        if (xwjVarArr == null) {
            xwjVarArr = new xwj[this.E.size()];
        }
        xwj[] xwjVarArr2 = (xwj[]) this.E.toArray(xwjVarArr);
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            xwjVarArr2[i].cancel();
        }
        Arrays.fill(xwjVarArr2, (Object) null);
        this.J = xwjVarArr2;
    }

    @Override // defpackage.xwj
    public final void d(oxj oxjVar) {
        View view = oxjVar.b;
        if (v(view)) {
            Iterator it = this.E.iterator();
            while (it.hasNext()) {
                xwj xwjVar = (xwj) it.next();
                if (xwjVar.v(view)) {
                    xwjVar.d(oxjVar);
                    oxjVar.c.add(xwjVar);
                }
            }
        }
    }

    @Override // defpackage.xwj
    public final void f(oxj oxjVar) {
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            ((xwj) this.E.get(i)).f(oxjVar);
        }
    }

    @Override // defpackage.xwj
    public final void g(oxj oxjVar) {
        View view = oxjVar.b;
        if (v(view)) {
            Iterator it = this.E.iterator();
            while (it.hasNext()) {
                xwj xwjVar = (xwj) it.next();
                if (xwjVar.v(view)) {
                    xwjVar.g(oxjVar);
                    oxjVar.c.add(xwjVar);
                }
            }
        }
    }

    @Override // defpackage.xwj
    /* renamed from: j */
    public final xwj clone() {
        jxj jxjVar = (jxj) super.clone();
        jxjVar.E = new ArrayList();
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            xwj clone = ((xwj) this.E.get(i)).clone();
            jxjVar.E.add(clone);
            clone.i = jxjVar;
        }
        return jxjVar;
    }

    @Override // defpackage.xwj
    public final void l(ViewGroup viewGroup, ujg ujgVar, ujg ujgVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            xwj xwjVar = (xwj) this.E.get(i);
            if (j > 0 && (this.F || i == 0)) {
                long j2 = xwjVar.b;
                if (j2 > 0) {
                    xwjVar.L(j2 + j);
                } else {
                    xwjVar.L(j);
                }
            }
            xwjVar.l(viewGroup, ujgVar, ujgVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.xwj
    public final boolean s() {
        for (int i = 0; i < this.E.size(); i++) {
            if (((xwj) this.E.get(i)).s()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xwj
    public final boolean t() {
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            if (!((xwj) this.E.get(i)).t()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.xwj
    public final void y(View view) {
        super.y(view);
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            ((xwj) this.E.get(i)).y(view);
        }
    }

    @Override // defpackage.xwj
    public final void z() {
        this.x = 0L;
        int i = 0;
        ixj ixjVar = new ixj(this, i);
        while (i < this.E.size()) {
            xwj xwjVar = (xwj) this.E.get(i);
            xwjVar.a(ixjVar);
            xwjVar.z();
            long j = xwjVar.x;
            boolean z = this.F;
            long j2 = this.x;
            if (z) {
                this.x = Math.max(j2, j);
            } else {
                xwjVar.z = j2;
                this.x = j2 + j;
            }
            i++;
        }
    }
}
