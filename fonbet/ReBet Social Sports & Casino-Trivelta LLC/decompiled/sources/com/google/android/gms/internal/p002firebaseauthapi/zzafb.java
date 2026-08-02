package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import eb.C4196f;

/* loaded from: classes2.dex */
public final class zzafb extends zzaft implements zzagn {
    private zzaev zza;
    private zzaey zzb;
    private zzafy zzc;
    private final zzafc zzd;
    private final C4196f zze;
    private String zzf;
    private zzafe zzg;

    public zzafb(C4196f c4196f, zzafc zzafcVar) {
        this(c4196f, zzafcVar, null, null, null, null);
    }

    private final zzafe zzb() {
        if (this.zzg == null) {
            this.zzg = new zzafe(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzags zzagsVar, zzafv<zzagv> zzafvVar) {
        AbstractC3191o.m(zzagsVar);
        AbstractC3191o.m(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/createAuthUri", this.zzf), zzagsVar, zzafvVar, zzagv.class, zzaevVar.zza);
    }

    private zzafb(C4196f c4196f, zzafc zzafcVar, zzafy zzafyVar, zzaev zzaevVar, zzaey zzaeyVar, zzaew zzaewVar) {
        this.zze = c4196f;
        this.zzf = c4196f.q().b();
        c4196f.q().g();
        this.zzd = (zzafc) AbstractC3191o.m(zzafcVar);
        zza(null, null, null, null);
        zzagl.zza(this.zzf, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzagu zzaguVar, zzafv<Void> zzafvVar) {
        AbstractC3191o.m(zzaguVar);
        AbstractC3191o.m(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/deleteAccount", this.zzf), zzaguVar, zzafvVar, Void.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzagx zzagxVar, zzafv<zzagw> zzafvVar) {
        AbstractC3191o.m(zzagxVar);
        AbstractC3191o.m(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/emailLinkSignin", this.zzf), zzagxVar, zzafvVar, zzagw.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzagz zzagzVar, zzafv<zzagy> zzafvVar) {
        AbstractC3191o.m(zzagzVar);
        AbstractC3191o.m(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzagzVar, zzafvVar, zzagy.class, zzaeyVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzahb zzahbVar, zzafv<zzaha> zzafvVar) {
        AbstractC3191o.m(zzahbVar);
        AbstractC3191o.m(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzahbVar, zzafvVar, zzaha.class, zzaeyVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzahj zzahjVar, zzafv<zzahv> zzafvVar) {
        AbstractC3191o.m(zzahjVar);
        AbstractC3191o.m(zzafvVar);
        zzafy zzafyVar = this.zzc;
        zzafu.zza(zzafyVar.zza("/token", this.zzf), zzahjVar, zzafvVar, zzahv.class, zzafyVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzahi zzahiVar, zzafv<zzahl> zzafvVar) {
        AbstractC3191o.m(zzahiVar);
        AbstractC3191o.m(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/getAccountInfo", this.zzf), zzahiVar, zzafvVar, zzahl.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzahm zzahmVar, zzafv<zzahp> zzafvVar) {
        AbstractC3191o.m(zzahmVar);
        AbstractC3191o.m(zzafvVar);
        if (zzahmVar.zzb() != null) {
            zzb().zzb(zzahmVar.zzb().zze());
        }
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/getOobConfirmationCode", this.zzf), zzahmVar, zzafvVar, zzahp.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaho zzahoVar, zzafv<zzahr> zzafvVar) {
        AbstractC3191o.m(zzahoVar);
        AbstractC3191o.m(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/getRecaptchaParam", this.zzf), zzafvVar, zzahr.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaht zzahtVar, zzafv<zzahs> zzafvVar) {
        AbstractC3191o.m(zzahtVar);
        AbstractC3191o.m(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        String str = zzaeyVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzahtVar.zzb() + "&version=" + zzahtVar.zzc();
        if (!zzac.zzc(zzahtVar.zzd())) {
            str = str + "&tenantId=" + zzahtVar.zzd();
        }
        zzafu.zza(str, zzafvVar, zzahs.class, zzaeyVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagn
    public final void zza() {
        zza(null, null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaic zzaicVar, zzafv<zzaif> zzafvVar) {
        AbstractC3191o.m(zzaicVar);
        AbstractC3191o.m(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/resetPassword", this.zzf), zzaicVar, zzafvVar, zzaif.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaie zzaieVar, zzafv<zzaig> zzafvVar) {
        AbstractC3191o.m(zzaieVar);
        AbstractC3191o.m(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts:revokeToken", this.zzf), zzaieVar, zzafvVar, zzaig.class, zzaeyVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaij zzaijVar, zzafv<zzaii> zzafvVar) {
        AbstractC3191o.m(zzaijVar);
        AbstractC3191o.m(zzafvVar);
        if (!TextUtils.isEmpty(zzaijVar.zzc())) {
            zzb().zzb(zzaijVar.zzc());
        }
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/sendVerificationCode", this.zzf), zzaijVar, zzafvVar, zzaii.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzail zzailVar, zzafv<zzaik> zzafvVar) {
        AbstractC3191o.m(zzailVar);
        AbstractC3191o.m(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/setAccountInfo", this.zzf), zzailVar, zzafvVar, zzaik.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(String str, zzafv<Void> zzafvVar) {
        AbstractC3191o.m(zzafvVar);
        zzb().zza(str);
        zzafvVar.zza((zzafv<Void>) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaim zzaimVar, zzafv<zzaip> zzafvVar) {
        AbstractC3191o.m(zzaimVar);
        AbstractC3191o.m(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/signupNewUser", this.zzf), zzaimVar, zzafvVar, zzaip.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaio zzaioVar, zzafv<zzair> zzafvVar) {
        AbstractC3191o.m(zzaioVar);
        AbstractC3191o.m(zzafvVar);
        if (zzaioVar instanceof zzais) {
            zzais zzaisVar = (zzais) zzaioVar;
            if (!TextUtils.isEmpty(zzaisVar.zzb())) {
                zzb().zzb(zzaisVar.zzb());
            }
        }
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzaioVar, zzafvVar, zzair.class, zzaeyVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaiq zzaiqVar, zzafv<zzait> zzafvVar) {
        AbstractC3191o.m(zzaiqVar);
        AbstractC3191o.m(zzafvVar);
        if (!TextUtils.isEmpty(zzaiqVar.zzb())) {
            zzb().zzb(zzaiqVar.zzb());
        }
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaSignIn:start", this.zzf), zzaiqVar, zzafvVar, zzait.class, zzaeyVar.zza);
    }

    private final void zza(zzafy zzafyVar, zzaev zzaevVar, zzaey zzaeyVar, zzaew zzaewVar) {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String zza = zzagi.zza("firebear.secureToken");
        if (TextUtils.isEmpty(zza)) {
            zza = zzagl.zzd(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + zza);
        }
        if (this.zzc == null) {
            this.zzc = new zzafy(zza, zzb());
        }
        String zza2 = zzagi.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza2)) {
            zza2 = zzagl.zzb(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + zza2);
        }
        if (this.zza == null) {
            this.zza = new zzaev(zza2, zzb());
        }
        String zza3 = zzagi.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(zza3)) {
            zza3 = zzagl.zzc(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + zza3);
        }
        if (this.zzb == null) {
            this.zzb = new zzaey(zza3, zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzajb zzajbVar, zzafv<zzajd> zzafvVar) {
        AbstractC3191o.m(zzajbVar);
        AbstractC3191o.m(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/verifyAssertion", this.zzf), zzajbVar, zzafvVar, zzajd.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzajc zzajcVar, zzafv<zzajf> zzafvVar) {
        AbstractC3191o.m(zzajcVar);
        AbstractC3191o.m(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/verifyCustomToken", this.zzf), zzajcVar, zzafvVar, zzajf.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaje zzajeVar, zzafv<zzajh> zzafvVar) {
        AbstractC3191o.m(zzajeVar);
        AbstractC3191o.m(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/verifyPassword", this.zzf), zzajeVar, zzafvVar, zzajh.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzajg zzajgVar, zzafv<zzajj> zzafvVar) {
        AbstractC3191o.m(zzajgVar);
        AbstractC3191o.m(zzafvVar);
        zzaev zzaevVar = this.zza;
        zzafu.zza(zzaevVar.zza("/verifyPhoneNumber", this.zzf), zzajgVar, zzafvVar, zzajj.class, zzaevVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaft
    public final void zza(zzaji zzajiVar, zzafv<zzajl> zzafvVar) {
        AbstractC3191o.m(zzajiVar);
        AbstractC3191o.m(zzafvVar);
        zzaey zzaeyVar = this.zzb;
        zzaey.zza(zzaeyVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzajiVar, zzafvVar, zzajl.class, zzaeyVar.zza);
    }
}
