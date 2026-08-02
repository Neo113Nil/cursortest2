package com.sofascore.results.main;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import com.sofascore.model.newNetwork.Survey;
import com.sofascore.model.newNetwork.SurveyAnswer;
import com.sofascore.results.R;
import defpackage.aoi;
import defpackage.duf;
import defpackage.eq3;
import defpackage.g2i;
import defpackage.mqi;
import defpackage.o02;
import defpackage.otk;
import defpackage.px0;
import defpackage.rq3;
import defpackage.un0;
import defpackage.vni;
import defpackage.wni;
import defpackage.xe;
import defpackage.xw3;
import defpackage.ygi;
import defpackage.ypa;
import defpackage.zni;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/main/SurveyActivity;", "Lcom/sofascore/results/base/BaseActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SurveyActivity extends Hilt_SurveyActivity {
    public static final /* synthetic */ int L = 0;
    public final otk J;
    public final mqi K;

    public SurveyActivity() {
        int i = 0;
        this.J = new otk(duf.a.getOrCreateKotlinClass(aoi.class), new wni(this, 1), new wni(this, i), new wni(this, 2));
        this.K = ypa.b(new vni(this, i));
    }

    public final void M(boolean z, int i, ArrayList arrayList, String str) {
        N().b.setEnabled(z);
        aoi aoiVar = (aoi) this.J.getValue();
        SurveyAnswer surveyAnswer = new SurveyAnswer(i, arrayList, str);
        ArrayList U0 = CollectionsKt.U0(aoiVar.j);
        U0.add(surveyAnswer);
        int i2 = aoiVar.i + 1;
        Survey survey = aoiVar.h;
        if (survey == null) {
            Intrinsics.i("survey");
            throw null;
        }
        if (i2 > b.i(survey.getQuestions()) || aoiVar.k(U0, i2).isEmpty()) {
            N().b.setText(getString(R.string.survey_finish));
        } else {
            N().b.setText(getString(R.string.survey_next));
        }
    }

    public final xe N() {
        return (xe) this.K.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Drawable drawable;
        super.onCreate(bundle);
        setContentView(N().a);
        G();
        o02 n = n();
        int i = 1;
        if (n != null) {
            n.n0(true);
        }
        o02 n2 = n();
        rq3 rq3Var = null;
        if (n2 != null) {
            Drawable drawable2 = getDrawable(R.drawable.ic_close);
            if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
                drawable = null;
            } else {
                drawable.setTintList(eq3.q(R.color.on_color_primary, this));
            }
            n2.r0(drawable);
        }
        int intExtra = getIntent().getIntExtra("SURVEY_ID", 0);
        this.x.a = Integer.valueOf(intExtra);
        otk otkVar = this.J;
        ((aoi) otkVar.getValue()).g.e(this, new ygi(i, new g2i(this, 13)));
        aoi aoiVar = (aoi) otkVar.getValue();
        xw3.L(un0.z(aoiVar), null, null, new zni(aoiVar, intExtra, rq3Var, 0), 3);
        getOnBackPressedDispatcher().a(this, new px0(12, this, 0 == true ? 1 : 0));
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getOnBackPressedDispatcher().c();
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "SurveyScreen";
    }
}
