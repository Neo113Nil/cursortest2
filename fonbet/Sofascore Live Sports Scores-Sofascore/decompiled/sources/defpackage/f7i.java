package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.StagesListResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f7i extends hoi implements Function1 {
    public final /* synthetic */ hkb A;
    public Object r;
    public Iterable s;
    public List t;
    public Collection u;
    public LinkedHashSet v;
    public int w;
    public int x;
    public final /* synthetic */ h7i y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7i(h7i h7iVar, String str, hkb hkbVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.y = h7iVar;
        this.z = str;
        this.A = hkbVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new f7i(this.y, this.z, this.A, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((f7i) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x024f  */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.List] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LinkedHashSet linkedHashSet;
        Object stageEventsByWeek;
        xbb xbbVar;
        h7i h7iVar;
        hkb hkbVar;
        xbb xbbVar2;
        int i;
        boolean z;
        LinkedHashSet linkedHashSet2;
        List list;
        LinkedHashSet linkedHashSet3;
        xbb xbbVar3;
        h7i h7iVar2;
        LinkedHashSet linkedHashSet4;
        Iterator it;
        Boolean bool;
        LinkedHashSet linkedHashSet5;
        Boolean bool2;
        g9i g9iVar;
        List list2;
        lu3 lu3Var = lu3.a;
        int i2 = this.x;
        h7i h7iVar3 = this.y;
        boolean z2 = false;
        boolean z3 = true;
        Boolean bool3 = null;
        if (i2 == 0) {
            y6a.M(obj);
            xbb b = a.b();
            linkedHashSet = new LinkedHashSet();
            s96 s96Var = h7iVar3.e;
            String str = this.z;
            str.getClass();
            this.r = h7iVar3;
            hkb hkbVar2 = this.A;
            this.s = hkbVar2;
            this.t = b;
            this.u = b;
            this.v = linkedHashSet;
            this.w = 0;
            this.x = 1;
            stageEventsByWeek = s96Var.a.stageEventsByWeek(Sports.MOTORSPORT, str, this);
            if (stageEventsByWeek != lu3Var) {
                xbbVar = b;
                h7iVar = h7iVar3;
                hkbVar = hkbVar2;
                xbbVar2 = xbbVar;
                i = 0;
            }
            return lu3Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list2 = (List) this.r;
                y6a.M(obj);
                z = true;
                list = list2;
                return CollectionsKt.H0(a.a(list), new o5i(h7iVar3, z ? 1 : 0));
            }
            i = this.w;
            ?? r5 = (Set) this.u;
            ?? r9 = this.t;
            list = (List) this.s;
            h7iVar2 = (h7i) this.r;
            y6a.M(obj);
            z = true;
            linkedHashSet3 = r5;
            xbbVar3 = r9;
            h7iVar = h7iVar2;
            xbbVar = xbbVar3;
            linkedHashSet2 = linkedHashSet3;
            for (Category category : h7iVar.n) {
                List<UniqueStage> uniqueStages = category.getUniqueStages();
                if (uniqueStages != null) {
                    for (UniqueStage uniqueStage : uniqueStages) {
                        if (linkedHashSet2.add(new Integer(uniqueStage.getId()))) {
                            uniqueStage.setCategory(category);
                            xbbVar.add(new d7i(uniqueStage, false));
                        }
                    }
                }
            }
            g9iVar = h7iVar.k;
            if (g9iVar != null) {
                this.r = list;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = i;
                this.x = 3;
                if (g9iVar.Z(this) != lu3Var) {
                    list2 = list;
                    list = list2;
                }
                return lu3Var;
            }
            return CollectionsKt.H0(a.a(list), new o5i(h7iVar3, z ? 1 : 0));
        }
        i = this.w;
        linkedHashSet = this.v;
        ?? r10 = (List) this.u;
        ?? r11 = this.t;
        hkb hkbVar3 = (hkb) this.s;
        h7iVar = (h7i) this.r;
        y6a.M(obj);
        hkbVar = hkbVar3;
        xbbVar2 = r11;
        xbbVar = r10;
        stageEventsByWeek = obj;
        List<Stage> stages = ((StagesListResponse) stageEventsByWeek).getStages();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : stages) {
            boolean z4 = z3;
            List<Integer> substageStartDateTimestamps = ((Stage) obj2).getSubstageStartDateTimestamps();
            if (substageStartDateTimestamps != null) {
                if (!substageStartDateTimestamps.isEmpty()) {
                    Iterator it2 = substageStartDateTimestamps.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            bool = bool3;
                            linkedHashSet5 = linkedHashSet;
                            z2 = false;
                            break;
                        }
                        int intValue = ((Number) it2.next()).intValue();
                        long j = hkbVar.a;
                        bool = bool3;
                        linkedHashSet5 = linkedHashSet;
                        long j2 = hkbVar.b;
                        long j3 = intValue;
                        if (j <= j3 && j3 <= j2) {
                            z2 = z4;
                            break;
                        }
                        linkedHashSet = linkedHashSet5;
                        bool3 = bool;
                    }
                } else {
                    bool = bool3;
                    linkedHashSet5 = linkedHashSet;
                }
                bool2 = Boolean.valueOf(z2);
            } else {
                bool = bool3;
                linkedHashSet5 = linkedHashSet;
                bool2 = bool;
            }
            if (Intrinsics.c(bool2, Boolean.TRUE)) {
                arrayList.add(obj2);
            }
            linkedHashSet = linkedHashSet5;
            z3 = z4;
            bool3 = bool;
            z2 = false;
        }
        z = z3;
        ?? r19 = bool3;
        LinkedHashSet linkedHashSet6 = linkedHashSet;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            UniqueStage uniqueStage2 = ((Stage) next).getUniqueStage();
            Object obj3 = linkedHashMap.get(uniqueStage2);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(uniqueStage2, obj3);
            }
            ((List) obj3).add(next);
        }
        Iterator it4 = linkedHashMap.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            UniqueStage uniqueStage3 = (UniqueStage) entry.getKey();
            List list3 = (List) entry.getValue();
            if (uniqueStage3 != null) {
                xbbVar.add(new d7i(uniqueStage3, !list3.isEmpty()));
                ArrayList arrayList2 = new ArrayList(k13.r(list3, 10));
                int i3 = 0;
                for (Object obj4 : list3) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        b.q();
                        throw r19;
                    }
                    Iterator it5 = it4;
                    arrayList2.add(new c7i((Stage) obj4, i3 < list3.size() + (-1) ? z : false));
                    i3 = i4;
                    it4 = it5;
                }
                it = it4;
                xbbVar.addAll(arrayList2);
                linkedHashSet4 = linkedHashSet6;
                linkedHashSet4.add(new Integer(uniqueStage3.getId()));
            } else {
                linkedHashSet4 = linkedHashSet6;
                it = it4;
            }
            linkedHashSet6 = linkedHashSet4;
            it4 = it;
        }
        linkedHashSet2 = linkedHashSet6;
        g9i g9iVar2 = h7iVar.o;
        if (g9iVar2 == null) {
            list = xbbVar2;
            while (r4.hasNext()) {
            }
            g9iVar = h7iVar.k;
            if (g9iVar != null) {
            }
            return CollectionsKt.H0(a.a(list), new o5i(h7iVar3, z ? 1 : 0));
        }
        this.r = h7iVar;
        this.s = xbbVar2;
        this.t = xbbVar;
        this.u = linkedHashSet2;
        this.v = r19;
        this.w = i;
        this.x = 2;
        if (g9iVar2.Z(this) != lu3Var) {
            linkedHashSet3 = linkedHashSet2;
            xbbVar3 = xbbVar;
            list = xbbVar2;
            h7iVar2 = h7iVar;
            h7iVar = h7iVar2;
            xbbVar = xbbVar3;
            linkedHashSet2 = linkedHashSet3;
            while (r4.hasNext()) {
            }
            g9iVar = h7iVar.k;
            if (g9iVar != null) {
            }
            return CollectionsKt.H0(a.a(list), new o5i(h7iVar3, z ? 1 : 0));
        }
        return lu3Var;
    }
}
