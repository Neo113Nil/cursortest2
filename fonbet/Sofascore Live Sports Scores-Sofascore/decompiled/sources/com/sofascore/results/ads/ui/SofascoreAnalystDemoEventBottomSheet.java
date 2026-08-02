package com.sofascore.results.ads.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sofascore.model.mvvm.model.AiAnalystDemoEvent;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.as9;
import defpackage.c6o;
import defpackage.cne;
import defpackage.eyd;
import defpackage.gz8;
import defpackage.nq8;
import defpackage.s21;
import defpackage.tba;
import defpackage.yhk;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/ads/ui/SofascoreAnalystDemoEventBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SofascoreAnalystDemoEventBottomSheet extends BaseModalBottomSheetDialog {
    public final boolean w = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.view_analyst_demo_event, (ViewGroup) v().l, false);
        int i = R.id.away_logo;
        ImageView imageView = (ImageView) nq8.B(R.id.away_logo, inflate);
        if (imageView != null) {
            i = R.id.away_name;
            TextView textView = (TextView) nq8.B(R.id.away_name, inflate);
            if (textView != null) {
                i = R.id.button_yes;
                MaterialButton materialButton = (MaterialButton) nq8.B(R.id.button_yes, inflate);
                if (materialButton != null) {
                    i = R.id.cancel_button;
                    MaterialButton materialButton2 = (MaterialButton) nq8.B(R.id.cancel_button, inflate);
                    if (materialButton2 != null) {
                        i = R.id.home_logo;
                        ImageView imageView2 = (ImageView) nq8.B(R.id.home_logo, inflate);
                        if (imageView2 != null) {
                            i = R.id.home_name;
                            TextView textView2 = (TextView) nq8.B(R.id.home_name, inflate);
                            if (textView2 != null) {
                                i = R.id.preview_image;
                                if (((ImageView) nq8.B(R.id.preview_image, inflate)) != null) {
                                    i = R.id.primary_label;
                                    TextView textView3 = (TextView) nq8.B(R.id.primary_label, inflate);
                                    if (textView3 != null) {
                                        i = R.id.progress_bar;
                                        if (((LinearProgressIndicator) nq8.B(R.id.progress_bar, inflate)) != null) {
                                            i = R.id.secondary_label;
                                            TextView textView4 = (TextView) nq8.B(R.id.secondary_label, inflate);
                                            if (textView4 != null) {
                                                i = R.id.subtitle;
                                                if (((TextView) nq8.B(R.id.subtitle, inflate)) != null) {
                                                    i = R.id.title;
                                                    if (((TextView) nq8.B(R.id.title, inflate)) != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                        this.t.b = requireArguments().getString("REFERRAL_TYPE");
                                                        ((LinearLayout) v().n).setBackgroundColor(requireContext().getColor(R.color.brand_tertiary_highlight));
                                                        Bundle arguments = getArguments();
                                                        AiAnalystDemoEvent aiAnalystDemoEvent = arguments != null ? (AiAnalystDemoEvent) ((Parcelable) gz8.K(arguments, "ANALYST_DEMO_EVENT", AiAnalystDemoEvent.class)) : null;
                                                        if (aiAnalystDemoEvent == null) {
                                                            q();
                                                            constraintLayout.getClass();
                                                            return constraintLayout;
                                                        }
                                                        as9.o(imageView2, aiAnalystDemoEvent.getHomeTeam().getId());
                                                        Team homeTeam = aiAnalystDemoEvent.getHomeTeam();
                                                        Context requireContext = requireContext();
                                                        requireContext.getClass();
                                                        textView2.setText(tba.A(requireContext, homeTeam));
                                                        as9.o(imageView, aiAnalystDemoEvent.getAwayTeam().getId());
                                                        Team awayTeam = aiAnalystDemoEvent.getAwayTeam();
                                                        Context requireContext2 = requireContext();
                                                        requireContext2.getClass();
                                                        textView.setText(tba.A(requireContext2, awayTeam));
                                                        materialButton.setOnClickListener(new eyd(20, this, aiAnalystDemoEvent));
                                                        materialButton2.setOnClickListener(new cne(this, 24));
                                                        int i2 = s21.i;
                                                        Context requireContext3 = requireContext();
                                                        requireContext3.getClass();
                                                        c6o.L(requireContext3, aiAnalystDemoEvent.getStartTimestamp(), textView3, textView4);
                                                        constraintLayout.getClass();
                                                        return constraintLayout;
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

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "TryAIInsightsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getX() {
        return this.w;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
