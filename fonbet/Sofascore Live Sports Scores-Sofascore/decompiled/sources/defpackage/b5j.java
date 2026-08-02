package defpackage;

import com.sofascore.model.newNetwork.EventIdsResponse;
import com.sofascore.results.team.TeamWorker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b5j extends hoi implements Function2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ TeamWorker C;
    public final /* synthetic */ int D;
    public final /* synthetic */ boolean E;
    public TeamWorker r;
    public Collection s;
    public Iterator t;
    public Object u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5j(TeamWorker teamWorker, int i, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.C = teamWorker;
        this.D = i;
        this.E = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        b5j b5jVar = new b5j(this.C, this.D, this.E, rq3Var);
        b5jVar.B = obj;
        return b5jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b5j) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x019f, code lost:
    
        if (r9.f(r16.E, r16) == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0191, code lost:
    
        if (defpackage.m6k.u(r3, r16) == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0090, code lost:
    
        if (r3 == r2) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0124 -> B:19:0x0126). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object P;
        List<Integer> eventIds;
        ArrayList arrayList;
        Iterator it;
        TeamWorker teamWorker;
        int i;
        int i2;
        int i3;
        Object obj2;
        int i4;
        int i5;
        int i6;
        Object obj3;
        ArrayList arrayList2;
        TeamWorker teamWorker2;
        Iterator it2;
        int i7;
        int i8;
        boolean z;
        TeamWorker teamWorker3;
        ku3 ku3Var = (ku3) this.B;
        lu3 lu3Var = lu3.a;
        int i9 = this.A;
        int i10 = this.D;
        TeamWorker teamWorker4 = this.C;
        rq3 rq3Var = null;
        if (i9 == 0) {
            y6a.M(obj);
            j0j j0jVar = teamWorker4.b;
            this.B = ku3Var;
            this.A = 1;
            j0jVar.getClass();
            P = yaa.P(new azi(j0jVar, i10, rq3Var, 9), this);
        } else if (i9 == 1) {
            y6a.M(obj);
            P = obj;
        } else if (i9 == 2) {
            int i11 = this.z;
            int i12 = this.y;
            int i13 = this.x;
            int i14 = this.w;
            int i15 = this.v;
            Object obj4 = this.u;
            Iterator it3 = this.t;
            Collection collection = this.s;
            TeamWorker teamWorker5 = this.r;
            y6a.M(obj);
            i5 = i14;
            teamWorker2 = teamWorker5;
            i6 = i15;
            obj3 = obj4;
            i4 = i12;
            i7 = i11;
            i8 = i13;
            it2 = it3;
            obj2 = obj;
            arrayList2 = collection;
            if (((Boolean) obj2).booleanValue()) {
            }
        } else {
            if (i9 == 3) {
                i8 = this.x;
                i5 = this.w;
                int i16 = this.v;
                Object obj5 = this.u;
                Iterator it4 = this.t;
                Collection collection2 = this.s;
                teamWorker2 = this.r;
                y6a.M(obj);
                arrayList2 = collection2;
                it2 = it4;
                Object y = obj;
                if (((Boolean) y).booleanValue()) {
                    i3 = i8;
                    it = it2;
                    teamWorker = teamWorker2;
                    i = i16;
                    obj5 = obj5;
                    z = false;
                } else {
                    i3 = i8;
                    it = it2;
                    teamWorker = teamWorker2;
                    i = i16;
                    z = true;
                }
                arrayList = arrayList2;
                i2 = i5;
                if (z) {
                    arrayList.add(obj5);
                }
                if (!it.hasNext()) {
                    Object next = it.next();
                    i4 = ((Number) next).intValue();
                    qa6 qa6Var = teamWorker.c;
                    this.B = ku3Var;
                    this.r = teamWorker;
                    this.s = arrayList;
                    this.t = it;
                    this.u = next;
                    this.v = i;
                    this.w = i2;
                    this.x = i3;
                    this.y = i4;
                    this.z = 0;
                    this.A = 2;
                    obj2 = qa6Var.m(i4, this);
                    if (obj2 != lu3Var) {
                        TeamWorker teamWorker6 = teamWorker;
                        it2 = it;
                        i8 = i3;
                        i6 = i;
                        teamWorker2 = teamWorker6;
                        obj3 = next;
                        i5 = i2;
                        arrayList2 = arrayList;
                        i7 = 0;
                        if (((Boolean) obj2).booleanValue()) {
                            j0j j0jVar2 = teamWorker2.b;
                            this.B = ku3Var;
                            this.r = teamWorker2;
                            this.s = arrayList2;
                            this.t = it2;
                            this.u = obj3;
                            this.v = i6;
                            this.w = i5;
                            this.x = i8;
                            this.y = i4;
                            this.z = i7;
                            this.A = 3;
                            y = j0jVar2.y(i6, this);
                            if (y != lu3Var) {
                                obj5 = obj3;
                                i16 = i6;
                                arrayList2 = arrayList2;
                                if (((Boolean) y).booleanValue()) {
                                }
                                arrayList = arrayList2;
                                i2 = i5;
                                if (z) {
                                }
                                if (!it.hasNext()) {
                                    ArrayList arrayList3 = arrayList;
                                    ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                                    Iterator it5 = arrayList3.iterator();
                                    while (it5.hasNext()) {
                                        TeamWorker teamWorker7 = teamWorker4;
                                        arrayList4.add(xw3.t(ku3Var, null, new du1(teamWorker7, ((Number) it5.next()).intValue(), i10, null, 9), 3));
                                        teamWorker4 = teamWorker7;
                                    }
                                    teamWorker3 = teamWorker4;
                                    rq3Var = null;
                                    this.B = null;
                                    this.r = null;
                                    this.s = null;
                                    this.t = null;
                                    this.u = null;
                                    this.A = 4;
                                }
                            }
                        } else {
                            int i17 = i6;
                            i3 = i8;
                            it = it2;
                            teamWorker = teamWorker2;
                            i = i17;
                            obj5 = obj3;
                            z = false;
                            arrayList = arrayList2;
                            i2 = i5;
                            if (z) {
                            }
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
                return lu3Var;
            }
            if (i9 != 4) {
                if (i9 == 5) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            teamWorker3 = teamWorker4;
            this.B = rq3Var;
            this.A = 5;
        }
        EventIdsResponse eventIdsResponse = (EventIdsResponse) yaa.x((x2g) P);
        if (eventIdsResponse == null || (eventIds = eventIdsResponse.getEventIds()) == null) {
            return Unit.a;
        }
        arrayList = new ArrayList();
        it = eventIds.iterator();
        teamWorker = teamWorker4;
        i = i10;
        i2 = 0;
        i3 = 0;
        if (!it.hasNext()) {
        }
        return lu3Var;
    }
}
