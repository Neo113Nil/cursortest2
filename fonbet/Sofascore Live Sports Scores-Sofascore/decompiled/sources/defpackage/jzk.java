package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class jzk extends b7e {
    public final Team u;
    public final Fragment v;
    public final Map w;
    public int x;
    public final KClass y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzk(Context context, Team team, Fragment fragment, Map map) {
        super(context);
        context.getClass();
        this.u = team;
        this.v = fragment;
        this.w = map;
        this.y = duf.a.getOrCreateKotlinClass(lrj.class);
    }

    @Override // defpackage.w0, defpackage.g7
    public void F(List list) {
        Map map;
        list.getClass();
        Fragment fragment = this.v;
        if (fragment != null && (map = this.w) != null) {
            ia0 ia0Var = ia0.q;
            if (mz1.C()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!(obj instanceof AdBannerView) && !(obj instanceof String)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.i;
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!(next instanceof AdBannerView) && !(next instanceof String)) {
                        arrayList2.add(next);
                    }
                }
                int i = 0;
                this.x += (arrayList3.isEmpty() || Intrinsics.c(CollectionsKt.firstOrNull(arrayList2), CollectionsKt.firstOrNull(arrayList))) ? 0 : arrayList.size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list) {
                    if (!(obj2 instanceof AdBannerView)) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        b.q();
                        throw null;
                    }
                    Integer valueOf = Y().isInstance(next2) ? Integer.valueOf(i) : null;
                    if (valueOf != null) {
                        arrayList5.add(valueOf);
                    }
                    i = i2;
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    if (((Number) next3).intValue() > this.x) {
                        arrayList6.add(next3);
                    }
                }
                M(fragment, arrayList6, map);
            }
        }
        super.F(list);
    }

    @Override // defpackage.qzh, defpackage.w0
    public final void G(t54 t54Var, int i, int i2, AdBannerView adBannerView) {
        super.G(t54Var, i, i2, adBannerView);
        if (this.v == null || this.w == null) {
            return;
        }
        adBannerView.setBackground(null);
    }

    public KClass Y() {
        return this.y;
    }

    @Override // defpackage.g7, androidx.recyclerview.widget.l
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.k = recyclerView;
        u6b w = qha.w(recyclerView);
        if (w != null) {
            hc6.i(this, w);
        }
    }

    @Override // defpackage.b7e, defpackage.qzh, defpackage.w0, defpackage.g7
    public p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater from = LayoutInflater.from(this.b);
        haf hafVar = pzh.b;
        Team team = this.u;
        return i == 5 ? new nj8(pvk.a(from, viewGroup), false, new sl6(team), 0, 10) : i == 7 ? new nj8(qvk.a(from, viewGroup), false, new sl6(team), 0, 10) : i == 8 ? new ir1(j22.d(from, viewGroup), false, new sl6(team), false, 0, 26) : i == 0 ? new ir1(bcb.a(from, viewGroup), false, false, new sl6(team), 0, 22) : i == 4 ? new k04(p12.e(from, viewGroup), new sl6(team), 0, 4) : super.z(viewGroup, i);
    }
}
