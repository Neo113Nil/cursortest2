package defpackage;

import com.ironsource.B;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class xw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ B b;

    public /* synthetic */ xw0(B b, int i) {
        this.a = i;
        this.b = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        B b = this.b;
        switch (i) {
            case 0:
                B.b(b);
                break;
            default:
                B.c(b);
                break;
        }
    }
}
