package com.sofascore.results.bettingtips;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ViewStub;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.djf;
import defpackage.duf;
import defpackage.dv1;
import defpackage.ev1;
import defpackage.fv1;
import defpackage.hkg;
import defpackage.joa;
import defpackage.kp5;
import defpackage.lkj;
import defpackage.ltb;
import defpackage.mqi;
import defpackage.otk;
import defpackage.q3;
import defpackage.rld;
import defpackage.tc;
import defpackage.tu1;
import defpackage.u2;
import defpackage.un0;
import defpackage.vu1;
import defpackage.wu1;
import defpackage.xw3;
import defpackage.y7;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yzc;
import defpackage.zu1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/bettingtips/BettingTipsActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "tol", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BettingTipsActivity extends Hilt_BettingTipsActivity {
    public static final /* synthetic */ int Q = 0;
    public final otk K;
    public final mqi L;
    public final mqi M;
    public final mqi N;
    public final joa O = ypa.a(ysa.c, new tu1(this, 3));
    public boolean P;

    public BettingTipsActivity() {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        this.K = new otk(duf.a.getOrCreateKotlinClass(dv1.class), new wu1(this, i2), new wu1(this, i), new wu1(this, i3));
        this.L = ypa.b(new tu1(this, i));
        this.M = ypa.b(new tu1(this, i2));
        this.N = ypa.b(new tu1(this, i3));
    }

    public final dv1 Q() {
        return (dv1) this.K.getValue();
    }

    public final tc R() {
        return (tc) this.L.getValue();
    }

    public final fv1 S() {
        return (fv1) this.M.getValue();
    }

    public final void T(zu1 zu1Var) {
        dv1 Q2 = Q();
        zu1Var.getClass();
        yzc yzcVar = Q2.f;
        if (zu1Var != yzcVar.d()) {
            yzcVar.j(zu1Var);
        }
        SharedPreferences.Editor edit = A().edit();
        edit.getClass();
        edit.putString("betting_tips_selected_sport", zu1Var.name());
        edit.apply();
        kp5 kp5Var = ev1.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : kp5Var) {
            ev1 ev1Var = (ev1) obj;
            if (rld.p(this) || ev1Var != ev1.b) {
                arrayList.add(obj);
            }
        }
        Q();
        if (zu1Var == zu1.d || zu1Var == zu1.c) {
            if (S().l.size() == arrayList.size() - 1) {
                fv1 S = S();
                ev1 ev1Var2 = ev1.c;
                S.v(ev1Var2, arrayList.indexOf(ev1Var2));
                return;
            }
            return;
        }
        if (S().l.size() == arrayList.size()) {
            fv1 S2 = S();
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((ev1) it.next()) == ev1.c) {
                    break;
                } else {
                    i++;
                }
            }
            S2.k.remove(Long.valueOf(S2.getItemId(i)));
            S2.l.remove(i);
            S2.notifyItemRemoved(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d9, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Integer] */
    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        ltb ltbVar;
        zu1 valueOf;
        Object obj;
        super.onCreate(bundle);
        setContentView(R().a);
        ViewStub viewStub = R().c;
        this.o = viewStub;
        Q().j.e(this, new y7(5, new u2(this, 25)));
        String stringExtra = getIntent().getStringExtra("BET_BOOST_EVENT_SPORT");
        int i = 0;
        Q().k = getIntent().getIntExtra("BET_BOOST_EVENT_ID", 0);
        Q().l = stringExtra;
        dv1 Q2 = Q();
        if (Q2.h != null) {
            xw3.L(un0.z(Q2), null, null, new q3(Q2, r2, 9), 3);
        } else {
            Q2.i.j(null);
        }
        AdBannerView adBannerView = R().b;
        OddsCountryProvider oddsCountryProvider = Q().h;
        if (oddsCountryProvider != null) {
            ltb ltbVar2 = new ltb();
            ltbVar2.put("odds_provider", oddsCountryProvider.getSubProviderIds().toString());
            ltbVar = ltbVar2.d();
        } else {
            ltbVar = null;
        }
        I(adBannerView, ltbVar);
        joa joaVar = this.O;
        lkj lkjVar = (lkj) joaVar.getValue();
        kp5 kp5Var = zu1.j;
        lkjVar.getClass();
        kp5Var.getClass();
        lkjVar.b = kp5Var;
        lkjVar.notifyDataSetChanged();
        lkjVar.notifyDataSetChanged();
        if (!this.P) {
            if (stringExtra != null) {
                Iterator it = kp5Var.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((zu1) obj).a.equals(stringExtra)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                valueOf = (zu1) obj;
            }
            String string = A().getString("betting_tips_selected_sport", "ALL_SPORTS");
            if (string == null) {
                string = "ALL_SPORTS";
            }
            valueOf = zu1.valueOf(string);
            lkj lkjVar2 = (lkj) joaVar.getValue();
            ((Spinner) R().e.d).setAdapter((SpinnerAdapter) lkjVar2);
            ((Spinner) R().e.d).setOnItemSelectedListener(new vu1(this, lkjVar2, i));
            int d = lkjVar2.d(valueOf);
            if ((d >= 0 ? Integer.valueOf(d) : null) != null) {
                ((Spinner) R().e.d).setSelection(lkjVar2.d(valueOf));
            }
            djf djfVar = R().e;
            UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) djfVar.b;
            TextView textView = (TextView) djfVar.f;
            H(underlinedToolbar);
            ((Spinner) djfVar.d).setVisibility(0);
            textView.setVisibility(8);
            T(valueOf);
            R().f.setAdapter(S());
            AbstractActivity.O(R().d, Integer.valueOf(hkg.X(this)), getColor(R.color.k_ff));
            String string2 = A().getString("betting_tips_selected_sport", "ALL_SPORTS");
            string2.getClass();
            zu1 valueOf2 = zu1.valueOf(string2);
            fv1 S = S();
            Q();
            valueOf2.getClass();
            boolean z = valueOf2 == zu1.d || valueOf2 == zu1.c;
            boolean p = rld.p(this);
            S.getClass();
            kp5 kp5Var2 = ev1.e;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : kp5Var2) {
                ev1 ev1Var = (ev1) obj2;
                if (z || ev1Var != ev1.c) {
                    if (p || ev1Var != ev1.b) {
                        arrayList.add(obj2);
                    }
                }
            }
            S.x(arrayList);
            this.P = true;
        }
        if (CollectionsKt.R(zu1.j, Q().g.d())) {
            return;
        }
        ((Spinner) R().e.d).setSelection(0);
        T(zu1.c);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "DroppingOddsScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
