package com.plaid.internal;

import com.plaid.internal.C3703o;
import com.plaid.internal.C3720p7;
import java.util.HashMap;

/* renamed from: com.plaid.internal.q7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3729q7 implements C3720p7.c<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3712p f41005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3720p7 f41006b;

    public C3729q7(C3720p7 c3720p7, C3712p c3712p) {
        this.f41006b = c3720p7;
        this.f41005a = c3712p;
    }

    @Override // com.plaid.internal.C3720p7.c
    public final String call() {
        C3703o<R> c3703o = this.f41006b.f40969a;
        C3712p c3712p = this.f41005a;
        InterfaceC3731r1 interfaceC3731r1 = (InterfaceC3731r1) C3703o.a(EnumC3684l7.PRE_CHECK, c3703o.f40874a, new C3658j(c3703o), c3712p);
        c3703o.f40879f.a(interfaceC3731r1);
        C3703o.a aVar = new C3703o.a((D0) C3703o.a(EnumC3684l7.DEVICE_DESCRIPTOR, c3703o.f40875b, new C3667k(interfaceC3731r1), c3712p), interfaceC3731r1);
        D0 d02 = aVar.f40881b;
        InterfaceC3731r1 interfaceC3731r12 = aVar.f40880a;
        D0 a10 = this.f41006b.f40972d.a(d02);
        C3703o<R> c3703o2 = this.f41006b.f40969a;
        C3712p c3712p2 = this.f41005a;
        c3703o2.getClass();
        try {
            C3784x0 c3784x0 = C3703o.f40873g;
            W3 w32 = W3.INFO;
            c3784x0.a(w32, "device descriptor=" + a10, new Object[0]);
            String str = (String) C3703o.a(EnumC3684l7.START, c3703o2.f40876c, new C3676l(a10), c3712p2);
            c3784x0.a(w32, "auth url=" + str, new Object[0]);
            if (a10.f39193b != null) {
                throw new r(EnumC3684l7.AUTHENTICATION);
            }
            HashMap a11 = E6.a(str);
            if (a11 != null) {
                c3784x0.a(w32, "use remote features: " + a11, new Object[0]);
                c3712p2.f40929f = c3712p2.f40929f.a(a11);
            }
            String str2 = (String) C3703o.a(EnumC3684l7.AUTHENTICATION, c3703o2.f40877d, new C3685m(interfaceC3731r12, str), c3712p2);
            c3784x0.a(w32, "vfp=" + str2, new Object[0]);
            return str2;
        } catch (r e10) {
            c3703o2.f40879f.a();
            throw e10;
        }
    }
}
