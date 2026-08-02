package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ldc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ odc b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ lfb d;
    public final /* synthetic */ m6c e;

    public /* synthetic */ ldc(odc odcVar, Pair pair, lfb lfbVar, m6c m6cVar, int i) {
        this.a = i;
        this.b = odcVar;
        this.c = pair;
        this.d = lfbVar;
        this.e = m6cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        m6c m6cVar = this.e;
        lfb lfbVar = this.d;
        Pair pair = this.c;
        odc odcVar = this.b;
        switch (i) {
            case 0:
                ((cn4) odcVar.b.j).h(((Integer) pair.first).intValue(), (scc) pair.second, lfbVar, m6cVar);
                break;
            default:
                ((cn4) odcVar.b.j).i(((Integer) pair.first).intValue(), (scc) pair.second, lfbVar, m6cVar);
                break;
        }
    }
}
