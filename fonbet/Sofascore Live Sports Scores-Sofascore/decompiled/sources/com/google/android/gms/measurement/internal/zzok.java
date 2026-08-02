package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.zzce;
import defpackage.ozo;
import defpackage.p0p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzok extends p0p {
    public final AlarmManager e;
    public ozo f;
    public Integer g;

    public zzok(zzpg zzpgVar) {
        super(zzpgVar);
        this.e = (AlarmManager) ((zzic) this.b).a.getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    @Override // defpackage.p0p
    public final void T() {
        AlarmManager alarmManager = this.e;
        if (alarmManager != null) {
            Context context = ((zzic) this.b).a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzce.a));
        }
        V();
    }

    public final void U() {
        R();
        zzic zzicVar = (zzic) this.b;
        zzgu zzguVar = zzicVar.f;
        zzic.m(zzguVar);
        zzguVar.o.a("Unscheduling upload");
        AlarmManager alarmManager = this.e;
        if (alarmManager != null) {
            Context context = zzicVar.a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzce.a));
        }
        ozo ozoVar = this.f;
        if (ozoVar == null) {
            ozoVar = new ozo(this, this.c.l, 1);
            this.f = ozoVar;
        }
        ozoVar.c();
        V();
    }

    public final void V() {
        JobScheduler jobScheduler = (JobScheduler) ((zzic) this.b).a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(W());
        }
    }

    public final int W() {
        Integer num = this.g;
        if (num == null) {
            num = Integer.valueOf("measurement".concat(String.valueOf(((zzic) this.b).a.getPackageName())).hashCode());
            this.g = num;
        }
        return num.intValue();
    }
}
