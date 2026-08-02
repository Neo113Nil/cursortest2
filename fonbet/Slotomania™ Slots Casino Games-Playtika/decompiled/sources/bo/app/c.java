package bo.app;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class c extends k3 {
    public c(List<c2> list) {
        super(list);
    }

    @Override // bo.app.c2
    public boolean a(t2 t2Var) {
        Iterator<c2> it = this.b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!it.next().a(t2Var)) {
                return false;
            }
            z = true;
        }
        return z;
    }
}
