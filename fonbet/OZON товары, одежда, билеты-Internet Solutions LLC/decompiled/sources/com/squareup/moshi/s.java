package com.squareup.moshi;

import com.squareup.moshi.n;
import gd.InterfaceC6712a;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.InterfaceC9683i;

/* loaded from: classes.dex */
public final class s extends n {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private Object[] f60447g;

    public static final class a implements Iterator<Object>, Cloneable, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final n.b f60448a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Object[] f60449b;

        /* renamed from: c, reason: collision with root package name */
        private int f60450c;

        public a(@NotNull n.b endToken, @NotNull Object[] array, int i11) {
            Intrinsics.checkNotNullParameter(endToken, "endToken");
            Intrinsics.checkNotNullParameter(array, "array");
            this.f60448a = endToken;
            this.f60449b = array;
            this.f60450c = i11;
        }

        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            return new a(this.f60448a, this.f60449b, this.f60450c);
        }

        @NotNull
        public final n.b c() {
            return this.f60448a;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f60450c < this.f60449b.length;
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i11 = this.f60450c;
            this.f60450c = i11 + 1;
            return this.f60449b[i11];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public s(Object obj) {
        super(0);
        int[] iArr = this.f60421b;
        int i11 = this.f60420a;
        iArr[i11] = 7;
        Object[] objArr = new Object[32];
        this.f60447g = objArr;
        this.f60420a = i11 + 1;
        objArr[i11] = obj;
    }

    private final void B(Object obj) {
        int i11 = this.f60420a;
        if (i11 == this.f60447g.length) {
            if (i11 == 256) {
                throw new k("Nesting too deep at " + d());
            }
            int[] iArr = this.f60421b;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f60421b = copyOf;
            String[] strArr = this.f60422c;
            Object[] copyOf2 = Arrays.copyOf(strArr, strArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f60422c = (String[]) copyOf2;
            int[] iArr2 = this.f60423d;
            int[] copyOf3 = Arrays.copyOf(iArr2, iArr2.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(this, newSize)");
            this.f60423d = copyOf3;
            Object[] objArr = this.f60447g;
            Object[] copyOf4 = Arrays.copyOf(objArr, objArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf4, "copyOf(this, newSize)");
            this.f60447g = copyOf4;
        }
        Object[] objArr2 = this.f60447g;
        int i12 = this.f60420a;
        this.f60420a = i12 + 1;
        objArr2[i12] = obj;
    }

    private final void I() {
        int i11 = this.f60420a;
        int i12 = i11 - 1;
        this.f60420a = i12;
        Object[] objArr = this.f60447g;
        objArr[i12] = null;
        this.f60421b[i12] = 0;
        if (i12 > 0) {
            int[] iArr = this.f60423d;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            Object obj = objArr[i11 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    B(it.next());
                }
            }
        }
    }

    private final <T> T L(Class<T> cls, n.b bVar) {
        Object obj;
        int i11 = this.f60420a;
        Object obj2 = i11 != 0 ? this.f60447g[i11 - 1] : null;
        if (cls.isInstance(obj2)) {
            return cls.cast(obj2);
        }
        if (obj2 == null && bVar == n.b.NULL) {
            return null;
        }
        obj = t.f60451a;
        if (obj2 != obj) {
            throw z(obj2, bVar);
        }
        throw new IllegalStateException("JsonReader is closed");
    }

    @Override // com.squareup.moshi.n
    public final void beginArray() {
        List list = (List) L(List.class, n.b.BEGIN_ARRAY);
        n.b bVar = n.b.END_ARRAY;
        Object[] array = list.toArray(new Object[0]);
        Intrinsics.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        a aVar = new a(bVar, array, 0);
        Object[] objArr = this.f60447g;
        int i11 = this.f60420a;
        objArr[i11 - 1] = aVar;
        this.f60421b[i11 - 1] = 1;
        this.f60423d[i11 - 1] = 0;
        if (aVar.hasNext()) {
            B(aVar.next());
        }
    }

    @Override // com.squareup.moshi.n
    public final void beginObject() {
        Map map = (Map) L(Map.class, n.b.BEGIN_OBJECT);
        n.b bVar = n.b.END_OBJECT;
        Object[] array = map.entrySet().toArray(new Object[0]);
        Intrinsics.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        a aVar = new a(bVar, array, 0);
        Object[] objArr = this.f60447g;
        int i11 = this.f60420a;
        objArr[i11 - 1] = aVar;
        this.f60421b[i11 - 1] = 3;
        if (aVar.hasNext()) {
            B(aVar.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj;
        C7705l.x(this.f60447g, null, 0, this.f60420a);
        Object[] objArr = this.f60447g;
        obj = t.f60451a;
        objArr[0] = obj;
        this.f60421b[0] = 8;
        this.f60420a = 1;
    }

    @Override // com.squareup.moshi.n
    public final void endArray() {
        n.b bVar = n.b.END_ARRAY;
        a aVar = (a) L(a.class, bVar);
        if (aVar.c() != bVar || aVar.hasNext()) {
            throw z(aVar, bVar);
        }
        I();
    }

    @Override // com.squareup.moshi.n
    public final void endObject() {
        n.b bVar = n.b.END_OBJECT;
        a aVar = (a) L(a.class, bVar);
        if (aVar.c() != bVar || aVar.hasNext()) {
            throw z(aVar, bVar);
        }
        this.f60422c[this.f60420a - 1] = null;
        I();
    }

    @Override // com.squareup.moshi.n
    public final boolean hasNext() {
        int i11 = this.f60420a;
        if (i11 == 0) {
            return false;
        }
        Object obj = this.f60447g[i11 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // com.squareup.moshi.n
    public final boolean k() {
        boolean booleanValue = ((Boolean) L(Boolean.class, n.b.BOOLEAN)).booleanValue();
        I();
        return booleanValue;
    }

    @Override // com.squareup.moshi.n
    public final void m() {
        I();
    }

    @Override // com.squareup.moshi.n
    public final double nextDouble() {
        double parseDouble;
        n.b bVar = n.b.NUMBER;
        Object L11 = L(Object.class, bVar);
        if (L11 instanceof Number) {
            parseDouble = ((Number) L11).doubleValue();
        } else {
            if (!(L11 instanceof String)) {
                throw z(L11, bVar);
            }
            try {
                parseDouble = Double.parseDouble((String) L11);
            } catch (NumberFormatException unused) {
                throw z(L11, n.b.NUMBER);
            }
        }
        if (j() || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            I();
            return parseDouble;
        }
        StringBuilder e11 = Cm.e.e(parseDouble, "JSON forbids NaN and infinities: ", " at path ");
        e11.append(d());
        throw new l(e11.toString());
    }

    @Override // com.squareup.moshi.n
    public final int nextInt() {
        int intValueExact;
        n.b bVar = n.b.NUMBER;
        Object L11 = L(Object.class, bVar);
        if (L11 instanceof Number) {
            intValueExact = ((Number) L11).intValue();
        } else {
            if (!(L11 instanceof String)) {
                throw z(L11, bVar);
            }
            try {
                try {
                    intValueExact = Integer.parseInt((String) L11);
                } catch (NumberFormatException unused) {
                    throw z(L11, n.b.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                intValueExact = new BigDecimal((String) L11).intValueExact();
            }
        }
        I();
        return intValueExact;
    }

    @Override // com.squareup.moshi.n
    public final long nextLong() {
        long longValueExact;
        n.b bVar = n.b.NUMBER;
        Object L11 = L(Object.class, bVar);
        if (L11 instanceof Number) {
            longValueExact = ((Number) L11).longValue();
        } else {
            if (!(L11 instanceof String)) {
                throw z(L11, bVar);
            }
            try {
                try {
                    longValueExact = Long.parseLong((String) L11);
                } catch (NumberFormatException unused) {
                    throw z(L11, n.b.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                longValueExact = new BigDecimal((String) L11).longValueExact();
            }
        }
        I();
        return longValueExact;
    }

    @Override // com.squareup.moshi.n
    @NotNull
    public final String nextName() {
        n.b bVar = n.b.NAME;
        Map.Entry entry = (Map.Entry) L(Map.Entry.class, bVar);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw z(key, bVar);
        }
        String str = (String) key;
        this.f60447g[this.f60420a - 1] = entry.getValue();
        this.f60422c[this.f60420a - 2] = str;
        return str;
    }

    @Override // com.squareup.moshi.n
    @NotNull
    public final String nextString() {
        Object obj;
        int i11 = this.f60420a;
        Object obj2 = i11 != 0 ? this.f60447g[i11 - 1] : null;
        if (obj2 instanceof String) {
            I();
            return (String) obj2;
        }
        if (obj2 instanceof Number) {
            I();
            return ((Number) obj2).toString();
        }
        obj = t.f60451a;
        if (obj2 != obj) {
            throw z(obj2, n.b.STRING);
        }
        throw new IllegalStateException("JsonReader is closed");
    }

    @Override // com.squareup.moshi.n
    @NotNull
    public final InterfaceC9683i o() {
        Object t2 = t();
        C9681g sink = new C9681g();
        Intrinsics.checkNotNullParameter(sink, "sink");
        q qVar = new q(sink);
        try {
            qVar.v(t2);
            qVar.close();
            return sink;
        } finally {
        }
    }

    @Override // com.squareup.moshi.n
    @NotNull
    public final n.b p() {
        Object obj;
        int i11 = this.f60420a;
        if (i11 == 0) {
            return n.b.END_DOCUMENT;
        }
        Object obj2 = this.f60447g[i11 - 1];
        if (obj2 instanceof a) {
            return ((a) obj2).c();
        }
        if (obj2 instanceof List) {
            return n.b.BEGIN_ARRAY;
        }
        if (obj2 instanceof Map) {
            return n.b.BEGIN_OBJECT;
        }
        if (obj2 instanceof Map.Entry) {
            return n.b.NAME;
        }
        if (obj2 instanceof String) {
            return n.b.STRING;
        }
        if (obj2 instanceof Boolean) {
            return n.b.BOOLEAN;
        }
        if (obj2 instanceof Number) {
            return n.b.NUMBER;
        }
        if (obj2 == null) {
            return n.b.NULL;
        }
        obj = t.f60451a;
        if (obj2 != obj) {
            throw z(obj2, "a JSON value");
        }
        throw new IllegalStateException("JsonReader is closed");
    }

    @Override // com.squareup.moshi.n
    @NotNull
    public final n q() {
        Intrinsics.checkNotNullParameter(this, "copyFrom");
        s sVar = new s((n) this);
        sVar.f60447g = (Object[]) this.f60447g.clone();
        int i11 = sVar.f60420a;
        for (int i12 = 0; i12 < i11; i12++) {
            Object[] objArr = sVar.f60447g;
            Object obj = objArr[i12];
            if (obj instanceof a) {
                objArr[i12] = ((a) obj).clone();
            }
        }
        return sVar;
    }

    @Override // com.squareup.moshi.n
    public final void r() {
        if (hasNext()) {
            B(nextName());
        }
    }

    @Override // com.squareup.moshi.n
    public final void skipValue() {
        if (c()) {
            throw new k("Cannot skip unexpected " + p() + " at " + d());
        }
        int i11 = this.f60420a;
        if (i11 > 1) {
            this.f60422c[i11 - 2] = "null";
        }
        Object obj = i11 != 0 ? this.f60447g[i11 - 1] : null;
        if (obj instanceof a) {
            throw new k("Expected a value but was " + p() + " at path " + d());
        }
        if (obj instanceof Map.Entry) {
            Object obj2 = this.f60447g[i11 - 1];
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.collections.Map.Entry<*, *>");
            this.f60447g[this.f60420a - 1] = ((Map.Entry) obj2).getValue();
        } else {
            if (i11 > 0) {
                I();
                return;
            }
            throw new k("Expected a value but was " + p() + " at path " + d());
        }
    }

    @Override // com.squareup.moshi.n
    public final int v(@NotNull n.a options) {
        Intrinsics.checkNotNullParameter(options, "options");
        n.b bVar = n.b.NAME;
        Map.Entry entry = (Map.Entry) L(Map.Entry.class, bVar);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw z(key, bVar);
        }
        String str = (String) key;
        int length = options.b().length;
        for (int i11 = 0; i11 < length; i11++) {
            if (Intrinsics.d(options.b()[i11], str)) {
                this.f60447g[this.f60420a - 1] = entry.getValue();
                this.f60422c[this.f60420a - 2] = str;
                return i11;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.n
    public final int w(@NotNull n.a options) {
        Object obj;
        Intrinsics.checkNotNullParameter(options, "options");
        int i11 = this.f60420a;
        Object obj2 = i11 != 0 ? this.f60447g[i11 - 1] : null;
        if (!(obj2 instanceof String)) {
            obj = t.f60451a;
            if (obj2 == obj) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int length = options.b().length;
        for (int i12 = 0; i12 < length; i12++) {
            if (Intrinsics.d(options.b()[i12], obj2)) {
                I();
                return i12;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.n
    public final void y() {
        if (!c()) {
            Object value = ((Map.Entry) L(Map.Entry.class, n.b.NAME)).getValue();
            Object[] objArr = this.f60447g;
            int i11 = this.f60420a;
            objArr[i11 - 1] = value;
            this.f60422c[i11 - 2] = "null";
            return;
        }
        n.b p11 = p();
        nextName();
        throw new k("Cannot skip unexpected " + p11 + " at " + d());
    }
}
