package k2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public l[] f18727b;

    /* renamed from: c, reason: collision with root package name */
    public o0 f18728c;

    /* renamed from: d, reason: collision with root package name */
    public c0 f18729d;

    /* renamed from: e, reason: collision with root package name */
    public int f18730e;

    /* renamed from: f, reason: collision with root package name */
    public int f18731f;

    /* renamed from: g, reason: collision with root package name */
    public int f18732g;

    /* renamed from: h, reason: collision with root package name */
    public int f18733h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l[] f18734i;
    public final /* synthetic */ o0 j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c0 f18735k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(l[] lVarArr, o0 o0Var, c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.f18734i = lVarArr;
        this.j = o0Var;
        this.f18735k = c0Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new n0(this.f18734i, this.j, this.f18735k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((m2.l) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (k2.o0.c(r7, r6, r11, r10) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0075 -> B:10:0x0076). Please report as a decompilation issue!!! */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int length;
        int i5;
        c0 c0Var;
        l[] lVarArr;
        int i10;
        o0 o0Var;
        lf.a aVar = lf.a.f20034a;
        int i11 = this.f18733h;
        if (i11 == 0) {
            h8.b.B(obj);
            l[] lVarArr2 = this.f18734i;
            length = lVarArr2.length;
            i5 = 0;
            o0 o0Var2 = this.j;
            c0Var = this.f18735k;
            lVarArr = lVarArr2;
            i10 = 0;
            o0Var = o0Var2;
            if (i5 >= length) {
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = this.f18732g;
            i5 = this.f18731f;
            int i12 = this.f18730e;
            c0Var = this.f18729d;
            o0Var = this.f18728c;
            lVarArr = this.f18727b;
            h8.b.B(obj);
            i10 = i12;
            i5++;
            if (i5 >= length) {
                int i13 = i10 + 1;
                int ordinal = lVarArr[i5].ordinal();
                if (ordinal == 0) {
                    i10 = i13;
                    i5++;
                    if (i5 >= length) {
                        return Unit.f19194a;
                    }
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw new gf.m();
                        }
                        this.f18727b = lVarArr;
                        this.f18728c = o0Var;
                        this.f18729d = c0Var;
                        this.f18730e = i13;
                        this.f18731f = i5;
                        this.f18732g = length;
                        this.f18733h = 2;
                        if (o0.d(o0Var, c0Var, i10, this) != aVar) {
                            i12 = i13;
                            i10 = i12;
                        }
                        return aVar;
                    }
                    this.f18727b = lVarArr;
                    this.f18728c = o0Var;
                    this.f18729d = c0Var;
                    this.f18730e = i13;
                    this.f18731f = i5;
                    this.f18732g = length;
                    this.f18733h = 1;
                    i5++;
                    if (i5 >= length) {
                    }
                }
            }
        }
    }
}
