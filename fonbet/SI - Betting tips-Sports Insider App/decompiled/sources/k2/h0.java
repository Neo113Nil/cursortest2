package k2;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f18671b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18672c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f18673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f18674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String[] f18675f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(o0 o0Var, int[] iArr, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.f18673d = o0Var;
        this.f18674e = iArr;
        this.f18675f = strArr;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        h0 h0Var = new h0(this.f18673d, this.f18674e, this.f18675f, continuation);
        h0Var.f18672c = obj;
        return h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((h0) create((hg.h) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        return lf.a.f20034a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
    
        if (eg.c0.A((kotlin.coroutines.CoroutineContext) r8, r9, r21) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (r8 == r0) goto L40;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hg.h hVar;
        boolean z5;
        Object c02;
        int[] tableIds = this.f18674e;
        o0 o0Var = this.f18673d;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f18671b;
        Continuation continuation = null;
        try {
            if (i5 == 0) {
                h8.b.B(obj);
                hVar = (hg.h) this.f18672c;
                m mVar = o0Var.f18744h;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(tableIds, "tableIds");
                ReentrantLock reentrantLock = mVar.f18714a;
                reentrantLock.lock();
                try {
                    boolean z7 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = mVar.f18715b;
                        long j = jArr[i10];
                        jArr[i10] = j + 1;
                        if (j == 0) {
                            mVar.f18717d = true;
                            z7 = true;
                        }
                    }
                    if (!z7 && !mVar.f18717d) {
                        if (!mVar.f18719f) {
                            z5 = false;
                            reentrantLock.unlock();
                            if (z5) {
                                w wVar = o0Var.f18737a;
                                this.f18672c = hVar;
                                this.f18671b = 1;
                                c02 = f3.x.c0(wVar, this);
                            }
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            c1.j0 j0Var = o0Var.f18745i;
                            g0 g0Var = new g0(objectRef, hVar, this.f18675f, tableIds);
                            this.f18672c = null;
                            this.f18671b = 3;
                            j0Var.a(g0Var, this);
                            return aVar;
                        }
                    }
                    z5 = true;
                    reentrantLock.unlock();
                    if (z5) {
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    c1.j0 j0Var2 = o0Var.f18745i;
                    g0 g0Var2 = new g0(objectRef2, hVar, this.f18675f, tableIds);
                    this.f18672c = null;
                    this.f18671b = 3;
                    j0Var2.a(g0Var2, this);
                    return aVar;
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                hVar = (hg.h) this.f18672c;
                h8.b.B(obj);
                Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
                c1.j0 j0Var22 = o0Var.f18745i;
                g0 g0Var22 = new g0(objectRef22, hVar, this.f18675f, tableIds);
                this.f18672c = null;
                this.f18671b = 3;
                j0Var22.a(g0Var22, this);
                return aVar;
            }
            hVar = (hg.h) this.f18672c;
            h8.b.B(obj);
            c02 = obj;
            androidx.lifecycle.b bVar = new androidx.lifecycle.b(o0Var, continuation, 11);
            this.f18672c = hVar;
            this.f18671b = 2;
        } catch (Throwable th3) {
            m mVar2 = o0Var.f18744h;
            mVar2.getClass();
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            ReentrantLock reentrantLock2 = mVar2.f18714a;
            reentrantLock2.lock();
            try {
                boolean z10 = false;
                for (int i11 : tableIds) {
                    long[] jArr2 = mVar2.f18715b;
                    long j6 = jArr2[i11];
                    jArr2[i11] = j6 - 1;
                    if (j6 == 1) {
                        z10 = true;
                        mVar2.f18717d = true;
                    }
                }
                if (!z10 && !mVar2.f18717d) {
                    boolean z11 = mVar2.f18719f;
                }
                reentrantLock2.unlock();
                throw th3;
            } catch (Throwable th4) {
                reentrantLock2.unlock();
                throw th4;
            }
        }
    }
}
