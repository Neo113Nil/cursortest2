package io.agora.iris;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;

/* loaded from: classes2.dex */
public class IrisEngine {
    private static String getAppPrivateStorageDir(Context context) {
        File externalFilesDir;
        return (!"mounted".equals(Environment.getExternalStorageState()) || (externalFilesDir = context.getExternalFilesDir(null)) == null) ? context.getFilesDir().getAbsolutePath() : externalFilesDir.getAbsolutePath();
    }

    private static int safeLoadLibrary(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        Log.i("IrisEngine", "load library " + str);
        try {
            System.loadLibrary(str);
            return 0;
        } catch (Exception e10) {
            Log.e("IrisEngine", "failed to load library " + str, e10);
            return -1;
        }
    }
}
