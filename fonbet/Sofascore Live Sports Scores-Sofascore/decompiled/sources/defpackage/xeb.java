package defpackage;

import android.app.Application;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lxeb;", "Lq8;", "veb", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class xeb extends q8 {
    public final vyh e;
    public final w3b f;
    public final udl g;
    public veb h;
    public volatile Map i;
    public qqb j;
    public final LinkedHashMap k;
    public final yzc l;
    public final yzc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xeb(Application application, vyh vyhVar, w3b w3bVar, udl udlVar) {
        super(application);
        vyhVar.getClass();
        w3bVar.getClass();
        udlVar.getClass();
        this.e = vyhVar;
        this.f = w3bVar;
        this.g = udlVar;
        xw3.L(un0.z(this), null, null, new ppa(this, null, 4), 3);
        km5 km5Var = km5.a;
        this.h = new veb(km5Var, km5Var, km5Var, false);
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.i = lm5Var;
        this.k = new LinkedHashMap();
        yzc yzcVar = new yzc();
        this.l = yzcVar;
        this.m = yzcVar;
    }

    public static void k(xeb xebVar, String str, List list) {
        xebVar.getClass();
        str.getClass();
        list.getClass();
        qqb qqbVar = xebVar.j;
        if (qqbVar != null) {
            long w = yaa.w();
            iz2 z = un0.z(xebVar);
            hs4 hs4Var = z45.a;
            xw3.L(z, hq4.c, null, new web(qqbVar, w, xebVar, str, list, null), 2);
        }
    }

    @Override // defpackage.ltk
    public final void e() {
        f5p.E(i(), new u41(2, null, 7));
    }

    public final ArrayList l(List list) {
        FavoritesEventsData favoritesEventsData = (FavoritesEventsData) ((ddi) this.g.o.getValue()).getValue();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            favoritesEventsData.populateEventType((Event) it.next());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            HashSet<EventType> typeList = ((Event) obj).getTypeList();
            if (typeList == null || typeList.isEmpty()) {
                arrayList2.add(obj);
            } else {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.w0(CollectionsKt.H0(arrayList2, new cp(this, 20)), CollectionsKt.H0(arrayList, new i31(4, o93.a(new abb(5), new abb(6), new abb(7)), this.i)));
    }
}
