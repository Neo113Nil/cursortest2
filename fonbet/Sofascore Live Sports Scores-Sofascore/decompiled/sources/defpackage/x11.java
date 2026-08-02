package defpackage;

import com.sofascore.model.chat.BanReason;
import com.sofascore.model.chat.Message;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x11 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ y11 s;
    public final /* synthetic */ Message t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x11(y11 y11Var, Message message, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = y11Var;
        this.t = message;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new x11(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x11) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            BanReason banReason = new BanReason(BanReason.Type.OTHER, "none");
            cs2 cs2Var = this.s.e;
            int id = this.t.getId();
            this.r = 1;
            cs2Var.getClass();
            if (yaa.P(new bs2(cs2Var, id, this.u, banReason, null, 0), this) == lu3Var) {
                return lu3Var;
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
