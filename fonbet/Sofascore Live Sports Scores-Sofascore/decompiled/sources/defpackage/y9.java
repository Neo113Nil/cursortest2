package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import androidx.core.app.NotificationCompat;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.android.gms.internal.ads.zzeh;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class y9 {
    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static Rect b(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics().getBounds();
    }

    public static MediaRouter2 c(Context context) {
        return MediaRouter2.getInstance(context);
    }

    public static ArrayList d(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }

    public static CharSequence e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static String f(be beVar) {
        if (beVar instanceof ae) {
            return "image/*";
        }
        if (beVar instanceof zd) {
            return null;
        }
        zzl.b();
        return null;
    }

    public static Insets g(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static boolean h() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    public static boolean i(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static boolean j(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean k(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public static void l(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | NotificationCompat.FLAG_LOCAL_ONLY);
        window.setDecorFitsSystemWindows(z);
    }

    public static void m(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void n(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void o(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void p(Outline outline, b20 b20Var) {
        if (b20Var instanceof b20) {
            outline.setPath(b20Var.a);
        } else {
            a70.m("Unable to obtain android.graphics.Path");
        }
    }

    public static void q(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void r(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 1);
        } catch (IllegalStateException e) {
            tgj.A("Failed to call Surface.setFrameRate", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static mac s(MediaRoute2Info mediaRoute2Info) {
        int i;
        CharSequence description;
        Uri iconUri;
        Bundle extras;
        Bundle bundle;
        ArrayList parcelableArrayList;
        List<String> features;
        ArrayList<String> stringArrayList;
        if (mediaRoute2Info != null) {
            g7h g7hVar = new g7h(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
            Bundle bundle2 = (Bundle) g7hVar.b;
            bundle2.putInt("connectionState", mediaRoute2Info.getConnectionState());
            bundle2.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
            bundle2.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
            bundle2.putInt("volume", mediaRoute2Info.getVolume());
            Bundle extras2 = mediaRoute2Info.getExtras();
            if (extras2 == null) {
                bundle2.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, null);
            } else {
                bundle2.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, new Bundle(extras2));
            }
            bundle2.putBoolean("enabled", true);
            bundle2.putBoolean("canDisconnect", false);
            if (Build.VERSION.SDK_INT >= 34) {
                bundle2.putStringArrayList("deduplicationIds", new ArrayList<>(q9.m(mediaRoute2Info)));
                int s = q9.s(mediaRoute2Info);
                i = 2;
                if (s == 2) {
                    i = 12;
                } else if (s == 3) {
                    i = 13;
                } else if (s == 4) {
                    i = 14;
                } else if (s == 22) {
                    i = 20;
                } else if (s == 23) {
                    i = 21;
                } else if (s == 26) {
                    i = 22;
                } else if (s == 29) {
                    i = 24;
                } else if (s != 2000) {
                    switch (s) {
                        case 8:
                            i = 3;
                            break;
                        case 9:
                            i = 16;
                            break;
                        case 10:
                            i = 23;
                            break;
                        case 11:
                            i = 17;
                            break;
                        case 12:
                            i = 18;
                            break;
                        case 13:
                            i = 19;
                            break;
                        default:
                            switch (s) {
                                case 1001:
                                    i = 1;
                                    break;
                                case 1003:
                                    i = 4;
                                    break;
                                case 1004:
                                    i = 5;
                                    break;
                                case 1005:
                                    i = 6;
                                    break;
                                case 1006:
                                    i = 7;
                                    break;
                                case 1007:
                                    i = 8;
                                    break;
                                case 1008:
                                    i = 9;
                                    break;
                                case 1009:
                                    i = 10;
                                    break;
                                case 1010:
                                    i = 11;
                                    break;
                            }
                    }
                } else {
                    i = 1000;
                }
                description = mediaRoute2Info.getDescription();
                if (description != null) {
                    bundle2.putString("status", description.toString());
                }
                iconUri = mediaRoute2Info.getIconUri();
                if (iconUri != null) {
                    bundle2.putString("iconUri", iconUri.toString());
                }
                extras = mediaRoute2Info.getExtras();
                if (extras != null && extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
                    bundle = extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                    if (bundle != null) {
                        bundle2.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, null);
                    } else {
                        bundle2.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, new Bundle(bundle));
                    }
                    if (i == 0) {
                        i = extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
                    }
                    bundle2.putInt("deviceType", i);
                    bundle2.putInt("playbackType", extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                    parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                    if (parcelableArrayList != null) {
                        g7hVar.e(parcelableArrayList);
                    }
                    features = mediaRoute2Info.getFeatures();
                    if (features.contains("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE")) {
                        bundle2.putBoolean("isDynamicGroupRoute", true);
                    }
                    if (features.contains("android.media.route.feature.REMOTE_GROUP_PLAYBACK") && (stringArrayList = extras.getStringArrayList("androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS")) != null && !stringArrayList.isEmpty()) {
                        g7hVar.f(stringArrayList);
                    }
                    return g7hVar.k();
                }
            }
            i = 0;
            description = mediaRoute2Info.getDescription();
            if (description != null) {
            }
            iconUri = mediaRoute2Info.getIconUri();
            if (iconUri != null) {
            }
            extras = mediaRoute2Info.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                if (bundle != null) {
                }
                if (i == 0) {
                }
                bundle2.putInt("deviceType", i);
                bundle2.putInt("playbackType", extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                if (parcelableArrayList != null) {
                }
                features = mediaRoute2Info.getFeatures();
                if (features.contains("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE")) {
                }
                if (features.contains("android.media.route.feature.REMOTE_GROUP_PLAYBACK")) {
                    g7hVar.f(stringArrayList);
                }
                return g7hVar.k();
            }
        }
        return null;
    }

    public static void t(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 1);
        } catch (IllegalStateException e) {
            zzeh.f("Failed to call Surface.setFrameRate", e);
        }
    }

    public static boolean u(Context context, TestingConfiguration testingConfiguration) {
        if (testingConfiguration != null && testingConfiguration.forceTvMode()) {
            return true;
        }
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean v(Context context) {
        return u(context, null) && context.getPackageManager().hasSystemFeature("android.software.leanback") && !context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static int w() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }
}
