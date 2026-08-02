package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.n.b;
import com.google.crypto.tink.shaded.protobuf.q;
import com.google.crypto.tink.shaded.protobuf.r;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import xsna.ka20;

/* compiled from: FieldSet.java */
/* loaded from: classes13.dex */
public final class n<T extends b<T>> {
    public static final n d = new n(0);
    public final c0 a;
    public boolean b;
    public boolean c;

    /* compiled from: FieldSet.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            b = iArr;
            try {
                iArr[WireFormat$FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[WireFormat$FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[WireFormat$FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[WireFormat$FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[WireFormat$FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[WireFormat$FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[WireFormat$FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[WireFormat$FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[WireFormat$FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[WireFormat$FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[WireFormat$FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[WireFormat$FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[WireFormat$FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[WireFormat$FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[WireFormat$FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[WireFormat$FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[WireFormat$FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[WireFormat$FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat$JavaType.values().length];
            a = iArr2;
            try {
                iArr2[WireFormat$JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[WireFormat$JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[WireFormat$JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[WireFormat$JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[WireFormat$JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[WireFormat$JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[WireFormat$JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[WireFormat$JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[WireFormat$JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    public interface b<T extends b<T>> extends Comparable<T> {
        WireFormat$JavaType getLiteJavaType();
    }

    public n() {
        this.a = new c0(16);
    }

    public static int b(b<?> bVar, Object obj) {
        int serializedSize;
        int p;
        bVar.getClass();
        int n = CodedOutputStream.n(0);
        Enum r1 = null;
        if (WireFormat$FieldType.GROUP == null) {
            n *= 2;
        }
        int i = a.b[r1.ordinal()];
        int i2 = 1;
        switch (i) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.b;
                i2 = 8;
                return i2 + n;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.b;
                i2 = 4;
                return i2 + n;
            case 3:
                i2 = CodedOutputStream.q(((Long) obj).longValue());
                return i2 + n;
            case 4:
                i2 = CodedOutputStream.q(((Long) obj).longValue());
                return i2 + n;
            case 5:
                i2 = CodedOutputStream.l(((Integer) obj).intValue());
                return i2 + n;
            case 6:
                ((Long) obj).getClass();
                Logger logger3 = CodedOutputStream.b;
                i2 = 8;
                return i2 + n;
            case 7:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.b;
                i2 = 4;
                return i2 + n;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.b;
                return i2 + n;
            case 9:
                Logger logger6 = CodedOutputStream.b;
                i2 = ((ka20) obj).getSerializedSize();
                return i2 + n;
            case 10:
                if (obj instanceof r) {
                    Logger logger7 = CodedOutputStream.b;
                    serializedSize = ((r) obj).a();
                    p = CodedOutputStream.p(serializedSize);
                } else {
                    Logger logger8 = CodedOutputStream.b;
                    serializedSize = ((ka20) obj).getSerializedSize();
                    p = CodedOutputStream.p(serializedSize);
                }
                i2 = p + serializedSize;
                return i2 + n;
            case 11:
                i2 = obj instanceof ByteString ? CodedOutputStream.h((ByteString) obj) : CodedOutputStream.m((String) obj);
                return i2 + n;
            case 12:
                if (obj instanceof ByteString) {
                    i2 = CodedOutputStream.h((ByteString) obj);
                    return i2 + n;
                }
                Logger logger9 = CodedOutputStream.b;
                serializedSize = ((byte[]) obj).length;
                p = CodedOutputStream.p(serializedSize);
                i2 = p + serializedSize;
                return i2 + n;
            case 13:
                i2 = CodedOutputStream.p(((Integer) obj).intValue());
                return i2 + n;
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = CodedOutputStream.b;
                i2 = 4;
                return i2 + n;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = CodedOutputStream.b;
                i2 = 8;
                return i2 + n;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i2 = CodedOutputStream.p((intValue >> 31) ^ (intValue << 1));
                return i2 + n;
            case 17:
                long longValue = ((Long) obj).longValue();
                i2 = CodedOutputStream.q((longValue << 1) ^ (longValue >> 63));
                return i2 + n;
            case 18:
                i2 = obj instanceof q.a ? CodedOutputStream.l(((q.a) obj).getNumber()) : CodedOutputStream.l(((Integer) obj).intValue());
                return i2 + n;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(Map.Entry entry) {
        CodedOutputStream.n(1);
        b bVar = (b) entry.getKey();
        entry.getValue();
        bVar.getLiteJavaType();
        throw null;
    }

    public static <T extends b<T>> boolean h(Map.Entry<T, Object> entry) {
        entry.getKey().getLiteJavaType();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n<T> clone() {
        c0 c0Var;
        n<T> nVar = (n<T>) new n();
        int i = 0;
        while (true) {
            c0Var = this.a;
            if (i >= c0Var.c.size()) {
                break;
            }
            Map.Entry<Object, Object> c = c0Var.c(i);
            nVar.l((b) c.getKey(), c.getValue());
            i++;
        }
        for (Map.Entry<Object, Object> entry : c0Var.d()) {
            nVar.l((b) entry.getKey(), entry.getValue());
        }
        nVar.c = this.c;
        return nVar;
    }

    public final Iterator<Map.Entry<T, Object>> c() {
        c0 c0Var = this.a;
        if (this.c) {
            if (c0Var.h == null) {
                c0Var.h = new d0.b();
            }
            return new r.b(c0Var.h.iterator());
        }
        if (c0Var.h == null) {
            c0Var.h = new d0.b();
        }
        return (Iterator<Map.Entry<T, Object>>) c0Var.h.iterator();
    }

    public final int e() {
        c0 c0Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            c0Var = this.a;
            if (i >= c0Var.c.size()) {
                break;
            }
            Map.Entry<Object, Object> c = c0Var.c(i);
            i2 += b((b) c.getKey(), c.getValue());
            i++;
        }
        for (Map.Entry<Object, Object> entry : c0Var.d()) {
            i2 += b((b) entry.getKey(), entry.getValue());
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.a.equals(((n) obj).a);
        }
        return false;
    }

    public final boolean f() {
        return this.a.isEmpty();
    }

    public final boolean g() {
        c0 c0Var = this.a;
        if (c0Var.c.size() > 0) {
            h(c0Var.c(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = c0Var.d().iterator();
        if (!it.hasNext()) {
            return true;
        }
        h(it.next());
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> i() {
        boolean z = this.c;
        c0 c0Var = this.a;
        return z ? new r.b(((d0.f) c0Var.entrySet()).iterator()) : ((d0.f) c0Var.entrySet()).iterator();
    }

    public final void j(n<T> nVar) {
        c0 c0Var = nVar.a;
        if (c0Var.c.size() > 0) {
            k(c0Var.c(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = c0Var.d().iterator();
        if (it.hasNext()) {
            k((Map.Entry) it.next());
            throw null;
        }
    }

    public final void k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof r) {
            ((r) value).b(null);
        }
        key.getClass();
        key.getLiteJavaType();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if ((r5 instanceof com.google.crypto.tink.shaded.protobuf.q.a) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if ((r5 instanceof byte[]) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if ((r5 instanceof com.google.crypto.tink.shaded.protobuf.r) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(T t, Object obj) {
        t.getClass();
        Charset charset = q.a;
        obj.getClass();
        WireFormat$FieldType wireFormat$FieldType = null;
        boolean z = false;
        switch (a.a[wireFormat$FieldType.h().ordinal()]) {
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
                if (!(obj instanceof ByteString)) {
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
                if (!(obj instanceof ka20)) {
                    break;
                }
                z = true;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof r) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    public n(int i) {
        int i2 = d0.i;
        c0 c0Var = new c0(0);
        this.a = c0Var;
        if (!this.b) {
            c0Var.f();
            this.b = true;
        }
        if (this.b) {
            return;
        }
        c0Var.f();
        this.b = true;
    }
}
