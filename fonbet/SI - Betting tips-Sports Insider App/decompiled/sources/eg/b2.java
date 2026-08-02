package eg;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class b2 {
    public static final Object a(z1 z1Var, Function2 function2) {
        c0.r(z1Var, new p0(0, c0.m(z1Var.f18525d.getContext()).C(z1Var.f9246e, z1Var, z1Var.f9135c)));
        return rh.g.I(z1Var, false, z1Var, function2);
    }

    public static final Object b(long j, Function2 function2, mf.c frame) {
        if (j <= 0) {
            throw new y1("Timed out immediately", null);
        }
        Object a7 = a(new z1(j, frame), function2);
        if (a7 == lf.a.f20034a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return a7;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, eg.z1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(long j, Function2 function2, mf.c cVar) {
        a2 frame;
        int i5;
        Ref.ObjectRef objectRef;
        if (cVar instanceof a2) {
            frame = (a2) cVar;
            int i10 = frame.f9144c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                frame.f9144c = i10 - Integer.MIN_VALUE;
                Object obj = frame.f9143b;
                lf.a aVar = lf.a.f20034a;
                i5 = frame.f9144c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (j <= 0) {
                        return null;
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    try {
                        frame.f9142a = objectRef2;
                        frame.f9144c = 1;
                        ?? z1Var = new z1(j, frame);
                        objectRef2.element = z1Var;
                        Object a7 = a(z1Var, function2);
                        if (a7 == aVar) {
                            try {
                                Intrinsics.checkNotNullParameter(frame, "frame");
                            } catch (y1 e7) {
                                e = e7;
                                objectRef = objectRef2;
                                if (e.f9244a == objectRef.element) {
                                }
                            }
                        }
                        return a7 == aVar ? aVar : a7;
                    } catch (y1 e9) {
                        e = e9;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = frame.f9142a;
                    try {
                        h8.b.B(obj);
                        return obj;
                    } catch (y1 e10) {
                        e = e10;
                    }
                }
                if (e.f9244a == objectRef.element) {
                    return null;
                }
                throw e;
            }
        }
        frame = new a2(cVar);
        Object obj2 = frame.f9143b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = frame.f9144c;
        if (i5 != 0) {
        }
        if (e.f9244a == objectRef.element) {
        }
    }
}
