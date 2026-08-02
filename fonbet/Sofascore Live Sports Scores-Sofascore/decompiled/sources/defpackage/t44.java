package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t44 extends hoi implements ct8 {
    public int A;
    public /* synthetic */ kxe B;
    public /* synthetic */ CrowdsourcingIncidentType C;
    public final /* synthetic */ q54 D;
    public q54 r;
    public Collection s;
    public Iterator t;
    public Object u;
    public Object v;
    public Collection w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t44(q54 q54Var, rq3 rq3Var) {
        super(3, rq3Var);
        this.D = q54Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        t44 t44Var = new t44(this.D, (rq3) obj3);
        t44Var.B = (kxe) obj;
        t44Var.C = (CrowdsourcingIncidentType) obj2;
        return t44Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0257, code lost:
    
        if (kotlin.collections.CollectionsKt.R(r6, r1 != null ? r1.b : r18) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x025c, code lost:
    
        if (r5 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x025a, code lost:
    
        if (r0 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x019c, code lost:
    
        if (kotlin.collections.CollectionsKt.R(r0, r1 != null ? r1.b : r18) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a1, code lost:
    
        if (r5 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a3, code lost:
    
        r6 = r4;
        r0 = r9;
        r11 = r10;
        r4 = r13;
        r9 = r14;
        r10 = r15;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019f, code lost:
    
        if (r6 != false) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x010d  */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0100 -> B:6:0x0105). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x026a -> B:47:0x0270). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List j;
        ArrayList arrayList;
        Iterator it;
        q54 q54Var;
        int i;
        int i2;
        ArrayList arrayList2;
        Object obj2;
        Iterator it2;
        Object obj3;
        Collection collection;
        int i3;
        int i4;
        q54 q54Var2;
        int i5;
        w34 w34Var;
        Collection collection2;
        int i6;
        boolean z;
        int i7;
        boolean z2;
        ArrayList arrayList3;
        Iterator it3;
        t44 t44Var = this;
        kxe kxeVar = t44Var.B;
        CrowdsourcingIncidentType crowdsourcingIncidentType = t44Var.C;
        lu3 lu3Var = lu3.a;
        int i8 = t44Var.A;
        int i9 = 2;
        int i10 = 1;
        int i11 = 0;
        Collection collection3 = null;
        if (i8 == 0) {
            y6a.M(obj);
            if (crowdsourcingIncidentType instanceof CrowdsourcingIncidentType.Card) {
                j = b.j(CrowdsourcingIncidentType.Card.YELLOW, CrowdsourcingIncidentType.Card.RED, CrowdsourcingIncidentType.Card.SECOND_YELLOW);
            } else {
                if (!(crowdsourcingIncidentType instanceof CrowdsourcingIncidentType.Goal)) {
                    zzl.b();
                    return null;
                }
                j = b.j(CrowdsourcingIncidentType.Goal.REGULAR, CrowdsourcingIncidentType.Goal.PENALTY, CrowdsourcingIncidentType.Goal.OWN_GOAL);
            }
            arrayList = new ArrayList(k13.r(j, 10));
            it = j.iterator();
            q54Var = t44Var.D;
            i = 0;
            i2 = 0;
            if (!it.hasNext()) {
            }
        } else if (i8 == 1) {
            int i12 = t44Var.z;
            int i13 = t44Var.y;
            i3 = t44Var.x;
            collection = (Collection) t44Var.v;
            obj3 = t44Var.u;
            it2 = t44Var.t;
            Collection collection4 = t44Var.s;
            q54 q54Var3 = t44Var.r;
            y6a.M(obj);
            i4 = i12;
            i5 = i13;
            q54Var2 = q54Var3;
            arrayList2 = collection4;
            obj2 = obj;
            w34Var = ((k24) obj2).b;
            if (w34Var instanceof u34) {
            }
        } else {
            if (i8 != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i5 = t44Var.y;
            int i14 = t44Var.x;
            Collection collection5 = t44Var.w;
            w34 w34Var2 = (w34) t44Var.v;
            obj3 = t44Var.u;
            it2 = t44Var.t;
            Collection collection6 = t44Var.s;
            q54 q54Var4 = t44Var.r;
            y6a.M(obj);
            Object u = obj;
            ArrayList arrayList4 = collection6;
            if (((Boolean) u).booleanValue()) {
                EventSuggest.IncidentSuggest incidentSuggest = w34Var2.b;
                z = (incidentSuggest != null ? incidentSuggest.getStatus() : collection3) != SuggestStatus.APPROVED;
                CrowdsourcingIncidentType.Card card = CrowdsourcingIncidentType.Card.YELLOW;
                if (obj3 != card) {
                    collection2 = collection3;
                    CrowdsourcingIncidentType.Card card2 = CrowdsourcingIncidentType.Card.RED;
                    if (obj3 == card2 || obj3 == CrowdsourcingIncidentType.Card.SECOND_YELLOW) {
                        Map map = ((u34) w34Var2).d;
                        Collection collection7 = (List) map.get(card2);
                        if (collection7 == null) {
                            collection7 = km5.a;
                        }
                        CrowdsourcingIncidentType.Card card3 = CrowdsourcingIncidentType.Card.SECOND_YELLOW;
                        Iterable iterable = (List) map.get(card3);
                        if (iterable == null) {
                            iterable = km5.a;
                        }
                        ArrayList w0 = CollectionsKt.w0(iterable, collection7);
                        if ((incidentSuggest != null ? incidentSuggest.getType() : collection2) != card2) {
                            if ((incidentSuggest != null ? incidentSuggest.getType() : collection2) != card3) {
                                z2 = false;
                                arrayList3 = new ArrayList();
                                it3 = w0.iterator();
                                while (it3.hasNext()) {
                                    Integer num = ((yq3) it3.next()).a;
                                    if (num != null) {
                                        arrayList3.add(num);
                                    }
                                }
                                if (!CollectionsKt.R(arrayList3, kxeVar == null ? new Integer(kxeVar.a) : collection2)) {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it4 = w0.iterator();
                                    while (it4.hasNext()) {
                                        String str = ((yq3) it4.next()).b;
                                        if (str != null) {
                                            arrayList5.add(str);
                                        }
                                    }
                                }
                            }
                        }
                        z2 = true;
                        arrayList3 = new ArrayList();
                        it3 = w0.iterator();
                        while (it3.hasNext()) {
                        }
                        if (!CollectionsKt.R(arrayList3, kxeVar == null ? new Integer(kxeVar.a) : collection2)) {
                        }
                    } else {
                        i7 = i5;
                        i6 = i14;
                        collection = collection5;
                        it = it2;
                        arrayList = arrayList4;
                        q54Var = q54Var4;
                    }
                } else {
                    Iterable iterable2 = (List) ((u34) w34Var2).d.get(card);
                    if (iterable2 == null) {
                        iterable2 = km5.a;
                    }
                    boolean z3 = (incidentSuggest != null ? incidentSuggest.getType() : collection3) == card;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it5 = iterable2.iterator();
                    while (it5.hasNext()) {
                        Collection collection8 = collection3;
                        Integer num2 = ((yq3) it5.next()).a;
                        if (num2 != null) {
                            arrayList6.add(num2);
                        }
                        collection3 = collection8;
                    }
                    collection2 = collection3;
                    if (!CollectionsKt.R(arrayList6, kxeVar != null ? new Integer(kxeVar.a) : collection2)) {
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it6 = iterable2.iterator();
                        while (it6.hasNext()) {
                            String str2 = ((yq3) it6.next()).b;
                            if (str2 != null) {
                                arrayList7.add(str2);
                            }
                        }
                    }
                }
                collection.add(new i2h((CrowdsourcingIncidentType) obj3, Intrinsics.c(obj3, crowdsourcingIncidentType), z));
                i = i6;
                i2 = i7;
                collection3 = collection2;
                i9 = 2;
                i10 = 1;
                i11 = 0;
                t44Var = this;
                if (!it.hasNext()) {
                    Object next = it.next();
                    aeh aehVar = q54Var.h;
                    t44Var.B = kxeVar;
                    t44Var.C = crowdsourcingIncidentType;
                    t44Var.r = q54Var;
                    t44Var.s = arrayList;
                    t44Var.t = it;
                    t44Var.u = next;
                    t44Var.v = arrayList;
                    t44Var.w = collection3;
                    t44Var.x = i;
                    t44Var.y = i2;
                    t44Var.z = i11;
                    t44Var.A = i10;
                    obj2 = rd0.y(aehVar, t44Var);
                    if (obj2 != lu3Var) {
                        it2 = it;
                        i5 = i2;
                        obj3 = next;
                        arrayList2 = arrayList;
                        q54Var2 = q54Var;
                        i3 = i;
                        i4 = i11;
                        collection = arrayList2;
                        w34Var = ((k24) obj2).b;
                        if (w34Var instanceof u34) {
                            collection2 = collection3;
                            if (!(w34Var instanceof v34)) {
                                zzl.b();
                                return collection2;
                            }
                            i6 = i3;
                            arrayList = arrayList2;
                            z = true;
                            q54Var = q54Var2;
                            i7 = i5;
                            it = it2;
                            collection.add(new i2h((CrowdsourcingIncidentType) obj3, Intrinsics.c(obj3, crowdsourcingIncidentType), z));
                            i = i6;
                            i2 = i7;
                            collection3 = collection2;
                            i9 = 2;
                            i10 = 1;
                            i11 = 0;
                            t44Var = this;
                            if (!it.hasNext()) {
                                return arrayList;
                            }
                        } else {
                            t44Var.B = kxeVar;
                            t44Var.C = crowdsourcingIncidentType;
                            t44Var.r = q54Var2;
                            t44Var.s = arrayList2;
                            t44Var.t = it2;
                            t44Var.u = obj3;
                            t44Var.v = w34Var;
                            t44Var.w = collection;
                            t44Var.x = i3;
                            t44Var.y = i5;
                            t44Var.z = i4;
                            t44Var.A = i9;
                            u = q54Var2.u(t44Var);
                            if (u != lu3Var) {
                                i14 = i3;
                                collection5 = collection;
                                w34Var2 = w34Var;
                                arrayList4 = arrayList2;
                                q54Var4 = q54Var2;
                                if (((Boolean) u).booleanValue()) {
                                }
                            }
                        }
                    }
                    return lu3Var;
                }
            } else {
                collection2 = collection3;
            }
            i7 = i5;
            i6 = i14;
            collection = collection5;
            it = it2;
            arrayList = arrayList4;
            q54Var = q54Var4;
            z = false;
            collection.add(new i2h((CrowdsourcingIncidentType) obj3, Intrinsics.c(obj3, crowdsourcingIncidentType), z));
            i = i6;
            i2 = i7;
            collection3 = collection2;
            i9 = 2;
            i10 = 1;
            i11 = 0;
            t44Var = this;
            if (!it.hasNext()) {
            }
        }
    }
}
