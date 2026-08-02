package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzfb;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.h6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3269h6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f34041a;

    public C3269h6(Context context) {
        AbstractC3191o.m(context);
        this.f34041a = context;
    }

    public static final void i(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
        }
    }

    public static final boolean j(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
        return true;
    }

    public final void a() {
        this.f34041a.getClass().getSimpleName().concat(" is starting up.");
    }

    public final void b() {
        this.f34041a.getClass().getSimpleName().concat(" is shutting down.");
    }

    public final int c(final Intent intent, int i10, final int i11) {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.f34041a;
        C3298l3 O10 = C3298l3.O(context, null, null);
        final C3392x2 a10 = O10.a();
        String action = intent.getAction();
        O10.c();
        a10.w().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            k(S6.F(context), new Runnable() { // from class: com.google.android.gms.measurement.internal.g6
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C3269h6.this.f(i11, a10, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder d(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new N3(S6.F(this.f34041a), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    public final boolean e(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        "onStartJob received action: ".concat(String.valueOf(string));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) AbstractC3191o.m(string);
            S6 F10 = S6.F(this.f34041a);
            final C3392x2 a10 = F10.a();
            F10.c();
            a10.w().b("Local AppMeasurementJobService called. action", str);
            k(F10, new Runnable() { // from class: com.google.android.gms.measurement.internal.e6
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C3269h6.this.g(a10, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        zzfb.zza(this.f34041a, null).zzw(new Runnable() { // from class: com.google.android.gms.measurement.internal.f6
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                C3269h6.this.h(jobParameters);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void f(int i10, C3392x2 c3392x2, Intent intent) {
        Context context = this.f34041a;
        InterfaceC3237d6 interfaceC3237d6 = (InterfaceC3237d6) context;
        if (interfaceC3237d6.zza(i10)) {
            c3392x2.w().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            C3298l3.O(context, null, null).a().w().a("Completed wakeful intent.");
            interfaceC3237d6.a(intent);
        }
    }

    public final /* synthetic */ void g(C3392x2 c3392x2, JobParameters jobParameters) {
        c3392x2.w().a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC3237d6) this.f34041a).b(jobParameters, false);
    }

    public final /* synthetic */ void h(JobParameters jobParameters) {
        ((InterfaceC3237d6) this.f34041a).b(jobParameters, false);
    }

    public final void k(S6 s62, Runnable runnable) {
        s62.b().t(new RunnableC3229c6(this, s62, runnable));
    }
}
