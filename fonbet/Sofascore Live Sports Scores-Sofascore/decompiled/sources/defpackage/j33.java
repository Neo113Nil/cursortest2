package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j33 extends m2 {
    public final b0d M;
    public final b0d N;
    public mze O;
    public g9i P;
    public g9i Q;
    public boolean R;
    public boolean S;
    public long T;
    public boolean U;
    public q1a V;
    public g9i W;
    public g9i X;
    public boolean Y;
    public boolean Z;
    public long a0;
    public boolean b0;

    public j33(wzc wzcVar, Function0 function0) {
        super(wzcVar, null, false, true, null, null, function0);
        int i = vjb.a;
        this.M = new b0d(6);
        this.N = new b0d(6);
        this.T = -1L;
        this.a0 = -1L;
    }

    public final void A1(boolean z) {
        if (z) {
            this.V = null;
            g9i g9iVar = this.W;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            this.W = null;
            g9i g9iVar2 = this.X;
            if (g9iVar2 != null) {
                g9iVar2.e(null);
            }
            this.X = null;
            this.Y = false;
            this.Z = false;
            this.a0 = -1L;
            this.b0 = false;
        } else {
            this.O = null;
            g9i g9iVar3 = this.P;
            if (g9iVar3 != null) {
                g9iVar3.e(null);
            }
            this.P = null;
            g9i g9iVar4 = this.Q;
            if (g9iVar4 != null) {
                g9iVar4.e(null);
            }
            this.Q = null;
            this.R = false;
            this.S = false;
            this.T = -1L;
            this.U = false;
        }
        r1(z);
    }

    @Override // defpackage.m2, defpackage.pze
    public final void B(fze fzeVar, gze gzeVar, long j) {
        super.B(fzeVar, gzeVar, j);
        if (gzeVar != gze.b) {
            if (gzeVar != gze.c || this.O == null || this.S) {
                return;
            }
            List list = fzeVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                mze mzeVar = (mze) list.get(i);
                if (mzeVar.b() && mzeVar != this.O) {
                    A1(false);
                    return;
                }
            }
            return;
        }
        if (this.O == null) {
            if (rti.e(fzeVar, true)) {
                mze mzeVar2 = (mze) fzeVar.a.get(0);
                mzeVar2.a();
                this.O = mzeVar2;
                if (this.v) {
                    g9i g9iVar = this.Q;
                    if (g9iVar != null && g9iVar.isActive()) {
                        ((hsk) tgj.x(this, dh3.t)).getClass();
                        if (mzeVar2.b - this.T < 40) {
                            this.U = true;
                            return;
                        }
                        this.R = true;
                        g9i g9iVar2 = this.Q;
                        if (g9iVar2 != null) {
                            g9iVar2.e(null);
                        }
                        this.Q = null;
                    }
                    this.S = false;
                    u1(mzeVar2);
                    return;
                }
                return;
            }
            return;
        }
        int i2 = fzeVar.c;
        List list2 = fzeVar.a;
        if (this.S) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (!qea.n((mze) list2.get(i3))) {
                    int size3 = list2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        ((mze) list2.get(i4)).a();
                    }
                    return;
                }
            }
            mze mzeVar3 = (mze) list2.get(0);
            mzeVar3.a();
            long j2 = mzeVar3.b;
            mze mzeVar4 = this.O;
            mzeVar4.getClass();
            C1(j2, mzeVar4);
            return;
        }
        int size4 = list2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            if (!qea.m((mze) list2.get(i5))) {
                long q1 = q1(j);
                int size5 = list2.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    mze mzeVar5 = (mze) list2.get(i6);
                    if (mzeVar5.b() || qea.z(mzeVar5, j, q1)) {
                        A1(false);
                        return;
                    }
                }
                return;
            }
        }
        mze mzeVar6 = (mze) list2.get(0);
        mzeVar6.a();
        long j3 = mzeVar6.b;
        mze mzeVar7 = this.O;
        mzeVar7.getClass();
        C1(j3, mzeVar7);
    }

    public final void B1(long j, q1a q1aVar) {
        if (this.v && !this.b0) {
            s1(q1aVar.c, true);
            this.a0 = j;
            if (!this.Z && !this.Y) {
                this.w.invoke();
            }
        }
        this.V = null;
        this.b0 = false;
        this.Y = false;
        g9i g9iVar = this.W;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.W = null;
        this.Z = false;
    }

    public final void C1(long j, mze mzeVar) {
        if (this.v && !this.U) {
            s1(mzeVar.c, false);
            this.T = j;
            if (!this.S && !this.R) {
                this.w.invoke();
            }
        }
        this.O = null;
        this.U = false;
        this.R = false;
        g9i g9iVar = this.P;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.P = null;
        this.S = false;
    }

    public final void D1() {
        char c;
        long j;
        long j2;
        char c2;
        b0d b0dVar = this.M;
        Object[] objArr = b0dVar.c;
        long[] jArr = b0dVar.a;
        int length = jArr.length - 2;
        char c3 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            c2 = c3;
                            ((yda) objArr[(i << 3) + i3]).e(null);
                        } else {
                            c2 = c3;
                        }
                        j3 >>= 8;
                        i3++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        b0dVar.a();
        b0d b0dVar2 = this.N;
        Object[] objArr2 = b0dVar2.c;
        long[] jArr2 = b0dVar2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((i33) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        b0dVar2.a();
    }

    @Override // defpackage.a2a
    public final void K0() {
        A1(true);
    }

    @Override // defpackage.wtc
    public final void e1() {
        D1();
    }

    @Override // defpackage.m2
    public final ooi o1() {
        return null;
    }

    @Override // defpackage.m2
    public final void w1() {
        D1();
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
        int i = 0;
        if (gzeVar != gze.b) {
            if (gzeVar != gze.c || this.V == null || this.Z) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                q1a q1aVar = (q1a) arrayList.get(i);
                if (q1aVar.i && q1aVar != this.V) {
                    A1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.V == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (z1a.l((q1a) arrayList.get(i2))) {
                    q1a q1aVar2 = (q1a) arrayList.get(0);
                    q1aVar2.i = true;
                    this.V = q1aVar2;
                    if (this.v) {
                        g9i g9iVar = this.X;
                        if (g9iVar != null && g9iVar.isActive()) {
                            ((hsk) tgj.x(this, dh3.t)).getClass();
                            if (q1aVar2.b - this.a0 < 40) {
                                this.b0 = true;
                                return;
                            }
                            this.Y = true;
                            g9i g9iVar2 = this.X;
                            if (g9iVar2 != null) {
                                g9iVar2.e(null);
                            }
                            this.X = null;
                        }
                        this.Z = false;
                        t1(q1aVar2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.Z) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                q1a q1aVar3 = (q1a) arrayList.get(i3);
                if (!q1aVar3.h || q1aVar3.d) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((q1a) arrayList.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            q1a q1aVar4 = (q1a) arrayList.get(0);
            q1aVar4.i = true;
            long j = q1aVar4.b;
            q1a q1aVar5 = this.V;
            q1aVar5.getClass();
            B1(j, q1aVar5);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            q1a q1aVar6 = (q1a) arrayList.get(i4);
            if (q1aVar6.i || !q1aVar6.h || q1aVar6.d) {
                float g = ((hsk) tgj.x(this, dh3.t)).g();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    q1a q1aVar7 = (q1a) arrayList.get(i5);
                    long j2 = q1aVar7.c;
                    q1a q1aVar8 = this.V;
                    q1aVar8.getClass();
                    boolean z = Math.abs(dnd.d(dnd.h(j2, q1aVar8.c))) > g;
                    if (q1aVar7.i || z) {
                        A1(true);
                        return;
                    }
                }
                return;
            }
        }
        q1a q1aVar9 = (q1a) arrayList.get(0);
        q1aVar9.i = true;
        long j3 = q1aVar9.b;
        q1a q1aVar10 = this.V;
        q1aVar10.getClass();
        B1(j3, q1aVar10);
    }

    @Override // defpackage.m2, defpackage.pze
    public final void y0() {
        super.y0();
        A1(false);
    }

    @Override // defpackage.m2
    public final void y1(KeyEvent keyEvent) {
        long w = u0a.w(keyEvent);
        b0d b0dVar = this.M;
        boolean z = false;
        if (b0dVar.d(w) != null) {
            yda ydaVar = (yda) b0dVar.d(w);
            if (ydaVar != null) {
                if (ydaVar.isActive()) {
                    ydaVar.e(null);
                } else {
                    z = true;
                }
            }
            b0dVar.f(w);
        }
        if (z) {
            return;
        }
        this.w.invoke();
    }

    @Override // defpackage.m2
    public final void n1(b4h b4hVar) {
    }
}
