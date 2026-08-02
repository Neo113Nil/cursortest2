package defpackage;

import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.TournamentResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bnc extends hoi implements Function2 {
    public final /* synthetic */ cnc A;
    public final /* synthetic */ int B;
    public Tournament r;
    public av4 s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnc(cnc cncVar, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.A = cncVar;
        this.B = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        bnc bncVar = new bnc(this.A, this.B, rq3Var);
        bncVar.z = obj;
        return bncVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bnc) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x005b, code lost:
    
        if (r3 == r2) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0116  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object j0;
        Tournament tournament;
        boolean z;
        int i;
        Object u;
        av4 av4Var;
        int i2;
        List list;
        boolean c;
        boolean c2;
        int i3;
        Object T;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        ku3 ku3Var = (ku3) this.z;
        lu3 lu3Var = lu3.a;
        int i5 = this.y;
        int i6 = this.B;
        cnc cncVar = this.A;
        rq3 rq3Var = null;
        if (i5 == 0) {
            y6a.M(obj);
            w3b w3bVar = cncVar.e;
            this.z = ku3Var;
            this.y = 1;
            j0 = w3bVar.j0(i6, this);
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = this.u;
                    z2 = this.x;
                    boolean z5 = this.w;
                    c = this.v;
                    Tournament tournament2 = this.r;
                    y6a.M(obj);
                    c2 = z5;
                    z = true;
                    i = 0;
                    tournament = tournament2;
                    T = obj;
                    i3 = i4;
                    z3 = z2;
                    z4 = ((Boolean) T).booleanValue();
                    cncVar.g.j(new xmc(tournament, c, c2, z3, z4));
                    cncVar.m = (i3 == 0 || z4 != 0) ? z : i;
                    cncVar.l = z;
                    return Unit.a;
                }
                i2 = this.t;
                av4 av4Var2 = this.s;
                Tournament tournament3 = this.r;
                y6a.M(obj);
                z = true;
                i = 0;
                u = obj;
                av4Var = av4Var2;
                tournament = tournament3;
                list = (List) u;
                Boolean bool = (Boolean) CollectionsKt.a0(i, list);
                Boolean bool2 = Boolean.TRUE;
                c = Intrinsics.c(bool, bool2);
                c2 = Intrinsics.c((Boolean) CollectionsKt.a0(z ? 1 : 0, list), bool2);
                boolean c3 = Intrinsics.c((Boolean) CollectionsKt.a0(2, list), bool2);
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) it.next()).booleanValue()) {
                            i3 = z ? 1 : 0;
                            break;
                        }
                    }
                }
                i3 = i;
                if (i3 == 0) {
                    z3 = c3;
                    z4 = i;
                    cncVar.g.j(new xmc(tournament, c, c2, z3, z4));
                    cncVar.m = (i3 == 0 || z4 != 0) ? z : i;
                    cncVar.l = z;
                    return Unit.a;
                }
                this.z = null;
                this.r = tournament;
                this.s = null;
                this.t = i2;
                this.v = c;
                this.w = c2;
                this.x = c3;
                this.u = i3;
                this.y = 3;
                T = av4Var.T(this);
                if (T != lu3Var) {
                    i4 = i3;
                    z2 = c3;
                    i3 = i4;
                    z3 = z2;
                    z4 = ((Boolean) T).booleanValue();
                    cncVar.g.j(new xmc(tournament, c, c2, z3, z4));
                    cncVar.m = (i3 == 0 || z4 != 0) ? z : i;
                    cncVar.l = z;
                    return Unit.a;
                }
                return lu3Var;
            }
            y6a.M(obj);
            j0 = obj;
        }
        TournamentResponse tournamentResponse = (TournamentResponse) j0;
        tournament = tournamentResponse != null ? tournamentResponse.getTournament() : null;
        if (tournament != null) {
            cncVar.k = tournament.getUniqueTournament();
            if (cncVar.l && !cncVar.m) {
                cncVar.l = false;
                UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                int id = uniqueTournament != null ? uniqueTournament.getId() : 0;
                g08[] values = g08.values();
                ArrayList arrayList = new ArrayList(values.length);
                int length = values.length;
                int i7 = 0;
                while (i7 < length) {
                    ArrayList arrayList2 = arrayList;
                    int i8 = length;
                    cnc cncVar2 = cncVar;
                    arrayList2.add(xw3.t(ku3Var, null, new gz6(cncVar2, id, this.B, values[i7], (rq3) null, 6), 3));
                    i7++;
                    arrayList = arrayList2;
                    cncVar = cncVar2;
                    length = i8;
                }
                cnc cncVar3 = cncVar;
                ArrayList arrayList3 = arrayList;
                z = true;
                int i9 = id;
                cncVar = cncVar3;
                i = 0;
                av4 t = xw3.t(ku3Var, null, new du1(cncVar, i9, i6, rq3Var, 6), 3);
                this.z = null;
                this.r = tournament;
                this.s = t;
                this.t = i9;
                this.y = 2;
                u = m6k.u(arrayList3, this);
                if (u != lu3Var) {
                    av4Var = t;
                    i2 = i9;
                    list = (List) u;
                    Boolean bool3 = (Boolean) CollectionsKt.a0(i, list);
                    Boolean bool22 = Boolean.TRUE;
                    c = Intrinsics.c(bool3, bool22);
                    c2 = Intrinsics.c((Boolean) CollectionsKt.a0(z ? 1 : 0, list), bool22);
                    boolean c32 = Intrinsics.c((Boolean) CollectionsKt.a0(2, list), bool22);
                    if (!list.isEmpty()) {
                    }
                    i3 = i;
                    if (i3 == 0) {
                    }
                }
                return lu3Var;
            }
        }
        return Unit.a;
    }
}
