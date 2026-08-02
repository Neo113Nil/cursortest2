package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t4h {
    public final a7j a;
    public final tl b;
    public boolean d;
    public boolean e;
    public rfb g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public final ArrayList c = new ArrayList();
    public final ejg f = new ejg(13);

    public t4h(a7j a7jVar, tl tlVar) {
        this.a = a7jVar;
        this.b = tlVar;
    }

    public static zvj d(zvj zvjVar) {
        int[] iArr = zvjVar.a;
        List list = zvjVar.b;
        List j = b.j(CollectionsKt.Y(list), CollectionsKt.h0(list));
        int i = zvjVar.c;
        List list2 = zvjVar.d;
        return new zvj(iArr, j, i, b.j(Integer.valueOf(list2 != null ? ((Number) CollectionsKt.Y(list2)).intValue() : 0), Integer.valueOf(list2 != null ? ((Number) CollectionsKt.h0(list2)).intValue() : list.size() - 1)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        if (r2 == r4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0106, code lost:
    
        if (r2 == r4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0118, code lost:
    
        if (r2 == r4) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r17v0, types: [t4h] */
    /* JADX WARN: Type inference failed for: r1v2, types: [a4e] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e4e e4eVar, sq3 sq3Var) {
        q4h q4hVar;
        int i;
        Object obj;
        if (sq3Var instanceof q4h) {
            q4hVar = (q4h) sq3Var;
            int i2 = q4hVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q4hVar.t = i2 - Integer.MIN_VALUE;
                Object obj2 = q4hVar.r;
                lu3 lu3Var = lu3.a;
                i = q4hVar.t;
                ArrayList arrayList = this.c;
                if (i != 0) {
                    y6a.M(obj2);
                    if (e4eVar instanceof z3e) {
                        q4hVar.t = 1;
                        obj2 = b((z3e) e4eVar, q4hVar);
                    } else {
                        boolean z = e4eVar instanceof w3e;
                        ejg ejgVar = this.f;
                        if (z) {
                            obj = (w3e) e4eVar;
                            ejgVar.C(null, pfb.c);
                            sfb sfbVar = sfb.b;
                            sfb sfbVar2 = sfb.c;
                            if (arrayList.isEmpty()) {
                                this.d = false;
                            }
                            o13.A(arrayList, new qfg(new IntRange(0, 0, 1), 13));
                        } else if (e4eVar instanceof a4e) {
                            ?? r1 = (a4e) e4eVar;
                            q4hVar.t = 2;
                            rfb rfbVar = this.g;
                            rfb F = ejgVar.F();
                            rfb rfbVar2 = r1.a;
                            rfb rfbVar3 = r1.b;
                            if (!F.equals(rfbVar2) || !Intrinsics.c(rfbVar, rfbVar3)) {
                                ejgVar.B(rfbVar2);
                                this.g = rfbVar3;
                                if (rfbVar3 != null) {
                                    qfb qfbVar = rfbVar3.b;
                                    if (qfbVar.a) {
                                        if (!Intrinsics.c(rfbVar != null ? rfbVar.b : null, qfbVar)) {
                                            km5 km5Var = km5.a;
                                            int i3 = this.h;
                                            rfb rfbVar4 = r1.b;
                                            km5Var.getClass();
                                            r1 = b(new z3e(sfb.b, km5Var, i3, -1, rfbVar2, rfbVar4), q4hVar);
                                        }
                                    }
                                }
                                if (rfbVar3 != null) {
                                    qfb qfbVar2 = rfbVar3.c;
                                    if (qfbVar2.a) {
                                        if (!Intrinsics.c(rfbVar != null ? rfbVar.c : null, qfbVar2)) {
                                            km5 km5Var2 = km5.a;
                                            int i4 = this.i;
                                            rfb rfbVar5 = r1.b;
                                            km5Var2.getClass();
                                            r1 = b(new z3e(sfb.c, km5Var2, -1, i4, rfbVar2, rfbVar5), q4hVar);
                                        }
                                    }
                                }
                            }
                            obj2 = r1;
                        } else {
                            if (!(e4eVar instanceof d4e)) {
                                zzl.b();
                                return null;
                            }
                            q4hVar.t = 3;
                            obj2 = c((d4e) e4eVar, q4hVar);
                        }
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    y6a.M(obj2);
                    obj = (e4e) obj2;
                } else if (i == 2) {
                    y6a.M(obj2);
                    obj = (e4e) obj2;
                } else {
                    if (i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj2);
                    obj = (e4e) obj2;
                }
                if (!this.d && !arrayList.isEmpty()) {
                    a70.r("deferred endTerm, page stash should be empty");
                    return null;
                }
                if (this.e || arrayList.isEmpty()) {
                    return obj;
                }
                a70.r("deferred startTerm, page stash should be empty");
                return null;
            }
        }
        q4hVar = new q4h(this, sq3Var);
        Object obj22 = q4hVar.r;
        lu3 lu3Var2 = lu3.a;
        i = q4hVar.t;
        ArrayList arrayList2 = this.c;
        if (i != 0) {
        }
        if (!this.d) {
        }
        if (this.e) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x02ac, code lost:
    
        if (r2 == r4) goto L266;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f2  */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x041b -> B:117:0x0421). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0690 -> B:25:0x0691). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x05c4 -> B:57:0x05c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(z3e z3eVar, sq3 sq3Var) {
        r4h r4hVar;
        int i;
        boolean z;
        boolean z2;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        zvj zvjVar;
        Integer num;
        zvj zvjVar2;
        Integer num2;
        z3e z3eVar2;
        zvj zvjVar3;
        ArrayList arrayList3;
        zvj zvjVar4;
        boolean z3;
        int i3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Integer num3;
        zvj zvjVar5;
        zvj zvjVar6;
        Object obj;
        boolean z4;
        boolean z5;
        ArrayList arrayList6;
        r4h r4hVar2;
        ArrayList arrayList7;
        z3e z3eVar3;
        ArrayList arrayList8;
        z3e z3eVar4;
        int intValue;
        Integer num4;
        Integer num5;
        zvj zvjVar7;
        ArrayList arrayList9;
        ArrayList arrayList10;
        zvj zvjVar8;
        int i4;
        boolean z6;
        int i5;
        ArrayList arrayList11;
        ArrayList arrayList12;
        Integer num6;
        zvj zvjVar9;
        zvj zvjVar10;
        zvj zvjVar11;
        Integer num7;
        Object obj2;
        ArrayList arrayList13;
        ArrayList arrayList14;
        zvj zvjVar12;
        int i6;
        zvj zvjVar13;
        ArrayList arrayList15;
        z3e z3eVar5;
        ArrayList arrayList16;
        Iterator it;
        Object next;
        Iterator it2;
        z3e z3eVar6;
        Object obj3;
        Integer num8;
        zvj zvjVar14;
        Iterator it3;
        zvj zvjVar15;
        zvj zvjVar16;
        ArrayList arrayList17;
        ArrayList arrayList18;
        ArrayList arrayList19;
        zvj zvjVar17;
        Integer num9;
        Iterator it4;
        z3e z3eVar7;
        int i7;
        z3e z3eVar8;
        sfb sfbVar;
        sfb sfbVar2;
        Iterator it5;
        int i8;
        int i9;
        int i10;
        int intValue2;
        Integer num10;
        zvj zvjVar18;
        Object obj4;
        zvj zvjVar19;
        ArrayList arrayList20;
        int intValue3;
        int i11;
        int i12;
        ArrayList arrayList21;
        z3e z3eVar9;
        boolean z7;
        zvj zvjVar20;
        int i13;
        int i14;
        t4h t4hVar;
        zvj zvjVar21;
        Object invoke;
        Object obj5;
        ArrayList arrayList22;
        zvj zvjVar22;
        ArrayList arrayList23;
        z3e z3eVar10 = z3eVar;
        if (sq3Var instanceof r4h) {
            r4hVar = (r4h) sq3Var;
            int i15 = r4hVar.G;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                r4hVar.G = i15 - Integer.MIN_VALUE;
                Object obj6 = r4hVar.E;
                lu3 lu3Var = lu3.a;
                i = r4hVar.G;
                ArrayList arrayList24 = this.c;
                tl tlVar = this.b;
                switch (i) {
                    case 0:
                        y6a.M(obj6);
                        z3eVar10.getClass();
                        rfb rfbVar = z3eVar10.f;
                        rfb rfbVar2 = z3eVar10.e;
                        qfb qfbVar = rfbVar2.c;
                        qfb qfbVar2 = rfbVar2.b;
                        sfb sfbVar3 = z3eVar10.a;
                        List list = z3eVar10.b;
                        sfb sfbVar4 = sfb.c;
                        a7j a7jVar = this.a;
                        if (sfbVar3 == sfbVar4) {
                            z = this.e;
                        } else {
                            int ordinal = a7jVar.ordinal();
                            if (ordinal == 0) {
                                z = qfbVar2.a && (rfbVar == null || rfbVar.b.a);
                            } else if (ordinal != 1) {
                                zzl.b();
                                break;
                            } else {
                                z = qfbVar2.a;
                            }
                        }
                        if (sfbVar3 == sfb.b) {
                            z2 = this.d;
                        } else {
                            int ordinal2 = a7jVar.ordinal();
                            if (ordinal2 == 0) {
                                z2 = qfbVar.a && (rfbVar == null || rfbVar.c.a);
                            } else if (ordinal2 != 1) {
                                zzl.b();
                                break;
                            } else {
                                z2 = qfbVar.a;
                            }
                        }
                        if (list == null || !list.isEmpty()) {
                            Iterator it6 = list.iterator();
                            while (it6.hasNext()) {
                                if (!((zvj) it6.next()).b.isEmpty()) {
                                    i2 = 0;
                                    if (this.k || sfbVar3 != sfb.b || i2 != 0) {
                                        if (!this.j && sfbVar3 == sfb.c && i2 == 0) {
                                            a70.p("Additional append event after append state is done");
                                            break;
                                        } else {
                                            this.f.B(rfbVar2);
                                            this.g = rfbVar;
                                            if (sfbVar3 != sfb.c) {
                                                this.h = z3eVar10.c;
                                            }
                                            if (sfbVar3 != sfb.b) {
                                                this.i = z3eVar10.d;
                                            }
                                            if (i2 != 0) {
                                                if ((z || z2) && (!this.k || !this.j)) {
                                                    if (arrayList24.isEmpty()) {
                                                        if (z && z2 && !this.k && !this.j) {
                                                            r4hVar.r = z3eVar10;
                                                            z5 = true;
                                                            r4hVar.G = 1;
                                                            obj6 = tlVar.invoke(null, null, r4hVar);
                                                            break;
                                                        } else {
                                                            if (!z2 || this.j) {
                                                                z4 = true;
                                                            } else {
                                                                z4 = true;
                                                                this.d = true;
                                                            }
                                                            if (z && !this.k) {
                                                                this.e = z4;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            arrayList = new ArrayList(list.size());
                                            arrayList2 = new ArrayList(list.size());
                                            if (i2 != 0) {
                                                int i16 = 0;
                                                while (i16 < list.size() - 1 && ((zvj) list.get(i16)).b.isEmpty()) {
                                                    i16++;
                                                }
                                                num = new Integer(i16);
                                                zvjVar = (zvj) list.get(i16);
                                                int size = list.size() - 1;
                                                while (size > 0 && ((zvj) list.get(size)).b.isEmpty()) {
                                                    size--;
                                                }
                                                num2 = new Integer(size);
                                                zvjVar2 = (zvj) list.get(size);
                                            } else {
                                                zvjVar = null;
                                                num = null;
                                                zvjVar2 = null;
                                                num2 = null;
                                            }
                                            if (z || this.k) {
                                                z3eVar2 = z3eVar;
                                                if (i2 != 0) {
                                                    num.getClass();
                                                    Integer num11 = num2;
                                                    z3eVar4 = z3eVar2;
                                                    intValue = num.intValue();
                                                    num4 = num11;
                                                    zvj zvjVar23 = zvjVar2;
                                                    num5 = num;
                                                    zvjVar7 = zvjVar23;
                                                    arrayList9 = arrayList2;
                                                    arrayList10 = arrayList;
                                                    zvjVar8 = zvjVar;
                                                    i4 = 0;
                                                    if (i4 < intValue) {
                                                        arrayList13 = arrayList24;
                                                        zvj zvjVar24 = (zvj) z3eVar4.b.get(i4);
                                                        r4hVar.r = z3eVar4;
                                                        r4hVar.s = arrayList10;
                                                        r4hVar.t = arrayList9;
                                                        r4hVar.u = zvjVar8;
                                                        r4hVar.v = num5;
                                                        r4hVar.w = zvjVar7;
                                                        r4hVar.x = num4;
                                                        r4hVar.y = arrayList10;
                                                        r4hVar.z = null;
                                                        r4hVar.A = z2;
                                                        r4hVar.B = i2;
                                                        r4hVar.C = i4;
                                                        r4hVar.D = intValue;
                                                        r4hVar.G = 3;
                                                        Object F = cga.F(zvjVar24, tlVar, r4hVar);
                                                        if (F != lu3Var) {
                                                            arrayList14 = arrayList10;
                                                            zvjVar12 = zvjVar8;
                                                            obj6 = F;
                                                            i6 = i2;
                                                            zvjVar13 = zvjVar7;
                                                            arrayList15 = arrayList14;
                                                            arrayList15.add(obj6);
                                                            i4++;
                                                            zvjVar7 = zvjVar13;
                                                            zvjVar8 = zvjVar12;
                                                            i2 = i6;
                                                            arrayList10 = arrayList14;
                                                            arrayList24 = arrayList13;
                                                            if (i4 < intValue) {
                                                                arrayList6 = arrayList24;
                                                                if (z3eVar4.a != sfb.c || arrayList6.isEmpty()) {
                                                                    z6 = z2;
                                                                    i5 = i2;
                                                                    arrayList11 = arrayList9;
                                                                    arrayList12 = arrayList10;
                                                                    z3eVar5 = z3eVar4;
                                                                    zvjVar8.getClass();
                                                                    arrayList11.add(d(zvjVar8));
                                                                    r4hVar.r = z3eVar5;
                                                                    r4hVar.s = arrayList12;
                                                                    r4hVar.t = arrayList11;
                                                                    r4hVar.u = num5;
                                                                    r4hVar.v = zvjVar7;
                                                                    r4hVar.w = num4;
                                                                    r4hVar.x = arrayList12;
                                                                    r4hVar.y = null;
                                                                    r4hVar.z = null;
                                                                    r4hVar.A = z6;
                                                                    r4hVar.B = i5;
                                                                    r4hVar.G = 5;
                                                                    obj6 = cga.F(zvjVar8, tlVar, r4hVar);
                                                                    if (obj6 != lu3Var) {
                                                                        arrayList16 = arrayList12;
                                                                        arrayList12.add(obj6);
                                                                        List list2 = z3eVar5.b;
                                                                        int intValue4 = num5.intValue();
                                                                        num4.getClass();
                                                                        it = list2.subList(intValue4, num4.intValue() + 1).iterator();
                                                                        if (it.hasNext()) {
                                                                            a70.m("Empty collection can't be reduced.");
                                                                            break;
                                                                        } else {
                                                                            next = it.next();
                                                                            zvjVar2 = zvjVar7;
                                                                            it2 = it;
                                                                            if (it2.hasNext()) {
                                                                                zvj zvjVar25 = (zvj) it2.next();
                                                                                zvj zvjVar26 = (zvj) next;
                                                                                if (zvjVar25.b.isEmpty()) {
                                                                                    zvj zvjVar27 = zvjVar2;
                                                                                    zvjVar14 = zvjVar25;
                                                                                    i7 = i5;
                                                                                    z3eVar7 = z3eVar5;
                                                                                    zvjVar17 = zvjVar27;
                                                                                    arrayList19 = arrayList11;
                                                                                    it4 = it2;
                                                                                    zvjVar16 = zvjVar26;
                                                                                    arrayList17 = arrayList16;
                                                                                    num9 = num4;
                                                                                    if (!zvjVar14.b.isEmpty()) {
                                                                                    }
                                                                                    r4hVar.r = z3eVar7;
                                                                                    r4hVar.s = arrayList17;
                                                                                    r4hVar.t = arrayList19;
                                                                                    r4hVar.u = zvjVar17;
                                                                                    r4hVar.v = num9;
                                                                                    r4hVar.w = it4;
                                                                                    r4hVar.x = zvjVar14;
                                                                                    r4hVar.y = zvjVar16;
                                                                                    r4hVar.z = arrayList17;
                                                                                    r4hVar.A = z6;
                                                                                    r4hVar.B = i7;
                                                                                    r4hVar.G = 7;
                                                                                    obj6 = cga.F(zvjVar14, tlVar, r4hVar);
                                                                                    if (obj6 != lu3Var) {
                                                                                    }
                                                                                } else {
                                                                                    Object h0 = CollectionsKt.h0(zvjVar26.b);
                                                                                    Object Y = CollectionsKt.Y(zvjVar25.b);
                                                                                    r4hVar.r = z3eVar5;
                                                                                    r4hVar.s = arrayList16;
                                                                                    r4hVar.t = arrayList11;
                                                                                    r4hVar.u = zvjVar2;
                                                                                    r4hVar.v = num4;
                                                                                    r4hVar.w = it2;
                                                                                    r4hVar.x = zvjVar25;
                                                                                    r4hVar.y = zvjVar26;
                                                                                    r4hVar.z = null;
                                                                                    r4hVar.A = z6;
                                                                                    r4hVar.B = i5;
                                                                                    r4hVar.G = 6;
                                                                                    Object invoke2 = tlVar.invoke(h0, Y, r4hVar);
                                                                                    if (invoke2 != lu3Var) {
                                                                                        Integer num12 = num4;
                                                                                        obj3 = invoke2;
                                                                                        num8 = num12;
                                                                                        zvjVar15 = zvjVar2;
                                                                                        z3eVar6 = z3eVar5;
                                                                                        zvjVar14 = zvjVar25;
                                                                                        it3 = it2;
                                                                                        arrayList18 = arrayList11;
                                                                                        zvjVar16 = zvjVar26;
                                                                                        arrayList17 = arrayList16;
                                                                                        sfbVar = z3eVar6.a;
                                                                                        sfbVar2 = sfb.b;
                                                                                        if (sfbVar != sfbVar2) {
                                                                                            it5 = it3;
                                                                                            i8 = zvjVar16.c;
                                                                                        } else {
                                                                                            it5 = it3;
                                                                                            i8 = zvjVar14.c;
                                                                                        }
                                                                                        if (sfbVar != sfbVar2) {
                                                                                            List list3 = zvjVar14.d;
                                                                                            if (list3 != null) {
                                                                                                intValue2 = ((Number) CollectionsKt.Y(list3)).intValue();
                                                                                            } else {
                                                                                                i9 = i8;
                                                                                                i10 = 0;
                                                                                                cga.n(arrayList17, obj3, zvjVar16, zvjVar14, i9, i10);
                                                                                                it4 = it5;
                                                                                                i7 = i5;
                                                                                                num9 = num8;
                                                                                                z3eVar7 = z3eVar6;
                                                                                                arrayList19 = arrayList18;
                                                                                                zvjVar17 = zvjVar15;
                                                                                                if (!zvjVar14.b.isEmpty()) {
                                                                                                    arrayList19.add(d(zvjVar14));
                                                                                                }
                                                                                                r4hVar.r = z3eVar7;
                                                                                                r4hVar.s = arrayList17;
                                                                                                r4hVar.t = arrayList19;
                                                                                                r4hVar.u = zvjVar17;
                                                                                                r4hVar.v = num9;
                                                                                                r4hVar.w = it4;
                                                                                                r4hVar.x = zvjVar14;
                                                                                                r4hVar.y = zvjVar16;
                                                                                                r4hVar.z = arrayList17;
                                                                                                r4hVar.A = z6;
                                                                                                r4hVar.B = i7;
                                                                                                r4hVar.G = 7;
                                                                                                obj6 = cga.F(zvjVar14, tlVar, r4hVar);
                                                                                                if (obj6 != lu3Var) {
                                                                                                    z3e z3eVar11 = z3eVar7;
                                                                                                    i5 = i7;
                                                                                                    z3eVar8 = z3eVar11;
                                                                                                    num4 = num9;
                                                                                                    arrayList16 = arrayList17;
                                                                                                    arrayList17.add(obj6);
                                                                                                    next = zvjVar14.b.isEmpty() ? zvjVar14 : zvjVar16;
                                                                                                    it2 = it4;
                                                                                                    zvjVar2 = zvjVar17;
                                                                                                    arrayList11 = arrayList19;
                                                                                                    z3eVar5 = z3eVar8;
                                                                                                    if (it2.hasNext()) {
                                                                                                        if (z3eVar5.a == sfb.b && !arrayList6.isEmpty()) {
                                                                                                            zvj zvjVar28 = (zvj) CollectionsKt.Y(arrayList6);
                                                                                                            zvjVar2.getClass();
                                                                                                            Object h02 = CollectionsKt.h0(zvjVar2.b);
                                                                                                            Object Y2 = CollectionsKt.Y(zvjVar28.b);
                                                                                                            r4hVar.r = z3eVar5;
                                                                                                            r4hVar.s = arrayList16;
                                                                                                            r4hVar.t = arrayList11;
                                                                                                            r4hVar.u = zvjVar2;
                                                                                                            r4hVar.v = num4;
                                                                                                            r4hVar.w = zvjVar28;
                                                                                                            r4hVar.x = null;
                                                                                                            r4hVar.y = null;
                                                                                                            r4hVar.z = null;
                                                                                                            r4hVar.A = z6;
                                                                                                            r4hVar.B = i5;
                                                                                                            r4hVar.G = 8;
                                                                                                            Object invoke3 = tlVar.invoke(h02, Y2, r4hVar);
                                                                                                            if (invoke3 != lu3Var) {
                                                                                                                num10 = num4;
                                                                                                                zvjVar18 = zvjVar2;
                                                                                                                obj4 = invoke3;
                                                                                                                zvjVar19 = zvjVar28;
                                                                                                                arrayList20 = arrayList11;
                                                                                                                ArrayList arrayList25 = arrayList16;
                                                                                                                int i17 = zvjVar18.c;
                                                                                                                List list4 = zvjVar18.d;
                                                                                                                cga.n(arrayList25, obj4, zvjVar18, zvjVar19, i17, list4 == null ? ((Number) CollectionsKt.h0(list4)).intValue() : b.i(zvjVar18.b));
                                                                                                                num4 = num10;
                                                                                                                arrayList11 = arrayList20;
                                                                                                                arrayList16 = arrayList25;
                                                                                                                zvjVar2 = zvjVar18;
                                                                                                            }
                                                                                                        }
                                                                                                        z2 = z6;
                                                                                                        intValue3 = num4.intValue() + 1;
                                                                                                        i11 = b.i(z3eVar5.b);
                                                                                                        if (intValue3 > i11) {
                                                                                                            i12 = intValue3;
                                                                                                            arrayList21 = arrayList11;
                                                                                                            z3eVar9 = z3eVar5;
                                                                                                            z7 = z2;
                                                                                                            zvjVar20 = zvjVar2;
                                                                                                            i13 = i5;
                                                                                                            i14 = i11;
                                                                                                            zvj zvjVar29 = (zvj) z3eVar9.b.get(i12);
                                                                                                            r4hVar.r = z3eVar9;
                                                                                                            r4hVar.s = arrayList16;
                                                                                                            r4hVar.t = arrayList21;
                                                                                                            r4hVar.u = zvjVar20;
                                                                                                            r4hVar.v = arrayList16;
                                                                                                            r4hVar.w = null;
                                                                                                            r4hVar.x = null;
                                                                                                            r4hVar.y = null;
                                                                                                            r4hVar.z = null;
                                                                                                            r4hVar.A = z7;
                                                                                                            r4hVar.B = i13;
                                                                                                            r4hVar.C = i12;
                                                                                                            r4hVar.D = i14;
                                                                                                            r4hVar.G = 9;
                                                                                                            obj6 = cga.F(zvjVar29, tlVar, r4hVar);
                                                                                                            if (obj6 != lu3Var) {
                                                                                                                arrayList23 = arrayList16;
                                                                                                                arrayList16.add(obj6);
                                                                                                                if (i12 != i14) {
                                                                                                                    r4hVar2 = r4hVar;
                                                                                                                    arrayList8 = arrayList23;
                                                                                                                    z3eVar3 = z3eVar9;
                                                                                                                    z2 = z7;
                                                                                                                    arrayList7 = arrayList21;
                                                                                                                    i2 = i13;
                                                                                                                    zvjVar2 = zvjVar20;
                                                                                                                    t4hVar = this;
                                                                                                                    if (z2 && !t4hVar.j) {
                                                                                                                        t4hVar.j = true;
                                                                                                                        if (i2 == 0) {
                                                                                                                            zvjVar21 = (zvj) CollectionsKt.h0(arrayList6);
                                                                                                                        } else {
                                                                                                                            zvjVar2.getClass();
                                                                                                                            zvjVar21 = zvjVar2;
                                                                                                                        }
                                                                                                                        Object h03 = CollectionsKt.h0(zvjVar21.b);
                                                                                                                        r4hVar2.r = z3eVar3;
                                                                                                                        r4hVar2.s = arrayList8;
                                                                                                                        r4hVar2.t = arrayList7;
                                                                                                                        r4hVar2.u = zvjVar21;
                                                                                                                        r4hVar2.v = arrayList8;
                                                                                                                        r4hVar2.w = null;
                                                                                                                        r4hVar2.x = null;
                                                                                                                        r4hVar2.y = null;
                                                                                                                        r4hVar2.z = null;
                                                                                                                        r4hVar2.G = 10;
                                                                                                                        invoke = tlVar.invoke(h03, null, r4hVar2);
                                                                                                                        if (invoke != lu3Var) {
                                                                                                                            obj5 = invoke;
                                                                                                                            arrayList22 = arrayList8;
                                                                                                                            zvjVar22 = zvjVar21;
                                                                                                                            int i18 = zvjVar22.c;
                                                                                                                            List list5 = zvjVar22.d;
                                                                                                                            cga.n(arrayList22, obj5, zvjVar22, null, i18, list5 == null ? ((Number) CollectionsKt.h0(list5)).intValue() : b.i(zvjVar22.b));
                                                                                                                        }
                                                                                                                    }
                                                                                                                    ArrayList arrayList26 = arrayList8;
                                                                                                                    t4hVar.d = false;
                                                                                                                    t4hVar.e = false;
                                                                                                                    if (z3eVar3.a != sfb.c) {
                                                                                                                        arrayList6.addAll(arrayList7);
                                                                                                                    } else {
                                                                                                                        arrayList6.addAll(0, arrayList7);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                } else {
                                                                                                                    i12++;
                                                                                                                    arrayList16 = arrayList23;
                                                                                                                    zvj zvjVar292 = (zvj) z3eVar9.b.get(i12);
                                                                                                                    r4hVar.r = z3eVar9;
                                                                                                                    r4hVar.s = arrayList16;
                                                                                                                    r4hVar.t = arrayList21;
                                                                                                                    r4hVar.u = zvjVar20;
                                                                                                                    r4hVar.v = arrayList16;
                                                                                                                    r4hVar.w = null;
                                                                                                                    r4hVar.x = null;
                                                                                                                    r4hVar.y = null;
                                                                                                                    r4hVar.z = null;
                                                                                                                    r4hVar.A = z7;
                                                                                                                    r4hVar.B = i13;
                                                                                                                    r4hVar.C = i12;
                                                                                                                    r4hVar.D = i14;
                                                                                                                    r4hVar.G = 9;
                                                                                                                    obj6 = cga.F(zvjVar292, tlVar, r4hVar);
                                                                                                                    if (obj6 != lu3Var) {
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            r4hVar2 = r4hVar;
                                                                                                            arrayList7 = arrayList11;
                                                                                                            z3eVar3 = z3eVar5;
                                                                                                            i2 = i5;
                                                                                                            arrayList8 = arrayList16;
                                                                                                            t4hVar = this;
                                                                                                            if (z2) {
                                                                                                                t4hVar.j = true;
                                                                                                                if (i2 == 0) {
                                                                                                                }
                                                                                                                Object h032 = CollectionsKt.h0(zvjVar21.b);
                                                                                                                r4hVar2.r = z3eVar3;
                                                                                                                r4hVar2.s = arrayList8;
                                                                                                                r4hVar2.t = arrayList7;
                                                                                                                r4hVar2.u = zvjVar21;
                                                                                                                r4hVar2.v = arrayList8;
                                                                                                                r4hVar2.w = null;
                                                                                                                r4hVar2.x = null;
                                                                                                                r4hVar2.y = null;
                                                                                                                r4hVar2.z = null;
                                                                                                                r4hVar2.G = 10;
                                                                                                                invoke = tlVar.invoke(h032, null, r4hVar2);
                                                                                                                if (invoke != lu3Var) {
                                                                                                                }
                                                                                                            }
                                                                                                            ArrayList arrayList262 = arrayList8;
                                                                                                            t4hVar.d = false;
                                                                                                            t4hVar.e = false;
                                                                                                            if (z3eVar3.a != sfb.c) {
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            List list6 = zvjVar16.d;
                                                                                            intValue2 = list6 != null ? ((Number) CollectionsKt.h0(list6)).intValue() : b.i(zvjVar16.b);
                                                                                        }
                                                                                        i10 = intValue2;
                                                                                        i9 = i8;
                                                                                        cga.n(arrayList17, obj3, zvjVar16, zvjVar14, i9, i10);
                                                                                        it4 = it5;
                                                                                        i7 = i5;
                                                                                        num9 = num8;
                                                                                        z3eVar7 = z3eVar6;
                                                                                        arrayList19 = arrayList18;
                                                                                        zvjVar17 = zvjVar15;
                                                                                        if (!zvjVar14.b.isEmpty()) {
                                                                                        }
                                                                                        r4hVar.r = z3eVar7;
                                                                                        r4hVar.s = arrayList17;
                                                                                        r4hVar.t = arrayList19;
                                                                                        r4hVar.u = zvjVar17;
                                                                                        r4hVar.v = num9;
                                                                                        r4hVar.w = it4;
                                                                                        r4hVar.x = zvjVar14;
                                                                                        r4hVar.y = zvjVar16;
                                                                                        r4hVar.z = arrayList17;
                                                                                        r4hVar.A = z6;
                                                                                        r4hVar.B = i7;
                                                                                        r4hVar.G = 7;
                                                                                        obj6 = cga.F(zvjVar14, tlVar, r4hVar);
                                                                                        if (obj6 != lu3Var) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    zvj zvjVar30 = (zvj) CollectionsKt.h0(arrayList6);
                                                                    Object h04 = CollectionsKt.h0(zvjVar30.b);
                                                                    zvjVar8.getClass();
                                                                    Object Y3 = CollectionsKt.Y(zvjVar8.b);
                                                                    r4hVar.r = z3eVar4;
                                                                    r4hVar.s = arrayList10;
                                                                    r4hVar.t = arrayList9;
                                                                    r4hVar.u = zvjVar8;
                                                                    r4hVar.v = num5;
                                                                    r4hVar.w = zvjVar7;
                                                                    r4hVar.x = num4;
                                                                    r4hVar.y = zvjVar30;
                                                                    r4hVar.z = null;
                                                                    r4hVar.A = z2;
                                                                    r4hVar.B = i2;
                                                                    r4hVar.G = 4;
                                                                    Object invoke4 = tlVar.invoke(h04, Y3, r4hVar);
                                                                    if (invoke4 != lu3Var) {
                                                                        z6 = z2;
                                                                        num6 = num5;
                                                                        zvjVar9 = zvjVar8;
                                                                        zvjVar10 = zvjVar7;
                                                                        zvjVar11 = zvjVar30;
                                                                        num7 = num4;
                                                                        obj2 = invoke4;
                                                                        i5 = i2;
                                                                        arrayList12 = arrayList10;
                                                                        ArrayList arrayList27 = arrayList9;
                                                                        int i19 = zvjVar9.c;
                                                                        List list7 = zvjVar9.d;
                                                                        cga.n(arrayList12, obj2, zvjVar11, zvjVar9, i19, list7 == null ? ((Number) CollectionsKt.Y(list7)).intValue() : 0);
                                                                        num4 = num7;
                                                                        zvjVar7 = zvjVar10;
                                                                        zvjVar8 = zvjVar9;
                                                                        arrayList11 = arrayList27;
                                                                        num5 = num6;
                                                                        z3eVar5 = z3eVar4;
                                                                        zvjVar8.getClass();
                                                                        arrayList11.add(d(zvjVar8));
                                                                        r4hVar.r = z3eVar5;
                                                                        r4hVar.s = arrayList12;
                                                                        r4hVar.t = arrayList11;
                                                                        r4hVar.u = num5;
                                                                        r4hVar.v = zvjVar7;
                                                                        r4hVar.w = num4;
                                                                        r4hVar.x = arrayList12;
                                                                        r4hVar.y = null;
                                                                        r4hVar.z = null;
                                                                        r4hVar.A = z6;
                                                                        r4hVar.B = i5;
                                                                        r4hVar.G = 5;
                                                                        obj6 = cga.F(zvjVar8, tlVar, r4hVar);
                                                                        if (obj6 != lu3Var) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    arrayList6 = arrayList24;
                                                    r4hVar2 = r4hVar;
                                                    arrayList7 = arrayList2;
                                                    z3eVar3 = z3eVar2;
                                                    arrayList8 = arrayList;
                                                    t4hVar = this;
                                                    if (z2) {
                                                    }
                                                    ArrayList arrayList2622 = arrayList8;
                                                    t4hVar.d = false;
                                                    t4hVar.e = false;
                                                    if (z3eVar3.a != sfb.c) {
                                                    }
                                                }
                                            } else {
                                                this.k = true;
                                                if (i2 != 0) {
                                                    zvjVar3 = (zvj) CollectionsKt.Y(arrayList24);
                                                } else {
                                                    zvjVar.getClass();
                                                    zvjVar3 = zvjVar;
                                                }
                                                Object Y4 = CollectionsKt.Y(zvjVar3.b);
                                                r4hVar.r = z3eVar10;
                                                r4hVar.s = arrayList;
                                                r4hVar.t = arrayList2;
                                                r4hVar.u = zvjVar;
                                                r4hVar.v = num;
                                                r4hVar.w = zvjVar2;
                                                r4hVar.x = num2;
                                                r4hVar.y = zvjVar3;
                                                r4hVar.z = arrayList;
                                                r4hVar.A = z2;
                                                r4hVar.B = i2;
                                                r4hVar.G = 2;
                                                Object invoke5 = tlVar.invoke(null, Y4, r4hVar);
                                                if (invoke5 != lu3Var) {
                                                    z3eVar2 = z3eVar;
                                                    arrayList3 = arrayList;
                                                    zvjVar4 = zvjVar;
                                                    z3 = z2;
                                                    i3 = i2;
                                                    arrayList4 = arrayList2;
                                                    arrayList5 = arrayList3;
                                                    num3 = num;
                                                    zvjVar5 = zvjVar2;
                                                    zvjVar6 = zvjVar3;
                                                    obj = invoke5;
                                                    int i20 = zvjVar6.c;
                                                    List list8 = zvjVar6.d;
                                                    cga.n(arrayList5, obj, null, zvjVar6, i20, list8 == null ? ((Number) CollectionsKt.Y(list8)).intValue() : 0);
                                                    zvjVar2 = zvjVar5;
                                                    z2 = z3;
                                                    num = num3;
                                                    i2 = i3;
                                                    zvjVar = zvjVar4;
                                                    arrayList2 = arrayList4;
                                                    arrayList = arrayList3;
                                                    if (i2 != 0) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        a70.p("Additional prepend event after prepend state is done");
                                        break;
                                    }
                                }
                            }
                        }
                        i2 = 1;
                        if (this.k) {
                        }
                        if (!this.j) {
                        }
                        this.f.B(rfbVar2);
                        this.g = rfbVar;
                        if (sfbVar3 != sfb.c) {
                        }
                        if (sfbVar3 != sfb.b) {
                        }
                        if (i2 != 0) {
                        }
                        arrayList = new ArrayList(list.size());
                        arrayList2 = new ArrayList(list.size());
                        if (i2 != 0) {
                        }
                        if (z) {
                        }
                        z3eVar2 = z3eVar;
                        if (i2 != 0) {
                        }
                        break;
                    case 1:
                        z3eVar10 = r4hVar.r;
                        y6a.M(obj6);
                        z5 = true;
                        this.d = false;
                        this.e = false;
                        this.k = z5;
                        this.j = z5;
                        if (obj6 != null) {
                            break;
                        } else {
                            z3eVar10.getClass();
                            break;
                        }
                    case 2:
                        int i21 = r4hVar.B;
                        z3 = r4hVar.A;
                        arrayList5 = r4hVar.z;
                        zvj zvjVar31 = (zvj) r4hVar.y;
                        Integer num13 = (Integer) r4hVar.x;
                        zvj zvjVar32 = (zvj) r4hVar.w;
                        Integer num14 = (Integer) r4hVar.v;
                        zvj zvjVar33 = (zvj) r4hVar.u;
                        ArrayList arrayList28 = r4hVar.t;
                        ArrayList arrayList29 = r4hVar.s;
                        i3 = i21;
                        z3eVar2 = r4hVar.r;
                        y6a.M(obj6);
                        obj = obj6;
                        zvjVar5 = zvjVar32;
                        zvjVar6 = zvjVar31;
                        zvjVar4 = zvjVar33;
                        arrayList4 = arrayList28;
                        arrayList3 = arrayList29;
                        num2 = num13;
                        num3 = num14;
                        int i202 = zvjVar6.c;
                        List list82 = zvjVar6.d;
                        cga.n(arrayList5, obj, null, zvjVar6, i202, list82 == null ? ((Number) CollectionsKt.Y(list82)).intValue() : 0);
                        zvjVar2 = zvjVar5;
                        z2 = z3;
                        num = num3;
                        i2 = i3;
                        zvjVar = zvjVar4;
                        arrayList2 = arrayList4;
                        arrayList = arrayList3;
                        if (i2 != 0) {
                        }
                        break;
                    case 3:
                        int i22 = r4hVar.D;
                        i4 = r4hVar.C;
                        int i23 = r4hVar.B;
                        boolean z8 = r4hVar.A;
                        arrayList15 = (ArrayList) r4hVar.y;
                        Integer num15 = (Integer) r4hVar.x;
                        zvjVar13 = (zvj) r4hVar.w;
                        Integer num16 = (Integer) r4hVar.v;
                        zvjVar12 = (zvj) r4hVar.u;
                        ArrayList arrayList30 = r4hVar.t;
                        ArrayList arrayList31 = r4hVar.s;
                        z3e z3eVar12 = r4hVar.r;
                        y6a.M(obj6);
                        arrayList13 = arrayList24;
                        arrayList14 = arrayList31;
                        i6 = i23;
                        z2 = z8;
                        num4 = num15;
                        num5 = num16;
                        arrayList9 = arrayList30;
                        z3eVar4 = z3eVar12;
                        intValue = i22;
                        arrayList15.add(obj6);
                        i4++;
                        zvjVar7 = zvjVar13;
                        zvjVar8 = zvjVar12;
                        i2 = i6;
                        arrayList10 = arrayList14;
                        arrayList24 = arrayList13;
                        if (i4 < intValue) {
                        }
                        break;
                    case 4:
                        i5 = r4hVar.B;
                        z6 = r4hVar.A;
                        zvj zvjVar34 = (zvj) r4hVar.y;
                        Integer num17 = (Integer) r4hVar.x;
                        zvj zvjVar35 = (zvj) r4hVar.w;
                        Integer num18 = (Integer) r4hVar.v;
                        zvj zvjVar36 = (zvj) r4hVar.u;
                        arrayList9 = r4hVar.t;
                        arrayList10 = r4hVar.s;
                        z3eVar4 = r4hVar.r;
                        y6a.M(obj6);
                        arrayList6 = arrayList24;
                        num7 = num17;
                        num6 = num18;
                        zvjVar9 = zvjVar36;
                        obj2 = obj6;
                        zvjVar10 = zvjVar35;
                        zvjVar11 = zvjVar34;
                        arrayList12 = arrayList10;
                        ArrayList arrayList272 = arrayList9;
                        int i192 = zvjVar9.c;
                        List list72 = zvjVar9.d;
                        cga.n(arrayList12, obj2, zvjVar11, zvjVar9, i192, list72 == null ? ((Number) CollectionsKt.Y(list72)).intValue() : 0);
                        num4 = num7;
                        zvjVar7 = zvjVar10;
                        zvjVar8 = zvjVar9;
                        arrayList11 = arrayList272;
                        num5 = num6;
                        z3eVar5 = z3eVar4;
                        zvjVar8.getClass();
                        arrayList11.add(d(zvjVar8));
                        r4hVar.r = z3eVar5;
                        r4hVar.s = arrayList12;
                        r4hVar.t = arrayList11;
                        r4hVar.u = num5;
                        r4hVar.v = zvjVar7;
                        r4hVar.w = num4;
                        r4hVar.x = arrayList12;
                        r4hVar.y = null;
                        r4hVar.z = null;
                        r4hVar.A = z6;
                        r4hVar.B = i5;
                        r4hVar.G = 5;
                        obj6 = cga.F(zvjVar8, tlVar, r4hVar);
                        if (obj6 != lu3Var) {
                        }
                        break;
                    case 5:
                        i5 = r4hVar.B;
                        z6 = r4hVar.A;
                        arrayList12 = (ArrayList) r4hVar.x;
                        num4 = (Integer) r4hVar.w;
                        zvjVar7 = (zvj) r4hVar.v;
                        num5 = (Integer) r4hVar.u;
                        arrayList11 = r4hVar.t;
                        arrayList16 = r4hVar.s;
                        z3eVar5 = r4hVar.r;
                        y6a.M(obj6);
                        arrayList6 = arrayList24;
                        arrayList12.add(obj6);
                        List list22 = z3eVar5.b;
                        int intValue42 = num5.intValue();
                        num4.getClass();
                        it = list22.subList(intValue42, num4.intValue() + 1).iterator();
                        if (it.hasNext()) {
                        }
                        break;
                    case 6:
                        i5 = r4hVar.B;
                        z6 = r4hVar.A;
                        zvj zvjVar37 = (zvj) r4hVar.y;
                        zvj zvjVar38 = (zvj) r4hVar.x;
                        Iterator it7 = (Iterator) r4hVar.w;
                        Integer num19 = (Integer) r4hVar.v;
                        zvj zvjVar39 = (zvj) r4hVar.u;
                        ArrayList arrayList32 = r4hVar.t;
                        ArrayList arrayList33 = r4hVar.s;
                        z3eVar6 = r4hVar.r;
                        y6a.M(obj6);
                        obj3 = obj6;
                        num8 = num19;
                        zvjVar14 = zvjVar38;
                        arrayList6 = arrayList24;
                        it3 = it7;
                        zvjVar15 = zvjVar39;
                        zvjVar16 = zvjVar37;
                        arrayList17 = arrayList33;
                        arrayList18 = arrayList32;
                        sfbVar = z3eVar6.a;
                        sfbVar2 = sfb.b;
                        if (sfbVar != sfbVar2) {
                        }
                        if (sfbVar != sfbVar2) {
                        }
                        i10 = intValue2;
                        i9 = i8;
                        cga.n(arrayList17, obj3, zvjVar16, zvjVar14, i9, i10);
                        it4 = it5;
                        i7 = i5;
                        num9 = num8;
                        z3eVar7 = z3eVar6;
                        arrayList19 = arrayList18;
                        zvjVar17 = zvjVar15;
                        if (!zvjVar14.b.isEmpty()) {
                        }
                        r4hVar.r = z3eVar7;
                        r4hVar.s = arrayList17;
                        r4hVar.t = arrayList19;
                        r4hVar.u = zvjVar17;
                        r4hVar.v = num9;
                        r4hVar.w = it4;
                        r4hVar.x = zvjVar14;
                        r4hVar.y = zvjVar16;
                        r4hVar.z = arrayList17;
                        r4hVar.A = z6;
                        r4hVar.B = i7;
                        r4hVar.G = 7;
                        obj6 = cga.F(zvjVar14, tlVar, r4hVar);
                        if (obj6 != lu3Var) {
                        }
                        break;
                    case 7:
                        int i24 = r4hVar.B;
                        z6 = r4hVar.A;
                        arrayList17 = r4hVar.z;
                        zvjVar16 = (zvj) r4hVar.y;
                        zvjVar14 = (zvj) r4hVar.x;
                        it4 = (Iterator) r4hVar.w;
                        Integer num20 = (Integer) r4hVar.v;
                        zvjVar17 = (zvj) r4hVar.u;
                        arrayList19 = r4hVar.t;
                        ArrayList arrayList34 = r4hVar.s;
                        z3e z3eVar13 = r4hVar.r;
                        y6a.M(obj6);
                        arrayList16 = arrayList34;
                        num4 = num20;
                        z3eVar8 = z3eVar13;
                        arrayList6 = arrayList24;
                        i5 = i24;
                        arrayList17.add(obj6);
                        if (zvjVar14.b.isEmpty()) {
                        }
                        it2 = it4;
                        zvjVar2 = zvjVar17;
                        arrayList11 = arrayList19;
                        z3eVar5 = z3eVar8;
                        if (it2.hasNext()) {
                        }
                        break;
                    case 8:
                        i5 = r4hVar.B;
                        z6 = r4hVar.A;
                        zvj zvjVar40 = (zvj) r4hVar.w;
                        Integer num21 = (Integer) r4hVar.v;
                        zvj zvjVar41 = (zvj) r4hVar.u;
                        ArrayList arrayList35 = r4hVar.t;
                        arrayList16 = r4hVar.s;
                        z3eVar5 = r4hVar.r;
                        y6a.M(obj6);
                        arrayList6 = arrayList24;
                        num10 = num21;
                        obj4 = obj6;
                        zvjVar18 = zvjVar41;
                        arrayList20 = arrayList35;
                        zvjVar19 = zvjVar40;
                        ArrayList arrayList252 = arrayList16;
                        int i172 = zvjVar18.c;
                        List list42 = zvjVar18.d;
                        cga.n(arrayList252, obj4, zvjVar18, zvjVar19, i172, list42 == null ? ((Number) CollectionsKt.h0(list42)).intValue() : b.i(zvjVar18.b));
                        num4 = num10;
                        arrayList11 = arrayList20;
                        arrayList16 = arrayList252;
                        zvjVar2 = zvjVar18;
                        z2 = z6;
                        intValue3 = num4.intValue() + 1;
                        i11 = b.i(z3eVar5.b);
                        if (intValue3 > i11) {
                        }
                        break;
                    case 9:
                        i14 = r4hVar.D;
                        i12 = r4hVar.C;
                        i13 = r4hVar.B;
                        z7 = r4hVar.A;
                        arrayList16 = (ArrayList) r4hVar.v;
                        zvjVar20 = (zvj) r4hVar.u;
                        arrayList21 = r4hVar.t;
                        arrayList23 = r4hVar.s;
                        z3eVar9 = r4hVar.r;
                        y6a.M(obj6);
                        arrayList6 = arrayList24;
                        arrayList16.add(obj6);
                        if (i12 != i14) {
                        }
                        break;
                    case 10:
                        ?? r1 = (List) r4hVar.v;
                        zvj zvjVar42 = (zvj) r4hVar.u;
                        arrayList7 = r4hVar.t;
                        ArrayList arrayList36 = r4hVar.s;
                        z3eVar3 = r4hVar.r;
                        y6a.M(obj6);
                        arrayList22 = r1;
                        arrayList8 = arrayList36;
                        obj5 = obj6;
                        zvjVar22 = zvjVar42;
                        arrayList6 = arrayList24;
                        t4hVar = this;
                        int i182 = zvjVar22.c;
                        List list52 = zvjVar22.d;
                        cga.n(arrayList22, obj5, zvjVar22, null, i182, list52 == null ? ((Number) CollectionsKt.h0(list52)).intValue() : b.i(zvjVar22.b));
                        ArrayList arrayList26222 = arrayList8;
                        t4hVar.d = false;
                        t4hVar.e = false;
                        if (z3eVar3.a != sfb.c) {
                        }
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                return null;
            }
        }
        r4hVar = new r4h(this, sq3Var);
        Object obj62 = r4hVar.E;
        lu3 lu3Var2 = lu3.a;
        i = r4hVar.G;
        ArrayList arrayList242 = this.c;
        tl tlVar2 = this.b;
        switch (i) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006d -> B:10:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(d4e d4eVar, sq3 sq3Var) {
        s4h s4hVar;
        int i;
        ArrayList u;
        int size;
        int i2;
        ArrayList arrayList;
        Object a0;
        if (sq3Var instanceof s4h) {
            s4hVar = (s4h) sq3Var;
            int i3 = s4hVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s4hVar.y = i3 - Integer.MIN_VALUE;
                Object obj = s4hVar.w;
                lu3 lu3Var = lu3.a;
                i = s4hVar.y;
                if (i != 0) {
                    u = fc6.u(obj);
                    size = d4eVar.a.size();
                    if (size >= 0) {
                        i2 = 0;
                        arrayList = u;
                        Object a02 = CollectionsKt.a0(i2 - 1, d4eVar.a);
                        a0 = CollectionsKt.a0(i2, d4eVar.a);
                        s4hVar.r = d4eVar;
                        s4hVar.s = arrayList;
                        s4hVar.t = a0;
                        s4hVar.u = i2;
                        s4hVar.v = size;
                        s4hVar.y = 1;
                        obj = this.b.invoke(a02, a0, s4hVar);
                        if (obj != lu3Var) {
                        }
                    }
                    d4eVar.getClass();
                    return new d4e(u);
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = s4hVar.v;
                int i5 = s4hVar.u;
                Object obj2 = s4hVar.t;
                ?? r5 = s4hVar.s;
                d4e d4eVar2 = s4hVar.r;
                y6a.M(obj);
                int i6 = i4;
                d4eVar = d4eVar2;
                a0 = obj2;
                ArrayList arrayList2 = r5;
                if (obj != null) {
                    arrayList2.add(obj);
                }
                if (a0 != null) {
                    arrayList2.add(a0);
                }
                if (i5 == i6) {
                    int i7 = i5 + 1;
                    size = i6;
                    i2 = i7;
                    arrayList = arrayList2;
                    Object a022 = CollectionsKt.a0(i2 - 1, d4eVar.a);
                    a0 = CollectionsKt.a0(i2, d4eVar.a);
                    s4hVar.r = d4eVar;
                    s4hVar.s = arrayList;
                    s4hVar.t = a0;
                    s4hVar.u = i2;
                    s4hVar.v = size;
                    s4hVar.y = 1;
                    obj = this.b.invoke(a022, a0, s4hVar);
                    if (obj != lu3Var) {
                        return lu3Var;
                    }
                    int i8 = i2;
                    i6 = size;
                    i5 = i8;
                    arrayList2 = arrayList;
                    if (obj != null) {
                    }
                    if (a0 != null) {
                    }
                    if (i5 == i6) {
                        u = arrayList2;
                        d4eVar.getClass();
                        return new d4e(u);
                    }
                }
            }
        }
        s4hVar = new s4h(this, sq3Var);
        Object obj3 = s4hVar.w;
        lu3 lu3Var2 = lu3.a;
        i = s4hVar.y;
        if (i != 0) {
        }
    }
}
