package defpackage;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ye3 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ye3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((g9i) obj).e(null);
                break;
            case 1:
                jwj jwjVar = (jwj) obj;
                scj scjVar = jwjVar.a;
                q4a q4aVar = jwjVar.b;
                haj hajVar = haj.a;
                scjVar.b.a().q();
                l9j l9jVar = scjVar.b;
                l9jVar.h = null;
                jwjVar.l(l9jVar);
                scjVar.b(q4aVar, true, hajVar);
                scjVar.e(true);
                break;
            default:
                tbj tbjVar = (tbj) obj;
                if (tbjVar != null) {
                    q5b q5bVar = tbjVar.d;
                    if (q5bVar != null) {
                        q5bVar.e(pej.b);
                    }
                    q5b q5bVar2 = tbjVar.d;
                    if (q5bVar2 != null) {
                        q5bVar2.f(pej.b);
                        break;
                    }
                }
                break;
        }
    }
}
