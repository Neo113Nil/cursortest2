package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class mdc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ odc b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ mdc(odc odcVar, Pair pair, int i) {
        this.a = i;
        this.b = odcVar;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Pair pair = this.c;
        odc odcVar = this.b;
        switch (i) {
            case 0:
                ((cn4) odcVar.b.j).j(((Integer) pair.first).intValue(), (scc) pair.second);
                break;
            default:
                ((cn4) odcVar.b.j).e(((Integer) pair.first).intValue(), (scc) pair.second);
                break;
        }
    }
}
