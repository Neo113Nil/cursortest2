package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class afb extends qzh {
    public final boolean t;
    public final boolean u;
    public final int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afb(Context context) {
        super(context);
        context.getClass();
        this.t = true;
        this.u = true;
        this.v = 24;
    }

    @Override // defpackage.qzh, defpackage.w0
    public final void G(t54 t54Var, int i, int i2, AdBannerView adBannerView) {
        super.G(t54Var, i, i2, adBannerView);
        boolean z = CollectionsKt.a0(i + 1, this.i) instanceof y21;
        FrameLayout frameLayout = t54Var.b;
        if (z) {
            sea.v(frameLayout, false, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            return;
        }
        adBannerView.setBackground(null);
        frameLayout.setBackgroundColor(frameLayout.getContext().getColor(R.color.surface_0));
        frameLayout.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // defpackage.qzh
    public final int P() {
        return this.v;
    }

    @Override // defpackage.qzh
    public final boolean R() {
        return this.t;
    }

    @Override // defpackage.qzh
    public final boolean T() {
        return this.u;
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

    @Override // defpackage.qzh, defpackage.w0, defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (!(obj instanceof zeb)) {
            return super.v(obj);
        }
        haf hafVar = pzh.b;
        return 15;
    }

    @Override // defpackage.qzh, defpackage.w0, defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        haf hafVar = pzh.b;
        if (i != 15) {
            return super.z(viewGroup, i);
        }
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.viewholder_live_empty_state, viewGroup, false);
        if (inflate != null) {
            return new ja9(new ddd((GraphicLarge) inflate, 2));
        }
        yhk.s("rootView");
        return null;
    }
}
