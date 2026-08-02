package com.squareup.moshi;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import sf.InterfaceC9682h;

/* loaded from: classes.dex */
public final class q extends x {

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String[] f60441m = new String[UserVerificationMethods.USER_VERIFY_PATTERN];

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f60442n = 0;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC9682h f60443j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private String f60444k;

    /* renamed from: l, reason: collision with root package name */
    private String f60445l;

    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void a(@NotNull InterfaceC9682h interfaceC9682h, @NotNull String value) {
            int i11;
            String str;
            Intrinsics.checkNotNullParameter(interfaceC9682h, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            String[] strArr = q.f60441m;
            interfaceC9682h.h0(34);
            int length = value.length();
            int i12 = 0;
            while (i11 < length) {
                char charAt = value.charAt(i11);
                if (charAt < 128) {
                    str = strArr[charAt];
                    i11 = str == null ? i11 + 1 : 0;
                    if (i12 < i11) {
                        interfaceC9682h.P1(i12, i11, value);
                    }
                    interfaceC9682h.h1(str);
                    i12 = i11 + 1;
                } else {
                    if (charAt == 8232) {
                        str = "\\u2028";
                    } else if (charAt == 8233) {
                        str = "\\u2029";
                    }
                    if (i12 < i11) {
                    }
                    interfaceC9682h.h1(str);
                    i12 = i11 + 1;
                }
            }
            if (i12 < length) {
                interfaceC9682h.P1(i12, length, value);
            }
            interfaceC9682h.h0(34);
        }
    }

    static {
        for (int i11 = 0; i11 < 32; i11++) {
            f60441m[i11] = V.e.b(new Object[]{Integer.valueOf(i11)}, 1, "\\u%04x", "format(format, *args)");
        }
        String[] strArr = f60441m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@NotNull InterfaceC9682h sink) {
        super(0);
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f60443j = sink;
        this.f60444k = ProductContainerDTO.RATIO_DELIMITER;
        z(6);
    }

    private final void l0() {
        int y11 = y();
        int i11 = 2;
        if (y11 != 1) {
            InterfaceC9682h interfaceC9682h = this.f60443j;
            if (y11 == 2) {
                interfaceC9682h.h0(44);
                r0();
            } else if (y11 == 4) {
                interfaceC9682h.h1(this.f60444k);
                i11 = 5;
            } else {
                if (y11 == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                if (y11 != 6) {
                    if (y11 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!t()) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                i11 = 7;
            }
        } else {
            r0();
        }
        this.f60471b[this.f60470a - 1] = i11;
    }

    private final void o0(int i11, char c11, int i12) {
        int y11 = y();
        if (y11 != i12 && y11 != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f60445l != null) {
            throw new IllegalStateException(("Dangling name: " + this.f60445l).toString());
        }
        int i13 = this.f60470a;
        int i14 = ~this.f60478i;
        if (i13 == i14) {
            this.f60478i = i14;
            return;
        }
        int i15 = i13 - 1;
        this.f60470a = i15;
        this.f60472c[i15] = null;
        int[] iArr = this.f60473d;
        int i16 = i13 - 2;
        iArr[i16] = iArr[i16] + 1;
        if (y11 == i12) {
            r0();
        }
        this.f60443j.h0(c11);
    }

    private final void r0() {
        if (this.f60474e == null) {
            return;
        }
        InterfaceC9682h interfaceC9682h = this.f60443j;
        interfaceC9682h.h0(10);
        int i11 = this.f60470a;
        for (int i12 = 1; i12 < i11; i12++) {
            interfaceC9682h.h1(super.q());
        }
    }

    private final void s0(int i11, char c11, int i12) {
        int i13;
        int i14 = this.f60470a;
        int i15 = this.f60478i;
        if (i14 == i15 && ((i13 = this.f60471b[i14 - 1]) == i11 || i13 == i12)) {
            this.f60478i = ~i15;
            return;
        }
        l0();
        k();
        z(i11);
        this.f60473d[this.f60470a - 1] = 0;
        this.f60443j.h0(c11);
    }

    private final void u0() {
        String str = this.f60445l;
        if (str != null) {
            int y11 = y();
            InterfaceC9682h interfaceC9682h = this.f60443j;
            if (y11 == 5) {
                interfaceC9682h.h0(44);
            } else if (y11 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            r0();
            this.f60471b[this.f60470a - 1] = 4;
            a.a(interfaceC9682h, str);
            this.f60445l = null;
        }
    }

    @Override // com.squareup.moshi.x
    public final void B(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        super.B(value);
        this.f60444k = value.length() > 0 ? ": " : ProductContainerDTO.RATIO_DELIMITER;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x L(double d11) {
        if (!t() && (Double.isNaN(d11) || Double.isInfinite(d11))) {
            throw new IllegalArgumentException(("Numeric values must be finite, but was " + d11).toString());
        }
        if (this.f60477h) {
            this.f60477h = false;
            w(String.valueOf(d11));
            return this;
        }
        u0();
        l0();
        this.f60443j.h1(String.valueOf(d11));
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
        u0();
        l0();
        this.f60443j.h1(String.valueOf(j11));
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
        String obj = number.toString();
        if (!t() && (Intrinsics.d(obj, "-Infinity") || Intrinsics.d(obj, "Infinity") || Intrinsics.d(obj, "NaN"))) {
            throw new IllegalArgumentException(("Numeric values must be finite, but was " + number).toString());
        }
        if (this.f60477h) {
            this.f60477h = false;
            w(obj);
            return this;
        }
        u0();
        l0();
        this.f60443j.h1(obj);
        int[] iArr = this.f60473d;
        int i11 = this.f60470a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x R(String str) {
        if (str == null) {
            x();
            return this;
        }
        if (this.f60477h) {
            this.f60477h = false;
            w(str);
            return this;
        }
        u0();
        l0();
        a.a(this.f60443j, str);
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
        u0();
        l0();
        this.f60443j.h1(z11 ? "true" : "false");
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
        u0();
        l0();
        z(9);
        return sf.z.c(new r(this));
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x c() {
        if (this.f60477h) {
            throw new IllegalStateException(("Array cannot be used as a map key in JSON at path " + r()).toString());
        }
        u0();
        s0(1, '[', 2);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f60443j.close();
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
        this.f60443j.flush();
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x j() {
        if (this.f60477h) {
            throw new IllegalStateException(("Object cannot be used as a map key in JSON at path " + r()).toString());
        }
        u0();
        s0(3, '{', 5);
        return this;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x m() {
        o0(1, ']', 2);
        return this;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x p() {
        this.f60477h = false;
        o0(3, '}', 5);
        return this;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x w(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f60470a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int y11 = y();
        if ((y11 != 3 && y11 != 5) || this.f60445l != null || this.f60477h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f60445l = name;
        this.f60472c[this.f60470a - 1] = name;
        return this;
    }

    @Override // com.squareup.moshi.x
    @NotNull
    public final x x() {
        if (this.f60477h) {
            throw new IllegalStateException(("null cannot be used as a map key in JSON at path " + r()).toString());
        }
        if (this.f60445l != null) {
            if (!s()) {
                this.f60445l = null;
                return this;
            }
            u0();
        }
        l0();
        this.f60443j.h1("null");
        int[] iArr = this.f60473d;
        int i11 = this.f60470a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }
}
