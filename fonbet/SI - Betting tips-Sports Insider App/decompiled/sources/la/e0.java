package la;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public a4.l f19451b;

    /* renamed from: c, reason: collision with root package name */
    public int f19452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f19453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f19454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f19455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f19457h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f19458i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(int i5, long j, String str, String str2, String str3, String str4, Continuation continuation, g0 g0Var) {
        super(2, continuation);
        this.f19453d = g0Var;
        this.f19454e = str;
        this.f19455f = str2;
        this.f19456g = i5;
        this.f19457h = str3;
        this.f19458i = j;
        this.j = str4;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e0(this.f19456g, this.f19458i, this.f19454e, this.f19455f, this.f19457h, this.j, continuation, this.f19453d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c1, code lost:
    
        if (r3.A0(r19) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r2 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007a, code lost:
    
        if (r2 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006b, code lost:
    
        if (r2 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cc  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object C0;
        g0 g0Var;
        Object A;
        a4.l lVar;
        a4.l lVar2;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f19452c;
        g0 g0Var2 = this.f19453d;
        if (i5 == 0) {
            h8.b.B(obj);
            fb.b bVar = new fb.b();
            String valueOf = String.valueOf(this.f19454e);
            String str = this.f19455f;
            int i10 = this.f19456g;
            this.f19452c = 1;
            lg.e eVar = eg.m0.f9201a;
            Object A2 = eg.c0.A(lg.d.f20063c, new androidx.lifecycle.o(bVar, valueOf, str, i10, (Continuation) null), this);
            if (A2 != aVar) {
                A2 = Unit.f19194a;
            }
        } else if (i5 == 1) {
            h8.b.B(obj);
        } else {
            if (i5 != 2) {
                if (i5 == 3) {
                    h8.b.B(obj);
                    A = obj;
                    g0Var = g0Var2;
                    lVar = (a4.l) A;
                    if (lVar.getStatusCode() == 401) {
                        fb.b bVar2 = new fb.b();
                        this.f19451b = lVar;
                        this.f19452c = 4;
                    }
                    if (lVar.getStatusCode() == 200) {
                    }
                    return new Integer(lVar.getStatusCode());
                }
                if (i5 != 4) {
                    if (i5 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar2 = this.f19451b;
                    h8.b.B(obj);
                    lVar = lVar2;
                    return new Integer(lVar.getStatusCode());
                }
                lVar = this.f19451b;
                h8.b.B(obj);
                g0Var = g0Var2;
                if (lVar.getStatusCode() == 200) {
                    List predictions = lVar.getPredictions();
                    if (predictions == null || predictions.isEmpty()) {
                        return new Integer(204);
                    }
                    List predictions2 = lVar.getPredictions();
                    this.f19451b = lVar;
                    this.f19452c = 5;
                    if (g0.a(g0Var, predictions2, this) != aVar) {
                        lVar2 = lVar;
                        lVar = lVar2;
                    }
                    return aVar;
                }
                return new Integer(lVar.getStatusCode());
            }
            h8.b.B(obj);
            C0 = obj;
            String str2 = (String) C0;
            if (str2 == null) {
                return new Integer(401);
            }
            lg.e eVar2 = eg.m0.f9201a;
            lg.d dVar = lg.d.f20063c;
            d0 d0Var = new d0(this.f19456g, this.f19458i, str2, this.f19457h, this.f19455f, this.j, (Continuation) null, g0Var2);
            g0Var = g0Var2;
            this.f19452c = 3;
            A = eg.c0.A(dVar, d0Var, this);
        }
        fb.b bVar3 = new fb.b();
        this.f19452c = 2;
        C0 = bVar3.C0(this);
    }
}
