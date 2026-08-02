package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sse extends b7e {
    public final Fragment u;
    public final tug v;
    public final Map w;
    public final boolean x;
    public final gt8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sse(Context context, Fragment fragment, tug tugVar, Map map, boolean z, nqe nqeVar) {
        super(context);
        context.getClass();
        this.u = fragment;
        this.v = tugVar;
        this.w = map;
        this.x = z;
        this.y = nqeVar;
    }

    @Override // defpackage.w0, defpackage.g7
    public final void F(List list) {
        Map map;
        list.getClass();
        int i = 0;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            if (obj instanceof y21) {
                y21 y21Var = (y21) obj;
                y21Var.n = !(CollectionsKt.a0(i3, list) instanceof y21);
                Object a0 = CollectionsKt.a0(i2 - 1, list);
                y21Var.M = ((a0 instanceof y21) || (a0 instanceof lrj)) ? false : true;
            }
            i2 = i3;
        }
        Fragment fragment = this.u;
        if (fragment != null && (map = this.w) != null) {
            ia0 ia0Var = ia0.q;
            if (mz1.C()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!(obj2 instanceof AdBannerView)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i4 = i + 1;
                    if (i < 0) {
                        b.q();
                        throw null;
                    }
                    Integer valueOf = ((next instanceof lrj) || (next instanceof Transfer)) ? Integer.valueOf(i) : null;
                    if (valueOf != null) {
                        arrayList2.add(valueOf);
                    }
                    i = i4;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (((Number) next2).intValue() > 0) {
                        arrayList3.add(next2);
                    }
                }
                M(fragment, arrayList3, map);
            }
        }
        super.F(list);
    }

    @Override // defpackage.qzh, defpackage.w0
    public final void G(t54 t54Var, int i, int i2, AdBannerView adBannerView) {
        super.G(t54Var, i, i2, adBannerView);
        if (this.u == null || this.w == null) {
            return;
        }
        adBannerView.setBackground(null);
    }

    @Override // defpackage.qzh, defpackage.w0
    /* renamed from: Q */
    public final ame I(ArrayList arrayList) {
        return new ame(this.i, arrayList);
    }

    public final void Y(v8a v8aVar) {
        ArrayList arrayList = this.i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof y21) {
                ((y21) next).I = v8aVar;
            }
        }
        notifyItemRangeChanged(arrayList.indexOf(CollectionsKt.firstOrNull(arrayList)), arrayList.size());
    }

    @Override // defpackage.b7e, defpackage.qzh, defpackage.w0, defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        haf hafVar = pzh.b;
        LayoutInflater layoutInflater = this.r;
        if (i == 2) {
            return new wrj(zl.e(layoutInflater, viewGroup), this.x, 0, false, 28);
        }
        gt8 gt8Var = this.y;
        if (i == 0 || i == 5 || i == 8) {
            return new jqe(bcb.a(layoutInflater, viewGroup), gt8Var, 2);
        }
        if (i == 4) {
            return new k04(p12.e(layoutInflater, viewGroup), null, 0, 6);
        }
        if (i != 1) {
            return super.z(viewGroup, i);
        }
        View inflate = layoutInflater.inflate(R.layout.viewholder_event_baseball_table, viewGroup, false);
        int i2 = R.id.container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate);
        if (linearLayout != null) {
            i2 = R.id.date;
            TextView textView = (TextView) nq8.B(R.id.date, inflate);
            if (textView != null) {
                i2 = R.id.divider;
                View B = nq8.B(R.id.divider, inflate);
                if (B != null) {
                    i2 = R.id.home_away_indicator;
                    TextView textView2 = (TextView) nq8.B(R.id.home_away_indicator, inflate);
                    if (textView2 != null) {
                        i2 = R.id.opponent_logo;
                        ImageView imageView = (ImageView) nq8.B(R.id.opponent_logo, inflate);
                        if (imageView != null) {
                            i2 = R.id.result;
                            TextView textView3 = (TextView) nq8.B(R.id.result, inflate);
                            if (textView3 != null) {
                                i2 = R.id.scroller;
                                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.scroller, inflate);
                                if (scrollInterceptorHorizontalScrollView != null) {
                                    i2 = R.id.special_status;
                                    TextView textView4 = (TextView) nq8.B(R.id.special_status, inflate);
                                    if (textView4 != null) {
                                        return new km1(new bv1((ConstraintLayout) inflate, linearLayout, textView, B, textView2, imageView, textView3, scrollInterceptorHorizontalScrollView, textView4), this.v, gt8Var);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
