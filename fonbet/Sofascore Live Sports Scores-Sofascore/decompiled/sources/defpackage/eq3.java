package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.LocusId;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.text.MeasuredText;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityManager;
import androidx.media3.common.b;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.sofascore.results.service.NotificationTextToSpeechService;
import defpackage.a8f;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class eq3 {
    public static final long A(xy xyVar) {
        return xyVar.getUniqueDrawingId();
    }

    public static boolean B(Handler handler, Runnable runnable) {
        return handler.hasCallbacks(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void C(Context context) {
        boolean z;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (z1a.I(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (Build.VERSION.SDK_INT >= 29) {
                Tasks.forResult(null);
                return;
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                    SharedPreferences.Editor edit = z1a.I(context).edit();
                    edit.putBoolean("proxy_notification_initialized", true);
                    edit.apply();
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                    if (z) {
                        notificationManager.setNotificationDelegate("com.google.android.gms");
                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                        notificationManager.setNotificationDelegate(null);
                    }
                } else {
                    context.getPackageName();
                }
                taskCompletionSource.getTask();
                return;
            } finally {
                taskCompletionSource.trySetResult(null);
            }
        }
        z = true;
        if (Build.VERSION.SDK_INT >= 29) {
        }
    }

    public static boolean D(Notification.Action action) {
        return action.isContextual();
    }

    public static final boolean E(ActivityManager activityManager, ComponentName componentName) {
        List<ActivityManager.AppTask> appTasks;
        ActivityManager.AppTask appTask;
        ActivityManager.RecentTaskInfo taskInfo;
        componentName.getClass();
        return Intrinsics.c((activityManager == null || (appTasks = activityManager.getAppTasks()) == null || (appTask = (ActivityManager.AppTask) CollectionsKt.firstOrNull(appTasks)) == null || (taskInfo = appTask.getTaskInfo()) == null) ? null : taskInfo.topActivity, componentName);
    }

    public static boolean F(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                return "com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate());
            }
            context.getPackageName();
        }
        return false;
    }

    public static Object G(cy1 cy1Var) {
        switch (dy1.a[cy1Var.ordinal()]) {
            case 1:
                return BlendMode.CLEAR;
            case 2:
                return BlendMode.SRC;
            case 3:
                return BlendMode.DST;
            case 4:
                return BlendMode.SRC_OVER;
            case 5:
                return BlendMode.DST_OVER;
            case 6:
                return BlendMode.SRC_IN;
            case 7:
                return BlendMode.DST_IN;
            case 8:
                return BlendMode.SRC_OUT;
            case 9:
                return BlendMode.DST_OUT;
            case 10:
                return BlendMode.SRC_ATOP;
            case 11:
                return BlendMode.DST_ATOP;
            case 12:
                return BlendMode.XOR;
            case 13:
                return BlendMode.PLUS;
            case 14:
                return BlendMode.MODULATE;
            case 15:
                return BlendMode.SCREEN;
            case 16:
                return BlendMode.OVERLAY;
            case 17:
                return BlendMode.DARKEN;
            case 18:
                return BlendMode.LIGHTEN;
            case 19:
                return BlendMode.COLOR_DODGE;
            case 20:
                return BlendMode.COLOR_BURN;
            case 21:
                return BlendMode.HARD_LIGHT;
            case 22:
                return BlendMode.SOFT_LIGHT;
            case 23:
                return BlendMode.DIFFERENCE;
            case 24:
                return BlendMode.EXCLUSION;
            case 25:
                return BlendMode.MULTIPLY;
            case 26:
                return BlendMode.HUE;
            case 27:
                return BlendMode.SATURATION;
            case 28:
                return BlendMode.COLOR;
            case 29:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets H(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void I(Resources.Theme theme) {
        theme.rebase();
    }

    public static final void J(Activity activity, a8f.a aVar) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (defpackage.aik.C(r9, r9) == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Intent K(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        int i2 = i & 2;
        if (i2 == 0 && (i & 4) == 0) {
            a70.p("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (i2 != 0 && (i & 4) != 0) {
            a70.p("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            return null;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, null, i);
        }
        if ((i & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, null, 0);
        }
        String str2 = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (aik.C(context, str2) != 0) {
            if (i3 >= 29) {
                str2 = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            }
            cp4.h(lnb.o("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
            return null;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str2, null);
    }

    public static void L(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void M(AudioAttributes.Builder builder) {
        builder.setAllowedCapturePolicy(1);
    }

    public static void N(Paint paint, Object obj) {
        paint.setBlendMode((BlendMode) obj);
    }

    public static void O(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void P(Notification.Action.Builder builder, boolean z) {
        builder.setContextual(z);
    }

    public static void Q(RemoteInput.Builder builder, int i) {
        builder.setEditChoicesBeforeSending(i);
    }

    public static void R(AudioAttributes.Builder builder) {
        builder.setHapticChannelsMuted(true);
    }

    public static void S(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            eb5.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                db5.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            db5.a(outline, path);
        }
    }

    public static void T(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void U(NotificationTextToSpeechService notificationTextToSpeechService, Notification notification) {
        notificationTextToSpeechService.startForeground(3, notification, 2);
    }

    public static void V(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            rik o = rik.o();
            int i3 = SystemForegroundService.e;
            o.getClass();
        } catch (SecurityException unused2) {
            rik o2 = rik.o();
            int i4 = SystemForegroundService.e;
            o2.getClass();
        }
    }

    public static void W(NotificationTextToSpeechService notificationTextToSpeechService, Notification notification) {
        notificationTextToSpeechService.startForeground(3, notification, 2);
    }

    public static final BlendMode X(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        if (i == 0) {
            blendMode6 = BlendMode.CLEAR;
            return blendMode6;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            blendMode5 = BlendMode.SRC_OVER;
            return blendMode5;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 5) {
            blendMode4 = BlendMode.SRC_IN;
            return blendMode4;
        }
        if (i == 6) {
            blendMode3 = BlendMode.DST_IN;
            return blendMode3;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 9) {
            blendMode2 = BlendMode.SRC_ATOP;
            return blendMode2;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        if (i == 28) {
            return BlendMode.LUMINOSITY;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final ImageDecoder.Source Y(yt9 yt9Var, tvd tvdVar, boolean z) {
        uae L0;
        if (yt9Var.getFileSystem() == s18.a && (L0 = yt9Var.L0()) != null) {
            return ImageDecoder.createSource(L0.toFile());
        }
        oyn x = yt9Var.x();
        if (x instanceof ti0) {
            return ImageDecoder.createSource(tvdVar.a.getAssets(), ((ti0) x).h);
        }
        if ((x instanceof dp3) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((dp3) x).h;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new ji2(assetFileDescriptor, 10));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (x instanceof u1g) {
            u1g u1gVar = (u1g) x;
            if (u1gVar.h.equals(tvdVar.a.getPackageName())) {
                return ImageDecoder.createSource(tvdVar.a.getResources(), u1gVar.i);
            }
        }
        if (!(x instanceof da2)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z || ((da2) x).h.isDirect()) {
            return ImageDecoder.createSource(((da2) x).h);
        }
        return null;
    }

    public static final PorterDuff.Mode Z(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            by1.j();
            MediaCodecInfo.VideoCapabilities.PerformancePoint d2 = by1.d(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (sw9.f(supportedPerformancePoints.get(i4)).covers(d2)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && v8a.b == null) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 37) {
                    int n = n(true);
                    if (i5 < 35) {
                        v8a.b = Boolean.valueOf(z);
                        if (z) {
                        }
                    } else {
                        v8a.b = Boolean.valueOf(z);
                        if (z) {
                        }
                    }
                }
                z = false;
                v8a.b = Boolean.valueOf(z);
                if (z) {
                }
            }
            return i3;
        }
        return 0;
    }

    public static final void a0(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    public static int b(Context context, String str) {
        vha.H(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new fgd(context).b.areNotificationsEnabled() ? 0 : -1;
    }

    public static LocusId c(String str) {
        return new LocusId(str);
    }

    public static void d(Canvas canvas) {
        canvas.disableZ();
    }

    public static void e(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    public static void f(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    public static void g(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }

    public static void h(Canvas canvas, RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    public static void i(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void j(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void k(Canvas canvas, MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public static void l(Canvas canvas) {
        canvas.enableZ();
    }

    public static void m(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static int n(boolean z) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            qm8 qm8Var = new qm8();
            qm8Var.n = sjc.p("video/avc");
            b bVar = new b(qm8Var);
            if (bVar.o != null) {
                vvf g = s3c.g(bVar, z, false);
                for (int i = 0; i < g.d; i++) {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((a3c) g.get(i)).d.getVideoCapabilities();
                    if (videoCapabilities != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        by1.j();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (sw9.f(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (m3c unused) {
        }
        return 0;
    }

    public static boolean o(Notification notification) {
        return notification.getAllowSystemGeneratedContextualActions();
    }

    public static Notification.BubbleMetadata p(Notification notification) {
        return notification.getBubbleMetadata();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0047, code lost:
    
        if (r5.c == r9.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList q(int i, Context context) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        x1g x1gVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        y1g y1gVar = new y1g(resources, theme);
        synchronized (z1g.c) {
            try {
                SparseArray sparseArray = (SparseArray) z1g.b.get(y1gVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (x1gVar = (x1g) sparseArray.get(i)) != null) {
                    if (x1gVar.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (x1gVar.c != 0) {
                            }
                            colorStateList2 = x1gVar.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = z1g.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = m23.a(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (z1g.c) {
            try {
                WeakHashMap weakHashMap = z1g.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(y1gVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(y1gVar, sparseArray2);
                }
                sparseArray2.append(i, new x1g(colorStateList, y1gVar.a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static ColorStateList r(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    public static vvf s(an0 an0Var) {
        zu9 s = hv9.s();
        cck it = jn0.h.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (Build.VERSION.SDK_INT >= nik.s(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), an0Var.a())) {
                s.c(num);
            }
        }
        s.c(2);
        return s.g();
    }

    public static int t(RemoteInput remoteInput) {
        return remoteInput.getEditChoicesBeforeSending();
    }

    public static String u(LocusId locusId) {
        return locusId.getId();
    }

    public static LocusId v(Notification notification) {
        return notification.getLocusId();
    }

    public static int w(int i, int i2, an0 an0Var) {
        for (int i3 = 10; i3 > 0; i3--) {
            int t = nik.t(i3);
            if (t != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(t).build(), an0Var.a())) {
                return i3;
            }
        }
        return 0;
    }

    public static String x(Context context) {
        return context.getOpPackageName();
    }

    public static int y(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    public static final void z(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }
}
