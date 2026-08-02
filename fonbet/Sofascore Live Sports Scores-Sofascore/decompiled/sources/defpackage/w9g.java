package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.equativ.displaysdk.adadapter.SASMediationBannerAdapterWrapper;
import com.equativ.displaysdk.adadapter.SASMediationInterstitialAdapterWrapper;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.newNetwork.Question;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.Survey;
import com.sofascore.model.newNetwork.SurveyAnswer;
import com.sofascore.model.newNetwork.SurveyAnswersPost;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import com.sofascore.results.R;
import com.sofascore.results.event.aiInsights.SofascoreAnalystTennisPromoBottomSheet;
import com.sofascore.results.helper.SofaBackupAgent;
import com.sofascore.results.main.matches.StageSeriesFragment;
import com.sofascore.results.service.SyncWorker;
import com.sofascore.results.settings.SettingsFragment;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w9g extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9g(Object obj, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = obj;
        this.s = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                return new w9g((qa3) obj2, rq3Var, 0);
            case 1:
                return new w9g((beg) obj2, rq3Var, 1);
            case 2:
                return new w9g((SASMediationBannerAdapterWrapper) obj2, rq3Var, 2);
            case 3:
                return new w9g((SASMediationInterstitialAdapterWrapper) obj2, rq3Var, 3);
            case 4:
                return new w9g((xeg) obj2, this.s, rq3Var, 4);
            case 5:
                return new w9g((g62) obj2, rq3Var, 5);
            case 6:
                return new w9g((ahg) obj2, this.s, rq3Var, 6);
            case 7:
                return new w9g((pig) obj2, this.s, rq3Var, 7);
            case 8:
                return new w9g((bxg) obj2, rq3Var, 8);
            case 9:
                return new w9g((o0h) obj2, rq3Var, 9);
            case 10:
                return new w9g((SettingsFragment) obj2, rq3Var, 10);
            case 11:
                return new w9g((scj) obj2, rq3Var, 11);
            case 12:
                return new w9g((SofaBackupAgent) obj2, rq3Var, 12);
            case 13:
                return new w9g((SofaSeasonActivity) obj2, rq3Var, 13);
            case 14:
                return new w9g((SofascoreAnalystTennisPromoBottomSheet) obj2, rq3Var, 14);
            case 15:
                return new w9g((vuh) obj2, rq3Var, 15);
            case 16:
                return new w9g((g4i) obj2, rq3Var, 16);
            case 17:
                return new w9g((StageSeriesFragment) obj2, rq3Var, 17);
            case 18:
                return new w9g((pa3) obj2, rq3Var, 18);
            case 19:
                return new w9g((WebView) obj2, rq3Var, 19);
            case 20:
                return new w9g((aoi) obj2, rq3Var, 20);
            case 21:
                return new w9g((ooi) obj2, rq3Var, 21);
            case 22:
                return new w9g((gmh) obj2, rq3Var, 22);
            case 23:
                return new w9g((SyncWorker) obj2, rq3Var, 23);
            case 24:
                return new w9g((tyi) obj2, rq3Var, 24);
            case 25:
                return new w9g((g2j) obj2, rq3Var, 25);
            case 26:
                return new w9g((r9j) obj2, rq3Var, 26);
            case 27:
                return new w9g((w84) obj2, rq3Var, 27);
            case 28:
                return new w9g((hbb) obj2, rq3Var, 28);
            default:
                return new w9g((r3) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((w9g) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0349, code lost:
    
        if (r13 == r0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0336, code lost:
    
        if (r13 == r0) goto L191;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ln2 ln2Var;
        ln2 ln2Var2;
        List<String> answers;
        String str;
        List list;
        int i = this.r;
        int i2 = 2;
        int i3 = 1;
        Object obj2 = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object w = ((qa3) obj2).w(this);
                    return w == lu3Var ? lu3Var : w;
                }
                if (i4 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                beg begVar = (beg) obj2;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                try {
                    if (i5 == 0) {
                        y6a.M(obj);
                        this.s = 1;
                        KClass kClass = beg.j;
                        if (begVar.b(this) == lu3Var2) {
                            return lu3Var2;
                        }
                    } else {
                        if (i5 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    begVar.g.post(new xdg(begVar, 6));
                } catch (hdg e) {
                    begVar.g.post(new ecg(i2, e, begVar));
                }
                begVar.c = null;
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                try {
                    if (i6 == 0) {
                        y6a.M(obj);
                        ln2Var = ((SASMediationBannerAdapterWrapper) obj2).g;
                        this.s = 1;
                        if (ln2Var.q(this, null) == lu3Var3) {
                            return lu3Var3;
                        }
                    } else {
                        if (i6 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                } catch (Exception unused) {
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                try {
                    if (i7 == 0) {
                        y6a.M(obj);
                        ln2Var2 = ((SASMediationInterstitialAdapterWrapper) obj2).h;
                        this.s = 1;
                        if (ln2Var2.q(this, null) == lu3Var4) {
                            return lu3Var4;
                        }
                    } else {
                        if (i7 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                } catch (Exception unused2) {
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                ks8 ks8Var = ((xeg) obj2).b;
                ViewGroup.LayoutParams layoutParams = ks8Var.c.getLayoutParams();
                int i8 = this.s;
                layoutParams.width = i8;
                layoutParams.height = i8;
                ks8Var.c.setLayoutParams(layoutParams);
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object f = ((g62) obj2).f(this);
                    return f == lu3Var6 ? lu3Var6 : f;
                }
                if (i9 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                View view = ((ahg) obj2).f;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                int i10 = this.s;
                layoutParams2.width = i10;
                layoutParams2.height = i10;
                view.setLayoutParams(layoutParams2);
                return Unit.a;
            case 7:
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                View view2 = ((pig) obj2).m;
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                int i11 = this.s;
                layoutParams3.width = i11;
                layoutParams3.height = i11;
                view2.setLayoutParams(layoutParams3);
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    uwg uwgVar = ((bxg) obj2).e;
                    this.s = 1;
                    if (uwgVar.a(this) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((o0h) obj2).W(this) == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 10:
                SettingsFragment settingsFragment = (SettingsFragment) obj2;
                lu3 lu3Var11 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    Context requireContext = settingsFragment.requireContext();
                    requireContext.getClass();
                    String string = settingsFragment.getString(R.string.signing_out);
                    string.getClass();
                    dk2 c = dk2.c(LayoutInflater.from(requireContext));
                    AlertDialog create = new AlertDialog.Builder(requireContext, R.style.RedesignDialog).create();
                    create.setCancelable(false);
                    TextView textView = c.c;
                    textView.setText(string);
                    textView.setVisibility(0);
                    create.setView(c.b);
                    create.show();
                    g2 g2Var = new g2(c, create, rq3Var, i2);
                    this.s = 1;
                    if (g2Var.invoke(null, this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (cga.U(this) == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                scj scjVar = (scj) obj2;
                e1d e1dVar = scjVar.c;
                l9j f2 = scjVar.f();
                try {
                    f2.f(t6a.g(0, f2.c.length()));
                    scjVar.a(f2);
                    ((eoh) e1dVar).setValue(Boolean.FALSE);
                    scjVar.e(false);
                    return Unit.a;
                } catch (Throwable th) {
                    ((eoh) e1dVar).setValue(Boolean.FALSE);
                    scjVar.e(false);
                    throw th;
                }
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i16 = this.s;
                if (i16 != 0) {
                    if (i16 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Map map = SofaBackupAgent.b;
                gzh gzhVar = (gzh) ((SofaBackupAgent) obj2).a.getValue();
                this.s = 1;
                Object b = gzhVar.b(this);
                return b == lu3Var13 ? lu3Var13 : b;
            case 13:
                SofaSeasonActivity sofaSeasonActivity = (SofaSeasonActivity) obj2;
                lu3 lu3Var14 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    int i18 = SofaSeasonActivity.L;
                    nn2 nn2Var = ((kth) sofaSeasonActivity.K.getValue()).k;
                    f10 f10Var = new f10(sofaSeasonActivity, 21);
                    this.s = 1;
                    if (nn2Var.collect(f10Var, this) == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    f5j f5jVar = f5j.a;
                    cg4 cg4Var = ((SofascoreAnalystTennisPromoBottomSheet) obj2).D;
                    if (cg4Var == null) {
                        Intrinsics.i("dataStoreManager");
                        throw null;
                    }
                    this.s = 1;
                    Object g = cg4Var.g("PREF_TENNIS_ANALYST_PROMO_SHOWN", true, this);
                    if (g != lu3Var15) {
                        g = Unit.a;
                    }
                    if (g == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    jgd jgdVar = jgd.a;
                    Context context = ((vuh) obj2).b;
                    this.s = 1;
                    if (jgdVar.c(context, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    g4i g4iVar = (g4i) obj2;
                    Stage stage = g4iVar.j;
                    if (stage != null) {
                        fzh fzhVar = new fzh(g4iVar, stage, rq3Var, i3);
                        this.s = 1;
                        Object P = yaa.P(fzhVar, this);
                        return P == lu3Var17 ? lu3Var17 : P;
                    }
                } else {
                    if (i21 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 17:
                StageSeriesFragment stageSeriesFragment = (StageSeriesFragment) obj2;
                lu3 lu3Var18 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var = xd5.b;
                    long R = wkn.R(5, be5.SECONDS);
                    this.s = 1;
                    if (n4o.z(R, this) == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                krk krkVar = stageSeriesFragment.l;
                krkVar.getClass();
                if (((wq8) krkVar).g.getScrollState() != 0) {
                    stageSeriesFragment.A().m();
                }
                return Unit.a;
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    jof jofVar = dg0.e;
                    d11 d11Var = new d11(i2, rq3Var, 16);
                    this.s = 1;
                    obj = rd0.z(jofVar, d11Var, this);
                    break;
                } else {
                    if (i23 != 1) {
                        if (i23 == 2) {
                            y6a.M(obj);
                            return (bg0) obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (((cg0) obj) != cg0.b) {
                    return null;
                }
                this.s = 2;
                obj = ((qa3) ((pa3) obj2)).w(this);
                break;
            case 19:
                lu3 lu3Var20 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(1500L, this) == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ((WebView) obj2).destroy();
                return Unit.a;
            case 20:
                aoi aoiVar = (aoi) obj2;
                lu3 lu3Var21 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    HashMap hashMap = new HashMap();
                    Iterator it = aoiVar.j.iterator();
                    it.getClass();
                    while (true) {
                        Object obj3 = null;
                        boolean z = false;
                        if (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            SurveyAnswer surveyAnswer = (SurveyAnswer) next;
                            ArrayList arrayList = new ArrayList();
                            String text = surveyAnswer.getText();
                            if (text != null) {
                                arrayList.add(text);
                            }
                            List<Integer> values = surveyAnswer.getValues();
                            if (values != null) {
                                Survey survey = aoiVar.h;
                                if (survey == null) {
                                    Intrinsics.i("survey");
                                    throw null;
                                }
                                Iterator<T> it2 = survey.getQuestions().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        Object next2 = it2.next();
                                        if (((Question) next2).getId() == surveyAnswer.getId()) {
                                            obj3 = next2;
                                        }
                                    }
                                }
                                Question question = (Question) obj3;
                                Iterator<Integer> it3 = values.iterator();
                                while (it3.hasNext()) {
                                    int intValue = it3.next().intValue();
                                    if (question != null && (answers = question.getAnswers()) != null && (str = answers.get(intValue)) != null) {
                                        arrayList.add(str);
                                    }
                                }
                            }
                            hashMap.put(new Integer(surveyAnswer.getId()), arrayList);
                        } else {
                            yni yniVar = aoiVar.e;
                            Survey survey2 = aoiVar.h;
                            if (survey2 == null) {
                                Intrinsics.i("survey");
                                throw null;
                            }
                            int id = survey2.getId();
                            SurveyAnswersPost surveyAnswersPost = new SurveyAnswersPost(hashMap);
                            this.s = 1;
                            yniVar.getClass();
                            if (yaa.P(new c64((Object) yniVar, id, (Object) surveyAnswersPost, (rq3) (z ? 1 : 0), 18), this) == lu3Var21) {
                                return lu3Var21;
                            }
                        }
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 21:
                ooi ooiVar = (ooi) obj2;
                lu3 lu3Var22 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    PointerInputEventHandler pointerInputEventHandler = ooiVar.q;
                    this.s = 2;
                    if (pointerInputEventHandler.invoke(ooiVar, this) == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i26 != 1 && i26 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 22:
                lu3 lu3Var23 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(250L, this) == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                gmh gmhVar = (gmh) obj2;
                if (gmhVar != null) {
                    gmhVar.a();
                }
                return Unit.a;
            case 23:
                lu3 lu3Var24 = lu3.a;
                int i28 = this.s;
                if (i28 != 0) {
                    if (i28 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                udl udlVar = ((SyncWorker) obj2).m;
                this.s = 1;
                udlVar.getClass();
                Object r = s9a.r(new pdk(udlVar, rq3Var, 9), this);
                return r == lu3Var24 ? lu3Var24 : r;
            case 24:
                tyi tyiVar = (tyi) obj2;
                lu3 lu3Var25 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = tyiVar.b;
                    int i30 = tyiVar.c;
                    this.s = 1;
                    obj = j0jVar.s(i30, this);
                    if (obj == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                StatisticsSeasonsResponse statisticsSeasonsResponse = (StatisticsSeasonsResponse) obj;
                if (statisticsSeasonsResponse != null) {
                    yzc yzcVar = tyiVar.e;
                    xbb b2 = a.b();
                    for (UniqueTournamentSeasons uniqueTournamentSeasons : statisticsSeasonsResponse.getUniqueTournamentSeasons()) {
                        int id2 = uniqueTournamentSeasons.getUniqueTournament().getId();
                        Map<Integer, Map<Integer, List<String>>> typesMap = statisticsSeasonsResponse.getTypesMap();
                        Map map2 = typesMap != null ? (Map) me4.f(id2, typesMap) : null;
                        List<Season> seasons = uniqueTournamentSeasons.getSeasons();
                        ArrayList arrayList2 = new ArrayList(k13.r(seasons, 10));
                        for (Season season : seasons) {
                            if (map2 == null || (list = (List) me4.f(season.getId(), map2)) == null) {
                                list = km5.a;
                            }
                            arrayList2.add(new syi(id2, season, list));
                        }
                        b2.addAll(arrayList2);
                    }
                    yzcVar.j(a.a(b2));
                }
                return Unit.a;
            case 25:
                lu3 lu3Var26 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((g2j) obj2).w(this) == lu3Var26) {
                        return lu3Var26;
                    }
                } else {
                    if (i31 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 26:
                r9j r9jVar = (r9j) obj2;
                lu3 lu3Var27 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    dsf dsfVar = new dsf();
                    dsfVar.a = 1;
                    pog y = sea.y(new deh(27, r9jVar, dsfVar));
                    zni zniVar = new zni(r9jVar, null);
                    this.s = 1;
                    if (fcp.c0(y, zniVar, this) == lu3Var27) {
                        return lu3Var27;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 27:
                Object obj4 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    w84 w84Var = (w84) obj2;
                    this.s = 1;
                    w84Var.getClass();
                    Object r2 = s9a.r(new r1(w84Var, rq3Var, 12), this);
                    Object obj5 = r2;
                    if (r2 != obj4) {
                        obj5 = Unit.a;
                    }
                    if (obj5 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i33 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 28:
                lu3 lu3Var28 = lu3.a;
                int i34 = this.s;
                if (i34 == 0) {
                    y6a.M(obj);
                    hbb hbbVar = (hbb) obj2;
                    this.s = 1;
                    hbbVar.getClass();
                    Object collect = hbbVar.a.b().collect(new nk0(15, new l0d(), hbbVar), this);
                    if (collect != lu3Var28) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var28) {
                        return lu3Var28;
                    }
                } else {
                    if (i34 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var29 = lu3.a;
                int i35 = this.s;
                if (i35 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((r3) obj2).invoke(this) == lu3Var29) {
                        return lu3Var29;
                    }
                } else {
                    if (i35 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9g(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
    }
}
