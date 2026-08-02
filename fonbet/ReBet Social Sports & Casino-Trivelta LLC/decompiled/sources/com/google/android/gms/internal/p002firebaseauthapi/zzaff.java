package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3136j;
import com.google.android.gms.common.api.internal.InterfaceC3138k;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;
import eb.C4196f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import lb.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzaff<ResultT, CallbackT> implements zzafq<ResultT> {
    protected final int zza;
    protected C4196f zzc;
    protected FirebaseUser zzd;
    protected CallbackT zze;
    protected r zzf;
    protected zzafg<ResultT> zzg;
    protected Executor zzi;
    protected zzahv zzj;
    protected zzahk zzk;
    protected zzagv zzl;
    protected zzaif zzm;
    protected AuthCredential zzn;
    protected String zzo;
    protected String zzp;
    protected zzaas zzq;
    protected zzahs zzr;
    protected zzahr zzs;
    protected zzair zzt;
    boolean zzu;
    protected final zzafh zzb = new zzafh(this);
    protected final List<PhoneAuthProvider.a> zzh = new ArrayList();

    public static class zza extends AbstractC3136j {
        private final List<PhoneAuthProvider.a> zza;

        private zza(InterfaceC3138k interfaceC3138k, List<PhoneAuthProvider.a> list) {
            super(interfaceC3138k);
            this.mLifecycleFragment.h("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<PhoneAuthProvider.a> list) {
            InterfaceC3138k fragment = AbstractC3136j.getFragment(activity);
            if (((zza) fragment.s("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC3136j
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaff(int i10) {
        this.zza = i10;
    }

    public final zzaff<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = (CallbackT) AbstractC3191o.n(callbackt, "external callback cannot be null");
        return this;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzaff<ResultT, CallbackT> zza(r rVar) {
        this.zzf = (r) AbstractC3191o.n(rVar, "external failure callback cannot be null");
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(C4196f c4196f) {
        this.zzc = (C4196f) AbstractC3191o.n(c4196f, "firebaseApp cannot be null");
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(FirebaseUser firebaseUser) {
        this.zzd = (FirebaseUser) AbstractC3191o.n(firebaseUser, "firebaseUser cannot be null");
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(PhoneAuthProvider.a aVar, Activity activity, Executor executor, String str) {
        PhoneAuthProvider.a zza2 = zzagb.zza(str, aVar, this);
        synchronized (this.zzh) {
            this.zzh.add((PhoneAuthProvider.a) AbstractC3191o.m(zza2));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) AbstractC3191o.m(executor);
        return this;
    }

    public static /* synthetic */ void zza(zzaff zzaffVar) {
        zzaffVar.zzb();
        AbstractC3191o.q(zzaffVar.zzu, "no success or failure set on method implementation");
    }

    public static /* synthetic */ void zza(zzaff zzaffVar, Status status) {
        r rVar = zzaffVar.zzf;
        if (rVar != null) {
            rVar.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}
