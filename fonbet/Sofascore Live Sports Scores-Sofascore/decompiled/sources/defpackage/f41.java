package defpackage;

import com.sofascore.model.database.MediaReactionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class f41 extends w31 {
    public final gv9 g;
    public final String h;
    public final String i;
    public final String j;
    public final bx7 k;
    public final x43 l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f41(gv9 gv9Var, String str, String str2, String str3, bx7 bx7Var, x43 x43Var, int i) {
        super(r1, r2, r0, r4, true, r6);
        String str4 = (i & 4) != 0 ? null : str;
        String str5 = (i & 8) != 0 ? null : str2;
        String str6 = (i & 32) != 0 ? "" : str3;
        bx7 bx7Var2 = (i & 64) == 0 ? bx7Var : null;
        x43 x43Var2 = (i & 128) != 0 ? new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31) : x43Var;
        gv9Var.getClass();
        str6.getClass();
        String str7 = str6;
        bx7 bx7Var3 = bx7Var2;
        String str8 = str5;
        this.g = gv9Var;
        this.h = str4;
        this.i = str8;
        this.j = str7;
        this.k = bx7Var3;
        this.l = x43Var2;
    }

    @Override // defpackage.w31
    public x43 f() {
        return this.l;
    }

    @Override // defpackage.w31
    public String g() {
        return this.i;
    }

    @Override // defpackage.w31
    public bx7 h() {
        return this.k;
    }

    @Override // defpackage.w31
    public String j() {
        return this.j;
    }

    @Override // defpackage.w31
    public String k() {
        return this.h;
    }
}
