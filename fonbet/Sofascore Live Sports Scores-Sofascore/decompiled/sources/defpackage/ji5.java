package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ji5 extends o8 {
    public final f92 d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji5(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.action_text;
        if (((TextView) nq8.B(R.id.action_text, root)) != null) {
            i = R.id.badges_layout;
            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.badges_layout, root);
            if (frameLayout != null) {
                i = R.id.chat_action_click;
                if (((ImageView) nq8.B(R.id.chat_action_click, root)) != null) {
                    i = R.id.chat_action_dummy_text;
                    TextView textView = (TextView) nq8.B(R.id.chat_action_dummy_text, root);
                    if (textView != null) {
                        i = R.id.chat_action_layout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.chat_action_layout, root);
                        if (constraintLayout != null) {
                            i = R.id.chat_action_text;
                            if (((TextView) nq8.B(R.id.chat_action_text, root)) != null) {
                                i = R.id.chat_icon;
                                if (((ImageView) nq8.B(R.id.chat_icon, root)) != null) {
                                    i = R.id.community_suggestions;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) nq8.B(R.id.community_suggestions, root);
                                    if (constraintLayout2 != null) {
                                        i = R.id.community_suggestions_disabled;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) nq8.B(R.id.community_suggestions_disabled, root);
                                        if (constraintLayout3 != null) {
                                            i = R.id.community_suggestions_layouts;
                                            FrameLayout frameLayout2 = (FrameLayout) nq8.B(R.id.community_suggestions_layouts, root);
                                            if (frameLayout2 != null) {
                                                i = R.id.community_suggestions_txt;
                                                TextView textView2 = (TextView) nq8.B(R.id.community_suggestions_txt, root);
                                                if (textView2 != null) {
                                                    i = R.id.contribute_button;
                                                    TextView textView3 = (TextView) nq8.B(R.id.contribute_button, root);
                                                    if (textView3 != null) {
                                                        i = R.id.editor_cta_text;
                                                        if (((TextView) nq8.B(R.id.editor_cta_text, root)) != null) {
                                                            i = R.id.icon_info;
                                                            if (((ImageView) nq8.B(R.id.icon_info, root)) != null) {
                                                                i = R.id.icon_info2;
                                                                if (((ImageView) nq8.B(R.id.icon_info2, root)) != null) {
                                                                    i = R.id.info_icon;
                                                                    if (((ImageView) nq8.B(R.id.info_icon, root)) != null) {
                                                                        i = R.id.join_the_team_button;
                                                                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.join_the_team_button, root);
                                                                        if (linearLayout != null) {
                                                                            i = R.id.no_reputation_action_click;
                                                                            if (((ImageView) nq8.B(R.id.no_reputation_action_click, root)) != null) {
                                                                                i = R.id.no_reputation_action_text;
                                                                                if (((TextView) nq8.B(R.id.no_reputation_action_text, root)) != null) {
                                                                                    i = R.id.no_reputation_score_layout;
                                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) nq8.B(R.id.no_reputation_score_layout, root);
                                                                                    if (constraintLayout4 != null) {
                                                                                        i = R.id.reputation_action_click;
                                                                                        if (((ImageView) nq8.B(R.id.reputation_action_click, root)) != null) {
                                                                                            i = R.id.reputation_action_text;
                                                                                            if (((TextView) nq8.B(R.id.reputation_action_text, root)) != null) {
                                                                                                i = R.id.reputation_dummy_text;
                                                                                                if (((TextView) nq8.B(R.id.reputation_dummy_text, root)) != null) {
                                                                                                    i = R.id.reputation_layout;
                                                                                                    FrameLayout frameLayout3 = (FrameLayout) nq8.B(R.id.reputation_layout, root);
                                                                                                    if (frameLayout3 != null) {
                                                                                                        i = R.id.reputation_score;
                                                                                                        TextView textView4 = (TextView) nq8.B(R.id.reputation_score, root);
                                                                                                        if (textView4 != null) {
                                                                                                            i = R.id.reputation_score_layout;
                                                                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) nq8.B(R.id.reputation_score_layout, root);
                                                                                                            if (constraintLayout5 != null) {
                                                                                                                i = R.id.suggest_assit_scorer;
                                                                                                                TextView textView5 = (TextView) nq8.B(R.id.suggest_assit_scorer, root);
                                                                                                                if (textView5 != null) {
                                                                                                                    i = R.id.suggest_image;
                                                                                                                    ImageView imageView = (ImageView) nq8.B(R.id.suggest_image, root);
                                                                                                                    if (imageView != null) {
                                                                                                                        i = R.id.suggest_text;
                                                                                                                        TextView textView6 = (TextView) nq8.B(R.id.suggest_text, root);
                                                                                                                        if (textView6 != null) {
                                                                                                                            i = R.id.suggested_result_layout;
                                                                                                                            LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.suggested_result_layout, root);
                                                                                                                            if (linearLayout2 != null) {
                                                                                                                                i = R.id.title;
                                                                                                                                if (((TextView) nq8.B(R.id.title, root)) != null) {
                                                                                                                                    i = R.id.top_contributors_cta;
                                                                                                                                    LinearLayout linearLayout3 = (LinearLayout) nq8.B(R.id.top_contributors_cta, root);
                                                                                                                                    if (linearLayout3 != null) {
                                                                                                                                        ConstraintLayout constraintLayout6 = (ConstraintLayout) root;
                                                                                                                                        this.d = new f92(constraintLayout6, frameLayout, textView, constraintLayout, constraintLayout2, constraintLayout3, frameLayout2, textView2, textView3, linearLayout, constraintLayout4, frameLayout3, textView4, constraintLayout5, textView5, imageView, textView6, linearLayout2, linearLayout3);
                                                                                                                                        constraintLayout6.getClass();
                                                                                                                                        constraintLayout6.setVisibility(8);
                                                                                                                                        aba.y(constraintLayout, context.getColor(R.color.n_lv_3), 2);
                                                                                                                                        aba.y(frameLayout3, context.getColor(R.color.n_lv_3), 2);
                                                                                                                                        aba.y(linearLayout3, context.getColor(R.color.n_lv_3), 2);
                                                                                                                                        aba.y(linearLayout, 0, 3);
                                                                                                                                        aba.y(textView3, 0, 3);
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.editor_community_corner_view;
    }

    public final void j(hy5 hy5Var, Event event, ox5 ox5Var, ox5 ox5Var2, ny nyVar, ny nyVar2) {
        hy5Var.getClass();
        f92 f92Var = this.d;
        ConstraintLayout constraintLayout = (ConstraintLayout) f92Var.k;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) f92Var.l;
        TextView textView = f92Var.f;
        constraintLayout.setOnClickListener(new cd5(ox5Var, 3));
        l();
        EventSuggest eventSuggest = hy5Var.a;
        boolean z = event.getCrowdsourcingEnabled() && event.getCrowdsourcingDataDisplayEnabled();
        long startTimestamp = event.getStartTimestamp() - 86400;
        long startTimestamp2 = event.getStartTimestamp() + gl3.a;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        boolean z2 = me4.t(StatusKt.STATUS_POSTPONED, event) || me4.t(StatusKt.STATUS_CANCELED, event);
        if (z && !z2 && startTimestamp <= currentTimeMillis && currentTimeMillis < startTimestamp2) {
            z8e.V(getContext().getColor(R.color.primary_default), textView);
            textView.setEnabled(true);
            textView.setOnClickListener(new cd5(ox5Var2, 4));
            n(eventSuggest, event.shouldReverseTeams(), false);
        } else if (!z || (!z2 && currentTimeMillis < startTimestamp2)) {
            ConstraintLayout constraintLayout3 = (ConstraintLayout) f92Var.m;
            if (z) {
                constraintLayout3.setVisibility(0);
                constraintLayout2.setVisibility(8);
            } else {
                constraintLayout3.setVisibility(8);
                constraintLayout2.setVisibility(8);
            }
        } else {
            z8e.V(getContext().getColor(R.color.neutral_default), textView);
            textView.setEnabled(false);
            n(eventSuggest, event.shouldReverseTeams(), true);
        }
        z8e.a0((FrameLayout) f92Var.p, 1000L, new h63(nyVar2, 20));
        ((LinearLayout) f92Var.g).setOnClickListener(new cd5(this, 1));
        ((LinearLayout) f92Var.t).setOnClickListener(new cd5(nyVar, 2));
        if (this.e) {
            return;
        }
        this.e = true;
        ConstraintLayout constraintLayout4 = f92Var.b;
        constraintLayout4.getClass();
        tgj.p(constraintLayout4, 0L, 3);
    }

    public final void l() {
        ia0 ia0Var = ia0.q;
        UserAccount e = ok3.p().e();
        boolean isLoggedIn = e.getIsLoggedIn();
        f92 f92Var = this.d;
        if (!isLoggedIn || !e.getIsActiveCrowdsourcer()) {
            ((ConstraintLayout) f92Var.o).setVisibility(0);
            ((ConstraintLayout) f92Var.q).setVisibility(8);
            f92Var.d.setText(getContext().getString(R.string.earn_profile_badges_button));
        } else {
            ((ConstraintLayout) f92Var.o).setVisibility(8);
            ((ConstraintLayout) f92Var.q).setVisibility(0);
            f92Var.h.setText(String.valueOf((int) e.getCredibilityScore()));
            f92Var.d.setText(getContext().getString(R.string.reputation_score));
        }
    }

    public final void n(EventSuggest eventSuggest, boolean z, boolean z2) {
        Pair pair;
        Pair pair2;
        Integer valueOf = Integer.valueOf(R.drawable.ic_goal_incidents);
        f92 f92Var = this.d;
        ConstraintLayout constraintLayout = (ConstraintLayout) f92Var.l;
        TextView textView = f92Var.i;
        TextView textView2 = (TextView) f92Var.r;
        ImageView imageView = f92Var.j;
        constraintLayout.setVisibility(0);
        ((ConstraintLayout) f92Var.m).setVisibility(8);
        if (eventSuggest == null) {
            if (z2) {
                ((ConstraintLayout) f92Var.l).setVisibility(8);
                return;
            } else {
                ((LinearLayout) f92Var.s).setVisibility(8);
                f92Var.e.setText(getContext().getString(R.string.community_suggestions_contribute_call_text));
                return;
            }
        }
        String str = "";
        if (!(eventSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
            if (eventSuggest instanceof EventSuggest.StatusSuggest) {
                Integer valueOf2 = Integer.valueOf(R.drawable.ic_block);
                apf a = ajh.a(imageView.getContext());
                ht9 ht9Var = new ht9(imageView.getContext());
                ht9Var.c = valueOf2;
                vt9.f(ht9Var, imageView);
                a.a(ht9Var.a());
                imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.n_lv_3)));
                String statusSuggest = ((EventSuggest.StatusSuggest) eventSuggest).getStatusSuggest();
                if (Intrinsics.c(statusSuggest, StatusKt.STATUS_POSTPONED)) {
                    str = getContext().getString(R.string.postponed);
                } else if (Intrinsics.c(statusSuggest, StatusKt.STATUS_CANCELED)) {
                    str = getContext().getString(R.string.canceled);
                }
                textView2.setText(str);
                return;
            }
            if (eventSuggest instanceof EventSuggest.StartDateSuggest) {
                Integer valueOf3 = Integer.valueOf(R.drawable.ic_timer);
                apf a2 = ajh.a(imageView.getContext());
                ht9 ht9Var2 = new ht9(imageView.getContext());
                ht9Var2.c = valueOf3;
                vt9.f(ht9Var2, imageView);
                a2.a(ht9Var2.a());
                imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.n_lv_3)));
                Context context = getContext();
                context.getClass();
                long startDateSuggestTimestamp = ((EventSuggest.StartDateSuggest) eventSuggest).getStartDateSuggestTimestamp();
                String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
                bestPattern.getClass();
                fn0.u(startDateSuggestTimestamp, hk4.a(bestPattern), textView2);
                return;
            }
            if (eventSuggest instanceof EventSuggest.FinalScoreSuggest) {
                if (z) {
                    EventSuggest.FinalScoreSuggest finalScoreSuggest = (EventSuggest.FinalScoreSuggest) eventSuggest;
                    pair = new Pair(Integer.valueOf(finalScoreSuggest.getAwayScoreSuggest()), Integer.valueOf(finalScoreSuggest.getHomeScoreSuggest()));
                } else {
                    EventSuggest.FinalScoreSuggest finalScoreSuggest2 = (EventSuggest.FinalScoreSuggest) eventSuggest;
                    pair = new Pair(Integer.valueOf(finalScoreSuggest2.getHomeScoreSuggest()), Integer.valueOf(finalScoreSuggest2.getAwayScoreSuggest()));
                }
                textView2.setText(((Number) pair.a).intValue() + " - " + ((Number) pair.b).intValue());
                return;
            }
            return;
        }
        if (z) {
            EventSuggest.IncidentSuggest.GoalSuggest goalSuggest = (EventSuggest.IncidentSuggest.GoalSuggest) eventSuggest;
            pair2 = new Pair(Integer.valueOf(goalSuggest.getAwayScoreSuggest()), Integer.valueOf(goalSuggest.getHomeScoreSuggest()));
        } else {
            EventSuggest.IncidentSuggest.GoalSuggest goalSuggest2 = (EventSuggest.IncidentSuggest.GoalSuggest) eventSuggest;
            pair2 = new Pair(Integer.valueOf(goalSuggest2.getHomeScoreSuggest()), Integer.valueOf(goalSuggest2.getAwayScoreSuggest()));
        }
        int intValue = ((Number) pair2.a).intValue();
        int intValue2 = ((Number) pair2.b).intValue();
        String g = fc6.g(intValue, intValue2, " - ");
        Context context2 = getContext();
        context2.getClass();
        Pair pair3 = !hkg.c0(context2) ? new Pair(Integer.valueOf(intValue), Integer.valueOf(intValue2)) : new Pair(Integer.valueOf(intValue2), Integer.valueOf(intValue));
        String j = lnb.j(((Number) pair3.a).intValue(), ((Number) pair3.b).intValue(), "(", "-", ")");
        EventSuggest.IncidentSuggest.GoalSuggest goalSuggest3 = (EventSuggest.IncidentSuggest.GoalSuggest) eventSuggest;
        if (goalSuggest3.getPlayer() != null) {
            apf a3 = ajh.a(imageView.getContext());
            ht9 ht9Var3 = new ht9(imageView.getContext());
            ht9Var3.c = valueOf;
            vt9.f(ht9Var3, imageView);
            a3.a(ht9Var3.a());
            z8e.V(getContext().getColor(R.color.secondary_default), imageView);
            textView2.setText(j);
            Player player = goalSuggest3.getPlayer();
            player.getClass();
            textView.setText(tba.C(player));
            return;
        }
        if (goalSuggest3.getAssist() == null) {
            apf a4 = ajh.a(imageView.getContext());
            ht9 ht9Var4 = new ht9(imageView.getContext());
            ht9Var4.c = valueOf;
            vt9.f(ht9Var4, imageView);
            a4.a(ht9Var4.a());
            z8e.V(getContext().getColor(R.color.secondary_default), imageView);
            textView2.setText(g);
            textView.setText("");
            return;
        }
        Integer valueOf4 = Integer.valueOf(R.drawable.ic_football_assist_16);
        apf a5 = ajh.a(imageView.getContext());
        ht9 ht9Var5 = new ht9(imageView.getContext());
        ht9Var5.c = valueOf4;
        vt9.f(ht9Var5, imageView);
        a5.a(ht9Var5.a());
        z8e.V(getContext().getColor(R.color.secondary_default), imageView);
        textView2.setText(j);
        Player assist = goalSuggest3.getAssist();
        assist.getClass();
        textView.setText(tba.C(assist));
    }
}
