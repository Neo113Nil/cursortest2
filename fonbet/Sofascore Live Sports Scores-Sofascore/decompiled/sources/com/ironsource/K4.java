package com.ironsource;

import com.ironsource.InterfaceC4196m7;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class K4 implements InterfaceC4196m7, InterfaceC4196m7.a {

    @NotNull
    private final ConcurrentHashMap<String, H4> a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC4196m7.a
    @NotNull
    public Object a(@NotNull String str, @NotNull F3 f3, @NotNull InterfaceC4160k7 interfaceC4160k7) {
        str.getClass();
        f3.getClass();
        interfaceC4160k7.getClass();
        Object a = interfaceC4160k7.a();
        p2g p2gVar = w2g.b;
        if (a instanceof u2g) {
            Throwable a2 = w2g.a(a);
            return a2 != null ? new u2g(a2) : Unit.a;
        }
        H4 h4 = (H4) a;
        if (h4 != null) {
            this.a.put(str, h4);
        }
        return Unit.a;
    }

    @Override // com.ironsource.InterfaceC4196m7.a
    public void b(@NotNull String str) {
        str.getClass();
    }

    @Override // com.ironsource.InterfaceC4196m7
    @NotNull
    public D3 a(@NotNull String str) {
        str.getClass();
        H4 h4 = this.a.get(str);
        if (h4 != null && !h4.a()) {
            return new D3(true, F3.Delivery);
        }
        return new D3(false, null, 2, null);
    }
}
