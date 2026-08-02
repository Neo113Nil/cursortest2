package com.google.gson.internal.bind;

import Jb.d;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class a extends Jb.a {

    /* renamed from: m, reason: collision with root package name */
    public static final Reader f38252m = new C0531a();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f38253n = new Object();

    /* renamed from: l, reason: collision with root package name */
    public int f38254l;
    private int[] pathIndices;
    private String[] pathNames;
    private Object[] stack;

    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    public class C0531a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[Jb.b.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[Jb.b.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[Jb.b.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public a(h hVar) {
        super(f38252m);
        this.stack = new Object[32];
        this.f38254l = 0;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        o2(hVar);
    }

    private String A0() {
        return " at path " + l();
    }

    @Override // Jb.a
    public void C() {
        int i10 = b.$SwitchMap$com$google$gson$stream$JsonToken[Y1().ordinal()];
        if (i10 == 1) {
            k2(true);
            return;
        }
        if (i10 == 2) {
            n();
            return;
        }
        if (i10 == 3) {
            t();
            return;
        }
        if (i10 != 4) {
            m2();
            int i11 = this.f38254l;
            if (i11 > 0) {
                int[] iArr = this.pathIndices;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
        }
    }

    @Override // Jb.a
    public boolean D0() {
        i2(Jb.b.BOOLEAN);
        boolean a10 = ((n) m2()).a();
        int i10 = this.f38254l;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return a10;
    }

    public final String J(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Typography.dollar);
        int i10 = 0;
        while (true) {
            int i11 = this.f38254l;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.stack;
            Object obj = objArr[i10];
            if (obj instanceof e) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.pathIndices[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof k) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.pathNames[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    @Override // Jb.a
    public String M0() {
        Jb.b Y12 = Y1();
        Jb.b bVar = Jb.b.STRING;
        if (Y12 == bVar || Y12 == Jb.b.NUMBER) {
            String h10 = ((n) m2()).h();
            int i10 = this.f38254l;
            if (i10 > 0) {
                int[] iArr = this.pathIndices;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return h10;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + Y12 + A0());
    }

    @Override // Jb.a
    public String U() {
        return J(true);
    }

    @Override // Jb.a
    public Jb.b Y1() {
        if (this.f38254l == 0) {
            return Jb.b.END_DOCUMENT;
        }
        Object l22 = l2();
        if (l22 instanceof Iterator) {
            boolean z10 = this.stack[this.f38254l - 2] instanceof k;
            Iterator it = (Iterator) l22;
            if (!it.hasNext()) {
                return z10 ? Jb.b.END_OBJECT : Jb.b.END_ARRAY;
            }
            if (z10) {
                return Jb.b.NAME;
            }
            o2(it.next());
            return Y1();
        }
        if (l22 instanceof k) {
            return Jb.b.BEGIN_OBJECT;
        }
        if (l22 instanceof e) {
            return Jb.b.BEGIN_ARRAY;
        }
        if (l22 instanceof n) {
            n nVar = (n) l22;
            if (nVar.r()) {
                return Jb.b.STRING;
            }
            if (nVar.o()) {
                return Jb.b.BOOLEAN;
            }
            if (nVar.q()) {
                return Jb.b.NUMBER;
            }
            throw new AssertionError();
        }
        if (l22 instanceof j) {
            return Jb.b.NULL;
        }
        if (l22 == f38253n) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new d("Custom JsonElement subclass " + l22.getClass().getName() + " is not supported");
    }

    @Override // Jb.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.stack = new Object[]{f38253n};
        this.f38254l = 1;
    }

    @Override // Jb.a
    public String f0() {
        return k2(false);
    }

    @Override // Jb.a
    public boolean hasNext() {
        Jb.b Y12 = Y1();
        return (Y12 == Jb.b.END_OBJECT || Y12 == Jb.b.END_ARRAY || Y12 == Jb.b.END_DOCUMENT) ? false : true;
    }

    public final void i2(Jb.b bVar) {
        if (Y1() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + Y1() + A0());
    }

    public h j2() {
        Jb.b Y12 = Y1();
        if (Y12 != Jb.b.NAME && Y12 != Jb.b.END_ARRAY && Y12 != Jb.b.END_OBJECT && Y12 != Jb.b.END_DOCUMENT) {
            h hVar = (h) l2();
            C();
            return hVar;
        }
        throw new IllegalStateException("Unexpected " + Y12 + " when reading a JsonElement.");
    }

    public final String k2(boolean z10) {
        i2(Jb.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) l2()).next();
        String str = (String) entry.getKey();
        this.pathNames[this.f38254l - 1] = z10 ? "<skipped>" : str;
        o2(entry.getValue());
        return str;
    }

    @Override // Jb.a
    public String l() {
        return J(false);
    }

    public final Object l2() {
        return this.stack[this.f38254l - 1];
    }

    @Override // Jb.a
    public void m() {
        i2(Jb.b.BEGIN_OBJECT);
        o2(((k) l2()).q().iterator());
    }

    public final Object m2() {
        Object[] objArr = this.stack;
        int i10 = this.f38254l - 1;
        this.f38254l = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    @Override // Jb.a
    public void n() {
        i2(Jb.b.END_ARRAY);
        m2();
        m2();
        int i10 = this.f38254l;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // Jb.a
    public void n1() {
        i2(Jb.b.NULL);
        m2();
        int i10 = this.f38254l;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public void n2() {
        i2(Jb.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) l2()).next();
        o2(entry.getValue());
        o2(new n((String) entry.getKey()));
    }

    @Override // Jb.a
    public double nextDouble() {
        Jb.b Y12 = Y1();
        Jb.b bVar = Jb.b.NUMBER;
        if (Y12 != bVar && Y12 != Jb.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + Y12 + A0());
        }
        double m10 = ((n) l2()).m();
        if (!w0() && (Double.isNaN(m10) || Double.isInfinite(m10))) {
            throw new d("JSON forbids NaN and infinities: " + m10);
        }
        m2();
        int i10 = this.f38254l;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return m10;
    }

    @Override // Jb.a
    public int nextInt() {
        Jb.b Y12 = Y1();
        Jb.b bVar = Jb.b.NUMBER;
        if (Y12 != bVar && Y12 != Jb.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + Y12 + A0());
        }
        int b10 = ((n) l2()).b();
        m2();
        int i10 = this.f38254l;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return b10;
    }

    @Override // Jb.a
    public long nextLong() {
        Jb.b Y12 = Y1();
        Jb.b bVar = Jb.b.NUMBER;
        if (Y12 != bVar && Y12 != Jb.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + Y12 + A0());
        }
        long g10 = ((n) l2()).g();
        m2();
        int i10 = this.f38254l;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return g10;
    }

    public final void o2(Object obj) {
        int i10 = this.f38254l;
        Object[] objArr = this.stack;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.stack = Arrays.copyOf(objArr, i11);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i11);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i11);
        }
        Object[] objArr2 = this.stack;
        int i12 = this.f38254l;
        this.f38254l = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // Jb.a
    public void p() {
        i2(Jb.b.BEGIN_ARRAY);
        o2(((e) l2()).iterator());
        this.pathIndices[this.f38254l - 1] = 0;
    }

    @Override // Jb.a
    public void t() {
        i2(Jb.b.END_OBJECT);
        this.pathNames[this.f38254l - 1] = null;
        m2();
        m2();
        int i10 = this.f38254l;
        if (i10 > 0) {
            int[] iArr = this.pathIndices;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // Jb.a
    public String toString() {
        return a.class.getSimpleName() + A0();
    }
}
