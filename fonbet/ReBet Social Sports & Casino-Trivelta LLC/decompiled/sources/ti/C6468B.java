package ti;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ti.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6468B {

    /* renamed from: g, reason: collision with root package name */
    public static final a f65834g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public int f65835a;

    /* renamed from: b, reason: collision with root package name */
    public int f65836b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65837c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f65838d;

    @JvmField
    @NotNull
    public final byte[] data;

    /* renamed from: e, reason: collision with root package name */
    public C6468B f65839e;

    /* renamed from: f, reason: collision with root package name */
    public C6468B f65840f;

    /* renamed from: ti.B$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C6468B() {
        this.data = new byte[8192];
        this.f65838d = true;
        this.f65837c = false;
    }

    public final void a() {
        int i10;
        C6468B c6468b = this.f65840f;
        if (c6468b == this) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.checkNotNull(c6468b);
        if (c6468b.f65838d) {
            int i11 = this.f65836b - this.f65835a;
            C6468B c6468b2 = this.f65840f;
            Intrinsics.checkNotNull(c6468b2);
            int i12 = 8192 - c6468b2.f65836b;
            C6468B c6468b3 = this.f65840f;
            Intrinsics.checkNotNull(c6468b3);
            if (c6468b3.f65837c) {
                i10 = 0;
            } else {
                C6468B c6468b4 = this.f65840f;
                Intrinsics.checkNotNull(c6468b4);
                i10 = c6468b4.f65835a;
            }
            if (i11 > i12 + i10) {
                return;
            }
            C6468B c6468b5 = this.f65840f;
            Intrinsics.checkNotNull(c6468b5);
            g(c6468b5, i11);
            b();
            C6469C.b(this);
        }
    }

    public final C6468B b() {
        C6468B c6468b = this.f65839e;
        if (c6468b == this) {
            c6468b = null;
        }
        C6468B c6468b2 = this.f65840f;
        Intrinsics.checkNotNull(c6468b2);
        c6468b2.f65839e = this.f65839e;
        C6468B c6468b3 = this.f65839e;
        Intrinsics.checkNotNull(c6468b3);
        c6468b3.f65840f = this.f65840f;
        this.f65839e = null;
        this.f65840f = null;
        return c6468b;
    }

    public final C6468B c(C6468B segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f65840f = this;
        segment.f65839e = this.f65839e;
        C6468B c6468b = this.f65839e;
        Intrinsics.checkNotNull(c6468b);
        c6468b.f65840f = segment;
        this.f65839e = segment;
        return segment;
    }

    public final C6468B d() {
        this.f65837c = true;
        return new C6468B(this.data, this.f65835a, this.f65836b, true, false);
    }

    public final C6468B e(int i10) {
        C6468B c10;
        if (i10 <= 0 || i10 > this.f65836b - this.f65835a) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            c10 = d();
        } else {
            c10 = C6469C.c();
            byte[] bArr = this.data;
            byte[] bArr2 = c10.data;
            int i11 = this.f65835a;
            ArraysKt.copyInto$default(bArr, bArr2, 0, i11, i11 + i10, 2, (Object) null);
        }
        c10.f65836b = c10.f65835a + i10;
        this.f65835a += i10;
        C6468B c6468b = this.f65840f;
        Intrinsics.checkNotNull(c6468b);
        c6468b.c(c10);
        return c10;
    }

    public final C6468B f() {
        byte[] bArr = this.data;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return new C6468B(copyOf, this.f65835a, this.f65836b, false, true);
    }

    public final void g(C6468B sink, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f65838d) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f65836b;
        if (i11 + i10 > 8192) {
            if (sink.f65837c) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f65835a;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            ArraysKt.copyInto$default(bArr, bArr, 0, i12, i11, 2, (Object) null);
            sink.f65836b -= sink.f65835a;
            sink.f65835a = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i13 = sink.f65836b;
        int i14 = this.f65835a;
        ArraysKt.copyInto(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f65836b += i10;
        this.f65835a += i10;
    }

    public C6468B(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.f65835a = i10;
        this.f65836b = i11;
        this.f65837c = z10;
        this.f65838d = z11;
    }
}
