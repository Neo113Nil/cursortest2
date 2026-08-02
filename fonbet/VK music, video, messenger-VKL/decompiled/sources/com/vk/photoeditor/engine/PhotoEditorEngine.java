package com.vk.photoeditor.engine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class PhotoEditorEngine {
    public static volatile boolean a = false;
    public static a b;

    @Keep
    private static volatile Context context;

    public interface a {
        void a(ChronicleException chronicleException);
    }

    public static void a(Bitmap bitmap, int[] iArr, float f) {
        if (b()) {
            nativeCurveSaturation(bitmap, iArr, f, Runtime.getRuntime().availableProcessors());
        }
    }

    public static boolean b() {
        if (a) {
            return true;
        }
        synchronized (PhotoEditorEngine.class) {
            if (a) {
                return true;
            }
            try {
                System.loadLibrary("vkchronicle");
                a = true;
                return true;
            } catch (NullPointerException e) {
                e = e;
                Log.e("PhotoEditorEngine", "Initialization awaiting is interrupted.", e);
                return false;
            } catch (SecurityException e2) {
                e = e2;
                Log.e("PhotoEditorEngine", "Initialization awaiting is interrupted.", e);
                return false;
            } catch (UnsatisfiedLinkError e3) {
                e = e3;
                Log.e("PhotoEditorEngine", "Initialization awaiting is interrupted.", e);
                return false;
            }
        }
    }

    public static void c(Bitmap bitmap, int i) {
        if (b()) {
            try {
                safetyNativeBlur(bitmap, i);
            } catch (ChronicleException e) {
                b.a(e);
            }
        }
    }

    public static void d(Bitmap bitmap, float f) {
        if (b()) {
            nativeEnhance(bitmap, f, Runtime.getRuntime().availableProcessors());
        }
    }

    public static void e(Bitmap bitmap) {
        if (b()) {
            nativeFlipHorizontally(bitmap);
        }
    }

    public static void f(Bitmap bitmap) {
        if (b()) {
            nativeFlipVertically(bitmap);
        }
    }

    public static boolean g(@NonNull Bitmap bitmap) {
        if (b()) {
            return nativeGlReadPixelsAndFlipVertically(bitmap);
        }
        return false;
    }

    public static void h(@NonNull Context context2, @NonNull a aVar) {
        context = context2;
        b = aVar;
    }

    public static void i(Bitmap bitmap, Bitmap bitmap2, float f) {
        if (b()) {
            nativeLookup(bitmap, bitmap2, Runtime.getRuntime().availableProcessors(), f);
        }
    }

    public static void j(Bitmap bitmap) {
        if (b()) {
            nativePinBitmap(bitmap);
        }
    }

    public static void k(Bitmap bitmap, Bitmap bitmap2) {
        if (b()) {
            nativeResize(bitmap, bitmap2, Runtime.getRuntime().availableProcessors());
        }
    }

    private static native String nativeAllInOneShader();

    private static native void nativeColorCorrection(Bitmap bitmap, Bitmap bitmap2, float[] fArr, int i, int i2);

    private static native String nativeCreateColorCorrectionShader(float[] fArr, int i, int i2);

    private static native void nativeCreateCurve(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, float f, float f2, float f3, float f4, float f5);

    private static native void nativeCurveSaturation(Bitmap bitmap, int[] iArr, double d, int i);

    private static native void nativeEnhance(Bitmap bitmap, double d, int i);

    private static native void nativeFlipHorizontally(Bitmap bitmap);

    private static native void nativeFlipVertically(Bitmap bitmap);

    private static native boolean nativeGlReadPixelsAndFlipVertically(@NonNull Bitmap bitmap);

    private static native void nativeHSLToRGB(float f, float f2, float f3, int[] iArr);

    private static native void nativeHSVToRGB(float f, float f2, float f3, int[] iArr);

    private static native void nativeLabToRGB(float f, float f2, float f3, int[] iArr);

    private static native void nativeLookup(Bitmap bitmap, Bitmap bitmap2, int i, float f);

    private static native String nativeOneInAllShader();

    private static native void nativePinBitmap(Bitmap bitmap);

    private static native void nativeRGBToHSL(int i, int i2, int i3, float[] fArr);

    private static native void nativeRGBToHSV(int i, int i2, int i3, float[] fArr);

    private static native void nativeRGBToLab(int i, int i2, int i3, float[] fArr);

    private static native void nativeResize(Bitmap bitmap, Bitmap bitmap2, int i);

    private static native void safetyNativeBlur(Bitmap bitmap, int i) throws ChronicleException;
}
