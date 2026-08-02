package com.ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import com.ironsource.Bf;
import com.ironsource.C2556n4;
import com.ironsource.C2757y8;
import com.ironsource.InterfaceC2738x7;
import com.ironsource.Jb;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.internal.partials.IronSourceFilesBridge;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class IronSourceStorageUtils {
    private static final String a = "supersonicads";
    private static Bf b;
    private static boolean c;

    private static void a(Context context) {
        Bf bf = b;
        if (bf != null && bf.b()) {
            deleteCacheDirectories(context);
        }
        Bf bf2 = b;
        if (bf2 == null || !bf2.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    private static File b(Context context) {
        InterfaceC2738x7 a2 = Jb.Y().a();
        Bf bf = b;
        return (bf == null || !bf.d()) ? a2.g(context) : a2.m(context);
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        return str2 == null ? str : str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        File file = new File(str, str2);
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                try {
                    Object c2 = c(file2);
                    if (c2 instanceof JSONArray) {
                        jsonObjectInit.put(FileUploadManager.i, c(file2));
                    } else if (c2 instanceof JSONObject) {
                        jsonObjectInit.put(file2.getName(), c(file2));
                    }
                } catch (JSONException e) {
                    C2556n4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
        return jsonObjectInit;
    }

    public static JSONObject buildFilesMapOfDirectory(C2757y8 c2757y8, JSONObject jSONObject) throws Exception {
        if (c2757y8 == null || !c2757y8.isDirectory()) {
            return IronSourceNetworkBridge.jsonObjectInit();
        }
        File[] listFiles = c2757y8.listFiles();
        if (listFiles == null) {
            return IronSourceNetworkBridge.jsonObjectInit();
        }
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (File file : listFiles) {
            C2757y8 c2757y82 = new C2757y8(file.getPath());
            if (c2757y82.isFile()) {
                String name = c2757y82.getName();
                JSONObject a2 = c2757y82.a();
                if (jSONObject.has(name)) {
                    jsonObjectInit.put(name, SDKUtils.mergeJSONObjects(a2, jSONObject.getJSONObject(name)));
                } else {
                    jsonObjectInit.put(name, a2);
                }
            } else if (c2757y82.isDirectory()) {
                jsonObjectInit.put(c2757y82.getName(), buildFilesMapOfDirectory(c2757y82, jSONObject));
            }
        }
        return jsonObjectInit;
    }

    private static File c(Context context) {
        InterfaceC2738x7 a2 = Jb.Y().a();
        Bf bf = b;
        return (bf == null || !bf.d()) ? a2.k(context) : a2.C(context);
    }

    public static void deleteCacheDirectories(Context context) {
        InterfaceC2738x7 a2 = Jb.Y().a();
        a(a2.m(context));
        a(a2.C(context));
    }

    public static synchronized boolean deleteFile(C2757y8 c2757y8) {
        synchronized (IronSourceStorageUtils.class) {
            if (!c2757y8.exists()) {
                return false;
            }
            return c2757y8.delete();
        }
    }

    public static void deleteFilesDirectories(Context context) {
        InterfaceC2738x7 a2 = Jb.Y().a();
        a(a2.g(context));
        a(a2.k(context));
    }

    public static synchronized boolean deleteFolder(String str) {
        boolean z;
        synchronized (IronSourceStorageUtils.class) {
            File file = new File(str);
            if (deleteFolderContentRecursive(file)) {
                z = file.delete();
            }
        }
        return z;
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public static void ensurePathSafety(File file, String str) throws Exception {
        Bf bf = b;
        if (bf == null || !bf.e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (!canonicalPath2.startsWith(canonicalPath)) {
                throw new Exception(X3.c.u + canonicalPath2);
            }
        }
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject buildFilesMap = buildFilesMap(str, str2);
        try {
            buildFilesMap.put("path", str2);
        } catch (JSONException e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return buildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File b2;
        if (!a() || !SDKUtils.isExternalStorageAvailable() || (b2 = b(context)) == null || !b2.canWrite()) {
            return c(context).getPath();
        }
        c = true;
        return b2.getPath();
    }

    public static ArrayList<C2757y8> getFilesInFolderRecursive(C2757y8 c2757y8) {
        if (c2757y8 == null || !c2757y8.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<C2757y8> arrayList = new ArrayList<>();
        File[] listFiles = c2757y8.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                C2757y8 c2757y82 = new C2757y8(file.getPath());
                if (c2757y82.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(c2757y82));
                }
                if (c2757y82.isFile()) {
                    arrayList.add(c2757y82);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File b2 = b(new File(getDiskCacheDirPath(context)));
        if (!b2.exists()) {
            b2.mkdir();
        }
        return b2.getPath();
    }

    public static long getTotalSizeOfDir(C2757y8 c2757y8) {
        long totalSizeOfDir;
        long j = 0;
        if (c2757y8 != null && c2757y8.isDirectory()) {
            File[] listFiles = c2757y8.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            for (File file : listFiles) {
                C2757y8 c2757y82 = new C2757y8(file.getPath());
                if (c2757y82.isFile()) {
                    totalSizeOfDir = c2757y82.length();
                } else if (c2757y82.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(c2757y82);
                }
                j += totalSizeOfDir;
            }
        }
        return j;
    }

    public static void initializeCacheDirectory(Context context, Bf bf) {
        b = bf;
        a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(C2757y8 c2757y8) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(c2757y8));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(readLine);
            sb.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        File file = new File(str);
        File file2 = new File(str2);
        File parentFile = file2.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            return file.renameTo(file2);
        }
        return false;
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            return 0;
        }
        FileOutputStream fileOutputStreamCtor = IronSourceFilesBridge.fileOutputStreamCtor(file);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i = 0;
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    return i;
                }
                fileOutputStreamCtor.write(bArr2, 0, read);
                i += read;
            }
        } finally {
            fileOutputStreamCtor.close();
            byteArrayInputStream.close();
        }
    }

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static File b(File file) {
        StringBuilder append = new StringBuilder().append(file.getAbsolutePath());
        String str = File.separator;
        return new File(append.append(str).append(a).append(str).toString());
    }

    private static Object c(File file) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (JSONException e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jsonObjectInit.put(file2.getName(), c(file2));
            } else {
                jSONArray.put(file2.getName());
                jsonObjectInit.put(FileUploadManager.i, jSONArray);
            }
        }
        return jsonObjectInit;
    }

    private static boolean a() {
        Bf bf;
        return Build.VERSION.SDK_INT > 29 && (bf = b) != null && bf.a();
    }
}
