package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class xz9 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventSuggest.IncidentSuggest b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ int e;

    public /* synthetic */ xz9(EventSuggest.IncidentSuggest incidentSuggest, String str, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = incidentSuggest;
        this.c = str;
        this.d = xtcVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a0a.b(this.b, this.c, this.d, of3Var, aba.K(this.e | 1));
                break;
            default:
                a0a.d(this.b, this.c, this.d, of3Var, aba.K(this.e | 1));
                break;
        }
        return Unit.a;
    }
}
