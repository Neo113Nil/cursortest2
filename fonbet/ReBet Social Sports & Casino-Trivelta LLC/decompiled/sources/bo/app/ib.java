package bo.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ib extends ua {
    public ib(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        ArrayList arrayList = this.f26113a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((f9) obj).a(v9Var)) {
                return true;
            }
        }
        return false;
    }
}
