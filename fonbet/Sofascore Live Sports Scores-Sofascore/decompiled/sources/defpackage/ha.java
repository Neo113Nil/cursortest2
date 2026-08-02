package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ha implements n55 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ha(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.n55
    public final void d() {
        g6b lifecycle;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Function0) obj3).invoke();
                ((u6b) obj2).getLifecycle().d((ga) obj);
                break;
            case 1:
                ((SnapshotStateList) obj3).remove(obj2);
                ((r60) obj).e.k(obj2);
                break;
            case 2:
                d6d d6dVar = (d6d) obj2;
                ((y15) obj3).b().c(d6dVar);
                ((SnapshotStateList) obj).remove(d6dVar);
                break;
            case 3:
                ((u6b) obj2).getLifecycle().d((us5) obj3);
                v6b v6bVar = (v6b) ((fsf) obj).a;
                if (v6bVar != null) {
                    v6bVar.a();
                    break;
                }
                break;
            case 4:
                ((u6b) obj2).getLifecycle().d((us5) obj3);
                ux0 ux0Var = (ux0) ((fsf) obj).a;
                if (ux0Var != null) {
                    ux0Var.a();
                    break;
                }
                break;
            case 5:
                u6b u6bVar = (u6b) obj2;
                if (u6bVar != null && (lifecycle = u6bVar.getLifecycle()) != null) {
                    lifecycle.d((ga) obj3);
                }
                ge3 ge3Var = (ge3) obj;
                d6b d6bVar = d6b.ON_DESTROY;
                ge3Var.getClass();
                ge3Var.b = d6bVar.d();
                ge3Var.a();
                break;
            default:
                ppg ppgVar = (ppg) obj3;
                vpg vpgVar = (vpg) obj;
                if (ppgVar.b.k(obj2) == vpgVar) {
                    Map map = ppgVar.a;
                    Map e = vpgVar.e();
                    if (!e.isEmpty()) {
                        map.put(obj2, e);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ha(u6b u6bVar, p6b p6bVar, Object obj, int i) {
        this.a = i;
        this.c = u6bVar;
        this.b = p6bVar;
        this.d = obj;
    }
}
