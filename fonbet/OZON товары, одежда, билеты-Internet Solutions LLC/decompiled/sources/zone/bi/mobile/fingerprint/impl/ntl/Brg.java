package zone.bi.mobile.fingerprint.impl.ntl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import k5.O1;
import k5.r3;

/* loaded from: classes4.dex */
public final class Brg {

    /* renamed from: a, reason: collision with root package name */
    private static final String f109334a = r3.a(new byte[]{-62, -127, -85, -8, 2, 94, -94, 100, 3, -98, -105, -117, -60, 68, 22, -51});

    /* renamed from: b, reason: collision with root package name */
    private static final String f109335b = r3.a(new byte[]{37, -45, -29, 126, 39, -103, -8, -74, 114, -82, 76, -58, -5, 97, 10, -110, 83, 32, 51, -41, 62, 48, -91, 118, -66, 117, -112, -45, 67, -101, -82, 81});

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f109336c = {r3.a(new byte[]{-7, -46, -26, -123, -69, -48, 9, 37, 40, -24, 70, 91, 26, 78, 108, -5}), r3.a(new byte[]{7, 97, 2, 67, -76, 73, 5, Byte.MIN_VALUE, -40, 70, -2, -92, 46, 117, 0, 16}), r3.a(new byte[]{56, 91, -51, -102, 48, 35, 125, 7, 117, 3, 122, -70, -117, -5, -85, Byte.MAX_VALUE})};

    private static native int ff();

    private static native int fm();

    private static native int fs();

    public final int a() {
        try {
            Iterator it = O1.a(new File(f109335b)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                for (String str2 : f109336c) {
                    if (str.contains(str2)) {
                        return 2;
                    }
                }
            }
            return fm();
        } catch (IOException unused) {
            return -1;
        }
    }

    public final int b() {
        return fs();
    }

    public final int c() {
        return ff();
    }

    public final boolean d(@NonNull Context context) {
        boolean z11;
        String str = context.getApplicationInfo().nativeLibraryDir;
        String str2 = f109334a;
        boolean z12 = false;
        try {
            System.loadLibrary(str2);
            z11 = true;
        } catch (UnsatisfiedLinkError unused) {
            z11 = false;
        }
        if (z11) {
            return z11;
        }
        try {
            System.load(String.format(Locale.ROOT, r3.a(new byte[]{16, -26, -115, -112, -118, 50, 75, -100, -77, -40, 11, -122, -127, -94, 28, -63}), str, str2));
            z12 = true;
        } catch (UnsatisfiedLinkError unused2) {
        }
        return z12;
    }
}
