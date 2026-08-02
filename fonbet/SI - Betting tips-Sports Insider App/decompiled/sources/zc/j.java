package zc;

import com.google.android.gms.internal.measurement.y3;
import eg.c0;
import eg.m0;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {
    public static final za.f a(j jVar) {
        return (za.f) y3.m(za.f.class, null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(mf.c cVar) {
        h hVar;
        int i5;
        Ref.ObjectRef objectRef;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.f25919d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f25919d = i10 - Integer.MIN_VALUE;
                Object obj = hVar.f25917b;
                lf.a aVar = lf.a.f20034a;
                i5 = hVar.f25919d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    lg.e eVar = m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    i iVar = new i(this, objectRef2, null);
                    hVar.f25916a = objectRef2;
                    hVar.f25919d = 1;
                    if (c0.A(dVar, iVar, hVar) == aVar) {
                        return aVar;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = hVar.f25916a;
                    h8.b.B(obj);
                }
                return objectRef.element;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f25917b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = hVar.f25919d;
        if (i5 != 0) {
        }
        return objectRef.element;
    }
}
