package com.bytedance.sdk.openadsdk.tz;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    protected static int gm = 1;
    public static int kj = 2;
    protected static int oo = 30;
    public static int ork = 8;
    protected static String pcc = "images";
    public static int qf = 1;
    protected static String sf = null;
    public static int tmg = 32;
    public static int vh = 16;
    protected static long vj = 15360;
    public static int vy = 4;
    public static int wh;

    public static boolean pcc(Context context, int i) {
        boolean pcc2;
        boolean pcc3;
        if (wh == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                pcc2 = pcc(context, "android.permission.READ_MEDIA_IMAGES");
                pcc3 = true;
            } else {
                pcc2 = pcc(context, "android.permission.READ_EXTERNAL_STORAGE");
                pcc3 = pcc(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean pcc4 = pcc(context, "android.permission.CAMERA");
            boolean pcc5 = pcc(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (pcc2 && pcc3) {
                wh |= qf;
            }
            if (pcc4 && packageManager.hasSystemFeature("android.hardware.camera")) {
                wh |= kj;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                wh |= vy;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                wh |= ork;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                wh |= vh;
            }
            if (pcc5 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                wh |= tmg;
            }
        }
        return (wh & i) != 0;
    }

    public static float sf(Context context) {
        return context == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : context.getResources().getDisplayMetrics().density;
    }

    public static boolean sf(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static Bitmap pcc(String str) {
        byte[] decode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static boolean pcc(Context context, String str) {
        return false;
    }

    public static boolean pcc(Context context) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 33) {
            z = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z2 = false;
                return !z2 && z;
            }
        }
        z2 = true;
        if (z2) {
        }
    }
}
