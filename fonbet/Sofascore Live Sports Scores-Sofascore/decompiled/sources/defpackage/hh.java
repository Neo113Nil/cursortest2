package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class hh {
    public final RecyclerView a;
    public final Function1 b;
    public Long d;
    public final HashMap c = new HashMap();
    public final boolean e = true;

    public hh(RecyclerView recyclerView, Function1 function1) {
        this.a = recyclerView;
        this.b = function1;
        recyclerView.addOnScrollListener(new gh(this));
    }

    public abstract int a();

    public abstract g7 b();

    public abstract void c(ArrayList arrayList);

    public final void d() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        if (!this.e) {
            valueOf = null;
        }
        this.d = valueOf;
    }

    public final void e() {
        Long l;
        LinearLayoutManager linearLayoutManager;
        double d;
        double d2;
        Long l2 = this.d;
        if (l2 != null) {
            long currentTimeMillis = System.currentTimeMillis() - l2.longValue();
            n layoutManager = this.a.getLayoutManager();
            layoutManager.getClass();
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) layoutManager;
            int a = a();
            int findFirstVisibleItemPosition = linearLayoutManager2.findFirstVisibleItemPosition() - a;
            int findLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition() - a;
            ArrayList arrayList = b().i;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                if (findFirstVisibleItemPosition > i || i > findLastVisibleItemPosition) {
                    linearLayoutManager = linearLayoutManager2;
                } else {
                    int i3 = i + a;
                    View findViewByPosition = linearLayoutManager2.findViewByPosition(i3);
                    double d3 = 0.0d;
                    if (findViewByPosition != null) {
                        Rect rect = new Rect();
                        if (findViewByPosition.isAttachedToWindow()) {
                            findViewByPosition.getGlobalVisibleRect(rect);
                        }
                        d = Math.abs(rect.width() + 0.01d) / (findViewByPosition.getWidth() + 0.01d);
                    } else {
                        d = 0.0d;
                    }
                    View findViewByPosition2 = linearLayoutManager2.findViewByPosition(i3);
                    if (findViewByPosition2 != null) {
                        Rect rect2 = new Rect();
                        if (findViewByPosition2.isAttachedToWindow()) {
                            findViewByPosition2.getGlobalVisibleRect(rect2);
                        }
                        linearLayoutManager = linearLayoutManager2;
                        d2 = d;
                        d3 = Math.abs(rect2.height() + 0.01d) / (findViewByPosition2.getHeight() + 0.01d);
                    } else {
                        linearLayoutManager = linearLayoutManager2;
                        d2 = d;
                    }
                    if (d2 * d3 > 0.5d) {
                        arrayList2.add(next);
                    }
                }
                i = i2;
                linearLayoutManager2 = linearLayoutManager;
            }
            Iterator it2 = CollectionsKt.W(arrayList2).iterator();
            while (it2.hasNext()) {
                f(it2.next(), currentTimeMillis);
            }
            l = null;
        } else {
            l = null;
        }
        this.d = l;
        Set entrySet = this.c.entrySet();
        entrySet.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : entrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (((fh) entry.getValue()).a >= 500 && !((fh) entry.getValue()).b) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Map.Entry) it3.next()).getKey());
        }
        HashSet Q0 = CollectionsKt.Q0(arrayList4);
        ArrayList W = CollectionsKt.W(b().i);
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = W.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            Object invoke = this.b.invoke(next2);
            if (invoke != null ? Q0.contains(invoke) : false) {
                arrayList5.add(next2);
            }
        }
        c(arrayList5);
    }

    public abstract void f(Object obj, long j);
}
