package com.ironsource;

import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.m2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4191m2 implements InterfaceC4209n2 {

    @NotNull
    private final String a;

    @NotNull
    private final Dd b;

    public C4191m2(@NotNull String str, @NotNull Dd dd) {
        str.getClass();
        dd.getClass();
        this.a = str;
        this.b = dd;
    }

    @Override // com.ironsource.InterfaceC4209n2
    @NotNull
    public Object a() {
        Object u2gVar;
        String c = C4123i5.b().c();
        c.getClass();
        C4253pa c4253pa = new C4253pa(new C4(this.a, c));
        try {
            p2g p2gVar = w2g.b;
            u2gVar = c4253pa.a();
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a == null) {
            return C4155k2.h.a((JSONObject) u2gVar, this.b.value());
        }
        C4157k4.d().a(a);
        return a instanceof IllegalArgumentException ? new u2g(new Y7(C4301s5.a.d())) : new u2g(new Y7(C4301s5.a.h()));
    }
}
