package com.sofascore.results.mma.fightNight;

import android.app.assist.AssistContent;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.results.R;
import defpackage.a5f;
import defpackage.anc;
import defpackage.bnc;
import defpackage.cnc;
import defpackage.duf;
import defpackage.eqb;
import defpackage.inc;
import defpackage.kr9;
import defpackage.mqi;
import defpackage.mz1;
import defpackage.otk;
import defpackage.p15;
import defpackage.pmc;
import defpackage.qmc;
import defpackage.rmc;
import defpackage.u8f;
import defpackage.uic;
import defpackage.un0;
import defpackage.xmc;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.zzc;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/mma/fightNight/MmaFightNightActivity;", "Lcom/sofascore/results/mvvm/base/CollapsibleToolbarActivity;", "<init>", "()V", "x2a", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaFightNightActivity extends Hilt_MmaFightNightActivity {
    public static final /* synthetic */ int R = 0;
    public final otk M;
    public final mqi N;
    public final mqi O;
    public Function0 P;
    public boolean Q;

    public MmaFightNightActivity() {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        this.M = new otk(duf.a.getOrCreateKotlinClass(cnc.class), new rmc(this, i2), new rmc(this, i), new rmc(this, i3));
        this.N = ypa.b(new pmc(this, i));
        this.O = ypa.b(new pmc(this, i2));
        this.P = new pmc(this, i3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        cnc X = X();
        xw3.L(un0.z(X), null, null, new bnc(X, Y(), null), 3);
    }

    public final cnc X() {
        return (cnc) this.M.getValue();
    }

    public final int Y() {
        return ((Number) this.O.getValue()).intValue();
    }

    @Override // com.sofascore.results.mvvm.base.CollapsibleToolbarActivity, com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        SharedPreferences d;
        super.onCreate(bundle);
        this.o = Q().g;
        Q().k.setAdapter((inc) this.N.getValue());
        Q().l.setOnChildScrollUpCallback(new u8f(3));
        Q().l.setOnRefreshListener(new kr9(this, 10));
        int i = 0;
        X().h.e(this, new eqb(4, new qmc(this, i)));
        zzc zzcVar = X().j;
        int i2 = 1;
        p15 p15Var = new p15(new qmc(this, i2), i2);
        zzcVar.getClass();
        zzcVar.a.e(this, p15Var);
        if (bundle == null) {
            cnc X = X();
            int Y = Y();
            Context i3 = X.i();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = i3.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            if (sharedPreferences.getBoolean("PREF_SHOW_MMA_ORGANIZATION_REMINDER", true)) {
                xw3.L(un0.z(X), null, null, new anc(X, Y, null, i), 3);
            }
        }
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        Tournament tournament;
        assistContent.getClass();
        super.onProvideAssistContent(assistContent);
        xmc xmcVar = (xmc) X().h.d();
        if (xmcVar == null || (tournament = xmcVar.a) == null) {
            return;
        }
        assistContent.setWebUri(Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{getString(R.string.share_link), tournament.getWebUrl(), ""}, 3))));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "FightNightScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String y() {
        return mz1.j(Y(), super.y(), " id:");
    }
}
