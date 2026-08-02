package com.google.gson.internal.bind;

import Gb.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public abstract class TypeAdapters {

    /* renamed from: A, reason: collision with root package name */
    public static final TypeAdapter f38183A;

    /* renamed from: B, reason: collision with root package name */
    public static final TypeAdapter f38184B;

    /* renamed from: C, reason: collision with root package name */
    public static final v f38185C;

    /* renamed from: D, reason: collision with root package name */
    public static final TypeAdapter f38186D;

    /* renamed from: E, reason: collision with root package name */
    public static final v f38187E;

    /* renamed from: F, reason: collision with root package name */
    public static final TypeAdapter f38188F;

    /* renamed from: G, reason: collision with root package name */
    public static final v f38189G;

    /* renamed from: H, reason: collision with root package name */
    public static final TypeAdapter f38190H;

    /* renamed from: I, reason: collision with root package name */
    public static final v f38191I;

    /* renamed from: J, reason: collision with root package name */
    public static final TypeAdapter f38192J;

    /* renamed from: K, reason: collision with root package name */
    public static final v f38193K;

    /* renamed from: L, reason: collision with root package name */
    public static final TypeAdapter f38194L;

    /* renamed from: M, reason: collision with root package name */
    public static final v f38195M;

    /* renamed from: N, reason: collision with root package name */
    public static final TypeAdapter f38196N;

    /* renamed from: O, reason: collision with root package name */
    public static final v f38197O;

    /* renamed from: P, reason: collision with root package name */
    public static final TypeAdapter f38198P;

    /* renamed from: Q, reason: collision with root package name */
    public static final v f38199Q;

    /* renamed from: R, reason: collision with root package name */
    public static final TypeAdapter f38200R;

    /* renamed from: S, reason: collision with root package name */
    public static final v f38201S;

    /* renamed from: T, reason: collision with root package name */
    public static final TypeAdapter f38202T;

    /* renamed from: U, reason: collision with root package name */
    public static final v f38203U;

    /* renamed from: V, reason: collision with root package name */
    public static final TypeAdapter f38204V;

    /* renamed from: W, reason: collision with root package name */
    public static final v f38205W;

    /* renamed from: X, reason: collision with root package name */
    public static final v f38206X;

    /* renamed from: a, reason: collision with root package name */
    public static final TypeAdapter f38207a;

    /* renamed from: b, reason: collision with root package name */
    public static final v f38208b;

    /* renamed from: c, reason: collision with root package name */
    public static final TypeAdapter f38209c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f38210d;

    /* renamed from: e, reason: collision with root package name */
    public static final TypeAdapter f38211e;

    /* renamed from: f, reason: collision with root package name */
    public static final TypeAdapter f38212f;

    /* renamed from: g, reason: collision with root package name */
    public static final v f38213g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeAdapter f38214h;

    /* renamed from: i, reason: collision with root package name */
    public static final v f38215i;

    /* renamed from: j, reason: collision with root package name */
    public static final TypeAdapter f38216j;

    /* renamed from: k, reason: collision with root package name */
    public static final v f38217k;

    /* renamed from: l, reason: collision with root package name */
    public static final TypeAdapter f38218l;

    /* renamed from: m, reason: collision with root package name */
    public static final v f38219m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeAdapter f38220n;

    /* renamed from: o, reason: collision with root package name */
    public static final v f38221o;

    /* renamed from: p, reason: collision with root package name */
    public static final TypeAdapter f38222p;

    /* renamed from: q, reason: collision with root package name */
    public static final v f38223q;

    /* renamed from: r, reason: collision with root package name */
    public static final TypeAdapter f38224r;

    /* renamed from: s, reason: collision with root package name */
    public static final v f38225s;

    /* renamed from: t, reason: collision with root package name */
    public static final TypeAdapter f38226t;

    /* renamed from: u, reason: collision with root package name */
    public static final TypeAdapter f38227u;

    /* renamed from: v, reason: collision with root package name */
    public static final TypeAdapter f38228v;

    /* renamed from: w, reason: collision with root package name */
    public static final TypeAdapter f38229w;

    /* renamed from: x, reason: collision with root package name */
    public static final v f38230x;

    /* renamed from: y, reason: collision with root package name */
    public static final TypeAdapter f38231y;

    /* renamed from: z, reason: collision with root package name */
    public static final TypeAdapter f38232z;

    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final Map f38247a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map f38248b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final Map f38249c = new HashMap();

        public class a implements PrivilegedAction {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Class f38250a;

            public a(Class cls) {
                this.f38250a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Field[] run() {
                Field[] declaredFields = this.f38250a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public EnumTypeAdapter(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String name = r42.name();
                    String str = r42.toString();
                    c cVar = (c) field.getAnnotation(c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str2 : cVar.alternate()) {
                            this.f38247a.put(str2, r42);
                        }
                    }
                    this.f38247a.put(name, r42);
                    this.f38248b.put(str, r42);
                    this.f38249c.put(r42, name);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Enum read(Jb.a aVar) {
            if (aVar.Y1() == Jb.b.NULL) {
                aVar.n1();
                return null;
            }
            String M02 = aVar.M0();
            Enum r02 = (Enum) this.f38247a.get(M02);
            return r02 == null ? (Enum) this.f38248b.get(M02) : r02;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(Jb.c cVar, Enum r32) {
            cVar.k2(r32 == null ? null : (String) this.f38249c.get(r32));
        }
    }

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[Jb.b.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[Jb.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        TypeAdapter nullSafe = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Class read(Jb.a aVar) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.nullSafe();
        f38207a = nullSafe;
        f38208b = b(Class.class, nullSafe);
        TypeAdapter nullSafe2 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BitSet read(Jb.a aVar) {
                BitSet bitSet = new BitSet();
                aVar.p();
                Jb.b Y12 = aVar.Y1();
                int i10 = 0;
                while (Y12 != Jb.b.END_ARRAY) {
                    int i11 = a.$SwitchMap$com$google$gson$stream$JsonToken[Y12.ordinal()];
                    boolean z10 = true;
                    if (i11 == 1 || i11 == 2) {
                        int nextInt = aVar.nextInt();
                        if (nextInt == 0) {
                            z10 = false;
                        } else if (nextInt != 1) {
                            throw new q("Invalid bitset value " + nextInt + ", expected 0 or 1; at path " + aVar.U());
                        }
                    } else {
                        if (i11 != 3) {
                            throw new q("Invalid bitset value type: " + Y12 + "; at path " + aVar.l());
                        }
                        z10 = aVar.D0();
                    }
                    if (z10) {
                        bitSet.set(i10);
                    }
                    i10++;
                    Y12 = aVar.Y1();
                }
                aVar.n();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, BitSet bitSet) {
                cVar.r();
                int length = bitSet.length();
                for (int i10 = 0; i10 < length; i10++) {
                    cVar.h2(bitSet.get(i10) ? 1L : 0L);
                }
                cVar.U();
            }
        }.nullSafe();
        f38209c = nullSafe2;
        f38210d = b(BitSet.class, nullSafe2);
        TypeAdapter typeAdapter = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean read(Jb.a aVar) {
                Jb.b Y12 = aVar.Y1();
                if (Y12 != Jb.b.NULL) {
                    return Y12 == Jb.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.M0())) : Boolean.valueOf(aVar.D0());
                }
                aVar.n1();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Boolean bool) {
                cVar.i2(bool);
            }
        };
        f38211e = typeAdapter;
        f38212f = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean read(Jb.a aVar) {
                if (aVar.Y1() != Jb.b.NULL) {
                    return Boolean.valueOf(aVar.M0());
                }
                aVar.n1();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Boolean bool) {
                cVar.k2(bool == null ? "null" : bool.toString());
            }
        };
        f38213g = c(Boolean.TYPE, Boolean.class, typeAdapter);
        TypeAdapter typeAdapter2 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(Jb.a aVar) {
                if (aVar.Y1() == Jb.b.NULL) {
                    aVar.n1();
                    return null;
                }
                try {
                    int nextInt = aVar.nextInt();
                    if (nextInt <= 255 && nextInt >= -128) {
                        return Byte.valueOf((byte) nextInt);
                    }
                    throw new q("Lossy conversion from " + nextInt + " to byte; at path " + aVar.U());
                } catch (NumberFormatException e10) {
                    throw new q(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Number number) {
                if (number == null) {
                    cVar.T1();
                } else {
                    cVar.h2(number.byteValue());
                }
            }
        };
        f38214h = typeAdapter2;
        f38215i = c(Byte.TYPE, Byte.class, typeAdapter2);
        TypeAdapter typeAdapter3 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(Jb.a aVar) {
                if (aVar.Y1() == Jb.b.NULL) {
                    aVar.n1();
                    return null;
                }
                try {
                    int nextInt = aVar.nextInt();
                    if (nextInt <= 65535 && nextInt >= -32768) {
                        return Short.valueOf((short) nextInt);
                    }
                    throw new q("Lossy conversion from " + nextInt + " to short; at path " + aVar.U());
                } catch (NumberFormatException e10) {
                    throw new q(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Number number) {
                if (number == null) {
                    cVar.T1();
                } else {
                    cVar.h2(number.shortValue());
                }
            }
        };
        f38216j = typeAdapter3;
        f38217k = c(Short.TYPE, Short.class, typeAdapter3);
        TypeAdapter typeAdapter4 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(Jb.a aVar) {
                if (aVar.Y1() == Jb.b.NULL) {
                    aVar.n1();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.nextInt());
                } catch (NumberFormatException e10) {
                    throw new q(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Number number) {
                if (number == null) {
                    cVar.T1();
                } else {
                    cVar.h2(number.intValue());
                }
            }
        };
        f38218l = typeAdapter4;
        f38219m = c(Integer.TYPE, Integer.class, typeAdapter4);
        TypeAdapter nullSafe3 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicInteger read(Jb.a aVar) {
                try {
                    return new AtomicInteger(aVar.nextInt());
                } catch (NumberFormatException e10) {
                    throw new q(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, AtomicInteger atomicInteger) {
                cVar.h2(atomicInteger.get());
            }
        }.nullSafe();
        f38220n = nullSafe3;
        f38221o = b(AtomicInteger.class, nullSafe3);
        TypeAdapter nullSafe4 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicBoolean read(Jb.a aVar) {
                return new AtomicBoolean(aVar.D0());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, AtomicBoolean atomicBoolean) {
                cVar.l2(atomicBoolean.get());
            }
        }.nullSafe();
        f38222p = nullSafe4;
        f38223q = b(AtomicBoolean.class, nullSafe4);
        TypeAdapter nullSafe5 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicIntegerArray read(Jb.a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.p();
                while (aVar.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.nextInt()));
                    } catch (NumberFormatException e10) {
                        throw new q(e10);
                    }
                }
                aVar.n();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, AtomicIntegerArray atomicIntegerArray) {
                cVar.r();
                int length = atomicIntegerArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    cVar.h2(atomicIntegerArray.get(i10));
                }
                cVar.U();
            }
        }.nullSafe();
        f38224r = nullSafe5;
        f38225s = b(AtomicIntegerArray.class, nullSafe5);
        f38226t = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(Jb.a aVar) {
                if (aVar.Y1() == Jb.b.NULL) {
                    aVar.n1();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.nextLong());
                } catch (NumberFormatException e10) {
                    throw new q(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Number number) {
                if (number == null) {
                    cVar.T1();
                } else {
                    cVar.h2(number.longValue());
                }
            }
        };
        f38227u = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(Jb.a aVar) {
                if (aVar.Y1() != Jb.b.NULL) {
                    return Float.valueOf((float) aVar.nextDouble());
                }
                aVar.n1();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Number number) {
                if (number == null) {
                    cVar.T1();
                    return;
                }
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                cVar.j2(number);
            }
        };
        f38228v = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(Jb.a aVar) {
                if (aVar.Y1() != Jb.b.NULL) {
                    return Double.valueOf(aVar.nextDouble());
                }
                aVar.n1();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Number number) {
                if (number == null) {
                    cVar.T1();
                } else {
                    cVar.g2(number.doubleValue());
                }
            }
        };
        TypeAdapter typeAdapter5 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Character read(Jb.a aVar) {
                if (aVar.Y1() == Jb.b.NULL) {
                    aVar.n1();
                    return null;
                }
                String M02 = aVar.M0();
                if (M02.length() == 1) {
                    return Character.valueOf(M02.charAt(0));
                }
                throw new q("Expecting character, got: " + M02 + "; at " + aVar.U());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Character ch2) {
                cVar.k2(ch2 == null ? null : String.valueOf(ch2));
            }
        };
        f38229w = typeAdapter5;
        f38230x = c(Character.TYPE, Character.class, typeAdapter5);
        TypeAdapter typeAdapter6 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String read(Jb.a aVar) {
                Jb.b Y12 = aVar.Y1();
                if (Y12 != Jb.b.NULL) {
                    return Y12 == Jb.b.BOOLEAN ? Boolean.toString(aVar.D0()) : aVar.M0();
                }
                aVar.n1();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, String str) {
                cVar.k2(str);
            }
        };
        f38231y = typeAdapter6;
        f38232z = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BigDecimal read(Jb.a aVar) {
                if (aVar.Y1() == Jb.b.NULL) {
                    aVar.n1();
                    return null;
                }
                String M02 = aVar.M0();
                try {
                    return new BigDecimal(M02);
                } catch (NumberFormatException e10) {
                    throw new q("Failed parsing '" + M02 + "' as BigDecimal; at path " + aVar.U(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, BigDecimal bigDecimal) {
                cVar.j2(bigDecimal);
            }
        };
        f38183A = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BigInteger read(Jb.a aVar) {
                if (aVar.Y1() == Jb.b.NULL) {
                    aVar.n1();
                    return null;
                }
                String M02 = aVar.M0();
                try {
                    return new BigInteger(M02);
                } catch (NumberFormatException e10) {
                    throw new q("Failed parsing '" + M02 + "' as BigInteger; at path " + aVar.U(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, BigInteger bigInteger) {
                cVar.j2(bigInteger);
            }
        };
        f38184B = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f read(Jb.a aVar) {
                if (aVar.Y1() != Jb.b.NULL) {
                    return new f(aVar.M0());
                }
                aVar.n1();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, f fVar) {
                cVar.j2(fVar);
            }
        };
        f38185C = b(String.class, typeAdapter6);
        TypeAdapter typeAdapter7 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public StringBuilder read(Jb.a aVar) {
                if (aVar.Y1() != Jb.b.NULL) {
                    return new StringBuilder(aVar.M0());
                }
                aVar.n1();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, StringBuilder sb2) {
                cVar.k2(sb2 == null ? null : sb2.toString());
            }
        };
        f38186D = typeAdapter7;
        f38187E = b(StringBuilder.class, typeAdapter7);
        TypeAdapter typeAdapter8 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public StringBuffer read(Jb.a aVar) {
                if (aVar.Y1() != Jb.b.NULL) {
                    return new StringBuffer(aVar.M0());
                }
                aVar.n1();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, StringBuffer stringBuffer) {
                cVar.k2(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        f38188F = typeAdapter8;
        f38189G = b(StringBuffer.class, typeAdapter8);
        TypeAdapter typeAdapter9 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public URL read(Jb.a aVar) {
                if (aVar.Y1() == Jb.b.NULL) {
                    aVar.n1();
                    return null;
                }
                String M02 = aVar.M0();
                if ("null".equals(M02)) {
                    return null;
                }
                return new URL(M02);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, URL url) {
                cVar.k2(url == null ? null : url.toExternalForm());
            }
        };
        f38190H = typeAdapter9;
        f38191I = b(URL.class, typeAdapter9);
        TypeAdapter typeAdapter10 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public URI read(Jb.a aVar) {
                if (aVar.Y1() == Jb.b.NULL) {
                    aVar.n1();
                    return null;
                }
                try {
                    String M02 = aVar.M0();
                    if ("null".equals(M02)) {
                        return null;
                    }
                    return new URI(M02);
                } catch (URISyntaxException e10) {
                    throw new i(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, URI uri) {
                cVar.k2(uri == null ? null : uri.toASCIIString());
            }
        };
        f38192J = typeAdapter10;
        f38193K = b(URI.class, typeAdapter10);
        TypeAdapter typeAdapter11 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InetAddress read(Jb.a aVar) {
                if (aVar.Y1() != Jb.b.NULL) {
                    return InetAddress.getByName(aVar.M0());
                }
                aVar.n1();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, InetAddress inetAddress) {
                cVar.k2(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        f38194L = typeAdapter11;
        f38195M = e(InetAddress.class, typeAdapter11);
        TypeAdapter typeAdapter12 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public UUID read(Jb.a aVar) {
                if (aVar.Y1() == Jb.b.NULL) {
                    aVar.n1();
                    return null;
                }
                String M02 = aVar.M0();
                try {
                    return UUID.fromString(M02);
                } catch (IllegalArgumentException e10) {
                    throw new q("Failed parsing '" + M02 + "' as UUID; at path " + aVar.U(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, UUID uuid) {
                cVar.k2(uuid == null ? null : uuid.toString());
            }
        };
        f38196N = typeAdapter12;
        f38197O = b(UUID.class, typeAdapter12);
        TypeAdapter nullSafe6 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Currency read(Jb.a aVar) {
                String M02 = aVar.M0();
                try {
                    return Currency.getInstance(M02);
                } catch (IllegalArgumentException e10) {
                    throw new q("Failed parsing '" + M02 + "' as Currency; at path " + aVar.U(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Currency currency) {
                cVar.k2(currency.getCurrencyCode());
            }
        }.nullSafe();
        f38198P = nullSafe6;
        f38199Q = b(Currency.class, nullSafe6);
        TypeAdapter typeAdapter13 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Calendar read(Jb.a aVar) {
                if (aVar.Y1() == Jb.b.NULL) {
                    aVar.n1();
                    return null;
                }
                aVar.m();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (aVar.Y1() != Jb.b.END_OBJECT) {
                    String f02 = aVar.f0();
                    int nextInt = aVar.nextInt();
                    if ("year".equals(f02)) {
                        i10 = nextInt;
                    } else if ("month".equals(f02)) {
                        i11 = nextInt;
                    } else if ("dayOfMonth".equals(f02)) {
                        i12 = nextInt;
                    } else if ("hourOfDay".equals(f02)) {
                        i13 = nextInt;
                    } else if ("minute".equals(f02)) {
                        i14 = nextInt;
                    } else if ("second".equals(f02)) {
                        i15 = nextInt;
                    }
                }
                aVar.t();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Calendar calendar) {
                if (calendar == null) {
                    cVar.T1();
                    return;
                }
                cVar.B();
                cVar.n1("year");
                cVar.h2(calendar.get(1));
                cVar.n1("month");
                cVar.h2(calendar.get(2));
                cVar.n1("dayOfMonth");
                cVar.h2(calendar.get(5));
                cVar.n1("hourOfDay");
                cVar.h2(calendar.get(11));
                cVar.n1("minute");
                cVar.h2(calendar.get(12));
                cVar.n1("second");
                cVar.h2(calendar.get(13));
                cVar.w0();
            }
        };
        f38200R = typeAdapter13;
        f38201S = d(Calendar.class, GregorianCalendar.class, typeAdapter13);
        TypeAdapter typeAdapter14 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Locale read(Jb.a aVar) {
                if (aVar.Y1() == Jb.b.NULL) {
                    aVar.n1();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.M0(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, Locale locale) {
                cVar.k2(locale == null ? null : locale.toString());
            }
        };
        f38202T = typeAdapter14;
        f38203U = b(Locale.class, typeAdapter14);
        TypeAdapter typeAdapter15 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            private h b(Jb.a aVar, Jb.b bVar) {
                int i10 = a.$SwitchMap$com$google$gson$stream$JsonToken[bVar.ordinal()];
                if (i10 == 1) {
                    return new n(new f(aVar.M0()));
                }
                if (i10 == 2) {
                    return new n(aVar.M0());
                }
                if (i10 == 3) {
                    return new n(Boolean.valueOf(aVar.D0()));
                }
                if (i10 == 6) {
                    aVar.n1();
                    return j.f38328a;
                }
                throw new IllegalStateException("Unexpected token: " + bVar);
            }

            private h c(Jb.a aVar, Jb.b bVar) {
                int i10 = a.$SwitchMap$com$google$gson$stream$JsonToken[bVar.ordinal()];
                if (i10 == 4) {
                    aVar.p();
                    return new e();
                }
                if (i10 != 5) {
                    return null;
                }
                aVar.m();
                return new k();
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h read(Jb.a aVar) {
                if (aVar instanceof com.google.gson.internal.bind.a) {
                    return ((com.google.gson.internal.bind.a) aVar).j2();
                }
                Jb.b Y12 = aVar.Y1();
                h c10 = c(aVar, Y12);
                if (c10 == null) {
                    return b(aVar, Y12);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.hasNext()) {
                        String f02 = c10 instanceof k ? aVar.f0() : null;
                        Jb.b Y13 = aVar.Y1();
                        h c11 = c(aVar, Y13);
                        boolean z10 = c11 != null;
                        if (c11 == null) {
                            c11 = b(aVar, Y13);
                        }
                        if (c10 instanceof e) {
                            ((e) c10).m(c11);
                        } else {
                            ((k) c10).m(f02, c11);
                        }
                        if (z10) {
                            arrayDeque.addLast(c10);
                            c10 = c11;
                        }
                    } else {
                        if (c10 instanceof e) {
                            aVar.n();
                        } else {
                            aVar.t();
                        }
                        if (arrayDeque.isEmpty()) {
                            return c10;
                        }
                        c10 = (h) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void write(Jb.c cVar, h hVar) {
                if (hVar == null || hVar.j()) {
                    cVar.T1();
                    return;
                }
                if (hVar.l()) {
                    n f10 = hVar.f();
                    if (f10.q()) {
                        cVar.j2(f10.n());
                        return;
                    } else if (f10.o()) {
                        cVar.l2(f10.a());
                        return;
                    } else {
                        cVar.k2(f10.h());
                        return;
                    }
                }
                if (hVar.i()) {
                    cVar.r();
                    Iterator it = hVar.c().iterator();
                    while (it.hasNext()) {
                        write(cVar, (h) it.next());
                    }
                    cVar.U();
                    return;
                }
                if (!hVar.k()) {
                    throw new IllegalArgumentException("Couldn't write " + hVar.getClass());
                }
                cVar.B();
                for (Map.Entry entry : hVar.e().q()) {
                    cVar.n1((String) entry.getKey());
                    write(cVar, (h) entry.getValue());
                }
                cVar.w0();
            }
        };
        f38204V = typeAdapter15;
        f38205W = e(h.class, typeAdapter15);
        f38206X = new v() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.v
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new EnumTypeAdapter(rawType);
            }
        };
    }

    public static v a(final TypeToken typeToken, final TypeAdapter typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.v
            public TypeAdapter create(Gson gson, TypeToken typeToken2) {
                if (typeToken2.equals(TypeToken.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static v b(final Class cls, final TypeAdapter typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.v
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                if (typeToken.getRawType() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static v c(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.v
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static v d(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.v
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static v e(final Class cls, final TypeAdapter typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.v
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                final Class<?> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                        @Override // com.google.gson.TypeAdapter
                        public Object read(Jb.a aVar) {
                            Object read = typeAdapter.read(aVar);
                            if (read == null || rawType.isInstance(read)) {
                                return read;
                            }
                            throw new q("Expected a " + rawType.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.U());
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(Jb.c cVar, Object obj) {
                            typeAdapter.write(cVar, obj);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
