package com.google.android.gms.internal.cast;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzgx {
    private static final Interpolator zza = new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, 1.0f);
    private static final Interpolator zzb = new PathInterpolator(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f);
    private static final Interpolator zzc = new PathInterpolator(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, 1.0f);
}
