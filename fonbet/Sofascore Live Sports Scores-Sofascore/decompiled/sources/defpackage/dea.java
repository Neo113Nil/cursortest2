package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class dea {
    public static final /* synthetic */ int a = 0;

    static {
        rik.x("SystemJobScheduler");
    }

    public static final JobScheduler a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? q9.h(jobScheduler) : jobScheduler;
    }
}
