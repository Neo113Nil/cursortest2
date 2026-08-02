package com.sofascore.results.event.aiInsights;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import com.sofascore.model.mvvm.model.Event;
import defpackage.a5f;
import defpackage.a70;
import defpackage.as5;
import defpackage.duf;
import defpackage.fuf;
import defpackage.fv2;
import defpackage.mr5;
import defpackage.otk;
import defpackage.rq3;
import defpackage.su;
import defpackage.tc3;
import defpackage.uic;
import defpackage.xs5;
import defpackage.yr5;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/aiInsights/EventAiInsightsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventAiInsightsFragment extends Hilt_EventAiInsightsFragment {
    public final otk r;
    public final otk s;

    public EventAiInsightsFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new as5(this, 0), new as5(this, 2), new as5(this, 1));
        this.s = new otk(fufVar.getOrCreateKotlinClass(xs5.class), new as5(this, 3), new as5(this, 5), new as5(this, 4));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getX() {
        return new tc3(2143428174, new fv2(this, 12), true);
    }

    public final Event D() {
        Object d = ((mr5) this.r.getValue()).v.d();
        if (d != null) {
            return (Event) d;
        }
        a70.r("Required value was null.");
        return null;
    }

    public final xs5 E() {
        return (xs5) this.s.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (E().r) {
            return;
        }
        E().r = true;
        u();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SharedPreferences d;
        view.getClass();
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        requireContext.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = requireContext.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        rq3 rq3Var = null;
        String string = sharedPreferences.getString("PR_XAIST", null);
        int i = 1;
        int i2 = 0;
        boolean z = string == null || string.length() == 0;
        su suVar = this.i;
        suVar.b = z ? "locked" : "unlocked";
        suVar.c = D().getStatusType();
        z8e.y(this, E().p, new yr5(this, rq3Var, i2));
        z8e.y(this, E().q, new yr5(this, rq3Var, i));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "AIInsightsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        if (E().r) {
            E().u(D());
        }
    }
}
