package defpackage;

import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class c8l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8l b;

    public /* synthetic */ c8l(h8l h8lVar, int i) {
        this.a = i;
        this.b = h8lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        int i = this.a;
        h8l h8lVar = this.b;
        switch (i) {
            case 0:
                Map map = h8lVar.f;
                if (map == null) {
                    Intrinsics.i("groupedData");
                    throw null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getKey() != g8l.k || ((d8l) entry.getValue()).a.size() > 1) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(((g8l) ((Map.Entry) it.next()).getKey()).name());
                }
                SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) h8lVar.d.n;
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        b.q();
                        throw null;
                    }
                    String str = (String) next;
                    g8l.e.getClass();
                    g8l j = jle.j(str);
                    Map map2 = h8lVar.f;
                    if (map2 == null) {
                        Intrinsics.i("groupedData");
                        throw null;
                    }
                    d8l d8lVar = (d8l) map2.get(j);
                    if (d8lVar == null || (list = d8lVar.a) == null) {
                        list = km5.a;
                    }
                    String string = h8lVar.getContext().getString(j.d);
                    string.getClass();
                    arrayList2.add(new s1h(str, string, list.size() > 1));
                    i2 = i3;
                }
                SegmentedButtonsView.t(segmentedButtonsView, arrayList2, null, 2);
                return;
            case 1:
                g8l g8lVar = h8lVar.h;
                if (g8lVar == null) {
                    Intrinsics.i("selectedTab");
                    throw null;
                }
                if (g8lVar == g8l.f) {
                    h8lVar.q();
                    return;
                } else {
                    h8lVar.p();
                    return;
                }
            default:
                h8l.u(h8lVar);
                return;
        }
    }
}
