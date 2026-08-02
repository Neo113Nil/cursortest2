package com.google.gson.internal.bind;

import androidx.appcompat.widget.c1;
import com.google.gson.internal.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import r4.k;
import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e {
    public static final y A;
    public static final y B;

    /* renamed from: a, reason: collision with root package name */
    public static final y f6288a = new TypeAdapters$29(Class.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$1
        @Override // com.google.gson.x
        public final Object b(r9.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.x
        public final void c(r9.b bVar, Object obj) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        }
    }.a());

    /* renamed from: b, reason: collision with root package name */
    public static final y f6289b = new TypeAdapters$29(BitSet.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$2
        @Override // com.google.gson.x
        public final Object b(r9.a aVar) {
            boolean z5;
            BitSet bitSet = new BitSet();
            aVar.c();
            int i02 = aVar.i0();
            int i5 = 0;
            while (i02 != 2) {
                int d10 = f.d(i02);
                if (d10 == 5 || d10 == 6) {
                    int R = aVar.R();
                    if (R == 0) {
                        z5 = false;
                    } else {
                        if (R != 1) {
                            StringBuilder r5 = c1.r(R, "Invalid bitset value ", ", expected 0 or 1; at path ");
                            r5.append(aVar.z(true));
                            throw new r(r5.toString());
                        }
                        z5 = true;
                    }
                } else {
                    if (d10 != 7) {
                        throw new r("Invalid bitset value type: " + k.u(i02) + "; at path " + aVar.z(false));
                    }
                    z5 = aVar.N();
                }
                if (z5) {
                    bitSet.set(i5);
                }
                i5++;
                i02 = aVar.i0();
            }
            aVar.t();
            return bitSet;
        }

        @Override // com.google.gson.x
        public final void c(r9.b bVar, Object obj) {
            BitSet bitSet = (BitSet) obj;
            bVar.k();
            int length = bitSet.length();
            for (int i5 = 0; i5 < length; i5++) {
                bVar.R(bitSet.get(i5) ? 1L : 0L);
            }
            bVar.t();
        }
    }.a());

    /* renamed from: c, reason: collision with root package name */
    public static final x f6290c;

    /* renamed from: d, reason: collision with root package name */
    public static final y f6291d;

    /* renamed from: e, reason: collision with root package name */
    public static final y f6292e;

    /* renamed from: f, reason: collision with root package name */
    public static final y f6293f;

    /* renamed from: g, reason: collision with root package name */
    public static final y f6294g;

    /* renamed from: h, reason: collision with root package name */
    public static final y f6295h;

    /* renamed from: i, reason: collision with root package name */
    public static final y f6296i;
    public static final y j;

    /* renamed from: k, reason: collision with root package name */
    public static final x f6297k;

    /* renamed from: l, reason: collision with root package name */
    public static final y f6298l;

    /* renamed from: m, reason: collision with root package name */
    public static final x f6299m;

    /* renamed from: n, reason: collision with root package name */
    public static final x f6300n;

    /* renamed from: o, reason: collision with root package name */
    public static final x f6301o;

    /* renamed from: p, reason: collision with root package name */
    public static final y f6302p;
    public static final y q;

    /* renamed from: r, reason: collision with root package name */
    public static final y f6303r;

    /* renamed from: s, reason: collision with root package name */
    public static final y f6304s;

    /* renamed from: t, reason: collision with root package name */
    public static final y f6305t;

    /* renamed from: u, reason: collision with root package name */
    public static final y f6306u;

    /* renamed from: v, reason: collision with root package name */
    public static final y f6307v;

    /* renamed from: w, reason: collision with root package name */
    public static final y f6308w;

    /* renamed from: x, reason: collision with root package name */
    public static final y f6309x;

    /* renamed from: y, reason: collision with root package name */
    public static final y f6310y;

    /* renamed from: z, reason: collision with root package name */
    public static final x f6311z;

    static {
        x xVar = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$3
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                int i02 = aVar.i0();
                if (i02 != 9) {
                    return i02 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.f0())) : Boolean.valueOf(aVar.N());
                }
                aVar.c0();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    bVar.C();
                    return;
                }
                bVar.c0();
                bVar.c();
                bVar.f22336a.write(bool.booleanValue() ? "true" : "false");
            }
        };
        f6290c = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$4
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() != 9) {
                    return Boolean.valueOf(aVar.f0());
                }
                aVar.c0();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                Boolean bool = (Boolean) obj;
                bVar.W(bool == null ? "null" : bool.toString());
            }
        };
        f6291d = new TypeAdapters$30(Boolean.TYPE, Boolean.class, xVar);
        f6292e = new TypeAdapters$30(Byte.TYPE, Byte.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$5
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() == 9) {
                    aVar.c0();
                    return null;
                }
                try {
                    int R = aVar.R();
                    if (R <= 255 && R >= -128) {
                        return Byte.valueOf((byte) R);
                    }
                    StringBuilder r5 = c1.r(R, "Lossy conversion from ", " to byte; at path ");
                    r5.append(aVar.z(true));
                    throw new r(r5.toString());
                } catch (NumberFormatException e7) {
                    throw new r(e7);
                }
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                if (((Number) obj) == null) {
                    bVar.C();
                } else {
                    bVar.R(r4.byteValue());
                }
            }
        });
        f6293f = new TypeAdapters$30(Short.TYPE, Short.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$6
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() == 9) {
                    aVar.c0();
                    return null;
                }
                try {
                    int R = aVar.R();
                    if (R <= 65535 && R >= -32768) {
                        return Short.valueOf((short) R);
                    }
                    StringBuilder r5 = c1.r(R, "Lossy conversion from ", " to short; at path ");
                    r5.append(aVar.z(true));
                    throw new r(r5.toString());
                } catch (NumberFormatException e7) {
                    throw new r(e7);
                }
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                if (((Number) obj) == null) {
                    bVar.C();
                } else {
                    bVar.R(r4.shortValue());
                }
            }
        });
        f6294g = new TypeAdapters$30(Integer.TYPE, Integer.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$7
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() == 9) {
                    aVar.c0();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.R());
                } catch (NumberFormatException e7) {
                    throw new r(e7);
                }
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                if (((Number) obj) == null) {
                    bVar.C();
                } else {
                    bVar.R(r4.intValue());
                }
            }
        });
        f6295h = new TypeAdapters$29(AtomicInteger.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$8
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                try {
                    return new AtomicInteger(aVar.R());
                } catch (NumberFormatException e7) {
                    throw new r(e7);
                }
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                bVar.R(((AtomicInteger) obj).get());
            }
        }.a());
        f6296i = new TypeAdapters$29(AtomicBoolean.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$9
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                return new AtomicBoolean(aVar.N());
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                bVar.Y(((AtomicBoolean) obj).get());
            }
        }.a());
        j = new TypeAdapters$29(AtomicIntegerArray.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$10
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.c();
                while (aVar.C()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.R()));
                    } catch (NumberFormatException e7) {
                        throw new r(e7);
                    }
                }
                aVar.t();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i5 = 0; i5 < size; i5++) {
                    atomicIntegerArray.set(i5, ((Integer) arrayList.get(i5)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                bVar.k();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i5 = 0; i5 < length; i5++) {
                    bVar.R(r6.get(i5));
                }
                bVar.t();
            }
        }.a());
        f6297k = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$11
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() == 9) {
                    aVar.c0();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.U());
                } catch (NumberFormatException e7) {
                    throw new r(e7);
                }
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.C();
                } else {
                    bVar.R(number.longValue());
                }
            }
        };
        new x() { // from class: com.google.gson.internal.bind.TypeAdapters$12
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() != 9) {
                    return Float.valueOf((float) aVar.O());
                }
                aVar.c0();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.C();
                    return;
                }
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                bVar.U(number);
            }
        };
        new x() { // from class: com.google.gson.internal.bind.TypeAdapters$13
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() != 9) {
                    return Double.valueOf(aVar.O());
                }
                aVar.c0();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.C();
                } else {
                    bVar.O(number.doubleValue());
                }
            }
        };
        f6298l = new TypeAdapters$30(Character.TYPE, Character.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$14
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() == 9) {
                    aVar.c0();
                    return null;
                }
                String f02 = aVar.f0();
                if (f02.length() == 1) {
                    return Character.valueOf(f02.charAt(0));
                }
                StringBuilder p10 = d9.e.p("Expecting character, got: ", f02, "; at ");
                p10.append(aVar.z(true));
                throw new r(p10.toString());
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                Character ch2 = (Character) obj;
                bVar.W(ch2 == null ? null : String.valueOf(ch2));
            }
        });
        x xVar2 = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$15
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                int i02 = aVar.i0();
                if (i02 != 9) {
                    return i02 == 8 ? Boolean.toString(aVar.N()) : aVar.f0();
                }
                aVar.c0();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                bVar.W((String) obj);
            }
        };
        f6299m = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$16
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() == 9) {
                    aVar.c0();
                    return null;
                }
                String f02 = aVar.f0();
                try {
                    return com.google.gson.internal.e.i(f02);
                } catch (NumberFormatException e7) {
                    StringBuilder p10 = d9.e.p("Failed parsing '", f02, "' as BigDecimal; at path ");
                    p10.append(aVar.z(true));
                    throw new r(p10.toString(), e7);
                }
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                bVar.U((BigDecimal) obj);
            }
        };
        f6300n = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$17
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() == 9) {
                    aVar.c0();
                    return null;
                }
                String f02 = aVar.f0();
                try {
                    com.google.gson.internal.e.d(f02);
                    return new BigInteger(f02);
                } catch (NumberFormatException e7) {
                    StringBuilder p10 = d9.e.p("Failed parsing '", f02, "' as BigInteger; at path ");
                    p10.append(aVar.z(true));
                    throw new r(p10.toString(), e7);
                }
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                bVar.U((BigInteger) obj);
            }
        };
        f6301o = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$18
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() != 9) {
                    return new g(aVar.f0());
                }
                aVar.c0();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                bVar.U((g) obj);
            }
        };
        f6302p = new TypeAdapters$29(String.class, xVar2);
        q = new TypeAdapters$29(StringBuilder.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$19
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() != 9) {
                    return new StringBuilder(aVar.f0());
                }
                aVar.c0();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                StringBuilder sb2 = (StringBuilder) obj;
                bVar.W(sb2 == null ? null : sb2.toString());
            }
        });
        f6303r = new TypeAdapters$29(StringBuffer.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$20
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() != 9) {
                    return new StringBuffer(aVar.f0());
                }
                aVar.c0();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                StringBuffer stringBuffer = (StringBuffer) obj;
                bVar.W(stringBuffer == null ? null : stringBuffer.toString());
            }
        });
        f6304s = new TypeAdapters$29(URL.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$21
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() == 9) {
                    aVar.c0();
                    return null;
                }
                String f02 = aVar.f0();
                if (f02.equals("null")) {
                    return null;
                }
                return new URL(f02);
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                URL url = (URL) obj;
                bVar.W(url == null ? null : url.toExternalForm());
            }
        });
        f6305t = new TypeAdapters$29(URI.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$22
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() == 9) {
                    aVar.c0();
                    return null;
                }
                try {
                    String f02 = aVar.f0();
                    if (f02.equals("null")) {
                        return null;
                    }
                    return new URI(f02);
                } catch (URISyntaxException e7) {
                    throw new m(e7);
                }
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                URI uri = (URI) obj;
                bVar.W(uri == null ? null : uri.toASCIIString());
            }
        });
        final x xVar3 = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$23
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() != 9) {
                    return InetAddress.getByName(aVar.f0());
                }
                aVar.c0();
                return null;
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                InetAddress inetAddress = (InetAddress) obj;
                bVar.W(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        f6306u = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // com.google.gson.y
            public final x a(j jVar, TypeToken typeToken) {
                final Class<?> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return new x() { // from class: com.google.gson.internal.bind.TypeAdapters$32.1
                        @Override // com.google.gson.x
                        public final Object b(r9.a aVar) {
                            Object b10 = xVar3.b(aVar);
                            if (b10 != null) {
                                Class cls2 = rawType;
                                if (!cls2.isInstance(b10)) {
                                    throw new r("Expected a " + cls2.getName() + " but was " + b10.getClass().getName() + "; at path " + aVar.z(true));
                                }
                            }
                            return b10;
                        }

                        @Override // com.google.gson.x
                        public final void c(r9.b bVar, Object obj) {
                            xVar3.c(bVar, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + xVar3 + "]";
            }
        };
        f6307v = new TypeAdapters$29(UUID.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$24
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() == 9) {
                    aVar.c0();
                    return null;
                }
                String f02 = aVar.f0();
                try {
                    return UUID.fromString(f02);
                } catch (IllegalArgumentException e7) {
                    StringBuilder p10 = d9.e.p("Failed parsing '", f02, "' as UUID; at path ");
                    p10.append(aVar.z(true));
                    throw new r(p10.toString(), e7);
                }
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                UUID uuid = (UUID) obj;
                bVar.W(uuid == null ? null : uuid.toString());
            }
        });
        f6308w = new TypeAdapters$29(Currency.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$25
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                String f02 = aVar.f0();
                try {
                    return Currency.getInstance(f02);
                } catch (IllegalArgumentException e7) {
                    StringBuilder p10 = d9.e.p("Failed parsing '", f02, "' as Currency; at path ");
                    p10.append(aVar.z(true));
                    throw new r(p10.toString(), e7);
                }
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                bVar.W(((Currency) obj).getCurrencyCode());
            }
        }.a());
        final x xVar4 = new x() { // from class: com.google.gson.internal.bind.TypeAdapters$26
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x0044, code lost:
            
                if (r1.equals("month") == false) goto L11;
             */
            @Override // com.google.gson.x
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(r9.a aVar) {
                if (aVar.i0() == 9) {
                    aVar.c0();
                    return null;
                }
                aVar.k();
                int i5 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    char c2 = 4;
                    if (aVar.i0() == 4) {
                        aVar.w();
                        return new GregorianCalendar(i5, i10, i11, i12, i13, i14);
                    }
                    String W = aVar.W();
                    int R = aVar.R();
                    W.getClass();
                    switch (W.hashCode()) {
                        case -1181204563:
                            if (W.equals("dayOfMonth")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1074026988:
                            if (W.equals("minute")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -906279820:
                            if (W.equals("second")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3704893:
                            if (W.equals("year")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 104080000:
                            break;
                        case 985252545:
                            if (W.equals("hourOfDay")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            i11 = R;
                            break;
                        case 1:
                            i13 = R;
                            break;
                        case 2:
                            i14 = R;
                            break;
                        case 3:
                            i5 = R;
                            break;
                        case 4:
                            i10 = R;
                            break;
                        case 5:
                            i12 = R;
                            break;
                    }
                }
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                if (((Calendar) obj) == null) {
                    bVar.C();
                    return;
                }
                bVar.n();
                bVar.y("year");
                bVar.R(r4.get(1));
                bVar.y("month");
                bVar.R(r4.get(2));
                bVar.y("dayOfMonth");
                bVar.R(r4.get(5));
                bVar.y("hourOfDay");
                bVar.R(r4.get(11));
                bVar.y("minute");
                bVar.R(r4.get(12));
                bVar.y("second");
                bVar.R(r4.get(13));
                bVar.w();
            }
        };
        f6309x = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$31
            @Override // com.google.gson.y
            public final x a(j jVar, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return x.this;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + x.this + "]";
            }
        };
        f6310y = new TypeAdapters$29(Locale.class, new x() { // from class: com.google.gson.internal.bind.TypeAdapters$27
            @Override // com.google.gson.x
            public final Object b(r9.a aVar) {
                if (aVar.i0() == 9) {
                    aVar.c0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.f0(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.x
            public final void c(r9.b bVar, Object obj) {
                Locale locale = (Locale) obj;
                bVar.W(locale == null ? null : locale.toString());
            }
        });
        final JsonElementTypeAdapter jsonElementTypeAdapter = JsonElementTypeAdapter.f6241a;
        f6311z = jsonElementTypeAdapter;
        final Class<l> cls2 = l.class;
        A = new y() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // com.google.gson.y
            public final x a(j jVar, TypeToken typeToken) {
                final Class rawType = typeToken.getRawType();
                if (cls2.isAssignableFrom(rawType)) {
                    return new x() { // from class: com.google.gson.internal.bind.TypeAdapters$32.1
                        @Override // com.google.gson.x
                        public final Object b(r9.a aVar) {
                            Object b10 = jsonElementTypeAdapter.b(aVar);
                            if (b10 != null) {
                                Class cls22 = rawType;
                                if (!cls22.isInstance(b10)) {
                                    throw new r("Expected a " + cls22.getName() + " but was " + b10.getClass().getName() + "; at path " + aVar.z(true));
                                }
                            }
                            return b10;
                        }

                        @Override // com.google.gson.x
                        public final void c(r9.b bVar, Object obj) {
                            jsonElementTypeAdapter.c(bVar, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + jsonElementTypeAdapter + "]";
            }
        };
        B = EnumTypeAdapter.f6234d;
    }

    public static y a(Class cls, x xVar) {
        return new TypeAdapters$29(cls, xVar);
    }

    public static y b(Class cls, Class cls2, x xVar) {
        return new TypeAdapters$30(cls, cls2, xVar);
    }
}
