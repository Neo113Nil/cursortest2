package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uie implements rie {
    public static final uie a = new uie();

    @Override // defpackage.rie
    public final boolean a() {
        return true;
    }

    @Override // defpackage.rie
    public final qie b(View view, boolean z, long j, float f, float f2, boolean z2, kx4 kx4Var, float f3) {
        if (z) {
            return new tie(new Magnifier(view));
        }
        long R0 = kx4Var.R0(j);
        float H0 = kx4Var.H0(f);
        float H02 = kx4Var.H0(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (R0 != 9205357640488583168L) {
            builder.setSize(wzb.b(Float.intBitsToFloat((int) (R0 >> 32))), wzb.b(Float.intBitsToFloat((int) (R0 & 4294967295L))));
        }
        if (!Float.isNaN(H0)) {
            builder.setCornerRadius(H0);
        }
        if (!Float.isNaN(H02)) {
            builder.setElevation(H02);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new tie(builder.build());
    }
}
