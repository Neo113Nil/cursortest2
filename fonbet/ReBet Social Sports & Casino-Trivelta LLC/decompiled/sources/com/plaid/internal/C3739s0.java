package com.plaid.internal;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;

/* renamed from: com.plaid.internal.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3739s0 implements InterfaceC3675k7 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3784x0 f41044a;

    static {
        W3 w32 = Z3.f39803a;
        f41044a = new C3784x0("auth");
    }

    @Override // com.plaid.internal.InterfaceC3675k7
    public final C3640h a(Object obj, C3712p c3712p) {
        try {
            return C3640h.a(a((InterfaceC3747t) obj, c3712p));
        } catch (Exception e10) {
            return C3640h.a(e10);
        }
    }

    public static String a(InterfaceC3747t interfaceC3747t, C3712p c3712p) {
        InterfaceC3633g1 c3651i1;
        long j10;
        String b10 = interfaceC3747t.b();
        LinkedHashMap b11 = AbstractC3767v1.b(b10);
        if (b11.containsKey("testVfp")) {
            LinkedHashMap b12 = AbstractC3767v1.b(b10);
            try {
                j10 = Long.parseLong((String) b12.get("delay"));
            } catch (Exception unused) {
                j10 = 0;
            }
            String str = (String) b12.get("testVfp");
            String str2 = (String) AbstractC3767v1.b(b10).get("cid");
            if (str2 == null) {
                LinkedHashMap b13 = AbstractC3767v1.b(b10);
                str2 = (String) b13.get("vfp");
                if (str2 == null) {
                    str2 = (String) b13.get("token");
                }
            }
            c3651i1 = new C3642h1(j10, str, str2);
        } else if ("2".equals((String) b11.get("pfflow"))) {
            f41044a.a(W3.INFO, "flow v2 detected", new Object[0]);
            c3651i1 = C3660j1.a(b10);
        } else {
            f41044a.a(W3.INFO, "flow v1 detected", new Object[0]);
            C3784x0 c3784x0 = C3651i1.f40666b;
            if (!"f".equals(AbstractC3767v1.b(b10).get("r"))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b10);
                sb2.append(b10.indexOf(63) == -1 ? "?" : "&");
                sb2.append("r=f");
                b10 = sb2.toString();
            }
            try {
                new URL(b10);
                c3651i1 = new C3651i1(b10);
            } catch (MalformedURLException unused2) {
                throw new C3721q(T0.AUTH_MALFORMED_INPUT_DATA, "Malformed url " + b10);
            }
        }
        return c3651i1.a(interfaceC3747t.a(), c3712p);
    }
}
