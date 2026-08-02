package defpackage;

import android.app.ActivityOptions;
import android.app.Notification;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.BackEvent;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class aa {
    public static int a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static boolean d(Notification notification) {
        return notification.hasPromotableCharacteristics();
    }

    public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) >= 17;
    }

    public static boolean g(Uri uri) {
        return uri != null && HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(uri.getScheme()) && U3.i.I0.equals(uri.getAuthority());
    }

    public static AssetFileDescriptor h(ContentResolver contentResolver, Uri uri) {
        return MediaStore.openAssetFileDescriptor(contentResolver, uri, "r", null);
    }

    public static void i(ActivityOptions activityOptions, boolean z) {
        activityOptions.setAllowPassThroughOnTouchOutside(z);
    }

    public static void j(Notification.Builder builder) {
        builder.setShortCriticalText(null);
    }

    public static final e8d k(BackEvent backEvent) {
        backEvent.getClass();
        return new e8d(backEvent.getProgress(), backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }
}
