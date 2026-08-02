package org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.MediaStore;
import android.system.Os;
import android.text.TextUtils;
import java.io.File;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.task.AsyncTask;

/* loaded from: classes10.dex */
public abstract class PathUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CACHE_DIRECTORY = 2;
    private static final int DATA_DIRECTORY = 0;
    private static final int NUM_DIRECTORIES = 3;
    private static final String TAG = "PathUtils";
    private static final int THUMBNAIL_DIRECTORY = 1;
    private static final String THUMBNAIL_DIRECTORY_NAME = "textures";
    private static String sCacheDirectoryBasePath;
    private static String sCacheSubDirectory;
    private static String sDataDirectoryBasePath;
    private static String sDataDirectorySuffix;
    private static FutureTask<String[]> sDirPathFetchTask;
    private static final AtomicBoolean sInitializationStarted = new AtomicBoolean();

    private PathUtils() {
    }

    public static void resetForTesting() {
        sInitializationStarted.set(false);
        sDirPathFetchTask = null;
        sDataDirectorySuffix = null;
        sCacheSubDirectory = null;
        sDataDirectoryBasePath = null;
        sCacheDirectoryBasePath = null;
    }

    private static String[] getOrComputeDirectoryPaths() {
        if (!sDirPathFetchTask.isDone()) {
            StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
            try {
                sDirPathFetchTask.run();
                if (allowDiskWrites != null) {
                    allowDiskWrites.close();
                }
            } catch (Throwable th) {
                if (allowDiskWrites != null) {
                    try {
                        allowDiskWrites.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        try {
            return sDirPathFetchTask.get();
        } catch (Exception e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }

    private static void chmod(String path, int mode) {
        try {
            Os.chmod(path, mode);
        } catch (Exception unused) {
            Log.e(TAG, "Failed to set permissions for path \"" + path + "\"");
        }
    }

    public static boolean isPathUnderAppDir(String path, Context context) {
        Path path2;
        Path realPath;
        Path path3;
        Path realPath2;
        boolean startsWith;
        Path path4;
        Path realPath3;
        boolean startsWith2;
        File file = new File(path);
        File dataDir = context.getDataDir();
        File externalFilesDir = ContextUtils.getApplicationContext().getExternalFilesDir(null);
        try {
            path2 = file.toPath();
            realPath = path2.toRealPath(new LinkOption[0]);
            path3 = dataDir.toPath();
            realPath2 = path3.toRealPath(new LinkOption[0]);
            startsWith = realPath.startsWith(realPath2);
            if (startsWith) {
                return true;
            }
            if (externalFilesDir != null) {
                path4 = externalFilesDir.toPath();
                realPath3 = path4.toRealPath(new LinkOption[0]);
                startsWith2 = realPath.startsWith(realPath3);
                if (startsWith2) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] setPrivateDirectoryPathInternal() {
        File file;
        File file2;
        File cacheDir;
        String[] strArr = new String[3];
        Context applicationContext = ContextUtils.getApplicationContext();
        if (sDataDirectoryBasePath == null) {
            file = applicationContext.getDir(sDataDirectorySuffix, 0);
            file2 = applicationContext.getDir(THUMBNAIL_DIRECTORY_NAME, 0);
        } else {
            file = new File(sDataDirectoryBasePath, sDataDirectorySuffix);
            file.mkdirs();
            File file3 = new File(sDataDirectoryBasePath, THUMBNAIL_DIRECTORY_NAME);
            file3.mkdirs();
            file2 = file3;
        }
        if (sCacheDirectoryBasePath != null) {
            cacheDir = new File(sCacheDirectoryBasePath);
        } else {
            cacheDir = applicationContext.getCacheDir();
        }
        if (cacheDir != null) {
            if (sCacheSubDirectory != null) {
                cacheDir = new File(cacheDir, sCacheSubDirectory);
            }
            if (sCacheDirectoryBasePath != null || sCacheSubDirectory != null) {
                cacheDir.mkdirs();
                chmod(cacheDir.getPath(), 1472);
            }
            strArr[2] = cacheDir.getPath();
        }
        String path = file.getPath();
        strArr[0] = path;
        chmod(path, 448);
        strArr[1] = file2.getPath();
        return strArr;
    }

    public static void setPrivateDirectoryPath(String dataBasePath, String cacheBasePath, String dataDirSuffix, String cacheSubDir) {
        if (sInitializationStarted.getAndSet(true)) {
            return;
        }
        sDataDirectoryBasePath = dataBasePath;
        sCacheDirectoryBasePath = cacheBasePath;
        sDataDirectorySuffix = dataDirSuffix;
        sCacheSubDirectory = cacheSubDir;
        sDirPathFetchTask = new FutureTask<>(new Callable() { // from class: org.chromium.base.PathUtils$$ExternalSyntheticLambda5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] privateDirectoryPathInternal;
                privateDirectoryPathInternal = PathUtils.setPrivateDirectoryPathInternal();
                return privateDirectoryPathInternal;
            }
        });
        AsyncTask.THREAD_POOL_EXECUTOR.execute(sDirPathFetchTask);
    }

    public static void setPrivateDataDirectorySuffix(String suffix, String cacheSubDir) {
        setPrivateDirectoryPath(null, null, suffix, cacheSubDir);
    }

    public static void setPrivateDataDirectorySuffix(String suffix) {
        setPrivateDataDirectorySuffix(suffix, null);
    }

    private static String getDirectoryPath(int index) {
        return getOrComputeDirectoryPaths()[index];
    }

    public static String getDataDirectory() {
        return getDirectoryPath(0);
    }

    public static String getCacheDirectory() {
        return getDirectoryPath(2);
    }

    public static String getThumbnailCacheDirectory() {
        return getDirectoryPath(1);
    }

    public static String getDownloadsDirectory() {
        StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
        try {
            String[] allPrivateDownloadsDirectories = getAllPrivateDownloadsDirectories();
            String str = allPrivateDownloadsDirectories.length == 0 ? "" : allPrivateDownloadsDirectories[0];
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return str;
        } catch (Throwable th) {
            if (allowDiskReads != null) {
                try {
                    allowDiskReads.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static String[] getAllPrivateDownloadsDirectories() {
        List arrayList = new ArrayList();
        StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
        try {
            File[] externalFilesDirs = ContextUtils.getApplicationContext().getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = Arrays.asList(externalFilesDirs);
            }
            if (allowDiskWrites != null) {
                allowDiskWrites.close();
            }
            return toAbsolutePathStrings(arrayList);
        } catch (Throwable th) {
            if (allowDiskWrites != null) {
                try {
                    allowDiskWrites.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static String[] getExternalDownloadVolumesNames() {
        Set<String> externalVolumeNames;
        StorageVolume storageVolume;
        File directory;
        ArrayList arrayList = new ArrayList();
        externalVolumeNames = MediaStore.getExternalVolumeNames(ContextUtils.getApplicationContext());
        for (String str : externalVolumeNames) {
            if (!TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                StorageManager storageManager = (StorageManager) ContextUtils.getApplicationContext().getSystemService(StorageManager.class);
                Uri contentUri = MediaStore.Files.getContentUri(str);
                try {
                    storageVolume = storageManager.getStorageVolume(contentUri);
                    directory = storageVolume.getDirectory();
                    File file = new File(directory, Environment.DIRECTORY_DOWNLOADS);
                    if (!file.isDirectory()) {
                        Log.w(TAG, "Download dir missing: %s, parent dir:%s, isDirectory:%s", file.getAbsolutePath(), directory.getAbsolutePath(), Boolean.valueOf(directory.isDirectory()));
                    }
                    arrayList.add(file);
                } catch (Exception e) {
                    Log.e(TAG, "Failed to get storage volume for uri: " + String.valueOf(contentUri), (Throwable) e);
                }
            }
        }
        return toAbsolutePathStrings(arrayList);
    }

    public static long getCacheQuotaBytes() {
        UUID uuidForPath;
        long cacheQuotaBytes;
        try {
            StorageManager storageManager = (StorageManager) ContextUtils.getApplicationContext().getSystemService(StorageManager.class);
            uuidForPath = storageManager.getUuidForPath(new File(getCacheDirectory()));
            cacheQuotaBytes = storageManager.getCacheQuotaBytes(uuidForPath);
            return cacheQuotaBytes;
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static String[] toAbsolutePathStrings(List<File> files) {
        ArrayList arrayList = new ArrayList();
        for (File file : files) {
            if (file != null && !TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = ContextUtils.getApplicationContext().getApplicationInfo();
        if ((applicationInfo.flags & 128) != 0 || (applicationInfo.flags & 1) == 0) {
            return applicationInfo.nativeLibraryDir;
        }
        return "/system/lib/";
    }

    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }
}
