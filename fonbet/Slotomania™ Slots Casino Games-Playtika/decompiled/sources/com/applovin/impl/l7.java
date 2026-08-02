package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.t2;
import com.applovin.impl.u2;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.R;
import com.facebook.internal.AnalyticsEvents;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class l7 extends p3 {
    private com.applovin.impl.sdk.l a;
    private u2 b;

    class a extends u2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return d.values().length;
        }

        @Override // com.applovin.impl.u2
        protected List c(int i) {
            return i == d.SETTINGS.ordinal() ? l7.this.c() : l7.this.a();
        }

        @Override // com.applovin.impl.u2
        protected int d(int i) {
            return i == d.SETTINGS.ordinal() ? e.values().length : c.values().length;
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i) {
            return i == d.SETTINGS.ordinal() ? new x4("SETTINGS") : new x4("GDPR APPLICABILITY");
        }
    }

    class b implements u2.a {
        final /* synthetic */ com.applovin.impl.sdk.l a;

        b(com.applovin.impl.sdk.l lVar) {
            this.a = lVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            if (l2Var.b() == d.SETTINGS.ordinal()) {
                if (l2Var.a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.a.y().f() != null) {
                        n7.a(this.a.y().f(), com.applovin.impl.sdk.l.p(), this.a);
                        return;
                    } else {
                        q7.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", l7.this);
                        return;
                    }
                }
                if (l2Var.a() != e.TERMS_OF_SERVICE_URL.ordinal() || this.a.y().h() == null) {
                    return;
                }
                n7.a(this.a.y().h(), com.applovin.impl.sdk.l.p(), this.a);
            }
        }
    }

    private enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    private enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    private enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(e.values().length);
        arrayList.add(b());
        arrayList.add(d());
        return arrayList;
    }

    private t2 d() {
        t2.b d2 = t2.a().d("Terms of Service URL");
        if (this.a.y().h() != null) {
            d2.a(R.drawable.applovin_ic_check_mark_bordered);
            d2.b(getColor(R.color.applovin_sdk_checkmarkColor));
            d2.a(true);
        } else {
            d2.c("None");
            d2.a(false);
        }
        return d2.a();
    }

    @Override // com.applovin.impl.p3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.a;
    }

    public void initialize(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        a aVar = new a(this);
        this.b = aVar;
        aVar.a(new b(lVar));
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        u2 u2Var = this.b;
        if (u2Var != null) {
            u2Var.a((u2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.a.w().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography d2 = this.a.y().d();
        boolean z = q7.c(this.a) && d2 != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(t2.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z));
        arrayList.add(b(d2, z));
        return arrayList;
    }

    private t2 b() {
        boolean z = this.a.y().f() != null;
        return t2.a().d("Privacy Policy URL").a(z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(getColor(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor)).a(true).a();
    }

    private t2 b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        return t2.a().d("Debug User Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None").b(z).a();
    }

    private t2 a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        return t2.a().d("Consent Flow Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN).b(z).a();
    }
}
