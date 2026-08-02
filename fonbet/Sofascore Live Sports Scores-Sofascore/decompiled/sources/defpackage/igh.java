package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class igh {
    public static final /* synthetic */ int b = 0;
    public final fok a = fok.b;

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Intrinsics.c(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return Intrinsics.c(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean e(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    public static final boolean f(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    public static final boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    public static final boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    public final hal c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        if (sidecarWindowLayoutInfo == null) {
            return new hal(km5.a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        hgh.d(sidecarDeviceState2, hgh.b(sidecarDeviceState));
        return new hal(d(hgh.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList k = me4.k(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g79 i = i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (i != null) {
                k.add(i);
            }
        }
        return k;
    }

    public final g79 i(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        f79 f79Var;
        ue8 ue8Var;
        sidecarDisplayFeature.getClass();
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new bkk(sidecarDisplayFeature, "igh", this.a, wxf.d).L("Type must be either TYPE_FOLD or TYPE_HINGE", new dgh()).L("Feature bounds must not be 0", new egh()).L("TYPE_FOLD must have 0 area", new fgh()).L("Feature be pinned to either left or top", new ggh()).u();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            f79Var = f79.c;
        } else {
            if (type != 2) {
                return null;
            }
            f79Var = f79.d;
        }
        int b2 = hgh.b(sidecarDeviceState);
        if (b2 == 0 || b2 == 1) {
            return null;
        }
        if (b2 != 2) {
            ue8Var = ue8.c;
            if (b2 != 3 && b2 == 4) {
                return null;
            }
        } else {
            ue8Var = ue8.d;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        rect.getClass();
        return new g79(new t02(rect), f79Var, ue8Var);
    }
}
