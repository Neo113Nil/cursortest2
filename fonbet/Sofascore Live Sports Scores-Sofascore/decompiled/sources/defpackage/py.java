package defpackage;

import android.content.res.Resources;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class py extends ot8 implements ct8 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object value;
        ha7 ha7Var;
        switch (this.b) {
            case 0:
                if (obj != null) {
                    pvd.j();
                    break;
                } else {
                    xy xyVar = (xy) this.receiver;
                    Resources resources = xyVar.getContext().getResources();
                    break;
                }
            case 1:
                Function1 function1 = ((g62) this.receiver).b;
                function1.getClass();
                y6a.v(function1, obj2, (CoroutineContext) obj3);
                break;
            case 2:
                Object obj4 = ((go2) obj2).a;
                Function1 function12 = ((g62) this.receiver).b;
                function12.getClass();
                Object a = go2.a(obj4);
                a.getClass();
                y6a.v(function12, a, (CoroutineContext) obj3);
                break;
            case 3:
                String str = (String) obj;
                String str2 = (String) obj2;
                FantasyLeagueGameType fantasyLeagueGameType = (FantasyLeagueGameType) obj3;
                str.getClass();
                str2.getClass();
                fantasyLeagueGameType.getClass();
                mv6 mv6Var = (mv6) this.receiver;
                mv6Var.getClass();
                xw3.L(un0.z(mv6Var), null, null, new h10(mv6Var, str, str2, fantasyLeagueGameType, null, 9), 3);
                break;
            case 4:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                FantasyLeagueGameType fantasyLeagueGameType2 = (FantasyLeagueGameType) obj3;
                str3.getClass();
                str4.getClass();
                fantasyLeagueGameType2.getClass();
                ia7 ia7Var = (ia7) this.receiver;
                ia7Var.getClass();
                fdi fdiVar = ia7Var.g;
                do {
                    value = fdiVar.getValue();
                    ha7Var = (ha7) value;
                    aa7 aa7Var = ha7Var.a;
                    if (aa7Var instanceof y97) {
                        ha7Var = ha7.a(ha7Var, y97.a((y97) aa7Var, null, null, null, true, false, 47), false, 2);
                    }
                } while (!fdiVar.k(value, ha7Var));
                xw3.L(un0.z(ia7Var), null, null, new h10(ia7Var, str3, str4, fantasyLeagueGameType2, null, 10), 3);
                break;
            default:
                int intValue = ((Number) obj).intValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                MmaFightNightActivity mmaFightNightActivity = (MmaFightNightActivity) this.receiver;
                int i = MmaFightNightActivity.R;
                if (booleanValue) {
                    mmaFightNightActivity.getClass();
                    p4h.t(mmaFightNightActivity, true, new qoa(mmaFightNightActivity, intValue, booleanValue2), null, 56);
                } else {
                    mmaFightNightActivity.X().l(intValue, false, booleanValue2);
                }
                break;
        }
        return Unit.a;
    }
}
