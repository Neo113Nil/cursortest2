package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzab;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzah;
import com.google.firebase.auth.internal.zzam;
import eb.C4196f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kb.C;
import kb.C5215A;
import kb.C5235u;
import kb.D;
import kb.InterfaceC5219d;
import lb.G;
import lb.InterfaceC5439s;
import lb.c0;
import lb.m0;
import lb.r;

/* loaded from: classes2.dex */
public final class zzacq extends zzafo {
    public zzacq(C4196f c4196f, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzaeo(c4196f, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(C4196f c4196f, String str, String str2) {
        return zza((zzacp) new zzacp(str, str2).zza(c4196f));
    }

    public final Task<InterfaceC5219d> zzb(C4196f c4196f, String str, String str2) {
        return zza((zzacs) new zzacs(str, str2).zza(c4196f));
    }

    public final Task<C> zzc(C4196f c4196f, String str, String str2) {
        return zza((zzacw) new zzacw(str, str2).zza(c4196f));
    }

    public final Task<Void> zzd(C4196f c4196f, FirebaseUser firebaseUser, String str, c0 c0Var) {
        return zza((zzaeg) new zzaeg(str).zza(c4196f).zza(firebaseUser).zza((zzaff<Void, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<Void> zza(C4196f c4196f, String str, String str2, String str3) {
        return zza((zzacr) new zzacr(str, str2, str3).zza(c4196f));
    }

    public final Task<Void> zzb(C4196f c4196f, FirebaseUser firebaseUser, AuthCredential authCredential, String str, c0 c0Var) {
        return zza((zzadg) new zzadg(authCredential, str).zza(c4196f).zza(firebaseUser).zza((zzaff<Void, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<AuthResult> zzc(C4196f c4196f, FirebaseUser firebaseUser, AuthCredential authCredential, String str, c0 c0Var) {
        return zza((zzadf) new zzadf(authCredential, str).zza(c4196f).zza(firebaseUser).zza((zzaff<AuthResult, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<AuthResult> zza(C4196f c4196f, String str, String str2, String str3, String str4, m0 m0Var) {
        return zza((zzacu) new zzacu(str, str2, str3, str4).zza(c4196f).zza((zzaff<AuthResult, m0>) m0Var));
    }

    public final Task<String> zzd(C4196f c4196f, String str, String str2) {
        return zza((zzaek) new zzaek(str, str2).zza(c4196f));
    }

    public final Task<AuthResult> zzb(C4196f c4196f, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, String str, c0 c0Var) {
        return zza((zzadh) new zzadh(emailAuthCredential, str).zza(c4196f).zza(firebaseUser).zza((zzaff<AuthResult, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<Void> zzc(C4196f c4196f, FirebaseUser firebaseUser, String str, c0 c0Var) {
        return zza((zzaed) new zzaed(str).zza(c4196f).zza(firebaseUser).zza((zzaff<Void, m0>) c0Var).zza((r) c0Var));
    }

    @NonNull
    public final Task<Void> zza(FirebaseUser firebaseUser, InterfaceC5439s interfaceC5439s) {
        return zza((zzact) new zzact().zza(firebaseUser).zza((zzaff<Void, InterfaceC5439s>) interfaceC5439s).zza((r) interfaceC5439s));
    }

    public final Task<Void> zza(C4196f c4196f, C5215A c5215a, FirebaseUser firebaseUser, String str, m0 m0Var) {
        zzagb.zza();
        zzacv zzacvVar = new zzacv(c5215a, firebaseUser.zze(), str, null);
        zzacvVar.zza(c4196f).zza((zzaff<Void, m0>) m0Var);
        return zza(zzacvVar);
    }

    public final Task<AuthResult> zzb(C4196f c4196f, FirebaseUser firebaseUser, String str, String str2, String str3, String str4, c0 c0Var) {
        return zza((zzadj) new zzadj(str, str2, str3, str4).zza(c4196f).zza(firebaseUser).zza((zzaff<AuthResult, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<Void> zza(C4196f c4196f, D d10, FirebaseUser firebaseUser, String str, String str2, m0 m0Var) {
        zzacv zzacvVar = new zzacv(d10, firebaseUser.zze(), str, str2);
        zzacvVar.zza(c4196f).zza((zzaff<Void, m0>) m0Var);
        return zza(zzacvVar);
    }

    public final Task<AuthResult> zzb(C4196f c4196f, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, c0 c0Var) {
        zzagb.zza();
        return zza((zzadl) new zzadl(phoneAuthCredential, str).zza(c4196f).zza(firebaseUser).zza((zzaff<AuthResult, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<AuthResult> zza(C4196f c4196f, FirebaseUser firebaseUser, C5215A c5215a, String str, m0 m0Var) {
        zzagb.zza();
        zzacy zzacyVar = new zzacy(c5215a, str, null);
        zzacyVar.zza(c4196f).zza((zzaff<AuthResult, m0>) m0Var);
        if (firebaseUser != null) {
            zzacyVar.zza(firebaseUser);
        }
        return zza(zzacyVar);
    }

    public final Task<Void> zzb(C4196f c4196f, String str, ActionCodeSettings actionCodeSettings, String str2, String str3) {
        actionCodeSettings.Y(6);
        return zza((zzadp) new zzadp(str, actionCodeSettings, str2, str3, "sendSignInLinkToEmail").zza(c4196f));
    }

    public final Task<AuthResult> zza(C4196f c4196f, FirebaseUser firebaseUser, D d10, String str, String str2, m0 m0Var) {
        zzacy zzacyVar = new zzacy(d10, str, str2);
        zzacyVar.zza(c4196f).zza((zzaff<AuthResult, m0>) m0Var);
        if (firebaseUser != null) {
            zzacyVar.zza(firebaseUser);
        }
        return zza(zzacyVar);
    }

    public final Task<AuthResult> zzb(C4196f c4196f, String str, String str2, String str3, String str4, m0 m0Var) {
        return zza((zzadw) new zzadw(str, str2, str3, str4).zza(c4196f).zza((zzaff<AuthResult, m0>) m0Var));
    }

    public final Task<C5235u> zza(C4196f c4196f, FirebaseUser firebaseUser, String str, c0 c0Var) {
        return zza((zzacx) new zzacx(str).zza(c4196f).zza(firebaseUser).zza((zzaff<C5235u, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<AuthResult> zzb(C4196f c4196f, FirebaseUser firebaseUser, String str, c0 c0Var) {
        AbstractC3191o.m(c4196f);
        AbstractC3191o.g(str);
        AbstractC3191o.m(firebaseUser);
        AbstractC3191o.m(c0Var);
        List zzg = firebaseUser.zzg();
        if ((zzg != null && !zzg.contains(str)) || firebaseUser.m()) {
            return Tasks.forException(zzaen.zza(new Status(17016, str)));
        }
        str.getClass();
        if (!str.equals("password")) {
            return zza((zzaee) new zzaee(str).zza(c4196f).zza(firebaseUser).zza((zzaff<AuthResult, m0>) c0Var).zza((r) c0Var));
        }
        return zza((zzaeb) new zzaeb().zza(c4196f).zza(firebaseUser).zza((zzaff<AuthResult, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<zzahr> zza() {
        return zza(new zzada());
    }

    public final Task<zzahs> zza(String str, String str2) {
        return zza(new zzacz(str, str2));
    }

    public final Task<AuthResult> zza(C4196f c4196f, FirebaseUser firebaseUser, AuthCredential authCredential, String str, c0 c0Var) {
        AbstractC3191o.m(c4196f);
        AbstractC3191o.m(authCredential);
        AbstractC3191o.m(firebaseUser);
        AbstractC3191o.m(c0Var);
        List zzg = firebaseUser.zzg();
        if (zzg != null && zzg.contains(authCredential.g())) {
            return Tasks.forException(zzaen.zza(new Status(17015)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (!emailAuthCredential.m()) {
                return zza((zzadc) new zzadc(emailAuthCredential, str).zza(c4196f).zza(firebaseUser).zza((zzaff<AuthResult, m0>) c0Var).zza((r) c0Var));
            }
            return zza((zzadd) new zzadd(emailAuthCredential).zza(c4196f).zza(firebaseUser).zza((zzaff<AuthResult, m0>) c0Var).zza((r) c0Var));
        }
        if (authCredential instanceof PhoneAuthCredential) {
            zzagb.zza();
            return zza((zzade) new zzade((PhoneAuthCredential) authCredential).zza(c4196f).zza(firebaseUser).zza((zzaff<AuthResult, m0>) c0Var).zza((r) c0Var));
        }
        AbstractC3191o.m(c4196f);
        AbstractC3191o.m(authCredential);
        AbstractC3191o.m(firebaseUser);
        AbstractC3191o.m(c0Var);
        return zza((zzadb) new zzadb(authCredential).zza(c4196f).zza(firebaseUser).zza((zzaff<AuthResult, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<Void> zza(C4196f c4196f, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, String str, c0 c0Var) {
        return zza((zzadi) new zzadi(emailAuthCredential, str).zza(c4196f).zza(firebaseUser).zza((zzaff<Void, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<Void> zza(C4196f c4196f, FirebaseUser firebaseUser, String str, String str2, String str3, String str4, c0 c0Var) {
        return zza((zzadk) new zzadk(str, str2, str3, str4).zza(c4196f).zza(firebaseUser).zza((zzaff<Void, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<Void> zza(C4196f c4196f, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, c0 c0Var) {
        zzagb.zza();
        return zza((zzadm) new zzadm(phoneAuthCredential, str).zza(c4196f).zza(firebaseUser).zza((zzaff<Void, m0>) c0Var).zza((r) c0Var));
    }

    @NonNull
    public final Task<Void> zza(C4196f c4196f, FirebaseUser firebaseUser, c0 c0Var) {
        return zza((zzado) new zzado().zza(c4196f).zza(firebaseUser).zza((zzaff<Void, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzadn(str, str2, str3, str4));
    }

    public final Task<Void> zza(C4196f c4196f, ActionCodeSettings actionCodeSettings, String str) {
        return zza((zzadq) new zzadq(str, actionCodeSettings).zza(c4196f));
    }

    public final Task<Void> zza(C4196f c4196f, String str, ActionCodeSettings actionCodeSettings, String str2, String str3) {
        actionCodeSettings.Y(1);
        return zza((zzadp) new zzadp(str, actionCodeSettings, str2, str3, "sendPasswordResetEmail").zza(c4196f));
    }

    @NonNull
    public final Task<Void> zza(String str) {
        return zza(new zzads(str));
    }

    public final Task<AuthResult> zza(C4196f c4196f, m0 m0Var, String str) {
        return zza((zzadr) new zzadr(str).zza(c4196f).zza((zzaff<AuthResult, m0>) m0Var));
    }

    public final Task<AuthResult> zza(C4196f c4196f, AuthCredential authCredential, String str, m0 m0Var) {
        return zza((zzadu) new zzadu(authCredential, str).zza(c4196f).zza((zzaff<AuthResult, m0>) m0Var));
    }

    public final Task<AuthResult> zza(C4196f c4196f, String str, String str2, m0 m0Var) {
        return zza((zzadt) new zzadt(str, str2).zza(c4196f).zza((zzaff<AuthResult, m0>) m0Var));
    }

    public final Task<AuthResult> zza(C4196f c4196f, EmailAuthCredential emailAuthCredential, String str, m0 m0Var) {
        return zza((zzadv) new zzadv(emailAuthCredential, str).zza(c4196f).zza((zzaff<AuthResult, m0>) m0Var));
    }

    public final Task<AuthResult> zza(C4196f c4196f, PhoneAuthCredential phoneAuthCredential, String str, m0 m0Var) {
        zzagb.zza();
        return zza((zzady) new zzady(phoneAuthCredential, str).zza(c4196f).zza((zzaff<AuthResult, m0>) m0Var));
    }

    public final Task<Void> zza(zzam zzamVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, String str5, boolean z12, PhoneAuthProvider.a aVar, Executor executor, Activity activity) {
        zzadx zzadxVar = new zzadx(zzamVar, str, str2, j10, z10, z11, str3, str4, str5, z12);
        zzadxVar.zza(aVar, activity, executor, str);
        return zza(zzadxVar);
    }

    public final Task<zzair> zza(zzam zzamVar, String str) {
        return zza(new zzaea(zzamVar, str));
    }

    public final Task<Void> zza(zzam zzamVar, PhoneMultiFactorInfo phoneMultiFactorInfo, String str, long j10, boolean z10, boolean z11, String str2, String str3, String str4, boolean z12, PhoneAuthProvider.a aVar, Executor executor, Activity activity) {
        zzadz zzadzVar = new zzadz(phoneMultiFactorInfo, AbstractC3191o.g(zzamVar.zzc()), str, j10, z10, z11, str2, str3, str4, z12);
        zzadzVar.zza(aVar, activity, executor, phoneMultiFactorInfo.a());
        return zza(zzadzVar);
    }

    public final Task<Void> zza(C4196f c4196f, FirebaseUser firebaseUser, String str, String str2, c0 c0Var) {
        return zza((zzaec) new zzaec(firebaseUser.zze(), str, str2).zza(c4196f).zza(firebaseUser).zza((zzaff<Void, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<Void> zza(C4196f c4196f, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, c0 c0Var) {
        zzagb.zza();
        return zza((zzaef) new zzaef(phoneAuthCredential).zza(c4196f).zza(firebaseUser).zza((zzaff<Void, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<Void> zza(C4196f c4196f, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, c0 c0Var) {
        return zza((zzaei) new zzaei(userProfileChangeRequest).zza(c4196f).zza(firebaseUser).zza((zzaff<Void, m0>) c0Var).zza((r) c0Var));
    }

    public final Task<Void> zza(String str, String str2, ActionCodeSettings actionCodeSettings) {
        actionCodeSettings.Y(7);
        return zza(new zzaeh(str, str2, actionCodeSettings));
    }

    @NonNull
    public static zzaf zza(C4196f c4196f, zzahk zzahkVar) {
        AbstractC3191o.m(c4196f);
        AbstractC3191o.m(zzahkVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzab(zzahkVar, "firebase"));
        List<zzaib> zzl = zzahkVar.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i10 = 0; i10 < zzl.size(); i10++) {
                arrayList.add(new zzab(zzl.get(i10)));
            }
        }
        zzaf zzafVar = new zzaf(c4196f, arrayList);
        zzafVar.v0(new zzah(zzahkVar.zzb(), zzahkVar.zza()));
        zzafVar.y0(zzahkVar.zzn());
        zzafVar.x0(zzahkVar.zze());
        zzafVar.s0(G.b(zzahkVar.zzk()));
        zzafVar.q0(zzahkVar.zzd());
        return zzafVar;
    }

    public final void zza(C4196f c4196f, zzaij zzaijVar, PhoneAuthProvider.a aVar, Activity activity, Executor executor) {
        zza((zzaej) new zzaej(zzaijVar).zza(c4196f).zza(aVar, activity, executor, zzaijVar.zzd()));
    }
}
