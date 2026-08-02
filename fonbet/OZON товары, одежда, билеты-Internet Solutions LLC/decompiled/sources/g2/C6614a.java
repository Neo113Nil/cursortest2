package g2;

import B3.D;
import Ij.C3261b;
import U7.d;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6614a {

    /* renamed from: a, reason: collision with root package name */
    String f63714a;

    /* renamed from: b, reason: collision with root package name */
    private int f63715b;

    /* renamed from: c, reason: collision with root package name */
    private int f63716c;

    /* renamed from: d, reason: collision with root package name */
    private float f63717d;

    public C6614a(String str, int i11) {
        this.f63717d = Float.NaN;
        this.f63714a = str;
        this.f63715b = 902;
        this.f63716c = i11;
    }

    public static String a(int i11) {
        return "#" + ("00000000" + Integer.toHexString(i11)).substring(r2.length() - 8);
    }

    public final C6614a b() {
        C6614a c6614a = new C6614a();
        c6614a.f63716c = LinearLayoutManager.INVALID_OFFSET;
        c6614a.f63717d = Float.NaN;
        c6614a.f63714a = this.f63714a;
        c6614a.f63715b = this.f63715b;
        c6614a.f63716c = this.f63716c;
        c6614a.f63717d = this.f63717d;
        return c6614a;
    }

    public final float c() {
        return this.f63717d;
    }

    public final int d() {
        return this.f63716c;
    }

    public final String e() {
        return this.f63714a;
    }

    public final int f() {
        return this.f63715b;
    }

    public final void g(float f7) {
        this.f63717d = f7;
    }

    public final void h(int i11) {
        this.f63716c = i11;
    }

    public final String toString() {
        String c11 = D.c(new StringBuilder(), this.f63714a, ':');
        switch (this.f63715b) {
            case EDITION_LEGACY_VALUE:
                StringBuilder e11 = C3261b.e(c11);
                e11.append(this.f63716c);
                return e11.toString();
            case 901:
                StringBuilder e12 = C3261b.e(c11);
                e12.append(this.f63717d);
                return e12.toString();
            case 902:
                StringBuilder e13 = C3261b.e(c11);
                e13.append(a(this.f63716c));
                return e13.toString();
            case 903:
                return d.e(c11, null);
            default:
                return d.e(c11, "????");
        }
    }

    public C6614a(String str, float f7) {
        this.f63716c = LinearLayoutManager.INVALID_OFFSET;
        this.f63714a = str;
        this.f63715b = 901;
        this.f63717d = f7;
    }
}
