package com.vk.medianative;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Process;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.facebook.soloader.MinElf;
import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.core.native_loader.CpuType;
import com.vk.core.native_loader.NativeLib;
import com.vk.core.native_loader.NativeLibLoadException;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.medianative.AudioNative;
import com.vk.medianative.MediaNative;
import com.vk.metrics.eventtracking.b;
import com.vk.photoeditor.engine.PhotoEditorEngine;
import com.vk.toggle.features.VoipFeatures;
import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;
import xsna.asu0;

/* loaded from: classes.dex */
public final class MediaNative {
    public static final int START_RECORD_ERROR_EMPTY_PATH = -1;
    public static final int START_RECORD_ERROR_INVALID_SAMPLE_RATE = -3;
    public static final int START_RECORD_ERROR_OGG_STREAM_INIT = -7;
    public static final int START_RECORD_ERROR_OGG_WRITE_HEADER = -8;
    public static final int START_RECORD_ERROR_OPEN_FILE = -2;
    public static final int START_RECORD_ERROR_OPUS_CREATE = -4;
    public static final int START_RECORD_ERROR_OPUS_GET_LOOKAHEAD = -6;
    public static final int START_RECORD_ERROR_OPUS_SET_BITRATE = -5;
    public static final int START_RECORD_OK = 1;
    public static volatile boolean a = false;
    public static volatile boolean b = false;
    public static volatile boolean c = false;

    @Keep
    public static volatile Context context = null;
    public static boolean d = false;
    public static final Object e = new Object();
    public static volatile boolean f = false;

    public static class a implements NativeLibLoader.b {
        @Override // com.vk.core.native_loader.NativeLibLoader.b
        public final void a(@NonNull Throwable th) {
            b.a.a(th);
        }

        @Override // com.vk.core.native_loader.NativeLibLoader.b
        public final void b(@NonNull Throwable th, @NonNull CpuType cpuType, @NonNull String str, @NonNull String str2) {
            b.a.a(th);
        }

        @Override // com.vk.core.native_loader.NativeLibLoader.b
        public final void c(@NonNull NativeLibLoadException nativeLibLoadException, @NonNull CpuType cpuType) {
            b.a.a(nativeLibLoadException);
        }
    }

