package ue;

import e3.o;
import eg.c0;
import eg.m0;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import me.y;
import mf.i;
import rc.l;
import rc.r;
import s7.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f24252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z5, Continuation continuation) {
        super(2, continuation);
        this.f24253c = z5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f24253c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (eg.c0.A(lg.d.f20063c, new je.a(r9, r3, null, 4), r8) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r9 == r0) goto L29;
     */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = lf.a.f20034a;
        int i5 = this.f24252b;
        boolean z5 = this.f24253c;
        if (i5 == 0) {
            h8.b.B(obj);
            r rVar = new r();
            this.f24252b = 1;
            lg.e eVar = m0.f9201a;
            Object A = c0.A(lg.d.f20063c, new l(rVar, z5, null, 1), this);
            if (A != obj2) {
                A = Unit.f19194a;
            }
        } else if (i5 == 1) {
            h8.b.B(obj);
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                return Unit.f19194a;
            }
            h8.b.B(obj);
            t tVar = new t(16);
            this.f24252b = 3;
            o oVar = o.f8552b;
            lg.e eVar2 = m0.f9201a;
            Object A2 = c0.A(lg.d.f20063c, new y(tVar, oVar, null, 22), this);
            if (A2 != obj2) {
                A2 = Unit.f19194a;
            }
            if (A2 != obj2) {
                A2 = Unit.f19194a;
            }
        }
        r rVar2 = new r();
        this.f24252b = 2;
        lg.e eVar3 = m0.f9201a;
    }
}
