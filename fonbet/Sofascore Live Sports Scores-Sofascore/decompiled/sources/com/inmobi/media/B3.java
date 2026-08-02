package com.inmobi.media;

import defpackage.ok3;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class B3 implements InterfaceC3770t3 {
    @Override // com.inmobi.media.InterfaceC3770t3
    public final void a(Z2 z2) {
        z2.getClass();
        E3 e3 = E3.a;
        LinkedHashMap linkedHashMap = E3.j;
        C3276a0 c3276a0 = (C3276a0) linkedHashMap.get(Integer.valueOf(z2.a));
        if (c3276a0 != null) {
            c3276a0.a.a(c3276a0.b);
        }
        linkedHashMap.remove(Integer.valueOf(z2.a));
        ok3.J(new A3(z2, null));
    }

    @Override // com.inmobi.media.InterfaceC3770t3
    public final void a(Z2 z2, EnumC3489i6 enumC3489i6) {
        z2.getClass();
        enumC3489i6.getClass();
        E3 e3 = E3.a;
        String str = z2.b;
        if (z2.f == 0) {
            E3.a(z2, enumC3489i6.name());
        }
        E3.b(z2);
        E3.f();
    }
}
