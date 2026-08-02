package com.plaid.internal;

import com.plaid.internal.InterfaceC3731r1;
import java.io.IOException;

/* renamed from: com.plaid.internal.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3757u0 implements InterfaceC3675k7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f41106a = "https://device.payfone.com:4443/whatismyipaddress";

    @Override // com.plaid.internal.InterfaceC3675k7
    public final C3640h a(Object obj, C3712p c3712p) {
        F0 f02 = (F0) obj;
        D0 b10 = f02.b();
        if (b10 != null && b10.f39193b != null) {
            return C3640h.a(b10);
        }
        if (b10 != null && !"_auto_detect_".equals(b10.f39192a)) {
            return C3640h.a(b10);
        }
        try {
            return C3640h.a(a(b10, f02.a()));
        } catch (C3721q e10) {
            return C3640h.a((Exception) e10);
        }
    }

    public final D0 a(D0 d02, InterfaceC3731r1 interfaceC3731r1) {
        String str;
        try {
            InterfaceC3731r1.b a10 = interfaceC3731r1.a(new InterfaceC3731r1.a(this.f41106a, false, null, -1));
            int i10 = a10.f41016b;
            if (i10 < 200 || i10 >= 300) {
                str = null;
            } else {
                str = a10.f41015a;
                if (str != null) {
                    str = str.replaceAll("[^0-9.:a-fA-F]", "");
                }
            }
            if (str == null || str.length() > 64) {
                throw new C3721q(T0.GENERIC_COMMUNICATION_ERROR, "API failed to provide a valid device IP address");
            }
            if (d02 == null) {
                return new D0(str, null, null);
            }
            return new D0(str, d02.f39193b, d02.f39194c);
        } catch (IOException unused) {
            throw new C3721q(T0.GENERIC_COMMUNICATION_ERROR, "No response received from URL.");
        }
    }
}
