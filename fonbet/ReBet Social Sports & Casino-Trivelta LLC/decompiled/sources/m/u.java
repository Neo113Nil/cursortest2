package m;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;

/* loaded from: classes.dex */
public abstract class u extends Service {

    public static class a {
        public static int a() {
            return 512;
        }
    }

    public static ServiceInfo a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) u.class), a.a() | 128);
    }
}
