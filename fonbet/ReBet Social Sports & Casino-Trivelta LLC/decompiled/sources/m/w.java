package m;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class w {
    public static u0.i a(u0.i iVar, u0.i iVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < iVar.f() + iVar2.f()) {
            Locale c10 = i10 < iVar.f() ? iVar.c(i10) : iVar2.c(i10 - iVar.f());
            if (c10 != null) {
                linkedHashSet.add(c10);
            }
            i10++;
        }
        return u0.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static u0.i b(u0.i iVar, u0.i iVar2) {
        return (iVar == null || iVar.e()) ? u0.i.d() : a(iVar, iVar2);
    }
}
