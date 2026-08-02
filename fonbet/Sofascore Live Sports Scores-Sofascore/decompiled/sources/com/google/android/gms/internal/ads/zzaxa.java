package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.x5n;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaxa {
    public Object a;
    public long b;
    public double c;
    public zzawe d;
    public ArrayList e;
    public zzaws f;
    public int g = 1;

    private zzaxa() {
    }

    public static zzaxa a(Object obj) {
        zzaxa zzaxaVar = new zzaxa();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int y = x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        zzaxaVar.r();
        zzaxaVar.g = (i8 % 1937477084) ^ y;
        zzaxaVar.a = obj;
        return zzaxaVar;
    }

    public static zzaxa b(long j) {
        zzaxa zzaxaVar = new zzaxa();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int y = x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        zzaxaVar.r();
        zzaxaVar.g = (i8 % 327254586) ^ y;
        zzaxaVar.b = j;
        return zzaxaVar;
    }

    public static zzaxa c(double d) {
        zzaxa zzaxaVar = new zzaxa();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int y = x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        zzaxaVar.r();
        zzaxaVar.g = (i8 % 1605908235) ^ y;
        zzaxaVar.c = d;
        return zzaxaVar;
    }

    public static zzaxa d(zzawe zzaweVar) {
        zzaxa zzaxaVar = new zzaxa();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int y = x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        zzaxaVar.r();
        zzaxaVar.g = (i8 % 1402586708) ^ y;
        zzaxaVar.d = zzaweVar;
        return zzaxaVar;
    }

    public static zzaxa e(ArrayList arrayList) {
        zzaxa zzaxaVar = new zzaxa();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int y = x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        zzaxaVar.r();
        zzaxaVar.g = (i8 % 324763920) ^ y;
        zzaxaVar.e = arrayList;
        return zzaxaVar;
    }

    public static zzaxa f(zzaws zzawsVar) {
        zzaxa zzaxaVar = new zzaxa();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int y = x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        zzaxaVar.r();
        zzaxaVar.g = (i8 % 474613996) ^ y;
        zzaxaVar.f = zzawsVar;
        return zzaxaVar;
    }

    public static zzaxa g(Object obj) {
        if (obj instanceof Long) {
            return b(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return b(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return b(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return c(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return c(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return b(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return b(((Byte) obj).byteValue());
        }
        if (obj instanceof zzawe) {
            return d((zzawe) obj);
        }
        if (obj instanceof String) {
            return d(zzawe.e(((String) obj).getBytes(Charset.forName(zzawc.a("Hn2H4l0=")))));
        }
        if (!(obj instanceof ArrayList)) {
            return a(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(g(arrayList2.get(i)));
        }
        return e(arrayList);
    }

    public static zzaxa j(zzaxa zzaxaVar) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int y = x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 552812661;
        try {
            int i10 = zzaxaVar.g;
            int i11 = (i9 ^ y) + i10;
            if (i10 == 0) {
                throw null;
            }
            switch (i11) {
                case 0:
                    return new zzaxa();
                case 1:
                    return a(zzaxaVar.l());
                case 2:
                    return b(zzaxaVar.m());
                case 3:
                    return d(zzaxaVar.n());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((ArrayList) zzaxaVar.o()).iterator();
                    while (it.hasNext()) {
                        arrayList.add(j((zzaxa) it.next()));
                    }
                    return e(arrayList);
                case 5:
                    return f(zzaxaVar.p());
                case 6:
                    return c(zzaxaVar.q());
                default:
                    a70.j(zzawc.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
                    return null;
            }
        } catch (zzawx e) {
            throw new AssertionError(zzawc.a("CEiv6BFfPnitUE+D"), e);
        }
    }

    public final Object h() {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int y = x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = this.g;
        int i10 = ((i8 % 473891334) ^ y) + i9;
        if (i9 == 0) {
            throw null;
        }
        switch (i10) {
            case 0:
            case 5:
                throw new zzawx();
            case 1:
                return l();
            case 2:
                return Long.valueOf(m());
            case 3:
                return n().a();
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) o()).iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzaxa) it.next()).h());
                }
                return arrayList;
            case 6:
                return Double.valueOf(q());
            default:
                a70.j(zzawc.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f4, code lost:
    
        if (r19.equals(java.lang.Object.class) != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Class cls) {
        int i = this.g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        Class cls2 = Double.TYPE;
        Class cls3 = Short.TYPE;
        Class cls4 = Byte.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Float.TYPE;
        switch (i2) {
            case 0:
                break;
            case 1:
                return l();
            case 2:
                long m = m();
                if (!cls.equals(Byte.class) && !cls.equals(cls4)) {
                    if (cls.equals(Short.class) || cls.equals(cls3)) {
                        return Short.valueOf((short) ((((int) m) << 16) >> 16));
                    }
                    if (cls.equals(Integer.class) || cls.equals(cls6)) {
                        return Integer.valueOf(Math.toIntExact(m));
                    }
                    if (!cls.equals(Long.class) && !cls.equals(cls5)) {
                        if (cls.equals(Float.class) || cls.equals(cls7)) {
                            return Float.valueOf(m);
                        }
                        if (cls.equals(Double.class) || cls.equals(cls2)) {
                            return Double.valueOf(m);
                        }
                        if (!cls.equals(Boolean.class) && !cls.equals(Boolean.TYPE)) {
                            if (!cls.equals(Character.class) && !cls.equals(Character.TYPE)) {
                                break;
                            }
                        } else {
                            return Boolean.valueOf(m != 0);
                        }
                    }
                    return Long.valueOf(m);
                }
                return Byte.valueOf((byte) ((((int) m) << 24) >> 24));
            case 3:
                zzawe n = n();
                if (cls.equals(zzawe.class)) {
                    return n;
                }
                if (cls.equals(Object.class) || cls.equals(String.class)) {
                    return n.c();
                }
                if (cls.equals(byte[].class)) {
                    return n.a();
                }
                break;
            case 4:
                if (cls.equals(ArrayList.class) || cls.equals(Object.class) || cls.equals(AbstractList.class) || cls.equals(AbstractCollection.class) || cls.equals(Serializable.class) || cls.equals(Cloneable.class) || cls.equals(Iterable.class) || cls.equals(Collection.class) || cls.equals(List.class) || cls.equals(RandomAccess.class)) {
                    return h();
                }
                if (cls.isArray()) {
                    List o = o();
                    Class<?> componentType = cls.getComponentType();
                    ArrayList arrayList = (ArrayList) o;
                    Object newInstance = Array.newInstance(componentType, arrayList.size());
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        Array.set(newInstance, i3, ((zzaxa) arrayList.get(i3)).i(componentType));
                    }
                    return newInstance;
                }
                break;
            case 5:
                return p();
            case 6:
                double q = q();
                if (cls.equals(Float.class) || cls.equals(cls7)) {
                    return Float.valueOf((float) q);
                }
                if (cls.equals(Integer.class) || cls.equals(cls6)) {
                    return Integer.valueOf((int) q);
                }
                if (cls.equals(Long.class) || cls.equals(cls5)) {
                    return Long.valueOf((long) q);
                }
                if (cls.equals(Byte.class) || cls.equals(cls4)) {
                    return Byte.valueOf((byte) ((((int) q) << 24) >> 24));
                }
                if (cls.equals(Short.class) || cls.equals(cls3)) {
                    return Short.valueOf((short) ((((int) q) << 16) >> 16));
                }
                if (cls.equals(Double.class) || cls.equals(cls2) || cls.equals(Object.class)) {
                    return Double.valueOf(q);
                }
                break;
            default:
                a70.j(zzawc.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
                return null;
        }
        throw new zzawx();
    }

    public final void k(ByteArrayOutputStream byteArrayOutputStream) {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = (((((~j) & j2) | j3) + ((j & j4) | j5)) - j6) + j7;
        long j10 = j8 % 297598514;
        int i = this.g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
            case 1:
            case 5:
                throw new zzawx();
            case 2:
                zzawa.b(m(), new zzawz(byteArrayOutputStream), true);
                return;
            case 3:
                byte[] bArr = n().a;
                zzawa.b(bArr.length * (j9 ^ j10), new zzawz(byteArrayOutputStream), true);
                byteArrayOutputStream.write(bArr);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) o();
                zzawa.b(arrayList.size(), new zzawz(byteArrayOutputStream), true);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzaxa) it.next()).k(byteArrayOutputStream);
                }
                return;
            case 6:
                double q = q();
                zzawz zzawzVar = new zzawz(byteArrayOutputStream);
                long doubleToRawLongBits = Double.doubleToRawLongBits(q);
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                allocate.putLong(doubleToRawLongBits);
                for (byte b : allocate.array()) {
                    zzawzVar.a.write(b);
                }
                int length = allocate.array().length;
                return;
            default:
                return;
        }
    }

    public final Object l() {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        s((iArr[7] % 235745791) ^ x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.a;
    }

    public final long m() {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        s((iArr[7] % 733327814) ^ x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.b;
    }

    public final zzawe n() {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        s((iArr[7] % 1140384172) ^ x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.d;
    }

    public final List o() {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        s((iArr[7] % 1250801052) ^ x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.e;
    }

    public final zzaws p() {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        s((iArr[7] % 395191309) ^ x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.f;
    }

    public final double q() {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        s((iArr[7] % 846930886) ^ x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
        return this.c;
    }

    public final void r() {
        this.g = 1;
        this.b = 0L;
        this.a = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final void s(int i) {
        if (i != this.g) {
            throw new zzawx();
        }
    }
}
