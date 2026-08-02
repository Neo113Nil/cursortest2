package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Г, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C0380 extends AbstractC0287 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1120 = StringFog.decrypt("oDrT\n", "zFW0J6sk+h4=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0287[] f1121;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f1122;

    public C0380(String str, ArrayList arrayList) {
        this.f1122 = AbstractC1088.m645(str);
        AbstractC0287[] abstractC0287Arr = new AbstractC0287[arrayList.size()];
        this.f1121 = abstractC0287Arr;
        arrayList.toArray(abstractC0287Arr);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        C0380 c0380 = (C0380) obj;
        if (this.f1122.equals(c0380.f1122)) {
            return Arrays.equals(this.f1121, c0380.f1121);
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public int hashCode() {
        String str = this.f1122;
        return Arrays.hashCode(this.f1121) + ((str != null ? str.hashCode() : 0) * 31);
    }

    public String toString() {
        return mo218(this.f1121);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public String mo218(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1122);
        sb.append(StringFog.decrypt("KQ==\n", "AWNTBhPWRkY=\n"));
        sb.append(AbstractC0287.m170(objArr));
        return AbstractC1133.m662("7g==\n", "x9pqjDxVTNk=\n", sb);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    /* renamed from: ﾒ */
    public C1068 mo133(C0950 c0950, C1102 c1102) {
        C0499 c0499;
        ArrayList arrayList = new ArrayList();
        for (AbstractC0287 abstractC0287 : this.f1121) {
            arrayList.add(abstractC0287.m171(c0950, c1102).f3367);
        }
        if (this.f1122.equals(f1120)) {
            AbstractC0962.m595(StringFog.decrypt("6mr07JMA2A==\n", "uTi4s99Pn+U=\n"), c1102.m651() + StringFog.decrypt("X/Y=\n", "ZdaSJa1vWn0=\n") + arrayList.get(0), null, null);
            return new C1068(null);
        }
        try {
            c0499 = (C0499) c0950.m564(this.f1122);
        } catch (Exception unused) {
            c0499 = null;
        }
        if (c0499 != null) {
            C1068 m325 = c0499.m325(c0950, c0950.f3165, c1102, arrayList);
            return m325 != null ? new C1068(m325.f3367) : new C1068(null);
        }
        C0499 m128 = c1102.f3466.m128(this.f1122);
        if (m128 == null) {
            return new C1068(c1102.f3464.mo55(c1102, this.f1122, arrayList, c1102.f3462, c0950));
        }
        C1068 m3252 = m128.m325(c0950, c0950.f3165, c1102, arrayList);
        m3252.f3366 = false;
        return m3252;
    }
}
