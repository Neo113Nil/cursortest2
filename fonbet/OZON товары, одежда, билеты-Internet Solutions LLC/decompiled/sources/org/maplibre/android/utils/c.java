package org.maplibre.android.utils;

import androidx.annotation.NonNull;
import java.io.File;
import org.maplibre.android.log.Logger;

/* loaded from: classes10.dex */
public final class c {

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f79997a;

        a(String str) {
            this.f79997a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = this.f79997a;
            try {
                File file = new File(str);
                if (file.exists()) {
                    if (file.delete()) {
                        Logger.d("Mbgl-FileUtils", "File deleted to save space: " + str);
                    } else {
                        Logger.e("Mbgl-FileUtils", "Failed to delete file: " + str);
                    }
                }
            } catch (Exception e11) {
                Logger.e("Mbgl-FileUtils", "Failed to delete file: ", e11);
            }
        }
    }

    public static void a(@NonNull String str) {
        new Thread(new a(str)).start();
    }
}
