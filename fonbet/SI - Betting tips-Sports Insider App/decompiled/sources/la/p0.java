package la;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public a4.l f19565b;

    /* renamed from: c, reason: collision with root package name */
    public int f19566c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f19567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f19568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f19569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f19570g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Integer f19571h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s0 s0Var, long j, long j6, String str, Integer num, Continuation continuation) {
        super(2, continuation);
        this.f19567d = s0Var;
        this.f19568e = j;
        this.f19569f = j6;
        this.f19570g = str;
        this.f19571h = num;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p0(this.f19567d, this.f19568e, this.f19569f, this.f19570g, this.f19571h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p0) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r4.A0(r18) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        if (r2 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004b, code lost:
    
        if (r2 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object C0;
        Object A;
        a4.l lVar;
        int statusCode;
        a4.l lVar2;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f19566c;
        int i10 = 1;
        s0 s0Var = this.f19567d;
        if (i5 == 0) {
            h8.b.B(obj);
            fb.b bVar = new fb.b();
            this.f19566c = 1;
            C0 = bVar.C0(this);
        } else if (i5 == 1) {
            h8.b.B(obj);
            C0 = obj;
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar2 = this.f19565b;
                    h8.b.B(obj);
                    List predictions = lVar2.getPredictions();
                    int size = predictions == null ? predictions.size() : 0;
                    return size != 0 ? new Pair(new Integer(204), new Integer(0)) : new Pair(new Integer(lVar2.getStatusCode()), new Integer(size));
                }
                lVar = this.f19565b;
                h8.b.B(obj);
                statusCode = lVar.getStatusCode();
                if (statusCode == 200) {
                    if (statusCode == 204) {
                        new Integer(lVar.getStatusCode());
                        new Integer(0);
                    }
                    return new Pair(new Integer(lVar.getStatusCode()), new Integer(0));
                }
                List predictions2 = lVar.getPredictions();
                this.f19565b = lVar;
                this.f19566c = 4;
                lg.e eVar = eg.m0.f9201a;
                if (eg.c0.A(lg.d.f20063c, new f(predictions2, s0Var, null, i10), this) != aVar) {
                    lVar2 = lVar;
                    List predictions3 = lVar2.getPredictions();
                    if (predictions3 == null) {
                    }
                    if (size != 0) {
                    }
                }
                return aVar;
            }
            h8.b.B(obj);
            A = obj;
            lVar = (a4.l) A;
            if (lVar.getStatusCode() == 401) {
                fb.b bVar2 = new fb.b();
                this.f19565b = lVar;
                this.f19566c = 3;
            }
            statusCode = lVar.getStatusCode();
            if (statusCode == 200) {
            }
        }
        String str = (String) C0;
        if (str == null) {
            return new Pair(new Integer(401), new Integer(0));
        }
        String b10 = s0.b(s0Var, this.f19568e);
        String b11 = s0.b(s0Var, this.f19569f);
        lg.e eVar2 = eg.m0.f9201a;
        lg.d dVar = lg.d.f20063c;
        c1.g gVar = new c1.g(s0Var, str, b10, b11, this.f19570g, this.f19571h, (Continuation) null);
        this.f19566c = 2;
        A = eg.c0.A(dVar, gVar, this);
    }
}
