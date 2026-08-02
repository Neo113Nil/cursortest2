package b;

import com.plaid.internal.EnumC3631g;
import java.io.IOException;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class F0 extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2323t[] f24067a;

    static {
        new C0();
    }

    public F0() {
        this.f24067a = C2326w.f24148d;
    }

    public static F0 k(Object obj) {
        if (obj == null || (obj instanceof F0)) {
            return (F0) obj;
        }
        if (obj instanceof InterfaceC2323t) {
            w0 d10 = ((InterfaceC2323t) obj).d();
            if (d10 instanceof F0) {
                return (F0) d10;
            }
        } else if (obj instanceof byte[]) {
            try {
                C2287O c2287o = new C2287O((byte[]) obj);
                try {
                    w0 r10 = c2287o.r();
                    if (c2287o.available() != 0) {
                        throw new IOException("Extra data detected in stream");
                    }
                    if (F0.class.isInstance(r10)) {
                        return (F0) r10;
                    }
                    throw new IllegalStateException("unexpected object: ".concat(r10.getClass().getName()));
                } catch (ClassCastException unused) {
                    throw new IOException("cannot recognise object in stream");
                }
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(obj.getClass().getName()));
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (!(w0Var instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) w0Var;
        int m10 = m();
        if (f02.m() != m10) {
            return false;
        }
        for (int i10 = 0; i10 < m10; i10++) {
            w0 d10 = this.f24067a[i10].d();
            w0 d11 = f02.f24067a[i10].d();
            if (d10 != d11 && !d10.c(d11)) {
                return false;
            }
        }
        return true;
    }

    @Override // b.w0
    public final boolean f() {
        return true;
    }

    @Override // b.w0
    public w0 h() {
        return new C2274B(this.f24067a);
    }

    @Override // b.w0
    public int hashCode() {
        int length = this.f24067a.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ this.f24067a[length].d().hashCode();
        }
    }

    @Override // b.w0
    public w0 i() {
        return new p0(this.f24067a);
    }

    public InterfaceC2323t j(int i10) {
        return this.f24067a[i10];
    }

    public final AbstractC2311h[] l() {
        InterfaceC2323t interfaceC2323t;
        int m10 = m();
        AbstractC2311h[] abstractC2311hArr = new AbstractC2311h[m10];
        for (int i10 = 0; i10 < m10; i10++) {
            InterfaceC2323t interfaceC2323t2 = this.f24067a[i10];
            if (interfaceC2323t2 == null || (interfaceC2323t2 instanceof AbstractC2311h)) {
                interfaceC2323t = interfaceC2323t2;
            } else {
                interfaceC2323t = interfaceC2323t2.d();
                if (!(interfaceC2323t instanceof AbstractC2311h)) {
                    throw new IllegalArgumentException("illegal object in getInstance: ".concat(interfaceC2323t2.getClass().getName()));
                }
            }
            abstractC2311hArr[i10] = (AbstractC2311h) interfaceC2323t;
        }
        return abstractC2311hArr;
    }

    public int m() {
        return this.f24067a.length;
    }

    public abstract AbstractC2311h n();

    public abstract k0 o();

    public final String toString() {
        int m10 = m();
        if (m10 == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i10 = 0;
        while (true) {
            stringBuffer.append(this.f24067a[i10]);
            i10++;
            if (i10 >= m10) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public F0(InterfaceC2323t interfaceC2323t) {
        if (interfaceC2323t == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.f24067a = new InterfaceC2323t[]{interfaceC2323t};
    }

    public F0(C2326w c2326w) {
        if (c2326w == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.f24067a = c2326w.c();
    }

    public F0(InterfaceC2323t[] interfaceC2323tArr) {
        this.f24067a = interfaceC2323tArr;
    }
}
