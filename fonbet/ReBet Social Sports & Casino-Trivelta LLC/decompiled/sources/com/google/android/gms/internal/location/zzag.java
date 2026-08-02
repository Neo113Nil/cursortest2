package com.google.android.gms.internal.location;

import V9.C1760p;
import V9.E;
import V9.InterfaceC1747c;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.BinderC3157u;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zzag extends e implements InterfaceC1747c {
    static final C3117a.g zza;
    public static final C3117a zzb;

    static {
        C3117a.g gVar = new C3117a.g();
        zza = gVar;
        zzb = new C3117a("ActivityRecognition.API", new zzad(), gVar);
    }

    public zzag(Activity activity) {
        super(activity, zzb, (C3117a.d) C3117a.d.f32289J4, e.a.f32290c);
    }

    public final Task<Void> removeActivityTransitionUpdates(final PendingIntent pendingIntent) {
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzx
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                C3117a c3117a = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                AbstractC3191o.n(zzafVar, "ResultHolder not provided.");
                ((zzo) ((zzf) obj).getService()).zzl(pendingIntent2, new BinderC3157u(zzafVar));
            }
        }).e(2406).a());
    }

    @Override // V9.InterfaceC1747c
    public final Task<Void> removeActivityUpdates(final PendingIntent pendingIntent) {
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzy
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                C3117a c3117a = zzag.zzb;
                ((zzf) obj).zzp(pendingIntent2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).e(2402).a());
    }

    public final Task<Void> removeSleepSegmentUpdates(final PendingIntent pendingIntent) {
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzab
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                C3117a c3117a = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                AbstractC3191o.n(pendingIntent2, "PendingIntent must be specified.");
                AbstractC3191o.n(zzafVar, "ResultHolder not provided.");
                ((zzo) ((zzf) obj).getService()).zzp(pendingIntent2, new BinderC3157u(zzafVar));
            }
        }).e(2411).a());
    }

    @Override // V9.InterfaceC1747c
    public final Task<Void> requestActivityTransitionUpdates(final ActivityTransitionRequest activityTransitionRequest, final PendingIntent pendingIntent) {
        activityTransitionRequest.g(getContextAttributionTag());
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzaa
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                ActivityTransitionRequest activityTransitionRequest2 = ActivityTransitionRequest.this;
                PendingIntent pendingIntent2 = pendingIntent;
                C3117a c3117a = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                AbstractC3191o.n(activityTransitionRequest2, "activityTransitionRequest must be specified.");
                AbstractC3191o.n(pendingIntent2, "PendingIntent must be specified.");
                AbstractC3191o.n(zzafVar, "ResultHolder not provided.");
                ((zzo) ((zzf) obj).getService()).zzq(activityTransitionRequest2, pendingIntent2, new BinderC3157u(zzafVar));
            }
        }).e(2405).a());
    }

    public final Task<Void> requestActivityUpdates(long j10, final PendingIntent pendingIntent) {
        C1760p c1760p = new C1760p();
        c1760p.a(j10);
        final com.google.android.gms.location.zzb b10 = c1760p.b();
        b10.g(getContextAttributionTag());
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzz
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                com.google.android.gms.location.zzb zzbVar = com.google.android.gms.location.zzb.this;
                PendingIntent pendingIntent2 = pendingIntent;
                C3117a c3117a = zzag.zzb;
                zzaf zzafVar = new zzaf((TaskCompletionSource) obj2);
                AbstractC3191o.n(zzbVar, "ActivityRecognitionRequest can't be null.");
                AbstractC3191o.n(pendingIntent2, "PendingIntent must be specified.");
                AbstractC3191o.n(zzafVar, "ResultHolder not provided.");
                ((zzo) ((zzf) obj).getService()).zzs(zzbVar, pendingIntent2, new BinderC3157u(zzafVar));
            }
        }).e(2401).a());
    }

    public final Task<Void> requestSleepSegmentUpdates(final PendingIntent pendingIntent, final SleepSegmentRequest sleepSegmentRequest) {
        AbstractC3191o.n(pendingIntent, "PendingIntent must be specified.");
        return doRead(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzac
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                zzag zzagVar = zzag.this;
                ((zzo) ((zzf) obj).getService()).zzt(pendingIntent, sleepSegmentRequest, new zzae(zzagVar, (TaskCompletionSource) obj2));
            }
        }).d(E.f12821b).e(2410).a());
    }

    public zzag(Context context) {
        super(context, zzb, C3117a.d.f32289J4, e.a.f32290c);
    }
}
