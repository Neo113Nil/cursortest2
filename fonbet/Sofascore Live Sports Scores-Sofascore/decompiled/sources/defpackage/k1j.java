package defpackage;

import com.sofascore.model.mvvm.model.Team;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class k1j extends ot8 implements Function2 {
    public static final k1j b = new k1j(2, o1j.class, "hasPreviousClub", "hasPreviousClub(Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/results/team/squad/model/SquadPlayerInfo;)Z", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Team team = (Team) obj;
        n0i n0iVar = (n0i) obj2;
        team.getClass();
        n0iVar.getClass();
        return Boolean.valueOf((team.getNational() || n0iVar.b == null) ? false : true);
    }
}
