package com.ironsource;

import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class I4 implements InterfaceC4178l7 {

    @Nullable
    private final Boolean a;

    public I4(@Nullable Boolean bool) {
        this.a = bool;
    }

    @Override // com.ironsource.InterfaceC4178l7
    @NotNull
    public Object a() {
        Boolean bool = this.a;
        if (bool == null) {
            p2g p2gVar = w2g.b;
            return new u2g(new Exception("enabled flag is not provided or invalid"));
        }
        p2g p2gVar2 = w2g.b;
        return bool;
    }
}
