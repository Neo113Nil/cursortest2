package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class sw2 extends m2 {
    public mze M;
    public q1a N;

    public final void A1(boolean z) {
        if (z) {
            this.N = null;
        } else {
            this.M = null;
        }
        r1(z);
    }

    @Override // defpackage.m2, defpackage.pze
    public final void B(fze fzeVar, gze gzeVar, long j) {
        super.B(fzeVar, gzeVar, j);
        if (gzeVar != gze.b) {
            if (gzeVar != gze.c || this.M == null) {
                return;
            }
            List list = fzeVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                mze mzeVar = (mze) list.get(i);
                if (mzeVar.b() && mzeVar != this.M) {
                    A1(false);
                    return;
                }
            }
            return;
        }
        if (this.M == null) {
            if (rti.e(fzeVar, true)) {
                mze mzeVar2 = (mze) fzeVar.a.get(0);
                mzeVar2.a();
                this.M = mzeVar2;
                if (this.v) {
                    u1(mzeVar2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = fzeVar.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!qea.m((mze) list2.get(i2))) {
                long q1 = q1(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    mze mzeVar3 = (mze) list2.get(i3);
                    if (mzeVar3.b() || qea.z(mzeVar3, j, q1)) {
                        A1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((mze) list2.get(0)).a();
        if (this.v) {
            mze mzeVar4 = this.M;
            mzeVar4.getClass();
            s1(mzeVar4.c, false);
            this.w.invoke();
        }
        this.M = null;
    }

    @Override // defpackage.a2a
    public final void K0() {
        A1(true);
    }

    @Override // defpackage.m2
    public final boolean x1(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.a2a
    public final void y(b10 b10Var, gze gzeVar) {
        ArrayList arrayList = (ArrayList) b10Var.c;
        v1();
        if (this.v && this.A == null) {
            zw8 zw8Var = new zw8(this);
            k1(zw8Var);
            this.A = zw8Var;
        }
        if (gzeVar != gze.b) {
            if (gzeVar != gze.c || this.N == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                q1a q1aVar = (q1a) arrayList.get(i);
                if (q1aVar.i && q1aVar != this.N) {
                    A1(true);
                    return;
                }
            }
            return;
        }
        if (this.N == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (z1a.l((q1a) arrayList.get(i2))) {
                    q1a q1aVar2 = (q1a) arrayList.get(0);
                    q1aVar2.i = true;
                    this.N = q1aVar2;
                    if (this.v) {
                        t1(q1aVar2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            q1a q1aVar3 = (q1a) arrayList.get(i3);
            if (q1aVar3.i || !q1aVar3.h || q1aVar3.d) {
                float g = ((hsk) tgj.x(this, dh3.t)).g();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    q1a q1aVar4 = (q1a) arrayList.get(i4);
                    long j = q1aVar4.c;
                    q1a q1aVar5 = this.N;
                    q1aVar5.getClass();
                    boolean z = Math.abs(dnd.d(dnd.h(j, q1aVar5.c))) > g;
                    if (q1aVar4.i || z) {
                        A1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((q1a) arrayList.get(0)).i = true;
        if (this.v) {
            q1a q1aVar6 = this.N;
            q1aVar6.getClass();
            s1(q1aVar6.c, true);
            this.w.invoke();
        }
        this.N = null;
    }

    @Override // defpackage.m2, defpackage.pze
    public final void y0() {
        super.y0();
        A1(false);
    }

    @Override // defpackage.m2
    public final void y1(KeyEvent keyEvent) {
        this.w.invoke();
    }
}
