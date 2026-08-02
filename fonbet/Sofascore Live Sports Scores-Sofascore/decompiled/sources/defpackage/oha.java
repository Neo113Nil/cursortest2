package defpackage;

import com.ironsource.U3;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oha {
    public static final oha m = new oha(null, null, null, null, null, null, null, null, null);
    public static final oha n = new oha(Boolean.TRUE);
    public static final oha o = new oha(Boolean.FALSE);
    public final String a;
    public final Boolean b;
    public final Integer c;
    public final Long d;
    public final Double e;
    public final BigDecimal f;
    public final BigInteger g;
    public final Map h;
    public final List i;
    public final int j;
    public final List k;
    public final ArrayList l;

    static {
        new oha(Collections.unmodifiableMap(new HashMap()));
        new oha(Collections.unmodifiableList(new ArrayList()));
    }

    public oha(String str, Boolean bool, Integer num, Long l, Double d, BigDecimal bigDecimal, BigInteger bigInteger, Map map, List list) {
        this.h = map;
        this.l = new ArrayList();
        this.i = list;
        this.a = str;
        this.b = bool;
        this.c = num;
        this.d = l;
        this.e = d;
        this.f = bigDecimal;
        this.g = bigInteger;
        if (num != null) {
            this.j = 3;
            return;
        }
        if (l != null) {
            this.j = 4;
            return;
        }
        if (d != null) {
            this.j = 5;
            return;
        }
        if (bigDecimal != null) {
            this.j = 7;
            return;
        }
        if (bigInteger != null) {
            this.j = 8;
            return;
        }
        if (map != null) {
            this.j = 9;
            return;
        }
        if (str != null) {
            this.j = 1;
            return;
        }
        if (bool != null) {
            this.j = 2;
        } else if (list == null) {
            this.j = 11;
        } else {
            this.j = 10;
            this.k = list;
        }
    }

    public final String a() {
        switch (wt3.C(this.j)) {
            case 0:
                StringBuilder sb = new StringBuilder("\"");
                int[] iArr = ln5.a;
                StringBuilder sb2 = new StringBuilder();
                String str = this.a;
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt == '\f') {
                        sb2.append("\\f");
                    } else if (charAt == '\r') {
                        sb2.append("\\r");
                    } else if (charAt == '\"') {
                        sb2.append("\\\"");
                    } else if (charAt == '/') {
                        sb2.append("\\/");
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                sb2.append("\\b");
                                break;
                            case '\t':
                                sb2.append("\\t");
                                break;
                            case '\n':
                                sb2.append("\\n");
                                break;
                            default:
                                if (charAt < ' ') {
                                    sb2.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                                    break;
                                } else {
                                    sb2.append(charAt);
                                    break;
                                }
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                }
                sb.append(sb2.toString());
                sb.append('\"');
                return sb.toString();
            case 1:
                return Boolean.toString(this.b.booleanValue()).toLowerCase();
            case 2:
                return this.c.toString();
            case 3:
                return this.d.toString();
            case 4:
                return this.e.toString();
            case 5:
                throw null;
            case 6:
                return this.f.toString();
            case 7:
                return this.g.toString();
            case 8:
                StringBuilder sb3 = new StringBuilder("{");
                ArrayList arrayList = this.l;
                boolean isEmpty = arrayList.isEmpty();
                Map map = this.h;
                if (isEmpty) {
                    for (String str2 : map.keySet()) {
                        mha.l(sb3, str2, (oha) map.get(str2));
                    }
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        mha.l(sb3, str3, (oha) map.get(str3));
                    }
                }
                int length2 = sb3.length() - 1;
                if (sb3.charAt(length2) == ',') {
                    sb3.setCharAt(length2, '}');
                } else {
                    sb3.append("}");
                }
                return sb3.toString();
            case 9:
                StringBuilder sb4 = new StringBuilder(U3.j.d);
                Iterator it2 = this.i.iterator();
                while (it2.hasNext()) {
                    sb4.append(((oha) it2.next()).a());
                    sb4.append(',');
                }
                int length3 = sb4.length() - 1;
                if (sb4.charAt(length3) == ',') {
                    sb4.setCharAt(length3, ']');
                } else {
                    sb4.append(U3.j.e);
                }
                return sb4.toString();
            default:
                return "null";
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || oha.class != obj.getClass()) {
                return false;
            }
            oha ohaVar = (oha) obj;
            int i = ohaVar.j;
            int i2 = this.j;
            if (i2 != i) {
                return false;
            }
            switch (wt3.C(i2)) {
                case 0:
                    return Objects.equals(this.a, ohaVar.a);
                case 1:
                    return Objects.equals(this.b, ohaVar.b);
                case 2:
                    return Objects.equals(this.c, ohaVar.c);
                case 3:
                    return Objects.equals(this.d, ohaVar.d);
                case 4:
                    return Objects.equals(this.e, ohaVar.e);
                case 5:
                    return true;
                case 6:
                    return Objects.equals(this.f, ohaVar.f);
                case 7:
                    return Objects.equals(this.g, ohaVar.g);
                case 8:
                    return Objects.equals(this.h, ohaVar.h);
                case 9:
                    return Objects.equals(this.i, ohaVar.i);
                case 10:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.j;
        switch (wt3.C(i)) {
            case 0:
                hashCode = this.a.hashCode();
                break;
            case 1:
                hashCode = this.b.hashCode();
                break;
            case 2:
                hashCode = this.c.hashCode();
                break;
            case 3:
                hashCode = this.d.hashCode();
                break;
            case 4:
                hashCode = this.e.hashCode();
                break;
            case 5:
                throw null;
            case 6:
                hashCode = this.f.hashCode();
                break;
            case 7:
                hashCode = this.g.hashCode();
                break;
            case 8:
                hashCode = this.h.hashCode();
                break;
            case 9:
                hashCode = this.i.hashCode();
                break;
            default:
                hashCode = 0;
                break;
        }
        return (wt3.C(i) * 31) + hashCode;
    }

    public final String toString() {
        return a();
    }

    public oha(double d) {
        this(null, null, null, null, Double.valueOf(d), null, null, null, null);
    }

    public oha(Map map) {
        this(null, null, null, null, null, null, null, map, null);
    }

    public oha(List list) {
        this(null, null, null, null, null, null, null, null, list);
    }

    public oha(Boolean bool) {
        this(null, bool, null, null, null, null, null, null, null);
    }
}
