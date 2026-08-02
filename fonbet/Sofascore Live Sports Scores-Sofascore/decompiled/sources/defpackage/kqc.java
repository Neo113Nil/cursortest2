package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.model.mvvm.model.Record;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.TeamForm;
import com.sofascore.model.newNetwork.TypeForm;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kqc extends o8 {
    public final bu1 d;
    public Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqc(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.divider_central;
        if (((MaterialDivider) nq8.B(R.id.divider_central, root)) != null) {
            i = R.id.divider_wld_1;
            if (((MaterialDivider) nq8.B(R.id.divider_wld_1, root)) != null) {
                i = R.id.divider_wld_2;
                if (((MaterialDivider) nq8.B(R.id.divider_wld_2, root)) != null) {
                    i = R.id.division_rankings_button;
                    TextView textView = (TextView) nq8.B(R.id.division_rankings_button, root);
                    if (textView != null) {
                        i = R.id.fighter_form_1;
                        View B = nq8.B(R.id.fighter_form_1, root);
                        if (B != null) {
                            hs1 a = hs1.a(B);
                            i = R.id.fighter_form_2;
                            View B2 = nq8.B(R.id.fighter_form_2, root);
                            if (B2 != null) {
                                hs1 a2 = hs1.a(B2);
                                i = R.id.fighter_image_1;
                                ImageView imageView = (ImageView) nq8.B(R.id.fighter_image_1, root);
                                if (imageView != null) {
                                    i = R.id.fighter_image_2;
                                    ImageView imageView2 = (ImageView) nq8.B(R.id.fighter_image_2, root);
                                    if (imageView2 != null) {
                                        i = R.id.fighter_rank_1;
                                        TextView textView2 = (TextView) nq8.B(R.id.fighter_rank_1, root);
                                        if (textView2 != null) {
                                            i = R.id.fighter_rank_2;
                                            TextView textView3 = (TextView) nq8.B(R.id.fighter_rank_2, root);
                                            if (textView3 != null) {
                                                i = R.id.label_wld_1;
                                                if (((TextView) nq8.B(R.id.label_wld_1, root)) != null) {
                                                    i = R.id.label_wld_2;
                                                    if (((TextView) nq8.B(R.id.label_wld_2, root)) != null) {
                                                        i = R.id.title;
                                                        if (((TextView) nq8.B(R.id.title, root)) != null) {
                                                            i = R.id.value_wld_1;
                                                            TextView textView4 = (TextView) nq8.B(R.id.value_wld_1, root);
                                                            if (textView4 != null) {
                                                                i = R.id.value_wld_2;
                                                                TextView textView5 = (TextView) nq8.B(R.id.value_wld_2, root);
                                                                if (textView5 != null) {
                                                                    this.d = new bu1((ConstraintLayout) root, textView, a, a2, imageView, imageView2, textView2, textView3, textView4, textView5);
                                                                    getRoot().setVisibility(8);
                                                                    o8.d(this, 0, 7);
                                                                    z8e.a0(textView, 1000L, new xxb(this, 5));
                                                                    return;
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.view_mma_prematch_form;
    }

    @Nullable
    public final Function0<Unit> getRankingsClickListener() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    public final void j(TeamForm teamForm, Integer num, ImageView imageView, TextView textView, TextView textView2, hs1 hs1Var) {
        String string;
        int i;
        if (num != null && num.intValue() == 0) {
            string = getContext().getString(R.string.champion);
            string.getClass();
            i = R.drawable.ic_champion_16;
        } else {
            if (num != null) {
                string = "#" + num;
            } else {
                string = getContext().getString(R.string.mma_fighter_not_ranked);
                string.getClass();
            }
            i = 0;
        }
        textView.setText(string);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
        Team team = teamForm.getTeam();
        if (team != null) {
            as9.d(imageView, team.getId(), team.getGender(), false);
            imageView.setOnClickListener(new au7(28, this, team));
            Record wdlRecord = team.getWdlRecord();
            textView2.setText(wdlRecord != null ? wdlRecord.getWins() + "-" + wdlRecord.getLosses() + "-" + wdlRecord.getDraws() : null);
        }
        ?? winTypeForm = teamForm.getWinTypeForm();
        if (winTypeForm == 0) {
            List<String> form = teamForm.getForm();
            winTypeForm = new ArrayList(k13.r(form, 10));
            for (String str : form) {
                winTypeForm.add(new TypeForm(str, str));
            }
        }
        List M0 = CollectionsKt.M0(3, winTypeForm);
        l((TypeForm) CollectionsKt.a0(0, M0), hs1Var.c);
        l((TypeForm) CollectionsKt.a0(1, M0), hs1Var.d);
        l((TypeForm) CollectionsKt.a0(2, M0), hs1Var.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r0.equals("NC") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        r3 = com.sofascore.results.R.color.neutral_default;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (r0.equals("N") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        if (r0.equals("D") == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(TypeForm typeForm, TextView textView) {
        String outcome;
        int i;
        if (typeForm == null || (outcome = typeForm.getWinType()) == null) {
            outcome = typeForm != null ? typeForm.getOutcome() : null;
        }
        textView.setText(outcome);
        Context context = getContext();
        String outcome2 = typeForm != null ? typeForm.getOutcome() : null;
        if (outcome2 != null) {
            int hashCode = outcome2.hashCode();
            if (hashCode != 68) {
                if (hashCode != 76) {
                    if (hashCode != 78) {
                        if (hashCode != 87) {
                            if (hashCode == 2485) {
                            }
                        } else if (outcome2.equals("W")) {
                            i = R.color.success;
                        }
                    }
                } else if (outcome2.equals("L")) {
                    i = R.color.error;
                }
            }
            z8e.V(context.getColor(i), textView);
        }
        i = R.color.n_lv_4;
        z8e.V(context.getColor(i), textView);
    }

    public final void setRankingsClickListener(@Nullable Function0<Unit> function0) {
        this.e = function0;
    }
}
