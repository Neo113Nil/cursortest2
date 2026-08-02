package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ehe extends qzh {
    public final boolean t;
    public final boolean u;
    public final int v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehe(Context context) {
        super(context);
        context.getClass();
        this.t = true;
        this.u = true;
        this.v = 24;
        this.w = -1;
    }

    @Override // defpackage.w0, defpackage.g7
    public final void F(List list) {
        list.getClass();
        super.F(list);
        Iterator it = this.i.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() instanceof dhe) {
                break;
            } else {
                i++;
            }
        }
        this.w = i;
    }

    @Override // defpackage.qzh, defpackage.w0
    public final void G(t54 t54Var, int i, int i2, AdBannerView adBannerView) {
        FrameLayout frameLayout = t54Var.b;
        pv5 pv5Var = null;
        adBannerView.setBackground(null);
        adBannerView.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ArrayList arrayList = this.i;
        Object a0 = CollectionsKt.a0(i + 1, arrayList);
        if (i > 0) {
            int v = a0 != null ? v(a0) : 0;
            haf hafVar = pzh.b;
            if (v >= 0) {
                if (a0 instanceof lrj) {
                    pv5Var = ((lrj) a0).i;
                } else if (a0 instanceof y21) {
                    pv5Var = ((y21) a0).p;
                } else if (a0 instanceof krj) {
                    pv5Var = ((krj) a0).d;
                }
                sea.v(frameLayout, false, i == arrayList.size() - 1, 24, 6, 0, pv5Var, 48);
                return;
            }
        }
        frameLayout.setBackgroundColor(frameLayout.getContext().getColor(R.color.surface_0));
        frameLayout.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // defpackage.qzh
    public final int P() {
        return this.v;
    }

    @Override // defpackage.qzh
    public final boolean S() {
        return this.u;
    }

    @Override // defpackage.qzh
    public final boolean T() {
        return this.t;
    }

    public final boolean V(int i, y21 y21Var) {
        if (y21Var.p == null) {
            return false;
        }
        int size = i - this.g.size();
        int i2 = this.w;
        return i2 >= 0 && i2 < size && size != b.i(this.i);
    }

    @Override // defpackage.qzh, defpackage.w0, defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof m32) {
            haf hafVar = pzh.b;
            return 11;
        }
        if (!(obj instanceof dhe)) {
            return super.v(obj);
        }
        haf hafVar2 = pzh.b;
        return 12;
    }

    @Override // defpackage.g7, androidx.recyclerview.widget.l
    /* renamed from: y */
    public final void onBindViewHolder(p8 p8Var, int i, List list) {
        p8Var.getClass();
        list.getClass();
        int size = i - this.g.size();
        ArrayList arrayList = this.i;
        Object a0 = CollectionsKt.a0(size, arrayList);
        if (a0 != null) {
            int i2 = this.w;
            if (i2 < 0 || i2 >= size) {
                Object a02 = CollectionsKt.a0(size - 1, arrayList);
                int i3 = size + 1;
                while (i3 < arrayList.size() && (arrayList.get(i3) instanceof AdBannerView)) {
                    i3++;
                }
                Object a03 = CollectionsKt.a0(i3, arrayList);
                boolean z = a03 == null || (a03 instanceof lrj) || (a03 instanceof m32) || (a03 instanceof dhe);
                if (a0 instanceof lrj) {
                    lrj lrjVar = (lrj) a0;
                    lrjVar.k = !(a02 instanceof m32);
                    lrjVar.l = z;
                    lrjVar.b = false;
                } else if (a0 instanceof y21) {
                    y21 y21Var = (y21) a0;
                    y21Var.M = a02 == null;
                    y21Var.n = z;
                }
            } else {
                boolean z2 = size == arrayList.size() - 1;
                Object a04 = CollectionsKt.a0(size - 1, arrayList);
                if (a0 instanceof lrj) {
                    boolean z3 = (a04 instanceof m32) || ((a04 instanceof y21) && ((y21) a04).p != null);
                    boolean z4 = a04 instanceof dhe;
                    lrj lrjVar2 = (lrj) a0;
                    lrjVar2.k = false;
                    lrjVar2.l = z2;
                    if (!z4 && !z3) {
                        r4 = true;
                    }
                    lrjVar2.b = r4;
                } else if (a0 instanceof y21) {
                    y21 y21Var2 = (y21) a0;
                    y21Var2.M = false;
                    if (y21Var2.p == null) {
                        y21Var2.n = z2;
                    }
                }
            }
        }
        x(this, p8Var, i, list);
    }

    @Override // defpackage.qzh, defpackage.w0, defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        haf hafVar = pzh.b;
        LayoutInflater layoutInflater = this.r;
        return i == 11 ? new che(this, ed.d(layoutInflater, viewGroup)) : i == 12 ? new u03(z82.g(layoutInflater, viewGroup), 1) : i == 0 ? new wk4(this, bcb.a(layoutInflater, viewGroup)) : i == 5 ? new ai6(this, pvk.a(layoutInflater, viewGroup)) : i == 7 ? new bi6(this, qvk.a(layoutInflater, viewGroup)) : i == 8 ? new yh6(this, j22.d(layoutInflater, viewGroup)) : i == 4 ? new zh6(this, p12.e(layoutInflater, viewGroup)) : super.z(viewGroup, i);
    }
}
