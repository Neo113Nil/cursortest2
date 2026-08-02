package me;

import com.sports.insider.data.entity.prediction.Game;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20681b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gf.u f20682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(gf.u uVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20681b = i5;
        this.f20682c = uVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20681b) {
            case 0:
                return new u(this.f20682c, continuation, 0);
            case 1:
                return new u(this.f20682c, continuation, 1);
            default:
                return new u(this.f20682c, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20681b) {
        }
        return ((u) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f20681b;
        gf.u uVar = this.f20682c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                List<Game> list = (List) uVar.f10041c;
                if (list != null) {
                    for (Game game : list) {
                        String flag = game.m94getHomeTeam().getFlag();
                        if (flag != null) {
                            linkedHashSet.add(flag);
                        }
                        String flag2 = game.m93getGuestTeam().getFlag();
                        if (flag2 != null) {
                            linkedHashSet.add(flag2);
                        }
                    }
                }
                return linkedHashSet;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                List<Game> list2 = (List) uVar.f10040b;
                if (list2 != null) {
                    for (Game game2 : list2) {
                        String flag3 = game2.m94getHomeTeam().getFlag();
                        if (flag3 != null) {
                            linkedHashSet2.add(flag3);
                        }
                        String flag4 = game2.m93getGuestTeam().getFlag();
                        if (flag4 != null) {
                            linkedHashSet2.add(flag4);
                        }
                    }
                }
                return linkedHashSet2;
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                List<Game> list3 = (List) uVar.f10039a;
                if (list3 != null) {
                    for (Game game3 : list3) {
                        String flag5 = game3.m94getHomeTeam().getFlag();
                        if (flag5 != null) {
                            linkedHashSet3.add(flag5);
                        }
                        String flag6 = game3.m93getGuestTeam().getFlag();
                        if (flag6 != null) {
                            linkedHashSet3.add(flag6);
                        }
                    }
                }
                return linkedHashSet3;
        }
    }
}
