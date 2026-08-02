package org.chromium.base;

import android.net.Uri;
import java.io.File;

/* loaded from: classes10.dex */
public abstract class FileProviderUtils {
    private static final String TAG = "FileProviderUtils";
    private static FileProviderUtil sFileProviderUtil;
    private static final Object sLock = new Object();

    public interface FileProviderUtil {
        Uri getContentUriFromFile(File file);
    }

    private FileProviderUtils() {
    }

    public static void setFileProviderUtil(FileProviderUtil util) {
        synchronized (sLock) {
            sFileProviderUtil = util;
        }
    }

    public static Uri getContentUriFromFile(File file) {
        synchronized (sLock) {
            FileProviderUtil fileProviderUtil = sFileProviderUtil;
            if (fileProviderUtil == null) {
                return null;
            }
            return fileProviderUtil.getContentUriFromFile(file);
        }
    }
}
