package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class w0 extends g7 {
    public LinkedHashMap l;
    public final int m;
    public int n;
    public boolean o;
    public final t0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Context context) {
        super(context);
        context.getClass();
        this.l = new LinkedHashMap();
        this.m = ao2.s(8, context);
        this.p = t0.STANDARD;
    }

    @Override // defpackage.g7
    public void F(List list) {
        ArrayList k = me4.k(list);
        for (Object obj : list) {
            if (!(obj instanceof AdBannerView)) {
                k.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList(k);
        for (Map.Entry entry : this.l.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            AdBannerView adBannerView = (AdBannerView) entry.getValue();
            if (!this.o && (intValue = intValue + this.n) < 0) {
                intValue = 0;
            }
            if (arrayList.size() > intValue) {
                if (CollectionsKt.a0(intValue - 1, arrayList) instanceof m32) {
                    intValue--;
                }
                arrayList.add(intValue, adBannerView);
            } else if (J() && arrayList.isEmpty()) {
                arrayList.add(adBannerView);
            }
        }
        super.F(arrayList);
    }

    public void G(t54 t54Var, int i, int i2, AdBannerView adBannerView) {
        adBannerView.setBackground(null);
        adBannerView.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public t0 H() {
        return this.p;
    }

    public abstract f3 I(ArrayList arrayList);

    public boolean J() {
        return false;
    }

    public final void K(Fragment fragment, Map map, boolean z) {
        map.getClass();
        if (z) {
            L(fragment, 1, map);
        }
        int i = z ? 13 : 1;
        if (this.l.get(Integer.valueOf(i)) != null || fragment.getActivity() == null) {
            return;
        }
        AdBannerView adBannerView = new AdBannerView(this.b, null, 6);
        int paddingStart = adBannerView.getPaddingStart();
        int paddingEnd = adBannerView.getPaddingEnd();
        int i2 = this.m;
        adBannerView.setPaddingRelative(paddingStart, i2, paddingEnd, i2);
        adBannerView.setAdType(H().b);
        adBannerView.setCustomTargeting(map);
        this.l.put(Integer.valueOf(i), adBannerView);
    }

    public final void L(Fragment fragment, int i, Map map) {
        if (this.l.get(Integer.valueOf(i)) != null || fragment.getActivity() == null) {
            return;
        }
        AdBannerView adBannerView = new AdBannerView(this.b, null, 6);
        int paddingStart = adBannerView.getPaddingStart();
        int paddingEnd = adBannerView.getPaddingEnd();
        int i2 = this.m;
        adBannerView.setPaddingRelative(paddingStart, i2, paddingEnd, i2);
        adBannerView.setAdType(H().a);
        adBannerView.setCustomTargeting(map);
        this.l.put(Integer.valueOf(i), adBannerView);
    }

    public final void M(Fragment fragment, ArrayList arrayList, Map map) {
        fragment.getClass();
        map.getClass();
        vg0 vg0Var = new vg0(this.l.values());
        this.l.clear();
        this.o = true;
        xbb b = a.b();
        int i = 0;
        for (Object obj : CollectionsKt.L0(arrayList, 15)) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            int intValue = ((Number) obj).intValue();
            if (i % 5 == 4) {
                b.add(Integer.valueOf((i / 5) + intValue));
            }
            i = i2;
        }
        Iterator it = CollectionsKt.L0(a.a(b), 3).iterator();
        while (it.hasNext()) {
            int intValue2 = ((Number) it.next()).intValue();
            if (vg0Var.isEmpty()) {
                L(fragment, intValue2, map);
            } else {
                this.l.put(Integer.valueOf(intValue2), vg0Var.removeFirst());
            }
        }
    }

    public final void N(int i) {
        if (1 - i < 0 && i < 0) {
            i = 0;
        }
        this.n = i;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return new v0(this.i, arrayList, I(arrayList));
    }

    @Override // defpackage.g7
    public int v(Object obj) {
        obj.getClass();
        if (obj instanceof AdBannerView) {
            return Sdk.SDKError.Reason.AD_NO_FILL_VALUE;
        }
        ogj.h(obj);
        return 0;
    }

    @Override // defpackage.g7
    public p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i != 10001) {
            a70.p(String.valueOf(i));
            return null;
        }
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.main_list_ad_view, viewGroup, false);
        if (inflate != null) {
            return new u0(this, new t54((FrameLayout) inflate, 2));
        }
        yhk.s("rootView");
        return null;
    }
}
