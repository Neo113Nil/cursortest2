package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0314 extends AbstractC0271 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList f579;

    public C0314(ArrayList arrayList) {
        this.f579 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            return this.f579.equals(((C0314) obj).f579);
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    public final int hashCode() {
        return this.f579.hashCode() + (C0314.class.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("jcj3gg==\n", "+6mFosipnXM=\n"));
        sb.append(TextUtils.join(StringFog.decrypt("yyc=\n", "5weVWEhnLC4=\n"), this.f579));
        return AbstractC1133.m662("PQ==\n", "BjKybYd9H/M=\n", sb);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0271
    /* renamed from: ﾒ */
    public final C1068 mo74(C0950 c0950, C1102 c1102) {
        List asList;
        Iterator it = this.f579.iterator();
        while (it.hasNext()) {
            AbstractC0287 abstractC0287 = (AbstractC0287) it.next();
            C0337 c0337 = abstractC0287 instanceof C0337 ? (C0337) abstractC0287 : abstractC0287 instanceof C0581 ? ((C0581) abstractC0287).f1876 : null;
            if (c0337 != null && (asList = Arrays.asList(c0337.f829)) != null) {
                Iterator it2 = asList.iterator();
                while (it2.hasNext()) {
                    c0950.f3167.put((String) it2.next(), null);
                }
            }
            abstractC0287.mo133(c0950, c1102);
        }
        return new C1068(null);
    }
}
