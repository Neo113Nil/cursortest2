package v4;

import androidx.lifecycle.d0;
import androidx.lifecycle.g0;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.lifecycle.d0, j1.k, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(y yVar, mf.c cVar) {
        i frame;
        int i5;
        y yVar2;
        Ref.ObjectRef objectRef;
        Throwable th2;
        d0 d0Var;
        d0 d0Var2;
        if (cVar instanceof i) {
            frame = (i) cVar;
            int i10 = frame.f24425d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                frame.f24425d = i10 - Integer.MIN_VALUE;
                Object obj = frame.f24424c;
                lf.a aVar = lf.a.f20034a;
                i5 = frame.f24425d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (((g0) yVar).f2169d.a(x.f2256d)) {
                        return Unit.f19194a;
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    try {
                        frame.f24422a = yVar;
                        frame.f24423b = objectRef2;
                        frame.f24425d = 1;
                        eg.l lVar = new eg.l(1, lf.d.b(frame));
                        lVar.s();
                        ?? kVar = new j1.k(lVar);
                        objectRef2.element = kVar;
                        Intrinsics.checkNotNull(kVar);
                        yVar.a(kVar);
                        Object r5 = lVar.r();
                        if (r5 == aVar) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                        if (r5 == aVar) {
                            return aVar;
                        }
                        yVar2 = yVar;
                        objectRef = objectRef2;
                    } catch (Throwable th3) {
                        yVar2 = yVar;
                        objectRef = objectRef2;
                        th2 = th3;
                        d0Var = (d0) objectRef.element;
                        if (d0Var != null) {
                        }
                        throw th2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = frame.f24423b;
                    yVar2 = frame.f24422a;
                    try {
                        h8.b.B(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        d0Var = (d0) objectRef.element;
                        if (d0Var != null) {
                            yVar2.b(d0Var);
                        }
                        throw th2;
                    }
                }
                d0Var2 = (d0) objectRef.element;
                if (d0Var2 != null) {
                    yVar2.b(d0Var2);
                }
                return Unit.f19194a;
            }
        }
        frame = new i(cVar);
        Object obj2 = frame.f24424c;
        lf.a aVar2 = lf.a.f20034a;
        i5 = frame.f24425d;
        if (i5 != 0) {
        }
        d0Var2 = (d0) objectRef.element;
        if (d0Var2 != null) {
        }
        return Unit.f19194a;
    }
}
