package com.fyber.inneractive.sdk.protobuf;

import defpackage.a70;
import defpackage.cp4;
import defpackage.sw9;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n0 {
    public static final n0 d = new n0(0);
    public final e3 a;
    public boolean b;
    public boolean c;

    public n0(int i) {
        int i2 = e3.h;
        this.a = new v2(0);
        e();
        e();
    }

    public static int a(j4 j4Var, Object obj) {
        int serializedSize;
        int c;
        switch (m0.b[j4Var.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = b0.b;
                return 8;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = b0.b;
                return 4;
            case 3:
                return b0.a(((Long) obj).longValue());
            case 4:
                return b0.a(((Long) obj).longValue());
            case 5:
                int intValue = ((Integer) obj).intValue();
                if (intValue >= 0) {
                    return b0.c(intValue);
                }
                Logger logger3 = b0.b;
                return 10;
            case 6:
                ((Long) obj).getClass();
                Logger logger4 = b0.b;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                Logger logger5 = b0.b;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger6 = b0.b;
                return 1;
            case 9:
                Logger logger7 = b0.b;
                return ((d2) obj).getSerializedSize();
            case 10:
                Logger logger8 = b0.b;
                serializedSize = ((d2) obj).getSerializedSize();
                c = b0.c(serializedSize);
                break;
            case 11:
                return obj instanceof s ? b0.a((s) obj) : b0.a((String) obj);
            case 12:
                if (!(obj instanceof s)) {
                    Logger logger9 = b0.b;
                    serializedSize = ((byte[]) obj).length;
                    c = b0.c(serializedSize);
                    break;
                } else {
                    return b0.a((s) obj);
                }
            case 13:
                return b0.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = b0.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = b0.b;
                return 8;
            case 16:
                return b0.c(b0.d(((Integer) obj).intValue()));
            case 17:
                return b0.a(b0.b(((Long) obj).longValue()));
            case 18:
                return obj instanceof d1 ? b0.a(((d1) obj).a()) : b0.a(((Integer) obj).intValue());
            default:
                cp4.h("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return c + serializedSize;
    }

    public static int b(w0 w0Var, Object obj) {
        int b;
        int a;
        j4 j4Var = w0Var.c;
        int i = w0Var.b;
        if (w0Var.d) {
            int i2 = 0;
            if (!w0Var.e) {
                for (Object obj2 : (List) obj) {
                    int b2 = b0.b(i);
                    if (j4Var == j4.GROUP) {
                        b2 *= 2;
                    }
                    i2 += a(j4Var, obj2) + b2;
                }
                return i2;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i2 += a(j4Var, it.next());
            }
            b = b0.b(i) + i2;
            a = b0.c(i2);
        } else {
            b = b0.b(i);
            if (j4Var == j4.GROUP) {
                b *= 2;
            }
            a = a(j4Var, obj);
        }
        return a + b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r3 instanceof com.fyber.inneractive.sdk.protobuf.d1) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(w0 w0Var, Object obj) {
        boolean z;
        j4 j4Var = w0Var.c;
        Charset charset = l1.a;
        obj.getClass();
        switch (m0.a[j4Var.a().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof s)) {
                    break;
                }
                z = true;
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z = true;
                break;
            case 9:
                z = obj instanceof d2;
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            return;
        }
        sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(w0Var.b), w0Var.c.a(), obj.getClass().getName()});
    }

    public final void c(Map.Entry entry) {
        w0 w0Var = (w0) entry.getKey();
        Object value = entry.getValue();
        if (w0Var.d) {
            Object obj = this.a.get(w0Var);
            if (obj == null) {
                obj = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                List list = (List) obj;
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj2 = bArr2;
                }
                list.add(obj2);
            }
            this.a.a(w0Var, obj);
            return;
        }
        k4 a = w0Var.c.a();
        k4 k4Var = k4.MESSAGE;
        e3 e3Var = this.a;
        if (a != k4Var) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            e3Var.a(w0Var, value);
            return;
        }
        Object obj3 = e3Var.get(w0Var);
        if (obj3 != null) {
            t0 t0Var = (t0) ((d2) obj3).toBuilder();
            t0Var.c();
            t0.a(t0Var.b, (z0) ((d2) value));
            this.a.a(w0Var, t0Var.a());
            return;
        }
        e3 e3Var2 = this.a;
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        e3Var2.a(w0Var, value);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final n0 m26clone() {
        e3 e3Var;
        n0 n0Var = new n0();
        int i = 0;
        while (true) {
            int size = this.a.b.size();
            e3Var = this.a;
            if (i >= size) {
                break;
            }
            Map.Entry entry = (Map.Entry) e3Var.b.get(i);
            n0Var.c((w0) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : e3Var.b()) {
            n0Var.c((w0) entry2.getKey(), entry2.getValue());
        }
        n0Var.c = this.c;
        return n0Var;
    }

    public final void e() {
        if (this.b) {
            return;
        }
        v2 v2Var = (v2) this.a;
        if (!v2Var.d) {
            for (int i = 0; i < v2Var.b.size(); i++) {
                Map.Entry entry = (Map.Entry) v2Var.b.get(i);
                if (((w0) entry.getKey()).d) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : v2Var.b()) {
                if (((w0) entry2.getKey()).d) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!v2Var.d) {
            v2Var.c = v2Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(v2Var.c);
            v2Var.f = v2Var.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(v2Var.f);
            v2Var.d = true;
        }
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return this.a.equals(((n0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public n0() {
        int i = e3.h;
        this.a = new v2(16);
    }

    public final int b() {
        e3 e3Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = this.a.b.size();
            e3Var = this.a;
            if (i >= size) {
                break;
            }
            Map.Entry entry = (Map.Entry) e3Var.b.get(i);
            i2 += b((w0) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : e3Var.b()) {
            i2 += b((w0) entry2.getKey(), entry2.getValue());
        }
        return i2;
    }

    public final Iterator d() {
        boolean z = this.c;
        e3 e3Var = this.a;
        if (z) {
            return new o1(e3Var.entrySet().iterator());
        }
        return e3Var.entrySet().iterator();
    }

    public static boolean b(Map.Entry entry) {
        w0 w0Var = (w0) entry.getKey();
        if (w0Var.c.a() != k4.MESSAGE) {
            return true;
        }
        if (w0Var.d) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((d2) it.next()).isInitialized()) {
                    return false;
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof d2) {
            return ((d2) value).isInitialized();
        }
        a70.p("Wrong object type used with protocol message reflection.");
        return false;
    }

    public final boolean c() {
        int i = 0;
        while (true) {
            int size = this.a.b.size();
            e3 e3Var = this.a;
            if (i < size) {
                if (!b((Map.Entry) e3Var.b.get(i))) {
                    return false;
                }
                i++;
            } else {
                Iterator it = e3Var.b().iterator();
                while (it.hasNext()) {
                    if (!b((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public final void c(w0 w0Var, Object obj) {
        if (w0Var.d) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d(w0Var, it.next());
                }
                obj = arrayList;
            } else {
                a70.p("Wrong object type used with protocol message reflection.");
                return;
            }
        } else {
            d(w0Var, obj);
        }
        this.a.a(w0Var, obj);
    }

    public final int a() {
        e3 e3Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = this.a.b.size();
            e3Var = this.a;
            if (i >= size) {
                break;
            }
            i2 += a((Map.Entry) e3Var.b.get(i));
            i++;
        }
        Iterator it = e3Var.b().iterator();
        while (it.hasNext()) {
            i2 += a((Map.Entry) it.next());
        }
        return i2;
    }

    public static int a(Map.Entry entry) {
        w0 w0Var = (w0) entry.getKey();
        Object value = entry.getValue();
        if (w0Var.c.a() == k4.MESSAGE && !w0Var.d && !w0Var.e) {
            int i = ((w0) entry.getKey()).b;
            int c = b0.c(i) + b0.b(2) + (b0.b(1) * 2);
            int b = b0.b(3);
            int serializedSize = ((d2) value).getSerializedSize();
            return l0.a(serializedSize, serializedSize, b, c);
        }
        return b(w0Var, value);
    }

    public final void a(n0 n0Var) {
        e3 e3Var;
        int i = 0;
        while (true) {
            int size = n0Var.a.b.size();
            e3Var = n0Var.a;
            if (i >= size) {
                break;
            }
            c((Map.Entry) e3Var.b.get(i));
            i++;
        }
        Iterator it = e3Var.b().iterator();
        while (it.hasNext()) {
            c((Map.Entry) it.next());
        }
    }

    public final void a(w0 w0Var, Object obj) {
        List list;
        if (w0Var.d) {
            d(w0Var, obj);
            Object obj2 = this.a.get(w0Var);
            if (obj2 == null) {
                list = new ArrayList();
                this.a.a(w0Var, list);
            } else {
                list = (List) obj2;
            }
            list.add(obj);
            return;
        }
        a70.p("addRepeatedField() can only be called on repeated fields.");
    }
}
