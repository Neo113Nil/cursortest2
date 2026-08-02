package se;

import eg.c0;
import eg.m0;
import eg.z;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public ic.a f23540b;

    /* renamed from: c, reason: collision with root package name */
    public ic.a f23541c;

    /* renamed from: d, reason: collision with root package name */
    public ic.a f23542d;

    /* renamed from: e, reason: collision with root package name */
    public ic.a f23543e;

    /* renamed from: f, reason: collision with root package name */
    public ic.a f23544f;

    /* renamed from: g, reason: collision with root package name */
    public ic.a f23545g;

    /* renamed from: h, reason: collision with root package name */
    public ic.a f23546h;

    /* renamed from: i, reason: collision with root package name */
    public ic.a f23547i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f23548k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f23549l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, p pVar, Continuation continuation) {
        super(2, continuation);
        this.f23548k = list;
        this.f23549l = pVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f23548k, this.f23549l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x02e8, code lost:
    
        if (r2 == r1) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x02bd, code lost:
    
        if (r3 != r1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0292  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v30, types: [ic.a, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v31, types: [ic.a, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v32, types: [ic.a, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v33, types: [ic.a, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        ic.a aVar;
        Object obj5;
        ic.a aVar2;
        Object obj6;
        Object obj7;
        ic.a aVar3;
        Object obj8;
        ic.a aVar4;
        Object obj9;
        Object obj10;
        Object obj11;
        ?? r12;
        ic.a aVar5;
        ic.a aVar6;
        ic.a aVar7;
        ic.a aVar8;
        ic.a aVar9;
        ic.a aVar10;
        ic.a aVar11;
        ic.a aVar12;
        ic.a aVar13;
        ?? r122;
        Object A;
        ic.a aVar14;
        ?? r123;
        Object A2;
        Object obj12 = lf.a.f20034a;
        int i5 = this.j;
        p pVar = this.f23549l;
        if (i5 == 0) {
            h8.b.B(obj);
            List list = this.f23548k;
            if (list == null) {
                return Unit.f19194a;
            }
            if (list.isEmpty()) {
                return Unit.f19194a;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                ic.a aVar15 = (ic.a) obj2;
                if (Intrinsics.areEqual(aVar15 != null ? aVar15.f11062i : null, pVar.f23576b)) {
                    break;
                }
            }
            ic.a aVar16 = (ic.a) obj2;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                ic.a aVar17 = (ic.a) obj3;
                if (Intrinsics.areEqual(aVar17 != null ? aVar17.f11062i : null, pVar.f23577c)) {
                    break;
                }
            }
            ic.a aVar18 = (ic.a) obj3;
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it3.next();
                ic.a aVar19 = (ic.a) obj4;
                if (Intrinsics.areEqual(aVar19 != null ? aVar19.f11062i : null, pVar.f23578d)) {
                    break;
                }
            }
            aVar = (ic.a) obj4;
            Iterator it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj5 = null;
                    break;
                }
                obj5 = it4.next();
                ic.a aVar20 = (ic.a) obj5;
                if (Intrinsics.areEqual(aVar20 != null ? aVar20.f11062i : null, pVar.f23579e)) {
                    break;
                }
            }
            aVar2 = (ic.a) obj5;
            Iterator it5 = list.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj6 = null;
                    break;
                }
                obj6 = it5.next();
                ic.a aVar21 = (ic.a) obj6;
                if (Intrinsics.areEqual(aVar21 != null ? aVar21.f11062i : null, pVar.f23580f)) {
                    break;
                }
            }
            ic.a aVar22 = (ic.a) obj6;
            Iterator it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj7 = null;
                    break;
                }
                obj7 = it6.next();
                ic.a aVar23 = (ic.a) obj7;
                if (Intrinsics.areEqual(aVar23 != null ? aVar23.f11062i : null, pVar.f23581g)) {
                    break;
                }
            }
            aVar3 = (ic.a) obj7;
            Iterator it7 = list.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj8 = null;
                    break;
                }
                obj8 = it7.next();
                ic.a aVar24 = (ic.a) obj8;
                if (Intrinsics.areEqual(aVar24 != null ? aVar24.f11062i : null, pVar.f23582h)) {
                    break;
                }
            }
            aVar4 = (ic.a) obj8;
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    obj9 = null;
                    break;
                }
                obj9 = it8.next();
                ic.a aVar25 = (ic.a) obj9;
                if (Intrinsics.areEqual(aVar25 != null ? aVar25.f11062i : null, pVar.f23583i)) {
                    break;
                }
            }
            ic.a aVar26 = (ic.a) obj9;
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    obj10 = null;
                    break;
                }
                obj10 = it9.next();
                ic.a aVar27 = (ic.a) obj10;
                if (Intrinsics.areEqual(aVar27 != null ? aVar27.f11062i : null, pVar.j)) {
                    break;
                }
            }
            ic.a aVar28 = (ic.a) obj10;
            Iterator it10 = list.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    obj11 = null;
                    break;
                }
                obj11 = it10.next();
                ic.a aVar29 = (ic.a) obj11;
                if (Intrinsics.areEqual(aVar29 != null ? aVar29.f11062i : null, pVar.f23584k)) {
                    break;
                }
            }
            ic.a aVar30 = (ic.a) obj11;
            this.f23540b = aVar;
            this.f23541c = aVar2;
            this.f23542d = aVar22;
            this.f23543e = aVar3;
            this.f23544f = aVar4;
            this.f23545g = aVar26;
            this.f23546h = aVar28;
            this.f23547i = aVar30;
            this.j = 1;
            lg.e eVar = m0.f9201a;
            r12 = 0;
            Object A3 = c0.A(lg.d.f20063c, new h(4, aVar16, aVar18, null, pVar), this);
            if (A3 != lf.a.f20034a) {
                A3 = Unit.f19194a;
            }
            if (A3 != obj12) {
                aVar5 = aVar22;
                aVar6 = aVar26;
                aVar7 = aVar28;
                aVar8 = aVar30;
            }
            return obj12;
        }
        if (i5 == 1) {
            aVar8 = this.f23547i;
            ic.a aVar31 = this.f23546h;
            ic.a aVar32 = this.f23545g;
            ic.a aVar33 = this.f23544f;
            ic.a aVar34 = this.f23543e;
            ic.a aVar35 = this.f23542d;
            aVar2 = this.f23541c;
            aVar = this.f23540b;
            h8.b.B(obj);
            aVar7 = aVar31;
            aVar6 = aVar32;
            aVar4 = aVar33;
            aVar3 = aVar34;
            aVar5 = aVar35;
            r12 = 0;
        } else {
            if (i5 == 2) {
                aVar8 = this.f23547i;
                ic.a aVar36 = this.f23546h;
                ic.a aVar37 = this.f23545g;
                ic.a aVar38 = this.f23544f;
                ic.a aVar39 = this.f23543e;
                aVar12 = this.f23542d;
                h8.b.B(obj);
                aVar10 = aVar36;
                aVar9 = aVar37;
                aVar13 = aVar38;
                aVar11 = aVar39;
                r122 = 0;
                this.f23540b = r122;
                this.f23541c = r122;
                this.f23542d = r122;
                this.f23543e = r122;
                this.f23544f = aVar13;
                this.f23545g = aVar9;
                this.f23546h = aVar10;
                this.f23547i = aVar8;
                this.j = 3;
                lg.e eVar2 = m0.f9201a;
                A = c0.A(lg.d.f20063c, new h(3, aVar12, aVar11, r122, pVar), this);
                if (A != lf.a.f20034a) {
                    A = Unit.f19194a;
                }
                if (A != obj12) {
                    aVar14 = aVar10;
                    r123 = r122;
                    ic.a aVar40 = aVar9;
                    ic.a aVar41 = aVar13;
                    this.f23540b = r123;
                    this.f23541c = r123;
                    this.f23542d = r123;
                    this.f23543e = r123;
                    this.f23544f = r123;
                    this.f23545g = r123;
                    this.f23546h = aVar14;
                    this.f23547i = aVar8;
                    this.j = 4;
                    lg.e eVar3 = m0.f9201a;
                    A2 = c0.A(lg.d.f20063c, new h(1, aVar41, aVar40, r123, pVar), this);
                    if (A2 != lf.a.f20034a) {
                    }
                }
                return obj12;
            }
            if (i5 == 3) {
                aVar8 = this.f23547i;
                ic.a aVar42 = this.f23546h;
                aVar9 = this.f23545g;
                aVar13 = this.f23544f;
                h8.b.B(obj);
                aVar14 = aVar42;
                r123 = 0;
                ic.a aVar402 = aVar9;
                ic.a aVar412 = aVar13;
                this.f23540b = r123;
                this.f23541c = r123;
                this.f23542d = r123;
                this.f23543e = r123;
                this.f23544f = r123;
                this.f23545g = r123;
                this.f23546h = aVar14;
                this.f23547i = aVar8;
                this.j = 4;
                lg.e eVar32 = m0.f9201a;
                A2 = c0.A(lg.d.f20063c, new h(1, aVar412, aVar402, r123, pVar), this);
                if (A2 != lf.a.f20034a) {
                    A2 = Unit.f19194a;
                }
            } else {
                if (i5 != 4) {
                    if (i5 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                aVar8 = this.f23547i;
                aVar14 = this.f23546h;
                h8.b.B(obj);
                r123 = 0;
                ic.a aVar43 = aVar8;
                ic.a aVar44 = aVar14;
                this.f23540b = r123;
                this.f23541c = r123;
                this.f23542d = r123;
                this.f23543e = r123;
                this.f23544f = r123;
                this.f23545g = r123;
                this.f23546h = r123;
                this.f23547i = r123;
                this.j = 5;
                lg.e eVar4 = m0.f9201a;
                Object A4 = c0.A(lg.d.f20063c, new h(0, aVar44, aVar43, r123, pVar), this);
                if (A4 != lf.a.f20034a) {
                    A4 = Unit.f19194a;
                }
            }
        }
        ic.a aVar45 = aVar2;
        ic.a aVar46 = aVar;
        this.f23540b = r12;
        this.f23541c = r12;
        this.f23542d = aVar5;
        this.f23543e = aVar3;
        this.f23544f = aVar4;
        this.f23545g = aVar6;
        this.f23546h = aVar7;
        this.f23547i = aVar8;
        this.j = 2;
        lg.e eVar5 = m0.f9201a;
        Object A5 = c0.A(lg.d.f20063c, new h(2, aVar46, aVar45, r12, pVar), this);
        if (A5 != lf.a.f20034a) {
            A5 = Unit.f19194a;
        }
        if (A5 != obj12) {
            ic.a aVar47 = aVar7;
            aVar9 = aVar6;
            aVar10 = aVar47;
            aVar11 = aVar3;
            aVar12 = aVar5;
            aVar13 = aVar4;
            r122 = r12;
            this.f23540b = r122;
            this.f23541c = r122;
            this.f23542d = r122;
            this.f23543e = r122;
            this.f23544f = aVar13;
            this.f23545g = aVar9;
            this.f23546h = aVar10;
            this.f23547i = aVar8;
            this.j = 3;
            lg.e eVar22 = m0.f9201a;
            A = c0.A(lg.d.f20063c, new h(3, aVar12, aVar11, r122, pVar), this);
            if (A != lf.a.f20034a) {
            }
            if (A != obj12) {
            }
        }
        return obj12;
    }
}
