package defpackage;

import com.ironsource.Ea;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class hg5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ea b;

    public /* synthetic */ hg5(Ea ea, int i) {
        this.a = i;
        this.b = ea;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Ea ea = this.b;
        switch (i) {
            case 0:
                Ea.b(ea);
                break;
            default:
                Ea.a(ea);
                break;
        }
    }
}
