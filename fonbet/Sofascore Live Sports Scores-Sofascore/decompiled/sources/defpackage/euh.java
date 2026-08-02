package defpackage;

import com.sofascore.model.Sports;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class euh extends w31 implements a1i {
    public final int g;
    public final String h;
    public final String i;
    public final bx7 j;
    public final fy7 k;
    public final String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public euh(int i, String str, String str2, bx7 bx7Var, fy7 fy7Var, String str3) {
        super(str, str2, Sports.FOOTBALL, null, false);
        str3.getClass();
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = bx7Var;
        this.k = fy7Var;
        this.l = str3;
    }

    @Override // defpackage.w31
    public final String g() {
        return this.i;
    }

    @Override // defpackage.w31
    public final bx7 h() {
        return this.j;
    }

    @Override // defpackage.w31
    public final int i() {
        return this.g;
    }

    @Override // defpackage.w31
    public final String k() {
        return this.h;
    }
}
