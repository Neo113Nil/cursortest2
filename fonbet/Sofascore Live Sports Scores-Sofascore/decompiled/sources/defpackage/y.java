package defpackage;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class y {
    public static final int a = Process.myUid();
    public static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public static String c = "";
    public static final x d = new x(0);

    public static final void a(ActivityManager activityManager) {
        if (cw3.a.contains(y.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == a) {
                        Thread thread = Looper.getMainLooper().getThread();
                        thread.getClass();
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        JSONArray jSONArray = new JSONArray();
                        stackTrace.getClass();
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            jSONArray.put(stackTraceElement.toString());
                        }
                        String jSONArray2 = jSONArray.toString();
                        if (!Intrinsics.c(jSONArray2, c) && f6a.v(thread)) {
                            c = jSONArray2;
                            b6a.j(processErrorStateInfo.shortMsg, jSONArray2).b();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            cw3.a(y.class, th);
        }
    }
}
