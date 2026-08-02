package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i2c {
    public final RecyclerView a;
    public final String b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final Rect d = new Rect();

    public i2c(RecyclerView recyclerView, String str) {
        this.a = recyclerView;
        this.b = str;
        recyclerView.addOnScrollListener(new g2c(this));
    }

    public final ArrayList a() {
        h2c h2cVar;
        RecyclerView recyclerView = this.a;
        List q = i5h.q(i5h.g(new tsk(recyclerView), new ida(this, 25)));
        ArrayList arrayList = new ArrayList();
        Iterator it = q.iterator();
        while (it.hasNext()) {
            u childViewHolder = recyclerView.getChildViewHolder((View) it.next());
            childViewHolder.getClass();
            if (childViewHolder instanceof rnl) {
                rnl rnlVar = (rnl) childViewHolder;
                h2cVar = new h2c(rnlVar.d, rnlVar.e);
            } else {
                h2cVar = null;
            }
            if (h2cVar != null) {
                arrayList.add(h2cVar);
            }
        }
        return arrayList;
    }

    public final void b(h2c h2cVar, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis <= 500 || j == 0) {
            return;
        }
        Context context = this.a.getContext();
        context.getClass();
        nv.Z(context, h2cVar.a, currentTimeMillis, Integer.valueOf(h2cVar.b), this.b);
    }

    public final void c() {
        this.a.getHitRect(this.d);
        long currentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.clear();
        ArrayList a = a();
        int c = sub.c(k13.r(a, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap2.put(next, Long.valueOf(currentTimeMillis));
        }
        linkedHashMap.putAll(linkedHashMap2);
    }
}
