package i0;

import C.S;
import H.c;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.I0;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6979b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private static volatile I0 f65673a;

    static {
        G0.b().c(c.b(), new C6978a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        if ("OP4E75L1".equalsIgnoreCase(android.os.Build.DEVICE) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
    
        if ("Q706F".equalsIgnoreCase(android.os.Build.DEVICE) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if ("Q2Q".equalsIgnoreCase(r3) == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(F0 f02) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        boolean z12 = false;
        if (Build.VERSION.SDK_INT < 33) {
            String str = Build.MANUFACTURER;
            if ("SAMSUNG".equalsIgnoreCase(str)) {
                String str2 = Build.DEVICE;
                if (!"F2Q".equalsIgnoreCase(str2)) {
                }
                z11 = true;
                if (f02.a(z11, SurfaceViewStretchedQuirk.class)) {
                    arrayList.add(new SurfaceViewStretchedQuirk());
                }
                if ("XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL)) {
                    z12 = true;
                }
                if (f02.a(z12, SurfaceViewNotCroppedByParentQuirk.class)) {
                    arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
                }
                f65673a = new I0(arrayList);
                S.a("DeviceQuirks", "view DeviceQuirks = " + I0.d(f65673a));
            }
            if ("OPPO".equalsIgnoreCase(str)) {
            }
            if ("LENOVO".equalsIgnoreCase(str)) {
            }
        }
        z11 = false;
        if (f02.a(z11, SurfaceViewStretchedQuirk.class)) {
        }
        if ("XIAOMI".equalsIgnoreCase(Build.MANUFACTURER)) {
            z12 = true;
        }
        if (f02.a(z12, SurfaceViewNotCroppedByParentQuirk.class)) {
        }
        f65673a = new I0(arrayList);
        S.a("DeviceQuirks", "view DeviceQuirks = " + I0.d(f65673a));
    }

    public static <T extends E0> T b(@NonNull Class<T> cls) {
        return (T) f65673a.b(cls);
    }
}
