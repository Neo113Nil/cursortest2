package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lvm extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ a s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvm(a aVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = aVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        lvm lvmVar = new lvm(this.s, rq3Var);
        lvmVar.r = obj;
        return lvmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        lvm lvmVar = new lvm(this.s, (rq3) obj2);
        lvmVar.r = (sum) obj;
        return lvmVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        sum sumVar = (sum) this.r;
        if (!Intrinsics.c(sumVar, psm.a)) {
            boolean c = Intrinsics.c(sumVar, hrm.a);
            a aVar = this.s;
            if (c) {
                int i = a.I;
                aVar.getClass();
            } else {
                if (!Intrinsics.c(sumVar, ztm.a)) {
                    zzl.b();
                    return null;
                }
                a.D(aVar);
            }
        }
        return Unit.a;
    }
}
