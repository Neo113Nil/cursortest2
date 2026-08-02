package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.newNetwork.PlayerDetailsResponse;
import com.sofascore.model.newNetwork.PlayerEventsListResponse;
import com.sofascore.model.newNetwork.TeamSeasonPlacementResponse;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics;
import com.sofascore.model.notifications.NotificationData;
import com.sofascore.results.widget.SofaWidgetReceiver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class eqe extends hoi implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqe(String str, j0j j0jVar, int i, int i2, int i3, String str2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 3;
        this.y = str;
        this.z = j0jVar;
        this.t = i;
        this.u = i2;
        this.v = i3;
        this.B = str2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                eqe eqeVar = new eqe(this.t, this.u, this.v, rq3Var, (fqe) obj2);
                eqeVar.A = obj;
                return eqeVar;
            case 1:
                return new eqe((int[]) this.z, (Context) this.A, (SofaWidgetReceiver) obj2, rq3Var, 1);
            case 2:
                eqe eqeVar2 = new eqe((NotificationData) this.y, (vuh) this.z, (efd) obj2, rq3Var);
                eqeVar2.A = obj;
                return eqeVar2;
            case 3:
                eqe eqeVar3 = new eqe((String) this.y, (j0j) this.z, this.t, this.u, this.v, (String) obj2, rq3Var);
                eqeVar3.A = obj;
                return eqeVar3;
            default:
                return new eqe((okd[]) this.z, (i1k) this.A, (avj) obj2, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((eqe) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((eqe) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((eqe) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((eqe) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((eqe) create((mae) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x023a, code lost:
    
        if (r0 != r12) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03a5, code lost:
    
        if (r4 == r5) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        if (r9.f(r4, r3, r18) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r3 = r6;
        r6 = r4;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0116, code lost:
    
        if (r0 != r6) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0102, code lost:
    
        if (r2 == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0289, code lost:
    
        if (r0 != r12) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatisticsResponse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r8v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x0317 -> B:125:0x031c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0091 -> B:12:0x0092). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        zu4 t2;
        Object w;
        Object T;
        zu4 zu4Var;
        PlayerDetailsResponse playerDetailsResponse;
        Object T2;
        PlayerSeasonStatisticsResponse playerSeasonStatisticsResponse;
        PlayerEventsListResponse playerEventsListResponse;
        SofaWidgetReceiver sofaWidgetReceiver;
        int[] iArr;
        int length;
        int i;
        Context context;
        int i2;
        av4 t3;
        Object w2;
        int i3;
        int i4;
        av4 t4;
        Object w3;
        int i5;
        int i6;
        Bitmap f;
        Bitmap bitmap;
        Object T3;
        Bitmap bitmap2;
        Object T4;
        String str;
        av4 t5;
        TeamSeasonPlacementResponse teamSeasonPlacementResponse;
        Object w4;
        Object T5;
        Round round;
        okd[] okdVarArr;
        int length2;
        i1k i1kVar;
        avj avjVar;
        int i7;
        int i8 = this.r;
        int i9 = 3;
        Object obj2 = this.B;
        int i10 = 0;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        Bitmap x = null;
        switch (i8) {
            case 0:
                int i11 = this.t;
                fqe fqeVar = (fqe) obj2;
                ku3 ku3Var = (ku3) this.A;
                lu3 lu3Var = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    av4 t6 = xw3.t(ku3Var, null, new bqe(fqeVar, i11, r8, 2), 3);
                    t = xw3.t(ku3Var, null, new dqe(this.t, this.u, this.v, null, fqeVar), 3);
                    t2 = xw3.t(ku3Var, null, new bqe(fqeVar, i11, r8, i9), 3);
                    this.A = null;
                    this.w = t;
                    this.x = t2;
                    this.s = 1;
                    w = t6.w(this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            playerSeasonStatisticsResponse = (PlayerSeasonStatisticsResponse) this.z;
                            PlayerDetailsResponse playerDetailsResponse2 = (PlayerDetailsResponse) this.y;
                            y6a.M(obj);
                            playerDetailsResponse = playerDetailsResponse2;
                            T2 = obj;
                            playerEventsListResponse = (PlayerEventsListResponse) yaa.x((x2g) T2);
                            if (playerDetailsResponse != null && playerEventsListResponse != null) {
                                fqeVar.m.j(new qpe(i11, playerEventsListResponse, playerSeasonStatisticsResponse != null ? playerSeasonStatisticsResponse.getStatistics() : 0));
                            }
                            return Unit.a;
                        }
                        playerDetailsResponse = (PlayerDetailsResponse) this.y;
                        zu4Var = (zu4) this.x;
                        y6a.M(obj);
                        T = obj;
                        PlayerSeasonStatisticsResponse playerSeasonStatisticsResponse2 = (PlayerSeasonStatisticsResponse) T;
                        this.A = null;
                        this.w = null;
                        this.x = null;
                        this.y = playerDetailsResponse;
                        this.z = playerSeasonStatisticsResponse2;
                        this.s = 3;
                        T2 = zu4Var.T(this);
                        if (T2 != lu3Var) {
                            playerSeasonStatisticsResponse = playerSeasonStatisticsResponse2;
                            playerEventsListResponse = (PlayerEventsListResponse) yaa.x((x2g) T2);
                            if (playerDetailsResponse != null) {
                                fqeVar.m.j(new qpe(i11, playerEventsListResponse, playerSeasonStatisticsResponse != null ? playerSeasonStatisticsResponse.getStatistics() : 0));
                            }
                            return Unit.a;
                        }
                        return lu3Var;
                    }
                    t2 = (zu4) this.x;
                    av4 av4Var = (av4) this.w;
                    y6a.M(obj);
                    t = av4Var;
                    w = obj;
                }
                PlayerDetailsResponse playerDetailsResponse3 = (PlayerDetailsResponse) w;
                this.A = null;
                this.w = null;
                this.x = t2;
                this.y = playerDetailsResponse3;
                this.s = 2;
                T = t.T(this);
                if (T != lu3Var) {
                    zu4Var = t2;
                    playerDetailsResponse = playerDetailsResponse3;
                    PlayerSeasonStatisticsResponse playerSeasonStatisticsResponse22 = (PlayerSeasonStatisticsResponse) T;
                    this.A = null;
                    this.w = null;
                    this.x = null;
                    this.y = playerDetailsResponse;
                    this.z = playerSeasonStatisticsResponse22;
                    this.s = 3;
                    T2 = zu4Var.T(this);
                    if (T2 != lu3Var) {
                    }
                }
                return lu3Var;
            case 1:
                Context context2 = (Context) this.A;
                lu3 lu3Var2 = lu3.a;
                int i13 = this.v;
                if (i13 == 0) {
                    y6a.M(obj);
                    int[] iArr2 = (int[]) this.z;
                    sofaWidgetReceiver = (SofaWidgetReceiver) obj2;
                    iArr = iArr2;
                    length = iArr2.length;
                    i = 0;
                    context = context2;
                    if (i10 < length) {
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = this.u;
                    int i14 = this.t;
                    i = this.s;
                    Context context3 = (Context) this.y;
                    sofaWidgetReceiver = (SofaWidgetReceiver) this.x;
                    iArr = (int[]) this.w;
                    y6a.M(obj);
                    int i15 = 1;
                    Context context4 = context3;
                    i10 = i14 + i15;
                    context = context4;
                    if (i10 < length) {
                        int i16 = iArr[i10];
                        this.w = iArr;
                        this.x = sofaWidgetReceiver;
                        this.y = context;
                        this.s = i;
                        this.t = i10;
                        this.u = length;
                        i15 = 1;
                        this.v = 1;
                        int i17 = SofaWidgetReceiver.e;
                        if (sofaWidgetReceiver.c(context, i16, this) == lu3Var2) {
                            return lu3Var2;
                        }
                        int i18 = i10;
                        context3 = context;
                        i14 = i18;
                        Context context42 = context3;
                        i10 = i14 + i15;
                        context = context42;
                        if (i10 < length) {
                            aba.E(context2);
                            return Unit.a;
                        }
                    }
                }
            case 2:
                efd efdVar = (efd) obj2;
                NotificationData notificationData = (NotificationData) this.y;
                vuh vuhVar = (vuh) this.z;
                joa joaVar = vuhVar.c;
                ku3 ku3Var2 = (ku3) this.A;
                lu3 lu3Var3 = lu3.a;
                int i19 = this.v;
                if (i19 == 0) {
                    y6a.M(obj);
                    List<Integer> teams = notificationData.getTeams();
                    int playerId = notificationData.getPlayerId();
                    int forTeam = notificationData.getForTeam();
                    i2 = ((teams != null && teams.size() == 2) || playerId == 0 || forTeam == 0) ? 0 : 1;
                    if (i2 == 0 && (f = ((uhd) joaVar.getValue()).f(notificationData)) != null) {
                        vuhVar.b(efdVar, notificationData);
                        efdVar.f(f);
                        return Unit.a;
                    }
                    if (teams != null && teams.size() == 2) {
                        av4 t7 = xw3.t(ku3Var2, null, new ruh(vuhVar, teams, r8, i10), 3);
                        t4 = xw3.t(ku3Var2, null, new ruh(vuhVar, teams, r8, 1), 3);
                        this.A = null;
                        this.w = t4;
                        this.s = playerId;
                        this.t = forTeam;
                        this.u = i2;
                        this.v = 1;
                        w3 = t7.w(this);
                        if (w3 != lu3Var3) {
                            i5 = playerId;
                            i6 = forTeam;
                            bitmap = (Bitmap) w3;
                            this.A = null;
                            this.w = null;
                            this.x = bitmap;
                            this.s = i5;
                            this.t = i6;
                            this.u = i2;
                            this.v = 2;
                            T3 = t4.T(this);
                        }
                    } else if (playerId != 0 && forTeam != 0) {
                        av4 t8 = xw3.t(ku3Var2, null, new quh(vuhVar, playerId, r8, i10), 3);
                        t3 = xw3.t(ku3Var2, null, new quh(vuhVar, forTeam, r8, 1), 3);
                        this.A = null;
                        this.w = t3;
                        this.s = playerId;
                        this.t = forTeam;
                        this.u = i2;
                        this.v = 3;
                        w2 = t8.w(this);
                        if (w2 != lu3Var3) {
                            i3 = playerId;
                            i4 = forTeam;
                            bitmap2 = (Bitmap) w2;
                            this.A = null;
                            this.w = null;
                            this.x = bitmap2;
                            this.s = i3;
                            this.t = i4;
                            this.u = i2;
                            this.v = 4;
                            T4 = t3.T(this);
                        }
                    }
                    return lu3Var3;
                }
                if (i19 == 1) {
                    int i20 = this.u;
                    i6 = this.t;
                    i5 = this.s;
                    t4 = (av4) this.w;
                    y6a.M(obj);
                    i2 = i20;
                    w3 = obj;
                    bitmap = (Bitmap) w3;
                    this.A = null;
                    this.w = null;
                    this.x = bitmap;
                    this.s = i5;
                    this.t = i6;
                    this.u = i2;
                    this.v = 2;
                    T3 = t4.T(this);
                    break;
                } else if (i19 == 2) {
                    int i21 = this.u;
                    Bitmap bitmap3 = (Bitmap) this.x;
                    y6a.M(obj);
                    i2 = i21;
                    bitmap = bitmap3;
                    T3 = obj;
                    Bitmap bitmap4 = (Bitmap) T3;
                    if (bitmap != null && bitmap4 != null) {
                        x = oyn.x(bitmap, bitmap4);
                    }
                } else if (i19 == 3) {
                    int i22 = this.u;
                    i4 = this.t;
                    i3 = this.s;
                    t3 = (av4) this.w;
                    y6a.M(obj);
                    i2 = i22;
                    w2 = obj;
                    bitmap2 = (Bitmap) w2;
                    this.A = null;
                    this.w = null;
                    this.x = bitmap2;
                    this.s = i3;
                    this.t = i4;
                    this.u = i2;
                    this.v = 4;
                    T4 = t3.T(this);
                    break;
                } else {
                    if (i19 != 4) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i23 = this.u;
                    Bitmap bitmap5 = (Bitmap) this.x;
                    y6a.M(obj);
                    i2 = i23;
                    bitmap2 = bitmap5;
                    T4 = obj;
                    Bitmap bitmap6 = (Bitmap) T4;
                    if (bitmap2 != null && bitmap6 != null) {
                        x = oyn.x(bitmap2, bitmap6);
                    }
                }
                if (x == null) {
                    return Unit.a;
                }
                Bitmap P = oyn.P(x, ao2.s(32, vuhVar.b));
                if (i2 == 0) {
                    uhd uhdVar = (uhd) joaVar.getValue();
                    uhdVar.getClass();
                    uhdVar.e(P, uhd.g(notificationData));
                }
                vuhVar.b(efdVar, notificationData);
                efdVar.f(P);
                return Unit.a;
            case 3:
                j0j j0jVar = (j0j) this.z;
                ku3 ku3Var3 = (ku3) this.A;
                lu3 lu3Var4 = lu3.a;
                int i24 = this.s;
                rq3 rq3Var = null;
                if (i24 == 0) {
                    y6a.M(obj);
                    str = null;
                    av4 p = yaa.p(ku3Var3, Intrinsics.c((String) this.y, Sports.TENNIS), new du1(j0jVar, this.t, this.u, rq3Var, 7));
                    t5 = xw3.t(ku3Var3, null, new fva(j0jVar, this.t, this.v, this.u, (String) obj2, null), 3);
                    if (p == null) {
                        teamSeasonPlacementResponse = null;
                        this.A = str;
                        this.w = str;
                        this.x = teamSeasonPlacementResponse;
                        this.s = 2;
                        T5 = t5.T(this);
                        break;
                    } else {
                        this.A = null;
                        this.w = t5;
                        this.s = 1;
                        w4 = p.w(this);
                        break;
                    }
                } else {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        TeamSeasonPlacementResponse teamSeasonPlacementResponse2 = (TeamSeasonPlacementResponse) this.x;
                        y6a.M(obj);
                        str = null;
                        teamSeasonPlacementResponse = teamSeasonPlacementResponse2;
                        T5 = obj;
                        ?? r0 = (TeamSeasonStatisticsResponse) T5;
                        String name = (teamSeasonPlacementResponse == null || (round = teamSeasonPlacementResponse.getRound()) == null) ? str : round.getName();
                        ?? valueOf = teamSeasonPlacementResponse != null ? Boolean.valueOf(teamSeasonPlacementResponse.getWinner()) : str;
                        if (r0 != 0 && name != null && valueOf != 0) {
                            Object statistics = r0.getStatistics();
                            ?? r2 = statistics instanceof TennisTeamSeasonStatistics ? (TennisTeamSeasonStatistics) statistics : str;
                            if (r2 != 0) {
                                r2.setPlacementRoundName(name);
                                r2.setPlacementIsWinner(valueOf);
                            }
                            str = r0;
                        }
                        return str == null ? r0 : str;
                    }
                    t5 = (av4) this.w;
                    y6a.M(obj);
                    w4 = obj;
                    str = null;
                }
                teamSeasonPlacementResponse = (TeamSeasonPlacementResponse) w4;
                this.A = str;
                this.w = str;
                this.x = teamSeasonPlacementResponse;
                this.s = 2;
                T5 = t5.T(this);
                break;
            default:
                lu3 lu3Var5 = lu3.a;
                int i25 = this.v;
                if (i25 == 0) {
                    y6a.M(obj);
                    okd[] okdVarArr2 = (okd[]) this.z;
                    i1k i1kVar2 = (i1k) this.A;
                    okdVarArr = okdVarArr2;
                    length2 = okdVarArr2.length;
                    i1kVar = i1kVar2;
                    avjVar = (avj) obj2;
                    i7 = 0;
                    if (i10 >= length2) {
                    }
                } else {
                    if (i25 != 1 && i25 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length2 = this.u;
                    int i26 = this.t;
                    int i27 = this.s;
                    avj avjVar2 = (avj) this.y;
                    i1kVar = (i1k) this.x;
                    okdVarArr = (okd[]) this.w;
                    y6a.M(obj);
                    avj avjVar3 = avjVar2;
                    i10 = i26;
                    i7 = i27;
                    avjVar = avjVar3;
                    i10++;
                    if (i10 >= length2) {
                        int i28 = i7 + 1;
                        int ordinal = okdVarArr[i10].ordinal();
                        if (ordinal == 0) {
                            i7 = i28;
                            i10++;
                            if (i10 >= length2) {
                                return Unit.a;
                            }
                        } else {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    zzl.b();
                                    return null;
                                }
                                this.w = okdVarArr;
                                this.x = i1kVar;
                                this.y = avjVar;
                                this.s = i28;
                                this.t = i10;
                                this.u = length2;
                                this.v = 2;
                                if (i1kVar.g(avjVar, i7, this) != lu3Var5) {
                                    i26 = i10;
                                    avjVar2 = avjVar;
                                    i27 = i28;
                                    avj avjVar32 = avjVar2;
                                    i10 = i26;
                                    i7 = i27;
                                    avjVar = avjVar32;
                                }
                                return lu3Var5;
                            }
                            this.w = okdVarArr;
                            this.x = i1kVar;
                            this.y = avjVar;
                            this.s = i28;
                            this.t = i10;
                            this.u = length2;
                            this.v = 1;
                            break;
                            i10++;
                            if (i10 >= length2) {
                            }
                        }
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqe(NotificationData notificationData, vuh vuhVar, efd efdVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.y = notificationData;
        this.z = vuhVar;
        this.B = efdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eqe(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqe(int i, int i2, int i3, rq3 rq3Var, fqe fqeVar) {
        super(2, rq3Var);
        this.r = 0;
        this.B = fqeVar;
        this.t = i;
        this.u = i2;
        this.v = i3;
    }
}
