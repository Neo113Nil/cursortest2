package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gi6 extends q2 implements hc6 {
    public final LayoutInflater q;
    public final int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi6(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        fragmentActivity.getClass();
        this.q = LayoutInflater.from(fragmentActivity);
        this.r = 24;
    }

    @Override // defpackage.w0
    public final void G(t54 t54Var, int i, int i2, AdBannerView adBannerView) {
        FrameLayout frameLayout = t54Var.b;
        super.G(t54Var, i, i2, adBannerView);
        Object a0 = CollectionsKt.a0(i + 1, this.i);
        int v = a0 != null ? v(a0) : 0;
        ei6 ei6Var = ei6.a;
        if (v >= 1) {
            sea.v(frameLayout, false, P(i), 24, 6, 0, a0 instanceof lrj ? ((lrj) a0).i : a0 instanceof y21 ? ((y21) a0).p : a0 instanceof krj ? ((krj) a0).d : null, 48);
        } else {
            frameLayout.setBackgroundColor(frameLayout.getContext().getColor(R.color.surface_0));
            frameLayout.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // defpackage.w0
    public final f3 I(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 12);
    }

    public final boolean P(int i) {
        ArrayList arrayList = this.i;
        Object a0 = CollectionsKt.a0(i + 1, arrayList);
        Integer valueOf = a0 != null ? Integer.valueOf(v(a0)) : null;
        Object a02 = CollectionsKt.a0(i + 2, arrayList);
        Integer valueOf2 = a02 != null ? Integer.valueOf(v(a02)) : null;
        if ((valueOf != null && valueOf.intValue() == 10001) || (valueOf != null && valueOf.intValue() == 10002)) {
            if (valueOf2 == null) {
                return true;
            }
            int intValue = valueOf2.intValue();
            ei6 ei6Var = ei6.a;
            return intValue < 1;
        }
        if (valueOf == null) {
            return true;
        }
        int intValue2 = valueOf.intValue();
        ei6 ei6Var2 = ei6.a;
        return intValue2 < 1;
    }

    public final void Q() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int v = v(next);
            ei6 ei6Var = ei6.a;
            if (v < 1) {
                arrayList.add(next);
            }
        }
        F(arrayList);
    }

    @Override // defpackage.ysk
    public final Integer a(int i) {
        ei6 ei6Var = (ei6) CollectionsKt.a0(i, ei6.e);
        switch (ei6Var == null ? -1 : fi6.a[ei6Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return Integer.valueOf(R.id.card_content);
            default:
                return null;
        }
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        ei6 ei6Var = (ei6) CollectionsKt.a0(i, ei6.e);
        switch (ei6Var == null ? -1 : fi6.a[ei6Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.hc6
    public final void k() {
        Iterator it = this.i.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            jfj jfjVar = null;
            if (i < 0) {
                b.q();
                throw null;
            }
            if (next instanceof y21) {
                y21 y21Var = (y21) next;
                if (Intrinsics.c(y21Var.d().getStatus().getType(), StatusKt.STATUS_IN_PROGRESS)) {
                    jfj jfjVar2 = y21Var.h;
                    if (jfjVar2 != null) {
                        jfjVar = jfj.a(jfjVar2, s9a.v(this.b, y21Var.d(), y21Var.d().getHideDate()), null, 6);
                    }
                    y21Var.h = jfjVar;
                    notifyItemChanged(this.g.size() + i, new ucb(y21Var.d()));
                }
            }
            i = i2;
        }
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

    @Override // defpackage.w0, defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj == ei6.a || obj == ei6.b || obj == ei6.c) {
            return 9;
        }
        if (obj instanceof ci6) {
            return 0;
        }
        if ((obj instanceof nwd) || (obj instanceof xc4) || (obj instanceof tt)) {
            return 1;
        }
        if (obj instanceof mj8) {
            return 2;
        }
        if (obj instanceof n5j) {
            return 3;
        }
        if (obj instanceof hr1) {
            return 4;
        }
        if (obj instanceof j04) {
            return 5;
        }
        if (obj instanceof lrj) {
            return 6;
        }
        if (obj instanceof krj) {
            return 7;
        }
        if (obj instanceof CustomizableDivider) {
            return 8;
        }
        if (obj instanceof m32) {
            return 12;
        }
        super.v(obj);
        return Sdk.SDKError.Reason.AD_NO_FILL_VALUE;
    }

    @Override // defpackage.w0, defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        ei6 ei6Var = ei6.a;
        LayoutInflater layoutInflater = this.q;
        if (i != 9) {
            return i == 0 ? new u03(z82.g(layoutInflater, viewGroup), 0) : i == 1 ? new wk4(this, bcb.a(layoutInflater, viewGroup)) : i == 2 ? new ai6(this, pvk.a(layoutInflater, viewGroup)) : i == 3 ? new bi6(this, qvk.a(layoutInflater, viewGroup)) : i == 4 ? new yh6(this, j22.d(layoutInflater, viewGroup)) : i == 5 ? new zh6(this, p12.e(layoutInflater, viewGroup)) : i == 6 ? new wrj(zl.e(layoutInflater, viewGroup), false, 0, true, 22) : i == 7 ? new j8i(u22.e(layoutInflater, viewGroup), true) : i == 8 ? new di6(this, ed.b(layoutInflater, viewGroup)) : i == 12 ? new l32(ed.d(layoutInflater, viewGroup)) : super.z(viewGroup, i);
        }
        View inflate = layoutInflater.inflate(R.layout.empty_state_card_layout, viewGroup, false);
        GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.empty_state, inflate);
        if (graphicLarge != null) {
            return new vh(this, new tm5((FrameLayout) inflate, graphicLarge, 0));
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.empty_state)));
        return null;
    }
}
