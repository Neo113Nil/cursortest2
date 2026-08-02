package ij;

import C.o0;
import android.app.DownloadManager;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.activity.ActivityC5043j;
import androidx.appcompat.app.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pj.C8938a;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.OzonInAppUpdateSdkBlockingActivity;
import ru.ozon.app.android.R;

/* renamed from: ij.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7084a {

    /* renamed from: a, reason: collision with root package name */
    private d f66499a;

    private static void b(g activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            int i11 = lj.c.f73376d;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Set set = lj.c.f73375c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (androidx.core.content.a.checkSelfPermission(activity, (String) obj) != 0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                return;
            }
        }
        new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Ozon").mkdirs();
    }

    private static DownloadManager.Request c(g gVar, ru.ozon.android.inAppUpdate.internal.ui.g gVar2, String str, String str2) {
        DownloadManager.Request mimeType = new DownloadManager.Request(Uri.parse(str)).setAllowedNetworkTypes(3).setNotificationVisibility(0).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "Ozon/" + str2).setMimeType("application/vnd.android.package-archive");
        mimeType.setTitle(gVar.getString(R.string.in_app_update_notification_title, gVar2.e().a()));
        mimeType.setDescription(gVar.getString(R.string.in_app_update_notification_description));
        return mimeType;
    }

    private final d f(Context context) {
        d dVar = this.f66499a;
        if (dVar != null) {
            return dVar;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        d dVar2 = new d(applicationContext);
        this.f66499a = dVar2;
        return dVar2;
    }

    public static boolean g(@NotNull String apkName, @NotNull String appVersion) {
        Intrinsics.checkNotNullParameter(apkName, "apkName");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        int i11 = C8938a.f81237c;
        C8938a.b("Trying to find a new version of the app(version = " + appVersion + ") that has already been downloaded.");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(apkName);
        sb2.append("-");
        String c11 = o0.c(sb2, appVersion, ".apk");
        String c12 = G.g.c(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath(), File.separator, "Ozon");
        File file = null;
        try {
            File[] listFiles = new File(c12).listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    File file2 = listFiles[i12];
                    if (Intrinsics.d(file2.getName(), c11)) {
                        file = file2;
                        break;
                    }
                    i12++;
                }
            }
        } catch (Exception e11) {
            int i13 = C8938a.f81237c;
            C8938a.c("Cannot check if APK is present in directory " + c12, e11);
        }
        boolean z11 = file != null;
        if (z11) {
            int i14 = C8938a.f81237c;
            C8938a.b("Found a previously downloaded actual version(" + appVersion + ") of the app. It will be used for updating. File = " + file);
        } else {
            int i15 = C8938a.f81237c;
            C8938a.b("Did not find a downloaded early new version(" + appVersion + ") of the application in the directory = " + c12 + ".");
        }
        return z11;
    }

    public final void a(@NotNull OzonInAppUpdateSdkBlockingActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C7085b.a(activity).remove(f(activity).b());
        int i11 = C8938a.f81237c;
        C8938a.b("Download was cancelled");
    }

    public final boolean d(@NotNull g activity, @NotNull ru.ozon.android.inAppUpdate.internal.ui.g config) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            b(activity);
            DownloadManager.Request c11 = c(activity, config, config.c().a().getLink(), config.b() + "-" + config.c().a().getVersion() + ".apk");
            int i11 = C8938a.f81237c;
            C8938a.b("Apk download has started");
            f(activity).c(C7085b.a(activity).enqueue(c11));
            return true;
        } catch (Exception e11) {
            C8938a.c(null, e11);
            return false;
        }
    }

    public final int e(@NotNull ActivityC5043j context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long b11 = f(context).b();
        int i11 = C8938a.f81237c;
        C8938a.b("Download downloadId = " + b11);
        return C7085b.b(C7085b.a(context), b11);
    }

    public final void h(@NotNull Context context, @NotNull Function1<? super Boolean, Unit> onDownloadResult) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(onDownloadResult, "onDownloadResult");
        c cVar = new c(f(context), onDownloadResult);
        Intrinsics.checkNotNullParameter(context, "context");
        androidx.core.content.a.registerReceiver(context, cVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
    }
}
