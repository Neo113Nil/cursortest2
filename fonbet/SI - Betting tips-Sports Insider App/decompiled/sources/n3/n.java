package n3;

import android.content.Context;
import android.os.PowerManager;
import e3.x;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class n {
    static {
        Intrinsics.checkNotNullExpressionValue(x.g("WakeLocks"), "tagWithPrefix(...)");
    }

    public static final PowerManager.WakeLock a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("ProcessorForegroundLck", "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "WorkManager: ProcessorForegroundLck");
        synchronized (o.f20844a) {
        }
        Intrinsics.checkNotNull(newWakeLock);
        return newWakeLock;
    }
}
