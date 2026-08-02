package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class e {
    private static final List<String> b = Arrays.asList("+", "-", "*", "/", "%");
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public e(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        Double d;
        int hashCode;
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        Double a = a(obj);
        Double a2 = a(obj2);
        if (a == null || a2 == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        try {
            hashCode = str.hashCode();
        } catch (Exception e) {
            q0.b("BasicArithmeticOperator", e.getMessage());
        }
        if (hashCode == 37) {
            if (str.equals("%")) {
                if (a2.doubleValue() == 0.0d) {
                    throw new ArithmeticException("Modulo by zero");
                }
                d = Double.valueOf(a.doubleValue() % a2.doubleValue());
            }
            d = null;
        } else if (hashCode == 45) {
            if (str.equals("-")) {
                d = Double.valueOf(a.doubleValue() - a2.doubleValue());
            }
            d = null;
        } else if (hashCode == 47) {
            if (str.equals("/")) {
                if (a2.doubleValue() == 0.0d) {
                    throw new ArithmeticException("Division by zero");
                }
                d = Double.valueOf(new BigDecimal(a.doubleValue()).divide(new BigDecimal(a2.doubleValue()), 10, RoundingMode.HALF_UP).doubleValue());
            }
            d = null;
        } else if (hashCode != 42) {
            if (hashCode == 43 && str.equals("+")) {
                d = Double.valueOf(a.doubleValue() + a2.doubleValue());
            }
            d = null;
        } else {
            if (str.equals("*")) {
                d = Double.valueOf(a.doubleValue() * a2.doubleValue());
            }
            d = null;
        }
        if (d == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        double doubleValue = d.doubleValue();
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(doubleValue) ? Integer.valueOf(d.intValue()) : Double.valueOf(b(doubleValue)));
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return b(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Double a(Object obj) {
        if (obj == null) {
            return Double.valueOf(0.0d);
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        try {
            return Double.valueOf(Double.parseDouble(String.valueOf(obj)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private boolean a(double d) {
        return (Double.isNaN(d) || Double.isInfinite(d) || d != Math.floor(d)) ? false : true;
    }

    private double b(double d) {
        return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
