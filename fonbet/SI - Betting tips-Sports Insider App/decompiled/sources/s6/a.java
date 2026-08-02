package s6;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.MenuItem;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import com.appsflyer.internal.o;
import com.logrocket.core.graphics.g;
import io.sentry.ILogger;
import io.sentry.android.core.internal.util.k;
import io.sentry.android.core.n0;
import io.sentry.b5;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f22627a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f22628b;

    public static float[] a(Path path) {
        g gVar;
        int i5;
        Object[] array;
        if (Build.VERSION.SDK_INT >= 26) {
            return path.approximate(0.5f);
        }
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f6 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f10 = 0.0f;
        do {
            f10 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f10));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int i10 = 1;
        int min = Math.min(100, ((int) (f10 / 0.5f)) + 1);
        g[] gVarArr = new g[min];
        char c2 = 2;
        float[] fArr = new float[2];
        float f11 = f10 / (min - 1);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            gVar = null;
            if (i11 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f6 - ((Float) arrayList.get(i12)).floatValue(), fArr, null);
            gVarArr[i11] = new g(fArr[0], fArr[1]);
            f6 = Math.min(f6 + f11, f10);
            while (true) {
                int i13 = i12 + 1;
                if (((Float) arrayList.get(i13)).floatValue() < f6) {
                    pathMeasure2.nextContour();
                    i12 = i13;
                }
            }
            i11++;
        }
        g[] gVarArr2 = new g[0];
        if (min <= 2) {
            array = gVarArr;
            i5 = 0;
        } else {
            g gVar2 = gVarArr[0];
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(gVar2);
            int i14 = 1;
            while (i14 < min) {
                gVar = gVarArr[i14];
                double d10 = gVar.f6551a - gVar2.f6551a;
                char c8 = c2;
                double d11 = gVar.f6552b - gVar2.f6552b;
                if ((d11 * d11) + (d10 * d10) > 0.25d) {
                    arrayList2.add(gVar);
                    gVar2 = gVar;
                }
                i14++;
                c2 = c8;
            }
            if (gVar2 != gVar) {
                arrayList2.add(gVar);
            }
            Object[] array2 = arrayList2.toArray(gVarArr2);
            BitSet bitSet = new BitSet(array2.length);
            bitSet.set(0);
            bitSet.set(array2.length - 1);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new z4.a(0, array2.length - 1));
            while (!arrayList3.isEmpty()) {
                z4.a aVar = (z4.a) arrayList3.remove(arrayList3.size() - i10);
                int i15 = aVar.f25883a;
                int i16 = aVar.f25884b;
                int i17 = i15 + 1;
                int i18 = -1;
                double d12 = 0.0d;
                while (i17 < i16) {
                    Object obj = array2[i17];
                    Object obj2 = array2[i15];
                    Object obj3 = array2[i16];
                    g gVar3 = (g) obj2;
                    double d13 = gVar3.f6551a;
                    int i19 = i10;
                    double d14 = gVar3.f6552b;
                    g gVar4 = (g) obj3;
                    double d15 = d14;
                    double d16 = gVar4.f6551a;
                    double d17 = gVar4.f6552b;
                    g gVar5 = (g) obj;
                    double d18 = gVar5.f6551a;
                    double d19 = gVar5.f6552b;
                    double d20 = d16 - d13;
                    double d21 = d17 - d15;
                    if (d20 != 0.0d || d21 != 0.0d) {
                        double d22 = (((d19 - d15) * d21) + ((d18 - d13) * d20)) / ((d21 * d21) + (d20 * d20));
                        if (d22 > 1.0d) {
                            d13 = d16;
                            d15 = d17;
                        } else if (d22 > 0.0d) {
                            d13 = (d20 * d22) + d13;
                            d15 = (d21 * d22) + d15;
                        }
                    }
                    double d23 = d18 - d13;
                    double d24 = d19 - d15;
                    double d25 = (d24 * d24) + (d23 * d23);
                    if (d25 > d12) {
                        i18 = i17;
                        d12 = d25;
                    }
                    i17++;
                    i10 = i19;
                }
                int i20 = i10;
                if (d12 > 0.25d) {
                    bitSet.set(i18);
                    arrayList3.add(new z4.a(i15, i18));
                    arrayList3.add(new z4.a(i18, i16));
                }
                i10 = i20;
            }
            ArrayList arrayList4 = new ArrayList(bitSet.cardinality());
            i5 = 0;
            for (int nextSetBit = bitSet.nextSetBit(0); nextSetBit >= 0; nextSetBit = bitSet.nextSetBit(nextSetBit + 1)) {
                arrayList4.add(array2[nextSetBit]);
            }
            array = arrayList4.toArray(gVarArr2);
        }
        g[] gVarArr3 = (g[]) array;
        float[] fArr2 = new float[gVarArr3.length * 3];
        for (int i21 = i5; i21 < gVarArr3.length; i21++) {
            int i22 = i21 * 3;
            fArr2[i22] = i21 / (gVarArr3.length - 1);
            g gVar6 = gVarArr3[i21];
            fArr2[i22 + 1] = (float) gVar6.f6551a;
            fArr2[i22 + 2] = (float) gVar6.f6552b;
        }
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap b(Activity activity, io.sentry.util.thread.a aVar, ILogger iLogger, n0 n0Var) {
        ILogger iLogger2;
        Throwable th2;
        Bitmap createBitmap;
        CountDownLatch countDownLatch;
        boolean z5 = false;
        if (activity.isFinishing() || activity.isDestroyed()) {
            iLogger.h(b5.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.h(b5.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            iLogger.h(b5.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View rootView = peekDecorView.getRootView();
        if (rootView == null) {
            iLogger.h(b5.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
            return null;
        }
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            iLogger.h(b5.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
            return null;
        }
        try {
            createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            countDownLatch = new CountDownLatch(1);
            n0Var.getClass();
        } catch (Throwable th3) {
            th = th3;
            iLogger2 = iLogger;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
                handlerThread.start();
                try {
                    Handler handler = new Handler(handlerThread.getLooper());
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    PixelCopy.request(window, createBitmap, new k(0, atomicBoolean, countDownLatch), handler);
                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        if (atomicBoolean.get()) {
                            z5 = true;
                        }
                    }
                } finally {
                    try {
                        if (z5) {
                        }
                    } finally {
                    }
                }
                if (z5) {
                    return null;
                }
                return createBitmap;
            }
            Canvas canvas = new Canvas(createBitmap);
            if (aVar.c()) {
                rootView.draw(canvas);
                countDownLatch.countDown();
                iLogger2 = iLogger;
            } else {
                iLogger2 = iLogger;
                try {
                    activity.runOnUiThread(new o(6, rootView, canvas, iLogger2, countDownLatch));
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    iLogger2.e(b5.ERROR, "Taking screenshot failed.", th2);
                    return null;
                }
            }
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
            }
        } catch (Throwable th5) {
            th2 = th5;
            iLogger2 = iLogger;
            iLogger2.e(b5.ERROR, "Taking screenshot failed.", th2);
            return null;
        }
    }

    public static void c(Canvas canvas, Path path) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(path, "path");
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public static Icon d(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static void e(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        i5 = configuration.colorMode;
        int i15 = i5 & 3;
        i10 = configuration2.colorMode;
        int i16 = i10 & 3;
        if (i15 != i16) {
            i14 = configuration3.colorMode;
            configuration3.colorMode = i14 | i16;
        }
        i11 = configuration.colorMode;
        int i17 = i11 & 12;
        i12 = configuration2.colorMode;
        int i18 = i12 & 12;
        if (i17 != i18) {
            i13 = configuration3.colorMode;
            configuration3.colorMode = i13 | i18;
        }
    }

    public static final int f(Bitmap bitmap) {
        int i5;
        Bitmap.Config config;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config2 = bitmap.getConfig();
            if (config2 == Bitmap.Config.ALPHA_8) {
                i5 = 1;
            } else if (config2 == Bitmap.Config.RGB_565 || config2 == Bitmap.Config.ARGB_4444) {
                i5 = 2;
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    config = Bitmap.Config.RGBA_F16;
                    if (config2 == config) {
                        i5 = 8;
                    }
                }
                i5 = 4;
            }
            return height * i5;
        }
    }

    public static float g(Location location) {
        return location.getBearingAccuracyDegrees();
    }

    public static float h(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float i(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float j(Location location) {
        return location.getSpeedAccuracyMetersPerSecond();
    }

    public static float k(Location location) {
        return location.getVerticalAccuracyMeters();
    }

    public static boolean l(Location location) {
        return location.hasBearingAccuracy();
    }

    public static boolean m(Location location) {
        return location.hasSpeedAccuracy();
    }

    public static boolean n(Location location) {
        return location.hasVerticalAccuracy();
    }

    public static final boolean o(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        config2 = Bitmap.Config.HARDWARE;
        return config == config2;
    }

    public static synchronized boolean p(Context context) {
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f22627a;
            if (context2 != null && (bool = f22628b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f22628b = null;
            if (q6.b.e()) {
                f22628b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f22628b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f22628b = Boolean.FALSE;
                }
            }
            f22627a = applicationContext;
            return f22628b.booleanValue();
        }
    }

    public static boolean q(File srcFile, File dstFile) {
        Intrinsics.checkNotNullParameter(srcFile, "srcFile");
        Intrinsics.checkNotNullParameter(dstFile, "dstFile");
        try {
            Files.move(srcFile.toPath(), dstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static int[] r(Shader shader, Field field, Field field2) {
        try {
            if (Build.VERSION.SDK_INT < 26 || field2 == null) {
                return (int[]) field.get(shader);
            }
            long[] jArr = (long[]) field2.get(shader);
            int length = jArr != null ? jArr.length : 0;
            int[] iArr = new int[length];
            for (int i5 = 0; i5 < length; i5++) {
                long j = jArr[i5];
                iArr[i5] = Color.argb(Color.alpha(j), Color.red(j), Color.green(j), Color.blue(j));
            }
            return iArr;
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public static void s(MenuItem menuItem, char c2, int i5) {
        menuItem.setAlphabeticShortcut(c2, i5);
    }

    public static void t(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void u(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void v(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void w(MenuItem menuItem, char c2, int i5) {
        menuItem.setNumericShortcut(c2, i5);
    }

    public static void x(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
