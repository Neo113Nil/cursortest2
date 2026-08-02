package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.exc0;
import xsna.ezk0;
import xsna.f5o0;
import xsna.gl01;
import xsna.ouf0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class zzag extends b {
    static final a.g zza;
    public static final a zzb;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzb = new a("ActivityRecognition.API", new zzad(), gVar);
    }

    public zzag(Activity activity) {
        super(activity, (a<a.d.c>) zzb, a.d.U6, b.a.c);
    }

    public final Task<Void> removeActivityTransitionUpdates(final PendingIntent pendingIntent) {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzx
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                a aVar = zzag.zzb;
                ((zzo) ((zzf) obj).getService()).zzl(pendingIntent2, new ezk0(new zzaf((TaskCompletionSource) obj2)));
            }
        };
        a.e = 2406;
        return doWrite(a.a());
    }

    public final Task<Void> removeActivityUpdates(final PendingIntent pendingIntent) {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzy
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                a aVar = zzag.zzb;
                ((zzf) obj).zzp(pendingIntent2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        };
        a.e = 2402;
        return doWrite(a.a());
    }

    public final Task<Void> removeSleepSegmentUpdates(final PendingIntent pendingIntent) {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzab
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                a aVar = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                exc0.j(pendingIntent2, "PendingIntent must be specified.");
                ((zzo) ((zzf) obj).getService()).zzp(pendingIntent2, new ezk0(zzafVar));
            }
        };
        a.e = 2411;
        return doWrite(a.a());
    }

    public final Task<Void> requestActivityTransitionUpdates(final ActivityTransitionRequest activityTransitionRequest, final PendingIntent pendingIntent) {
        activityTransitionRequest.e = getContextAttributionTag();
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzaa
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ActivityTransitionRequest activityTransitionRequest2 = ActivityTransitionRequest.this;
                PendingIntent pendingIntent2 = pendingIntent;
                a aVar = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                exc0.j(activityTransitionRequest2, "activityTransitionRequest must be specified.");
                exc0.j(pendingIntent2, "PendingIntent must be specified.");
                ((zzo) ((zzf) obj).getService()).zzq(activityTransitionRequest2, pendingIntent2, new ezk0(zzafVar));
            }
        };
        a.e = 2405;
        return doWrite(a.a());
    }

    public final Task<Void> requestActivityUpdates(long j, final PendingIntent pendingIntent) {
        exc0.a("intervalMillis can't be negative.", j >= 0);
        exc0.k("Must set intervalMillis.", j != Long.MIN_VALUE);
        final com.google.android.gms.location.zzb zzbVar = new com.google.android.gms.location.zzb(j, true, null, null, null, false, null, 0L, null);
        zzbVar.j = getContextAttributionTag();
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzz
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                com.google.android.gms.location.zzb zzbVar2 = com.google.android.gms.location.zzb.this;
                PendingIntent pendingIntent2 = pendingIntent;
                a aVar = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                exc0.j(zzbVar2, "ActivityRecognitionRequest can't be null.");
                exc0.j(pendingIntent2, "PendingIntent must be specified.");
                ((zzo) ((zzf) obj).getService()).zzs(zzbVar2, pendingIntent2, new ezk0(zzafVar));
            }
        };
        a.e = 2401;
        return doWrite(a.a());
    }

    public final Task<Void> requestSleepSegmentUpdates(final PendingIntent pendingIntent, final SleepSegmentRequest sleepSegmentRequest) {
        exc0.j(pendingIntent, "PendingIntent must be specified.");
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzac
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                zzag zzagVar = zzag.this;
                ((zzo) ((zzf) obj).getService()).zzt(pendingIntent, sleepSegmentRequest, new zzae(zzagVar, (TaskCompletionSource) obj2));
            }
        };
        a.d = new Feature[]{gl01.a};
        a.e = 2410;
        return doRead(a.a());
    }

    public zzag(Context context) {
        super(context, (a<a.d.c>) zzb, a.d.U6, b.a.c);
    }
}
