package com.sofascore.results.manager.details;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.GridItem;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.ManagerData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.CareerHistory;
import com.sofascore.model.newNetwork.ManagerPerformance;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.HorizontalBarView;
import com.sofascore.results.manager.details.ManagerDetailsFragment;
import com.sofascore.results.manager.details.view.ManagerHistoryChartGraph;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.redesign.dividers.SofaDivider;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.aba;
import defpackage.ah5;
import defpackage.ao2;
import defpackage.as9;
import defpackage.au7;
import defpackage.bi4;
import defpackage.bii;
import defpackage.dla;
import defpackage.dv3;
import defpackage.fc6;
import defpackage.hkg;
import defpackage.krk;
import defpackage.loe;
import defpackage.mqi;
import defpackage.ofe;
import defpackage.oo8;
import defpackage.psb;
import defpackage.qea;
import defpackage.sea;
import defpackage.tba;
import defpackage.usb;
import defpackage.vxd;
import defpackage.wv8;
import defpackage.xz0;
import defpackage.yaa;
import defpackage.ypa;
import defpackage.z8e;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/manager/details/ManagerDetailsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ManagerDetailsFragment extends Hilt_ManagerDetailsFragment<oo8> {
    public final mqi r;
    public final mqi s;
    public final mqi t;
    public final mqi u;
    public final mqi v;
    public final mqi w;

    public ManagerDetailsFragment() {
        final int i = 0;
        this.r = ypa.b(new Function0(this) { // from class: gsb
            public final /* synthetic */ ManagerDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:65:0x02a1, code lost:
            
                if (defpackage.dti.e(r2) != false) goto L67;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                xsb xsbVar;
                int i2;
                int i3 = i;
                ManagerDetailsFragment managerDetailsFragment = this.b;
                switch (i3) {
                    case 0:
                        Bundle requireArguments = managerDetailsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "MANAGER", ManagerData.class);
                        if (M != null) {
                            return (ManagerData) M;
                        }
                        a70.p("Serializable MANAGER not found");
                        return null;
                    case 1:
                        Context requireContext = managerDetailsFragment.requireContext();
                        requireContext.getClass();
                        psb psbVar = new psb(requireContext);
                        psbVar.a.d = new bba(managerDetailsFragment, 8);
                        return psbVar;
                    case 2:
                        Integer formerPlayerId = managerDetailsFragment.D().getManager().getFormerPlayerId();
                        if (formerPlayerId != null) {
                            String sportSlug = managerDetailsFragment.D().getManager().getSportSlug();
                            if (sportSlug == null) {
                                sportSlug = "";
                            }
                            break;
                        }
                        formerPlayerId = null;
                        if (formerPlayerId == null) {
                            return null;
                        }
                        int intValue = formerPlayerId.intValue();
                        Context requireContext2 = managerDetailsFragment.requireContext();
                        requireContext2.getClass();
                        q52 q52Var = new q52(requireContext2);
                        q52Var.j();
                        String string = managerDetailsFragment.getString(R.string.player_profile);
                        string.getClass();
                        q52Var.setText(string);
                        q52Var.setOnClickListener(new l8(managerDetailsFragment, intValue, 4));
                        return q52Var;
                    case 3:
                        LayoutInflater layoutInflater = managerDetailsFragment.getLayoutInflater();
                        krk krkVar = managerDetailsFragment.l;
                        krkVar.getClass();
                        loe a = loe.a(layoutInflater, ((oo8) krkVar).d);
                        ((ConstraintLayout) a.d.b).setVisibility(8);
                        xz0 xz0Var = a.e;
                        ((Group) xz0Var.l).setVisibility(8);
                        ((Group) xz0Var.m).setVisibility(8);
                        ((TextView) xz0Var.h).setVisibility(8);
                        ((TextView) xz0Var.i).setVisibility(8);
                        ((SofaDivider) xz0Var.f).setVisibility(8);
                        return a;
                    case 4:
                        ManagerPerformance performance = managerDetailsFragment.D().getManager().getPerformance();
                        if (performance == null) {
                            performance = null;
                        }
                        if (performance == null) {
                            return null;
                        }
                        LayoutInflater layoutInflater2 = managerDetailsFragment.getLayoutInflater();
                        krk krkVar2 = managerDetailsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater2.inflate(R.layout.manager_performance_layout, (ViewGroup) ((oo8) krkVar2).d, false);
                        final HorizontalBarView horizontalBarView = (HorizontalBarView) nq8.B(R.id.horizontal_bar_view, inflate);
                        if (horizontalBarView == null) {
                            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.horizontal_bar_view)));
                            return null;
                        }
                        xsb xsbVar2 = new xsb((LinearLayout) inflate, horizontalBarView);
                        int wins = performance.getWins();
                        int draws = performance.getDraws();
                        Integer valueOf = Integer.valueOf(draws);
                        int losses = performance.getLosses();
                        fc9 fc9Var = new fc9(5);
                        bu1 bu1Var = horizontalBarView.d;
                        LinearLayout linearLayout = (LinearLayout) bu1Var.f;
                        FrameLayout frameLayout = (FrameLayout) bu1Var.c;
                        TextView textView = (TextView) bu1Var.i;
                        TextView textView2 = (TextView) bu1Var.g;
                        FrameLayout frameLayout2 = (FrameLayout) bu1Var.b;
                        linearLayout.getClass();
                        linearLayout.setVisibility(0);
                        int i4 = wins + losses + draws;
                        if (i4 > 0) {
                            float f = i4;
                            final float z = kda.z(wins, f);
                            final float z2 = kda.z(draws, f);
                            final float z3 = kda.z(losses, f);
                            ValueAnimator ofInt = ValueAnimator.ofInt(0, 400);
                            ofInt.setInterpolator(new qq7(1));
                            ofInt.setStartDelay(100L);
                            ofInt.setDuration(400L);
                            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ze9
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i5 = HorizontalBarView.e;
                                    valueAnimator.getClass();
                                    double parseDouble = Double.parseDouble(valueAnimator.getAnimatedValue().toString()) / 400.0d;
                                    bu1 bu1Var2 = HorizontalBarView.this.d;
                                    float f2 = (float) parseDouble;
                                    HorizontalBarView.l((FrameLayout) bu1Var2.j, z, f2);
                                    HorizontalBarView.l((FrameLayout) bu1Var2.b, z2, f2);
                                    HorizontalBarView.l((FrameLayout) bu1Var2.c, z3, f2);
                                }
                            });
                            ArrayList arrayList = new ArrayList();
                            xsbVar = xsbVar2;
                            double d = wins + draws + losses;
                            double d2 = (wins / d) * 100.0d;
                            double d3 = (draws / d) * 100.0d;
                            double d4 = (losses / d) * 100.0d;
                            int a2 = wzb.a(d2);
                            int a3 = wzb.a(d3);
                            int a4 = wzb.a(d4);
                            int i5 = a2 + a3 + a4;
                            if (i5 > 100) {
                                double d5 = d2 % 1.0d;
                                double d6 = d3 % 1.0d;
                                double d7 = d4 % 1.0d;
                                if (d5 >= d6 || d5 >= d7) {
                                    if (d6 >= d5 || d6 >= d7) {
                                        a4--;
                                    } else {
                                        a3--;
                                    }
                                    i2 = a2;
                                    arrayList.add(Integer.valueOf(i2));
                                    arrayList.add(Integer.valueOf(a3));
                                    arrayList.add(Integer.valueOf(a4));
                                    af9 af9Var = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                    af9 af9Var2 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                    af9 af9Var3 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                    ofInt.addListener(af9Var);
                                    ofInt.addListener(af9Var2);
                                    ofInt.addListener(af9Var3);
                                    ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                    ofInt.start();
                                } else {
                                    i2 = a2 - 1;
                                    arrayList.add(Integer.valueOf(i2));
                                    arrayList.add(Integer.valueOf(a3));
                                    arrayList.add(Integer.valueOf(a4));
                                    af9 af9Var4 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                    af9 af9Var22 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                    af9 af9Var32 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                    ofInt.addListener(af9Var4);
                                    ofInt.addListener(af9Var22);
                                    ofInt.addListener(af9Var32);
                                    ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                    ofInt.start();
                                }
                            } else {
                                if (i5 < 100) {
                                    double d8 = d2 % 1.0d;
                                    double d9 = d3 % 1.0d;
                                    double d10 = d4 % 1.0d;
                                    if (d8 > d9 && d8 > d10) {
                                        i2 = a2 + 1;
                                        arrayList.add(Integer.valueOf(i2));
                                        arrayList.add(Integer.valueOf(a3));
                                        arrayList.add(Integer.valueOf(a4));
                                        af9 af9Var42 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                        af9 af9Var222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                        af9 af9Var322 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                        ofInt.addListener(af9Var42);
                                        ofInt.addListener(af9Var222);
                                        ofInt.addListener(af9Var322);
                                        ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                        ofInt.start();
                                    } else if (d9 <= d8 || d9 <= d10) {
                                        a4++;
                                    } else {
                                        a3++;
                                    }
                                }
                                i2 = a2;
                                arrayList.add(Integer.valueOf(i2));
                                arrayList.add(Integer.valueOf(a3));
                                arrayList.add(Integer.valueOf(a4));
                                af9 af9Var422 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                af9 af9Var2222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                af9 af9Var3222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                ofInt.addListener(af9Var422);
                                ofInt.addListener(af9Var2222);
                                ofInt.addListener(af9Var3222);
                                ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                ofInt.start();
                            }
                        } else {
                            xsbVar = xsbVar2;
                            frameLayout2.setVisibility(0);
                            ((TextView) bu1Var.h).setText(String.valueOf(wins));
                            textView2.setText(String.valueOf(draws));
                            ((TextView) bu1Var.e).setText(String.valueOf(losses));
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(horizontalBarView.getContext().getColor(R.color.neutral_default));
                            gradientDrawable.setCornerRadius(horizontalBarView.getContext().getResources().getDimension(R.dimen.vote_view_radius_small));
                            frameLayout.setBackground(gradientDrawable);
                            textView.setText(horizontalBarView.getContext().getString(R.string.no_matches_played));
                            HorizontalBarView.l((FrameLayout) bu1Var.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            HorizontalBarView.l(frameLayout2, 1.0f, 1.0f);
                            HorizontalBarView.l(frameLayout, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        }
                        return xsbVar;
                    default:
                        List<CareerHistory> careerHistory = managerDetailsFragment.D().getCareerHistory();
                        if (careerHistory.isEmpty()) {
                            careerHistory = null;
                        }
                        if (careerHistory == null) {
                            return null;
                        }
                        ManagerPerformance performance2 = managerDetailsFragment.D().getManager().getPerformance();
                        if (performance2 == null) {
                            performance2 = null;
                        }
                        if (performance2 == null) {
                            return null;
                        }
                        Context requireContext3 = managerDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new usb(requireContext3);
                }
            }
        });
        final int i2 = 1;
        this.s = ypa.b(new Function0(this) { // from class: gsb
            public final /* synthetic */ ManagerDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:65:0x02a1, code lost:
            
                if (defpackage.dti.e(r2) != false) goto L67;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                xsb xsbVar;
                int i22;
                int i3 = i2;
                ManagerDetailsFragment managerDetailsFragment = this.b;
                switch (i3) {
                    case 0:
                        Bundle requireArguments = managerDetailsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "MANAGER", ManagerData.class);
                        if (M != null) {
                            return (ManagerData) M;
                        }
                        a70.p("Serializable MANAGER not found");
                        return null;
                    case 1:
                        Context requireContext = managerDetailsFragment.requireContext();
                        requireContext.getClass();
                        psb psbVar = new psb(requireContext);
                        psbVar.a.d = new bba(managerDetailsFragment, 8);
                        return psbVar;
                    case 2:
                        Integer formerPlayerId = managerDetailsFragment.D().getManager().getFormerPlayerId();
                        if (formerPlayerId != null) {
                            String sportSlug = managerDetailsFragment.D().getManager().getSportSlug();
                            if (sportSlug == null) {
                                sportSlug = "";
                            }
                            break;
                        }
                        formerPlayerId = null;
                        if (formerPlayerId == null) {
                            return null;
                        }
                        int intValue = formerPlayerId.intValue();
                        Context requireContext2 = managerDetailsFragment.requireContext();
                        requireContext2.getClass();
                        q52 q52Var = new q52(requireContext2);
                        q52Var.j();
                        String string = managerDetailsFragment.getString(R.string.player_profile);
                        string.getClass();
                        q52Var.setText(string);
                        q52Var.setOnClickListener(new l8(managerDetailsFragment, intValue, 4));
                        return q52Var;
                    case 3:
                        LayoutInflater layoutInflater = managerDetailsFragment.getLayoutInflater();
                        krk krkVar = managerDetailsFragment.l;
                        krkVar.getClass();
                        loe a = loe.a(layoutInflater, ((oo8) krkVar).d);
                        ((ConstraintLayout) a.d.b).setVisibility(8);
                        xz0 xz0Var = a.e;
                        ((Group) xz0Var.l).setVisibility(8);
                        ((Group) xz0Var.m).setVisibility(8);
                        ((TextView) xz0Var.h).setVisibility(8);
                        ((TextView) xz0Var.i).setVisibility(8);
                        ((SofaDivider) xz0Var.f).setVisibility(8);
                        return a;
                    case 4:
                        ManagerPerformance performance = managerDetailsFragment.D().getManager().getPerformance();
                        if (performance == null) {
                            performance = null;
                        }
                        if (performance == null) {
                            return null;
                        }
                        LayoutInflater layoutInflater2 = managerDetailsFragment.getLayoutInflater();
                        krk krkVar2 = managerDetailsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater2.inflate(R.layout.manager_performance_layout, (ViewGroup) ((oo8) krkVar2).d, false);
                        final HorizontalBarView horizontalBarView = (HorizontalBarView) nq8.B(R.id.horizontal_bar_view, inflate);
                        if (horizontalBarView == null) {
                            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.horizontal_bar_view)));
                            return null;
                        }
                        xsb xsbVar2 = new xsb((LinearLayout) inflate, horizontalBarView);
                        int wins = performance.getWins();
                        int draws = performance.getDraws();
                        Integer valueOf = Integer.valueOf(draws);
                        int losses = performance.getLosses();
                        fc9 fc9Var = new fc9(5);
                        bu1 bu1Var = horizontalBarView.d;
                        LinearLayout linearLayout = (LinearLayout) bu1Var.f;
                        FrameLayout frameLayout = (FrameLayout) bu1Var.c;
                        TextView textView = (TextView) bu1Var.i;
                        TextView textView2 = (TextView) bu1Var.g;
                        FrameLayout frameLayout2 = (FrameLayout) bu1Var.b;
                        linearLayout.getClass();
                        linearLayout.setVisibility(0);
                        int i4 = wins + losses + draws;
                        if (i4 > 0) {
                            float f = i4;
                            final float z = kda.z(wins, f);
                            final float z2 = kda.z(draws, f);
                            final float z3 = kda.z(losses, f);
                            ValueAnimator ofInt = ValueAnimator.ofInt(0, 400);
                            ofInt.setInterpolator(new qq7(1));
                            ofInt.setStartDelay(100L);
                            ofInt.setDuration(400L);
                            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ze9
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i5 = HorizontalBarView.e;
                                    valueAnimator.getClass();
                                    double parseDouble = Double.parseDouble(valueAnimator.getAnimatedValue().toString()) / 400.0d;
                                    bu1 bu1Var2 = HorizontalBarView.this.d;
                                    float f2 = (float) parseDouble;
                                    HorizontalBarView.l((FrameLayout) bu1Var2.j, z, f2);
                                    HorizontalBarView.l((FrameLayout) bu1Var2.b, z2, f2);
                                    HorizontalBarView.l((FrameLayout) bu1Var2.c, z3, f2);
                                }
                            });
                            ArrayList arrayList = new ArrayList();
                            xsbVar = xsbVar2;
                            double d = wins + draws + losses;
                            double d2 = (wins / d) * 100.0d;
                            double d3 = (draws / d) * 100.0d;
                            double d4 = (losses / d) * 100.0d;
                            int a2 = wzb.a(d2);
                            int a3 = wzb.a(d3);
                            int a4 = wzb.a(d4);
                            int i5 = a2 + a3 + a4;
                            if (i5 > 100) {
                                double d5 = d2 % 1.0d;
                                double d6 = d3 % 1.0d;
                                double d7 = d4 % 1.0d;
                                if (d5 >= d6 || d5 >= d7) {
                                    if (d6 >= d5 || d6 >= d7) {
                                        a4--;
                                    } else {
                                        a3--;
                                    }
                                    i22 = a2;
                                    arrayList.add(Integer.valueOf(i22));
                                    arrayList.add(Integer.valueOf(a3));
                                    arrayList.add(Integer.valueOf(a4));
                                    af9 af9Var422 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                    af9 af9Var2222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                    af9 af9Var3222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                    ofInt.addListener(af9Var422);
                                    ofInt.addListener(af9Var2222);
                                    ofInt.addListener(af9Var3222);
                                    ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                    ofInt.start();
                                } else {
                                    i22 = a2 - 1;
                                    arrayList.add(Integer.valueOf(i22));
                                    arrayList.add(Integer.valueOf(a3));
                                    arrayList.add(Integer.valueOf(a4));
                                    af9 af9Var4222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                    af9 af9Var22222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                    af9 af9Var32222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                    ofInt.addListener(af9Var4222);
                                    ofInt.addListener(af9Var22222);
                                    ofInt.addListener(af9Var32222);
                                    ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                    ofInt.start();
                                }
                            } else {
                                if (i5 < 100) {
                                    double d8 = d2 % 1.0d;
                                    double d9 = d3 % 1.0d;
                                    double d10 = d4 % 1.0d;
                                    if (d8 > d9 && d8 > d10) {
                                        i22 = a2 + 1;
                                        arrayList.add(Integer.valueOf(i22));
                                        arrayList.add(Integer.valueOf(a3));
                                        arrayList.add(Integer.valueOf(a4));
                                        af9 af9Var42222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                        af9 af9Var222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                        af9 af9Var322222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                        ofInt.addListener(af9Var42222);
                                        ofInt.addListener(af9Var222222);
                                        ofInt.addListener(af9Var322222);
                                        ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                        ofInt.start();
                                    } else if (d9 <= d8 || d9 <= d10) {
                                        a4++;
                                    } else {
                                        a3++;
                                    }
                                }
                                i22 = a2;
                                arrayList.add(Integer.valueOf(i22));
                                arrayList.add(Integer.valueOf(a3));
                                arrayList.add(Integer.valueOf(a4));
                                af9 af9Var422222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                af9 af9Var2222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                af9 af9Var3222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                ofInt.addListener(af9Var422222);
                                ofInt.addListener(af9Var2222222);
                                ofInt.addListener(af9Var3222222);
                                ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                ofInt.start();
                            }
                        } else {
                            xsbVar = xsbVar2;
                            frameLayout2.setVisibility(0);
                            ((TextView) bu1Var.h).setText(String.valueOf(wins));
                            textView2.setText(String.valueOf(draws));
                            ((TextView) bu1Var.e).setText(String.valueOf(losses));
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(horizontalBarView.getContext().getColor(R.color.neutral_default));
                            gradientDrawable.setCornerRadius(horizontalBarView.getContext().getResources().getDimension(R.dimen.vote_view_radius_small));
                            frameLayout.setBackground(gradientDrawable);
                            textView.setText(horizontalBarView.getContext().getString(R.string.no_matches_played));
                            HorizontalBarView.l((FrameLayout) bu1Var.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            HorizontalBarView.l(frameLayout2, 1.0f, 1.0f);
                            HorizontalBarView.l(frameLayout, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        }
                        return xsbVar;
                    default:
                        List<CareerHistory> careerHistory = managerDetailsFragment.D().getCareerHistory();
                        if (careerHistory.isEmpty()) {
                            careerHistory = null;
                        }
                        if (careerHistory == null) {
                            return null;
                        }
                        ManagerPerformance performance2 = managerDetailsFragment.D().getManager().getPerformance();
                        if (performance2 == null) {
                            performance2 = null;
                        }
                        if (performance2 == null) {
                            return null;
                        }
                        Context requireContext3 = managerDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new usb(requireContext3);
                }
            }
        });
        final int i3 = 2;
        this.t = ypa.b(new Function0(this) { // from class: gsb
            public final /* synthetic */ ManagerDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:65:0x02a1, code lost:
            
                if (defpackage.dti.e(r2) != false) goto L67;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                xsb xsbVar;
                int i22;
                int i32 = i3;
                ManagerDetailsFragment managerDetailsFragment = this.b;
                switch (i32) {
                    case 0:
                        Bundle requireArguments = managerDetailsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "MANAGER", ManagerData.class);
                        if (M != null) {
                            return (ManagerData) M;
                        }
                        a70.p("Serializable MANAGER not found");
                        return null;
                    case 1:
                        Context requireContext = managerDetailsFragment.requireContext();
                        requireContext.getClass();
                        psb psbVar = new psb(requireContext);
                        psbVar.a.d = new bba(managerDetailsFragment, 8);
                        return psbVar;
                    case 2:
                        Integer formerPlayerId = managerDetailsFragment.D().getManager().getFormerPlayerId();
                        if (formerPlayerId != null) {
                            String sportSlug = managerDetailsFragment.D().getManager().getSportSlug();
                            if (sportSlug == null) {
                                sportSlug = "";
                            }
                            break;
                        }
                        formerPlayerId = null;
                        if (formerPlayerId == null) {
                            return null;
                        }
                        int intValue = formerPlayerId.intValue();
                        Context requireContext2 = managerDetailsFragment.requireContext();
                        requireContext2.getClass();
                        q52 q52Var = new q52(requireContext2);
                        q52Var.j();
                        String string = managerDetailsFragment.getString(R.string.player_profile);
                        string.getClass();
                        q52Var.setText(string);
                        q52Var.setOnClickListener(new l8(managerDetailsFragment, intValue, 4));
                        return q52Var;
                    case 3:
                        LayoutInflater layoutInflater = managerDetailsFragment.getLayoutInflater();
                        krk krkVar = managerDetailsFragment.l;
                        krkVar.getClass();
                        loe a = loe.a(layoutInflater, ((oo8) krkVar).d);
                        ((ConstraintLayout) a.d.b).setVisibility(8);
                        xz0 xz0Var = a.e;
                        ((Group) xz0Var.l).setVisibility(8);
                        ((Group) xz0Var.m).setVisibility(8);
                        ((TextView) xz0Var.h).setVisibility(8);
                        ((TextView) xz0Var.i).setVisibility(8);
                        ((SofaDivider) xz0Var.f).setVisibility(8);
                        return a;
                    case 4:
                        ManagerPerformance performance = managerDetailsFragment.D().getManager().getPerformance();
                        if (performance == null) {
                            performance = null;
                        }
                        if (performance == null) {
                            return null;
                        }
                        LayoutInflater layoutInflater2 = managerDetailsFragment.getLayoutInflater();
                        krk krkVar2 = managerDetailsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater2.inflate(R.layout.manager_performance_layout, (ViewGroup) ((oo8) krkVar2).d, false);
                        final HorizontalBarView horizontalBarView = (HorizontalBarView) nq8.B(R.id.horizontal_bar_view, inflate);
                        if (horizontalBarView == null) {
                            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.horizontal_bar_view)));
                            return null;
                        }
                        xsb xsbVar2 = new xsb((LinearLayout) inflate, horizontalBarView);
                        int wins = performance.getWins();
                        int draws = performance.getDraws();
                        Integer valueOf = Integer.valueOf(draws);
                        int losses = performance.getLosses();
                        fc9 fc9Var = new fc9(5);
                        bu1 bu1Var = horizontalBarView.d;
                        LinearLayout linearLayout = (LinearLayout) bu1Var.f;
                        FrameLayout frameLayout = (FrameLayout) bu1Var.c;
                        TextView textView = (TextView) bu1Var.i;
                        TextView textView2 = (TextView) bu1Var.g;
                        FrameLayout frameLayout2 = (FrameLayout) bu1Var.b;
                        linearLayout.getClass();
                        linearLayout.setVisibility(0);
                        int i4 = wins + losses + draws;
                        if (i4 > 0) {
                            float f = i4;
                            final float z = kda.z(wins, f);
                            final float z2 = kda.z(draws, f);
                            final float z3 = kda.z(losses, f);
                            ValueAnimator ofInt = ValueAnimator.ofInt(0, 400);
                            ofInt.setInterpolator(new qq7(1));
                            ofInt.setStartDelay(100L);
                            ofInt.setDuration(400L);
                            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ze9
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i5 = HorizontalBarView.e;
                                    valueAnimator.getClass();
                                    double parseDouble = Double.parseDouble(valueAnimator.getAnimatedValue().toString()) / 400.0d;
                                    bu1 bu1Var2 = HorizontalBarView.this.d;
                                    float f2 = (float) parseDouble;
                                    HorizontalBarView.l((FrameLayout) bu1Var2.j, z, f2);
                                    HorizontalBarView.l((FrameLayout) bu1Var2.b, z2, f2);
                                    HorizontalBarView.l((FrameLayout) bu1Var2.c, z3, f2);
                                }
                            });
                            ArrayList arrayList = new ArrayList();
                            xsbVar = xsbVar2;
                            double d = wins + draws + losses;
                            double d2 = (wins / d) * 100.0d;
                            double d3 = (draws / d) * 100.0d;
                            double d4 = (losses / d) * 100.0d;
                            int a2 = wzb.a(d2);
                            int a3 = wzb.a(d3);
                            int a4 = wzb.a(d4);
                            int i5 = a2 + a3 + a4;
                            if (i5 > 100) {
                                double d5 = d2 % 1.0d;
                                double d6 = d3 % 1.0d;
                                double d7 = d4 % 1.0d;
                                if (d5 >= d6 || d5 >= d7) {
                                    if (d6 >= d5 || d6 >= d7) {
                                        a4--;
                                    } else {
                                        a3--;
                                    }
                                    i22 = a2;
                                    arrayList.add(Integer.valueOf(i22));
                                    arrayList.add(Integer.valueOf(a3));
                                    arrayList.add(Integer.valueOf(a4));
                                    af9 af9Var422222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                    af9 af9Var2222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                    af9 af9Var3222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                    ofInt.addListener(af9Var422222);
                                    ofInt.addListener(af9Var2222222);
                                    ofInt.addListener(af9Var3222222);
                                    ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                    ofInt.start();
                                } else {
                                    i22 = a2 - 1;
                                    arrayList.add(Integer.valueOf(i22));
                                    arrayList.add(Integer.valueOf(a3));
                                    arrayList.add(Integer.valueOf(a4));
                                    af9 af9Var4222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                    af9 af9Var22222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                    af9 af9Var32222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                    ofInt.addListener(af9Var4222222);
                                    ofInt.addListener(af9Var22222222);
                                    ofInt.addListener(af9Var32222222);
                                    ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                    ofInt.start();
                                }
                            } else {
                                if (i5 < 100) {
                                    double d8 = d2 % 1.0d;
                                    double d9 = d3 % 1.0d;
                                    double d10 = d4 % 1.0d;
                                    if (d8 > d9 && d8 > d10) {
                                        i22 = a2 + 1;
                                        arrayList.add(Integer.valueOf(i22));
                                        arrayList.add(Integer.valueOf(a3));
                                        arrayList.add(Integer.valueOf(a4));
                                        af9 af9Var42222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                        af9 af9Var222222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                        af9 af9Var322222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                        ofInt.addListener(af9Var42222222);
                                        ofInt.addListener(af9Var222222222);
                                        ofInt.addListener(af9Var322222222);
                                        ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                        ofInt.start();
                                    } else if (d9 <= d8 || d9 <= d10) {
                                        a4++;
                                    } else {
                                        a3++;
                                    }
                                }
                                i22 = a2;
                                arrayList.add(Integer.valueOf(i22));
                                arrayList.add(Integer.valueOf(a3));
                                arrayList.add(Integer.valueOf(a4));
                                af9 af9Var422222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                af9 af9Var2222222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                af9 af9Var3222222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                ofInt.addListener(af9Var422222222);
                                ofInt.addListener(af9Var2222222222);
                                ofInt.addListener(af9Var3222222222);
                                ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                ofInt.start();
                            }
                        } else {
                            xsbVar = xsbVar2;
                            frameLayout2.setVisibility(0);
                            ((TextView) bu1Var.h).setText(String.valueOf(wins));
                            textView2.setText(String.valueOf(draws));
                            ((TextView) bu1Var.e).setText(String.valueOf(losses));
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(horizontalBarView.getContext().getColor(R.color.neutral_default));
                            gradientDrawable.setCornerRadius(horizontalBarView.getContext().getResources().getDimension(R.dimen.vote_view_radius_small));
                            frameLayout.setBackground(gradientDrawable);
                            textView.setText(horizontalBarView.getContext().getString(R.string.no_matches_played));
                            HorizontalBarView.l((FrameLayout) bu1Var.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            HorizontalBarView.l(frameLayout2, 1.0f, 1.0f);
                            HorizontalBarView.l(frameLayout, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        }
                        return xsbVar;
                    default:
                        List<CareerHistory> careerHistory = managerDetailsFragment.D().getCareerHistory();
                        if (careerHistory.isEmpty()) {
                            careerHistory = null;
                        }
                        if (careerHistory == null) {
                            return null;
                        }
                        ManagerPerformance performance2 = managerDetailsFragment.D().getManager().getPerformance();
                        if (performance2 == null) {
                            performance2 = null;
                        }
                        if (performance2 == null) {
                            return null;
                        }
                        Context requireContext3 = managerDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new usb(requireContext3);
                }
            }
        });
        final int i4 = 3;
        this.u = ypa.b(new Function0(this) { // from class: gsb
            public final /* synthetic */ ManagerDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:65:0x02a1, code lost:
            
                if (defpackage.dti.e(r2) != false) goto L67;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                xsb xsbVar;
                int i22;
                int i32 = i4;
                ManagerDetailsFragment managerDetailsFragment = this.b;
                switch (i32) {
                    case 0:
                        Bundle requireArguments = managerDetailsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "MANAGER", ManagerData.class);
                        if (M != null) {
                            return (ManagerData) M;
                        }
                        a70.p("Serializable MANAGER not found");
                        return null;
                    case 1:
                        Context requireContext = managerDetailsFragment.requireContext();
                        requireContext.getClass();
                        psb psbVar = new psb(requireContext);
                        psbVar.a.d = new bba(managerDetailsFragment, 8);
                        return psbVar;
                    case 2:
                        Integer formerPlayerId = managerDetailsFragment.D().getManager().getFormerPlayerId();
                        if (formerPlayerId != null) {
                            String sportSlug = managerDetailsFragment.D().getManager().getSportSlug();
                            if (sportSlug == null) {
                                sportSlug = "";
                            }
                            break;
                        }
                        formerPlayerId = null;
                        if (formerPlayerId == null) {
                            return null;
                        }
                        int intValue = formerPlayerId.intValue();
                        Context requireContext2 = managerDetailsFragment.requireContext();
                        requireContext2.getClass();
                        q52 q52Var = new q52(requireContext2);
                        q52Var.j();
                        String string = managerDetailsFragment.getString(R.string.player_profile);
                        string.getClass();
                        q52Var.setText(string);
                        q52Var.setOnClickListener(new l8(managerDetailsFragment, intValue, 4));
                        return q52Var;
                    case 3:
                        LayoutInflater layoutInflater = managerDetailsFragment.getLayoutInflater();
                        krk krkVar = managerDetailsFragment.l;
                        krkVar.getClass();
                        loe a = loe.a(layoutInflater, ((oo8) krkVar).d);
                        ((ConstraintLayout) a.d.b).setVisibility(8);
                        xz0 xz0Var = a.e;
                        ((Group) xz0Var.l).setVisibility(8);
                        ((Group) xz0Var.m).setVisibility(8);
                        ((TextView) xz0Var.h).setVisibility(8);
                        ((TextView) xz0Var.i).setVisibility(8);
                        ((SofaDivider) xz0Var.f).setVisibility(8);
                        return a;
                    case 4:
                        ManagerPerformance performance = managerDetailsFragment.D().getManager().getPerformance();
                        if (performance == null) {
                            performance = null;
                        }
                        if (performance == null) {
                            return null;
                        }
                        LayoutInflater layoutInflater2 = managerDetailsFragment.getLayoutInflater();
                        krk krkVar2 = managerDetailsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater2.inflate(R.layout.manager_performance_layout, (ViewGroup) ((oo8) krkVar2).d, false);
                        final HorizontalBarView horizontalBarView = (HorizontalBarView) nq8.B(R.id.horizontal_bar_view, inflate);
                        if (horizontalBarView == null) {
                            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.horizontal_bar_view)));
                            return null;
                        }
                        xsb xsbVar2 = new xsb((LinearLayout) inflate, horizontalBarView);
                        int wins = performance.getWins();
                        int draws = performance.getDraws();
                        Integer valueOf = Integer.valueOf(draws);
                        int losses = performance.getLosses();
                        fc9 fc9Var = new fc9(5);
                        bu1 bu1Var = horizontalBarView.d;
                        LinearLayout linearLayout = (LinearLayout) bu1Var.f;
                        FrameLayout frameLayout = (FrameLayout) bu1Var.c;
                        TextView textView = (TextView) bu1Var.i;
                        TextView textView2 = (TextView) bu1Var.g;
                        FrameLayout frameLayout2 = (FrameLayout) bu1Var.b;
                        linearLayout.getClass();
                        linearLayout.setVisibility(0);
                        int i42 = wins + losses + draws;
                        if (i42 > 0) {
                            float f = i42;
                            final float z = kda.z(wins, f);
                            final float z2 = kda.z(draws, f);
                            final float z3 = kda.z(losses, f);
                            ValueAnimator ofInt = ValueAnimator.ofInt(0, 400);
                            ofInt.setInterpolator(new qq7(1));
                            ofInt.setStartDelay(100L);
                            ofInt.setDuration(400L);
                            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ze9
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i5 = HorizontalBarView.e;
                                    valueAnimator.getClass();
                                    double parseDouble = Double.parseDouble(valueAnimator.getAnimatedValue().toString()) / 400.0d;
                                    bu1 bu1Var2 = HorizontalBarView.this.d;
                                    float f2 = (float) parseDouble;
                                    HorizontalBarView.l((FrameLayout) bu1Var2.j, z, f2);
                                    HorizontalBarView.l((FrameLayout) bu1Var2.b, z2, f2);
                                    HorizontalBarView.l((FrameLayout) bu1Var2.c, z3, f2);
                                }
                            });
                            ArrayList arrayList = new ArrayList();
                            xsbVar = xsbVar2;
                            double d = wins + draws + losses;
                            double d2 = (wins / d) * 100.0d;
                            double d3 = (draws / d) * 100.0d;
                            double d4 = (losses / d) * 100.0d;
                            int a2 = wzb.a(d2);
                            int a3 = wzb.a(d3);
                            int a4 = wzb.a(d4);
                            int i5 = a2 + a3 + a4;
                            if (i5 > 100) {
                                double d5 = d2 % 1.0d;
                                double d6 = d3 % 1.0d;
                                double d7 = d4 % 1.0d;
                                if (d5 >= d6 || d5 >= d7) {
                                    if (d6 >= d5 || d6 >= d7) {
                                        a4--;
                                    } else {
                                        a3--;
                                    }
                                    i22 = a2;
                                    arrayList.add(Integer.valueOf(i22));
                                    arrayList.add(Integer.valueOf(a3));
                                    arrayList.add(Integer.valueOf(a4));
                                    af9 af9Var422222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                    af9 af9Var2222222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                    af9 af9Var3222222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                    ofInt.addListener(af9Var422222222);
                                    ofInt.addListener(af9Var2222222222);
                                    ofInt.addListener(af9Var3222222222);
                                    ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                    ofInt.start();
                                } else {
                                    i22 = a2 - 1;
                                    arrayList.add(Integer.valueOf(i22));
                                    arrayList.add(Integer.valueOf(a3));
                                    arrayList.add(Integer.valueOf(a4));
                                    af9 af9Var4222222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                    af9 af9Var22222222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                    af9 af9Var32222222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                    ofInt.addListener(af9Var4222222222);
                                    ofInt.addListener(af9Var22222222222);
                                    ofInt.addListener(af9Var32222222222);
                                    ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                    ofInt.start();
                                }
                            } else {
                                if (i5 < 100) {
                                    double d8 = d2 % 1.0d;
                                    double d9 = d3 % 1.0d;
                                    double d10 = d4 % 1.0d;
                                    if (d8 > d9 && d8 > d10) {
                                        i22 = a2 + 1;
                                        arrayList.add(Integer.valueOf(i22));
                                        arrayList.add(Integer.valueOf(a3));
                                        arrayList.add(Integer.valueOf(a4));
                                        af9 af9Var42222222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                        af9 af9Var222222222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                        af9 af9Var322222222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                        ofInt.addListener(af9Var42222222222);
                                        ofInt.addListener(af9Var222222222222);
                                        ofInt.addListener(af9Var322222222222);
                                        ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                        ofInt.start();
                                    } else if (d9 <= d8 || d9 <= d10) {
                                        a4++;
                                    } else {
                                        a3++;
                                    }
                                }
                                i22 = a2;
                                arrayList.add(Integer.valueOf(i22));
                                arrayList.add(Integer.valueOf(a3));
                                arrayList.add(Integer.valueOf(a4));
                                af9 af9Var422222222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                af9 af9Var2222222222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                af9 af9Var3222222222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                ofInt.addListener(af9Var422222222222);
                                ofInt.addListener(af9Var2222222222222);
                                ofInt.addListener(af9Var3222222222222);
                                ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                ofInt.start();
                            }
                        } else {
                            xsbVar = xsbVar2;
                            frameLayout2.setVisibility(0);
                            ((TextView) bu1Var.h).setText(String.valueOf(wins));
                            textView2.setText(String.valueOf(draws));
                            ((TextView) bu1Var.e).setText(String.valueOf(losses));
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(horizontalBarView.getContext().getColor(R.color.neutral_default));
                            gradientDrawable.setCornerRadius(horizontalBarView.getContext().getResources().getDimension(R.dimen.vote_view_radius_small));
                            frameLayout.setBackground(gradientDrawable);
                            textView.setText(horizontalBarView.getContext().getString(R.string.no_matches_played));
                            HorizontalBarView.l((FrameLayout) bu1Var.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            HorizontalBarView.l(frameLayout2, 1.0f, 1.0f);
                            HorizontalBarView.l(frameLayout, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        }
                        return xsbVar;
                    default:
                        List<CareerHistory> careerHistory = managerDetailsFragment.D().getCareerHistory();
                        if (careerHistory.isEmpty()) {
                            careerHistory = null;
                        }
                        if (careerHistory == null) {
                            return null;
                        }
                        ManagerPerformance performance2 = managerDetailsFragment.D().getManager().getPerformance();
                        if (performance2 == null) {
                            performance2 = null;
                        }
                        if (performance2 == null) {
                            return null;
                        }
                        Context requireContext3 = managerDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new usb(requireContext3);
                }
            }
        });
        final int i5 = 4;
        this.v = ypa.b(new Function0(this) { // from class: gsb
            public final /* synthetic */ ManagerDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:65:0x02a1, code lost:
            
                if (defpackage.dti.e(r2) != false) goto L67;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                xsb xsbVar;
                int i22;
                int i32 = i5;
                ManagerDetailsFragment managerDetailsFragment = this.b;
                switch (i32) {
                    case 0:
                        Bundle requireArguments = managerDetailsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "MANAGER", ManagerData.class);
                        if (M != null) {
                            return (ManagerData) M;
                        }
                        a70.p("Serializable MANAGER not found");
                        return null;
                    case 1:
                        Context requireContext = managerDetailsFragment.requireContext();
                        requireContext.getClass();
                        psb psbVar = new psb(requireContext);
                        psbVar.a.d = new bba(managerDetailsFragment, 8);
                        return psbVar;
                    case 2:
                        Integer formerPlayerId = managerDetailsFragment.D().getManager().getFormerPlayerId();
                        if (formerPlayerId != null) {
                            String sportSlug = managerDetailsFragment.D().getManager().getSportSlug();
                            if (sportSlug == null) {
                                sportSlug = "";
                            }
                            break;
                        }
                        formerPlayerId = null;
                        if (formerPlayerId == null) {
                            return null;
                        }
                        int intValue = formerPlayerId.intValue();
                        Context requireContext2 = managerDetailsFragment.requireContext();
                        requireContext2.getClass();
                        q52 q52Var = new q52(requireContext2);
                        q52Var.j();
                        String string = managerDetailsFragment.getString(R.string.player_profile);
                        string.getClass();
                        q52Var.setText(string);
                        q52Var.setOnClickListener(new l8(managerDetailsFragment, intValue, 4));
                        return q52Var;
                    case 3:
                        LayoutInflater layoutInflater = managerDetailsFragment.getLayoutInflater();
                        krk krkVar = managerDetailsFragment.l;
                        krkVar.getClass();
                        loe a = loe.a(layoutInflater, ((oo8) krkVar).d);
                        ((ConstraintLayout) a.d.b).setVisibility(8);
                        xz0 xz0Var = a.e;
                        ((Group) xz0Var.l).setVisibility(8);
                        ((Group) xz0Var.m).setVisibility(8);
                        ((TextView) xz0Var.h).setVisibility(8);
                        ((TextView) xz0Var.i).setVisibility(8);
                        ((SofaDivider) xz0Var.f).setVisibility(8);
                        return a;
                    case 4:
                        ManagerPerformance performance = managerDetailsFragment.D().getManager().getPerformance();
                        if (performance == null) {
                            performance = null;
                        }
                        if (performance == null) {
                            return null;
                        }
                        LayoutInflater layoutInflater2 = managerDetailsFragment.getLayoutInflater();
                        krk krkVar2 = managerDetailsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater2.inflate(R.layout.manager_performance_layout, (ViewGroup) ((oo8) krkVar2).d, false);
                        final HorizontalBarView horizontalBarView = (HorizontalBarView) nq8.B(R.id.horizontal_bar_view, inflate);
                        if (horizontalBarView == null) {
                            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.horizontal_bar_view)));
                            return null;
                        }
                        xsb xsbVar2 = new xsb((LinearLayout) inflate, horizontalBarView);
                        int wins = performance.getWins();
                        int draws = performance.getDraws();
                        Integer valueOf = Integer.valueOf(draws);
                        int losses = performance.getLosses();
                        fc9 fc9Var = new fc9(5);
                        bu1 bu1Var = horizontalBarView.d;
                        LinearLayout linearLayout = (LinearLayout) bu1Var.f;
                        FrameLayout frameLayout = (FrameLayout) bu1Var.c;
                        TextView textView = (TextView) bu1Var.i;
                        TextView textView2 = (TextView) bu1Var.g;
                        FrameLayout frameLayout2 = (FrameLayout) bu1Var.b;
                        linearLayout.getClass();
                        linearLayout.setVisibility(0);
                        int i42 = wins + losses + draws;
                        if (i42 > 0) {
                            float f = i42;
                            final float z = kda.z(wins, f);
                            final float z2 = kda.z(draws, f);
                            final float z3 = kda.z(losses, f);
                            ValueAnimator ofInt = ValueAnimator.ofInt(0, 400);
                            ofInt.setInterpolator(new qq7(1));
                            ofInt.setStartDelay(100L);
                            ofInt.setDuration(400L);
                            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ze9
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i52 = HorizontalBarView.e;
                                    valueAnimator.getClass();
                                    double parseDouble = Double.parseDouble(valueAnimator.getAnimatedValue().toString()) / 400.0d;
                                    bu1 bu1Var2 = HorizontalBarView.this.d;
                                    float f2 = (float) parseDouble;
                                    HorizontalBarView.l((FrameLayout) bu1Var2.j, z, f2);
                                    HorizontalBarView.l((FrameLayout) bu1Var2.b, z2, f2);
                                    HorizontalBarView.l((FrameLayout) bu1Var2.c, z3, f2);
                                }
                            });
                            ArrayList arrayList = new ArrayList();
                            xsbVar = xsbVar2;
                            double d = wins + draws + losses;
                            double d2 = (wins / d) * 100.0d;
                            double d3 = (draws / d) * 100.0d;
                            double d4 = (losses / d) * 100.0d;
                            int a2 = wzb.a(d2);
                            int a3 = wzb.a(d3);
                            int a4 = wzb.a(d4);
                            int i52 = a2 + a3 + a4;
                            if (i52 > 100) {
                                double d5 = d2 % 1.0d;
                                double d6 = d3 % 1.0d;
                                double d7 = d4 % 1.0d;
                                if (d5 >= d6 || d5 >= d7) {
                                    if (d6 >= d5 || d6 >= d7) {
                                        a4--;
                                    } else {
                                        a3--;
                                    }
                                    i22 = a2;
                                    arrayList.add(Integer.valueOf(i22));
                                    arrayList.add(Integer.valueOf(a3));
                                    arrayList.add(Integer.valueOf(a4));
                                    af9 af9Var422222222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                    af9 af9Var2222222222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                    af9 af9Var3222222222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                    ofInt.addListener(af9Var422222222222);
                                    ofInt.addListener(af9Var2222222222222);
                                    ofInt.addListener(af9Var3222222222222);
                                    ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                    ofInt.start();
                                } else {
                                    i22 = a2 - 1;
                                    arrayList.add(Integer.valueOf(i22));
                                    arrayList.add(Integer.valueOf(a3));
                                    arrayList.add(Integer.valueOf(a4));
                                    af9 af9Var4222222222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                    af9 af9Var22222222222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                    af9 af9Var32222222222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                    ofInt.addListener(af9Var4222222222222);
                                    ofInt.addListener(af9Var22222222222222);
                                    ofInt.addListener(af9Var32222222222222);
                                    ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                    ofInt.start();
                                }
                            } else {
                                if (i52 < 100) {
                                    double d8 = d2 % 1.0d;
                                    double d9 = d3 % 1.0d;
                                    double d10 = d4 % 1.0d;
                                    if (d8 > d9 && d8 > d10) {
                                        i22 = a2 + 1;
                                        arrayList.add(Integer.valueOf(i22));
                                        arrayList.add(Integer.valueOf(a3));
                                        arrayList.add(Integer.valueOf(a4));
                                        af9 af9Var42222222222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                        af9 af9Var222222222222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                        af9 af9Var322222222222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                        ofInt.addListener(af9Var42222222222222);
                                        ofInt.addListener(af9Var222222222222222);
                                        ofInt.addListener(af9Var322222222222222);
                                        ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                        ofInt.start();
                                    } else if (d9 <= d8 || d9 <= d10) {
                                        a4++;
                                    } else {
                                        a3++;
                                    }
                                }
                                i22 = a2;
                                arrayList.add(Integer.valueOf(i22));
                                arrayList.add(Integer.valueOf(a3));
                                arrayList.add(Integer.valueOf(a4));
                                af9 af9Var422222222222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                af9 af9Var2222222222222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                af9 af9Var3222222222222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                ofInt.addListener(af9Var422222222222222);
                                ofInt.addListener(af9Var2222222222222222);
                                ofInt.addListener(af9Var3222222222222222);
                                ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                ofInt.start();
                            }
                        } else {
                            xsbVar = xsbVar2;
                            frameLayout2.setVisibility(0);
                            ((TextView) bu1Var.h).setText(String.valueOf(wins));
                            textView2.setText(String.valueOf(draws));
                            ((TextView) bu1Var.e).setText(String.valueOf(losses));
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(horizontalBarView.getContext().getColor(R.color.neutral_default));
                            gradientDrawable.setCornerRadius(horizontalBarView.getContext().getResources().getDimension(R.dimen.vote_view_radius_small));
                            frameLayout.setBackground(gradientDrawable);
                            textView.setText(horizontalBarView.getContext().getString(R.string.no_matches_played));
                            HorizontalBarView.l((FrameLayout) bu1Var.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            HorizontalBarView.l(frameLayout2, 1.0f, 1.0f);
                            HorizontalBarView.l(frameLayout, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        }
                        return xsbVar;
                    default:
                        List<CareerHistory> careerHistory = managerDetailsFragment.D().getCareerHistory();
                        if (careerHistory.isEmpty()) {
                            careerHistory = null;
                        }
                        if (careerHistory == null) {
                            return null;
                        }
                        ManagerPerformance performance2 = managerDetailsFragment.D().getManager().getPerformance();
                        if (performance2 == null) {
                            performance2 = null;
                        }
                        if (performance2 == null) {
                            return null;
                        }
                        Context requireContext3 = managerDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new usb(requireContext3);
                }
            }
        });
        final int i6 = 5;
        this.w = ypa.b(new Function0(this) { // from class: gsb
            public final /* synthetic */ ManagerDetailsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:65:0x02a1, code lost:
            
                if (defpackage.dti.e(r2) != false) goto L67;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                xsb xsbVar;
                int i22;
                int i32 = i6;
                ManagerDetailsFragment managerDetailsFragment = this.b;
                switch (i32) {
                    case 0:
                        Bundle requireArguments = managerDetailsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "MANAGER", ManagerData.class);
                        if (M != null) {
                            return (ManagerData) M;
                        }
                        a70.p("Serializable MANAGER not found");
                        return null;
                    case 1:
                        Context requireContext = managerDetailsFragment.requireContext();
                        requireContext.getClass();
                        psb psbVar = new psb(requireContext);
                        psbVar.a.d = new bba(managerDetailsFragment, 8);
                        return psbVar;
                    case 2:
                        Integer formerPlayerId = managerDetailsFragment.D().getManager().getFormerPlayerId();
                        if (formerPlayerId != null) {
                            String sportSlug = managerDetailsFragment.D().getManager().getSportSlug();
                            if (sportSlug == null) {
                                sportSlug = "";
                            }
                            break;
                        }
                        formerPlayerId = null;
                        if (formerPlayerId == null) {
                            return null;
                        }
                        int intValue = formerPlayerId.intValue();
                        Context requireContext2 = managerDetailsFragment.requireContext();
                        requireContext2.getClass();
                        q52 q52Var = new q52(requireContext2);
                        q52Var.j();
                        String string = managerDetailsFragment.getString(R.string.player_profile);
                        string.getClass();
                        q52Var.setText(string);
                        q52Var.setOnClickListener(new l8(managerDetailsFragment, intValue, 4));
                        return q52Var;
                    case 3:
                        LayoutInflater layoutInflater = managerDetailsFragment.getLayoutInflater();
                        krk krkVar = managerDetailsFragment.l;
                        krkVar.getClass();
                        loe a = loe.a(layoutInflater, ((oo8) krkVar).d);
                        ((ConstraintLayout) a.d.b).setVisibility(8);
                        xz0 xz0Var = a.e;
                        ((Group) xz0Var.l).setVisibility(8);
                        ((Group) xz0Var.m).setVisibility(8);
                        ((TextView) xz0Var.h).setVisibility(8);
                        ((TextView) xz0Var.i).setVisibility(8);
                        ((SofaDivider) xz0Var.f).setVisibility(8);
                        return a;
                    case 4:
                        ManagerPerformance performance = managerDetailsFragment.D().getManager().getPerformance();
                        if (performance == null) {
                            performance = null;
                        }
                        if (performance == null) {
                            return null;
                        }
                        LayoutInflater layoutInflater2 = managerDetailsFragment.getLayoutInflater();
                        krk krkVar2 = managerDetailsFragment.l;
                        krkVar2.getClass();
                        View inflate = layoutInflater2.inflate(R.layout.manager_performance_layout, (ViewGroup) ((oo8) krkVar2).d, false);
                        final HorizontalBarView horizontalBarView = (HorizontalBarView) nq8.B(R.id.horizontal_bar_view, inflate);
                        if (horizontalBarView == null) {
                            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.horizontal_bar_view)));
                            return null;
                        }
                        xsb xsbVar2 = new xsb((LinearLayout) inflate, horizontalBarView);
                        int wins = performance.getWins();
                        int draws = performance.getDraws();
                        Integer valueOf = Integer.valueOf(draws);
                        int losses = performance.getLosses();
                        fc9 fc9Var = new fc9(5);
                        bu1 bu1Var = horizontalBarView.d;
                        LinearLayout linearLayout = (LinearLayout) bu1Var.f;
                        FrameLayout frameLayout = (FrameLayout) bu1Var.c;
                        TextView textView = (TextView) bu1Var.i;
                        TextView textView2 = (TextView) bu1Var.g;
                        FrameLayout frameLayout2 = (FrameLayout) bu1Var.b;
                        linearLayout.getClass();
                        linearLayout.setVisibility(0);
                        int i42 = wins + losses + draws;
                        if (i42 > 0) {
                            float f = i42;
                            final float z = kda.z(wins, f);
                            final float z2 = kda.z(draws, f);
                            final float z3 = kda.z(losses, f);
                            ValueAnimator ofInt = ValueAnimator.ofInt(0, 400);
                            ofInt.setInterpolator(new qq7(1));
                            ofInt.setStartDelay(100L);
                            ofInt.setDuration(400L);
                            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ze9
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i52 = HorizontalBarView.e;
                                    valueAnimator.getClass();
                                    double parseDouble = Double.parseDouble(valueAnimator.getAnimatedValue().toString()) / 400.0d;
                                    bu1 bu1Var2 = HorizontalBarView.this.d;
                                    float f2 = (float) parseDouble;
                                    HorizontalBarView.l((FrameLayout) bu1Var2.j, z, f2);
                                    HorizontalBarView.l((FrameLayout) bu1Var2.b, z2, f2);
                                    HorizontalBarView.l((FrameLayout) bu1Var2.c, z3, f2);
                                }
                            });
                            ArrayList arrayList = new ArrayList();
                            xsbVar = xsbVar2;
                            double d = wins + draws + losses;
                            double d2 = (wins / d) * 100.0d;
                            double d3 = (draws / d) * 100.0d;
                            double d4 = (losses / d) * 100.0d;
                            int a2 = wzb.a(d2);
                            int a3 = wzb.a(d3);
                            int a4 = wzb.a(d4);
                            int i52 = a2 + a3 + a4;
                            if (i52 > 100) {
                                double d5 = d2 % 1.0d;
                                double d6 = d3 % 1.0d;
                                double d7 = d4 % 1.0d;
                                if (d5 >= d6 || d5 >= d7) {
                                    if (d6 >= d5 || d6 >= d7) {
                                        a4--;
                                    } else {
                                        a3--;
                                    }
                                    i22 = a2;
                                    arrayList.add(Integer.valueOf(i22));
                                    arrayList.add(Integer.valueOf(a3));
                                    arrayList.add(Integer.valueOf(a4));
                                    af9 af9Var422222222222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                    af9 af9Var2222222222222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                    af9 af9Var3222222222222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                    ofInt.addListener(af9Var422222222222222);
                                    ofInt.addListener(af9Var2222222222222222);
                                    ofInt.addListener(af9Var3222222222222222);
                                    ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                    ofInt.start();
                                } else {
                                    i22 = a2 - 1;
                                    arrayList.add(Integer.valueOf(i22));
                                    arrayList.add(Integer.valueOf(a3));
                                    arrayList.add(Integer.valueOf(a4));
                                    af9 af9Var4222222222222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                    af9 af9Var22222222222222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                    af9 af9Var32222222222222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                    ofInt.addListener(af9Var4222222222222222);
                                    ofInt.addListener(af9Var22222222222222222);
                                    ofInt.addListener(af9Var32222222222222222);
                                    ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                    ofInt.start();
                                }
                            } else {
                                if (i52 < 100) {
                                    double d8 = d2 % 1.0d;
                                    double d9 = d3 % 1.0d;
                                    double d10 = d4 % 1.0d;
                                    if (d8 > d9 && d8 > d10) {
                                        i22 = a2 + 1;
                                        arrayList.add(Integer.valueOf(i22));
                                        arrayList.add(Integer.valueOf(a3));
                                        arrayList.add(Integer.valueOf(a4));
                                        af9 af9Var42222222222222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                        af9 af9Var222222222222222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                        af9 af9Var322222222222222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                        ofInt.addListener(af9Var42222222222222222);
                                        ofInt.addListener(af9Var222222222222222222);
                                        ofInt.addListener(af9Var322222222222222222);
                                        ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                        ofInt.start();
                                    } else if (d9 <= d8 || d9 <= d10) {
                                        a4++;
                                    } else {
                                        a3++;
                                    }
                                }
                                i22 = a2;
                                arrayList.add(Integer.valueOf(i22));
                                arrayList.add(Integer.valueOf(a3));
                                arrayList.add(Integer.valueOf(a4));
                                af9 af9Var422222222222222222 = new af9(horizontalBarView, (TextView) bu1Var.k, ((Number) arrayList.get(0)).intValue());
                                af9 af9Var2222222222222222222 = new af9(horizontalBarView, (TextView) bu1Var.d, ((Number) arrayList.get(1)).intValue());
                                af9 af9Var3222222222222222222 = new af9(horizontalBarView, textView, ((Number) arrayList.get(2)).intValue());
                                ofInt.addListener(af9Var422222222222222222);
                                ofInt.addListener(af9Var2222222222222222222);
                                ofInt.addListener(af9Var3222222222222222222);
                                ofInt.addListener(new bf9(horizontalBarView, wins, valueOf, losses, fc9Var));
                                ofInt.start();
                            }
                        } else {
                            xsbVar = xsbVar2;
                            frameLayout2.setVisibility(0);
                            ((TextView) bu1Var.h).setText(String.valueOf(wins));
                            textView2.setText(String.valueOf(draws));
                            ((TextView) bu1Var.e).setText(String.valueOf(losses));
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(horizontalBarView.getContext().getColor(R.color.neutral_default));
                            gradientDrawable.setCornerRadius(horizontalBarView.getContext().getResources().getDimension(R.dimen.vote_view_radius_small));
                            frameLayout.setBackground(gradientDrawable);
                            textView.setText(horizontalBarView.getContext().getString(R.string.no_matches_played));
                            HorizontalBarView.l((FrameLayout) bu1Var.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            HorizontalBarView.l(frameLayout2, 1.0f, 1.0f);
                            HorizontalBarView.l(frameLayout, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        }
                        return xsbVar;
                    default:
                        List<CareerHistory> careerHistory = managerDetailsFragment.D().getCareerHistory();
                        if (careerHistory.isEmpty()) {
                            careerHistory = null;
                        }
                        if (careerHistory == null) {
                            return null;
                        }
                        ManagerPerformance performance2 = managerDetailsFragment.D().getManager().getPerformance();
                        if (performance2 == null) {
                            performance2 = null;
                        }
                        if (performance2 == null) {
                            return null;
                        }
                        Context requireContext3 = managerDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new usb(requireContext3);
                }
            }
        });
    }

    public final psb C() {
        return (psb) this.s.getValue();
    }

    public final ManagerData D() {
        return (ManagerData) this.r.getValue();
    }

    public final loe E() {
        return (loe) this.u.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "DetailsTab";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        int i;
        String Q;
        GridItem gridItem;
        Throwable th;
        boolean z;
        String p;
        krk krkVar = this.l;
        krkVar.getClass();
        RecyclerView recyclerView = ((oo8) krkVar).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView2 = ((oo8) krkVar2).d;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView2.setPaddingRelative(recyclerView2.getPaddingStart(), ao2.s(4, requireContext2), recyclerView2.getPaddingEnd(), recyclerView2.getPaddingBottom());
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((oo8) krkVar3).d.setAdapter(C());
        krk krkVar4 = this.l;
        krkVar4.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar4).e;
        swipeRefreshLayout.getClass();
        Throwable th2 = null;
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        l();
        List<Team> teams = D().getManager().getTeams();
        int i2 = 0;
        if (teams != null) {
            E().f.setVisibility(!teams.isEmpty() ? 0 : 8);
            sea.v(E().f, true, true, 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
            int i3 = 0;
            for (Object obj : teams) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    Throwable th3 = th2;
                    b.q();
                    throw th3;
                }
                Team team = (Team) obj;
                xz0 a = xz0.a(getLayoutInflater().inflate(R.layout.player_details_team_item, (ViewGroup) E().f, false));
                SofaDivider sofaDivider = (SofaDivider) a.f;
                ConstraintLayout constraintLayout = (ConstraintLayout) a.j;
                ((TextView) a.h).setVisibility(8);
                TextView textView = a.e;
                if (qea.y(team)) {
                    Context requireContext3 = requireContext();
                    requireContext3.getClass();
                    th = th2;
                    z = true;
                    p = wv8.i(tba.p(requireContext3, team), " ", requireContext().getString(R.string.female_team));
                } else {
                    th = th2;
                    z = true;
                    Context requireContext4 = requireContext();
                    requireContext4.getClass();
                    p = tba.p(requireContext4, team);
                }
                textView.setText(p);
                as9.o(a.c, team.getId());
                constraintLayout.getClass();
                aba.y(constraintLayout, 0, 3);
                constraintLayout.setOnClickListener(new au7(19, this, team));
                sofaDivider.setDividerVisibility(i3 != teams.size() + (-1) ? z : false);
                sofaDivider.setVisibility(i3 != teams.size() + (-1) ? 0 : 8);
                E().f.addView(constraintLayout);
                th2 = th;
                i3 = i4;
            }
        }
        Gender gender = th2;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) E().e.j;
        constraintLayout2.getClass();
        constraintLayout2.setVisibility(8);
        Manager manager = D().getManager();
        Context requireContext5 = requireContext();
        requireContext5.getClass();
        ofe ofeVar = new ofe(requireContext5, i2);
        ArrayList arrayList = new ArrayList();
        new SimpleDateFormat("yyyy-MM-dd", Locale.UK).setTimeZone(TimeZone.getTimeZone("GMT"));
        krk krkVar5 = this.l;
        krkVar5.getClass();
        GridView gridView = E().b;
        sea.v(gridView, true, true, 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
        gridView.setAdapter((ListAdapter) ofeVar);
        ArrayList arrayList2 = dv3.a;
        Country country = manager.getCountry();
        com.sofascore.model.Country a2 = dv3.a(country != null ? country.getAlpha2() : gender);
        gridView.setOnItemClickListener(new ah5(2, this, a2));
        if (a2 != null) {
            GridItem gridItem2 = new GridItem(GridItem.Type.IMAGE, getString(R.string.nationality));
            gridItem2.setFirst(a2.getIoc());
            gridItem2.setIsEnabled(true);
            gridItem2.setCountryCode(a2.getIso2Alpha());
            arrayList.add(gridItem2);
            i = 1;
        } else {
            i = 0;
        }
        Long dateOfBirthTimestamp = manager.getDateOfBirthTimestamp();
        if (dateOfBirthTimestamp != null) {
            long longValue = dateOfBirthTimestamp.longValue();
            if (manager.getDeceased()) {
                if (manager.getDateOfDeathTimestamp() != null) {
                    Context requireContext6 = requireContext();
                    requireContext6.getClass();
                    String Q2 = hkg.Q(requireContext6, R.string.deceased, gender, new Object[0]);
                    Long dateOfDeathTimestamp = manager.getDateOfDeathTimestamp();
                    dateOfDeathTimestamp.getClass();
                    long longValue2 = dateOfDeathTimestamp.longValue();
                    bi4 bi4Var = bi4.PATTERN_Y;
                    Locale d = dla.d();
                    ZoneId of = ZoneId.of("GMT");
                    of.getClass();
                    Q = wv8.i(Q2, " ", fc6.i(longValue2, DateTimeFormatter.ofPattern(bi4Var.d(), d).withZone(of).withDecimalStyle(DecimalStyle.of(d))));
                } else {
                    Context requireContext7 = requireContext();
                    requireContext7.getClass();
                    Q = hkg.Q(requireContext7, R.string.deceased, null, new Object[0]);
                }
                bi4 bi4Var2 = bi4.PATTERN_DMMY;
                Locale d2 = dla.d();
                ZoneId of2 = ZoneId.of("GMT");
                of2.getClass();
                GridItem gridItem3 = new GridItem(GridItem.Type.SPLIT, fc6.i(longValue, DateTimeFormatter.ofPattern(bi4Var2.d(), d2).withZone(of2).withDecimalStyle(DecimalStyle.of(d2))));
                gridItem3.setSecond(Q);
                gridItem3.setGrayedSecondText(true);
                gridItem = gridItem3;
            } else {
                GridItem.Type type = GridItem.Type.SPLIT;
                bi4 bi4Var3 = bi4.PATTERN_DMMY;
                Locale d3 = dla.d();
                ZoneId of3 = ZoneId.of("GMT");
                of3.getClass();
                gridItem = new GridItem(type, fc6.i(longValue, DateTimeFormatter.ofPattern(bi4Var3.d(), d3).withZone(of3).withDecimalStyle(DecimalStyle.of(d3))));
                int between = (int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(longValue * 1000)), vxd.o(Instant.ofEpochMilli(yaa.v())));
                gridItem.setFirst(gridView.getContext().getResources().getQuantityString(R.plurals.years_short, between, String.valueOf(between)));
            }
            arrayList.add(gridItem);
            i++;
        }
        String preferredFormation = manager.getPreferredFormation();
        if (preferredFormation != null) {
            GridItem gridItem4 = new GridItem(GridItem.Type.DEFAULT, getString(R.string.preferred_formation));
            gridItem4.setFirst(preferredFormation);
            arrayList.add(gridItem4);
            i++;
        }
        ManagerPerformance performance = manager.getPerformance();
        if (performance != null) {
            GridItem.Type type2 = GridItem.Type.DEFAULT;
            mqi mqiVar = bii.a;
            GridItem gridItem5 = new GridItem(type2, getString(bii.b(manager.getSportSlug(), false)));
            gridItem5.setFirst(String.valueOf(performance.getTotal()));
            arrayList.add(gridItem5);
            double totalPoints = performance.getTotalPoints() / performance.getTotal();
            DecimalFormat decimalFormat = new DecimalFormat("0.00", new DecimalFormatSymbols(dla.d()));
            GridItem gridItem6 = new GridItem(type2, getString(R.string.points_per_match_short));
            gridItem6.setFirst(decimalFormat.format(totalPoints));
            arrayList.add(gridItem6);
            i += 2;
        }
        int ceil = (int) Math.ceil(i / 3.0d);
        Context requireContext8 = requireContext();
        requireContext8.getClass();
        gridView.getLayoutParams().height = ceil * ao2.s(56, requireContext8);
        ofeVar.a(arrayList);
        final int i5 = 0;
        t(view, new Function1(this) { // from class: hsb
            public final /* synthetic */ ManagerDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i6 = i5;
                ManagerDetailsFragment managerDetailsFragment = this.b;
                View view2 = (View) obj2;
                switch (i6) {
                    case 0:
                        view2.getClass();
                        q52 q52Var = (q52) managerDetailsFragment.t.getValue();
                        if (q52Var != null) {
                            r0.p(managerDetailsFragment.C().g.size(), q52Var);
                        }
                        psb C = managerDetailsFragment.C();
                        LinearLayout linearLayout = managerDetailsFragment.E().a;
                        linearLayout.getClass();
                        C.p(C.g.size(), linearLayout);
                        xsb xsbVar = (xsb) managerDetailsFragment.v.getValue();
                        if (xsbVar != null) {
                            psb C2 = managerDetailsFragment.C();
                            LinearLayout linearLayout2 = xsbVar.a;
                            linearLayout2.getClass();
                            C2.p(C2.g.size(), linearLayout2);
                        }
                        usb usbVar = (usb) managerDetailsFragment.w.getValue();
                        if (usbVar != null) {
                            r0.p(managerDetailsFragment.C().g.size(), usbVar);
                        }
                        if (!managerDetailsFragment.D().getCareerHistory().isEmpty()) {
                            managerDetailsFragment.C().F(managerDetailsFragment.D().getCareerHistory());
                        }
                        break;
                    default:
                        view2.getClass();
                        usb usbVar2 = (usb) managerDetailsFragment.w.getValue();
                        if (usbVar2 != null) {
                            ManagerPerformance performance2 = managerDetailsFragment.D().getManager().getPerformance();
                            List<CareerHistory> careerHistory = managerDetailsFragment.D().getCareerHistory();
                            int i7 = usb.f;
                            e92 e92Var = usbVar2.d;
                            careerHistory.getClass();
                            if (performance2 != null) {
                                usbVar2.e = performance2.getTotalPoints() / performance2.getTotal();
                            }
                            ManagerHistoryChartGraph managerHistoryChartGraph = (ManagerHistoryChartGraph) e92Var.d;
                            kqb kqbVar = (kqb) e92Var.b;
                            float f = usbVar2.e;
                            if (managerHistoryChartGraph.isAttachedToWindow()) {
                                g6b t = qea.t(managerHistoryChartGraph);
                                if (t != null) {
                                    xw3.L(wca.x(t), null, null, new ip4(managerHistoryChartGraph, f, careerHistory, (rq3) null), 3);
                                }
                            } else {
                                managerHistoryChartGraph.addOnAttachStateChangeListener(new tsb(managerHistoryChartGraph, managerHistoryChartGraph, f, careerHistory));
                            }
                            kqbVar.d.setText(usbVar2.getContext().getString(R.string.career_history));
                            ConstraintLayout constraintLayout3 = kqbVar.b;
                            constraintLayout3.getClass();
                            constraintLayout3.setVisibility(0);
                            pu1 pu1Var = (pu1) e92Var.f;
                            LinearLayout linearLayout3 = pu1Var.b;
                            linearLayout3.getClass();
                            linearLayout3.setVisibility(0);
                            pu1Var.d.setText(usbVar2.getResources().getString(R.string.average_points));
                            pu1Var.c.setImageTintList(eq3.q(R.color.secondary_default, usbVar2.getContext()));
                            pu1 pu1Var2 = (pu1) e92Var.c;
                            LinearLayout linearLayout4 = pu1Var2.b;
                            linearLayout4.getClass();
                            linearLayout4.setVisibility(0);
                            pu1Var2.d.setText(usbVar2.getResources().getString(R.string.average_points_total));
                            me4.s(new Object[]{Float.valueOf(usbVar2.e)}, 1, dla.d(), "%.2f", pu1Var2.e);
                            ImageView imageView = pu1Var2.c;
                            imageView.setImageResource(R.drawable.ic_graph_color_indicator_dashed);
                            imageView.setImageTintList(eq3.q(R.color.error, usbVar2.getContext()));
                        }
                        break;
                }
                return Unit.a;
            }
        });
        usb usbVar = (usb) this.w.getValue();
        if (usbVar != null) {
            final int i6 = 1;
            t(usbVar, new Function1(this) { // from class: hsb
                public final /* synthetic */ ManagerDetailsFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i62 = i6;
                    ManagerDetailsFragment managerDetailsFragment = this.b;
                    View view2 = (View) obj2;
                    switch (i62) {
                        case 0:
                            view2.getClass();
                            q52 q52Var = (q52) managerDetailsFragment.t.getValue();
                            if (q52Var != null) {
                                r0.p(managerDetailsFragment.C().g.size(), q52Var);
                            }
                            psb C = managerDetailsFragment.C();
                            LinearLayout linearLayout = managerDetailsFragment.E().a;
                            linearLayout.getClass();
                            C.p(C.g.size(), linearLayout);
                            xsb xsbVar = (xsb) managerDetailsFragment.v.getValue();
                            if (xsbVar != null) {
                                psb C2 = managerDetailsFragment.C();
                                LinearLayout linearLayout2 = xsbVar.a;
                                linearLayout2.getClass();
                                C2.p(C2.g.size(), linearLayout2);
                            }
                            usb usbVar2 = (usb) managerDetailsFragment.w.getValue();
                            if (usbVar2 != null) {
                                r0.p(managerDetailsFragment.C().g.size(), usbVar2);
                            }
                            if (!managerDetailsFragment.D().getCareerHistory().isEmpty()) {
                                managerDetailsFragment.C().F(managerDetailsFragment.D().getCareerHistory());
                            }
                            break;
                        default:
                            view2.getClass();
                            usb usbVar22 = (usb) managerDetailsFragment.w.getValue();
                            if (usbVar22 != null) {
                                ManagerPerformance performance2 = managerDetailsFragment.D().getManager().getPerformance();
                                List<CareerHistory> careerHistory = managerDetailsFragment.D().getCareerHistory();
                                int i7 = usb.f;
                                e92 e92Var = usbVar22.d;
                                careerHistory.getClass();
                                if (performance2 != null) {
                                    usbVar22.e = performance2.getTotalPoints() / performance2.getTotal();
                                }
                                ManagerHistoryChartGraph managerHistoryChartGraph = (ManagerHistoryChartGraph) e92Var.d;
                                kqb kqbVar = (kqb) e92Var.b;
                                float f = usbVar22.e;
                                if (managerHistoryChartGraph.isAttachedToWindow()) {
                                    g6b t = qea.t(managerHistoryChartGraph);
                                    if (t != null) {
                                        xw3.L(wca.x(t), null, null, new ip4(managerHistoryChartGraph, f, careerHistory, (rq3) null), 3);
                                    }
                                } else {
                                    managerHistoryChartGraph.addOnAttachStateChangeListener(new tsb(managerHistoryChartGraph, managerHistoryChartGraph, f, careerHistory));
                                }
                                kqbVar.d.setText(usbVar22.getContext().getString(R.string.career_history));
                                ConstraintLayout constraintLayout3 = kqbVar.b;
                                constraintLayout3.getClass();
                                constraintLayout3.setVisibility(0);
                                pu1 pu1Var = (pu1) e92Var.f;
                                LinearLayout linearLayout3 = pu1Var.b;
                                linearLayout3.getClass();
                                linearLayout3.setVisibility(0);
                                pu1Var.d.setText(usbVar22.getResources().getString(R.string.average_points));
                                pu1Var.c.setImageTintList(eq3.q(R.color.secondary_default, usbVar22.getContext()));
                                pu1 pu1Var2 = (pu1) e92Var.c;
                                LinearLayout linearLayout4 = pu1Var2.b;
                                linearLayout4.getClass();
                                linearLayout4.setVisibility(0);
                                pu1Var2.d.setText(usbVar22.getResources().getString(R.string.average_points_total));
                                me4.s(new Object[]{Float.valueOf(usbVar22.e)}, 1, dla.d(), "%.2f", pu1Var2.e);
                                ImageView imageView = pu1Var2.c;
                                imageView.setImageResource(R.drawable.ic_graph_color_indicator_dashed);
                                imageView.setImageTintList(eq3.q(R.color.error, usbVar22.getContext()));
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
        }
    }
}
