package com.ironsource;

import xsna.epx;
import xsna.go9;

/* renamed from: com.ironsource.xc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4639xc implements Ed {
    private final String a;

    /* renamed from: com.ironsource.xc$a */
    public static final class a {
        public static final a a = new a();
        public static final String b = "IronSource";

        private a() {
        }
    }

    public C4639xc(String str) {
        this.a = str;
    }

    @Override // com.ironsource.Ed
    public String value() {
        return this.a.length() == 0 ? "" : (epx.f(this.a, "0") || epx.f(this.a, "IronSource")) ? "IronSource" : go9.b("IronSource_", this.a);
    }
}
