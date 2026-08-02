package ru.ozon.app.android.utils;

import B90.o0;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "context", "", "restartApp", "(Landroid/content/Context;)V", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApplicationUtilsKt {
    public static final void restartApp(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        new Thread(new o0(context, 5)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void restartApp$lambda$0(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return;
        }
        Intent makeRestartActivityTask = Intent.makeRestartActivityTask(launchIntentForPackage.getComponent());
        Thread.sleep(300L);
        context.startActivity(makeRestartActivityTask);
        Process.killProcess(Process.myPid());
    }
}
