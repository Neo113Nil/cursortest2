package com.plaid.internal;

import com.plaid.internal.InterfaceC3731r1;
import java.io.IOException;

/* renamed from: com.plaid.internal.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3748t0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3784x0 f41064a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41065b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41066c;

    public C3748t0() {
        W3 w32 = Z3.f39803a;
        this.f41064a = new C3784x0("connectivity-validator");
        this.f41065b = "https://clients3.google.com/generate_204";
        this.f41066c = 10000;
    }

    public final boolean a(C3559b c3559b) {
        boolean z10;
        int i10;
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            z10 = false;
            try {
                InterfaceC3731r1.b a10 = c3559b.a(new InterfaceC3731r1.a(this.f41065b, false, null, -1));
                this.f41064a.a(W3.TRACE, "response status " + a10.f41016b, new Object[0]);
                int i11 = a10.f41016b;
                if (i11 >= 200 && i11 < 300) {
                    z10 = true;
                }
            } catch (IOException e10) {
                this.f41064a.a(e10, "cannot reach test endpoint");
            }
            if (z10 || ((i10 = this.f41066c) > 0 && i10 + currentTimeMillis <= System.currentTimeMillis())) {
                break;
            }
        }
        this.f41064a.a(W3.TRACE, "httpclient %s", z10 ? "online" : "offline");
        return z10;
    }
}
