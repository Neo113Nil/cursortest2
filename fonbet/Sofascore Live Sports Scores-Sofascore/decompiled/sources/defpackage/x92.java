package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x92 implements j1g {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ x92(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.j1g
    public final boolean a(Object obj, uvd uvdVar) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) || "robolectric".equals(Build.FINGERPRINT)) {
                }
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.j1g
    public final e1g b(Object obj, int i, int i2, uvd uvdVar) {
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                n75 n75Var = (n75) obj2;
                return n75Var.a(new x6k(10, (ByteBuffer) obj, n75Var.d, n75Var.c), i, i2, uvdVar, n75.j);
            case 1:
                n75 n75Var2 = (n75) obj2;
                return n75Var2.a(new l2a((ParcelFileDescriptor) obj, n75Var2.d, n75Var2.c), i, i2, uvdVar, n75.j);
            default:
                Bitmap b = ((k9i) obj).b();
                dx1 dx1Var = (dx1) obj2;
                if (b == null) {
                    return null;
                }
                return new ex1(dx1Var, b);
        }
    }
}
