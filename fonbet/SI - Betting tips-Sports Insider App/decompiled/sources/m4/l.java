package m4;

import com.google.android.gms.internal.measurement.d5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okio.Buffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f20389b;

    /* renamed from: c, reason: collision with root package name */
    public int f20390c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f20391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f20392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f20393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f20394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f20395h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Ref.ObjectRef objectRef, o oVar, Ref.ObjectRef objectRef2, q qVar, Continuation continuation) {
        super(2, continuation);
        this.f20392e = objectRef;
        this.f20393f = oVar;
        this.f20394g = objectRef2;
        this.f20395h = qVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(this.f20392e, this.f20393f, this.f20394g, this.f20395h, continuation);
        lVar.f20391d = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((r) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r11 == r3) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [T, m4.r] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        T t3;
        p pVar;
        Object obj2;
        o oVar = this.f20393f;
        String str = oVar.f20407a;
        r rVar = (r) this.f20391d;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f20390c;
        String str2 = null;
        Ref.ObjectRef objectRef2 = this.f20394g;
        Ref.ObjectRef objectRef3 = this.f20392e;
        if (i5 == 0) {
            h8.b.B(obj);
            e4.g gVar = (e4.g) objectRef3.element;
            r rVar2 = (r) objectRef2.element;
            this.f20391d = rVar;
            this.f20389b = objectRef3;
            this.f20390c = 1;
            Object c2 = o.c(oVar, gVar, rVar2, rVar, this);
            if (c2 != aVar) {
                objectRef = objectRef3;
                t3 = c2;
            }
            return aVar;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
            obj2 = obj;
            Buffer buffer = (Buffer) obj2;
            if (buffer.size() > 0) {
                return new f4.l(ci.c.b(buffer, oVar.e()), o.f(str, rVar.f20422d.a()), d4.h.f8131d);
            }
            return null;
        }
        objectRef = this.f20389b;
        h8.b.B(obj);
        t3 = obj;
        objectRef.element = t3;
        T t5 = objectRef3.element;
        if (t5 != 0) {
            Intrinsics.checkNotNull(t5);
            objectRef2.element = oVar.i((e4.g) t5);
            T t10 = objectRef3.element;
            Intrinsics.checkNotNull(t10);
            d4.q h10 = oVar.h((e4.g) t10);
            r rVar3 = (r) objectRef2.element;
            if (rVar3 != null && (pVar = rVar3.f20422d) != null) {
                str2 = pVar.a();
            }
            return new f4.l(h10, o.f(str, str2), d4.h.f8131d);
        }
        s sVar = rVar.f20423e;
        if (sVar == null) {
            throw new IllegalStateException("body == null");
        }
        this.f20391d = rVar;
        this.f20389b = null;
        this.f20390c = 2;
        Object I = d5.I(sVar, this);
        obj2 = I;
    }
}
