package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class zeh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;

    public /* synthetic */ zeh(Object obj, float f, int i) {
        this.a = i;
        this.b = obj;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float H0;
        int i = this.a;
        float f = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                H0 = ((kx4) obj).H0(f);
                break;
            case 1:
                H0 = ((kx4) obj).H0(f);
                break;
            default:
                mzg mzgVar = (mzg) obj;
                return Boolean.valueOf(mzgVar.c.c() || mzgVar.a.h() != f);
        }
        return Float.valueOf(H0);
    }
}
