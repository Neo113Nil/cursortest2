package ii;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import hi.InterfaceC4510a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public class f implements InterfaceC4510a {
    @Override // hi.InterfaceC4510a
    public List a() {
        return Arrays.asList("com.vivo.launcher");
    }

    @Override // hi.InterfaceC4510a
    public void b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i10);
        context.sendBroadcast(intent);
    }
}
