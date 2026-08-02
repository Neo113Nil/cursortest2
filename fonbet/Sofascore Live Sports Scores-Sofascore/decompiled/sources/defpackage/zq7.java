package defpackage;

import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import java.util.HashSet;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class zq7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HashSet b;

    public /* synthetic */ zq7(HashSet hashSet, int i) {
        this.a = i;
        this.b = hashSet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean contains;
        int i = this.a;
        HashSet hashSet = this.b;
        switch (i) {
            case 0:
                Team team = (Team) obj;
                team.getClass();
                contains = hashSet.contains(Integer.valueOf(team.getId()));
                break;
            case 1:
                contains = hashSet.contains(Integer.valueOf(((Team) obj).getId()));
                break;
            default:
                contains = hashSet.contains(Integer.valueOf(((UniqueTournament) obj).getId()));
                break;
        }
        return Boolean.valueOf(contains);
    }
}
