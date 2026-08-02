package com.ironsource;

/* renamed from: com.ironsource.gd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4336gd extends AbstractC4451n3 {
    private String e;
    private int f;

    public C4336gd(int i, String str, boolean z, String str2, int i2, C4354hd c4354hd) {
        super(i, str, z, c4354hd);
        this.f = i2;
        this.e = str2;
    }

    public final int e() {
        return this.f;
    }

    public final String f() {
        return this.e;
    }

    @Override // com.ironsource.AbstractC4451n3
    public String toString() {
        return super.toString() + ", reward name: " + this.e + " , amount: " + this.f;
    }

    public C4336gd(AbstractC4451n3 abstractC4451n3) {
        super(abstractC4451n3.b(), abstractC4451n3.c(), abstractC4451n3.d(), abstractC4451n3.a());
        this.e = "";
    }
}
