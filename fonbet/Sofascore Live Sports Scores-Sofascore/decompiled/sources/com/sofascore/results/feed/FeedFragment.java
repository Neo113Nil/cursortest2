package com.sofascore.results.feed;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandingConfig;
import com.sofascore.local_persistance.MediaFeedTab;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.results.R;
import com.sofascore.results.view.branding.BrandingHeaderView;
import defpackage.a99;
import defpackage.ao2;
import defpackage.ccd;
import defpackage.ce;
import defpackage.de;
import defpackage.duf;
import defpackage.dy7;
import defpackage.ex7;
import defpackage.fdi;
import defpackage.fuf;
import defpackage.fx7;
import defpackage.hv7;
import defpackage.hx7;
import defpackage.ia0;
import defpackage.ix7;
import defpackage.joa;
import defpackage.jr5;
import defpackage.ko8;
import defpackage.krk;
import defpackage.kt4;
import defpackage.l27;
import defpackage.my7;
import defpackage.mz1;
import defpackage.nq8;
import defpackage.otk;
import defpackage.ov3;
import defpackage.qa7;
import defpackage.rq3;
import defpackage.rr7;
import defpackage.tc3;
import defpackage.un0;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z07;
import defpackage.z8e;
import defpackage.zqb;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/feed/FeedFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lko8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeedFragment extends Hilt_FeedFragment<ko8> {
    public final otk r;
    public final otk s;
    public final otk t;
    public final otk u;
    public final joa v;
    public final de w;
    public BrandingHeaderView x;

    public FeedFragment() {
        hx7 hx7Var = new hx7(this, 9);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new hv7(hx7Var, 1));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(my7.class), new l27(a, 29), new z07(18, this, a), new ix7(a, 0));
        this.s = new otk(fufVar.getOrCreateKotlinClass(rr7.class), new hx7(this, 0), new hx7(this, 2), new hx7(this, 1));
        this.t = new otk(fufVar.getOrCreateKotlinClass(zqb.class), new hx7(this, 3), new hx7(this, 5), new hx7(this, 4));
        this.u = new otk(fufVar.getOrCreateKotlinClass(ov3.class), new hx7(this, 6), new hx7(this, 8), new hx7(this, 7));
        this.v = ypa.a(ysaVar, new fx7(this, 1));
        de registerForActivityResult = registerForActivityResult(new ce(4), new kt4(this, 18));
        registerForActivityResult.getClass();
        this.w = registerForActivityResult;
    }

    public final my7 C() {
        return (my7) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_feed_compose, (ViewGroup) null, false);
        int i = R.id.compose_posts;
        ComposeView composeView = (ComposeView) nq8.B(R.id.compose_posts, inflate);
        if (composeView != null) {
            i = R.id.snackbar_anchor;
            View B = nq8.B(R.id.snackbar_anchor, inflate);
            if (B != null) {
                return new ko8((LinearLayout) inflate, composeView, B);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Object value;
        MediaFeedTab mediaFeedTab;
        super.onResume();
        requireContext().getClass();
        ia0 ia0Var = ia0.q;
        BrandingConfig brandingConfig = !mz1.C() ? null : ccd.b;
        Brand brand = (brandingConfig == null || (mediaFeedTab = brandingConfig.getMediaFeedTab()) == null) ? null : mediaFeedTab.getBrand();
        if (brand != null) {
            if (this.x == null) {
                Context requireContext = requireContext();
                requireContext.getClass();
                BrandingHeaderView brandingHeaderView = new BrandingHeaderView(requireContext, null, 6, 0);
                this.x = brandingHeaderView;
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                brandingHeaderView.setElevation(ao2.u(8, requireContext2));
                krk krkVar = this.l;
                krkVar.getClass();
                ((ko8) krkVar).a.addView(brandingHeaderView, 0);
            }
            BrandingHeaderView brandingHeaderView2 = this.x;
            if (brandingHeaderView2 != null) {
                BrandingHeaderView.d(brandingHeaderView2, brand, BrandLocation.Feed, null, 28);
            }
        }
        boolean C = mz1.C();
        BrandingHeaderView brandingHeaderView3 = this.x;
        if (brandingHeaderView3 != null) {
            brandingHeaderView3.setVisibility(C ? 0 : 8);
        }
        my7 C2 = C();
        xw3.L(un0.z(C2), null, null, new jr5(C2, null), 3);
        if (((dy7) C().n.a.getValue()).a) {
            return;
        }
        fdi fdiVar = C().m;
        do {
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, dy7.a((dy7) value, false, false, null, null, false, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "FeedTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        l();
        krk krkVar = this.l;
        krkVar.getClass();
        ComposeView composeView = ((ko8) krkVar).b;
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(-1961198785, new ex7(this, 0), true));
        z8e.v(this, ((ov3) this.u.getValue()).g, new qa7(this, (rq3) null, 14));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
