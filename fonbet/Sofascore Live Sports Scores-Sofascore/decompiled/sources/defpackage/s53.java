package defpackage;

import android.view.ViewGroup;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s53 implements pyf, pcd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s53(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.pyf
    public final void onAdRendered(of ofVar) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                u53 u53Var = (u53) obj3;
                g7a.v((olk) u53Var.c, 14, (Map) obj2);
                u53Var.h = ofVar;
                ofVar.d.add(new r53((pkk) obj, u53Var));
                break;
            default:
                ViewGroup viewGroup = (ViewGroup) obj3;
                lcd lcdVar = (lcd) obj2;
                if (!Intrinsics.c(viewGroup, lcdVar)) {
                    viewGroup.addView(lcdVar);
                }
                ((pyf) obj).onAdRendered(ofVar);
                lcdVar.d = ofVar;
                break;
        }
    }

    @Override // defpackage.pcd
    public final void onError(qcd qcdVar) {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                b6a.p((olk) ((u53) this.b).c, 16);
                ((pkk) obj).r(new qcd(4, "Error rendering web companion ad", qcdVar));
                break;
            default:
                ((pcd) ((pyf) obj)).onError(qcdVar);
                break;
        }
    }
}
