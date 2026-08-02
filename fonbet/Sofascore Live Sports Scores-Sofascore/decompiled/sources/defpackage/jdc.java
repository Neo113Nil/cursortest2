package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class jdc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ odc b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ m6c d;

    public /* synthetic */ jdc(odc odcVar, Pair pair, m6c m6cVar, int i) {
        this.a = i;
        this.b = odcVar;
        this.c = pair;
        this.d = m6cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        m6c m6cVar = this.d;
        Pair pair = this.c;
        odc odcVar = this.b;
        switch (i) {
            case 0:
                cn4 cn4Var = (cn4) odcVar.b.j;
                int intValue = ((Integer) pair.first).intValue();
                scc sccVar = (scc) pair.second;
                sccVar.getClass();
                cn4Var.b(intValue, sccVar, m6cVar);
                break;
            default:
                ((cn4) odcVar.b.j).g(((Integer) pair.first).intValue(), (scc) pair.second, m6cVar);
                break;
        }
    }
}
