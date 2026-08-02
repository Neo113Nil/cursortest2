package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class zzoe extends zzjv {
    private static final void zzb(Set<Character> set, String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            set.add(Character.valueOf(str.charAt(i11)));
        }
    }

    private static final String zzc(String str, int i11, Set<Character> set) {
        if (i11 == 1) {
            try {
                return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
            } catch (UnsupportedEncodingException unused) {
                return str;
            }
        }
        if (i11 != 2) {
            return str;
        }
        String replace = str.replace("\\", "\\\\");
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            String ch2 = it.next().toString();
            String valueOf = String.valueOf(ch2);
            replace = replace.replace(ch2, valueOf.length() != 0 ? "\\".concat(valueOf) : new String("\\"));
        }
        return replace;
    }

    @Override // com.google.android.gms.internal.gtm.zzjv
    protected final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        zzqw<?> zzqwVar;
        zzqw<?> zzqwVar2;
        boolean z11 = true;
        Preconditions.checkArgument(true);
        int length = zzqwVarArr.length;
        Preconditions.checkArgument(length > 0);
        zzqw<?> zzqwVar3 = zzqwVarArr[0];
        zzqw<?> zzqwVar4 = length > 1 ? zzqwVarArr[1] : zzra.zze;
        int i11 = 2;
        String zzd = (length <= 2 || (zzqwVar2 = zzqwVarArr[2]) == zzra.zze) ? "" : zzju.zzd(zzqwVar2);
        String str = "=";
        if (length > 3 && (zzqwVar = zzqwVarArr[3]) != zzra.zze) {
            str = zzju.zzd(zzqwVar);
        }
        HashSet hashSet = null;
        if (zzqwVar4 != zzra.zze) {
            Preconditions.checkArgument(zzqwVar4 instanceof zzrh);
            if (ImagesContract.URL.equals(zzqwVar4.zzc())) {
                i11 = 1;
            } else {
                if (!"backslash".equals(zzqwVar4.zzc())) {
                    return new zzrh("");
                }
                hashSet = new HashSet();
                zzb(hashSet, zzd);
                zzb(hashSet, str);
                hashSet.remove('\\');
            }
        } else {
            i11 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        if (zzqwVar3 instanceof zzrd) {
            for (zzqw<?> zzqwVar5 : ((zzrd) zzqwVar3).zzk()) {
                if (!z11) {
                    sb2.append(zzd);
                }
                sb2.append(zzc(zzju.zzd(zzqwVar5), i11, hashSet));
                z11 = false;
            }
        } else if (zzqwVar3 instanceof zzre) {
            Map<String, zzqw<?>> zzi = ((zzre) zzqwVar3).zzi();
            for (String str2 : zzi.keySet()) {
                if (!z11) {
                    sb2.append(zzd);
                }
                String zzd2 = zzju.zzd(zzi.get(str2));
                sb2.append(zzc(str2, i11, hashSet));
                sb2.append(str);
                sb2.append(zzc(zzd2, i11, hashSet));
                z11 = false;
            }
        } else {
            sb2.append(zzc(zzju.zzd(zzqwVar3), i11, hashSet));
        }
        return new zzrh(sb2.toString());
    }
}
