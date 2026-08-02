package com.sofascore.results.main.tutorial;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseIntroModal;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a5f;
import defpackage.ao2;
import defpackage.dmi;
import defpackage.gjf;
import defpackage.kv;
import defpackage.l4a;
import defpackage.mlb;
import defpackage.mm3;
import defpackage.nv;
import defpackage.p6;
import defpackage.t5e;
import defpackage.uic;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/main/tutorial/CompetitionsIntroModal;", "Lcom/sofascore/results/dialog/BaseIntroModal;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CompetitionsIntroModal extends BaseIntroModal {
    public final List E = b.j(new t5e(R.string.pinned_tutorial_header_1, R.string.pinned_tutorial_body_1, null), new t5e(R.string.pinned_tutorial_header_2, R.string.pinned_tutorial_body_2, null));
    public final int F = R.raw.pin_tutorial_1;
    public final int G = R.string.button_get_started;
    public final int H = R.string.button_go_back;
    public final String I = "";

    @Override // com.sofascore.results.dialog.BaseIntroModal
    /* renamed from: G, reason: from getter */
    public final String getI() {
        return this.I;
    }

    @Override // com.sofascore.results.dialog.BaseIntroModal
    /* renamed from: H, reason: from getter */
    public final int getF() {
        return this.F;
    }

    @Override // com.sofascore.results.dialog.BaseIntroModal
    /* renamed from: I, reason: from getter */
    public final int getG() {
        return this.G;
    }

    @Override // com.sofascore.results.dialog.BaseIntroModal
    /* renamed from: L, reason: from getter */
    public final int getH() {
        return this.H;
    }

    @Override // com.sofascore.results.dialog.BaseIntroModal
    public final void M(Context context) {
        context.getClass();
    }

    @Override // com.sofascore.results.dialog.BaseIntroModal
    public final void N() {
        ((LottieAnimationView) K().i).clearAnimation();
    }

    @Override // com.sofascore.results.dialog.BaseIntroModal
    public final void O(int i) {
        super.O(i);
        this.t.d = Integer.valueOf(i + 1);
    }

    @Override // com.sofascore.results.dialog.BaseIntroModal
    public final void P(int i) {
        ((ImageView) K().e).setBackground(null);
        ((LottieAnimationView) K().i).setAnimation(i == 0 ? R.raw.pin_tutorial_1 : R.raw.pin_tutorial_2);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) K().i;
        lottieAnimationView.k.add(mlb.f);
        lottieAnimationView.e.k();
        if (i == 0 || ((MaterialButton) K().g).getVisibility() != 0) {
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f2 = i == 0 ? 0.5f : 0.0f;
            if (i != 0) {
                f = 0.5f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            ofFloat.addUpdateListener(new p6(2, ofFloat, this));
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    }

    @Override // com.sofascore.results.dialog.BaseIntroModal, com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        int i = gjf.p;
        Context requireContext = requireContext();
        requireContext.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = requireContext.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        if (currentTimeMillis - sharedPreferences.getLong("PREF_FIRST_RUN_TIMESTAMP", 0L) > 259200000) {
            SharedPreferences sharedPreferences2 = uic.j;
            if (sharedPreferences2 == null) {
                Context applicationContext2 = requireContext.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences2 = a5f.d(applicationContext2);
                    uic.j = sharedPreferences2;
                }
                sharedPreferences2.getClass();
            }
            if (!sharedPreferences2.contains("PREF_PULSATE_QUICK_LINKS")) {
                l4a.J(requireContext, true);
            }
        }
        if (this.z) {
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            nv.z0(requireContext2, kv.CLICK, "get_started", "pin_league_info_modal");
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.sofascore.results.dialog.BaseIntroModal, com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SharedPreferences d;
        view.getClass();
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        requireContext.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = requireContext.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "PREF_SHOW_LEAGUES_INTRO_BOTTOM_SHEET", false);
        Unit unit = Unit.a;
        i.apply();
        ConstraintLayout constraintLayout = (ConstraintLayout) K().b;
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), 0, constraintLayout.getPaddingEnd(), constraintLayout.getPaddingBottom());
        mm3 mm3Var = new mm3();
        mm3Var.e((ConstraintLayout) K().b);
        mm3Var.j(R.id.animation).d.b = 0;
        mm3Var.j(R.id.animation).d.c = 0;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        mm3Var.r(R.id.animation, 6, ao2.s(16, requireContext2));
        Context requireContext3 = requireContext();
        requireContext3.getClass();
        mm3Var.r(R.id.animation, 7, ao2.s(16, requireContext3));
        mm3Var.d(R.id.animation, 3);
        mm3Var.f(R.id.animation, 4, 0, 4);
        mm3Var.o(R.id.animation, "H,44:23");
        mm3Var.a((ConstraintLayout) K().b);
        ((LottieAnimationView) K().i).setRepeatCount(-1);
    }

    @Override // com.sofascore.results.dialog.BaseIntroModal, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "PinLeagueInfoModal";
    }
}
