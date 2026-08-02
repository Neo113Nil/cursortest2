package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C3188l;
import java.util.List;
import kotlin.time.DurationKt;

/* loaded from: classes2.dex */
public final class zzafc {
    private final int zza;

    private zzafc(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> zza = zzt.zza("[.-]").zza((CharSequence) str);
            if (zza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (zza.size() >= 3) {
                return (Integer.parseInt(zza.get(0)) * DurationKt.NANOS_IN_MILLIS) + (Integer.parseInt(zza.get(1)) * 1000) + Integer.parseInt(zza.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e10) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            String.format("Version code parsing failed for: %s with exception %s.", str, e10);
            return -1;
        }
    }

    public final String zzb() {
        return String.format("X%s", Integer.toString(this.zza));
    }

    public static zzafc zza() {
        String b10 = C3188l.a().b("firebase-auth");
        if (TextUtils.isEmpty(b10) || b10.equals("UNKNOWN")) {
            b10 = "-1";
        }
        return new zzafc(b10);
    }
}
