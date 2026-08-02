package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.zze;
import lb.AbstractC5433l;

/* loaded from: classes2.dex */
public final class zzaar {
    private final zzaft zza;

    public zzaar(zzaft zzaftVar) {
        this.zza = (zzaft) AbstractC3191o.m(zzaftVar);
    }

    public final void zzb(String str, String str2, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.m(zzaelVar);
        zza(str, new zzacj(this, str2, zzaelVar));
    }

    public final void zzc(String str, String str2, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.m(zzaelVar);
        zza(str, new zzacm(this, str2, zzaelVar));
    }

    public final void zzd(String str, String str2, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(new zzaic(str, null, str2), new zzabe(this, zzaelVar));
    }

    public final void zze(String str, String str2, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(new zzags(str, str2), new zzabc(this, zzaelVar));
    }

    public final void zzf(String str, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzaelVar);
        zza(str, new zzabn(this, zzaelVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzajd zzajdVar, zzael zzaelVar, zzafs zzafsVar) {
        Status a10;
        if (zzajdVar.zzo()) {
            zze zzb = zzajdVar.zzb();
            String zzc = zzajdVar.zzc();
            String zzj = zzajdVar.zzj();
            if (zzajdVar.zzm()) {
                a10 = new Status(17012);
            } else {
                a10 = AbstractC5433l.a(zzajdVar.zzd());
            }
            zzaelVar.zza(new zzaap(a10, zzb, zzc, zzj));
            return;
        }
        zzaarVar.zza(new zzahv(zzajdVar.zzi(), zzajdVar.zze(), Long.valueOf(zzajdVar.zza()), "Bearer"), zzajdVar.zzh(), zzajdVar.zzg(), Boolean.valueOf(zzajdVar.zzn()), zzajdVar.zzb(), zzaelVar, zzafsVar);
    }

    public final void zzf(String str, String str2, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.m(zzaelVar);
        zza(str2, new zzabq(this, str, zzaelVar));
    }

    private final void zzd(zzahm zzahmVar, zzael zzaelVar) {
        AbstractC3191o.m(zzahmVar);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(zzahmVar, new zzacf(this, zzaelVar));
    }

    public final void zzb(String str, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(new zzahj(str), new zzaau(this, zzaelVar));
    }

    public final void zzc(String str, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzaelVar);
        zza(str, new zzacc(this, zzaelVar));
    }

    public final void zze(String str, zzael zzaelVar) {
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(new zzaim(str), new zzaci(this, zzaelVar));
    }

    public final void zzc(zzahm zzahmVar, zzael zzaelVar) {
        zzd(zzahmVar, zzaelVar);
    }

    public final void zzd(String str, zzael zzaelVar) {
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(str, new zzacg(this, zzaelVar));
    }

