package T2;

import Q2.AbstractC1508t;
import X2.e;
import X2.g;
import X2.h;
import Y2.C1822m;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10859a = AbstractC1508t.i("Alarms");

    public static void a(Context context, WorkDatabase workDatabase, h hVar) {
        e i10 = workDatabase.i();
        SystemIdInfo a10 = i10.a(hVar);
        if (a10 != null) {
            b(context, hVar, a10.systemId);
            AbstractC1508t.e().a(f10859a, "Removing SystemIdInfo for workSpecId (" + hVar + ")");
            i10.d(hVar);
        }
    }

    public static void b(Context context, h hVar, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.b(context, hVar), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        AbstractC1508t.e().a(f10859a, "Cancelling existing alarm with (workSpecId, systemId) (" + hVar + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    public static void c(Context context, WorkDatabase workDatabase, h hVar, long j10) {
        e i10 = workDatabase.i();
        SystemIdInfo a10 = i10.a(hVar);
        if (a10 != null) {
            b(context, hVar, a10.systemId);
            d(context, hVar, a10.systemId, j10);
        } else {
            int c10 = new C1822m(workDatabase).c();
            i10.e(g.a(hVar, c10));
            d(context, hVar, c10, j10);
        }
    }

    public static void d(Context context, h hVar, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.b(context, hVar), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }
}
