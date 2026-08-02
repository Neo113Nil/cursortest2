package com.sofascore.results.league.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.nq8;
import defpackage.yhk;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/league/dialog/TennisSeedingsDescriptionModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TennisSeedingsDescriptionModal extends BaseModalBottomSheetDialog {
    public final boolean w = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_tennis_seedings_legend, (ViewGroup) v().l, false);
        int i = R.id.dialog_tennis_a;
        if (((TextView) nq8.B(R.id.dialog_tennis_a, inflate)) != null) {
            i = R.id.dialog_tennis_a_text;
            if (((TextView) nq8.B(R.id.dialog_tennis_a_text, inflate)) != null) {
                i = R.id.dialog_tennis_ll;
                if (((TextView) nq8.B(R.id.dialog_tennis_ll, inflate)) != null) {
                    i = R.id.dialog_tennis_ll_text;
                    if (((TextView) nq8.B(R.id.dialog_tennis_ll_text, inflate)) != null) {
                        i = R.id.dialog_tennis_pr;
                        if (((TextView) nq8.B(R.id.dialog_tennis_pr, inflate)) != null) {
                            i = R.id.dialog_tennis_pr_text;
                            if (((TextView) nq8.B(R.id.dialog_tennis_pr_text, inflate)) != null) {
                                i = R.id.dialog_tennis_q;
                                if (((TextView) nq8.B(R.id.dialog_tennis_q, inflate)) != null) {
                                    i = R.id.dialog_tennis_q_text;
                                    if (((TextView) nq8.B(R.id.dialog_tennis_q_text, inflate)) != null) {
                                        i = R.id.dialog_tennis_se;
                                        if (((TextView) nq8.B(R.id.dialog_tennis_se, inflate)) != null) {
                                            i = R.id.dialog_tennis_se_text;
                                            if (((TextView) nq8.B(R.id.dialog_tennis_se_text, inflate)) != null) {
                                                i = R.id.dialog_tennis_seed;
                                                if (((TextView) nq8.B(R.id.dialog_tennis_seed, inflate)) != null) {
                                                    i = R.id.dialog_tennis_seed_text;
                                                    if (((TextView) nq8.B(R.id.dialog_tennis_seed_text, inflate)) != null) {
                                                        i = R.id.dialog_tennis_wc;
                                                        if (((TextView) nq8.B(R.id.dialog_tennis_wc, inflate)) != null) {
                                                            i = R.id.dialog_tennis_wc_text;
                                                            if (((TextView) nq8.B(R.id.dialog_tennis_wc_text, inflate)) != null) {
                                                                ScrollView scrollView = (ScrollView) inflate;
                                                                scrollView.getClass();
                                                                return scrollView;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "SeedingsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.w;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.tennis_seedings_title);
        string.getClass();
        return string;
    }
}
