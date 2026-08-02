package defpackage;

import com.blaze.ima.ImaHandler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class jr9 implements uf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jr9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uf
    public final void a(vf vfVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ImaHandler.buildImaAdsLoader$lambda$1((ImaHandler) obj, vfVar);
                break;
            default:
                geb.q((geb) obj, vfVar);
                break;
        }
    }
}
