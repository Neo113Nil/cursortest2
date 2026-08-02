package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* compiled from: BenchmarkOperation.java */
/* loaded from: classes12.dex */
public final class a {
    public static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = a(file2) && z;
        }
        return z;
    }

    public static void b(@NonNull Context context, @NonNull ProfileInstallReceiver.a aVar) {
        if (a(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
            aVar.a(14, null);
        } else {
            aVar.a(15, null);
        }
    }
}
