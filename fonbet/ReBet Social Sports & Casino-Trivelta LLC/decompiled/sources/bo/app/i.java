package bo.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i extends ua {
    public i(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // bo.app.f9
    public final boolean a(v9 v9Var) {
        ArrayList arrayList = this.f26113a;
        int size = arrayList.size();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((f9) obj).a(v9Var)) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }
}
