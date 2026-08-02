package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k7l {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                k7l k7lVar = (k7l) arrayList.get(i);
                if (this.e == k7lVar.b) {
                    c(this.c, k7lVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(h8b h8bVar, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        xm3 xm3Var = ((wm3) arrayList.get(0)).U;
        h8bVar.t();
        xm3Var.c(h8bVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((wm3) arrayList.get(i2)).c(h8bVar, false);
        }
        if (i == 0 && xm3Var.A0 > 0) {
            xw3.r(xm3Var, h8bVar, arrayList, 0);
        }
        if (i == 1 && xm3Var.B0 > 0) {
            xw3.r(xm3Var, h8bVar, arrayList, 1);
        }
        try {
            h8bVar.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace(U3.j.d, "   at ").replace(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, "\n   at").replace(U3.j.e, ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            wm3 wm3Var = (wm3) arrayList.get(i3);
            omf omfVar = new omf(5);
            new WeakReference(wm3Var);
            h8b.n(wm3Var.J);
            h8b.n(wm3Var.K);
            h8b.n(wm3Var.L);
            h8b.n(wm3Var.M);
            h8b.n(wm3Var.N);
            this.d.add(omfVar);
        }
        if (i == 0) {
            n = h8b.n(xm3Var.J);
            n2 = h8b.n(xm3Var.L);
            h8bVar.t();
        } else {
            n = h8b.n(xm3Var.K);
            n2 = h8b.n(xm3Var.M);
            h8bVar.t();
        }
        return n2 - n;
    }

    public final void c(int i, k7l k7lVar) {
        int i2 = k7lVar.b;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            wm3 wm3Var = (wm3) it.next();
            ArrayList arrayList = k7lVar.a;
            if (!arrayList.contains(wm3Var)) {
                arrayList.add(wm3Var);
            }
            if (i == 0) {
                wm3Var.o0 = i2;
            } else {
                wm3Var.p0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        int i = this.c;
        StringBuilder sb = new StringBuilder(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String h = fc6.h(this.b, "] <", sb);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            wm3 wm3Var = (wm3) it.next();
            StringBuilder r = mz1.r(h, " ");
            r.append(wm3Var.i0);
            h = r.toString();
        }
        return h.concat(" >");
    }
}