    public final void zzb(zzahm zzahmVar, zzael zzaelVar) {
        AbstractC3191o.g(zzahmVar.zzc());
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(zzahmVar, new zzabb(this, zzaelVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(new zzaje(str, str2, str3, str4), new zzaaw(this, zzaelVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzaim zzaimVar, zzafs zzafsVar) {
        AbstractC3191o.m(zzaelVar);
        AbstractC3191o.m(zzaimVar);
        AbstractC3191o.m(zzafsVar);
        zzaarVar.zza.zza(zzaimVar, new zzabk(zzaarVar, zzaelVar, zzafsVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzahv zzahvVar, zzail zzailVar, zzafs zzafsVar) {
        AbstractC3191o.m(zzaelVar);
        AbstractC3191o.m(zzahvVar);
        AbstractC3191o.m(zzailVar);
        AbstractC3191o.m(zzafsVar);
        zzaarVar.zza.zza(new zzahi(zzahvVar.zzc()), new zzaax(zzaarVar, zzafsVar, zzaelVar, zzahvVar, zzailVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzahv zzahvVar, zzahk zzahkVar, zzail zzailVar, zzafs zzafsVar) {
        AbstractC3191o.m(zzaelVar);
        AbstractC3191o.m(zzahvVar);
        AbstractC3191o.m(zzahkVar);
        AbstractC3191o.m(zzailVar);
        AbstractC3191o.m(zzafsVar);
        zzaarVar.zza.zza(zzailVar, new zzaba(zzaarVar, zzailVar, zzahkVar, zzaelVar, zzahvVar, zzafsVar));
    }

    public final void zza(String str, String str2, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzaelVar);
        zzail zzailVar = new zzail();
        zzailVar.zze(str);
        zzailVar.zzh(str2);
        this.zza.zza(zzailVar, new zzacl(this, zzaelVar));
    }

    public final void zza(zzaic zzaicVar, zzael zzaelVar) {
        AbstractC3191o.g(zzaicVar.zzb());
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(zzaicVar, new zzabg(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(new zzaim(str, str2, null, str3, str4, null), new zzaat(this, zzaelVar));
    }

    public final void zza(String str, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzaelVar);
        zza(str, new zzace(this, zzaelVar));
    }

    private final void zza(String str, zzafv<zzahv> zzafvVar) {
        AbstractC3191o.m(zzafvVar);
        AbstractC3191o.g(str);
        zzahv zzb = zzahv.zzb(str);
        if (zzb.zzg()) {
            zzafvVar.zza((zzafv<zzahv>) zzb);
        } else {
            this.zza.zza(new zzahj(zzb.zzd()), new zzaco(this, zzafvVar));
        }
    }

    public final void zza(zzagz zzagzVar, String str, zzael zzaelVar) {
        AbstractC3191o.m(zzagzVar);
        AbstractC3191o.m(zzaelVar);
        zza(str, new zzabw(this, zzagzVar, zzaelVar));
    }

    public final void zza(zzahb zzahbVar, zzael zzaelVar) {
        AbstractC3191o.m(zzahbVar);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(zzahbVar, new zzaby(this, zzaelVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagx zzagxVar, zzael zzaelVar) {
        AbstractC3191o.m(zzagxVar);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(zzagxVar, new zzaay(this, zzaelVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahv zzahvVar, String str, String str2, Boolean bool, zze zzeVar, zzael zzaelVar, zzafs zzafsVar) {
        AbstractC3191o.m(zzahvVar);
        AbstractC3191o.m(zzafsVar);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(new zzahi(zzahvVar.zzc()), new zzaaz(this, zzafsVar, str2, str, bool, zzeVar, zzaelVar, zzahvVar));
    }

    public final void zza(zzaho zzahoVar, zzael zzaelVar) {
        AbstractC3191o.m(zzahoVar);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(zzahoVar, new zzabz(this, zzaelVar));
    }

    public final void zza(zzaht zzahtVar, zzael zzaelVar) {
        AbstractC3191o.m(zzahtVar);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(zzahtVar, new zzaca(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.g(str3);
        AbstractC3191o.m(zzaelVar);
        zza(str3, new zzabh(this, str, str2, str4, str5, zzaelVar));
    }

    public final void zza(String str, zzajb zzajbVar, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzajbVar);
        AbstractC3191o.m(zzaelVar);
        zza(str, new zzabl(this, zzajbVar, zzaelVar));
    }

    public final void zza(String str, zzajg zzajgVar, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(zzajgVar);
        AbstractC3191o.m(zzaelVar);
        zza(str, new zzabj(this, zzajgVar, zzaelVar));
    }

    public final void zza(zzaie zzaieVar, zzael zzaelVar) {
        this.zza.zza(zzaieVar, new zzach(this, zzaelVar));
    }

    public final void zza(zzahm zzahmVar, zzael zzaelVar) {
        AbstractC3191o.g(zzahmVar.zzd());
        AbstractC3191o.m(zzaelVar);
        zzd(zzahmVar, zzaelVar);
    }

    public final void zza(zzaij zzaijVar, zzael zzaelVar) {
        AbstractC3191o.g(zzaijVar.zzd());
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(zzaijVar, new zzabf(this, zzaelVar));
    }

    public final void zza(zzajb zzajbVar, zzael zzaelVar) {
        AbstractC3191o.m(zzajbVar);
        AbstractC3191o.m(zzaelVar);
        zzajbVar.zzb(true);
        this.zza.zza(zzajbVar, new zzabu(this, zzaelVar));
    }

    public final void zza(zzajc zzajcVar, zzael zzaelVar) {
        AbstractC3191o.m(zzajcVar);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(zzajcVar, new zzabd(this, zzaelVar));
    }

    public final void zza(EmailAuthCredential emailAuthCredential, String str, zzael zzaelVar) {
        AbstractC3191o.m(emailAuthCredential);
        AbstractC3191o.m(zzaelVar);
        if (emailAuthCredential.zzg()) {
            zza(emailAuthCredential.l(), new zzaav(this, emailAuthCredential, str, zzaelVar));
        } else {
            zza(new zzagx(emailAuthCredential, null, str), zzaelVar);
        }
    }

    public final void zza(zzajg zzajgVar, zzael zzaelVar) {
        AbstractC3191o.m(zzajgVar);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(zzajgVar, new zzabi(this, zzaelVar));
    }

    public final void zza(zzaio zzaioVar, zzael zzaelVar) {
        AbstractC3191o.m(zzaioVar);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(zzaioVar, new zzabt(this, zzaioVar, zzaelVar));
    }

    public final void zza(zzaiq zzaiqVar, zzael zzaelVar) {
        AbstractC3191o.m(zzaiqVar);
        AbstractC3191o.m(zzaelVar);
        this.zza.zza(zzaiqVar, new zzabx(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.m(zzaelVar);
        zza(str, new zzabs(this, str2, str3, zzaelVar));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzael zzaelVar) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(userProfileChangeRequest);
        AbstractC3191o.m(zzaelVar);
        zza(str, new zzack(this, userProfileChangeRequest, zzaelVar));
    }
}
