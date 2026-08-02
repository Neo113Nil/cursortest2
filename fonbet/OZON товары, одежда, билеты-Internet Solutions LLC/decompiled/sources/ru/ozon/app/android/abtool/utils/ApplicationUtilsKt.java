package ru.ozon.app.android.abtool.utils;

import QI.b;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"restartApp", "", "context", "Landroid/content/Context;", "abzone_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ApplicationUtilsKt {
    public static final void restartApp(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        new Thread(new b(context, 2)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void restartApp$lambda$0(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return;
        }
        context.startActivity(Intent.makeRestartActivityTask(launchIntentForPackage.getComponent()));
        Process.killProcess(Process.myPid());
    }
}
