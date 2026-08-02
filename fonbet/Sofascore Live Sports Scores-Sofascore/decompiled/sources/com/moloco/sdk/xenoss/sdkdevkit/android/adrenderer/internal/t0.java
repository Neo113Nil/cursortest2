package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.net.Uri;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.da4;
import defpackage.ea4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class t0 {
    public final Context a;

    public t0(Context context) {
        this.a = context;
    }

    public final boolean a(String str) {
        str.getClass();
        Context context = this.a;
        try {
            da4 da4Var = new da4();
            da4Var.f(true);
            ea4 a = da4Var.a();
            a.a.addFlags(268435456);
            a.a(context, Uri.parse(str));
            return true;
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "Xenoss", "tryStartCustomTabs exception", e, false, 8, null);
            return false;
        }
    }
}
