package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.יּ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1021 extends AbstractC0475 {
    static {
        StringFog.decrypt("AlPFBtUGt8EPT8EFzQY=\n", "YSGgZ6Fj5bQ=\n");
        StringFog.decrypt("1r4uPoDM8pDKnygDi+D3\n", "pMtAce6Bk/k=\n");
        StringFog.decrypt("CB1e2rsyuz8RHHnGhjmXOg==\n", "eHItrvRc9l4=\n");
        StringFog.decrypt("vLZSedIcVrK1vEVC+DRbuqKNSX/zGF4=\n", "zNkhDZZ5OtM=\n");
        StringFog.decrypt("RMbaJ12rze9Y1tccXJr26UTW1Qw=\n", "NrO0aDPoooE=\n");
        StringFog.decrypt("OYBuc7uuTqMngXhkgK9/mCGdeGaQ\n", "Se8dB/TADcw=\n");
        StringFog.decrypt("IxeoH+nx2gQqHb8kw9fZCz0duB/C5uINIR26Dw==\n", "U3jba62UtmU=\n");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static long m617(ArrayList arrayList) {
        int intValue;
        if (arrayList.size() > 1 && AbstractC0475.m294(arrayList, 1, Integer.class)) {
            intValue = ((Integer) AbstractC0475.m295(arrayList, 1, Integer.class)).intValue();
        } else {
            if (arrayList.size() <= 2) {
                return 0L;
            }
            intValue = ((Integer) AbstractC0475.m295(arrayList, 2, Integer.class)).intValue();
        }
        return intValue;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static AbstractRunnableC0606 m618(C1102 c1102, C0950 c0950, ArrayList arrayList) {
        List m296;
        if (AbstractC0475.m294(arrayList, 0, AbstractRunnableC0606.class)) {
            return (AbstractRunnableC0606) AbstractC0475.m295(arrayList, 0, AbstractRunnableC0606.class);
        }
        C0499 c0499 = (C0499) AbstractC0475.m295(arrayList, 0, C0499.class);
        if (arrayList.size() > 2) {
            m296 = AbstractC0475.m296(arrayList, 2);
        } else {
            m296 = AbstractC0475.m296(arrayList, 1);
        }
        return new C0619(m296, c0499, c0950, c1102);
    }
}
