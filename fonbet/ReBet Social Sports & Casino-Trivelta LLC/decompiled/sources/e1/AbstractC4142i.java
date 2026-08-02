package e1;

import android.os.Bundle;
import com.google.common.collect.AbstractC3445z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: e1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4142i {
    public static AbstractC3445z a(Ra.f fVar, List list) {
        AbstractC3445z.a k10 = AbstractC3445z.k();
        for (int i10 = 0; i10 < list.size(); i10++) {
            k10.a(fVar.apply((Bundle) AbstractC4134a.e((Bundle) list.get(i10))));
        }
        return k10.m();
    }

    public static ArrayList b(Collection collection, Ra.f fVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) fVar.apply(it.next()));
        }
        return arrayList;
    }
}
