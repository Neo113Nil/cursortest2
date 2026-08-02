package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dq;

/* compiled from: OperatorCompoundAssignment.java */
/* loaded from: classes13.dex */
public class f {
    private static final List<String> b = Arrays.asList("+=", "-=", "*=", "/=", "%=");
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public f(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
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
                dq.i("Invalid list index: ", str3, "CompoundAssignOp");
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
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

    private double b(double d) {
        return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce A[Catch: Exception -> 0x0027, TRY_LEAVE, TryCatch #0 {Exception -> 0x0027, blocks: (B:2:0x0000, B:23:0x0061, B:25:0x0069, B:27:0x0077, B:28:0x007e, B:29:0x007f, B:31:0x0087, B:33:0x00aa, B:34:0x00b1, B:35:0x00b2, B:37:0x00c0, B:39:0x00ce, B:41:0x001d, B:44:0x002a, B:47:0x0034, B:50:0x003e, B:53:0x0048), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object a(Double d, Double d2, String str) {
        char c;
        try {
            int hashCode = str.hashCode();
            if (hashCode == 1208) {
                if (str.equals("%=")) {
                    c = 4;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            } else if (hashCode == 1363) {
                if (str.equals("*=")) {
                    c = 2;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            } else if (hashCode == 1394) {
                if (str.equals("+=")) {
                    c = 0;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            } else if (hashCode != 1456) {
                if (hashCode == 1518 && str.equals("/=")) {
                    c = 3;
                    if (c != 0) {
                        return Double.valueOf(d.doubleValue() + d2.doubleValue());
                    }
                    if (c == 1) {
                        return Double.valueOf(d.doubleValue() - d2.doubleValue());
                    }
                    if (c == 2) {
                        return Double.valueOf(d.doubleValue() * d2.doubleValue());
                    }
                    if (c == 3) {
                        if (d2.doubleValue() != ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            return Double.valueOf(new BigDecimal(d.doubleValue()).divide(new BigDecimal(d2.doubleValue()), 10, RoundingMode.HALF_UP).doubleValue());
                        }
                        throw new ArithmeticException("Division by zero");
                    }
                    if (c != 4) {
                        return null;
                    }
                    if (d2.doubleValue() != ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        return Double.valueOf(d.doubleValue() % d2.doubleValue());
                    }
                    throw new ArithmeticException("Modulo by zero");
                }
                c = 65535;
                if (c != 0) {
                }
            } else {
                if (str.equals("-=")) {
                    c = 1;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            }
        } catch (Exception e) {
            q0.b("CompoundAssignOp", e.getMessage());
            return null;
        }
    }

    private boolean a(double d) {
        return (Double.isNaN(d) || Double.isInfinite(d) || d != Math.floor(d)) ? false : true;
    }
}
