package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.f;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class f {
    private static final List<String> b = Arrays.asList("==", "!=", ">=", "<=", ">", "<");
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public f(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    private Boolean a(Comparable<Object> comparable, Comparable<Object> comparable2, String str) {
        str.getClass();
        switch (str) {
            case "<":
                return Boolean.valueOf(comparable.compareTo(comparable2) < 0);
            case ">":
                return Boolean.valueOf(comparable.compareTo(comparable2) > 0);
            case "!=":
                return Boolean.valueOf(comparable.compareTo(comparable2) != 0);
            case "<=":
                return Boolean.valueOf(comparable.compareTo(comparable2) <= 0);
            case "==":
                return Boolean.valueOf(comparable.compareTo(comparable2) == 0);
            case ">=":
                return Boolean.valueOf(comparable.compareTo(comparable2) >= 0);
            default:
                return null;
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        final int i;
        BiFunction<Comparable<Object>, Comparable<Object>, Boolean> biFunction;
        final int i2;
        final int i3;
        final int i4;
        final int i5;
        final int i6;
        i = 0;
        biFunction = null;
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        str.getClass();
        i2 = 5;
        i3 = 4;
        i4 = 3;
        i5 = 2;
        i6 = 1;
        switch (str) {
            case "<":
                biFunction = new BiFunction() { // from class: w8m
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        Boolean c;
                        Boolean a;
                        Boolean d;
                        Boolean b2;
                        Boolean e;
                        Boolean f;
                        Comparable comparable = (Comparable) obj3;
                        Comparable comparable2 = (Comparable) obj4;
                        switch (i2) {
                            case 0:
                                c = f.c(comparable, comparable2);
                                return c;
                            case 1:
                                a = f.a(comparable, comparable2);
                                return a;
                            case 2:
                                d = f.d(comparable, comparable2);
                                return d;
                            case 3:
                                b2 = f.b(comparable, comparable2);
                                return b2;
                            case 4:
                                e = f.e(comparable, comparable2);
                                return e;
                            default:
                                f = f.f(comparable, comparable2);
                                return f;
                        }
                    }
                };
                break;
            case ">":
                biFunction = new BiFunction() { // from class: w8m
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        Boolean c;
                        Boolean a;
                        Boolean d;
                        Boolean b2;
                        Boolean e;
                        Boolean f;
                        Comparable comparable = (Comparable) obj3;
                        Comparable comparable2 = (Comparable) obj4;
                        switch (i3) {
                            case 0:
                                c = f.c(comparable, comparable2);
                                return c;
                            case 1:
                                a = f.a(comparable, comparable2);
                                return a;
                            case 2:
                                d = f.d(comparable, comparable2);
                                return d;
                            case 3:
                                b2 = f.b(comparable, comparable2);
                                return b2;
                            case 4:
                                e = f.e(comparable, comparable2);
                                return e;
                            default:
                                f = f.f(comparable, comparable2);
                                return f;
                        }
                    }
                };
                break;
            case "!=":
                biFunction = new BiFunction() { // from class: w8m
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        Boolean c;
                        Boolean a;
                        Boolean d;
                        Boolean b2;
                        Boolean e;
                        Boolean f;
                        Comparable comparable = (Comparable) obj3;
                        Comparable comparable2 = (Comparable) obj4;
                        switch (i4) {
                            case 0:
                                c = f.c(comparable, comparable2);
                                return c;
                            case 1:
                                a = f.a(comparable, comparable2);
                                return a;
                            case 2:
                                d = f.d(comparable, comparable2);
                                return d;
                            case 3:
                                b2 = f.b(comparable, comparable2);
                                return b2;
                            case 4:
                                e = f.e(comparable, comparable2);
                                return e;
                            default:
                                f = f.f(comparable, comparable2);
                                return f;
                        }
                    }
                };
                break;
            case "<=":
                biFunction = new BiFunction() { // from class: w8m
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        Boolean c;
                        Boolean a;
                        Boolean d;
                        Boolean b2;
                        Boolean e;
                        Boolean f;
                        Comparable comparable = (Comparable) obj3;
                        Comparable comparable2 = (Comparable) obj4;
                        switch (i5) {
                            case 0:
                                c = f.c(comparable, comparable2);
                                return c;
                            case 1:
                                a = f.a(comparable, comparable2);
                                return a;
                            case 2:
                                d = f.d(comparable, comparable2);
                                return d;
                            case 3:
                                b2 = f.b(comparable, comparable2);
                                return b2;
                            case 4:
                                e = f.e(comparable, comparable2);
                                return e;
                            default:
                                f = f.f(comparable, comparable2);
                                return f;
                        }
                    }
                };
                break;
            case "==":
                biFunction = new BiFunction() { // from class: w8m
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        Boolean c;
                        Boolean a;
                        Boolean d;
                        Boolean b2;
                        Boolean e;
                        Boolean f;
                        Comparable comparable = (Comparable) obj3;
                        Comparable comparable2 = (Comparable) obj4;
                        switch (i6) {
                            case 0:
                                c = f.c(comparable, comparable2);
                                return c;
                            case 1:
                                a = f.a(comparable, comparable2);
                                return a;
                            case 2:
                                d = f.d(comparable, comparable2);
                                return d;
                            case 3:
                                b2 = f.b(comparable, comparable2);
                                return b2;
                            case 4:
                                e = f.e(comparable, comparable2);
                                return e;
                            default:
                                f = f.f(comparable, comparable2);
                                return f;
                        }
                    }
                };
                break;
            case ">=":
                biFunction = new BiFunction() { // from class: w8m
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        Boolean c;
                        Boolean a;
                        Boolean d;
                        Boolean b2;
                        Boolean e;
                        Boolean f;
                        Comparable comparable = (Comparable) obj3;
                        Comparable comparable2 = (Comparable) obj4;
                        switch (i) {
                            case 0:
                                c = f.c(comparable, comparable2);
                                return c;
                            case 1:
                                a = f.a(comparable, comparable2);
                                return a;
                            case 2:
                                d = f.d(comparable, comparable2);
                                return d;
                            case 3:
                                b2 = f.b(comparable, comparable2);
                                return b2;
                            case 4:
                                e = f.e(comparable, comparable2);
                                return e;
                            default:
                                f = f.f(comparable, comparable2);
                                return f;
                        }
                    }
                };
                break;
        }
        return biFunction == null ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : a(str, obj, obj2, biFunction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean c(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean d(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) <= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean e(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean f(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) < 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean b(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(!comparable.equals(comparable2));
    }

    private Number b(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        try {
            if (str.contains(".")) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.equals(comparable2));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, Object obj2, BiFunction<Comparable<Object>, Comparable<Object>, Boolean> biFunction) {
        Object obj3;
        Object obj4;
        if (obj != null && obj2 != null) {
            if (obj.getClass().equals(obj2.getClass())) {
                obj3 = obj;
                obj4 = obj2;
            } else {
                Object[] a = a(obj, obj2);
                if (a != null) {
                    obj3 = a[0];
                    obj4 = a[1];
                } else {
                    q0.b("ComparisonOperator", "Type conversion failed for comparison: " + obj.getClass().getSimpleName() + " vs " + obj2.getClass().getSimpleName());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                }
            }
            if ((obj3 instanceof Comparable) && (obj4 instanceof Comparable)) {
                try {
                    obj3 = Integer.valueOf(Integer.parseInt(String.valueOf(obj)));
                    obj4 = Integer.valueOf(Integer.parseInt(String.valueOf(obj2)));
                } catch (Exception unused) {
                }
                try {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(biFunction.apply((Comparable) obj3, (Comparable) obj4));
                } catch (Exception e) {
                    q0.b("ComparisonOperator", e.getMessage(), e);
                }
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(obj, obj2, str));
    }

    private Boolean a(Object obj, Object obj2, String str) {
        str.getClass();
        if (str.equals("!=")) {
            return Boolean.valueOf(obj != obj2);
        }
        if (str.equals("==")) {
            return Boolean.valueOf(obj == obj2);
        }
        return null;
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

    private Object[] a(Object obj, Object obj2) {
        try {
            if (a(obj) && a(obj2)) {
                return a((Number) obj, (Number) obj2);
            }
            if (a(obj) && (obj2 instanceof String)) {
                Number number = (Number) obj;
                Number b2 = b((String) obj2);
                if (b2 != null) {
                    return a(number, b2);
                }
                return null;
            }
            if ((obj instanceof String) && a(obj2)) {
                Number b3 = b((String) obj);
                Number number2 = (Number) obj2;
                if (b3 != null) {
                    return a(b3, number2);
                }
                return null;
            }
            if ((obj instanceof String) && (obj2 instanceof String)) {
                return new Object[]{obj, obj2};
            }
            if ((obj instanceof Boolean) && (obj2 instanceof Boolean)) {
                return new Object[]{obj, obj2};
            }
            if ((obj instanceof Boolean) && (obj2 instanceof String)) {
                Boolean bool = (Boolean) obj;
                Boolean a = a((String) obj2);
                if (a != null) {
                    return new Object[]{bool, a};
                }
                return null;
            }
            if (!(obj instanceof String) || !(obj2 instanceof Boolean)) {
                return null;
            }
            Boolean a2 = a((String) obj);
            Boolean bool2 = (Boolean) obj2;
            if (a2 != null) {
                return new Object[]{a2, bool2};
            }
            return null;
        } catch (Exception e) {
            q0.b("ComparisonOperator", "Type conversion error: " + e.getMessage(), e);
            return null;
        }
    }

    private boolean a(Object obj) {
        return obj instanceof Number;
    }

    private Boolean a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.toLowerCase().trim();
        if (!"true".equals(trim) && !"1".equals(trim) && !"yes".equals(trim)) {
            if ("false".equals(trim) || "0".equals(trim) || "no".equals(trim)) {
                return Boolean.FALSE;
            }
            return null;
        }
        return Boolean.TRUE;
    }

    private Object[] a(Number number, Number number2) {
        if (a(number) && a(number2)) {
            return new Object[]{Long.valueOf(number.longValue()), Long.valueOf(number2.longValue())};
        }
        return new Object[]{Double.valueOf(number.doubleValue()), Double.valueOf(number2.doubleValue())};
    }

    private boolean a(Number number) {
        return (number instanceof Integer) || (number instanceof Long) || (number instanceof Short) || (number instanceof Byte);
    }
}
