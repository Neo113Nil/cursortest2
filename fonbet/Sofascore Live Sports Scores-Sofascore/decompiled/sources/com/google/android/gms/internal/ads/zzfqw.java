package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zzfqw {
    static zzfqw c(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean matches;
        zzfqw e = e(i, context);
        if (e instanceof zzfqy) {
            zzfqy zzfqyVar = (zzfqy) e;
            zzfqyVar.h();
            zzfqyVar.g(i2);
            zzfqyVar.d(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ia), str);
            }
            if (matches) {
                zzfqyVar.zze(str);
            }
        }
        return e;
    }

    static zzfqw e(int i, Context context) {
        boolean booleanValue;
        if (zzfrj.a()) {
            int i2 = i - 2;
            if (i2 == 20 || i2 == 21) {
                booleanValue = ((Boolean) zzbla.e.c()).booleanValue();
            } else if (i2 != 110) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbla.c.c()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbla.d.c()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbla.b.c()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.qa)).booleanValue();
            }
            if (booleanValue) {
                return new zzfqy(context, i);
            }
        }
        return new zzfrz();
    }

    zzfqw a(Throwable th);

    zzfqw b(com.google.android.gms.ads.internal.client.zze zzeVar);

    zzfqw d(zzfrl zzfrlVar);

    zzfqw f(zzfln zzflnVar);

    zzfqw g(int i);

    zzfqw zza();

    boolean zzb();

    zzfqw zzc();

    zzfqw zzd(boolean z);

    zzfqw zze(String str);

    zzfqw zzi(String str);

    zzfqw zzk(String str);

    boolean zzl();

    zzfqz zzm();
}
