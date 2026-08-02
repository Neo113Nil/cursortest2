package com.google.firebase.messaging;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.ImageDecoder;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.internal.measurement.d5;
import io.appmetrica.analytics.impl.C0122e9;
import io.sentry.android.core.w0;
import io.sentry.b6;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;
import okio.Path;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class u {
    public static final void a(View view, ViewTreeObserver.OnDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static ColorFilter b(Object obj) {
        return new BlendModeColorFilter(0, (BlendMode) obj);
    }

    public static int c(BlendMode blendMode) {
        switch (u9.b.f24071a[blendMode.ordinal()]) {
            case 1:
                return 26;
            case 2:
                return 9;
            case 3:
                return 30;
            case 4:
                return 13;
            case 5:
                return 28;
            case 6:
                return 11;
            case 7:
                return 29;
            case 8:
                return 12;
            case 9:
                return 27;
            case 10:
                return 10;
            case 11:
                return 31;
            case 12:
                return 22;
            case 13:
                return 19;
            case 14:
                return 25;
            case 15:
                return 21;
            case 16:
                return 7;
            case 17:
                return 17;
            case 18:
                return 6;
            case 19:
                return 5;
            case 20:
                return 15;
            case 21:
                return 24;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return 8;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return 14;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return 20;
            case C0122e9.F /* 25 */:
                return 16;
            case C0122e9.G /* 26 */:
                return 23;
            case C0122e9.H /* 27 */:
                return 4;
            case 28:
                return 18;
            default:
                return 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(Context context) {
        boolean z5;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (rh.g.s(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z5 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (Build.VERSION.SDK_INT >= 29) {
                d5.q(null);
                return;
            }
            w7.g gVar = new w7.g();
            try {
                if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                    SharedPreferences.Editor edit = rh.g.s(context).edit();
                    edit.putBoolean("proxy_notification_initialized", true);
                    edit.apply();
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                    if (z5) {
                        notificationManager.setNotificationDelegate("com.google.android.gms");
                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                        notificationManager.setNotificationDelegate(null);
                    }
                } else {
                    w0.d("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                }
                return;
            } finally {
                gVar.d(null);
            }
        }
        z5 = true;
        if (Build.VERSION.SDK_INT >= 29) {
        }
    }

    public static boolean e() {
        return Trace.isEnabled();
    }

    public static boolean f(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                w0.d("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    return true;
                }
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
                return true;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public static final Pair g(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!view.isAttachedToWindow()) {
            return new Pair(Boolean.FALSE, null);
        }
        if (view.getWindowVisibility() != 0) {
            return new Pair(Boolean.FALSE, null);
        }
        Object obj = view;
        while (obj instanceof View) {
            float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) obj).getTransitionAlpha() : 1.0f;
            View view2 = (View) obj;
            if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                return new Pair(Boolean.FALSE, null);
            }
            obj = view2.getParent();
        }
        Rect rect = new Rect();
        return new Pair(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
    }

    public static Object h(g0.a aVar) {
        switch (g0.b.f9673a[aVar.ordinal()]) {
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
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return BlendMode.SOFT_LIGHT;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return BlendMode.DIFFERENCE;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return BlendMode.EXCLUSION;
            case C0122e9.F /* 25 */:
                return BlendMode.MULTIPLY;
            case C0122e9.G /* 26 */:
                return BlendMode.HUE;
            case C0122e9.H /* 27 */:
                return BlendMode.SATURATION;
            case 28:
                return BlendMode.COLOR;
            case C0122e9.I /* 29 */:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets i(int i5, int i10, int i11, int i12) {
        return Insets.of(i5, i10, i11, i12);
    }

    public static final void j(View view, io.sentry.android.replay.a0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static void k(SystemForegroundService systemForegroundService, int i5, Notification notification, int i10) {
        systemForegroundService.startForeground(i5, notification, i10);
    }

    public static void l(SystemForegroundService systemForegroundService, int i5, Notification notification, int i10) {
        try {
            systemForegroundService.startForeground(i5, notification, i10);
        } catch (ForegroundServiceStartNotAllowedException e7) {
            e3.x e9 = e3.x.e();
            String str = SystemForegroundService.f2937e;
            if (e9.f8571a <= 5) {
                w0.n(str, "Unable to start foreground service", e7);
            }
        } catch (SecurityException e10) {
            e3.x e11 = e3.x.e();
            String str2 = SystemForegroundService.f2937e;
            if (e11.f8571a <= 5) {
                w0.n(str2, "Unable to start foreground service", e10);
            }
        }
    }

    public static final ImageDecoder.Source m(d4.r rVar, q4.n nVar, boolean z5) {
        Path b02;
        if (rVar.getFileSystem() == FileSystem.SYSTEM && (b02 = rVar.b0()) != null) {
            return ImageDecoder.createSource(b02.toFile());
        }
        a.a A = rVar.A();
        if (A instanceof d4.a) {
            return ImageDecoder.createSource(nVar.f22007a.getAssets(), ((d4.a) A).f8111e);
        }
        if ((A instanceof d4.g) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((d4.g) A).f8127f;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new d4.z(0, assetFileDescriptor));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (A instanceof d4.s) {
            d4.s sVar = (d4.s) A;
            if (Intrinsics.areEqual(sVar.f8149e, nVar.f22007a.getPackageName())) {
                return ImageDecoder.createSource(nVar.f22007a.getResources(), sVar.f8150f);
            }
        }
        if (!(A instanceof d4.f)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z5 || ((d4.f) A).f8125e.isDirect()) {
            return ImageDecoder.createSource(((d4.f) A).f8125e);
        }
        return null;
    }

    public static final void n(View view, io.sentry.android.replay.viewhierarchy.f parentNode, b6 options) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        Intrinsics.checkNotNullParameter(options, "options");
        if ((view instanceof ViewGroup) && !io.sentry.android.replay.viewhierarchy.b.b(view, parentNode, options)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (childAt != null) {
                    viewGroup.indexOfChild(childAt);
                    io.sentry.android.replay.viewhierarchy.f h10 = u6.h.h(childAt, parentNode, options);
                    arrayList.add(h10);
                    n(childAt, h10, options);
                }
            }
            parentNode.f16167f = arrayList;
        }
    }
}
