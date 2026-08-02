package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class t2 {
    protected int zza;

    public abstract int a(d4 d4Var);

    public final byte[] b() {
        try {
            g3 g3Var = (g3) this;
            int e7 = g3Var.e();
            byte[] bArr = new byte[e7];
            z2 z2Var = new z2(e7, bArr);
            d4 a7 = a4.f5397c.a(g3Var.getClass());
            r3 r3Var = z2Var.f5662b;
            if (r3Var == null) {
                r3Var = new r3(z2Var);
            }
            a7.i(g3Var, r3Var);
            if (e7 - z2Var.f5665e == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e9) {
            throw new RuntimeException(androidx.appcompat.widget.c1.n("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e9);
        }
    }
}
