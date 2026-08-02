package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.dialog.FollowSubStagesViewModel;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.featureWalkthrough.FeatureWalkthroughFullScreenDialog;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.pots.mostAwards.bottomSheet.POTSPlayerAwardsBottomSheet;
import com.sofascore.results.team.TeamActivity;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gi(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        final int i = 0;
        final int i2 = 1;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                boh bohVar = (boh) this.b;
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    ((znh) this.d).i(((eld) this.c).b.size());
                }
                return Unit.a;
            case 1:
                long currentTimeMillis2 = System.currentTimeMillis();
                boh bohVar2 = (boh) this.b;
                if (currentTimeMillis2 - bohVar2.h() >= 200) {
                    bohVar2.i(currentTimeMillis2);
                    int i3 = PlayerActivity.Z;
                    jle.q((Context) this.c, ((sk1) this.d).a, 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                }
                return Unit.a;
            case 2:
                long currentTimeMillis3 = System.currentTimeMillis();
                boh bohVar3 = (boh) this.b;
                if (currentTimeMillis3 - bohVar3.h() >= 200) {
                    bohVar3.i(currentTimeMillis3);
                    ((Function1) this.c).invoke((t83) this.d);
                }
                return Unit.a;
            case 3:
                Context context = (Context) this.d;
                long currentTimeMillis4 = System.currentTimeMillis();
                boh bohVar4 = (boh) this.b;
                if (currentTimeMillis4 - bohVar4.h() >= 200) {
                    bohVar4.i(currentTimeMillis4);
                    i83 i83Var = ((b83) this.c).d;
                    if (i83Var != null) {
                        f7a.w(context, i83Var.a.b(context), i83Var.b.b(context), i83Var.c, null);
                    }
                }
                return Unit.a;
            case 4:
                ((Function1) this.b).invoke(Integer.valueOf(((is3) ((unb) ((vnb) this.c)).a).c.indexOf((kfk) this.d)));
                return Unit.a;
            case 5:
                long currentTimeMillis5 = System.currentTimeMillis();
                boh bohVar5 = (boh) this.b;
                if (currentTimeMillis5 - bohVar5.h() >= 200) {
                    bohVar5.i(currentTimeMillis5);
                    nv.z0((Context) this.c, kv.CLICK, "unlock_AI_insights", "ai_insights");
                    ((Function0) this.d).invoke();
                }
                return Unit.a;
            case 6:
                long currentTimeMillis6 = System.currentTimeMillis();
                boh bohVar6 = (boh) this.b;
                if (currentTimeMillis6 - bohVar6.h() >= 200) {
                    bohVar6.i(currentTimeMillis6);
                    ((Function1) this.c).invoke(Integer.valueOf(((skc) this.d).a));
                }
                return Unit.a;
            case 7:
                long currentTimeMillis7 = System.currentTimeMillis();
                boh bohVar7 = (boh) this.b;
                if (currentTimeMillis7 - bohVar7.h() >= 200) {
                    bohVar7.i(currentTimeMillis7);
                    ((Function2) this.c).invoke(Integer.valueOf(((ku5) this.d).a), Boolean.FALSE);
                }
                return Unit.a;
            case 8:
                long currentTimeMillis8 = System.currentTimeMillis();
                boh bohVar8 = (boh) this.b;
                if (currentTimeMillis8 - bohVar8.h() >= 200) {
                    bohVar8.i(currentTimeMillis8);
                    ((e1d) this.d).setValue(Boolean.TRUE);
                    ((Function0) this.c).invoke();
                }
                return Unit.a;
            case 9:
                long currentTimeMillis9 = System.currentTimeMillis();
                boh bohVar9 = (boh) this.b;
                if (currentTimeMillis9 - bohVar9.h() >= 200) {
                    bohVar9.i(currentTimeMillis9);
                    ((znh) this.d).i(((mte) this.c).a);
                }
                return Unit.a;
            case 10:
                int i4 = ((j67) this.b).a;
                fo1 fo1Var = (fo1) this.c;
                return new q27(i4, fo1Var != null ? Integer.valueOf(fo1Var.a) : null, ((e37) this.d).e);
            case 11:
                long currentTimeMillis10 = System.currentTimeMillis();
                boh bohVar10 = (boh) this.b;
                if (currentTimeMillis10 - bohVar10.h() >= 200) {
                    bohVar10.i(currentTimeMillis10);
                    Function1 function1 = (Function1) this.c;
                    if (function1 != null) {
                        function1.invoke(((bd7) this.d).a);
                    }
                }
                return Unit.a;
            case 12:
                long currentTimeMillis11 = System.currentTimeMillis();
                boh bohVar11 = (boh) this.b;
                if (currentTimeMillis11 - bohVar11.h() >= 200) {
                    bohVar11.i(currentTimeMillis11);
                    ((Function1) this.c).invoke(Integer.valueOf(((FollowSubStagesViewModel.SubStageInfo) this.d).a));
                }
                return Unit.a;
            case 13:
                long currentTimeMillis12 = System.currentTimeMillis();
                boh bohVar12 = (boh) this.b;
                if (currentTimeMillis12 - bohVar12.h() >= 200) {
                    bohVar12.i(currentTimeMillis12);
                    int i5 = TeamActivity.Z;
                    jle.r((Context) this.c, ((Team) this.d).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                return Unit.a;
            case 14:
                long currentTimeMillis13 = System.currentTimeMillis();
                boh bohVar13 = (boh) this.b;
                if (currentTimeMillis13 - bohVar13.h() >= 200) {
                    bohVar13.i(currentTimeMillis13);
                    ((Function1) this.c).invoke((bfc) this.d);
                }
                return Unit.a;
            case 15:
                long currentTimeMillis14 = System.currentTimeMillis();
                boh bohVar14 = (boh) this.b;
                if (currentTimeMillis14 - bohVar14.h() >= 200) {
                    bohVar14.i(currentTimeMillis14);
                    int i6 = PlayerActivity.Z;
                    jle.q((Context) this.c, ((jrj) this.d).a, 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                }
                return Unit.a;
            case 16:
                long currentTimeMillis15 = System.currentTimeMillis();
                boh bohVar15 = (boh) this.b;
                if (currentTimeMillis15 - bohVar15.h() >= 200) {
                    bohVar15.i(currentTimeMillis15);
                    ((znh) this.d).i(((jrj) this.c).a);
                }
                return Unit.a;
            case 17:
                long currentTimeMillis16 = System.currentTimeMillis();
                boh bohVar16 = (boh) this.b;
                if (currentTimeMillis16 - bohVar16.h() >= 200) {
                    bohVar16.i(currentTimeMillis16);
                    wxf wxfVar = EventActivity.h0;
                    wxf.B((Context) this.c, ((ec9) this.d).b.a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                return Unit.a;
            case 18:
                long currentTimeMillis17 = System.currentTimeMillis();
                boh bohVar17 = (boh) this.b;
                if (currentTimeMillis17 - bohVar17.h() >= 200) {
                    bohVar17.i(currentTimeMillis17);
                    ((Function1) this.c).invoke((mjb) this.d);
                }
                return Unit.a;
            case 19:
                long currentTimeMillis18 = System.currentTimeMillis();
                boh bohVar18 = (boh) this.b;
                if (currentTimeMillis18 - bohVar18.h() >= 200) {
                    bohVar18.i(currentTimeMillis18);
                    final Context context2 = (Context) this.c;
                    Gender gender = (Gender) this.d;
                    final AlertDialog h = lnb.h(R.style.RedesignDialog, context2);
                    View inflate = LayoutInflater.from(context2).inflate(R.layout.dialog_player_rating, (ViewGroup) null, false);
                    int i7 = R.id.body_1;
                    TextView textView = (TextView) nq8.B(R.id.body_1, inflate);
                    if (textView != null) {
                        i7 = R.id.body_2;
                        TextView textView2 = (TextView) nq8.B(R.id.body_2, inflate);
                        if (textView2 != null) {
                            i7 = R.id.button_close;
                            TextView textView3 = (TextView) nq8.B(R.id.button_close, inflate);
                            if (textView3 != null) {
                                i7 = R.id.button_learn_more;
                                MaterialButton materialButton = (MaterialButton) nq8.B(R.id.button_learn_more, inflate);
                                if (materialButton != null) {
                                    i7 = R.id.category_1;
                                    if (((TextView) nq8.B(R.id.category_1, inflate)) != null) {
                                        i7 = R.id.category_2;
                                        if (((TextView) nq8.B(R.id.category_2, inflate)) != null) {
                                            i7 = R.id.category_3;
                                            if (((TextView) nq8.B(R.id.category_3, inflate)) != null) {
                                                i7 = R.id.category_4;
                                                if (((TextView) nq8.B(R.id.category_4, inflate)) != null) {
                                                    i7 = R.id.category_5;
                                                    if (((TextView) nq8.B(R.id.category_5, inflate)) != null) {
                                                        i7 = R.id.info_graphic;
                                                        if (((ImageView) nq8.B(R.id.info_graphic, inflate)) != null) {
                                                            i7 = R.id.title;
                                                            if (((TextView) nq8.B(R.id.title, inflate)) != null) {
                                                                textView.setText(hkg.Q(context2, R.string.football_rating_explained_body_1, gender, new Object[0]));
                                                                textView2.setText(hkg.Q(context2, R.string.football_rating_explained_body_2, gender, new Object[0]));
                                                                textView3.setOnClickListener(new View.OnClickListener() { // from class: ao
                                                                    @Override // android.view.View.OnClickListener
                                                                    public final void onClick(View view) {
                                                                        int i8 = i;
                                                                        AlertDialog alertDialog = h;
                                                                        switch (i8) {
                                                                            case 0:
                                                                                nv.k0(context2, bv.RATING_BREAKDOWN, av.CLOSE, dv.OTHER, null, null, 48);
                                                                                alertDialog.dismiss();
                                                                                break;
                                                                            default:
                                                                                bv bvVar = bv.RATING_BREAKDOWN;
                                                                                av avVar = av.CTA_CLICK;
                                                                                dv dvVar = dv.OTHER;
                                                                                Context context3 = context2;
                                                                                nv.k0(context3, bvVar, avVar, dvVar, null, null, 48);
                                                                                ut7 ut7Var = ut7.a;
                                                                                FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = new FeatureWalkthroughFullScreenDialog();
                                                                                featureWalkthroughFullScreenDialog.setArguments(hz8.E(new Pair("TYPE", ut7.e)));
                                                                                FragmentActivity K = hkg.K(context3);
                                                                                if (K != null) {
                                                                                    featureWalkthroughFullScreenDialog.p(K.k(), "FeatureWalkthroughFullScreenDialog");
                                                                                    alertDialog.dismiss();
                                                                                    break;
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                });
                                                                materialButton.setOnClickListener(new View.OnClickListener() { // from class: ao
                                                                    @Override // android.view.View.OnClickListener
                                                                    public final void onClick(View view) {
                                                                        int i8 = i2;
                                                                        AlertDialog alertDialog = h;
                                                                        switch (i8) {
                                                                            case 0:
                                                                                nv.k0(context2, bv.RATING_BREAKDOWN, av.CLOSE, dv.OTHER, null, null, 48);
                                                                                alertDialog.dismiss();
                                                                                break;
                                                                            default:
                                                                                bv bvVar = bv.RATING_BREAKDOWN;
                                                                                av avVar = av.CTA_CLICK;
                                                                                dv dvVar = dv.OTHER;
                                                                                Context context3 = context2;
                                                                                nv.k0(context3, bvVar, avVar, dvVar, null, null, 48);
                                                                                ut7 ut7Var = ut7.a;
                                                                                FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = new FeatureWalkthroughFullScreenDialog();
                                                                                featureWalkthroughFullScreenDialog.setArguments(hz8.E(new Pair("TYPE", ut7.e)));
                                                                                FragmentActivity K = hkg.K(context3);
                                                                                if (K != null) {
                                                                                    featureWalkthroughFullScreenDialog.p(K.k(), "FeatureWalkthroughFullScreenDialog");
                                                                                    alertDialog.dismiss();
                                                                                    break;
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                });
                                                                h.setOnShowListener(new zn(context2, 1));
                                                                h.setView((ConstraintLayout) inflate);
                                                                h.show();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                    return null;
                }
                return Unit.a;
            case 20:
                long currentTimeMillis19 = System.currentTimeMillis();
                boh bohVar19 = (boh) this.b;
                if (currentTimeMillis19 - bohVar19.h() >= 200) {
                    bohVar19.i(currentTimeMillis19);
                    Context context3 = (Context) this.c;
                    d2e d2eVar = (d2e) this.d;
                    int i8 = d2eVar.a;
                    String str = d2eVar.b;
                    str.getClass();
                    POTSPlayerAwardsBottomSheet pOTSPlayerAwardsBottomSheet = new POTSPlayerAwardsBottomSheet();
                    pOTSPlayerAwardsBottomSheet.setArguments(fz8.C(fz8.D(i8, "PLAYER_ID"), fz8.H("PLAYER_NAME", str)));
                    context3.getClass();
                    if (context3 instanceof csk) {
                        context3 = ((csk) context3).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = context3 instanceof AppCompatActivity ? (AppCompatActivity) context3 : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(pOTSPlayerAwardsBottomSheet, appCompatActivity, objArr == true ? 1 : 0, 3));
                    }
                }
                return Unit.a;
            case 21:
                long currentTimeMillis20 = System.currentTimeMillis();
                if (currentTimeMillis20 - ((boh) this.b).h() >= 200) {
                    ((boh) this.b).i(currentTimeMillis20);
                    ((e1d) this.d).setValue(Boolean.FALSE);
                    Context context4 = (Context) this.c;
                    context4.getClass();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context4.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences = a5f.d(applicationContext);
                            uic.j = sharedPreferences;
                        }
                        sharedPreferences.getClass();
                    }
                    SharedPreferences.Editor i9 = dmi.i(sharedPreferences, "POTSMostAwardsShowDisclaimer", false);
                    Unit unit = Unit.a;
                    i9.apply();
                }
                return Unit.a;
            case 22:
                long currentTimeMillis21 = System.currentTimeMillis();
                boh bohVar20 = (boh) this.b;
                if (currentTimeMillis21 - bohVar20.h() >= 200) {
                    bohVar20.i(currentTimeMillis21);
                    int i10 = PlayerActivity.Z;
                    Context context5 = (Context) this.c;
                    z2e z2eVar = (z2e) this.d;
                    jle.q(context5, z2eVar.a, z2eVar.g, Integer.valueOf(z2eVar.c), zxe.d, false, null, null, 480);
                }
                return Unit.a;
            case 23:
                long currentTimeMillis22 = System.currentTimeMillis();
                boh bohVar21 = (boh) this.b;
                if (currentTimeMillis22 - bohVar21.h() >= 200) {
                    bohVar21.i(currentTimeMillis22);
                    Integer num = (Integer) this.c;
                    if (num != null) {
                        int intValue = num.intValue();
                        int i11 = TeamActivity.Z;
                        jle.r((Context) this.d, intValue, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    }
                }
                return Unit.a;
            case 24:
                long currentTimeMillis23 = System.currentTimeMillis();
                boh bohVar22 = (boh) this.b;
                if (currentTimeMillis23 - bohVar22.h() >= 200) {
                    bohVar22.i(currentTimeMillis23);
                    ((Function1) this.c).invoke((w3f) this.d);
                }
                return Unit.a;
            case 25:
                long currentTimeMillis24 = System.currentTimeMillis();
                boh bohVar23 = (boh) this.b;
                if (currentTimeMillis24 - bohVar23.h() >= 200) {
                    bohVar23.i(currentTimeMillis24);
                    wxf wxfVar2 = EventActivity.h0;
                    wxf.B((Context) this.c, ((ypf) this.d).a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                return Unit.a;
            case 26:
                dqf dqfVar = (dqf) this.d;
                long currentTimeMillis25 = System.currentTimeMillis();
                boh bohVar24 = (boh) this.b;
                if (currentTimeMillis25 - bohVar24.h() >= 200) {
                    bohVar24.i(currentTimeMillis25);
                    a99.A(LeagueActivity.h0, (Context) this.c, dqfVar.b, Integer.valueOf(dqfVar.a), dqfVar.c, null, null, null, 4080);
                }
                return Unit.a;
            case 27:
                long currentTimeMillis26 = System.currentTimeMillis();
                boh bohVar25 = (boh) this.b;
                if (currentTimeMillis26 - bohVar25.h() >= 200) {
                    bohVar25.i(currentTimeMillis26);
                    ((e1d) this.d).setValue("");
                    w1a.E((scj) this.c, "");
                }
                return Unit.a;
            case 28:
                long currentTimeMillis27 = System.currentTimeMillis();
                boh bohVar26 = (boh) this.b;
                if (currentTimeMillis27 - bohVar26.h() >= 200) {
                    bohVar26.i(currentTimeMillis27);
                    ((kie) ((z69) this.c)).a(1);
                    Function0 function0 = (Function0) this.d;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                return Unit.a;
            default:
                long currentTimeMillis28 = System.currentTimeMillis();
                boh bohVar27 = (boh) this.b;
                if (currentTimeMillis28 - bohVar27.h() >= 200) {
                    bohVar27.i(currentTimeMillis28);
                    ((kie) ((z69) this.c)).a(1);
                    ((Function1) this.d).invoke("");
                }
                return Unit.a;
        }
    }
}
