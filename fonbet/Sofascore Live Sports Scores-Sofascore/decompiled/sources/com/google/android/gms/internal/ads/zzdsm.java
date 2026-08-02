package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import defpackage.dun;
import defpackage.k0o;
import defpackage.l0o;
import defpackage.mon;
import defpackage.zzn;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdsm {
    public final zzdxg a;
    public final zzdvv b;
    public l0o c = null;

    public zzdsm(zzdxg zzdxgVar, zzdvv zzdvvVar) {
        this.a = zzdxgVar;
        this.b = zzdvvVar;
    }

    public final View a(FrameLayout frameLayout, WindowManager windowManager) {
        zzclm a = this.a.a(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        a.zzE().setVisibility(4);
        a.zzE().setContentDescription("policy_validator");
        a.T("/sendMessageToSdk", new dun(this, 1));
        a.T("/hideValidatorOverlay", new k0o(this, windowManager, frameLayout));
        a.T("/open", new zzbqv(null, null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(a);
        k0o k0oVar = new k0o(this, frameLayout, windowManager);
        zzdvv zzdvvVar = this.b;
        zzdvvVar.b("/loadNativeAdPolicyViolations", new zzn(zzdvvVar, weakReference, "/loadNativeAdPolicyViolations", k0oVar));
        zzdvvVar.b("/showValidatorOverlay", new zzn(zzdvvVar, new WeakReference(a), "/showValidatorOverlay", mon.g));
        return a.zzE();
    }
}
