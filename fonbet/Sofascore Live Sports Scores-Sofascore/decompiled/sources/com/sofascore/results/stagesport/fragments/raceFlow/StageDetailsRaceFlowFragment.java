package com.sofascore.results.stagesport.fragments.raceFlow;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.a5f;
import defpackage.bte;
import defpackage.c3i;
import defpackage.d3i;
import defpackage.dmi;
import defpackage.duf;
import defpackage.fvg;
import defpackage.joa;
import defpackage.o1i;
import defpackage.otk;
import defpackage.tc3;
import defpackage.uic;
import defpackage.un0;
import defpackage.wsf;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/raceFlow/StageDetailsRaceFlowFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageDetailsRaceFlowFragment extends Hilt_StageDetailsRaceFlowFragment {
    public final otk r;

    public StageDetailsRaceFlowFragment() {
        joa a = ypa.a(ysa.c, new o1i(new o1i(this, 3), 4));
        this.r = new otk(duf.a.getOrCreateKotlinClass(d3i.class), new wsf(a, 13), new bte(this, a, 14), new wsf(a, 14));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getX() {
        return new tc3(1950996773, new fvg(this, 22), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        SharedPreferences d;
        SharedPreferences d2;
        super.onResume();
        Context requireContext = requireContext();
        requireContext.getClass();
        requireContext.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = requireContext.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        if (sharedPreferences.getBoolean("RACE_FLOW_SEEN_PREF", false)) {
            return;
        }
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        requireContext2.getClass();
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = requireContext2.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext2);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences2 = d;
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences2, "RACE_FLOW_SEEN_PREF", true);
        Unit unit = Unit.a;
        i.apply();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "RaceFlowTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        d3i d3iVar = (d3i) this.r.getValue();
        xw3.L(un0.z(d3iVar), null, null, new c3i(d3iVar, null, 0), 3);
    }
}
