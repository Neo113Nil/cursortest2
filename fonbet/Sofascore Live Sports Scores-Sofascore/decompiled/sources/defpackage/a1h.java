package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class a1h {
    public final byte[] a;
    public int b;
    public int c;
    public gsf d;
    public boolean e;
    public a1h f;
    public a1h g;

    public a1h() {
        this.a = new byte[8192];
        this.e = true;
        this.d = null;
    }

    public final int a() {
        return this.c - this.b;
    }

    public final byte b(int i) {
        return this.a[this.b + i];
    }

    public final a1h c() {
        a1h a1hVar = this.f;
        a1h a1hVar2 = this.g;
        if (a1hVar2 != null) {
            a1hVar2.getClass();
            a1hVar2.f = this.f;
        }
        a1h a1hVar3 = this.f;
        if (a1hVar3 != null) {
            a1hVar3.getClass();
            a1hVar3.g = this.g;
        }
        this.f = null;
        this.g = null;
        return a1hVar;
    }

    public final void d(a1h a1hVar) {
        a1hVar.getClass();
        a1hVar.g = this;
        a1hVar.f = this.f;
        a1h a1hVar2 = this.f;
        if (a1hVar2 != null) {
            a1hVar2.g = a1hVar;
        }
        this.f = a1hVar;
    }

    public final a1h e() {
        gsf gsfVar = this.d;
        if (gsfVar == null) {
            a1h a1hVar = p1h.a;
            gsfVar = new gsf();
            this.d = gsfVar;
        }
        int i = this.b;
        int i2 = this.c;
        gsf.b.incrementAndGet(gsfVar);
        Unit unit = Unit.a;
        return new a1h(this.a, i, i2, gsfVar);
    }

    public final void f(a1h a1hVar, int i) {
        a1hVar.getClass();
        if (!a1hVar.e) {
            a70.r("only owner can write");
            return;
        }
        int i2 = a1hVar.c;
        if (i2 + i > 8192) {
            gsf gsfVar = a1hVar.d;
            if (gsfVar != null && gsfVar.a > 0) {
                ilg.c();
                return;
            }
            int i3 = a1hVar.c;
            int i4 = a1hVar.b;
            if ((i3 + i) - i4 > 8192) {
                ilg.c();
                return;
            }
            byte[] bArr = a1hVar.a;
            mh0.f(bArr, 0, i4, bArr, i3);
            i2 = a1hVar.c - a1hVar.b;
            a1hVar.c = i2;
            a1hVar.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = a1hVar.a;
        int i5 = this.b;
        mh0.f(bArr2, i2, i5, bArr3, i5 + i);
        a1hVar.c += i;
        this.b += i;
    }

    public a1h(byte[] bArr, int i, int i2, gsf gsfVar) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = gsfVar;
        this.e = false;
    }
}
