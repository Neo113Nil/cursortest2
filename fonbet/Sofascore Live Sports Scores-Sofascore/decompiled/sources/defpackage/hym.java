package defpackage;

import com.ironsource.C4351v1;
import com.ironsource.InterfaceC4128ia;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class hym implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceC4128ia b;

    public /* synthetic */ hym(InterfaceC4128ia interfaceC4128ia, int i) {
        this.a = i;
        this.b = interfaceC4128ia;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        InterfaceC4128ia interfaceC4128ia = this.b;
        switch (i) {
            case 0:
                C4351v1.c(interfaceC4128ia);
                break;
            default:
                C4351v1.d(interfaceC4128ia);
                break;
        }
    }
}
