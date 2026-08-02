package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcn {
    public static final Logger d = new Logger("AnalyticsConsent", null);
    public final zzfu a;
    public final long b;
    public final zzfk c;

    public zzcn(Context context, long j) {
        Api api = zzga.a;
        this.a = new zzfu(context, zzga.a, new zzfz(), GoogleApi.Settings.c);
        this.b = j;
        this.c = new zzfk(Looper.getMainLooper());
    }
}
