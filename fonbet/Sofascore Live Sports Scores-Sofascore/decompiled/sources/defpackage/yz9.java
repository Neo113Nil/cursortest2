package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yz9 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boh b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ EventSuggest.IncidentSuggest d;

    public /* synthetic */ yz9(boh bohVar, Function1 function1, EventSuggest.IncidentSuggest incidentSuggest, int i) {
        this.a = i;
        this.b = bohVar;
        this.c = function1;
        this.d = incidentSuggest;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        EventSuggest.IncidentSuggest incidentSuggest = this.d;
        Function1 function1 = this.c;
        boh bohVar = this.b;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    if (function1 != null) {
                        function1.invoke(incidentSuggest);
                    }
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis2);
                    if (function1 != null) {
                        function1.invoke(incidentSuggest);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
