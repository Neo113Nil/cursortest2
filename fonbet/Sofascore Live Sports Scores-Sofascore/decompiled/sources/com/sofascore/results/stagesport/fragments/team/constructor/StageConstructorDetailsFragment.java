package com.sofascore.results.stagesport.fragments.team.constructor;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.stagesport.StageTeamOddsView;
import com.sofascore.results.stagesport.fragments.team.constructor.StageConstructorDetailsFragment;
import defpackage.aba;
import defpackage.ao2;
import defpackage.as9;
import defpackage.bte;
import defpackage.chf;
import defpackage.cv1;
import defpackage.duf;
import defpackage.e8i;
import defpackage.fuf;
import defpackage.g2i;
import defpackage.g7;
import defpackage.h2i;
import defpackage.h8i;
import defpackage.i2i;
import defpackage.ioe;
import defpackage.joa;
import defpackage.k2i;
import defpackage.krk;
import defpackage.l5i;
import defpackage.mn3;
import defpackage.mqi;
import defpackage.n9e;
import defpackage.nq8;
import defpackage.o1i;
import defpackage.o8i;
import defpackage.on3;
import defpackage.oo8;
import defpackage.otk;
import defpackage.tba;
import defpackage.wsf;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zsk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/team/constructor/StageConstructorDetailsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageConstructorDetailsFragment extends Hilt_StageConstructorDetailsFragment<oo8> {
    public final otk r;
    public final otk s;
    public final mqi t;
    public final mqi u;
    public final joa v;
    public final joa w;
    public final joa x;
    public zsk y;

    public StageConstructorDetailsFragment() {
        fuf fufVar = duf.a;
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.r = new otk(fufVar.getOrCreateKotlinClass(h8i.class), new i2i(this, i), new i2i(this, i3), new i2i(this, i2));
        final int i4 = 3;
        i2i i2iVar = new i2i(this, i4);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new o1i(i2iVar, 2));
        this.s = new otk(fufVar.getOrCreateKotlinClass(o8i.class), new wsf(a, 11), new bte(this, a, 13), new wsf(a, 12));
        this.t = ypa.b(new Function0(this) { // from class: f2i
            public final /* synthetic */ StageConstructorDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean k;
                int i5 = i;
                int i6 = R.id.drivers_label;
                StageConstructorDetailsFragment stageConstructorDetailsFragment = this.b;
                switch (i5) {
                    case 0:
                        LayoutInflater layoutInflater = stageConstructorDetailsFragment.getLayoutInflater();
                        krk krkVar = stageConstructorDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.constructor_drivers_header, (ViewGroup) ((oo8) krkVar).d, false);
                        View B = nq8.B(R.id.divider, inflate);
                        if (B != null) {
                            TextView textView = (TextView) nq8.B(R.id.drivers_label, inflate);
                            if (textView != null) {
                                i6 = R.id.first_driver;
                                View B2 = nq8.B(R.id.first_driver, inflate);
                                if (B2 != null) {
                                    cv1 a2 = cv1.a(B2);
                                    i6 = R.id.second_driver;
                                    View B3 = nq8.B(R.id.second_driver, inflate);
                                    if (B3 != null) {
                                        return new mn3((ConstraintLayout) inflate, B, textView, a2, cv1.a(B3));
                                    }
                                }
                            }
                        } else {
                            i6 = R.id.divider;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        LayoutInflater layoutInflater2 = stageConstructorDetailsFragment.getLayoutInflater();
                        krk krkVar2 = stageConstructorDetailsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.constructor_team_history_footer, (ViewGroup) ((oo8) krkVar2).d, false);
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate2);
                        if (linearLayout == null) {
                            i6 = R.id.container;
                        } else if (((TextView) nq8.B(R.id.drivers_label, inflate2)) != null) {
                            return new on3((LinearLayout) inflate2, linearLayout);
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i6)));
                        return null;
                    case 2:
                        k = stageConstructorDetailsFragment.D().k();
                        break;
                    case 3:
                        Context requireContext = stageConstructorDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new StageTeamOddsView(requireContext, null, 6);
                    case 4:
                        k = stageConstructorDetailsFragment.D().k();
                        break;
                    case 5:
                        Context requireContext2 = stageConstructorDetailsFragment.requireContext();
                        requireContext2.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext2, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    default:
                        Context requireContext3 = stageConstructorDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new k2i(requireContext3);
                }
                return Boolean.valueOf(k);
            }
        });
        this.u = ypa.b(new Function0(this) { // from class: f2i
            public final /* synthetic */ StageConstructorDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean k;
                int i5 = i2;
                int i6 = R.id.drivers_label;
                StageConstructorDetailsFragment stageConstructorDetailsFragment = this.b;
                switch (i5) {
                    case 0:
                        LayoutInflater layoutInflater = stageConstructorDetailsFragment.getLayoutInflater();
                        krk krkVar = stageConstructorDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.constructor_drivers_header, (ViewGroup) ((oo8) krkVar).d, false);
                        View B = nq8.B(R.id.divider, inflate);
                        if (B != null) {
                            TextView textView = (TextView) nq8.B(R.id.drivers_label, inflate);
                            if (textView != null) {
                                i6 = R.id.first_driver;
                                View B2 = nq8.B(R.id.first_driver, inflate);
                                if (B2 != null) {
                                    cv1 a2 = cv1.a(B2);
                                    i6 = R.id.second_driver;
                                    View B3 = nq8.B(R.id.second_driver, inflate);
                                    if (B3 != null) {
                                        return new mn3((ConstraintLayout) inflate, B, textView, a2, cv1.a(B3));
                                    }
                                }
                            }
                        } else {
                            i6 = R.id.divider;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        LayoutInflater layoutInflater2 = stageConstructorDetailsFragment.getLayoutInflater();
                        krk krkVar2 = stageConstructorDetailsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.constructor_team_history_footer, (ViewGroup) ((oo8) krkVar2).d, false);
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate2);
                        if (linearLayout == null) {
                            i6 = R.id.container;
                        } else if (((TextView) nq8.B(R.id.drivers_label, inflate2)) != null) {
                            return new on3((LinearLayout) inflate2, linearLayout);
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i6)));
                        return null;
                    case 2:
                        k = stageConstructorDetailsFragment.D().k();
                        break;
                    case 3:
                        Context requireContext = stageConstructorDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new StageTeamOddsView(requireContext, null, 6);
                    case 4:
                        k = stageConstructorDetailsFragment.D().k();
                        break;
                    case 5:
                        Context requireContext2 = stageConstructorDetailsFragment.requireContext();
                        requireContext2.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext2, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    default:
                        Context requireContext3 = stageConstructorDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new k2i(requireContext3);
                }
                return Boolean.valueOf(k);
            }
        });
        this.v = n9e.M(new Function0(this) { // from class: f2i
            public final /* synthetic */ StageConstructorDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean k;
                int i5 = i3;
                int i6 = R.id.drivers_label;
                StageConstructorDetailsFragment stageConstructorDetailsFragment = this.b;
                switch (i5) {
                    case 0:
                        LayoutInflater layoutInflater = stageConstructorDetailsFragment.getLayoutInflater();
                        krk krkVar = stageConstructorDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.constructor_drivers_header, (ViewGroup) ((oo8) krkVar).d, false);
                        View B = nq8.B(R.id.divider, inflate);
                        if (B != null) {
                            TextView textView = (TextView) nq8.B(R.id.drivers_label, inflate);
                            if (textView != null) {
                                i6 = R.id.first_driver;
                                View B2 = nq8.B(R.id.first_driver, inflate);
                                if (B2 != null) {
                                    cv1 a2 = cv1.a(B2);
                                    i6 = R.id.second_driver;
                                    View B3 = nq8.B(R.id.second_driver, inflate);
                                    if (B3 != null) {
                                        return new mn3((ConstraintLayout) inflate, B, textView, a2, cv1.a(B3));
                                    }
                                }
                            }
                        } else {
                            i6 = R.id.divider;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        LayoutInflater layoutInflater2 = stageConstructorDetailsFragment.getLayoutInflater();
                        krk krkVar2 = stageConstructorDetailsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.constructor_team_history_footer, (ViewGroup) ((oo8) krkVar2).d, false);
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate2);
                        if (linearLayout == null) {
                            i6 = R.id.container;
                        } else if (((TextView) nq8.B(R.id.drivers_label, inflate2)) != null) {
                            return new on3((LinearLayout) inflate2, linearLayout);
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i6)));
                        return null;
                    case 2:
                        k = stageConstructorDetailsFragment.D().k();
                        break;
                    case 3:
                        Context requireContext = stageConstructorDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new StageTeamOddsView(requireContext, null, 6);
                    case 4:
                        k = stageConstructorDetailsFragment.D().k();
                        break;
                    case 5:
                        Context requireContext2 = stageConstructorDetailsFragment.requireContext();
                        requireContext2.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext2, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    default:
                        Context requireContext3 = stageConstructorDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new k2i(requireContext3);
                }
                return Boolean.valueOf(k);
            }
        }, new Function0(this) { // from class: f2i
            public final /* synthetic */ StageConstructorDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean k;
                int i5 = i4;
                int i6 = R.id.drivers_label;
                StageConstructorDetailsFragment stageConstructorDetailsFragment = this.b;
                switch (i5) {
                    case 0:
                        LayoutInflater layoutInflater = stageConstructorDetailsFragment.getLayoutInflater();
                        krk krkVar = stageConstructorDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.constructor_drivers_header, (ViewGroup) ((oo8) krkVar).d, false);
                        View B = nq8.B(R.id.divider, inflate);
                        if (B != null) {
                            TextView textView = (TextView) nq8.B(R.id.drivers_label, inflate);
                            if (textView != null) {
                                i6 = R.id.first_driver;
                                View B2 = nq8.B(R.id.first_driver, inflate);
                                if (B2 != null) {
                                    cv1 a2 = cv1.a(B2);
                                    i6 = R.id.second_driver;
                                    View B3 = nq8.B(R.id.second_driver, inflate);
                                    if (B3 != null) {
                                        return new mn3((ConstraintLayout) inflate, B, textView, a2, cv1.a(B3));
                                    }
                                }
                            }
                        } else {
                            i6 = R.id.divider;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                        return null;
                    case 1:
                        LayoutInflater layoutInflater2 = stageConstructorDetailsFragment.getLayoutInflater();
                        krk krkVar2 = stageConstructorDetailsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.constructor_team_history_footer, (ViewGroup) ((oo8) krkVar2).d, false);
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate2);
                        if (linearLayout == null) {
                            i6 = R.id.container;
                        } else if (((TextView) nq8.B(R.id.drivers_label, inflate2)) != null) {
                            return new on3((LinearLayout) inflate2, linearLayout);
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i6)));
                        return null;
                    case 2:
                        k = stageConstructorDetailsFragment.D().k();
                        break;
                    case 3:
                        Context requireContext = stageConstructorDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new StageTeamOddsView(requireContext, null, 6);
                    case 4:
                        k = stageConstructorDetailsFragment.D().k();
                        break;
                    case 5:
                        Context requireContext2 = stageConstructorDetailsFragment.requireContext();
                        requireContext2.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext2, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    default:
                        Context requireContext3 = stageConstructorDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new k2i(requireContext3);
                }
                return Boolean.valueOf(k);
            }
        });
        final int i5 = 4;
        final int i6 = 5;
        this.w = n9e.M(new Function0(this) { // from class: f2i
            public final /* synthetic */ StageConstructorDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean k;
                int i52 = i5;
                int i62 = R.id.drivers_label;
                StageConstructorDetailsFragment stageConstructorDetailsFragment = this.b;
                switch (i52) {
                    case 0:
                        LayoutInflater layoutInflater = stageConstructorDetailsFragment.getLayoutInflater();
                        krk krkVar = stageConstructorDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.constructor_drivers_header, (ViewGroup) ((oo8) krkVar).d, false);
                        View B = nq8.B(R.id.divider, inflate);
                        if (B != null) {
                            TextView textView = (TextView) nq8.B(R.id.drivers_label, inflate);
                            if (textView != null) {
                                i62 = R.id.first_driver;
                                View B2 = nq8.B(R.id.first_driver, inflate);
                                if (B2 != null) {
                                    cv1 a2 = cv1.a(B2);
                                    i62 = R.id.second_driver;
                                    View B3 = nq8.B(R.id.second_driver, inflate);
                                    if (B3 != null) {
                                        return new mn3((ConstraintLayout) inflate, B, textView, a2, cv1.a(B3));
                                    }
                                }
                            }
                        } else {
                            i62 = R.id.divider;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i62)));
                        return null;
                    case 1:
                        LayoutInflater layoutInflater2 = stageConstructorDetailsFragment.getLayoutInflater();
                        krk krkVar2 = stageConstructorDetailsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.constructor_team_history_footer, (ViewGroup) ((oo8) krkVar2).d, false);
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate2);
                        if (linearLayout == null) {
                            i62 = R.id.container;
                        } else if (((TextView) nq8.B(R.id.drivers_label, inflate2)) != null) {
                            return new on3((LinearLayout) inflate2, linearLayout);
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i62)));
                        return null;
                    case 2:
                        k = stageConstructorDetailsFragment.D().k();
                        break;
                    case 3:
                        Context requireContext = stageConstructorDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new StageTeamOddsView(requireContext, null, 6);
                    case 4:
                        k = stageConstructorDetailsFragment.D().k();
                        break;
                    case 5:
                        Context requireContext2 = stageConstructorDetailsFragment.requireContext();
                        requireContext2.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext2, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    default:
                        Context requireContext3 = stageConstructorDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new k2i(requireContext3);
                }
                return Boolean.valueOf(k);
            }
        }, new Function0(this) { // from class: f2i
            public final /* synthetic */ StageConstructorDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean k;
                int i52 = i6;
                int i62 = R.id.drivers_label;
                StageConstructorDetailsFragment stageConstructorDetailsFragment = this.b;
                switch (i52) {
                    case 0:
                        LayoutInflater layoutInflater = stageConstructorDetailsFragment.getLayoutInflater();
                        krk krkVar = stageConstructorDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.constructor_drivers_header, (ViewGroup) ((oo8) krkVar).d, false);
                        View B = nq8.B(R.id.divider, inflate);
                        if (B != null) {
                            TextView textView = (TextView) nq8.B(R.id.drivers_label, inflate);
                            if (textView != null) {
                                i62 = R.id.first_driver;
                                View B2 = nq8.B(R.id.first_driver, inflate);
                                if (B2 != null) {
                                    cv1 a2 = cv1.a(B2);
                                    i62 = R.id.second_driver;
                                    View B3 = nq8.B(R.id.second_driver, inflate);
                                    if (B3 != null) {
                                        return new mn3((ConstraintLayout) inflate, B, textView, a2, cv1.a(B3));
                                    }
                                }
                            }
                        } else {
                            i62 = R.id.divider;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i62)));
                        return null;
                    case 1:
                        LayoutInflater layoutInflater2 = stageConstructorDetailsFragment.getLayoutInflater();
                        krk krkVar2 = stageConstructorDetailsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.constructor_team_history_footer, (ViewGroup) ((oo8) krkVar2).d, false);
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate2);
                        if (linearLayout == null) {
                            i62 = R.id.container;
                        } else if (((TextView) nq8.B(R.id.drivers_label, inflate2)) != null) {
                            return new on3((LinearLayout) inflate2, linearLayout);
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i62)));
                        return null;
                    case 2:
                        k = stageConstructorDetailsFragment.D().k();
                        break;
                    case 3:
                        Context requireContext = stageConstructorDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new StageTeamOddsView(requireContext, null, 6);
                    case 4:
                        k = stageConstructorDetailsFragment.D().k();
                        break;
                    case 5:
                        Context requireContext2 = stageConstructorDetailsFragment.requireContext();
                        requireContext2.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext2, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    default:
                        Context requireContext3 = stageConstructorDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new k2i(requireContext3);
                }
                return Boolean.valueOf(k);
            }
        });
        final int i7 = 6;
        this.x = ypa.a(ysaVar, new Function0(this) { // from class: f2i
            public final /* synthetic */ StageConstructorDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean k;
                int i52 = i7;
                int i62 = R.id.drivers_label;
                StageConstructorDetailsFragment stageConstructorDetailsFragment = this.b;
                switch (i52) {
                    case 0:
                        LayoutInflater layoutInflater = stageConstructorDetailsFragment.getLayoutInflater();
                        krk krkVar = stageConstructorDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.constructor_drivers_header, (ViewGroup) ((oo8) krkVar).d, false);
                        View B = nq8.B(R.id.divider, inflate);
                        if (B != null) {
                            TextView textView = (TextView) nq8.B(R.id.drivers_label, inflate);
                            if (textView != null) {
                                i62 = R.id.first_driver;
                                View B2 = nq8.B(R.id.first_driver, inflate);
                                if (B2 != null) {
                                    cv1 a2 = cv1.a(B2);
                                    i62 = R.id.second_driver;
                                    View B3 = nq8.B(R.id.second_driver, inflate);
                                    if (B3 != null) {
                                        return new mn3((ConstraintLayout) inflate, B, textView, a2, cv1.a(B3));
                                    }
                                }
                            }
                        } else {
                            i62 = R.id.divider;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i62)));
                        return null;
                    case 1:
                        LayoutInflater layoutInflater2 = stageConstructorDetailsFragment.getLayoutInflater();
                        krk krkVar2 = stageConstructorDetailsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.constructor_team_history_footer, (ViewGroup) ((oo8) krkVar2).d, false);
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate2);
                        if (linearLayout == null) {
                            i62 = R.id.container;
                        } else if (((TextView) nq8.B(R.id.drivers_label, inflate2)) != null) {
                            return new on3((LinearLayout) inflate2, linearLayout);
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i62)));
                        return null;
                    case 2:
                        k = stageConstructorDetailsFragment.D().k();
                        break;
                    case 3:
                        Context requireContext = stageConstructorDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new StageTeamOddsView(requireContext, null, 6);
                    case 4:
                        k = stageConstructorDetailsFragment.D().k();
                        break;
                    case 5:
                        Context requireContext2 = stageConstructorDetailsFragment.requireContext();
                        requireContext2.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext2, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                    default:
                        Context requireContext3 = stageConstructorDetailsFragment.requireContext();
                        requireContext3.getClass();
                        return new k2i(requireContext3);
                }
                return Boolean.valueOf(k);
            }
        });
    }

    public final k2i C() {
        return (k2i) this.x.getValue();
    }

    public final o8i D() {
        return (o8i) this.s.getValue();
    }

    public final h8i E() {
        return (h8i) this.r.getValue();
    }

    public final void F(Team team, cv1 cv1Var) {
        Integer number;
        ConstraintLayout constraintLayout = cv1Var.b;
        TextView textView = cv1Var.f;
        aba.y(constraintLayout, 0, 3);
        as9.o(cv1Var.e, team.getId());
        ImageView imageView = cv1Var.c;
        Country country = team.getCountry();
        as9.c(imageView, country != null ? country.getAlpha2() : null, false, null, 6);
        TextView textView2 = cv1Var.d;
        Context requireContext = requireContext();
        requireContext.getClass();
        textView2.setText(tba.p(requireContext, team));
        PlayerTeamInfo playerTeamInfo = team.getPlayerTeamInfo();
        if (playerTeamInfo == null || (number = playerTeamInfo.getNumber()) == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(String.valueOf(number.intValue()));
        }
        constraintLayout.setOnClickListener(new h2i(this, team, 1));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "InfoTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        List list;
        List list2;
        Category category;
        l();
        krk krkVar = this.l;
        krkVar.getClass();
        int i = 0;
        ((oo8) krkVar).e.setEnabled(false);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView2 = ((oo8) krkVar3).d;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView2.setPaddingRelative(recyclerView2.getPaddingStart(), ao2.s(4, requireContext2), recyclerView2.getPaddingEnd(), recyclerView2.getPaddingBottom());
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((oo8) krkVar4).d.setAdapter(C());
        e8i e8iVar = (e8i) E().k.d();
        if (e8iVar != null && (list2 = e8iVar.b) != null) {
            mqi mqiVar = this.t;
            TextView textView = ((mn3) mqiVar.getValue()).c;
            joa joaVar = l5i.a;
            Context requireContext3 = requireContext();
            requireContext3.getClass();
            Team l = E().l();
            String slug = (l == null || (category = l.getCategory()) == null) ? null : category.getSlug();
            if (slug == null) {
                slug = "";
            }
            textView.setText(l5i.c(requireContext3, 4, slug));
            List L0 = CollectionsKt.L0(list2, 2);
            if (L0.size() != 2) {
                L0 = null;
            }
            if (L0 != null) {
                k2i C = C();
                ConstraintLayout constraintLayout = ((mn3) mqiVar.getValue()).a;
                constraintLayout.getClass();
                C.p(0, constraintLayout);
                F((Team) list2.get(0), ((mn3) mqiVar.getValue()).d);
                F((Team) list2.get(1), ((mn3) mqiVar.getValue()).e);
            }
        }
        e8i e8iVar2 = (e8i) E().k.d();
        if (e8iVar2 != null && (list = e8iVar2.c) != null) {
            List<Team> list3 = list.isEmpty() ? null : list;
            if (list3 != null) {
                k2i C2 = C();
                mqi mqiVar2 = this.u;
                LinearLayout linearLayout = ((on3) mqiVar2.getValue()).a;
                linearLayout.getClass();
                g7.o(C2, linearLayout, 6);
                for (Team team : list3) {
                    LinearLayout linearLayout2 = ((on3) mqiVar2.getValue()).b;
                    View inflate = getLayoutInflater().inflate(R.layout.constructor_team_history_item, (ViewGroup) ((on3) mqiVar2.getValue()).a, false);
                    int i2 = R.id.constructor_logo;
                    ImageView imageView = (ImageView) nq8.B(R.id.constructor_logo, inflate);
                    if (imageView != null) {
                        i2 = R.id.constructor_subtitle;
                        if (((TextView) nq8.B(R.id.constructor_subtitle, inflate)) != null) {
                            i2 = R.id.constructor_title;
                            TextView textView2 = (TextView) nq8.B(R.id.constructor_title, inflate);
                            if (textView2 != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                                as9.o(imageView, team.getId());
                                Context requireContext4 = requireContext();
                                requireContext4.getClass();
                                textView2.setText(tba.p(requireContext4, team));
                                constraintLayout2.setOnClickListener(new h2i(this, team, i));
                                linearLayout2.addView(constraintLayout2);
                            }
                        }
                    }
                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                    return;
                }
            }
        }
        E().k();
        E().m.e(getViewLifecycleOwner(), new ioe(10, new chf(1, this, StageConstructorDetailsFragment.class, "showCareerInfo", "showCareerInfo(Lcom/sofascore/model/newNetwork/StageTeamHistoryResponse;)V", 0, 12)));
        StageTeamOddsView stageTeamOddsView = (StageTeamOddsView) this.v.getValue();
        if (stageTeamOddsView != null) {
            r11.p(C().g.size(), stageTeamOddsView);
        }
        GambleRegulationFooterView gambleRegulationFooterView = (GambleRegulationFooterView) this.w.getValue();
        if (gambleRegulationFooterView != null) {
            g7.o(C(), gambleRegulationFooterView, 6);
        }
        D().l(E().l());
        D().j.e(getViewLifecycleOwner(), new ioe(10, new g2i(this, i)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
