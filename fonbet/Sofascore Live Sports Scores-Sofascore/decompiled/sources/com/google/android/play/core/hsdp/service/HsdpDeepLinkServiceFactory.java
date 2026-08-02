package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.playcore_hsdp.zzj;
import defpackage.a70;
import defpackage.d2o;
import defpackage.fjg;
import defpackage.gg9;
import defpackage.pqg;
import defpackage.u00;
import defpackage.y0p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes3.dex */
public final class HsdpDeepLinkServiceFactory {
    private static final String HPOA_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hpoa.service.HpoaService";
    private static final String HPOA_SERVICE_CLASS_NAME_FOR_TESTING = "com.google.android.play.core.hsdp.testapp.FakeHpoaService";
    private static final String HSDP_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hsdp.service.HsdpService";

    private HsdpDeepLinkServiceFactory() {
    }

    @NonNull
    @Keep
    public static gg9 create(@NonNull Context context) {
        return createInternal(context, false, true);
    }

    private static Intent createHpoaServiceIntent(Context context, boolean z) {
        return z ? new Intent().setClassName(context.getPackageName(), HPOA_SERVICE_CLASS_NAME_FOR_TESTING) : new Intent().setClassName("com.android.vending", HPOA_SERVICE_CLASS_NAME);
    }

    public static Intent createHsdpServiceIntent() {
        return new Intent().setClassName("com.android.vending", HSDP_SERVICE_CLASS_NAME);
    }

    private static gg9 createInternal(Context context, boolean z, boolean z2) {
        if (!z2 && !(context instanceof Activity)) {
            a70.p("Context must be an Activity when using activity-based HSDP.");
            return null;
        }
        if (z && !(context instanceof Activity)) {
            a70.p("Context must be an Activity when enabling loading panel.");
            return null;
        }
        byte b = 0;
        boolean z3 = ActivityManager.isRunningInTestHarness() || (Build.VERSION.SDK_INT >= 29 && ActivityManager.isRunningInUserTestHarness());
        return new pqg(context, zzj.a(new fjg(context, z3)), zzj.a(new u00(context, b)), z3, z2, z);
    }

    public static /* synthetic */ d2o lambda$createInternal$0(Context context, boolean z) {
        return new y0p((Activity) context, createHpoaServiceIntent(context, z));
    }

    @NonNull
    @Keep
    public static gg9 create(@NonNull Activity activity, boolean z) {
        return create(activity, z, false);
    }

    @NonNull
    @Keep
    public static gg9 create(@NonNull Activity activity, boolean z, boolean z2) {
        return createInternal(activity, z, z2);
    }

    @NonNull
    @Keep
    public static gg9 create(@NonNull Activity activity) {
        return create(activity, false);
    }
}
