package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.PowerManager;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ku3;
import defpackage.xw3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ff, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3420ff {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r5 < (r7 != null ? r7.getRefreshDebounceTime() : 1000)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        if (r5 > r3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EnumC3489i6 a(ConnectivityManager connectivityManager) {
        long nonValidatedExpiry;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return EnumC3489i6.j;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return EnumC3489i6.j;
        }
        networkCapabilities.toString();
        if (!networkCapabilities.hasCapability(12)) {
            return EnumC3489i6.j;
        }
        if (!((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getSkipNetworkValidationFeatureEnabled() && !networkCapabilities.hasCapability(16)) {
            AdConfig.CustomNetworkValidation a = C3488i5.a();
            if (!(a != null ? a.getEnabled() : false)) {
                return EnumC3489i6.j;
            }
            long j = C3488i5.d;
            if (j != 0) {
                ku3 ku3Var = Hl.a;
                long elapsedRealtime = SystemClock.elapsedRealtime() - j;
                AdConfig.CustomNetworkValidation a2 = C3488i5.a();
            }
            C3488i5.d = SystemClock.elapsedRealtime();
            if (Intrinsics.c(C3488i5.a, activeNetwork)) {
                long j2 = C3488i5.c;
                ku3 ku3Var2 = Hl.a;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - j2;
                if (C3488i5.b) {
                    AdConfig.CustomNetworkValidation a3 = C3488i5.a();
                    nonValidatedExpiry = a3 != null ? a3.getValidatedExpiry() : UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
                } else {
                    AdConfig.CustomNetworkValidation a4 = C3488i5.a();
                    nonValidatedExpiry = a4 != null ? a4.getNonValidatedExpiry() : CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
                }
            }
            if (C3488i5.e.compareAndSet(false, true)) {
                xw3.L(L9.d, null, null, new C3462h5(activeNetwork, null), 3);
            }
            if (!C3488i5.b) {
                return EnumC3489i6.o;
            }
        }
        return null;
    }

    public static boolean b() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager != null) {
                return powerManager.isDeviceIdleMode();
            }
            return false;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public static EnumC3489i6 a() {
        EnumC3489i6 enumC3489i6;
        Context context = AbstractC3424fj.a;
        if (context != null) {
            try {
                Object systemService = context.getSystemService("connectivity");
                systemService.getClass();
                enumC3489i6 = a((ConnectivityManager) systemService);
            } catch (Exception e) {
                e.getMessage();
                enumC3489i6 = EnumC3489i6.l;
            }
            if (enumC3489i6 != null) {
                return enumC3489i6;
            }
            if (b()) {
                return EnumC3489i6.i;
            }
            return null;
        }
        return EnumC3489i6.h;
    }
}
