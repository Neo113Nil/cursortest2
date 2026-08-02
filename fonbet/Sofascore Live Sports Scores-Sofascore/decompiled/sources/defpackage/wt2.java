package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wt2 extends b7e {
    public final boolean u;
    public final boolean v;
    public final int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt2(Context context) {
        super(context);
        context.getClass();
        this.u = true;
        this.v = true;
        this.w = 24;
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
        frameLayout.setBackground(null);
        frameLayout.setBackgroundColor(frameLayout.getContext().getColor(R.color.surface_0));
        frameLayout.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // defpackage.qzh
    public final int P() {
        return this.w;
    }

    @Override // defpackage.qzh
    public final boolean S() {
        return this.v;
    }

    @Override // defpackage.qzh
    public final boolean T() {
        return this.u;
    }

    @Override // defpackage.qzh
    public final void U() {
        Iterator it = this.i.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            if (next instanceof lrj) {
                Tournament tournament = ((lrj) next).a;
                tournament.getClass();
                ia0 ia0Var = ia0.q;
                Set e = ok3.p().h().e();
                UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                if (uniqueTournament != null) {
                    Set set = e;
                    UniqueTournament uniqueTournament2 = tournament.getUniqueTournament();
                    uniqueTournament.setFavorite(CollectionsKt.R(set, uniqueTournament2 != null ? Integer.valueOf(uniqueTournament2.getId()) : null));
                }
                notifyItemChanged(i);
            } else if (next instanceof y21) {
                notifyItemChanged(this.g.size() + i, new scb(((y21) next).d()));
            }
            i = i2;
        }
    }
}
