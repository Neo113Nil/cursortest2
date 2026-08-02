package com.sofascore.results.event.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.event.dialog.AmFootballWinProbabilityDescriptionModal;
import defpackage.as9;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.yhk;
import defpackage.ypa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/dialog/AmFootballWinProbabilityDescriptionModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AmFootballWinProbabilityDescriptionModal extends BaseModalBottomSheetDialog {
    public final boolean A = true;
    public final mqi w;
    public final mqi x;
    public final mqi y;
    public final mqi z;

    public AmFootballWinProbabilityDescriptionModal() {
        final int i = 0;
        this.w = ypa.b(new Function0(this) { // from class: jp
            public final /* synthetic */ AmFootballWinProbabilityDescriptionModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2;
                int i3 = i;
                AmFootballWinProbabilityDescriptionModal amFootballWinProbabilityDescriptionModal = this.b;
                switch (i3) {
                    case 0:
                        i2 = amFootballWinProbabilityDescriptionModal.requireArguments().getInt("FIRST_TEAM_ID");
                        break;
                    case 1:
                        String string = amFootballWinProbabilityDescriptionModal.requireArguments().getString("FIRST_TEAM_NAME");
                        return string == null ? "" : string;
                    case 2:
                        i2 = amFootballWinProbabilityDescriptionModal.requireArguments().getInt("SECOND_TEAM_ID");
                        break;
                    default:
                        String string2 = amFootballWinProbabilityDescriptionModal.requireArguments().getString("SECOND_TEAM_NAME");
                        return string2 == null ? "" : string2;
                }
                return Integer.valueOf(i2);
            }
        });
        final int i2 = 1;
        this.x = ypa.b(new Function0(this) { // from class: jp
            public final /* synthetic */ AmFootballWinProbabilityDescriptionModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22;
                int i3 = i2;
                AmFootballWinProbabilityDescriptionModal amFootballWinProbabilityDescriptionModal = this.b;
                switch (i3) {
                    case 0:
                        i22 = amFootballWinProbabilityDescriptionModal.requireArguments().getInt("FIRST_TEAM_ID");
                        break;
                    case 1:
                        String string = amFootballWinProbabilityDescriptionModal.requireArguments().getString("FIRST_TEAM_NAME");
                        return string == null ? "" : string;
                    case 2:
                        i22 = amFootballWinProbabilityDescriptionModal.requireArguments().getInt("SECOND_TEAM_ID");
                        break;
                    default:
                        String string2 = amFootballWinProbabilityDescriptionModal.requireArguments().getString("SECOND_TEAM_NAME");
                        return string2 == null ? "" : string2;
                }
                return Integer.valueOf(i22);
            }
        });
        final int i3 = 2;
        this.y = ypa.b(new Function0(this) { // from class: jp
            public final /* synthetic */ AmFootballWinProbabilityDescriptionModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22;
                int i32 = i3;
                AmFootballWinProbabilityDescriptionModal amFootballWinProbabilityDescriptionModal = this.b;
                switch (i32) {
                    case 0:
                        i22 = amFootballWinProbabilityDescriptionModal.requireArguments().getInt("FIRST_TEAM_ID");
                        break;
                    case 1:
                        String string = amFootballWinProbabilityDescriptionModal.requireArguments().getString("FIRST_TEAM_NAME");
                        return string == null ? "" : string;
                    case 2:
                        i22 = amFootballWinProbabilityDescriptionModal.requireArguments().getInt("SECOND_TEAM_ID");
                        break;
                    default:
                        String string2 = amFootballWinProbabilityDescriptionModal.requireArguments().getString("SECOND_TEAM_NAME");
                        return string2 == null ? "" : string2;
                }
                return Integer.valueOf(i22);
            }
        });
        final int i4 = 3;
        this.z = ypa.b(new Function0(this) { // from class: jp
            public final /* synthetic */ AmFootballWinProbabilityDescriptionModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22;
                int i32 = i4;
                AmFootballWinProbabilityDescriptionModal amFootballWinProbabilityDescriptionModal = this.b;
                switch (i32) {
                    case 0:
                        i22 = amFootballWinProbabilityDescriptionModal.requireArguments().getInt("FIRST_TEAM_ID");
                        break;
                    case 1:
                        String string = amFootballWinProbabilityDescriptionModal.requireArguments().getString("FIRST_TEAM_NAME");
                        return string == null ? "" : string;
                    case 2:
                        i22 = amFootballWinProbabilityDescriptionModal.requireArguments().getInt("SECOND_TEAM_ID");
                        break;
                    default:
                        String string2 = amFootballWinProbabilityDescriptionModal.requireArguments().getString("SECOND_TEAM_NAME");
                        return string2 == null ? "" : string2;
                }
                return Integer.valueOf(i22);
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_win_probability, (ViewGroup) v().l, false);
        int i = R.id.away_label;
        TextView textView = (TextView) nq8.B(R.id.away_label, inflate);
        if (textView != null) {
            i = R.id.field_goal_icon;
            if (((ImageView) nq8.B(R.id.field_goal_icon, inflate)) != null) {
                i = R.id.field_goal_label;
                if (((TextView) nq8.B(R.id.field_goal_label, inflate)) != null) {
                    i = R.id.home_label;
                    TextView textView2 = (TextView) nq8.B(R.id.home_label, inflate);
                    if (textView2 != null) {
                        i = R.id.incident_legend_title;
                        if (((TextView) nq8.B(R.id.incident_legend_title, inflate)) != null) {
                            i = R.id.logo_first;
                            ImageView imageView = (ImageView) nq8.B(R.id.logo_first, inflate);
                            if (imageView != null) {
                                i = R.id.logo_second;
                                ImageView imageView2 = (ImageView) nq8.B(R.id.logo_second, inflate);
                                if (imageView2 != null) {
                                    i = R.id.rouge_icon;
                                    if (((ImageView) nq8.B(R.id.rouge_icon, inflate)) != null) {
                                        i = R.id.rouge_label;
                                        if (((TextView) nq8.B(R.id.rouge_label, inflate)) != null) {
                                            i = R.id.safety_icon;
                                            if (((ImageView) nq8.B(R.id.safety_icon, inflate)) != null) {
                                                i = R.id.safety_label;
                                                if (((TextView) nq8.B(R.id.safety_label, inflate)) != null) {
                                                    i = R.id.touchdown_2pt_icon;
                                                    if (((ImageView) nq8.B(R.id.touchdown_2pt_icon, inflate)) != null) {
                                                        i = R.id.touchdown_2pt_label;
                                                        if (((TextView) nq8.B(R.id.touchdown_2pt_label, inflate)) != null) {
                                                            i = R.id.touchdown_extra_icon;
                                                            if (((ImageView) nq8.B(R.id.touchdown_extra_icon, inflate)) != null) {
                                                                i = R.id.touchdown_extra_label;
                                                                if (((TextView) nq8.B(R.id.touchdown_extra_label, inflate)) != null) {
                                                                    i = R.id.touchdown_icon;
                                                                    if (((ImageView) nq8.B(R.id.touchdown_icon, inflate)) != null) {
                                                                        i = R.id.touchdown_label;
                                                                        if (((TextView) nq8.B(R.id.touchdown_label, inflate)) != null) {
                                                                            i = R.id.win_probability_empty_space;
                                                                            if (nq8.B(R.id.win_probability_empty_space, inflate) != null) {
                                                                                i = R.id.win_probability_icon;
                                                                                if (((ImageView) nq8.B(R.id.win_probability_icon, inflate)) != null) {
                                                                                    i = R.id.win_probability_text;
                                                                                    if (((TextView) nq8.B(R.id.win_probability_text, inflate)) != null) {
                                                                                        ScrollView scrollView = (ScrollView) inflate;
                                                                                        as9.o(imageView, ((Number) this.w.getValue()).intValue());
                                                                                        as9.o(imageView2, ((Number) this.y.getValue()).intValue());
                                                                                        textView2.setText(requireContext().getString(R.string.am_football_team_scoring_incidents, (String) this.x.getValue()));
                                                                                        textView.setText(requireContext().getString(R.string.am_football_team_scoring_incidents, (String) this.z.getValue()));
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
        return "WinProbabilityModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getA() {
        return this.A;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.am_football_win_probability_info_title);
        string.getClass();
        return string;
    }
}
