package com.google.android.gms.internal.p002firebaseauthapi;

import K9.c;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzahx {
    public static long zza(String str) {
        zzahw zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    @NonNull
    private static zzahw zzb(String str) {
        AbstractC3191o.g(str);
        List<String> zza = zzt.zza('.').zza((CharSequence) str);
        if (zza.size() >= 2) {
            try {
                return zzahw.zza(new String(c.b(zza.get(1)), "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("Unable to decode token", e10);
            }
        }
        throw new RuntimeException("Invalid idToken " + str);
    }
}
