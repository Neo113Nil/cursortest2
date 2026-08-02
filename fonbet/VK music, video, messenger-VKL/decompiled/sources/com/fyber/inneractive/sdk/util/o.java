package com.fyber.inneractive.sdk.util;

import android.app.Application;
import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class o {
    public static Application a;

    public static void a() {
    }

    public static int b(int i) {
        return (int) io.reactivex.rxjava3.internal.operators.observable.n0.b(IAConfigManager.N.u.a().getResources().getConfiguration().densityDpi, 160.0f, i, 0.5f);
    }

    public static int c() {
        Application application = a;
        int i = (application == null || application.getResources() == null || application.getResources().getConfiguration() == null) ? 1 : application.getResources().getConfiguration().orientation;
        try {
            if (Settings.System.getInt(application.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                i = 1;
            }
        } catch (Throwable th) {
            IAlog.a("failed getOrientation. returning portrait orientation", th, new Object[0]);
        }
        IAlog.a("The device orientation: %s", i == 1 ? X3.i.D : X3.i.C);
        return i;
    }

    public static int d() {
        int i;
        WindowManager windowManager;
        Display defaultDisplay;
        if (a == null || (windowManager = (WindowManager) IAConfigManager.N.u.a().getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            i = -1;
        } else {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.y;
        }
        if (i != -1) {
            return i;
        }
        try {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics != null) {
                i = displayMetrics.heightPixels;
            }
        } catch (Throwable unused) {
        }
        if (i == -1) {
            return 480;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e() {
        int i;
        WindowManager windowManager;
        Display defaultDisplay;
        if (a != null && (windowManager = (WindowManager) IAConfigManager.N.u.a().getSystemService("window")) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.x;
            if (i == -1) {
                return i;
            }
            try {
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                if (displayMetrics != null) {
                    i = displayMetrics.widthPixels;
                }
            } catch (Throwable unused) {
            }
            if (i == -1) {
                return 320;
            }
            return i;
        }
        i = -1;
        if (i == -1) {
        }
    }

    public static String h() {
        IAConfigManager iAConfigManager;
        int i = 0;
        while (true) {
            iAConfigManager = IAConfigManager.N;
            if (!iAConfigManager.x.a.get() || iAConfigManager.x.d.compareAndSet(true, true) || i >= 25) {
                break;
            }
            IAlog.a("UserAgentProvider | waiting on user agent", new Object[0]);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            i++;
        }
        return iAConfigManager.x.a();
    }

    public static boolean a(String str) {
        return a.checkCallingOrSelfPermission(str) == 0;
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static int b() {
        return ((WindowManager) IAConfigManager.N.u.a().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static int a(int i) {
        return Math.round(((IAConfigManager.N.u.a().getResources().getConfiguration().densityDpi / 160.0f) * i) + 0.5f);
    }

    public static int c(int i) {
        try {
            return (int) ((i / (IAConfigManager.N.u.a().getResources().getConfiguration().densityDpi / 160.0f)) + 0.5f);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String b(String str) {
        String str2 = (String) n.a.get(str);
        if (TextUtils.isEmpty(str2)) {
            IAlog.a("Assets cache: reading file: %s", str);
            try {
                InputStream open = a.getAssets().open(str, 3);
                StringBuffer stringBuffer = new StringBuffer();
                byte[] bArr = new byte[4096];
                for (int i = 0; i != -1; i = open.read(bArr)) {
                    stringBuffer.append(new String(bArr, 0, i));
                }
                open.close();
                str2 = stringBuffer.toString();
                IAlog.a("Assets cache: success - %s", str);
            } catch (IOException e) {
                IAlog.a("Assets cache: Could not read response from file", new Object[0]);
                IAlog.e(v.b(e), new Object[0]);
            }
            if (!TextUtils.isEmpty(str2)) {
                n.a.put(str, str2);
            }
            return str2;
        }
        IAlog.a("Assets cache: returning cached assets for %s", str);
        return str2;
    }

    public static int a(float f) {
        return (int) (TypedValue.applyDimension(1, f, IAConfigManager.N.u.a().getResources().getDisplayMetrics()) + 0.5f);
    }

    public static Drawable d(int i) {
        return IAConfigManager.N.u.a().getDrawable(i);
    }

    public static String a(ArrayList arrayList) {
        return String.join(StringUtils.COMMA, arrayList);
    }

    public static void a(Context context, byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = context.openFileOutput("session_details.json", 0);
        } catch (Throwable unused) {
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
        } catch (Throwable unused2) {
            try {
                IAlog.a("writeFileWithContext failed writing %s", "session_details.json");
            } finally {
                v.a(fileOutputStream);
            }
        }
    }

    public static void f() {
    }

    public static void g() {
    }

    public static String a(Context context) {
        if (context != null) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr.length > 0) {
                    Signature signature = signatureArr[0];
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(signature.toByteArray());
                    byte[] digest = messageDigest.digest();
                    StringBuilder sb = new StringBuilder();
                    for (byte b : digest) {
                        String hexString = Integer.toHexString(b & 255);
                        if (hexString.length() == 1) {
                            sb.append("0");
                        }
                        sb.append(hexString);
                    }
                    return sb.toString();
                }
                return "";
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static void a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (i == 17) {
                layoutParams2.addRule(13);
            } else {
                int i2 = i & 7;
                if (i2 == 1) {
                    layoutParams2.addRule(14);
                } else if (i2 == 3) {
                    layoutParams2.addRule(9);
                } else if (i2 == 5) {
                    layoutParams2.addRule(11);
                }
                int i3 = i & 112;
                if (i3 == 16) {
                    layoutParams2.addRule(15);
                } else if (i3 == 48) {
                    layoutParams2.addRule(10);
                } else if (i3 == 80) {
                    layoutParams2.addRule(12);
                }
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public static Context a(View view) {
        if (view != null) {
            return view.getContext();
        }
        return a;
    }
}
