package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.イ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0981 extends AbstractC0413 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0271[] f3211;

    public C0981(ArrayList arrayList, byte b) {
        super(b);
        AbstractC0271[] abstractC0271Arr = new AbstractC0271[arrayList.size()];
        this.f3211 = abstractC0271Arr;
        arrayList.toArray(abstractC0271Arr);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            return Arrays.equals(this.f3211, ((C0981) obj).f3211);
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    public final int hashCode() {
        return Arrays.hashCode(this.f3211);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("r+E=\n", "1OsykcgRgc4=\n"));
        for (AbstractC0271 abstractC0271 : this.f3211) {
            byte b = this.f1178;
            for (int i = 0; i < b; i++) {
                sb.append("  ");
            }
            sb.append(abstractC0271.toString());
            sb.append("\n");
        }
        int i2 = this.f1178 - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
        sb.append(StringFog.decrypt("Fg==\n", "a/6fuw0FSGE=\n"));
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ */
    public final C1068 mo74(C0950 c0950, C1102 c1102) {
        C1068 c1068 = new C1068(null);
        C0950 c09502 = new C0950(new HashMap(), c0950, false);
        int i = c0950.f3159;
        c0950.f3159 = 0;
        for (AbstractC0271 abstractC0271 : this.f3211) {
            c1068 = abstractC0271.m141(c09502, c1102);
            if (c1068.f3366 || c1068.f3365 || c1068.f3364) {
                c0950.f3159 = i;
                return c1068;
            }
            c0950.f3159++;
        }
        c0950.f3159 = i;
        return c1068;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ */
    public final int mo72() {
        int i = 2;
        for (AbstractC0271 abstractC0271 : this.f3211) {
            i += abstractC0271.mo72();
        }
        return i;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ */
    public final int mo73(C0950 c0950) {
        int i = 1;
        for (int i2 = 0; i2 < c0950.f3159; i2++) {
            i += this.f3211[i2].mo72();
        }
        return i;
    }
}
