package defpackage;

import com.ironsource.T0;
import com.ironsource.U2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class j7k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ T0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ j7k(T0 t0, long j, int i) {
        this.a = i;
        this.b = t0;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        T0 t0 = this.b;
        switch (i) {
            case 0:
                U2.a.a(t0, j);
                break;
            case 1:
                U2.a.b(t0, j);
                break;
            case 2:
                U2.a.c(t0, j);
                break;
            default:
                U2.a.d(t0, j);
                break;
        }
    }
}
