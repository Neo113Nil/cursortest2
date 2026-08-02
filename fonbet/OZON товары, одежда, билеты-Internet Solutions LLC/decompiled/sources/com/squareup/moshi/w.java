package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;

/* loaded from: classes9.dex */
public final class w extends x {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private Object[] f60468j;

    /* renamed from: k, reason: collision with root package name */
    private String f60469k;

    public w() {
        super(0);
        this.f60468j = new Object[32];
        z(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(Object obj) {
        int y11 = y();
        int i11 = this.f60470a;
        if (i11 == 1) {
            if (y11 != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            int i12 = i11 - 1;
            this.f60471b[i12] = 7;
            this.f60468j[i12] = obj;
            return;
        }
        if (y11 != 3 || this.f60469k == null) {
            if (y11 != 1) {
                if (y11 != 9) {
                    throw new IllegalStateException("Nesting problem.");
                }
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            Object obj2 = this.f60468j[i11 - 1];
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
            U.c(obj2).add(obj);
            return;
        }
        if (obj != null || s()) {
            Object obj3 = this.f60468j[this.f60470a - 1];
            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
            Object put = U.d(obj3).put(this.f60469k, obj);
            if (put != null) {
                throw new IllegalArgumentException(("Map key '" + this.f60469k + "' has multiple values at path " + r() + ": " + put + " and " + obj).toString());
            }
        }
        this.f60469k = null;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x L(double d11) {
        if (!t() && (Double.isNaN(d11) || d11 == Double.NEGATIVE_INFINITY || d11 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException(("Numeric values must be finite, but was " + d11).toString());
        }
        if (this.f60477h) {
            this.f60477h = false;
            w(String.valueOf(d11));
            return this;
        }
        d0(Double.valueOf(d11));
        int[] iArr = this.f60473d;
        int i11 = this.f60470a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x O(long j11) {
        if (this.f60477h) {
            this.f60477h = false;
            w(String.valueOf(j11));
            return this;
        }
        d0(Long.valueOf(j11));
        int[] iArr = this.f60473d;
        int i11 = this.f60470a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x Q(Number number) {
        if (number == null) {
            x();
            return this;
        }
        if (number instanceof Byte ? true : number instanceof Short ? true : number instanceof Integer ? true : number instanceof Long) {
            O(number.longValue());
            return this;
        }
        if (number instanceof Float ? true : number instanceof Double) {
            L(number.doubleValue());
            return this;
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f60477h) {
            this.f60477h = false;
            String bigDecimal2 = bigDecimal.toString();
            Intrinsics.checkNotNullExpressionValue(bigDecimal2, "bigDecimalValue.toString()");
            w(bigDecimal2);
            return this;
        }
        d0(bigDecimal);
        int[] iArr = this.f60473d;
        int i11 = this.f60470a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x R(String str) {
        if (this.f60477h) {
            this.f60477h = false;
            Intrinsics.f(str);
            w(str);
            return this;
        }
        d0(str);
        int[] iArr = this.f60473d;
        int i11 = this.f60470a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x W(boolean z11) {
        if (this.f60477h) {
            throw new IllegalStateException(("Boolean cannot be used as a map key in JSON at path " + r()).toString());
        }
        d0(Boolean.valueOf(z11));
        int[] iArr = this.f60473d;
        int i11 = this.f60470a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final sf.F Z() {
        if (this.f60477h) {
            throw new IllegalStateException(("BufferedSink cannot be used as a map key in JSON at path " + r()).toString());
        }
        if (y() == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        z(9);
        return sf.z.c(new v(new C9681g(), this));
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x c() {
        if (this.f60477h) {
            throw new IllegalStateException(("Array cannot be used as a map key in JSON at path " + r()).toString());
        }
        int i11 = this.f60470a;
        int i12 = this.f60478i;
        if (i11 == i12 && this.f60471b[i11 - 1] == 1) {
            this.f60478i = ~i12;
            return this;
        }
        k();
        ArrayList arrayList = new ArrayList();
        d0(arrayList);
        Object[] objArr = this.f60468j;
        int i13 = this.f60470a;
        objArr[i13] = arrayList;
        this.f60473d[i13] = 0;
        z(1);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i11 = this.f60470a;
        if (i11 > 1 || (i11 == 1 && this.f60471b[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f60470a = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f60470a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x j() {
        if (this.f60477h) {
            throw new IllegalStateException(("Object cannot be used as a map key in JSON at path " + r()).toString());
        }
        int i11 = this.f60470a;
        int i12 = this.f60478i;
        if (i11 == i12 && this.f60471b[i11 - 1] == 3) {
            this.f60478i = ~i12;
            return this;
        }
        k();
        y yVar = new y(0);
        d0(yVar);
        this.f60468j[this.f60470a] = yVar;
        z(3);
        return this;
    }

    @NotNull
    public final Object[] l0() {
        return this.f60468j;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x m() {
        if (y() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i11 = this.f60470a;
        int i12 = this.f60478i;
        if (i11 == (~i12)) {
            this.f60478i = ~i12;
            return this;
        }
        int i13 = i11 - 1;
        this.f60470a = i13;
        this.f60468j[i13] = null;
        int[] iArr = this.f60473d;
        int i14 = i11 - 2;
        iArr[i14] = iArr[i14] + 1;
        return this;
    }

    public final Object o0() {
        int i11 = this.f60470a;
        if (i11 > 1 || (i11 == 1 && this.f60471b[0] != 7)) {
            throw new IllegalStateException("Incomplete document");
        }
        return this.f60468j[0];
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x p() {
        if (y() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f60469k != null) {
            throw new IllegalStateException(("Dangling name: " + this.f60469k).toString());
        }
        int i11 = this.f60470a;
        int i12 = this.f60478i;
        if (i11 == (~i12)) {
            this.f60478i = ~i12;
            return this;
        }
        this.f60477h = false;
        int i13 = i11 - 1;
        this.f60470a = i13;
        this.f60468j[i13] = null;
        this.f60472c[i13] = null;
        int[] iArr = this.f60473d;
        int i14 = i11 - 2;
        iArr[i14] = iArr[i14] + 1;
        return this;
    }

    public final void r0(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.f60468j = objArr;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x w(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f60470a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (y() != 3 || this.f60469k != null || this.f60477h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f60469k = name;
        this.f60472c[this.f60470a - 1] = name;
        return this;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x x() {
        if (this.f60477h) {
            throw new IllegalStateException(("null cannot be used as a map key in JSON at path " + r()).toString());
        }
        d0(null);
        int[] iArr = this.f60473d;
        int i11 = this.f60470a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }
}
