package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;

/* loaded from: classes.dex */
public abstract class x implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    protected int f60470a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    protected int[] f60471b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    protected String[] f60472c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    protected int[] f60473d;

    /* renamed from: e, reason: collision with root package name */
    protected String f60474e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f60475f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f60476g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f60477h;

    /* renamed from: i, reason: collision with root package name */
    protected int f60478i;

    public /* synthetic */ x(int i11) {
        this();
    }

    public void B(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length() == 0) {
            value = null;
        }
        this.f60474e = value;
    }

    public final void I(boolean z11) {
        this.f60476g = z11;
    }

    @NotNull
    public abstract x L(double d11) throws IOException;

    @NotNull
    public abstract x O(long j11) throws IOException;

    @NotNull
    public abstract x Q(Number number) throws IOException;

    @NotNull
    public abstract x R(String str) throws IOException;

    @NotNull
    public abstract x W(boolean z11) throws IOException;

    @NotNull
    public final void X(@NotNull C9681g source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f60477h) {
            throw new IllegalStateException(("BufferedSource cannot be used as a map key in JSON at path " + r()).toString());
        }
        sf.F Z11 = Z();
        try {
            source.o1(Z11);
            Z11.close();
        } finally {
        }
    }

    @NotNull
    public abstract sf.F Z() throws IOException;

    @NotNull
    public abstract x c() throws IOException;

    public final int d() {
        int y11 = y();
        if (y11 != 5 && y11 != 3 && y11 != 2 && y11 != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i11 = this.f60478i;
        this.f60478i = this.f60470a;
        return i11;
    }

    @NotNull
    public abstract x j() throws IOException;

    protected final void k() {
        int i11 = this.f60470a;
        int[] iArr = this.f60471b;
        if (i11 != iArr.length) {
            return;
        }
        if (i11 == 256) {
            throw new k("Nesting too deep at " + r() + ": circular reference?");
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        this.f60471b = copyOf;
        String[] strArr = this.f60472c;
        Object[] copyOf2 = Arrays.copyOf(strArr, strArr.length * 2);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        this.f60472c = (String[]) copyOf2;
        int[] iArr2 = this.f60473d;
        int[] copyOf3 = Arrays.copyOf(iArr2, iArr2.length * 2);
        Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(this, newSize)");
        this.f60473d = copyOf3;
        if (this instanceof w) {
            w wVar = (w) this;
            Object[] copyOf4 = Arrays.copyOf(wVar.l0(), wVar.l0().length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf4, "copyOf(this, newSize)");
            wVar.r0(copyOf4);
        }
    }

    @NotNull
    public abstract x m() throws IOException;

    public final void o(int i11) {
        this.f60478i = i11;
    }

    @NotNull
    public abstract x p() throws IOException;

    @NotNull
    public String q() {
        String str = this.f60474e;
        return str == null ? "" : str;
    }

    @NotNull
    public final String r() {
        return o.a(this.f60470a, this.f60471b, this.f60472c, this.f60473d);
    }

    public final boolean s() {
        return this.f60476g;
    }

    public final void setLenient(boolean z11) {
        this.f60475f = z11;
    }

    public final boolean t() {
        return this.f60475f;
    }

    @NotNull
    public final void v(Object obj) throws IOException {
        if (obj instanceof Map) {
            j();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key == null) {
                    throw new IllegalArgumentException("Map keys must be non-null");
                }
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException("Map keys must be of type String: ".concat(key.getClass().getName()).toString());
                }
                w((String) key);
                v(value);
            }
            p();
            return;
        }
        if (obj instanceof List) {
            c();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                v(it.next());
            }
            m();
            return;
        }
        if (obj instanceof String) {
            R((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            W(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Double) {
            L(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            O(((Number) obj).longValue());
        } else if (obj instanceof Number) {
            Q((Number) obj);
        } else {
            if (obj != null) {
                throw new IllegalArgumentException("Unsupported type: ".concat(obj.getClass().getName()));
            }
            x();
        }
    }

    @NotNull
    public abstract x w(@NotNull String str) throws IOException;

    @NotNull
    public abstract x x() throws IOException;

    protected final int y() {
        int i11 = this.f60470a;
        if (i11 != 0) {
            return this.f60471b[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    protected final void z(int i11) {
        int[] iArr = this.f60471b;
        int i12 = this.f60470a;
        this.f60470a = i12 + 1;
        iArr[i12] = i11;
    }

    private x() {
        this.f60471b = new int[32];
        this.f60472c = new String[32];
        this.f60473d = new int[32];
        this.f60478i = -1;
    }
}
