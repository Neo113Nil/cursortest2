package defpackage;

import android.content.res.Resources;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.fantasy.FantasySquadResponse;
import com.sofascore.model.fantasy.FantasyUserSquad;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ej extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ej(Object obj, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.s = obj;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.s;
        switch (i) {
            case 0:
                return new ej((ij) obj, rq3Var, 0);
            case 1:
                return new ej((q50) obj, rq3Var, 1);
            case 2:
                return new ej((d92) obj, rq3Var, 2);
            case 3:
                return new ej((xs5) obj, rq3Var, 3);
            case 4:
                return new ej((l66) obj, rq3Var, 4);
            case 5:
                return new ej((pu6) obj, rq3Var, 5);
            case 6:
                return new ej((Function0) obj, rq3Var, 6);
            case 7:
                return new ej((p6j) obj, rq3Var, 7);
            case 8:
                return new ej((r9j) obj, rq3Var, 8);
            default:
                return new ej((qkl) obj, rq3Var, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((ej) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        FantasyUserSquad squad;
        List<FantasyRoundPlayer> players;
        int i = this.r;
        Object obj2 = 0;
        obj2 = 0;
        obj2 = 0;
        Object obj3 = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                ij ijVar = (ij) obj3;
                ijVar.getClass();
                xw3.L(un0.z(ijVar), null, null, new hj(ijVar, (rq3) obj2, 0), 3);
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                ((q50) obj3).c();
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                d92 d92Var = (d92) obj3;
                p82 p82Var = d92Var.f;
                if (p82Var == null) {
                    Intrinsics.i("buzzerAdapter");
                    throw null;
                }
                if (p82Var.getItemCount() > 0) {
                    q82 buzzerTracker = d92Var.getBuzzerTracker();
                    if (buzzerTracker != null) {
                        buzzerTracker.e();
                    }
                    q82 buzzerTracker2 = d92Var.getBuzzerTracker();
                    if (buzzerTracker2 != null) {
                        buzzerTracker2.d();
                    }
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                xs5 xs5Var = (xs5) obj3;
                Event event = xs5Var.s;
                if (event != null) {
                    xs5Var.u(event);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                l66 l66Var = (l66) obj3;
                l66Var.getClass();
                xw3.L(un0.z(l66Var), null, null, new h10(l66Var, obj2, 7), 3);
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                pu6 pu6Var = (pu6) obj3;
                Resources resources = pu6Var.i().getResources();
                resources.getClass();
                InputStream openRawResource = resources.openRawResource(R.raw.fantasy_squad_mock);
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(openRawResource);
                    try {
                        bga bgaVar = vga.a;
                        String E = d7a.E(inputStreamReader);
                        bgaVar.getClass();
                        Object b = bgaVar.b(FantasySquadResponse.INSTANCE.serializer(), E);
                        inputStreamReader.close();
                        n4o.x(openRawResource, null);
                        FantasySquadResponse fantasySquadResponse = (FantasySquadResponse) b;
                        if (fantasySquadResponse != null && (squad = fantasySquadResponse.getSquad()) != null && (players = squad.getPlayers()) != null) {
                            obj2 = new ArrayList(k13.r(players, 10));
                            Iterator<T> it = players.iterator();
                            while (it.hasNext()) {
                                obj2.add(hkg.g0((FantasyRoundPlayer) it.next(), pu6Var.i()));
                            }
                        }
                        return obj2;
                    } finally {
                    }
                } finally {
                }
            case 6:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                return ((Function0) obj3).invoke();
            case 7:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                p6j p6jVar = (p6j) obj3;
                Event event2 = p6jVar.f;
                if (event2 != null) {
                    p6jVar.setMatchTime(event2);
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                ((eoh) ((r9j) obj3).u.t).setValue(Boolean.FALSE);
                return Unit.a;
            default:
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                qkl qklVar = (qkl) obj3;
                g9i g9iVar = qklVar.S;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                qklVar.S = xw3.L(un0.z(qklVar), null, null, new ekl(qklVar, null), 3);
                return Unit.a;
        }
    }
}
