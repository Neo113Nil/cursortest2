package defpackage;

import com.ironsource.sdk.controller.v;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class eym implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v.s b;
    public final /* synthetic */ String c;

    public /* synthetic */ eym(v.s sVar, String str, int i) {
        this.a = i;
        this.b = sVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        v.s sVar = this.b;
        switch (i) {
            case 0:
                sVar.m(str);
                break;
            case 1:
                sVar.j(str);
                break;
            case 2:
                sVar.s(str);
                break;
            case 3:
                sVar.q(str);
                break;
            case 4:
                sVar.k(str);
                break;
            case 5:
                sVar.o(str);
                break;
            case 6:
                sVar.n(str);
                break;
            case 7:
                sVar.r(str);
                break;
            case 8:
                sVar.l(str);
                break;
            default:
                sVar.p(str);
                break;
        }
    }
}
