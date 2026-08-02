package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c extends ig.e {

    /* renamed from: d, reason: collision with root package name */
    public final mf.i f10650d;

    /* renamed from: e, reason: collision with root package name */
    public final mf.i f10651e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Function2 function2, CoroutineContext coroutineContext, int i5, gg.a aVar) {
        super(coroutineContext, i5, aVar);
        mf.i iVar = (mf.i) function2;
        this.f10650d = iVar;
        this.f10651e = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // ig.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(gg.w wVar, Continuation continuation) {
        b bVar;
        int i5;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f10645d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f10645d = i10 - Integer.MIN_VALUE;
                Object obj = bVar.f10643b;
                Object obj2 = lf.a.f20034a;
                i5 = bVar.f10645d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    bVar.f10642a = wVar;
                    bVar.f10645d = 1;
                    Object invoke = this.f10650d.invoke(wVar, bVar);
                    if (invoke != obj2) {
                        invoke = Unit.f19194a;
                    }
                    if (invoke == obj2) {
                        return obj2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar = bVar.f10642a;
                    h8.b.B(obj);
                }
                if (((gg.v) wVar).f10105d.x()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return Unit.f19194a;
            }
        }
        bVar = new b(this, (mf.c) continuation);
        Object obj3 = bVar.f10643b;
        Object obj22 = lf.a.f20034a;
        i5 = bVar.f10645d;
        if (i5 != 0) {
        }
        if (((gg.v) wVar).f10105d.x()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // ig.e
    public final ig.e e(CoroutineContext coroutineContext, int i5, gg.a aVar) {
        return new c(this.f10651e, coroutineContext, i5, aVar);
    }

    @Override // ig.e
    public final String toString() {
        return "block[" + this.f10650d + "] -> " + super.toString();
    }
}
