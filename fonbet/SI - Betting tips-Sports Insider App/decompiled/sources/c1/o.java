package c1;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends mf.i implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public Object f3443b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f3444c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3445d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3446e;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f3447f;

    /* renamed from: g, reason: collision with root package name */
    public int f3448g;

    /* renamed from: h, reason: collision with root package name */
    public int f3449h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0 f3450i;
    public final /* synthetic */ com.google.firebase.messaging.x j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i0 i0Var, com.google.firebase.messaging.x xVar, Continuation continuation) {
        super(1, continuation);
        this.f3450i = i0Var;
        this.j = xVar;
    }

    @Override // mf.a
    public final Continuation create(Continuation continuation) {
        return new o(this.f3450i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((o) create((Continuation) obj)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Type inference failed for: r14v4, types: [T, java.lang.Object] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ng.a cVar;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        ng.a aVar;
        Iterator it;
        ng.a aVar2;
        Ref.BooleanRef booleanRef2;
        Ref.ObjectRef objectRef3;
        n nVar;
        Ref.ObjectRef objectRef4;
        Ref.BooleanRef booleanRef3;
        Object obj2;
        Integer a7;
        int i5;
        lf.a aVar3 = lf.a.f20034a;
        int i10 = this.f3449h;
        com.google.firebase.messaging.x xVar = this.j;
        i0 i0Var = this.f3450i;
        if (i10 == 0) {
            h8.b.B(obj);
            cVar = new ng.c();
            booleanRef = new Ref.BooleanRef();
            objectRef = new Ref.ObjectRef();
            this.f3443b = cVar;
            this.f3444c = booleanRef;
            this.f3445d = objectRef;
            this.f3446e = objectRef;
            this.f3449h = 1;
            obj = i0.f(i0Var, true, this);
            if (obj != aVar3) {
                objectRef2 = objectRef;
            }
            return aVar3;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5 = this.f3448g;
                    obj2 = this.f3443b;
                    h8.b.B(obj);
                    return new d(i5, ((Number) obj).intValue(), obj2);
                }
                aVar = (ng.a) this.f3445d;
                objectRef4 = (Ref.ObjectRef) this.f3444c;
                booleanRef3 = (Ref.BooleanRef) this.f3443b;
                h8.b.B(obj);
                try {
                    booleanRef3.element = true;
                    Unit unit = Unit.f19194a;
                    aVar.k(null);
                    obj2 = objectRef4.element;
                    int hashCode = obj2 == null ? obj2.hashCode() : 0;
                    b1 g10 = i0Var.g();
                    this.f3443b = obj2;
                    this.f3444c = null;
                    this.f3445d = null;
                    this.f3448g = hashCode;
                    this.f3449h = 4;
                    a7 = g10.a();
                    if (a7 != aVar3) {
                        i5 = hashCode;
                        obj = a7;
                        return new d(i5, ((Number) obj).intValue(), obj2);
                    }
                    return aVar3;
                } catch (Throwable th2) {
                    aVar.k(null);
                    throw th2;
                }
            }
            it = this.f3447f;
            nVar = (n) this.f3446e;
            objectRef3 = (Ref.ObjectRef) this.f3445d;
            booleanRef2 = (Ref.BooleanRef) this.f3444c;
            aVar2 = (ng.a) this.f3443b;
            h8.b.B(obj);
            while (it.hasNext()) {
                Function2 function2 = (Function2) it.next();
                this.f3443b = aVar2;
                this.f3444c = booleanRef2;
                this.f3445d = objectRef3;
                this.f3446e = nVar;
                this.f3447f = it;
                this.f3449h = 2;
                if (function2.invoke(nVar, this) == aVar3) {
                    break;
                }
            }
            objectRef2 = objectRef3;
            booleanRef = booleanRef2;
            aVar = aVar2;
            xVar.f6184c = null;
            this.f3443b = booleanRef;
            this.f3444c = objectRef2;
            this.f3445d = aVar;
            this.f3446e = null;
            this.f3447f = null;
            this.f3449h = 3;
            if (aVar.c(this) != aVar3) {
                objectRef4 = objectRef2;
                booleanRef3 = booleanRef;
                booleanRef3.element = true;
                Unit unit2 = Unit.f19194a;
                aVar.k(null);
                obj2 = objectRef4.element;
                if (obj2 == null) {
                }
                b1 g102 = i0Var.g();
                this.f3443b = obj2;
                this.f3444c = null;
                this.f3445d = null;
                this.f3448g = hashCode;
                this.f3449h = 4;
                a7 = g102.a();
                if (a7 != aVar3) {
                }
            }
            return aVar3;
        }
        objectRef = (Ref.ObjectRef) this.f3446e;
        objectRef2 = (Ref.ObjectRef) this.f3445d;
        booleanRef = (Ref.BooleanRef) this.f3444c;
        cVar = (ng.a) this.f3443b;
        h8.b.B(obj);
        objectRef.element = ((d) obj).f3349b;
        n nVar2 = new n(cVar, booleanRef, objectRef2, i0Var);
        List list = (List) xVar.f6184c;
        if (list == null) {
            aVar = cVar;
            xVar.f6184c = null;
            this.f3443b = booleanRef;
            this.f3444c = objectRef2;
            this.f3445d = aVar;
            this.f3446e = null;
            this.f3447f = null;
            this.f3449h = 3;
            if (aVar.c(this) != aVar3) {
            }
            return aVar3;
        }
        it = list.iterator();
        aVar2 = cVar;
        booleanRef2 = booleanRef;
        objectRef3 = objectRef2;
        nVar = nVar2;
        while (it.hasNext()) {
        }
        objectRef2 = objectRef3;
        booleanRef = booleanRef2;
        aVar = aVar2;
        xVar.f6184c = null;
        this.f3443b = booleanRef;
        this.f3444c = objectRef2;
        this.f3445d = aVar;
        this.f3446e = null;
        this.f3447f = null;
        this.f3449h = 3;
        if (aVar.c(this) != aVar3) {
        }
        return aVar3;
    }
}
