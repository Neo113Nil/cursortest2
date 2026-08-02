package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a4a {
    public final /* synthetic */ int a;
    public final gf9 b;
    public final gf9 c;
    public final gf9 d;
    public final gf9 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public a4a(a4a[] a4aVarArr) {
        int i = 0;
        this.a = 0;
        this.f = a4aVarArr;
        int length = a4aVarArr.length;
        gf9[] gf9VarArr = new gf9[length];
        for (int i2 = 0; i2 < length; i2++) {
            gf9VarArr[i2] = ((a4a[]) this.f)[i2].b();
        }
        int i3 = 1;
        this.b = new gf9(1, new sok(gf9VarArr, i));
        int length2 = ((a4a[]) this.f).length;
        gf9[] gf9VarArr2 = new gf9[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            gf9VarArr2[i4] = ((a4a[]) this.f)[i4].d();
        }
        this.c = new gf9(0, new ff9(gf9VarArr2, i));
        int length3 = ((a4a[]) this.f).length;
        gf9[] gf9VarArr3 = new gf9[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            gf9VarArr3[i5] = ((a4a[]) this.f)[i5].c();
        }
        this.d = new gf9(1, new sok(gf9VarArr3, i3));
        int length4 = ((a4a[]) this.f).length;
        gf9[] gf9VarArr4 = new gf9[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            gf9VarArr4[i6] = ((a4a[]) this.f)[i6].a();
        }
        this.e = new gf9(0, new ff9(gf9VarArr4, i3));
    }

    public final gf9 a() {
        int i = this.a;
        return this.e;
    }

    public final gf9 b() {
        int i = this.a;
        return this.b;
    }

    public final gf9 c() {
        int i = this.a;
        return this.d;
    }

    public final gf9 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ph0.K((a4a[]) obj, null, "innermostOf(", ")", null, 57);
            default:
                return dmi.j(')', "RectRulers(", (String) obj);
        }
    }

    public a4a(String str) {
        this.a = 1;
        this.f = str;
        this.b = new gf9(1, null);
        this.c = new gf9(0, null);
        this.d = new gf9(1, null);
        this.e = new gf9(0, null);
    }
}
