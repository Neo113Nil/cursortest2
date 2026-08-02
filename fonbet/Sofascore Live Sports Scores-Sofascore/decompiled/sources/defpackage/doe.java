package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.sofascore.model.GridItem;
import com.sofascore.model.Money;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.CricketPlayerInfo;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.AttributeOverviewResponse;
import com.sofascore.model.newNetwork.PlayerCharacteristic;
import com.sofascore.model.newNetwork.PlayerCharacteristicsResponse;
import com.sofascore.model.util.MarketValueUserVote;
import com.sofascore.model.util.MarketValueVoteType;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.sofascore.results.featuredtournament.view.PromotionalOffersBannerView;
import com.sofascore.results.player.EditPlayerDialog;
import com.sofascore.results.player.EditPlayerTransferDialog;
import com.sofascore.results.player.details.PlayerDetailsFragment;
import com.sofascore.results.player.details.view.PlayerCompareView;
import com.sofascore.results.redesign.dividers.SofaDivider;
import com.sofascore.results.view.SuggestEditView;
import com.vungle.ads.internal.protos.Sdk;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class doe implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerDetailsFragment b;

    public /* synthetic */ doe(PlayerDetailsFragment playerDetailsFragment, int i) {
        this.a = i;
        this.b = playerDetailsFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0c2d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0c18  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0206  */
    /* JADX WARN: Type inference failed for: r3v71, types: [km5] */
    /* JADX WARN: Type inference failed for: r3v72, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v47, types: [km5] */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        joa joaVar;
        AttributeOverviewResponse attributeOverviewResponse;
        PlayerCharacteristicsResponse playerCharacteristicsResponse;
        joa joaVar2;
        joa joaVar3;
        joa joaVar4;
        cxe cxeVar;
        Collection collection;
        List list;
        joa joaVar5;
        int i;
        int i2;
        v91 v91Var;
        v91 v91Var2;
        String str;
        int i3;
        final String str2;
        PromotionalOffersBannerView promotionalOffersBannerView;
        String str3;
        String string;
        Sport sport;
        String string2;
        String w;
        int i4;
        String Q;
        GridItem gridItem;
        List list2;
        ?? r3;
        ?? r4;
        String string3;
        String string4;
        List<PlayerCharacteristic> H0;
        List<PlayerCharacteristic> H02;
        Sport sport2;
        Sport sport3;
        final int i5;
        int i6 = this.a;
        final PlayerDetailsFragment playerDetailsFragment = this.b;
        switch (i6) {
            case 0:
                joa joaVar6 = playerDetailsFragment.C;
                joa joaVar7 = playerDetailsFragment.B;
                joa joaVar8 = playerDetailsFragment.A;
                joa joaVar9 = playerDetailsFragment.I;
                joa joaVar10 = playerDetailsFragment.L;
                soe soeVar = (soe) obj;
                playerDetailsFragment.n();
                MarketValueUserVote marketValueUserVote = soeVar.a;
                List list3 = soeVar.g;
                r91 r91Var = soeVar.h;
                final Money proposedMarketValueRaw = playerDetailsFragment.E().getProposedMarketValueRaw();
                if (proposedMarketValueRaw != null) {
                    Player E = playerDetailsFragment.E();
                    if (Intrinsics.c(E != null ? E.getSportSlug() : null, Sports.FOOTBALL) && !E.getDeceased() && E.getProposedMarketValueRaw() != null) {
                        Money proposedMarketValueRaw2 = E.getProposedMarketValueRaw();
                        proposedMarketValueRaw2.getClass();
                        if (proposedMarketValueRaw2.getValue() > 0) {
                            Context requireContext = playerDetailsFragment.requireContext();
                            requireContext.getClass();
                            Set set = o84.a;
                            joaVar = joaVar6;
                            String a = o84.a(requireContext, proposedMarketValueRaw, 0L, 12);
                            String e = o84.e(requireContext);
                            ((TextView) playerDetailsFragment.D().d.c).setText(a);
                            ((TextView) playerDetailsFragment.D().d.h).setText(e);
                            ((TextView) playerDetailsFragment.D().d.e).setText(e);
                            if (marketValueUserVote != null) {
                                if (marketValueUserVote.getPlayerValue() == proposedMarketValueRaw.getValue()) {
                                    if (marketValueUserVote.getVoteType() == MarketValueVoteType.UP) {
                                        PlayerDetailsFragment.G((View) playerDetailsFragment.D().d.d);
                                        View view = (View) playerDetailsFragment.D().d.g;
                                        view.setEnabled(false);
                                        view.setAlpha(0.25f);
                                    } else {
                                        PlayerDetailsFragment.G((View) playerDetailsFragment.D().d.g);
                                        View view2 = (View) playerDetailsFragment.D().d.d;
                                        i5 = 0;
                                        view2.setEnabled(false);
                                        view2.setAlpha(0.25f);
                                        ((ConstraintLayout) playerDetailsFragment.D().d.b).setVisibility(i5);
                                    }
                                }
                                i5 = 0;
                                ((ConstraintLayout) playerDetailsFragment.D().d.b).setVisibility(i5);
                            } else {
                                i5 = 0;
                                ((ConstraintLayout) playerDetailsFragment.D().d.b).setVisibility(0);
                            }
                            ((View) playerDetailsFragment.D().d.d).setOnClickListener(new View.OnClickListener() { // from class: goe
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i7 = i5;
                                    Money money = proposedMarketValueRaw;
                                    PlayerDetailsFragment playerDetailsFragment2 = playerDetailsFragment;
                                    switch (i7) {
                                        case 0:
                                            PlayerDetailsFragment.G((View) playerDetailsFragment2.D().d.d);
                                            View view4 = (View) playerDetailsFragment2.D().d.g;
                                            view4.setEnabled(false);
                                            view4.setAlpha(0.25f);
                                            Calendar calendar = ke0.a;
                                            Context requireContext2 = playerDetailsFragment2.requireContext();
                                            requireContext2.getClass();
                                            ke0.f(R.string.thank_you_contribution, requireContext2);
                                            roe F = playerDetailsFragment2.F();
                                            xw3.L(un0.z(F), null, null, new gje(F, new MarketValueUserVote(playerDetailsFragment2.E().getId(), money.getValue(), money.getCurrency(), MarketValueVoteType.UP), null, 2), 3);
                                            break;
                                        default:
                                            PlayerDetailsFragment.G((View) playerDetailsFragment2.D().d.g);
                                            View view5 = (View) playerDetailsFragment2.D().d.d;
                                            view5.setEnabled(false);
                                            view5.setAlpha(0.25f);
                                            Calendar calendar2 = ke0.a;
                                            Context requireContext3 = playerDetailsFragment2.requireContext();
                                            requireContext3.getClass();
                                            ke0.f(R.string.thank_you_contribution, requireContext3);
                                            roe F2 = playerDetailsFragment2.F();
                                            xw3.L(un0.z(F2), null, null, new gje(F2, new MarketValueUserVote(playerDetailsFragment2.E().getId(), money.getValue(), money.getCurrency(), MarketValueVoteType.DOWN), null, 2), 3);
                                            break;
                                    }
                                }
                            });
                            final int i7 = 1;
                            ((View) playerDetailsFragment.D().d.g).setOnClickListener(new View.OnClickListener() { // from class: goe
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i72 = i7;
                                    Money money = proposedMarketValueRaw;
                                    PlayerDetailsFragment playerDetailsFragment2 = playerDetailsFragment;
                                    switch (i72) {
                                        case 0:
                                            PlayerDetailsFragment.G((View) playerDetailsFragment2.D().d.d);
                                            View view4 = (View) playerDetailsFragment2.D().d.g;
                                            view4.setEnabled(false);
                                            view4.setAlpha(0.25f);
                                            Calendar calendar = ke0.a;
                                            Context requireContext2 = playerDetailsFragment2.requireContext();
                                            requireContext2.getClass();
                                            ke0.f(R.string.thank_you_contribution, requireContext2);
                                            roe F = playerDetailsFragment2.F();
                                            xw3.L(un0.z(F), null, null, new gje(F, new MarketValueUserVote(playerDetailsFragment2.E().getId(), money.getValue(), money.getCurrency(), MarketValueVoteType.UP), null, 2), 3);
                                            break;
                                        default:
                                            PlayerDetailsFragment.G((View) playerDetailsFragment2.D().d.g);
                                            View view5 = (View) playerDetailsFragment2.D().d.d;
                                            view5.setEnabled(false);
                                            view5.setAlpha(0.25f);
                                            Calendar calendar2 = ke0.a;
                                            Context requireContext3 = playerDetailsFragment2.requireContext();
                                            requireContext3.getClass();
                                            ke0.f(R.string.thank_you_contribution, requireContext3);
                                            roe F2 = playerDetailsFragment2.F();
                                            xw3.L(un0.z(F2), null, null, new gje(F2, new MarketValueUserVote(playerDetailsFragment2.E().getId(), money.getValue(), money.getCurrency(), MarketValueVoteType.DOWN), null, 2), 3);
                                            break;
                                    }
                                }
                            });
                            attributeOverviewResponse = soeVar.d;
                            if (attributeOverviewResponse != null) {
                                ((moe) joaVar8.getValue()).n(playerDetailsFragment.E(), attributeOverviewResponse);
                            }
                            ((bzg) joaVar7.getValue()).j(soeVar.c, Integer.valueOf(playerDetailsFragment.E().getId()), playerDetailsFragment.E().getSportSlug(), new eoe(playerDetailsFragment, 17));
                            playerCharacteristicsResponse = soeVar.f;
                            if (playerCharacteristicsResponse != null) {
                                Team team = playerDetailsFragment.E().getTeam();
                                if (Intrinsics.c((team == null || (sport3 = team.getSport()) == null) ? null : sport3.getSlug(), Sports.FOOTBALL) && !playerCharacteristicsResponse.getPositions().isEmpty()) {
                                    zue zueVar = (zue) joaVar.getValue();
                                    Team team2 = playerDetailsFragment.E().getTeam();
                                    String slug = (team2 == null || (sport2 = team2.getSport()) == null) ? null : sport2.getSlug();
                                    String position = playerDetailsFragment.E().getPosition();
                                    Gender gender = playerDetailsFragment.E().getGender();
                                    nr1 nr1Var = zueVar.d;
                                    if (!zueVar.e) {
                                        zueVar.e = true;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) nr1Var.c;
                                        ImageView imageView = (ImageView) nr1Var.e;
                                        joaVar2 = joaVar7;
                                        GridView gridView = (GridView) nr1Var.d;
                                        constraintLayout.getClass();
                                        joaVar3 = joaVar8;
                                        constraintLayout.setVisibility(0);
                                        Context context = zueVar.getContext();
                                        context.getClass();
                                        joaVar4 = joaVar9;
                                        LinearLayout linearLayout = ((yue) nr1Var.f).a;
                                        linearLayout.getClass();
                                        xue xueVar = new xue(context, linearLayout, gender);
                                        gridView.setAdapter((ListAdapter) xueVar);
                                        List<String> positions = playerCharacteristicsResponse.getPositions();
                                        if (positions != null) {
                                            if (!Intrinsics.c(slug, Sports.FOOTBALL)) {
                                                positions = null;
                                            }
                                            if (positions != null) {
                                                if (positions.isEmpty()) {
                                                    positions = null;
                                                }
                                                if (positions != null) {
                                                    imageView.setVisibility(0);
                                                    imageView.setOnClickListener(new eyd(10, zueVar, gender));
                                                    gridView.setOnItemClickListener(new ah5(4, zueVar, gender));
                                                    for (String str4 : positions) {
                                                        str4.getClass();
                                                        Locale locale = Locale.US;
                                                        locale.getClass();
                                                        String lowerCase = str4.toLowerCase(locale);
                                                        lowerCase.getClass();
                                                        if (lowerCase.equals("gk")) {
                                                            xueVar.b.setVisibility(0);
                                                        } else {
                                                            String lowerCase2 = str4.toLowerCase(locale);
                                                            lowerCase2.getClass();
                                                            j2f j2fVar = (j2f) xueVar.e.get(lowerCase2);
                                                            if (j2fVar != null) {
                                                                int i8 = j2fVar.c;
                                                                ArrayList arrayList = xueVar.d;
                                                                arrayList.remove(i8);
                                                                arrayList.add(i8, j2fVar);
                                                            }
                                                        }
                                                        xueVar.notifyDataSetChanged();
                                                    }
                                                }
                                            }
                                        }
                                        List<PlayerCharacteristic> positive = playerCharacteristicsResponse.getPositive();
                                        if (positive == null || (H02 = CollectionsKt.H0(positive, new wpb(16))) == null) {
                                            r3 = km5.a;
                                        } else {
                                            r3 = new ArrayList();
                                            for (PlayerCharacteristic playerCharacteristic : H02) {
                                                Context context2 = zueVar.getContext();
                                                context2.getClass();
                                                String t = dti.t(playerCharacteristic.getType(), "G".equals(position), context2);
                                                if (t != null) {
                                                    r3.add(t);
                                                }
                                            }
                                        }
                                        List<PlayerCharacteristic> negative = playerCharacteristicsResponse.getNegative();
                                        if (negative == null || (H0 = CollectionsKt.H0(negative, new wpb(17))) == null) {
                                            r4 = km5.a;
                                        } else {
                                            r4 = new ArrayList();
                                            for (PlayerCharacteristic playerCharacteristic2 : H0) {
                                                Context context3 = zueVar.getContext();
                                                context3.getClass();
                                                String t2 = dti.t(playerCharacteristic2.getType(), "G".equals(position), context3);
                                                if (t2 != null) {
                                                    r4.add(t2);
                                                }
                                            }
                                        }
                                        ((TextView) nr1Var.g).setVisibility(0);
                                        ((TextView) nr1Var.i).setVisibility(0);
                                        Iterable iterable = !r3.isEmpty() ? r3 : null;
                                        if (iterable != null) {
                                            string3 = CollectionsKt.f0(iterable, ", ", null, null, null, 62);
                                        } else {
                                            string3 = zueVar.getContext().getString(R.string.no_strengths);
                                            string3.getClass();
                                        }
                                        nr1Var.b.setText(string3);
                                        Iterable iterable2 = !r4.isEmpty() ? r4 : null;
                                        if (iterable2 != null) {
                                            string4 = CollectionsKt.f0(iterable2, ", ", null, null, null, 62);
                                        } else {
                                            string4 = zueVar.getContext().getString(R.string.no_player_weaknesses);
                                            string4.getClass();
                                        }
                                        ((TextView) nr1Var.h).setText(string4);
                                        ooe C = playerDetailsFragment.C();
                                        cxeVar = soeVar.b;
                                        if (cxeVar != null || (list2 = cxeVar.a) == null || (collection = CollectionsKt.B0(list2)) == null) {
                                            collection = km5.a;
                                        }
                                        list = soeVar.e;
                                        Context context4 = C.b;
                                        collection.getClass();
                                        list.getClass();
                                        ArrayList arrayList2 = new ArrayList();
                                        if (!collection.isEmpty()) {
                                            String string5 = context4.getString(R.string.transfer_history);
                                            string5.getClass();
                                            arrayList2.add(new nvj(string5, false));
                                            arrayList2.addAll(collection);
                                        }
                                        if (!list.isEmpty()) {
                                            String string6 = context4.getString(R.string.national_team);
                                            string6.getClass();
                                            arrayList2.add(new nvj(string6, true));
                                            arrayList2.addAll(list);
                                        }
                                        C.F(arrayList2);
                                        if (playerDetailsFragment.M) {
                                            if (playerDetailsFragment.E().getManagerId() != null) {
                                                q52 q52Var = (q52) playerDetailsFragment.y.getValue();
                                                if (q52Var != null) {
                                                    r5.p(playerDetailsFragment.C().g.size(), q52Var);
                                                }
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) playerDetailsFragment.D().e.j;
                                                constraintLayout2.getClass();
                                                constraintLayout2.setVisibility(8);
                                            } else if (playerDetailsFragment.E().getDeceased()) {
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) playerDetailsFragment.D().e.j;
                                                constraintLayout3.getClass();
                                                constraintLayout3.setVisibility(8);
                                            } else {
                                                xz0 xz0Var = playerDetailsFragment.D().e;
                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) xz0Var.j;
                                                TextView textView = xz0Var.e;
                                                ImageView imageView2 = xz0Var.c;
                                                TextView textView2 = (TextView) xz0Var.h;
                                                constraintLayout4.getClass();
                                                constraintLayout4.setVisibility(0);
                                                ((SofaDivider) xz0Var.f).setVisibility(8);
                                                if (playerDetailsFragment.E().getRetired()) {
                                                    Context requireContext2 = playerDetailsFragment.requireContext();
                                                    requireContext2.getClass();
                                                    Drawable m = qa5.a.m(requireContext2);
                                                    apf a2 = ajh.a(imageView2.getContext());
                                                    ht9 ht9Var = new ht9(imageView2.getContext());
                                                    ht9Var.c = m;
                                                    vt9.f(ht9Var, imageView2);
                                                    a2.a(ht9Var.a());
                                                    textView.setText(playerDetailsFragment.requireContext().getString(R.string.retired_player));
                                                    textView2.setVisibility(8);
                                                } else {
                                                    Team team3 = playerDetailsFragment.E().getTeam();
                                                    if (team3 != null) {
                                                        as9.o(imageView2, team3.getId());
                                                        Context requireContext3 = playerDetailsFragment.requireContext();
                                                        requireContext3.getClass();
                                                        textView.setText(tba.p(requireContext3, team3));
                                                        if (Intrinsics.c(team3.getName(), "No team") || playerDetailsFragment.E().getContractUntilTimestamp() == null) {
                                                            textView2.setVisibility(8);
                                                        } else {
                                                            textView2.setVisibility(0);
                                                            Long contractUntilTimestamp = playerDetailsFragment.E().getContractUntilTimestamp();
                                                            contractUntilTimestamp.getClass();
                                                            long longValue = contractUntilTimestamp.longValue();
                                                            bi4 bi4Var = bi4.PATTERN_DDMMY;
                                                            ConcurrentHashMap concurrentHashMap = hk4.a;
                                                            String i9 = fc6.i(longValue, hk4.a(bi4Var.d()));
                                                            textView2.setText(playerDetailsFragment.requireContext().getString(R.string.contract_until) + " " + i9);
                                                        }
                                                        if (!team3.getDisabled()) {
                                                            aba.y(constraintLayout4, 0, 3);
                                                            constraintLayout4.setOnClickListener(new eyd(7, playerDetailsFragment, team3));
                                                        }
                                                    }
                                                }
                                            }
                                            ComposeView composeView = (ComposeView) playerDetailsFragment.J.getValue();
                                            if (composeView != null) {
                                                r5.p(playerDetailsFragment.C().g.size(), composeView);
                                            }
                                            ooe C2 = playerDetailsFragment.C();
                                            LinearLayout linearLayout2 = playerDetailsFragment.D().a;
                                            linearLayout2.getClass();
                                            C2.p(C2.g.size(), linearLayout2);
                                            v91 v91Var3 = (v91) joaVar10.getValue();
                                            if (v91Var3 != null) {
                                                r5.p(playerDetailsFragment.C().g.size(), v91Var3);
                                            }
                                            CricketPlayerInfo cricketPlayerInfo = playerDetailsFragment.E().getCricketPlayerInfo();
                                            if (cricketPlayerInfo != null) {
                                                r5.p(playerDetailsFragment.C().g.size(), (r04) joaVar4.getValue());
                                                ((r04) joaVar4.getValue()).l(cricketPlayerInfo, (cricketPlayerInfo.getBatting() == null && cricketPlayerInfo.getBowling() == null && cricketPlayerInfo.getRole() == null) ? false : true);
                                                SofaDivider sofaDivider = ((r04) joaVar4.getValue()).e;
                                                if (sofaDivider != null) {
                                                    sofaDivider.setDividerVisibility(false);
                                                }
                                            }
                                            ComposeView composeView2 = (ComposeView) playerDetailsFragment.K.getValue();
                                            if (composeView2 != null) {
                                                r5.p(playerDetailsFragment.C().g.size(), composeView2);
                                            }
                                            r1.p(playerDetailsFragment.C().g.size(), (bzg) joaVar2.getValue());
                                            n4c n4cVar = (n4c) playerDetailsFragment.H.getValue();
                                            if (n4cVar != null) {
                                                Context requireContext4 = playerDetailsFragment.requireContext();
                                                requireContext4.getClass();
                                                n4cVar.l(haa.r(requireContext4, playerDetailsFragment.E(), ((ple) playerDetailsFragment.u.getValue()).w), new eoe(playerDetailsFragment, 18));
                                                r5.p(playerDetailsFragment.C().g.size(), n4cVar);
                                            }
                                            r1.p(playerDetailsFragment.C().g.size(), (moe) joaVar3.getValue());
                                            r1.p(playerDetailsFragment.C().g.size(), (zue) joaVar.getValue());
                                            r1.p(playerDetailsFragment.C().g.size(), (AdBannerView) playerDetailsFragment.w.getValue());
                                            Context requireContext5 = playerDetailsFragment.requireContext();
                                            requireContext5.getClass();
                                            ofe ofeVar = new ofe(requireContext5, 0);
                                            ArrayList arrayList3 = new ArrayList();
                                            new SimpleDateFormat("yyyy-MM-dd", Locale.UK).setTimeZone(TimeZone.getTimeZone("GMT"));
                                            sea.v(playerDetailsFragment.D().c, true, true, 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                                            final GridView gridView2 = playerDetailsFragment.D().b;
                                            gridView2.setAdapter((ListAdapter) ofeVar);
                                            ArrayList arrayList4 = dv3.a;
                                            Country country = playerDetailsFragment.E().getCountry();
                                            if (country == null || (str = country.getAlpha2()) == null) {
                                                str = "";
                                            }
                                            final com.sofascore.model.Country a3 = dv3.a(str);
                                            if (a3 != null) {
                                                GridItem gridItem2 = new GridItem(GridItem.Type.IMAGE, playerDetailsFragment.getString(R.string.nationality));
                                                gridItem2.setFirst(a3.getIoc());
                                                gridItem2.setIsEnabled(true);
                                                gridItem2.setCountryCode(a3.getIso2Alpha());
                                                arrayList3.add(gridItem2);
                                                i3 = 1;
                                            } else {
                                                i3 = 0;
                                            }
                                            String birthCity = playerDetailsFragment.E().getBirthCity();
                                            if (birthCity != null) {
                                                if (!Intrinsics.c(playerDetailsFragment.E().getSportSlug(), Sports.BASEBALL)) {
                                                    birthCity = null;
                                                }
                                                if (birthCity != null) {
                                                    StringBuilder sb = new StringBuilder(birthCity);
                                                    vuf q = s6a.q(playerDetailsFragment.E());
                                                    if (q != null) {
                                                        sb.append(", " + q.getCode());
                                                    }
                                                    String sb2 = sb.toString();
                                                    GridItem gridItem3 = new GridItem(GridItem.Type.DISABLED_ALL_CAPS, playerDetailsFragment.getString(R.string.birthplace));
                                                    gridItem3.setFirst(sb2);
                                                    gridItem3.setIsEnabled(true);
                                                    arrayList3.add(gridItem3);
                                                    i3++;
                                                }
                                            }
                                            Long dateOfBirthTimestamp = playerDetailsFragment.E().getDateOfBirthTimestamp();
                                            if (dateOfBirthTimestamp != null) {
                                                long longValue2 = dateOfBirthTimestamp.longValue();
                                                if (playerDetailsFragment.E().getDeceased()) {
                                                    joaVar5 = joaVar10;
                                                    bi4 bi4Var2 = bi4.PATTERN_DMMY;
                                                    Locale d = dla.d();
                                                    ZoneId of = ZoneId.of("GMT");
                                                    of.getClass();
                                                    String i10 = rik.i(longValue2, bi4Var2, d, of);
                                                    if (playerDetailsFragment.E().getDateOfDeathTimestamp() != null) {
                                                        Context requireContext6 = playerDetailsFragment.requireContext();
                                                        requireContext6.getClass();
                                                        String Q2 = hkg.Q(requireContext6, R.string.deceased, playerDetailsFragment.E().getGender(), new Object[0]);
                                                        Long dateOfDeathTimestamp = playerDetailsFragment.E().getDateOfDeathTimestamp();
                                                        dateOfDeathTimestamp.getClass();
                                                        int i11 = i3;
                                                        long longValue3 = dateOfDeathTimestamp.longValue();
                                                        bi4 bi4Var3 = bi4.PATTERN_Y;
                                                        Locale d2 = dla.d();
                                                        i4 = i11;
                                                        ZoneId of2 = ZoneId.of("GMT");
                                                        of2.getClass();
                                                        Q = wv8.i(Q2, " ", rik.i(longValue3, bi4Var3, d2, of2));
                                                    } else {
                                                        i4 = i3;
                                                        Context requireContext7 = playerDetailsFragment.requireContext();
                                                        requireContext7.getClass();
                                                        Q = hkg.Q(requireContext7, R.string.deceased, playerDetailsFragment.E().getGender(), new Object[0]);
                                                    }
                                                    gridItem = new GridItem(GridItem.Type.SPLIT, i10);
                                                    gridItem.setSecond(Q);
                                                    gridItem.setGrayedSecondText(true);
                                                } else {
                                                    GridItem.Type type = GridItem.Type.SPLIT;
                                                    bi4 bi4Var4 = bi4.PATTERN_DMMY;
                                                    joaVar5 = joaVar10;
                                                    Locale d3 = dla.d();
                                                    ZoneId of3 = ZoneId.of("GMT");
                                                    of3.getClass();
                                                    gridItem = new GridItem(type, fc6.i(longValue2, DateTimeFormatter.ofPattern(bi4Var4.d(), d3).withZone(of3).withDecimalStyle(DecimalStyle.of(d3))));
                                                    int between = (int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(longValue2 * 1000)), vxd.o(Instant.ofEpochMilli(yaa.v())));
                                                    gridItem.setFirst(gridView2.getResources().getQuantityString(R.plurals.years_short, between, String.valueOf(between)));
                                                    i4 = i3;
                                                }
                                                arrayList3.add(gridItem);
                                                i3 = i4 + 1;
                                            } else {
                                                joaVar5 = joaVar10;
                                            }
                                            Integer height = playerDetailsFragment.E().getHeight();
                                            if (height != null) {
                                                int intValue = height.intValue();
                                                Context context5 = gridView2.getContext();
                                                context5.getClass();
                                                w = v7a.w(context5, intValue / 100.0d, (r4 & 4) == 0, false);
                                                GridItem gridItem4 = new GridItem(GridItem.Type.DISABLED_ALL_CAPS, playerDetailsFragment.getString(R.string.player_height));
                                                gridItem4.setFirst(w);
                                                arrayList3.add(gridItem4);
                                                i3++;
                                            }
                                            Integer weight = playerDetailsFragment.E().getWeight();
                                            if (weight != null) {
                                                if (!Intrinsics.c(playerDetailsFragment.E().getSportSlug(), Sports.BASEBALL)) {
                                                    weight = null;
                                                }
                                                if (weight != null) {
                                                    int intValue2 = weight.intValue();
                                                    GridItem gridItem5 = new GridItem(GridItem.Type.DISABLED_ALL_CAPS, playerDetailsFragment.getString(R.string.motorsport_driver_weight));
                                                    Context requireContext8 = playerDetailsFragment.requireContext();
                                                    requireContext8.getClass();
                                                    gridItem5.setFirst(v7a.q(requireContext8, intValue2));
                                                    arrayList3.add(gridItem5);
                                                    i3++;
                                                }
                                            }
                                            String preferredFoot = playerDetailsFragment.E().getPreferredFoot();
                                            if (preferredFoot != null) {
                                                GridItem.Type type2 = GridItem.Type.DISABLED_ALL_CAPS;
                                                Integer valueOf = Integer.valueOf(R.string.ice_hockey_skater_shoots);
                                                if (!Intrinsics.c(playerDetailsFragment.E().getSportSlug(), Sports.ICE_HOCKEY)) {
                                                    valueOf = null;
                                                }
                                                GridItem gridItem6 = new GridItem(type2, playerDetailsFragment.getString(valueOf != null ? valueOf.intValue() : R.string.preferred_foot));
                                                if (preferredFoot.equals(PlayerKt.PREFERRED_FOOT_LEFT)) {
                                                    Integer valueOf2 = Integer.valueOf(R.string.ice_hockey_skater_shoots_left);
                                                    if (!Intrinsics.c(playerDetailsFragment.E().getSportSlug(), Sports.ICE_HOCKEY)) {
                                                        valueOf2 = null;
                                                    }
                                                    string2 = playerDetailsFragment.getString(valueOf2 != null ? valueOf2.intValue() : R.string.attribute_dominant_foot_left);
                                                } else if (preferredFoot.equals(PlayerKt.PREFERRED_FOOT_RIGHT)) {
                                                    Integer valueOf3 = Integer.valueOf(R.string.ice_hockey_skater_shoots_right);
                                                    if (!Intrinsics.c(playerDetailsFragment.E().getSportSlug(), Sports.ICE_HOCKEY)) {
                                                        valueOf3 = null;
                                                    }
                                                    string2 = playerDetailsFragment.getString(valueOf3 != null ? valueOf3.intValue() : R.string.attribute_dominant_foot_right);
                                                } else {
                                                    Integer valueOf4 = Integer.valueOf(R.string.ice_hockey_skater_shoots_both_sides);
                                                    if (!Intrinsics.c(playerDetailsFragment.E().getSportSlug(), Sports.ICE_HOCKEY)) {
                                                        valueOf4 = null;
                                                    }
                                                    string2 = playerDetailsFragment.getString(valueOf4 != null ? valueOf4.intValue() : R.string.both);
                                                }
                                                gridItem6.setFirst(string2);
                                                arrayList3.add(gridItem6);
                                                i3++;
                                            }
                                            Context requireContext9 = playerDetailsFragment.requireContext();
                                            requireContext9.getClass();
                                            Player E2 = playerDetailsFragment.E();
                                            E2.getClass();
                                            String position2 = E2.getPosition();
                                            if (position2 != null) {
                                                Team team4 = E2.getTeam();
                                                str2 = dti.u(requireContext9, E2.getGender(), (team4 == null || (sport = team4.getSport()) == null) ? null : sport.getSlug(), position2, true);
                                            } else {
                                                str2 = null;
                                            }
                                            if (str2 != null && str2.length() > 0) {
                                                GridItem gridItem7 = new GridItem(GridItem.Type.DEFAULT, playerDetailsFragment.getString(R.string.position));
                                                gridItem7.setFirst(str2);
                                                gridItem7.setIsEnabled(true);
                                                arrayList3.add(gridItem7);
                                                i3++;
                                            }
                                            String throwHand = playerDetailsFragment.E().getThrowHand();
                                            String batHand = playerDetailsFragment.E().getBatHand();
                                            if (throwHand != null && batHand != null) {
                                                GridItem gridItem8 = new GridItem(GridItem.Type.DISABLED_ALL_CAPS, playerDetailsFragment.getString(R.string.baseball_bats_throws));
                                                dti dtiVar = d91.d;
                                                Context context6 = gridView2.getContext();
                                                context6.getClass();
                                                dtiVar.getClass();
                                                d91 o = dti.o(batHand);
                                                String str5 = "-";
                                                if (o == null || (str3 = context6.getString(o.c)) == null) {
                                                    str3 = "-";
                                                }
                                                StringBuilder sb3 = new StringBuilder(str3);
                                                sb3.append("/");
                                                d91 o2 = dti.o(throwHand);
                                                if (o2 != null && (string = context6.getString(o2.c)) != null) {
                                                    str5 = string;
                                                }
                                                sb3.append(str5);
                                                gridItem8.setFirst(sb3.toString());
                                                gridItem8.setIsEnabled(true);
                                                arrayList3.add(gridItem8);
                                                i3++;
                                            }
                                            String jerseyNumber = playerDetailsFragment.E().getJerseyNumber();
                                            if (jerseyNumber != null) {
                                                GridItem gridItem9 = new GridItem(GridItem.Type.DEFAULT, playerDetailsFragment.getString(R.string.shirt_number));
                                                gridItem9.setFirst(jerseyNumber);
                                                arrayList3.add(gridItem9);
                                                i3++;
                                            }
                                            Money marketValueRaw = playerDetailsFragment.E().getMarketValueRaw();
                                            if (marketValueRaw != null && !playerDetailsFragment.E().getDeceased()) {
                                                GridItem gridItem10 = new GridItem(GridItem.Type.MARKET, playerDetailsFragment.getString(R.string.market_value));
                                                Set set2 = o84.a;
                                                Context context7 = gridView2.getContext();
                                                context7.getClass();
                                                gridItem10.setFirst(o84.a(context7, marketValueRaw, 0L, 12));
                                                arrayList3.add(gridItem10);
                                                i3++;
                                            }
                                            Money salary = playerDetailsFragment.E().getSalary();
                                            if (!Intrinsics.c(playerDetailsFragment.E().getSportSlug(), Sports.BASEBALL) || playerDetailsFragment.E().getDeceased()) {
                                                salary = null;
                                            }
                                            if (salary != null) {
                                                GridItem gridItem11 = new GridItem(GridItem.Type.DISABLED_ALL_CAPS, playerDetailsFragment.getString(R.string.salary));
                                                Set set3 = o84.a;
                                                Context requireContext10 = playerDetailsFragment.requireContext();
                                                requireContext10.getClass();
                                                gridItem11.setFirst(o84.a(requireContext10, salary, 0L, 12));
                                                arrayList3.add(gridItem11);
                                                i3++;
                                            }
                                            gridView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: hoe
                                                @Override // android.widget.AdapterView.OnItemClickListener
                                                public final void onItemClick(AdapterView adapterView, View view3, int i12, long j) {
                                                    String str6;
                                                    String string7;
                                                    Sport sport4;
                                                    com.sofascore.model.Country country2;
                                                    Object item = adapterView.getAdapter().getItem(i12);
                                                    if (item instanceof GridItem) {
                                                        GridItem gridItem12 = (GridItem) item;
                                                        String description = gridItem12.getDescription();
                                                        PlayerDetailsFragment playerDetailsFragment2 = PlayerDetailsFragment.this;
                                                        if (description.equals(playerDetailsFragment2.getString(R.string.nationality)) && (country2 = a3) != null) {
                                                            Calendar calendar = ke0.a;
                                                            Context requireContext11 = playerDetailsFragment2.requireContext();
                                                            requireContext11.getClass();
                                                            Context requireContext12 = playerDetailsFragment2.requireContext();
                                                            requireContext12.getClass();
                                                            ke0.g(requireContext11, tv3.c(requireContext12, country2.getName()), 0);
                                                            return;
                                                        }
                                                        if (gridItem12.getDescription().equals(playerDetailsFragment2.getString(R.string.position)) && str2 != null) {
                                                            Calendar calendar2 = ke0.a;
                                                            Context requireContext13 = playerDetailsFragment2.requireContext();
                                                            requireContext13.getClass();
                                                            Context requireContext14 = playerDetailsFragment2.requireContext();
                                                            requireContext14.getClass();
                                                            Player E3 = playerDetailsFragment2.E();
                                                            E3.getClass();
                                                            String position3 = E3.getPosition();
                                                            String str7 = null;
                                                            if (position3 != null) {
                                                                Team team5 = E3.getTeam();
                                                                if (team5 != null && (sport4 = team5.getSport()) != null) {
                                                                    str7 = sport4.getSlug();
                                                                }
                                                                str7 = dti.u(requireContext14, E3.getGender(), str7, position3, false);
                                                            }
                                                            ke0.g(requireContext13, str7, 0);
                                                            return;
                                                        }
                                                        if (Intrinsics.c(gridItem12.getDescription(), playerDetailsFragment2.getString(R.string.birthplace))) {
                                                            StringBuilder sb4 = new StringBuilder();
                                                            sb4.append(playerDetailsFragment2.E().getBirthCity());
                                                            vuf q2 = s6a.q(playerDetailsFragment2.E());
                                                            if (q2 != null) {
                                                                sb4.append(", " + q2.d());
                                                            }
                                                            String sb5 = sb4.toString();
                                                            Calendar calendar3 = ke0.a;
                                                            Context requireContext15 = playerDetailsFragment2.requireContext();
                                                            requireContext15.getClass();
                                                            ke0.g(requireContext15, sb5, 0);
                                                            return;
                                                        }
                                                        if (Intrinsics.c(gridItem12.getDescription(), playerDetailsFragment2.getString(R.string.baseball_bats_throws))) {
                                                            String throwHand2 = playerDetailsFragment2.E().getThrowHand();
                                                            String batHand2 = playerDetailsFragment2.E().getBatHand();
                                                            if (throwHand2 == null || batHand2 == null) {
                                                                return;
                                                            }
                                                            dti dtiVar2 = d91.d;
                                                            Context context8 = gridView2.getContext();
                                                            context8.getClass();
                                                            dtiVar2.getClass();
                                                            d91 o3 = dti.o(batHand2);
                                                            String str8 = "-";
                                                            if (o3 == null || (str6 = context8.getString(o3.b)) == null) {
                                                                str6 = "-";
                                                            }
                                                            StringBuilder sb6 = new StringBuilder(str6);
                                                            sb6.append("/");
                                                            d91 o4 = dti.o(throwHand2);
                                                            if (o4 != null && (string7 = context8.getString(o4.b)) != null) {
                                                                str8 = string7;
                                                            }
                                                            sb6.append(str8);
                                                            String sb7 = sb6.toString();
                                                            Calendar calendar4 = ke0.a;
                                                            Context requireContext16 = playerDetailsFragment2.requireContext();
                                                            requireContext16.getClass();
                                                            ke0.g(requireContext16, sb7, 0);
                                                        }
                                                    }
                                                }
                                            });
                                            int ceil = (int) Math.ceil(i3 / 3.0d);
                                            Context requireContext11 = playerDetailsFragment.requireContext();
                                            requireContext11.getClass();
                                            gridView2.getLayoutParams().height = ceil * ao2.s(56, requireContext11);
                                            ofeVar.a(arrayList3);
                                            playerDetailsFragment.M = false;
                                            if (((Boolean) playerDetailsFragment.s.getValue()).booleanValue()) {
                                                krk krkVar = playerDetailsFragment.l;
                                                krkVar.getClass();
                                                if (((oo8) krkVar).d.getLayoutManager() instanceof LinearLayoutManager) {
                                                    krk krkVar2 = playerDetailsFragment.l;
                                                    krkVar2.getClass();
                                                    n layoutManager = ((oo8) krkVar2).d.getLayoutManager();
                                                    layoutManager.getClass();
                                                    ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(playerDetailsFragment.C().g.size(), 0);
                                                }
                                            }
                                            PromotionBannerView promotionBannerView = (PromotionBannerView) playerDetailsFragment.F.getValue();
                                            if (promotionBannerView != null) {
                                                g7.o(playerDetailsFragment.C(), promotionBannerView, 6);
                                            }
                                            if (list3 == null || list3.isEmpty() || (promotionalOffersBannerView = (PromotionalOffersBannerView) playerDetailsFragment.G.getValue()) == null) {
                                                i = 6;
                                            } else {
                                                Team team5 = playerDetailsFragment.E().getTeam();
                                                PromotionalOffersBannerView.j(promotionalOffersBannerView, list3, team5 != null ? new sdf(team5.getId()) : null, fv.PLAYER_SCREEN);
                                                i = 6;
                                                g7.o(playerDetailsFragment.C(), promotionalOffersBannerView, 6);
                                            }
                                            PromotionBannerView promotionBannerView2 = (PromotionBannerView) playerDetailsFragment.E.getValue();
                                            if (promotionBannerView2 != null) {
                                                g7.o(playerDetailsFragment.C(), promotionBannerView2, i);
                                                i2 = 0;
                                                promotionBannerView2.setVisibility(0);
                                                g7.o(playerDetailsFragment.C(), (SuggestEditView) playerDetailsFragment.D.getValue(), i);
                                                if (r91Var != null && (v91Var2 = (v91) joaVar5.getValue()) != null) {
                                                    v91Var2.l(r91Var);
                                                }
                                                v91Var = (v91) joaVar5.getValue();
                                                if (v91Var != null) {
                                                    tee teeVar = r91Var != null ? r91Var.e : null;
                                                    v91Var.setVisibility((teeVar == null || teeVar.isEmpty()) ? 8 : i2);
                                                }
                                                break;
                                            }
                                        } else {
                                            joaVar5 = joaVar10;
                                            i = 6;
                                        }
                                        i2 = 0;
                                        g7.o(playerDetailsFragment.C(), (SuggestEditView) playerDetailsFragment.D.getValue(), i);
                                        if (r91Var != null) {
                                            v91Var2.l(r91Var);
                                        }
                                        v91Var = (v91) joaVar5.getValue();
                                        if (v91Var != null) {
                                        }
                                    }
                                }
                            }
                            joaVar2 = joaVar7;
                            joaVar3 = joaVar8;
                            joaVar4 = joaVar9;
                            ooe C3 = playerDetailsFragment.C();
                            cxeVar = soeVar.b;
                            if (cxeVar != null) {
                            }
                            collection = km5.a;
                            list = soeVar.e;
                            Context context42 = C3.b;
                            collection.getClass();
                            list.getClass();
                            ArrayList arrayList22 = new ArrayList();
                            if (!collection.isEmpty()) {
                            }
                            if (!list.isEmpty()) {
                            }
                            C3.F(arrayList22);
                            if (playerDetailsFragment.M) {
                            }
                            i2 = 0;
                            g7.o(playerDetailsFragment.C(), (SuggestEditView) playerDetailsFragment.D.getValue(), i);
                            if (r91Var != null) {
                            }
                            v91Var = (v91) joaVar5.getValue();
                            if (v91Var != null) {
                            }
                        }
                    }
                }
                joaVar = joaVar6;
                attributeOverviewResponse = soeVar.d;
                if (attributeOverviewResponse != null) {
                }
                ((bzg) joaVar7.getValue()).j(soeVar.c, Integer.valueOf(playerDetailsFragment.E().getId()), playerDetailsFragment.E().getSportSlug(), new eoe(playerDetailsFragment, 17));
                playerCharacteristicsResponse = soeVar.f;
                if (playerCharacteristicsResponse != null) {
                }
                joaVar2 = joaVar7;
                joaVar3 = joaVar8;
                joaVar4 = joaVar9;
                ooe C32 = playerDetailsFragment.C();
                cxeVar = soeVar.b;
                if (cxeVar != null) {
                }
                collection = km5.a;
                list = soeVar.e;
                Context context422 = C32.b;
                collection.getClass();
                list.getClass();
                ArrayList arrayList222 = new ArrayList();
                if (!collection.isEmpty()) {
                }
                if (!list.isEmpty()) {
                }
                C32.F(arrayList222);
                if (playerDetailsFragment.M) {
                }
                i2 = 0;
                g7.o(playerDetailsFragment.C(), (SuggestEditView) playerDetailsFragment.D.getValue(), i);
                if (r91Var != null) {
                }
                v91Var = (v91) joaVar5.getValue();
                if (v91Var != null) {
                }
                break;
            case 1:
                List list4 = (List) obj;
                moe moeVar = (moe) playerDetailsFragment.A.getValue();
                list4.getClass();
                moeVar.getClass();
                ((PlayerCompareView) moeVar.d.c).o(list4);
                break;
            case 2:
                ((moe) playerDetailsFragment.A.getValue()).setPlayerAttributeOverview((AttributeOverviewResponse) obj);
                break;
            default:
                int intValue3 = ((Integer) obj).intValue();
                if (intValue3 == 0) {
                    Player E3 = playerDetailsFragment.E();
                    E3.getClass();
                    EditPlayerDialog editPlayerDialog = new EditPlayerDialog();
                    editPlayerDialog.setArguments(fz8.C(fz8.G("ARG_PLAYER", E3)));
                    editPlayerDialog.p(playerDetailsFragment.requireActivity().k(), "EditPlayerDialog");
                } else if (intValue3 == 1) {
                    Player E4 = playerDetailsFragment.E();
                    E4.getClass();
                    EditPlayerTransferDialog editPlayerTransferDialog = new EditPlayerTransferDialog();
                    editPlayerTransferDialog.setArguments(fz8.C(fz8.G("ARG_PLAYER", E4)));
                    editPlayerTransferDialog.p(playerDetailsFragment.requireActivity().k(), "EditPlayerTransferDialog");
                }
                break;
        }
        return Unit.a;
    }
}
