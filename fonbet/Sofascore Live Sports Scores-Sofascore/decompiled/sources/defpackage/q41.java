package defpackage;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x;
import com.sofascore.model.Sports;
import com.sofascore.model.database.DbEventAll;
import com.sofascore.model.database.DbSportOrder;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q41 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q41(Object obj, rq3 rq3Var, int i) {
        super(3, rq3Var);
        this.r = i;
        this.u = obj;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        Object obj4 = this.u;
        switch (i) {
            case 0:
                q41 q41Var = new q41((w41) obj4, (rq3) obj3, 0);
                q41Var.s = (List) obj;
                q41Var.t = (gec) obj2;
                return q41Var.invokeSuspend(Unit.a);
            case 1:
                q41 q41Var2 = new q41((q54) obj4, (rq3) obj3, 1);
                q41Var2.t = (CharSequence) obj;
                q41Var2.s = (List) obj2;
                return q41Var2.invokeSuspend(Unit.a);
            case 2:
                q41 q41Var3 = new q41((qa6) obj4, (rq3) obj3, 2);
                q41Var3.s = (List) obj;
                q41Var3.t = (List) obj2;
                return q41Var3.invokeSuspend(Unit.a);
            case 3:
                q41 q41Var4 = new q41((h67) obj4, (rq3) obj3, 3);
                q41Var4.s = (String) obj;
                q41Var4.t = (gv9) obj2;
                return q41Var4.invokeSuspend(Unit.a);
            case 4:
                q41 q41Var5 = new q41((sfb) obj4, (rq3) obj3, 4);
                q41Var5.s = (jw8) obj;
                q41Var5.t = (jw8) obj2;
                return q41Var5.invokeSuspend(Unit.a);
            case 5:
                q41 q41Var6 = new q41((a0i) obj4, (rq3) obj3, 5);
                q41Var6.s = (List) obj;
                q41Var6.t = (HashMap) obj2;
                return q41Var6.invokeSuspend(Unit.a);
            default:
                q41 q41Var7 = new q41((m) obj4, (rq3) obj3, 6);
                q41Var7.s = (x) obj;
                q41Var7.t = (Boolean) obj2;
                return q41Var7.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        String str;
        int i = this.r;
        Object obj2 = null;
        int i2 = 0;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                List list = (List) this.s;
                gec gecVar = (gec) this.t;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (list == null) {
                    return km5.a;
                }
                int ordinal = gecVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            if (((g6c) obj4) instanceof r5c) {
                                arrayList.add(obj4);
                            }
                        }
                    } else if (ordinal == 2) {
                        arrayList = new ArrayList();
                        for (Object obj5 : list) {
                            g6c g6cVar = (g6c) obj5;
                            if ((g6cVar instanceof n5c) || (g6cVar instanceof o5c)) {
                                arrayList.add(obj5);
                            }
                        }
                    } else if (ordinal == 3) {
                        arrayList = new ArrayList();
                        for (Object obj6 : list) {
                            g6c g6cVar2 = (g6c) obj6;
                            if ((g6cVar2 instanceof w5c) || (g6cVar2 instanceof a6c)) {
                                arrayList.add(obj6);
                            }
                        }
                    } else {
                        if (ordinal != 4) {
                            zzl.b();
                            return null;
                        }
                        arrayList = new ArrayList();
                        for (Object obj7 : list) {
                            if (obj7 instanceof e6c) {
                                arrayList.add(obj7);
                            }
                        }
                    }
                    list = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                if (list.isEmpty()) {
                    ia0 ia0Var = ia0.q;
                    if (!mz1.C()) {
                        return arrayList2;
                    }
                    arrayList2.add(new f5c());
                    return arrayList2;
                }
                while (i2 < list.size()) {
                    int size = arrayList2.size();
                    ia0 ia0Var2 = ia0.q;
                    if (mz1.C() && size >= 3 && (size - 3) % 5 == 0) {
                        arrayList2.add(new f5c());
                    } else {
                        arrayList2.add(list.get(i2));
                        i2++;
                    }
                }
                int size2 = arrayList2.size();
                ia0 ia0Var3 = ia0.q;
                if (!mz1.C() || size2 < 3 || (size2 - 3) % 5 != 0) {
                    return arrayList2;
                }
                arrayList2.add(new f5c());
                return arrayList2;
            case 1:
                CharSequence charSequence = (CharSequence) this.t;
                List list2 = (List) this.s;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                mqi mqiVar = qhi.a;
                String d = qhi.d(charSequence.toString());
                q54 q54Var = (q54) obj3;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj8 : list2) {
                    Player player = (Player) obj8;
                    String jerseyNumber = player.getJerseyNumber();
                    if (jerseyNumber == null || !StringsKt.J(jerseyNumber, d, false)) {
                        mqi mqiVar2 = qhi.a;
                        if (StringsKt.J(qhi.d(tba.t(player)), d, true)) {
                        }
                    }
                    kxe kxeVar = (kxe) q54Var.p.getValue();
                    if (kxeVar == null || player.getId() != kxeVar.a) {
                        kxe kxeVar2 = (kxe) q54Var.q.getValue();
                        if (kxeVar2 == null || player.getId() != kxeVar2.a) {
                            arrayList3.add(obj8);
                        }
                    }
                }
                return arrayList3;
            case 2:
                List<DbEventAll> list3 = (List) this.s;
                List list4 = (List) this.t;
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                qa6 qa6Var = (qa6) obj3;
                ArrayList arrayList4 = new ArrayList();
                for (DbEventAll dbEventAll : list3) {
                    qa6Var.getClass();
                    Event y = qa6.y(dbEventAll);
                    if (y != null) {
                        arrayList4.add(y);
                    }
                }
                return CollectionsKt.H0(CollectionsKt.w0(list4, arrayList4), new rs2(Locale.getDefault(), 3));
            case 3:
                String str2 = (String) this.s;
                gv9 gv9Var = (gv9) this.t;
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                return new g5e(new k9(30, 58), new mi(29, (h67) obj3, gv9Var, str2));
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                jw8 jw8Var = (jw8) this.s;
                jw8 jw8Var2 = (jw8) this.t;
                sfb sfbVar = (sfb) obj3;
                jw8Var2.getClass();
                jw8Var.getClass();
                int i3 = jw8Var2.a;
                int i4 = jw8Var.a;
                return i3 <= i4 ? i3 < i4 ? false : lz.O(jw8Var2.b, jw8Var.b, sfbVar) : true ? jw8Var2 : jw8Var;
            case 5:
                List list5 = (List) this.s;
                HashMap hashMap = (HashMap) this.t;
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                Iterator it = list5.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((DbSportOrder) next).isSelected()) {
                            obj2 = next;
                        }
                    }
                }
                DbSportOrder dbSportOrder = (DbSportOrder) obj2;
                if (dbSportOrder == null || (str = dbSportOrder.getSportName()) == null) {
                    str = Sports.TRENDING;
                }
                xbb b = a.b();
                b.add(new hzh(mzh.a, str.equals(Sports.TRENDING), new q9k(R.string.trending), R.drawable.ic_trending_fire, null, null, null));
                ArrayList arrayList5 = new ArrayList(k13.r(list5, 10));
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(pea.F((DbSportOrder) it2.next(), hashMap, 2));
                }
                b.addAll(arrayList5);
                gv9 W = l6g.W(a.a(b));
                p2h p2hVar = (p2h) ((a0i) obj3).l().a();
                return new p2h(W, str, p2hVar != null ? p2hVar.c : false);
            default:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                x xVar = (x) this.s;
                return Boolean.valueOf((xVar == null || !xVar.equals(CollectionsKt.h0(((m) obj3).a)) || Intrinsics.c((Boolean) this.t, Boolean.TRUE)) ? false : true);
        }
    }
}
