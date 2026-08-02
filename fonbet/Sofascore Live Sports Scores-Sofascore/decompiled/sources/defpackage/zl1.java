package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zl1 implements g49, p74 {
    public final /* synthetic */ int a;
    public ArrayList b;

    public zl1(nuj nujVar) {
        this.a = 6;
        nujVar.getClass();
        int i = kbl.a;
        um3 um3Var = nujVar.b;
        dbd dbdVar = nujVar.d;
        int i2 = 3;
        int i3 = 2;
        ArrayList l = b.l(new qt1(um3Var, 0), new qt1(nujVar.c, 1), new qt1(nujVar.e, 4));
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = nujVar.a;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            l.add(new oad((ConnectivityManager) systemService));
        } else {
            dbdVar.getClass();
            l.addAll(b.j(new qt1(dbdVar, i3), new qt1(dbdVar, i2), new iad(dbdVar), new gad(dbdVar)));
        }
        this.b = l;
    }

    @Override // defpackage.g49
    public Object a(Object obj) {
        m91 m91Var = ((wl1) obj).a;
        if (m91Var != null) {
            return m91Var.name();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.p74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(q74 q74Var, long j) {
        boolean z;
        int size;
        ArrayList arrayList = this.b;
        long j2 = q74Var.b;
        z1a.s(j2 != C.TIME_UNSET);
        if (j2 <= j) {
            long j3 = q74Var.d;
            if (j3 == C.TIME_UNSET || j < j3) {
                z = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j2 >= ((q74) arrayList.get(size)).b) {
                        arrayList.add(size + 1, q74Var);
                        return z;
                    }
                    if (((q74) arrayList.get(size)).b <= j) {
                        z = false;
                    }
                }
                arrayList.add(0, q74Var);
                return z;
            }
        }
        z = false;
        while (size >= 0) {
        }
        arrayList.add(0, q74Var);
        return z;
    }

    @Override // defpackage.p74
    public hv9 c(long j) {
        int k = k(j);
        if (k == 0) {
            av9 av9Var = hv9.b;
            return vvf.e;
        }
        q74 q74Var = (q74) this.b.get(k - 1);
        long j2 = q74Var.d;
        if (j2 == C.TIME_UNSET || j < j2) {
            return q74Var.a;
        }
        av9 av9Var2 = hv9.b;
        return vvf.e;
    }

    @Override // defpackage.p74
    public void clear() {
        this.b.clear();
    }

    @Override // defpackage.p74
    public long d(long j) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || j < ((q74) arrayList.get(0)).b) {
            return C.TIME_UNSET;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((q74) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                q74 q74Var = (q74) arrayList.get(i - 1);
                long j3 = q74Var.d;
                return (j3 == C.TIME_UNSET || j3 > j) ? q74Var.b : j3;
            }
        }
        q74 q74Var2 = (q74) jca.H(arrayList);
        long j4 = q74Var2.d;
        return (j4 == C.TIME_UNSET || j < j4) ? q74Var2.b : j4;
    }

    @Override // defpackage.p74
    public long e(long j) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((q74) arrayList.get(0)).b) {
            return ((q74) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((q74) arrayList.get(i)).b;
            if (j < j2) {
                long j3 = ((q74) arrayList.get(i - 1)).d;
                return (j3 == C.TIME_UNSET || j3 <= j || j3 >= j2) ? j2 : j3;
            }
        }
        long j4 = ((q74) jca.H(arrayList)).d;
        if (j4 == C.TIME_UNSET || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // defpackage.p74
    public void f(long j) {
        ArrayList arrayList = this.b;
        int k = k(j);
        if (k == 0) {
            return;
        }
        long j2 = ((q74) arrayList.get(k - 1)).d;
        if (j2 == C.TIME_UNSET || j2 >= j) {
            k--;
        }
        arrayList.subList(0, k).clear();
    }

    public void g(zd2 zd2Var) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        int i = 0;
        while (true) {
            int size = this.b.size();
            ArrayList arrayList = this.b;
            if (i >= size) {
                arrayList.add(zd2Var);
                return;
            } else {
                if (((zd2) arrayList.get(i)).a.b > zd2Var.a.b) {
                    this.b.add(i, zd2Var);
                    return;
                }
                i++;
            }
        }
    }

    public void h(zl1 zl1Var) {
        if (zl1Var.b == null) {
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList(zl1Var.b.size());
        }
        Iterator it = zl1Var.b.iterator();
        while (it.hasNext()) {
            g((zd2) it.next());
        }
    }

    public void i(Object obj, String str) {
        this.b.add(str + U3.j.b + obj);
    }

    public void j() {
        Iterator it = CollectionsKt.S0(this.b).iterator();
        while (it.hasNext()) {
            ((adg) it.next()).a();
        }
    }

    public int k(long j) {
        ArrayList arrayList = this.b;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((q74) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    @Override // defpackage.g49
    public Iterator l() {
        return this.b.iterator();
    }

    public String toString() {
        switch (this.a) {
            case 1:
                if (this.b == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    sb.append(((zd2) it.next()).toString());
                    sb.append('\n');
                }
                return sb.toString();
            case 2:
            default:
                return super.toString();
            case 3:
                return this.b.toString();
        }
    }

    public zl1(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new ArrayList();
                break;
            case 3:
                this.b = new ArrayList();
                break;
            case 4:
                this.b = new ArrayList();
                break;
            case 5:
                this.b = new ArrayList();
                break;
            default:
                this.b = null;
                break;
        }
    }

    public zl1(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }
}
