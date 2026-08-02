package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class x69 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dsf b;
    public final /* synthetic */ dsf c;

    public /* synthetic */ x69(dsf dsfVar, dsf dsfVar2, int i) {
        this.a = i;
        this.b = dsfVar;
        this.c = dsfVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        dsf dsfVar = this.c;
        dsf dsfVar2 = this.b;
        MatchResult matchResult = (MatchResult) obj;
        switch (i) {
            case 0:
                if (dsfVar2.a == -1) {
                    dsfVar2.a = matchResult.b().a;
                }
                dsfVar.a = matchResult.b().b + 1;
                break;
            default:
                if (dsfVar2.a == -1) {
                    dsfVar2.a = matchResult.b().a;
                }
                dsfVar.a = matchResult.b().b + 1;
                break;
        }
        return "";
    }
}
