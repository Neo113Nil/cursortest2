package org.chromium.base;

import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import internal.org.jni_zero.CalledByNative;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public abstract class PathUtils {
    static {
        new AtomicBoolean();
    }

    private PathUtils() {
    }

    private static String[] a(List<File> list) {
        ArrayList arrayList = new ArrayList();
        for (File file : list) {
            if (file != null && !TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @CalledByNative
    public static String[] getAllPrivateDownloadsDirectories() {
        List arrayList = new ArrayList();
        o j11 = o.j();
        try {
            File[] externalFilesDirs = e.b().getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = Arrays.asList(externalFilesDirs);
            }
            j11.close();
            return a(arrayList);
        } catch (Throwable th2) {
            try {
                j11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @CalledByNative
    public static String getCacheDirectory() {
        throw null;
    }

    @CalledByNative
    public static long getCacheQuotaBytes() {
        try {
            throw null;
        } catch (Exception unused) {
            return -1L;
        }
    }

    @CalledByNative
    public static String getDataDirectory() {
        throw null;
    }

    @CalledByNative
    public static String getDownloadsDirectory() {
        o d11 = o.d();
        try {
            if (Build.VERSION.SDK_INT < 29) {
                String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
                d11.close();
                return path;
            }
            String[] allPrivateDownloadsDirectories = getAllPrivateDownloadsDirectories();
            String str = allPrivateDownloadsDirectories.length == 0 ? "" : allPrivateDownloadsDirectories[0];
            d11.close();
            return str;
        } catch (Throwable th2) {
            try {
                d11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @CalledByNative
    public static String[] getExternalDownloadVolumesNames() {
        Set<String> externalVolumeNames;
        StorageVolume storageVolume;
        File directory;
        ArrayList arrayList = new ArrayList();
        externalVolumeNames = MediaStore.getExternalVolumeNames(e.b());
        for (String str : externalVolumeNames) {
            if (!TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                StorageManager storageManager = (StorageManager) e.b().getSystemService(StorageManager.class);
                Uri contentUri = MediaStore.Files.getContentUri(str);
                try {
                    storageVolume = storageManager.getStorageVolume(contentUri);
                    directory = storageVolume.getDirectory();
                    File file = new File(directory, Environment.DIRECTORY_DOWNLOADS);
                    if (!file.isDirectory()) {
                        String absolutePath = file.getAbsolutePath();
                        String absolutePath2 = directory.getAbsolutePath();
                        boolean isDirectory = directory.isDirectory();
                        String c11 = j.c("PathUtils");
                        Locale locale = Locale.US;
                        Log.w(c11, "Download dir missing: " + absolutePath + ", parent dir:" + absolutePath2 + ", isDirectory:" + isDirectory);
                    }
                    arrayList.add(file);
                } catch (Exception e11) {
                    j.b("PathUtils", "Failed to get storage volume for uri: ".concat(String.valueOf(contentUri)), e11);
                }
            }
        }
        return a(arrayList);
    }

    @CalledByNative
    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    @CalledByNative
    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = e.b().getApplicationInfo();
        int i11 = applicationInfo.flags;
        return ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 || (i11 & 1) == 0) ? applicationInfo.nativeLibraryDir : "/system/lib/";
    }

    @CalledByNative
    public static String getThumbnailCacheDirectory() {
        throw null;
    }
}
