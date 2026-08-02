package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m0c extends g0c {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ m0c(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.g0c
    public final void c(w0c w0cVar) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                ((thh) obj2).a(new k0c(w0cVar, (k3f) obj, i2));
                break;
            default:
                g0c[] g0cVarArr = (g0c[]) obj2;
                int length = g0cVarArr.length;
                if (length == 1) {
                    g0cVarArr[0].b(new za3(w0cVar, new yia(this, 3), 1));
                    break;
                } else {
                    z0c z0cVar = new z0c(w0cVar, length, (uxf) obj);
                    w0cVar.a(z0cVar);
                    for (int i3 = 0; i3 < length; i3++) {
                        if (z0cVar.get() <= 0) {
                            break;
                        } else {
                            g0c g0cVar = g0cVarArr[i3];
                            if (g0cVar == null) {
                                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                                if (z0cVar.getAndSet(0) > 0) {
                                    z0cVar.a(i3);
                                    z0cVar.a.onError(nullPointerException);
                                    break;
                                } else {
                                    hda.L(nullPointerException);
                                    break;
                                }
                            } else {
                                g0cVar.b(z0cVar.c[i3]);
                            }
                        }
                    }
                    break;
                }
        }
    }
}
