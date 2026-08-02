package id;

import eg.c0;
import eg.m0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public x f11200b;

    /* renamed from: c, reason: collision with root package name */
    public x f11201c;

    /* renamed from: d, reason: collision with root package name */
    public x f11202d;

    /* renamed from: e, reason: collision with root package name */
    public x f11203e;

    /* renamed from: f, reason: collision with root package name */
    public x f11204f;

    /* renamed from: g, reason: collision with root package name */
    public int f11205g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f11206h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f11207i;
    public final /* synthetic */ mc.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(List list, x xVar, mc.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f11206h = list;
        this.f11207i = xVar;
        this.j = aVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new q(this.f11206h, this.f11207i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x xVar;
        x xVar2;
        x xVar3;
        x xVar4;
        x xVar5;
        Object obj2;
        Object A;
        x xVar6;
        x xVar7;
        Object obj3;
        Object obj4;
        x xVar8;
        x xVar9;
        x xVar10;
        Object obj5;
        Object obj6;
        x xVar11;
        x xVar12;
        Object obj7;
        boolean isEmpty;
        Object obj8;
        x xVar13;
        Object obj9;
        Object obj10;
        lf.a aVar = lf.a.f20034a;
        int i5 = 4;
        int i10 = 3;
        int i11 = 2;
        int i12 = 1;
        Continuation continuation = null;
        switch (this.f11205g) {
            case 0:
                h8.b.B(obj);
                List list = this.f11206h;
                if (list == null) {
                    return null;
                }
                xVar = this.f11207i;
                xVar.getClass();
                List f6 = x.f(list);
                mc.a aVar2 = this.j;
                this.f11200b = xVar;
                this.f11201c = xVar;
                this.f11202d = xVar;
                this.f11203e = xVar;
                this.f11204f = xVar;
                this.f11205g = 1;
                Object A2 = c0.A(m0.f9201a, new androidx.lifecycle.o(aVar2, f6, xVar, continuation, 14), this);
                if (A2 != aVar) {
                    xVar2 = xVar;
                    xVar3 = xVar2;
                    xVar4 = xVar3;
                    xVar5 = xVar4;
                    obj2 = A2;
                    this.f11200b = xVar5;
                    this.f11201c = xVar4;
                    this.f11202d = xVar;
                    this.f11203e = xVar3;
                    this.f11204f = null;
                    this.f11205g = 2;
                    xVar2.getClass();
                    A = c0.A(m0.f9201a, new r((List) obj2, continuation, 0), this);
                    if (A != aVar) {
                        xVar6 = xVar3;
                        xVar7 = xVar;
                        obj3 = A;
                        List list2 = (List) obj3;
                        this.f11200b = xVar5;
                        this.f11201c = xVar4;
                        this.f11202d = xVar7;
                        this.f11203e = null;
                        this.f11205g = 3;
                        xVar6.getClass();
                        obj4 = list2;
                        if (!da.r.e()) {
                            obj4 = c0.A(m0.f9201a, new r(list2, continuation, i11), this);
                        }
                        if (obj4 != aVar) {
                            xVar8 = xVar7;
                            xVar9 = xVar4;
                            xVar10 = xVar5;
                            obj5 = obj4;
                            List list3 = (List) obj5;
                            this.f11200b = xVar10;
                            this.f11201c = xVar9;
                            this.f11202d = null;
                            this.f11205g = 4;
                            xVar8.getClass();
                            obj6 = list3;
                            if (!da.r.e()) {
                                obj6 = c0.A(m0.f9201a, new r(list3, continuation, i10), this);
                            }
                            if (obj6 != aVar) {
                                xVar11 = xVar9;
                                xVar12 = xVar10;
                                obj7 = obj6;
                                List list4 = (List) obj7;
                                this.f11200b = xVar12;
                                this.f11201c = null;
                                this.f11205g = 5;
                                xVar11.getClass();
                                isEmpty = list4.isEmpty();
                                obj8 = list4;
                                if (!isEmpty) {
                                    obj8 = c0.A(m0.f9201a, new r(list4, continuation, i12), this);
                                }
                                if (obj8 != aVar) {
                                    xVar13 = xVar12;
                                    obj9 = obj8;
                                    List list5 = (List) obj9;
                                    this.f11200b = null;
                                    this.f11205g = 6;
                                    xVar13.getClass();
                                    String str = gc.d.f9945a;
                                    obj10 = list5;
                                    if (Intrinsics.areEqual(d2.i.c(), "ru")) {
                                        obj10 = c0.A(m0.f9201a, new r(list5, continuation, i5), this);
                                    }
                                    if (obj10 != aVar) {
                                        return obj10;
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                xVar2 = this.f11204f;
                xVar3 = this.f11203e;
                x xVar14 = this.f11202d;
                x xVar15 = this.f11201c;
                x xVar16 = this.f11200b;
                h8.b.B(obj);
                xVar = xVar14;
                xVar4 = xVar15;
                xVar5 = xVar16;
                obj2 = obj;
                this.f11200b = xVar5;
                this.f11201c = xVar4;
                this.f11202d = xVar;
                this.f11203e = xVar3;
                this.f11204f = null;
                this.f11205g = 2;
                xVar2.getClass();
                A = c0.A(m0.f9201a, new r((List) obj2, continuation, 0), this);
                if (A != aVar) {
                }
                return aVar;
            case 2:
                xVar6 = this.f11203e;
                xVar7 = this.f11202d;
                xVar4 = this.f11201c;
                xVar5 = this.f11200b;
                h8.b.B(obj);
                obj3 = obj;
                List list22 = (List) obj3;
                this.f11200b = xVar5;
                this.f11201c = xVar4;
                this.f11202d = xVar7;
                this.f11203e = null;
                this.f11205g = 3;
                xVar6.getClass();
                obj4 = list22;
                if (!da.r.e()) {
                }
                if (obj4 != aVar) {
                }
                return aVar;
            case 3:
                xVar8 = this.f11202d;
                xVar9 = this.f11201c;
                xVar10 = this.f11200b;
                h8.b.B(obj);
                obj5 = obj;
                List list32 = (List) obj5;
                this.f11200b = xVar10;
                this.f11201c = xVar9;
                this.f11202d = null;
                this.f11205g = 4;
                xVar8.getClass();
                obj6 = list32;
                if (!da.r.e()) {
                }
                if (obj6 != aVar) {
                }
                return aVar;
            case 4:
                xVar11 = this.f11201c;
                xVar12 = this.f11200b;
                h8.b.B(obj);
                obj7 = obj;
                List list42 = (List) obj7;
                this.f11200b = xVar12;
                this.f11201c = null;
                this.f11205g = 5;
                xVar11.getClass();
                isEmpty = list42.isEmpty();
                obj8 = list42;
                if (!isEmpty) {
                }
                if (obj8 != aVar) {
                }
                return aVar;
            case 5:
                xVar13 = this.f11200b;
                h8.b.B(obj);
                obj9 = obj;
                List list52 = (List) obj9;
                this.f11200b = null;
                this.f11205g = 6;
                xVar13.getClass();
                String str2 = gc.d.f9945a;
                obj10 = list52;
                if (Intrinsics.areEqual(d2.i.c(), "ru")) {
                }
                if (obj10 != aVar) {
                    return aVar;
                }
                break;
            case 6:
                h8.b.B(obj);
                return obj;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
