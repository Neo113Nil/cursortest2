package i3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends mf.i implements vf.a {

    /* renamed from: b, reason: collision with root package name */
    public int f10919b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ hg.h f10920c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object[] f10921d;

    @Override // vf.a
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j jVar = new j(3, (Continuation) obj3);
        jVar.f10920c = (hg.h) obj;
        jVar.f10921d = (Object[]) obj2;
        return jVar.invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        c cVar2;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f10919b;
        if (i5 == 0) {
            h8.b.B(obj);
            hg.h hVar = this.f10920c;
            c[] cVarArr = (c[]) this.f10921d;
            int length = cVarArr.length;
            int i10 = 0;
            while (true) {
                cVar = a.f10902a;
                if (i10 >= length) {
                    cVar2 = null;
                    break;
                }
                cVar2 = cVarArr[i10];
                if (!Intrinsics.areEqual(cVar2, cVar)) {
                    break;
                }
                i10++;
            }
            if (cVar2 != null) {
                cVar = cVar2;
            }
            this.f10919b = 1;
            if (hVar.d(cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return Unit.f19194a;
    }
}
