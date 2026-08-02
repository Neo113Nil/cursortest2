package com.sofascore.results.referral;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.R;
import defpackage.bte;
import defpackage.duf;
import defpackage.joa;
import defpackage.otk;
import defpackage.tc3;
import defpackage.ttf;
import defpackage.vce;
import defpackage.vtf;
import defpackage.wsf;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/referral/ReferralRedeemRewardBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReferralRedeemRewardBottomSheet extends Hilt_ReferralRedeemRewardBottomSheet {
    public final otk B;
    public final boolean C;

    public ReferralRedeemRewardBottomSheet() {
        joa a = ypa.a(ysa.c, new vce(new vce(this, 26), 27));
        this.B = new otk(duf.a.getOrCreateKotlinClass(vtf.class), new wsf(a, 1), new bte(this, a, 8), new wsf(a, 2));
        this.C = true;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        String string = requireArguments().getString("ANALYTICS_TYPE");
        this.t.b = string;
        ((LinearLayout) v().n).setBackgroundColor(requireContext().getColor(R.color.brand_tertiary_highlight));
        String string2 = requireArguments().getString("PREF_REFERRAL_TOKEN");
        if (string2 == null) {
            string2 = "";
        }
        composeView.setContent(new tc3(-1399074209, new ttf(string, this, string2, 0), true));
        return composeView;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "UnlockAIInsightsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.C;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
