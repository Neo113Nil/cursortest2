package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n extends mf.i implements vf.a {

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f10726b;

    /* renamed from: c, reason: collision with root package name */
    public Ref.LongRef f10727c;

    /* renamed from: d, reason: collision with root package name */
    public int f10728d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10729e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f10730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f10731g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f10732h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j jVar, g gVar, Continuation continuation) {
        super(3, continuation);
        this.f10731g = jVar;
        this.f10732h = gVar;
    }

    @Override // vf.a
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        n nVar = new n(this.f10731g, this.f10732h, (Continuation) obj3);
        nVar.f10729e = (eg.z) obj;
        nVar.f10730f = (h) obj2;
        return nVar.invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        if (r9.d(r11, r19) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0137, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0135, code lost:
    
        if (r11.c(r19) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (r11.d(r19) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0071  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [gg.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        ?? r82;
        h hVar;
        Ref.ObjectRef objectRef2;
        Ref.LongRef longRef;
        mg.e eVar;
        gg.y yVar;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f10728d;
        Continuation continuation = null;
        if (i5 == 0) {
            h8.b.B(obj);
            eg.z zVar = (eg.z) this.f10729e;
            h hVar2 = (h) this.f10730f;
            androidx.lifecycle.p pVar = new androidx.lifecycle.p(this.f10732h, continuation, 1);
            kotlin.coroutines.g gVar = kotlin.coroutines.g.f19227a;
            gg.a aVar2 = gg.a.f10048a;
            eg.a0 a0Var = eg.a0.f9136a;
            eg.a vVar = new gg.v(eg.u.b(zVar, gVar), k2.x.a(0, 4, aVar2));
            vVar.j0(a0Var, vVar, pVar);
            objectRef = new Ref.ObjectRef();
            r82 = vVar;
            hVar = hVar2;
        } else if (i5 == 1) {
            longRef = this.f10727c;
            objectRef2 = this.f10726b;
            gg.y yVar2 = (gg.y) this.f10730f;
            hVar = (h) this.f10729e;
            h8.b.B(obj);
            yVar = yVar2;
            objectRef2.element = null;
            r82 = yVar;
            Ref.ObjectRef objectRef3 = objectRef2;
            Ref.LongRef longRef2 = longRef;
            objectRef = objectRef3;
            eVar = new mg.e(getContext());
            if (objectRef.element != null) {
                long j = longRef2.element;
                k kVar = new k(hVar, null, objectRef);
                mg.b bVar = new mg.b(j);
                mg.a aVar3 = mg.a.f20708a;
                Intrinsics.checkNotNull(aVar3, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
                eVar.f(new mg.c(eVar, bVar, (vf.a) TypeIntrinsics.beforeCheckcastToFunctionOfArity(aVar3, 3), mg.g.f20729a, mg.h.f20734e, kVar, null), false);
            }
            com.google.firebase.messaging.x d10 = r82.d();
            eVar.f(new mg.c(eVar, (gg.h) d10.f6182a, (vf.a) d10.f6183b, (vf.a) d10.f6184c, null, new l(hVar, null, objectRef), (vf.a) d10.f6185d), false);
            this.f10729e = hVar;
            this.f10730f = r82;
            this.f10726b = objectRef;
            this.f10727c = null;
            this.f10728d = 2;
            if (!(mg.e.f20723f.get(eVar) instanceof mg.c)) {
            }
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = this.f10726b;
            gg.y yVar3 = (gg.y) this.f10730f;
            h hVar3 = (h) this.f10729e;
            h8.b.B(obj);
            hVar = hVar3;
            r82 = yVar3;
        }
        objectRef2 = objectRef;
        if (objectRef2.element == ig.c.f11247d) {
            longRef = new Ref.LongRef();
            r82 = r82;
            if (objectRef2.element != null) {
                com.android.billingclient.api.a aVar4 = ig.c.f11245b;
                long longValue = Long.valueOf(this.f10731g.f10702b).longValue();
                longRef.element = longValue;
                r82 = r82;
                if (longValue < 0) {
                    throw new IllegalArgumentException("Debounce timeout should not be negative");
                }
                if (longValue == 0) {
                    Object obj2 = objectRef2.element;
                    if (obj2 == aVar4) {
                        obj2 = null;
                    }
                    this.f10729e = hVar;
                    this.f10730f = r82;
                    this.f10726b = objectRef2;
                    this.f10727c = longRef;
                    this.f10728d = 1;
                    yVar = r82;
                }
            }
            Ref.ObjectRef objectRef32 = objectRef2;
            Ref.LongRef longRef22 = longRef;
            objectRef = objectRef32;
            eVar = new mg.e(getContext());
            if (objectRef.element != null) {
            }
            com.google.firebase.messaging.x d102 = r82.d();
            eVar.f(new mg.c(eVar, (gg.h) d102.f6182a, (vf.a) d102.f6183b, (vf.a) d102.f6184c, null, new l(hVar, null, objectRef), (vf.a) d102.f6185d), false);
            this.f10729e = hVar;
            this.f10730f = r82;
            this.f10726b = objectRef;
            this.f10727c = null;
            this.f10728d = 2;
            if (!(mg.e.f20723f.get(eVar) instanceof mg.c)) {
            }
            objectRef2 = objectRef;
            if (objectRef2.element == ig.c.f11247d) {
                return Unit.f19194a;
            }
        }
    }
}
