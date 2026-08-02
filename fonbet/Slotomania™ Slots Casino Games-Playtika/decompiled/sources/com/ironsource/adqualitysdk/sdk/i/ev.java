package com.ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* loaded from: classes4.dex */
public abstract class ev extends em {
    /* renamed from: ﻐ, reason: contains not printable characters */
    abstract boolean mo7754(int i);

    /* renamed from: ｋ */
    abstract boolean mo7752(Object obj, Object obj2);

    /* renamed from: ｋ */
    abstract boolean mo7753(String str, String str2);

    public ev(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final ea mo7722(ee eeVar, cl clVar) {
        Object m7684 = m7735().m7721(eeVar, clVar).m7684();
        Object m76842 = m7736().m7721(eeVar, clVar).m7684();
        try {
            return new ea(Boolean.valueOf(mo7754(new BigDecimal(m7684.toString()).compareTo(new BigDecimal(m76842.toString())))));
        } catch (Exception unused) {
            if ((m7684 instanceof String) && (m76842 instanceof String)) {
                return new ea(Boolean.valueOf(mo7753((String) m7684, (String) m76842)));
            }
            return new ea(Boolean.valueOf(mo7752(m7684, m76842)));
        }
    }
}
