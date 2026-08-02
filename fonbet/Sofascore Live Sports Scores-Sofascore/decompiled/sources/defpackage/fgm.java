package defpackage;

import com.blaze.blazesdk.closed_captions.models.ui.b;
import com.blaze.blazesdk.closed_captions.models.ui.d;
import com.blaze.blazesdk.closed_captions.models.ui.e;
import com.blaze.blazesdk.features.shared.models.ui_shared.BaseLayerType;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import defpackage.gim;
import defpackage.n4m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class fgm {
    public static final n4m.a a(rvl rvlVar, atm atmVar, atm atmVar2, Double d) {
        rvlVar.getClass();
        atmVar.getClass();
        BaseLayerType baseLayerType = rvlVar.a;
        int i = baseLayerType == null ? -1 : iam.a[baseLayerType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i != 1) {
            if (i == 2) {
                return new n4m.a.C1353a(atmVar.a, d != null ? d.doubleValue() : 0.0d, atmVar.d);
            }
            zzl.b();
            return null;
        }
        int ordinal = rvlVar.b.b.ordinal();
        if (ordinal == 0) {
            return new n4m.a.b.c(atmVar.a, atmVar2 != null ? atmVar2.a : null, atmVar.b, atmVar.c, atmVar.d);
        }
        if (ordinal == 1) {
            return new n4m.a.b.C1355b(atmVar.a, atmVar2 != null ? atmVar2.a : null, atmVar.b, atmVar.c, atmVar.d);
        }
        if (ordinal == 2) {
            return new n4m.a.b.C1354a(atmVar.a, atmVar2 != null ? atmVar2.a : null, atmVar.b, atmVar.c, atmVar.d);
        }
        zzl.b();
        return null;
    }

    public static final n7m b(List list) {
        Object obj;
        n7m n7mVar;
        ArrayList k = me4.k(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n7m j = j((n4m) it.next());
            if (j != null) {
                k.add(j);
            }
        }
        Iterator it2 = h49.a(new vcm(k)).entrySet().iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                int intValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it2.next();
                    int intValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry = (Map.Entry) obj;
        return (entry == null || (n7mVar = (n7m) entry.getKey()) == null) ? n7m.HLS : n7mVar;
    }

    public static final Map c(n4m n4mVar, n4m n4mVar2) {
        srl srlVar;
        StoryModel storyModel;
        StoryModel storyModel2;
        gim gimVar = n4mVar != null ? n4mVar.b : null;
        gim.d dVar = gimVar instanceof gim.d ? (gim.d) gimVar : null;
        gim gimVar2 = n4mVar2 != null ? n4mVar2.b : null;
        gim.d dVar2 = gimVar2 instanceof gim.d ? (gim.d) gimVar2 : null;
        if (!Intrinsics.c((dVar == null || (storyModel2 = dVar.a) == null) ? null : storyModel2.id, (dVar2 == null || (storyModel = dVar2.a) == null) ? null : storyModel.id) || dVar == null || (srlVar = dVar.b) == null) {
            return null;
        }
        return srlVar.p;
    }

    public static /* synthetic */ n4m.a createContentFromBaseLayer$default(rvl rvlVar, atm atmVar, atm atmVar2, Double d, int i, Object obj) {
        if ((i & 8) != 0) {
            d = null;
        }
        return a(rvlVar, atmVar, atmVar2, d);
    }

    public static final eqm d(n4m n4mVar) {
        n4mVar.getClass();
        gim gimVar = n4mVar.b;
        if (gimVar instanceof gim.b) {
            return ((gim.b) gimVar).a;
        }
        if (gimVar instanceof gim.d) {
            return ((gim.d) gimVar).b;
        }
        if (gimVar instanceof gim.e) {
            return ((gim.e) gimVar).a;
        }
        if (!(gimVar instanceof gim.a) && !(gimVar instanceof gim.c)) {
            zzl.b();
        }
        return null;
    }

    public static final ytm e(n4m n4mVar) {
        n4mVar.getClass();
        gim gimVar = n4mVar.b;
        if (gimVar instanceof gim.b) {
            return ((gim.b) gimVar).a;
        }
        if (gimVar instanceof gim.e) {
            return ((gim.e) gimVar).a;
        }
        if (!(gimVar instanceof gim.d) && !(gimVar instanceof gim.a) && !(gimVar instanceof gim.c)) {
            zzl.b();
        }
        return null;
    }

    public static final hzk f(n4m n4mVar) {
        n4mVar.getClass();
        gim gimVar = n4mVar.b;
        if (gimVar instanceof gim.b) {
            return ((gim.b) gimVar).a;
        }
        if (gimVar instanceof gim.e) {
            return ((gim.e) gimVar).a;
        }
        if (gimVar instanceof gim.d) {
            return ((gim.d) gimVar).a;
        }
        if (!(gimVar instanceof gim.a) && !(gimVar instanceof gim.c)) {
            zzl.b();
        }
        return null;
    }

    public static final String g(n4m n4mVar) {
        List x;
        eqm d = d(n4mVar);
        ArrayList arrayList = null;
        if (d != null) {
            if (!d.d()) {
                d = null;
            }
            if (d != null && (x = d.getX()) != null) {
                arrayList = new ArrayList(k13.r(x, 10));
                Iterator it = x.iterator();
                while (it.hasNext()) {
                    arrayList.add(((gbm) it.next()).b);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return "Unavailable";
        }
        e eVar = pc2.b;
        return (eVar == null || CollectionsKt.R(arrayList, eVar)) ? eVar instanceof d ? "Unknown" : eVar instanceof b ? ((b) eVar).a : "Off" : "Unavailable";
    }

    public static final double h(n4m n4mVar) {
        n4mVar.getClass();
        gim gimVar = n4mVar.b;
        if (gimVar instanceof gim.e) {
            return ((gim.e) gimVar).a.c;
        }
        if (gimVar instanceof gim.b) {
            return ((gim.b) gimVar).a.c;
        }
        if (gimVar instanceof gim.d) {
            return ((gim.d) gimVar).b.b;
        }
        if (!(gimVar instanceof gim.a) && !(gimVar instanceof gim.c)) {
            zzl.b();
        }
        return 0.0d;
    }

    public static final String i(n4m n4mVar) {
        n4m.a aVar = n4mVar.c;
        if (aVar instanceof n4m.a.b) {
            return ((n4m.a.b) aVar).d();
        }
        if (aVar instanceof n4m.a.C1353a) {
            return ((n4m.a.C1353a) aVar).a;
        }
        if (aVar instanceof p7m) {
            return null;
        }
        zzl.b();
        return null;
    }

    public static final n7m j(n4m n4mVar) {
        n4mVar.getClass();
        n4m.a aVar = n4mVar.c;
        if (aVar instanceof n4m.a.b.c) {
            return n7m.MP4;
        }
        if (aVar instanceof n4m.a.b.C1355b) {
            return n7m.HLS;
        }
        if (aVar instanceof n4m.a.b.C1354a) {
            return n7m.DASH;
        }
        if ((aVar instanceof n4m.a.C1353a) || (aVar instanceof p7m)) {
            return null;
        }
        zzl.b();
        return null;
    }

    public static final yom k(n4m n4mVar) {
        n7m j;
        n4m.a aVar = n4mVar.c;
        if (!(aVar instanceof n4m.a.b) || (j = j(n4mVar)) == null) {
            return null;
        }
        n4m.a.b bVar = (n4m.a.b) aVar;
        return new yom(bVar.e(), bVar.b(), bVar.c(), j);
    }
}
