package com.appsflyer.internal;

import Sc.r;
import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFf1dSDK {
    private static /* synthetic */ boolean AFInAppEventParameterName(AFf1dSDK aFf1dSDK, String str) {
        return valueOf(str, TimeUnit.HOURS, 1L);
    }

    private static boolean valueOf(String str, @NotNull TimeUnit timeUnit, long j11) {
        Long y02;
        Object a11;
        Intrinsics.checkNotNullParameter(timeUnit, "");
        if (str != null && (y02 = kotlin.text.h.y0(str)) != null) {
            try {
                r.Companion companion = Sc.r.INSTANCE;
                a11 = Boolean.valueOf(Math.abs(y02.longValue() - TimeUnit.MILLISECONDS.toSeconds(AFb1tSDK.valueOf().values().unregisterClient().values())) < timeUnit.toSeconds(1L));
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                a11 = Sc.s.a(th2);
            }
            Throwable b11 = Sc.r.b(a11);
            if (b11 != null) {
                StringBuilder sb2 = new StringBuilder("Could not convert ");
                sb2.append(str);
                sb2.append(" to TS");
                AFLogger.afErrorLog(sb2.toString(), b11);
            }
            if (a11 instanceof r.b) {
                a11 = null;
            }
            Boolean bool = (Boolean) a11;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    public final boolean AFKeystoreWrapper(String str) {
        return AFInAppEventParameterName(this, str);
    }
}
