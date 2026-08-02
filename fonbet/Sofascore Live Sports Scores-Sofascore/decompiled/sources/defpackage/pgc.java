package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pgc extends eg3 {
    public static final f6c r;
    public final a51[] k;
    public final lij[] l;
    public final ArrayList m;
    public final q1f n;
    public int o;
    public long[][] p;
    public jz2 q;

    static {
        i5c i5cVar = new i5c();
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        List list = Collections.EMPTY_LIST;
        av9 av9Var2 = hv9.b;
        vvf vvfVar2 = vvf.e;
        r = new f6c("MergingMediaSource", new l5c(i5cVar), null, new t5c(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), p6c.G, y5c.c);
    }

    public pgc(a51... a51VarArr) {
        q1f q1fVar = new q1f(20);
        this.k = a51VarArr;
        this.n = q1fVar;
        this.m = new ArrayList(Arrays.asList(a51VarArr));
        this.o = -1;
        this.l = new lij[a51VarArr.length];
        this.p = new long[0][];
        new HashMap();
        yqo.w(8, "expectedKeys");
        yqo.w(2, "expectedValuesPerKey");
        o53 e = o53.e(8);
        zyc zycVar = new zyc();
        yqo.w(2, "expectedValuesPerKey");
        new azc(e).g = zycVar;
    }

    @Override // defpackage.a51
    public final v6c a(rcc rccVar, zz0 zz0Var, long j) {
        a51[] a51VarArr = this.k;
        int length = a51VarArr.length;
        v6c[] v6cVarArr = new v6c[length];
        lij[] lijVarArr = this.l;
        int b = lijVarArr[0].b(rccVar.a);
        for (int i = 0; i < length; i++) {
            v6cVarArr[i] = a51VarArr[i].a(rccVar.b(lijVarArr[i].l(b)), zz0Var, j - this.p[b][i]);
        }
        return new mgc(this.n, this.p[b], v6cVarArr);
    }

    @Override // defpackage.a51
    public final f6c g() {
        a51[] a51VarArr = this.k;
        return a51VarArr.length > 0 ? a51VarArr[0].g() : r;
    }

    @Override // defpackage.eg3, defpackage.a51
    public final void i() {
        jz2 jz2Var = this.q;
        if (jz2Var != null) {
            throw jz2Var;
        }
        super.i();
    }

    @Override // defpackage.a51
    public final void k(sn4 sn4Var) {
        this.j = sn4Var;
        this.i = lik.j(null);
        int i = 0;
        while (true) {
            a51[] a51VarArr = this.k;
            if (i >= a51VarArr.length) {
                return;
            }
            v(Integer.valueOf(i), a51VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.a51
    public final void m(v6c v6cVar) {
        mgc mgcVar = (mgc) v6cVar;
        int i = 0;
        while (true) {
            a51[] a51VarArr = this.k;
            if (i >= a51VarArr.length) {
                return;
            }
            a51 a51Var = a51VarArr[i];
            v6c v6cVar2 = mgcVar.a[i];
            if (v6cVar2 instanceof kgc) {
                v6cVar2 = ((kgc) v6cVar2).a;
            }
            a51Var.m(v6cVar2);
            i++;
        }
    }

    @Override // defpackage.eg3, defpackage.a51
    public final void o() {
        super.o();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.eg3
    public final rcc r(Object obj, rcc rccVar) {
        if (((Integer) obj).intValue() == 0) {
            return rccVar;
        }
        return null;
    }

    @Override // defpackage.eg3
    public final void u(Object obj, a51 a51Var, lij lijVar) {
        int i;
        Integer num = (Integer) obj;
        if (this.q != null) {
            return;
        }
        if (this.o == -1) {
            i = lijVar.h();
            this.o = i;
        } else {
            int h = lijVar.h();
            int i2 = this.o;
            if (h != i2) {
                this.q = new jz2();
                return;
            }
            i = i2;
        }
        int length = this.p.length;
        lij[] lijVarArr = this.l;
        if (length == 0) {
            this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, lijVarArr.length);
        }
        ArrayList arrayList = this.m;
        arrayList.remove(a51Var);
        lijVarArr[num.intValue()] = lijVar;
        if (arrayList.isEmpty()) {
            l(lijVarArr[0]);
        }
    }
}
