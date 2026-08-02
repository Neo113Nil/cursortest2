package com.safedk.android.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import io.ktor.sse.ServerSentEventKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.cordova.globalization.Globalization;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes3.dex */
public class b {
    public static List<String> a = Arrays.asList(n.f, "java.util.List", "java.util.ArrayList", "java.util.Map", "java.util.HashMap", "org.json.JSONObject", "com.five_corp.ad.internal.cache", "com.five_corp.ad.internal.context", com.safedk.android.analytics.brandsafety.m.w, Globalization.LONG);
    private static final String b = "DebugUtils";

    private static void a(String str, String str2, ViewGroup viewGroup, String str3) {
        try {
            int childCount = viewGroup.getChildCount();
            int length = (childCount + "").length();
            int i = 0;
            while (i < childCount) {
                View childAt = viewGroup.getChildAt(i);
                float f = 0.0f;
                if (Build.VERSION.SDK_INT >= 21) {
                    f = childAt.getZ();
                }
                String str4 = "type : " + childAt.getClass().getName() + ", viewId :" + Integer.toHexString(childAt.getId()) + ", address : " + BrandSafetyUtils.a(childAt) + ", top/left/width/height : " + childAt.getTop() + "," + childAt.getLeft() + "," + childAt.getWidth() + "," + childAt.getHeight() + ",z-order : " + f;
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                i++;
                sb.append(String.format(str2 + ServerSentEventKt.SPACE + ("|— %0" + length + "d/%0" + length + "d %s"), Integer.valueOf(i), Integer.valueOf(childCount), str4));
                String sb2 = sb.toString();
                if (childAt instanceof SurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) childAt;
                    sb2 = sb2 + ", surfaceView Holder : " + surfaceView.getHolder();
                    if (surfaceView.getHolder() != null) {
                        sb2 = sb2 + ", surfaceView Holder Surface object : " + surfaceView.getHolder().getSurface();
                    }
                }
                Logger.d(str, sb2);
                if (childAt instanceof ViewGroup) {
                    a(str, str2, (ViewGroup) childAt, str3 + "  ");
                }
            }
        } catch (Throwable th) {
            Logger.e(b, "Exception in printViewHierarchy", th);
        }
    }

    private static void a(View view, String str, String str2) {
        try {
            Logger.d(str, str2, " getViewDetails started, View type is ", view.getClass().getName(), ", Id=", Integer.toHexString(view.getId()));
            if (view.getParent() != null) {
                if (view.getParent() instanceof View) {
                    a((View) view.getParent(), str, str2);
                } else {
                    Log.d(str, str2 + " getViewDetails parent is ViewParent, view : " + view.getId() + ", View type is " + view.getClass().getName());
                }
            }
        } catch (Throwable th) {
            Logger.e(str, str2, " Exception in getViewDetails", th);
        }
    }

    private static void a(Context context, String str) {
        File file = new File(context.getFilesDir() + "/" + str);
        if (file.exists()) {
            a(file);
        } else {
            Logger.d(b, "listFiles directory does not exist : ", file);
        }
    }

    private static void a(Context context) {
        Logger.d(b, "listFilesInFilesDir started, dir : ", context.getFilesDir().getPath());
        a(context.getFilesDir());
    }

    private static void b(Context context) {
        a(context.getCacheDir());
    }

    private static void a(File file) {
        if (file != null) {
            if (file.isFile()) {
                Logger.d(b, "listFilesInDir file ", a(file.length()), ServerSentEventKt.SPACE, file.getPath());
                return;
            }
            if (file.isDirectory()) {
                Logger.d(b, "listFilesInDir dir  ", file.getPath());
                for (File file2 : file.listFiles()) {
                    a(file2);
                }
            }
        }
    }

    private static String a(long j) {
        if (j <= 0) {
            return "0 Bytes";
        }
        double d = j;
        int log10 = (int) (Math.log10(d) / Math.log10(1024.0d));
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.#");
        double pow = Math.pow(1024.0d, log10);
        Double.isNaN(d);
        sb.append(decimalFormat.format(d / pow));
        sb.append(ServerSentEventKt.SPACE);
        sb.append(new String[]{"Bt", "kB", "MB", "GB", "TB"}[log10]);
        return sb.toString();
    }

    private static void a(String str, String str2, Object obj, int i, int i2) {
        if (obj == null) {
            return;
        }
        try {
            if (obj.getClass() == null) {
                return;
            }
            if (i > i2) {
                Log.d(str, str2 + " reflectRecursively cannot go beyond level " + i2 + " current level is " + i);
                return;
            }
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                String str3 = null;
                if (c(field.getType().getName())) {
                    str3 = obj2 != null ? obj2.toString() : AbstractJsonLexerKt.NULL;
                }
                String replace = new String(new char[i * 2]).replace(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "-");
                if (a.contains(field.getType().getName())) {
                    Logger.d(str, str2, " reflectRecursively level ", Integer.valueOf(i), replace, ", name : ", field.getName(), ", type : ", field.getType().getName(), ", value : ", str3);
                } else {
                    Logger.d(str, str2, " reflectRecursively level ", Integer.valueOf(i), replace, ", name : ", field.getName(), ", type : ", field.getType().getName());
                }
                if (!field.getType().isPrimitive() && obj2 != null) {
                    a(str, str2, obj2, i + 1, i2);
                }
            }
        } catch (Throwable th) {
            Logger.e(str, str2, " reflectRecursively Exception, stopping", th);
        }
    }

    private static boolean c(String str) {
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            if (str.toLowerCase().startsWith(it.next().toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static void a(String str, String str2) {
        String str3;
        Logger.d(b, "Copy File To External Storage: src is: ", str, " directory: ", str2);
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append(File.separator);
        if (str2 != null) {
            str3 = str2 + File.separator;
        } else {
            str3 = "";
        }
        sb.append(str3);
        String sb2 = sb.toString();
        Logger.d(b, "Copy File To External Storage: destination: ", sb2);
        String[] split = str.split("/");
        String str4 = sb2 + split[split.length - 1];
        Logger.d(b, "Copy File To External Storage: target = ", str4);
        Logger.d(b, "Copy File To External Storage: result = ", Boolean.valueOf(b(str, str4)));
    }

    private static boolean b(String str, String str2) {
        int i;
        try {
            if (!new File(str).exists()) {
                i = 0;
            } else {
                FileInputStream fileInputStream = new FileInputStream(str);
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                byte[] bArr = new byte[1444];
                i = 0;
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    i += read;
                    fileOutputStream.write(bArr, 0, read);
                }
                fileInputStream.close();
                fileOutputStream.close();
            }
            if (new File(str2).exists()) {
                Logger.d(b, "copyFile finished creating file ", str2, ", ", Integer.valueOf(i), " bytes written");
            } else {
                Logger.d(b, "copyFile failed to create file ", str2);
            }
            return true;
        } catch (Throwable th) {
            Logger.d(b, "Exception in copyFile : ", th.getMessage(), th);
            return false;
        }
    }

    public static List<String> a(String str) {
        File[] listFiles = new File(str).listFiles(new FileFilter() { // from class: com.safedk.android.utils.b.1
            private final List<String> a = Arrays.asList("jpeg", "jpg", "png", "bmp", "gif");

            @Override // java.io.FileFilter
            public boolean accept(File pathname) {
                String path = pathname.getPath();
                return this.a.contains(path.substring(path.lastIndexOf(".") + 1));
            }
        });
        ArrayList arrayList = new ArrayList();
        if (listFiles != null && listFiles.length > 0) {
            for (File file : listFiles) {
                arrayList.add(file.getName());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(File file, File file2) throws IOException {
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            fileChannel = new FileInputStream(file).getChannel();
            try {
                fileChannel2 = new FileOutputStream(file2).getChannel();
            } catch (FileNotFoundException e) {
                e = e;
                Logger.d(b, "Exception copying file :", e.getMessage(), e);
                fileChannel.transferTo(0L, fileChannel.size(), fileChannel2);
            }
        } catch (FileNotFoundException e2) {
            e = e2;
            fileChannel = null;
        }
        try {
            fileChannel.transferTo(0L, fileChannel.size(), fileChannel2);
        } catch (Throwable th) {
            try {
                Logger.d(b, "Exception copying file :", th.getMessage(), th);
                if (fileChannel != null) {
                    fileChannel.close();
                }
                if (fileChannel2 == null) {
                }
            } finally {
                if (fileChannel != null) {
                    fileChannel.close();
                }
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
            }
        }
    }

    public static String b(String str) {
        SafeDK.getInstance().m();
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(str)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (FileNotFoundException e) {
            Logger.e(b, "Exception reading file ", str, e);
        } catch (IOException e2) {
            Logger.e(b, "Exception reading file ", str, e2);
        }
        return sb.toString();
    }
}
