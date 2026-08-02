package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fr3 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ tr3 s;
    public final /* synthetic */ EventSuggest.IncidentSuggest.CardSuggest t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr3(tr3 tr3Var, EventSuggest.IncidentSuggest.CardSuggest cardSuggest, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = tr3Var;
        this.t = cardSuggest;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new fr3(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fr3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object value;
        Map m;
        boolean z;
        EventSuggest.IncidentSuggest.CardSuggest cardSuggest;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            tr3 tr3Var = this.s;
            fdi fdiVar = tr3Var.v;
            do {
                value = fdiVar.getValue();
                m = tr3Var.m();
                z = tr3Var.t.getValue() instanceof e0a;
                cardSuggest = this.t;
            } while (!fdiVar.k(value, new u34(m, cardSuggest, z, cardSuggest.getType(), tr3Var.k(cardSuggest))));
            aeh aehVar = tr3Var.g;
            this.r = 1;
            if (aehVar.emit(e34.a, this) == lu3Var) {
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
