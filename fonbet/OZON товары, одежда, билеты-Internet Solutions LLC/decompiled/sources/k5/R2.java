package k5;

import android.content.Context;
import androidx.annotation.NonNull;
import zone.bi.mobile.fingerprint.impl.ntl.Brg;

/* loaded from: classes8.dex */
public final class R2 {

    /* renamed from: a, reason: collision with root package name */
    private Brg f70635a;

    public final synchronized boolean a() {
        return this.f70635a != null;
    }

    @NonNull
    public final Brg b() {
        if (a()) {
            return this.f70635a;
        }
        throw new Mm0.a(r3.a(new byte[]{62, 107, 70, -124, 53, 69, 78, -46, 19, -29, 61, 72, -59, -103, -116, -44, 0, 14, 112, 16, -106, 69, 56, -92, -55, 72, 6, 43, -95, 6, 108, -117, -105, 119, -4, 98, -103, 99, 30, -37, -70, -44, -112, 2, 78, 78, 8, 56}));
    }

    public final synchronized boolean c(@NonNull Context context) {
        boolean a11;
        a11 = a();
        if (!a11) {
            Brg brg = new Brg();
            boolean d11 = brg.d(context);
            if (d11) {
                this.f70635a = brg;
            }
            a11 = d11;
        }
        return a11;
    }
}
