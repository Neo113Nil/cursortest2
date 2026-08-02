package com.google.android.gms.tasks;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c4z;
import xsna.t4z;

/* compiled from: com.google.android.gms:play-services-tasks@@18.4.1 */
/* loaded from: classes13.dex */
final class zzv extends c4z {
    private final List zza;

    private zzv(t4z t4zVar) {
        super(t4zVar);
        this.zza = new ArrayList();
        this.mLifecycleFragment.Hm("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        t4z fragment = c4z.getFragment(activity);
        synchronized (fragment) {
            try {
                zzvVar = (zzv) fragment.Y3(zzv.class, "TaskOnStopCallback");
                if (zzvVar == null) {
                    zzvVar = new zzv(fragment);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzvVar;
    }

    @Override // xsna.c4z
    public final void onStop() {
        List list = this.zza;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                    if (zzqVar != null) {
                        zzqVar.zzb();
                    }
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzq zzqVar) {
        List list = this.zza;
        synchronized (list) {
            list.add(new WeakReference(zzqVar));
        }
    }
}
