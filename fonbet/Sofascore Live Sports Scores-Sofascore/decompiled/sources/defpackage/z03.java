package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.AmericanFootballDownDistance;
import com.sofascore.model.mvvm.model.AmericanFootballEvent;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.DartsEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.ServableEvent;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.results.R;
import com.sofascore.results.view.header.widget.RollingTextView;
import com.sofascore.results.view.header.widget.TimerGoalAnimatedView;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z03 extends e21 {
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0343, code lost:
    
        if (r6 == null) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(Event event) {
        int i;
        int i2;
        Integer num;
        TeamSides teamSides;
        int i3;
        Integer num2;
        Integer currentDown;
        String string;
        String sb;
        Integer num3;
        Integer played;
        Integer periodLength;
        String str;
        Integer num4;
        Integer played2;
        Integer periodLength2;
        Integer played3;
        String str2;
        TextView textView;
        boolean z;
        Integer currentBattingTeamId;
        String str3;
        if (event instanceof CricketEvent) {
            CricketEvent cricketEvent = (CricketEvent) event;
            if (m(cricketEvent)) {
                return;
            }
            List<String> cricketBasicInningsScore = Event.getHomeScore$default(cricketEvent, null, 1, null).getCricketBasicInningsScore();
            List<String> cricketBasicInningsScore2 = Event.getAwayScore$default(cricketEvent, null, 1, null).getCricketBasicInningsScore();
            boolean z2 = (cricketBasicInningsScore.isEmpty() && cricketBasicInningsScore2.isEmpty()) ? false : true;
            boolean z3 = cricketBasicInningsScore.size() > 1 || cricketBasicInningsScore2.size() > 1;
            krk j = j(w03.b, R.layout.view_event_result_cricket, r21.b);
            j.getClass();
            msk mskVar = (msk) j;
            TextView textView2 = mskVar.i;
            TextView textView3 = mskVar.h;
            TextView textView4 = mskVar.f;
            TextView textView5 = mskVar.e;
            TextView textView6 = mskVar.c;
            boolean z4 = z2;
            TextView textView7 = mskVar.d;
            if (z4) {
                if (cricketBasicInningsScore.size() > 0) {
                    z = z3;
                    str3 = cricketBasicInningsScore.get(0);
                } else {
                    z = z3;
                    str3 = "-";
                }
                textView6.setText(str3);
                textView5.setText(cricketBasicInningsScore2.size() > 0 ? cricketBasicInningsScore2.get(0) : "-");
                str2 = "-";
                textView = textView5;
                textView3.setText(getContext().getString(R.string.overs_score_short, Event.getHomeScore$default(cricketEvent, null, 1, null).getTotalOversDisplay()));
                textView2.setText(getContext().getString(R.string.overs_score_short, Event.getAwayScore$default(cricketEvent, null, 1, null).getTotalOversDisplay()));
            } else {
                str2 = "-";
                textView = textView5;
                z = z3;
            }
            if (z) {
                textView7.setText(1 < cricketBasicInningsScore.size() ? cricketBasicInningsScore.get(1) : str2);
                textView7.setVisibility(0);
                textView4.setText(1 < cricketBasicInningsScore2.size() ? cricketBasicInningsScore2.get(1) : str2);
                textView4.setVisibility(0);
            }
            String type = cricketEvent.getStatus().getType();
            if (Intrinsics.c(type, StatusKt.STATUS_IN_PROGRESS)) {
                haa.E(textView7);
                haa.E(textView4);
                haa.E(textView6);
                haa.E(textView);
                if (z) {
                    Integer currentBattingTeamId2 = cricketEvent.getCurrentBattingTeamId();
                    if (currentBattingTeamId2 != null) {
                        if (currentBattingTeamId2.intValue() == Event.getHomeTeam$default(cricketEvent, null, 1, null).getId()) {
                            haa.B(textView7);
                        } else {
                            haa.B(textView4);
                        }
                    }
                } else if (z4 && (currentBattingTeamId = cricketEvent.getCurrentBattingTeamId()) != null) {
                    if (currentBattingTeamId.intValue() == Event.getHomeTeam$default(cricketEvent, null, 1, null).getId()) {
                        haa.B(textView6);
                    } else {
                        haa.B(textView);
                    }
                }
            } else if (Intrinsics.c(type, StatusKt.STATUS_FINISHED) || Intrinsics.c(type, StatusKt.STATUS_WILL_CONTINUE)) {
                Integer winnerCode$default = Event.getWinnerCode$default(cricketEvent, null, 1, null);
                if (winnerCode$default != null && winnerCode$default.intValue() == 1) {
                    haa.E(textView6);
                    haa.E(textView7);
                    haa.F(textView);
                    haa.F(textView4);
                } else if (winnerCode$default != null && winnerCode$default.intValue() == 2) {
                    haa.F(textView6);
                    haa.F(textView7);
                    haa.E(textView);
                    haa.E(textView4);
                } else if (Intrinsics.c(cricketEvent.getStatus().getType(), StatusKt.STATUS_FINISHED)) {
                    haa.F(textView6);
                    haa.F(textView7);
                    haa.F(textView);
                    haa.F(textView4);
                    mskVar.b.setBackgroundColor(getContext().getColor(R.color.on_color_secondary));
                }
            } else if (getStoppedStatuses().contains(type)) {
                e(cricketEvent);
            } else {
                f(cricketEvent.getStartTimestamp());
            }
            ConstraintLayout constraintLayout = mskVar.a;
            if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
                constraintLayout.addOnLayoutChangeListener(new v03(this, 0, mskVar));
                return;
            }
            float measuredWidth = getBinding().l.getMeasuredWidth() / (mskVar.j.getMeasuredWidth() + mskVar.g.getMeasuredWidth());
            if (measuredWidth < 1.0f) {
                float textSize = textView6.getTextSize() * measuredWidth;
                float textSize2 = textView3.getTextSize() * measuredWidth;
                textView6.setTextSize(0, textSize);
                textView7.setTextSize(0, textSize);
                textView3.setTextSize(0, textSize2);
                textView.setTextSize(0, textSize);
                textView4.setTextSize(0, textSize);
                textView2.setTextSize(0, textSize2);
                return;
            }
            return;
        }
        if (!(event instanceof MmaEvent)) {
            if (event instanceof AmericanFootballEvent) {
                AmericanFootballEvent americanFootballEvent = (AmericanFootballEvent) event;
                lsk l = l(americanFootballEvent);
                if (l != null) {
                    TimerGoalAnimatedView timerGoalAnimatedView = l.l;
                    ImageView imageView = l.d;
                    ImageView imageView2 = l.c;
                    AmericanFootballDownDistance yardDistance = americanFootballEvent.getYardDistance();
                    int intValue = (yardDistance == null || (currentDown = yardDistance.getCurrentDown()) == null) ? 0 : currentDown.intValue();
                    AmericanFootballDownDistance yardDistance2 = americanFootballEvent.getYardDistance();
                    if (yardDistance2 != null) {
                        i2 = 2;
                        num = AmericanFootballDownDistance.getCurrentPossession$default(yardDistance2, americanFootballEvent.shouldReverseTeams(), null, 2, null);
                    } else {
                        i2 = 2;
                        num = null;
                    }
                    if (intValue <= 0 || num == null) {
                        imageView2.setVisibility(8);
                        imageView.setVisibility(8);
                    } else {
                        int intValue2 = num.intValue();
                        if (intValue2 == 1) {
                            imageView.setVisibility(4);
                            imageView2.setImageResource(R.drawable.ic_touchdown_16);
                            imageView2.setImageTintList(ColorStateList.valueOf(imageView2.getContext().getColor(R.color.live)));
                            imageView2.setVisibility(0);
                        } else if (intValue2 == i2) {
                            imageView2.setVisibility(4);
                            imageView.setImageResource(R.drawable.ic_touchdown_16);
                            imageView.setImageTintList(ColorStateList.valueOf(imageView.getContext().getColor(R.color.live)));
                            imageView.setVisibility(0);
                        }
                    }
                    Context context = getContext();
                    context.getClass();
                    AmericanFootballDownDistance yardDistance3 = americanFootballEvent.getYardDistance();
                    AmericanFootballDownDistance yardDistance4 = americanFootballEvent.getYardDistance();
                    if (yardDistance4 != null) {
                        teamSides = null;
                        i3 = 2;
                        num2 = AmericanFootballDownDistance.getCurrentPossession$default(yardDistance4, americanFootballEvent.shouldReverseTeams(), null, 2, null);
                    } else {
                        teamSides = null;
                        i3 = 2;
                        num2 = null;
                    }
                    AmericanFootballDownDistance yardDistance5 = americanFootballEvent.getYardDistance();
                    String y = o1j.y(context, yardDistance3, num2, yardDistance5 != null ? AmericanFootballDownDistance.getCurrentTeamHalf$default(yardDistance5, americanFootballEvent.shouldReverseTeams(), teamSides, i3, teamSides) : teamSides, Event.getHomeTeam$default(americanFootballEvent, teamSides, 1, teamSides).getNameCode(), Event.getAwayTeam$default(americanFootballEvent, teamSides, 1, teamSides).getNameCode());
                    if (y != null) {
                        if (!Intrinsics.c(americanFootballEvent.getStatus().getType(), StatusKt.STATUS_IN_PROGRESS)) {
                            y = null;
                        }
                        if (y != null) {
                            Context context2 = getContext();
                            context2.getClass();
                            timerGoalAnimatedView.setTextSize(ao2.u(12, context2));
                            timerGoalAnimatedView.d(y, false, true);
                            setTimerTextView(null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(event instanceof DartsEvent)) {
                l(event);
                return;
            }
            DartsEvent dartsEvent = (DartsEvent) event;
            if (m(dartsEvent)) {
                return;
            }
            if (!ok3.D(dartsEvent)) {
                l(dartsEvent);
                return;
            }
            lsk lskVar = (lsk) j(x03.b, R.layout.view_event_result, r21.e);
            int color = getContext().getColor(R.color.live);
            RollingTextView rollingTextView = lskVar.h;
            TimerGoalAnimatedView timerGoalAnimatedView2 = lskVar.l;
            RollingTextView rollingTextView2 = lskVar.i;
            ImageView imageView3 = lskVar.d;
            ImageView imageView4 = lskVar.c;
            rollingTextView.setTextColor(color);
            rollingTextView2.setTextColor(color);
            lskVar.j.setTextColor(color);
            timerGoalAnimatedView2.setTextColor(color);
            imageView4.setImageTintList(ColorStateList.valueOf(color));
            imageView3.setImageTintList(ColorStateList.valueOf(color));
            imageView4.setImageResource(R.drawable.ic_dart_16);
            imageView3.setImageResource(R.drawable.ic_dart_16);
            Score homeScore$default = Event.getHomeScore$default(dartsEvent, null, 1, null);
            Score awayScore$default = Event.getAwayScore$default(dartsEvent, null, 1, null);
            boolean z5 = (homeScore$default.getPoint() == null || awayScore$default.getPoint() == null) ? false : true;
            boolean B = ok3.B(dartsEvent);
            timerGoalAnimatedView2.setVisibility(0);
            if (z5 && B) {
                rollingTextView.d(homeScore$default.getPoint(), false, true);
                rollingTextView2.d(awayScore$default.getPoint(), false, true);
                Context context3 = getContext();
                context3.getClass();
                String k = e21.k(context3, String.valueOf(yid.m(homeScore$default.getDisplay())), String.valueOf(yid.m(awayScore$default.getDisplay())), false);
                Context context4 = getContext();
                context4.getClass();
                i = 1;
                timerGoalAnimatedView2.d(fc6.n(k, " (", e21.k(context4, y6a.C(homeScore$default, true), y6a.C(awayScore$default, true), false), ")"), false, true);
            } else {
                i = 1;
                if (z5) {
                    rollingTextView.d(homeScore$default.getPoint(), false, true);
                    rollingTextView2.d(awayScore$default.getPoint(), false, true);
                    timerGoalAnimatedView2.d(fc6.g(yid.m(homeScore$default.getDisplay()), yid.m(awayScore$default.getDisplay()), "-"), false, true);
                } else if (B) {
                    rollingTextView.d(y6a.C(homeScore$default, true), false, true);
                    rollingTextView2.d(y6a.C(awayScore$default, true), false, true);
                    timerGoalAnimatedView2.d(fc6.g(yid.m(homeScore$default.getDisplay()), yid.m(awayScore$default.getDisplay()), "-"), false, true);
                } else {
                    rollingTextView.d(String.valueOf(yid.m(homeScore$default.getDisplay())), false, true);
                    rollingTextView2.d(String.valueOf(yid.m(awayScore$default.getDisplay())), false, true);
                    setTimerTextView(timerGoalAnimatedView2);
                }
            }
            Integer firstToServe$default = ServableEvent.getFirstToServe$default(dartsEvent, null, i, null);
            imageView4.setVisibility((firstToServe$default != null && firstToServe$default.intValue() == i) ? 0 : 4);
            imageView3.setVisibility((firstToServe$default != null && firstToServe$default.intValue() == 2) ? 0 : 4);
            return;
        }
        MmaEvent mmaEvent = (MmaEvent) event;
        if (m(mmaEvent)) {
            return;
        }
        krk j2 = j(y03.b, R.layout.view_event_result_mma, r21.c);
        j2.getClass();
        osk oskVar = (osk) j2;
        Group group = oskVar.c;
        TextView textView8 = oskVar.e;
        TextView textView9 = oskVar.d;
        TextView textView10 = oskVar.b;
        TextView textView11 = oskVar.f;
        TextView textView12 = oskVar.g;
        group.setVisibility(8);
        textView11.setVisibility(8);
        textView12.setVisibility(8);
        String type2 = mmaEvent.getStatus().getType();
        int hashCode = type2.hashCode();
        int i4 = 300;
        if (hashCode != -1411655086) {
            if (hashCode == -673660814) {
                if (type2.equals(StatusKt.STATUS_FINISHED)) {
                    haa.E(textView11);
                    Integer winnerCode$default2 = Event.getWinnerCode$default(mmaEvent, null, 1, null);
                    if (winnerCode$default2 != null) {
                        int intValue3 = winnerCode$default2.intValue();
                        String winType = mmaEvent.getWinType();
                        if (winType == null) {
                            winType = getContext().getString(R.string.value_unknown);
                            winType.getClass();
                        }
                        Locale d = dla.d();
                        String string2 = getContext().getString(R.string.mma_status_round);
                        string2.getClass();
                        Integer finalRound = mmaEvent.getFinalRound();
                        String format = String.format(d, string2, Arrays.copyOf(new Object[]{Integer.valueOf(finalRound != null ? finalRound.intValue() : 1)}, 1));
                        Time time = mmaEvent.getTime();
                        if (time != null && (played3 = time.getPlayed()) != null) {
                            if (played3.intValue() <= 0) {
                                played3 = null;
                            }
                            if (played3 != null) {
                                int intValue4 = played3.intValue();
                                int i5 = intValue4 / 60;
                                str = getContext().getString(R.string.braces_template, String.format(dla.d(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(intValue4 - (i5 * 60))}, 2)));
                            }
                        }
                        str = "";
                        textView12.setVisibility(0);
                        me4.s(new Object[]{winType, format, str}, 3, dla.d(), "%s | %s %s", textView12);
                        if (intValue3 == 1) {
                            group.setVisibility(0);
                            haa.E(textView10);
                            haa.F(textView9);
                            haa.F(textView8);
                            textView10.setText("W");
                            textView9.setText("L");
                            return;
                        }
                        if (intValue3 == 2) {
                            group.setVisibility(0);
                            haa.F(textView10);
                            haa.E(textView9);
                            haa.F(textView8);
                            textView10.setText("L");
                            textView9.setText("W");
                            return;
                        }
                        if (intValue3 != 3) {
                            if (intValue3 != 4) {
                                return;
                            }
                            textView11.setVisibility(0);
                            textView11.setText(getContext().getString(R.string.no_contest_mma));
                            textView12.setVisibility(0);
                            textView12.setText(format);
                            return;
                        }
                        group.setVisibility(8);
                        textView11.setVisibility(0);
                        textView11.setText(getContext().getString(R.string.draw));
                        haa.F(textView11);
                        textView12.setVisibility(0);
                        Time time2 = mmaEvent.getTime();
                        if (time2 != null && (periodLength2 = time2.getPeriodLength()) != null) {
                            i4 = periodLength2.intValue();
                        }
                        if (time2 == null || (played2 = time2.getPlayed()) == null) {
                            num4 = null;
                        } else {
                            int intValue5 = ((i4 - played2.intValue()) / 60) + 1;
                            int i6 = i4 / 60;
                            if (intValue5 > i6) {
                                intValue5 = i6;
                            }
                            num4 = Integer.valueOf(intValue5);
                        }
                        if (num4 == null) {
                            textView12.setText(format);
                            return;
                        }
                        String string3 = getContext().getString(R.string.mma_minutes_left_format, Integer.valueOf(num4.intValue()));
                        string3.getClass();
                        textView12.setText(getContext().getString(R.string.text_braces_template, format, string3));
                        return;
                    }
                    return;
                }
                return;
            }
            if (hashCode != 527231609 || !type2.equals(StatusKt.STATUS_WILL_CONTINUE)) {
                return;
            }
        } else if (!type2.equals(StatusKt.STATUS_IN_PROGRESS)) {
            return;
        }
        if (Intrinsics.c(mmaEvent.getStatus().getDescription(Sports.MMA), StatusKt.STATUS_DESCRIPTION_STARTED)) {
            string = getContext().getString(R.string.menu_live);
        } else {
            Context context5 = getContext();
            Integer finalRound2 = mmaEvent.getFinalRound();
            string = context5.getString(R.string.mma_status_round, Integer.valueOf(finalRound2 != null ? finalRound2.intValue() : 1));
        }
        string.getClass();
        haa.E(textView12);
        String description = mmaEvent.getStatus().getDescription(Sports.MMA);
        if (Intrinsics.c(description, StatusKt.STATUS_DESCRIPTION_STARTED)) {
            sb = getContext().getString(R.string.fight_starts_soon_mma);
        } else if (Intrinsics.c(description, StatusKt.STATUS_AWAITING_ANNOUNCEMENT)) {
            sb = getContext().getString(R.string.mma_awaiting_decision_status);
        } else {
            StringBuilder sb2 = new StringBuilder();
            String type3 = mmaEvent.getStatus().getType();
            if (Intrinsics.c(type3, StatusKt.STATUS_IN_PROGRESS)) {
                haa.B(textView12);
                String fightState = mmaEvent.getFightState();
                f08[] f08VarArr = f08.c;
                if (Intrinsics.c(fightState, "Pause")) {
                    sb2.append(getContext().getString(R.string.stoppage));
                } else {
                    sb2.append(getContext().getString(R.string.in_progress));
                }
                Time time3 = mmaEvent.getTime();
                if (time3 != null && (periodLength = time3.getPeriodLength()) != null) {
                    i4 = periodLength.intValue();
                }
                if (time3 == null || (played = time3.getPlayed()) == null) {
                    num3 = null;
                } else {
                    int intValue6 = ((i4 - played.intValue()) / 60) + 1;
                    int i7 = i4 / 60;
                    if (intValue6 > i7) {
                        intValue6 = i7;
                    }
                    num3 = Integer.valueOf(intValue6);
                }
                if (num3 != null) {
                    int intValue7 = num3.intValue();
                    sb2.append(" | ");
                    sb2.append(getContext().getString(R.string.mma_minutes_left_format, Integer.valueOf(intValue7)));
                }
            } else if (Intrinsics.c(type3, StatusKt.STATUS_WILL_CONTINUE)) {
                sb2.append(getContext().getString(R.string.finished));
            }
            sb = sb2.toString();
        }
        sb.getClass();
        textView11.setVisibility(0);
        textView11.setText(string);
        haa.B(textView11);
        textView12.setVisibility(0);
        textView12.setText(sb);
    }
}
