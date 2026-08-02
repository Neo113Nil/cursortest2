package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.Money;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Batsman;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.model.mvvm.model.MissingPlayersPair;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamColors;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.mvvm.model.bettingtips.BetBoost;
import com.sofascore.model.mvvm.model.bettingtips.BetBoostParticipant;
import com.sofascore.model.mvvm.model.bettingtips.DroppingOdds;
import com.sofascore.model.mvvm.model.bettingtips.EventBetBoost;
import com.sofascore.model.network.response.MmaPostMatchVote;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.model.newNetwork.StageTeamPlacement;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.profile.PlayerSubscription;
import com.sofascore.model.profile.TeamSubscription;
import com.sofascore.model.profile.UniqueTournamentSubscription;
import com.sofascore.results.R;
import com.sofascore.results.event.commentary.CommentaryGoalModal;
import com.sofascore.results.mma.fightNight.view.MmaFightNightItem;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.FootballPlayAreasView;
import com.sofascore.results.view.follownotification.FollowButton;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vh extends p8 {
    public static final /* synthetic */ int f = 0;
    public final /* synthetic */ int c = 27;
    public final Object d;
    public Object e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(lu1 lu1Var, zl zlVar) {
        super(r0);
        this.e = lu1Var;
        LinearLayout linearLayout = (LinearLayout) zlVar.f;
        linearLayout.getClass();
        this.d = zlVar;
        linearLayout.getClass();
        sea.v(linearLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        aba.y((ConstraintLayout) zlVar.h, 0, 3);
        ConstraintLayout constraintLayout = (ConstraintLayout) zlVar.b;
        aba.y(constraintLayout, 0, 3);
        constraintLayout.setOnClickListener(null);
    }

    public static void f(ss9 ss9Var, int i) {
        ss9Var.c.setVisibility(8);
        ss9Var.e.setVisibility(8);
        ss9Var.f.setVisibility(8);
        ss9Var.b.setVisibility(8);
        ss9Var.d.b.setVisibility(i == 0 ? 0 : 8);
        ConstraintLayout constraintLayout = ss9Var.a;
        constraintLayout.getClass();
        aba.G(constraintLayout);
        constraintLayout.setOnClickListener(null);
    }

    private final void g(int i, int i2, Object obj) {
        q56 q56Var = (q56) obj;
        q56Var.getClass();
        boolean z = q56Var.b;
        dk2 dk2Var = (dk2) this.d;
        LinearLayout linearLayout = dk2Var.b;
        TextView textView = dk2Var.c;
        Context context = this.b;
        if (z) {
            textView.setText(context.getString(R.string.show_less));
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, new oa5(new Drawable[]{context.getDrawable(R.drawable.ic_chevron_down_large_16)}), (Drawable) null);
        } else {
            textView.setText(context.getString(R.string.show_more));
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, context.getDrawable(R.drawable.ic_chevron_down_large_16), (Drawable) null);
        }
        linearLayout.setOnClickListener(new u5(this, i, q56Var, 5));
        linearLayout.getClass();
        sea.v(linearLayout, false, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    private final void h(final int i, int i2, Object obj) {
        final r56 r56Var = (r56) obj;
        r56Var.getClass();
        Context context = this.b;
        boolean c0 = hkg.c0(context);
        e92 e92Var = (e92) this.d;
        ss9 ss9Var = (ss9) e92Var.d;
        ss9Var.b.setVisibility(8);
        ss9 ss9Var2 = (ss9) e92Var.c;
        ConstraintLayout constraintLayout = ss9Var2.a;
        ss9Var2.b.setVisibility(8);
        fmj fmjVar = r56Var.a;
        fmj fmjVar2 = r56Var.b;
        int i3 = r56Var.c;
        ConstraintLayout constraintLayout2 = ss9Var.a;
        if (fmjVar != null) {
            s(ss9Var, fmjVar, new Function0(this) { // from class: dbb
                public final /* synthetic */ vh b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i4 = r4;
                    r56 r56Var2 = r56Var;
                    int i5 = i;
                    vh vhVar = this.b;
                    switch (i4) {
                        case 0:
                            ct8 ct8Var = (ct8) vhVar.e;
                            if (ct8Var != null) {
                                ConstraintLayout constraintLayout3 = ((ss9) ((e92) vhVar.d).d).a;
                                constraintLayout3.getClass();
                                Integer valueOf = Integer.valueOf(i5);
                                r56Var2.e = true;
                                Unit unit = Unit.a;
                                ct8Var.invoke(constraintLayout3, valueOf, r56Var2);
                            }
                            break;
                        default:
                            ct8 ct8Var2 = (ct8) vhVar.e;
                            if (ct8Var2 != null) {
                                ConstraintLayout constraintLayout4 = ((ss9) ((e92) vhVar.d).d).a;
                                constraintLayout4.getClass();
                                Integer valueOf2 = Integer.valueOf(i5);
                                r56Var2.e = false;
                                Unit unit2 = Unit.a;
                                ct8Var2.invoke(constraintLayout4, valueOf2, r56Var2);
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
        } else {
            f(ss9Var, i3);
        }
        FrameLayout frameLayout = (FrameLayout) e92Var.f;
        final int i4 = 1;
        Integer num = c0 ? null : 1;
        frameLayout.setLayoutDirection(num != null ? num.intValue() : 0);
        ss9Var2.f.setGravity(8388613);
        ss9Var2.e.setTextDirection(5);
        if (fmjVar2 != null) {
            s(ss9Var2, fmjVar2, new Function0(this) { // from class: dbb
                public final /* synthetic */ vh b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i42 = i4;
                    r56 r56Var2 = r56Var;
                    int i5 = i;
                    vh vhVar = this.b;
                    switch (i42) {
                        case 0:
                            ct8 ct8Var = (ct8) vhVar.e;
                            if (ct8Var != null) {
                                ConstraintLayout constraintLayout3 = ((ss9) ((e92) vhVar.d).d).a;
                                constraintLayout3.getClass();
                                Integer valueOf = Integer.valueOf(i5);
                                r56Var2.e = true;
                                Unit unit = Unit.a;
                                ct8Var.invoke(constraintLayout3, valueOf, r56Var2);
                            }
                            break;
                        default:
                            ct8 ct8Var2 = (ct8) vhVar.e;
                            if (ct8Var2 != null) {
                                ConstraintLayout constraintLayout4 = ((ss9) ((e92) vhVar.d).d).a;
                                constraintLayout4.getClass();
                                Integer valueOf2 = Integer.valueOf(i5);
                                r56Var2.e = false;
                                Unit unit2 = Unit.a;
                                ct8Var2.invoke(constraintLayout4, valueOf2, r56Var2);
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
        } else {
            f(ss9Var2, i3);
        }
        LinearLayout linearLayout = (LinearLayout) e92Var.e;
        linearLayout.getClass();
        sea.v(linearLayout, false, r56Var.d, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        constraintLayout2.setMinHeight(r56Var.d ? ao2.s(64, context) : ao2.s(56, context));
        constraintLayout.setMinHeight(r56Var.d ? ao2.s(64, context) : ao2.s(56, context));
        constraintLayout2.getClass();
        constraintLayout2.setPaddingRelative(constraintLayout2.getPaddingStart(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingEnd(), r56Var.d ? ao2.s(8, context) : 0);
        constraintLayout.getClass();
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), r56Var.d ? ao2.s(8, context) : 0);
    }

    private final void i(int i, int i2, Object obj) {
        int i3;
        boolean z;
        boolean z2;
        MmaEvent mmaEvent = (MmaEvent) obj;
        mmaEvent.getClass();
        rvk rvkVar = (rvk) this.d;
        MmaFightNightItem mmaFightNightItem = (MmaFightNightItem) rvkVar.c;
        MmaFightNightItem mmaFightNightItem2 = (MmaFightNightItem) rvkVar.b;
        mmaFightNightItem.l(mmaEvent);
        ymc ymcVar = (ymc) this.e;
        g08 g08Var = ymcVar.l;
        boolean z3 = ymcVar.m;
        String str = "";
        boolean z4 = false;
        if (g08Var != g08.d) {
            boolean z5 = i == i2 + (-1);
            mmaFightNightItem.q("");
            View childAt = mmaFightNightItem2.getChildAt(0);
            if (childAt != null) {
                if (z5) {
                    Context context = mmaFightNightItem2.getContext();
                    context.getClass();
                    i3 = ao2.s(8, context);
                } else {
                    i3 = 0;
                }
                childAt.setPaddingRelative(childAt.getPaddingStart(), childAt.getPaddingTop(), childAt.getPaddingEnd(), i3);
            }
            boolean z6 = z5;
            sea.v(mmaFightNightItem2, i == 0, z6, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            mmaFightNightItem2.setBottomDividerVisibility(!z6);
            return;
        }
        boolean z7 = i == 0;
        boolean z8 = i == 1 && z3;
        boolean z9 = z7 || z8 || i == i2 + (-1);
        View childAt2 = mmaFightNightItem2.getChildAt(0);
        Context context2 = this.b;
        if (childAt2 != null) {
            childAt2.setPaddingRelative(childAt2.getPaddingStart(), childAt2.getPaddingTop(), childAt2.getPaddingEnd(), z9 ? ao2.s(8, context2) : 0);
        }
        if (z7 || i == 1 || (i == 2 && z3)) {
            z = z9;
            z2 = true;
        } else {
            z = z9;
            z2 = false;
        }
        sea.v(mmaFightNightItem2, z2, z, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        if (i > 1 && i < i2 - 1) {
            z4 = true;
        }
        mmaFightNightItem2.setBottomDividerVisibility(z4);
        if (z7) {
            str = context2.getString(R.string.main_event);
        } else if (z8) {
            str = context2.getString(R.string.co_main_event);
        }
        str.getClass();
        mmaFightNightItem.q(str);
    }

    private final void j(int i, int i2, Object obj) {
        TvChannel tvChannel = (TvChannel) obj;
        tvChannel.getClass();
        CheckedTextView checkedTextView = (CheckedTextView) ((hcb) this.d).b;
        checkedTextView.setText(tvChannel.getName());
        checkedTextView.setChecked(tvChannel.getIsSelected());
        String countryCode = tvChannel.getCountryCode();
        countryCode.getClass();
        String n = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", countryCode, "/flag");
        ua5 ua5Var = ua5.a;
        int i3 = ((pbd) this.e).l;
        t25.a(i3);
        haa.q(checkedTextView, n, ua5Var, new t25(i3));
    }

    private final void k(int i, int i2, Object obj) {
        xoe xoeVar = (xoe) obj;
        s63 s63Var = (s63) this.d;
        ConstraintLayout constraintLayout = s63Var.b;
        xoeVar.getClass();
        boolean z = ((yoe) this.e).l == i;
        ImageView imageView = s63Var.e;
        TextView textView = s63Var.d;
        constraintLayout.getClass();
        aba.y(constraintLayout, 0, 3);
        constraintLayout.setSelected(z);
        if (z) {
            textView.setTextColor(textView.getContext().getColor(R.color.surface_1));
        } else {
            haa.C(textView);
        }
        ImageView imageView2 = s63Var.c;
        Player player = xoeVar.a;
        as9.l(imageView2, player.getId(), null);
        String C = tba.C(player);
        if (C == null) {
            C = tba.t(player);
        }
        textView.setText(C);
        Team team = player.getTeam();
        if (team == null) {
            team = xoeVar.e;
        }
        if (team == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            as9.o(imageView, team.getId());
        }
    }

    private final void l(int i, int i2, Object obj) {
        nta ntaVar = (nta) obj;
        ntaVar.getClass();
        yda ydaVar = (yda) this.e;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        this.e = null;
        rha.l((r1f) this.d, ntaVar, i + 1, new t1f(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m(int i, int i2, Object obj) {
        String slug;
        rfe rfeVar = (rfe) this.d;
        TextView textView = (TextView) rfeVar.e;
        ImageView imageView = (ImageView) rfeVar.c;
        ImageView imageView2 = (ImageView) rfeVar.d;
        obj.getClass();
        r9f r9fVar = (r9f) this.e;
        if (r9fVar.l) {
            CardView cardView = (CardView) rfeVar.b;
            cardView.setCardBackgroundColor(((Number) r9fVar.m.getValue()).intValue());
            cardView.setCardElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        boolean z = obj instanceof TeamSubscription;
        Context context = this.b;
        if (!z) {
            if (obj instanceof PlayerSubscription) {
                PlayerSubscription playerSubscription = (PlayerSubscription) obj;
                textView.setText(playerSubscription.getName());
                as9.l(imageView, playerSubscription.getId(), null);
                Integer teamId = playerSubscription.getTeamId();
                as9.o(imageView2, teamId != null ? teamId.intValue() : 0);
                imageView2.setImageTintList(null);
                return;
            }
            if (obj instanceof UniqueTournamentSubscription) {
                UniqueTournamentSubscription uniqueTournamentSubscription = (UniqueTournamentSubscription) obj;
                textView.setText(uniqueTournamentSubscription.getName());
                as9.q(imageView, Integer.valueOf(uniqueTournamentSubscription.getId()), uniqueTournamentSubscription.getId(), null);
                Set set = wyh.a;
                Sport sport = uniqueTournamentSubscription.getSport();
                Drawable drawable = context.getDrawable(wyh.a(sport != null ? sport.getSlug() : null));
                apf a = ajh.a(imageView2.getContext());
                ht9 ht9Var = new ht9(imageView2.getContext());
                ht9Var.c = drawable;
                vt9.f(ht9Var, imageView2);
                a.a(ht9Var.a());
                imageView2.setImageTintList(eq3.q(R.color.n_lv_3, context));
                return;
            }
            return;
        }
        TeamSubscription teamSubscription = (TeamSubscription) obj;
        textView.setText(teamSubscription.getName());
        Sport sport2 = teamSubscription.getSport();
        if (sport2 != null && (slug = sport2.getSlug()) != null) {
            Set set2 = wyh.a;
            if (!slug.equals(Sports.MMA)) {
                slug = null;
            }
            if (slug != null) {
                as9.d(imageView, teamSubscription.getId(), teamSubscription.getGender(), true);
                Set set3 = wyh.a;
                Sport sport3 = teamSubscription.getSport();
                Drawable drawable2 = context.getDrawable(wyh.a(sport3 != null ? sport3.getSlug() : null));
                apf a2 = ajh.a(imageView2.getContext());
                ht9 ht9Var2 = new ht9(imageView2.getContext());
                ht9Var2.c = drawable2;
                vt9.f(ht9Var2, imageView2);
                a2.a(ht9Var2.a());
                imageView2.setImageTintList(eq3.q(R.color.n_lv_3, context));
            }
        }
        as9.o(imageView, teamSubscription.getId());
        Set set32 = wyh.a;
        Sport sport32 = teamSubscription.getSport();
        Drawable drawable22 = context.getDrawable(wyh.a(sport32 != null ? sport32.getSlug() : null));
        apf a22 = ajh.a(imageView2.getContext());
        ht9 ht9Var22 = new ht9(imageView2.getContext());
        ht9Var22.c = drawable22;
        vt9.f(ht9Var22, imageView2);
        a22.a(ht9Var22.a());
        imageView2.setImageTintList(eq3.q(R.color.n_lv_3, context));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void n(int i, int i2, Object obj) {
        String y;
        boolean z;
        boolean z2;
        Team transferTo;
        Transfer transfer = (Transfer) obj;
        ArrayList arrayList = ((qzh) this.e).i;
        transfer.getClass();
        nr1 nr1Var = (nr1) this.d;
        TextView textView = (TextView) nr1Var.d;
        ConstraintLayout constraintLayout = (ConstraintLayout) nr1Var.c;
        TextView textView2 = nr1Var.b;
        TextView textView3 = (TextView) nr1Var.i;
        ImageView imageView = (ImageView) nr1Var.f;
        ImageView imageView2 = (ImageView) nr1Var.e;
        long transferDateTimestamp = transfer.getTransferDateTimestamp();
        bi4 bi4Var = bi4.PATTERN_DMY_SHORT;
        ConcurrentHashMap concurrentHashMap = hk4.a;
        String format = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(transferDateTimestamp));
        format.getClass();
        textView.setText(format);
        boolean isManager = transfer.getIsManager();
        Context context = this.b;
        int i3 = 0;
        if (isManager) {
            textView3.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            Integer type = transfer.getType();
            textView3.setText(v8a.B(type != null ? type.intValue() : 0, true, context));
            if (transfer.getTransferFeeRaw() != null) {
                Money transferFeeRaw = transfer.getTransferFeeRaw();
                if ((transferFeeRaw != null ? transferFeeRaw.getValue() : 0) > 0) {
                    Set set = o84.a;
                    Money transferFeeRaw2 = transfer.getTransferFeeRaw();
                    transferFeeRaw2.getClass();
                    y = o84.a(context, transferFeeRaw2, transfer.getTransferDateTimestamp(), 8);
                    textView2.setText(y);
                }
            }
            y = v8a.y(context, transfer.getTransferFeeDescription());
            textView2.setText(y);
        }
        boolean o = c.o(transfer.getToTeamName(), "No team", false);
        qa5 qa5Var = qa5.a;
        if (o) {
            Drawable m = qa5Var.m(context);
            apf a = ajh.a(imageView.getContext());
            ht9 ht9Var = new ht9(imageView.getContext());
            ht9Var.c = m;
            fc6.w(ht9Var, imageView, a);
        } else {
            Team transferTo2 = transfer.getTransferTo();
            if (transferTo2 != null) {
                as9.o(imageView, transferTo2.getId());
                Unit unit = Unit.a;
            } else {
                Drawable m2 = qa5Var.m(context);
                apf a2 = ajh.a(imageView.getContext());
                ht9 ht9Var2 = new ht9(imageView.getContext());
                ht9Var2.c = m2;
                fc6.w(ht9Var2, imageView, a2);
            }
        }
        Object a0 = CollectionsKt.a0(i + 1, arrayList);
        boolean z3 = a0 instanceof Transfer;
        if (!z3 || (transferTo = ((Transfer) a0).getTransferTo()) == null) {
            z = false;
        } else {
            Team transferFrom = transfer.getTransferFrom();
            z = transferFrom != null ? transferFrom.equals(transferTo) : false;
        }
        if (z) {
            imageView2.setVisibility(8);
        } else if (c.o(transfer.getFromTeamName(), "No team", false)) {
            Drawable m3 = qa5Var.m(context);
            apf a3 = ajh.a(imageView2.getContext());
            ht9 ht9Var3 = new ht9(imageView2.getContext());
            ht9Var3.c = m3;
            fc6.w(ht9Var3, imageView2, a3);
        } else {
            imageView2.setVisibility(0);
            Team transferFrom2 = transfer.getTransferFrom();
            if (transferFrom2 != null) {
                as9.o(imageView2, transferFrom2.getId());
            } else {
                Drawable m4 = qa5Var.m(context);
                apf a4 = ajh.a(imageView2.getContext());
                ht9 ht9Var4 = new ht9(imageView2.getContext());
                ht9Var4.c = m4;
                fc6.w(ht9Var4, imageView2, a4);
            }
        }
        Object a02 = CollectionsKt.a0(i - 1, arrayList);
        if (z3) {
            Set a03 = ph0.a0(new Integer[]{null, 241802});
            Team transferTo3 = ((Transfer) a0).getTransferTo();
            if (a03.contains(transferTo3 != null ? Integer.valueOf(transferTo3.getId()) : null)) {
                z2 = true;
                constraintLayout.getClass();
                boolean z4 = a02 instanceof Transfer;
                sea.v(constraintLayout, !z4, !z3, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                int s = z4 ? ao2.s(16, context) : 0;
                if (z3 || (z2 && !z)) {
                    i3 = ao2.s(16, context);
                }
                constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), s, constraintLayout.getPaddingEnd(), i3);
            }
        }
        z2 = false;
        constraintLayout.getClass();
        boolean z42 = a02 instanceof Transfer;
        sea.v(constraintLayout, !z42, !z3, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        if (z42) {
        }
        if (z3) {
        }
        i3 = ao2.s(16, context);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), s, constraintLayout.getPaddingEnd(), i3);
    }

    private final void o(int i, int i2, Object obj) {
        w7i w7iVar = (w7i) obj;
        w7iVar.getClass();
        h04 h04Var = (h04) this.d;
        a8i a8iVar = (a8i) this.e;
        h04Var.d.setText(w7iVar.a);
        h04Var.c.setText(w7iVar.b);
        ConstraintLayout constraintLayout = h04Var.b;
        constraintLayout.getClass();
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), i == i2 + (-1) ? a8iVar.p : a8iVar.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void p(int i, int i2, Object obj) {
        Integer num;
        ArrayList arrayList;
        int i3;
        int i4;
        Iterator it;
        Integer c;
        Double valueOf;
        String str;
        String primary;
        TeamColors teamColors;
        Integer sprintPosition;
        int intValue;
        Integer climbPosition;
        Integer youngRiderPosition;
        y7i y7iVar = (y7i) obj;
        y7iVar.getClass();
        a8i a8iVar = (a8i) this.e;
        tug tugVar = a8iVar.z;
        p12 p12Var = (p12) this.d;
        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) p12Var.g;
        TextView textView = (TextView) p12Var.l;
        ImageView imageView = (ImageView) p12Var.e;
        TextView textView2 = (TextView) p12Var.c;
        tugVar.d(scrollInterceptorHorizontalScrollView);
        ((View) p12Var.d).setVisibility(CollectionsKt.a0(i + 1, a8iVar.i) instanceof y7i ? 0 : 8);
        l3i l3iVar = y7iVar.a;
        Integer num2 = y7iVar.d;
        ArrayList arrayList2 = y7iVar.b;
        List list = y7iVar.c;
        StageStandingsItem stageStandingsItem = l3iVar.a;
        Integer position = stageStandingsItem.getPosition();
        int intValue2 = position != null ? position.intValue() : 0;
        if (Intrinsics.c(a8iVar.m, Sports.CYCLING)) {
            int ordinal = a8iVar.u.ordinal();
            if (ordinal == 1) {
                Integer sprintPosition2 = stageStandingsItem.getSprintPosition();
                if ((sprintPosition2 != null ? sprintPosition2.intValue() : 0) > 0 && (sprintPosition = stageStandingsItem.getSprintPosition()) != null) {
                    intValue = sprintPosition.intValue();
                    intValue2 = intValue;
                }
                intValue2 = 0;
            } else if (ordinal == 2) {
                Integer climbPosition2 = stageStandingsItem.getClimbPosition();
                if ((climbPosition2 != null ? climbPosition2.intValue() : 0) > 0 && (climbPosition = stageStandingsItem.getClimbPosition()) != null) {
                    intValue = climbPosition.intValue();
                    intValue2 = intValue;
                }
                intValue2 = 0;
            } else if (ordinal != 3) {
                Integer position2 = stageStandingsItem.getPosition();
                if (position2 != null) {
                    intValue = position2.intValue();
                    intValue2 = intValue;
                }
                intValue2 = 0;
            } else {
                Integer youngRiderPosition2 = stageStandingsItem.getYoungRiderPosition();
                if ((youngRiderPosition2 != null ? youngRiderPosition2.intValue() : 0) > 0 && (youngRiderPosition = stageStandingsItem.getYoungRiderPosition()) != null) {
                    intValue = youngRiderPosition.intValue();
                    intValue2 = intValue;
                }
                intValue2 = 0;
            }
        }
        int i5 = intValue2;
        ((TextView) p12Var.i).setText(i5 > 0 ? String.valueOf(i5) : "-");
        View view = this.itemView;
        int id = stageStandingsItem.getTeam().getId();
        Integer num3 = a8iVar.v;
        view.setBackgroundColor((num3 != null && id == num3.intValue()) ? a8iVar.w : a8iVar.x);
        Team team = stageStandingsItem.getTeam();
        Context context = this.b;
        textView2.setText(tba.p(context, team));
        textView.setVisibility(stageStandingsItem.getParentTeam() != null ? 0 : 8);
        Team parentTeam = stageStandingsItem.getParentTeam();
        textView.setText(parentTeam != null ? tba.p(context, parentTeam) : null);
        if (cga.z(a8iVar.l) && list == null) {
            imageView.setVisibility(0);
            int i6 = stageStandingsItem.getParentTeam() != null ? R.drawable.player_photo_placeholder : R.drawable.team_logo_placeholder;
            String R = pco.R(stageStandingsItem.getTeam().getId());
            apf a = ajh.a(imageView.getContext());
            num = num2;
            arrayList = arrayList2;
            ht9 ht9Var = new ht9(imageView.getContext());
            ht9Var.c = R;
            vt9.f(ht9Var, imageView);
            awj[] awjVarArr = {new vu2()};
            sl6 sl6Var = st9.a;
            st9.b(ht9Var, ph0.X(awjVarArr));
            vt9.e(ht9Var, i6);
            vt9.a(ht9Var, i6);
            ht9Var.q = jrg.b;
            a.a(ht9Var.a());
            i3 = 8;
        } else {
            num = num2;
            arrayList = arrayList2;
            i3 = 8;
            imageView.setVisibility(8);
        }
        Country country = stageStandingsItem.getTeam().getCountry();
        String alpha2 = country != null ? country.getAlpha2() : null;
        if (alpha2 == null || a8iVar.s != j5i.b) {
            textView2.setCompoundDrawablesRelative(null, null, null, null);
        } else {
            String n = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", alpha2, "/flag");
            ua5 ua5Var = ua5.b;
            int i7 = a8iVar.t;
            t25.a(i7);
            haa.q(textView2, n, ua5Var, new t25(i7));
        }
        Integer previousPosition = stageStandingsItem.getPreviousPosition();
        int intValue3 = previousPosition != null ? previousPosition.intValue() : 0;
        ((ImageView) p12Var.k).setVisibility((intValue3 == 0 || intValue3 <= i5) ? i3 : 0);
        ((ImageView) p12Var.j).setVisibility((intValue3 == 0 || intValue3 >= i5) ? i3 : 0);
        if (cga.z(a8iVar.l)) {
            Team parentTeam2 = stageStandingsItem.getParentTeam();
            if (parentTeam2 == null || (teamColors = parentTeam2.getTeamColors()) == null || (primary = teamColors.getPrimary()) == null) {
                primary = stageStandingsItem.getTeam().getTeamColors().getPrimary();
            }
            if (primary != null) {
                i4 = Color.parseColor(primary);
                if (Color.blue(i4) == 255 && Color.green(i4) == 255 && Color.red(i4) == 255) {
                    i4 = context.getColor(R.color.k_e0);
                }
                ((View) p12Var.h).setBackgroundTintList(ColorStateList.valueOf(i4));
                int m = yid.m(list == null ? Integer.valueOf(list.size()) : null) + arrayList.size();
                it = arrayList.iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        b.q();
                        throw null;
                    }
                    k3i k3iVar = (k3i) next;
                    String str2 = (String) k3iVar.d.invoke(l3iVar.a);
                    if (str2 == null) {
                        str2 = "0";
                    }
                    t(i8, str2, k3iVar == k3i.e, num != null && i8 == num.intValue());
                    i8 = i9;
                }
                if (list != null) {
                    int i10 = 0;
                    for (Object obj2 : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            b.q();
                            throw null;
                        }
                        Stage stage = (Stage) obj2;
                        int size = arrayList.size() + i10;
                        Map map = l3iVar.b;
                        StageTeamPlacement stageTeamPlacement = map != null ? (StageTeamPlacement) map.get(Integer.valueOf(stage.getId())) : null;
                        boolean c2 = Intrinsics.c(stageTeamPlacement != null ? stageTeamPlacement.getStatus() : null, "Out");
                        if (stageTeamPlacement == null || (valueOf = stageTeamPlacement.getPoints()) == null) {
                            valueOf = Double.valueOf(0.0d);
                            if (stageTeamPlacement == null || c2) {
                                valueOf = null;
                            }
                        }
                        if (stageTeamPlacement == null || (str = stageTeamPlacement.getGap()) == null || !c2) {
                            str = null;
                        }
                        if (valueOf != null) {
                            double doubleValue = valueOf.doubleValue();
                            joa joaVar = l5i.a;
                            String valueOf2 = doubleValue % 1.0d == 0.0d ? String.valueOf((int) doubleValue) : String.valueOf(doubleValue);
                            if (valueOf2 != null) {
                                str = valueOf2;
                                t(size, str, false, num != null && size == num.intValue());
                                i10 = i11;
                            }
                        }
                        if (str == null) {
                            str = "-";
                        }
                        if (num != null) {
                            t(size, str, false, num != null && size == num.intValue());
                            i10 = i11;
                        }
                        t(size, str, false, num != null && size == num.intValue());
                        i10 = i11;
                    }
                }
                z8e.J((LinearLayout) p12Var.f, m - 1);
                c = tugVar.c();
                if (c != null) {
                    scrollInterceptorHorizontalScrollView.post(new pn0(scrollInterceptorHorizontalScrollView, c.intValue(), 17));
                }
                tugVar.a(scrollInterceptorHorizontalScrollView, null);
            }
        }
        i4 = 0;
        ((View) p12Var.h).setBackgroundTintList(ColorStateList.valueOf(i4));
        int m2 = yid.m(list == null ? Integer.valueOf(list.size()) : null) + arrayList.size();
        it = arrayList.iterator();
        int i82 = 0;
        while (it.hasNext()) {
        }
        if (list != null) {
        }
        z8e.J((LinearLayout) p12Var.f, m2 - 1);
        c = tugVar.c();
        if (c != null) {
        }
        tugVar.a(scrollInterceptorHorizontalScrollView, null);
    }

    public static final int q(cdi cdiVar) {
        return ((Number) cdiVar.getValue()).intValue();
    }

    public static void s(ss9 ss9Var, fmj fmjVar, Function0 function0) {
        ss9Var.d.b.setVisibility(8);
        ImageView imageView = ss9Var.c;
        as9.l(imageView, fmjVar.a.getId(), null);
        imageView.setVisibility(0);
        TextView textView = ss9Var.e;
        textView.setText(fmjVar.d.b);
        textView.setVisibility(0);
        TextView textView2 = ss9Var.f;
        textView2.setText(tba.C(fmjVar.a));
        textView2.setVisibility(0);
        ConstraintLayout constraintLayout = ss9Var.a;
        constraintLayout.getClass();
        aba.y(constraintLayout, 0, 3);
        constraintLayout.setOnClickListener(new s61(6, function0));
    }

    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0c7d  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0c8d  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0c96  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0c8f  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0c7f  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        boolean z;
        int i3;
        String str;
        String str2;
        String str3;
        String wicketTypeName;
        String concat;
        String wicketTypeName2;
        String concat2;
        String valueOf;
        String i4;
        String Q;
        TextView textView;
        TextView textView2;
        Object obj2;
        int s;
        String slug;
        int i5 = this.c;
        String string = null;
        int i6 = 1;
        Context context = this.b;
        Object obj3 = this.d;
        switch (i5) {
            case 0:
                MissingPlayersPair missingPlayersPair = (MissingPlayersPair) obj;
                missingPlayersPair.getClass();
                bv1 bv1Var = (bv1) obj3;
                xh xhVar = (xh) this.e;
                MissingPlayerData first = missingPlayersPair.getFirst();
                ConstraintLayout constraintLayout = (ConstraintLayout) bv1Var.b;
                LinearLayout linearLayout = (LinearLayout) bv1Var.i;
                xhVar.G(first, constraintLayout, (ImageView) bv1Var.e, (TextView) bv1Var.g, (TextView) bv1Var.c, null, true);
                xhVar.G(missingPlayersPair.getSecond(), (ConstraintLayout) bv1Var.j, (ImageView) bv1Var.f, (TextView) bv1Var.h, (TextView) bv1Var.d, null, true);
                if (i != i2 - 1) {
                    Object obj4 = xhVar.i.get(i + 1);
                    obj4.getClass();
                    if (xhVar.v(obj4) == 4) {
                        z = false;
                        linearLayout.getClass();
                        sea.v(linearLayout, false, z, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), !z ? ao2.s(8, context) : 0);
                        return;
                    }
                }
                z = true;
                linearLayout.getClass();
                sea.v(linearLayout, false, z, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), !z ? ao2.s(8, context) : 0);
                return;
            case 1:
                lt1 lt1Var = (lt1) obj;
                lt1Var.getClass();
                j22 j22Var = (j22) obj3;
                TextView textView3 = (TextView) j22Var.p;
                TextView textView4 = (TextView) j22Var.k;
                View view = j22Var.c;
                ImageView imageView = j22Var.m;
                View view2 = j22Var.n;
                Batsman batsman = lt1Var.c;
                String playerName = batsman.getPlayerName();
                if (playerName == null) {
                    playerName = tba.t(batsman.getPlayer());
                }
                textView3.setText(playerName);
                textView3.setMaxLines(1);
                if (lt1Var.a) {
                    view.setVisibility(0);
                    view2.setVisibility(0);
                    if (lt1Var.b) {
                        view.setBackgroundColor(view.getContext().getColor(R.color.home_primary_highlight));
                        view2.setBackgroundColor(view2.getContext().getColor(R.color.home_primary));
                    } else {
                        view.setBackgroundColor(view.getContext().getColor(R.color.away_primary_highlight));
                        view2.setBackgroundColor(view2.getContext().getColor(R.color.away_primary));
                    }
                    imageView.setImageDrawable((Drawable) this.e);
                    i3 = 0;
                    imageView.setVisibility(0);
                } else {
                    i3 = 0;
                    view.setVisibility(8);
                    view2.setVisibility(8);
                    imageView.setVisibility(8);
                }
                TextView textView5 = j22Var.d;
                Integer score = batsman.getScore();
                if (score == null || (str = String.valueOf(score.intValue())) == null) {
                    str = "-";
                }
                textView5.setText(str);
                TextView textView6 = j22Var.e;
                Integer balls = batsman.getBalls();
                if (balls == null || (str2 = String.valueOf(balls.intValue())) == null) {
                    str2 = "-";
                }
                textView6.setText(str2);
                TextView textView7 = j22Var.f;
                Integer s4 = batsman.getS4();
                if (s4 == null || (str3 = String.valueOf(s4.intValue())) == null) {
                    str3 = "-";
                }
                textView7.setText(str3);
                TextView textView8 = (TextView) j22Var.g;
                Integer s6 = batsman.getS6();
                textView8.setText((s6 == null || (valueOf = String.valueOf(s6.intValue())) == null) ? "-" : valueOf);
                Integer balls2 = batsman.getBalls();
                if ((balls2 != null ? balls2.intValue() : i3) != 0) {
                    r2 = ((batsman.getScore() != null ? r0.intValue() : 0.0d) / (batsman.getBalls() != null ? r0.intValue() : i3)) * 100.0d;
                }
                ((TextView) j22Var.h).setText(yid.c("%.2f", Double.valueOf(r2)));
                String wicketCatchName = batsman.getWicketCatchName();
                if (wicketCatchName == null) {
                    Player wicketCatch = batsman.getWicketCatch();
                    wicketCatchName = wicketCatch != null ? tba.t(wicketCatch) : null;
                }
                String wicketBowlerName = batsman.getWicketBowlerName();
                if (wicketBowlerName == null) {
                    Player wicketBowler = batsman.getWicketBowler();
                    wicketBowlerName = wicketBowler != null ? tba.t(wicketBowler) : null;
                }
                Integer wicketTypeId = batsman.getWicketTypeId();
                if ((wicketTypeId == null || wicketTypeId.intValue() != 1) && (wicketTypeId == null || wicketTypeId.intValue() != 2)) {
                    if (wicketTypeId != null && wicketTypeId.intValue() == 3) {
                        wicketTypeName = wicketCatchName != null ? DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_C.concat(wicketCatchName) : null;
                        if (wicketBowlerName != null) {
                            concat2 = "b ".concat(wicketBowlerName);
                        }
                        concat2 = null;
                    } else if (wicketTypeId != null && wicketTypeId.intValue() == 4) {
                        wicketTypeName = wicketCatchName != null ? "st ".concat(wicketCatchName) : null;
                        if (wicketBowlerName != null) {
                            concat2 = "b ".concat(wicketBowlerName);
                        }
                        concat2 = null;
                    } else if (wicketTypeId != null && wicketTypeId.intValue() == 5) {
                        concat = wicketCatchName != null ? DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_C.concat(wicketCatchName) : null;
                        wicketTypeName2 = batsman.getWicketTypeName();
                    } else {
                        if (wicketTypeId != null && wicketTypeId.intValue() == 6) {
                            wicketTypeName = wicketCatchName != null ? "c & b ".concat(wicketCatchName) : null;
                        } else if (wicketTypeId != null && wicketTypeId.intValue() == 14) {
                            wicketTypeName = wicketCatchName != null ? "c(sub) ".concat(wicketCatchName) : null;
                            if (wicketBowlerName != null) {
                                concat2 = "b ".concat(wicketBowlerName);
                            }
                        } else if (wicketTypeId != null && wicketTypeId.intValue() == 15) {
                            concat = wicketCatchName != null ? "c(sub) ".concat(wicketCatchName) : null;
                            wicketTypeName2 = batsman.getWicketTypeName();
                        } else {
                            wicketTypeName = batsman.getWicketTypeName();
                        }
                        concat2 = null;
                    }
                    TextView textView9 = (TextView) j22Var.l;
                    textView4.setVisibility(wicketTypeName == null ? i3 : 8);
                    if (wicketTypeName == null) {
                        wicketTypeName = "";
                    }
                    textView4.setText(wicketTypeName);
                    textView9.setVisibility(concat2 == null ? i3 : 8);
                    textView9.setText(concat2 != null ? concat2 : "");
                    tgj.m(j22Var, context, new x04());
                    tgj.n(j22Var, lt1Var.d);
                    return;
                }
                concat = wicketBowlerName != null ? "b ".concat(wicketBowlerName) : null;
                wicketTypeName2 = batsman.getWicketTypeName();
                wicketTypeName = concat;
                concat2 = wicketTypeName2;
                TextView textView92 = (TextView) j22Var.l;
                textView4.setVisibility(wicketTypeName == null ? i3 : 8);
                if (wicketTypeName == null) {
                }
                textView4.setText(wicketTypeName);
                textView92.setVisibility(concat2 == null ? i3 : 8);
                textView92.setText(concat2 != null ? concat2 : "");
                tgj.m(j22Var, context, new x04());
                tgj.n(j22Var, lt1Var.d);
                return;
            case 2:
                fu1 fu1Var = (fu1) obj;
                fu1Var.getClass();
                EventBetBoost eventBetBoost = fu1Var.a;
                zl zlVar = (zl) obj3;
                TextView textView10 = (TextView) zlVar.m;
                LinearLayout linearLayout2 = (LinearLayout) zlVar.e;
                TextView textView11 = (TextView) zlVar.k;
                long startTimestamp = eventBetBoost.getEvent().getStartTimestamp();
                context.getClass();
                String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
                bestPattern.getClass();
                fn0.u(startTimestamp, hk4.a(bestPattern), textView10);
                ((ConstraintLayout) zlVar.h).setOnClickListener(new qh(7, this, eventBetBoost, (lu1) this.e));
                Team homeTeam$default = Event.getHomeTeam$default(eventBetBoost.getEvent(), null, 1, null);
                Team awayTeam$default = Event.getAwayTeam$default(eventBetBoost.getEvent(), null, 1, null);
                zlVar.g.setText(tba.A(context, homeTeam$default));
                ((TextView) zlVar.n).setText(qea.K(tba.A(context, awayTeam$default), eventBetBoost.getEvent().shouldReverseTeams()));
                as9.p((ImageView) zlVar.c, homeTeam$default, true);
                as9.p((ImageView) zlVar.d, awayTeam$default, true);
                BetBoost betBoost = (BetBoost) CollectionsKt.a0(0, eventBetBoost.getBetBoosts());
                if (betBoost != null) {
                    textView11.setText(rld.m(context, betBoost.getUnboostedOddsFractional()));
                    ((TextView) zlVar.j).setText(rld.m(context, betBoost.getOddsFractional()));
                    textView11.setPaintFlags(textView11.getPaintFlags() | 16);
                    linearLayout2.removeAllViews();
                    int i7 = 0;
                    for (Object obj5 : betBoost.getBetBoostParticipants()) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            b.q();
                            throw null;
                        }
                        BetBoostParticipant betBoostParticipant = (BetBoostParticipant) obj5;
                        View inflate = LayoutInflater.from(context).inflate(R.layout.bet_boost_participant, (ViewGroup) null, false);
                        int i9 = R.id.barrier;
                        if (((Barrier) nq8.B(R.id.barrier, inflate)) != null) {
                            i9 = R.id.connector_line;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.connector_line, inflate);
                            if (imageView2 != null) {
                                i9 = R.id.connector_line_extra;
                                if (((ImageView) nq8.B(R.id.connector_line_extra, inflate)) != null) {
                                    i9 = R.id.dot_img;
                                    if (((ImageView) nq8.B(R.id.dot_img, inflate)) != null) {
                                        i9 = R.id.participant_text;
                                        TextView textView12 = (TextView) nq8.B(R.id.participant_text, inflate);
                                        if (textView12 != null) {
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                            textView12.setText(StringsKt.l0(betBoostParticipant.getName()).toString());
                                            imageView2.setVisibility(i7 != betBoost.getBetBoostParticipants().size() + (-1) ? 0 : 8);
                                            linearLayout2.addView(constraintLayout2);
                                            i7 = i8;
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i9)));
                        return;
                    }
                    ((ConstraintLayout) zlVar.b).setOnClickListener(new cn(13, this, betBoost));
                    return;
                }
                return;
            case 3:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                mg2 mg2Var = (mg2) this.e;
                zonedDateTime.getClass();
                long epochSecond = zonedDateTime.toEpochSecond();
                pu1 pu1Var = (pu1) obj3;
                TextView textView13 = pu1Var.e;
                if (fc6.B(fc6.t(Instant.ofEpochSecond(epochSecond)))) {
                    i4 = context.getString(R.string.today);
                } else {
                    bi4 bi4Var = bi4.PATTERN_DAY_SHORT;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    i4 = fc6.i(epochSecond, hk4.a(bi4Var.d()));
                }
                textView13.setText(i4);
                if (i == mg2Var.m) {
                    haa.G(textView13);
                } else {
                    haa.D(textView13);
                }
                pu1Var.c.setVisibility(i == mg2Var.m ? 0 : 8);
                TextView textView14 = pu1Var.d;
                bi4 bi4Var2 = bi4.PATTERN_DMM;
                ConcurrentHashMap concurrentHashMap2 = hk4.a;
                fn0.u(epochSecond, hk4.a(bi4Var2.d()), textView14);
                return;
            case 4:
                com.sofascore.model.Country country = (com.sofascore.model.Country) obj;
                country.getClass();
                pn2 pn2Var = (pn2) obj3;
                as9.c(pn2Var.c, country.getIso2Alpha(), false, null, 6);
                pn2Var.e.setText(tv3.c(context, country.getName()));
                pn2Var.d.setVisibility(((on2) this.e).l.contains(country) ? 0 : 8);
                return;
            case 5:
                e43 e43Var = (e43) obj;
                e43Var.getClass();
                v82 v82Var = (v82) obj3;
                CommentaryGoalModal commentaryGoalModal = (CommentaryGoalModal) this.e;
                joa joaVar = commentaryGoalModal.x;
                ImageView imageView3 = (ImageView) v82Var.d;
                ImageView imageView4 = (ImageView) v82Var.g;
                TextView textView15 = (TextView) v82Var.e;
                TextView textView16 = (TextView) v82Var.f;
                Player player = e43Var.a;
                boolean z2 = e43Var.f;
                as9.l(imageView3, player.getId(), null);
                TextView textView17 = (TextView) v82Var.c;
                String jerseyNumber = player.getJerseyNumber();
                String str4 = jerseyNumber != null ? jerseyNumber : "";
                textView17.setText(StringsKt.l0(str4 + " " + tba.t(player)).toString());
                as9.o(imageView4, e43Var.b);
                imageView4.setOnClickListener(new cn(17, this, e43Var));
                if (e43Var.d) {
                    u(v82Var, true);
                    textView15.setVisibility(0);
                    textView16.setVisibility(0);
                    Integer num = e43Var.c;
                    textView15.setText(num != null ? mz1.i(num.intValue(), "'") : " - ");
                    qa5 qa5Var = qa5.a;
                    Drawable e = z2 ? qa5Var.e(context) : qa5Var.h(context);
                    ua5 ua5Var = ua5.a;
                    Integer valueOf2 = Integer.valueOf(((Number) joaVar.getValue()).intValue());
                    haa.K(textView15, e, ua5Var, valueOf2, valueOf2);
                    haa.K(textView16, null, ua5Var, null, null);
                    int i10 = R.string.scorer;
                    textView16.setText(R.string.scorer);
                    if (z2) {
                        i10 = R.string.own_goal;
                    }
                    textView16.setText(i10);
                } else if (e43Var.e) {
                    u(v82Var, true);
                    textView15.setVisibility(8);
                    textView16.setVisibility(0);
                    haa.L(textView16, Integer.valueOf(R.drawable.ic_football_assist_16), ua5.a, Integer.valueOf(((Number) joaVar.getValue()).intValue()));
                    textView16.setText(R.string.assistant);
                } else {
                    u(v82Var, false);
                    textView15.setVisibility(8);
                    textView16.setVisibility(8);
                }
                ((MaterialDivider) v82Var.h).setVisibility((i == i2 + (-1) || ((b43) commentaryGoalModal.z.getValue()).getItemViewType(i + 1) != 1) ? 8 : 0);
                return;
            case 6:
                ba3 ba3Var = (ba3) obj;
                ba3Var.getClass();
                z82 z82Var = (z82) obj3;
                ca3 ca3Var = (ca3) this.e;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) z82Var.b;
                constraintLayout3.getClass();
                Object a0 = CollectionsKt.a0(i + 1, ca3Var.i);
                sea.v(constraintLayout3, false, a0 == null || (a0 instanceof w93), 24, 4, 0, null, 112);
                TextView textView18 = (TextView) z82Var.d;
                textView18.setText(ba3Var.b);
                ImageView imageView5 = (ImageView) z82Var.g;
                boolean z3 = ba3Var.e;
                if (z3) {
                    as9.q(imageView5, Integer.valueOf(ba3Var.a), 0, null);
                }
                imageView5.setVisibility(!z3 ? 4 : 0);
                if (ba3Var.d) {
                    haa.B(textView18);
                } else {
                    haa.C(textView18);
                }
                ImageView imageView6 = (ImageView) z82Var.e;
                imageView6.setImageDrawable(ba3Var.c ? ca3Var.s : ca3Var.t);
                imageView6.setOnClickListener(new qh(11, imageView6, ca3Var, ba3Var));
                return;
            case 7:
                cyd cydVar = (cyd) obj;
                cydVar.getClass();
                zxd zxdVar = (zxd) obj3;
                ConstraintLayout constraintLayout4 = zxdVar.b;
                constraintLayout4.setTag("CRICKET_SUMMARY_TAG");
                constraintLayout4.getClass();
                aba.H(constraintLayout4);
                as9.l(zxdVar.e, cydVar.a, null);
                as9.o(zxdVar.h, cydVar.c);
                zxdVar.j.setText(cydVar.b);
                TextView textView19 = zxdVar.i;
                textView19.setVisibility(cydVar.d ? 0 : 8);
                Q = hkg.Q(context, R.string.substituted_out, cydVar.g, new Object[0]);
                textView19.setText(Q);
                int i11 = 0;
                for (Object obj6 : (List) this.e) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        b.q();
                        throw null;
                    }
                    TextView textView20 = (TextView) obj6;
                    String str5 = (String) CollectionsKt.a0(i11, cydVar.e);
                    g04 g04Var = (g04) CollectionsKt.a0(i11, cydVar.f.c);
                    if (g04Var == null || str5 == null) {
                        textView20.getClass();
                        textView20.setVisibility(8);
                    } else {
                        textView20.getClass();
                        textView20.setVisibility(0);
                        textView20.setText(str5);
                        ViewGroup.LayoutParams layoutParams = textView20.getLayoutParams();
                        if (layoutParams == null) {
                            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            return;
                        }
                        tl3 tl3Var = (tl3) layoutParams;
                        tl3Var.H = g04Var.b;
                        tl3Var.P = ao2.s(g04Var.c, context);
                        textView20.setLayoutParams(tl3Var);
                    }
                    i11 = i12;
                }
                return;
            case 8:
                td6 td6Var = (td6) obj;
                td6Var.getClass();
                js2 js2Var = (js2) obj3;
                zl zlVar2 = (zl) js2Var.g;
                TextView textView21 = (TextView) js2Var.c;
                TextView textView22 = (TextView) js2Var.b;
                TextView textView23 = (TextView) js2Var.e;
                TextView textView24 = (TextView) js2Var.o;
                TextView textView25 = js2Var.d;
                TextView textView26 = (TextView) js2Var.j;
                TextView textView27 = (TextView) js2Var.l;
                TextView textView28 = (TextView) js2Var.h;
                TextView textView29 = (TextView) js2Var.m;
                lrj lrjVar = td6Var.b;
                Event event = td6Var.a;
                r4a.r(zlVar2, lrjVar);
                ((LinearLayout) zlVar2.f).setOnClickListener(new cn(27, this, td6Var));
                textView25.setTextDirection(((LinearLayout) js2Var.i).getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? 4 : 3);
                textView25.setText(rik.s(event.getStartTimestamp(), context));
                Team homeTeam$default2 = Event.getHomeTeam$default(event, null, 1, null);
                Team awayTeam$default2 = Event.getAwayTeam$default(event, null, 1, null);
                ((TextView) js2Var.k).setText(v8a.x(context, homeTeam$default2));
                ((TextView) js2Var.f).setText(v8a.x(context, awayTeam$default2));
                DroppingOdds droppingOdds = td6Var.c;
                if (droppingOdds != null) {
                    id5 id5Var = (id5) this.e;
                    List<OddsChoice> choicesReversible = droppingOdds.getOdds().getChoicesReversible();
                    int size = choicesReversible.size();
                    LinearLayout linearLayout3 = (LinearLayout) js2Var.n;
                    if (size == 2) {
                        linearLayout3.setVisibility(8);
                        textView24.setVisibility(8);
                        textView2 = textView29;
                    } else {
                        linearLayout3.setVisibility(0);
                        textView24.setVisibility(0);
                        OddsChoice oddsChoice = (OddsChoice) CollectionsKt.a0(1, choicesReversible);
                        l4a.K(textView23, rld.m(context, oddsChoice != null ? oddsChoice.getInitialFractionalValue() : null));
                        OddsChoice oddsChoice2 = (OddsChoice) CollectionsKt.a0(1, choicesReversible);
                        textView2 = textView29;
                        l4a.K(textView2, rld.m(context, oddsChoice2 != null ? oddsChoice2.getFractionalValue() : null));
                    }
                    OddsChoice oddsChoice3 = (OddsChoice) CollectionsKt.firstOrNull(choicesReversible);
                    l4a.K(textView22, rld.m(context, oddsChoice3 != null ? oddsChoice3.getInitialFractionalValue() : null));
                    OddsChoice oddsChoice4 = (OddsChoice) CollectionsKt.j0(choicesReversible);
                    l4a.K(textView21, rld.m(context, oddsChoice4 != null ? oddsChoice4.getInitialFractionalValue() : null));
                    OddsChoice oddsChoice5 = (OddsChoice) CollectionsKt.firstOrNull(choicesReversible);
                    l4a.K(textView28, rld.m(context, oddsChoice5 != null ? oddsChoice5.getFractionalValue() : null));
                    OddsChoice oddsChoice6 = (OddsChoice) CollectionsKt.j0(choicesReversible);
                    l4a.K(textView27, rld.m(context, oddsChoice6 != null ? oddsChoice6.getFractionalValue() : null));
                    textView = textView26;
                    me4.s(new Object[]{Float.valueOf(droppingOdds.getPercentage())}, 1, dla.d(), "%.1f%%", textView);
                    int i13 = droppingOdds.getPercentage() < 15.0f ? id5Var.m : droppingOdds.getPercentage() < 20.0f ? id5Var.l : id5Var.n;
                    textView.setTextColor(i13);
                    textView28.setTextAppearance(R.style.DisplayMicro);
                    textView2.setTextAppearance(R.style.DisplayMicro);
                    textView27.setTextAppearance(R.style.DisplayMicro);
                    String choiceName$default = DroppingOdds.getChoiceName$default(droppingOdds, null, 1, null);
                    if (choiceName$default != null) {
                        int hashCode = choiceName$default.hashCode();
                        if (hashCode != 49) {
                            if (hashCode != 50) {
                                if (hashCode == 88 && choiceName$default.equals("X")) {
                                    textView2.setTextAppearance(R.style.AssistiveDefault);
                                    textView2.setTextColor(i13);
                                    obj2 = textView2;
                                    if (obj2 != null) {
                                        return;
                                    }
                                }
                            } else if (choiceName$default.equals("2")) {
                                textView27.setTextAppearance(R.style.AssistiveDefault);
                                textView27.setTextColor(i13);
                                obj2 = textView27;
                                if (obj2 != null) {
                                }
                            }
                        } else if (choiceName$default.equals("1")) {
                            textView28.setTextAppearance(R.style.AssistiveDefault);
                            textView28.setTextColor(i13);
                            obj2 = textView28;
                            if (obj2 != null) {
                            }
                        }
                    }
                    obj2 = Unit.a;
                    if (obj2 != null) {
                    }
                } else {
                    textView = textView26;
                    textView2 = textView29;
                }
                textView28.setText("-");
                textView27.setText("-");
                textView2.setText("-");
                textView22.setText("-");
                textView23.setText("-");
                textView21.setText("-");
                textView.setText("-");
                Unit unit = Unit.a;
                return;
            case 9:
                hj5 hj5Var = (hj5) obj;
                hj5Var.getClass();
                ComposeView composeView = (ComposeView) obj3;
                pj5 pj5Var = (pj5) this.e;
                if (composeView.isAttachedToWindow()) {
                    ViewGroup.LayoutParams layoutParams2 = composeView.getLayoutParams();
                    if (layoutParams2 == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    }
                    layoutParams2.height = -1;
                    ViewParent parent = composeView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    layoutParams2.width = viewGroup != null ? viewGroup.getWidth() - (pj5Var.l * 2) : -1;
                    composeView.setLayoutParams(layoutParams2);
                } else {
                    composeView.addOnAttachStateChangeListener(new jf(composeView, this, pj5Var, i6));
                }
                composeView.setContent(new tc3(-35106600, new ij5(pj5Var, hj5Var, i, i2, 0), true));
                return;
            case 10:
                z33 z33Var = (z33) obj;
                z33Var.getClass();
                e(i, z33Var, false);
                return;
            case 11:
                gc6 gc6Var = (gc6) obj;
                nb6 nb6Var = (nb6) this.e;
                ez0 ez0Var = (ez0) obj3;
                ConstraintLayout constraintLayout5 = (ConstraintLayout) ez0Var.b;
                gc6Var.getClass();
                boolean z4 = i == i2 + (-1);
                constraintLayout5.getClass();
                sea.v(constraintLayout5, false, z4, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                constraintLayout5.getClass();
                ViewGroup.LayoutParams layoutParams3 = constraintLayout5.getLayoutParams();
                if (layoutParams3 == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                boolean z5 = nb6Var.m;
                int s2 = z5 ? 0 : ao2.s(8, context);
                s = z5 ? 0 : ao2.s(8, context);
                int i14 = marginLayoutParams.topMargin;
                int i15 = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(s2);
                marginLayoutParams.topMargin = i14;
                marginLayoutParams.setMarginEnd(s);
                marginLayoutParams.bottomMargin = i15;
                constraintLayout5.setLayoutParams(marginLayoutParams);
                ((FootballPlayAreasView) ez0Var.e).h(gc6Var, jk8.c, z5);
                return;
            case 12:
                db6 db6Var = (db6) obj;
                db6Var.getClass();
                ed edVar = (ed) obj3;
                z3f z3fVar = (z3f) edVar.c;
                FrameLayout frameLayout = (FrameLayout) edVar.b;
                ((TextView) z3fVar.d).setText(db6Var.a);
                LinearLayout linearLayout4 = (LinearLayout) z3fVar.b;
                linearLayout4.getClass();
                ViewGroup.LayoutParams layoutParams4 = linearLayout4.getLayoutParams();
                if (layoutParams4 == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams2.width = -1;
                marginLayoutParams2.setMarginStart(ao2.s(12, context));
                marginLayoutParams2.setMarginEnd(ao2.s(12, context));
                linearLayout4.setLayoutParams(marginLayoutParams2);
                TextView textView30 = (TextView) z3fVar.d;
                ViewGroup.LayoutParams layoutParams5 = textView30.getLayoutParams();
                if (layoutParams5 == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5;
                marginLayoutParams3.width = -1;
                textView30.setLayoutParams(marginLayoutParams3);
                frameLayout.getClass();
                sea.v(frameLayout, false, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                boolean z6 = ((nb6) this.e).m;
                ViewGroup.LayoutParams layoutParams6 = frameLayout.getLayoutParams();
                if (layoutParams6 == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams6;
                int s3 = z6 ? 0 : ao2.s(8, context);
                s = z6 ? 0 : ao2.s(8, context);
                int i16 = marginLayoutParams4.topMargin;
                int i17 = marginLayoutParams4.bottomMargin;
                marginLayoutParams4.setMarginStart(s3);
                marginLayoutParams4.topMargin = i16;
                marginLayoutParams4.setMarginEnd(s);
                marginLayoutParams4.bottomMargin = i17;
                frameLayout.setLayoutParams(marginLayoutParams4);
                return;
            case 13:
                gi6 gi6Var = (gi6) this.e;
                obj.getClass();
                tm5 tm5Var = (tm5) obj3;
                GraphicLarge graphicLarge = tm5Var.c;
                String string2 = obj == ei6.a ? context.getString(R.string.matches_favourites_empty) : obj == ei6.c ? context.getString(R.string.recommended_nothing_else_to_show) : context.getString(R.string.matches_recommended_empty);
                string2.getClass();
                graphicLarge.setSubtitleResource(string2);
                ConstraintLayout constraintLayout6 = (ConstraintLayout) graphicLarge.d.b;
                constraintLayout6.getClass();
                constraintLayout6.setPaddingRelative(constraintLayout6.getPaddingStart(), 0, constraintLayout6.getPaddingEnd(), constraintLayout6.getPaddingBottom());
                FrameLayout frameLayout2 = tm5Var.b;
                frameLayout2.getClass();
                sea.v(frameLayout2, false, gi6Var.P(i), gi6Var.r, 6, 0, null, 112);
                return;
            case 14:
                ((Number) obj).intValue();
                ez0 ez0Var2 = (ez0) obj3;
                TextView textView31 = (TextView) ez0Var2.e;
                TextView textView32 = (TextView) ez0Var2.d;
                hwg hwgVar = ((qs7) this.e).l;
                int ordinal = hwgVar.ordinal();
                textView31.setText(ordinal != 1 ? ordinal != 2 ? ordinal != 4 ? context.getString(R.string.add_items_to_favourites) : context.getString(R.string.select_favourite_competitions) : context.getString(R.string.select_favourite_athletes) : context.getString(R.string.select_favourite_teams));
                int ordinal2 = hwgVar.ordinal();
                if (ordinal2 == 0) {
                    string = context.getString(R.string.add_items_to_favourites_description);
                } else if (ordinal2 == 1) {
                    string = context.getString(R.string.select_favourite_teams_description);
                } else if (ordinal2 == 2) {
                    string = context.getString(R.string.select_favourite_athletes_description);
                } else if (ordinal2 == 4) {
                    string = context.getString(R.string.select_favourite_competitions_description);
                }
                textView32.setText(string);
                textView32.setVisibility(string != null ? 0 : 8);
                s02.R((z82) ez0Var2.c, context);
                return;
            case 15:
                Team team = (Team) obj;
                z82 z82Var2 = (z82) obj3;
                TextView textView33 = (TextView) z82Var2.d;
                AppCompatImageView appCompatImageView = (AppCompatImageView) z82Var2.c;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) z82Var2.e;
                team.getClass();
                Sport sport = team.getSport();
                if (sport != null && (slug = sport.getSlug()) != null) {
                    Set set = wyh.a;
                    if (!slug.equals(Sports.MMA)) {
                        slug = null;
                    }
                    if (slug != null) {
                        as9.d(appCompatImageView2, team.getId(), team.getGender(), true);
                        if (Intrinsics.c(((vs7) this.e).o, "")) {
                            appCompatImageView.setVisibility(8);
                            textView33.setVisibility(8);
                        } else {
                            appCompatImageView.setVisibility(0);
                            textView33.setVisibility(0);
                            Set set2 = wyh.a;
                            appCompatImageView.setImageResource(wyh.a(team.getSportSlug()));
                            textView33.setText(wyh.c(context, team.getSportSlug()));
                        }
                        TextView textView34 = (TextView) z82Var2.g;
                        context.getClass();
                        String p = tba.p(context, team);
                        if (qea.y(team) && team.getSport() != null) {
                            Set set3 = wyh.a;
                            if (!wyh.e(team.getSportSlug())) {
                                p = wv8.i(p, " ", context.getString(R.string.female_team));
                            }
                        }
                        textView34.setText(p);
                        FollowButton followButton = (FollowButton) z82Var2.f;
                        int i18 = FollowButton.i;
                        followButton.e(team, null, null);
                        return;
                    }
                }
                as9.o(appCompatImageView2, team.getId());
                if (Intrinsics.c(((vs7) this.e).o, "")) {
                }
                TextView textView342 = (TextView) z82Var2.g;
                context.getClass();
                String p2 = tba.p(context, team);
                if (qea.y(team)) {
                    Set set32 = wyh.a;
                    if (!wyh.e(team.getSportSlug())) {
                    }
                }
                textView342.setText(p2);
                FollowButton followButton2 = (FollowButton) z82Var2.f;
                int i182 = FollowButton.i;
                followButton2.e(team, null, null);
                return;
            case 16:
                bz9 bz9Var = (bz9) obj;
                bz9Var.getClass();
                sea.v(((esk) obj3).a, bz9Var.a, bz9Var.b, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                ((eoh) ((e1d) this.e)).setValue(bz9Var);
                return;
            case 17:
                Round round = (Round) obj;
                round.getClass();
                o16 o16Var = (o16) obj3;
                TextView textView35 = o16Var.c;
                Regex regex = d7g.a;
                textView35.setText(d7g.b(context, round, false, (String) this.e));
                FrameLayout frameLayout3 = o16Var.b;
                frameLayout3.getClass();
                sea.v(frameLayout3, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return;
            case 18:
                g(i, i2, obj);
                return;
            case 19:
                h(i, i2, obj);
                return;
            case 20:
                qlc qlcVar = (qlc) obj;
                qlcVar.getClass();
                d(i, i2, qlcVar, false);
                return;
            case 21:
                i(i, i2, obj);
                return;
            case 22:
                j(i, i2, obj);
                return;
            case 23:
                k(i, i2, obj);
                return;
            case 24:
                l(i, i2, obj);
                return;
            case 25:
                m(i, i2, obj);
                return;
            case 26:
                n(i, i2, obj);
                return;
            case 27:
                o(i, i2, obj);
                return;
            case 28:
                p(i, i2, obj);
                return;
            default:
                i8i i8iVar = (i8i) obj;
                i8iVar.getClass();
                t22 t22Var = (t22) obj3;
                TextView textView36 = t22Var.c;
                LinearLayout linearLayout5 = t22Var.b;
                textView36.setText(i8iVar.a);
                TextView textView37 = t22Var.d;
                textView37.setText(i8iVar.b);
                if (i8iVar.c) {
                    textView37.setTextColor(textView37.getContext().getColor(R.color.surface_1));
                    textView37.setBackgroundResource(R.drawable.bg_driver_stat_bubble);
                } else {
                    haa.C(textView37);
                    textView37.setPadding(0, 0, 0, 0);
                    textView37.setBackground(null);
                }
                boolean z7 = i == 0;
                boolean z8 = CollectionsKt.a0(i + 1, ((l8i) this.e).i) == null;
                linearLayout5.getClass();
                sea.v(linearLayout5, z7, z8, 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                linearLayout5.setPaddingRelative(linearLayout5.getPaddingStart(), z7 ? ao2.s(8, context) : 0, linearLayout5.getPaddingEnd(), z8 ? ao2.s(8, context) : 0);
                return;
        }
    }

    @Override // defpackage.p8
    public void c(int i, int i2, Object obj) {
        switch (this.c) {
            case 10:
                z33 z33Var = (z33) obj;
                z33Var.getClass();
                e(i, z33Var, true);
                break;
            case 20:
                qlc qlcVar = (qlc) obj;
                qlcVar.getClass();
                d(i, i2, qlcVar, true);
                break;
            default:
                super.c(i, i2, obj);
                break;
        }
    }

    public void d(int i, int i2, qlc qlcVar, final boolean z) {
        sc scVar = (sc) this.d;
        View view = scVar.n;
        jlc jlcVar = (jlc) scVar.o;
        lsc lscVar = (lsc) scVar.p;
        lsc lscVar2 = (lsc) scVar.b;
        TextView textView = scVar.h;
        TextView textView2 = scVar.d;
        ShapeableImageView shapeableImageView = (ShapeableImageView) scVar.e;
        ShapeableImageView shapeableImageView2 = (ShapeableImageView) scVar.c;
        ConstraintLayout constraintLayout = (ConstraintLayout) scVar.l;
        Context context = this.b;
        if (i == 0) {
            constraintLayout.getClass();
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(ao2.s(8, context));
                constraintLayout.setLayoutParams(marginLayoutParams);
            }
        } else if (i == i2 - 1) {
            constraintLayout.getClass();
            ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
            if (layoutParams2 == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginEnd(ao2.s(8, context));
                constraintLayout.setLayoutParams(marginLayoutParams2);
            }
        } else {
            constraintLayout.getClass();
            ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
            if (layoutParams3 == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.setMarginStart(ao2.s(4, context));
            marginLayoutParams3.setMarginEnd(ao2.s(4, context));
            constraintLayout.setLayoutParams(marginLayoutParams3);
        }
        final MmaEvent mmaEvent = qlcVar.a;
        fqc fqcVar = qlcVar.b;
        as9.d(shapeableImageView2, Event.getHomeTeam$default(mmaEvent, null, 1, null).getId(), Event.getHomeTeam$default(mmaEvent, null, 1, null).getGender(), false);
        as9.d(shapeableImageView, Event.getAwayTeam$default(mmaEvent, null, 1, null).getId(), Event.getAwayTeam$default(mmaEvent, null, 1, null).getGender(), false);
        textView2.setText(tba.A(context, Event.getHomeTeam$default(mmaEvent, null, 1, null)));
        textView.setText(tba.A(context, Event.getAwayTeam$default(mmaEvent, null, 1, null)));
        lscVar2.c.setVisibility(8);
        lscVar.c.setVisibility(8);
        jlcVar.d.setVisibility(8);
        textView2.setAlpha(1.0f);
        textView.setAlpha(1.0f);
        shapeableImageView2.setAlpha(1.0f);
        shapeableImageView.setAlpha(1.0f);
        if (!tnf.r(mmaEvent) || fqcVar.b != null) {
            MmaPostMatchVote mmaPostMatchVote = fqcVar.a;
            final MmaPostMatchVotingOptions mmaPostMatchVotingOptions = fqcVar.b;
            final int vote1 = mmaPostMatchVote.getVote1();
            final int vote2 = mmaPostMatchVote.getVote2();
            r(false, mmaPostMatchVotingOptions != null);
            constraintLayout.post(new Runnable() { // from class: flc
                @Override // java.lang.Runnable
                public final void run() {
                    float b;
                    vh vhVar = vh.this;
                    sc scVar2 = (sc) vhVar.d;
                    Context context2 = vhVar.b;
                    View view2 = scVar2.n;
                    aba.y(view2, 0, 3);
                    view2.setOnClickListener(new au7(vhVar, mmaEvent, 21));
                    if (z) {
                        hxj.a((ConstraintLayout) scVar2.l, null);
                    }
                    TextView textView3 = scVar2.j;
                    MmaPostMatchVotingOptions mmaPostMatchVotingOptions2 = MmaPostMatchVotingOptions.FIRST_FIGHTER_WIN;
                    MmaPostMatchVotingOptions mmaPostMatchVotingOptions3 = mmaPostMatchVotingOptions;
                    String string = mmaPostMatchVotingOptions3 == mmaPostMatchVotingOptions2 ? context2.getString(R.string.plus_you) : "";
                    StringBuilder sb = new StringBuilder();
                    int i3 = vote1;
                    sb.append(i3);
                    sb.append(string);
                    textView3.setText(sb.toString());
                    View view3 = scVar2.f;
                    ViewGroup.LayoutParams layoutParams4 = view3.getLayoutParams();
                    if (layoutParams4 == null) {
                        yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        return;
                    }
                    tl3 tl3Var = (tl3) layoutParams4;
                    float f2 = i3;
                    int i4 = vote2;
                    float f3 = i4;
                    float f4 = f2 + f3;
                    float f5 = 1.0f;
                    if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        b = 1.0f;
                    } else {
                        float f6 = f4 / 1.0f;
                        float f7 = f4 * 0.02222222f;
                        if (f2 < f7) {
                            f2 = f7;
                        }
                        b = wzb.b((f2 / f6) * 100.0f) / 100.0f;
                    }
                    tl3Var.H = b;
                    view3.setLayoutParams(tl3Var);
                    ((TextView) scVar2.k).setText(i4 + (mmaPostMatchVotingOptions3 == MmaPostMatchVotingOptions.SECOND_FIGHTER_WIN ? context2.getString(R.string.plus_you) : ""));
                    View view4 = scVar2.g;
                    ViewGroup.LayoutParams layoutParams5 = view4.getLayoutParams();
                    if (layoutParams5 == null) {
                        yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        return;
                    }
                    tl3 tl3Var2 = (tl3) layoutParams5;
                    if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f8 = f4 / 1.0f;
                        float f9 = f4 * 0.02222222f;
                        if (f3 < f9) {
                            f3 = f9;
                        }
                        f5 = wzb.b((f3 / f8) * 100.0f) / 100.0f;
                    }
                    tl3Var2.H = f5;
                    view4.setLayoutParams(tl3Var2);
                }
            });
            return;
        }
        r(true, false);
        hlc hlcVar = (hlc) this.e;
        LinearLayout linearLayout = lscVar2.c;
        LinearLayout linearLayout2 = lscVar.c;
        aba.y(view, 0, 3);
        view.setOnClickListener(new glc(this, mmaEvent, hlcVar, i));
        Integer winnerCode$default = Event.getWinnerCode$default(mmaEvent, null, 1, null);
        if (winnerCode$default != null) {
            int intValue = winnerCode$default.intValue();
            if (intValue == 1) {
                linearLayout.setVisibility(0);
                Integer num = hkg.c0(context) ? 1 : null;
                linearLayout.setLayoutDirection(num != null ? num.intValue() : 0);
                haa.C(textView2);
                haa.D(textView);
                textView.setAlpha(0.85f);
                shapeableImageView.setAlpha(0.6f);
                TextView textView3 = lscVar2.d;
                String winType = mmaEvent.getWinType();
                if (winType == null) {
                    winType = context.getString(R.string.win_short);
                    winType.getClass();
                }
                textView3.setText(winType);
                lscVar2.b.setText(tnf.o(context, mmaEvent));
                return;
            }
            if (intValue == 2) {
                linearLayout2.setVisibility(0);
                Integer num2 = hkg.c0(context) ? 1 : null;
                linearLayout2.setLayoutDirection(num2 != null ? num2.intValue() : 0);
                haa.D(textView2);
                haa.C(textView);
                textView2.setAlpha(0.85f);
                shapeableImageView2.setAlpha(0.6f);
                TextView textView4 = lscVar.d;
                String winType2 = mmaEvent.getWinType();
                if (winType2 == null) {
                    winType2 = context.getString(R.string.win_short);
                    winType2.getClass();
                }
                textView4.setText(winType2);
                lscVar.b.setText(tnf.o(context, mmaEvent));
                return;
            }
            if (intValue == 3 || intValue == 4) {
                FrameLayout frameLayout = jlcVar.a;
                TextView textView5 = jlcVar.b;
                z8e.V(context.getColor(R.color.n_lv_5), frameLayout);
                jlcVar.d.setVisibility(0);
                jlcVar.c.setTextColor(context.getColor(R.color.n_lv_1));
                textView5.setVisibility(0);
                textView5.setText(tnf.o(context, mmaEvent));
                textView5.setTextColor(context.getColor(R.color.n_lv_3));
                haa.D(textView2);
                haa.D(textView);
                shapeableImageView2.setAlpha(0.6f);
                shapeableImageView.setAlpha(0.6f);
                textView2.setAlpha(0.85f);
                textView.setAlpha(0.85f);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r6.intValue() != r7) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(int i, z33 z33Var, boolean z) {
        cv1 cv1Var = (cv1) this.d;
        ImageView imageView = cv1Var.c;
        TextView textView = cv1Var.f;
        ConstraintLayout constraintLayout = cv1Var.b;
        constraintLayout.getClass();
        aw5 aw5Var = (aw5) this.e;
        zl9 zl9Var = z33Var.a;
        boolean z2 = z33Var.b;
        Object a0 = CollectionsKt.a0(i + 1, aw5Var.i);
        if (a0 != null && (a0 instanceof Comment)) {
            Integer groupId = ((Comment) a0).getGroupId();
            int id = zl9Var.getId();
            if (groupId != null) {
            }
        }
        a0 = null;
        sea.v(constraintLayout, true, a0 == null, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        constraintLayout.getClass();
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context = this.b;
        marginLayoutParams.topMargin = ao2.s(i == 0 ? 8 : 4, context);
        constraintLayout.setLayoutParams(marginLayoutParams);
        as9.o(cv1Var.e, zl9Var.e());
        textView.setText(zl9Var.b(context));
        textView.setTextColor(context.getColor(zl9Var.d() ? R.color.live : R.color.n_lv_1));
        cv1Var.d.setText(zl9Var.c(context));
        if (z) {
            z8e.s(imageView, z2);
        } else if (z2) {
            imageView.setRotation(-180.0f);
        } else {
            imageView.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public void r(boolean z, boolean z2) {
        sc scVar = (sc) this.d;
        TextView textView = (TextView) scVar.m;
        TextView textView2 = scVar.i;
        scVar.j.setVisibility((!z || z2) ? 0 : 8);
        scVar.g.setVisibility((!z || z2) ? 0 : 8);
        scVar.f.setVisibility((!z || z2) ? 0 : 8);
        ((TextView) scVar.k).setVisibility((!z || z2) ? 0 : 8);
        ((lsc) scVar.b).a.setVisibility((!z || z2) ? 8 : 0);
        ((lsc) scVar.p).a.setVisibility((!z || z2) ? 8 : 0);
        ((jlc) scVar.o).a.setVisibility((!z || z2) ? 8 : 0);
        Context context = this.b;
        if (z) {
            textView.setText(context.getString(R.string.mma_who_deserved_to_win));
            textView2.setVisibility(0);
            textView2.setText(context.getString(R.string.vote));
            Drawable drawable = context.getDrawable(R.drawable.ic_chevron_right_small_16);
            if (drawable != null) {
                drawable.setTint(context.getColor(R.color.primary_default));
                Unit unit = Unit.a;
            } else {
                drawable = null;
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            haa.G(textView2);
            return;
        }
        if (!z2) {
            textView.setText(context.getString(R.string.voting_ended_status));
            textView2.setVisibility(8);
            return;
        }
        textView.setText(context.getString(R.string.mma_who_deserved_to_win));
        textView2.setVisibility(0);
        textView2.setText(context.getString(R.string.voted));
        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, context.getDrawable(R.drawable.ic_tv_channel_checkmark_16), (Drawable) null);
        textView2.setCompoundDrawableTintList(ColorStateList.valueOf(context.getColor(R.color.n_lv_3)));
        haa.D(textView2);
    }

    public void t(int i, String str, boolean z, boolean z2) {
        TextView textView;
        LinearLayout linearLayout = (LinearLayout) ((p12) this.d).f;
        if (i < linearLayout.getChildCount()) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt == null) {
                yhk.s("null cannot be cast to non-null type android.widget.TextView");
                return;
            } else {
                textView = (TextView) childAt;
                textView.setVisibility(0);
            }
        } else {
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.item_stage_standings_value, (ViewGroup) linearLayout, false);
            if (inflate == null) {
                yhk.s("rootView");
                return;
            } else {
                textView = (TextView) inflate;
                linearLayout.addView(textView);
            }
        }
        a8i a8iVar = (a8i) this.e;
        textView.setText(str);
        textView.setSelected(z2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else {
            layoutParams.width = z ? a8iVar.r : a8iVar.q;
            textView.setLayoutParams(layoutParams);
        }
    }

    public void u(v82 v82Var, boolean z) {
        TextView textView = (TextView) v82Var.c;
        if (!z) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            tl3 tl3Var = (tl3) layoutParams;
            ((ViewGroup.MarginLayoutParams) tl3Var).bottomMargin = 0;
            tl3Var.F = 0.5f;
            tl3Var.l = 0;
            tl3Var.k = -1;
            textView.setLayoutParams(tl3Var);
            return;
        }
        CommentaryGoalModal commentaryGoalModal = (CommentaryGoalModal) this.e;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var2 = (tl3) layoutParams2;
        ((ViewGroup.MarginLayoutParams) tl3Var2).bottomMargin = ((Number) commentaryGoalModal.w.getValue()).intValue();
        tl3Var2.F = 1.0f;
        tl3Var2.l = -1;
        tl3Var2.k = R.id.guideline;
        textView.setLayoutParams(tl3Var2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(o16 o16Var, String str) {
        super(r0);
        str.getClass();
        FrameLayout frameLayout = o16Var.b;
        frameLayout.getClass();
        this.d = o16Var;
        this.e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(ymc ymcVar, rvk rvkVar) {
        super((MmaFightNightItem) rvkVar.b);
        this.e = ymcVar;
        this.d = rvkVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(l8i l8iVar, t22 t22Var) {
        super(r2);
        this.e = l8iVar;
        LinearLayout linearLayout = t22Var.b;
        linearLayout.getClass();
        this.d = t22Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(dk2 dk2Var, ct8 ct8Var) {
        super(r0);
        LinearLayout linearLayout = dk2Var.b;
        linearLayout.getClass();
        this.d = dk2Var;
        this.e = ct8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(pbd pbdVar, hcb hcbVar) {
        super((CheckedTextView) hcbVar.b);
        this.e = pbdVar;
        this.d = hcbVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(on2 on2Var, pn2 pn2Var) {
        super(r2);
        this.e = on2Var;
        LinearLayout linearLayout = pn2Var.b;
        linearLayout.getClass();
        this.d = pn2Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(mg2 mg2Var, pu1 pu1Var) {
        super(r2);
        this.e = mg2Var;
        LinearLayout linearLayout = pu1Var.b;
        linearLayout.getClass();
        this.d = pu1Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(yoe yoeVar, s63 s63Var) {
        super(r2);
        this.e = yoeVar;
        ConstraintLayout constraintLayout = s63Var.b;
        constraintLayout.getClass();
        this.d = s63Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(id5 id5Var, js2 js2Var) {
        super(r0);
        this.e = id5Var;
        LinearLayout linearLayout = (LinearLayout) js2Var.i;
        linearLayout.getClass();
        this.d = js2Var;
        LinearLayout linearLayout2 = (LinearLayout) ((zl) js2Var.g).f;
        linearLayout2.getClass();
        aba.t(linearLayout2);
        linearLayout.getClass();
        sea.v(linearLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(e92 e92Var, ct8 ct8Var) {
        super(r0);
        LinearLayout linearLayout = (LinearLayout) e92Var.e;
        linearLayout.getClass();
        this.d = e92Var;
        this.e = ct8Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(r1f r1fVar) {
        super(r0);
        ConstraintLayout constraintLayout = r1fVar.a;
        constraintLayout.getClass();
        this.d = r1fVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(r9f r9fVar, rfe rfeVar) {
        super(r2);
        this.e = r9fVar;
        CardView cardView = (CardView) rfeVar.b;
        cardView.getClass();
        this.d = rfeVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(hlc hlcVar, sc scVar) {
        super(r2);
        this.e = hlcVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) scVar.l;
        constraintLayout.getClass();
        this.d = scVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(zxd zxdVar) {
        super(r0);
        ConstraintLayout constraintLayout = zxdVar.b;
        constraintLayout.getClass();
        this.d = zxdVar;
        this.e = b.j(zxdVar.c, zxdVar.d, zxdVar.f, zxdVar.g);
    }

    public vh(esk eskVar) {
        super(eskVar.a);
        this.d = eskVar;
        this.e = e.f(null);
        eskVar.b.setContent(new tc3(-592625899, new b69(this, 0), true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(pj5 pj5Var, ComposeView composeView) {
        super(composeView);
        this.e = pj5Var;
        this.d = composeView;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(j22 j22Var) {
        super(r0);
        Drawable drawable;
        ConstraintLayout constraintLayout = j22Var.b;
        constraintLayout.getClass();
        this.d = j22Var;
        Drawable drawable2 = this.b.getDrawable(R.drawable.ic_cricket_bat);
        if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTintList(ColorStateList.valueOf(this.b.getColor(R.color.live)));
        }
        this.e = drawable;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(xh xhVar, bv1 bv1Var) {
        super(r2);
        this.e = xhVar;
        LinearLayout linearLayout = (LinearLayout) bv1Var.i;
        linearLayout.getClass();
        this.d = bv1Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(vs7 vs7Var, z82 z82Var) {
        super(r2);
        this.e = vs7Var;
        MaterialCardView materialCardView = (MaterialCardView) z82Var.b;
        materialCardView.getClass();
        this.d = z82Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(a8i a8iVar, p12 p12Var) {
        super(r2);
        this.e = a8iVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) p12Var.b;
        constraintLayout.getClass();
        this.d = p12Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(aw5 aw5Var, cv1 cv1Var) {
        super(r2);
        this.e = aw5Var;
        ConstraintLayout constraintLayout = cv1Var.b;
        constraintLayout.getClass();
        this.d = cv1Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(qs7 qs7Var, ez0 ez0Var) {
        super(r2);
        this.e = qs7Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) ez0Var.b;
        constraintLayout.getClass();
        this.d = ez0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(gi6 gi6Var, tm5 tm5Var) {
        super(r2);
        this.e = gi6Var;
        FrameLayout frameLayout = tm5Var.b;
        frameLayout.getClass();
        this.d = tm5Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(CommentaryGoalModal commentaryGoalModal, v82 v82Var) {
        super(r2);
        this.e = commentaryGoalModal;
        ConstraintLayout constraintLayout = (ConstraintLayout) v82Var.b;
        constraintLayout.getClass();
        this.d = v82Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(qzh qzhVar, ConstraintLayout constraintLayout) {
        super(constraintLayout);
        constraintLayout.getClass();
        this.e = qzhVar;
        this.d = nr1.c(constraintLayout);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(ca3 ca3Var, z82 z82Var) {
        super(r2);
        this.e = ca3Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) z82Var.b;
        constraintLayout.getClass();
        this.d = z82Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(a8i a8iVar, h04 h04Var) {
        super(r2);
        this.e = a8iVar;
        ConstraintLayout constraintLayout = h04Var.b;
        constraintLayout.getClass();
        this.d = h04Var;
        constraintLayout.setBackgroundColor(this.b.getColor(R.color.surface_1));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(nb6 nb6Var, ez0 ez0Var) {
        super(r2);
        this.e = nb6Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) ez0Var.b;
        constraintLayout.getClass();
        this.d = ez0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vh(nb6 nb6Var, ed edVar) {
        super(r2);
        this.e = nb6Var;
        FrameLayout frameLayout = (FrameLayout) edVar.b;
        frameLayout.getClass();
        this.d = edVar;
    }
}
