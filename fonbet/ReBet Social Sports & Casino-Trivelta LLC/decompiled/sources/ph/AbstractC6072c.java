package ph;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.text.Typography;

/* renamed from: ph.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6072c {

    /* renamed from: a, reason: collision with root package name */
    public int f63211a;
    private final Object[] data;

    public AbstractC6072c(Object[] objArr) {
        this.data = objArr;
    }

    public static int d(Object obj, Object obj2, Comparator comparator) {
        if (obj == null) {
            return obj2 == null ? 0 : -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    public static Object[] f(Object[] objArr, Comparator comparator) {
        Object obj = null;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11 += 2) {
            Object obj2 = objArr[i11];
            Object obj3 = objArr[i11 + 1];
            if (obj2 != null) {
                if (obj != null && comparator.compare(obj2, obj) == 0) {
                    i10 -= 2;
                }
                if (obj3 == null) {
                    obj = null;
                } else {
                    int i12 = i10 + 1;
                    objArr[i10] = obj2;
                    i10 += 2;
                    objArr[i12] = obj3;
                    obj = obj2;
                }
            }
        }
        if (objArr.length == i10) {
            return objArr;
        }
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        return objArr2;
    }

    public static void h(Object[] objArr, int i10, int i11, int i12, Object[] objArr2, Comparator comparator) {
        int i13 = i10;
        int i14 = i11;
        while (i10 < i12) {
            if (i13 >= i11 - 1 || (i14 < i12 - 1 && d(objArr[i13], objArr[i14], comparator) > 0)) {
                objArr2[i10] = objArr[i14];
                objArr2[i10 + 1] = objArr[i14 + 1];
                i14 += 2;
            } else {
                objArr2[i10] = objArr[i13];
                objArr2[i10 + 1] = objArr[i13 + 1];
                i13 += 2;
            }
            i10 += 2;
        }
    }

    public static void i(Object[] objArr, Comparator comparator) {
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        k(objArr2, 0, objArr.length, objArr, comparator);
    }

    public static Object[] j(Object[] objArr, Comparator comparator) {
        AbstractC6080k.a(objArr.length % 2 == 0, "You must provide an even number of key/value pair arguments.");
        if (objArr.length == 0) {
            return objArr;
        }
        i(objArr, comparator);
        return f(objArr, comparator);
    }

    public static void k(Object[] objArr, int i10, int i11, Object[] objArr2, Comparator comparator) {
        if (i11 - i10 <= 2) {
            return;
        }
        int i12 = ((i11 + i10) / 4) * 2;
        k(objArr2, i10, i12, objArr, comparator);
        k(objArr2, i12, i11, objArr, comparator);
        h(objArr, i10, i12, i11, objArr2, comparator);
    }

    public final Map asMap() {
        return C6077h.f(e());
    }

    public final List e() {
        return Arrays.asList(this.data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC6072c) {
            return Arrays.equals(this.data, ((AbstractC6072c) obj).data);
        }
        return false;
    }

    public final void forEach(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            Object[] objArr = this.data;
            if (i10 >= objArr.length) {
                return;
            }
            biConsumer.accept(objArr[i10], objArr[i10 + 1]);
            i10 += 2;
        }
    }

    public final Object g(Object obj) {
        if (obj == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            Object[] objArr = this.data;
            if (i10 >= objArr.length) {
                return null;
            }
            if (obj.equals(objArr[i10])) {
                return this.data[i10 + 1];
            }
            i10 += 2;
        }
    }

    public int hashCode() {
        int i10 = this.f63211a;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.data) ^ 1000003;
        this.f63211a = hashCode;
        return hashCode;
    }

    public final boolean isEmpty() {
        return this.data.length == 0;
    }

    public String toString() {
        String obj;
        StringBuilder sb2 = new StringBuilder("{");
        int i10 = 0;
        while (true) {
            Object[] objArr = this.data;
            if (i10 >= objArr.length) {
                break;
            }
            Object obj2 = objArr[i10 + 1];
            if (obj2 instanceof String) {
                obj = Typography.quote + ((String) obj2) + Typography.quote;
            } else {
                obj = obj2.toString();
            }
            sb2.append(this.data[i10]);
            sb2.append("=");
            sb2.append(obj);
            sb2.append(", ");
            i10 += 2;
        }
        if (sb2.length() > 1) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public AbstractC6072c(Object[] objArr, Comparator comparator) {
        this(j(objArr, comparator));
    }
}
