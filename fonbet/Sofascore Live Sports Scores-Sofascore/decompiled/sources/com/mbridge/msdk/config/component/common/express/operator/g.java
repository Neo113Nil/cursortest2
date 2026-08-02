package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.me4;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class g {
    private static final List<String> b = Arrays.asList("+=", "-=", "*=", "/=", "%=");
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public g(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    private Object a(Double d, Double d2, String str) {
        try {
            int hashCode = str.hashCode();
            if (hashCode == 1208) {
                if (!str.equals("%=")) {
                    return null;
                }
                if (d2.doubleValue() != 0.0d) {
                    return Double.valueOf(d.doubleValue() % d2.doubleValue());
                }
                throw new ArithmeticException("Modulo by zero");
            }
            if (hashCode == 1363) {
                if (str.equals("*=")) {
                    return Double.valueOf(d.doubleValue() * d2.doubleValue());
                }
                return null;
            }
            if (hashCode == 1394) {
                if (str.equals("+=")) {
                    return Double.valueOf(d.doubleValue() + d2.doubleValue());
                }
                return null;
            }
            if (hashCode == 1456) {
                if (str.equals("-=")) {
                    return Double.valueOf(d.doubleValue() - d2.doubleValue());
                }
                return null;
            }
            if (hashCode != 1518 || !str.equals("/=")) {
                return null;
            }
            if (d2.doubleValue() != 0.0d) {
                return Double.valueOf(new BigDecimal(d.doubleValue()).divide(new BigDecimal(d2.doubleValue()), 10, RoundingMode.HALF_UP).doubleValue());
            }
            throw new ArithmeticException("Division by zero");
        } catch (Exception e) {
            q0.b("CompoundAssignOp", e.getMessage());
            return null;
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String str2;
        Object obj2;
        Object a = a(list);
        if (obj instanceof com.mbridge.msdk.config.component.common.express.entities.a) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar = (com.mbridge.msdk.config.component.common.express.entities.a) obj;
            str2 = aVar.a();
            obj2 = aVar.b();
        } else {
            str2 = "";
            obj2 = null;
        }
        String str3 = str2;
        if (TextUtils.isEmpty(str3)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (obj2 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj2;
            return a(aVar2, str3, str, aVar2.b((Object) str3), a);
        }
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            return a(map, str3, str, map.get(str3), a);
        }
        if (obj2 instanceof List) {
            try {
                int parseInt = Integer.parseInt(str3);
                if (parseInt >= 0 && parseInt < ((List) obj2).size()) {
                    return a((List) obj2, parseInt, str, ((List) obj2).get(parseInt), a);
                }
                q0.b("CompoundAssignOp", "List index out of bounds: " + str3 + ", list size: " + ((List) obj2).size());
            } catch (NumberFormatException unused) {
                me4.u("Invalid list index: ", str3, "CompoundAssignOp");
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private double b(double d) {
        return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private Object a(List<Object> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str, String str2, Object obj, Object obj2) {
        Object valueOf;
        Double a = a(obj);
        Double a2 = a(obj2);
        if (a != null && a2 != null) {
            try {
                Object a3 = a(a, a2, str2);
                if (a3 instanceof Double) {
                    double doubleValue = ((Double) a3).doubleValue();
                    if (a(doubleValue)) {
                        valueOf = Integer.valueOf(((Double) a3).intValue());
                    } else {
                        valueOf = Double.valueOf(b(doubleValue));
                    }
                    if (aVar != null) {
                        aVar.a(str, valueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(valueOf);
                }
            } catch (Exception e) {
                q0.b("CompoundAssignOp", e.getMessage(), e);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Map map, String str, String str2, Object obj, Object obj2) {
        Object valueOf;
        Double a = a(obj);
        Double a2 = a(obj2);
        if (a != null && a2 != null) {
            try {
                Object a3 = a(a, a2, str2);
                if (a3 instanceof Double) {
                    double doubleValue = ((Double) a3).doubleValue();
                    if (a(doubleValue)) {
                        valueOf = Integer.valueOf(((Double) a3).intValue());
                    } else {
                        valueOf = Double.valueOf(b(doubleValue));
                    }
                    if (map != null) {
                        map.put(str, valueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(valueOf);
                }
            } catch (Exception e) {
                q0.b("CompoundAssignOp", e.getMessage(), e);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(List list, int i, String str, Object obj, Object obj2) {
        Object valueOf;
        Double a = a(obj);
        Double a2 = a(obj2);
        if (a != null && a2 != null) {
            try {
                Object a3 = a(a, a2, str);
                if (a3 instanceof Double) {
                    double doubleValue = ((Double) a3).doubleValue();
                    if (a(doubleValue)) {
                        valueOf = Integer.valueOf(((Double) a3).intValue());
                    } else {
                        valueOf = Double.valueOf(b(doubleValue));
                    }
                    if (list != null) {
                        list.set(i, valueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(valueOf);
                }
            } catch (Exception e) {
                q0.b("CompoundAssignOp", e.getMessage(), e);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private Double a(Object obj) {
        if (obj == null) {
            return null;
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

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        String trim = str.trim();
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            if (trim.equals(it.next())) {
                return b(trim, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private boolean a(double d) {
        return (Double.isNaN(d) || Double.isInfinite(d) || d != Math.floor(d)) ? false : true;
    }
}
