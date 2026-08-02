package com.sofascore.results.fantasy.highlights.gameweek;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.highlights.gameweek.FantasyGameweekHighlightsActivity;
import com.sofascore.results.fantasy.highlights.gameweek.points.FantasyGameweekHighlightsPointsFragment;
import com.sofascore.results.fantasy.highlights.gameweek.potgw.FantasyGameweekHighlightsPOTGWFragment;
import com.sofascore.results.fantasy.highlights.gameweek.rankings.FantasyGameweekHighlightsRankingsFragment;
import com.sofascore.results.fantasy.highlights.gameweek.totgw.FantasyGameweekHighlightsTOTGWFragment;
import com.sofascore.results.mvvm.base.AbstractComposeFragment;
import defpackage.a99;
import defpackage.d07;
import defpackage.duf;
import defpackage.ev6;
import defpackage.f07;
import defpackage.f6;
import defpackage.g07;
import defpackage.hkj;
import defpackage.j07;
import defpackage.joa;
import defpackage.mqi;
import defpackage.otk;
import defpackage.ph0;
import defpackage.s17;
import defpackage.tc3;
import defpackage.ty0;
import defpackage.v2k;
import defpackage.wca;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/highlights/gameweek/FantasyGameweekHighlightsActivity;", "Lcom/sofascore/results/tutorial/AbstractTutorialActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyGameweekHighlightsActivity extends Hilt_FantasyGameweekHighlightsActivity {
    public static final /* synthetic */ int Z = 0;
    public final otk T;
    public final joa U;
    public final joa V;
    public final joa W;
    public final joa X;
    public final boolean Y;

    public FantasyGameweekHighlightsActivity() {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.T = new otk(duf.a.getOrCreateKotlinClass(j07.class), new g07(this, i2), new g07(this, i), new g07(this, i3));
        Function0 function0 = new Function0(this) { // from class: e07
            public final /* synthetic */ FantasyGameweekHighlightsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                FantasyGameweekHighlightsActivity fantasyGameweekHighlightsActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent = fantasyGameweekHighlightsActivity.getIntent();
                        intent.getClass();
                        Serializable y = g7a.y(intent, "competition", ev6.class);
                        if (y == null) {
                            a70.p("Serializable competition not found");
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        int i6 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent2 = fantasyGameweekHighlightsActivity.getIntent();
                        intent2.getClass();
                        Serializable y2 = g7a.y(intent2, "roundId", Integer.class);
                        if (y2 == null) {
                            a70.p("Serializable roundId not found");
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        int i7 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent3 = fantasyGameweekHighlightsActivity.getIntent();
                        intent3.getClass();
                        Serializable y3 = g7a.y(intent3, "roundName", String.class);
                        if (y3 == null) {
                            a70.p("Serializable roundName not found");
                            break;
                        } else {
                            break;
                        }
                    default:
                        int i8 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent4 = fantasyGameweekHighlightsActivity.getIntent();
                        intent4.getClass();
                        Serializable y4 = g7a.y(intent4, "roundSequence", Integer.class);
                        if (y4 == null) {
                            a70.p("Serializable roundSequence not found");
                            break;
                        } else {
                            break;
                        }
                }
                return null;
            }
        };
        ysa ysaVar = ysa.c;
        this.U = ypa.a(ysaVar, function0);
        this.V = ypa.a(ysaVar, new Function0(this) { // from class: e07
            public final /* synthetic */ FantasyGameweekHighlightsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                FantasyGameweekHighlightsActivity fantasyGameweekHighlightsActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent = fantasyGameweekHighlightsActivity.getIntent();
                        intent.getClass();
                        Serializable y = g7a.y(intent, "competition", ev6.class);
                        if (y == null) {
                            a70.p("Serializable competition not found");
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        int i6 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent2 = fantasyGameweekHighlightsActivity.getIntent();
                        intent2.getClass();
                        Serializable y2 = g7a.y(intent2, "roundId", Integer.class);
                        if (y2 == null) {
                            a70.p("Serializable roundId not found");
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        int i7 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent3 = fantasyGameweekHighlightsActivity.getIntent();
                        intent3.getClass();
                        Serializable y3 = g7a.y(intent3, "roundName", String.class);
                        if (y3 == null) {
                            a70.p("Serializable roundName not found");
                            break;
                        } else {
                            break;
                        }
                    default:
                        int i8 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent4 = fantasyGameweekHighlightsActivity.getIntent();
                        intent4.getClass();
                        Serializable y4 = g7a.y(intent4, "roundSequence", Integer.class);
                        if (y4 == null) {
                            a70.p("Serializable roundSequence not found");
                            break;
                        } else {
                            break;
                        }
                }
                return null;
            }
        });
        this.W = ypa.a(ysaVar, new Function0(this) { // from class: e07
            public final /* synthetic */ FantasyGameweekHighlightsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                FantasyGameweekHighlightsActivity fantasyGameweekHighlightsActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent = fantasyGameweekHighlightsActivity.getIntent();
                        intent.getClass();
                        Serializable y = g7a.y(intent, "competition", ev6.class);
                        if (y == null) {
                            a70.p("Serializable competition not found");
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        int i6 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent2 = fantasyGameweekHighlightsActivity.getIntent();
                        intent2.getClass();
                        Serializable y2 = g7a.y(intent2, "roundId", Integer.class);
                        if (y2 == null) {
                            a70.p("Serializable roundId not found");
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        int i7 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent3 = fantasyGameweekHighlightsActivity.getIntent();
                        intent3.getClass();
                        Serializable y3 = g7a.y(intent3, "roundName", String.class);
                        if (y3 == null) {
                            a70.p("Serializable roundName not found");
                            break;
                        } else {
                            break;
                        }
                    default:
                        int i8 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent4 = fantasyGameweekHighlightsActivity.getIntent();
                        intent4.getClass();
                        Serializable y4 = g7a.y(intent4, "roundSequence", Integer.class);
                        if (y4 == null) {
                            a70.p("Serializable roundSequence not found");
                            break;
                        } else {
                            break;
                        }
                }
                return null;
            }
        });
        final int i4 = 3;
        this.X = ypa.a(ysaVar, new Function0(this) { // from class: e07
            public final /* synthetic */ FantasyGameweekHighlightsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i4;
                FantasyGameweekHighlightsActivity fantasyGameweekHighlightsActivity = this.b;
                switch (i42) {
                    case 0:
                        int i5 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent = fantasyGameweekHighlightsActivity.getIntent();
                        intent.getClass();
                        Serializable y = g7a.y(intent, "competition", ev6.class);
                        if (y == null) {
                            a70.p("Serializable competition not found");
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        int i6 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent2 = fantasyGameweekHighlightsActivity.getIntent();
                        intent2.getClass();
                        Serializable y2 = g7a.y(intent2, "roundId", Integer.class);
                        if (y2 == null) {
                            a70.p("Serializable roundId not found");
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        int i7 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent3 = fantasyGameweekHighlightsActivity.getIntent();
                        intent3.getClass();
                        Serializable y3 = g7a.y(intent3, "roundName", String.class);
                        if (y3 == null) {
                            a70.p("Serializable roundName not found");
                            break;
                        } else {
                            break;
                        }
                    default:
                        int i8 = FantasyGameweekHighlightsActivity.Z;
                        Intent intent4 = fantasyGameweekHighlightsActivity.getIntent();
                        intent4.getClass();
                        Serializable y4 = g7a.y(intent4, "roundSequence", Integer.class);
                        if (y4 == null) {
                            a70.p("Serializable roundSequence not found");
                            break;
                        } else {
                            break;
                        }
                }
                return null;
            }
        });
        this.Y = true;
    }

    @Override // com.sofascore.results.tutorial.AbstractTutorialActivity
    public final List Q() {
        FantasyGameweekHighlightsPOTGWFragment fantasyGameweekHighlightsPOTGWFragment;
        FantasyGameweekHighlightsTOTGWFragment fantasyGameweekHighlightsTOTGWFragment;
        FantasyGameweekHighlightsPointsFragment fantasyGameweekHighlightsPointsFragment;
        otk otkVar = this.T;
        s17 s17Var = ((j07) otkVar.getValue()).i;
        FantasyGameweekHighlightsRankingsFragment fantasyGameweekHighlightsRankingsFragment = null;
        if (s17Var == null) {
            Intrinsics.i("headFlags");
            throw null;
        }
        boolean z = s17Var.a;
        joa joaVar = this.V;
        if (z) {
            int i = a0().c;
            FantasyCompetitionType fantasyCompetitionType = a0().d;
            int intValue = ((Number) joaVar.getValue()).intValue();
            boolean z2 = a0().A;
            fantasyCompetitionType.getClass();
            fantasyGameweekHighlightsPOTGWFragment = new FantasyGameweekHighlightsPOTGWFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("competitionId", i);
            bundle.putSerializable("competitionType", fantasyCompetitionType);
            bundle.putInt("roundId", intValue);
            bundle.putBoolean("assetsRestricted", z2);
            fantasyGameweekHighlightsPOTGWFragment.setArguments(bundle);
        } else {
            fantasyGameweekHighlightsPOTGWFragment = null;
        }
        s17 s17Var2 = ((j07) otkVar.getValue()).i;
        if (s17Var2 == null) {
            Intrinsics.i("headFlags");
            throw null;
        }
        if (s17Var2.b) {
            ev6 a0 = a0();
            int intValue2 = ((Number) joaVar.getValue()).intValue();
            a0.getClass();
            fantasyGameweekHighlightsTOTGWFragment = new FantasyGameweekHighlightsTOTGWFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("competitionId", a0.c);
            bundle2.putSerializable("competition", a0);
            bundle2.putInt("roundId", intValue2);
            fantasyGameweekHighlightsTOTGWFragment.setArguments(bundle2);
        } else {
            fantasyGameweekHighlightsTOTGWFragment = null;
        }
        s17 s17Var3 = ((j07) otkVar.getValue()).i;
        if (s17Var3 == null) {
            Intrinsics.i("headFlags");
            throw null;
        }
        if (s17Var3.a) {
            int i2 = a0().c;
            FantasyCompetitionType fantasyCompetitionType2 = a0().d;
            int intValue3 = ((Number) joaVar.getValue()).intValue();
            fantasyCompetitionType2.getClass();
            fantasyGameweekHighlightsPointsFragment = new FantasyGameweekHighlightsPointsFragment();
            Bundle bundle3 = new Bundle();
            bundle3.putInt("competitionId", i2);
            bundle3.putSerializable("competitionType", fantasyCompetitionType2);
            bundle3.putInt("roundId", intValue3);
            fantasyGameweekHighlightsPointsFragment.setArguments(bundle3);
        } else {
            fantasyGameweekHighlightsPointsFragment = null;
        }
        s17 s17Var4 = ((j07) otkVar.getValue()).i;
        if (s17Var4 == null) {
            Intrinsics.i("headFlags");
            throw null;
        }
        if (s17Var4.d) {
            int i3 = a0().c;
            FantasyCompetitionType fantasyCompetitionType3 = a0().d;
            int intValue4 = ((Number) joaVar.getValue()).intValue();
            fantasyCompetitionType3.getClass();
            fantasyGameweekHighlightsRankingsFragment = new FantasyGameweekHighlightsRankingsFragment();
            Bundle bundle4 = new Bundle();
            bundle4.putInt("competitionId", i3);
            bundle4.putSerializable("competitionType", fantasyCompetitionType3);
            bundle4.putInt("roundId", intValue4);
            fantasyGameweekHighlightsRankingsFragment.setArguments(bundle4);
        }
        return ph0.x(new AbstractComposeFragment[]{fantasyGameweekHighlightsPOTGWFragment, fantasyGameweekHighlightsTOTGWFragment, fantasyGameweekHighlightsPointsFragment, fantasyGameweekHighlightsRankingsFragment});
    }

    @Override // com.sofascore.results.tutorial.AbstractTutorialActivity
    /* renamed from: S, reason: from getter */
    public final boolean getY() {
        return this.Y;
    }

    @Override // com.sofascore.results.tutorial.AbstractTutorialActivity
    public final f6 T() {
        return new f6(this, 4);
    }

    @Override // com.sofascore.results.tutorial.AbstractTutorialActivity
    public final void U() {
        v2k v2kVar = v2k.a;
    }

    @Override // com.sofascore.results.tutorial.AbstractTutorialActivity
    public final void W() {
        mqi mqiVar = this.M;
        int size = ((List) mqiVar.getValue()).size();
        int i = 0;
        while (i < size) {
            boolean z = i == 0;
            boolean z2 = i == b.i((List) mqiVar.getValue());
            LinearProgressIndicator linearProgressIndicator = new LinearProgressIndicator(this, null);
            linearProgressIndicator.setTrackCornerRadius(((Number) this.O.getValue()).intValue());
            mqi mqiVar2 = this.P;
            linearProgressIndicator.setTrackThickness(((Number) mqiVar2.getValue()).intValue());
            linearProgressIndicator.setTrackColor(getColor(R.color.on_color_secondary));
            linearProgressIndicator.setIndicatorColor(getColor(R.color.on_color_primary));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, ((Number) mqiVar2.getValue()).intValue());
            layoutParams.weight = 1.0f;
            mqi mqiVar3 = this.Q;
            layoutParams.setMarginStart(z ? 0 : ((Number) mqiVar3.getValue()).intValue());
            layoutParams.setMarginEnd(z2 ? 0 : ((Number) mqiVar3.getValue()).intValue());
            linearProgressIndicator.setLayoutParams(layoutParams);
            R().e.addView(linearProgressIndicator);
            i++;
        }
    }

    public final ev6 a0() {
        return (ev6) this.U.getValue();
    }

    @Override // com.sofascore.results.tutorial.AbstractTutorialActivity, com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R().f.setBackground(null);
        R().b.setBackground(null);
        ConstraintLayout constraintLayout = R().a;
        hkj hkjVar = new hkj(this);
        hkjVar.c(new ty0(a0().a), null);
        constraintLayout.setBackground(hkjVar);
        xw3.L(wca.x(getLifecycle()), null, null, new f07(this, null, 2), 3);
        ComposeView composeView = new ComposeView(this, null, 6);
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(1255012173, new d07(this, 0), true));
        R().c.addView(composeView);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "FantasyGameweekHighlightsScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
