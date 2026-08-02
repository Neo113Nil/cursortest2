package io.appmetrica.analytics.impl;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.aj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029aj {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011 A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #3 {all -> 0x002f, blocks: (B:3:0x0003, B:7:0x0011, B:9:0x001f), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #3 {all -> 0x002f, blocks: (B:3:0x0003, B:7:0x0011, B:9:0x001f), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ScreenInfo a(Context context) {
        Point point;
        int i5;
        float f6;
        DisplayMetrics displayMetrics;
        Display display;
        if (AndroidUtils.isApiAchieved(30)) {
            try {
                display = context.getDisplay();
            } catch (Throwable unused) {
            }
            if (display == null) {
                display = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            }
            if (display != null) {
                point = (Point) SystemServiceUtils.accessSystemServiceSafely(display, "getting display metrics", "Display", new Zi());
                if (point == null) {
                    return null;
                }
                int max = Math.max(point.x, point.y);
                int min = Math.min(point.x, point.y);
                try {
                    displayMetrics = context.getResources().getDisplayMetrics();
                    i5 = displayMetrics.densityDpi;
                } catch (Throwable unused2) {
                    i5 = 0;
                }
                try {
                    f6 = displayMetrics.density;
                } catch (Throwable unused3) {
                    f6 = 0.0f;
                    return new ScreenInfo(max, min, i5, f6);
                }
                return new ScreenInfo(max, min, i5, f6);
            }
            point = null;
            if (point == null) {
            }
        }
        display = null;
        if (display == null) {
        }
        if (display != null) {
        }
        point = null;
        if (point == null) {
        }
    }
}
