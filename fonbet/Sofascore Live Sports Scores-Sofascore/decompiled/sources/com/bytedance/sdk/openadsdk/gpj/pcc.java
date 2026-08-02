package com.bytedance.sdk.openadsdk.gpj;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.fum;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.yt.vj;
import com.ironsource.U3;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static boolean pcc = true;
    private static final AtomicBoolean sf = new AtomicBoolean(false);

    public static void pcc(Context context) {
        if (context != null && pcc && sf.compareAndSet(false, true)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (fum.pcc(context)) {
                        if (vj.pcc("webview_defend", false)) {
                            sf(context);
                            return;
                        }
                        return;
                    }
                    String sf2 = fum.sf(context);
                    try {
                        try {
                            if (TextUtils.isEmpty(sf2)) {
                                sf2 = context.getPackageName() + Process.myPid();
                            }
                            WebView.setDataDirectorySuffix(sf2);
                            lo.pcc("TTAD.TTMultiInitHelper", "init: WebView.setDataDirectorySuffix with ".concat(String.valueOf(sf2)));
                        } catch (IllegalStateException e) {
                            lo.pcc("TTAD.TTMultiInitHelper", "init: ", e);
                            pcc(sf2);
                        }
                    } catch (Exception e2) {
                        lo.pcc("TTAD.TTMultiInitHelper", "init: ", e2);
                    }
                }
            } catch (Throwable th) {
                lo.pcc("TTAD.TTMultiInitHelper", "init: ", th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void sf(Context context) {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel;
        Throwable th;
        String sf2 = sf();
        File file = new File(context.getDir(TextUtils.isEmpty(sf2) ? U3.i.K : "webview_".concat(String.valueOf(sf2)), 0).getPath(), "webview_data.lock");
        file.getAbsolutePath();
        if (file.exists()) {
            FileChannel fileChannel2 = null;
            FileLock tryLock = null;
            fileChannel2 = null;
            fileChannel2 = null;
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    try {
                        fileChannel = randomAccessFile.getChannel();
                        if (fileChannel != null) {
                            try {
                                tryLock = fileChannel.tryLock();
                            } catch (Exception unused) {
                                fileChannel2 = fileChannel;
                                pcc(file);
                                if (fileChannel2 != null) {
                                    try {
                                        fileChannel2.close();
                                    } catch (Throwable th2) {
                                        th2.getMessage();
                                    }
                                }
                                if (randomAccessFile == null) {
                                    return;
                                }
                                randomAccessFile.close();
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileChannel != null) {
                                }
                                if (randomAccessFile == null) {
                                }
                            }
                        }
                        if (tryLock != null) {
                            tryLock.close();
                        } else {
                            pcc(file);
                        }
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (Throwable th4) {
                                th4.getMessage();
                            }
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    fileChannel = fileChannel2;
                    th = th;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (Throwable th6) {
                            th6.getMessage();
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th;
                    }
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (Throwable th7) {
                        th7.getMessage();
                        throw th;
                    }
                }
            } catch (Exception unused3) {
                randomAccessFile = null;
            } catch (Throwable th8) {
                th = th8;
                randomAccessFile = null;
                fileChannel = null;
                th = th;
                if (fileChannel != null) {
                }
                if (randomAccessFile == null) {
                }
            }
            try {
                randomAccessFile.close();
            } catch (Throwable th9) {
                th9.getMessage();
            }
        }
    }

    public static void pcc() {
        pcc = false;
    }

    private static void pcc(String str) {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            Field field = (Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
            field.setAccessible(true);
            if (TextUtils.isEmpty((String) field.get(cls))) {
                field.set(cls, str);
            }
        } catch (Throwable unused) {
        }
    }

    private static void pcc(File file) {
        pcc(file, file.exists() ? file.delete() : false);
    }

    private static void pcc(File file, boolean z) {
        if (!z || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            lo.gm("TTAD.TTMultiInitHelper", e.getMessage());
        }
    }

    private static String sf() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }
}
