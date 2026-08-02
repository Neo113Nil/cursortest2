package com.sofascore.results.base;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import com.blaze.gam.BlazeGAM;
import com.blaze.ima.BlazeIMA;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.branding.PartnerOfferType;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.firebase.SurveyConfigData;
import com.sofascore.model.weeklyChallenge.WeeklyStatus;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.dialog.ProposeFollowEntityDialog;
import com.sofascore.results.dialog.RemoveAdsDialog;
import com.sofascore.results.dialog.RemoveAdsYearlyOfferBottomSheet;
import com.sofascore.results.event.aiInsights.SofascoreAnalystTennisPromoBottomSheet;
import com.sofascore.results.event.aiInsights.SofascoreAnalystWorldCupOfferBottomSheet;
import com.sofascore.results.event.details.view.promotion.PromotionModal;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.SurveyActivity;
import com.sofascore.results.matchOfTheWeek.MatchOfTheWeekBottomSheet;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.transfers.PlayerTransfersActivity;
import com.sofascore.results.weeklyChallenge.ui.components.bottomSheet.PromotionDemotionBottomSheet;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a1f;
import defpackage.a5f;
import defpackage.a70;
import defpackage.ab;
import defpackage.ao2;
import defpackage.asf;
import defpackage.b1d;
import defpackage.b7;
import defpackage.bef;
import defpackage.beh;
import defpackage.bsk;
import defpackage.c1f;
import defpackage.ce;
import defpackage.d1f;
import defpackage.dd;
import defpackage.de;
import defpackage.dla;
import defpackage.duf;
import defpackage.e1f;
import defpackage.e6b;
import defpackage.ebd;
import defpackage.ed;
import defpackage.eq3;
import defpackage.f1f;
import defpackage.f8h;
import defpackage.fn0;
import defpackage.fp8;
import defpackage.fuf;
import defpackage.fv;
import defpackage.fz8;
import defpackage.g01;
import defpackage.g1f;
import defpackage.gk;
import defpackage.guh;
import defpackage.h01;
import defpackage.h1f;
import defpackage.h42;
import defpackage.hjg;
import defpackage.hkg;
import defpackage.hs4;
import defpackage.i01;
import defpackage.i1f;
import defpackage.i52;
import defpackage.i5h;
import defpackage.ia0;
import defpackage.in;
import defpackage.j1f;
import defpackage.j42;
import defpackage.j58;
import defpackage.jca;
import defpackage.jn;
import defpackage.k01;
import defpackage.k6b;
import defpackage.ke0;
import defpackage.l1;
import defpackage.l6g;
import defpackage.lm5;
import defpackage.ltb;
import defpackage.m35;
import defpackage.mme;
import defpackage.mqi;
import defpackage.n01;
import defpackage.n35;
import defpackage.nq8;
import defpackage.nv;
import defpackage.o02;
import defpackage.o3;
import defpackage.ok3;
import defpackage.otk;
import defpackage.oy4;
import defpackage.p01;
import defpackage.p1f;
import defpackage.py4;
import defpackage.q01;
import defpackage.q3;
import defpackage.qed;
import defpackage.qef;
import defpackage.qv5;
import defpackage.r1;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s0;
import defpackage.s01;
import defpackage.s38;
import defpackage.srk;
import defpackage.su;
import defpackage.t0d;
import defpackage.tba;
import defpackage.tub;
import defpackage.tv0;
import defpackage.u0f;
import defpackage.u4a;
import defpackage.u9l;
import defpackage.uic;
import defpackage.v0f;
import defpackage.v38;
import defpackage.vm;
import defpackage.w0f;
import defpackage.w3a;
import defpackage.w42;
import defpackage.wca;
import defpackage.x0f;
import defpackage.x9l;
import defpackage.xw3;
import defpackage.y0f;
import defpackage.yea;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.yv4;
import defpackage.z0f;
import defpackage.z1;
import defpackage.z45;
import defpackage.z8e;
import defpackage.zic;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sofascore/results/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "setContentView", "(Landroid/view/View;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BaseActivity extends Hilt_BaseActivity {
    public static final /* synthetic */ KProperty[] H = {new t0d(BaseActivity.class, "isDarkTheme", "isDarkTheme()Z", 0)};
    public final otk A;
    public p1f B;
    public String C;
    public boolean D;
    public AdBannerView E;
    public Map F;
    public final String G;
    public final boolean l = true;
    public final boolean m = true;
    public dd n;
    public ViewStub o;
    public String p;
    public UnderlinedToolbar q;
    public TextView r;
    public long s;
    public final qed t;
    public long u;
    public gk v;
    public final de w;
    public final su x;
    public final mqi y;
    public final mqi z;

    public BaseActivity() {
        yv4.a.getClass();
        this.t = new qed();
        int i = 2;
        this.w = registerForActivityResult(new ce(i), new l1(this, 8));
        this.x = new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null);
        this.y = ypa.b(new tv0(5));
        this.z = ypa.b(new tv0(6));
        this.A = new otk(duf.a.getOrCreateKotlinClass(ebd.class), new q01(this, 1), new q01(this, 0), new q01(this, i));
        this.G = "NoTab";
    }

    public static void r(BaseActivity baseActivity, ViewGroup viewGroup) {
        viewGroup.getClass();
        o3 o3Var = new o3(1, baseActivity, viewGroup);
        WeakHashMap weakHashMap = bsk.a;
        srk.c(viewGroup, o3Var);
    }

    public static final void s(BaseActivity baseActivity, View view, x9l x9lVar) {
        int i;
        u9l u9lVar = x9lVar.a;
        if (Build.VERSION.SDK_INT >= 30) {
            i = u9lVar.i(WindowInsets.Type.ime()).d;
        } else {
            baseActivity.getWindow().setSoftInputMode(32);
            i = 0;
        }
        u4a i2 = u9lVar.i(519);
        i2.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i == 0 ? i2.d : 0);
        view.setLayoutParams(marginLayoutParams);
        view.setPadding(0, 0, 0, i);
    }

    public final SharedPreferences A() {
        return (SharedPreferences) this.z.getValue();
    }

    /* renamed from: B, reason: from getter */
    public boolean getM() {
        return this.m;
    }

    /* renamed from: C, reason: from getter */
    public String getL() {
        return this.G;
    }

    public final UserAccount D() {
        ia0 ia0Var = ia0.q;
        return ok3.p().e();
    }

    public final void E() {
        FrameLayout frameLayout;
        dd ddVar;
        dd ddVar2 = this.n;
        if (ddVar2 == null || (frameLayout = (FrameLayout) ddVar2.b) == null || frameLayout.getVisibility() != 0 || (ddVar = this.n) == null) {
            return;
        }
        FrameLayout frameLayout2 = (FrameLayout) ddVar.b;
        frameLayout2.setOnTouchListener(null);
        frameLayout2.getClass();
        tba.j(frameLayout2, n35.TO_TOP, 500L, 12);
        ((TextView) ddVar.c).setVisibility(8);
    }

    public final void F() {
        UnderlinedToolbar underlinedToolbar = this.q;
        if (underlinedToolbar != null) {
            if ((this instanceof PlayerTransfersActivity) && hkg.b0(this)) {
                underlinedToolbar.setUnderlined(true);
            }
            this.r = (TextView) underlinedToolbar.findViewById(R.id.toolbar_title);
            o(underlinedToolbar);
            o02 n = n();
            if (n != null) {
                n.n0(true);
                n.o0();
            }
        }
    }

    public final UnderlinedToolbar G() {
        if (this.q == null) {
            this.q = (UnderlinedToolbar) findViewById(R.id.toolbar);
            F();
        }
        UnderlinedToolbar underlinedToolbar = this.q;
        underlinedToolbar.getClass();
        return underlinedToolbar;
    }

    public final void H(UnderlinedToolbar underlinedToolbar) {
        this.q = underlinedToolbar;
        F();
    }

    public final void I(AdBannerView adBannerView, Map map) {
        adBannerView.getClass();
        this.F = map;
        this.E = adBannerView;
        ltb ltbVar = new ltb();
        ltbVar.put("language", Locale.getDefault().getLanguage());
        ltb d = ltbVar.d();
        if (map == null) {
            map = lm5.a;
            map.getClass();
        }
        adBannerView.setCustomTargeting(tub.k(d, map));
        adBannerView.setBackgroundColor(-16777216);
        adBannerView.setAdClickedListener(new k01(this, 0));
        adBannerView.c(AdType.Banner.DefaultSticky);
        this.D = true;
    }

    public final void K() {
        ViewStub viewStub = this.o;
        if (viewStub != null) {
            dd ddVar = this.n;
            if (ddVar == null) {
                View inflate = viewStub.inflate();
                int i = R.id.no_connection_banner;
                TextView textView = (TextView) nq8.B(R.id.no_connection_banner, inflate);
                if (textView != null) {
                    i = R.id.no_connection_empty_state;
                    GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.no_connection_empty_state, inflate);
                    if (graphicLarge != null) {
                        ddVar = new dd((FrameLayout) inflate, textView, graphicLarge, 27);
                        this.n = ddVar;
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                return;
            }
            FrameLayout frameLayout = (FrameLayout) ddVar.b;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            if (A().getBoolean("no_connection_empty_state", true) && !(this instanceof MainActivity)) {
                dd ddVar2 = this.n;
                if (ddVar2 != null) {
                    GraphicLarge graphicLarge2 = (GraphicLarge) ddVar2.d;
                    FrameLayout frameLayout2 = (FrameLayout) ddVar2.b;
                    tba.j((TextView) ddVar2.c, n35.TO_TOP, 500L, 12);
                    tba.i(graphicLarge2, m35.FROM_TOP, 500L, 4);
                    graphicLarge2.setVisibility(0);
                    frameLayout2.setOnTouchListener(new ab(1));
                    frameLayout2.setBackgroundColor(getColor(R.color.surface_1));
                    graphicLarge2.getButtonLarge().setOnClickListener(new s0(this, 5));
                    return;
                }
                return;
            }
            dd ddVar3 = this.n;
            if (ddVar3 != null) {
                TextView textView2 = (TextView) ddVar3.c;
                GraphicLarge graphicLarge3 = (GraphicLarge) ddVar3.d;
                FrameLayout frameLayout3 = (FrameLayout) ddVar3.b;
                textView2.setText(R.string.no_internet_info_title);
                int color = getColor(R.color.error);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                shapeDrawable.getPaint().setColor(color);
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{textView2.getBackground(), shapeDrawable});
                textView2.setBackground(transitionDrawable);
                transitionDrawable.startTransition(400);
                if (textView2.getVisibility() == 0) {
                    graphicLarge3.setVisibility(8);
                    frameLayout3.setOnTouchListener(null);
                    frameLayout3.setBackgroundColor(0);
                    tba.i(textView2, m35.FROM_TOP, 500L, 4);
                }
                graphicLarge3.setVisibility(8);
                frameLayout3.setOnTouchListener(null);
                frameLayout3.setBackgroundColor(0);
                tba.i(textView2, m35.FROM_TOP, 500L, 4);
            }
        }
    }

    public final void L(j1f j1fVar) {
        if (isFinishing() || isDestroyed() || k().S()) {
            return;
        }
        ActivityManager activityManager = (ActivityManager) getSystemService(ActivityManager.class);
        ComponentName componentName = getComponentName();
        componentName.getClass();
        if (eq3.E(activityManager, componentName)) {
            if (!j1fVar.d.contains(getClass()) && !j1fVar.d.isEmpty()) {
                p1f z = z();
                b7 a0 = l6g.a0(i5h.g(CollectionsKt.N(z.f), new mme(getClass(), 7)));
                if (a0.isEmpty()) {
                    return;
                }
                z.c.k(CollectionsKt.Y(a0));
                return;
            }
            if (j1fVar.equals(u0f.h)) {
                zic.M(this, 6);
                return;
            }
            final int i = 1;
            final int i2 = 0;
            rq3 rq3Var = null;
            if (j1fVar.equals(a1f.h)) {
                int i3 = s01.i;
                final s01 o = hjg.o(this, duf.a.getOrCreateKotlinClass(a1f.class));
                final asf asfVar = new asf();
                View inflate = LayoutInflater.from(this).inflate(R.layout.netherlands_age_regulation_dialog, (ViewGroup) null, false);
                int i4 = R.id.age_18_to_24;
                if (((RadioButton) nq8.B(R.id.age_18_to_24, inflate)) != null) {
                    i4 = R.id.age_25_or_older;
                    if (((RadioButton) nq8.B(R.id.age_25_or_older, inflate)) != null) {
                        i4 = R.id.age_under_18;
                        if (((RadioButton) nq8.B(R.id.age_under_18, inflate)) != null) {
                            i4 = R.id.question;
                            if (((TextView) nq8.B(R.id.question, inflate)) != null) {
                                i4 = R.id.radioGroup;
                                RadioGroup radioGroup = (RadioGroup) nq8.B(R.id.radioGroup, inflate);
                                if (radioGroup != null) {
                                    i4 = R.id.title;
                                    if (((TextView) nq8.B(R.id.title, inflate)) != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                        ed edVar = new ed(constraintLayout, 17, radioGroup);
                                        vm vmVar = o.g;
                                        vmVar.g = constraintLayout;
                                        vmVar.h = false;
                                        radioGroup.setOnCheckedChangeListener(new in(o, i2));
                                        o.g(-1, getString(R.string.confirm_button), new jn(asfVar, edVar, this, o, 0));
                                        o.setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: zm
                                            public final /* synthetic */ BaseActivity b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.content.DialogInterface.OnShowListener
                                            public final void onShow(DialogInterface dialogInterface) {
                                                int i5 = i;
                                                s01 s01Var = o;
                                                BaseActivity baseActivity = this.b;
                                                switch (i5) {
                                                    case 0:
                                                        nv.l0(baseActivity, dv.POPUP_QUEUE, bv.APP_RATING, null);
                                                        s01Var.g.i.setEnabled(false);
                                                        break;
                                                    default:
                                                        nv.l0(baseActivity, dv.POPUP_QUEUE, bv.NETHERLANDS_LEGAL_AGE, null);
                                                        s01Var.g.i.setEnabled(false);
                                                        break;
                                                }
                                            }
                                        });
                                        o.show();
                                        o.setCancelable(false);
                                        o.setCanceledOnTouchOutside(false);
                                        o.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: bn
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                int i5 = i;
                                                asf asfVar2 = asfVar;
                                                switch (i5) {
                                                    case 0:
                                                        if (asfVar2.a) {
                                                            nv.k0(this, bv.APP_RATING, av.CLOSE, dv.POPUP_QUEUE, null, null, 32);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (!asfVar2.a) {
                                                            nv.k0(this, bv.NETHERLANDS_LEGAL_AGE, av.CLOSE, dv.POPUP_QUEUE, null, null, 32);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                return;
            }
            if (j1fVar.equals(z0f.h)) {
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.getClass();
                edit.putInt("ask_counter_v3", 0);
                edit.apply();
                int i5 = s01.i;
                final s01 o2 = hjg.o(this, duf.a.getOrCreateKotlinClass(z0f.class));
                final asf asfVar2 = new asf();
                asfVar2.a = true;
                View inflate2 = LayoutInflater.from(this).inflate(R.layout.dialog_rate, (ViewGroup) null, false);
                int i6 = R.id.info_text;
                TextView textView = (TextView) nq8.B(R.id.info_text, inflate2);
                if (textView != null) {
                    i6 = R.id.info_title;
                    TextView textView2 = (TextView) nq8.B(R.id.info_title, inflate2);
                    if (textView2 != null) {
                        i6 = R.id.rating_bar;
                        AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) nq8.B(R.id.rating_bar, inflate2);
                        if (appCompatRatingBar != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate2;
                            final ed edVar2 = new ed(constraintLayout2, textView, textView2, appCompatRatingBar);
                            textView2.setText(getString(R.string.review_title));
                            textView.setText(getString(R.string.review_subtitle));
                            vm vmVar2 = o2.g;
                            vmVar2.g = constraintLayout2;
                            vmVar2.h = false;
                            final SharedPreferences sharedPreferences2 = sharedPreferences;
                            o2.g(-1, getString(R.string.confirm_button), new DialogInterface.OnClickListener() { // from class: ym
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i7) {
                                    asf.this.a = false;
                                    bv bvVar = bv.APP_RATING;
                                    av avVar = av.CTA_CLICK;
                                    dv dvVar = dv.POPUP_QUEUE;
                                    hjg hjgVar = cv.b;
                                    AppCompatRatingBar appCompatRatingBar2 = (AppCompatRatingBar) edVar2.c;
                                    int progress = appCompatRatingBar2.getProgress();
                                    hjgVar.getClass();
                                    cv cvVar = null;
                                    if (progress != 0) {
                                        if (progress == 1) {
                                            cvVar = cv.APP_RATING_1;
                                        } else if (progress == 2) {
                                            cvVar = cv.APP_RATING_2;
                                        } else if (progress == 3) {
                                            cvVar = cv.APP_RATING_3;
                                        } else if (progress == 4) {
                                            cvVar = cv.APP_RATING_4;
                                        } else if (progress == 5) {
                                            cvVar = cv.APP_RATING_5;
                                        }
                                    }
                                    BaseActivity baseActivity = this;
                                    nv.k0(baseActivity, bvVar, avVar, dvVar, cvVar, null, 32);
                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    edit2.getClass();
                                    edit2.putBoolean("ask_review_v3", false);
                                    edit2.apply();
                                    if (appCompatRatingBar2.getProgress() == 5) {
                                        bea.G(baseActivity, "https://play.google.com/store/apps/details?id=com.sofascore.results");
                                    } else {
                                        Calendar calendar = ke0.a;
                                        ke0.f(R.string.rating, baseActivity);
                                    }
                                    o2.dismiss();
                                }
                            });
                            o2.setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: zm
                                public final /* synthetic */ BaseActivity b;

                                {
                                    this.b = this;
                                }

                                @Override // android.content.DialogInterface.OnShowListener
                                public final void onShow(DialogInterface dialogInterface) {
                                    int i52 = i2;
                                    s01 s01Var = o2;
                                    BaseActivity baseActivity = this.b;
                                    switch (i52) {
                                        case 0:
                                            nv.l0(baseActivity, dv.POPUP_QUEUE, bv.APP_RATING, null);
                                            s01Var.g.i.setEnabled(false);
                                            break;
                                        default:
                                            nv.l0(baseActivity, dv.POPUP_QUEUE, bv.NETHERLANDS_LEGAL_AGE, null);
                                            s01Var.g.i.setEnabled(false);
                                            break;
                                    }
                                }
                            });
                            appCompatRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: an
                                @Override // android.widget.RatingBar.OnRatingBarChangeListener
                                public final void onRatingChanged(RatingBar ratingBar, float f, boolean z2) {
                                    s01.this.g.i.setEnabled(ratingBar.getProgress() > 0);
                                }
                            });
                            o2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: bn
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    int i52 = i2;
                                    asf asfVar22 = asfVar2;
                                    switch (i52) {
                                        case 0:
                                            if (asfVar22.a) {
                                                nv.k0(this, bv.APP_RATING, av.CLOSE, dv.POPUP_QUEUE, null, null, 32);
                                                break;
                                            }
                                            break;
                                        default:
                                            if (!asfVar22.a) {
                                                nv.k0(this, bv.NETHERLANDS_LEGAL_AGE, av.CLOSE, dv.POPUP_QUEUE, null, null, 32);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            o2.show();
                            return;
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i6)));
                return;
            }
            if (j1fVar.equals(c1f.h)) {
                new RemoveAdsDialog().p(k(), "RemoveAdsDialog");
                return;
            }
            if (j1fVar instanceof y0f) {
                fp8 k = k();
                y0f y0fVar = (y0f) j1fVar;
                int i7 = y0fVar.h;
                qef qefVar = y0fVar.i;
                qefVar.getClass();
                ProposeFollowEntityDialog proposeFollowEntityDialog = new ProposeFollowEntityDialog();
                proposeFollowEntityDialog.setArguments(fz8.C(fz8.D(i7, "ID"), fz8.G("ENTITY_TYPE", qefVar)));
                proposeFollowEntityDialog.p(k, qefVar.name());
                return;
            }
            int i8 = 3;
            if (j1fVar instanceof x0f) {
                x0f x0fVar = (x0f) j1fVar;
                fv fvVar = x0fVar.h;
                bef befVar = x0fVar.i;
                PromotionModal promotionModal = new PromotionModal();
                promotionModal.setArguments(fz8.C(fz8.G("analytics_location", fvVar), fz8.G("promotional_offer", befVar)));
                BaseActivity baseActivity = this instanceof AppCompatActivity ? this : null;
                if (baseActivity != null) {
                    wca.x(baseActivity.getLifecycle()).b(new r1(promotionModal, baseActivity, rq3Var, i8));
                    return;
                }
                return;
            }
            if (j1fVar instanceof i1f) {
                WeeklyStatus weeklyStatus = ((i1f) j1fVar).h;
                PromotionDemotionBottomSheet promotionDemotionBottomSheet = new PromotionDemotionBottomSheet();
                promotionDemotionBottomSheet.setArguments(fz8.C(fz8.G("WEEKLY_STATUS", weeklyStatus)));
                BaseActivity baseActivity2 = this instanceof AppCompatActivity ? this : null;
                if (baseActivity2 != null) {
                    wca.x(baseActivity2.getLifecycle()).b(new r1(promotionDemotionBottomSheet, baseActivity2, rq3Var, i8));
                    return;
                }
                return;
            }
            if (j1fVar instanceof f1f) {
                f1f f1fVar = (f1f) j1fVar;
                final SurveyConfigData surveyConfigData = f1fVar.h;
                final boolean z2 = f1fVar.i;
                surveyConfigData.getClass();
                ia0 ia0Var = ia0.q;
                if (Intrinsics.c(ok3.p().e().getDataSharingOptOut(), Boolean.TRUE)) {
                    return;
                }
                int i9 = s01.i;
                s01 o3 = hjg.o(this, duf.a.getOrCreateKotlinClass(f1f.class));
                o3.setTitle(getString(R.string.survey_dialog_title));
                String string = getString(R.string.survey_dialog_subtitle);
                vm vmVar3 = o3.g;
                vmVar3.e = string;
                TextView textView3 = vmVar3.v;
                if (textView3 != null) {
                    textView3.setText(string);
                }
                o3.setCancelable(false);
                o3.g(-1, getString(R.string.yes), new DialogInterface.OnClickListener(this) { // from class: en
                    public final /* synthetic */ BaseActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        int i11 = i2;
                        int i12 = 20;
                        int i13 = 19;
                        boolean z3 = z2;
                        final SurveyConfigData surveyConfigData2 = surveyConfigData;
                        switch (i11) {
                            case 0:
                                int id = surveyConfigData2.getId();
                                BaseActivity baseActivity3 = this.b;
                                if (z3) {
                                    n9e.u(baseActivity3, new bvb(id, i13));
                                } else {
                                    n9e.u(baseActivity3, new bvb(id, i12));
                                }
                                nv.k0(baseActivity3, bv.SURVEY, av.CTA_CLICK, dv.POPUP_QUEUE, null, z3 ? Integer.valueOf(surveyConfigData2.getId()) : null, 16);
                                final int i14 = 0;
                                if (!z3) {
                                    String str = StringsKt.J(surveyConfigData2.getUrl(), "?", false) ? U3.j.c : "?";
                                    String url = surveyConfigData2.getUrl();
                                    Calendar calendar = ke0.a;
                                    String r = dmi.r(url, str, "uuid=", ke0.d(baseActivity3));
                                    if (!Intrinsics.c(surveyConfigData2.getOpenInBrowser(), Boolean.TRUE)) {
                                        p4h.w(baseActivity3, r);
                                        break;
                                    } else {
                                        bea.G(baseActivity3, r);
                                        break;
                                    }
                                } else if (!((Boolean) n9e.x(baseActivity3, new Function1() { // from class: nn
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i15 = i14;
                                        SurveyConfigData surveyConfigData3 = surveyConfigData2;
                                        switch (i15) {
                                            case 0:
                                                SharedPreferences sharedPreferences3 = (SharedPreferences) obj;
                                                sharedPreferences3.getClass();
                                                return Boolean.valueOf(sharedPreferences3.getBoolean("survey_" + surveyConfigData3.getId(), false));
                                            default:
                                                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                                                editor.getClass();
                                                editor.putBoolean("survey_" + surveyConfigData3.getId(), true);
                                                return Unit.a;
                                        }
                                    }
                                })).booleanValue()) {
                                    final int i15 = 1;
                                    n9e.u(baseActivity3, new Function1() { // from class: nn
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            int i152 = i15;
                                            SurveyConfigData surveyConfigData3 = surveyConfigData2;
                                            switch (i152) {
                                                case 0:
                                                    SharedPreferences sharedPreferences3 = (SharedPreferences) obj;
                                                    sharedPreferences3.getClass();
                                                    return Boolean.valueOf(sharedPreferences3.getBoolean("survey_" + surveyConfigData3.getId(), false));
                                                default:
                                                    SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                                                    editor.getClass();
                                                    editor.putBoolean("survey_" + surveyConfigData3.getId(), true);
                                                    return Unit.a;
                                            }
                                        }
                                    });
                                    int i16 = SurveyActivity.L;
                                    int id2 = surveyConfigData2.getId();
                                    Intent intent = new Intent(baseActivity3, (Class<?>) SurveyActivity.class);
                                    intent.putExtra("SURVEY_ID", id2);
                                    baseActivity3.startActivity(intent);
                                    break;
                                }
                                break;
                            default:
                                int id3 = surveyConfigData2.getId();
                                BaseActivity baseActivity4 = this.b;
                                if (z3) {
                                    n9e.u(baseActivity4, new bvb(id3, i13));
                                } else {
                                    n9e.u(baseActivity4, new bvb(id3, i12));
                                }
                                nv.k0(baseActivity4, bv.SURVEY, av.CLOSE, dv.POPUP_QUEUE, null, z3 ? Integer.valueOf(surveyConfigData2.getId()) : null, 16);
                                break;
                        }
                    }
                });
                o3.g(-2, getString(R.string.no), new DialogInterface.OnClickListener(this) { // from class: en
                    public final /* synthetic */ BaseActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        int i11 = i;
                        int i12 = 20;
                        int i13 = 19;
                        boolean z3 = z2;
                        final SurveyConfigData surveyConfigData2 = surveyConfigData;
                        switch (i11) {
                            case 0:
                                int id = surveyConfigData2.getId();
                                BaseActivity baseActivity3 = this.b;
                                if (z3) {
                                    n9e.u(baseActivity3, new bvb(id, i13));
                                } else {
                                    n9e.u(baseActivity3, new bvb(id, i12));
                                }
                                nv.k0(baseActivity3, bv.SURVEY, av.CTA_CLICK, dv.POPUP_QUEUE, null, z3 ? Integer.valueOf(surveyConfigData2.getId()) : null, 16);
                                final int i14 = 0;
                                if (!z3) {
                                    String str = StringsKt.J(surveyConfigData2.getUrl(), "?", false) ? U3.j.c : "?";
                                    String url = surveyConfigData2.getUrl();
                                    Calendar calendar = ke0.a;
                                    String r = dmi.r(url, str, "uuid=", ke0.d(baseActivity3));
                                    if (!Intrinsics.c(surveyConfigData2.getOpenInBrowser(), Boolean.TRUE)) {
                                        p4h.w(baseActivity3, r);
                                        break;
                                    } else {
                                        bea.G(baseActivity3, r);
                                        break;
                                    }
                                } else if (!((Boolean) n9e.x(baseActivity3, new Function1() { // from class: nn
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i152 = i14;
                                        SurveyConfigData surveyConfigData3 = surveyConfigData2;
                                        switch (i152) {
                                            case 0:
                                                SharedPreferences sharedPreferences3 = (SharedPreferences) obj;
                                                sharedPreferences3.getClass();
                                                return Boolean.valueOf(sharedPreferences3.getBoolean("survey_" + surveyConfigData3.getId(), false));
                                            default:
                                                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                                                editor.getClass();
                                                editor.putBoolean("survey_" + surveyConfigData3.getId(), true);
                                                return Unit.a;
                                        }
                                    }
                                })).booleanValue()) {
                                    final int i15 = 1;
                                    n9e.u(baseActivity3, new Function1() { // from class: nn
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            int i152 = i15;
                                            SurveyConfigData surveyConfigData3 = surveyConfigData2;
                                            switch (i152) {
                                                case 0:
                                                    SharedPreferences sharedPreferences3 = (SharedPreferences) obj;
                                                    sharedPreferences3.getClass();
                                                    return Boolean.valueOf(sharedPreferences3.getBoolean("survey_" + surveyConfigData3.getId(), false));
                                                default:
                                                    SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                                                    editor.getClass();
                                                    editor.putBoolean("survey_" + surveyConfigData3.getId(), true);
                                                    return Unit.a;
                                            }
                                        }
                                    });
                                    int i16 = SurveyActivity.L;
                                    int id2 = surveyConfigData2.getId();
                                    Intent intent = new Intent(baseActivity3, (Class<?>) SurveyActivity.class);
                                    intent.putExtra("SURVEY_ID", id2);
                                    baseActivity3.startActivity(intent);
                                    break;
                                }
                                break;
                            default:
                                int id3 = surveyConfigData2.getId();
                                BaseActivity baseActivity4 = this.b;
                                if (z3) {
                                    n9e.u(baseActivity4, new bvb(id3, i13));
                                } else {
                                    n9e.u(baseActivity4, new bvb(id3, i12));
                                }
                                nv.k0(baseActivity4, bv.SURVEY, av.CLOSE, dv.POPUP_QUEUE, null, z3 ? Integer.valueOf(surveyConfigData2.getId()) : null, 16);
                                break;
                        }
                    }
                });
                o3.g(-3, getString(R.string.survey_snooze), new DialogInterface.OnClickListener() { // from class: fn
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        n9e.u(BaseActivity.this, new c31(z2, 13));
                    }
                });
                o3.setOnShowListener(new DialogInterface.OnShowListener() { // from class: gn
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        nv.l0(BaseActivity.this, dv.POPUP_QUEUE, bv.SURVEY, z2 ? Integer.valueOf(surveyConfigData.getId()) : null);
                    }
                });
                o3.show();
                return;
            }
            if (j1fVar.equals(e1f.h)) {
                SofascoreAnalystWorldCupOfferBottomSheet sofascoreAnalystWorldCupOfferBottomSheet = new SofascoreAnalystWorldCupOfferBottomSheet();
                BaseActivity baseActivity3 = this instanceof AppCompatActivity ? this : null;
                if (baseActivity3 != null) {
                    wca.x(baseActivity3.getLifecycle()).b(new r1(sofascoreAnalystWorldCupOfferBottomSheet, baseActivity3, rq3Var, i8));
                    return;
                }
                return;
            }
            if (j1fVar.equals(v0f.h)) {
                MatchOfTheWeekBottomSheet matchOfTheWeekBottomSheet = new MatchOfTheWeekBottomSheet();
                BaseActivity baseActivity4 = this instanceof AppCompatActivity ? this : null;
                if (baseActivity4 != null) {
                    wca.x(baseActivity4.getLifecycle()).b(new r1(matchOfTheWeekBottomSheet, baseActivity4, rq3Var, i8));
                    return;
                }
                return;
            }
            if (j1fVar instanceof w0f) {
                PartnerOfferType partnerOfferType = ((w0f) j1fVar).h;
                partnerOfferType.getClass();
                MatchOfTheWeekBottomSheet matchOfTheWeekBottomSheet2 = new MatchOfTheWeekBottomSheet();
                Bundle bundle = new Bundle();
                bundle.putString("DEV_MOCK_OFFER_TYPE", partnerOfferType.getValue());
                matchOfTheWeekBottomSheet2.setArguments(bundle);
                BaseActivity baseActivity5 = this instanceof AppCompatActivity ? this : null;
                if (baseActivity5 != null) {
                    wca.x(baseActivity5.getLifecycle()).b(new r1(matchOfTheWeekBottomSheet2, baseActivity5, rq3Var, i8));
                    return;
                }
                return;
            }
            if (j1fVar instanceof g1f) {
                guh guhVar = guh.f;
                int i10 = ((g1f) j1fVar).h;
                SofascoreAnalystTennisPromoBottomSheet sofascoreAnalystTennisPromoBottomSheet = new SofascoreAnalystTennisPromoBottomSheet();
                Bundle bundle2 = new Bundle();
                bundle2.putString("ARG_VARIANT", "SUBSCRIBED");
                bundle2.putInt("ARG_EVENT_ID", i10);
                sofascoreAnalystTennisPromoBottomSheet.setArguments(bundle2);
                BaseActivity baseActivity6 = this instanceof AppCompatActivity ? this : null;
                if (baseActivity6 != null) {
                    wca.x(baseActivity6.getLifecycle()).b(new r1(sofascoreAnalystTennisPromoBottomSheet, baseActivity6, rq3Var, i8));
                    return;
                }
                return;
            }
            if (!(j1fVar instanceof h1f)) {
                if (!j1fVar.equals(d1f.h)) {
                    zzl.b();
                    return;
                }
                RemoveAdsYearlyOfferBottomSheet removeAdsYearlyOfferBottomSheet = new RemoveAdsYearlyOfferBottomSheet();
                BaseActivity baseActivity7 = this instanceof AppCompatActivity ? this : null;
                if (baseActivity7 != null) {
                    wca.x(baseActivity7.getLifecycle()).b(new r1(removeAdsYearlyOfferBottomSheet, baseActivity7, rq3Var, i8));
                    return;
                }
                return;
            }
            guh guhVar2 = guh.f;
            int i11 = ((h1f) j1fVar).h;
            SofascoreAnalystTennisPromoBottomSheet sofascoreAnalystTennisPromoBottomSheet2 = new SofascoreAnalystTennisPromoBottomSheet();
            Bundle bundle3 = new Bundle();
            bundle3.putString("ARG_VARIANT", "UNSUBSCRIBED");
            bundle3.putInt("ARG_EVENT_ID", i11);
            sofascoreAnalystTennisPromoBottomSheet2.setArguments(bundle3);
            BaseActivity baseActivity8 = this instanceof AppCompatActivity ? this : null;
            if (baseActivity8 != null) {
                wca.x(baseActivity8.getLifecycle()).b(new r1(sofascoreAnalystTennisPromoBottomSheet2, baseActivity8, rq3Var, i8));
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int s;
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        t();
        UnderlinedToolbar underlinedToolbar = this.q;
        if (underlinedToolbar != null) {
            TypedValue typedValue = new TypedValue();
            ViewGroup.LayoutParams layoutParams = underlinedToolbar.getLayoutParams();
            if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
                s = TypedValue.complexToDimensionPixelSize(typedValue.data, underlinedToolbar.getResources().getDisplayMetrics());
            } else {
                Context context = underlinedToolbar.getContext();
                context.getClass();
                s = ao2.s(48, context);
            }
            layoutParams.height = s;
        }
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().getDecorView();
        super.onCreate(bundle);
        rq3 rq3Var = null;
        if (Build.VERSION.SDK_INT < 33) {
            List list = dla.a;
            dla.e = null;
        }
        yea yeaVar = j58.a;
        if (fn0.B("in_app_message")) {
            Context applicationContext = getApplicationContext();
            String u = u();
            v38 w = w();
            g01 g01Var = new g01(applicationContext, u);
            HashMap hashMap = w.b.e;
            py4 py4Var = new py4();
            py4Var.r = g01Var;
            hashMap.put(g01Var, py4Var);
            v38 w2 = w();
            g01 g01Var2 = new g01(applicationContext, u);
            HashMap hashMap2 = w2.b.b;
            oy4 oy4Var = new oy4();
            oy4Var.r = g01Var2;
            hashMap2.put(g01Var2, oy4Var);
        }
        int i = 0;
        this.t.setValue(this, H[0], Boolean.valueOf(hkg.b0(this)));
        k6b x = wca.x(getLifecycle());
        hs4 hs4Var = z45.a;
        xw3.L(x, rob.a, null, new q3(this, rq3Var, 5), 2);
        if (!(this instanceof MainActivity)) {
            LinkedList linkedList = ke0.n;
            if (linkedList.size() >= 5) {
                ((Activity) linkedList.remove()).finish();
            }
            linkedList.add(this);
        }
        int i2 = 1;
        if (bundle != null) {
            List f = k().c.f();
            f.getClass();
            ArrayList W = CollectionsKt.W(f);
            if (!W.isEmpty()) {
                a aVar = new a(k());
                aVar.r = true;
                Iterator it = W.iterator();
                while (it.hasNext()) {
                    aVar.k((Fragment) it.next());
                }
                if (aVar.i) {
                    a70.r("This transaction is already being added to the back stack");
                    return;
                } else {
                    aVar.j = false;
                    aVar.t.A(aVar, true);
                }
            }
        }
        ((ebd) this.A.getValue()).b.e(this, new z1(1, new h01(this, i)));
        z().d.e(this, new z1(1, new h01(this, i2)));
        e6b e6bVar = e6b.a;
        LinkedHashMap linkedHashMap = qv5.b;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(j42.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(getLifecycle()), null, null, new n01(this, (b1d) obj, null, this, 0), 3);
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(w42.class);
        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
        if (obj2 == null) {
            obj2 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass2, obj2);
        }
        xw3.L(wca.x(getLifecycle()), null, null, new n01(this, (b1d) obj2, null, this, 1), 3);
        e6b e6bVar2 = e6b.a;
        KClass orCreateKotlinClass3 = fufVar.getOrCreateKotlinClass(h42.class);
        Object obj3 = linkedHashMap.get(orCreateKotlinClass3);
        if (obj3 == null) {
            obj3 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass3, obj3);
        }
        xw3.L(wca.x(getLifecycle()), null, null, new n01(this, (b1d) obj3, null, this, 2), 3);
        KClass orCreateKotlinClass4 = fufVar.getOrCreateKotlinClass(i52.class);
        Object obj4 = linkedHashMap.get(orCreateKotlinClass4);
        if (obj4 == null) {
            obj4 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass4, obj4);
        }
        xw3.L(wca.x(getLifecycle()), null, null, new n01(this, (b1d) obj4, null, this, 3), 3);
    }

    @Override // com.sofascore.results.base.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Calendar calendar = ke0.a;
        ke0.n.remove(this);
        w().a();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        return i == 82 || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4) {
            return super.onKeyLongPress(i, keyEvent);
        }
        f8h.z(this, null, 6);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getOnBackPressedDispatcher().c();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (k().c.f().isEmpty() && getM()) {
            nv.U(this, getL(), System.currentTimeMillis() - this.u, this.x);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        boolean c0;
        AdBannerView adBannerView;
        super.onResume();
        this.u = System.currentTimeMillis();
        t();
        if (this.D && (adBannerView = this.E) != null) {
            I(adBannerView, this.F);
        }
        w3a.Q(this);
        yea yeaVar = j58.a;
        if (fn0.B("remove_ads_yearly_offer")) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences = a5f.d(applicationContext);
                    uic.j = sharedPreferences;
                }
                sharedPreferences.getClass();
            }
            long j = sharedPreferences.getLong("PREF_FIRST_RUN_TIMESTAMP", 0L);
            c0 = false;
            if (j > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = (currentTimeMillis - j) / 86400000;
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences2 = a5f.d(applicationContext2);
                        uic.j = sharedPreferences2;
                    }
                    sharedPreferences2.getClass();
                }
                long j3 = sharedPreferences2.getLong("PREF_REMOVE_ADS_YEARLY_OFFER_LAST_SHOWN_TIMESTAMP", 0L);
                if (j2 >= 3 && (j2 >= 7 ? !(j2 >= 30 ? j3 >= j + 2592000000L && currentTimeMillis - j3 < 2592000000L : j3 >= j + 604800000) : j3 < j + 259200000)) {
                    c0 = true;
                }
            }
        } else {
            c0 = z8e.c0(this, this.s);
        }
        if (jca.G(D()) && c0) {
            SharedPreferences sharedPreferences3 = uic.j;
            if (sharedPreferences3 == null) {
                Context applicationContext3 = getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences3 = a5f.d(applicationContext3);
                    uic.j = sharedPreferences3;
                }
                sharedPreferences3.getClass();
            }
            if (sharedPreferences3.getBoolean("IN_APP_PURCHASE_AVAILABLE", true)) {
                if (!fn0.B("remove_ads_yearly_offer")) {
                    z().a(c1f.h);
                    return;
                } else {
                    if (ke0.l) {
                        return;
                    }
                    z().a(d1f.h);
                    return;
                }
            }
        }
        z8e.W(this);
        BlazeIMA.INSTANCE.disableAds();
        BlazeGAM blazeGAM = BlazeGAM.INSTANCE;
        blazeGAM.disableBannerAds();
        blazeGAM.disableCustomNativeAds();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        dd ddVar;
        FrameLayout frameLayout;
        super.onStart();
        s38.a().b(y());
        String str = ke0.j;
        this.p = str;
        int i = 0;
        if (str != null && (ddVar = this.n) != null && (frameLayout = (FrameLayout) ddVar.b) != null) {
            frameLayout.setVisibility(0);
        }
        if (this instanceof MainActivity) {
            SharedPreferences A = A();
            int i2 = Build.VERSION.SDK_INT;
            int i3 = A.getInt("PREF_OS", i2);
            if (i2 >= 28 && i3 < 28) {
                xw3.L(wca.x(getLifecycle()), null, null, new p01((MainActivity) this, null, i), 3);
            }
            SharedPreferences.Editor edit = A().edit();
            edit.getClass();
            edit.putInt("PREF_OS", i2);
            edit.apply();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@Nullable View view) {
        super.setContentView(view);
        int i = 0;
        if (getL() && view != null) {
            i01 i01Var = new i01(i, view);
            WeakHashMap weakHashMap = bsk.a;
            srk.c(view, i01Var);
        }
        z().b(this, false);
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        charSequence.getClass();
        if (this.r == null) {
            G();
        }
        TextView textView = this.r;
        if (textView != null) {
            textView.setText(charSequence);
            return;
        }
        UnderlinedToolbar underlinedToolbar = this.q;
        if (underlinedToolbar != null) {
            underlinedToolbar.setTitle(charSequence);
        }
    }

    public final void t() {
        KProperty[] kPropertyArr = H;
        KProperty kProperty = kPropertyArr[0];
        qed qedVar = this.t;
        if (((Boolean) qedVar.getValue(this, kProperty)).booleanValue() != hkg.b0(this)) {
            qedVar.setValue(this, kPropertyArr[0], Boolean.valueOf(hkg.b0(this)));
            recreate();
        }
    }

    public abstract String u();

    /* renamed from: v, reason: from getter */
    public boolean getL() {
        return this.l;
    }

    public final v38 w() {
        return (v38) this.y.getValue();
    }

    /* renamed from: x */
    public boolean getN() {
        return false;
    }

    public String y() {
        return getClass().getSimpleName();
    }

    public final p1f z() {
        p1f p1fVar = this.B;
        if (p1fVar != null) {
            return p1fVar;
        }
        Intrinsics.i("popUpManager");
        throw null;
    }

    @Override // android.app.Activity
    public final void setTitle(int i) {
        if (this.r == null) {
            G();
        }
        TextView textView = this.r;
        if (textView != null) {
            textView.setText(getString(i));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        setContentView(getLayoutInflater().inflate(i, (ViewGroup) null, false));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        int i = 0;
        if (getL() && view != null) {
            i01 i01Var = new i01(i, view);
            WeakHashMap weakHashMap = bsk.a;
            srk.c(view, i01Var);
        }
        z().b(this, false);
    }
}
