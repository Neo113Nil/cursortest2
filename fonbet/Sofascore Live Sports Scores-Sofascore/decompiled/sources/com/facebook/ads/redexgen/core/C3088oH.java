package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.oH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3088oH implements A6 {
    @Override // com.facebook.ads.redexgen.core.A6
    public final /* synthetic */ A5 AH3(A1 a1, C3212qI c3212qI) {
        return A3.A00(this, a1, c3212qI);
    }

    @Override // com.facebook.ads.redexgen.core.A6
    public final /* synthetic */ void AH4() {
    }

    @Override // com.facebook.ads.redexgen.core.A6
    public final InterfaceC15789s A3C(A1 a1, C3212qI c3212qI) {
        if (c3212qI.A0O == null) {
            return null;
        }
        return new C3086oF(new C15769q(new C1581Ab(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // com.facebook.ads.redexgen.core.A6
    public final int A7W(C3212qI c3212qI) {
        return c3212qI.A0O != null ? 1 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.A6
    public final void AJe(Looper looper, C8O c8o) {
    }
}
