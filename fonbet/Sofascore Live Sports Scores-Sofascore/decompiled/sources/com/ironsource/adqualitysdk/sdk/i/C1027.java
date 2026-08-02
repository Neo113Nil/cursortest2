package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ףּ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1027 extends AbstractC0646 implements InterfaceC0827 {

    /* renamed from: ﭴ, reason: contains not printable characters */
    public C1036 f3278;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public boolean f3279;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public boolean f3280;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public boolean f3281;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public boolean f3282;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public Class f3283;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public C0815 f3284;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f3277 = StringFog.decrypt("+WWdpAWrZtf5YqGsHaZ+y8o=\n", "uAbpzXPCEq4=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f3276 = StringFog.decrypt("ag88Yx6YrvF6DyQ/FI/v/m0RJCwbg7XmegQ6YwSOqrFIBAIlGJ2v\n", "CWBRTXfqwZ8=\n");

    public C1027(JSONObject jSONObject, C0567 c0567) {
        super(c0567);
        this.f3282 = false;
        this.f3281 = false;
        this.f3280 = false;
        this.f3279 = false;
        C1036 c1036 = new C1036(jSONObject);
        this.f2185 = c1036;
        this.f3278 = c1036;
        AbstractC1008.m611(new C1119(this));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m619(C1027 c1027, Activity activity) {
        c1027.getClass();
        Class<?> cls = activity.getClass();
        Class cls2 = c1027.f3283;
        if (cls2 != null) {
            return c1027.f3278.f3300 ? cls2.equals(cls) : cls2.isAssignableFrom(cls);
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C1101 c1101 = new C1101(this, activity, bundle);
        if (this.f3278.f3299) {
            AbstractC1008.m610(c1101);
        } else {
            AbstractC1008.m612(c1101);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C1142 c1142 = new C1142(this, activity);
        if (this.f3278.f3299) {
            AbstractC1008.m610(c1142);
        } else {
            AbstractC1008.m612(c1142);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC1008.m614(new C1057(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1061 c1061 = new C1061(this, activity);
        if (this.f3278.f3299) {
            AbstractC1008.m610(c1061);
        } else {
            AbstractC1008.m612(c1061);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C1060 c1060 = new C1060(this, activity, bundle);
        if (this.f3278.f3299) {
            AbstractC1008.m610(c1060);
        } else {
            AbstractC1008.m612(c1060);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC1008.m614(new C1073(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C1048 c1048 = new C1048(this, activity);
        if (this.f3278.f3299) {
            AbstractC1008.m610(c1048);
        } else {
            AbstractC1008.m612(c1048);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0646
    /* renamed from: ﾇ */
    public final void mo85(Object obj, ArrayList arrayList) {
        C1036 c1036 = this.f3278;
        AbstractC3964b.m91((Activity) obj, WebView.class, c1036.f3301, c1036.f3302, false, false, null, c1036.f2190, arrayList);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0646
    /* renamed from: ﾇ */
    public final View mo83(Object obj) {
        return ((Activity) obj).findViewById(R.id.content);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0827
    /* renamed from: ﾇ */
    public final void mo158(Activity activity) {
        AbstractC1008.m614(new C1117(this, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0646
    /* renamed from: ﾇ */
    public final AbstractViewOnLayoutChangeListenerC3987z mo84() {
        return new A();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0646
    /* renamed from: ﾒ */
    public final InterfaceC0881 mo86() {
        return this;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0827
    /* renamed from: ﾒ */
    public final void mo159(Activity activity) {
        AbstractC1008.m614(new C1118(this, activity));
    }
}
