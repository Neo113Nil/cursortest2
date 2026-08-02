package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.StageRaceResult;
import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.model.newNetwork.StageTeamPlacement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lq3i;", "Lq8;", "k3i", "n3i", "l3i", "m3i", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class q3i extends q8 {
    public final s96 e;
    public final j0j f;
    public Integer g;
    public UniqueStage h;
    public j5i i;
    public j5i j;
    public ta4 k;
    public boolean l;
    public Integer m;
    public m3i n;
    public final yzc o;
    public final yzc p;
    public final yzc q;
    public final yzc r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3i(Application application, fqg fqgVar, s96 s96Var, j0j j0jVar) {
        super(application);
        fqgVar.getClass();
        s96Var.getClass();
        j0jVar.getClass();
        this.e = s96Var;
        this.f = j0jVar;
        this.g = (Integer) fqgVar.a("stageId");
        this.h = (UniqueStage) fqgVar.a(SearchResponseKt.UNIQUE_STAGE_ENTITY);
        this.j = j5i.b;
        this.k = ta4.c;
        yzc yzcVar = new yzc();
        this.o = yzcVar;
        this.p = yzcVar;
        yzc yzcVar2 = new yzc();
        this.q = yzcVar2;
        this.r = yzcVar2;
    }

    public static ArrayList l(List list, List list2) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StageStandingsItem stageStandingsItem = (StageStandingsItem) it.next();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                StageRaceResult stageRaceResult = (StageRaceResult) it2.next();
                Stage stage = stageRaceResult.getStage();
                Object obj = null;
                if (stage != null) {
                    Integer M = z8e.M(stageRaceResult.getResults(), new g2i(stageStandingsItem, 2));
                    if (M != null) {
                        int intValue = M.intValue();
                        StageTeamPlacement stageTeamPlacement = stageRaceResult.getResults().get(intValue);
                        obj = stageTeamPlacement.getPosition() == null ? StageTeamPlacement.copy$default(stageTeamPlacement, null, Integer.valueOf(intValue + 1), null, null, null, 29, null) : stageTeamPlacement;
                    }
                    obj = new Pair(Integer.valueOf(stage.getId()), obj);
                }
                if (obj != null) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(new l3i(stageStandingsItem, tub.o(arrayList2)));
        }
        return arrayList;
    }

    public final void k() {
        Integer num = this.g;
        if (num != null) {
            xw3.L(un0.z(this), z45.a, null, new ru1(this, num.intValue(), null), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    public final void m() {
        Boolean bool;
        ArrayList arrayList;
        Integer position;
        m3i m3iVar = this.n;
        if (m3iVar != null) {
            ArrayList arrayList2 = m3iVar.b;
            ArrayList arrayList3 = m3iVar.a;
            UniqueStage uniqueStage = this.h;
            if (uniqueStage != null) {
                joa joaVar = l5i.a;
                bool = Boolean.valueOf(l5i.g(uniqueStage));
            } else {
                bool = null;
            }
            boolean c = Intrinsics.c(bool, Boolean.TRUE);
            j5i j5iVar = this.j;
            if (j5iVar == j5i.c) {
                arrayList = arrayList2;
            } else if (j5iVar == j5i.b && c) {
                ta4 ta4Var = this.k;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    l3i l3iVar = (l3i) it.next();
                    StageStandingsItem stageStandingsItem = l3iVar.a;
                    if (stageStandingsItem.getPosition() == null || ((position = stageStandingsItem.getPosition()) != null && position.intValue() == 0)) {
                        arrayList5.add(l3iVar);
                    }
                    int ordinal = ta4Var.ordinal();
                    if (ordinal == 0) {
                        Integer position2 = stageStandingsItem.getPosition();
                        if ((position2 != null ? position2.intValue() : 0) > 0) {
                            arrayList4.add(l3iVar);
                        }
                    } else if (ordinal == 1) {
                        Integer sprintPosition = stageStandingsItem.getSprintPosition();
                        if ((sprintPosition != null ? sprintPosition.intValue() : 0) > 0) {
                            Integer position3 = stageStandingsItem.getPosition();
                            if ((position3 != null ? position3.intValue() : 0) > 0) {
                                arrayList4.add(l3iVar);
                            }
                        }
                    } else if (ordinal == 2) {
                        Integer climbPosition = stageStandingsItem.getClimbPosition();
                        if ((climbPosition != null ? climbPosition.intValue() : 0) > 0) {
                            Integer position4 = stageStandingsItem.getPosition();
                            if ((position4 != null ? position4.intValue() : 0) > 0) {
                                arrayList4.add(l3iVar);
                            }
                        }
                    } else {
                        if (ordinal != 3) {
                            zzl.b();
                            return;
                        }
                        Integer youngRiderPosition = stageStandingsItem.getYoungRiderPosition();
                        if ((youngRiderPosition != null ? youngRiderPosition.intValue() : 0) > 0) {
                            Integer position5 = stageStandingsItem.getPosition();
                            if ((position5 != null ? position5.intValue() : 0) > 0) {
                                arrayList4.add(l3iVar);
                            }
                        }
                    }
                }
                int ordinal2 = ta4Var.ordinal();
                if (ordinal2 == 0) {
                    n13.u(new rs2(new wqg(19), 13), arrayList4);
                    arrayList4.addAll(arrayList5);
                    arrayList = arrayList4;
                } else if (ordinal2 == 1) {
                    n13.u(new rs2(new wqg(18), 12), arrayList4);
                    arrayList = arrayList4;
                } else if (ordinal2 == 2) {
                    n13.u(new rs2(new wqg(17), 11), arrayList4);
                    arrayList = arrayList4;
                } else if (ordinal2 != 3) {
                    zzl.b();
                    return;
                } else {
                    n13.u(new rs2(new wqg(16), 10), arrayList4);
                    arrayList = arrayList4;
                }
            } else {
                arrayList = arrayList3;
            }
            j5i j5iVar2 = this.j;
            j5i j5iVar3 = j5i.b;
            List list = j5iVar2 == j5iVar3 ? m3iVar.c : m3iVar.d;
            xbb b = a.b();
            if (!arrayList3.isEmpty()) {
                b.add(j5iVar3);
            }
            if (!arrayList2.isEmpty()) {
                b.add(j5i.c);
            }
            xbb a = a.a(b);
            j5i j5iVar4 = this.j;
            if (!CollectionsKt.R(a, j5iVar4)) {
                j5iVar4 = null;
            }
            if (j5iVar4 == null) {
                j5iVar4 = (j5i) CollectionsKt.firstOrNull(a);
            }
            xbb b2 = a.b();
            if (!arrayList3.isEmpty()) {
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (yid.m(((l3i) it2.next()).a.getPosition()) > 0) {
                            b2.add(ta4.c);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (yid.m(((l3i) it3.next()).a.getYoungRiderPosition()) > 0) {
                            b2.add(ta4.f);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (yid.m(((l3i) it4.next()).a.getSprintPosition()) > 0) {
                            b2.add(ta4.d);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it5 = arrayList3.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        if (yid.m(((l3i) it5.next()).a.getClimbPosition()) > 0) {
                            b2.add(ta4.e);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            xbb a2 = a.a(b2);
            ta4 ta4Var2 = this.k;
            if (!a2.contains(ta4Var2)) {
                ta4Var2 = null;
            }
            if (ta4Var2 == null) {
                ta4Var2 = (ta4) CollectionsKt.firstOrNull(a2);
            }
            kp5 kp5Var = k3i.g;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj : kp5Var) {
                k3i k3iVar = (k3i) obj;
                int ordinal3 = k3iVar.ordinal();
                Function1 function1 = k3iVar.d;
                if (ordinal3 != 0 && ordinal3 != 1 && ordinal3 != 2) {
                    if (ordinal3 == 4) {
                        if (ta4Var2 == ta4.d) {
                            arrayList6.add(obj);
                            break;
                        }
                    } else if (ordinal3 == 5) {
                        if (ta4Var2 == ta4.e) {
                            arrayList6.add(obj);
                            break;
                        }
                    } else {
                        if (ordinal3 == 6) {
                            if (this.l || !c || ta4Var2 != ta4.c) {
                                if (ta4Var2 == ta4.f && !arrayList.isEmpty()) {
                                    Iterator it6 = arrayList.iterator();
                                    while (it6.hasNext()) {
                                        if (function1.invoke(((l3i) it6.next()).a) != null) {
                                        }
                                    }
                                }
                            }
                            arrayList6.add(obj);
                            break;
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it7 = arrayList.iterator();
                            while (it7.hasNext()) {
                                if (function1.invoke(((l3i) it7.next()).a) != null) {
                                    arrayList6.add(obj);
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                } else if (!this.l && !arrayList.isEmpty()) {
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        if (function1.invoke(((l3i) it8.next()).a) != null) {
                            arrayList6.add(obj);
                            break;
                        }
                    }
                }
            }
            Integer num = this.m;
            ArrayList arrayList7 = arrayList;
            if (num != null) {
                int size = arrayList6.size();
                int intValue = num.intValue();
                arrayList7 = (intValue < 0 || intValue >= size) ? CollectionsKt.H0(arrayList, new p3i(list, num, arrayList6)) : CollectionsKt.H0(arrayList, new cp(new i31(8, arrayList6, num), 29));
            }
            ArrayList arrayList8 = arrayList7;
            boolean z = !list.isEmpty();
            boolean z2 = this.l & z;
            this.l = z2;
            List list2 = z2 ? list : null;
            if (j5iVar4 == null && (j5iVar4 = this.j) == null) {
                j5iVar4 = j5i.b;
            }
            j5i j5iVar5 = j5iVar4;
            if (ta4Var2 == null) {
                ta4Var2 = this.k;
            }
            this.q.k(new n3i(arrayList8, z, arrayList6, list2, a, j5iVar5, a2, ta4Var2, z2, this.m));
        }
    }
}
