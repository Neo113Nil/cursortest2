package com.ironsource;

/* renamed from: com.ironsource.y1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4646y1 extends AbstractC4415l3 {
    public C4646y1() {
        this.H = "outcome";
        this.G = 4;
        this.I = "APP";
        e();
    }

    @Override // com.ironsource.AbstractC4415l3
    public int c(C4632x5 c4632x5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC4415l3
    public void d() {
    }

    @Override // com.ironsource.AbstractC4415l3
    public String e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC4415l3
    public boolean h(C4632x5 c4632x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4415l3
    public boolean j(C4632x5 c4632x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4415l3
    public boolean d(C4632x5 c4632x5) {
        int c = c4632x5.c();
        return c == EnumC4650y5.FIRST_INSTANCE.b() || c == EnumC4650y5.INIT_COMPLETE.b() || c == EnumC4650y5.SDK_INIT_FAILED.b() || c == EnumC4650y5.SDK_INIT_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC4415l3
    public void f(C4632x5 c4632x5) {
    }
}
