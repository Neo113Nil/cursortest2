package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.MmaRoundInfoView;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class a6 extends o8 {
    public MmaEvent d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.e = 42;
        this.f = 28;
        this.g = context.getColor(R.color.on_color_primary);
        this.h = context.getColor(R.color.on_color_secondary);
    }

    @Nullable
    public abstract BellButton getBellButton();

    @Nullable
    public abstract View getBottomDivider();

    @Nullable
    public abstract TextView getDateText();

    public int getDefaultVsBottomMargin() {
        return this.e;
    }

    @NotNull
    public final MmaEvent getEvent() {
        MmaEvent mmaEvent = this.d;
        if (mmaEvent != null) {
            return mmaEvent;
        }
        Intrinsics.i("event");
        throw null;
    }

    @Nullable
    public abstract TextView getFightEndInfoText();

    @Nullable
    public abstract TextView getFightTypeText();

    @NotNull
    public abstract ImageView getFirstFighterFlag();

    @NotNull
    public abstract ImageView getFirstFighterImage();

    @NotNull
    public abstract TextView getFirstFighterName();

    @NotNull
    public abstract lsc getFirstFighterWinMarker();

    @Nullable
    public abstract TextView getLiveIndicator();

    @NotNull
    public abstract jlc getMiddleText();

    public int getPrimaryTextColor() {
        return this.g;
    }

    @NotNull
    public abstract MmaRoundInfoView getRoundInfoView();

    @NotNull
    public abstract ImageView getSecondFighterFlag();

    @NotNull
    public abstract ImageView getSecondFighterImage();

    @NotNull
    public abstract TextView getSecondFighterName();

    @NotNull
    public abstract lsc getSecondFighterWinMarker();

    public int getSecondaryTextColor() {
        return this.h;
    }

    public int getUpcomingMatchVsBottomMargin() {
        return this.f;
    }

    @NotNull
    public abstract TextView getVsText();

    @Nullable
    public abstract TextView getWeightClassText();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02ca, code lost:
    
        if (r2.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_INTERRUPTED) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r2.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_POSTPONED) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02ef, code lost:
    
        p();
        r1 = getFightEndInfoText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02f6, code lost:
    
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02f8, code lost:
    
        r1.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02fb, code lost:
    
        r1 = getFightEndInfoText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02ff, code lost:
    
        if (r1 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0301, code lost:
    
        r1.setText(getContext().getString(com.sofascore.results.R.string.minus));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x030f, code lost:
    
        getMiddleText().a.setVisibility(0);
        getMiddleText().b.setVisibility(8);
        getMiddleText().c.setAllCaps(false);
        r1 = getMiddleText().c;
        r2 = getContext();
        r2.getClass();
        r1.setText(defpackage.afi.c(r2, r12.getStatusDescription(), defpackage.ok3.s(r12), true));
        getMiddleText().c.setTextColor(getContext().getColor(com.sofascore.results.R.color.on_color_primary));
        getMiddleText().a.setBackground(getContext().getDrawable(com.sofascore.results.R.drawable.rounded_surface_level_3));
        getMiddleText().a.setBackgroundTintList(android.content.res.ColorStateList.valueOf(getContext().getColor(com.sofascore.results.R.color.error)));
        getFirstFighterName().setTextColor(getSecondaryTextColor());
        getSecondFighterName().setTextColor(getSecondaryTextColor());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
    
        if (r2.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_WILL_CONTINUE) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02af, code lost:
    
        setInProgressState(true);
        getRoundInfoView().f(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008b, code lost:
    
        if (r2.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_CANCELED) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02ac, code lost:
    
        if (r2.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_IN_PROGRESS) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02c1, code lost:
    
        if (r2.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_SUSPENDED) == false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(MmaEvent mmaEvent) {
        Integer num;
        Context context;
        int i;
        Object obj;
        TextView dateText = getDateText();
        if (dateText != null) {
            Context context2 = getContext();
            context2.getClass();
            dateText.setText(rik.j(context2, mmaEvent.getStartTimestamp(), bi4.PATTERN_DMY, " "));
        }
        if (!getW() || !Intrinsics.c(mmaEvent.getTournament().isLive(), Boolean.TRUE)) {
            String type = mmaEvent.getStatus().getType();
            switch (type.hashCode()) {
                case -1947652542:
                    break;
                case -1661628965:
                    break;
                case -1411655086:
                    break;
                case -673660814:
                    if (type.equals(StatusKt.STATUS_FINISHED)) {
                        p();
                        Integer winnerCode$default = Event.getWinnerCode$default(mmaEvent, null, 1, null);
                        if (winnerCode$default == null) {
                            getMiddleText().a.setBackground(getContext().getDrawable(R.drawable.rounded_surface_level_2));
                            getMiddleText().a.setVisibility(0);
                            getMiddleText().b.setVisibility(8);
                            getMiddleText().c.setAllCaps(false);
                            getMiddleText().c.setText(getContext().getString(R.string.ended));
                            getFirstFighterName().setAlpha(0.85f);
                            getSecondFighterName().setAlpha(0.85f);
                            getFirstFighterName().setTextColor(getPrimaryTextColor());
                            getSecondFighterName().setTextColor(getPrimaryTextColor());
                            break;
                        } else {
                            int intValue = winnerCode$default.intValue();
                            if (intValue == 1) {
                                getFirstFighterWinMarker().c.setVisibility(0);
                                LinearLayout linearLayout = getFirstFighterWinMarker().c;
                                Context context3 = getContext();
                                context3.getClass();
                                num = hkg.c0(context3) ? 1 : null;
                                linearLayout.setLayoutDirection(num != null ? num.intValue() : 0);
                                getFirstFighterName().setTextColor(getPrimaryTextColor());
                                getSecondFighterName().setTextColor(getSecondaryTextColor());
                                getSecondFighterName().setAlpha(0.85f);
                                getSecondFighterImage().setAlpha(0.6f);
                                TextView textView = getFirstFighterWinMarker().d;
                                String winType = mmaEvent.getWinType();
                                textView.setText(winType != null ? winType : "W");
                                TextView textView2 = getFirstFighterWinMarker().b;
                                Context context4 = getContext();
                                context4.getClass();
                                textView2.setText(tnf.o(context4, mmaEvent));
                                break;
                            } else if (intValue == 2) {
                                getSecondFighterWinMarker().c.setVisibility(0);
                                LinearLayout linearLayout2 = getSecondFighterWinMarker().c;
                                Context context5 = getContext();
                                context5.getClass();
                                num = hkg.c0(context5) ? null : 1;
                                linearLayout2.setLayoutDirection(num != null ? num.intValue() : 0);
                                getFirstFighterName().setTextColor(getSecondaryTextColor());
                                getSecondFighterName().setTextColor(getPrimaryTextColor());
                                getFirstFighterName().setAlpha(0.85f);
                                getFirstFighterImage().setAlpha(0.6f);
                                TextView textView3 = getSecondFighterWinMarker().d;
                                String winType2 = mmaEvent.getWinType();
                                textView3.setText(winType2 != null ? winType2 : "W");
                                TextView textView4 = getSecondFighterWinMarker().b;
                                Context context6 = getContext();
                                context6.getClass();
                                textView4.setText(tnf.o(context6, mmaEvent));
                                break;
                            } else if (intValue == 3 || intValue == 4) {
                                getMiddleText().a.setBackground(getContext().getDrawable(R.drawable.rounded_surface_level_3));
                                getMiddleText().a.setVisibility(0);
                                getMiddleText().b.setVisibility(0);
                                getMiddleText().c.setAllCaps(true);
                                TextView textView5 = getMiddleText().c;
                                Integer winnerCode$default2 = Event.getWinnerCode$default(mmaEvent, null, 1, null);
                                if (winnerCode$default2 != null && winnerCode$default2.intValue() == 3) {
                                    context = getContext();
                                    i = R.string.draw;
                                } else {
                                    context = getContext();
                                    i = R.string.no_contest_short;
                                }
                                textView5.setText(context.getString(i));
                                TextView textView6 = getMiddleText().b;
                                Context context7 = getContext();
                                context7.getClass();
                                textView6.setText(tnf.o(context7, mmaEvent));
                                getFirstFighterName().setTextColor(getSecondaryTextColor());
                                getSecondFighterName().setTextColor(getSecondaryTextColor());
                                getFirstFighterImage().setAlpha(0.6f);
                                getSecondFighterImage().setAlpha(0.6f);
                                getFirstFighterName().setAlpha(0.85f);
                                getSecondFighterName().setAlpha(0.85f);
                                break;
                            }
                        }
                    }
                    o();
                    ViewGroup.LayoutParams layoutParams = getVsText().getLayoutParams();
                    layoutParams.getClass();
                    int upcomingMatchVsBottomMargin = getUpcomingMatchVsBottomMargin();
                    Context context8 = getContext();
                    context8.getClass();
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ao2.s(upcomingMatchVsBottomMargin, context8);
                    break;
                case -123173735:
                    break;
                case 527231609:
                    break;
                case 2018521742:
                    break;
                default:
                    o();
                    ViewGroup.LayoutParams layoutParams2 = getVsText().getLayoutParams();
                    layoutParams2.getClass();
                    int upcomingMatchVsBottomMargin2 = getUpcomingMatchVsBottomMargin();
                    Context context82 = getContext();
                    context82.getClass();
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = ao2.s(upcomingMatchVsBottomMargin2, context82);
                    break;
            }
        } else {
            setInProgressState(ph0.a0(new String[]{StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_WILL_CONTINUE}).contains(mmaEvent.getStatus().getType()));
            getRoundInfoView().f(mmaEvent);
        }
        String fightType = mmaEvent.getFightType();
        if (fightType != null) {
            g08.c.getClass();
            Iterator<E> it = g08.h.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((g08) obj).a.equals(fightType)) {
                    }
                } else {
                    obj = null;
                }
            }
            g08 g08Var = (g08) obj;
            Integer valueOf = g08Var != null ? Integer.valueOf(g08Var.b) : null;
            if (valueOf != null) {
                int intValue2 = valueOf.intValue();
                TextView fightTypeText = getFightTypeText();
                if (fightTypeText != null) {
                    fightTypeText.setText(getContext().getString(intValue2));
                }
                TextView fightTypeText2 = getFightTypeText();
                if (fightTypeText2 != null) {
                    fightTypeText2.setVisibility(0);
                    return;
                }
                return;
            }
        }
        TextView fightTypeText3 = getFightTypeText();
        if (fightTypeText3 != null) {
            fightTypeText3.setVisibility(8);
        }
    }

    public void l(MmaEvent mmaEvent) {
        setEvent(mmaEvent);
        BellButton bellButton = getBellButton();
        if (bellButton != null) {
            bellButton.e(mmaEvent, wu.MAIN_FAVORITES);
        }
        BellButton bellButton2 = getBellButton();
        if (bellButton2 != null) {
            bellButton2.setVisibility(0);
        }
        Team homeTeam$default = Event.getHomeTeam$default(mmaEvent, null, 1, null);
        Team awayTeam$default = Event.getAwayTeam$default(mmaEvent, null, 1, null);
        homeTeam$default.getClass();
        awayTeam$default.getClass();
        TextView firstFighterName = getFirstFighterName();
        Context context = getContext();
        context.getClass();
        firstFighterName.setText(tba.p(context, homeTeam$default));
        TextView secondFighterName = getSecondFighterName();
        Context context2 = getContext();
        context2.getClass();
        secondFighterName.setText(tba.p(context2, awayTeam$default));
        getFirstFighterName().setTextColor(getPrimaryTextColor());
        getSecondFighterName().setTextColor(getPrimaryTextColor());
        as9.d(getFirstFighterImage(), homeTeam$default.getId(), homeTeam$default.getGender(), false);
        as9.d(getSecondFighterImage(), awayTeam$default.getId(), homeTeam$default.getGender(), false);
        getFirstFighterFlag().setVisibility(0);
        getSecondFighterFlag().setVisibility(0);
        ImageView firstFighterFlag = getFirstFighterFlag();
        Country country = homeTeam$default.getCountry();
        as9.c(firstFighterFlag, country != null ? country.getAlpha2() : null, true, null, 4);
        ImageView secondFighterFlag = getSecondFighterFlag();
        Country country2 = awayTeam$default.getCountry();
        as9.c(secondFighterFlag, country2 != null ? country2.getAlpha2() : null, true, null, 4);
        j(mmaEvent);
    }

    /* renamed from: n */
    public abstract boolean getW();

    public final void o() {
        TextView liveIndicator = getLiveIndicator();
        if (liveIndicator != null) {
            liveIndicator.setVisibility(8);
        }
        getMiddleText().a.setVisibility(8);
        getRoundInfoView().setVisibility(8);
        getFirstFighterWinMarker().c.setVisibility(8);
        getSecondFighterWinMarker().c.setVisibility(8);
        TextView fightEndInfoText = getFightEndInfoText();
        if (fightEndInfoText != null) {
            fightEndInfoText.setVisibility(8);
        }
        getFirstFighterName().setAlpha(1.0f);
        getFirstFighterImage().setAlpha(1.0f);
        getSecondFighterName().setAlpha(1.0f);
        getSecondFighterImage().setAlpha(1.0f);
    }

    public final void p() {
        o();
        BellButton bellButton = getBellButton();
        if (bellButton != null) {
            bellButton.setVisibility(8);
        }
        TextView fightEndInfoText = getFightEndInfoText();
        if (fightEndInfoText != null) {
            fightEndInfoText.setVisibility(0);
            fightEndInfoText.setText(fightEndInfoText.getContext().getString(R.string.finished));
        }
        ViewGroup.LayoutParams layoutParams = getVsText().getLayoutParams();
        layoutParams.getClass();
        int defaultVsBottomMargin = getDefaultVsBottomMargin();
        Context context = getContext();
        context.getClass();
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ao2.s(defaultVsBottomMargin, context);
    }

    public final void setBottomDividerVisibility(boolean z) {
        View bottomDivider = getBottomDivider();
        if (bottomDivider != null) {
            bottomDivider.setVisibility(z ? 0 : 8);
        }
    }

    public final void setEvent(@NotNull MmaEvent mmaEvent) {
        mmaEvent.getClass();
        this.d = mmaEvent;
    }

    public void setInProgressState(boolean z) {
        o();
        TextView liveIndicator = getLiveIndicator();
        if (liveIndicator != null) {
            liveIndicator.setVisibility(0);
        }
        if (z) {
            TextView dateText = getDateText();
            if (dateText != null) {
                dateText.setVisibility(8);
            }
            TextView liveIndicator2 = getLiveIndicator();
            if (liveIndicator2 != null) {
                liveIndicator2.setVisibility(0);
            }
            getRoundInfoView().setVisibility(0);
        } else {
            TextView dateText2 = getDateText();
            if (dateText2 != null) {
                dateText2.setText(getContext().getString(R.string.next_fight_mma));
            }
            TextView dateText3 = getDateText();
            if (dateText3 != null) {
                dateText3.setVisibility(0);
            }
            TextView liveIndicator3 = getLiveIndicator();
            if (liveIndicator3 != null) {
                liveIndicator3.setVisibility(8);
            }
            getRoundInfoView().setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = getVsText().getLayoutParams();
        layoutParams.getClass();
        int defaultVsBottomMargin = getDefaultVsBottomMargin();
        Context context = getContext();
        context.getClass();
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ao2.s(defaultVsBottomMargin, context);
    }
}
