package defpackage;

import com.blaze.blazesdk.closed_captions.models.ui.e;
import defpackage.acm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zcm extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ List s;
    public final /* synthetic */ tkm t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zcm(List list, tkm tkmVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = list;
        this.t = tkmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new zcm(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new zcm(this.s, this.t, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            List list = this.s;
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new acm.a((e) it.next(), false, 2, null));
            }
            aeh aehVar = this.t.e;
            this.r = 1;
            if (aehVar.emit(arrayList, this) == lu3Var) {
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
