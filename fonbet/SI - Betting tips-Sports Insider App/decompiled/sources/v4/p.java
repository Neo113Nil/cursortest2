package v4;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class p {
    public static final q4.d a(q4.h hVar, Throwable th2) {
        c4.m mVar;
        if (th2 instanceof q4.m) {
            Function1 function1 = hVar.f21989o;
            q4.f fVar = hVar.f21994u;
            mVar = (c4.m) function1.invoke(hVar);
            if (mVar == null) {
                mVar = (c4.m) fVar.j.invoke(hVar);
            }
            if (mVar == null && (mVar = (c4.m) hVar.f21988n.invoke(hVar)) == null) {
                mVar = (c4.m) fVar.f21962i.invoke(hVar);
            }
        } else {
            mVar = (c4.m) hVar.f21988n.invoke(hVar);
            if (mVar == null) {
                mVar = (c4.m) hVar.f21994u.f21962i.invoke(hVar);
            }
        }
        return new q4.d(mVar, hVar, th2);
    }
}
