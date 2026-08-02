package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbrp {
    public final Context a;
    public final OnH5AdsEventListener b;
    public zzbrl c;

    public zzbrp(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.i(context);
        Preconditions.i(onH5AdsEventListener);
        this.a = context;
        this.b = onH5AdsEventListener;
        zzbjg.a(context);
    }

    public static final boolean a(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Bb)).booleanValue()) {
            Preconditions.i(str);
            if (str.length() > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Db)).intValue()) {
                zzo.zzd("H5 GMSG exceeds max length");
                return false;
            }
            Uri parse = Uri.parse(str);
            if ("gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath())) {
                return true;
            }
        }
        return false;
    }
}
