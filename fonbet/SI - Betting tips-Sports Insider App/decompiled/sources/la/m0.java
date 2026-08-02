package la;

import com.sports.insider.data.entity.prediction.Game;
import com.sports.insider.data.entity.prediction.LastGames;
import com.sports.insider.data.entity.prediction.Score;
import com.sports.insider.data.entity.prediction.Team;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m0 {
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(4:16|17|(1:19)(1:22)|(1:21))|11|12))|24|6|7|(0)(0)|11|12) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(m0 m0Var, int i5, String str, mf.c cVar) {
        l0 l0Var;
        int i10;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i11 = l0Var.f19543c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                l0Var.f19543c = i11 - Integer.MIN_VALUE;
                Object obj = l0Var.f19541a;
                Object obj2 = lf.a.f20034a;
                i10 = l0Var.f19543c;
                if (i10 != 0) {
                    h8.b.B(obj);
                    fb.b bVar = new fb.b();
                    l0Var.f19543c = 1;
                    lg.e eVar = eg.m0.f9201a;
                    Object A = eg.c0.A(lg.d.f20063c, new androidx.lifecycle.c(bVar, i5, str, (Continuation) null), l0Var);
                    if (A != obj2) {
                        A = Unit.f19194a;
                    }
                    if (A == obj2) {
                        return obj2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            }
        }
        l0Var = new l0(m0Var, cVar);
        Object obj3 = l0Var.f19541a;
        Object obj22 = lf.a.f20034a;
        i10 = l0Var.f19543c;
        if (i10 != 0) {
        }
        return Unit.f19194a;
    }

    public static Game c(a4.c cVar) {
        Score score;
        a4.e guestTeam = cVar.getGuestTeam();
        Team team = new Team(guestTeam.getScoreExtra(), guestTeam.getScore(), guestTeam.getFlag(), guestTeam.getId(), guestTeam.getName());
        a4.e homeTeam = cVar.getHomeTeam();
        Team team2 = new Team(homeTeam.getScoreExtra(), homeTeam.getScore(), homeTeam.getFlag(), homeTeam.getId(), homeTeam.getName());
        Score score2 = null;
        if (cVar.getHomeTeam().getScore() == null || cVar.getGuestTeam().getScore() == null) {
            score = null;
        } else {
            Integer score3 = cVar.getHomeTeam().getScore();
            Intrinsics.checkNotNull(score3);
            int intValue = score3.intValue();
            Integer score4 = cVar.getGuestTeam().getScore();
            Intrinsics.checkNotNull(score4);
            score = new Score(intValue, score4.intValue());
        }
        if (cVar.getHomeTeam().getScoreExtra() != null && cVar.getGuestTeam().getScoreExtra() != null) {
            Integer scoreExtra = cVar.getHomeTeam().getScoreExtra();
            Intrinsics.checkNotNull(scoreExtra);
            int intValue2 = scoreExtra.intValue();
            Integer scoreExtra2 = cVar.getGuestTeam().getScoreExtra();
            Intrinsics.checkNotNull(scoreExtra2);
            score2 = new Score(intValue2, scoreExtra2.intValue());
        }
        return new Game(team, team2, score, score2, ZonedDateTime.parse(cVar.getTime(), DateTimeFormatter.ISO_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toEpochSecond(), cVar.getTime(), cVar.getLeagueName());
    }

    public static LastGames d(a4.d dVar) {
        ArrayList arrayList;
        int draws = dVar.getDraws();
        List games = dVar.getGames();
        if (games != null) {
            arrayList = new ArrayList(kotlin.collections.v.k(games, 10));
            Iterator it = games.iterator();
            while (it.hasNext()) {
                arrayList.add(c((a4.c) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new LastGames(draws, arrayList, dVar.getLoses(), dVar.getWins());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(5:17|18|19|(2:21|(1:23))|24))(2:25|26))(3:33|34|(2:36|23))|27|(2:29|(2:31|23)(3:32|19|(0)))|24))|38|6|7|(0)(0)|27|(0)|24) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b A[Catch: Exception -> 0x00a7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a7, blocks: (B:12:0x002a, B:18:0x003a, B:19:0x0087, B:21:0x008b, B:26:0x0040, B:27:0x0060, B:29:0x0068, B:34:0x0047), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068 A[Catch: Exception -> 0x00a7, TryCatch #0 {Exception -> 0x00a7, blocks: (B:12:0x002a, B:18:0x003a, B:19:0x0087, B:21:0x008b, B:26:0x0040, B:27:0x0060, B:29:0x0068, B:34:0x0047), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lf.a b(int i5, mf.c cVar) {
        h0 h0Var;
        int i10;
        boolean booleanValue;
        int i11;
        boolean z5;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i12 = h0Var.f19481e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                h0Var.f19481e = i12 - Integer.MIN_VALUE;
                Object obj = h0Var.f19479c;
                lf.a aVar = lf.a.f20034a;
                i10 = h0Var.f19481e;
                int i13 = 2;
                int i14 = 1;
                Continuation continuation = null;
                if (i10 != 0) {
                    h8.b.B(obj);
                    fb.b bVar = new fb.b();
                    h0Var.f19477a = i5;
                    h0Var.f19481e = 1;
                    lg.e eVar = eg.m0.f9201a;
                    obj = eg.c0.A(lg.d.f20063c, new kb.b(bVar, i5, continuation, i13), h0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return null;
                        }
                        z5 = h0Var.f19478b;
                        i11 = h0Var.f19477a;
                        h8.b.B(obj);
                        if (((ja.a) obj) != null) {
                            fb.b bVar2 = new fb.b();
                            h0Var.f19477a = i11;
                            h0Var.f19478b = z5;
                            h0Var.f19481e = 3;
                            lg.e eVar2 = eg.m0.f9201a;
                            if (eg.c0.A(lg.d.f20063c, new kb.b(bVar2, i11, continuation, 7), h0Var) == aVar) {
                                return aVar;
                            }
                        }
                        return null;
                    }
                    i5 = h0Var.f19477a;
                    h8.b.B(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    fb.b bVar3 = new fb.b();
                    h0Var.f19477a = i5;
                    h0Var.f19478b = booleanValue;
                    h0Var.f19481e = 2;
                    lg.e eVar3 = eg.m0.f9201a;
                    Object A = eg.c0.A(lg.d.f20063c, new kb.b(bVar3, i5, continuation, i14), h0Var);
                    if (A == aVar) {
                        return aVar;
                    }
                    i11 = i5;
                    z5 = booleanValue;
                    obj = A;
                    if (((ja.a) obj) != null) {
                    }
                }
                return null;
            }
        }
        h0Var = new h0(this, cVar);
        Object obj2 = h0Var.f19479c;
        lf.a aVar2 = lf.a.f20034a;
        i10 = h0Var.f19481e;
        int i132 = 2;
        int i142 = 1;
        Continuation continuation2 = null;
        if (i10 != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i5, mf.c cVar) {
        i0 i0Var;
        int i10;
        String str;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i11 = i0Var.f19497d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i0Var.f19497d = i11 - Integer.MIN_VALUE;
                Object obj = i0Var.f19495b;
                lf.a aVar = lf.a.f20034a;
                i10 = i0Var.f19497d;
                int i12 = 1;
                Continuation continuation = null;
                if (i10 != 0) {
                    h8.b.B(obj);
                    fb.b bVar = new fb.b();
                    i0Var.f19494a = i5;
                    i0Var.f19497d = 1;
                    lg.e eVar = eg.m0.f9201a;
                    obj = eg.c0.A(lg.d.f20063c, new kb.b(bVar, i5, continuation, 3), i0Var);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    i5 = i0Var.f19494a;
                    h8.b.B(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return null;
                }
                i0Var.f19494a = i5;
                i0Var.f19497d = 2;
                Object A = eg.c0.A(eg.m0.f9201a, new hd.b(i12, str, continuation), i0Var);
                return A == aVar ? aVar : A;
            }
        }
        i0Var = new i0(this, cVar);
        Object obj2 = i0Var.f19495b;
        lf.a aVar2 = lf.a.f20034a;
        i10 = i0Var.f19497d;
        int i122 = 1;
        Continuation continuation2 = null;
        if (i10 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }
}
