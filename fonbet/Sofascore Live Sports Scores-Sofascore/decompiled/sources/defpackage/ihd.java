package defpackage;

import com.mbridge.msdk.foundation.download.Command;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ihd extends hoi implements et8 {
    public final /* synthetic */ int r = 0;
    public /* synthetic */ Object s;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihd(String str, rq3 rq3Var) {
        super(4, rq3Var);
        this.t = str;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.r) {
            case 0:
                ihd ihdVar = new ihd(4, (rq3) obj4);
                ihdVar.s = (List) obj;
                ihdVar.t = (List) obj2;
                return ihdVar.invokeSuspend(Unit.a);
            default:
                ihd ihdVar2 = new ihd((String) this.t, (rq3) obj4);
                ihdVar2.s = (yj9) obj2;
                return ihdVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                List list = (List) this.s;
                List list2 = (List) this.t;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                return new Pair(list, list2);
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                yj9 yj9Var = (yj9) this.s;
                gfk.a.l("Adding User-Agent header: agent for " + yj9Var.a);
                List list3 = zi9.a;
                yj9Var.c.i(Command.HTTP_HEADER_USER_AGENT, ((String) this.t).toString());
                return Unit.a;
        }
    }

    public /* synthetic */ ihd(int i, rq3 rq3Var) {
        super(i, rq3Var);
    }
}
