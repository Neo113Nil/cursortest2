package com.sofascore.results.sharemodal.match;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.R;
import com.sofascore.results.sharemodal.BaseShareModal;
import com.sofascore.results.sharemodal.BaseSharePageFragment;
import com.sofascore.results.sharemodal.match.BaseShareMultiPageModal;
import defpackage.aba;
import defpackage.ao2;
import defpackage.bdh;
import defpackage.j41;
import defpackage.krk;
import defpackage.nq8;
import defpackage.nr1;
import defpackage.qdh;
import defpackage.wrf;
import defpackage.yhk;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/sharemodal/match/BaseShareMultiPageModal;", "Lcom/sofascore/results/sharemodal/BaseShareModal;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseShareMultiPageModal extends BaseShareModal {
    public nr1 w;

    @Override // com.sofascore.results.sharemodal.BaseShareModal, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final int A() {
        return 17;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.modal_share_multiple_pages, (ViewGroup) v().l, false);
        int i = R.id.arrow_left;
        ImageView imageView = (ImageView) nq8.B(R.id.arrow_left, inflate);
        if (imageView != null) {
            i = R.id.arrow_right;
            ImageView imageView2 = (ImageView) nq8.B(R.id.arrow_right, inflate);
            if (imageView2 != null) {
                i = R.id.current_tab_text;
                TextView textView = (TextView) nq8.B(R.id.current_tab_text, inflate);
                if (textView != null) {
                    i = R.id.description_text;
                    TextView textView2 = (TextView) nq8.B(R.id.description_text, inflate);
                    if (textView2 != null) {
                        i = R.id.gradient_overlay;
                        View B = nq8.B(R.id.gradient_overlay, inflate);
                        if (B != null) {
                            i = R.id.multi_page_navigation;
                            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.multi_page_navigation, inflate);
                            if (linearLayout != null) {
                                i = R.id.visuals_view_pager;
                                ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.visuals_view_pager, inflate);
                                if (viewPager2 != null) {
                                    this.w = new nr1((LinearLayout) inflate, imageView, imageView2, textView, textView2, B, linearLayout, viewPager2, 10);
                                    int i2 = 1;
                                    if (L().j.size() == 1) {
                                        ((LinearLayout) N().h).setVisibility(8);
                                        ((ViewPager2) N().i).setBackgroundColor(requireContext().getColor(R.color.surface_0));
                                    } else {
                                        ((ViewPager2) N().i).setOffscreenPageLimit(3);
                                        Context requireContext = requireContext();
                                        requireContext.getClass();
                                        int s = ao2.s(20, requireContext);
                                        ((ViewPager2) N().i).setPadding(s, 0, s, 0);
                                        ((ViewPager2) N().i).a(new j41(this, i2));
                                    }
                                    ((ViewPager2) N().i).setAdapter(L());
                                    LinearLayout linearLayout2 = (LinearLayout) N().c;
                                    linearLayout2.getClass();
                                    return linearLayout2;
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.sharemodal.BaseShareModal
    public final String G() {
        qdh L = L();
        return ((BaseSharePageFragment) L.j.get(((ViewPager2) N().i).getCurrentItem())).p();
    }

    @Override // com.sofascore.results.sharemodal.BaseShareModal
    public final RecyclerView K() {
        qdh L = L();
        krk krkVar = ((BaseSharePageFragment) L.j.get(((ViewPager2) N().i).getCurrentItem())).l;
        krkVar.getClass();
        return ((bdh) krkVar).c;
    }

    public abstract qdh L();

    public Integer M() {
        return null;
    }

    public final nr1 N() {
        nr1 nr1Var = this.w;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.i("modalBinding");
        throw null;
    }

    @Override // com.sofascore.results.sharemodal.BaseShareModal, com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        final int i = 1;
        final int i2 = 0;
        ((TextView) N().d).setVisibility((M() == null || L().j.size() <= 1) ? 8 : 0);
        Integer M = M();
        if (M != null) {
            ((TextView) N().d).setText(M.intValue());
        }
        aba.y((ImageView) N().e, 0, 3);
        z8e.a0((ImageView) N().e, 1000L, new Function0(this) { // from class: k61
            public final /* synthetic */ BaseShareMultiPageModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                BaseShareMultiPageModal baseShareMultiPageModal = this.b;
                switch (i3) {
                    case 0:
                        ((ViewPager2) baseShareMultiPageModal.N().i).setCurrentItem(((ViewPager2) baseShareMultiPageModal.N().i).getCurrentItem() - 1);
                        break;
                    default:
                        ((ViewPager2) baseShareMultiPageModal.N().i).setCurrentItem(((ViewPager2) baseShareMultiPageModal.N().i).getCurrentItem() + 1);
                        break;
                }
                return Unit.a;
            }
        });
        aba.y((ImageView) N().f, 0, 3);
        z8e.a0((ImageView) N().f, 1000L, new Function0(this) { // from class: k61
            public final /* synthetic */ BaseShareMultiPageModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                BaseShareMultiPageModal baseShareMultiPageModal = this.b;
                switch (i3) {
                    case 0:
                        ((ViewPager2) baseShareMultiPageModal.N().i).setCurrentItem(((ViewPager2) baseShareMultiPageModal.N().i).getCurrentItem() - 1);
                        break;
                    default:
                        ((ViewPager2) baseShareMultiPageModal.N().i).setCurrentItem(((ViewPager2) baseShareMultiPageModal.N().i).getCurrentItem() + 1);
                        break;
                }
                return Unit.a;
            }
        });
        RecyclerView c = wrf.c((ViewPager2) N().i);
        if (c != null) {
            c.setOverScrollMode(2);
            c.setClipToPadding(false);
            c.setClipChildren(false);
        }
    }
}
