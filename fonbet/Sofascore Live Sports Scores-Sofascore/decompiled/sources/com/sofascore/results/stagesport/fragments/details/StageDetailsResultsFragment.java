package com.sofascore.results.stagesport.fragments.details;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.imageview.ShapeableImageView;
import com.ironsource.L6;
import com.sofascore.common.SwipeRefreshLayoutFixed;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageInfo;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.model.newNetwork.TyrePeriod;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.stagesport.StageFeaturedOddsView;
import com.sofascore.results.stagesport.fragments.details.StageDetailsResultsFragment;
import com.sofascore.results.view.InfoBubbleText;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ajh;
import defpackage.ao2;
import defpackage.apf;
import defpackage.be5;
import defpackage.bte;
import defpackage.cga;
import defpackage.dla;
import defpackage.dmi;
import defpackage.dsi;
import defpackage.duf;
import defpackage.e89;
import defpackage.fc6;
import defpackage.fuf;
import defpackage.fvg;
import defpackage.fwc;
import defpackage.g31;
import defpackage.g4i;
import defpackage.g5i;
import defpackage.g5k;
import defpackage.g7;
import defpackage.gz8;
import defpackage.haa;
import defpackage.hkg;
import defpackage.ht9;
import defpackage.hwc;
import defpackage.i4i;
import defpackage.i5i;
import defpackage.ioe;
import defpackage.joa;
import defpackage.k13;
import defpackage.k3k;
import defpackage.kp5;
import defpackage.krk;
import defpackage.l5i;
import defpackage.mx5;
import defpackage.n4i;
import defpackage.n9e;
import defpackage.nq8;
import defpackage.nv;
import defpackage.o1i;
import defpackage.o3a;
import defpackage.otk;
import defpackage.p1;
import defpackage.r3i;
import defpackage.r6i;
import defpackage.rlh;
import defpackage.sp8;
import defpackage.t25;
import defpackage.t3i;
import defpackage.ta4;
import defpackage.tc3;
import defpackage.u3i;
import defpackage.ua5;
import defpackage.uaa;
import defpackage.uyf;
import defpackage.v1h;
import defpackage.v3i;
import defpackage.vt2;
import defpackage.vt9;
import defpackage.vxd;
import defpackage.w3i;
import defpackage.w6i;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.wsf;
import defpackage.x3i;
import defpackage.xd5;
import defpackage.y3g;
import defpackage.y3i;
import defpackage.yhk;
import defpackage.yid;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1h;
import defpackage.z3i;
import defpackage.z8e;
import defpackage.zsk;
import defpackage.zzl;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/details/StageDetailsResultsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lsp8;", "<init>", "()V", "w3i", "uyf", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageDetailsResultsFragment extends Hilt_StageDetailsResultsFragment<sp8> {
    public final joa A;
    public final joa B;
    public final joa C;
    public final joa D;
    public zsk E;
    public final otk r;
    public final otk s;
    public final otk t;
    public Stage u;
    public r6i v;
    public uyf w;
    public final joa x;
    public final joa y;
    public final joa z;

    public StageDetailsResultsFragment() {
        final int i = 6;
        z3i z3iVar = new z3i(this, i);
        ysa ysaVar = ysa.c;
        final int i2 = 7;
        joa a = ypa.a(ysaVar, new o1i(z3iVar, i2));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(g4i.class), new wsf(a, 17), new bte(this, a, 16), new wsf(a, 18));
        final int i3 = 0;
        final int i4 = 1;
        final int i5 = 2;
        this.s = new otk(fufVar.getOrCreateKotlinClass(n4i.class), new z3i(this, i3), new z3i(this, i5), new z3i(this, i4));
        final int i6 = 3;
        final int i7 = 4;
        final int i8 = 5;
        this.t = new otk(fufVar.getOrCreateKotlinClass(dsi.class), new z3i(this, i6), new z3i(this, i8), new z3i(this, i7));
        this.x = ypa.a(ysaVar, new Function0(this) { // from class: s3i
            public final /* synthetic */ StageDetailsResultsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
            
                if (r0.c().size() == 1) goto L28;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                boolean f;
                SharedPreferences d;
                SharedPreferences d2;
                int i9 = i3;
                boolean z = true;
                StageDetailsResultsFragment stageDetailsResultsFragment = this.b;
                switch (i9) {
                    case 0:
                        LayoutInflater layoutInflater = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar = stageDetailsResultsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.header_stage_pickers, (ViewGroup) ((sp8) krkVar).b, false);
                        int i10 = R.id.cycling_stage_info;
                        View B = nq8.B(R.id.cycling_stage_info, inflate);
                        if (B != null) {
                            i10 = R.id.length_type_text;
                            TextView textView = (TextView) nq8.B(R.id.length_type_text, B);
                            if (textView != null) {
                                i10 = R.id.route_text;
                                TextView textView2 = (TextView) nq8.B(R.id.route_text, B);
                                if (textView2 != null) {
                                    i10 = R.id.time_text;
                                    TextView textView3 = (TextView) nq8.B(R.id.time_text, B);
                                    if (textView3 != null) {
                                        ImageView imageView = (ImageView) nq8.B(R.id.weather_image, B);
                                        if (imageView != null) {
                                            e92 e92Var = new e92((ConstraintLayout) B, textView, textView2, textView3, imageView, 3);
                                            int i11 = R.id.divider;
                                            MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate);
                                            if (materialDivider != null) {
                                                i11 = R.id.header_result_type;
                                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.header_result_type, inflate);
                                                if (typeHeaderView != null) {
                                                    i11 = R.id.header_sub_stage_types;
                                                    SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.header_sub_stage_types, inflate);
                                                    if (segmentedButtonsView != null) {
                                                        i11 = R.id.header_sub_stages;
                                                        TypeHeaderView typeHeaderView2 = (TypeHeaderView) nq8.B(R.id.header_sub_stages, inflate);
                                                        if (typeHeaderView2 != null) {
                                                            i11 = R.id.no_results;
                                                            GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.no_results, inflate);
                                                            if (graphicLarge != null) {
                                                                i11 = R.id.odds_view;
                                                                StageFeaturedOddsView stageFeaturedOddsView = (StageFeaturedOddsView) nq8.B(R.id.odds_view, inflate);
                                                                if (stageFeaturedOddsView != null) {
                                                                    i11 = R.id.status_label;
                                                                    TextView textView4 = (TextView) nq8.B(R.id.status_label, inflate);
                                                                    if (textView4 != null) {
                                                                        TextView textView5 = (TextView) nq8.B(R.id.time_text, inflate);
                                                                        if (textView5 != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                            e89 e89Var = new e89(constraintLayout, e92Var, materialDivider, typeHeaderView, segmentedButtonsView, typeHeaderView2, graphicLarge, stageFeaturedOddsView, textView4, textView5);
                                                                            constraintLayout.getClass();
                                                                            sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                            constraintLayout.setVisibility(8);
                                                                            return e89Var;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i10 = i11;
                                        } else {
                                            i10 = R.id.weather_image;
                                        }
                                    }
                                }
                            }
                            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i10)));
                            return null;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                        return null;
                    case 1:
                        joa joaVar = l5i.a;
                        Stage stage = stageDetailsResultsFragment.u;
                        if (stage == null) {
                            Intrinsics.i("event");
                            throw null;
                        }
                        f = l5i.f(stage);
                        break;
                    case 2:
                        LayoutInflater layoutInflater2 = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar2 = stageDetailsResultsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.stage_details_result_footer, (ViewGroup) ((sp8) krkVar2).b, false);
                        int i12 = R.id.note_info;
                        TextView textView6 = (TextView) nq8.B(R.id.note_info, inflate2);
                        if (textView6 != null) {
                            i12 = R.id.track_image;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.track_image, inflate2);
                            if (shapeableImageView != null) {
                                i12 = R.id.track_image_container;
                                if (((LinearLayout) nq8.B(R.id.track_image_container, inflate2)) != null) {
                                    i12 = R.id.track_name;
                                    TextView textView7 = (TextView) nq8.B(R.id.track_name, inflate2);
                                    if (textView7 != null) {
                                        r3i r3iVar = new r3i((LinearLayout) inflate2, textView6, shapeableImageView, textView7);
                                        shapeableImageView.setVisibility(8);
                                        return r3iVar;
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i12)));
                        return null;
                    case 3:
                        Context requireContext = stageDetailsResultsFragment.requireContext();
                        requireContext.getClass();
                        return new k3k(requireContext);
                    case 4:
                        Context requireContext2 = stageDetailsResultsFragment.requireContext();
                        requireContext2.getClass();
                        w6i w6iVar = new w6i(requireContext2, null);
                        w6iVar.setNewLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        sea.v(w6iVar, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        return w6iVar;
                    case 5:
                        LinearLayout linearLayout = new LinearLayout(stageDetailsResultsFragment.requireContext());
                        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        linearLayout.setOrientation(1);
                        linearLayout.setVisibility(8);
                        return linearLayout;
                    case 6:
                        Context requireContext3 = stageDetailsResultsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        f = sharedPreferences.getBoolean("RACE_FLOW_SEEN_PREF", false);
                        break;
                    case 7:
                        Context requireContext4 = stageDetailsResultsFragment.requireContext();
                        requireContext4.getClass();
                        InfoBubbleText infoBubbleText = new InfoBubbleText(requireContext4, null, 6);
                        String string = stageDetailsResultsFragment.requireContext().getString(R.string.motorsport_race_flow_info_bubble);
                        string.getClass();
                        infoBubbleText.setInfoText(string);
                        infoBubbleText.d.c.setVisibility(4);
                        infoBubbleText.setOnClickListener(new cne(stageDetailsResultsFragment, 27));
                        return infoBubbleText;
                    case 8:
                        g4i G = stageDetailsResultsFragment.G();
                        Context i13 = G.i();
                        amd amdVar = G.i;
                        amdVar.getClass();
                        yea yeaVar = j58.a;
                        if (fn0.B("show_motorsport_odds") && xld.g(i13)) {
                            if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                                SharedPreferences sharedPreferences2 = uic.j;
                                if (sharedPreferences2 == null) {
                                    Context applicationContext2 = i13.getApplicationContext();
                                    synchronized (uic.i) {
                                        d2 = a5f.d(applicationContext2);
                                        uic.j = d2;
                                    }
                                    d2.getClass();
                                    sharedPreferences2 = d2;
                                }
                                ccd ccdVar = vl.b;
                                break;
                            }
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    default:
                        Context requireContext5 = stageDetailsResultsFragment.requireContext();
                        requireContext5.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext5, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                }
                return Boolean.valueOf(!f);
            }
        });
        this.y = n9e.M(new Function0(this) { // from class: s3i
            public final /* synthetic */ StageDetailsResultsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
            
                if (r0.c().size() == 1) goto L28;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                boolean f;
                SharedPreferences d;
                SharedPreferences d2;
                int i9 = i4;
                boolean z = true;
                StageDetailsResultsFragment stageDetailsResultsFragment = this.b;
                switch (i9) {
                    case 0:
                        LayoutInflater layoutInflater = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar = stageDetailsResultsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.header_stage_pickers, (ViewGroup) ((sp8) krkVar).b, false);
                        int i10 = R.id.cycling_stage_info;
                        View B = nq8.B(R.id.cycling_stage_info, inflate);
                        if (B != null) {
                            i10 = R.id.length_type_text;
                            TextView textView = (TextView) nq8.B(R.id.length_type_text, B);
                            if (textView != null) {
                                i10 = R.id.route_text;
                                TextView textView2 = (TextView) nq8.B(R.id.route_text, B);
                                if (textView2 != null) {
                                    i10 = R.id.time_text;
                                    TextView textView3 = (TextView) nq8.B(R.id.time_text, B);
                                    if (textView3 != null) {
                                        ImageView imageView = (ImageView) nq8.B(R.id.weather_image, B);
                                        if (imageView != null) {
                                            e92 e92Var = new e92((ConstraintLayout) B, textView, textView2, textView3, imageView, 3);
                                            int i11 = R.id.divider;
                                            MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate);
                                            if (materialDivider != null) {
                                                i11 = R.id.header_result_type;
                                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.header_result_type, inflate);
                                                if (typeHeaderView != null) {
                                                    i11 = R.id.header_sub_stage_types;
                                                    SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.header_sub_stage_types, inflate);
                                                    if (segmentedButtonsView != null) {
                                                        i11 = R.id.header_sub_stages;
                                                        TypeHeaderView typeHeaderView2 = (TypeHeaderView) nq8.B(R.id.header_sub_stages, inflate);
                                                        if (typeHeaderView2 != null) {
                                                            i11 = R.id.no_results;
                                                            GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.no_results, inflate);
                                                            if (graphicLarge != null) {
                                                                i11 = R.id.odds_view;
                                                                StageFeaturedOddsView stageFeaturedOddsView = (StageFeaturedOddsView) nq8.B(R.id.odds_view, inflate);
                                                                if (stageFeaturedOddsView != null) {
                                                                    i11 = R.id.status_label;
                                                                    TextView textView4 = (TextView) nq8.B(R.id.status_label, inflate);
                                                                    if (textView4 != null) {
                                                                        TextView textView5 = (TextView) nq8.B(R.id.time_text, inflate);
                                                                        if (textView5 != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                            e89 e89Var = new e89(constraintLayout, e92Var, materialDivider, typeHeaderView, segmentedButtonsView, typeHeaderView2, graphicLarge, stageFeaturedOddsView, textView4, textView5);
                                                                            constraintLayout.getClass();
                                                                            sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                            constraintLayout.setVisibility(8);
                                                                            return e89Var;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i10 = i11;
                                        } else {
                                            i10 = R.id.weather_image;
                                        }
                                    }
                                }
                            }
                            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i10)));
                            return null;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                        return null;
                    case 1:
                        joa joaVar = l5i.a;
                        Stage stage = stageDetailsResultsFragment.u;
                        if (stage == null) {
                            Intrinsics.i("event");
                            throw null;
                        }
                        f = l5i.f(stage);
                        break;
                    case 2:
                        LayoutInflater layoutInflater2 = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar2 = stageDetailsResultsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.stage_details_result_footer, (ViewGroup) ((sp8) krkVar2).b, false);
                        int i12 = R.id.note_info;
                        TextView textView6 = (TextView) nq8.B(R.id.note_info, inflate2);
                        if (textView6 != null) {
                            i12 = R.id.track_image;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.track_image, inflate2);
                            if (shapeableImageView != null) {
                                i12 = R.id.track_image_container;
                                if (((LinearLayout) nq8.B(R.id.track_image_container, inflate2)) != null) {
                                    i12 = R.id.track_name;
                                    TextView textView7 = (TextView) nq8.B(R.id.track_name, inflate2);
                                    if (textView7 != null) {
                                        r3i r3iVar = new r3i((LinearLayout) inflate2, textView6, shapeableImageView, textView7);
                                        shapeableImageView.setVisibility(8);
                                        return r3iVar;
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i12)));
                        return null;
                    case 3:
                        Context requireContext = stageDetailsResultsFragment.requireContext();
                        requireContext.getClass();
                        return new k3k(requireContext);
                    case 4:
                        Context requireContext2 = stageDetailsResultsFragment.requireContext();
                        requireContext2.getClass();
                        w6i w6iVar = new w6i(requireContext2, null);
                        w6iVar.setNewLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        sea.v(w6iVar, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        return w6iVar;
                    case 5:
                        LinearLayout linearLayout = new LinearLayout(stageDetailsResultsFragment.requireContext());
                        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        linearLayout.setOrientation(1);
                        linearLayout.setVisibility(8);
                        return linearLayout;
                    case 6:
                        Context requireContext3 = stageDetailsResultsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        f = sharedPreferences.getBoolean("RACE_FLOW_SEEN_PREF", false);
                        break;
                    case 7:
                        Context requireContext4 = stageDetailsResultsFragment.requireContext();
                        requireContext4.getClass();
                        InfoBubbleText infoBubbleText = new InfoBubbleText(requireContext4, null, 6);
                        String string = stageDetailsResultsFragment.requireContext().getString(R.string.motorsport_race_flow_info_bubble);
                        string.getClass();
                        infoBubbleText.setInfoText(string);
                        infoBubbleText.d.c.setVisibility(4);
                        infoBubbleText.setOnClickListener(new cne(stageDetailsResultsFragment, 27));
                        return infoBubbleText;
                    case 8:
                        g4i G = stageDetailsResultsFragment.G();
                        Context i13 = G.i();
                        amd amdVar = G.i;
                        amdVar.getClass();
                        yea yeaVar = j58.a;
                        if (fn0.B("show_motorsport_odds") && xld.g(i13)) {
                            if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                                SharedPreferences sharedPreferences2 = uic.j;
                                if (sharedPreferences2 == null) {
                                    Context applicationContext2 = i13.getApplicationContext();
                                    synchronized (uic.i) {
                                        d2 = a5f.d(applicationContext2);
                                        uic.j = d2;
                                    }
                                    d2.getClass();
                                    sharedPreferences2 = d2;
                                }
                                ccd ccdVar = vl.b;
                                break;
                            }
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    default:
                        Context requireContext5 = stageDetailsResultsFragment.requireContext();
                        requireContext5.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext5, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                }
                return Boolean.valueOf(!f);
            }
        }, new Function0(this) { // from class: s3i
            public final /* synthetic */ StageDetailsResultsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
            
                if (r0.c().size() == 1) goto L28;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                boolean f;
                SharedPreferences d;
                SharedPreferences d2;
                int i9 = i5;
                boolean z = true;
                StageDetailsResultsFragment stageDetailsResultsFragment = this.b;
                switch (i9) {
                    case 0:
                        LayoutInflater layoutInflater = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar = stageDetailsResultsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.header_stage_pickers, (ViewGroup) ((sp8) krkVar).b, false);
                        int i10 = R.id.cycling_stage_info;
                        View B = nq8.B(R.id.cycling_stage_info, inflate);
                        if (B != null) {
                            i10 = R.id.length_type_text;
                            TextView textView = (TextView) nq8.B(R.id.length_type_text, B);
                            if (textView != null) {
                                i10 = R.id.route_text;
                                TextView textView2 = (TextView) nq8.B(R.id.route_text, B);
                                if (textView2 != null) {
                                    i10 = R.id.time_text;
                                    TextView textView3 = (TextView) nq8.B(R.id.time_text, B);
                                    if (textView3 != null) {
                                        ImageView imageView = (ImageView) nq8.B(R.id.weather_image, B);
                                        if (imageView != null) {
                                            e92 e92Var = new e92((ConstraintLayout) B, textView, textView2, textView3, imageView, 3);
                                            int i11 = R.id.divider;
                                            MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate);
                                            if (materialDivider != null) {
                                                i11 = R.id.header_result_type;
                                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.header_result_type, inflate);
                                                if (typeHeaderView != null) {
                                                    i11 = R.id.header_sub_stage_types;
                                                    SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.header_sub_stage_types, inflate);
                                                    if (segmentedButtonsView != null) {
                                                        i11 = R.id.header_sub_stages;
                                                        TypeHeaderView typeHeaderView2 = (TypeHeaderView) nq8.B(R.id.header_sub_stages, inflate);
                                                        if (typeHeaderView2 != null) {
                                                            i11 = R.id.no_results;
                                                            GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.no_results, inflate);
                                                            if (graphicLarge != null) {
                                                                i11 = R.id.odds_view;
                                                                StageFeaturedOddsView stageFeaturedOddsView = (StageFeaturedOddsView) nq8.B(R.id.odds_view, inflate);
                                                                if (stageFeaturedOddsView != null) {
                                                                    i11 = R.id.status_label;
                                                                    TextView textView4 = (TextView) nq8.B(R.id.status_label, inflate);
                                                                    if (textView4 != null) {
                                                                        TextView textView5 = (TextView) nq8.B(R.id.time_text, inflate);
                                                                        if (textView5 != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                            e89 e89Var = new e89(constraintLayout, e92Var, materialDivider, typeHeaderView, segmentedButtonsView, typeHeaderView2, graphicLarge, stageFeaturedOddsView, textView4, textView5);
                                                                            constraintLayout.getClass();
                                                                            sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                            constraintLayout.setVisibility(8);
                                                                            return e89Var;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i10 = i11;
                                        } else {
                                            i10 = R.id.weather_image;
                                        }
                                    }
                                }
                            }
                            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i10)));
                            return null;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                        return null;
                    case 1:
                        joa joaVar = l5i.a;
                        Stage stage = stageDetailsResultsFragment.u;
                        if (stage == null) {
                            Intrinsics.i("event");
                            throw null;
                        }
                        f = l5i.f(stage);
                        break;
                    case 2:
                        LayoutInflater layoutInflater2 = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar2 = stageDetailsResultsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.stage_details_result_footer, (ViewGroup) ((sp8) krkVar2).b, false);
                        int i12 = R.id.note_info;
                        TextView textView6 = (TextView) nq8.B(R.id.note_info, inflate2);
                        if (textView6 != null) {
                            i12 = R.id.track_image;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.track_image, inflate2);
                            if (shapeableImageView != null) {
                                i12 = R.id.track_image_container;
                                if (((LinearLayout) nq8.B(R.id.track_image_container, inflate2)) != null) {
                                    i12 = R.id.track_name;
                                    TextView textView7 = (TextView) nq8.B(R.id.track_name, inflate2);
                                    if (textView7 != null) {
                                        r3i r3iVar = new r3i((LinearLayout) inflate2, textView6, shapeableImageView, textView7);
                                        shapeableImageView.setVisibility(8);
                                        return r3iVar;
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i12)));
                        return null;
                    case 3:
                        Context requireContext = stageDetailsResultsFragment.requireContext();
                        requireContext.getClass();
                        return new k3k(requireContext);
                    case 4:
                        Context requireContext2 = stageDetailsResultsFragment.requireContext();
                        requireContext2.getClass();
                        w6i w6iVar = new w6i(requireContext2, null);
                        w6iVar.setNewLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        sea.v(w6iVar, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        return w6iVar;
                    case 5:
                        LinearLayout linearLayout = new LinearLayout(stageDetailsResultsFragment.requireContext());
                        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        linearLayout.setOrientation(1);
                        linearLayout.setVisibility(8);
                        return linearLayout;
                    case 6:
                        Context requireContext3 = stageDetailsResultsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        f = sharedPreferences.getBoolean("RACE_FLOW_SEEN_PREF", false);
                        break;
                    case 7:
                        Context requireContext4 = stageDetailsResultsFragment.requireContext();
                        requireContext4.getClass();
                        InfoBubbleText infoBubbleText = new InfoBubbleText(requireContext4, null, 6);
                        String string = stageDetailsResultsFragment.requireContext().getString(R.string.motorsport_race_flow_info_bubble);
                        string.getClass();
                        infoBubbleText.setInfoText(string);
                        infoBubbleText.d.c.setVisibility(4);
                        infoBubbleText.setOnClickListener(new cne(stageDetailsResultsFragment, 27));
                        return infoBubbleText;
                    case 8:
                        g4i G = stageDetailsResultsFragment.G();
                        Context i13 = G.i();
                        amd amdVar = G.i;
                        amdVar.getClass();
                        yea yeaVar = j58.a;
                        if (fn0.B("show_motorsport_odds") && xld.g(i13)) {
                            if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                                SharedPreferences sharedPreferences2 = uic.j;
                                if (sharedPreferences2 == null) {
                                    Context applicationContext2 = i13.getApplicationContext();
                                    synchronized (uic.i) {
                                        d2 = a5f.d(applicationContext2);
                                        uic.j = d2;
                                    }
                                    d2.getClass();
                                    sharedPreferences2 = d2;
                                }
                                ccd ccdVar = vl.b;
                                break;
                            }
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    default:
                        Context requireContext5 = stageDetailsResultsFragment.requireContext();
                        requireContext5.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext5, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                }
                return Boolean.valueOf(!f);
            }
        });
        this.z = ypa.a(ysaVar, new Function0(this) { // from class: s3i
            public final /* synthetic */ StageDetailsResultsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
            
                if (r0.c().size() == 1) goto L28;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                boolean f;
                SharedPreferences d;
                SharedPreferences d2;
                int i9 = i6;
                boolean z = true;
                StageDetailsResultsFragment stageDetailsResultsFragment = this.b;
                switch (i9) {
                    case 0:
                        LayoutInflater layoutInflater = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar = stageDetailsResultsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.header_stage_pickers, (ViewGroup) ((sp8) krkVar).b, false);
                        int i10 = R.id.cycling_stage_info;
                        View B = nq8.B(R.id.cycling_stage_info, inflate);
                        if (B != null) {
                            i10 = R.id.length_type_text;
                            TextView textView = (TextView) nq8.B(R.id.length_type_text, B);
                            if (textView != null) {
                                i10 = R.id.route_text;
                                TextView textView2 = (TextView) nq8.B(R.id.route_text, B);
                                if (textView2 != null) {
                                    i10 = R.id.time_text;
                                    TextView textView3 = (TextView) nq8.B(R.id.time_text, B);
                                    if (textView3 != null) {
                                        ImageView imageView = (ImageView) nq8.B(R.id.weather_image, B);
                                        if (imageView != null) {
                                            e92 e92Var = new e92((ConstraintLayout) B, textView, textView2, textView3, imageView, 3);
                                            int i11 = R.id.divider;
                                            MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate);
                                            if (materialDivider != null) {
                                                i11 = R.id.header_result_type;
                                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.header_result_type, inflate);
                                                if (typeHeaderView != null) {
                                                    i11 = R.id.header_sub_stage_types;
                                                    SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.header_sub_stage_types, inflate);
                                                    if (segmentedButtonsView != null) {
                                                        i11 = R.id.header_sub_stages;
                                                        TypeHeaderView typeHeaderView2 = (TypeHeaderView) nq8.B(R.id.header_sub_stages, inflate);
                                                        if (typeHeaderView2 != null) {
                                                            i11 = R.id.no_results;
                                                            GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.no_results, inflate);
                                                            if (graphicLarge != null) {
                                                                i11 = R.id.odds_view;
                                                                StageFeaturedOddsView stageFeaturedOddsView = (StageFeaturedOddsView) nq8.B(R.id.odds_view, inflate);
                                                                if (stageFeaturedOddsView != null) {
                                                                    i11 = R.id.status_label;
                                                                    TextView textView4 = (TextView) nq8.B(R.id.status_label, inflate);
                                                                    if (textView4 != null) {
                                                                        TextView textView5 = (TextView) nq8.B(R.id.time_text, inflate);
                                                                        if (textView5 != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                            e89 e89Var = new e89(constraintLayout, e92Var, materialDivider, typeHeaderView, segmentedButtonsView, typeHeaderView2, graphicLarge, stageFeaturedOddsView, textView4, textView5);
                                                                            constraintLayout.getClass();
                                                                            sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                            constraintLayout.setVisibility(8);
                                                                            return e89Var;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i10 = i11;
                                        } else {
                                            i10 = R.id.weather_image;
                                        }
                                    }
                                }
                            }
                            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i10)));
                            return null;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                        return null;
                    case 1:
                        joa joaVar = l5i.a;
                        Stage stage = stageDetailsResultsFragment.u;
                        if (stage == null) {
                            Intrinsics.i("event");
                            throw null;
                        }
                        f = l5i.f(stage);
                        break;
                    case 2:
                        LayoutInflater layoutInflater2 = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar2 = stageDetailsResultsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.stage_details_result_footer, (ViewGroup) ((sp8) krkVar2).b, false);
                        int i12 = R.id.note_info;
                        TextView textView6 = (TextView) nq8.B(R.id.note_info, inflate2);
                        if (textView6 != null) {
                            i12 = R.id.track_image;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.track_image, inflate2);
                            if (shapeableImageView != null) {
                                i12 = R.id.track_image_container;
                                if (((LinearLayout) nq8.B(R.id.track_image_container, inflate2)) != null) {
                                    i12 = R.id.track_name;
                                    TextView textView7 = (TextView) nq8.B(R.id.track_name, inflate2);
                                    if (textView7 != null) {
                                        r3i r3iVar = new r3i((LinearLayout) inflate2, textView6, shapeableImageView, textView7);
                                        shapeableImageView.setVisibility(8);
                                        return r3iVar;
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i12)));
                        return null;
                    case 3:
                        Context requireContext = stageDetailsResultsFragment.requireContext();
                        requireContext.getClass();
                        return new k3k(requireContext);
                    case 4:
                        Context requireContext2 = stageDetailsResultsFragment.requireContext();
                        requireContext2.getClass();
                        w6i w6iVar = new w6i(requireContext2, null);
                        w6iVar.setNewLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        sea.v(w6iVar, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        return w6iVar;
                    case 5:
                        LinearLayout linearLayout = new LinearLayout(stageDetailsResultsFragment.requireContext());
                        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        linearLayout.setOrientation(1);
                        linearLayout.setVisibility(8);
                        return linearLayout;
                    case 6:
                        Context requireContext3 = stageDetailsResultsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        f = sharedPreferences.getBoolean("RACE_FLOW_SEEN_PREF", false);
                        break;
                    case 7:
                        Context requireContext4 = stageDetailsResultsFragment.requireContext();
                        requireContext4.getClass();
                        InfoBubbleText infoBubbleText = new InfoBubbleText(requireContext4, null, 6);
                        String string = stageDetailsResultsFragment.requireContext().getString(R.string.motorsport_race_flow_info_bubble);
                        string.getClass();
                        infoBubbleText.setInfoText(string);
                        infoBubbleText.d.c.setVisibility(4);
                        infoBubbleText.setOnClickListener(new cne(stageDetailsResultsFragment, 27));
                        return infoBubbleText;
                    case 8:
                        g4i G = stageDetailsResultsFragment.G();
                        Context i13 = G.i();
                        amd amdVar = G.i;
                        amdVar.getClass();
                        yea yeaVar = j58.a;
                        if (fn0.B("show_motorsport_odds") && xld.g(i13)) {
                            if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                                SharedPreferences sharedPreferences2 = uic.j;
                                if (sharedPreferences2 == null) {
                                    Context applicationContext2 = i13.getApplicationContext();
                                    synchronized (uic.i) {
                                        d2 = a5f.d(applicationContext2);
                                        uic.j = d2;
                                    }
                                    d2.getClass();
                                    sharedPreferences2 = d2;
                                }
                                ccd ccdVar = vl.b;
                                break;
                            }
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    default:
                        Context requireContext5 = stageDetailsResultsFragment.requireContext();
                        requireContext5.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext5, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                }
                return Boolean.valueOf(!f);
            }
        });
        this.A = ypa.a(ysaVar, new Function0(this) { // from class: s3i
            public final /* synthetic */ StageDetailsResultsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
            
                if (r0.c().size() == 1) goto L28;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                boolean f;
                SharedPreferences d;
                SharedPreferences d2;
                int i9 = i7;
                boolean z = true;
                StageDetailsResultsFragment stageDetailsResultsFragment = this.b;
                switch (i9) {
                    case 0:
                        LayoutInflater layoutInflater = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar = stageDetailsResultsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.header_stage_pickers, (ViewGroup) ((sp8) krkVar).b, false);
                        int i10 = R.id.cycling_stage_info;
                        View B = nq8.B(R.id.cycling_stage_info, inflate);
                        if (B != null) {
                            i10 = R.id.length_type_text;
                            TextView textView = (TextView) nq8.B(R.id.length_type_text, B);
                            if (textView != null) {
                                i10 = R.id.route_text;
                                TextView textView2 = (TextView) nq8.B(R.id.route_text, B);
                                if (textView2 != null) {
                                    i10 = R.id.time_text;
                                    TextView textView3 = (TextView) nq8.B(R.id.time_text, B);
                                    if (textView3 != null) {
                                        ImageView imageView = (ImageView) nq8.B(R.id.weather_image, B);
                                        if (imageView != null) {
                                            e92 e92Var = new e92((ConstraintLayout) B, textView, textView2, textView3, imageView, 3);
                                            int i11 = R.id.divider;
                                            MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate);
                                            if (materialDivider != null) {
                                                i11 = R.id.header_result_type;
                                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.header_result_type, inflate);
                                                if (typeHeaderView != null) {
                                                    i11 = R.id.header_sub_stage_types;
                                                    SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.header_sub_stage_types, inflate);
                                                    if (segmentedButtonsView != null) {
                                                        i11 = R.id.header_sub_stages;
                                                        TypeHeaderView typeHeaderView2 = (TypeHeaderView) nq8.B(R.id.header_sub_stages, inflate);
                                                        if (typeHeaderView2 != null) {
                                                            i11 = R.id.no_results;
                                                            GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.no_results, inflate);
                                                            if (graphicLarge != null) {
                                                                i11 = R.id.odds_view;
                                                                StageFeaturedOddsView stageFeaturedOddsView = (StageFeaturedOddsView) nq8.B(R.id.odds_view, inflate);
                                                                if (stageFeaturedOddsView != null) {
                                                                    i11 = R.id.status_label;
                                                                    TextView textView4 = (TextView) nq8.B(R.id.status_label, inflate);
                                                                    if (textView4 != null) {
                                                                        TextView textView5 = (TextView) nq8.B(R.id.time_text, inflate);
                                                                        if (textView5 != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                            e89 e89Var = new e89(constraintLayout, e92Var, materialDivider, typeHeaderView, segmentedButtonsView, typeHeaderView2, graphicLarge, stageFeaturedOddsView, textView4, textView5);
                                                                            constraintLayout.getClass();
                                                                            sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                            constraintLayout.setVisibility(8);
                                                                            return e89Var;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i10 = i11;
                                        } else {
                                            i10 = R.id.weather_image;
                                        }
                                    }
                                }
                            }
                            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i10)));
                            return null;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                        return null;
                    case 1:
                        joa joaVar = l5i.a;
                        Stage stage = stageDetailsResultsFragment.u;
                        if (stage == null) {
                            Intrinsics.i("event");
                            throw null;
                        }
                        f = l5i.f(stage);
                        break;
                    case 2:
                        LayoutInflater layoutInflater2 = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar2 = stageDetailsResultsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.stage_details_result_footer, (ViewGroup) ((sp8) krkVar2).b, false);
                        int i12 = R.id.note_info;
                        TextView textView6 = (TextView) nq8.B(R.id.note_info, inflate2);
                        if (textView6 != null) {
                            i12 = R.id.track_image;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.track_image, inflate2);
                            if (shapeableImageView != null) {
                                i12 = R.id.track_image_container;
                                if (((LinearLayout) nq8.B(R.id.track_image_container, inflate2)) != null) {
                                    i12 = R.id.track_name;
                                    TextView textView7 = (TextView) nq8.B(R.id.track_name, inflate2);
                                    if (textView7 != null) {
                                        r3i r3iVar = new r3i((LinearLayout) inflate2, textView6, shapeableImageView, textView7);
                                        shapeableImageView.setVisibility(8);
                                        return r3iVar;
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i12)));
                        return null;
                    case 3:
                        Context requireContext = stageDetailsResultsFragment.requireContext();
                        requireContext.getClass();
                        return new k3k(requireContext);
                    case 4:
                        Context requireContext2 = stageDetailsResultsFragment.requireContext();
                        requireContext2.getClass();
                        w6i w6iVar = new w6i(requireContext2, null);
                        w6iVar.setNewLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        sea.v(w6iVar, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        return w6iVar;
                    case 5:
                        LinearLayout linearLayout = new LinearLayout(stageDetailsResultsFragment.requireContext());
                        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        linearLayout.setOrientation(1);
                        linearLayout.setVisibility(8);
                        return linearLayout;
                    case 6:
                        Context requireContext3 = stageDetailsResultsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        f = sharedPreferences.getBoolean("RACE_FLOW_SEEN_PREF", false);
                        break;
                    case 7:
                        Context requireContext4 = stageDetailsResultsFragment.requireContext();
                        requireContext4.getClass();
                        InfoBubbleText infoBubbleText = new InfoBubbleText(requireContext4, null, 6);
                        String string = stageDetailsResultsFragment.requireContext().getString(R.string.motorsport_race_flow_info_bubble);
                        string.getClass();
                        infoBubbleText.setInfoText(string);
                        infoBubbleText.d.c.setVisibility(4);
                        infoBubbleText.setOnClickListener(new cne(stageDetailsResultsFragment, 27));
                        return infoBubbleText;
                    case 8:
                        g4i G = stageDetailsResultsFragment.G();
                        Context i13 = G.i();
                        amd amdVar = G.i;
                        amdVar.getClass();
                        yea yeaVar = j58.a;
                        if (fn0.B("show_motorsport_odds") && xld.g(i13)) {
                            if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                                SharedPreferences sharedPreferences2 = uic.j;
                                if (sharedPreferences2 == null) {
                                    Context applicationContext2 = i13.getApplicationContext();
                                    synchronized (uic.i) {
                                        d2 = a5f.d(applicationContext2);
                                        uic.j = d2;
                                    }
                                    d2.getClass();
                                    sharedPreferences2 = d2;
                                }
                                ccd ccdVar = vl.b;
                                break;
                            }
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    default:
                        Context requireContext5 = stageDetailsResultsFragment.requireContext();
                        requireContext5.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext5, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                }
                return Boolean.valueOf(!f);
            }
        });
        this.B = ypa.a(ysaVar, new Function0(this) { // from class: s3i
            public final /* synthetic */ StageDetailsResultsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
            
                if (r0.c().size() == 1) goto L28;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                boolean f;
                SharedPreferences d;
                SharedPreferences d2;
                int i9 = i8;
                boolean z = true;
                StageDetailsResultsFragment stageDetailsResultsFragment = this.b;
                switch (i9) {
                    case 0:
                        LayoutInflater layoutInflater = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar = stageDetailsResultsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.header_stage_pickers, (ViewGroup) ((sp8) krkVar).b, false);
                        int i10 = R.id.cycling_stage_info;
                        View B = nq8.B(R.id.cycling_stage_info, inflate);
                        if (B != null) {
                            i10 = R.id.length_type_text;
                            TextView textView = (TextView) nq8.B(R.id.length_type_text, B);
                            if (textView != null) {
                                i10 = R.id.route_text;
                                TextView textView2 = (TextView) nq8.B(R.id.route_text, B);
                                if (textView2 != null) {
                                    i10 = R.id.time_text;
                                    TextView textView3 = (TextView) nq8.B(R.id.time_text, B);
                                    if (textView3 != null) {
                                        ImageView imageView = (ImageView) nq8.B(R.id.weather_image, B);
                                        if (imageView != null) {
                                            e92 e92Var = new e92((ConstraintLayout) B, textView, textView2, textView3, imageView, 3);
                                            int i11 = R.id.divider;
                                            MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate);
                                            if (materialDivider != null) {
                                                i11 = R.id.header_result_type;
                                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.header_result_type, inflate);
                                                if (typeHeaderView != null) {
                                                    i11 = R.id.header_sub_stage_types;
                                                    SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.header_sub_stage_types, inflate);
                                                    if (segmentedButtonsView != null) {
                                                        i11 = R.id.header_sub_stages;
                                                        TypeHeaderView typeHeaderView2 = (TypeHeaderView) nq8.B(R.id.header_sub_stages, inflate);
                                                        if (typeHeaderView2 != null) {
                                                            i11 = R.id.no_results;
                                                            GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.no_results, inflate);
                                                            if (graphicLarge != null) {
                                                                i11 = R.id.odds_view;
                                                                StageFeaturedOddsView stageFeaturedOddsView = (StageFeaturedOddsView) nq8.B(R.id.odds_view, inflate);
                                                                if (stageFeaturedOddsView != null) {
                                                                    i11 = R.id.status_label;
                                                                    TextView textView4 = (TextView) nq8.B(R.id.status_label, inflate);
                                                                    if (textView4 != null) {
                                                                        TextView textView5 = (TextView) nq8.B(R.id.time_text, inflate);
                                                                        if (textView5 != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                            e89 e89Var = new e89(constraintLayout, e92Var, materialDivider, typeHeaderView, segmentedButtonsView, typeHeaderView2, graphicLarge, stageFeaturedOddsView, textView4, textView5);
                                                                            constraintLayout.getClass();
                                                                            sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                            constraintLayout.setVisibility(8);
                                                                            return e89Var;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i10 = i11;
                                        } else {
                                            i10 = R.id.weather_image;
                                        }
                                    }
                                }
                            }
                            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i10)));
                            return null;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                        return null;
                    case 1:
                        joa joaVar = l5i.a;
                        Stage stage = stageDetailsResultsFragment.u;
                        if (stage == null) {
                            Intrinsics.i("event");
                            throw null;
                        }
                        f = l5i.f(stage);
                        break;
                    case 2:
                        LayoutInflater layoutInflater2 = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar2 = stageDetailsResultsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.stage_details_result_footer, (ViewGroup) ((sp8) krkVar2).b, false);
                        int i12 = R.id.note_info;
                        TextView textView6 = (TextView) nq8.B(R.id.note_info, inflate2);
                        if (textView6 != null) {
                            i12 = R.id.track_image;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.track_image, inflate2);
                            if (shapeableImageView != null) {
                                i12 = R.id.track_image_container;
                                if (((LinearLayout) nq8.B(R.id.track_image_container, inflate2)) != null) {
                                    i12 = R.id.track_name;
                                    TextView textView7 = (TextView) nq8.B(R.id.track_name, inflate2);
                                    if (textView7 != null) {
                                        r3i r3iVar = new r3i((LinearLayout) inflate2, textView6, shapeableImageView, textView7);
                                        shapeableImageView.setVisibility(8);
                                        return r3iVar;
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i12)));
                        return null;
                    case 3:
                        Context requireContext = stageDetailsResultsFragment.requireContext();
                        requireContext.getClass();
                        return new k3k(requireContext);
                    case 4:
                        Context requireContext2 = stageDetailsResultsFragment.requireContext();
                        requireContext2.getClass();
                        w6i w6iVar = new w6i(requireContext2, null);
                        w6iVar.setNewLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        sea.v(w6iVar, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        return w6iVar;
                    case 5:
                        LinearLayout linearLayout = new LinearLayout(stageDetailsResultsFragment.requireContext());
                        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        linearLayout.setOrientation(1);
                        linearLayout.setVisibility(8);
                        return linearLayout;
                    case 6:
                        Context requireContext3 = stageDetailsResultsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        f = sharedPreferences.getBoolean("RACE_FLOW_SEEN_PREF", false);
                        break;
                    case 7:
                        Context requireContext4 = stageDetailsResultsFragment.requireContext();
                        requireContext4.getClass();
                        InfoBubbleText infoBubbleText = new InfoBubbleText(requireContext4, null, 6);
                        String string = stageDetailsResultsFragment.requireContext().getString(R.string.motorsport_race_flow_info_bubble);
                        string.getClass();
                        infoBubbleText.setInfoText(string);
                        infoBubbleText.d.c.setVisibility(4);
                        infoBubbleText.setOnClickListener(new cne(stageDetailsResultsFragment, 27));
                        return infoBubbleText;
                    case 8:
                        g4i G = stageDetailsResultsFragment.G();
                        Context i13 = G.i();
                        amd amdVar = G.i;
                        amdVar.getClass();
                        yea yeaVar = j58.a;
                        if (fn0.B("show_motorsport_odds") && xld.g(i13)) {
                            if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                                SharedPreferences sharedPreferences2 = uic.j;
                                if (sharedPreferences2 == null) {
                                    Context applicationContext2 = i13.getApplicationContext();
                                    synchronized (uic.i) {
                                        d2 = a5f.d(applicationContext2);
                                        uic.j = d2;
                                    }
                                    d2.getClass();
                                    sharedPreferences2 = d2;
                                }
                                ccd ccdVar = vl.b;
                                break;
                            }
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    default:
                        Context requireContext5 = stageDetailsResultsFragment.requireContext();
                        requireContext5.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext5, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                }
                return Boolean.valueOf(!f);
            }
        });
        this.C = n9e.M(new Function0(this) { // from class: s3i
            public final /* synthetic */ StageDetailsResultsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
            
                if (r0.c().size() == 1) goto L28;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                boolean f;
                SharedPreferences d;
                SharedPreferences d2;
                int i9 = i;
                boolean z = true;
                StageDetailsResultsFragment stageDetailsResultsFragment = this.b;
                switch (i9) {
                    case 0:
                        LayoutInflater layoutInflater = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar = stageDetailsResultsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.header_stage_pickers, (ViewGroup) ((sp8) krkVar).b, false);
                        int i10 = R.id.cycling_stage_info;
                        View B = nq8.B(R.id.cycling_stage_info, inflate);
                        if (B != null) {
                            i10 = R.id.length_type_text;
                            TextView textView = (TextView) nq8.B(R.id.length_type_text, B);
                            if (textView != null) {
                                i10 = R.id.route_text;
                                TextView textView2 = (TextView) nq8.B(R.id.route_text, B);
                                if (textView2 != null) {
                                    i10 = R.id.time_text;
                                    TextView textView3 = (TextView) nq8.B(R.id.time_text, B);
                                    if (textView3 != null) {
                                        ImageView imageView = (ImageView) nq8.B(R.id.weather_image, B);
                                        if (imageView != null) {
                                            e92 e92Var = new e92((ConstraintLayout) B, textView, textView2, textView3, imageView, 3);
                                            int i11 = R.id.divider;
                                            MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate);
                                            if (materialDivider != null) {
                                                i11 = R.id.header_result_type;
                                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.header_result_type, inflate);
                                                if (typeHeaderView != null) {
                                                    i11 = R.id.header_sub_stage_types;
                                                    SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.header_sub_stage_types, inflate);
                                                    if (segmentedButtonsView != null) {
                                                        i11 = R.id.header_sub_stages;
                                                        TypeHeaderView typeHeaderView2 = (TypeHeaderView) nq8.B(R.id.header_sub_stages, inflate);
                                                        if (typeHeaderView2 != null) {
                                                            i11 = R.id.no_results;
                                                            GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.no_results, inflate);
                                                            if (graphicLarge != null) {
                                                                i11 = R.id.odds_view;
                                                                StageFeaturedOddsView stageFeaturedOddsView = (StageFeaturedOddsView) nq8.B(R.id.odds_view, inflate);
                                                                if (stageFeaturedOddsView != null) {
                                                                    i11 = R.id.status_label;
                                                                    TextView textView4 = (TextView) nq8.B(R.id.status_label, inflate);
                                                                    if (textView4 != null) {
                                                                        TextView textView5 = (TextView) nq8.B(R.id.time_text, inflate);
                                                                        if (textView5 != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                            e89 e89Var = new e89(constraintLayout, e92Var, materialDivider, typeHeaderView, segmentedButtonsView, typeHeaderView2, graphicLarge, stageFeaturedOddsView, textView4, textView5);
                                                                            constraintLayout.getClass();
                                                                            sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                            constraintLayout.setVisibility(8);
                                                                            return e89Var;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i10 = i11;
                                        } else {
                                            i10 = R.id.weather_image;
                                        }
                                    }
                                }
                            }
                            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i10)));
                            return null;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                        return null;
                    case 1:
                        joa joaVar = l5i.a;
                        Stage stage = stageDetailsResultsFragment.u;
                        if (stage == null) {
                            Intrinsics.i("event");
                            throw null;
                        }
                        f = l5i.f(stage);
                        break;
                    case 2:
                        LayoutInflater layoutInflater2 = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar2 = stageDetailsResultsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.stage_details_result_footer, (ViewGroup) ((sp8) krkVar2).b, false);
                        int i12 = R.id.note_info;
                        TextView textView6 = (TextView) nq8.B(R.id.note_info, inflate2);
                        if (textView6 != null) {
                            i12 = R.id.track_image;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.track_image, inflate2);
                            if (shapeableImageView != null) {
                                i12 = R.id.track_image_container;
                                if (((LinearLayout) nq8.B(R.id.track_image_container, inflate2)) != null) {
                                    i12 = R.id.track_name;
                                    TextView textView7 = (TextView) nq8.B(R.id.track_name, inflate2);
                                    if (textView7 != null) {
                                        r3i r3iVar = new r3i((LinearLayout) inflate2, textView6, shapeableImageView, textView7);
                                        shapeableImageView.setVisibility(8);
                                        return r3iVar;
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i12)));
                        return null;
                    case 3:
                        Context requireContext = stageDetailsResultsFragment.requireContext();
                        requireContext.getClass();
                        return new k3k(requireContext);
                    case 4:
                        Context requireContext2 = stageDetailsResultsFragment.requireContext();
                        requireContext2.getClass();
                        w6i w6iVar = new w6i(requireContext2, null);
                        w6iVar.setNewLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        sea.v(w6iVar, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        return w6iVar;
                    case 5:
                        LinearLayout linearLayout = new LinearLayout(stageDetailsResultsFragment.requireContext());
                        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        linearLayout.setOrientation(1);
                        linearLayout.setVisibility(8);
                        return linearLayout;
                    case 6:
                        Context requireContext3 = stageDetailsResultsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        f = sharedPreferences.getBoolean("RACE_FLOW_SEEN_PREF", false);
                        break;
                    case 7:
                        Context requireContext4 = stageDetailsResultsFragment.requireContext();
                        requireContext4.getClass();
                        InfoBubbleText infoBubbleText = new InfoBubbleText(requireContext4, null, 6);
                        String string = stageDetailsResultsFragment.requireContext().getString(R.string.motorsport_race_flow_info_bubble);
                        string.getClass();
                        infoBubbleText.setInfoText(string);
                        infoBubbleText.d.c.setVisibility(4);
                        infoBubbleText.setOnClickListener(new cne(stageDetailsResultsFragment, 27));
                        return infoBubbleText;
                    case 8:
                        g4i G = stageDetailsResultsFragment.G();
                        Context i13 = G.i();
                        amd amdVar = G.i;
                        amdVar.getClass();
                        yea yeaVar = j58.a;
                        if (fn0.B("show_motorsport_odds") && xld.g(i13)) {
                            if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                                SharedPreferences sharedPreferences2 = uic.j;
                                if (sharedPreferences2 == null) {
                                    Context applicationContext2 = i13.getApplicationContext();
                                    synchronized (uic.i) {
                                        d2 = a5f.d(applicationContext2);
                                        uic.j = d2;
                                    }
                                    d2.getClass();
                                    sharedPreferences2 = d2;
                                }
                                ccd ccdVar = vl.b;
                                break;
                            }
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    default:
                        Context requireContext5 = stageDetailsResultsFragment.requireContext();
                        requireContext5.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext5, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                }
                return Boolean.valueOf(!f);
            }
        }, new Function0(this) { // from class: s3i
            public final /* synthetic */ StageDetailsResultsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
            
                if (r0.c().size() == 1) goto L28;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                boolean f;
                SharedPreferences d;
                SharedPreferences d2;
                int i9 = i2;
                boolean z = true;
                StageDetailsResultsFragment stageDetailsResultsFragment = this.b;
                switch (i9) {
                    case 0:
                        LayoutInflater layoutInflater = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar = stageDetailsResultsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.header_stage_pickers, (ViewGroup) ((sp8) krkVar).b, false);
                        int i10 = R.id.cycling_stage_info;
                        View B = nq8.B(R.id.cycling_stage_info, inflate);
                        if (B != null) {
                            i10 = R.id.length_type_text;
                            TextView textView = (TextView) nq8.B(R.id.length_type_text, B);
                            if (textView != null) {
                                i10 = R.id.route_text;
                                TextView textView2 = (TextView) nq8.B(R.id.route_text, B);
                                if (textView2 != null) {
                                    i10 = R.id.time_text;
                                    TextView textView3 = (TextView) nq8.B(R.id.time_text, B);
                                    if (textView3 != null) {
                                        ImageView imageView = (ImageView) nq8.B(R.id.weather_image, B);
                                        if (imageView != null) {
                                            e92 e92Var = new e92((ConstraintLayout) B, textView, textView2, textView3, imageView, 3);
                                            int i11 = R.id.divider;
                                            MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate);
                                            if (materialDivider != null) {
                                                i11 = R.id.header_result_type;
                                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.header_result_type, inflate);
                                                if (typeHeaderView != null) {
                                                    i11 = R.id.header_sub_stage_types;
                                                    SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.header_sub_stage_types, inflate);
                                                    if (segmentedButtonsView != null) {
                                                        i11 = R.id.header_sub_stages;
                                                        TypeHeaderView typeHeaderView2 = (TypeHeaderView) nq8.B(R.id.header_sub_stages, inflate);
                                                        if (typeHeaderView2 != null) {
                                                            i11 = R.id.no_results;
                                                            GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.no_results, inflate);
                                                            if (graphicLarge != null) {
                                                                i11 = R.id.odds_view;
                                                                StageFeaturedOddsView stageFeaturedOddsView = (StageFeaturedOddsView) nq8.B(R.id.odds_view, inflate);
                                                                if (stageFeaturedOddsView != null) {
                                                                    i11 = R.id.status_label;
                                                                    TextView textView4 = (TextView) nq8.B(R.id.status_label, inflate);
                                                                    if (textView4 != null) {
                                                                        TextView textView5 = (TextView) nq8.B(R.id.time_text, inflate);
                                                                        if (textView5 != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                            e89 e89Var = new e89(constraintLayout, e92Var, materialDivider, typeHeaderView, segmentedButtonsView, typeHeaderView2, graphicLarge, stageFeaturedOddsView, textView4, textView5);
                                                                            constraintLayout.getClass();
                                                                            sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                            constraintLayout.setVisibility(8);
                                                                            return e89Var;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i10 = i11;
                                        } else {
                                            i10 = R.id.weather_image;
                                        }
                                    }
                                }
                            }
                            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i10)));
                            return null;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                        return null;
                    case 1:
                        joa joaVar = l5i.a;
                        Stage stage = stageDetailsResultsFragment.u;
                        if (stage == null) {
                            Intrinsics.i("event");
                            throw null;
                        }
                        f = l5i.f(stage);
                        break;
                    case 2:
                        LayoutInflater layoutInflater2 = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar2 = stageDetailsResultsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.stage_details_result_footer, (ViewGroup) ((sp8) krkVar2).b, false);
                        int i12 = R.id.note_info;
                        TextView textView6 = (TextView) nq8.B(R.id.note_info, inflate2);
                        if (textView6 != null) {
                            i12 = R.id.track_image;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.track_image, inflate2);
                            if (shapeableImageView != null) {
                                i12 = R.id.track_image_container;
                                if (((LinearLayout) nq8.B(R.id.track_image_container, inflate2)) != null) {
                                    i12 = R.id.track_name;
                                    TextView textView7 = (TextView) nq8.B(R.id.track_name, inflate2);
                                    if (textView7 != null) {
                                        r3i r3iVar = new r3i((LinearLayout) inflate2, textView6, shapeableImageView, textView7);
                                        shapeableImageView.setVisibility(8);
                                        return r3iVar;
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i12)));
                        return null;
                    case 3:
                        Context requireContext = stageDetailsResultsFragment.requireContext();
                        requireContext.getClass();
                        return new k3k(requireContext);
                    case 4:
                        Context requireContext2 = stageDetailsResultsFragment.requireContext();
                        requireContext2.getClass();
                        w6i w6iVar = new w6i(requireContext2, null);
                        w6iVar.setNewLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        sea.v(w6iVar, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        return w6iVar;
                    case 5:
                        LinearLayout linearLayout = new LinearLayout(stageDetailsResultsFragment.requireContext());
                        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        linearLayout.setOrientation(1);
                        linearLayout.setVisibility(8);
                        return linearLayout;
                    case 6:
                        Context requireContext3 = stageDetailsResultsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        f = sharedPreferences.getBoolean("RACE_FLOW_SEEN_PREF", false);
                        break;
                    case 7:
                        Context requireContext4 = stageDetailsResultsFragment.requireContext();
                        requireContext4.getClass();
                        InfoBubbleText infoBubbleText = new InfoBubbleText(requireContext4, null, 6);
                        String string = stageDetailsResultsFragment.requireContext().getString(R.string.motorsport_race_flow_info_bubble);
                        string.getClass();
                        infoBubbleText.setInfoText(string);
                        infoBubbleText.d.c.setVisibility(4);
                        infoBubbleText.setOnClickListener(new cne(stageDetailsResultsFragment, 27));
                        return infoBubbleText;
                    case 8:
                        g4i G = stageDetailsResultsFragment.G();
                        Context i13 = G.i();
                        amd amdVar = G.i;
                        amdVar.getClass();
                        yea yeaVar = j58.a;
                        if (fn0.B("show_motorsport_odds") && xld.g(i13)) {
                            if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                                SharedPreferences sharedPreferences2 = uic.j;
                                if (sharedPreferences2 == null) {
                                    Context applicationContext2 = i13.getApplicationContext();
                                    synchronized (uic.i) {
                                        d2 = a5f.d(applicationContext2);
                                        uic.j = d2;
                                    }
                                    d2.getClass();
                                    sharedPreferences2 = d2;
                                }
                                ccd ccdVar = vl.b;
                                break;
                            }
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    default:
                        Context requireContext5 = stageDetailsResultsFragment.requireContext();
                        requireContext5.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext5, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                }
                return Boolean.valueOf(!f);
            }
        });
        final int i9 = 8;
        final int i10 = 9;
        this.D = n9e.M(new Function0(this) { // from class: s3i
            public final /* synthetic */ StageDetailsResultsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
            
                if (r0.c().size() == 1) goto L28;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                boolean f;
                SharedPreferences d;
                SharedPreferences d2;
                int i92 = i9;
                boolean z = true;
                StageDetailsResultsFragment stageDetailsResultsFragment = this.b;
                switch (i92) {
                    case 0:
                        LayoutInflater layoutInflater = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar = stageDetailsResultsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.header_stage_pickers, (ViewGroup) ((sp8) krkVar).b, false);
                        int i102 = R.id.cycling_stage_info;
                        View B = nq8.B(R.id.cycling_stage_info, inflate);
                        if (B != null) {
                            i102 = R.id.length_type_text;
                            TextView textView = (TextView) nq8.B(R.id.length_type_text, B);
                            if (textView != null) {
                                i102 = R.id.route_text;
                                TextView textView2 = (TextView) nq8.B(R.id.route_text, B);
                                if (textView2 != null) {
                                    i102 = R.id.time_text;
                                    TextView textView3 = (TextView) nq8.B(R.id.time_text, B);
                                    if (textView3 != null) {
                                        ImageView imageView = (ImageView) nq8.B(R.id.weather_image, B);
                                        if (imageView != null) {
                                            e92 e92Var = new e92((ConstraintLayout) B, textView, textView2, textView3, imageView, 3);
                                            int i11 = R.id.divider;
                                            MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate);
                                            if (materialDivider != null) {
                                                i11 = R.id.header_result_type;
                                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.header_result_type, inflate);
                                                if (typeHeaderView != null) {
                                                    i11 = R.id.header_sub_stage_types;
                                                    SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.header_sub_stage_types, inflate);
                                                    if (segmentedButtonsView != null) {
                                                        i11 = R.id.header_sub_stages;
                                                        TypeHeaderView typeHeaderView2 = (TypeHeaderView) nq8.B(R.id.header_sub_stages, inflate);
                                                        if (typeHeaderView2 != null) {
                                                            i11 = R.id.no_results;
                                                            GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.no_results, inflate);
                                                            if (graphicLarge != null) {
                                                                i11 = R.id.odds_view;
                                                                StageFeaturedOddsView stageFeaturedOddsView = (StageFeaturedOddsView) nq8.B(R.id.odds_view, inflate);
                                                                if (stageFeaturedOddsView != null) {
                                                                    i11 = R.id.status_label;
                                                                    TextView textView4 = (TextView) nq8.B(R.id.status_label, inflate);
                                                                    if (textView4 != null) {
                                                                        TextView textView5 = (TextView) nq8.B(R.id.time_text, inflate);
                                                                        if (textView5 != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                            e89 e89Var = new e89(constraintLayout, e92Var, materialDivider, typeHeaderView, segmentedButtonsView, typeHeaderView2, graphicLarge, stageFeaturedOddsView, textView4, textView5);
                                                                            constraintLayout.getClass();
                                                                            sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                            constraintLayout.setVisibility(8);
                                                                            return e89Var;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i102 = i11;
                                        } else {
                                            i102 = R.id.weather_image;
                                        }
                                    }
                                }
                            }
                            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i102)));
                            return null;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i102)));
                        return null;
                    case 1:
                        joa joaVar = l5i.a;
                        Stage stage = stageDetailsResultsFragment.u;
                        if (stage == null) {
                            Intrinsics.i("event");
                            throw null;
                        }
                        f = l5i.f(stage);
                        break;
                    case 2:
                        LayoutInflater layoutInflater2 = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar2 = stageDetailsResultsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.stage_details_result_footer, (ViewGroup) ((sp8) krkVar2).b, false);
                        int i12 = R.id.note_info;
                        TextView textView6 = (TextView) nq8.B(R.id.note_info, inflate2);
                        if (textView6 != null) {
                            i12 = R.id.track_image;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.track_image, inflate2);
                            if (shapeableImageView != null) {
                                i12 = R.id.track_image_container;
                                if (((LinearLayout) nq8.B(R.id.track_image_container, inflate2)) != null) {
                                    i12 = R.id.track_name;
                                    TextView textView7 = (TextView) nq8.B(R.id.track_name, inflate2);
                                    if (textView7 != null) {
                                        r3i r3iVar = new r3i((LinearLayout) inflate2, textView6, shapeableImageView, textView7);
                                        shapeableImageView.setVisibility(8);
                                        return r3iVar;
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i12)));
                        return null;
                    case 3:
                        Context requireContext = stageDetailsResultsFragment.requireContext();
                        requireContext.getClass();
                        return new k3k(requireContext);
                    case 4:
                        Context requireContext2 = stageDetailsResultsFragment.requireContext();
                        requireContext2.getClass();
                        w6i w6iVar = new w6i(requireContext2, null);
                        w6iVar.setNewLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        sea.v(w6iVar, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        return w6iVar;
                    case 5:
                        LinearLayout linearLayout = new LinearLayout(stageDetailsResultsFragment.requireContext());
                        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        linearLayout.setOrientation(1);
                        linearLayout.setVisibility(8);
                        return linearLayout;
                    case 6:
                        Context requireContext3 = stageDetailsResultsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        f = sharedPreferences.getBoolean("RACE_FLOW_SEEN_PREF", false);
                        break;
                    case 7:
                        Context requireContext4 = stageDetailsResultsFragment.requireContext();
                        requireContext4.getClass();
                        InfoBubbleText infoBubbleText = new InfoBubbleText(requireContext4, null, 6);
                        String string = stageDetailsResultsFragment.requireContext().getString(R.string.motorsport_race_flow_info_bubble);
                        string.getClass();
                        infoBubbleText.setInfoText(string);
                        infoBubbleText.d.c.setVisibility(4);
                        infoBubbleText.setOnClickListener(new cne(stageDetailsResultsFragment, 27));
                        return infoBubbleText;
                    case 8:
                        g4i G = stageDetailsResultsFragment.G();
                        Context i13 = G.i();
                        amd amdVar = G.i;
                        amdVar.getClass();
                        yea yeaVar = j58.a;
                        if (fn0.B("show_motorsport_odds") && xld.g(i13)) {
                            if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                                SharedPreferences sharedPreferences2 = uic.j;
                                if (sharedPreferences2 == null) {
                                    Context applicationContext2 = i13.getApplicationContext();
                                    synchronized (uic.i) {
                                        d2 = a5f.d(applicationContext2);
                                        uic.j = d2;
                                    }
                                    d2.getClass();
                                    sharedPreferences2 = d2;
                                }
                                ccd ccdVar = vl.b;
                                break;
                            }
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    default:
                        Context requireContext5 = stageDetailsResultsFragment.requireContext();
                        requireContext5.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext5, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                }
                return Boolean.valueOf(!f);
            }
        }, new Function0(this) { // from class: s3i
            public final /* synthetic */ StageDetailsResultsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.c(r2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
            
                if (r0.c().size() == 1) goto L28;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                boolean f;
                SharedPreferences d;
                SharedPreferences d2;
                int i92 = i10;
                boolean z = true;
                StageDetailsResultsFragment stageDetailsResultsFragment = this.b;
                switch (i92) {
                    case 0:
                        LayoutInflater layoutInflater = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar = stageDetailsResultsFragment.l;
                        krkVar.getClass();
                        View inflate = layoutInflater.inflate(R.layout.header_stage_pickers, (ViewGroup) ((sp8) krkVar).b, false);
                        int i102 = R.id.cycling_stage_info;
                        View B = nq8.B(R.id.cycling_stage_info, inflate);
                        if (B != null) {
                            i102 = R.id.length_type_text;
                            TextView textView = (TextView) nq8.B(R.id.length_type_text, B);
                            if (textView != null) {
                                i102 = R.id.route_text;
                                TextView textView2 = (TextView) nq8.B(R.id.route_text, B);
                                if (textView2 != null) {
                                    i102 = R.id.time_text;
                                    TextView textView3 = (TextView) nq8.B(R.id.time_text, B);
                                    if (textView3 != null) {
                                        ImageView imageView = (ImageView) nq8.B(R.id.weather_image, B);
                                        if (imageView != null) {
                                            e92 e92Var = new e92((ConstraintLayout) B, textView, textView2, textView3, imageView, 3);
                                            int i11 = R.id.divider;
                                            MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate);
                                            if (materialDivider != null) {
                                                i11 = R.id.header_result_type;
                                                TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.header_result_type, inflate);
                                                if (typeHeaderView != null) {
                                                    i11 = R.id.header_sub_stage_types;
                                                    SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.header_sub_stage_types, inflate);
                                                    if (segmentedButtonsView != null) {
                                                        i11 = R.id.header_sub_stages;
                                                        TypeHeaderView typeHeaderView2 = (TypeHeaderView) nq8.B(R.id.header_sub_stages, inflate);
                                                        if (typeHeaderView2 != null) {
                                                            i11 = R.id.no_results;
                                                            GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.no_results, inflate);
                                                            if (graphicLarge != null) {
                                                                i11 = R.id.odds_view;
                                                                StageFeaturedOddsView stageFeaturedOddsView = (StageFeaturedOddsView) nq8.B(R.id.odds_view, inflate);
                                                                if (stageFeaturedOddsView != null) {
                                                                    i11 = R.id.status_label;
                                                                    TextView textView4 = (TextView) nq8.B(R.id.status_label, inflate);
                                                                    if (textView4 != null) {
                                                                        TextView textView5 = (TextView) nq8.B(R.id.time_text, inflate);
                                                                        if (textView5 != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                            e89 e89Var = new e89(constraintLayout, e92Var, materialDivider, typeHeaderView, segmentedButtonsView, typeHeaderView2, graphicLarge, stageFeaturedOddsView, textView4, textView5);
                                                                            constraintLayout.getClass();
                                                                            sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                            constraintLayout.setVisibility(8);
                                                                            return e89Var;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i102 = i11;
                                        } else {
                                            i102 = R.id.weather_image;
                                        }
                                    }
                                }
                            }
                            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i102)));
                            return null;
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i102)));
                        return null;
                    case 1:
                        joa joaVar = l5i.a;
                        Stage stage = stageDetailsResultsFragment.u;
                        if (stage == null) {
                            Intrinsics.i("event");
                            throw null;
                        }
                        f = l5i.f(stage);
                        break;
                    case 2:
                        LayoutInflater layoutInflater2 = stageDetailsResultsFragment.getLayoutInflater();
                        krk krkVar2 = stageDetailsResultsFragment.l;
                        krkVar2.getClass();
                        View inflate2 = layoutInflater2.inflate(R.layout.stage_details_result_footer, (ViewGroup) ((sp8) krkVar2).b, false);
                        int i12 = R.id.note_info;
                        TextView textView6 = (TextView) nq8.B(R.id.note_info, inflate2);
                        if (textView6 != null) {
                            i12 = R.id.track_image;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.track_image, inflate2);
                            if (shapeableImageView != null) {
                                i12 = R.id.track_image_container;
                                if (((LinearLayout) nq8.B(R.id.track_image_container, inflate2)) != null) {
                                    i12 = R.id.track_name;
                                    TextView textView7 = (TextView) nq8.B(R.id.track_name, inflate2);
                                    if (textView7 != null) {
                                        r3i r3iVar = new r3i((LinearLayout) inflate2, textView6, shapeableImageView, textView7);
                                        shapeableImageView.setVisibility(8);
                                        return r3iVar;
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i12)));
                        return null;
                    case 3:
                        Context requireContext = stageDetailsResultsFragment.requireContext();
                        requireContext.getClass();
                        return new k3k(requireContext);
                    case 4:
                        Context requireContext2 = stageDetailsResultsFragment.requireContext();
                        requireContext2.getClass();
                        w6i w6iVar = new w6i(requireContext2, null);
                        w6iVar.setNewLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        sea.v(w6iVar, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        return w6iVar;
                    case 5:
                        LinearLayout linearLayout = new LinearLayout(stageDetailsResultsFragment.requireContext());
                        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        linearLayout.setOrientation(1);
                        linearLayout.setVisibility(8);
                        return linearLayout;
                    case 6:
                        Context requireContext3 = stageDetailsResultsFragment.requireContext();
                        requireContext3.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = requireContext3.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        f = sharedPreferences.getBoolean("RACE_FLOW_SEEN_PREF", false);
                        break;
                    case 7:
                        Context requireContext4 = stageDetailsResultsFragment.requireContext();
                        requireContext4.getClass();
                        InfoBubbleText infoBubbleText = new InfoBubbleText(requireContext4, null, 6);
                        String string = stageDetailsResultsFragment.requireContext().getString(R.string.motorsport_race_flow_info_bubble);
                        string.getClass();
                        infoBubbleText.setInfoText(string);
                        infoBubbleText.d.c.setVisibility(4);
                        infoBubbleText.setOnClickListener(new cne(stageDetailsResultsFragment, 27));
                        return infoBubbleText;
                    case 8:
                        g4i G = stageDetailsResultsFragment.G();
                        Context i13 = G.i();
                        amd amdVar = G.i;
                        amdVar.getClass();
                        yea yeaVar = j58.a;
                        if (fn0.B("show_motorsport_odds") && xld.g(i13)) {
                            if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                                SharedPreferences sharedPreferences2 = uic.j;
                                if (sharedPreferences2 == null) {
                                    Context applicationContext2 = i13.getApplicationContext();
                                    synchronized (uic.i) {
                                        d2 = a5f.d(applicationContext2);
                                        uic.j = d2;
                                    }
                                    d2.getClass();
                                    sharedPreferences2 = d2;
                                }
                                ccd ccdVar = vl.b;
                                break;
                            }
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    default:
                        Context requireContext5 = stageDetailsResultsFragment.requireContext();
                        requireContext5.getClass();
                        GambleRegulationFooterView gambleRegulationFooterView = new GambleRegulationFooterView(requireContext5, null, 6);
                        gambleRegulationFooterView.setVisibility(8);
                        return gambleRegulationFooterView;
                }
                return Boolean.valueOf(!f);
            }
        });
    }

    public static w3i H(ServerType serverType) {
        Object obj;
        Iterator<E> it = w3i.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((w3i) obj).b.contains(serverType)) {
                break;
            }
        }
        return (w3i) obj;
    }

    public final n4i C() {
        return (n4i) this.s.getValue();
    }

    public final r3i D() {
        return (r3i) this.y.getValue();
    }

    public final e89 E() {
        return (e89) this.x.getValue();
    }

    public final String F(Stage stage) {
        if (stage.getType() == ServerType.QUALIFYING) {
            List<Stage> partSubstages = stage.getPartSubstages();
            if (yid.m(partSubstages != null ? Integer.valueOf(partSubstages.size()) : null) > 1) {
                String string = getString(R.string.total);
                string.getClass();
                return string;
            }
        }
        if (stage.getType() == ServerType.SPRINT_QUALIFYING) {
            List<Stage> partSubstages2 = stage.getPartSubstages();
            if (yid.m(partSubstages2 != null ? Integer.valueOf(partSubstages2.size()) : null) > 1) {
                String string2 = getString(R.string.formula_grid);
                string2.getClass();
                return string2;
            }
        }
        if (stage.getType() == ServerType.SPRINT) {
            String string3 = getString(R.string.formula_race);
            string3.getClass();
            return string3;
        }
        if (stage.getType() == ServerType.AFTER_STAGE) {
            String string4 = getString(R.string.motorsport_overall_results);
            string4.getClass();
            return string4;
        }
        joa joaVar = l5i.a;
        if (l5i.i(stage) && stage.getType() == ServerType.CUSTOM) {
            String string5 = getString(R.string.motorsport_wrc_power_stage);
            string5.getClass();
            return string5;
        }
        if (l5i.i(stage) && stage.getType() == ServerType.STAGE && stage.getSequence() != null && stage.getStartDateTimestamp() != 0) {
            DayOfWeek dayOfWeek = Instant.ofEpochSecond(stage.getStartDateTimestamp()).atZone(ZoneOffset.UTC).getDayOfWeek();
            int i = dayOfWeek == null ? -1 : x3i.a[dayOfWeek.ordinal()];
            String string6 = getString(i != 1 ? i != 2 ? i != 3 ? R.string.motorsport_wrc_stage_sunday_short : R.string.motorsport_wrc_stage_saturday_short : R.string.motorsport_wrc_stage_friday_short : R.string.motorsport_wrc_stage_thursday_short, stage.getSequence());
            string6.getClass();
            return string6;
        }
        if (stage.getType() == ServerType.STAGE && l5i.f(stage) && stage.getSequence() != null) {
            String string7 = getString(R.string.cycling_stage_number, stage.getSequence());
            string7.getClass();
            return string7;
        }
        if (stage.getType() == ServerType.PRACTICE) {
            UniqueStage uniqueStage = stage.getUniqueStage();
            if (Intrinsics.c(uniqueStage != null ? Boolean.valueOf(cga.G(uniqueStage)) : null, Boolean.TRUE)) {
                DayOfWeek dayOfWeek2 = hwc.a;
                Context requireContext = requireContext();
                requireContext.getClass();
                return hwc.d(requireContext, stage.getDescription(), true);
            }
        }
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        return cga.A(stage, requireContext2, true);
    }

    public final g4i G() {
        return (g4i) this.r.getValue();
    }

    public final void I() {
        Integer valueOf = Integer.valueOf(R.drawable.race_start);
        Stage stage = G().n;
        if (stage != null) {
            GraphicLarge graphicLarge = E().g;
            long startDateTimestamp = stage.getStartDateTimestamp() - Instant.now().getEpochSecond();
            if (Intrinsics.c(stage.getStatusType(), StatusKt.STATUS_CANCELED)) {
                graphicLarge.setLargeDrawableResource(Integer.valueOf(R.drawable.no_events_1));
                uyf uyfVar = this.w;
                if (uyfVar != null) {
                    uyfVar.cancel();
                }
                this.w = null;
                String string = getString(R.string.motorsport_any_session_empty_state);
                string.getClass();
                graphicLarge.setSubtitleResource(string);
                graphicLarge.setTitleVisibility(false);
                graphicLarge.setSubtitleVisibility(true);
                return;
            }
            if (0 <= startDateTimestamp) {
                wd5 wd5Var = xd5.b;
                be5 be5Var = be5.HOURS;
                long R = wkn.R(24, be5Var);
                be5 be5Var2 = be5.SECONDS;
                if (startDateTimestamp <= xd5.k(R, be5Var2)) {
                    graphicLarge.setLargeDrawableResource(valueOf);
                    long j = 1000 * startDateTimestamp;
                    if (this.w == null) {
                        uyf uyfVar2 = new uyf(this, j);
                        uyfVar2.start();
                        this.w = uyfVar2;
                    }
                    String string2 = getString(R.string.motorsport_race_countdown);
                    long S = wkn.S(startDateTimestamp, be5Var2);
                    graphicLarge.setTitleResource(string2 + " " + String.format(dla.d(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(xd5.k(S, be5Var)), Long.valueOf(xd5.k(S, be5.MINUTES) % 60), Long.valueOf(xd5.k(S, be5Var2) % 60)}, 3)));
                    graphicLarge.setSubtitleVisibility(false);
                    return;
                }
            }
            graphicLarge.setLargeDrawableResource(valueOf);
            uyf uyfVar3 = this.w;
            if (uyfVar3 != null) {
                uyfVar3.cancel();
            }
            this.w = null;
            joa joaVar = l5i.a;
            Stage stage2 = this.u;
            if (stage2 == null) {
                Intrinsics.i("event");
                throw null;
            }
            String string3 = getString(l5i.f(stage2) ? R.string.cycling_results_empty_message : R.string.motorsport_results_empty_message);
            string3.getClass();
            graphicLarge.setSubtitleResource(string3);
            graphicLarge.setTitleVisibility(false);
            graphicLarge.setSubtitleVisibility(true);
        }
    }

    public final void K(Stage stage, List list) {
        g5i g5iVar;
        if (!Intrinsics.c(G().l, Sports.CYCLING)) {
            if (Intrinsics.c(G().m, Sports.FORMULA_1)) {
                kp5 kp5Var = fwc.f;
                ArrayList arrayList = new ArrayList();
                for (Object obj : kp5Var) {
                    int ordinal = ((fwc) obj).ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                zzl.b();
                                return;
                            }
                            if (stage.getType() == ServerType.RACE && (list == null || !list.isEmpty())) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    String personalFastestLapTime = ((StageStandingsItem) it.next()).getPersonalFastestLapTime();
                                    if (personalFastestLapTime == null || StringsKt.R(personalFastestLapTime)) {
                                    }
                                }
                            }
                        } else if (stage.getType() != ServerType.RACE) {
                            continue;
                        } else {
                            Stage stage2 = this.u;
                            if (stage2 == null) {
                                Intrinsics.i("event");
                                throw null;
                            }
                            StageInfo info = stage2.getInfo();
                            if (yid.m(info != null ? info.getLaps() : null) <= 0) {
                                StageInfo info2 = stage.getInfo();
                                if (yid.m(info2 != null ? info2.getLaps() : null) > 0) {
                                }
                            }
                            if (list == null || !list.isEmpty()) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    List<TyrePeriod> tyreInfo = ((StageStandingsItem) it2.next()).getTyreInfo();
                                    if (tyreInfo == null || tyreInfo.isEmpty()) {
                                    }
                                }
                            }
                        }
                    }
                    arrayList.add(obj);
                }
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((fwc) it3.next()).name());
                }
                TypeHeaderView.z(E().d, arrayList2, null, 2);
                return;
            }
            return;
        }
        kp5 kp5Var2 = ta4.h;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : kp5Var2) {
            int ordinal2 = ((ta4) obj2).ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            zzl.b();
                            return;
                        } else if (list == null || !list.isEmpty()) {
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                if (yid.m(((StageStandingsItem) it4.next()).getYoungRiderPosition()) > 0) {
                                    arrayList3.add(obj2);
                                    break;
                                }
                            }
                        }
                    } else if (list == null || !list.isEmpty()) {
                        Iterator it5 = list.iterator();
                        while (it5.hasNext()) {
                            if (yid.m(((StageStandingsItem) it5.next()).getClimbPosition()) > 0) {
                                arrayList3.add(obj2);
                                break;
                                break;
                            }
                        }
                    }
                } else if (list == null || !list.isEmpty()) {
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        if (yid.m(((StageStandingsItem) it6.next()).getSprintPosition()) > 0) {
                            arrayList3.add(obj2);
                            break;
                            break;
                        }
                    }
                }
            } else if (list == null || !list.isEmpty()) {
                Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    if (yid.m(((StageStandingsItem) it7.next()).getPosition()) > 0) {
                        arrayList3.add(obj2);
                        break;
                        break;
                    }
                }
            }
        }
        TypeHeaderView typeHeaderView = E().d;
        joa joaVar = l5i.a;
        Stage stage3 = this.u;
        if (stage3 == null) {
            Intrinsics.i("event");
            throw null;
        }
        i5i b = l5i.b(stage3);
        ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
        Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            ta4 ta4Var = (ta4) it8.next();
            if (b != null) {
                ta4Var.getClass();
                int ordinal3 = ta4Var.ordinal();
                if (ordinal3 == 0) {
                    g5iVar = b.b;
                } else if (ordinal3 == 1) {
                    g5iVar = b.c;
                } else if (ordinal3 == 2) {
                    g5iVar = b.d;
                } else {
                    if (ordinal3 != 3) {
                        zzl.b();
                        return;
                    }
                    g5iVar = b.e;
                }
            } else {
                g5iVar = null;
            }
            String name = ta4Var.name();
            String string = getString(ta4Var.b);
            string.getClass();
            arrayList4.add(new vt2(name, string, false, g5iVar != null ? new tc3(1759287230, new g31(g5iVar, 7), true) : null, null, null, null, 244));
        }
        Boolean bool = Boolean.TRUE;
        int i = TypeHeaderView.q;
        typeHeaderView.w(arrayList4, null, bool);
    }

    public final void L(Stage stage) {
        String weather;
        StageInfo info;
        Drawable drawable = null;
        if (stage == null || (info = stage.getInfo()) == null || (weather = info.getWeather()) == null) {
            Stage stage2 = this.u;
            if (stage2 == null) {
                Intrinsics.i("event");
                throw null;
            }
            StageInfo info2 = stage2.getInfo();
            weather = info2 != null ? info2.getWeather() : null;
        }
        if (weather != null) {
            Context requireContext = requireContext();
            requireContext.getClass();
            drawable = o3a.G(requireContext, weather);
        }
        r3i D = D();
        if (D != null) {
            TextView textView = D.d;
            ua5 ua5Var = ua5.b;
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            Integer valueOf = Integer.valueOf(ao2.s(48, requireContext2));
            haa.K(textView, drawable, ua5Var, valueOf, valueOf);
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_stage_sport_details, (ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
        if (recyclerView != null) {
            SwipeRefreshLayoutFixed swipeRefreshLayoutFixed = (SwipeRefreshLayoutFixed) inflate;
            return new sp8(swipeRefreshLayoutFixed, recyclerView, swipeRefreshLayoutFixed);
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.recycler_view)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        uyf uyfVar = this.w;
        if (uyfVar != null) {
            uyfVar.cancel();
        }
        this.w = null;
        super.onDestroy();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "DetailsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        String name;
        UniqueStage uniqueStage;
        Object valueOf;
        UniqueStage uniqueStage2;
        Category category;
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Stage stage = (Stage) gz8.M(requireArguments, "EVENT", Stage.class);
        if (stage == null) {
            return;
        }
        this.u = stage;
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayoutFixed swipeRefreshLayoutFixed = ((sp8) krkVar).c;
        swipeRefreshLayoutFixed.getClass();
        AbstractFragment.v(this, swipeRefreshLayoutFixed, null, null, 6);
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        Stage stage2 = this.u;
        if (stage2 == null) {
            Intrinsics.i("event");
            throw null;
        }
        UniqueStage uniqueStage3 = stage2.getUniqueStage();
        Stage stage3 = this.u;
        if (stage3 == null) {
            Intrinsics.i("event");
            throw null;
        }
        StageInfo info = stage3.getInfo();
        this.v = new r6i(requireActivity, uniqueStage3, info != null ? info.getLaps() : null);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((sp8) krkVar2).b;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        InfoBubbleText infoBubbleText = (InfoBubbleText) this.C.getValue();
        if (infoBubbleText != null) {
            i4i i4iVar = (i4i) C().q.d();
            if (!Intrinsics.c(i4iVar != null ? Boolean.valueOf(i4iVar.c) : null, Boolean.TRUE)) {
                infoBubbleText = null;
            }
            if (infoBubbleText != null) {
                r6i r6iVar = this.v;
                if (r6iVar == null) {
                    Intrinsics.i(L6.G1);
                    throw null;
                }
                r6iVar.p(r6iVar.g.size(), infoBubbleText);
            }
        }
        r6i r6iVar2 = this.v;
        if (r6iVar2 == null) {
            Intrinsics.i(L6.G1);
            throw null;
        }
        ConstraintLayout constraintLayout = E().a;
        constraintLayout.getClass();
        r6iVar2.p(r6iVar2.g.size(), constraintLayout);
        E().g.setVisibility(8);
        SegmentedButtonsView segmentedButtonsView = E().e;
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        segmentedButtonsView.k = new p1(2, this, StageDetailsResultsFragment.class, "onSubStageTypeSelected", "onSubStageTypeSelected(Ljava/lang/String;I)V", 0, 15);
        int i = 0;
        segmentedButtonsView.g = false;
        segmentedButtonsView.h = pair;
        segmentedButtonsView.j = v1h.f;
        segmentedButtonsView.i = new z1h(0);
        rlh rlhVar = rlh.b;
        if (!rlhVar.isEmpty()) {
            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
        }
        E().f.setBackground(null);
        g5k g5kVar = new g5k(E().f);
        g5kVar.m = new y3i(this, i);
        g5kVar.b();
        int i2 = 2;
        int i3 = 1;
        if (Intrinsics.c(G().l, Sports.CYCLING)) {
            g5k g5kVar2 = new g5k(E().d);
            g5kVar2.m = new y3i(this, i3);
            g5kVar2.b();
        } else if (Intrinsics.c(G().m, Sports.FORMULA_1)) {
            g5k g5kVar3 = new g5k(E().d);
            g5kVar3.d = new t3i(this, 3);
            g5kVar3.m = new y3i(this, i2);
            g5kVar3.b();
        }
        joa joaVar = this.B;
        LinearLayout linearLayout = (LinearLayout) joaVar.getValue();
        r3i D = D();
        if (D != null) {
            linearLayout.addView(D.a);
        }
        joa joaVar2 = this.z;
        linearLayout.addView((k3k) joaVar2.getValue());
        linearLayout.addView((w6i) this.A.getValue());
        GambleRegulationFooterView gambleRegulationFooterView = (GambleRegulationFooterView) this.D.getValue();
        if (gambleRegulationFooterView != null) {
            linearLayout.addView(gambleRegulationFooterView);
        }
        r3i D2 = D();
        if (D2 != null) {
            TextView textView = D2.d;
            Stage stage4 = this.u;
            if (stage4 == null) {
                Intrinsics.i("event");
                throw null;
            }
            StageInfo info2 = stage4.getInfo();
            if (info2 == null || (name = info2.getCircuit()) == null) {
                Stage stage5 = this.u;
                if (stage5 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                StageSeason stageSeason = stage5.getStageSeason();
                name = (stageSeason == null || (uniqueStage = stageSeason.getUniqueStage()) == null) ? null : uniqueStage.getName();
            }
            textView.setText(name);
            Stage stage6 = this.u;
            if (stage6 == null) {
                Intrinsics.i("event");
                throw null;
            }
            Country country = stage6.getCountry();
            String alpha2 = country != null ? country.getAlpha2() : null;
            Stage stage7 = this.u;
            if (stage7 == null) {
                Intrinsics.i("event");
                throw null;
            }
            StageSeason stageSeason2 = stage7.getStageSeason();
            Integer valueOf2 = (stageSeason2 == null || (uniqueStage2 = stageSeason2.getUniqueStage()) == null || (category = uniqueStage2.getCategory()) == null) ? null : Integer.valueOf(category.getId());
            if (alpha2 != null) {
                valueOf = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", alpha2, "/flag");
            } else if (valueOf2 != null) {
                valueOf = vxd.j(valueOf2.intValue(), (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "category/", "/image");
            } else {
                valueOf = Integer.valueOf(R.drawable.ic_flag_placeholder);
            }
            ua5 ua5Var = ua5.a;
            Context context = textView.getContext();
            context.getClass();
            int s = ao2.s(32, context);
            t25.a(s);
            haa.q(textView, valueOf, ua5Var, new t25(s));
            L(null);
        }
        r3i D3 = D();
        if (D3 != null) {
            ShapeableImageView shapeableImageView = D3.c;
            Stage stage8 = this.u;
            if (stage8 == null) {
                Intrinsics.i("event");
                throw null;
            }
            int id = stage8.getId();
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            String str = (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/") + "stage/" + id + "/image" + (hkg.b0(requireContext2) ? "/dark" : "");
            apf a = ajh.a(shapeableImageView.getContext());
            ht9 ht9Var = new ht9(shapeableImageView.getContext());
            ht9Var.c = str;
            vt9.f(ht9Var, shapeableImageView);
            ht9Var.d = new y3g(16, this, shapeableImageView);
            a.a(ht9Var.a());
        }
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.addView((LinearLayout) joaVar.getValue());
        r6i r6iVar3 = this.v;
        if (r6iVar3 == null) {
            Intrinsics.i(L6.G1);
            throw null;
        }
        g7.o(r6iVar3, frameLayout, 6);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView2 = ((sp8) krkVar3).b;
        r6i r6iVar4 = this.v;
        if (r6iVar4 == null) {
            Intrinsics.i(L6.G1);
            throw null;
        }
        recyclerView2.setAdapter(r6iVar4);
        Context requireContext3 = requireContext();
        requireContext3.getClass();
        Stage stage9 = this.u;
        if (stage9 == null) {
            Intrinsics.i("event");
            throw null;
        }
        int id2 = stage9.getId();
        Intent intent = requireActivity().getIntent();
        intent.getClass();
        FirebaseBundle firebaseBundle = new FirebaseBundle();
        String F = nv.F(intent);
        if (F != null) {
            firebaseBundle.putString(Payload.CAMPAIGN_ID, F);
        }
        nv.h(firebaseBundle, intent);
        firebaseBundle.putInt("id", id2);
        firebaseBundle.putString("location", nv.G(intent).a);
        nv.N(requireContext3, firebaseBundle, "open_stage");
        C().m.e(getViewLifecycleOwner(), new ioe(12, new t3i(this, 0)));
        C().o.e(getViewLifecycleOwner(), new ioe(12, new t3i(this, 1)));
        k3k k3kVar = (k3k) joaVar2.getValue();
        k3kVar.setOnSelectCountryClick(new u3i(this, k3kVar));
        k3kVar.setOnFullTvChannelClick(new mx5(k3kVar, 1));
        k3kVar.setOnVoteClick(new v3i(this, 0));
        k3kVar.setOnContributeClick(new fvg(this, 24));
        G().p.e(getViewLifecycleOwner(), new ioe(12, new t3i(this, 2)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        G().n();
    }
}
