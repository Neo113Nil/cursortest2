package com.google.zxing.datamatrix.encoder;

import com.plaid.internal.EnumC3631g;

/* loaded from: classes3.dex */
public class k {
    static final k[] PROD_SYMBOLS;
    private static k[] symbols;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f38404a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38405b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38406c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38407d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38408e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38409f;

    /* renamed from: g, reason: collision with root package name */
    public final int f38410g;

    /* renamed from: h, reason: collision with root package name */
    public final int f38411h;

    static {
        k[] kVarArr = {new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), new k(false, 30, 20, 20, 20, 1), new k(true, 32, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, 114, 48, 18, 18, 4), new k(false, 144, 56, 20, 20, 4), new k(false, EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, 68, 22, 22, 4), new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, EnumC3631g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, 112, 14, 14, 16, EnumC3631g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, 576, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE, 20, 20, 16, 144, 56), new k(false, 696, EnumC3631g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 22, 22, 16, EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, 68), new k(false, 816, 336, 24, 24, 16, 136, 56), new k(false, 1050, 408, 18, 18, 36, EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, 68), new k(false, 1304, 496, 20, 20, 36, EnumC3631g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, 62), new d()};
        PROD_SYMBOLS = kVarArr;
        symbols = kVarArr;
    }

    public k(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(z10, i10, i11, i12, i13, i14, i10, i11);
    }

    public static k l(int i10, l lVar, com.google.zxing.b bVar, com.google.zxing.b bVar2, boolean z10) {
        for (k kVar : symbols) {
            if (!(lVar == l.FORCE_SQUARE && kVar.f38404a) && ((lVar != l.FORCE_RECTANGLE || kVar.f38404a) && i10 <= kVar.f38405b)) {
                return kVar;
            }
        }
        if (z10) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i10)));
        }
        return null;
    }

    public final int a() {
        return this.f38405b;
    }

    public int b(int i10) {
        return this.f38410g;
    }

    public final int c() {
        return this.f38406c;
    }

    public final int d(int i10) {
        return this.f38411h;
    }

    public final int e() {
        int i10 = this.f38409f;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 4) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i11;
    }

    public int f() {
        return this.f38405b / this.f38410g;
    }

    public final int g() {
        return k() * this.f38408e;
    }

    public final int h() {
        return e() * this.f38407d;
    }

    public final int i() {
        return g() + (k() << 1);
    }

    public final int j() {
        return h() + (e() << 1);
    }

    public final int k() {
        int i10 = this.f38409f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f38404a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.f38407d);
        sb2.append('x');
        sb2.append(this.f38408e);
        sb2.append(", symbol size ");
        sb2.append(j());
        sb2.append('x');
        sb2.append(i());
        sb2.append(", symbol data size ");
        sb2.append(h());
        sb2.append('x');
        sb2.append(g());
        sb2.append(", codewords ");
        sb2.append(this.f38405b);
        sb2.append('+');
        sb2.append(this.f38406c);
        return sb2.toString();
    }

    public k(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f38404a = z10;
        this.f38405b = i10;
        this.f38406c = i11;
        this.f38407d = i12;
        this.f38408e = i13;
        this.f38409f = i14;
        this.f38410g = i15;
        this.f38411h = i16;
    }
}
