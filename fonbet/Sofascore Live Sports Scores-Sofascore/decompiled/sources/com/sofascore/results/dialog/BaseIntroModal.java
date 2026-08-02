package com.sofascore.results.dialog;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.app.NotificationCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseIntroModal;
import com.sofascore.results.main.tutorial.CompetitionsIntroModal;
import defpackage.av;
import defpackage.bv;
import defpackage.bv1;
import defpackage.dv;
import defpackage.joa;
import defpackage.mlb;
import defpackage.nq8;
import defpackage.nv;
import defpackage.ouk;
import defpackage.s5e;
import defpackage.t5e;
import defpackage.vz1;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/dialog/BaseIntroModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BaseIntroModal extends BaseModalBottomSheetDialog {
    public final boolean A;
    public final int B;
    public final joa C;
    public final boolean D;
    public bv1 w;
    public final joa x;
    public boolean y;
    public boolean z;

    public BaseIntroModal() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: i41
            public final /* synthetic */ BaseIntroModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BaseIntroModal baseIntroModal = this.b;
                switch (i2) {
                    case 0:
                        Context requireContext = baseIntroModal.requireContext();
                        requireContext.getClass();
                        return new s5e(requireContext);
                    default:
                        return new j41(baseIntroModal, 0);
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.x = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.A = true;
        this.B = R.string.previous;
        this.C = ypa.a(ysaVar, new Function0(this) { // from class: i41
            public final /* synthetic */ BaseIntroModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BaseIntroModal baseIntroModal = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = baseIntroModal.requireContext();
                        requireContext.getClass();
                        return new s5e(requireContext);
                    default:
                        return new j41(baseIntroModal, 0);
                }
            }
        });
        this.D = true;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.chat_intro_modal_layout, (ViewGroup) v().l, false);
        int i = R.id.animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) nq8.B(R.id.animation, inflate);
        if (lottieAnimationView != null) {
            i = R.id.animation_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.animation_container, inflate);
            if (constraintLayout != null) {
                i = R.id.guideline;
                Guideline guideline = (Guideline) nq8.B(R.id.guideline, inflate);
                if (guideline != null) {
                    i = R.id.icon;
                    ImageView imageView = (ImageView) nq8.B(R.id.icon, inflate);
                    if (imageView != null) {
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
                                        this.w = new bv1((NestedScrollView) inflate, lottieAnimationView, constraintLayout, guideline, imageView, materialButton, materialButton2, linearProgressIndicator, viewPager2);
                                        NestedScrollView nestedScrollView = (NestedScrollView) K().f;
                                        nestedScrollView.getClass();
                                        return nestedScrollView;
                                    }
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        bv e;
        if (!(this instanceof vz1) || (e = ((vz1) this).e()) == null) {
            return;
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        nv.k0(requireContext, e, av.CTA_CLICK, dv.POPUP_QUEUE, null, null, 48);
    }

    /* renamed from: G */
    public abstract String getI();

    /* renamed from: H */
    public abstract int getF();

    /* renamed from: I */
    public abstract int getG();

    public final bv1 K() {
        bv1 bv1Var = this.w;
        if (bv1Var != null) {
            return bv1Var;
        }
        Intrinsics.i("modalBinding");
        throw null;
    }

    /* renamed from: L, reason: from getter */
    public int getH() {
        return this.B;
    }

    public abstract void M(Context context);

    public abstract void N();

    public void O(int i) {
        P(i);
        ((MaterialButton) K().g).setVisibility(i != 0 ? 0 : 8);
        ((MaterialButton) K().d).setText(requireContext().getString(i == kotlin.collections.b.i(((CompetitionsIntroModal) this).E) ? getG() : R.string.next));
        ObjectAnimator.ofInt((LinearProgressIndicator) K().h, NotificationCompat.CATEGORY_PROGRESS, ((LinearProgressIndicator) K().h).getProgress(), (int) (((i + 1.0f) / r0.size()) * 100.0f)).start();
    }

    public abstract void P(int i);

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.w != null) {
            ((ViewPager2) K().j).e((ouk) this.C.getValue());
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        if (this.y) {
            Context requireContext = requireContext();
            requireContext.getClass();
            M(requireContext);
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) K().i;
        lottieAnimationView.i = false;
        lottieAnimationView.e.j();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) K().i;
        lottieAnimationView.k.add(mlb.f);
        lottieAnimationView.e.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        bv e;
        view.getClass();
        super.onViewCreated(view, bundle);
        this.t.b = getI();
        ((LinearLayout) v().n).setBackgroundColor(requireContext().getColor(R.color.stone));
        ViewPager2 viewPager2 = (ViewPager2) K().j;
        joa joaVar = this.x;
        viewPager2.setAdapter((s5e) joaVar.getValue());
        final int i = 0;
        ((ImageView) K().e).setVisibility(this.A ? 0 : 8);
        Iterator it = ((CompetitionsIntroModal) this).E.iterator();
        while (it.hasNext()) {
            ((s5e) joaVar.getValue()).r((t5e) it.next());
        }
        ((LottieAnimationView) K().i).setAnimation(getF());
        N();
        Object parent = view.getParent();
        parent.getClass();
        BottomSheetBehavior C = BottomSheetBehavior.C((View) parent);
        final int i2 = 1;
        C.K = true;
        C.J(true);
        C.M(3);
        ((MaterialButton) K().d).setOnClickListener(new View.OnClickListener(this) { // from class: h41
            public final /* synthetic */ BaseIntroModal b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i;
                BaseIntroModal baseIntroModal = this.b;
                switch (i3) {
                    case 0:
                        baseIntroModal.F();
                        int currentItem = ((ViewPager2) baseIntroModal.K().j).getCurrentItem();
                        if (currentItem == b.i(((CompetitionsIntroModal) baseIntroModal).E)) {
                            baseIntroModal.z = true;
                            baseIntroModal.j();
                            break;
                        } else {
                            ((ViewPager2) baseIntroModal.K().j).c(currentItem + 1, true);
                            break;
                        }
                    default:
                        baseIntroModal.F();
                        ((ViewPager2) baseIntroModal.K().j).setCurrentItem(((ViewPager2) baseIntroModal.K().j).getCurrentItem() - 1);
                        break;
                }
            }
        });
        ((ViewPager2) K().j).a((ouk) this.C.getValue());
        MaterialButton materialButton = (MaterialButton) K().g;
        materialButton.setText(getString(getH()));
        materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: h41
            public final /* synthetic */ BaseIntroModal b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                BaseIntroModal baseIntroModal = this.b;
                switch (i3) {
                    case 0:
                        baseIntroModal.F();
                        int currentItem = ((ViewPager2) baseIntroModal.K().j).getCurrentItem();
                        if (currentItem == b.i(((CompetitionsIntroModal) baseIntroModal).E)) {
                            baseIntroModal.z = true;
                            baseIntroModal.j();
                            break;
                        } else {
                            ((ViewPager2) baseIntroModal.K().j).c(currentItem + 1, true);
                            break;
                        }
                    default:
                        baseIntroModal.F();
                        ((ViewPager2) baseIntroModal.K().j).setCurrentItem(((ViewPager2) baseIntroModal.K().j).getCurrentItem() - 1);
                        break;
                }
            }
        });
        if (!(this instanceof vz1) || (e = ((vz1) this).e()) == null) {
            return;
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        nv.l0(requireContext, dv.POPUP_QUEUE, e, null);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public String t() {
        return "IntroductoryModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getD() {
        return this.D;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
