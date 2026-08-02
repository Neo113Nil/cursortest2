package defpackage;

import android.content.Context;
import com.sofascore.results.league.fragment.standings.LeagueStandingsFragment;
import com.sofascore.results.main.fantasy.MainFantasyFragment;
import com.sofascore.results.main.matches.redesign.MatchesRootFragment;
import com.sofascore.results.main.matches.redesign.datematches.MainMatchesFragment;
import com.sofascore.results.main.matches.redesign.livematches.LiveMatchesFragment;
import com.sofascore.results.mma.mainScreen.MmaEventsFragment;
import com.sofascore.results.profile.LoginScreenActivity;
import com.sofascore.results.profile.predictions.ProfilePredictionsFragment;
import com.sofascore.results.view.graph.networkanimation.PassingNetworkAnimationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ppa extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ppa(Object obj, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = obj;
        this.s = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                return new ppa((qpa) obj2, this.s, rq3Var, 0);
            case 1:
                return new ppa((wj9) obj2, rq3Var, 1);
            case 2:
                return new ppa((LeagueStandingsFragment) obj2, rq3Var, 2);
            case 3:
                return new ppa((LiveMatchesFragment) obj2, rq3Var, 3);
            case 4:
                return new ppa((xeb) obj2, rq3Var, 4);
            case 5:
                return new ppa((LoginScreenActivity) obj2, rq3Var, 5);
            case 6:
                return new ppa((eob) obj2, rq3Var, 6);
            case 7:
                return new ppa((MainFantasyFragment) obj2, rq3Var, 7);
            case 8:
                return new ppa((MainMatchesFragment) obj2, rq3Var, 8);
            case 9:
                return new ppa((gvb) obj2, rq3Var, 9);
            case 10:
                return new ppa((dyb) obj2, rq3Var, 10);
            case 11:
                return new ppa((MatchesRootFragment) obj2, rq3Var, 11);
            case 12:
                return new ppa((r1c) obj2, rq3Var, 12);
            case 13:
                return new ppa((nlc) obj2, rq3Var, 13);
            case 14:
                return new ppa((MmaEventsFragment) obj2, rq3Var, 14);
            case 15:
                return new ppa((nmc) obj2, rq3Var, 15);
            case 16:
                return new ppa((cnc) obj2, rq3Var, 16);
            case 17:
                return new ppa((qsc) obj2, rq3Var, 17);
            case 18:
                return new ppa((qwc) obj2, rq3Var, 18);
            case 19:
                return new ppa((Context) obj2, rq3Var, 19);
            case 20:
                return new ppa((zqd) obj2, rq3Var, 20);
            case 21:
                return new ppa((b1e) obj2, rq3Var, 21);
            case 22:
                return new ppa((PassingNetworkAnimationView) obj2, rq3Var, 22);
            case 23:
                return new ppa((zje) obj2, rq3Var, 23);
            case 24:
                return new ppa((jre) obj2, rq3Var, 24);
            case 25:
                return new ppa((ProfilePredictionsFragment) obj2, rq3Var, 25);
            case 26:
                return new ppa((ebf) obj2, rq3Var, 26);
            case 27:
                return new ppa((ybf) obj2, rq3Var, 27);
            case 28:
                return new ppa((koh) obj2, rq3Var, 28);
            default:
                return new ppa((snf) obj2, this.s, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 4:
                ((ppa) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 6:
                ((ppa) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 11:
                ((ppa) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((ppa) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:422:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x06fb  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String, rq3] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:352:0x06f9 -> B:345:0x06ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:354:0x0708 -> B:343:0x070c). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 2366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ppa(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
    }
}
