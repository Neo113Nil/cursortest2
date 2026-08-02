package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: OperatorBasicArithmetic.java */
/* loaded from: classes13.dex */
public class d {
    private static final List<String> b = Arrays.asList("+", "-", "*", DomExceptionUtils.SEPARATOR, "%");
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public d(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb A[Catch: Exception -> 0x0044, TRY_LEAVE, TryCatch #0 {Exception -> 0x0044, blocks: (B:10:0x001e, B:40:0x007e, B:42:0x0086, B:43:0x0094, B:44:0x009b, B:45:0x009c, B:47:0x00a4, B:48:0x00c7, B:49:0x00ce, B:50:0x00cf, B:51:0x00dd, B:52:0x00eb, B:53:0x003b, B:56:0x0047, B:59:0x0051, B:62:0x005b, B:65:0x0065), top: B:9:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        Double d;
        int hashCode;
        char c = 0;
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
                c = 4;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else if (hashCode == 45) {
            if (str.equals("-")) {
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else if (hashCode == 47) {
            if (str.equals(DomExceptionUtils.SEPARATOR)) {
                c = 3;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else if (hashCode != 42) {
            if (hashCode == 43 && str.equals("+")) {
                if (c != 0) {
                    d = Double.valueOf(a.doubleValue() + a2.doubleValue());
                } else if (c == 1) {
                    d = Double.valueOf(a.doubleValue() - a2.doubleValue());
                } else if (c == 2) {
                    d = Double.valueOf(a.doubleValue() * a2.doubleValue());
                } else if (c != 3) {
                    if (c != 4) {
                        d = null;
                    } else {
                        if (a2.doubleValue() == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            throw new ArithmeticException("Modulo by zero");
                        }
                        d = Double.valueOf(a.doubleValue() % a2.doubleValue());
                    }
                } else {
                    if (a2.doubleValue() == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        throw new ArithmeticException("Division by zero");
                    }
                    d = Double.valueOf(new BigDecimal(a.doubleValue()).divide(new BigDecimal(a2.doubleValue()), 10, RoundingMode.HALF_UP).doubleValue());
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else {
            if (str.equals("*")) {
                c = 2;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
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
            return Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
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
