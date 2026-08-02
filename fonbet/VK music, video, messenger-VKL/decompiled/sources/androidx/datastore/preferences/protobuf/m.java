package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.m.b;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.q;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import xsna.la20;
import xsna.v8e0;

/* compiled from: FieldSet.java */
/* loaded from: classes.dex */
public final class m<T extends b<T>> {
    public static final m<?> d = new m<>(0);
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
    /* loaded from: classes12.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        WireFormat$JavaType getLiteJavaType();
    }

    public m() {
        int i = d0.h;
        this.a = new c0();
    }

    public static int b(WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        int serializedSize;
        int o;
        int n = CodedOutputStream.n(i);
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            n *= 2;
        }
        int i2 = 4;
        switch (a.b[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.d;
                i2 = 8;
                return i2 + n;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.d;
                return i2 + n;
            case 3:
                i2 = CodedOutputStream.p(((Long) obj).longValue());
                return i2 + n;
            case 4:
                i2 = CodedOutputStream.p(((Long) obj).longValue());
                return i2 + n;
            case 5:
                i2 = CodedOutputStream.p(((Integer) obj).intValue());
                return i2 + n;
            case 6:
                ((Long) obj).getClass();
                Logger logger3 = CodedOutputStream.d;
                i2 = 8;
                return i2 + n;
            case 7:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.d;
                return i2 + n;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.d;
                i2 = 1;
                return i2 + n;
            case 9:
                Logger logger6 = CodedOutputStream.d;
                i2 = ((la20) obj).getSerializedSize();
                return i2 + n;
            case 10:
                if (obj instanceof q) {
                    i2 = CodedOutputStream.j((q) obj);
                    return i2 + n;
                }
                Logger logger7 = CodedOutputStream.d;
                serializedSize = ((la20) obj).getSerializedSize();
                o = CodedOutputStream.o(serializedSize);
                i2 = o + serializedSize;
                return i2 + n;
            case 11:
                i2 = obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.m((String) obj);
                return i2 + n;
            case 12:
                if (obj instanceof ByteString) {
                    i2 = CodedOutputStream.i((ByteString) obj);
                    return i2 + n;
                }
                Logger logger8 = CodedOutputStream.d;
                serializedSize = ((byte[]) obj).length;
                o = CodedOutputStream.o(serializedSize);
                i2 = o + serializedSize;
                return i2 + n;
            case 13:
                i2 = CodedOutputStream.o(((Integer) obj).intValue());
                return i2 + n;
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = CodedOutputStream.d;
                return i2 + n;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = CodedOutputStream.d;
                i2 = 8;
                return i2 + n;
            case 16:
                i2 = CodedOutputStream.k(((Integer) obj).intValue());
                return i2 + n;
            case 17:
                i2 = CodedOutputStream.l(((Long) obj).longValue());
                return i2 + n;
            case 18:
                i2 = obj instanceof p.a ? CodedOutputStream.p(((p.a) obj).getNumber()) : CodedOutputStream.p(((Integer) obj).intValue());
                return i2 + n;
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
            codedOutputStream.I(i, 3);
            ((la20) obj).b(codedOutputStream);
            codedOutputStream.I(i, 4);
        }
        codedOutputStream.I(i, wireFormat$FieldType.i());
        switch (a.b[wireFormat$FieldType.ordinal()]) {
            case 1:
                codedOutputStream.z(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                codedOutputStream.x(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                codedOutputStream.M(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.M(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.B(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.z(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.x(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.r(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((la20) obj).b(codedOutputStream);
                break;
            case 10:
                codedOutputStream.D((la20) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.H((String) obj);
                    break;
                } else {
                    codedOutputStream.v((ByteString) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.t(bArr.length, bArr);
                    break;
                } else {
                    codedOutputStream.v((ByteString) obj);
                    break;
                }
            case 13:
                codedOutputStream.K(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.x(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.z(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                codedOutputStream.K((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.M((longValue >> 63) ^ (longValue << 1));
                break;
            case 18:
                if (!(obj instanceof p.a)) {
                    codedOutputStream.B(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.B(((p.a) obj).getNumber());
                    break;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m<T> clone() {
        m<T> mVar = (m<T>) new m();
        c0 c0Var = this.a;
        if (c0Var.b.size() > 0) {
            Map.Entry<b<Object>, Object> c = c0Var.c(0);
            mVar.j(c.getKey(), c.getValue());
            throw null;
        }
        Iterator it = c0Var.d().iterator();
        if (!it.hasNext()) {
            mVar.c = this.c;
            return mVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        mVar.j((b) entry.getKey(), entry.getValue());
        throw null;
    }

    public final boolean e() {
        c0 c0Var = this.a;
        if (c0Var.b.size() > 0) {
            f(c0Var.c(0));
            throw null;
        }
        Iterator it = c0Var.d().iterator();
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
        if (obj instanceof m) {
            return this.a.equals(((m) obj).a);
        }
        return false;
    }

    public final Iterator<Map.Entry<T, Object>> g() {
        c0 c0Var = this.a;
        return c0Var.isEmpty() ? Collections.emptyIterator() : this.c ? new q.b(((d0.e) c0Var.entrySet()).iterator()) : ((d0.e) c0Var.entrySet()).iterator();
    }

    public final void h() {
        if (this.b) {
            return;
        }
        c0 c0Var = this.a;
        int size = c0Var.b.size();
        for (int i = 0; i < size; i++) {
            Map.Entry<b<Object>, Object> c = c0Var.c(i);
            if (c.getValue() instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) c.getValue();
                generatedMessageLite.getClass();
                v8e0 v8e0Var = v8e0.c;
                v8e0Var.getClass();
                v8e0Var.a(generatedMessageLite.getClass()).d(generatedMessageLite);
                generatedMessageLite.k();
            }
        }
        c0Var.f();
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
        Charset charset = p.a;
        obj.getClass();
        int[] iArr = a.a;
        throw null;
    }

    public m(int i) {
        int i2 = d0.h;
        this.a = new c0();
        h();
        h();
    }
}
