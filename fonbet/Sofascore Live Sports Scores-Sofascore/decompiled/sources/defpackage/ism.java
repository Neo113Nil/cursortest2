package defpackage;

import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.features.videos.players.ui.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ism extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ a s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ism(a aVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        ism ismVar = new ism(this.s, rq3Var);
        ismVar.r = obj;
        return ismVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ism ismVar = new ism(this.s, (rq3) obj2);
        ismVar.r = (List) obj;
        return ismVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        List list = (List) this.r;
        if (list.isEmpty()) {
            return Unit.a;
        }
        n7m b = fgm.b(list);
        int i = a.I;
        a aVar = this.s;
        w3m w3mVar = (w3m) aVar.getViewModel();
        Context context = aVar.getContext();
        boolean z = context != null && cnb.f(context) == 0;
        d0h d0hVar = d0h.c;
        d0hVar.getClass();
        w3mVar.w(false, z, b, d0hVar);
        fam famVar = ((w3m) aVar.getViewModel()).e;
        if (famVar != null) {
            ((qdm) aVar.getPlayerRendererBridge()).a(famVar);
        } else {
            w0m.detachPlayer$default(aVar.getPlayerRendererBridge(), false, 1, null);
        }
        lzm lzmVar = aVar.r;
        if (lzmVar != null) {
            lzmVar.s(list);
        }
        w3m w3mVar2 = (w3m) aVar.getViewModel();
        w3mVar2.P0.getClass();
        n4m D = w3mVar2.D();
        if (D != null) {
            String str = D.a;
            Iterator it = w3mVar2.t.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (Intrinsics.c(((n4m) it.next()).a, str)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                n4m n4mVar = (n4m) w3mVar2.t.get(i2);
                if (Intrinsics.c(str, n4mVar.a) && !D.equals(n4mVar)) {
                    w3mVar2.c0(i2, true);
                }
            }
        }
        if (aVar.H) {
            return Unit.a;
        }
        dxm dxmVar = aVar.q;
        dxmVar.e.c(((w3m) aVar.getViewModel()).m0, false);
        ViewPager2 viewPager2 = dxmVar.e;
        viewPager2.getClass();
        viewPager2.setVisibility(0);
        aVar.H = true;
        return Unit.a;
    }
}
