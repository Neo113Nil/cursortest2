package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.b0;
import androidx.health.platform.client.proto.c0;
import androidx.health.platform.client.proto.y.b;
import androidx.health.platform.client.proto.z0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import xsna.ja20;

/* compiled from: FieldSet.java */
/* loaded from: classes12.dex */
public final class y<T extends b<T>> {
    public static final y<?> d = new y<>(0);
    public final y0 a;
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

    public y() {
        int i = z0.h;
        this.a = new y0();
    }

    public static int b(WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        int serializedSize;
        int z;
        int y = CodedOutputStream.y(i);
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            y *= 2;
        }
        int i2 = 4;
        switch (a.b[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.b;
                i2 = 8;
                return i2 + y;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.b;
                return i2 + y;
            case 3:
                i2 = CodedOutputStream.A(((Long) obj).longValue());
                return i2 + y;
            case 4:
                i2 = CodedOutputStream.A(((Long) obj).longValue());
                return i2 + y;
            case 5:
                i2 = CodedOutputStream.A(((Integer) obj).intValue());
                return i2 + y;
            case 6:
                ((Long) obj).getClass();
                Logger logger3 = CodedOutputStream.b;
                i2 = 8;
                return i2 + y;
            case 7:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.b;
                return i2 + y;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.b;
                i2 = 1;
                return i2 + y;
            case 9:
                Logger logger6 = CodedOutputStream.b;
                i2 = ((ja20) obj).getSerializedSize();
                return i2 + y;
            case 10:
                if (obj instanceof c0) {
                    i2 = CodedOutputStream.u((c0) obj);
                    return i2 + y;
                }
                Logger logger7 = CodedOutputStream.b;
                serializedSize = ((ja20) obj).getSerializedSize();
                z = CodedOutputStream.z(serializedSize);
                i2 = z + serializedSize;
                return i2 + y;
            case 11:
                i2 = obj instanceof ByteString ? CodedOutputStream.t((ByteString) obj) : CodedOutputStream.x((String) obj);
                return i2 + y;
            case 12:
                if (obj instanceof ByteString) {
                    i2 = CodedOutputStream.t((ByteString) obj);
                    return i2 + y;
                }
                Logger logger8 = CodedOutputStream.b;
                serializedSize = ((byte[]) obj).length;
                z = CodedOutputStream.z(serializedSize);
                i2 = z + serializedSize;
                return i2 + y;
            case 13:
                i2 = CodedOutputStream.z(((Integer) obj).intValue());
                return i2 + y;
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = CodedOutputStream.b;
                return i2 + y;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = CodedOutputStream.b;
                i2 = 8;
                return i2 + y;
            case 16:
                i2 = CodedOutputStream.v(((Integer) obj).intValue());
                return i2 + y;
            case 17:
                i2 = CodedOutputStream.w(((Long) obj).longValue());
                return i2 + y;
            case 18:
                i2 = obj instanceof b0.a ? CodedOutputStream.A(((b0.a) obj).getNumber()) : CodedOutputStream.A(((Integer) obj).intValue());
                return i2 + y;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int c(b<?> bVar, Object obj) {
        bVar.getClass();
        return b(null, 0, obj);
    }

    public static int d(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        entry.getValue();
        bVar.getLiteJavaType();
        throw null;
    }

    public static <T extends b<T>> boolean f(Map.Entry<T, Object> entry) {
        entry.getKey().getLiteJavaType();
        throw null;
    }

    public static void k(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) throws IOException {
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            codedOutputStream.S(i, 3);
            ((ja20) obj).b(codedOutputStream);
            codedOutputStream.S(i, 4);
        }
        codedOutputStream.S(i, wireFormat$FieldType.i());
        switch (a.b[wireFormat$FieldType.ordinal()]) {
            case 1:
                codedOutputStream.J(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                codedOutputStream.H(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                codedOutputStream.W(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.W(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.L(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.J(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.H(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.B(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((ja20) obj).b(codedOutputStream);
                break;
            case 10:
                codedOutputStream.N((ja20) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.R((String) obj);
                    break;
                } else {
                    codedOutputStream.F((ByteString) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.D(bArr.length, bArr);
                    break;
                } else {
                    codedOutputStream.F((ByteString) obj);
                    break;
                }
            case 13:
                codedOutputStream.U(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.H(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.J(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                codedOutputStream.U((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.W((longValue >> 63) ^ (longValue << 1));
                break;
            case 18:
                if (!(obj instanceof b0.a)) {
                    codedOutputStream.L(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.L(((b0.a) obj).getNumber());
                    break;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y<T> clone() {
        y<T> yVar = (y<T>) new y();
        y0 y0Var = this.a;
        if (y0Var.b.size() > 0) {
            Map.Entry<b<Object>, Object> c = y0Var.c(0);
            yVar.j(c.getKey(), c.getValue());
            throw null;
        }
        Iterator it = y0Var.d().iterator();
        if (!it.hasNext()) {
            yVar.c = this.c;
            return yVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        yVar.j((b) entry.getKey(), entry.getValue());
        throw null;
    }

    public final boolean e() {
        y0 y0Var = this.a;
        if (y0Var.b.size() > 0) {
            f(y0Var.c(0));
            throw null;
        }
        Iterator it = y0Var.d().iterator();
        if (!it.hasNext()) {
            return true;
        }
        f((Map.Entry) it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.a.equals(((y) obj).a);
        }
        return false;
    }

    public final Iterator<Map.Entry<T, Object>> g() {
        y0 y0Var = this.a;
        return y0Var.isEmpty() ? Collections.emptyIterator() : this.c ? new c0.b(((z0.e) y0Var.entrySet()).iterator()) : ((z0.e) y0Var.entrySet()).iterator();
    }

    public final void h() {
        if (this.b) {
            return;
        }
        y0 y0Var = this.a;
        int size = y0Var.b.size();
        for (int i = 0; i < size; i++) {
            Map.Entry<b<Object>, Object> c = y0Var.c(i);
            if (c.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) c.getValue()).n();
            }
        }
        y0Var.f();
        this.b = true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        entry.getValue();
        key.getClass();
        key.getLiteJavaType();
        throw null;
    }

    public final void j(T t, Object obj) {
        t.getClass();
        t.getClass();
        Charset charset = b0.a;
        obj.getClass();
        int[] iArr = a.a;
        throw null;
    }

    public y(int i) {
        int i2 = z0.h;
        this.a = new y0();
        h();
        h();
    }
}
