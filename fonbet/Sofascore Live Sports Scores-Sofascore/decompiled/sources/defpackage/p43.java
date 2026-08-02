package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.AmericanFootballDownDistance;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.commentary.BaseballActionOutcome;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.model.newNetwork.commentary.CommentKt;
import com.sofascore.model.newNetwork.commentary.FootballPassingNetworkSegment;
import com.sofascore.model.newNetwork.commentary.NotableAction;
import com.sofascore.model.newNetwork.commentary.TeamShirtColors;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncidentKt;
import com.sofascore.results.R;
import com.sofascore.results.view.DotView;
import com.sofascore.results.view.graph.networkanimation.PassingNetworkAnimationView;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class p43 extends p8 {
    public final sc c;
    public final Event d;
    public final Function1 e;
    public PassingNetworkAnimationView f;
    public TeamShirtColors g;
    public TeamShirtColors h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p43(sc scVar, Event event, Function1 function1) {
        super(r0);
        event.getClass();
        function1.getClass();
        LinearLayout linearLayout = (LinearLayout) scVar.b;
        linearLayout.getClass();
        this.c = scVar;
        this.d = event;
        this.e = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:296:0x0140, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r5, r13) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x023f, code lost:
    
        if (r6 != null) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03a5  */
    @Override // defpackage.p8
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(int i, int i2, final Comment comment) {
        TextView textView;
        TextView textView2;
        Context context;
        LinearLayout linearLayout;
        ViewStub viewStub;
        ImageView imageView;
        TextView textView3;
        TextView textView4;
        Object obj;
        int i3;
        Player player;
        Integer num;
        Player playerOut;
        ConstraintLayout constraintLayout;
        int i4;
        Drawable b;
        TextView textView5;
        TextView textView6;
        String c;
        int i5;
        ViewGroup.LayoutParams layoutParams;
        int s;
        final p43 p43Var;
        View view;
        Integer outCount;
        Context context2;
        boolean z;
        Object obj2;
        String r0;
        String str;
        Object obj3;
        Object obj4;
        String p;
        comment.getClass();
        Event event = this.d;
        String slug = event.getTournament().getCategory().getSport().getSlug();
        sc scVar = this.c;
        LinearLayout linearLayout2 = (LinearLayout) scVar.p;
        bv1 bv1Var = (bv1) scVar.l;
        TextView textView7 = (TextView) scVar.k;
        LinearLayout linearLayout3 = (LinearLayout) scVar.b;
        ViewStub viewStub2 = (ViewStub) scVar.n;
        ImageView imageView2 = (ImageView) scVar.f;
        TextView textView8 = scVar.j;
        ImageView imageView3 = (ImageView) scVar.g;
        TextView textView9 = scVar.d;
        TextView textView10 = scVar.i;
        FrameLayout frameLayout = (FrameLayout) scVar.o;
        linearLayout3.getClass();
        ViewGroup.LayoutParams layoutParams2 = linearLayout3.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        Context context3 = this.b;
        marginLayoutParams.topMargin = ao2.s(i != 0 ? 4 : 8, context3);
        linearLayout3.setLayoutParams(marginLayoutParams);
        if (Intrinsics.c(slug, Sports.BASEBALL)) {
            textView = textView8;
            textView2 = textView10;
            context = context3;
            linearLayout = linearLayout2;
            viewStub = viewStub2;
            imageView = imageView3;
            textView3 = textView9;
            textView4 = textView7;
            obj = Sports.BASEBALL;
        } else if (b.j("matchStarted", "periodStart", j43.j.a, j43.e.a).contains(comment.getType())) {
            textView = textView8;
            textView2 = textView10;
            context = context3;
            linearLayout = linearLayout2;
            viewStub = viewStub2;
            imageView = imageView3;
            slug = slug;
            textView3 = textView9;
            textView4 = textView7;
            obj = Sports.BASEBALL;
        } else {
            Set set = m43.a;
            if (Intrinsics.c(comment.getPeriodName(), HockeyIncidentKt.PERIOD_SHOOTOUT)) {
                textView = textView8;
                textView2 = textView10;
                context = context3;
                linearLayout = linearLayout2;
                viewStub = viewStub2;
                imageView = imageView3;
                slug = slug;
                i3 = 8;
                textView3 = textView9;
                textView4 = textView7;
                obj = Sports.BASEBALL;
                textView3.setVisibility(i3);
                player = comment.getPlayer();
                if (player != null) {
                    num = Integer.valueOf(player.getId());
                } else {
                    Player playerIn = comment.getPlayerIn();
                    if (playerIn != null) {
                        num = Integer.valueOf(playerIn.getId());
                    }
                    num = null;
                }
                ImageView imageView4 = scVar.e;
                if (num != null) {
                    as9.l(imageView4, num.intValue(), null);
                    imageView4.setVisibility(0);
                } else {
                    imageView4.setVisibility(8);
                    Unit unit = Unit.a;
                }
                playerOut = comment.getPlayerOut();
                if (playerOut != null) {
                    Integer valueOf = Integer.valueOf(playerOut.getId());
                    if (!Intrinsics.c(slug, obj)) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        as9.l(imageView2, valueOf.intValue(), null);
                        imageView2.setVisibility(0);
                        constraintLayout = (ConstraintLayout) scVar.m;
                        if ((Intrinsics.c(slug, obj) || comment.getInningInfo() == null || !Intrinsics.c(comment.getType(), j43.m.a)) && (Intrinsics.c(slug, obj) || comment.getPlayer() == null)) {
                            constraintLayout.setOnClickListener(null);
                            constraintLayout.setEnabled(false);
                        } else {
                            constraintLayout.setEnabled(true);
                            final int i6 = 0;
                            aba.y(constraintLayout, 0, 3);
                            z8e.a0(constraintLayout, 1000L, new Function0(this) { // from class: n43
                                public final /* synthetic */ p43 b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i7 = i6;
                                    Comment comment2 = comment;
                                    p43 p43Var2 = this.b;
                                    switch (i7) {
                                        case 0:
                                            p43Var2.e.invoke(new w33(comment2));
                                            break;
                                        default:
                                            p43Var2.e.invoke(new v33(comment2));
                                            break;
                                    }
                                    return Unit.a;
                                }
                            });
                        }
                        if (comment.getPlayer() == null) {
                            Boolean isHome$default = Comment.getIsHome$default(comment, null, 1, null);
                            if (isHome$default != null) {
                                boolean booleanValue = isHome$default.booleanValue();
                                Set set2 = m43.a;
                                String type = comment.getType();
                                String goalType = comment.getGoalType();
                                type.getClass();
                                Team homeTeam$default = booleanValue ^ (type.equals(j43.f.a) && Intrinsics.c(goalType, l43.d.a)) ? Event.getHomeTeam$default(event, null, 1, null) : Event.getAwayTeam$default(event, null, 1, null);
                                ImageView imageView5 = (!Intrinsics.c(slug, obj) || Intrinsics.c(comment.getType(), j43.l.a)) ? imageView : null;
                                if (imageView5 != null) {
                                    as9.o(imageView5, homeTeam$default.getId());
                                    imageView5.setVisibility(0);
                                    obj4 = imageView5;
                                } else {
                                    obj4 = null;
                                }
                                if (obj4 != null) {
                                    i4 = 8;
                                    obj3 = obj4;
                                }
                            }
                            i4 = 8;
                            imageView.setVisibility(8);
                            obj3 = Unit.a;
                        } else {
                            i4 = 8;
                        }
                        imageView.setVisibility(i4);
                        Unit unit2 = Unit.a;
                        if (Intrinsics.c(slug, Sports.AMERICAN_FOOTBALL)) {
                            TextView textView11 = textView2;
                            if (Intrinsics.c(slug, Sports.BASKETBALL)) {
                                if (!j43.f.a.equals(comment.getType()) || Comment.getHomeScore$default(comment, null, 1, null) == null || Comment.getAwayScore$default(comment, null, 1, null) == null) {
                                    textView11.setVisibility(8);
                                    Unit unit3 = Unit.a;
                                } else {
                                    Boolean isHome$default2 = Comment.getIsHome$default(comment, null, 1, null);
                                    if (isHome$default2 != null) {
                                        textView11.setText((isHome$default2.booleanValue() ? Event.getHomeTeam$default(event, null, 1, null) : Event.getAwayTeam$default(event, null, 1, null)).getNameCode() + " " + Comment.getHomeScore$default(comment, null, 1, null) + " - " + Comment.getAwayScore$default(comment, null, 1, null));
                                        textView11.setVisibility(0);
                                        Unit unit4 = Unit.a;
                                    }
                                }
                            }
                        } else if (j43.i.a.equals(comment.getType())) {
                            Integer currentTeamHalf$default = AmericanFootballDownDistance.getCurrentTeamHalf$default(comment.getDownDistance(), event.shouldReverseTeams(), null, 2, null);
                            Integer currentYardline = comment.getDownDistance().getCurrentYardline();
                            Context context4 = textView2.getContext();
                            context4.getClass();
                            if (currentTeamHalf$default == null || currentYardline == null) {
                                str = null;
                            } else {
                                str = context4.getString(R.string.commentary_extra_point_attempt, (currentTeamHalf$default.intValue() == 1 ? Event.getHomeTeam$default(event, null, 1, null) : Event.getAwayTeam$default(event, null, 1, null)).getNameCode(), currentYardline);
                            }
                            if (str != null) {
                                TextView textView12 = textView2;
                                textView12.setText(str);
                                textView12.setVisibility(0);
                            } else {
                                textView2.setVisibility(8);
                            }
                            Unit unit5 = Unit.a;
                        } else {
                            TextView textView13 = textView2;
                            Context context5 = textView13.getContext();
                            context5.getClass();
                            AmericanFootballDownDistance downDistance = comment.getDownDistance();
                            downDistance.getClass();
                            String y = o1j.y(context5, downDistance, AmericanFootballDownDistance.getCurrentPossession$default(downDistance, event.shouldReverseTeams(), null, 2, null), AmericanFootballDownDistance.getCurrentTeamHalf$default(downDistance, event.shouldReverseTeams(), null, 2, null), Event.getHomeTeam$default(event, null, 1, null).getNameCode(), Event.getAwayTeam$default(event, null, 1, null).getNameCode());
                            if (y != null) {
                                textView13.setText(y);
                                textView13.setVisibility(0);
                            } else {
                                textView13.setVisibility(8);
                            }
                            Unit unit6 = Unit.a;
                        }
                        ImageView imageView6 = scVar.c;
                        Set set3 = m43.a;
                        Context context6 = imageView6.getContext();
                        context6.getClass();
                        String type2 = comment.getType();
                        comment.getPeriodName();
                        b = m43.b(context6, type2, comment.getGoalType());
                        if (b == null) {
                            imageView6.setImageDrawable(b);
                            imageView6.setVisibility(0);
                        } else {
                            imageView6.setVisibility(8);
                        }
                        Unit unit7 = Unit.a;
                        if (Intrinsics.c(slug, obj)) {
                            textView5 = textView4;
                            textView6 = textView;
                        } else {
                            if (Intrinsics.c(comment.getType(), j43.m.a)) {
                                ((LinearLayout) bv1Var.b).setVisibility(0);
                                BaseballInningInfo inningInfo = comment.getInningInfo();
                                int m = yid.m(inningInfo != null ? inningInfo.getBallCount() : null);
                                BaseballInningInfo inningInfo2 = comment.getInningInfo();
                                int m2 = yid.m(inningInfo2 != null ? inningInfo2.getStrikeCount() : null);
                                BaseballInningInfo inningInfo3 = comment.getInningInfo();
                                List<Integer> basesCovered = inningInfo3 != null ? inningInfo3.getBasesCovered() : null;
                                if (basesCovered == null) {
                                    basesCovered = km5.a;
                                }
                                ((DotView) bv1Var.e).setFilled(m >= 1);
                                ((DotView) bv1Var.f).setFilled(m >= 2);
                                ((DotView) bv1Var.i).setFilled(m >= 3);
                                ((DotView) bv1Var.c).setFilled(m >= 4);
                                ((DotView) bv1Var.g).setFilled(m2 >= 1);
                                ((DotView) bv1Var.h).setFilled(m2 >= 2);
                                ((DotView) bv1Var.j).setFilled(m2 >= 3);
                                ((ComposeView) bv1Var.d).setContent(new tc3(1770398247, new o43(basesCovered, 0), true));
                                BaseballActionOutcome actionOutcome = comment.getActionOutcome();
                                if (actionOutcome != null) {
                                    context2 = context;
                                    textView5 = textView4;
                                    textView5.setText(k53.r0(actionOutcome, context2));
                                    z8e.V(context2.getColor(k53.k0(actionOutcome, null)), textView5);
                                    if (actionOutcome == BaseballActionOutcome.Homerun) {
                                        z = false;
                                        textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.baseball_homerun, 0, 0, 0);
                                        textView5.setCompoundDrawablePadding(ao2.s(4, context2));
                                        textView5.setPaddingRelative(ao2.s(4, context2), textView5.getPaddingTop(), textView5.getPaddingEnd(), textView5.getPaddingBottom());
                                    } else {
                                        z = false;
                                        textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                                        textView5.setPaddingRelative(ao2.s(8, context2), textView5.getPaddingTop(), textView5.getPaddingEnd(), textView5.getPaddingBottom());
                                    }
                                    textView5.setVisibility(z ? 1 : 0);
                                } else {
                                    textView5 = textView4;
                                    context2 = context;
                                    z = false;
                                    textView5.setVisibility(8);
                                }
                                List<NotableAction> notableActions = comment.getNotableActions();
                                if (notableActions != null) {
                                    LinearLayout linearLayout4 = linearLayout;
                                    linearLayout4.setVisibility(z ? 1 : 0);
                                    linearLayout4.removeAllViews();
                                    Iterator it = notableActions.iterator();
                                    while (it.hasNext()) {
                                        NotableAction notableAction = (NotableAction) it.next();
                                        View inflate = LayoutInflater.from(context2).inflate(R.layout.commentary_notable_action_item, linearLayout4, z);
                                        int i7 = R.id.action_logo;
                                        ImageView imageView7 = (ImageView) nq8.B(R.id.action_logo, inflate);
                                        if (imageView7 != null) {
                                            TextView textView14 = (TextView) nq8.B(R.id.action_text, inflate);
                                            if (textView14 != null) {
                                                Iterator it2 = it;
                                                TextView textView15 = (TextView) nq8.B(R.id.action_title, inflate);
                                                if (textView15 == null) {
                                                    i7 = R.id.action_title;
                                                } else if (nq8.B(R.id.divider, inflate) != null) {
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                                    it7 it7Var = red.c;
                                                    String action = notableAction.getAction();
                                                    it7Var.getClass();
                                                    Iterator<E> it3 = red.e.iterator();
                                                    while (true) {
                                                        if (!it3.hasNext()) {
                                                            obj2 = null;
                                                            break;
                                                        } else {
                                                            obj2 = it3.next();
                                                            if (Intrinsics.c(((red) obj2).a, action)) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    red redVar = (red) obj2;
                                                    if (redVar != null) {
                                                        Function1 function1 = redVar.b;
                                                        if (function1 != null) {
                                                            imageView7.setImageDrawable((Drawable) function1.invoke(context2));
                                                            imageView7.setVisibility(0);
                                                        }
                                                        context2.getClass();
                                                        String action2 = notableAction.getAction();
                                                        it7 it7Var2 = red.c;
                                                        if (Intrinsics.c(action2, "WILD_PITCH")) {
                                                            r0 = context2.getString(R.string.baseball_outcome_wild_pitch);
                                                        } else {
                                                            BaseballActionOutcome outcome = notableAction.getOutcome();
                                                            r0 = outcome != null ? k53.r0(outcome, context2) : null;
                                                        }
                                                        textView15.setText(r0);
                                                        String description = notableAction.getDescription();
                                                        if (description != null) {
                                                            textView14.setText(description);
                                                        } else {
                                                            textView14.setVisibility(8);
                                                        }
                                                        linearLayout4.addView(constraintLayout2);
                                                    }
                                                    z = false;
                                                    it = it2;
                                                } else {
                                                    i7 = R.id.divider;
                                                }
                                            } else {
                                                i7 = R.id.action_text;
                                            }
                                        }
                                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                                        return;
                                    }
                                }
                                linearLayout.setVisibility(8);
                            } else {
                                textView5 = textView4;
                                ((LinearLayout) bv1Var.b).setVisibility(8);
                                linearLayout.setVisibility(8);
                                textView5.setVisibility(8);
                            }
                            textView6 = textView;
                            textView6.setTextAppearance(R.style.DisplaySmall);
                        }
                        if (Intrinsics.c(slug, obj) || !Intrinsics.c(comment.getType(), j43.m.a)) {
                            Set set4 = m43.a;
                            Context context7 = textView6.getContext();
                            context7.getClass();
                            c = m43.c(context7, comment, event);
                            if (c != null) {
                                i5 = 8;
                                textView6.setVisibility(8);
                                Unit unit8 = Unit.a;
                                TextView textView16 = scVar.h;
                                layoutParams = textView16.getLayoutParams();
                                if (layoutParams != null) {
                                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    return;
                                }
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                                if (textView5.getVisibility() == i5 && textView6.getVisibility() == i5) {
                                    s = 0;
                                } else {
                                    Context context8 = textView16.getContext();
                                    context8.getClass();
                                    s = ao2.s(i5, context8);
                                }
                                marginLayoutParams2.topMargin = s;
                                textView16.setLayoutParams(marginLayoutParams2);
                                textView16.setVisibility(comment.getText().length() > 0 ? 0 : 8);
                                if (comment.getText().length() > 0) {
                                    textView16.setText(comment.getText());
                                }
                                List<FootballPassingNetworkSegment> footballPassingNetworkAction = comment.getFootballPassingNetworkAction();
                                if (footballPassingNetworkAction != null) {
                                    if (viewStub.getParent() != null) {
                                        View inflate2 = viewStub.inflate();
                                        inflate2.getClass();
                                        PassingNetworkAnimationView passingNetworkAnimationView = (PassingNetworkAnimationView) inflate2;
                                        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                                        if (layoutParams3 == null) {
                                            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                            return;
                                        }
                                        tl3 tl3Var = (tl3) layoutParams3;
                                        tl3Var.j = passingNetworkAnimationView.getId();
                                        view = frameLayout;
                                        view.setLayoutParams(tl3Var);
                                        p43Var = this;
                                        p43Var.f = passingNetworkAnimationView;
                                    } else {
                                        p43Var = this;
                                        view = frameLayout;
                                    }
                                    PassingNetworkAnimationView passingNetworkAnimationView2 = p43Var.f;
                                    if (passingNetworkAnimationView2 != null) {
                                        passingNetworkAnimationView2.a();
                                        Unit unit9 = Unit.a;
                                    }
                                    boolean isValid = CommentKt.isValid(footballPassingNetworkAction);
                                    PassingNetworkAnimationView passingNetworkAnimationView3 = p43Var.f;
                                    if (isValid) {
                                        if (passingNetworkAnimationView3 != null) {
                                            passingNetworkAnimationView3.e(footballPassingNetworkAction, event.getId(), event.shouldReverseTeams(), p43Var.g, p43Var.h, null);
                                            Unit unit10 = Unit.a;
                                        }
                                        PassingNetworkAnimationView passingNetworkAnimationView4 = p43Var.f;
                                        if (passingNetworkAnimationView4 != null) {
                                            passingNetworkAnimationView4.setVisibility(0);
                                            Unit unit11 = Unit.a;
                                        }
                                        view.setVisibility(0);
                                        final int i8 = 1;
                                        z8e.a0(view, 1000L, new Function0(p43Var) { // from class: n43
                                            public final /* synthetic */ p43 b;

                                            {
                                                this.b = p43Var;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i72 = i8;
                                                Comment comment2 = comment;
                                                p43 p43Var2 = this.b;
                                                switch (i72) {
                                                    case 0:
                                                        p43Var2.e.invoke(new w33(comment2));
                                                        break;
                                                    default:
                                                        p43Var2.e.invoke(new v33(comment2));
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        });
                                    } else {
                                        if (passingNetworkAnimationView3 != null) {
                                            passingNetworkAnimationView3.setVisibility(8);
                                            Unit unit12 = Unit.a;
                                        }
                                        view.setVisibility(8);
                                        view.setOnClickListener(null);
                                    }
                                } else {
                                    frameLayout.setVisibility(8);
                                }
                                Unit unit13 = Unit.a;
                                return;
                            }
                            textView6.setText(c);
                            textView6.setVisibility(0);
                            Unit unit14 = Unit.a;
                        } else {
                            fsf fsfVar = new fsf();
                            String m3 = ljg.m(Comment.getHomeScore$default(comment, null, 1, null), Comment.getAwayScore$default(comment, null, 1, null), " - ");
                            Context context9 = textView6.getContext();
                            context9.getClass();
                            if (hkg.c0(context9)) {
                                m3 = n9e.G(m3, " - ");
                            }
                            fsfVar.a = m3;
                            BaseballInningInfo inningInfo4 = comment.getInningInfo();
                            if (inningInfo4 != null && (outCount = inningInfo4.getOutCount()) != null) {
                                if (outCount.intValue() <= 0) {
                                    outCount = null;
                                }
                                if (outCount != null) {
                                    int intValue = outCount.intValue();
                                    fsfVar.a = fsfVar.a + " | " + intValue + " " + textView6.getContext().getResources().getQuantityString(R.plurals.baseball_outs_counter, intValue);
                                    Unit unit15 = Unit.a;
                                }
                            }
                            textView6.setText((CharSequence) fsfVar.a);
                            textView6.setVisibility(0);
                        }
                        i5 = 8;
                        TextView textView162 = scVar.h;
                        layoutParams = textView162.getLayoutParams();
                        if (layoutParams != null) {
                        }
                    }
                }
                imageView2.setVisibility(8);
                Unit unit16 = Unit.a;
                constraintLayout = (ConstraintLayout) scVar.m;
                if (Intrinsics.c(slug, obj)) {
                }
                constraintLayout.setOnClickListener(null);
                constraintLayout.setEnabled(false);
                if (comment.getPlayer() == null) {
                }
                imageView.setVisibility(i4);
                Unit unit22 = Unit.a;
                if (Intrinsics.c(slug, Sports.AMERICAN_FOOTBALL)) {
                }
                ImageView imageView62 = scVar.c;
                Set set32 = m43.a;
                Context context62 = imageView62.getContext();
                context62.getClass();
                String type22 = comment.getType();
                comment.getPeriodName();
                b = m43.b(context62, type22, comment.getGoalType());
                if (b == null) {
                }
                Unit unit72 = Unit.a;
                if (Intrinsics.c(slug, obj)) {
                }
                if (Intrinsics.c(slug, obj)) {
                }
                Set set42 = m43.a;
                Context context72 = textView6.getContext();
                context72.getClass();
                c = m43.c(context72, comment, event);
                if (c != null) {
                }
            } else {
                textView9.setVisibility(0);
                Integer time = comment.getTime();
                Integer reversedPeriodTime = comment.getReversedPeriodTime();
                Integer reversedPeriodTimeSeconds = comment.getReversedPeriodTimeSeconds();
                Context context10 = this.b;
                textView2 = textView10;
                textView = textView8;
                linearLayout = linearLayout2;
                viewStub = viewStub2;
                imageView = imageView3;
                context = context3;
                textView4 = textView7;
                obj = Sports.BASEBALL;
                slug = slug;
                p = mx9.p(context10, slug, time, null, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : reversedPeriodTime, (r16 & 64) != 0 ? null : reversedPeriodTimeSeconds, null);
                textView9.setText(p);
                player = comment.getPlayer();
                if (player != null) {
                }
                ImageView imageView42 = scVar.e;
                if (num != null) {
                }
                playerOut = comment.getPlayerOut();
                if (playerOut != null) {
                }
                imageView2.setVisibility(8);
                Unit unit162 = Unit.a;
                constraintLayout = (ConstraintLayout) scVar.m;
                if (Intrinsics.c(slug, obj)) {
                }
                constraintLayout.setOnClickListener(null);
                constraintLayout.setEnabled(false);
                if (comment.getPlayer() == null) {
                }
                imageView.setVisibility(i4);
                Unit unit222 = Unit.a;
                if (Intrinsics.c(slug, Sports.AMERICAN_FOOTBALL)) {
                }
                ImageView imageView622 = scVar.c;
                Set set322 = m43.a;
                Context context622 = imageView622.getContext();
                context622.getClass();
                String type222 = comment.getType();
                comment.getPeriodName();
                b = m43.b(context622, type222, comment.getGoalType());
                if (b == null) {
                }
                Unit unit722 = Unit.a;
                if (Intrinsics.c(slug, obj)) {
                }
                if (Intrinsics.c(slug, obj)) {
                }
                Set set422 = m43.a;
                Context context722 = textView6.getContext();
                context722.getClass();
                c = m43.c(context722, comment, event);
                if (c != null) {
                }
            }
        }
        i3 = 8;
        textView3.setVisibility(i3);
        player = comment.getPlayer();
        if (player != null) {
        }
        ImageView imageView422 = scVar.e;
        if (num != null) {
        }
        playerOut = comment.getPlayerOut();
        if (playerOut != null) {
        }
        imageView2.setVisibility(8);
        Unit unit1622 = Unit.a;
        constraintLayout = (ConstraintLayout) scVar.m;
        if (Intrinsics.c(slug, obj)) {
        }
        constraintLayout.setOnClickListener(null);
        constraintLayout.setEnabled(false);
        if (comment.getPlayer() == null) {
        }
        imageView.setVisibility(i4);
        Unit unit2222 = Unit.a;
        if (Intrinsics.c(slug, Sports.AMERICAN_FOOTBALL)) {
        }
        ImageView imageView6222 = scVar.c;
        Set set3222 = m43.a;
        Context context6222 = imageView6222.getContext();
        context6222.getClass();
        String type2222 = comment.getType();
        comment.getPeriodName();
        b = m43.b(context6222, type2222, comment.getGoalType());
        if (b == null) {
        }
        Unit unit7222 = Unit.a;
        if (Intrinsics.c(slug, obj)) {
        }
        if (Intrinsics.c(slug, obj)) {
        }
        Set set4222 = m43.a;
        Context context7222 = textView6.getContext();
        context7222.getClass();
        c = m43.c(context7222, comment, event);
        if (c != null) {
        }
    }
}
