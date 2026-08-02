package defpackage;

import android.content.Context;
import com.inmobi.media.AbstractC3551kh;
import com.mbridge.msdk.system.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class po0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ po0(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                lg6 lg6Var = ((qo0) obj).b;
                int i2 = lik.a;
                ug6 ug6Var = lg6Var.a;
                if (ug6Var.b0 != z) {
                    ug6Var.b0 = z;
                    ug6Var.l.k(23, new fg6(z, 2));
                    break;
                }
                break;
            case 1:
                mg6 mg6Var = ((ro0) obj).b;
                String str = nik.a;
                vg6 vg6Var = mg6Var.a;
                if (vg6Var.d0 != z) {
                    vg6Var.d0 = z;
                    vg6Var.m.g(23, new fg6(z, 3));
                    break;
                }
                break;
            case 2:
                ((d66) obj).n(z);
                break;
            case 3:
                ((a) obj).lambda$init$2(z);
                break;
            default:
                AbstractC3551kh.a((Context) obj, z);
                break;
        }
    }
}
