package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f10674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f10675b;

    public e(f fVar, Ref.ObjectRef objectRef, h hVar) {
        this.f10674a = objectRef;
        this.f10675b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // hg.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, Continuation continuation) {
        d dVar;
        int i5;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f10667c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f10667c = i10 - Integer.MIN_VALUE;
                Object obj2 = dVar.f10665a;
                lf.a aVar = lf.a.f20034a;
                i5 = dVar.f10667c;
                if (i5 != 0) {
                    h8.b.B(obj2);
                    Ref.ObjectRef objectRef = this.f10674a;
                    T t3 = objectRef.element;
                    if (t3 != ig.c.f11245b && Intrinsics.areEqual(t3, obj)) {
                        return Unit.f19194a;
                    }
                    objectRef.element = obj;
                    dVar.f10667c = 1;
                    if (this.f10675b.d(obj, dVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj2);
                }
                return Unit.f19194a;
            }
        }
        dVar = new d(this, continuation);
        Object obj22 = dVar.f10665a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = dVar.f10667c;
        if (i5 != 0) {
        }
        return Unit.f19194a;
    }
}
