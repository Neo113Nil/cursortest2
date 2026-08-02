package androidx.compose.foundation.lazy.layout;

import xsna.ci50;
import xsna.eh50;
import xsna.izs;
import xsna.ji;
import xsna.jty;
import xsna.k9x;
import xsna.nox;
import xsna.p8v;
import xsna.pp70;
import xsna.rdi;
import xsna.s3q0;
import xsna.xzw;

/* compiled from: LazyLayoutKeyIndexMap.kt */
/* loaded from: classes11.dex */
public final class d implements jty {
    public final eh50 a;
    public final Object[] b;
    public final int c;

    public d(k9x k9xVar, a<?> aVar) {
        p8v l = aVar.l();
        final int i = k9xVar.b;
        if (i < 0) {
            xzw.c("negative nearestRange.first");
        }
        final int min = Math.min(k9xVar.c, l.b - 1);
        if (min < i) {
            this.a = pp70.a;
            this.b = new Object[0];
            this.c = 0;
            return;
        }
        int i2 = (min - i) + 1;
        this.b = new Object[i2];
        this.c = i;
        final eh50 eh50Var = new eh50(i2);
        izs izsVar = new izs() { // from class: androidx.compose.foundation.lazy.layout.c
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
            
                if (r3 == null) goto L7;
             */
            @Override // xsna.izs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                Object defaultLazyKey;
                nox noxVar = (nox) obj;
                izs<Integer, Object> key = noxVar.c.getKey();
                int i3 = noxVar.a;
                int max = Math.max(i, i3);
                int min2 = Math.min(min, (noxVar.b + i3) - 1);
                if (max <= min2) {
                    while (true) {
                        if (key != null) {
                            defaultLazyKey = key.invoke(Integer.valueOf(max - i3));
                        }
                        defaultLazyKey = new DefaultLazyKey(max);
                        eh50Var.i(defaultLazyKey, max);
                        d dVar = this;
                        dVar.b[max - dVar.c] = defaultLazyKey;
                        if (max == min2) {
                            break;
                        }
                        max++;
                    }
                }
                return s3q0.a;
            }
        };
        ci50 ci50Var = (ci50) l.c;
        if (i < 0 || i >= l.b) {
            StringBuilder b = ji.b(i, "Index ", ", size ");
            b.append(l.b);
            xzw.e(b.toString());
        }
        if (min < 0 || min >= l.b) {
            StringBuilder b2 = ji.b(min, "Index ", ", size ");
            b2.append(l.b);
            xzw.e(b2.toString());
        }
        if (min < i) {
            xzw.a("toIndex (" + min + ") should be not smaller than fromIndex (" + i + ')');
        }
        int e = rdi.e(i, ci50Var);
        int i3 = ((nox) ci50Var.b[e]).a;
        while (i3 <= min) {
            nox noxVar = (nox) ci50Var.b[e];
            izsVar.invoke(noxVar);
            i3 += noxVar.b;
            e++;
        }
        this.a = eh50Var;
    }

    public final Object a(int i) {
        int i2 = i - this.c;
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }

    @Override // xsna.jty
    public final int b(Object obj) {
        eh50 eh50Var = this.a;
        int a = eh50Var.a(obj);
        if (a >= 0) {
            return eh50Var.c[a];
        }
        return -1;
    }
}
