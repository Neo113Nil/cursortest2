package bo.app;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class v3 extends k3 {
    public v3(List<c2> list) {
        super(list);
    }

    @Override // bo.app.c2
    public boolean a(t2 t2Var) {
        Iterator<c2> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().a(t2Var)) {
                return true;
            }
        }
        return false;
    }
}
