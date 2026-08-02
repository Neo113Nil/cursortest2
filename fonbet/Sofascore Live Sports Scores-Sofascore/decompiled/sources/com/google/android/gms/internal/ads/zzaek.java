package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import defpackage.vpk;
import defpackage.y9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaek {
    public final Context a;
    public vpk b;
    public boolean c;
    public Surface d;
    public float e;
    public float f;
    public float g = 1.0f;
    public int h = 0;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;

    public zzaek(Context context) {
        this.a = context;
    }

    public final void a() {
        this.n = -1L;
        this.k = -1L;
        this.m = C.TIME_UNSET;
        this.i = 0L;
        this.j = 0L;
    }

    public final void b(boolean z) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.d) == null || this.h == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        boolean z2 = this.c;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z2) {
            float f2 = this.e;
            if (f2 != -1.0f) {
                f = this.g * f2;
            }
        }
        if (z || this.f != f) {
            this.f = f;
            y9.t(this.d, f);
        }
    }

    public final void c() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.d) == null || this.h == Integer.MIN_VALUE || this.f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !surface.isValid()) {
            return;
        }
        this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        y9.t(this.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
