package com.bytedance.adsdk.pcc;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf implements ork {
    public Number pcc(Number number, int i, boolean z) {
        if (number == null) {
            return null;
        }
        int max = Math.max(i, 0);
        BigDecimal valueOf = BigDecimal.valueOf(number.doubleValue());
        BigDecimal scale = z ? valueOf.setScale(max, RoundingMode.HALF_UP) : valueOf.setScale(max, RoundingMode.DOWN);
        if (max != 0) {
            if ((scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).scale() > 0) {
                return Double.valueOf(scale.doubleValue());
            }
        }
        return Long.valueOf(scale.longValue());
    }

    @Override // com.bytedance.adsdk.pcc.ork
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public Number pcc(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Number pcc = pcc(objArr[0]);
        int pcc2 = pcc(objArr[1], 0);
        boolean pcc3 = pcc(objArr[2], false);
        if (pcc == null) {
            return null;
        }
        return pcc(pcc, pcc2, pcc3);
    }

    private Number pcc(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private int pcc(Object obj, int i) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    private boolean pcc(Object obj, boolean z) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return obj instanceof String ? Boolean.parseBoolean((String) obj) : z;
    }
}
