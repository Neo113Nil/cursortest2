package com.sofascore.results.crowdsourcing;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sofascore.results.R;
import com.sofascore.results.crowdsourcing.CrowdsourcingOnboardingModal;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.joa;
import defpackage.nq8;
import defpackage.ouk;
import defpackage.s5e;
import defpackage.t5e;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z82;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/crowdsourcing/CrowdsourcingOnboardingModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CrowdsourcingOnboardingModal extends BaseModalBottomSheetDialog {
    public final List A;
    public final joa B;
    public z82 w;
    public final boolean x = true;
    public final joa y;
    public final List z;

    public CrowdsourcingOnboardingModal() {
        final int i = 1;
        final int i2 = 0;
        Function0 function0 = new Function0(this) { // from class: y54
            public final /* synthetic */ CrowdsourcingOnboardingModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                CrowdsourcingOnboardingModal crowdsourcingOnboardingModal = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = crowdsourcingOnboardingModal.requireContext();
                        requireContext.getClass();
                        return new s5e(requireContext);
                    default:
                        return new j41(crowdsourcingOnboardingModal, 4);
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.y = ypa.a(ysaVar, function0);
        Integer valueOf = Integer.valueOf(R.string.community_suggestions);
        this.z = b.j(new t5e(R.string.crowdsourcing_onboarding_confirm_kick_off_time_title, R.string.crowdsourcing_onboarding_confirm_kick_off_time_text, valueOf), new t5e(R.string.crowdsourcing_onboarding_update_the_score_title, R.string.crowdsourcing_onboarding_update_the_score_text, valueOf), new t5e(R.string.crowdsourcing_onboarding_add_goal_details_title, R.string.crowdsourcing_onboarding_add_goal_details_text, valueOf));
        this.A = b.j(2131231345, 2131231346, 2131231347);
        this.B = ypa.a(ysaVar, new Function0(this) { // from class: y54
            public final /* synthetic */ CrowdsourcingOnboardingModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                CrowdsourcingOnboardingModal crowdsourcingOnboardingModal = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = crowdsourcingOnboardingModal.requireContext();
                        requireContext.getClass();
                        return new s5e(requireContext);
                    default:
                        return new j41(crowdsourcingOnboardingModal, 4);
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.crowdsourcing_onboarding, (ViewGroup) v().l, false);
        int i = R.id.image;
        ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.image, inflate);
        if (shapeableImageView != null) {
            i = R.id.next_button;
            MaterialButton materialButton = (MaterialButton) nq8.B(R.id.next_button, inflate);
            if (materialButton != null) {
                i = R.id.previous_button;
                MaterialButton materialButton2 = (MaterialButton) nq8.B(R.id.previous_button, inflate);
                if (materialButton2 != null) {
                    i = R.id.progress_bar;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) nq8.B(R.id.progress_bar, inflate);
                    if (linearProgressIndicator != null) {
                        i = R.id.view_pager;
                        ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
                        if (viewPager2 != null) {
                            NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                            this.w = new z82(nestedScrollView, shapeableImageView, materialButton, materialButton2, linearProgressIndicator, viewPager2, 7);
                            nestedScrollView.getClass();
                            return nestedScrollView;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        z82 z82Var = this.w;
        if (z82Var != null) {
            ((ViewPager2) z82Var.g).e((ouk) this.B.getValue());
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((LinearLayout) v().n).setVisibility(8);
        z82 z82Var = this.w;
        if (z82Var == null) {
            Intrinsics.i("modalBinding");
            throw null;
        }
        ViewPager2 viewPager2 = (ViewPager2) z82Var.g;
        joa joaVar = this.y;
        viewPager2.setAdapter((s5e) joaVar.getValue());
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            ((s5e) joaVar.getValue()).r((t5e) it.next());
        }
        z82 z82Var2 = this.w;
        if (z82Var2 == null) {
            Intrinsics.i("modalBinding");
            throw null;
        }
        ((ViewPager2) z82Var2.g).a((ouk) this.B.getValue());
        z82 z82Var3 = this.w;
        if (z82Var3 == null) {
            Intrinsics.i("modalBinding");
            throw null;
        }
        final int i = 0;
        ((MaterialButton) z82Var3.c).setOnClickListener(new View.OnClickListener(this) { // from class: x54
            public final /* synthetic */ CrowdsourcingOnboardingModal b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                CrowdsourcingOnboardingModal crowdsourcingOnboardingModal = this.b;
                switch (i2) {
                    case 0:
                        z82 z82Var4 = crowdsourcingOnboardingModal.w;
                        if (z82Var4 == null) {
                            Intrinsics.i("modalBinding");
                            throw null;
                        }
                        int currentItem = ((ViewPager2) z82Var4.g).getCurrentItem();
                        z82 z82Var5 = crowdsourcingOnboardingModal.w;
                        if (z82Var5 != null) {
                            ((ViewPager2) z82Var5.g).setCurrentItem(currentItem - 1);
                            return;
                        } else {
                            Intrinsics.i("modalBinding");
                            throw null;
                        }
                    default:
                        z82 z82Var6 = crowdsourcingOnboardingModal.w;
                        if (z82Var6 == null) {
                            Intrinsics.i("modalBinding");
                            throw null;
                        }
                        int currentItem2 = ((ViewPager2) z82Var6.g).getCurrentItem();
                        if (currentItem2 == b.i(crowdsourcingOnboardingModal.z)) {
                            crowdsourcingOnboardingModal.j();
                            return;
                        }
                        z82 z82Var7 = crowdsourcingOnboardingModal.w;
                        if (z82Var7 != null) {
                            ((ViewPager2) z82Var7.g).c(currentItem2 + 1, true);
                            return;
                        } else {
                            Intrinsics.i("modalBinding");
                            throw null;
                        }
                }
            }
        });
        z82 z82Var4 = this.w;
        if (z82Var4 == null) {
            Intrinsics.i("modalBinding");
            throw null;
        }
        final int i2 = 1;
        ((MaterialButton) z82Var4.d).setOnClickListener(new View.OnClickListener(this) { // from class: x54
            public final /* synthetic */ CrowdsourcingOnboardingModal b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                CrowdsourcingOnboardingModal crowdsourcingOnboardingModal = this.b;
                switch (i22) {
                    case 0:
                        z82 z82Var42 = crowdsourcingOnboardingModal.w;
                        if (z82Var42 == null) {
                            Intrinsics.i("modalBinding");
                            throw null;
                        }
                        int currentItem = ((ViewPager2) z82Var42.g).getCurrentItem();
                        z82 z82Var5 = crowdsourcingOnboardingModal.w;
                        if (z82Var5 != null) {
                            ((ViewPager2) z82Var5.g).setCurrentItem(currentItem - 1);
                            return;
                        } else {
                            Intrinsics.i("modalBinding");
                            throw null;
                        }
                    default:
                        z82 z82Var6 = crowdsourcingOnboardingModal.w;
                        if (z82Var6 == null) {
                            Intrinsics.i("modalBinding");
                            throw null;
                        }
                        int currentItem2 = ((ViewPager2) z82Var6.g).getCurrentItem();
                        if (currentItem2 == b.i(crowdsourcingOnboardingModal.z)) {
                            crowdsourcingOnboardingModal.j();
                            return;
                        }
                        z82 z82Var7 = crowdsourcingOnboardingModal.w;
                        if (z82Var7 != null) {
                            ((ViewPager2) z82Var7.g).c(currentItem2 + 1, true);
                            return;
                        } else {
                            Intrinsics.i("modalBinding");
                            throw null;
                        }
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "CrowdsourcingTutorialModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getD() {
        return this.x;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
