package androidx.work.impl.background.systemjob;

import Q2.AbstractC1508t;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.plaid.internal.EnumC3631g;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23847a;

    static {
        String i10 = AbstractC1508t.i("SystemJobScheduler");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"SystemJobScheduler\")");
        f23847a = i10;
    }

    public static final String a(Context context, WorkDatabase workDatabase, androidx.work.a configuration) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        int i10 = Build.VERSION.SDK_INT;
        int i11 = i10 >= 31 ? EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE : 100;
        int size = workDatabase.l().f().size();
        String str2 = "<faulty JobScheduler failed to getPendingJobs>";
        if (i10 >= 34) {
            JobScheduler c10 = c(context);
            List b10 = b(c10);
            if (b10 != null) {
                List g10 = m.g(context, c10);
                int size2 = g10 != null ? b10.size() - g10.size() : 0;
                String str3 = null;
                if (size2 == 0) {
                    str = null;
                } else {
                    str = size2 + " of which are not owned by WorkManager";
                }
                Object systemService = context.getSystemService("jobscheduler");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                List g11 = m.g(context, (JobScheduler) systemService);
                int size3 = g11 != null ? g11.size() : 0;
                if (size3 != 0) {
                    str3 = size3 + " from WorkManager in the default namespace";
                }
                str2 = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{b10.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str3}), ",\n", null, null, 0, null, null, 62, null);
            }
        } else {
            List g12 = m.g(context, c(context));
            if (g12 != null) {
                str2 = g12.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler " + i11 + " job limit exceeded.\nIn JobScheduler there are " + str2 + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + configuration.h() + '.';
    }

    public static final List b(JobScheduler jobScheduler) {
        Intrinsics.checkNotNullParameter(jobScheduler, "<this>");
        try {
            return a.f23845a.a(jobScheduler);
        } catch (Throwable th2) {
            AbstractC1508t.e().d(f23847a, "getAllPendingJobs() is not reliable on this device.", th2);
            return null;
        }
    }

    public static final JobScheduler c(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? c.f23846a.a(jobScheduler) : jobScheduler;
    }
}
