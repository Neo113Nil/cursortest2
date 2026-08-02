package d2;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.BackEvent;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class i {
    public static final b a(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return new b(backEvent.getProgress(), backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    public static String c() {
        String b10;
        if (Intrinsics.areEqual(gc.d.f9945a, "default") && gc.d.f9947c != null) {
            String str = gc.d.f9947c;
            Intrinsics.checkNotNull(str);
            gc.d.f9945a = str;
        } else if (Intrinsics.areEqual(gc.d.f9945a, "default")) {
            l0.i iVar = zc.f.d().f19306a;
            if (iVar.isEmpty()) {
                b10 = zc.f.b(null);
            } else {
                Locale locale = iVar.get(0);
                b10 = zc.f.b(locale != null ? locale.getLanguage() : null);
            }
            gc.d.f9945a = b10;
        }
        return gc.d.f9945a;
    }

    public static String d() {
        if (Intrinsics.areEqual(gc.d.f9948d, "default")) {
            l0.i iVar = zc.f.d().f19306a;
            String locale = iVar.isEmpty() ? Locale.getDefault().toString() : String.valueOf(iVar.get(0));
            Intrinsics.checkNotNullExpressionValue(locale, "let(...)");
            gc.d.f9948d = locale;
        }
        return gc.d.f9948d;
    }

    public static Locale e() {
        Locale locale;
        if (Intrinsics.areEqual(gc.d.f9946b, Locale.ROOT)) {
            if (Build.VERSION.SDK_INT >= 36) {
                locale = Locale.of(c());
                Intrinsics.checkNotNullExpressionValue(locale, "of(...)");
            } else {
                locale = new Locale(c());
            }
            gc.d.f9946b = locale;
        }
        return gc.d.f9946b;
    }

    public static int f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    public static CharSequence g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }
}
