package qe;

import androidx.appcompat.widget.c1;
import androidx.lifecycle.p1;
import pe.g;
import ve.v;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f22129a;

    public d(e eVar) {
        this.f22129a = eVar;
    }

    @Override // ve.v
    public final void a(String str) {
        if (str == null) {
            return;
        }
        p1 p1Var = this.f22129a.f22131b;
        g gVar = c1.v(p1Var) ? (g) p1Var : null;
        if (gVar != null) {
            gVar.x(str);
        }
    }
}
