package kh;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh.C5466a;

/* renamed from: kh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5255a {

    /* renamed from: g, reason: collision with root package name */
    public static final C0783a f54486g = new C0783a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f54487a;

    /* renamed from: b, reason: collision with root package name */
    public int f54488b;

    /* renamed from: c, reason: collision with root package name */
    public int f54489c;

    /* renamed from: d, reason: collision with root package name */
    public int f54490d;

    /* renamed from: e, reason: collision with root package name */
    public int f54491e;

    /* renamed from: f, reason: collision with root package name */
    public final int f54492f;

    /* renamed from: kh.a$a, reason: collision with other inner class name */
    public static final class C0783a {
        public /* synthetic */ C0783a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC5255a a() {
            return C5466a.f55859j.a();
        }

        public C0783a() {
        }
    }

    public /* synthetic */ AbstractC5255a(ByteBuffer byteBuffer, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer);
    }

    public final void a(int i10) {
        int i11 = this.f54489c + i10;
        if (i10 < 0 || i11 > this.f54491e) {
            AbstractC5258d.a(i10, f() - j());
            throw new KotlinNothingValueException();
        }
        this.f54489c = i11;
    }

    public final boolean b(int i10) {
        int i11 = this.f54491e;
        int i12 = this.f54489c;
        if (i10 < i12) {
            AbstractC5258d.a(i10 - i12, f() - j());
            throw new KotlinNothingValueException();
        }
        if (i10 < i11) {
            this.f54489c = i10;
            return true;
        }
        if (i10 == i11) {
            this.f54489c = i10;
            return false;
        }
        AbstractC5258d.a(i10 - i12, f() - j());
        throw new KotlinNothingValueException();
    }

    public final void c(int i10) {
        if (i10 == 0) {
            return;
        }
        int i11 = this.f54488b + i10;
        if (i10 < 0 || i11 > this.f54489c) {
            AbstractC5258d.b(i10, j() - h());
            throw new KotlinNothingValueException();
        }
        this.f54488b = i11;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 > this.f54489c) {
            AbstractC5258d.b(i10 - this.f54488b, j() - h());
            throw new KotlinNothingValueException();
        }
        if (this.f54488b != i10) {
            this.f54488b = i10;
        }
    }

    public final int e() {
        return this.f54492f;
    }

    public final int f() {
        return this.f54491e;
    }

    public final ByteBuffer g() {
        return this.f54487a;
    }

    public final int h() {
        return this.f54488b;
    }

    public final int i() {
        return this.f54490d;
    }

    public final int j() {
        return this.f54489c;
    }

    public final byte k() {
        int i10 = this.f54488b;
        if (i10 == this.f54489c) {
            throw new EOFException("No readable bytes available.");
        }
        this.f54488b = i10 + 1;
        return this.f54487a.get(i10);
    }

    public final void l() {
        this.f54491e = this.f54492f;
    }

    public final void m() {
        n(0);
        l();
    }

    public final void n(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("newReadPosition shouldn't be negative: " + i10).toString());
        }
        if (i10 <= this.f54488b) {
            this.f54488b = i10;
            if (this.f54490d > i10) {
                this.f54490d = i10;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("newReadPosition shouldn't be ahead of the read position: " + i10 + " > " + this.f54488b).toString());
    }

    public final void o(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("endGap shouldn't be negative: " + i10).toString());
        }
        int i11 = this.f54492f - i10;
        if (i11 >= this.f54489c) {
            this.f54491e = i11;
            return;
        }
        if (i11 < 0) {
            AbstractC5258d.c(this, i10);
        }
        if (i11 < this.f54490d) {
            AbstractC5258d.e(this, i10);
        }
        if (this.f54488b != this.f54489c) {
            AbstractC5258d.d(this, i10);
            return;
        }
        this.f54491e = i11;
        this.f54488b = i11;
        this.f54489c = i11;
    }

    public final void p(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("startGap shouldn't be negative: " + i10).toString());
        }
        int i11 = this.f54488b;
        if (i11 >= i10) {
            this.f54490d = i10;
            return;
        }
        if (i11 != this.f54489c) {
            AbstractC5258d.g(this, i10);
            throw new KotlinNothingValueException();
        }
        if (i10 > this.f54491e) {
            AbstractC5258d.h(this, i10);
            throw new KotlinNothingValueException();
        }
        this.f54489c = i10;
        this.f54488b = i10;
        this.f54490d = i10;
    }

    public void q() {
        m();
        r();
    }

    public final void r() {
        s(this.f54492f - this.f54490d);
    }

    public final void s(int i10) {
        int i11 = this.f54490d;
        this.f54488b = i11;
        this.f54489c = i11;
        this.f54491e = i10;
    }

    public String toString() {
        return "Buffer(" + (j() - h()) + " used, " + (f() - j()) + " free, " + (this.f54490d + (e() - f())) + " reserved of " + this.f54492f + ')';
    }

    public AbstractC5255a(ByteBuffer byteBuffer) {
        this.f54487a = byteBuffer;
        this.f54491e = byteBuffer.limit();
        this.f54492f = byteBuffer.limit();
    }
}
