package defpackage;

import com.sofascore.model.fantasy.FantasyLeagueGameType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ct8 b;
    public final /* synthetic */ e1d c;
    public final /* synthetic */ e1d d;
    public final /* synthetic */ e1d e;

    public /* synthetic */ pz4(ct8 ct8Var, e1d e1dVar, e1d e1dVar2, e1d e1dVar3, int i) {
        this.a = i;
        this.b = ct8Var;
        this.c = e1dVar;
        this.d = e1dVar2;
        this.e = e1dVar3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        e1d e1dVar = this.e;
        e1d e1dVar2 = this.d;
        e1d e1dVar3 = this.c;
        ct8 ct8Var = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) e1dVar3.getValue();
                bool.booleanValue();
                Boolean bool2 = (Boolean) e1dVar2.getValue();
                bool2.booleanValue();
                Boolean bool3 = (Boolean) e1dVar.getValue();
                bool3.booleanValue();
                ct8Var.invoke(bool, bool2, bool3);
                break;
            default:
                ct8Var.invoke((String) e1dVar3.getValue(), (String) e1dVar2.getValue(), (FantasyLeagueGameType) e1dVar.getValue());
                break;
        }
        return Unit.a;
    }
}
