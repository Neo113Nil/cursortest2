package com.squareup.moshi;

import com.squareup.moshi.q;
import g.C6594f;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9674B;
import sf.C9681g;
import sf.C9684j;
import sf.InterfaceC9683i;

/* loaded from: classes.dex */
public abstract class n implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    protected int f60420a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    protected int[] f60421b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    protected String[] f60422c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    protected int[] f60423d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f60424e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f60425f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String[] f60426a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C9674B f60427b;

        /* renamed from: com.squareup.moshi.n$a$a, reason: collision with other inner class name */
        public static final class C0918a {
            @NotNull
            public static a a(@NotNull String... strings) {
                Intrinsics.checkNotNullParameter(strings, "strings");
                try {
                    C9681g c9681g = new C9681g();
                    int length = strings.length;
                    C9684j[] c9684jArr = new C9684j[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        int i12 = q.f60442n;
                        q.a.a(c9681g, strings[i11]);
                        c9681g.readByte();
                        c9684jArr[i11] = c9681g.v0();
                    }
                    String[] strArr = (String[]) strings.clone();
                    int i13 = C9674B.f98649d;
                    return new a(strArr, C9674B.a.b((C9684j[]) Arrays.copyOf(c9684jArr, length)));
                } catch (IOException e11) {
                    throw new AssertionError(e11);
                }
            }
        }

        public a(String[] strArr, C9674B c9674b) {
            this.f60426a = strArr;
            this.f60427b = c9674b;
        }

        @NotNull
        public final C9674B a() {
            return this.f60427b;
        }

        @NotNull
        public final String[] b() {
            return this.f60426a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BEGIN_ARRAY;
        public static final b BEGIN_OBJECT;
        public static final b BOOLEAN;
        public static final b END_ARRAY;
        public static final b END_DOCUMENT;
        public static final b END_OBJECT;
        public static final b NAME;
        public static final b NULL;
        public static final b NUMBER;
        public static final b STRING;

        static {
            b bVar = new b("BEGIN_ARRAY", 0);
            BEGIN_ARRAY = bVar;
            b bVar2 = new b("END_ARRAY", 1);
            END_ARRAY = bVar2;
            b bVar3 = new b("BEGIN_OBJECT", 2);
            BEGIN_OBJECT = bVar3;
            b bVar4 = new b("END_OBJECT", 3);
            END_OBJECT = bVar4;
            b bVar5 = new b("NAME", 4);
            NAME = bVar5;
            b bVar6 = new b("STRING", 5);
            STRING = bVar6;
            b bVar7 = new b("NUMBER", 6);
            NUMBER = bVar7;
            b bVar8 = new b("BOOLEAN", 7);
            BOOLEAN = bVar8;
            b bVar9 = new b("NULL", 8);
            NULL = bVar9;
            b bVar10 = new b("END_DOCUMENT", 9);
            END_DOCUMENT = bVar10;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60428a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.BEGIN_ARRAY.ordinal()] = 1;
            iArr[b.BEGIN_OBJECT.ordinal()] = 2;
            iArr[b.STRING.ordinal()] = 3;
            iArr[b.NUMBER.ordinal()] = 4;
            iArr[b.BOOLEAN.ordinal()] = 5;
            iArr[b.NULL.ordinal()] = 6;
            f60428a = iArr;
        }
    }

    public /* synthetic */ n(int i11) {
        this();
    }

    public abstract void beginArray() throws IOException;

    public abstract void beginObject() throws IOException;

    public final boolean c() {
        return this.f60425f;
    }

    @NotNull
    public final String d() {
        return o.a(this.f60420a, this.f60421b, this.f60422c, this.f60423d);
    }

    public abstract void endArray() throws IOException;

    public abstract void endObject() throws IOException;

    public abstract boolean hasNext() throws IOException;

    public final boolean j() {
        return this.f60424e;
    }

    public abstract boolean k() throws IOException;

    public abstract void m() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract long nextLong() throws IOException;

    @NotNull
    public abstract String nextName() throws IOException;

    @NotNull
    public abstract String nextString() throws IOException;

    @NotNull
    public abstract InterfaceC9683i o() throws IOException;

    @NotNull
    public abstract b p() throws IOException;

    @NotNull
    public abstract n q();

    public abstract void r() throws IOException;

    protected final void s(int i11) {
        int i12 = this.f60420a;
        int[] iArr = this.f60421b;
        if (i12 == iArr.length) {
            if (i12 == 256) {
                throw new k("Nesting too deep at " + d());
            }
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
        }
        int[] iArr3 = this.f60421b;
        int i13 = this.f60420a;
        this.f60420a = i13 + 1;
        iArr3[i13] = i11;
    }

    public final void setLenient(boolean z11) {
        this.f60424e = z11;
    }

    public abstract void skipValue() throws IOException;

    public final Object t() throws IOException {
        switch (c.f60428a[p().ordinal()]) {
            case 1:
                Tc.b builder = C7714v.B();
                beginArray();
                while (hasNext()) {
                    builder.add(t());
                }
                endArray();
                Intrinsics.checkNotNullParameter(builder, "builder");
                return builder.B();
            case 2:
                Tc.d builder2 = new Tc.d();
                beginObject();
                while (hasNext()) {
                    String nextName = nextName();
                    Object t2 = t();
                    Object put = builder2.put(nextName, t2);
                    if (put != null) {
                        StringBuilder b11 = C6594f.b("Map key '", nextName, "' has multiple values at path ");
                        b11.append(d());
                        b11.append(": ");
                        b11.append(put);
                        b11.append(" and ");
                        b11.append(t2);
                        throw new k(b11.toString());
                    }
                }
                endObject();
                Intrinsics.checkNotNullParameter(builder2, "builder");
                return builder2.u();
            case 3:
                return nextString();
            case 4:
                return Double.valueOf(nextDouble());
            case 5:
                return Boolean.valueOf(k());
            case 6:
                m();
                return null;
            default:
                throw new IllegalStateException("Expected a value but was " + p() + " at path " + d());
        }
    }

    public abstract int v(@NotNull a aVar) throws IOException;

    public abstract int w(@NotNull a aVar) throws IOException;

    public final void x(boolean z11) {
        this.f60425f = z11;
    }

    public abstract void y() throws IOException;

    @NotNull
    protected final k z(Object obj, @NotNull Object expected) {
        Intrinsics.checkNotNullParameter(expected, "expected");
        if (obj == null) {
            return new k("Expected " + expected + " but was null at path " + d());
        }
        return new k("Expected " + expected + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + d());
    }

    private n() {
        this.f60421b = new int[32];
        this.f60422c = new String[32];
        this.f60423d = new int[32];
    }

    public n(n nVar) {
        this.f60420a = nVar.f60420a;
        this.f60421b = (int[]) nVar.f60421b.clone();
        this.f60422c = (String[]) nVar.f60422c.clone();
        this.f60423d = (int[]) nVar.f60423d.clone();
        this.f60424e = nVar.f60424e;
        this.f60425f = nVar.f60425f;
    }
}
