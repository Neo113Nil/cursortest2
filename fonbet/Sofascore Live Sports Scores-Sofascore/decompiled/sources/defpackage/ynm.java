package defpackage;

import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ynm extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ sqm s;
    public final /* synthetic */ n4m t;
    public final /* synthetic */ Pair u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynm(sqm sqmVar, n4m n4mVar, Pair pair, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = sqmVar;
        this.t = n4mVar;
        this.u = pair;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new ynm(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ynm) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            gum gumVar = this.s.k0;
            String str = this.t.a;
            float longValue = ((Number) this.u.a).longValue();
            this.r = 1;
            gumVar.getClass();
            Set<Map.Entry> entrySet = gum.c.entrySet();
            entrySet.getClass();
            for (Map.Entry entry : entrySet) {
                Object value = entry.getValue();
                value.getClass();
                Iterator it = ((Iterable) value).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (Intrinsics.c(((MomentModel) obj2).id, str)) {
                        break;
                    }
                }
                MomentModel momentModel = (MomentModel) obj2;
                if (momentModel != null) {
                    momentModel.l = longValue;
                }
                gum.d.b(entry.getKey());
            }
            if (Unit.a == lu3Var) {
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
