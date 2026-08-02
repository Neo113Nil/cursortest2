package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u2m extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ a s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2m(a aVar, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = aVar;
        this.t = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new u2m(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u2m(this.s, this.t, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lzm lzmVar;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            a aVar = this.s;
            dxm dxmVar = aVar.q;
            if (aVar.J() && (lzmVar = aVar.r) != null) {
                int currentItem = dxmVar.e.getCurrentItem();
                this.r = 1;
                if (lzmVar.E(this.t, currentItem, this) == lu3Var) {
                    return lu3Var;
                }
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
