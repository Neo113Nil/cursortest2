package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import java.util.Objects;
import lb.AbstractC5433l;
import lb.r;

/* loaded from: classes2.dex */
final class zzafh implements zzaem {
    final /* synthetic */ zzaff zza;

    public zzafh(zzaff zzaffVar) {
        Objects.requireNonNull(zzaffVar);
        this.zza = zzaffVar;
    }

    private final void zza(zzafm zzafmVar) {
        this.zza.zzi.execute(new zzafn(this, zzafmVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzb(String str) {
        int i10 = this.zza.zza;
        AbstractC3191o.q(i10 == 8, "Unexpected response type " + i10);
        zza(new zzafj(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzc(String str) {
        int i10 = this.zza.zza;
        AbstractC3191o.q(i10 == 7, "Unexpected response type " + i10);
        zzaff.zza(this.zza);
    }

    private final void zza(Status status, AuthCredential authCredential, String str, String str2) {
        zzaff.zza(this.zza, status);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzn = authCredential;
        zzaffVar.zzo = str;
        zzaffVar.zzp = str2;
        r rVar = zzaffVar.zzf;
        if (rVar != null) {
            rVar.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzb() {
        int i10 = this.zza.zza;
        AbstractC3191o.q(i10 == 6, "Unexpected response type " + i10);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzc() {
        int i10 = this.zza.zza;
        AbstractC3191o.q(i10 == 9, "Unexpected response type " + i10);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        int i10 = this.zza.zza;
        AbstractC3191o.q(i10 == 8, "Unexpected response type " + i10);
        this.zza.zzu = true;
        zza(new zzafl(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzagv zzagvVar) {
        int i10 = this.zza.zza;
        AbstractC3191o.q(i10 == 3, "Unexpected response type " + i10);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzl = zzagvVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza() {
        int i10 = this.zza.zza;
        AbstractC3191o.q(i10 == 5, "Unexpected response type " + i10);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaap zzaapVar) {
        zza(zzaapVar.zza(), zzaapVar.zzb(), zzaapVar.zzc(), zzaapVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaas zzaasVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzq = zzaasVar;
        zzaffVar.zza(AbstractC5433l.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(Status status, PhoneAuthCredential phoneAuthCredential) {
        int i10 = this.zza.zza;
        AbstractC3191o.q(i10 == 2, "Unexpected response type " + i10);
        zza(status, phoneAuthCredential, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(Status status) {
        String j10 = status.j();
        if (j10 != null) {
            if (j10.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (j10.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (j10.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (j10.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (j10.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (j10.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (j10.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (j10.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (j10.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (j10.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzaff zzaffVar = this.zza;
        if (zzaffVar.zza == 8) {
            zzaffVar.zzu = true;
            zza(new zzafk(this, status));
        } else {
            zzaff.zza(zzaffVar, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahr zzahrVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzs = zzahrVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahs zzahsVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzr = zzahsVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar, zzahk zzahkVar) {
        int i10 = this.zza.zza;
        AbstractC3191o.q(i10 == 2, "Unexpected response type: " + i10);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzj = zzahvVar;
        zzaffVar.zzk = zzahkVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaif zzaifVar) {
        int i10 = this.zza.zza;
        AbstractC3191o.q(i10 == 4, "Unexpected response type " + i10);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzm = zzaifVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaig zzaigVar) {
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzair zzairVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzt = zzairVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar) {
        int i10 = this.zza.zza;
        AbstractC3191o.q(i10 == 1, "Unexpected response type: " + i10);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzj = zzahvVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(PhoneAuthCredential phoneAuthCredential) {
        int i10 = this.zza.zza;
        AbstractC3191o.q(i10 == 8, "Unexpected response type " + i10);
        this.zza.zzu = true;
        zza(new zzafi(this, phoneAuthCredential));
    }
}