    public static String a(String str) {
        InputStream inputStream = null;
        try {
            Process exec = Runtime.getRuntime().exec("cat /proc/" + str + "/maps");
            if (exec != null) {
                inputStream = exec.getInputStream();
                Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
                String next = useDelimiter.hasNext() ? useDelimiter.next() : "empty";
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused) {
                    }
                }
                return next;
            }
        } catch (Exception unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused3) {
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
        return "empty";
    }

    public static void applyCurveAndSaturationBitmap(Bitmap bitmap, int[] iArr, float f2) {
        PhotoEditorEngine.a(bitmap, iArr, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (com.vk.core.native_loader.NativeLibLoader.j(r0, r6) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (com.vk.core.native_loader.NativeLibLoader.a(r6) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(@NonNull DynamicTask dynamicTask, @NonNull NativeLib nativeLib, NativeLib... nativeLibArr) {
        boolean g = com.vk.core.dynamic_loader.b.g(dynamicTask);
        NativeLibLoader nativeLibLoader = NativeLibLoader.a;
        if (g) {
            nativeLibLoader.getClass();
        }
        if (!g) {
            nativeLibLoader.getClass();
        }
        for (NativeLib nativeLib2 : nativeLibArr) {
            if (g) {
                nativeLibLoader.getClass();
                if (!NativeLibLoader.j(nativeLibLoader, nativeLib2)) {
                    return false;
                }
            }
            if (!g) {
                nativeLibLoader.getClass();
                if (!NativeLibLoader.a(nativeLib2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void blurBitmap(Bitmap bitmap, int i) {
        PhotoEditorEngine.c(bitmap, i);
    }

    public static boolean checkOrLoadCallEffects() {
        if (c) {
            return true;
        }
        c = b(DynamicTask.CALL_EFFECTS, NativeLib.CPP_SHARED, NativeLib.GL_EFFECTS, NativeLib.TFLITE, NativeLib.TFLITE_GPU_DELEGATE, NativeLib.TFLITE_NATIVE);
        if (c) {
            a = true;
        }
        return c;
    }

    public static boolean checkOrLoadGLEffects() {
        if (a) {
            return true;
        }
        a = b(DynamicTask.GL_EFFECTS, NativeLib.CPP_SHARED, NativeLib.GL_EFFECTS);
        return a;
    }

    public static boolean checkOrLoadOkPublisher() {
        if (d) {
            return true;
        }
        boolean b2 = b(DynamicTask.LIVES_PUBLISHER, NativeLib.OK_NATIVE_NET, NativeLib.OK_NATIVE_TOOLS);
        d = b2;
        return b2;
    }

    public static boolean checkOrLoadOpenCV() {
        if (b) {
            return true;
        }
        b = b(DynamicTask.GESTURE_CONTROL, NativeLib.OPENCV, NativeLib.TFLITE, NativeLib.TFLITE_GPU_DELEGATE, NativeLib.TFLITE_NATIVE);
        return b;
    }

    public static String dump() {
        StringBuilder sb = new StringBuilder("LD_LIBRARY_PATH:\n");
        NativeLibLoader.a.getClass();
        sb.append((String) NativeLibLoader.p.c.getValue());
        sb.append("\nSELF_MAPS:\n");
        sb.append(a("self"));
        sb.append("\nPID_MAPS:\n");
        sb.append(a(String.valueOf(Process.myPid())));
        sb.append("\n");
        return sb.toString();
    }

    public static void enhanceBitmap(Bitmap bitmap, float f2) {
        PhotoEditorEngine.d(bitmap, f2);
    }

    public static void flipHorizontallyBitmap(Bitmap bitmap) {
        PhotoEditorEngine.e(bitmap);
    }

    public static void flipVerticallyBitmap(Bitmap bitmap) {
        PhotoEditorEngine.f(bitmap);
    }

    public static void init(Context context2, boolean z) {
        NativeLogger.a = z;
        init(context2);
    }

    public static boolean isAsus() {
        return "asus".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static boolean isCallEffectsSupported() {
        return c;
    }

    public static boolean isGLEffectsLibSupported() {
        return a;
    }

    public static boolean isOpenCVLibSupported() {
        return b;
    }

    public static boolean isX86() {
        try {
            String str = Build.SUPPORTED_ABIS[0];
            if (str != null) {
                return str.startsWith(MinElf.ISA.X86);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void pinBitmap(Bitmap bitmap) {
        PhotoEditorEngine.j(bitmap);
    }

    public static void resizeBitmap(Bitmap bitmap, Bitmap bitmap2) {
        PhotoEditorEngine.k(bitmap, bitmap2);
    }

    public static void init(final Context context2) {
        asu0.a.getClass();
        asu0.n().submit(new Runnable() { // from class: xsna.xs10
            @Override // java.lang.Runnable
            public final void run() {
                Context context3 = context2;
                if (MediaNative.f) {
                    return;
                }
                Object obj = MediaNative.e;
                synchronized (obj) {
                    try {
                        if (MediaNative.f) {
                            return;
                        }
                        MediaNative.context = context3;
                        AudioNative.context = context3;
                        NativeLibLoader nativeLibLoader = NativeLibLoader.a;
                        Context context4 = MediaNative.context;
                        CpuType cpuType = CpuType.UNKNOWN;
                        MediaNative.a aVar = new MediaNative.a();
                        VoipFeatures voipFeatures = VoipFeatures.DISABLE_NATIVE_LIB_LOADER_REFACTOR;
                        voipFeatures.getClass();
                        boolean a2 = com.vk.toggle.b.A.a(voipFeatures);
                        nativeLibLoader.getClass();
                        NativeLibLoader.h(context4, cpuType, aVar, a2, false);
                        vpo vpoVar = com.vk.core.dynamic_loader.b.a;
                        Context context5 = MediaNative.context;
                        asu0.a.getClass();
                        com.vk.core.dynamic_loader.b.f(context5, asu0.u(), null);
                        NativeLibLoader.j(nativeLibLoader, NativeLib.CPP_SHARED);
                        Context context6 = MediaNative.context;
                        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                        Objects.requireNonNull(bVar);
                        PhotoEditorEngine.h(context6, new x1w(bVar, 1));
                        MediaNative.f = true;
                        obj.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }
}
