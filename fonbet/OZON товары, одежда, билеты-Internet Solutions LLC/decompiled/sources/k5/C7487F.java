package k5;

import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;
import java.util.concurrent.Callable;
import k5.InterfaceC7518g2;

/* renamed from: k5.F, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7487F extends InterfaceC7518g2.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7488G f70534a;

    C7487F(C7488G c7488g) {
        this.f70534a = c7488g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018e  */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z11;
        C7488G c7488g = this.f70534a;
        c7488g.getClass();
        String str = Build.FINGERPRINT;
        boolean z12 = 1;
        if (!str.contains(C7563s0.a(new byte[]{46, -75, 23, -45, 33, -60, 30, 56, -84, 84, 93, 64, 89, 61, -79, 72})) && !str.startsWith(C7563s0.a(new byte[]{-99, -121, -84, -49, 24, -63, -70, 65, -78, -110, 16, -124, -73, 105, -58, -54}))) {
            String str2 = Build.MODEL;
            if (!str2.contains(C7563s0.a(new byte[]{67, -54, 21, 29, 79, 29, -29, 31, 67, 59, 123, -6, 16, 61, -2, -23}))) {
                Locale locale = Locale.ROOT;
                if (!str2.toLowerCase(locale).contains(C7563s0.a(new byte[]{-25, -66, 119, -23, -48, -89, 93, -14, -76, 113, -98, -13, -40, 73, -70, 119})) && !str2.contains(C7563s0.a(new byte[]{-116, -90, 16, 82, 50, 64, -17, -120, -18, -126, -109, -74, 116, -28, 117, -105})) && !str2.contains(C7563s0.a(new byte[]{46, -75, 23, -45, 33, -60, 30, 56, -84, 84, 93, 64, 89, 61, -79, 72})) && !str2.contains(C7563s0.a(new byte[]{-81, 98, -84, -34, -98, -80, 64, 64, 35, -52, -30, -46, -3, 62, 35, 46, -92, 0, -108, -63, 84, -31, -59, -34, -95, -36, 81, -21, 7, -67, 15, -19})) && !Build.MANUFACTURER.contains(C7563s0.a(new byte[]{114, 94, -72, 57, -33, -20, 49, 80, -67, -35, -113, -73, 93, -77, 119, 54}))) {
                    String str3 = Build.HARDWARE;
                    if (!str3.equals(C7563s0.a(new byte[]{106, -70, 123, -6, -93, -43, 64, -107, -25, -16, -125, 80, 60, -99, 9, 101})) && !str3.equals(C7563s0.a(new byte[]{39, -11, -6, -60, -106, 113, 97, 92, 97, 116, 56, -97, -82, 89, 121, -95})) && !Build.DEVICE.equals(C7563s0.a(new byte[]{-38, -96, -84, 11, 96, -110, -91, -60, -127, -11, -41, -43, -29, 84, -78, -35}))) {
                        String str4 = Build.PRODUCT;
                        if (!str4.equals(C7563s0.a(new byte[]{Byte.MIN_VALUE, -127, -37, 64, -86, -118, 2, 56, -85, 94, -47, 46, -91, -44, -9, -81})) && !str4.equals(C7563s0.a(new byte[]{67, -54, 21, 29, 79, 29, -29, 31, 67, 59, 123, -6, 16, 61, -2, -23})) && !str4.equals(C7563s0.a(new byte[]{124, -64, -46, -36, 102, -16, -29, 46, -60, -12, -21, 73, 126, -85, -36, -43})) && !str4.equals(C7563s0.a(new byte[]{-20, 15, -50, 33, 49, -12, 116, -110, 48, -2, 76, 113, 20, 110, 98, -68})) && !Build.BOARD.toLowerCase(locale).contains(C7563s0.a(new byte[]{126, 37, -71, -45, 21, -69, -102, -80, -73, -111, -5, -71, 29, -40, 15, 55})) && !Build.BOOTLOADER.toLowerCase(locale).contains(C7563s0.a(new byte[]{126, 37, -71, -45, 21, -69, -102, -80, -73, -111, -5, -71, 29, -40, 15, 55})) && !str3.toLowerCase(locale).contains(C7563s0.a(new byte[]{126, 37, -71, -45, 21, -69, -102, -80, -73, -111, -5, -71, 29, -40, 15, 55})) && !str4.toLowerCase(locale).contains(C7563s0.a(new byte[]{126, 37, -71, -45, 21, -69, -102, -80, -73, -111, -5, -71, 29, -40, 15, 55})) && !Build.SERIAL.toLowerCase(locale).contains(C7563s0.a(new byte[]{126, 37, -71, -45, 21, -69, -102, -80, -73, -111, -5, -71, 29, -40, 15, 55}))) {
                            z11 = false;
                            if (!z11) {
                                z12 = z11;
                            } else if (!Build.BRAND.startsWith(C7563s0.a(new byte[]{-99, -121, -84, -49, 24, -63, -70, 65, -78, -110, 16, -124, -73, 105, -58, -54})) || !Build.DEVICE.startsWith(C7563s0.a(new byte[]{-99, -121, -84, -49, 24, -63, -70, 65, -78, -110, 16, -124, -73, 105, -58, -54}))) {
                                z12 = 0;
                            }
                            if (z12 == 0) {
                                z12 = C7488G.y(c7488g);
                            }
                            if (z12 == 0) {
                                final PackageManager packageManager = c7488g.f70555e.getPackageManager();
                                z12 = ((Boolean) c7488g.n(new Callable() { // from class: k5.E
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return C7488G.w(packageManager);
                                    }
                                })).booleanValue();
                            }
                            c7488g.a(Integer.valueOf(z12));
                        }
                    }
                }
            }
        }
        z11 = true;
        if (!z11) {
        }
        if (z12 == 0) {
        }
        if (z12 == 0) {
        }
        c7488g.a(Integer.valueOf(z12));
    }
}
