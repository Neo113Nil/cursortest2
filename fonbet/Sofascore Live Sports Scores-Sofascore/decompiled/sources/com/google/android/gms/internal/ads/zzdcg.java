package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdcg {
    public IHsdpDeepLinkServiceWrapper a;

    public final synchronized IHsdpDeepLinkServiceWrapper a(Context context) {
        IHsdpDeepLinkServiceWrapper iHsdpDeepLinkServiceWrapper = this.a;
        if (iHsdpDeepLinkServiceWrapper != null) {
            return iHsdpDeepLinkServiceWrapper;
        }
        IHsdpDeepLinkServiceWrapper asInterface = IHsdpDeepLinkServiceWrapper.Stub.asInterface((IBinder) context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.ads.internal.client.hsdp.HsdpDeepLinkServiceWrapper").getConstructor(null).newInstance(null));
        this.a = asInterface;
        return asInterface;
    }
}
