package defpackage;

import com.ironsource.Ae;
import com.ironsource.C4185le;
import com.ironsource.C4436ze;
import com.ironsource.InterfaceC4292re;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class ml implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4185le b;
    public final /* synthetic */ InterfaceC4292re c;

    public /* synthetic */ ml(C4185le c4185le, InterfaceC4292re interfaceC4292re) {
        this.a = 1;
        this.b = c4185le;
        this.c = interfaceC4292re;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4185le c4185le = this.b;
        InterfaceC4292re interfaceC4292re = this.c;
        switch (i) {
            case 0:
                Ae.a(interfaceC4292re, c4185le);
                break;
            case 1:
                Ae.a.a(c4185le, interfaceC4292re);
                break;
            default:
                C4436ze.b(interfaceC4292re, c4185le);
                break;
        }
    }

    public /* synthetic */ ml(InterfaceC4292re interfaceC4292re, C4185le c4185le, int i) {
        this.a = i;
        this.c = interfaceC4292re;
        this.b = c4185le;
    }
}
