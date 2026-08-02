package pc;

import eg.c0;
import eg.f0;
import eg.g0;
import eg.m0;
import eg.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21607b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f21608c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f21609d;

    /* renamed from: e, reason: collision with root package name */
    public int f21610e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f21611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u f21612g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(u uVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21607b = i5;
        this.f21612g = uVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21607b) {
            case 0:
                b bVar = new b(this.f21612g, continuation, 0);
                bVar.f21611f = obj;
                return bVar;
            default:
                b bVar2 = new b(this.f21612g, continuation, 1);
                bVar2.f21611f = obj;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21607b) {
        }
        return ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i5 = this.f21607b;
        Continuation continuation = null;
        u uVar = this.f21612g;
        int i10 = 0;
        int i11 = 1;
        switch (i5) {
            case 0:
                z zVar = (z) this.f21611f;
                Object obj2 = lf.a.f20034a;
                int i12 = this.f21610e;
                if (i12 == 0) {
                    h8.b.B(obj);
                    boolean d10 = u.n().d();
                    lg.e eVar = m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    g0 e7 = c0.e(zVar, dVar, new a(uVar, d10, null, 1), 2);
                    g0 e9 = c0.e(zVar, dVar, new a(uVar, d10, null, 0), 2);
                    arrayList = new ArrayList();
                    this.f21611f = null;
                    this.f21608c = arrayList;
                    this.f21609d = arrayList;
                    this.f21610e = 1;
                    obj = c0.f(new f0[]{e7, e9}, this);
                    if (obj != obj2) {
                        obj2 = arrayList;
                    }
                    return obj2;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = this.f21609d;
                ArrayList arrayList3 = this.f21608c;
                h8.b.B(obj);
                obj2 = arrayList3;
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    arrayList.addAll((List) it.next());
                }
                return obj2;
            default:
                z zVar2 = (z) this.f21611f;
                Object obj3 = lf.a.f20034a;
                int i13 = this.f21610e;
                if (i13 == 0) {
                    h8.b.B(obj);
                    lg.e eVar2 = m0.f9201a;
                    lg.d dVar2 = lg.d.f20063c;
                    g0 e10 = c0.e(zVar2, dVar2, new e(uVar, continuation, i11), 2);
                    g0 e11 = c0.e(zVar2, dVar2, new e(uVar, continuation, i10), 2);
                    arrayList2 = new ArrayList();
                    this.f21611f = null;
                    this.f21608c = arrayList2;
                    this.f21609d = arrayList2;
                    this.f21610e = 1;
                    obj = c0.f(new f0[]{e10, e11}, this);
                    if (obj != obj3) {
                        obj3 = arrayList2;
                    }
                    return obj3;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList2 = this.f21609d;
                ArrayList arrayList4 = this.f21608c;
                h8.b.B(obj);
                obj3 = arrayList4;
                Iterator it2 = ((Iterable) obj).iterator();
                while (it2.hasNext()) {
                    arrayList2.addAll((List) it2.next());
                }
                return obj3;
        }
    }
}
