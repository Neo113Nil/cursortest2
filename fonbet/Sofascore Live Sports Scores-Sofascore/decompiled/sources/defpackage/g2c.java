package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g2c extends RecyclerView.OnScrollListener {
    public final /* synthetic */ i2c a;

    public g2c(i2c i2cVar) {
        this.a = i2cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        recyclerView.getClass();
        if (i == 0) {
            i2c i2cVar = this.a;
            i2cVar.a.getHitRect(i2cVar.d);
            ArrayList a = i2cVar.a();
            LinkedHashMap linkedHashMap = i2cVar.c;
            for (h2c h2cVar : CollectionsKt.I0(linkedHashMap.keySet(), a)) {
                Long l = (Long) linkedHashMap.get(h2cVar);
                i2cVar.b(h2cVar, l != null ? l.longValue() : 0L);
                linkedHashMap.remove(h2cVar);
            }
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = CollectionsKt.I0(a, linkedHashMap.keySet()).iterator();
            while (it.hasNext()) {
                linkedHashMap.put((h2c) it.next(), Long.valueOf(currentTimeMillis));
            }
        }
    }
}
