package com.google.android.gms.internal.p002firebaseauthapi;

import G9.a;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import eb.C4196f;
import java.util.concurrent.ScheduledExecutorService;
import kb.AbstractC5239y;
import kb.C5215A;
import kb.D;
import kb.F;

/* loaded from: classes2.dex */
public final class zzaeo {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzaar zzb;
    private final zzagc zzc;

    public zzaeo(C4196f c4196f, ScheduledExecutorService scheduledExecutorService) {
        AbstractC3191o.m(c4196f);
        Context l10 = c4196f.l();
        AbstractC3191o.m(l10);
        this.zzb = new zzaar(new zzafb(c4196f, zzafc.zza()));
        this.zzc = new zzagc(l10, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zza(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, String str2, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zzb(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzc(String str, String str2, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zzc(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzd(String str, String str2, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zzd(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zze(String str, String str2, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        this.zzb.zze(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzf(String str, String str2, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zzf(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zze(String str, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zzf(str, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaic zzaicVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzaicVar);
        AbstractC3191o.g(zzaicVar.zzb());
        AbstractC3191o.m(zzaemVar);
        this.zzb.zza(zzaicVar, new zzael(zzaemVar, zza));
    }

    public final void zzd(String str, zzaem zzaemVar) {
        AbstractC3191o.m(zzaemVar);
        this.zzb.zze(str, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zzb(str, new zzael(zzaemVar, zza));
    }

    public final void zzc(String str, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zzc(str, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zza(str, str2, str3, str4, new zzael(zzaemVar, zza));
    }

    public final void zzb(@NonNull zzahm zzahmVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzahmVar);
        AbstractC3191o.g(zzahmVar.zzc());
        AbstractC3191o.m(zzaemVar);
        this.zzb.zzb(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zzc(zzahm zzahmVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzahmVar);
        this.zzb.zzc(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zza(str, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.m(zzaemVar);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zzb(str, str2, str3, str4, new zzael(zzaemVar, zza));
    }

    public final void zza(AbstractC5239y abstractC5239y, String str, String str2, String str3, zzaem zzaemVar) {
        zzagz zza2;
        AbstractC3191o.m(abstractC5239y);
        AbstractC3191o.h(str, "cachedTokenState should not be empty.");
        AbstractC3191o.m(zzaemVar);
        if (abstractC5239y instanceof C5215A) {
            PhoneAuthCredential a10 = ((C5215A) abstractC5239y).a();
            zza2 = zzahd.zza(str, (String) AbstractC3191o.m(a10.zzc()), (String) AbstractC3191o.m(a10.j()), str2, str3);
        } else if (abstractC5239y instanceof D) {
            D d10 = (D) abstractC5239y;
            zza2 = zzahf.zza(str, AbstractC3191o.g(str2), AbstractC3191o.g(((F) AbstractC3191o.m(d10.a())).a()), AbstractC3191o.g(d10.c()), str3);
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        this.zzb.zza(zza2, str, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, AbstractC5239y abstractC5239y, String str2, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(abstractC5239y);
        AbstractC3191o.m(zzaemVar);
        if (abstractC5239y instanceof C5215A) {
            PhoneAuthCredential a10 = ((C5215A) abstractC5239y).a();
            this.zzb.zza(zzahc.zza(str, (String) AbstractC3191o.m(a10.zzc()), (String) AbstractC3191o.m(a10.j()), str2), new zzael(zzaemVar, zza));
        } else {
            if (abstractC5239y instanceof D) {
                D d10 = (D) abstractC5239y;
                this.zzb.zza(zzahe.zza(str, AbstractC3191o.g(d10.c()), str2, AbstractC3191o.g(d10.b())), new zzael(zzaemVar, zza));
                return;
            }
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
    }

    public final void zza(zzaho zzahoVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzahoVar);
        this.zzb.zza(zzahoVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaht zzahtVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzahtVar);
        this.zzb.zza(zzahtVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.g(str3);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, zzajb zzajbVar, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzajbVar);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zza(str, zzajbVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzahz zzahzVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzaemVar);
        AbstractC3191o.m(zzahzVar);
        this.zzb.zza(AbstractC3191o.g(zzahzVar.zzb()), zzahzVar.zza(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzaie zzaieVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzaieVar);
        this.zzb.zza(zzaieVar, new zzael(zzaemVar, zza));
    }

    public final void zza(@NonNull zzahm zzahmVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzahmVar);
        AbstractC3191o.g(zzahmVar.zzd());
        AbstractC3191o.m(zzaemVar);
        this.zzb.zza(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaij zzaijVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzaemVar);
        AbstractC3191o.m(zzaijVar);
        String zzd = zzaijVar.zzd();
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(zzd)) {
            if (zzaijVar.zze()) {
                this.zzc.zzb(zzd);
            } else {
                this.zzc.zzb(zzaelVar, zzd);
                return;
            }
        }
        long zzb = zzaijVar.zzb();
        boolean zzf = zzaijVar.zzf();
        if (zza(zzb, zzf)) {
            zzaijVar.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(zzd, zzaelVar, zzb, zzf);
        this.zzb.zza(zzaijVar, this.zzc.zza(zzaelVar, zzd));
    }

    public final void zza(zzain zzainVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzainVar);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zzd(zzainVar.zza(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzajb zzajbVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzajbVar);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zza(zzajbVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzajc zzajcVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzajcVar);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zza(zzajcVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzagx zzagxVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzaemVar);
        AbstractC3191o.m(zzagxVar.zzb());
        this.zzb.zza(zzagxVar.zzb(), zzagxVar.zzc(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzaan zzaanVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzaemVar);
        AbstractC3191o.m(zzaanVar);
        this.zzb.zza(zzafw.zza((PhoneAuthCredential) AbstractC3191o.m(zzaanVar.zza())), new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j10, boolean z10, boolean z11, String str4, String str5, String str6, boolean z12, zzaem zzaemVar) {
        AbstractC3191o.h(str, "idToken should not be empty.");
        AbstractC3191o.m(zzaemVar);
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(str2)) {
            if (z10) {
                this.zzc.zzb(str2);
            } else {
                this.zzc.zzb(zzaelVar, str2);
                return;
            }
        }
        zzais zza2 = zzais.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j10, z12)) {
            zza2.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzaelVar, j10, z12);
        this.zzb.zza(zza2, this.zzc.zza(zzaelVar, str2));
    }

    public final void zza(zzaaq zzaaqVar, zzaem zzaemVar) {
        AbstractC3191o.m(zzaaqVar);
        AbstractC3191o.m(zzaemVar);
        String b10 = zzaaqVar.zzb().b();
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(b10)) {
            if (zzaaqVar.zzh()) {
                this.zzc.zzb(b10);
            } else {
                this.zzc.zzb(zzaelVar, b10);
                return;
            }
        }
        long zza2 = zzaaqVar.zza();
        boolean zzi = zzaaqVar.zzi();
        zzaiq zza3 = zzaiq.zza(zzaaqVar.zze(), zzaaqVar.zzb().a(), zzaaqVar.zzb().b(), zzaaqVar.zzd(), zzaaqVar.zzg(), zzaaqVar.zzf(), zzaaqVar.zzc());
        if (zza(zza2, zzi)) {
            zza3.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(b10, zzaelVar, zza2, zzi);
        this.zzb.zza(zza3, this.zzc.zza(zzaelVar, b10));
    }

    public final void zza(zzaiu zzaiuVar, zzaem zzaemVar) {
        this.zzb.zza(zzaiuVar, new zzael((zzaem) AbstractC3191o.m(zzaemVar), zza));
    }

    public final void zza(String str, String str2, String str3, zzaem zzaemVar) {
        AbstractC3191o.h(str, "cachedTokenState should not be empty.");
        AbstractC3191o.h(str2, "uid should not be empty.");
        AbstractC3191o.m(zzaemVar);
        this.zzb.zza(str, str2, str3, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzaem zzaemVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(userProfileChangeRequest);
        AbstractC3191o.m(zzaemVar);
        this.zzb.zza(str, userProfileChangeRequest, new zzael(zzaemVar, zza));
    }

    private static boolean zza(long j10, boolean z10) {
        if (j10 > 0 && z10) {
            return true;
        }
        zza.h("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
