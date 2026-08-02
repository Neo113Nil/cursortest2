package b;

import com.plaid.internal.EnumC3631g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: b.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2312i extends w0 implements InterfaceC2310g {

    /* renamed from: d, reason: collision with root package name */
    public final int f24115d;

    /* renamed from: f, reason: collision with root package name */
    public final int f24116f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24117g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC2323t f24118h;

    public AbstractC2312i(int i10, int i11, int i12, InterfaceC2323t interfaceC2323t) {
        if (interfaceC2323t == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i11 == 0 || (i11 & 192) != i11) {
            throw new IllegalArgumentException("invalid tag class: " + i11);
        }
        this.f24115d = i10;
        this.f24116f = i11;
        this.f24117g = i12;
        this.f24118h = interfaceC2323t;
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (!(w0Var instanceof AbstractC2312i)) {
            return false;
        }
        AbstractC2312i abstractC2312i = (AbstractC2312i) w0Var;
        if (this.f24117g != abstractC2312i.f24117g || this.f24116f != abstractC2312i.f24116f) {
            return false;
        }
        if (this.f24115d != abstractC2312i.f24115d && m() != abstractC2312i.m()) {
            return false;
        }
        w0 d10 = this.f24118h.d();
        w0 d11 = abstractC2312i.f24118h.d();
        if (d10 == d11) {
            return true;
        }
        if (m()) {
            return d10.c(d11);
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            b(new q0(byteArrayOutputStream), true);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            abstractC2312i.b(new q0(byteArrayOutputStream2), true);
            return Arrays.equals(byteArray, byteArrayOutputStream2.toByteArray());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // b.w0
    public w0 h() {
        return new C2283K(this.f24115d, this.f24116f, this.f24117g, this.f24118h);
    }

    @Override // b.w0
    public final int hashCode() {
        return (((this.f24116f * 7919) ^ this.f24117g) ^ (m() ? 15 : EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE)) ^ this.f24118h.d().hashCode();
    }

    @Override // b.w0
    public w0 i() {
        return new B0(this.f24115d, this.f24116f, this.f24117g, this.f24118h);
    }

    public abstract F0 j(w0 w0Var);

    public final w0 k() {
        InterfaceC2323t interfaceC2323t = this.f24118h;
        return interfaceC2323t instanceof w0 ? (w0) interfaceC2323t : interfaceC2323t.d();
    }

    public final int l() {
        return this.f24117g;
    }

    public final boolean m() {
        int i10 = this.f24115d;
        return i10 == 1 || i10 == 3;
    }

    public final String toString() {
        return AbstractC2324u.a(this.f24116f, this.f24117g) + this.f24118h;
    }

    public AbstractC2312i(boolean z10, int i10, w0 w0Var) {
        this(z10, i10, w0Var, 0);
    }

    public AbstractC2312i(boolean z10, int i10, w0 w0Var, int i11) {
        this(z10 ? 1 : 2, 128, i10, w0Var);
    }

    @Override // b.InterfaceC2310g
    public final w0 b() {
        return this;
    }
}
