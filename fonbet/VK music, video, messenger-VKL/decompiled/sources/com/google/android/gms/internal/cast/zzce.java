package com.google.android.gms.internal.cast;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import xsna.cyz0;
import xsna.exc0;
import xsna.fx10;
import xsna.g0a;
import xsna.hui0;
import xsna.jpg0;
import xsna.lvf0;
import xsna.o100;
import xsna.pxi0;
import xsna.ub9;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
@TargetApi(30)
/* loaded from: classes12.dex */
public final class zzce {
    public static final /* synthetic */ int zza = 0;
    private static final o100 zzb = new o100("SessionTransController", null);
    private final CastOptions zzc;
    private boolean zzh;
    private hui0 zzi;

    @Nullable
    private ub9.a zzj;

    @Nullable
    private SessionState zzk;
    private final Set zzd = Collections.synchronizedSet(new HashSet());
    private int zzg = 0;
    private final Handler zze = new zzfk(Looper.getMainLooper());
    private final Runnable zzf = new Runnable() { // from class: com.google.android.gms.internal.cast.zzcd
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            zzce.this.zzh();
        }
    };

    public zzce(CastOptions castOptions) {
        this.zzc = castOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final void zzl() {
        Handler handler = this.zze;
        exc0.i(handler);
        Runnable runnable = this.zzf;
        exc0.i(runnable);
        handler.removeCallbacks(runnable);
        this.zzg = 0;
        this.zzk = null;
    }

    private final void zzr(int i) {
        ub9.a aVar = this.zzj;
        if (aVar != null) {
            aVar.c();
        }
        zzb.a("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.zzg), Integer.valueOf(i));
        Iterator it = new HashSet(this.zzd).iterator();
        while (it.hasNext()) {
            ((pxi0) it.next()).onTransferFailed(this.zzg, i);
        }
        zzl();
    }

    @Nullable
    private final lvf0 zzs() {
        hui0 hui0Var = this.zzi;
        if (hui0Var == null) {
            zzb.a("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        g0a c = hui0Var.c();
        if (c != null) {
            return c.k();
        }
        zzb.a("skip transferring as CastSession is null", new Object[0]);
        return null;
    }

    public final void zza(hui0 hui0Var) {
        this.zzi = hui0Var;
        Handler handler = this.zze;
        exc0.i(handler);
        handler.post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzca
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzce.this.zzi();
            }
        });
    }

    public final void zzb(boolean z) {
        this.zzh = z;
    }

    public final void zzc(pxi0 pxi0Var) {
        zzb.a("register callback = %s", pxi0Var);
        exc0.e("Must be called from the main thread.");
        exc0.i(pxi0Var);
        this.zzd.add(pxi0Var);
    }

    public final void zzd(pxi0 pxi0Var) {
        zzb.a("unregister callback = %s", pxi0Var);
        exc0.e("Must be called from the main thread.");
        if (pxi0Var != null) {
            this.zzd.remove(pxi0Var);
        }
    }

    public final void zze(fx10.h hVar, fx10.h hVar2, ub9.a aVar) {
        Task task;
        Set set = this.zzd;
        SessionState sessionState = null;
        if (new HashSet(set).isEmpty()) {
            zzb.a("No need to prepare transfer without any callback", new Object[0]);
            aVar.b(null);
            return;
        }
        int i = 1;
        if (hVar.l != 1) {
            zzb.a("No need to prepare transfer when transferring from local", new Object[0]);
            aVar.b(null);
            return;
        }
        lvf0 zzs = zzs();
        if (zzs == null || !zzs.k()) {
            zzb.a("No need to prepare transfer when there is no media session", new Object[0]);
            aVar.b(null);
            return;
        }
        o100 o100Var = zzb;
        o100Var.a("Prepare route transfer for changing endpoint", new Object[0]);
        if (hVar2.l == 0) {
            zzr.zzb(zzpm.CAST_TRANSFER_TO_LOCAL_USED);
        } else {
            i = CastDevice.j(hVar2.s) == null ? 3 : 2;
        }
        this.zzg = i;
        this.zzj = aVar;
        o100Var.a("notify transferring with type = %d", Integer.valueOf(i));
        Iterator it = new HashSet(set).iterator();
        while (it.hasNext()) {
            ((pxi0) it.next()).onTransferring(this.zzg);
        }
        this.zzk = null;
        exc0.e("Must be called from the main thread.");
        if (zzs.H()) {
            zzs.g = new TaskCompletionSource();
            lvf0.l.a("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
            MediaInfo g = zzs.g();
            MediaStatus h = zzs.h();
            if (g != null && h != null) {
                Boolean bool = Boolean.TRUE;
                long d = zzs.d();
                MediaQueueData mediaQueueData = h.w;
                double d2 = h.e;
                if (Double.compare(d2, 2.0d) > 0 || Double.compare(d2, 0.5d) < 0) {
                    throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                }
                sessionState = new SessionState(new MediaLoadRequestData(g, mediaQueueData, bool, d, d2, h.l, h.p, null, null, null, null, 0L), null);
            }
            if (sessionState != null) {
                zzs.g.setResult(sessionState);
            } else {
                zzs.g.setException(new com.google.android.gms.cast.internal.zzap());
            }
            task = zzs.g.getTask();
        } else {
            task = Tasks.forException(new com.google.android.gms.cast.internal.zzap());
        }
        task.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast.zzcb
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(Object obj) {
                zzce.this.zzj((SessionState) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.internal.cast.zzcc
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                zzce.this.zzk(exc);
            }
        });
        Handler handler = this.zze;
        exc0.i(handler);
        Runnable runnable = this.zzf;
        exc0.i(runnable);
        handler.postDelayed(runnable, 20000L);
    }

    public final void zzf(fx10 fx10Var) {
        if (zzg()) {
            hui0 hui0Var = this.zzi;
            if ((hui0Var != null ? hui0Var.c() : null) == null) {
                fx10Var.getClass();
                fx10.i(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            fx10Var.getClass();
            fx10.b();
            Iterator<fx10.h> it = fx10.c().j.iterator();
            while (it.hasNext()) {
                fx10.h next = it.next();
                if (CastDevice.j(next.s) != null) {
                    arrayList.add(new jpg0.c(new jpg0.c.a(next.c)));
                }
            }
            zzb.a("updateRouteListingPreference with %d available routes", Integer.valueOf(arrayList.size()));
            jpg0.b bVar = new jpg0.b();
            bVar.a = Collections.EMPTY_LIST;
            bVar.b = true;
            bVar.a = Collections.unmodifiableList(new ArrayList(arrayList));
            fx10.i(new jpg0(bVar));
        }
    }

    public final boolean zzg() {
        return this.zzh && this.zzc.r;
    }

    public final void zzh() {
        zzb.c("transfer with type = %d has timed out", Integer.valueOf(this.zzg));
        zzr(101);
    }

    public final /* synthetic */ void zzi() {
        zzbz zzbzVar = new zzbz(this, null);
        hui0 hui0Var = this.zzi;
        exc0.i(hui0Var);
        hui0Var.a(zzbzVar);
    }

    public final /* synthetic */ void zzj(SessionState sessionState) {
        this.zzk = sessionState;
        ub9.a aVar = this.zzj;
        if (aVar != null) {
            aVar.b(null);
        }
    }

    public final void zzk(Exception exc) {
        zzb.c("Fail to store SessionState", new Object[0]);
        zzr(100);
    }

    public final /* synthetic */ void zzm() {
        int i = this.zzg;
        if (i == 0) {
            zzb.a("No need to notify transferred if the transfer type is unknown", new Object[0]);
            return;
        }
        SessionState sessionState = this.zzk;
        if (sessionState == null) {
            zzb.a("No need to notify with null sessionState", new Object[0]);
            return;
        }
        zzb.a("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i), this.zzk);
        Iterator it = new HashSet(this.zzd).iterator();
        while (it.hasNext()) {
            ((pxi0) it.next()).onTransferred(this.zzg, sessionState);
        }
    }

    public final void zzn() {
        MediaLoadRequestData mediaLoadRequestData;
        if (this.zzk == null) {
            zzb.a("skip restoring session state due to null SessionState", new Object[0]);
            return;
        }
        lvf0 zzs = zzs();
        if (zzs == null) {
            zzb.a("skip restoring session state due to null RemoteMediaClient", new Object[0]);
            return;
        }
        zzb.a("resume SessionState to current session", new Object[0]);
        SessionState sessionState = this.zzk;
        if (sessionState == null || (mediaLoadRequestData = sessionState.b) == null) {
            return;
        }
        lvf0.l.a("resume SessionState", new Object[0]);
        exc0.e("Must be called from the main thread.");
        if (zzs.H()) {
            lvf0.J(new cyz0(zzs, mediaLoadRequestData));
        } else {
            lvf0.G();
        }
    }

    public final /* synthetic */ int zzp() {
        return this.zzg;
    }
}
