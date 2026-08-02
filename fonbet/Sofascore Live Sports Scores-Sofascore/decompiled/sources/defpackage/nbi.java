package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.sofascore.model.mvvm.model.StandingsTable;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.StandingsResponse;
import com.sofascore.results.fantasy.weekly.FantasyEliteFaceoffRevealDialog;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nbi extends hoi implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int r;
    public Object s;
    public int t;
    public int u;
    public int v;
    public final /* synthetic */ Object w;
    public int x;
    public int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nbi(rbi rbiVar, int i, int i2, Integer num, av4 av4Var, rq3 rq3Var, int i3) {
        super(2, rq3Var);
        this.r = i3;
        this.w = rbiVar;
        this.x = i;
        this.y = i2;
        this.z = num;
        this.A = av4Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                return new nbi((rbi) obj4, this.x, this.y, (Integer) obj3, (av4) obj2, rq3Var, 0);
            case 1:
                return new nbi((rbi) obj4, this.x, this.y, (Integer) obj3, (av4) obj2, rq3Var, 1);
            default:
                return new nbi((FantasyEliteFaceoffRevealDialog) obj4, (SnapshotStateList) obj3, (e1d) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((nbi) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x009e -> B:8:0x009f). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Integer num;
        int i2;
        int i3;
        int i4;
        rbi rbiVar;
        Object r;
        List<StandingsTable> standings;
        StandingsTable standingsTable;
        Team team;
        int i5;
        Integer num2;
        int i6;
        int i7;
        int i8;
        rbi rbiVar2;
        Object r2;
        List<StandingsTable> standings2;
        StandingsTable standingsTable2;
        Team team2;
        int size;
        SnapshotStateList snapshotStateList;
        int i9;
        int i10;
        int i11;
        SnapshotStateList snapshotStateList2;
        int i12;
        int i13 = this.r;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.w;
        switch (i13) {
            case 0:
                rbi rbiVar3 = (rbi) obj4;
                lu3 lu3Var = lu3.a;
                int i14 = this.v;
                if (i14 == 0) {
                    y6a.M(obj);
                    int i15 = this.x;
                    int i16 = this.y;
                    Integer num3 = (Integer) obj3;
                    if (num3 == null) {
                        this.s = rbiVar3;
                        this.t = i15;
                        this.u = i16;
                        this.v = 1;
                        Object w = ((av4) obj2).w(this);
                        if (w != lu3Var) {
                            i3 = i15;
                            obj = w;
                            i4 = i16;
                        }
                        return lu3Var;
                    }
                    i = i15;
                    num = num3;
                    i2 = i16;
                    rbiVar = rbiVar3;
                    this.s = null;
                    this.v = 2;
                    rbiVar.getClass();
                    r = s9a.r(new lbi(num, rbiVar, i, i2, (rq3) null), this);
                    if (r != lu3Var) {
                        return r;
                    }
                    return lu3Var;
                }
                if (i14 != 1) {
                    if (i14 == 2) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i4 = this.u;
                i3 = this.t;
                rbiVar3 = (rbi) this.s;
                y6a.M(obj);
                StandingsResponse standingsResponse = (StandingsResponse) obj;
                if (standingsResponse == null || (standings = standingsResponse.getStandings()) == null || (standingsTable = (StandingsTable) CollectionsKt.firstOrNull(standings)) == null) {
                    i2 = i4;
                    i = i3;
                    rbiVar = rbiVar3;
                    num = null;
                    this.s = null;
                    this.v = 2;
                    rbiVar.getClass();
                    r = s9a.r(new lbi(num, rbiVar, i, i2, (rq3) null), this);
                    if (r != lu3Var) {
                    }
                    return lu3Var;
                }
                StandingsTableRow standingsTableRow = (StandingsTableRow) CollectionsKt.firstOrNull(standingsTable.getRows());
                num = (standingsTableRow == null || (team = standingsTableRow.getTeam()) == null) ? null : Integer.valueOf(team.getId());
                i2 = i4;
                i = i3;
                rbiVar = rbiVar3;
                this.s = null;
                this.v = 2;
                rbiVar.getClass();
                r = s9a.r(new lbi(num, rbiVar, i, i2, (rq3) null), this);
                if (r != lu3Var) {
                }
                return lu3Var;
            case 1:
                rbi rbiVar4 = (rbi) obj4;
                lu3 lu3Var2 = lu3.a;
                int i17 = this.v;
                if (i17 == 0) {
                    y6a.M(obj);
                    int i18 = this.x;
                    int i19 = this.y;
                    Integer num4 = (Integer) obj3;
                    if (num4 == null) {
                        this.s = rbiVar4;
                        this.t = i18;
                        this.u = i19;
                        this.v = 1;
                        Object w2 = ((av4) obj2).w(this);
                        if (w2 != lu3Var2) {
                            i7 = i18;
                            obj = w2;
                            i8 = i19;
                        }
                        return lu3Var2;
                    }
                    i5 = i18;
                    num2 = num4;
                    i6 = i19;
                    rbiVar2 = rbiVar4;
                    this.s = null;
                    this.v = 2;
                    rbiVar2.getClass();
                    r2 = s9a.r(new lbi(num2, rbiVar2, i5, i6, (rq3) null), this);
                    if (r2 != lu3Var2) {
                        return r2;
                    }
                    return lu3Var2;
                }
                if (i17 != 1) {
                    if (i17 == 2) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i8 = this.u;
                i7 = this.t;
                rbiVar4 = (rbi) this.s;
                y6a.M(obj);
                StandingsResponse standingsResponse2 = (StandingsResponse) obj;
                if (standingsResponse2 == null || (standings2 = standingsResponse2.getStandings()) == null || (standingsTable2 = (StandingsTable) CollectionsKt.firstOrNull(standings2)) == null) {
                    i6 = i8;
                    i5 = i7;
                    rbiVar2 = rbiVar4;
                    num2 = null;
                    this.s = null;
                    this.v = 2;
                    rbiVar2.getClass();
                    r2 = s9a.r(new lbi(num2, rbiVar2, i5, i6, (rq3) null), this);
                    if (r2 != lu3Var2) {
                    }
                    return lu3Var2;
                }
                StandingsTableRow standingsTableRow2 = (StandingsTableRow) CollectionsKt.firstOrNull(standingsTable2.getRows());
                num2 = (standingsTableRow2 == null || (team2 = standingsTableRow2.getTeam()) == null) ? null : Integer.valueOf(team2.getId());
                i6 = i8;
                i5 = i7;
                rbiVar2 = rbiVar4;
                this.s = null;
                this.v = 2;
                rbiVar2.getClass();
                r2 = s9a.r(new lbi(num2, rbiVar2, i5, i6, (rq3) null), this);
                if (r2 != lu3Var2) {
                }
                return lu3Var2;
            default:
                FantasyEliteFaceoffRevealDialog fantasyEliteFaceoffRevealDialog = (FantasyEliteFaceoffRevealDialog) obj4;
                lu3 lu3Var3 = lu3.a;
                int i20 = this.y;
                if (i20 == 0) {
                    y6a.M(obj);
                    if (!fantasyEliteFaceoffRevealDialog.v().k().a.isEmpty()) {
                        size = fantasyEliteFaceoffRevealDialog.v().k().a.size();
                        snapshotStateList = (SnapshotStateList) obj3;
                        i9 = 0;
                        if (i9 < size) {
                        }
                    }
                    return Unit.a;
                }
                if (i20 == 1) {
                    int i21 = this.x;
                    i9 = this.v;
                    int i22 = this.u;
                    i11 = this.t;
                    SnapshotStateList snapshotStateList3 = (SnapshotStateList) this.s;
                    y6a.M(obj);
                    i10 = i21;
                    i12 = i22;
                    snapshotStateList2 = snapshotStateList3;
                    snapshotStateList2.add(new Integer(i9));
                    this.s = snapshotStateList2;
                    this.t = i11;
                    this.u = i12;
                    this.v = i9;
                    this.x = i10;
                    this.y = 2;
                    if (n4o.y(400L, this) != lu3Var3) {
                    }
                    return lu3Var3;
                }
                if (i20 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i12 = this.u;
                int i23 = this.t;
                snapshotStateList2 = (SnapshotStateList) this.s;
                y6a.M(obj);
                size = i23;
                i9 = i12 + 1;
                snapshotStateList = snapshotStateList2;
                if (i9 < size) {
                    this.s = snapshotStateList;
                    this.t = size;
                    this.u = i9;
                    this.v = i9;
                    this.x = 0;
                    this.y = 1;
                    if (n4o.y(400L, this) != lu3Var3) {
                        i11 = size;
                        snapshotStateList2 = snapshotStateList;
                        i12 = i9;
                        i10 = 0;
                        snapshotStateList2.add(new Integer(i9));
                        this.s = snapshotStateList2;
                        this.t = i11;
                        this.u = i12;
                        this.v = i9;
                        this.x = i10;
                        this.y = 2;
                        if (n4o.y(400L, this) != lu3Var3) {
                            size = i11;
                            i9 = i12 + 1;
                            snapshotStateList = snapshotStateList2;
                            if (i9 < size) {
                                ((e1d) obj2).setValue(Boolean.TRUE);
                                return Unit.a;
                            }
                        }
                    }
                    return lu3Var3;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbi(FantasyEliteFaceoffRevealDialog fantasyEliteFaceoffRevealDialog, SnapshotStateList snapshotStateList, e1d e1dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.w = fantasyEliteFaceoffRevealDialog;
        this.z = snapshotStateList;
        this.A = e1dVar;
    }
}
