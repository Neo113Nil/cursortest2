package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.icu.text.DateTimePatternGenerator;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Section;
import com.sofascore.model.Sports;
import com.sofascore.model.firebase.RemoteConfigParameter;
import com.sofascore.model.firebase.RemoteConfigParameterLine;
import com.sofascore.model.mvvm.model.ESportsEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.EsportsGame;
import com.sofascore.model.newNetwork.RiskyTopic;
import com.sofascore.model.newNetwork.TeamUniqueTournament;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.BellButton;
import com.vungle.ads.internal.protos.Sdk;
import java.time.Instant;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.b;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ja9 extends p8 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(ob9 ob9Var, sr8 sr8Var) {
        super(r0);
        this.c = 1;
        FrameLayout frameLayout = ob9Var.b;
        frameLayout.getClass();
        this.d = ob9Var;
        ob9Var.c.setOnClickListener(new cd5(sr8Var, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0735  */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        String str;
        String string;
        h04 h04Var;
        Typeface typeface;
        String c;
        Typeface typeface2;
        String i3;
        int i4 = this.c;
        Context context = this.b;
        Object obj2 = this.d;
        switch (i4) {
            case 0:
                d6c d6cVar = (d6c) obj;
                d6cVar.getClass();
                TextView textView = ((u22) obj2).b;
                textView.setText(d6cVar.a);
                sea.v(textView, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return;
            case 1:
                rb9 rb9Var = (rb9) obj;
                rb9Var.getClass();
                ((ob9) obj2).d.setText(context.getString(R.string.football_all_time_stats_info, rb9Var.b));
                return;
            case 2:
                sb9 sb9Var = (sb9) obj;
                sb9Var.getClass();
                ((o16) obj2).c.setText(context.getString(R.string.view_more_historical, sb9Var.c.getYear()));
                return;
            case 3:
                ProfileData profileData = (ProfileData) obj;
                profileData.getClass();
                gh5 gh5Var = (gh5) obj2;
                TextView textView2 = gh5Var.d;
                textView2.setGravity(hkg.c0(context) ? 8388613 : 8388611);
                as9.s(gh5Var.c, profileData.getId());
                String editorName = profileData.getEditorName();
                if (editorName == null) {
                    editorName = profileData.getNickname();
                }
                textView2.setText(editorName);
                return;
            case 4:
                s56 s56Var = (s56) obj;
                s56Var.getClass();
                o16 o16Var = (o16) obj2;
                o16Var.c.setText(s56Var.a);
                FrameLayout frameLayout = o16Var.b;
                frameLayout.getClass();
                sea.v(frameLayout, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return;
            case 5:
                zeb zebVar = (zeb) obj;
                zebVar.getClass();
                GraphicLarge graphicLarge = ((ddd) obj2).b;
                String string2 = context.getString(zebVar.a ? R.string.empty_no_live_events_match_filters : R.string.empty_no_live_events_body_text_no_upcoming);
                string2.getClass();
                graphicLarge.setSubtitleResource(string2);
                return;
            case 6:
                ((Number) obj).intValue();
                RelativeLayout relativeLayout = (RelativeLayout) ((hcb) obj2).b;
                relativeLayout.getClass();
                sea.v(relativeLayout, true, false, 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                return;
            case 7:
                Section section = (Section) obj;
                section.getClass();
                ((cr2) obj2).b.setText(section.getName());
                return;
            case 8:
                MmaEvent mmaEvent = (MmaEvent) obj;
                mmaEvent.getClass();
                olc olcVar = (olc) obj2;
                olcVar.l(mmaEvent);
                bv1 bv1Var = olcVar.i;
                ((ImageView) bv1Var.f).setVisibility(8);
                ez0 ez0Var = (ez0) bv1Var.h;
                ConstraintLayout constraintLayout = (ConstraintLayout) ez0Var.b;
                constraintLayout.getClass();
                constraintLayout.setVisibility(0);
                ImageView imageView = (ImageView) ez0Var.d;
                UniqueTournament uniqueTournament = olcVar.getEvent().getTournament().getUniqueTournament();
                as9.q(imageView, Integer.valueOf(uniqueTournament != null ? uniqueTournament.getId() : 0), olcVar.getEvent().getTournament().getId(), null);
                UniqueTournament uniqueTournament2 = olcVar.getEvent().getTournament().getUniqueTournament();
                if (uniqueTournament2 != null) {
                    ((BellButton) ez0Var.c).e(uniqueTournament2, wu.MAIN_FAVORITES);
                    constraintLayout.getClass();
                    aba.y(constraintLayout, 0, 3);
                    constraintLayout.setOnClickListener(new au7(22, olcVar, uniqueTournament2));
                }
                TextView textView3 = (TextView) ez0Var.e;
                UniqueTournament uniqueTournament3 = olcVar.getEvent().getTournament().getUniqueTournament();
                textView3.setText(uniqueTournament3 != null ? uniqueTournament3.getName() : null);
                return;
            case 9:
                MmaEvent mmaEvent2 = (MmaEvent) obj;
                mmaEvent2.getClass();
                ((a6) obj2).l(mmaEvent2);
                return;
            case 10:
                ((Number) obj).intValue();
                sea.v((View) obj2, false, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return;
            case 11:
                rq5 rq5Var = (rq5) obj;
                rq5Var.getClass();
                xz0 xz0Var = (xz0) obj2;
                View view = xz0Var.k;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) xz0Var.j;
                TextView textView4 = (TextView) xz0Var.g;
                TextView textView5 = xz0Var.e;
                TextView textView6 = xz0Var.d;
                TextView textView7 = (TextView) xz0Var.h;
                EsportsGame esportsGame = rq5Var.b;
                ESportsEvent eSportsEvent = rq5Var.c;
                Integer F = wnn.F(esportsGame, context);
                view.setBackgroundColor(F != null ? F.intValue() : 0);
                View view2 = xz0Var.m;
                Integer D = wnn.D(esportsGame, context);
                view2.setBackgroundColor(D != null ? D.intValue() : 0);
                Integer coverage = eSportsEvent.getCoverage();
                int intValue = coverage != null ? coverage.intValue() : -1;
                ImageView imageView2 = (ImageView) xz0Var.f;
                Integer num = intValue > 90 ? null : 8;
                imageView2.setVisibility(num != null ? num.intValue() : 0);
                as9.o(xz0Var.c, Event.getHomeTeam$default(eSportsEvent, null, 1, null).getId());
                as9.o((ImageView) xz0Var.l, Event.getAwayTeam$default(eSportsEvent, null, 1, null).getId());
                xz0Var.b.setText(context.getString(R.string.e_sport_game) + " " + rq5Var.a);
                if (EsportsGame.getHomeScore$default(esportsGame, null, 1, null).getDisplay() == null || EsportsGame.getAwayScore$default(esportsGame, null, 1, null).getDisplay() == null) {
                    textView6.setText("");
                    textView7.setText("");
                } else {
                    textView6.setText(String.valueOf(EsportsGame.getHomeScore$default(esportsGame, null, 1, null).getDisplay()));
                    textView7.setText(String.valueOf(EsportsGame.getAwayScore$default(esportsGame, null, 1, null).getDisplay()));
                }
                long startTimestamp = esportsGame.getStartTimestamp();
                TextView textView8 = (TextView) xz0Var.i;
                if (startTimestamp > 0) {
                    long startTimestamp2 = esportsGame.getStartTimestamp();
                    DateTimePatternGenerator b = hk4.b();
                    String bestPattern = DateFormat.is24HourFormat(context) ? b.getBestPattern("Hm") : b.getBestPattern("hm");
                    bestPattern.getClass();
                    fn0.u(startTimestamp2, hk4.a(bestPattern), textView8);
                } else {
                    textView8.setText("");
                }
                int color = context.getColor(R.color.live);
                int color2 = context.getColor(R.color.n_lv_1);
                int color3 = context.getColor(R.color.n_lv_3);
                textView5.setTextColor(color3);
                Integer length = esportsGame.getLength();
                if (length != null) {
                    if (esportsGame.isLive()) {
                        length = null;
                    }
                    if (length != null) {
                        str = ((int) (length.intValue() / 60.0d)) + " " + context.getString(R.string.minute_short);
                        textView5.setText(str);
                        if (esportsGame.isLive()) {
                            Integer winnerCode$default = EsportsGame.getWinnerCode$default(esportsGame, null, 1, null);
                            textView6.setTextColor((winnerCode$default != null && winnerCode$default.intValue() == 1) ? color2 : color3);
                            Integer winnerCode$default2 = EsportsGame.getWinnerCode$default(esportsGame, null, 1, null);
                            if (winnerCode$default2 == null || winnerCode$default2.intValue() != 2) {
                                color2 = color3;
                            }
                            textView7.setTextColor(color2);
                            textView4.setTextColor(color3);
                        } else {
                            textView6.setTextColor(color);
                            textView7.setTextColor(color);
                            textView4.setTextColor(color);
                        }
                        constraintLayout2.getClass();
                        sea.v(constraintLayout2, false, rq5Var.d, 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                        constraintLayout2.setPaddingRelative(constraintLayout2.getPaddingStart(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingEnd(), !rq5Var.d ? ao2.s(16, context) : 0);
                        return;
                    }
                }
                str = null;
                textView5.setText(str);
                if (esportsGame.isLive()) {
                }
                constraintLayout2.getClass();
                sea.v(constraintLayout2, false, rq5Var.d, 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                constraintLayout2.setPaddingRelative(constraintLayout2.getPaddingStart(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingEnd(), !rq5Var.d ? ao2.s(16, context) : 0);
                return;
            case 12:
                UniqueTournament uniqueTournament4 = (UniqueTournament) obj;
                uniqueTournament4.getClass();
                ez0 ez0Var2 = (ez0) obj2;
                ((BellButton) ez0Var2.c).e(uniqueTournament4, wu.MAIN_FAVORITES);
                as9.q((ImageView) ez0Var2.d, Integer.valueOf(uniqueTournament4.getId()), 0, null);
                ((TextView) ez0Var2.e).setText(uniqueTournament4.getName());
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ez0Var2.b;
                constraintLayout3.getClass();
                sea.v(constraintLayout3, true, true, 12, 0, 0, null, 120);
                return;
            case 13:
                String str2 = (String) obj;
                str2.getClass();
                ((TextView) obj2).setText(str2);
                return;
            case 14:
                t5e t5eVar = (t5e) obj;
                t5eVar.getClass();
                hs1 hs1Var = (hs1) obj2;
                hs1Var.e.setText(context.getString(t5eVar.a));
                TextView textView9 = hs1Var.d;
                Integer num2 = t5eVar.b;
                if (num2 == null || (string = context.getString(num2.intValue())) == null) {
                    string = context.getString(R.string.tutorial_step, Integer.valueOf(i + 1), Integer.valueOf(i2));
                    string.getClass();
                }
                textView9.setText(string);
                hs1Var.c.setText(context.getString(t5eVar.c));
                return;
            case 15:
                wle wleVar = (wle) obj;
                wleVar.getClass();
                LinearLayout linearLayout = (LinearLayout) ((ed) obj2).c;
                Iterator it = wleVar.a.b.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        b.q();
                        throw null;
                    }
                    pk2 pk2Var = (pk2) next;
                    if (i5 < linearLayout.getChildCount()) {
                        h04Var = h04.a(linearLayout.getChildAt(i5));
                    } else {
                        h04 d = h04.d(LayoutInflater.from(context), linearLayout);
                        linearLayout.addView(d.b, i5);
                        h04Var = d;
                    }
                    r9k r9kVar = pk2Var.a;
                    r9k r9kVar2 = pk2Var.b;
                    ConstraintLayout constraintLayout4 = h04Var.b;
                    constraintLayout4.getClass();
                    constraintLayout4.setVisibility(0);
                    h04Var.d.setText(r9kVar.b(context));
                    h04Var.c.setText(r9kVar2.b(context));
                    i5 = i6;
                }
                z8e.J(linearLayout, r0.size() - 1);
                return;
            case 16:
                nvj nvjVar = (nvj) obj;
                nvjVar.getClass();
                dd ddVar = (dd) obj2;
                ConstraintLayout constraintLayout5 = (ConstraintLayout) ddVar.b;
                constraintLayout5.getClass();
                sea.v(constraintLayout5, true, false, 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                kqb kqbVar = (kqb) ddVar.d;
                kqbVar.c.setVisibility(8);
                kqbVar.d.setText(nvjVar.a);
                TextView textView10 = (TextView) ddVar.c;
                textView10.setVisibility(nvjVar.b ? 0 : 8);
                textView10.setText(context.getString(R.string.vertical_bar_template, context.getString(R.string.match_appearances), context.getString(R.string.goals)));
                return;
            case 17:
                j2f j2fVar = (j2f) obj;
                j2fVar.getClass();
                h04 h04Var2 = (h04) obj2;
                TextView textView11 = h04Var2.d;
                textView11.setTextColor(j2fVar.d);
                textView11.setText(j2fVar.a);
                Context context2 = textView11.getContext();
                context2.getClass();
                try {
                    typeface = z1g.a(R.font.sofascore_sans_bold, context2);
                } catch (Exception unused) {
                    typeface = Typeface.DEFAULT;
                }
                textView11.setTypeface(typeface);
                h04Var2.c.setText(j2fVar.b);
                return;
            case 18:
                w5f w5fVar = (w5f) obj;
                w5fVar.getClass();
                av1 av1Var = (av1) obj2;
                ImageView imageView3 = av1Var.d;
                TextView textView12 = av1Var.e;
                as9.o(imageView3, w5fVar.b);
                as9.o(av1Var.c, w5fVar.c);
                TextView textView13 = av1Var.f;
                Integer num3 = w5fVar.d;
                textView13.setText(num3 != null ? String.valueOf(num3.intValue()) : null);
                Integer num4 = w5fVar.e;
                textView12.setText(num4 != null ? String.valueOf(num4.intValue()) : null);
                Integer num5 = w5fVar.f;
                if (num5 != null && num5.intValue() == 1) {
                    textView13.setTextColor(context.getColor(R.color.n_lv_1));
                    textView12.setTextColor(context.getColor(R.color.n_lv_3));
                    return;
                } else if (num5 != null && num5.intValue() == 2) {
                    textView13.setTextColor(context.getColor(R.color.n_lv_3));
                    textView12.setTextColor(context.getColor(R.color.n_lv_1));
                    return;
                } else {
                    textView13.setTextColor(context.getColor(R.color.n_lv_3));
                    textView12.setTextColor(context.getColor(R.color.n_lv_3));
                    return;
                }
            case 19:
                TeamUniqueTournament teamUniqueTournament = (TeamUniqueTournament) obj;
                teamUniqueTournament.getClass();
                e92 e92Var = (e92) obj2;
                ((TextView) e92Var.f).setText(teamUniqueTournament.getName());
                TextView textView14 = (TextView) e92Var.b;
                textView14.setVisibility(0);
                haa.G(textView14);
                if (teamUniqueTournament.getWinner()) {
                    c = context.getString(R.string.winner);
                } else {
                    Regex regex = d7g.a;
                    c = d7g.c(context, teamUniqueTournament.getRound(), Sports.TENNIS);
                }
                textView14.setText(c);
                ((ImageView) e92Var.c).setVisibility(0);
                return;
            case 20:
                wm5 wm5Var = (wm5) obj;
                wm5Var.getClass();
                ((o16) obj2).c.setText(wm5Var.a);
                return;
            case 21:
                if8 if8Var = (if8) obj;
                if8Var.getClass();
                mqb mqbVar = (mqb) obj2;
                mqbVar.c.setText(if8Var.a);
                ConstraintLayout constraintLayout6 = mqbVar.b;
                constraintLayout6.getClass();
                constraintLayout6.setPadding(constraintLayout6.getPaddingLeft(), ao2.s(4, context), constraintLayout6.getPaddingRight(), constraintLayout6.getPaddingBottom());
                constraintLayout6.setBackground(null);
                return;
            case 22:
                waf wafVar = (waf) obj;
                wafVar.getClass();
                oea.f((dx5) obj2, wafVar);
                return;
            case 23:
                ejf ejfVar = (ejf) obj;
                ejfVar.getClass();
                djf djfVar = (djf) obj2;
                SwitchCompat switchCompat = (SwitchCompat) djfVar.f;
                View view3 = (View) djfVar.c;
                switchCompat.setOnCheckedChangeListener(null);
                TextView textView15 = (TextView) djfVar.g;
                bjf bjfVar = ejfVar.a;
                boolean z = ejfVar.b;
                textView15.setText(bjfVar.b.b(context));
                ImageView imageView4 = (ImageView) djfVar.e;
                Object obj3 = bjfVar.a;
                cjf cjfVar = bjfVar.c;
                apf a = ajh.a(imageView4.getContext());
                ht9 ht9Var = new ht9(imageView4.getContext());
                ht9Var.c = obj3;
                fc6.w(ht9Var, imageView4, a);
                if (bjfVar.e) {
                    imageView4.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.n_lv_1)));
                } else {
                    imageView4.setImageTintList(null);
                }
                ((ImageView) djfVar.d).setVisibility(8);
                switchCompat.setVisibility((z && cjfVar == cjf.a) ? 0 : 8);
                switchCompat.setChecked(((Boolean) n9e.x(context, new mme(bjfVar, 13))).booleanValue());
                cjf cjfVar2 = cjf.a;
                switchCompat.setEnabled(cjfVar == cjfVar2);
                switchCompat.setOnCheckedChangeListener(new fjf(0, ejfVar, this));
                if (!z) {
                    view3.setOnClickListener(null);
                    return;
                } else if (cjfVar == cjfVar2) {
                    view3.setOnClickListener(new cne(this, 12));
                    return;
                } else {
                    view3.setOnClickListener(null);
                    return;
                }
            case 24:
                ylf ylfVar = (ylf) obj;
                ylfVar.getClass();
                fmf fmfVar = (fmf) obj2;
                fmfVar.b.setText(ylfVar.a);
                fmfVar.c.setText(ylfVar.b);
                return;
            case 25:
                zlf zlfVar = (zlf) obj;
                zlfVar.getClass();
                TextView textView16 = ((u22) obj2).b;
                String string3 = context.getString(R.string.last_updated);
                long j = zlfVar.a;
                textView16.setText(string3 + ": " + rik.j(context, j, bi4.PATTERN_DMM, ", "));
                textView16.setVisibility(j > 0 ? 0 : 8);
                return;
            case 26:
                RemoteConfigParameter remoteConfigParameter = (RemoteConfigParameter) obj;
                remoteConfigParameter.getClass();
                LinearLayout linearLayout2 = (LinearLayout) ((dd) obj2).c;
                linearLayout2.removeAllViews();
                int color4 = context.getColor(R.color.n_lv_1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginStart(ao2.s(6, context));
                for (RemoteConfigParameterLine remoteConfigParameterLine : remoteConfigParameter.getLines()) {
                    TextView textView17 = new TextView(context);
                    textView17.setText(remoteConfigParameterLine.getText());
                    Context context3 = textView17.getContext();
                    context3.getClass();
                    try {
                        typeface2 = z1g.a(R.font.sofascore_sans_regular, context3);
                    } catch (Exception unused2) {
                        typeface2 = Typeface.DEFAULT;
                    }
                    textView17.setTypeface(typeface2);
                    int i7 = pxf.a[remoteConfigParameterLine.getLevel().ordinal()];
                    if (i7 == 1) {
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        Context context4 = textView17.getContext();
                        context4.getClass();
                        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ao2.s(4, context4), ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                        textView17.setLayoutParams(layoutParams2);
                        textView17.setTextColor(textView17.getContext().getColor(R.color.secondary_default));
                    } else if (i7 == 2) {
                        textView17.setLayoutParams(layoutParams);
                        textView17.setTextColor(textView17.getContext().getColor(R.color.primary_default));
                    } else if (i7 == 3) {
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                        Context context5 = textView17.getContext();
                        context5.getClass();
                        layoutParams3.setMarginStart(ao2.s(12, context5));
                        textView17.setLayoutParams(layoutParams3);
                        textView17.setTextColor(color4);
                    } else if (i7 != 4) {
                        zzl.b();
                        return;
                    } else {
                        textView17.setLayoutParams(layoutParams);
                        textView17.setTextColor(color4);
                    }
                    linearLayout2.addView(textView17);
                }
                return;
            case 27:
                RiskyTopic riskyTopic = (RiskyTopic) obj;
                djf djfVar2 = (djf) obj2;
                riskyTopic.getClass();
                ChatInterface chatInterfaceModel = riskyTopic.getChatInterfaceModel();
                if (chatInterfaceModel == null) {
                    return;
                }
                TextView textView18 = (TextView) djfVar2.d;
                TextView textView19 = (TextView) djfVar2.e;
                LinearLayout linearLayout3 = (LinearLayout) djfVar2.c;
                LinearLayout linearLayout4 = (LinearLayout) djfVar2.f;
                if (fc6.B(fc6.t(Instant.ofEpochSecond(chatInterfaceModel.getTimestamp())))) {
                    long timestamp = chatInterfaceModel.getTimestamp();
                    context.getClass();
                    DateTimePatternGenerator b2 = hk4.b();
                    String bestPattern2 = DateFormat.is24HourFormat(context) ? b2.getBestPattern("Hm") : b2.getBestPattern("hm");
                    bestPattern2.getClass();
                    i3 = fc6.i(timestamp, hk4.a(bestPattern2));
                } else {
                    long timestamp2 = chatInterfaceModel.getTimestamp();
                    bi4 bi4Var = bi4.PATTERN_DMM;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    i3 = fc6.i(timestamp2, hk4.a(bi4Var.d()));
                }
                textView18.setText(i3);
                if (chatInterfaceModel instanceof Event) {
                    linearLayout4.setVisibility(0);
                    linearLayout3.setVisibility(0);
                    Event event = (Event) chatInterfaceModel;
                    textView19.setText(tba.p(context, Event.getHomeTeam$default(event, null, 1, null)));
                    ((TextView) djfVar2.g).setText(qea.K(tba.p(context, Event.getAwayTeam$default(event, null, 1, null)), event.shouldReverseTeams()));
                    return;
                }
                if (chatInterfaceModel instanceof Stage) {
                    linearLayout4.setVisibility(0);
                    linearLayout3.setVisibility(8);
                    textView19.setText(((Stage) chatInterfaceModel).getDescription());
                    return;
                }
                return;
            case 28:
                String str3 = (String) obj;
                str3.getClass();
                kqb kqbVar2 = (kqb) obj2;
                kqbVar2.d.setText(str3);
                kqbVar2.c.setVisibility(8);
                ConstraintLayout constraintLayout7 = kqbVar2.b;
                constraintLayout7.getClass();
                sea.v(constraintLayout7, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return;
            default:
                v7i v7iVar = (v7i) obj;
                t22 t22Var = (t22) obj2;
                TextView textView20 = t22Var.d;
                v7iVar.getClass();
                long j2 = v7iVar.a;
                boolean z2 = v7iVar.b;
                if (j2 <= 0 && !z2) {
                    LinearLayout linearLayout5 = t22Var.b;
                    linearLayout5.getClass();
                    linearLayout5.setVisibility(8);
                    return;
                }
                if (j2 > 0) {
                    textView20.setText(context.getString(R.string.last_updated) + ": " + rik.j(context, j2, bi4.PATTERN_DMM, ", "));
                } else {
                    textView20.setText("");
                }
                t22Var.c.setVisibility(z2 ? 0 : 8);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja9(u22 u22Var) {
        super(u22Var.b);
        this.c = 0;
        this.d = u22Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja9(u22 u22Var, byte b) {
        super(u22Var.b);
        this.c = 25;
        this.d = u22Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja9(ddd dddVar) {
        super(dddVar.b);
        this.c = 5;
        this.d = dddVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(cr2 cr2Var) {
        super(r0);
        this.c = 7;
        FrameLayout frameLayout = cr2Var.a;
        frameLayout.getClass();
        this.d = cr2Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(o16 o16Var) {
        super(r0);
        this.c = 2;
        FrameLayout frameLayout = o16Var.b;
        frameLayout.getClass();
        this.d = o16Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(o16 o16Var, byte b) {
        super(r2);
        this.c = 4;
        FrameLayout frameLayout = o16Var.b;
        frameLayout.getClass();
        this.d = o16Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(o16 o16Var, char c) {
        super(r2);
        this.c = 20;
        FrameLayout frameLayout = o16Var.b;
        frameLayout.getClass();
        this.d = o16Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(hcb hcbVar) {
        super(r0);
        this.c = 6;
        RelativeLayout relativeLayout = (RelativeLayout) hcbVar.b;
        relativeLayout.getClass();
        this.d = hcbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja9(ConstraintLayout constraintLayout) {
        super(constraintLayout);
        this.c = 19;
        constraintLayout.getClass();
        this.d = e92.b(constraintLayout);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(dd ddVar) {
        super(r0);
        this.c = 16;
        ConstraintLayout constraintLayout = (ConstraintLayout) ddVar.b;
        constraintLayout.getClass();
        this.d = ddVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(dd ddVar, byte b) {
        super(r2);
        this.c = 26;
        ConstraintLayout constraintLayout = (ConstraintLayout) ddVar.b;
        constraintLayout.getClass();
        this.d = ddVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(ed edVar) {
        super(r0);
        this.c = 15;
        LinearLayout linearLayout = (LinearLayout) edVar.b;
        linearLayout.getClass();
        this.d = edVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(t22 t22Var) {
        super(r0);
        this.c = 29;
        LinearLayout linearLayout = t22Var.b;
        linearLayout.getClass();
        this.d = t22Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(dx5 dx5Var) {
        super(r0);
        this.c = 22;
        LinearLayout linearLayout = dx5Var.a;
        linearLayout.getClass();
        this.d = dx5Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(fmf fmfVar) {
        super(r0);
        this.c = 24;
        ConstraintLayout constraintLayout = fmfVar.a;
        constraintLayout.getClass();
        this.d = fmfVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(gh5 gh5Var) {
        super(r0);
        this.c = 3;
        LinearLayout linearLayout = gh5Var.b;
        linearLayout.getClass();
        this.d = gh5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja9(int i, View view) {
        super(view);
        this.c = i;
        this.d = view;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(kqb kqbVar) {
        super(r0);
        this.c = 28;
        ConstraintLayout constraintLayout = kqbVar.b;
        constraintLayout.getClass();
        this.d = kqbVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(hs1 hs1Var) {
        super(r0);
        this.c = 14;
        LinearLayout linearLayout = hs1Var.b;
        linearLayout.getClass();
        this.d = hs1Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(h04 h04Var) {
        super(r0);
        this.c = 17;
        ConstraintLayout constraintLayout = h04Var.b;
        constraintLayout.getClass();
        this.d = h04Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(av1 av1Var) {
        super(r0);
        this.c = 18;
        LinearLayout linearLayout = av1Var.b;
        linearLayout.getClass();
        this.d = av1Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(ez0 ez0Var) {
        super(r0);
        this.c = 12;
        ConstraintLayout constraintLayout = (ConstraintLayout) ez0Var.b;
        constraintLayout.getClass();
        this.d = ez0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(djf djfVar) {
        super(r0);
        this.c = 23;
        ConstraintLayout constraintLayout = (ConstraintLayout) djfVar.b;
        constraintLayout.getClass();
        this.d = djfVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(mqb mqbVar) {
        super(r0);
        this.c = 21;
        ConstraintLayout constraintLayout = mqbVar.b;
        constraintLayout.getClass();
        this.d = mqbVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(djf djfVar, byte b) {
        super(r2);
        this.c = 27;
        LinearLayout linearLayout = (LinearLayout) djfVar.b;
        linearLayout.getClass();
        this.d = djfVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja9(xz0 xz0Var) {
        super(r0);
        this.c = 11;
        ConstraintLayout constraintLayout = (ConstraintLayout) xz0Var.j;
        constraintLayout.getClass();
        this.d = xz0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja9(View view) {
        super(view);
        this.c = 10;
        view.getClass();
        this.d = view;
    }
}
