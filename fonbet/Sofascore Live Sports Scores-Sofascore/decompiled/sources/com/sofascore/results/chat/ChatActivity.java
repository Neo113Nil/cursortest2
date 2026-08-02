package com.sofascore.results.chat;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.sofascore.model.Country;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.Sports;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.TeamOfTheRoundChatInterface;
import com.sofascore.model.chat.TournamentSeasonPair;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StageSeasonKt;
import com.sofascore.model.mvvm.model.StageWinner;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import com.sofascore.results.tutorial.wizard.TutorialWizardView;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import com.sofascore.results.view.header.volleyball.VolleyballEventResultView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.afi;
import defpackage.ao2;
import defpackage.as9;
import defpackage.b0a;
import defpackage.c21;
import defpackage.cv1;
import defpackage.d41;
import defpackage.dad;
import defpackage.dmi;
import defpackage.dq2;
import defpackage.duf;
import defpackage.dv3;
import defpackage.e58;
import defpackage.e6b;
import defpackage.eq2;
import defpackage.fq2;
import defpackage.fuf;
import defpackage.g6b;
import defpackage.gq2;
import defpackage.hq2;
import defpackage.hs2;
import defpackage.hwc;
import defpackage.i5i;
import defpackage.ip1;
import defpackage.iq2;
import defpackage.j41;
import defpackage.j58;
import defpackage.joa;
import defpackage.k13;
import defpackage.ke0;
import defpackage.km5;
import defpackage.kq2;
import defpackage.l5i;
import defpackage.l98;
import defpackage.ljg;
import defpackage.lq2;
import defpackage.ltb;
import defpackage.mf;
import defpackage.mm3;
import defpackage.mqi;
import defpackage.nm;
import defpackage.nv;
import defpackage.o3a;
import defpackage.ok3;
import defpackage.otk;
import defpackage.p2g;
import defpackage.ph0;
import defpackage.pq2;
import defpackage.pr2;
import defpackage.ps2;
import defpackage.pu7;
import defpackage.qr2;
import defpackage.qu1;
import defpackage.qy0;
import defpackage.r1;
import defpackage.rik;
import defpackage.rld;
import defpackage.rq3;
import defpackage.ry0;
import defpackage.s0;
import defpackage.s38;
import defpackage.s5d;
import defpackage.su;
import defpackage.sub;
import defpackage.tba;
import defpackage.tl3;
import defpackage.tu7;
import defpackage.u2g;
import defpackage.uc;
import defpackage.uhi;
import defpackage.un0;
import defpackage.us2;
import defpackage.vlo;
import defpackage.w2g;
import defpackage.wy0;
import defpackage.x2k;
import defpackage.xg0;
import defpackage.xld;
import defpackage.xw3;
import defpackage.y2;
import defpackage.yea;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z03;
import defpackage.z1;
import defpackage.z8e;
import defpackage.zla;
import defpackage.zzl;
import java.time.DayOfWeek;
import java.time.Instant;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\n\u000b\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/sofascore/results/chat/ChatActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "Llq2;", "<init>", "()V", "Landroid/view/View;", "highlightView", "", "setHighlightedView", "(Landroid/view/View;)V", "uic", "fq2", "iq2", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChatActivity extends Hilt_ChatActivity implements lq2 {
    public static final /* synthetic */ int Z = 0;
    public boolean K;
    public final otk L;
    public final otk M;
    public final mqi N;
    public ChatInterface O;
    public Boolean P;
    public MenuItem Q;
    public s5d R;
    public boolean S;
    public boolean T;
    public final EnumMap U;
    public final joa V;
    public final joa W;
    public iq2 X;
    public final mqi Y;

    public ChatActivity() {
        int i = 1;
        kq2 kq2Var = new kq2(this, i);
        fuf fufVar = duf.a;
        int i2 = 2;
        int i3 = 3;
        this.L = new otk(fufVar.getOrCreateKotlinClass(pq2.class), new kq2(this, i2), kq2Var, new kq2(this, i3));
        this.M = new otk(fufVar.getOrCreateKotlinClass(tu7.class), new kq2(this, 5), new kq2(this, 4), new kq2(this, 6));
        this.N = ypa.b(new dq2(this, 0));
        EnumSet allOf = EnumSet.allOf(fq2.class);
        allOf.getClass();
        int c = sub.c(k13.r(allOf, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(c < 16 ? 16 : c);
        for (Object obj : allOf) {
            linkedHashMap.put(obj, Boolean.FALSE);
        }
        this.U = new EnumMap(linkedHashMap);
        dq2 dq2Var = new dq2(this, i);
        ysa ysaVar = ysa.c;
        this.V = ypa.a(ysaVar, dq2Var);
        this.W = ypa.a(ysaVar, new dq2(this, i2));
        this.Y = ypa.b(new dq2(this, i3));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        pq2 S = S();
        ChatInterface chatInterface = S.j;
        if (chatInterface instanceof Event) {
            xw3.L(un0.z(S), null, null, new qu1(S, chatInterface.getChatId(), (rq3) null, 2), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if ((r0 instanceof defpackage.u2g) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q() {
        Object u2gVar;
        int i = ke0.c;
        ArrayList arrayList = dv3.a;
        Country b = dv3.b(Integer.valueOf(i));
        if (b != null && rld.t(this)) {
            ChatInterface chatInterface = this.O;
            if (chatInterface == null) {
                Intrinsics.i("chatInterfaceModel");
                throw null;
            }
            if ((!Intrinsics.c(chatInterface.getStatusType(), StatusKt.STATUS_IN_PROGRESS) && !this.T) || !rld.a(i)) {
                ChatInterface chatInterface2 = this.O;
                if (chatInterface2 == null) {
                    Intrinsics.i("chatInterfaceModel");
                    throw null;
                }
                Event event = chatInterface2 instanceof Event ? (Event) chatInterface2 : null;
                yea yeaVar = j58.a;
                e58 f = e58.f();
                f.getClass();
                String g = f.g("chat_odds_countries");
                if (g.length() != 0) {
                    try {
                        p2g p2gVar = w2g.b;
                        yeaVar.getClass();
                        u2gVar = yeaVar.b(l98.W(new xg0(uhi.a, 0)), g);
                    } catch (Throwable th) {
                        p2g p2gVar2 = w2g.b;
                        u2gVar = new u2g(th);
                    }
                    Throwable a = w2g.a(u2gVar);
                    if (a != null) {
                        s38.a().c(a);
                    }
                }
                u2gVar = null;
                List list = (List) u2gVar;
                if (list == null) {
                    list = km5.a;
                }
                if (!list.contains(b.getIso2Alpha())) {
                    return false;
                }
                yea yeaVar2 = j58.a;
                return !j58.i(event != null ? o3a.F(event.getTournament()) : null, b.getIso2Alpha());
            }
        }
        return false;
    }

    public final uc R() {
        return (uc) this.N.getValue();
    }

    public final pq2 S() {
        return (pq2) this.L.getValue();
    }

    public final qr2 T() {
        return (qr2) this.Y.getValue();
    }

    public final void U(LinearLayout linearLayout) {
        linearLayout.removeAllViews();
        int s = ao2.s(4, this);
        joa joaVar = this.V;
        FeaturedOddsView featuredOddsView = (FeaturedOddsView) joaVar.getValue();
        featuredOddsView.setPadding(featuredOddsView.getPaddingLeft(), s, featuredOddsView.getPaddingRight(), s);
        linearLayout.addView((FeaturedOddsView) joaVar.getValue());
        linearLayout.setElevation(8.0f);
        linearLayout.setVisibility(0);
        S().k = mf.b;
    }

    public final void V(fq2 fq2Var, boolean z) {
        int ordinal = fq2Var.ordinal();
        if (ordinal == 0) {
            ImageView imageView = R().m;
            imageView.setVisibility(z ? 0 : 8);
            imageView.setEnabled(z);
        } else {
            if (ordinal != 1) {
                zzl.b();
                return;
            }
            MenuItem menuItem = this.Q;
            if (menuItem != null) {
                menuItem.setVisible(z);
                menuItem.setEnabled(z);
            }
        }
        this.U.put((EnumMap) fq2Var, (fq2) Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x02df, code lost:
    
        if (r16 <= r14) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(ChatInterface chatInterface) {
        String string;
        String description;
        String description2;
        String name;
        String description3;
        Category category;
        int parseColor;
        List split$default;
        this.O = chatInterface;
        boolean z = chatInterface instanceof Tournament;
        if (!z || !Intrinsics.c(((Tournament) chatInterface).getCategory().getSport().getSlug(), Sports.MMA)) {
            Z();
        }
        if (this.K) {
            return;
        }
        this.K = true;
        if (chatInterface instanceof Event) {
            ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = R().b;
            g6b lifecycle = getLifecycle();
            Event event = (Event) chatInterface;
            lifecycle.getClass();
            toolbarBackgroundAppBarLayout.C.a(lifecycle, event);
            R().d.setVisibility(0);
            X(event);
            return;
        }
        if (z) {
            R().f.b.setVisibility(0);
            ImageView imageView = R().f.c;
            Tournament tournament = (Tournament) chatInterface;
            UniqueTournament uniqueTournament = tournament.getUniqueTournament();
            as9.q(imageView, uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null, tournament.getId(), null);
            if (!Intrinsics.c(tournament.getCategory().getSport().getSlug(), Sports.MMA)) {
                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout2 = R().b;
                UniqueTournament uniqueTournament2 = tournament.getUniqueTournament();
                toolbarBackgroundAppBarLayout2.setBackground(new qy0(uniqueTournament2 != null ? uniqueTournament2.getId() : 0, tournament.getId()));
                R().f.d.setMaxLines(2);
                R().f.d.setText(tba.w(tournament));
                return;
            }
            UniqueTournament uniqueTournament3 = tournament.getUniqueTournament();
            String primaryColorHex = uniqueTournament3 != null ? uniqueTournament3.getPrimaryColorHex() : null;
            if (primaryColorHex != null) {
                try {
                    parseColor = Color.parseColor(primaryColorHex);
                } catch (Exception unused) {
                }
                split$default = StringsKt__StringsKt.split$default(tba.w(tournament), new String[]{":"}, false, 0, 6, null);
                String str = (String) CollectionsKt.firstOrNull(split$default);
                String obj = str == null ? StringsKt.l0(str).toString() : null;
                String str2 = (String) CollectionsKt.a0(1, split$default);
                name = str2 != null ? StringsKt.l0(str2).toString() : null;
                R().b.setBackground(new ry0(parseColor));
                cv1 cv1Var = R().f;
                TextView textView = cv1Var.d;
                TextView textView2 = cv1Var.f;
                textView.setText(obj);
                textView2.setText(name);
                textView2.setVisibility((name != null || StringsKt.R(name)) ? 8 : 0);
                return;
            }
            parseColor = 0;
            split$default = StringsKt__StringsKt.split$default(tba.w(tournament), new String[]{":"}, false, 0, 6, null);
            String str3 = (String) CollectionsKt.firstOrNull(split$default);
            if (str3 == null) {
            }
            String str22 = (String) CollectionsKt.a0(1, split$default);
            if (str22 != null) {
            }
            R().b.setBackground(new ry0(parseColor));
            cv1 cv1Var2 = R().f;
            TextView textView3 = cv1Var2.d;
            TextView textView22 = cv1Var2.f;
            textView3.setText(obj);
            textView22.setText(name);
            textView22.setVisibility((name != null || StringsKt.R(name)) ? 8 : 0);
            return;
        }
        if (chatInterface instanceof TeamOfTheRoundChatInterface) {
            TeamOfTheRoundChatInterface teamOfTheRoundChatInterface = (TeamOfTheRoundChatInterface) chatInterface;
            R().b.setBackground(new qy0(teamOfTheRoundChatInterface.getUniqueTournamentId(), 0));
            cv1 cv1Var3 = R().f;
            ConstraintLayout constraintLayout = cv1Var3.b;
            TextView textView4 = cv1Var3.f;
            constraintLayout.setVisibility(0);
            as9.q(cv1Var3.c, Integer.valueOf(teamOfTheRoundChatInterface.getUniqueTournamentId()), 0, null);
            cv1Var3.d.setText(getString(R.string.football_team_of_the_round));
            textView4.setVisibility(0);
            textView4.setText(teamOfTheRoundChatInterface.getRoundName());
            return;
        }
        if (chatInterface instanceof TournamentSeasonPair) {
            TournamentSeasonPair tournamentSeasonPair = (TournamentSeasonPair) chatInterface;
            R().b.setBackground(new qy0(tournamentSeasonPair.getUniqueTournamentId(), 0));
            cv1 cv1Var4 = R().f;
            ConstraintLayout constraintLayout2 = cv1Var4.b;
            TextView textView5 = cv1Var4.f;
            constraintLayout2.setVisibility(0);
            as9.q(cv1Var4.c, Integer.valueOf(tournamentSeasonPair.getUniqueTournamentId()), 0, null);
            cv1Var4.d.setText(tournamentSeasonPair.getTournamentTranslatedName());
            Season season = tournamentSeasonPair.getSeason();
            if (season != null) {
                textView5.setVisibility(0);
                textView5.setText(season.getYear());
                return;
            }
            return;
        }
        if (chatInterface instanceof Stage) {
            Stage stage = (Stage) chatInterface;
            StageSeason stageSeason = stage.getStageSeason();
            UniqueStage uniqueStage = stageSeason != null ? stageSeason.getUniqueStage() : null;
            if (uniqueStage != null) {
                ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout3 = R().b;
                joa joaVar = l5i.a;
                i5i b = l5i.b(stage);
                toolbarBackgroundAppBarLayout3.setBackground(b != null ? new wy0(uniqueStage.getId(), b.a) : new wy0(uniqueStage.getId(), uniqueStage.getName()));
            }
            cv1 cv1Var5 = R().f;
            ConstraintLayout constraintLayout3 = cv1Var5.b;
            ImageView imageView2 = cv1Var5.e;
            TextView textView6 = cv1Var5.f;
            constraintLayout3.setVisibility(0);
            ImageView imageView3 = cv1Var5.c;
            UniqueStage uniqueStage2 = stage.getUniqueStage();
            as9.b(imageView3, (uniqueStage2 == null || (category = uniqueStage2.getCategory()) == null) ? null : Integer.valueOf(category.getId()), null);
            cv1Var5.d.setText(stage.getDescription());
            String str4 = "";
            if (Intrinsics.c(stage.getStatusType(), StatusKt.STATUS_FINISHED)) {
                Status status = stage.getStatus();
                if (status != null && (description3 = status.getDescription()) != null) {
                    str4 = description3;
                }
                UniqueStage uniqueStage3 = stage.getUniqueStage();
                String c = afi.c(this, str4, uniqueStage3 != null ? uniqueStage3.getSportSlug() : null, false);
                StageWinner winner = stage.getWinner();
                name = winner != null ? winner.getName() : null;
                if (c.length() <= 0 || name == null || name.length() == 0) {
                    return;
                }
                textView6.setVisibility(0);
                textView6.setText(c + " • " + name);
                imageView2.setImageResource(R.drawable.ic_trophy_16);
                imageView2.setVisibility(0);
                return;
            }
            if (!Intrinsics.c(stage.getStatusType(), StatusKt.STATUS_IN_PROGRESS)) {
                if (stage.getStartDateTimestamp() != 0) {
                    long startDateTimestamp = stage.getStartDateTimestamp();
                    Long endDateTimestamp = stage.getEndDateTimestamp();
                    long longValue = endDateTimestamp != null ? endDateTimestamp.longValue() : 0L;
                    long epochSecond = Instant.now().getEpochSecond();
                    if (startDateTimestamp <= epochSecond) {
                    }
                }
                if (Intrinsics.c(stage.getStatusType(), StatusKt.STATUS_CANCELED)) {
                    textView6.setVisibility(0);
                    textView6.setTextColor(getColor(R.color.stayDarkLive));
                    textView6.setText(getString(R.string.canceled));
                    return;
                } else {
                    if (ph0.a0(new String[]{StatusKt.STATUS_NOT_STARTED, StatusKt.STATUS_DELAYED}).contains(stage.getStatusType())) {
                        if (stage.getStartDateTimestamp() != 0) {
                            textView6.setVisibility(0);
                            textView6.setText(rik.q(stage.getStartDateTimestamp(), this));
                            return;
                        }
                        return;
                    }
                    Status status2 = stage.getStatus();
                    if (status2 != null && (description2 = status2.getDescription()) != null) {
                        str4 = description2;
                    }
                    UniqueStage uniqueStage4 = stage.getUniqueStage();
                    afi.c(this, str4, uniqueStage4 != null ? uniqueStage4.getSportSlug() : null, false);
                    return;
                }
            }
            textView6.setVisibility(0);
            textView6.setTextColor(getColor(R.color.stayDarkLive));
            Stage currentSubstage = stage.getCurrentSubstage();
            if (Intrinsics.c(currentSubstage != null ? currentSubstage.getStatusType() : null, StatusKt.STATUS_IN_PROGRESS)) {
                DayOfWeek dayOfWeek = hwc.a;
                Stage currentSubstage2 = stage.getCurrentSubstage();
                if (currentSubstage2 != null && (description = currentSubstage2.getDescription()) != null) {
                    str4 = description;
                }
                String d = hwc.d(this, str4, false);
                if (StringsKt.R(d)) {
                    d = null;
                }
                string = dmi.y(getString(R.string.menu_live), d != null ? " • ".concat(d) : null);
            } else {
                string = getString(R.string.menu_live);
            }
            textView6.setText(string);
        }
    }

    public final void X(Event event) {
        iq2 iq2Var = this.X;
        if (iq2Var == null) {
            String s = ok3.s(event);
            if (Intrinsics.c(s, Sports.TENNIS)) {
                hs2 hs2Var = new hs2(this);
                iq2Var = new gq2(hs2Var);
                R().d.addView(hs2Var);
                this.X = iq2Var;
            } else if (Intrinsics.c(s, Sports.VOLLEYBALL)) {
                VolleyballEventResultView volleyballEventResultView = new VolleyballEventResultView(this, null, 6);
                iq2Var = new hq2(volleyballEventResultView);
                R().d.addView(volleyballEventResultView);
                this.X = iq2Var;
            } else {
                z03 z03Var = new z03(this);
                z03Var.setChatHeader(true);
                zla zlaVar = z03Var.y;
                zlaVar.h.setEnabled(false);
                zlaVar.o.setEnabled(false);
                dad dadVar = new dad(z03Var, 12);
                R().d.addView(z03Var);
                this.X = dadVar;
                iq2Var = dadVar;
            }
        }
        iq2Var.p(event);
        if (Intrinsics.c(ok3.s(event), Sports.TENNIS)) {
            FrameLayout frameLayout = R().d;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            tl3 tl3Var = (tl3) layoutParams;
            ((ViewGroup.MarginLayoutParams) tl3Var).width = -1;
            frameLayout.setLayoutParams(tl3Var);
            mm3 mm3Var = new mm3();
            mm3Var.e(R().e);
            mm3Var.p(R().d.getId(), 7);
            mm3Var.a(R().e);
            return;
        }
        iq2 iq2Var2 = this.X;
        KeyEvent.Callback k = iq2Var2 != null ? iq2Var2.k() : null;
        z03 z03Var2 = k instanceof z03 ? (z03) k : null;
        if (z03Var2 != null) {
            z03Var2.setScaleX(0.75f);
            z03Var2.setScaleY(0.75f);
            zla binding = z03Var2.getBinding();
            binding.c.setVisibility(8);
            binding.d.setVisibility(8);
            binding.i.setVisibility(8);
            binding.p.setVisibility(8);
            binding.g.setVisibility(8);
            binding.n.setVisibility(8);
            binding.s.setVisibility(8);
            Guideline guideline = binding.u;
            ViewGroup.LayoutParams layoutParams2 = guideline.getLayoutParams();
            if (layoutParams2 == null) {
                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            tl3 tl3Var2 = (tl3) layoutParams2;
            tl3Var2.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            guideline.setLayoutParams(tl3Var2);
            ConstraintLayout constraintLayout = binding.l;
            ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
            if (layoutParams3 == null) {
                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            tl3 tl3Var3 = (tl3) layoutParams3;
            Context context = z03Var2.getContext();
            context.getClass();
            ((ViewGroup.MarginLayoutParams) tl3Var3).topMargin = ao2.s(0, context);
            constraintLayout.setLayoutParams(tl3Var3);
            mm3 mm3Var2 = new mm3();
            mm3Var2.e(z03Var2.getBinding().a);
            mm3Var2.r(z03Var2.getBinding().h.getId(), 6, 0);
            mm3Var2.p(z03Var2.getBinding().h.getId(), 6);
            mm3Var2.r(z03Var2.getBinding().o.getId(), 7, 0);
            mm3Var2.p(z03Var2.getBinding().o.getId(), 7);
            mm3Var2.f(z03Var2.getBinding().l.getId(), 4, z03Var2.getBinding().h.getId(), 4);
            mm3Var2.a(z03Var2.getBinding().a);
        }
    }

    public final void Y(LinearLayout linearLayout) {
        S().k = mf.a;
        linearLayout.setElevation(8.0f);
        linearLayout.removeAllViews();
        joa joaVar = this.W;
        linearLayout.addView((AdBannerView) joaVar.getValue());
        AdBannerView adBannerView = (AdBannerView) joaVar.getValue();
        ltb ltbVar = new ltb();
        ChatInterface chatInterface = this.O;
        if (chatInterface == null) {
            Intrinsics.i("chatInterfaceModel");
            throw null;
        }
        if (chatInterface instanceof Event) {
            ltbVar.put(SearchResponseKt.SPORT_ENTITY, ((Event) chatInterface).getTournament().getCategory().getSport().getSlug());
        } else if (chatInterface instanceof Stage) {
            String sportName = StageSeasonKt.getSportName(((Stage) chatInterface).getStageSeason());
            if (sportName != null) {
                ltbVar.put(SearchResponseKt.SPORT_ENTITY, sportName);
            }
        } else if (chatInterface instanceof Tournament) {
            ltbVar.put(SearchResponseKt.SPORT_ENTITY, ((Tournament) chatInterface).getCategory().getSport().getSlug());
        } else if (chatInterface instanceof TournamentSeasonPair) {
            ltbVar.put(SearchResponseKt.SPORT_ENTITY, ((TournamentSeasonPair) chatInterface).getSportSlug());
            ChatInterface chatInterface2 = this.O;
            if (chatInterface2 == null) {
                Intrinsics.i("chatInterfaceModel");
                throw null;
            }
            ltbVar.put("unique_tournament_id", String.valueOf(((TournamentSeasonPair) chatInterface2).getUniqueTournamentId()));
        }
        I(adBannerView, ltbVar.d());
        ((AdBannerView) joaVar.getValue()).setBackground(null);
    }

    public final void Z() {
        LinearLayout linearLayout = R().g;
        ChatInterface chatInterface = this.O;
        if (chatInterface == null) {
            Intrinsics.i("chatInterfaceModel");
            throw null;
        }
        if (!(chatInterface instanceof Event) || !xld.g(this) || !Q()) {
            if (S().k != mf.a) {
                Y(linearLayout);
                return;
            }
            return;
        }
        if (S().k == mf.c) {
            U(linearLayout);
        }
        tu7 tu7Var = (tu7) this.M.getValue();
        ChatInterface chatInterface2 = this.O;
        if (chatInterface2 == null) {
            Intrinsics.i("chatInterfaceModel");
            throw null;
        }
        Event event = (Event) chatInterface2;
        if (tu7Var.m) {
            xw3.L(un0.z(tu7Var), null, null, new pu7(tu7Var, event, null), 3);
        }
    }

    @Override // defpackage.lq2
    public final void a() {
        T().notifyDataSetChanged();
    }

    @Override // defpackage.lq2
    public final void b() {
        S();
        ChatUser k = pq2.k();
        if (!this.S && (k.isAdmin() || k.isModerator())) {
            this.P = Boolean.TRUE;
            V(fq2.a, false);
        }
        if (this.S && k.isAdmin()) {
            V(fq2.b, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (defpackage.pq2.k().isModerator() != false) goto L8;
     */
    @Override // defpackage.lq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        if (!this.S) {
            S();
            if (!pq2.k().isAdmin()) {
                S();
            }
            d41.w(T(), pr2.MODERATORS);
        }
        R().h.setVisibility(T().l.size() != 1 ? 0 : 8);
        R().h.post(new y2(this, 26));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ChatActivity chatActivity;
        super.onCreate(bundle);
        setContentView(R().a);
        G();
        rq3 rq3Var = null;
        R().i.setBackground(null);
        R().h.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        CoordinatorLayout coordinatorLayout = R().a;
        coordinatorLayout.getClass();
        BaseActivity.r(this, coordinatorLayout);
        R().m.setOnClickListener(new s0(this, 10));
        int i = 2;
        S().m.e(this, new z1(2, new eq2(this, 0)));
        S().v.e(this, new z1(2, new eq2(this, 1 == true ? 1 : 0)));
        S().o.e(this, new z1(2, new eq2(this, i)));
        ChatInterface chatInterface = S().j;
        if (chatInterface == null) {
            finish();
            return;
        }
        this.O = chatInterface;
        W(chatInterface);
        String stringExtra = getIntent().getStringExtra("OPEN_LOCATION");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ChatInterface chatInterface2 = this.O;
        if (chatInterface2 == null) {
            Intrinsics.i("chatInterfaceModel");
            throw null;
        }
        Integer valueOf = Integer.valueOf(chatInterface2.getChatId());
        su suVar = this.x;
        suVar.a = valueOf;
        ChatInterface chatInterface3 = this.O;
        if (chatInterface3 == null) {
            Intrinsics.i("chatInterfaceModel");
            throw null;
        }
        suVar.b = chatInterface3.getChannelName();
        ChatInterface chatInterface4 = this.O;
        if (chatInterface4 == null) {
            Intrinsics.i("chatInterfaceModel");
            throw null;
        }
        suVar.c = chatInterface4.getStatusType();
        ChatInterface chatInterface5 = this.O;
        if (chatInterface5 == null) {
            Intrinsics.i("chatInterfaceModel");
            throw null;
        }
        TeamOfTheRoundChatInterface teamOfTheRoundChatInterface = chatInterface5 instanceof TeamOfTheRoundChatInterface ? (TeamOfTheRoundChatInterface) chatInterface5 : null;
        String analyticsCategory = teamOfTheRoundChatInterface != null ? teamOfTheRoundChatInterface.getAnalyticsCategory() : null;
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        firebaseBundle.putInt("id", chatInterface5.getChatId());
        firebaseBundle.putString("location", stringExtra);
        firebaseBundle.putString("type", nv.u(chatInterface5));
        if (analyticsCategory != null) {
            firebaseBundle.putString("category", analyticsCategory);
        }
        nv.N(this, firebaseBundle, "chat_activity");
        this.S = getIntent() != null && getIntent().getBooleanExtra("EDITOR_MODE", false);
        R().l.setAdapter(T());
        d41.w(T(), pr2.COMMENTS);
        c();
        R().l.a(new j41(this, i));
        z8e.x(this, ((tu7) this.M.getValue()).j, new r1(this, rq3Var, 6));
        ChatInterface chatInterface6 = this.O;
        if (chatInterface6 == null) {
            Intrinsics.i("chatInterfaceModel");
            throw null;
        }
        if (chatInterface6 instanceof Event) {
            int chatId = ((Event) chatInterface6).getChatId();
            s5d s5dVar = this.R;
            if (s5dVar == null) {
                Intrinsics.i("natsSocket");
                throw null;
            }
            e6b e6bVar = e6b.a;
            chatActivity = this;
            s5dVar.a(chatActivity, ljg.j(chatId, "event."), new dq2(this, 4), true, new eq2(this, 3));
        } else {
            chatActivity = this;
        }
        chatActivity.R().l.setUserInputEnabled(false);
        z8e.w(chatActivity, chatActivity.S().t, new ip1(chatActivity, rq3Var, i));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.activity_chat_menu, menu);
        MenuItem findItem = menu.findItem(R.id.menu_item_remove);
        this.Q = findItem;
        if (findItem == null) {
            return true;
        }
        Boolean bool = (Boolean) this.U.get(fq2.b);
        findItem.setEnabled(bool != null ? bool.booleanValue() : false);
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        nm.d();
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_remove) {
            return super.onOptionsItemSelected(menuItem);
        }
        Fragment z = T().z(0);
        z.getClass();
        us2 L = ((AbstractChatFragment) z).L();
        xw3.L(un0.z(L), null, null, new ps2(L, null, 1), 3);
        finish();
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        b();
        return super.onPrepareOptionsMenu(menu);
    }

    public final void setHighlightedView(@Nullable View highlightView) {
        if (highlightView == null) {
            if (R().k.getVisibility() == 0) {
                TutorialWizardView tutorialWizardView = R().k;
                TutorialWizardView.b(tutorialWizardView, null, false, false, null, 62);
                tutorialWizardView.setVisibility(8);
                return;
            }
            return;
        }
        TutorialWizardView tutorialWizardView2 = R().k;
        int i = 0;
        tutorialWizardView2.setVisibility(0);
        if (!tutorialWizardView2.isLaidOut() || tutorialWizardView2.isLayoutRequested()) {
            tutorialWizardView2.addOnLayoutChangeListener(new c21(tutorialWizardView2, highlightView, this));
            return;
        }
        tutorialWizardView2.setSkipCallback(new kq2(this, i));
        b0a.k = x2k.a;
        highlightView.post(new vlo(3, tutorialWizardView2, highlightView));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "ChatScreen";
    }
}
