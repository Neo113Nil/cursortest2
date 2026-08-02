package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.gms.internal.consent_sdk.zzbe;
import com.google.android.gms.internal.consent_sdk.zzbz;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oln implements Application.ActivityLifecycleCallbacks {
    public final Activity a;
    public final /* synthetic */ zzbe b;

    public oln(zzbe zzbeVar, Activity activity) {
        Objects.requireNonNull(zzbeVar);
        this.b = zzbeVar;
        this.a = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzbe zzbeVar = this.b;
        Dialog dialog = zzbeVar.g;
        AtomicReference atomicReference = zzbeVar.l;
        if (dialog == null || !zzbeVar.m) {
            return;
        }
        dialog.setOwnerActivity(activity);
        zzbz zzbzVar = zzbeVar.b;
        if (zzbzVar != null) {
            zzbzVar.a = activity;
        }
        oln olnVar = (oln) atomicReference.getAndSet(null);
        if (olnVar != null) {
            olnVar.b.a.unregisterActivityLifecycleCallbacks(olnVar);
            oln olnVar2 = new oln(zzbeVar, activity);
            zzbeVar.a.registerActivityLifecycleCallbacks(olnVar2);
            atomicReference.set(olnVar2);
        }
        Dialog dialog2 = zzbeVar.g;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.a) {
            return;
        }
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        zzbe zzbeVar = this.b;
        if (isChangingConfigurations && zzbeVar.m && (dialog = zzbeVar.g) != null) {
            dialog.dismiss();
            return;
        }
        zzg zzgVar = new zzg(3, "Activity is destroyed.");
        Dialog dialog2 = zzbeVar.g;
        if (dialog2 != null) {
            dialog2.dismiss();
            zzbeVar.g = null;
        }
        zzbeVar.b.a = null;
        oln olnVar = (oln) zzbeVar.l.getAndSet(null);
        if (olnVar != null) {
            olnVar.b.a.unregisterActivityLifecycleCallbacks(olnVar);
        }
        p7f p7fVar = (p7f) zzbeVar.k.getAndSet(null);
        if (p7fVar == null) {
            return;
        }
        zzbeVar.d(zzgVar);
        zzgVar.d();
        p7fVar.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
