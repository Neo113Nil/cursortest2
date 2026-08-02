package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z3e extends e4e {
    public final sfb a;
    public final List b;
    public final int c;
    public final int d;
    public final rfb e;
    public final rfb f;

    public z3e(sfb sfbVar, List list, int i, int i2, rfb rfbVar, rfb rfbVar2) {
        this.a = sfbVar;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = rfbVar;
        this.f = rfbVar2;
        if (sfbVar != sfb.c && i < 0) {
            ogj.h(ljg.j(i, "Prepend insert defining placeholdersBefore must be > 0, but was "));
            throw null;
        }
        if (sfbVar != sfb.b && i2 < 0) {
            ogj.h(ljg.j(i2, "Append insert defining placeholdersAfter must be > 0, but was "));
            throw null;
        }
        if (sfbVar == sfb.a && list.isEmpty()) {
            a70.p("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00eb -> B:10:0x00fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008d -> B:17:0x00aa). Please report as a decompilation issue!!! */
    @Override // defpackage.e4e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function2 function2, rq3 rq3Var) {
        x3e x3eVar;
        int i;
        Throwable th;
        sfb sfbVar;
        Iterator it;
        x3e x3eVar2;
        ArrayList arrayList;
        Function2 function22;
        z3e z3eVar = this;
        if (rq3Var instanceof x3e) {
            x3eVar = (x3e) rq3Var;
            int i2 = x3eVar.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x3eVar.G = i2 - Integer.MIN_VALUE;
                Object obj = x3eVar.E;
                lu3 lu3Var = lu3.a;
                i = x3eVar.G;
                if (i != 0) {
                    th = null;
                    y6a.M(obj);
                    List list = z3eVar.b;
                    ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                    Iterator it2 = list.iterator();
                    sfbVar = z3eVar.a;
                    it = it2;
                    x3eVar2 = x3eVar;
                    arrayList = arrayList2;
                    function22 = function2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i3 = x3eVar.D;
                    int i4 = x3eVar.C;
                    Collection collection = x3eVar.B;
                    Object obj2 = x3eVar.A;
                    Iterator it3 = x3eVar.z;
                    ?? r10 = x3eVar.y;
                    ?? r11 = x3eVar.x;
                    zvj zvjVar = x3eVar.w;
                    Iterator it4 = x3eVar.v;
                    Collection collection2 = x3eVar.u;
                    sfb sfbVar2 = x3eVar.t;
                    th = null;
                    z3e z3eVar2 = x3eVar.s;
                    Function2 function23 = x3eVar.r;
                    y6a.M(obj);
                    x3eVar2 = x3eVar;
                    arrayList = collection2;
                    int i5 = i4;
                    Object obj3 = obj2;
                    ArrayList arrayList3 = r11;
                    ArrayList arrayList4 = r10;
                    Iterator it5 = it3;
                    if (((Boolean) obj).booleanValue()) {
                        arrayList3.add(obj3);
                        List list2 = zvjVar.d;
                        if (list2 != null) {
                            i3 = ((Number) list2.get(i3)).intValue();
                        }
                        arrayList4.add(new Integer(i3));
                    }
                    z3eVar = z3eVar2;
                    function22 = function23;
                    Iterator it6 = it5;
                    ArrayList arrayList5 = arrayList4;
                    it = it4;
                    int i6 = i5;
                    sfb sfbVar3 = sfbVar2;
                    if (it6.hasNext()) {
                        Object next = it6.next();
                        i5 = i6 + 1;
                        if (i6 < 0) {
                            b.q();
                            throw th;
                        }
                        x3eVar2.r = function22;
                        x3eVar2.s = z3eVar;
                        x3eVar2.t = sfbVar3;
                        x3eVar2.u = arrayList;
                        x3eVar2.v = it;
                        x3eVar2.w = zvjVar;
                        x3eVar2.x = arrayList3;
                        x3eVar2.y = arrayList5;
                        x3eVar2.z = it6;
                        x3eVar2.A = next;
                        x3eVar2.B = collection;
                        x3eVar2.C = i5;
                        x3eVar2.D = i6;
                        x3eVar2.G = 1;
                        Object invoke = function22.invoke(next, x3eVar2);
                        if (invoke == lu3Var) {
                            return lu3Var;
                        }
                        Iterator it7 = it;
                        z3eVar2 = z3eVar;
                        i3 = i6;
                        arrayList4 = arrayList5;
                        it5 = it6;
                        obj3 = next;
                        it4 = it7;
                        sfb sfbVar4 = sfbVar3;
                        function23 = function22;
                        obj = invoke;
                        sfbVar2 = sfbVar4;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        z3eVar = z3eVar2;
                        function22 = function23;
                        Iterator it62 = it5;
                        ArrayList arrayList52 = arrayList4;
                        it = it4;
                        int i62 = i5;
                        sfb sfbVar32 = sfbVar2;
                        if (it62.hasNext()) {
                            collection.add(new zvj(zvjVar.a, arrayList3, zvjVar.c, arrayList52));
                            sfbVar = sfbVar32;
                            if (it.hasNext()) {
                                return new z3e(sfbVar, arrayList, z3eVar.c, z3eVar.d, z3eVar.e, z3eVar.f);
                            }
                            zvj zvjVar2 = (zvj) it.next();
                            arrayList3 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            i62 = 0;
                            arrayList52 = arrayList6;
                            it62 = zvjVar2.b.iterator();
                            zvjVar = zvjVar2;
                            sfbVar32 = sfbVar;
                            collection = arrayList;
                            if (it62.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        x3eVar = new x3e(z3eVar, (sq3) rq3Var);
        Object obj4 = x3eVar.E;
        lu3 lu3Var2 = lu3.a;
        i = x3eVar.G;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00df -> B:10:0x00e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0083 -> B:11:0x00a4). Please report as a decompilation issue!!! */
    @Override // defpackage.e4e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Function2 function2, rq3 rq3Var) {
        y3e y3eVar;
        int i;
        sfb sfbVar;
        Iterator it;
        y3e y3eVar2;
        ArrayList arrayList;
        Function2 function22;
        z3e z3eVar = this;
        if (rq3Var instanceof y3e) {
            y3eVar = (y3e) rq3Var;
            int i2 = y3eVar.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y3eVar.E = i2 - Integer.MIN_VALUE;
                Object obj = y3eVar.C;
                lu3 lu3Var = lu3.a;
                i = y3eVar.E;
                int i3 = 10;
                if (i != 0) {
                    y6a.M(obj);
                    List list = z3eVar.b;
                    ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                    Iterator it2 = list.iterator();
                    sfbVar = z3eVar.a;
                    it = it2;
                    y3eVar2 = y3eVar;
                    arrayList = arrayList2;
                    function22 = function2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection = y3eVar.B;
                    Collection collection2 = y3eVar.A;
                    Iterator it3 = y3eVar.z;
                    Collection collection3 = y3eVar.y;
                    int[] iArr = y3eVar.x;
                    zvj zvjVar = y3eVar.w;
                    Iterator it4 = y3eVar.v;
                    Collection collection4 = y3eVar.u;
                    sfb sfbVar2 = y3eVar.t;
                    z3e z3eVar2 = y3eVar.s;
                    Function2 function23 = y3eVar.r;
                    y6a.M(obj);
                    zvj zvjVar2 = zvjVar;
                    sfb sfbVar3 = sfbVar2;
                    ArrayList arrayList3 = collection3;
                    Iterator it5 = it4;
                    Iterator it6 = it3;
                    y3e y3eVar3 = y3eVar;
                    Function2 function24 = function23;
                    ArrayList arrayList4 = collection4;
                    collection2.add(obj);
                    ArrayList arrayList5 = arrayList4;
                    z3e z3eVar3 = z3eVar2;
                    ArrayList arrayList6 = arrayList3;
                    if (it6.hasNext()) {
                        Object next = it6.next();
                        y3eVar3.r = function24;
                        y3eVar3.s = z3eVar3;
                        y3eVar3.t = sfbVar3;
                        y3eVar3.u = arrayList5;
                        y3eVar3.v = it5;
                        y3eVar3.w = zvjVar2;
                        y3eVar3.x = iArr;
                        ArrayList arrayList7 = arrayList6;
                        y3eVar3.y = arrayList7;
                        y3eVar3.z = it6;
                        y3eVar3.A = arrayList7;
                        y3eVar3.B = collection;
                        y3eVar3.E = 1;
                        Object invoke = function24.invoke(next, y3eVar3);
                        if (invoke == lu3Var) {
                            return lu3Var;
                        }
                        z3eVar2 = z3eVar3;
                        obj = invoke;
                        arrayList3 = arrayList6;
                        arrayList4 = arrayList5;
                        collection2 = arrayList3;
                        collection2.add(obj);
                        ArrayList arrayList52 = arrayList4;
                        z3e z3eVar32 = z3eVar2;
                        ArrayList arrayList62 = arrayList3;
                        if (it6.hasNext()) {
                            collection.add(new zvj(iArr, arrayList62, zvjVar2.c, zvjVar2.d));
                            z3eVar = z3eVar32;
                            function22 = function24;
                            arrayList = arrayList52;
                            y3eVar2 = y3eVar3;
                            it = it5;
                            sfbVar = sfbVar3;
                            i3 = 10;
                            if (it.hasNext()) {
                                return new z3e(sfbVar, arrayList, z3eVar.c, z3eVar.d, z3eVar.e, z3eVar.f);
                            }
                            zvj zvjVar3 = (zvj) it.next();
                            int[] iArr2 = zvjVar3.a;
                            List list2 = zvjVar3.b;
                            arrayList62 = new ArrayList(k13.r(list2, i3));
                            it6 = list2.iterator();
                            sfbVar3 = sfbVar;
                            iArr = iArr2;
                            zvjVar2 = zvjVar3;
                            it5 = it;
                            y3eVar3 = y3eVar2;
                            arrayList52 = arrayList;
                            function24 = function22;
                            z3eVar32 = z3eVar;
                            collection = arrayList52;
                            if (it6.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        y3eVar = new y3e(z3eVar, (sq3) rq3Var);
        Object obj2 = y3eVar.C;
        lu3 lu3Var2 = lu3.a;
        i = y3eVar.E;
        int i32 = 10;
        if (i != 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3e)) {
            return false;
        }
        z3e z3eVar = (z3e) obj;
        return this.a == z3eVar.a && Intrinsics.c(this.b, z3eVar.b) && this.c == z3eVar.c && this.d == z3eVar.d && this.e.equals(z3eVar.e) && Intrinsics.c(this.f, z3eVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + wv8.a(this.d, wv8.a(this.c, dmi.d(this.a.hashCode() * 31, 31, this.b), 31), 31)) * 31;
        rfb rfbVar = this.f;
        return hashCode + (rfbVar == null ? 0 : rfbVar.hashCode());
    }

    public final String toString() {
        List list;
        List list2;
        List list3 = this.b;
        Iterator it = list3.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zvj) it.next()).b.size();
        }
        int i2 = this.c;
        String valueOf = i2 != -1 ? String.valueOf(i2) : "none";
        int i3 = this.d;
        String valueOf2 = i3 != -1 ? String.valueOf(i3) : "none";
        StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
        sb.append(this.a);
        sb.append(", with ");
        sb.append(i);
        sb.append(" items (\n                    |   first item: ");
        zvj zvjVar = (zvj) CollectionsKt.firstOrNull(list3);
        Object obj = null;
        sb.append((zvjVar == null || (list2 = zvjVar.b) == null) ? null : CollectionsKt.firstOrNull(list2));
        sb.append("\n                    |   last item: ");
        zvj zvjVar2 = (zvj) CollectionsKt.j0(list3);
        if (zvjVar2 != null && (list = zvjVar2.b) != null) {
            obj = CollectionsKt.j0(list);
        }
        sb.append(obj);
        sb.append("\n                    |   placeholdersBefore: ");
        sb.append(valueOf);
        sb.append("\n                    |   placeholdersAfter: ");
        sb.append(valueOf2);
        sb.append("\n                    |   sourceLoadStates: ");
        sb.append(this.e);
        sb.append("\n                    ");
        String sb2 = sb.toString();
        rfb rfbVar = this.f;
        if (rfbVar != null) {
            sb2 = sb2 + "|   mediatorLoadStates: " + rfbVar + '\n';
        }
        return dii.d(sb2.concat("|)"));
    }
}
