package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class b1h {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public b1h f;
    public b1h g;

    public b1h(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final b1h a() {
        b1h b1hVar = this.f;
        if (b1hVar == this) {
            b1hVar = null;
        }
        b1h b1hVar2 = this.g;
        b1hVar2.getClass();
        b1hVar2.f = this.f;
        b1h b1hVar3 = this.f;
        b1hVar3.getClass();
        b1hVar3.g = this.g;
        this.f = null;
        this.g = null;
        return b1hVar;
    }

    public final void b(b1h b1hVar) {
        b1hVar.getClass();
        b1hVar.g = this;
        b1hVar.f = this.f;
        b1h b1hVar2 = this.f;
        b1hVar2.getClass();
        b1hVar2.g = b1hVar;
        this.f = b1hVar;
    }

    public final b1h c() {
        this.d = true;
        return new b1h(this.a, this.b, this.c, true);
    }

    public final void d(b1h b1hVar, int i) {
        b1hVar.getClass();
        byte[] bArr = b1hVar.a;
        if (!b1hVar.e) {
            a70.r("only owner can write");
            return;
        }
        int i2 = b1hVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (b1hVar.d) {
                ilg.c();
                return;
            }
            int i4 = b1hVar.b;
            if (i3 - i4 > 8192) {
                ilg.c();
                return;
            }
            mh0.f(bArr, 0, i4, bArr, i2);
            i2 = b1hVar.c - b1hVar.b;
            b1hVar.c = i2;
            b1hVar.b = 0;
        }
        int i5 = this.b;
        mh0.f(this.a, i2, i5, bArr, i5 + i);
        b1hVar.c += i;
        this.b += i;
    }

    public b1h() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
