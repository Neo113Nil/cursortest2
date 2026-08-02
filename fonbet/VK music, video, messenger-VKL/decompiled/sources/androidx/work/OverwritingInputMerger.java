package androidx.work;

import androidx.work.Data;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import xsna.f2x;

/* compiled from: OverwritingInputMerger.kt */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends f2x {
    @Override // xsna.f2x
    public final Data a(ArrayList arrayList) {
        Data.a aVar = new Data.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(Collections.unmodifiableMap(((Data) it.next()).a));
        }
        aVar.c(linkedHashMap);
        return aVar.a();
    }
}
