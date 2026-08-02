package defpackage;

import com.sofascore.model.fantasy.FantasyLeagueGameType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class d05 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wd8 b;
    public final /* synthetic */ e1d c;

    public /* synthetic */ d05(wd8 wd8Var, e1d e1dVar, int i) {
        this.a = i;
        this.b = wd8Var;
        this.c = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        e1d e1dVar = this.c;
        wd8 wd8Var = this.b;
        switch (i) {
            case 0:
                ((hja) obj).getClass();
                wd8.a(wd8Var);
                e1dVar.setValue(Boolean.FALSE);
                break;
            default:
                FantasyLeagueGameType fantasyLeagueGameType = (FantasyLeagueGameType) obj;
                fantasyLeagueGameType.getClass();
                wd8.a(wd8Var);
                e1dVar.setValue(fantasyLeagueGameType);
                break;
        }
        return Unit.a;
    }
}
