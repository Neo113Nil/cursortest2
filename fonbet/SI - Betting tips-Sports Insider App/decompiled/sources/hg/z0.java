package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class z0 extends mf.i implements vf.a {

    /* renamed from: b, reason: collision with root package name */
    public int f10810b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ h f10811c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f10812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f10813e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, Continuation continuation) {
        super(3, continuation);
        this.f10813e = a1Var;
    }

    @Override // vf.a
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        z0 z0Var = new z0(this.f10813e, (Continuation) obj3);
        z0Var.f10811c = (h) obj;
        z0Var.f10812d = intValue;
        return z0Var.invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        if (r1.d(r8, r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (eg.c0.j(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE, r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r1.d(r8, r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r1.d(r8, r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        if (eg.c0.j(0, r7) == r0) goto L32;
     */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h hVar;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f10810b;
        if (i5 == 0) {
            h8.b.B(obj);
            hVar = this.f10811c;
            if (this.f10812d > 0) {
                w0 w0Var = w0.f10789a;
                this.f10810b = 1;
            } else {
                this.f10811c = hVar;
                this.f10810b = 2;
            }
            return aVar;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                hVar = this.f10811c;
                h8.b.B(obj);
                w0 w0Var2 = w0.f10790b;
                this.f10811c = hVar;
                this.f10810b = 3;
            } else if (i5 == 3) {
                hVar = this.f10811c;
                h8.b.B(obj);
                this.f10811c = hVar;
                this.f10810b = 4;
            } else if (i5 == 4) {
                hVar = this.f10811c;
                h8.b.B(obj);
                w0 w0Var3 = w0.f10791c;
                this.f10811c = null;
                this.f10810b = 5;
            } else if (i5 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        h8.b.B(obj);
        return Unit.f19194a;
    }
}
