package t2;

import b1.AbstractC2335D;
import b1.C2334C;
import b1.C2357k;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.E;
import e1.AbstractC4134a;
import java.nio.ByteBuffer;
import java.util.List;
import r2.C6200c;
import t2.I0;
import v1.AbstractC6610O;

/* loaded from: classes.dex */
public abstract class M0 {

    /* renamed from: a, reason: collision with root package name */
    public final I0 f65094a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65095b;

    /* renamed from: c, reason: collision with root package name */
    public final C2334C f65096c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f65097d;

    public M0(androidx.media3.common.a aVar, I0 i02) {
        this.f65094a = i02;
        this.f65096c = aVar.f20540l;
        this.f65095b = k1.g(aVar.f20543o);
    }

    public static String j(androidx.media3.common.a aVar, List list) {
        boolean t10 = AbstractC2335D.t((String) AbstractC4134a.e(aVar.f20543o));
        E.a a10 = new E.a().a(aVar.f20543o);
        if (t10) {
            a10.a("video/hevc").a("video/avc");
        }
        a10.k(list);
        AbstractC3445z a11 = a10.m().a();
        for (int i10 = 0; i10 < a11.size(); i10++) {
            String str = (String) a11.get(i10);
            if (list.contains(str)) {
                if (t10 && C2357k.i(aVar.f20516D)) {
                    if (!AbstractC6416q0.i(str, aVar.f20516D).isEmpty()) {
                        return str;
                    }
                } else if (!AbstractC6416q0.h(str).isEmpty()) {
                    return str;
                }
            }
        }
        return null;
    }

    public final boolean i() {
        if (!this.f65097d) {
            androidx.media3.common.a m10 = m();
            if (m10 == null) {
                return false;
            }
            if (this.f65096c != null) {
                m10 = m10.b().r0(this.f65096c).P();
            }
            if (!this.f65094a.n(m10.f20543o)) {
                String g10 = AbstractC6610O.g(m10);
                if (this.f65094a.n(g10)) {
                    m10 = m10.b().y0(g10).P();
                }
            }
            try {
                this.f65094a.a(m10);
                this.f65097d = true;
            } catch (C6200c e10) {
                throw C6427w0.d(e10, 7001);
            } catch (I0.a e11) {
                throw C6427w0.d(e11, 7003);
            }
        }
        if (n()) {
            this.f65094a.d(this.f65095b);
            return false;
        }
        k1.f l10 = l();
        if (l10 == null) {
            return false;
        }
        try {
            if (!this.f65094a.o(this.f65095b, (ByteBuffer) AbstractC4134a.i(l10.f54108d), l10.k(), l10.f54110f)) {
                return false;
            }
            r();
            return true;
        } catch (C6200c e12) {
            throw C6427w0.d(e12, 7001);
        }
    }

    public abstract C0 k(E e10, androidx.media3.common.a aVar, int i10);

    public abstract k1.f l();

    public abstract androidx.media3.common.a m();

    public abstract boolean n();

    public final boolean o() {
        if (i()) {
            return true;
        }
        return !n() && p();
    }

    public boolean p() {
        return false;
    }

    public abstract void q();

    public abstract void r();
}
