package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class x implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f10793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f10794b;

    public x(h hVar, Ref.ObjectRef objectRef) {
        this.f10793a = hVar;
        this.f10794b = objectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Throwable] */
    @Override // hg.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, Continuation continuation) {
        w wVar;
        int i5;
        x xVar;
        if (continuation instanceof w) {
            wVar = (w) continuation;
            int i10 = wVar.f10788d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                wVar.f10788d = i10 - Integer.MIN_VALUE;
                Object obj2 = wVar.f10786b;
                lf.a aVar = lf.a.f20034a;
                i5 = wVar.f10788d;
                if (i5 != 0) {
                    h8.b.B(obj2);
                    try {
                        h hVar = this.f10793a;
                        wVar.f10785a = this;
                        wVar.f10788d = 1;
                        if (hVar.d(obj, wVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        xVar = this;
                        xVar.f10794b.element = th;
                        throw th;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = wVar.f10785a;
                    try {
                        h8.b.B(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        xVar.f10794b.element = th;
                        throw th;
                    }
                }
                return Unit.f19194a;
            }
        }
        wVar = new w(this, continuation);
        Object obj22 = wVar.f10786b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = wVar.f10788d;
        if (i5 != 0) {
        }
        return Unit.f19194a;
    }
}
