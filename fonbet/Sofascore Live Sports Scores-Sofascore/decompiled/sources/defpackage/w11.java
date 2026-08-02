package defpackage;

import com.sofascore.model.chat.BanReason;
import com.sofascore.model.chat.Message;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w11 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ y11 t;
    public final /* synthetic */ Message u;
    public final /* synthetic */ BanReason v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w11(y11 y11Var, Message message, BanReason banReason, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = y11Var;
        this.u = message;
        this.v = banReason;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new w11(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new w11(this.t, this.u, this.v, rq3Var, 1);
            default:
                return new w11(this.t, this.u, this.v, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((w11) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Message message = this.u;
        y11 y11Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    cs2 cs2Var = y11Var.e;
                    int id = message.getId();
                    this.s = 1;
                    cs2Var.getClass();
                    if (yaa.P(new bs2(cs2Var, id, "ban", this.v, null, 0), this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    cs2 cs2Var2 = y11Var.e;
                    int id2 = message.getId();
                    this.s = 1;
                    cs2Var2.getClass();
                    if (yaa.P(new bs2(cs2Var2, id2, "permaban", this.v, null, 0), this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    cs2 cs2Var3 = y11Var.e;
                    int id3 = message.getId();
                    this.s = 1;
                    cs2Var3.getClass();
                    if (yaa.P(new bs2(cs2Var3, id3, "warn", this.v, null, 0), this) == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
