package defpackage;

import android.net.Uri;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qgc extends fg3 {
    public static final h6c s;
    public final vcc[] k;
    public final ArrayList l;
    public final mij[] m;
    public final ArrayList n;
    public final tnf o;
    public int p;
    public long[][] q;
    public jz2 r;

    static {
        b78 b78Var = new b78();
        p5c p5cVar = new p5c(0);
        List list = Collections.EMPTY_LIST;
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        s5c s5cVar = new s5c();
        z5c z5cVar = z5c.a;
        z1a.E(((Uri) p5cVar.c) == null || ((UUID) p5cVar.b) != null);
        s = new h6c("MergingMediaSource", new m5c(b78Var), null, new u5c(s5cVar), q6c.D, z5cVar);
    }

    public qgc(vcc... vccVarArr) {
        tnf tnfVar = new tnf(20);
        this.k = vccVarArr;
        this.o = tnfVar;
        this.n = new ArrayList(Arrays.asList(vccVarArr));
        this.p = -1;
        this.l = new ArrayList(vccVarArr.length);
        for (int i = 0; i < vccVarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new mij[vccVarArr.length];
        this.q = new long[0][];
        new HashMap();
        yqo.w(8, "expectedKeys");
        yqo.w(2, "expectedValuesPerKey");
        o53 e = o53.e(8);
        zyc zycVar = new zyc();
        yqo.w(2, "expectedValuesPerKey");
        new azc(e).g = zycVar;
    }

    @Override // defpackage.vcc
    public final h6c a() {
        vcc[] vccVarArr = this.k;
        return vccVarArr.length > 0 ? vccVarArr[0].a() : s;
    }

    @Override // defpackage.vcc
    public final void b(h6c h6cVar) {
        this.k[0].b(h6cVar);
    }

    @Override // defpackage.vcc
    public final w6c c(scc sccVar, l2a l2aVar, long j) {
        vcc[] vccVarArr = this.k;
        int length = vccVarArr.length;
        w6c[] w6cVarArr = new w6c[length];
        mij[] mijVarArr = this.m;
        int b = mijVarArr[0].b(sccVar.a);
        for (int i = 0; i < length; i++) {
            scc a = sccVar.a(mijVarArr[i].l(b));
            w6cVarArr[i] = vccVarArr[i].c(a, l2aVar, j - this.q[b][i]);
            ((List) this.l.get(i)).add(new ogc(a, w6cVarArr[i]));
        }
        return new ngc(this.o, this.q[b], w6cVarArr);
    }

    @Override // defpackage.vcc
    public final void f(w6c w6cVar) {
        ngc ngcVar = (ngc) w6cVar;
        int i = 0;
        while (true) {
            vcc[] vccVarArr = this.k;
            if (i >= vccVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = ngcVar.b;
            w6c[] w6cVarArr = ngcVar.a;
            w6c w6cVar2 = zArr[i] ? ((ohj) w6cVarArr[i]).a : w6cVarArr[i];
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((ogc) list.get(i2)).b.equals(w6cVar2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            vccVarArr[i].f(ngcVar.b[i] ? ((ohj) w6cVarArr[i]).a : w6cVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.b51
    public final void m(tn4 tn4Var) {
        this.j = tn4Var;
        this.i = nik.q(null);
        int i = 0;
        while (true) {
            vcc[] vccVarArr = this.k;
            if (i >= vccVarArr.length) {
                return;
            }
            w(Integer.valueOf(i), vccVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.fg3, defpackage.vcc
    public final void maybeThrowSourceInfoRefreshError() {
        jz2 jz2Var = this.r;
        if (jz2Var != null) {
            throw jz2Var;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // defpackage.fg3, defpackage.b51
    public final void p() {
        super.p();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.fg3
    public final scc s(Object obj, scc sccVar) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((ogc) list.get(i)).a.equals(sccVar)) {
                return ((ogc) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // defpackage.fg3
    public final void v(Object obj, b51 b51Var, mij mijVar) {
        int i;
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            i = mijVar.h();
            this.p = i;
        } else {
            int h = mijVar.h();
            int i2 = this.p;
            if (h != i2) {
                this.r = new jz2();
                return;
            }
            i = i2;
        }
        int length = this.q.length;
        mij[] mijVarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, mijVarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(b51Var);
        mijVarArr[num.intValue()] = mijVar;
        if (arrayList.isEmpty()) {
            n(mijVarArr[0]);
        }
    }
}
