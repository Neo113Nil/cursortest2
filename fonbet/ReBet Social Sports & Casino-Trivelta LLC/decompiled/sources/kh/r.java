package kh;

import com.plaid.internal.EnumC3631g;
import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lh.C5466a;

/* loaded from: classes3.dex */
public abstract class r implements Appendable, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final mh.f f54511a;

    /* renamed from: b, reason: collision with root package name */
    public C5466a f54512b;

    /* renamed from: c, reason: collision with root package name */
    public C5466a f54513c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f54514d;

    /* renamed from: e, reason: collision with root package name */
    public int f54515e;

    /* renamed from: f, reason: collision with root package name */
    public int f54516f;

    /* renamed from: g, reason: collision with root package name */
    public int f54517g;

    /* renamed from: h, reason: collision with root package name */
    public int f54518h;

    public r(mh.f pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.f54511a = pool;
        this.f54514d = ih.c.f49149a.a();
    }

    public abstract void A0();

    /* renamed from: B */
    public r append(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            return append("null", i10, i11);
        }
        u.h(this, charSequence, i10, i11, Charsets.UTF_8);
        return this;
    }

    public abstract void D0(ByteBuffer byteBuffer, int i10, int i11);

    public final void J(C5466a c5466a, C5466a c5466a2, int i10) {
        C5466a c5466a3 = this.f54513c;
        if (c5466a3 == null) {
            this.f54512b = c5466a;
            this.f54518h = 0;
        } else {
            c5466a3.D(c5466a);
            int i11 = this.f54515e;
            c5466a3.b(i11);
            this.f54518h += i11 - this.f54517g;
        }
        this.f54513c = c5466a2;
        this.f54518h += i10;
        this.f54514d = c5466a2.g();
        this.f54515e = c5466a2.j();
        this.f54517g = c5466a2.h();
        this.f54516f = c5466a2.f();
    }

    public final ByteBuffer T1() {
        return this.f54514d;
    }

    public final void U(char c10) {
        int i10 = 3;
        C5466a a22 = a2(3);
        try {
            ByteBuffer g10 = a22.g();
            int j10 = a22.j();
            if (c10 >= 0 && c10 < 128) {
                g10.put(j10, (byte) c10);
                i10 = 1;
            } else if (128 <= c10 && c10 < 2048) {
                g10.put(j10, (byte) (((c10 >> 6) & 31) | 192));
                g10.put(j10 + 1, (byte) ((c10 & '?') | 128));
                i10 = 2;
            } else if (2048 <= c10 && c10 < 0) {
                g10.put(j10, (byte) (((c10 >> '\f') & 15) | EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE));
                g10.put(j10 + 1, (byte) (((c10 >> 6) & 63) | 128));
                g10.put(j10 + 2, (byte) ((c10 & '?') | 128));
            } else {
                if (0 > c10 || c10 >= 0) {
                    lh.d.j(c10);
                    throw new KotlinNothingValueException();
                }
                g10.put(j10, (byte) (((c10 >> 18) & 7) | EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                g10.put(j10 + 1, (byte) (((c10 >> '\f') & 63) | 128));
                g10.put(j10 + 2, (byte) (((c10 >> 6) & 63) | 128));
                g10.put(j10 + 3, (byte) ((c10 & '?') | 128));
                i10 = 4;
            }
            a22.a(i10);
            d();
        } catch (Throwable th2) {
            d();
            throw th2;
        }
    }

    public final int Y1() {
        return this.f54515e;
    }

    public final int Z1() {
        return this.f54518h + (this.f54515e - this.f54517g);
    }

    public final C5466a a2(int i10) {
        C5466a c5466a;
        if (y1() - Y1() < i10 || (c5466a = this.f54513c) == null) {
            return w0();
        }
        c5466a.b(this.f54515e);
        return c5466a;
    }

    public final void b2() {
        close();
    }

    public final void c2(int i10) {
        this.f54515e = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } finally {
            A0();
        }
    }

    public final void d() {
        C5466a c5466a = this.f54513c;
        if (c5466a != null) {
            this.f54515e = c5466a.j();
        }
    }

    public final C5466a d2() {
        C5466a c5466a = this.f54512b;
        if (c5466a == null) {
            return null;
        }
        C5466a c5466a2 = this.f54513c;
        if (c5466a2 != null) {
            c5466a2.b(this.f54515e);
        }
        this.f54512b = null;
        this.f54513c = null;
        this.f54515e = 0;
        this.f54516f = 0;
        this.f54517g = 0;
        this.f54518h = 0;
        this.f54514d = ih.c.f49149a.a();
        return c5466a;
    }

    public final void flush() {
        m1();
    }

    public r k(char c10) {
        int i10 = this.f54515e;
        int i11 = 3;
        if (this.f54516f - i10 < 3) {
            U(c10);
            return this;
        }
        ByteBuffer byteBuffer = this.f54514d;
        if (c10 >= 0 && c10 < 128) {
            byteBuffer.put(i10, (byte) c10);
            i11 = 1;
        } else if (128 <= c10 && c10 < 2048) {
            byteBuffer.put(i10, (byte) (((c10 >> 6) & 31) | 192));
            byteBuffer.put(i10 + 1, (byte) ((c10 & '?') | 128));
            i11 = 2;
        } else if (2048 <= c10 && c10 < 0) {
            byteBuffer.put(i10, (byte) (((c10 >> '\f') & 15) | EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE));
            byteBuffer.put(i10 + 1, (byte) (((c10 >> 6) & 63) | 128));
            byteBuffer.put(i10 + 2, (byte) ((c10 & '?') | 128));
        } else {
            if (0 > c10 || c10 >= 0) {
                lh.d.j(c10);
                throw new KotlinNothingValueException();
            }
            byteBuffer.put(i10, (byte) (((c10 >> 18) & 7) | EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
            byteBuffer.put(i10 + 1, (byte) (((c10 >> '\f') & 63) | 128));
            byteBuffer.put(i10 + 2, (byte) (((c10 >> 6) & 63) | 128));
            byteBuffer.put(i10 + 3, (byte) ((c10 & '?') | 128));
            i11 = 4;
        }
        this.f54515e = i10 + i11;
        return this;
    }

    public final void m1() {
        C5466a d22 = d2();
        if (d22 == null) {
            return;
        }
        C5466a c5466a = d22;
        do {
            try {
                D0(c5466a.g(), c5466a.h(), c5466a.j() - c5466a.h());
                c5466a = c5466a.y();
            } finally {
                h.b(d22, this.f54511a);
            }
        } while (c5466a != null);
    }

    public final mh.f n1() {
        return this.f54511a;
    }

    public r r(CharSequence charSequence) {
        if (charSequence == null) {
            append("null", 0, 4);
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    public final C5466a w0() {
        C5466a c5466a = (C5466a) this.f54511a.V0();
        c5466a.o(8);
        z0(c5466a);
        return c5466a;
    }

    public final int y1() {
        return this.f54516f;
    }

    public final void z0(C5466a buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.y() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        J(buffer, buffer, 0);
    }
}
