package com.ironsource;

import com.ironsource.InterfaceC4196m7;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Wc implements InterfaceC4196m7, InterfaceC4196m7.a {

    @NotNull
    private final InterfaceC4193m4 a;

    @NotNull
    private final G7 b;

    @NotNull
    private final Map<String, Vc> c;

    public Wc(@NotNull InterfaceC4193m4 interfaceC4193m4, @NotNull G7 g7) {
        interfaceC4193m4.getClass();
        g7.getClass();
        this.a = interfaceC4193m4;
        this.b = g7;
        this.c = new LinkedHashMap();
    }

    @Override // com.ironsource.InterfaceC4196m7.a
    @NotNull
    public Object a(@NotNull String str, @NotNull F3 f3, @NotNull InterfaceC4160k7 interfaceC4160k7) {
        str.getClass();
        f3.getClass();
        interfaceC4160k7.getClass();
        Object b = interfaceC4160k7.b();
        p2g p2gVar = w2g.b;
        if (b instanceof u2g) {
            Throwable a = w2g.a(b);
            return a != null ? new u2g(a) : Unit.a;
        }
        Vc vc = (Vc) b;
        if (vc != null) {
            this.c.put(str, vc);
        }
        return Unit.a;
    }

    @Override // com.ironsource.InterfaceC4196m7.a
    public void b(@NotNull String str) {
        str.getClass();
        if (this.c.get(str) == null) {
            return;
        }
        this.b.a(this.a.a(), str);
    }

    private final boolean a(Vc vc, String str) {
        Long a = this.b.a(str);
        return a != null && this.a.a() - a.longValue() < vc.a();
    }

    @Override // com.ironsource.InterfaceC4196m7
    @NotNull
    public D3 a(@NotNull String str) {
        str.getClass();
        Vc vc = this.c.get(str);
        if (vc == null) {
            return new D3(false, null, 2, null);
        }
        if (a(vc, str)) {
            return new D3(true, F3.Pacing);
        }
        return new D3(false, null, 2, null);
    }

    @NotNull
    public final Map<String, Vc> a() {
        return this.c;
    }
}
