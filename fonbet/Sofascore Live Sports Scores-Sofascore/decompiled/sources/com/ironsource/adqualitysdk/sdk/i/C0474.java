package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ذ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0474 extends AbstractC0280 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f1536;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f1537;

    public C0474(C1102 c1102, ArrayList arrayList) {
        this.f1536 = c1102;
        this.f1537 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (C1102.m649(this.f1536, activity, this.f1537)) {
            m293(StringFog.decrypt("sW9EE6+ofZaqeEYCvqB/mro=\n", "3gEFcNvBC/8=\n"), Arrays.asList(activity, bundle));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (C1102.m649(this.f1536, activity, this.f1537)) {
            m293(StringFog.decrypt("cdcAHlo/pq1qwAUYXSKiq2fcJQ==\n", "HrlBfS5W0MQ=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (C1102.m649(this.f1536, activity, this.f1537)) {
            m293(StringFog.decrypt("Kav32JkpuMwyvObamDOrwQ==\n", "RsW2u+1AzqU=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (C1102.m649(this.f1536, activity, this.f1537)) {
            m293(StringFog.decrypt("QpAPmlgAibxZhxycXxySsEk=\n", "Lf5O+Sxp/9U=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (C1102.m649(this.f1536, activity, this.f1537)) {
            m293(StringFog.decrypt("f8e+FlCpTYtk0KwUUqVyjGPdnhtHpWiWcd2a\n", "EKn/dSTAO+I=\n"), Arrays.asList(activity, bundle));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (C1102.m649(this.f1536, activity, this.f1537)) {
            m293(StringFog.decrypt("/iuKRl/n7vvlPJhRSvzs9/U=\n", "kUXLJSuOmJI=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (C1102.m649(this.f1536, activity, this.f1537)) {
            m293(StringFog.decrypt("LUR7N2O4+6M2U2kgeKH9ryY=\n", "Qio6VBfRjco=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, com.ironsource.adqualitysdk.sdk.i.InterfaceC0827
    /* renamed from: ﾇ */
    public final void mo158(Activity activity) {
        m293(StringFog.decrypt("HtpCf4/U3/cExm1qm9LVxR7GZmiN6c/tFQ==\n", "cbQDD/+GuoM=\n"), Collections.singletonList(activity));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m293(String str, List list) {
        C1102.m648(this.f1536, ceo.e("bAnrYQsNQ65hA/ltHh1Uu0hE\n", "LWqfCH1kN9c=\n", str), true, false, list);
        AbstractC1008.m611(new C0493(this, str, list));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, com.ironsource.adqualitysdk.sdk.i.InterfaceC0827
    /* renamed from: ﾒ */
    public final void mo159(Activity activity) {
        m293(StringFog.decrypt("Qr2qE6aTNPRZh4Qht6M6/V+8ng2y\n", "LdPrY9bAUZo=\n"), Collections.singletonList(activity));
    }
}
