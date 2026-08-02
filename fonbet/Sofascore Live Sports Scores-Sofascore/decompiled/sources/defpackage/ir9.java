package defpackage;

import com.blaze.ima.ImaHandler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ir9 implements wf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ir9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wf
    public final void c(hoo hooVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ImaHandler.buildImaAdsLoader$lambda$0((ImaHandler) obj, hooVar);
                break;
            case 1:
                ((geb) obj).r(hooVar);
                break;
            default:
                bhi.q((bhi) obj, hooVar);
                break;
        }
    }
}
