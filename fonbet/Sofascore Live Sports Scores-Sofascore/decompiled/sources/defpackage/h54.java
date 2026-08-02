package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h54 extends hoi implements gt8 {
    public /* synthetic */ scj r;
    public /* synthetic */ List s;
    public /* synthetic */ CharSequence t;
    public /* synthetic */ k24 u;
    public /* synthetic */ a64 v;
    public final /* synthetic */ q54 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h54(q54 q54Var, rq3 rq3Var) {
        super(6, rq3Var);
        this.w = q54Var;
    }

    @Override // defpackage.gt8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        h54 h54Var = new h54(this.w, (rq3) obj6);
        h54Var.r = (scj) obj;
        h54Var.s = (List) obj2;
        h54Var.t = (CharSequence) obj3;
        h54Var.u = (k24) obj4;
        h54Var.v = (a64) obj5;
        return h54Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01ab, code lost:
    
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0168, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r5, java.lang.Boolean.TRUE) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01a9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r5, java.lang.Boolean.TRUE) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0123, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r5, java.lang.Boolean.TRUE) != false) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARN: Type inference failed for: r10v0, types: [km5] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v11, types: [km5] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v14, types: [km5] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [km5] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v16, types: [km5] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v7, types: [km5] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        int ordinal;
        int i;
        scj scjVar;
        ArrayList arrayList;
        ?? r15;
        ArrayList arrayList2;
        ?? r13;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        ?? r11;
        ?? r10;
        scj scjVar2 = this.r;
        List<Player> list2 = this.s;
        CharSequence charSequence = this.t;
        k24 k24Var = this.u;
        a64 a64Var = this.v;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        q54 q54Var = this.w;
        CrowdsourcingIncidentType crowdsourcingIncidentType = (CrowdsourcingIncidentType) q54Var.o.getValue();
        ArrayList arrayList3 = null;
        if (a64Var == null) {
            return null;
        }
        String obj2 = charSequence.toString();
        w34 w34Var = k24Var.b;
        boolean z = w34Var instanceof u34;
        if (z) {
            Map map = ((u34) w34Var).d;
            CrowdsourcingIncidentType.Card card = CrowdsourcingIncidentType.Card.YELLOW;
            if (crowdsourcingIncidentType == card) {
                List list3 = (List) map.get(card);
                if (list3 != null) {
                    list = new ArrayList();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        Integer num = ((yq3) it.next()).a;
                        if (num != null) {
                            list.add(num);
                        }
                    }
                } else {
                    list = 0;
                }
                if (list == 0) {
                    list = km5.a;
                }
            } else {
                CrowdsourcingIncidentType.Card card2 = CrowdsourcingIncidentType.Card.RED;
                if (crowdsourcingIncidentType == card2 || crowdsourcingIncidentType == CrowdsourcingIncidentType.Card.SECOND_YELLOW) {
                    List list4 = (List) map.get(card2);
                    if (list4 != null) {
                        r11 = new ArrayList();
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            Integer num2 = ((yq3) it2.next()).a;
                            if (num2 != null) {
                                r11.add(num2);
                            }
                        }
                    } else {
                        r11 = 0;
                    }
                    if (r11 == 0) {
                        r11 = km5.a;
                    }
                    List list5 = (List) map.get(CrowdsourcingIncidentType.Card.SECOND_YELLOW);
                    if (list5 != null) {
                        r10 = new ArrayList();
                        Iterator it3 = list5.iterator();
                        while (it3.hasNext()) {
                            Integer num3 = ((yq3) it3.next()).a;
                            if (num3 != null) {
                                r10.add(num3);
                            }
                        }
                    } else {
                        r10 = 0;
                    }
                    if (r10 == 0) {
                        r10 = km5.a;
                    }
                    list = CollectionsKt.S0(CollectionsKt.V0(CollectionsKt.w0(r10, r11)));
                } else {
                    list = km5.a;
                }
            }
        } else {
            if (!(w34Var instanceof v34)) {
                zzl.b();
                return null;
            }
            list = km5.a;
        }
        String string = q54Var.i().getString(R.string.crowdsourcing_double_card_error_message);
        string.getClass();
        if (z) {
            CrowdsourcingIncidentType.Card card3 = CrowdsourcingIncidentType.Card.YELLOW;
            if (crowdsourcingIncidentType == card3) {
                List list6 = (List) ((u34) w34Var).d.get(card3);
                if (list6 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = list6.iterator();
                    while (it4.hasNext()) {
                        String str = ((yq3) it4.next()).b;
                        if (str != null) {
                            arrayList4.add(str);
                        }
                    }
                    bool3 = Boolean.valueOf(arrayList4.contains(obj2));
                } else {
                    bool3 = null;
                }
            } else {
                CrowdsourcingIncidentType.Card card4 = CrowdsourcingIncidentType.Card.RED;
                if (crowdsourcingIncidentType == card4) {
                    List list7 = (List) ((u34) w34Var).d.get(card4);
                    if (list7 != null) {
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it5 = list7.iterator();
                        while (it5.hasNext()) {
                            String str2 = ((yq3) it5.next()).b;
                            if (str2 != null) {
                                arrayList5.add(str2);
                            }
                        }
                        bool2 = Boolean.valueOf(arrayList5.contains(obj2));
                    } else {
                        bool2 = null;
                    }
                } else {
                    CrowdsourcingIncidentType.Card card5 = CrowdsourcingIncidentType.Card.SECOND_YELLOW;
                    if (crowdsourcingIncidentType == card5) {
                        List list8 = (List) ((u34) w34Var).d.get(card5);
                        if (list8 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it6 = list8.iterator();
                            while (it6.hasNext()) {
                                String str3 = ((yq3) it6.next()).b;
                                if (str3 != null) {
                                    arrayList6.add(str3);
                                }
                            }
                            bool = Boolean.valueOf(arrayList6.contains(obj2));
                        } else {
                            bool = null;
                        }
                    }
                }
            }
            ordinal = a64Var.ordinal();
            if (ordinal != 0) {
                i = R.string.crowdsourcing_scorer;
            } else if (ordinal == 1) {
                i = R.string.football_assist;
            } else {
                if (ordinal != 2) {
                    zzl.b();
                    return null;
                }
                i = R.string.crowdsourcing_carded_player;
            }
            List list9 = (List) q54Var.s.getValue();
            String string2 = q54Var.i().getString(i);
            string2.getClass();
            scj scjVar3 = q54Var.w;
            boolean isEmpty = true ^ list9.isEmpty();
            ArrayList arrayList7 = new ArrayList(k13.r(list2, 10));
            for (Player player : list2) {
                boolean contains = list.contains(Integer.valueOf(player.getId()));
                if (z) {
                    int id = player.getId();
                    Map map2 = ((u34) w34Var).d;
                    List list10 = (List) map2.get(CrowdsourcingIncidentType.Card.RED);
                    arrayList = arrayList3;
                    if (list10 != null) {
                        arrayList3 = new ArrayList();
                        Iterator it7 = list10.iterator();
                        while (it7.hasNext()) {
                            scj scjVar4 = scjVar3;
                            Integer num4 = ((yq3) it7.next()).a;
                            if (num4 != null) {
                                arrayList3.add(num4);
                            }
                            scjVar3 = scjVar4;
                        }
                    }
                    scjVar = scjVar3;
                    List list11 = arrayList3;
                    if (arrayList3 == null) {
                        list11 = km5.a;
                    }
                    boolean contains2 = list11.contains(Integer.valueOf(id));
                    List list12 = (List) map2.get(CrowdsourcingIncidentType.Card.SECOND_YELLOW);
                    if (list12 != null) {
                        arrayList2 = new ArrayList();
                        Iterator it8 = list12.iterator();
                        while (it8.hasNext()) {
                            boolean z2 = contains2;
                            Integer num5 = ((yq3) it8.next()).a;
                            if (num5 != null) {
                                arrayList2.add(num5);
                            }
                            contains2 = z2;
                        }
                    } else {
                        arrayList2 = arrayList;
                    }
                    boolean z3 = contains2;
                    List list13 = arrayList2;
                    if (arrayList2 == null) {
                        list13 = km5.a;
                    }
                    boolean contains3 = list13.contains(Integer.valueOf(id));
                    List list14 = (List) map2.get(CrowdsourcingIncidentType.Card.YELLOW);
                    if (list14 != null) {
                        r13 = new ArrayList();
                        Iterator it9 = list14.iterator();
                        while (it9.hasNext()) {
                            Integer num6 = ((yq3) it9.next()).a;
                            if (num6 != null) {
                                r13.add(num6);
                            }
                        }
                    } else {
                        r13 = arrayList;
                    }
                    if (r13 == 0) {
                        r13 = km5.a;
                    }
                    r15 = z3 ? Integer.valueOf(R.drawable.ic_card_red_16) : contains3 ? Integer.valueOf(R.drawable.ic_yellow_double_16) : r13.contains(Integer.valueOf(id)) ? Integer.valueOf(R.drawable.ic_card_yellow) : arrayList;
                } else {
                    scjVar = scjVar3;
                    arrayList = arrayList3;
                    if (!(w34Var instanceof v34)) {
                        zzl.b();
                        return arrayList;
                    }
                    r15 = arrayList;
                }
                arrayList7.add(lz.Q(8, player, r15, true, contains, false));
                arrayList3 = arrayList;
                scjVar3 = scjVar;
            }
            return new m44(string2, scjVar2, a64Var, l6g.W(arrayList7), scjVar3, r6, isEmpty, list);
        }
        if (!(w34Var instanceof v34)) {
            zzl.b();
            return null;
        }
        String str4 = null;
        ordinal = a64Var.ordinal();
        if (ordinal != 0) {
        }
        List list92 = (List) q54Var.s.getValue();
        String string22 = q54Var.i().getString(i);
        string22.getClass();
        scj scjVar32 = q54Var.w;
        boolean isEmpty2 = true ^ list92.isEmpty();
        ArrayList arrayList72 = new ArrayList(k13.r(list2, 10));
        while (r1.hasNext()) {
        }
        return new m44(string22, scjVar2, a64Var, l6g.W(arrayList72), scjVar32, str4, isEmpty2, list);
    }
}
