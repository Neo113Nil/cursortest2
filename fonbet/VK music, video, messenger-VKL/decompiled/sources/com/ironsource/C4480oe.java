package com.ironsource;

import com.ironsource.I8;

/* renamed from: com.ironsource.oe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4480oe implements I8, I8.a {
    private C4462ne a;
    private boolean b;

    @Override // com.ironsource.I8
    public Va a() {
        C4462ne c4462ne = this.a;
        if (c4462ne != null) {
            return new Va(c4462ne);
        }
        return null;
    }

    @Override // com.ironsource.I8
    public M9 b() {
        C4462ne c4462ne = this.a;
        if (c4462ne != null) {
            return new M9(c4462ne);
        }
        return null;
    }

    @Override // com.ironsource.I8
    public boolean c() {
        return this.b;
    }

    @Override // com.ironsource.I8.a
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.I8.a
    public void a(C4462ne c4462ne) {
        this.a = c4462ne;
    }
}
