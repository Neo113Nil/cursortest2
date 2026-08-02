package defpackage;

import android.view.View;
import com.blaze.blazesdk.features.videos.players.ui.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eif extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ a s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eif(a aVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        eif eifVar = new eif(this.s, rq3Var);
        eifVar.r = obj;
        return eifVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eif eifVar = new eif(this.s, (rq3) obj2);
        eifVar.r = (n7k) obj;
        return eifVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        n7k n7kVar = (n7k) this.r;
        dxm dxmVar = this.s.q;
        if (Intrinsics.c(n7kVar, hag.a)) {
            View view = dxmVar.c;
            view.getClass();
            view.getClass();
            view.setVisibility(0);
            dxmVar.c.setOnClickListener(new m(0));
        } else {
            if (!Intrinsics.c(n7kVar, ori.a)) {
                zzl.b();
                return null;
            }
            View view2 = dxmVar.c;
            view2.getClass();
            view2.getClass();
            view2.setVisibility(8);
        }
        return Unit.a;
    }
}
