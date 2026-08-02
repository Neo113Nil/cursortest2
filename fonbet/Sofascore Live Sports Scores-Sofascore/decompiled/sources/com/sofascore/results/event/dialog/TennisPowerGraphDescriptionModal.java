package com.sofascore.results.event.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.event.dialog.TennisPowerGraphDescriptionModal;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.yhk;
import defpackage.ypa;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/dialog/TennisPowerGraphDescriptionModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TennisPowerGraphDescriptionModal extends BaseModalBottomSheetDialog {
    public final mqi w;
    public final mqi x;
    public final boolean y = true;

    public TennisPowerGraphDescriptionModal() {
        final int i = 0;
        this.w = ypa.b(new Function0(this) { // from class: o6j
            public final /* synthetic */ TennisPowerGraphDescriptionModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TennisPowerGraphDescriptionModal tennisPowerGraphDescriptionModal = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = tennisPowerGraphDescriptionModal.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "HOME_TEAM_NAME", String.class);
                        if (M == null) {
                            a70.p("Serializable HOME_TEAM_NAME not found");
                            break;
                        } else {
                            break;
                        }
                    default:
                        Bundle requireArguments2 = tennisPowerGraphDescriptionModal.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "AWAY_TEAM_NAME", String.class);
                        if (M2 == null) {
                            a70.p("Serializable AWAY_TEAM_NAME not found");
                            break;
                        } else {
                            break;
                        }
                }
                return null;
            }
        });
        final int i2 = 1;
        this.x = ypa.b(new Function0(this) { // from class: o6j
            public final /* synthetic */ TennisPowerGraphDescriptionModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TennisPowerGraphDescriptionModal tennisPowerGraphDescriptionModal = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = tennisPowerGraphDescriptionModal.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "HOME_TEAM_NAME", String.class);
                        if (M == null) {
                            a70.p("Serializable HOME_TEAM_NAME not found");
                            break;
                        } else {
                            break;
                        }
                    default:
                        Bundle requireArguments2 = tennisPowerGraphDescriptionModal.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "AWAY_TEAM_NAME", String.class);
                        if (M2 == null) {
                            a70.p("Serializable AWAY_TEAM_NAME not found");
                            break;
                        } else {
                            break;
                        }
                }
                return null;
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_tennis_power, (ViewGroup) v().l, false);
        int i = R.id.tennis_power_away_team_break;
        TextView textView = (TextView) nq8.B(R.id.tennis_power_away_team_break, inflate);
        if (textView != null) {
            i = R.id.tennis_power_away_team_text;
            TextView textView2 = (TextView) nq8.B(R.id.tennis_power_away_team_text, inflate);
            if (textView2 != null) {
                i = R.id.tennis_power_home_team_break;
                TextView textView3 = (TextView) nq8.B(R.id.tennis_power_home_team_break, inflate);
                if (textView3 != null) {
                    i = R.id.tennis_power_home_team_text;
                    TextView textView4 = (TextView) nq8.B(R.id.tennis_power_home_team_text, inflate);
                    if (textView4 != null) {
                        i = R.id.tennis_power_icon;
                        if (((ImageView) nq8.B(R.id.tennis_power_icon, inflate)) != null) {
                            i = R.id.tennis_power_text;
                            if (((TextView) nq8.B(R.id.tennis_power_text, inflate)) != null) {
                                ScrollView scrollView = (ScrollView) inflate;
                                Context requireContext = requireContext();
                                mqi mqiVar = this.w;
                                textView4.setText(requireContext.getString(R.string.low_level_of_dominance, (String) mqiVar.getValue()));
                                Context requireContext2 = requireContext();
                                mqi mqiVar2 = this.x;
                                textView2.setText(requireContext2.getString(R.string.high_level_of_dominance, (String) mqiVar2.getValue()));
                                textView3.setText(requireContext().getString(R.string.break_point_won, (String) mqiVar.getValue()));
                                textView.setText(requireContext().getString(R.string.break_point_won, (String) mqiVar2.getValue()));
                                scrollView.getClass();
                                return scrollView;
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
        return "PowerGraphModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.y;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.tennis_power);
        string.getClass();
        return string;
    }
}
