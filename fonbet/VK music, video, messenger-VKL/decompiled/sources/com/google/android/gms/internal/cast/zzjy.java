package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzjy extends zzjn {
    public static final /* synthetic */ int zza = 0;
    private static final Set zzb;
    private static final zzjg zzc;
    private static final zzjw zzd;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zziq.zza, zziv.zza, zziw.zza)));
        zzb = unmodifiableSet;
        zzc = zzjj.zza(unmodifiableSet).zzb();
        zzd = new zzjw(null);
    }

    public /* synthetic */ zzjy(String str, String str2, boolean z, int i, Level level, Set set, zzjg zzjgVar, byte[] bArr) {
        super(str2);
        if (str2.length() > 23) {
            int i2 = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char charAt = str2.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i2 = length;
                    break;
                }
            }
            str2 = str2.substring(i2 + 1);
        }
        String concat = "".concat(String.valueOf(str2));
        concat.substring(0, Math.min(concat.length(), 23));
    }

    public static zzjw zzb() {
        return zzd;
    }
}
