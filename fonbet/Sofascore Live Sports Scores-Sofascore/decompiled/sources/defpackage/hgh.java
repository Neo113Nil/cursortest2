package defpackage;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class hgh {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        } catch (NoSuchFieldError unused2) {
            Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
            invoke.getClass();
            return ((Integer) invoke).intValue();
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        int a = a(sidecarDeviceState);
        if (a < 0 || a > 4) {
            return 0;
        }
        return a;
    }

    public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        sidecarWindowLayoutInfo.getClass();
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? km5.a : list;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return km5.a;
            }
        } catch (NoSuchFieldError unused2) {
            Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
            invoke.getClass();
            return (List) invoke;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            try {
                sidecarDeviceState.posture = i;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
            }
        } catch (IllegalAccessException unused2) {
            Unit unit = Unit.a;
        } catch (NoSuchMethodException unused3) {
            Unit unit2 = Unit.a;
        } catch (InvocationTargetException unused4) {
            Unit unit3 = Unit.a;
        }
    }
}
